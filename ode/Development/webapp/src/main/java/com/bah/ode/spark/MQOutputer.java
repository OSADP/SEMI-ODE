package com.bah.ode.spark;

import java.util.Iterator;

import org.apache.spark.api.java.function.VoidFunction;

import scala.Tuple2;

import com.bah.ode.wrapper.MQProducer;
import com.bah.ode.wrapper.MQProducerFactory;
import com.bah.ode.wrapper.MQProducerPool;
import com.bah.ode.wrapper.MQTopic;

public class MQOutputer implements VoidFunction<Iterator<Tuple2<String, String>>> {
   private static final long serialVersionUID = -2352763652266510903L;

   private String mqBrokers;
   private MQTopic topic;
   
   private static MQProducerPool producerPool;
   
   public MQOutputer(String mqBrokers, MQTopic outboundTopic) {
      super();
      this.mqBrokers = mqBrokers;
      this.topic = outboundTopic;
      if (null != producerPool) {
         producerPool = new MQProducerPool(new MQProducerFactory(this.mqBrokers));
      }
   }

   @Override
   public void call(Iterator<Tuple2<String, String>> partitionOfRecords)
         throws Exception {
      MQProducer<String, String> producer = producerPool.borrowObject();
      while (partitionOfRecords.hasNext()) {
         Tuple2<String, String> record = partitionOfRecords.next();
         producer.send(topic.getName(), record._1(), record._2());
      }
      producerPool.returnObject(producer);
   }

}
