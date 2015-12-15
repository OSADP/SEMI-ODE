package com.bah.ode.server;

import javax.websocket.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.context.AppContext;
import com.bah.ode.distributors.BaseDataDistributor;
import com.bah.ode.exception.OdeException;
import com.bah.ode.model.OdeDataType;
import com.bah.ode.model.OdeMetadata;
import com.bah.ode.wrapper.MQConsumerGroup;
import com.bah.ode.wrapper.MQTopic;

import kafka.serializer.StringDecoder;

public class DataDistributionWorker implements Runnable {

   public class DataDistributorException extends OdeException {

      private static final long serialVersionUID = -3940799140295648554L;

      public DataDistributorException(String string, Exception e) {
         super(string, e);
      }

   }

   private static Logger logger = LoggerFactory
         .getLogger(DataDistributionWorker.class);
   private static AppContext appContext = AppContext.getInstance();

   private Session clientSession;
   private OdeMetadata metadata;
   private String groupId;
   private MQConsumerGroup<String, String, String> consumerGroup;
   private BaseDataDistributor distributor;

   public DataDistributionWorker(
         final Session clientSession, 
         OdeMetadata metadata,
         BaseDataDistributor processor) {
      super();
      this.clientSession = clientSession;
      this.metadata = metadata;
      this.groupId = clientSession.getId();
      this.distributor = processor;
      //ODE-169 - Aggregate Query Data Results also contain Vehicle Data Records
      MQTopic consumerTopic = null;
      if (this.metadata.getOdeRequest().getDataType() == OdeDataType.AggregateData) {
         consumerTopic = MQTopic.create(
               AppContext.getInstance().getParam(
                     AppContext.DATA_PROCESSOR_AGGREGATES_TOPIC), 
                     MQTopic.defaultPartitions());
      }
      else {
         consumerTopic = this.metadata.getOutputTopic();
      }

      if (!AppContext.loopbackTest()) {
         this.consumerGroup = new MQConsumerGroup<String, String, String>(
               appContext.getParam(AppContext.ZK_CONNECTION_STRINGS),
               this.groupId,
               consumerTopic,
               new StringDecoder(null),
               new StringDecoder(null),
               processor);
      }
   }

   public Session getClientSession() {
      return clientSession;
   }

   public DataDistributionWorker setClientSession(Session clientSession) {
      this.clientSession = clientSession;
      return this;
   }

   public OdeMetadata getMetadata() {
      return metadata;
   }

   public DataDistributionWorker setMetadata(OdeMetadata metadata) {
      this.metadata = metadata;
      return this;
   }

   public BaseDataDistributor getDistributor() {
      return distributor;
   }

   public void setDistributor(BaseDataDistributor distributor) {
      this.distributor = distributor;
   }

   @Override
   public void run() {
      try {
         MQTopic outputTopic = metadata.getOutputTopic();
         if (outputTopic != null) {
            logger.info(
                  "Starting {} consumer threads in group {} for topic {} ...",
                  outputTopic.getPartitions(), groupId, outputTopic.getName());
         }
         if (!AppContext.loopbackTest())
            consumerGroup.consume();
      } catch (Exception e) {
         logger.error("Error processing response.", e);
      }
   }

   public void shutDown() {
      if (consumerGroup != null)
         consumerGroup.shutDown();
   }

}