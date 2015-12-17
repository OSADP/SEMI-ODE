package com.bah.ode.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.context.AppContext;
import com.bah.ode.model.OdeDataType;
import com.bah.ode.model.OdePolyline;
import com.bah.ode.model.OdeQryRequest;
import com.bah.ode.model.OdeRequest;
import com.bah.ode.model.OdeRequestType;
import com.bah.ode.model.OdeStatus;
import com.bah.ode.model.OdeSubRequest;
import com.bah.ode.model.OdeTstRequest;
import com.bah.ode.server.WebSocketServer.WebSocketServerException;
import com.bah.ode.util.JsonUtils;
import com.bah.ode.wrapper.MQTopic;

public class OdeRequestManager {
   private static Logger logger = 
         LoggerFactory.getLogger(OdeRequestManager.class);
   
   private static AppContext appContext = AppContext.getInstance();

   private static OutboundTopicManagerSingleton otms = 
         OutboundTopicManagerSingleton.getInstance();
   
   private static String buildRequestId(OdeRequest odeRequest) {
      String baseName = otms.buildTopicName(odeRequest);
      return odeRequest.getRequestType().getShortName() +
            odeRequest.getDataType().getShortName() + baseName;
   }

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
      odeRequest.setRequestType(OdeRequestType.getByShortName(rtype));

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
      
      odeRequest.setId(buildRequestId(odeRequest));
      return odeRequest;
   }

   public static MQTopic getTopic(String RequestId) {
      return otms.getTopic(RequestId);
   }
   
   public static MQTopic getOrCreateTopic(String RequestId) {
      return otms.getOrCreateTopic(RequestId);
   }

   public static int addSubscriber(String RequestId, OdeDataType dataType) {
      return (otms.addSubscriber(RequestId));
   }

   public static void removeSubscriber(String RequestId, OdeDataType dataType) {
      int numSubscribersRemaining = otms.removeSubscriber(RequestId);
      if (numSubscribersRemaining <= 0 && !isPassThrough(dataType) &&
            appContext.getParam(AppContext.SPARK_MASTER).startsWith("local")) {
         LocalSparkProcessor.stopStreamingContext();
      }
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

}
