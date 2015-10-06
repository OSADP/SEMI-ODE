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

import javax.websocket.CloseReason;
import javax.websocket.EndpointConfig;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.context.AppContext;
import com.bah.ode.exception.OdeException;
import com.bah.ode.model.OdeDataMessage;
import com.bah.ode.model.OdeDataType;
import com.bah.ode.model.OdeRequest;
import com.bah.ode.model.OdeRequestType;
import com.bah.ode.model.OdeStatus;
import com.bah.ode.util.WebSocketUtils;
import com.bah.ode.wrapper.MQTopic;
import com.bah.ode.api.sec.SecurityService;
import com.bah.ode.api.sec.filters.WebSocketAuthenticationConfiguration;

/**
 * gives the relative name for the end point. This will be accessed via
 * ws://ip:port/ode/ws Where "ip" is the IP address of the host, "ode" is the
 * context root and "ws" is the address to access this class from the server
 */
@ServerEndpoint(value = "/api/ws/{rtype}/{dtype}",
				configurator = WebSocketAuthenticationConfiguration.class)
public class WebSocketServer {
   private static Logger logger = LoggerFactory
         .getLogger(WebSocketServer.class);
   
   private static Map<String, DataSourceConnector> connectors = 
         new HashMap<String, DataSourceConnector>();
   
   private DataSourceConnector connector;
   private OdeDataDistributor distributor;
   private OdeRequest odeRequest;
   
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

      logger.info("Connected to ODE on Session ID: {}, " + "Request Type: {}, "
            + "Data Type: {}", sessionId, rtype, dtype);

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
	         if (OdeRequestType.getByShortName(rtype) == null) {
	            msg.setCode(OdeStatus.Code.INVALID_REQUEST_TYPE_ERROR)
	                  .setMessage(
	                        String.format(
	                              "Invalid request type %s. Valid request types are %s",
	                              rtype, OdeRequestType.shortNames()));
	            logger.error(msg.toString());
	         }
	         else if (OdeDataType.getByShortName(dtype) == null){
	            msg.setCode(OdeStatus.Code.INVALID_DATA_TYPE_ERROR)
	                  .setMessage(
	                        String.format(
	                              "Invalid data type %s requested. Valid data types are %s",
	                              dtype, OdeDataType.shortNames()));
	            logger.error(msg.toString());
	         } 
	         else {
	            msg.setCode(OdeStatus.Code.SUCCESS)
	               .setMessage("ODE Connection Established.");
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
      String sessionId = session.getId();
      logger.info("Message Received on Session ID {}: {}", sessionId, message);
      OdeDataType dataTypeRequested = OdeDataType.getByShortName(dtype);
      
      OdeStatus status = new OdeStatus();
      MQTopic clientTopic = null;
      try {
         // Is there a request already for this data?
         if (odeRequest == null) {
            if (dataTypeRequested == OdeDataType.AggregateData) {
               odeRequest = OdeRequestManager.buildOdeRequest(rtype, 
                     OdeDataType.VehicleData.getShortName(), message);
            }
            else {
               odeRequest = OdeRequestManager.buildOdeRequest(rtype, dtype, message);
            }
            
         }

         String requestId = OdeRequestManager.buildRequestId(odeRequest);
         // Use the request Id to determine if there is an existing request for the same data
         clientTopic = OdeRequestManager.getTopic(requestId);
         if (clientTopic == null) {
            // Note: requestId should not be null. So if we get a NPE, we have an internal error
            logger.info("Creating new request ID: {}", requestId);
            // No client topic exists, create a new one
            clientTopic = OdeRequestManager.getOrCreateTopic(requestId);
            
            if (connector == null) {
               connector = new DataSourceConnector(clientTopic);
               connectors.put(requestId, connector);
               
               //FOR TEST ONLY
               if (AppContext.loopbackTest()) {
                  connector.setClientSession(session);
               }

            }
            
            connector.sendDataRequest(odeRequest);
            
            
            if (dataTypeRequested == OdeDataType.AggregateData) {
               launchNewDistributor(session, MQTopic.create(
                     AppContext.AGGREGATES_TOPIC, MQTopic.defaultPartitions()));
            } else {
               launchNewDistributor(session, clientTopic);
            }
            OdeRequestManager.addSubscriber(requestId, odeRequest.getDataType());
            logger.info("DDS Connection Established for request ID {}.", requestId);
            status.setMessage("DDS Connection Established");
         } else {
            // Topic already exists by this or another subscriber
            if (distributor != null) {
               if (!distributor.getClientTopic().getName().equals(clientTopic.getName())) {
                  /* 
                   * This subscriber is subscribing to a new topic. Remove the old
                   * topic and add the new one. 
                   */
                  
                  OdeRequestManager.removeSubscriber(
                        distributor.getClientTopic().getName(), 
                        odeRequest.getDataType());
                  
                  OdeRequestManager.addSubscriber(requestId, 
                        odeRequest.getDataType());
                  distributor.setClientTopic(clientTopic);
                  status.setMessage(String.format("Tapped into existing request %s using existing distributor", requestId));
                  logger.info(status.getMessage());
               } else {
                  status.setMessage(String.format("Request %s already fulfilled. . Nothing further to do.", requestId));
                  logger.info(status.getMessage());
               }
            } else {
               launchNewDistributor(session, clientTopic);
               OdeRequestManager.addSubscriber(requestId, odeRequest.getDataType());
               status.setMessage(String.format("Tapped into existing request %s using a new distributor", requestId));
               logger.info(status.getMessage());
            }
         }         
         status.setCode(OdeStatus.Code.SUCCESS);
         status.setRequestId(requestId);
      } catch (Exception ex) {
         if (clientTopic != null && odeRequest != null) {
            OdeRequestManager.removeSubscriber(
                  clientTopic.getName(), 
                  odeRequest.getDataType());
         }
         status.setCode(OdeStatus.Code.FAILURE)
            .setMessage(String.format("Error processing request %s.",
                  session.getRequestURI()));
         logger.error(status.toString(), ex);
      } finally {
         try {
            WebSocketUtils.send(session, new OdeDataMessage(status).toString());
         } catch (IOException e) {
            logger.error("Error sending error message back to client", e);
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
	   // TODO implement error handler
	   logger.error("Error encountered",throwable);
   }
   
   private void launchNewDistributor(
         Session session, MQTopic clientTopic) {
      
      logger.info("Launching new Distributor for client session {} client topic {}",
            session.getId(), clientTopic);
      
      // Start the processor to receive data from the client topic and 
      // send it to client session
      distributor = new OdeDataDistributor(session, clientTopic);
      Thread respThread = new Thread(distributor);
      respThread.start();
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
      String sessionId = session.getId();
      try {
         logger.info("Session {} disconnected.", sessionId);
         if (reason != null)
            logger.info("Reason: {}", reason.getCloseCode());

         // Do this after rqstMgr.requesterDisconnected()
         if (connector != null) {
            connector.cancelDataRequest();
            connectors.remove(connector.getOutputTopic().getName());
         }
         
         if (distributor != null) {
            distributor.shutDown();
            if (odeRequest != null) {
               OdeRequestManager.removeSubscriber(
                     distributor.getClientTopic().getName(),
                     odeRequest.getDataType());
            }
            
         }
      } catch (Exception e) {
         logger.error("Error closing session " + sessionId, e);
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