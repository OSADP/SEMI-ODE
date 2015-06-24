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

import javax.websocket.CloseReason;
import javax.websocket.EndpointConfig;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.api.ws.OdeStatus;
import com.bah.ode.context.AppContext;
import com.bah.ode.dds.client.ws.DdsClientFactory;
import com.bah.ode.dds.client.ws.DdsMessageHandler;
import com.bah.ode.dds.client.ws.IsdDecoder;
import com.bah.ode.dds.client.ws.VsdDecoder;
import com.bah.ode.exception.OdeException;
import com.bah.ode.model.DdsQryRequest;
import com.bah.ode.model.DdsRequest;
import com.bah.ode.model.DdsSubRequest;
import com.bah.ode.model.OdeQryRequest;
import com.bah.ode.model.OdeRequest;
import com.bah.ode.model.OdeSubRequest;
import com.bah.ode.spark.SparkWorkflow;
import com.bah.ode.util.JsonUtils;
import com.bah.ode.wrapper.MQTopic;
import com.bah.ode.wrapper.WebSocketClient;
import com.bah.ode.wrapper.WebSocketClient.WebSocketException;

/**
 * gives the relative name for the end point. This will be accessed via
 * ws://ip:port/ode/ws Where "ip" is the IP address of the host, "ode" is the
 * context root and "ws" is the address to access this class from the server
 */
