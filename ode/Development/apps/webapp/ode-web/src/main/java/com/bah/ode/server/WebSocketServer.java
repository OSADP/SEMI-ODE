/*******************************************************************************
 * Copyright (c) 2015 US DOT - Joint Program Office
 *
 * The Government has unlimited rights to all documents/material produced under 
 * this task order. All documents and materials, to include the source code of 
 * any software produced under this contract, shall be Government owned and the 
 * property of the Government with all rights and privileges of ownership/copyright 
 * belonging exclusively to the Government. These documents and materials may 
 * not be used or sold by the Contractor without written permission from the CO.
 * All materials supplied to the Government shall be the sole property of the 
 * Government and may not be used for any other purpose. This right does not 
 * abrogate any other Government rights.
 *
 * Contributors:
 *     Booz | Allen | Hamilton - initial API and implementation
 *******************************************************************************/
package com.bah.ode.server;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.websocket.CloseReason;
import javax.websocket.CloseReason.CloseCodes;
import javax.websocket.EndpointConfig;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.api.sec.SecurityService;
import com.bah.ode.api.sec.filters.WebSocketAuthenticationConfiguration;
import com.bah.ode.context.AppContext;
import com.bah.ode.distributors.AggregateDataPropagator;
import com.bah.ode.distributors.BaseDataPropagator;
import com.bah.ode.distributors.DepositDataPropagator;
import com.bah.ode.distributors.QueryDataPropagator;
import com.bah.ode.distributors.SubscriptionDataPropagator;
import com.bah.ode.exception.OdeException;
import com.bah.ode.model.OdeDataMessage;
import com.bah.ode.model.OdeDataType;
import com.bah.ode.model.OdeMetadata;
import com.bah.ode.model.OdeRequest;
import com.bah.ode.model.OdeRequestType;
import com.bah.ode.model.OdeStatus;
import com.bah.ode.util.WebSocketUtils;
import com.bah.ode.wrapper.MQTopic;

/**
 * gives the relative name for the end point. This will be accessed via
 * ws://ip:port/ode/api/ws Where "ip" is the IP address of the host, "ode" is the
 * context root and "/api/ws/{rtype}/{dtype}" identifies this service request.
 */
@ServerEndpoint(value = "/api/ws/{rtype}/{dtype}",
				configurator = WebSocketAuthenticationConfiguration.class)
public class WebSocketServer {
   private static Logger logger = LoggerFactory
         .getLogger(WebSocketServer.class);
   
   private static Map<String, DataSourceConnector> connectors = 
         new HashMap<String, DataSourceConnector>();
   
   private DataSourceConnector connector;
   private DataDistributionWorker distroWorker;
   private OdeRequest odeRequest;
   private MQTopic outputTopic;

   public static DataSourceConnector getConnector(String requestId) {
      return connectors.get(requestId);
   }
   /**
    * Allows us to intercept the creation of a new session. The session class
    * allows us to send data to the user. In the method onOpen, we'll let the
    * user know that the handshake was successful.
    * 
    * @param session
    *           - The WebSocket session that was just opened
    * @param endpointConfig
    *           - the end-point configuration object
    * @param rtype
    *           - the path parameter identifying the request type. Valid rtypes
    *           are:
    *           <ul>
    *           <li>sub - subscription request: establishes a subscription
    *           to real-time data</li>
    *           <li>qry - Query request: sends a query to warehoused data</li>
    *           <li>tst - Test request:  establishes a subscription
    *           to test data channel</li>
    *           </ul>
    * @param dtype
    *           - the path parameter identifying the data type being requested.
    *           Valid <code>dtype</code> values are:
    *           <ul>
    *           <li>int - Intersection data</li>
    *           <li>veh - Vehicle data</li>
    *           <li>agg - Aggregate data</li>
    *           </ul>
    */
   @OnOpen
   public void onOpen(Session session, EndpointConfig endpointConfig,
         @PathParam("rtype") String rtype, @PathParam("dtype") String dtype) {

	   String sessionId = session.getId();

      logger.info("---Connected to ODE on Session ID: {}, " + "Request Type: {}, "
            + "Data Type: {} ---", sessionId, rtype, dtype);

      OdeStatus msg = new OdeStatus();
      boolean isAuthorized = validateRequest(endpointConfig.getUserProperties());
      try {
         if (!isAuthorized) {
            msg.setCode(OdeStatus.Code.FAILURE).setMessage(
                  "Invalid or missing token.");
            WebSocketUtils.send(session, new OdeDataMessage(msg).toJson());

            session.close(new CloseReason(
                  CloseReason.CloseCodes.VIOLATED_POLICY,
                  "Invalid or missing token"));
         } else {
            OdeRequestType requestType = OdeRequestType.getByShortName(rtype);
            OdeDataType dataType = OdeDataType.getByShortName(dtype);
            if (requestType == null) {
               msg.setCode(OdeStatus.Code.INVALID_REQUEST_TYPE_ERROR)
                     .setMessage(String.format(
                           "Invalid request type %s. Valid request types are %s",
                           rtype, OdeRequestType.shortNames()));
               logger.error(msg.toString());
               session.close(new CloseReason(
                     CloseReason.CloseCodes.VIOLATED_POLICY,
                     msg.getMessage()));
            } else if (dataType == null) {
               msg.setCode(OdeStatus.Code.INVALID_DATA_TYPE_ERROR)
                     .setMessage(String.format(
                           "Invalid data type %s requested. Valid data types are %s",
                           dtype, OdeDataType.shortNames()));
               logger.error(msg.toString());
               session.close(new CloseReason(
                     CloseReason.CloseCodes.VIOLATED_POLICY,
                     msg.getMessage()));
            } else {
               msg.setCode(OdeStatus.Code.SUCCESS)
                     .setMessage("ODE Connection Established.");
               
               outputTopic = MQTopic.create(UUID.randomUUID().toString(), 
                     MQTopic.defaultPartitions());
               
               createPropagator(session, requestType, dataType);
               
            }
            WebSocketUtils.send(session, new OdeDataMessage(msg).toJson());
            
    	  } // end if 
      } 
      catch (Exception ex) {
         msg.setCode(OdeStatus.Code.SOURCE_CONNECTION_ERROR).setMessage(
               String.format("Error processing connection request %s",
                     session.getRequestURI()));
         logger.error(msg.toString(), ex);
      }
   }

