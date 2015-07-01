package com.bah.ode.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.api.ws.OdeStatus;
import com.bah.ode.model.OdeDataType;
import com.bah.ode.model.OdeQryRequest;
import com.bah.ode.model.OdeRequest;
import com.bah.ode.model.OdeRequestType;
import com.bah.ode.model.OdeSubRequest;
import com.bah.ode.server.WebSocketServer.WebSocketServerException;
import com.bah.ode.util.JsonUtils;
import com.bah.ode.wrapper.MQTopic;

public class OdeRequestManager {
   private static Logger logger = 
         LoggerFactory.getLogger(OdeRequestManager.class);
   
   private static OutboundTopicManagerSingleton otms = 
         OutboundTopicManagerSingleton.getInstance();
   
   private String topicName;
   private OdeRequest odeRequest;
   
   public OdeRequestManager(OdeRequest odeRequest) {
      super();
      this.odeRequest = odeRequest;
      this.topicName = buildTopicName(this.odeRequest);
   }

   private String buildTopicName(OdeRequest odeRequest) {
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

      if (OdeDataType.getByShortName(dtype) == null) {
         OdeStatus status = new OdeStatus()
            .setCode(OdeStatus.Code.INVALID_DATA_TYPE_ERROR)
            .setMessage(
                  String.format(
                        "Invalid data type %s. Valid data types are %s.",
                        dtype, OdeDataType.shortNames()));
         logger.error(status.toString());
         throw new WebSocketServerException(status.toString());
      }
      odeRequest.setDataType(OdeDataType.getByShortName(dtype));
      return odeRequest;
   }

   public MQTopic getTopic() {
      return otms.getTopic(topicName);
   }
   
   public MQTopic getOrCreateTopic() {
      return otms.getOrCreateTopic(topicName);
   }

   public void requesterConnected() {
      otms.addSubscriber(topicName);
   }

   public void requesterDisconnected() {
      otms.removeSubscriber(topicName);
   }


   public String getTopicName() {
      return topicName;
   }

   public OdeRequestManager setTopicName(String topicName) {
      this.topicName = topicName;
      return this;
   }

   public OdeRequest getOdeRequest() {
      return odeRequest;
   }

   public OdeRequestManager setOdeRequest(OdeRequest odeRequest) {
      this.odeRequest = odeRequest;
      return this;
   }

}
