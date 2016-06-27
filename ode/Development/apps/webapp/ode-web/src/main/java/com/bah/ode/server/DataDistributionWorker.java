package com.bah.ode.server;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimerTask;
import java.util.TreeMap;

import javax.websocket.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.context.AppContext;
import com.bah.ode.distributors.BaseDataPropagator;
import com.bah.ode.exception.OdeException;
import com.bah.ode.metrics.OdeMetrics;
import com.bah.ode.metrics.OdeMetrics.Context;
import com.bah.ode.metrics.OdeMetrics.Timer;
import com.bah.ode.model.OdeDataMessage;
import com.bah.ode.model.OdeMetadata;
import com.bah.ode.model.OdeRequest;
import com.bah.ode.wrapper.MQConsumerGroup;
import com.bah.ode.wrapper.MQTopic;

import kafka.serializer.StringDecoder;

public class DataDistributionWorker {

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
   private TimerTask timerTask;

   private Timer timer;

   public DataDistributionWorker(
         final Session clientSession, 
         BaseDataPropagator propagator) {
      super();
      this.clientSession = clientSession;
      this.groupId = clientSession.getId();
      this.propagator = propagator;

      this.timer = OdeMetrics.getInstance()
            .timer(this.getClass().getSimpleName(), "timer");
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

   public void shutDown() {
      if (consumerGroup != null) {
         logger.info("Shutting down consumerGroup {}", 
               consumerGroup.getTopic().getName());
         consumerGroup.shutDown();
         consumerGroup = null;
      }
      if (timerTask != null) {
         timerTask.cancel();
         timerTask = null;
      }
      
      if (propagator.getMetadata() != null) {
         OdeRequest request = propagator.getMetadata().getOdeRequest();
         OdeRequestManager.removeSubscriber(request.getId(), request.getDataType());
      }
   }

   public void startIfNotAlive(OdeMetadata metadata) {
      try {
         propagator.setMetadata(metadata);
         if (!AppContext.loopbackTest() && this.consumerGroup == null) {
            this.consumerGroup = new MQConsumerGroup<String, String, String>(
                  appContext.getParam(AppContext.ZK_CONNECTION_STRINGS),
                  this.groupId,
                  metadata.getOutputTopic(),
                  new StringDecoder(null),
                  new StringDecoder(null),
                  propagator);
         }
         
         if (timerTask == null) {
            logger.info("Starting distribution thread for {}...", 
                  metadata.getOutputTopic().getName());
            /**
             * Sends all received and ordered records every second as a batch Records
             * sent as map of serialId.bundleId
             */
            this.timerTask = new java.util.TimerTask() {
               @Override
               public void run() {
                  synchronized (propagator) {
                     TreeMap<Integer, ArrayList<OdeDataMessage>> records = propagator.records();
                     /*
                      * Sends the batch every second without waiting for the next bundle
                      * if it hasn't arrived yet.
                      */
                     if (records.size() != 0) {
                        Context context = timer.time();
                        try {
                           TreeMap<Integer, ArrayList<OdeDataMessage>> sendMap = 
                                 new TreeMap<Integer, ArrayList<OdeDataMessage>>(records);
                           records.clear();
                           Iterator<Integer> iter = sendMap.navigableKeySet().iterator();
                           while (iter.hasNext()) {
                              int key = iter.next();
                              ArrayList<OdeDataMessage> vList = sendMap.get(key);
                              for (int i = 0; i < vList.size(); i++) {
                                 OdeDataMessage msg = vList.get(i);
                                 if (msg != null) {
                                    propagator.filterAndSend(msg);
                                 }
                              }
                           }
                        } catch (Exception e) {
                           logger.error("Error Consuming message", e);
                        }
                        context.stop();
                     }
                  }
               }
            };

            new java.util.Timer().schedule(timerTask, 
                  appContext.getInt(AppContext.DATA_SEQUENCE_REORDER_DELAY, 
                        AppContext.DEFAULT_DATA_SEQUENCE_REORDER_DELAY), 
                  appContext.getInt(AppContext.DATA_SEQUENCE_REORDER_PERIOD, 
                        AppContext.DEFAULT_DATA_SEQUENCE_REORDER_PERIOD));


            if (!AppContext.loopbackTest()) {
               MQTopic outputTopic = propagator.getMetadata().getOutputTopic();
               if (outputTopic != null) {
                  logger.info(
                        "Starting {} consumer threads in group {} for topic {} ...",
                        outputTopic.getPartitions(), groupId, outputTopic.getName());
               }
               consumerGroup.consume();
            }
         }
      } catch (Exception e) {
         logger.error("Error starting worker thread", e);
      }
      
   }

}
