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

import java.util.Iterator;

import javax.websocket.CloseReason;
import javax.websocket.EndpointConfig;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.VoidFunction;
import org.apache.spark.storage.StorageLevel;
import org.apache.spark.streaming.Durations;
import org.apache.spark.streaming.api.java.JavaReceiverInputDStream;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.api.spark.WebSocketReceiver;
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
import com.bah.ode.util.JsonUtils;
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
   WebSocketReceiver receiver = null;

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
            Class decoder = null;
            if (dtype.equals("ints")) {
               decoder = IsdDecoder.class;
            } else if (dtype.equals("vehs")) {
               decoder = VsdDecoder.class;
            }

            receiver = new WebSocketReceiver(StorageLevel.MEMORY_ONLY_SER_2());
            ddsClient = DdsClientFactory.create(appContext, receiver, decoder);

            if (null != ddsClient) {
               receiver.setWsClient(ddsClient);
               ddsClient.connect();
               msg.setCode(OdeStatus.Code.SUCCESS);
               msg.setMessage("Connection Established.");
               session.getAsyncRemote().sendText(msg.toJson());
            } else {
               msg.setCode(OdeStatus.Code.INVALID_DATA_TYPE_ERROR)
                     .setMessage(
                           String.format(
                                 "Invalid data type %s requested. Valid data types are 'ints', 'vehs', 'aggs'",
                                 dtype));
               logger.error(msg.toString());
            }
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
      OdeRequest odeRequest = null;
      logger.info("Request from {}: {}", sessionId, message);

      OdeStatus msg = new OdeStatus();
      try {
         DdsRequest ddsRequest;
         if (rtype.equals("sub")) {
            odeRequest = (OdeRequest) JsonUtils.fromJson(message,
                  OdeSubRequest.class);

            ddsRequest = new DdsSubRequest()
                  .setSystemSubName(DdsRequest.SystemSubName.SDC.getName());

         } else if (rtype.equals("qry")) {
            odeRequest = (OdeRequest) JsonUtils.fromJson(message,
                  OdeQryRequest.class);

            ddsRequest = new DdsQryRequest()
                  .setSystemQueryName(DdsRequest.SystemSubName.SDPC.getName());

         } else {
            msg.setCode(OdeStatus.Code.INVALID_DATA_TYPE_ERROR)
                  .setMessage(
                        String.format(
                              "Invalid request type %s. Valid request types are 'sub', 'qry'",
                              rtype));
            logger.error(msg.toString());
            throw new WebSocketServerException(msg.toString());
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
            msg.setCode(OdeStatus.Code.INVALID_DATA_TYPE_ERROR)
                  .setMessage(
                        String.format(
                              "Invalid data type %s requested. Valid data types are 'ints', 'vehs', 'aggs'",
                              dtype));
            logger.error(msg.toString());
            return;
         }

         String subreq = ddsRequest.toString();
         logger.info("Sending subscription request: {}", subreq);

         if (ddsClient == null)
            throw new OdeException("DDS Client not initialized");

         ddsClient.send(subreq);

         // DEBUG ONLY
         // For debugging only and running the app on local machine
         // without Spark
         DdsMessageHandler handler = (DdsMessageHandler) ddsClient
               .getHandler();
         if (!appContext.getParam(AppContext.SPARK_MASTER).isEmpty()) {
            
            if (appContext.getSparkContext() == null)
               appContext.init(appContext.getServletContext());
            
            handler.setWsClientSession(null);
            JavaStreamingContext ssc = new JavaStreamingContext(
                  appContext.getSparkContext(),
                  Durations.seconds(Integer.parseInt(appContext
                        .getParam(AppContext.SPARK_STREAMING_DEFAULT_DURATION))));

            // Create a input stream with the custom receiver on target ip:port
            // and count the
            // words in input stream of \n delimited text (eg. generated by
            // 'nc')
            JavaReceiverInputDStream<String> lines = ssc
                  .receiverStream(receiver);
            final Session clientSession = session;

            Function<JavaRDD<String>, Void> f1 = new Function<JavaRDD<String>, Void>() {

               @Override
               public Void call(JavaRDD<String> rdd) throws Exception {
                  VoidFunction<Iterator<String>> f2 = new VoidFunction<Iterator<String>>() {

                     @Override
                     public void call(Iterator<String> partitionOfRecords)
                           throws Exception {
                        while (partitionOfRecords.hasNext()) {
                           String record = partitionOfRecords.next();
                           clientSession.getBasicRemote().sendText(record);
                        }
                     }
                  };

                  rdd.foreachPartition(f2);
                  return null;
               }
            };

            lines.foreachRDD(f1);
            lines.print();
            ssc.start();
         } else {
            handler.setWsClientSession(session);
         }
      } catch (Exception ex) {
         msg.setCode(OdeStatus.Code.INVALID_DATA_TYPE_ERROR).setMessage(
               String.format("Error procesing request %s.",
                     session.getRequestURI()));
         logger.error(msg.toString(), ex);
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