package com.bah.ode.spark;

import java.util.Iterator;

import org.apache.spark.api.java.function.VoidFunction;
import org.apache.spark.broadcast.Broadcast;

import scala.Tuple2;

import com.bah.ode.model.OdeMsgAndMetadata;
import com.bah.ode.util.JsonUtils;
import com.bah.ode.wrapper.MQProducer;
import com.bah.ode.wrapper.MQSerialazableProducerPool;

public class MQOutputer implements VoidFunction<Iterator<Tuple2<String, String>>> {
   private static final long serialVersionUID = -2352763652266510903L;

   private Broadcast<MQSerialazableProducerPool> producerPool;
   
   public MQOutputer(Broadcast<MQSerialazableProducerPool> producerPool) {
      super();
      this.producerPool = producerPool;
   }

   @Override
   public void call(Iterator<Tuple2<String, String>> partitionOfRecords)
         throws Exception {
      MQProducer<String, String> producer = producerPool.value().checkOut();
      while (partitionOfRecords.hasNext()) {
         Tuple2<String, String> record = partitionOfRecords.next();
         OdeMsgAndMetadata msgAndMetadata = 
               (OdeMsgAndMetadata) JsonUtils.fromJson(
               record._2(), OdeMsgAndMetadata.class);
         
         producer.send(msgAndMetadata.getMetadata().getOutputTopic().getName(),
               record._1(), record._2());
      }
      producerPool.value().checkIn(producer);
   }

}