@ServerEndpoint("/api/ws/{rtype}/{dtype}")
public class WebSocketServer {
   private static Logger logger = LoggerFactory
         .getLogger(WebSocketServer.class);
   private AppContext appContext = AppContext.getInstance();
   WebSocketClient<?> ddsClient = null;

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
    *           <li>sub - subscription request</li>
    *           <li>qry - QUery request</li>
    *           </ul>
    * @param dtype
    *           - the path parameter identifying the data type being requested.
    *           Valid <code>dtype</code> values are:
    *           <ul>
    *           <li>ints - Intersection data</li>
    *           <li>vehs - Vehicle data</li>
    *           <li>aggs - Aggregate data</li>
    *           </ul>
    */
   @OnOpen
   public void onOpen(Session session, EndpointConfig endpointConfig,
         @PathParam("rtype") String rtype, @PathParam("dtype") String dtype) {
      String sessionId = session.getId();

      logger.info("Connection opened. Session ID: {}, " + "Request Type: {}, "
            + "Data Type Requested: {}", sessionId, rtype, dtype);

      OdeStatus msg = new OdeStatus();
      try {
         if (rtype.equals("sub") || rtype.equals("qry")) {
         } else {
            msg.setCode(OdeStatus.Code.INVALID_REQUEST_TYPE_ERROR)
                  .setMessage(
                        String.format(
                              "Invalid request type %s. Valid request types are 'sub', 'qry'",
                              rtype));
            logger.error(msg.toString());
         }

      } catch (Exception ex) {
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
    *           <li>sub - subscription request</li>
    *           <li>qry - QUery request</li>
    *           </ul>
    * @param dtype
    *           - the path parameter identifying the data type being requested.
    *           Valid <code>dtype</code> values are:
    *           <ul>
    *           <li>ints - Intersection data</li>
    *           <li>vehs - Vehicle data</li>
    *           <li>aggs - Aggregate data</li>
    *           </ul>
    */
   @OnMessage
   public void onMessage(Session session, String message, boolean last,
         @PathParam("rtype") String rtype, @PathParam("dtype") String dtype) {
      String sessionId = session.getId();
      logger.info("Request from {}: {}", sessionId, message);

      OdeStatus msg = new OdeStatus();
      try {
         // Is a topic already existing for this request?
         OdeRequest odeRequest = buildOdeRequest(rtype, message);
         OdeRequestManagerSingleton rqstMgr = OdeRequestManagerSingleton.getInstance();
         MQTopic outboundTopic = rqstMgr.getTopic(odeRequest);
         if (outboundTopic == null) {
            // No outbound topic exists, create a new one
            outboundTopic = rqstMgr.createTopic(odeRequest);
            
            DdsRequestManagerSingleton ddsMgr = 
                  DdsRequestManagerSingleton.getInstance();
            
            // get a data manager to start the data flow
            DdsRequest ddsRequest = buildDdsRequest(message, rtype, dtype);
            MQTopic inboundTopic = ddsMgr.getTopic(ddsRequest);
            if (inboundTopic == null) {
               // No inbound topic exists; create a new inbound topic
               inboundTopic = ddsMgr.createTopic(ddsRequest);
               
               // Send the new request
               String sDdsRequest = ddsRequest.toString();
               logger.info("Sending subscription request: {}", sDdsRequest);

               Class decoder = null;
               if (dtype.equals("ints")) {
                  decoder = IsdDecoder.class;
               } else if (dtype.equals("vehs")) {
                  decoder = VsdDecoder.class;
               }

               ddsClient = DdsClientFactory.create(
                     appContext, outboundTopic, decoder);
               
               if (ddsClient == null)
                  throw new OdeException("Error creating DDS Client");

               ddsClient.connect();
               msg.setCode(OdeStatus.Code.SUCCESS);
               msg.setMessage("Connection Established.");
               session.getAsyncRemote().sendText(msg.toJson());
               ddsClient.send(ddsRequest.toString());
               
               DdsMessageHandler handler = (DdsMessageHandler) ddsClient
                     .getHandler();
               if (!appContext.getParam(AppContext.SPARK_MASTER).isEmpty()) {
                  
                  if (appContext.getSparkStreamingConext() == null)
                     appContext.init(appContext.getServletContext());
                  
                  handler.setTopic(inboundTopic);
                  
                  SparkWorkflow workflow = new SparkWorkflow(appContext);
                  
                  workflow.start(outboundTopic);
               } else {
                  /*
                   * FOR DEBUG ONLY: Bypass Spark and send directly to outbound topic
                   */
                  handler.setTopic(outboundTopic);
               }
               
            } else {
               // Identical DDS request already exists, tap into the same flow
            }
         }
         // Start the processor to receive data from the outbound topic and 
         // send it to client session
         ResponseProcessor rp = new ResponseProcessor(session, outboundTopic);
         rp.start();
         

         if (null != ddsClient) {

         } else {
            msg.setCode(OdeStatus.Code.INVALID_DATA_TYPE_ERROR)
                  .setMessage(
                        String.format(
                              "Invalid data type %s requested. Valid data types are 'ints', 'vehs', 'aggs'",
                              dtype));
            logger.error(msg.toString());
         }

      } catch (Exception ex) {
         OdeStatus status = new OdeStatus()
            .setCode(OdeStatus.Code.INVALID_DATA_TYPE_ERROR)
            .setMessage(String.format("Error procesing request %s.",
                  session.getRequestURI()));
         logger.error(status.toString(), ex);
      }
   }

   private DdsRequest buildDdsRequest(
         String message, String rtype, String dtype)
               throws WebSocketServerException, OdeException {
      OdeStatus status = new OdeStatus();
      DdsRequest ddsRequest;
      OdeRequest odeRequest = buildOdeRequest(rtype, message);
      if (rtype.equals("sub")) {
         ddsRequest = new DdsSubRequest()
               .setSystemSubName(DdsRequest.SystemSubName.SDC.getName());
      } else if (rtype.equals("qry")) {
         ddsRequest = new DdsQryRequest()
               .setSystemQueryName(DdsRequest.SystemSubName.SDPC.getName());
      } else {
         status.setCode(OdeStatus.Code.INVALID_DATA_TYPE_ERROR)
               .setMessage(
                     String.format(
                           "Invalid request type %s. Valid request types are 'sub', 'qry'",
                           rtype));
         logger.error(status.toString());
         throw new WebSocketServerException(status.toString());
      }

      ddsRequest
            .setResultEncoding(DdsRequest.ResultEncoding.BASE_64.getEnc())
            .setNwLat(odeRequest.getNwLat()).setNwLon(odeRequest.getNwLon())
            .setSeLat(odeRequest.getSeLat()).setSeLon(odeRequest.getSeLon());

      if (dtype.equals("ints")) {
         ddsRequest.setDialogID(DdsRequest.Dialog.ISD.getId());
      } else if (dtype.equals("vehs")) {
         ddsRequest.setDialogID(DdsRequest.Dialog.VSD.getId());
      } else {
         status.setCode(OdeStatus.Code.INVALID_DATA_TYPE_ERROR)
               .setMessage(
                     String.format(
                           "Invalid data type %s requested. Valid data types are 'ints', 'vehs', 'aggs'",
                           dtype));
         logger.error(status.toString());
         return null;
      }

      return ddsRequest;
   }
   
   private OdeRequest buildOdeRequest(String rtype, String message)
         throws WebSocketServerException {
      OdeRequest odeRequest = null;
      if (rtype.equals("sub")) {
         odeRequest = (OdeRequest) JsonUtils.fromJson(message,
               OdeSubRequest.class);
      } else if (rtype.equals("qry")) {
         odeRequest = (OdeRequest) JsonUtils.fromJson(message,
               OdeQryRequest.class);
      } else {
         OdeStatus status = new OdeStatus()
            .setCode(OdeStatus.Code.INVALID_DATA_TYPE_ERROR)
            .setMessage(
                  String.format(
                        "Invalid request type %s. Valid request types are 'sub', 'qry'",
                        rtype));
         logger.error(status.toString());
         throw new WebSocketServerException(status.toString());
      }
      return odeRequest;
   }
   
   /**
    * The user closes the connection.
    * 
    * Note: you can't send messages to the client from this method
    * 
    * @param session
    *           - the session that was closed
    * @param reason
    *           - the reson the session was closed
    */
   @OnClose
   public void onClose(Session session, CloseReason reason) {
      String sessionId = session.getId();
      try {
         if (ddsClient != null)
            ddsClient.close();

         logger.info("Session {} disconnected.", sessionId);
         if (reason != null)
            logger.info("Reason: {}", reason.getCloseCode());

      } catch (WebSocketException e) {
         logger.error("Error closing session " + sessionId, e);
      }
   }

   public static class WebSocketServerException extends OdeException {
      public WebSocketServerException(String message) {
         super(message);
      }

      private static final long serialVersionUID = -8146297627867582083L;

   }
}