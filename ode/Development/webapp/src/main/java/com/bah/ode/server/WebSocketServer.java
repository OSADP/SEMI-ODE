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
import com.bah.ode.exception.OdeException;
import com.bah.ode.model.OdeDataType;
import com.bah.ode.model.OdeRequest;
import com.bah.ode.model.OdeRequestType;
import com.bah.ode.wrapper.MQTopic;

/**
 * gives the relative name for the end point. This will be accessed via
 * ws://ip:port/ode/ws Where "ip" is the IP address of the host, "ode" is the
 * context root and "ws" is the address to access this class from the server
 */
@ServerEndpoint("/api/ws/{rtype}/{dtype}")
public class WebSocketServer {
   private static Logger logger = LoggerFactory
         .getLogger(WebSocketServer.class);
   
   private DataSourceConnector connector;
   private ResponseProcessor rp;
   private OdeRequestManager rqstMgr;

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
         if (OdeRequestType.getByShortName(rtype) == null) {
            msg.setCode(OdeStatus.Code.INVALID_REQUEST_TYPE_ERROR)
                  .setMessage(
                        String.format(
                              "Invalid request type %s. Valid request types are %s",
                              rtype, OdeRequestType.shortNames()));
            logger.error(msg.toString());
         } else if (OdeDataType.getByShortName(dtype) == null){
            msg.setCode(OdeStatus.Code.INVALID_DATA_TYPE_ERROR)
                  .setMessage(
                        String.format(
                              "Invalid data type %s requested. Valid data types are %s",
                              dtype, OdeDataType.shortNames()));
            logger.error(msg.toString());
         } else {
            msg.setCode(OdeStatus.Code.SUCCESS)
               .setMessage("ODE Connection Established.");
         }
         session.getAsyncRemote().sendText(msg.toJson());

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
         OdeRequest odeRequest = OdeRequestManager.buildOdeRequest(
               rtype, dtype, message);
         rqstMgr = new OdeRequestManager(odeRequest);
         
         // Does a topic already existing for this request?
         MQTopic outboundTopic = rqstMgr.getTopic();
         
         if (outboundTopic == null) {
            // No outbound topic exists, create a new one
            outboundTopic = rqstMgr.getOrCreateTopic();
            
            connector = new DataSourceConnector();
            connector.sendDataRequest(odeRequest, outboundTopic);
            
            msg.setCode(OdeStatus.Code.SUCCESS);
            msg.setMessage("DDS Connection Established.");
            session.getAsyncRemote().sendText(msg.toJson());
            
         }
         // Start the processor to receive data from the outbound topic and 
         // send it to client session
         rp = new ResponseProcessor(session, outboundTopic);
         Thread respThread = new Thread(rp);
         respThread.start();
         rqstMgr.requesterConnected();
         
      } catch (Exception ex) {
         OdeStatus status = new OdeStatus()
            .setCode(OdeStatus.Code.INVALID_DATA_TYPE_ERROR)
            .setMessage(String.format("Error processing request %s.",
                  session.getRequestURI()));
         logger.error(status.toString(), ex);
         try {
            session.getBasicRemote().sendText(status.toString());
         } catch (IOException e) {
            logger.error("Error sending error message back to client", e);
         }
      }
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

         connector.cancelDataRequest();
         
         if (rqstMgr != null) {
            rqstMgr.requesterDisconnected();
         }
         
         if (rp != null) {
            rp.shutDown();
         }
      } catch (Exception e) {
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