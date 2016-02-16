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
import java.time.ZonedDateTime;

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

import com.bah.ode.context.AppContext;
import com.bah.ode.exception.OdeException;
import com.bah.ode.metrics.OdeMetrics;
import com.bah.ode.metrics.OdeMetrics.Meter;
import com.bah.ode.model.InternalDataMessage;
import com.bah.ode.model.OdeAdvisoryData;
import com.bah.ode.model.OdeControlData;
import com.bah.ode.model.OdeData;
import com.bah.ode.model.OdeDataMessage;
import com.bah.ode.model.OdeDataType;
import com.bah.ode.model.OdeIntersectionData;
import com.bah.ode.model.OdeMsgPayload;
import com.bah.ode.model.OdeStatus;
import com.bah.ode.model.OdeStatus.Code;
import com.bah.ode.model.OdeVehicleDataFlat;
import com.bah.ode.util.DateTimeUtils;
import com.bah.ode.util.JsonUtils;
import com.bah.ode.util.WebSocketUtils;
import com.bah.ode.wrapper.DataProcessor.DataProcessorException;
import com.bah.ode.wrapper.MQProducer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 * gives the relative name for the end point. This will be accessed via
 * ws://ip:port/ode/ws Where "ip" is the IP address of the host, "ode" is the
 * context root and "ws" is the address to access this class from the server
 */
@ServerEndpoint("/tst/ws/{dtype}/{requestId}")
public class TestUploadServer {
   private static Logger logger = LoggerFactory.getLogger(TestUploadServer.class);
   
   private MQProducer<String, String> producer;
   private TestRequestManager testMgr;

   private Meter meter = OdeMetrics.getInstance().meter("TotalRecordsReceived");
   private Meter vsdMeter = OdeMetrics.getInstance().meter("VSD_BundlesReceived");
   private Meter isdMeter = OdeMetrics.getInstance().meter("ISD_RecordsReceived");
   private Meter asdMeter = OdeMetrics.getInstance().meter("ASD_RecordsReceived");

