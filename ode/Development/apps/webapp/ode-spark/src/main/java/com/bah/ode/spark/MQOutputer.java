package com.bah.ode.spark;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Iterator;

import org.apache.spark.api.java.function.VoidFunction;
import org.apache.spark.broadcast.Broadcast;

import scala.Tuple2;

import com.bah.ode.util.JsonUtils;
import com.bah.ode.wrapper.MQProducer;
import com.bah.ode.wrapper.MQSerialazableProducerPool;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MQOutputer implements VoidFunction<Iterator<Tuple2<String, String>>> {
   private static final long serialVersionUID = -2352763652266510903L;
 
   private Broadcast<MQSerialazableProducerPool> producerPool;
   private BigDecimal minSpeed;
   private BigDecimal maxSpeed;
   private BigDecimal avgSpeed;
   
   public MQOutputer(Broadcast<MQSerialazableProducerPool> producerPool,
         BigDecimal minSpeed, BigDecimal maxSpeed, BigDecimal avgSpeed) {
      super();
      this.producerPool = producerPool;
      this.minSpeed = minSpeed;
      this.maxSpeed = maxSpeed;
      this.avgSpeed = avgSpeed;
   }

   @Override
   public void call(Iterator<Tuple2<String, String>> partitionOfRecords)
         throws Exception {
      MQProducer<String, String> producer = producerPool.value().checkOut();
     
      while (partitionOfRecords.hasNext()) {
         Tuple2<String, String> record = partitionOfRecords.next();
         ObjectNode payload = addSpeedAggregates(record._1());
         ObjectNode metadata = JsonUtils.toObjectNode(record._2());
         
         producer.send(metadata.get("outputTopic").get("name").textValue(),
               payload.get("serialId").textValue(), payload.toString());
         
//         OdeMsgAndMetadata msgAndMetadata = 
//               (OdeMsgAndMetadata) JsonUtils.fromJson(
//               record._2(), OdeMsgAndMetadata.class);
//         
//         producer.send(msgAndMetadata.getMetadata().getOutputTopic().getName(),
//               record._1(), record._2());

      }
      
      producerPool.value().checkIn(producer);
   }

   public ObjectNode addSpeedAggregates(String sTree) 
         throws JsonProcessingException, IOException {
      ObjectNode tree = JsonUtils.toObjectNode(sTree);
      JsonUtils.addNode(tree, "minSpeed", minSpeed);
      JsonUtils.addNode(tree, "maxSpeed", maxSpeed);
      JsonUtils.addNode(tree, "avgSpeed", avgSpeed);
      return tree;
   }

}
