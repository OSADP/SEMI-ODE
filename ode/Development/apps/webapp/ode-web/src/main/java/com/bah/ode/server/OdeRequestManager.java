package com.bah.ode.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.asn.OdeGeoRegion;
import com.bah.ode.asn.OdePosition3D;
import com.bah.ode.context.AppContext;
import com.bah.ode.exception.OdeException;
import com.bah.ode.model.OdeDataType;
import com.bah.ode.model.OdeRequest;
import com.bah.ode.wrapper.MQTopic;

public class OdeRequestManager {
   private static Logger logger = 
         LoggerFactory.getLogger(OdeRequestManager.class);
   
   private static AppContext appContext = AppContext.getInstance();

   private static OutboundTopicManagerSingleton otms = 
         OutboundTopicManagerSingleton.getInstance();
   
   private static String topicName(OdeRequest request) throws OdeException {
      String sServiceRegion = 
            appContext.getParam(AppContext.SERVICE_REGION);
      if (sServiceRegion != null) {
         OdeGeoRegion requestRegion = new OdeGeoRegion(
               new OdePosition3D(request.getNwLat(), request.getNwLon(), null),
               new OdePosition3D(request.getSeLat(), request.getSeLon(), null));
         OdeGeoRegion serviceRegion = new OdeGeoRegion(sServiceRegion);
         if (serviceRegion.contains(requestRegion)) {
            if (request.getDataType() == OdeDataType.VehicleData)
               return appContext.getParam(AppContext.SPARK_TRANSFORMER_OUTPUT_TOPIC);
            else
               return AppContext.PASS_THROUGH_OUTPUT_TOPIC;
         } else { 
            return request.getId();
         }
      } else {
         return request.getId();
      }
   }
   
   public static MQTopic getTopic(OdeRequest request) throws OdeException {
      return otms.getTopic(topicName(request));
   }
   
   public static MQTopic getOrCreateTopic(OdeRequest request) throws OdeException {
      return otms.getOrCreateTopic(topicName(request));
   }

   public static int addSubscriber(OdeRequest request) throws OdeException {
      int numSubscribers = otms.addSubscriber(topicName(request)); 
      try {
         logger.info("Added subscriber {}. Current number of subscribers = {}", 
               request.getId(), numSubscribers);
         if (numSubscribers > 0 && !isPassThrough(request.getDataType()) &&
               appContext.getParam(AppContext.SPARK_MASTER).startsWith("local")) {
            LocalSparkProcessor.startStreamingContext();
         }
      } catch (Exception e) {
         removeSubscriber(request);
         throw e;
      }
      return numSubscribers;
   }

   public static int removeSubscriber(OdeRequest request) throws OdeException {
      int numSubscribers = otms.removeSubscriber(topicName(request));
      logger.info("Removed subscriber {}. Current number of subscribers = {}", 
            request.getId(), numSubscribers);
      if (numSubscribers <= 0 && !isPassThrough(request.getDataType()) &&
            appContext.getParam(AppContext.SPARK_MASTER).startsWith("local")) {
         LocalSparkProcessor.stopStreamingContext();
      }
      return numSubscribers;
   }


   public static boolean isPassThrough(OdeDataType dataType) {
      //FOR TEST ONLY
      if (AppContext.loopbackTest()) {
         /*
          * FOR DEBUG ONLY: Bypass Spark and send directly to outbound topic
          */
         return true;
      } else {
         if (dataType == OdeDataType.VehicleData ||
               dataType == OdeDataType.AggregateData) {
            return false;
         } else {
            return true;
         }
      }
   }

   public static void removeAllSubscribers() {
      otms.removeAllSubscribers();
   }

}
