package com.bah.ode.server;

import javax.websocket.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.context.AppContext;
import com.bah.ode.distributors.BaseDataPropagator;
import com.bah.ode.exception.OdeException;
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
   private String groupId;
   private MQConsumerGroup<String, String, String> consumerGroup;
   private BaseDataPropagator propagator;
   private Thread thread;

   public DataDistributionWorker(
         final Session clientSession, 
         BaseDataPropagator propagator,
         MQTopic consumerTopic) {
      super();
      this.clientSession = clientSession;
      this.groupId = clientSession.getId();
      this.propagator = propagator;

      if (!AppContext.loopbackTest()) {
         this.consumerGroup = new MQConsumerGroup<String, String, String>(
               appContext.getParam(AppContext.ZK_CONNECTION_STRINGS),
               this.groupId,
               consumerTopic,
               new StringDecoder(null),
               new StringDecoder(null),
               propagator,
               appContext.getInt(AppContext.DATA_SEQUENCE_REORDER_DELAY, 
                     AppContext.DEFAULT_DATA_SEQUENCE_REORDER_DELAY),
               appContext.getInt(AppContext.DATA_SEQUENCE_REORDER_PERIOD, 
                     AppContext.DEFAULT_DATA_SEQUENCE_REORDER_PERIOD));
      }
   }

   public Session getClientSession() {
      return clientSession;
   }

   public DataDistributionWorker setClientSession(Session clientSession) {
      this.clientSession = clientSession;
      return this;
   }

   public BaseDataPropagator getPropagator() {
      return propagator;
   }

   public void setPropagator(BaseDataPropagator propagator) {
      this.propagator = propagator;
   }

   @Override
   public void run() {
      try {
         MQTopic outputTopic = propagator.getMetadata().getOutputTopic();
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
      if (consumerGroup != null) {
         logger.info("Shutting down consumerGroup {}", 
               consumerGroup.getTopic().getName());
         consumerGroup.shutDown();
      }
   }

   public void startIfNotAlive(OdeMetadata metadata) {
      propagator.setMetadata(metadata);
      if (thread == null) {
         logger.info("Starting distribution thread for {}...", 
               metadata.getOutputTopic().getName());
         thread = new Thread(this);
         thread.start();
      }
   }

}