   /**
    * Allows us to intercept the creation of a new session. The session class
    * allows us to send data to the user. In the method onOpen, we'll let the
    * user know that the handshake was successful.
    * 
    * @param session
    *           - The WebSocket session that was just opened
    * @param endpointConfig
    *           - the end-point configuration object
    * @param dtype
    *           - the path parameter identifying the data type being requested.
    *           Valid <code>dtype</code> values are:
    *           <ul>
    *           <li>int - Intersection data</li>
    *           <li>veh - Vehicle data</li>
    *           <li>agg - Aggregate data</li>
    *           </ul>
    * @param requestId
    *           - The request ID for the session that requested the data.
    *           The requestId is returned upon successful placement of a 
    *           data request. The test application must send data to the 
    *           pre-established test channel created by the same test application.
    */
   @OnOpen
   public void onOpen(Session session, EndpointConfig endpointConfig,
         @PathParam("dtype") String dtype, @PathParam("requestId") String requestId) {
      String sessionId = session.getId();

      logger.info("Connected to ODE on TEST Session ID: {}, " + "Request ID: {}",
            sessionId, requestId);

      OdeStatus msg = new OdeStatus();
      try {
         msg.setCode(OdeStatus.Code.SUCCESS)
            .setMessage("Test Connection Established.");
         WebSocketUtils.send(session, new OdeDataMessage(msg).toJson());
         
         //FOR TEST ONLY
         if (!AppContext.loopbackTest()) {
            this.producer = new MQProducer<String, String>(
                  AppContext.getInstance().getParam(
                  AppContext.KAFKA_METADATA_BROKER_LIST));
         }
         
         if (WebSocketServer.getConnector(requestId) != null)
            this.testMgr = WebSocketServer.getConnector(requestId).getTestMgr();
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
    * @param dtype
    *           - the path parameter identifying the data type being requested.
    *           Valid <code>dtype</code> values are:
    *           <ul>
    *           <li>int - Intersection data</li>
    *           <li>veh - Vehicle data</li>
    *           <li>agg - Aggregate data</li>
    *           </ul>
    * @param requestId
    *           - The request ID for the session that requested the data.
    *           The requestId is returned upon successful placement of a 
    *           data request. The test application must send data to the 
    *           pre-established test channel created by the same test application.
    */
   @OnMessage
   public void onMessage(Session session, String message, boolean last,
         @PathParam("dtype") String dtype, @PathParam("requestId") String requestId) {
      OdeStatus status = new OdeStatus();
      try {
         if (message != null && !message.isEmpty()) {
            //feedback to the upload client
            WebSocketUtils.send(session, message);
            if (testMgr != null) {
               // If the message does not appear to be a json
               if (!JsonUtils.isValid(message))
                  return;
               
               ObjectNode odm = OdeDataMessage.jsonStringToObjectNode(message);
               if (odm != null) {
                  JsonNode payload = odm.get(AppContext.PAYLOAD_STRING);
                  JsonNode payloadTypeNode = odm.get(AppContext.METADATA_STRING).get(AppContext.PAYLOAD_TYPE_STRING);
                  ObjectNode idm = 
                        InternalDataMessage.createObjectNodeFromPayload(payload, payloadTypeNode);
               
                  if (idm != null) {
                     OdeDataType payloadType = OdeDataType.getByShortName(payloadTypeNode.textValue());
                     
                     if (payloadType != null) {
                        switch (payloadType) {
                        case VehicleData:
                           meter.mark();
                           vsdMeter.mark();

                           OdeVehicleDataFlat ovdf = 
                                 (OdeVehicleDataFlat) JsonUtils.fromJson(
                                       payload.toString(), OdeVehicleDataFlat.class);
                           sendOdeMsgPayload(ovdf, payloadType, ovdf.getSerialId());
                           break;
         
                        case IntersectionData:
                        case MapData:
                        case SPaTData:
                           meter.mark();
                           isdMeter.mark();

                           OdeIntersectionData oisd = 
                           (OdeIntersectionData) JsonUtils.fromJson(
                                 payload.toString(), OdeIntersectionData.class);
                           sendOdeMsgPayload(oisd, payloadType, oisd.getSerialId());
                           break;
         
                        case AdvisoryData:
                           meter.mark();
                           asdMeter.mark();

                           OdeAdvisoryData oasd = 
                           (OdeAdvisoryData) JsonUtils.fromJson(
                                 payload.toString(), OdeAdvisoryData.class);
                            sendOdeMsgPayload(oasd, payloadType, oasd.getSerialId());
         
                           break;
         
                        case Control:
                           OdeControlData ocd = 
                           (OdeControlData) JsonUtils.fromJson(
                                 payload.toString(), OdeControlData.class);
                            sendOdeMsgPayload(ocd, payloadType, null);
         
                           break;
         
                        default:
                           status.setCode(Code.FAILURE);
                           status.setMessage("Invalid payloadType: " + payloadTypeNode.textValue()); 
                           logger.error(status.getMessage());
                           WebSocketUtils.send(session, new OdeDataMessage(status).toJson());
                           break;
                        }
                     } else {
                        status.setCode(Code.FAILURE);
                        status.setMessage("Invalid payload type: " + payloadTypeNode); 
                        logger.error(status.getMessage());
                        WebSocketUtils.send(session, new OdeDataMessage(status).toJson());
                     }
                  } else { // unsupported message
                     status.setCode(Code.FAILURE);
                     status.setMessage("Unsupported message: " + message +
                           "\npayload, metadata or className required."); 
                     logger.error(status.getMessage());
                     WebSocketUtils.send(session, new OdeDataMessage(status).toJson());
                  }
               }
            } else { //testMgr == null
               status.setCode(Code.FAILURE);
               status.setMessage("Test Manager NOT Initialized. "
                     + "Send a Test Request to ODE before sending test data."); 
               logger.error(status.getMessage());
               WebSocketUtils.send(session, new OdeDataMessage(status).toJson());
            }
         } // message != null && !message.isEmpty()
      } catch (Exception ex) {
         status.setCode(OdeStatus.Code.FAILURE)
            .setMessage(String.format("%s: Error processing test data %s.",
                  session.getRequestURI(), message));
         logger.error(status.toString(), ex);
      } finally {
//         try {
//            session.getBasicRemote().sendText(status.toString());
//         } catch (IOException e) {
//            logger.error("Error sending error message back to client", e);
//         }
      }
   }

   public void sendOdeMsgPayload(OdeMsgPayload msgPayload, OdeDataType payloadType, String key)
         throws IOException, DataProcessorException {
      // for backward compatibility, if payload did not contain className,
      // set it here based on payloadType
      if (msgPayload.getDataType() == null || msgPayload.getDataType() == OdeDataType.Unknown)
         msgPayload.setDataType(payloadType);
      
      if (msgPayload instanceof OdeData) {
         OdeMetrics.getInstance().cacheIn();
         
         OdeData odeData = (OdeData) msgPayload;
         odeData.setReceivedAt(DateTimeUtils.isoDateTime(ZonedDateTime.now()));
      }
      
      InternalDataMessage idm = new InternalDataMessage();
      idm.setMetadata(testMgr.getMetadata());
      
      if (producer != null) {
         idm.setKey(key);
         idm.getMetadata().setKey(idm.getKey());
         idm.setPayload(msgPayload);
         
         producer.send(
               testMgr.getMetadata().getInputTopic().getName(), 
               idm.getKey(), idm.toJson());
      }
      
      //FOR TEST ONLY
      if (AppContext.loopbackTest()) {
         testMgr.getLoopbackTestPropagator().process(new OdeDataMessage(msgPayload).toJson());
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

      } catch (Exception e) {
         logger.error("Error closing session " + sessionId, e);
      }
   }

   public static class TestUploadServerException extends OdeException {
      public TestUploadServerException(String message) {
         super(message);
      }

      private static final long serialVersionUID = -8146297627867582083L;

   }
}