   /**
    * When a user sends a message to the server, this method will intercept the
    * message and allow us to react to it. For now the message is read as a
    * String.
    * 
    * @param session
    *           - WebSocket session object
    * @param message
    *           - message received
    * @param last
    *           - true if this is the last message in a partial message transfer
    * @param rtype
    *           - the path parameter identifying the request type. Valid rtypes
    *           are:
    *           <ul>
    *           <li>sub - subscription request: establishes a subscription
    *           to real-time data</li>
    *           <li>qry - Query request: sends a query to warehoused data</li>
    *           <li>dep - Deposit request:  Deposits data to a given data source
    *           </li>
    *           <li>tst - Test request:  establishes a subscription
    *           to test data channel</li>
    *           </ul>
    * @param dtype
    *           - the path parameter identifying the data type being requested.
    *           Valid <code>dtype</code> values are:
    *           <ul>
    *           <li>int - Intersection data</li>
    *           <li>veh - Vehicle data</li>
    *           <li>adv - Advisory data (Query request type only)</li>
    *           </ul>
    */
   @OnMessage
   public void onMessage(Session session, String message, boolean last,
         @PathParam("rtype") String rtype, @PathParam("dtype") String dtype) {
      if (StringUtils.isEmpty(message))
         return;
      
      String sessionId = session.getId();
      logger.info("=== Message Received on Session ID {}, Request Type {}, Data Type {} : {} ===", 
            sessionId, rtype, dtype, message);
      
      OdeStatus status = new OdeStatus();
      String statusMsg;
      synchronized(WebSocketServer.class) {
         try {
            odeRequest = OdeRequestManager.buildOdeRequest(rtype, dtype, message);
   
            String requestId = odeRequest.getId();
            /* 
             * By default inputTopic is the same as outputTopic. Non-default
             * happens when data has to go to the spark processor which 
             * currently only processes vehicle data.
             */
            OdeMetadata metadata = new OdeMetadata(
                  requestId, outputTopic, outputTopic, odeRequest);
            
            boolean sendRequest = true;
            if (odeRequest.getRequestType() != OdeRequestType.Deposit) {
               // Note: requestId should not be null. So if we get a NPE, we have an internal error
               logger.info("Created new request: {}", requestId );
               // No client topic exists, create a new one
               
               boolean haveActiveEncompassingRegion = 
                     OdeRequestManager.encompassingRegion(odeRequest) &&
                     OdeRequestManager.haveActiveTopic();
      
               MQTopic tempTopic = OdeRequestManager.registerRequest(odeRequest, outputTopic.getName());
               
               if (tempTopic != null) {
                  outputTopic = tempTopic;
                  metadata.setOutputTopic(outputTopic);
               }

               if (haveActiveEncompassingRegion) {// A data stream already exists to fulfill this request
                  sendRequest = false;
                  statusMsg = "Tapping into existing data source connection: " + 
                        outputTopic.getName();
               } else {// A data stream DOES NOT exist to fulfill this request. Let's create one.
                  statusMsg = String.format("New data source connection established "
                        + "for request ID %s. Topic Name: %s", 
                        requestId, outputTopic.getName());
               }
               logger.info(statusMsg);
            } else {
               //Feedback to Deposit Client
               //WebSocketUtils.send(session, odeRequest.toJson());
               //Propagator provides the feedback
               statusMsg = String.format("Deposit message to be sent. "
                     + "Request ID: %s. Topic Name: %s", 
                     requestId, outputTopic.getName());
            }
            
            distroWorker.startIfNotAlive(metadata);
            
            if (sendRequest) {
               if (connector == null) {
                  connector = new DataSourceConnector(metadata, 
                        distroWorker.getPropagator());
                  connectors.put(outputTopic.getName(), connector);
               }
               connector.setMetadata(metadata);
               connector.sendRequest();
            } else {
               connector = connectors.get(outputTopic.getName());
            }
   
            status.setMessage(statusMsg);
            status.setCode(OdeStatus.Code.SUCCESS);
            status.setRequestId(outputTopic.getName());
         } catch (Exception e) {
            if (odeRequest != null && outputTopic != null) {
               OdeRequestManager.unregisterRequest(odeRequest, outputTopic.getName());
            }
            status.setCode(OdeStatus.Code.FAILURE)
            .setMessage(String.format("Error processing request %s.",
                  session.getRequestURI()));
            logger.error(status.toString(), e);
         } finally {
            try {
               if (status == null)
                  status = new OdeStatus();
               //Propagator sends feedback to deposit client, send status for other
               //requests only.
               if (odeRequest.getRequestType() !=  OdeRequestType.Deposit)
                  WebSocketUtils.send(session, new OdeDataMessage(status).toString());
            } catch (IOException e) {
               logger.error("Error sending error message back to client", e);
            }
         }
      }
   }
   
