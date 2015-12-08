package com.bah.ode.spark;

import java.util.Iterator;

import org.apache.spark.api.java.function.VoidFunction;
import org.apache.spark.broadcast.Broadcast;

import scala.Tuple2;

import com.bah.ode.util.JsonUtils;
import com.bah.ode.wrapper.MQProducer;
import com.bah.ode.wrapper.MQSerialazableProducerPool;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class PartitionDistributor extends BaseDistributor implements
      VoidFunction<Iterator<Tuple2<String, Tuple2<String, String>>>> {

   private static final long serialVersionUID = -5994663995916421920L;

   public PartitionDistributor(Broadcast<MQSerialazableProducerPool> producerPool) {
      super(producerPool);
   }

   @Override
   public void call(Iterator<Tuple2<String, Tuple2<String, String>>> partitionOfRecords)
         throws Exception {
      MQProducer<String, String> producer = producerPool.value().checkOut();
      
      while (partitionOfRecords.hasNext()) {
         Tuple2<String, Tuple2<String, String>> record = partitionOfRecords.next();
         if(record != null){ /* result of ODE-38 records that are removed are now null */
	         String key = record._1();
	         String payload = record._2()._1();
	         ObjectNode metadata = JsonUtils.toObjectNode(record._2()._2());
	         
	         producer.send(metadata.get("outputTopic").get("name").textValue(),
	               key, payload);
         }
         
      }
      
      producerPool.value().checkIn(producer);
   }

}
