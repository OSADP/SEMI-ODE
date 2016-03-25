package com.bah.ode.wrapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.concurrent.Callable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.context.AppContext;
import com.bah.ode.metrics.LongGauge;
import com.bah.ode.metrics.OdeMetrics;
import com.bah.ode.metrics.OdeMetrics.Context;
import com.bah.ode.metrics.OdeMetrics.Meter;
import com.bah.ode.metrics.OdeMetrics.Timer;
import com.bah.ode.util.JsonUtils;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import kafka.consumer.ConsumerIterator;
import kafka.consumer.KafkaStream;

public class MQConsumer<K, V, R> implements Callable<Object> {

   private static Logger logger = LoggerFactory.getLogger(MQConsumer.class);

   private KafkaStream<K, V> m_stream;
   private int m_threadNumber;
   private DataProcessor<V, R> processor;
   private TreeMap<Integer, ArrayList<V>> records;
   private long reOrderDelay;
   private long reOrderPeriod;
   
   protected Meter meter;
   protected Timer callTimer;
   protected Timer runTimer;
   protected static final LongGauge sizeGauge = new LongGauge();
   
   static {
      OdeMetrics.getInstance().registerGauge(sizeGauge, 
            MQConsumer.class.getSimpleName(), "sizeGauge");
   }

   public MQConsumer(KafkaStream<K, V> a_stream, int a_threadNumber,
         DataProcessor<V, R> a_processor, 
         long reOrderDelay, long reOrderPeriod) {
      this.m_threadNumber = a_threadNumber;
      this.m_stream = a_stream;
      this.processor = a_processor;
      this.records = new TreeMap<Integer, ArrayList<V>>();
      this.reOrderDelay = reOrderDelay;
      this.reOrderPeriod = reOrderPeriod;
      
      this.meter = OdeMetrics.getInstance().meter(
            MQConsumer.class.getSimpleName(), 
            processor.getClass().getSimpleName(), "meter");
      
      this.callTimer = OdeMetrics.getInstance().timer(
            MQConsumer.class.getSimpleName(), 
            processor.getClass().getSimpleName(), "callTimer");

      this.runTimer = OdeMetrics.getInstance().timer(
            MQConsumer.class.getSimpleName(), 
            processor.getClass().getSimpleName(), "runTimer");
   }

   @Override
   public Object call() throws Exception {
      ConsumerIterator<K, V> it = m_stream.iterator();
      Context context = callTimer.time();
      
      /**
       * Sends all received and ordered records every second as a batch Records
       * sent as map of serialId.bundleId
       */

      new java.util.Timer().schedule(new java.util.TimerTask() {
         @Override
         public void run() {
            /*
             * Sends the batch every second without waiting for the next bundle
             * if it hasn't arrived yet.
             */
            if (records.size() != 0) {
               Context runContext = runTimer.time();
               try {
                  TreeMap<Integer, ArrayList<V>> sendMap = new TreeMap<Integer, ArrayList<V>>(
                        records);
                  records.clear();
                  Iterator<Integer> iter = sendMap.navigableKeySet().iterator();
                  while (iter.hasNext()) {
                     int key = iter.next();
                     ArrayList<V> vList = sendMap.get(key);
                     for (int i = 0; i < vList.size(); i++) {
                        V msg = vList.get(i);
                        if (msg != null) {
                           processor.process(msg);
                        }
                     }
                  }
               } catch (Exception e) {
                  logger.error("Error Consuming message", e);
               }
               runContext.stop();
            }
         }
      }, reOrderDelay, reOrderPeriod);

      long numMsgs = 0;
      while (it.hasNext()) {
         numMsgs++;
         V msg = it.next().message();
         ObjectNode bundleObject = JsonUtils.toObjectNode(msg.toString());

         JsonNode payloadNode = bundleObject.get(AppContext.PAYLOAD_STRING);
         if (payloadNode == null) {
            processor.process(msg);
         } else {
            JsonNode serialIdNode = payloadNode
                  .get(AppContext.SERIAL_ID_STRING);
            if (serialIdNode == null) {
               processor.process(msg);
            } else {
               String tempSerialId = serialIdNode.asText();
               if (tempSerialId == null || tempSerialId.equals("")) {
                  processor.process(msg);
               } else {
                  try {
                     String[] splitId = tempSerialId.split(
                           "[^\\w-]+"); /* Non-alphanumerics and hyphen */
                     int bundleId = Integer.parseInt(splitId[1]);
                     int recordId = Integer.parseInt(splitId[2]);

                     /*
                      * vList is an array with the recordId as the index that
                      * way there is no need to loop twice through arrays
                      *
                      * uses map as to not lose records if multiple record Ids
                      * come in scrambled
                      */
                     ArrayList<V> vList = records.get(bundleId);
                     if (vList == null) {
                        vList = new ArrayList<V>();
                        while (recordId + 1 > vList.size()) {
                           vList.add(vList.size(), null);
                        }
                        vList.set(recordId, msg);
                        records.put(bundleId, vList);
                     } else {
                        while (recordId + 1 > vList.size()) {
                           vList.add(vList.size(), null);
                        }
                        records.get(bundleId).set(recordId, msg);
                     }
                  } catch (Exception e) {
                     logger.info("ERROR IN CODE. Sending message as is : ", e);
                     processor.process(msg);
                  }

               } // End of serial ID is not blank
            } // End of 'has serialId' block
         } // End of 'has payload' block
         meter.mark();
      } // End of while loop

      sizeGauge.setValue(numMsgs);

      logger.info("Shutting down Thread: " + m_threadNumber);
      
      context.stop();
      return null;
   }
}