   /**
    * 
    * @param session
    * @param throwable
    */
   @OnError
   public void onError(Session session, Throwable throwable)
   {
      logger.error("Error encountered", throwable);
      shutDown(session, new CloseReason(CloseCodes.VIOLATED_POLICY, throwable.getMessage()));
   }
   
   private void createPropagator(Session session, 
         OdeRequestType requestType, OdeDataType dataType) {
      
      logger.info("Creating new Propagator for client session {}, "
            + "requestType {} and dataType {}",
            session.getId(), requestType.getShortName(), dataType.getShortName());
      
      BaseDataPropagator propagator;
      if (dataType == OdeDataType.AggregateData) {
         propagator = new AggregateDataPropagator(session);
         //ODE-169 - Aggregate Query Data Results also contain Vehicle Data Records
         outputTopic = MQTopic.create(
               AppContext.getInstance().getParam(
                     AppContext.SPARK_AGGREGATOR_OUTPUT_TOPIC), 
                     MQTopic.defaultPartitions());
      } else if (requestType == OdeRequestType.Query ||
            requestType == OdeRequestType.Test) {
         propagator = new QueryDataPropagator(session);
      } else if (requestType == OdeRequestType.Deposit) {
         propagator = new DepositDataPropagator(session);
      } else {
         propagator = new SubscriptionDataPropagator(session);
      }
      
      distroWorker = new DataDistributionWorker(session, propagator, outputTopic);
   }

   /**
    * The user closes the connection.
    * 
    * Note: you can't send messages to the client from this method
    * 
    * @param session
    *           - the session that was closed
    * @param reason
    *           - the reason the session was closed
    */
   @OnClose
   public void onClose(Session session, CloseReason reason) {
      shutDown(session, reason);
   }
   
   private void shutDown(Session session, CloseReason reason) {
      synchronized(WebSocketServer.class) {
         String sessionId = session.getId();
         try {
            logger.info("--- Session {} disconnected. Shutting Down a subscriber to {} ---", sessionId, outputTopic.getName());
            if (reason != null)
               logger.info("Reason: {}", reason.getCloseCode());
   
            if (odeRequest != null && outputTopic != null) {
               logger.info("Removing subscriber {}", odeRequest.getId());
               int numSubscribersRemaining = 0;
               try {
                  numSubscribersRemaining = OdeRequestManager.unregisterRequest(
                        odeRequest, outputTopic.getName());
                  
                  if (numSubscribersRemaining <= 0 && connector != null) {
                     logger.info("Cancelling data request {}", odeRequest.getId());
                     if (numSubscribersRemaining == 0)
                        connector.cancelDataRequest();
                     logger.info("Removing connector {}", odeRequest.getId());
                     connectors.remove(connector.getMetadata().getOutputTopic().getName());
                  }
                  
               } catch (Exception e) {
                  logger.error("Error unregistering or canceling request for " + outputTopic.getName(), e);
               }
            }
   
            if (distroWorker != null) {
               distroWorker.shutDown();
            }
   
         } catch (Exception e) {
            logger.error("Error closing session " + sessionId, e);
         }
      }
   }

   
   private boolean validateRequest(Map<String,Object> userProperties)
   {
	   boolean result = false;
	   
	   if (userProperties.containsKey(SecurityService.AUTH_HEADER+"Result")){
		   result = Boolean.parseBoolean(userProperties.get(SecurityService.AUTH_HEADER+"Result").toString());
	   }
	   else { 
		   logger.warn("No Authentication Result Found");
		   result=false;
	   }
	   
	   return result;
   }
   
   public static class WebSocketServerException extends OdeException {
      public WebSocketServerException(String message) {
         super(message);
      }

      private static final long serialVersionUID = -8146297627867582083L;

   }
}