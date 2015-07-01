package com.bah.ode.server;

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
import com.bah.ode.model.OdeDataType;
import com.bah.ode.model.OdeRequest;
import com.bah.ode.model.OdeRequestType;
import com.bah.ode.server.WebSocketServer.WebSocketServerException;
import com.bah.ode.wrapper.MQTopic;
import com.bah.ode.wrapper.WebSocketClient;

public class DdsRequestManager {
   private static Logger logger = 
         LoggerFactory.getLogger(DdsRequestManager.class);

   private static AppContext appContext = AppContext.getInstance();
   
   private static InboundTopicManagerSingleton itms = 
         InboundTopicManagerSingleton.getInstance();
   private static OutboundTopicManagerSingleton otms = 
         OutboundTopicManagerSingleton.getInstance();
   
   private MQTopic          topic;
   private BaseTopicManager topicManager;
   
   private WebSocketClient<?> ddsClient;
   
   
   public DdsRequestManager(OdeDataType dataType, String topicName) {
      if (isPassThrough(dataType))
         this.topicManager = otms;
      else
         this.topicManager = itms;
      this.topic = topicManager.getOrCreateTopic(topicName);
   }

   public static boolean isPassThrough(OdeDataType dataType) {
      if (appContext.getParam(AppContext.SPARK_MASTER).isEmpty()) {
         /*
          * FOR DEBUG ONLY: Bypass Spark and send directly to outbound topic
          */
         return true;
      } else {
         if (dataType == OdeDataType.VehicleData) {
            return false;
         } else {
            return true;
         }
      }
   }

   public int addNewSubscriber() {
      return topicManager.addSubscriber(topic.getName());
   }

   public int removeSubscriber() throws DdsRequestManagerException {
      int requestersRmaining = 
            topicManager.removeSubscriber(topic.getName());
      if (ddsClient != null && requestersRmaining <= 0) {
         try {
            ddsClient.close();
         } catch (Exception e) {
            throw new DdsRequestManagerException("Error closing DDS Client.", e); 
         }
         ddsClient = null;
      }
      

      return requestersRmaining;
   }

   public DdsRequest buildDdsRequest(OdeRequest odeRequest)
               throws WebSocketServerException, OdeException {
      OdeStatus status = new OdeStatus();
      DdsRequest ddsRequest;
      OdeRequestType requestType = odeRequest.getRequestType();
      if (requestType == OdeRequestType.Subscription) {
         ddsRequest = new DdsSubRequest()
               .setSystemSubName(DdsRequest.SystemName.SDC.getName());
      } else if (requestType == OdeRequestType.Query) {
         ddsRequest = new DdsQryRequest()
               .setSystemQueryName(DdsRequest.SystemName.SDPC.getName());
      } else {
         status.setCode(OdeStatus.Code.INVALID_DATA_TYPE_ERROR)
               .setMessage(
                     String.format(
                           "Invalid request type %s. Valid request types are %s",
                           requestType.getShortName(),
                           OdeRequestType.shortNames()));
         logger.error(status.toString());
         throw new WebSocketServerException(status.toString());
      }

      ddsRequest
            .setResultEncoding(DdsRequest.ResultEncoding.BASE_64.getEnc())
            .setNwLat(odeRequest.getNwLat()).setNwLon(odeRequest.getNwLon())
            .setSeLat(odeRequest.getSeLat()).setSeLon(odeRequest.getSeLon());

      OdeDataType dataType = odeRequest.getDataType();
      if (dataType == OdeDataType.IntersectionData) {
         ddsRequest.setDialogID(DdsRequest.Dialog.ISD.getId());
      } else if (dataType == OdeDataType.VehicleData) {
         ddsRequest.setDialogID(DdsRequest.Dialog.VSD.getId());
      } else {
         status.setCode(OdeStatus.Code.INVALID_DATA_TYPE_ERROR)
               .setMessage(
                     String.format(
                           "Invalid data type %s requested. Valid data types are %s",
                           dataType, OdeDataType.shortNames()));
         logger.error(status.toString());
         return null;
      }

      return ddsRequest;
   }

   public void sendDdsDataRequest(OdeRequest odeRequest, MQTopic outboundTopic) throws DdsRequestManagerException {
      try {
         // get a data manager to start the data flow
         DdsRequest ddsRequest = buildDdsRequest(odeRequest);
         
         // Send the new request
         String sDdsRequest = ddsRequest.toString();
         logger.info("Sending subscription request: {}", sDdsRequest);

         Class decoder = null;
         if (odeRequest.getDataType() == OdeDataType.IntersectionData) {
            decoder = IsdDecoder.class;
         } else if (odeRequest.getDataType() == OdeDataType.VehicleData) {
            decoder = VsdDecoder.class;
         }

         ddsClient = DdsClientFactory.create(appContext, topic, decoder);
         
         if (ddsClient == null)
            throw new OdeException("Error creating DDS Client");

         ddsClient.connect();
         ddsClient.send(sDdsRequest);
         topicManager.addSubscriber(topic.getName());
         
         DdsMessageHandler handler = (DdsMessageHandler) ddsClient.getHandler();
         handler.setTopic(topic);
         
      } catch (Exception e) {
         throw new DdsRequestManagerException("Error sending Data Request.", e);
      }
   }
   
   public static class DdsRequestManagerException extends Exception {
      private static final long serialVersionUID = 1L;

      public DdsRequestManagerException(String message, Exception e) {
         super(message, e);
      }
      
   }
}
