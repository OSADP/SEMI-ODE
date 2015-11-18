package com.bah.ode.server;

import java.util.concurrent.Future;

import javax.websocket.Session;

import kafka.serializer.StringDecoder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.context.AppContext;
import com.bah.ode.model.OdeDataMessage;
import com.bah.ode.model.OdeMetadata;
import com.bah.ode.util.WebSocketUtils;
import com.bah.ode.wrapper.DataProcessor;
import com.bah.ode.wrapper.MQConsumerGroup;
import com.bah.ode.wrapper.MQTopic;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class OdeDataDistributor implements Runnable {

   private static Logger logger = LoggerFactory
         .getLogger(OdeDataDistributor.class);
   private static AppContext appContext = AppContext.getInstance();

   private Session clientSession;
   private OdeMetadata metadata;
   private String groupId;
   private MQConsumerGroup<String, String, String> consumerGroup;

   public OdeDataDistributor(final Session clientSession, OdeMetadata metadata) {
      super();
      this.clientSession = clientSession;
      this.metadata = metadata;
      this.groupId = clientSession.getId();

      if (!AppContext.loopbackTest()) {
         this.consumerGroup = new MQConsumerGroup<String, String, String>(
               appContext.getParam(AppContext.ZK_CONNECTION_STRINGS),
               this.groupId,
               this.metadata,
               new StringDecoder(null),
               new StringDecoder(null),
               new DataProcessor<String, String>() {

                  @Override
                  public Future<String> process(String data)
                        throws DataProcessorException {
                     try {
                        ObjectNode dm = OdeDataMessage.jsonStringToObjectNode(data);
                        WebSocketUtils.send(clientSession, dm.toString());
                     } catch (Exception e) {
                        throw new DataProcessorException(
                              "Error processing data.", e);
                     }
                     return null;
                  }
               });
      }
   }

   public Session getClientSession() {
      return clientSession;
   }

   public OdeDataDistributor setClientSession(Session clientSession) {
      this.clientSession = clientSession;
      return this;
   }

   public OdeMetadata getMetadata() {
      return metadata;
   }

   public OdeDataDistributor setMetadata(OdeMetadata metadata) {
      this.metadata = metadata;
      if (!AppContext.loopbackTest())
         consumerGroup.setMetadata(this.metadata);
      return this;
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
