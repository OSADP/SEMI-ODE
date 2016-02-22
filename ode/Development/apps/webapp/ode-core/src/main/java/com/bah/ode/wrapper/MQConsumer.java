package com.bah.ode.wrapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.concurrent.Callable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.context.AppContext;
import com.bah.ode.util.JsonUtils;
import com.bah.ode.wrapper.DataProcessor.DataProcessorException;
import com.fasterxml.jackson.core.JsonProcessingException;
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
   private TreeMap<String, String> storedMessages;
   private long prevBundleId;
   private long prevRecordId;
   

   public MQConsumer(KafkaStream<K, V> a_stream, int a_threadNumber,
         DataProcessor<V, R> a_processor, 
         long reOrderDelay, long reOrderPeriod) {
      this.m_threadNumber = a_threadNumber;
      this.m_stream = a_stream;
      this.processor = a_processor;
      this.records = new TreeMap<Integer, ArrayList<V>>();
      this.reOrderDelay = reOrderDelay;
      this.reOrderPeriod = reOrderPeriod;
      
   }

   @Override
   public Object call() throws Exception {
      ConsumerIterator<K, V> it = m_stream.iterator();

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
            }
         }
      }, reOrderDelay, reOrderPeriod);

      while (it.hasNext()) {
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
      } // End of while loop

      logger.info("Shutting down Thread: " + m_threadNumber);
      return null;
   }
   
   /**
    *          § If prev is null or current is prev+1
            □ Send
            □ Set prev to current
            □ If not live data
               ® Remove msg from store
            □ If store has value
               ® Sendinorder (peek, false)
         § Else
            □ If store size LT maxStoreSize
               ® Store msg
            □ Else
               ® Set prev to null
               ® Sendinorder (peek, false)

    * @param msg
    * @return
    * @throws IOException 
    * @throws JsonProcessingException
    * @throws DataProcessorException 
    */
   private String sendInOrder(V msg, boolean isStored) throws JsonProcessingException, IOException, DataProcessorException {
      String storedMsg = null;
      
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
                  long bundleId = Integer.parseInt(splitId[1]);
                  long recordId = Integer.parseInt(splitId[2]);
                  
                  if (isNext(bundleId, recordId)) {
                     processor.process(msg);
                     prevBundleId = bundleId;
                     prevRecordId = recordId;
                     
                  }

               } catch (Exception e) {
                  logger.info("ERROR IN CODE. Sending message as is : ", e);
                  processor.process(msg);
               }

            } // End of serial ID is not blank
         } // End of 'has serialId' block
      } // End of 'has payload' block

      return storedMsg;
   }

   private boolean isNext(long bundleId, long recordId) {
      // TODO Auto-generated method stub
      return false;
   }

}
