package com.bah.ode.spark;

import java.util.Iterator;

import org.apache.spark.api.java.function.VoidFunction;
import org.apache.spark.broadcast.Broadcast;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import scala.Tuple2;

import com.bah.ode.wrapper.MQProducer;
import com.bah.ode.wrapper.MQSerialazableProducerPool;
import com.bah.ode.wrapper.MQTopic;

public class MQOutputer implements VoidFunction<Iterator<Tuple2<String, String>>> {
   private static final long serialVersionUID = -2352763652266510903L;
   private static Logger logger = LoggerFactory.getLogger(MQOutputer.class);

   private MQTopic[] outTopics;
   private Broadcast<MQSerialazableProducerPool> producerPool;
   
   public MQOutputer(Broadcast<MQSerialazableProducerPool> producerPool, MQTopic[] outTopics) {
      super();
      this.outTopics = outTopics;
      this.producerPool = producerPool;
   }

   @Override
   public void call(Iterator<Tuple2<String, String>> partitionOfRecords)
         throws Exception {
      MQProducer<String, String> producer = producerPool.getValue().checkOut();
      while (partitionOfRecords.hasNext()) {
         Tuple2<String, String> record = partitionOfRecords.next();
         for (MQTopic topic: outTopics) {
            logger.trace("{}:{}", record._1(), record._2());
            producer.send(topic.getName(), record._1(), record._2());
         }
      }
      producerPool.getValue().checkIn(producer);
   }

}
