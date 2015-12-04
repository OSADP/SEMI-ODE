package com.bah.ode.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.model.OdeMetadata;
import com.bah.ode.wrapper.BaseDataDistributor;

public abstract class DataRequestManager {
   private static Logger logger = 
         LoggerFactory.getLogger(DataRequestManager.class);

   protected BaseTopicManager topicManager;
   protected OdeMetadata metadata;
   
   // FOR LOOPBACK TEST ONLY
   private BaseDataDistributor distributor;
   
   public BaseDataDistributor getDistributor() {
      return distributor;
   }
   public void setDistributor(BaseDataDistributor distributor) {
      this.distributor = distributor;
   }
   // FOR LOOPBACK TEST ONLY


   public DataRequestManager(OdeMetadata metadata,
         BaseTopicManager itms, BaseTopicManager otms) {
      if (OdeRequestManager.isPassThrough(metadata.getOdeRequest().getDataType()))
         this.topicManager = otms;
      else
         this.topicManager = itms;
      this.metadata = metadata;
      this.metadata.setInputTopic(topicManager.getOrCreateTopic(
            metadata.getInputTopic().getName()));
   }


   public int addSubscriber() {
      logger.info("Adding subscriber to {}", metadata.getInputTopic().getName());
      return topicManager.addSubscriber(metadata.getInputTopic().getName());
   }

   public int removeSubscriber() throws DataRequestManagerException {
      logger.info("Removing subscriber to {}", metadata.getInputTopic().getName());
      int requestersRmaining = 
            topicManager.removeSubscriber(metadata.getInputTopic().getName());
      return requestersRmaining;
   }

   
   public OdeMetadata getMetadata() {
      return metadata;
   }


   public static class DataRequestManagerException extends Exception {
      private static final long serialVersionUID = 1L;

      public DataRequestManagerException(String message, Exception e) {
         super(message, e);
      }

      public DataRequestManagerException(String message) {
         super(message);
      }
      
   }
}
