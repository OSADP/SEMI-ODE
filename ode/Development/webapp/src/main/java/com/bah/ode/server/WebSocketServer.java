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
   private OdeDataDistributor distributor;
   private OdeRequest odeRequest;

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

      logger.info("Connected to ODE on Session ID: {}, " + "Request Type: {}, "
            + "Data Type: {}", sessionId, rtype, dtype);

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
      logger.info("Request Received on Session ID {}: {}", sessionId, message);

      OdeStatus msg = new OdeStatus();
      try {
         odeRequest = OdeRequestManager.buildOdeRequest(
               rtype, dtype, message);
         
         String topicName = OdeRequestManager.buildTopicName(odeRequest);
         
         // Does a topic already existing for this request?
         MQTopic clientTopic = OdeRequestManager.getTopic(topicName);
         if (clientTopic == null) {
            logger.info("Creating new topic: {}", topicName);
            // No client topic exists, create a new one
            clientTopic = OdeRequestManager.getOrCreateTopic(topicName);
            
            if (connector == null)
               connector = new DataSourceConnector();
            
            connector.sendDataRequest(odeRequest, clientTopic);
            
            msg.setCode(OdeStatus.Code.SUCCESS);
            msg.setMessage("DDS Connection Established.");
            session.getAsyncRemote().sendText(msg.toJson());
            
            launchNewDistributor(session, clientTopic);
            OdeRequestManager.addSubscriber(topicName, odeRequest.getDataType());
         } else {
            // Topic already exists by this or another subscriber
            if (distributor != null) {
               logger.info("Tapping into existing topic {} using existing distributor", topicName);
               if (!distributor.getClientTopic().getName().equals(clientTopic.getName())) {
                  /* 
                   * This subscriber is subscribing to a new topic. Remove the old
                   * topic and add the new one. 
                   */
                  
                  OdeRequestManager.removeSubscriber(
                        distributor.getClientTopic().getName(), 
                        odeRequest.getDataType());
                  
                  OdeRequestManager.addSubscriber(topicName, 
                        odeRequest.getDataType());
                  distributor.setClientTopic(clientTopic);
               }
            } else {
               logger.info("Tapping into existing topic {}", topicName);
               launchNewDistributor(session, clientTopic);
               OdeRequestManager.addSubscriber(topicName, odeRequest.getDataType());
            }
         }         
      } catch (Exception ex) {
         OdeStatus status = new OdeStatus()
            .setCode(OdeStatus.Code.FAILURE)
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

   private void launchNewDistributor(
         Session session, MQTopic clientTopic) {
      
      logger.info("Launching new Distributor for client session {} client topic {}",
            session, clientTopic);
      
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
         if (connector != null)
            connector.cancelDataRequest();
         
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

   public static class WebSocketServerException extends OdeException {
      public WebSocketServerException(String message) {
         super(message);
      }

      private static final long serialVersionUID = -8146297627867582083L;

   }
}