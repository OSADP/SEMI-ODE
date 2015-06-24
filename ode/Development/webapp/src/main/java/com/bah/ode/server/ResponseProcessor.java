package com.bah.ode.server;

import javax.websocket.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.context.AppContext;
import com.bah.ode.wrapper.MQConsumerGroup;
import com.bah.ode.wrapper.MQTopic;

public class ResponseProcessor {

   private static Logger logger = LoggerFactory.getLogger(ResponseProcessor.class);
   private static AppContext appContext = AppContext.getInstance(); 
   
   private Session clientSession;
   private MQTopic outboundTopic;
   private String groupId;
   private MQConsumerGroup consumerGroup;
   
   
   
   public ResponseProcessor(Session clientSession, MQTopic outboundTopic2) {
      super();
      this.clientSession = clientSession;
      this.outboundTopic = outboundTopic2;
      this.groupId = clientSession.getId(); 
      this.consumerGroup = new MQConsumerGroup(
            appContext.getParam(AppContext.ZK_CONNECTION_STRINGS),
            this.groupId,
            this.outboundTopic);
   }

   public void start() {
      logger.info("Starting {} consumer threads in group {} for topic {} ...", 
            outboundTopic.getPartitions(), groupId, outboundTopic.getName());
      
      consumerGroup.run();
   }

   public Session getClientSession() {
      return clientSession;
   }

   public ResponseProcessor setClientSession(Session clientSession) {
      this.clientSession = clientSession;
      return this;
   }

   public MQTopic getOutboundTopic() {
      return outboundTopic;
   }

   public ResponseProcessor setOutboundTopic(MQTopic ooutboundTopic) {
      this.outboundTopic = ooutboundTopic;
      return this;
   }

}
