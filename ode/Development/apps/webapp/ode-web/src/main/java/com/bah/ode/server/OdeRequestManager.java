package com.bah.ode.server;

import java.math.BigDecimal;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.asn.OdeGeoRegion;
import com.bah.ode.asn.OdePosition3D;
import com.bah.ode.context.AppContext;
import com.bah.ode.model.OdeDataType;
import com.bah.ode.model.OdeDepRequest;
import com.bah.ode.model.OdePolyline;
import com.bah.ode.model.OdeQryRequest;
import com.bah.ode.model.OdeRequest;
import com.bah.ode.model.OdeRequestType;
import com.bah.ode.model.OdeStatus;
import com.bah.ode.model.OdeSubRequest;
import com.bah.ode.model.OdeTstRequest;
import com.bah.ode.server.WebSocketServer.WebSocketServerException;
import com.bah.ode.util.GeoUtils;
import com.bah.ode.util.JsonUtils;
import com.bah.ode.wrapper.MQTopic;

public class OdeRequestManager {
   private static Logger logger = 
         LoggerFactory.getLogger(OdeRequestManager.class);
   
   private static AppContext appContext = AppContext.getInstance();

   private static OutboundTopicManagerSingleton otms = 
         OutboundTopicManagerSingleton.getInstance();
   
   private static ConcurrentHashMap<String, OdeGeoRegion> serviceRegions =
         new ConcurrentHashMap<String, OdeGeoRegion>();

   private static OdeGeoRegion largestServiceRegion;

   private static MQTopic largestTopic;

   public static OdeRequest buildOdeRequest(String rtype, String dtype, String message)
         throws WebSocketServerException {
      OdeRequest odeRequest = null;
      OdeRequestType requestType = OdeRequestType.getByShortName(rtype);
      if (requestType == OdeRequestType.Subscription) {
         odeRequest = (OdeRequest) JsonUtils.fromJson(message,
               OdeSubRequest.class);
      } else if (requestType == OdeRequestType.Query) {
         odeRequest = (OdeRequest) JsonUtils.fromJson(message,
               OdeQryRequest.class);
      } else if (requestType == OdeRequestType.Test) {
         odeRequest = (OdeRequest) JsonUtils.fromJson(message,
               OdeTstRequest.class);
      } else if (requestType == OdeRequestType.Deposit) {
         odeRequest = (OdeRequest) JsonUtils.fromJson(message,
               OdeDepRequest.class);
      } else {
         OdeStatus status = new OdeStatus()
            .setCode(OdeStatus.Code.INVALID_REQUEST_TYPE_ERROR)
            .setMessage(
                  String.format(
                        "Invalid request type %s. Valid request types are %s.",
                        rtype, OdeRequestType.shortNames()));
         logger.error(status.toString());
         throw new WebSocketServerException(status.toString());
      }
      odeRequest.setRequestType(requestType);

      OdeDataType dataType = OdeDataType.getByShortName(dtype);
      if (dataType == null) {
         OdeStatus status = new OdeStatus()
            .setCode(OdeStatus.Code.INVALID_DATA_TYPE_ERROR)
            .setMessage(
                  String.format(
                        "Invalid data type %s. Valid data types are %s.",
                        dtype, OdeDataType.shortNames()));
         logger.error(status.toString());
         throw new WebSocketServerException(status.toString());
      }
      odeRequest.setDataType(dataType);
      
      OdePolyline polyline = odeRequest.getPolyline();
      
      if (polyline != null)
         polyline.updateAllStartPoints();
      
      odeRequest.setId(UUID.randomUUID().toString());
      return odeRequest;
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

   public static MQTopic registerRequest(OdeRequest odeRequest, String topicName) {
      if (odeRequest.getRequestType() ==  OdeRequestType.Subscription) {
         if (largestServiceRegion == null || largestTopic == null) {
            largestServiceRegion = AppContext.DEFAULT_SERVICE_REGION;
            serviceRegions.put(topicName, largestServiceRegion);
            largestTopic = otms.getOrCreateTopic(topicName);
            if (!isPassThrough(odeRequest.getDataType()) &&
                  appContext.getParam(AppContext.SPARK_MASTER).startsWith("local")) {
               LocalSparkProcessor.startStreamingContext();
            }
         } else {
            OdeGeoRegion requestedRegion = new OdeGeoRegion(
                  new OdePosition3D(odeRequest.getNwLat(), odeRequest.getNwLon(), BigDecimal.ZERO),
                  new OdePosition3D(odeRequest.getSeLat(), odeRequest.getSeLon(), BigDecimal.ZERO));
            if (!GeoUtils.isRegionWithinRegion(requestedRegion, largestServiceRegion)) {
               largestServiceRegion = GeoUtils.expandedRegion(requestedRegion, largestServiceRegion);
               serviceRegions.put(topicName, largestServiceRegion);
               largestTopic = otms.getOrCreateTopic(topicName);
            }
         }
         int numSubs = otms.addSubscriber(largestTopic.getName());
         logger.info("Added subscriber to {}: Total subscribers: {}", largestTopic.getName(), numSubs);
         return largestTopic;
      } else {
         return null;
      }
   }

   public static int unregisterRequest(OdeRequest odeRequest, String topicName) {
      int numSubscribersRemaining = otms.removeSubscriber(topicName);
      serviceRegions.remove(topicName);
      if (numSubscribersRemaining <= 0) {
         if (topicName.equals(largestTopic.getName())) {
            OdeGeoRegion newLargestRegion = null;
            String newLargestTopicName = null;
            for (Entry<String, OdeGeoRegion> serviceRegionEntry : serviceRegions.entrySet()) {
               OdeGeoRegion serviceRegion = serviceRegionEntry.getValue();
               if (newLargestRegion == null) {
                  newLargestRegion = serviceRegion;
               } else {
                  if (GeoUtils.isRegionWithinRegion(newLargestRegion, serviceRegion)) {
                     newLargestRegion = serviceRegion;
                     newLargestTopicName = serviceRegionEntry.getKey();
                  }
               }
            }
            largestServiceRegion = newLargestRegion;
            largestTopic = otms.getTopic(newLargestTopicName);
         }
         if (!isPassThrough(odeRequest.getDataType()) &&
               appContext.getParam(AppContext.SPARK_MASTER).startsWith("local")) {
            LocalSparkProcessor.stopStreamingContext();
         }
      }
      
      logger.info("Removed subscriber to {}. {} subscribers remain.", topicName, numSubscribersRemaining);
      return numSubscribersRemaining;
   }

   private static boolean encompassingRegion(OdeRequest odeRequest) {
      if (odeRequest.getRequestType() ==  OdeRequestType.Subscription) {
         OdeGeoRegion requestedRegion = new OdeGeoRegion(
               new OdePosition3D(odeRequest.getNwLat(), odeRequest.getNwLon(), BigDecimal.ZERO),
               new OdePosition3D(odeRequest.getSeLat(), odeRequest.getSeLon(), BigDecimal.ZERO));
         if (largestServiceRegion != null && 
             GeoUtils.isRegionWithinRegion(requestedRegion, largestServiceRegion)) {
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public static OdeGeoRegion getLargestServiceRegion() {
      return largestServiceRegion;
   }

   public static MQTopic getLargestTopic() {
      return largestTopic;
   }

   public static boolean haveActiveStream(OdeRequest odeRequest) {
      return encompassingRegion(odeRequest) && largestTopic != null &&
            otms.numSubscribers(largestTopic.getName()) > 0;
   }

}
