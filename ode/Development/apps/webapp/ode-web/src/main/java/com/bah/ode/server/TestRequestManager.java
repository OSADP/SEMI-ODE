package com.bah.ode.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.model.OdeDataType;
import com.bah.ode.model.OdeMetadata;

public class TestRequestManager extends DataRequestManager {
   private static Logger logger = 
         LoggerFactory.getLogger(TestRequestManager.class);

   private static InboundTopicManagerSingleton itms = 
         InboundTopicManagerSingleton.getInstance();
   private static OutboundTopicManagerSingleton otms = 
         OutboundTopicManagerSingleton.getInstance();
   
   private BaseTopicManager topicManager;
   private OdeMetadata metadata;
   
   public TestRequestManager(OdeDataType dataType, OdeMetadata metadata) {
      super(dataType, metadata, itms, otms);
   }


   public int addSubscriber() {
      logger.info("Adding subscriber to {}", metadata.getInputTopic().getName());
      return topicManager.addSubscriber(metadata.getInputTopic().getName());
   }

}
