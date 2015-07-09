package com.bah.ode.spark;

import java.util.Iterator;

import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.VoidFunction;
import org.apache.spark.broadcast.Broadcast;

import scala.Tuple2;

import com.bah.ode.wrapper.MQSerialazableProducerPool;
import com.bah.ode.wrapper.MQTopic;

public class RddProcessor implements Function<JavaPairRDD<String, String>, Void> {
   private static final long serialVersionUID = 4946021213014494671L;

   private Broadcast<MQSerialazableProducerPool> producerPool;
   private MQTopic[] outputTopics;
   
   public RddProcessor(Broadcast<MQSerialazableProducerPool> producerPool, 
         MQTopic[] outputTopics) {
      super();
      this.producerPool = producerPool;
      this.outputTopics = outputTopics;
   }

   @Override
   public Void call(JavaPairRDD<String, String> rdd) throws Exception {
      VoidFunction<Iterator<Tuple2<String, String>>> partitionOutputer = 
            new MQOutputer(producerPool, outputTopics);

      rdd.foreachPartition(partitionOutputer);
      return null;
   }
}
