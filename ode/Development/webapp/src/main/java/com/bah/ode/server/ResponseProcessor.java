package com.bah.ode.server;

import javax.websocket.Session;

import kafka.serializer.StringDecoder;

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
   private MQConsumerGroup<String, String, String> consumerGroup;
   
   
   
   public ResponseProcessor(Session clientSession, MQTopic outboundTopic) {
      super();
      this.clientSession = clientSession;
      this.outboundTopic = outboundTopic;
      this.groupId = clientSession.getId(); 
      
      this.consumerGroup = new MQConsumerGroup<String, String, String> (
            appContext.getParam(AppContext.ZK_CONNECTION_STRINGS),
            this.groupId,
            this.outboundTopic,
            new StringDecoder(null),
            new StringDecoder(null));
   }

   public void start() {
      logger.info("Starting {} consumer threads in group {} for topic {} ...", 
            outboundTopic.getPartitions(), groupId, outboundTopic.getName());
      
      consumerGroup.consume();
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
