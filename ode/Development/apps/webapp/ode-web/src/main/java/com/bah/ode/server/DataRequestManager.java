package com.bah.ode.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.distributors.BaseDataPropagator;
import com.bah.ode.model.OdeDataType;

public abstract class DataRequestManager {
   private static Logger logger = 
         LoggerFactory.getLogger(DataRequestManager.class);

   protected BaseTopicManager topicManager;
   protected String topicName;
   
   // FOR LOOPBACK TEST ONLY
   private BaseDataPropagator loopbackTestPropagator;
   
   public BaseDataPropagator getLoopbackTestPropagator() {
      return loopbackTestPropagator;
   }
   public void setLoopbackTestPropagator(BaseDataPropagator distributor) {
      this.loopbackTestPropagator = distributor;
   }
   // FOR LOOPBACK TEST ONLY

   public DataRequestManager(String topicName, OdeDataType dataType,
         BaseTopicManager topicManager) {
      this.topicManager = topicManager;
      this.topicName = topicName;
   }


   public int addSubscriber() {
      logger.info("Adding subscriber to {}", topicName);
      int numSubscribers = topicManager.addSubscriber(topicName);
      logger.info("Number of subscribers to topic {}: {} ", 
            topicName, numSubscribers);
      return numSubscribers;
   }

   public int removeSubscriber() throws DataRequestManagerException {
      logger.info("Removing subscriber to {}", topicName);
      int requestersRmaining = 
            topicManager.removeSubscriber(topicName);
      logger.info("Subscribers remaining for topic {}: {}",
            topicName, requestersRmaining);
      return requestersRmaining;
   }

   
   public String getTopicName() {
      return topicName;
   }


   public void setTopicName(String topicName) {
      this.topicName = topicName;
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
