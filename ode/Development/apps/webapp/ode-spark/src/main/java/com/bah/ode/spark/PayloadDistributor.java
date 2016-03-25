package com.bah.ode.spark;

import java.util.Iterator;

import org.apache.spark.Accumulator;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.VoidFunction;
import org.apache.spark.broadcast.Broadcast;

import com.bah.ode.wrapper.MQSerialazableProducerPool;

import scala.Tuple2;

public class PayloadDistributor extends BaseDistributor 
   implements Function<JavaPairRDD<String, Tuple2<String, String>>, Void> {

   private static final long serialVersionUID = 7013169090076266460L;
   private String aggregatorInputTopic;
   private Accumulator<Integer> partitionAccumulator;
   private Accumulator<Integer> producerAccumulator;
   
   public PayloadDistributor(
         Accumulator<Integer> accumulator, 
         Accumulator<Integer> partitionAccumulator,
         Accumulator<Integer> producerAccumulator, 
         Broadcast<MQSerialazableProducerPool> producerPool,
         String aggregatorInputTopic) {
      super(accumulator, producerPool);
      this.aggregatorInputTopic = aggregatorInputTopic;
      this.partitionAccumulator = partitionAccumulator;
      this.producerAccumulator = producerAccumulator;
   }

   @Override
   public Void call(JavaPairRDD<String, Tuple2<String, String>> rdd)
         throws Exception {
      startTimer();

      VoidFunction<Iterator<Tuple2<String, Tuple2<String, String>>>> 
         partitionOutputer = new PartitionDistributor(
               partitionAccumulator, 
               producerAccumulator,
               producerPool, 
               aggregatorInputTopic);
      
      rdd.foreachPartition(partitionOutputer);
      stopTimer();
      return null;
   }

}
