package com.bah.ode.spark;

import java.util.Iterator;

import org.apache.spark.Accumulator;
import org.apache.spark.api.java.function.VoidFunction;
import org.apache.spark.broadcast.Broadcast;

import com.bah.ode.context.AppContext;
import com.bah.ode.model.InternalDataMessage;
import com.bah.ode.model.OdeData;
import com.bah.ode.model.OdeDataType;
import com.bah.ode.model.OdeMetadata;
import com.bah.ode.util.JsonUtils;
import com.bah.ode.wrapper.MQProducer;
import com.bah.ode.wrapper.MQSerialazableProducerPool;

import scala.Tuple2;

public class PartitionDistributor extends BaseDistributor implements
      VoidFunction<Iterator<Tuple2<String, Tuple2<String, String>>>> {

   private static final long serialVersionUID = -5994663995916421920L;
   private String aggregatorInputTopic;
   private Accumulator<Integer> producerAccumulator;

   public PartitionDistributor(
         Accumulator<Integer> accumulator, 
         Accumulator<Integer> producerAccumulator, 
         Broadcast<MQSerialazableProducerPool> producerPool,
         String aggregatorInputTopic) {
      super(accumulator, producerPool);
      this.aggregatorInputTopic = aggregatorInputTopic;
      this.producerAccumulator = producerAccumulator;
   }

   @Override
   public void call(
         Iterator<Tuple2<String, Tuple2<String, String>>> partitionOfRecords)
               throws Exception {
      startTimer();
      
      MQProducer<String, String> producer = producerPool.value().checkOut();

      try {
         while (partitionOfRecords.hasNext()) {
            Tuple2<String, Tuple2<String, String>> record = partitionOfRecords
                  .next();
            String key = record._1();
            OdeMetadata metadata = (OdeMetadata) JsonUtils.fromJson(record._2()._2(), 
                  OdeMetadata.class);
            if (metadata != null) {
               String dataType = JsonUtils
                     .getJsonNode(record._2()._1(), AppContext.DATA_TYPE_STRING)
                     .textValue();
               if (dataType != null) {
                  OdeData payload = (OdeData) JsonUtils.fromJson(
                        record._2()._1(),
                        OdeDataType.valueOf(dataType).getClazz());
                  InternalDataMessage idm = new InternalDataMessage(key,
                        payload, metadata);
                  if (key.startsWith(AppContext.SANITIZED_STRING)) {
                     if (metadata.getOutputTopic() != null) {
                        String sanitizationTopic = "Sanitized-" + metadata.getOutputTopic().getName();
                        send(producer, sanitizationTopic, key, record._2()._1());
                     }
                  } else {
                     send(producer, metadata.getOutputTopic().getName(), key,
                           idm.toJson());
                  }
                  
                  if (aggregatorInputTopic != null) {
                        send(producer, aggregatorInputTopic, key, idm.toJson());
                  }
               }
                  
            }
         }
      } finally {
         producerPool.value().checkIn(producer);
         stopTimer();
      }
   }

   private void send(
         MQProducer<String, String> producer, 
         String topic, String key, String value) {
      producerAccumulator.add(1);
      producer.send(topic, key, value);
   }

}
