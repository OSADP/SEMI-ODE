package com.bah.ode.spark;

import java.util.Iterator;

import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.VoidFunction;
import org.apache.spark.broadcast.Broadcast;

import com.bah.ode.wrapper.MQSerialazableProducerPool;

import scala.Tuple2;

public class PayloadDistributor extends BaseDistributor 
   implements Function<JavaPairRDD<String, Tuple2<String, String>>, Void> {

   private static final long serialVersionUID = 7013169090076266460L;
   
   public PayloadDistributor(Broadcast<MQSerialazableProducerPool> producerPool) {
      super(producerPool);
   }

   @Override
   public Void call(JavaPairRDD<String, Tuple2<String, String>> rdd)
         throws Exception {
      
      VoidFunction<Iterator<Tuple2<String, Tuple2<String, String>>>> 
         partitionOutputer = new PartitionDistributor(producerPool);
      
      rdd.foreachPartition(partitionOutputer);
      return null;
   }

}
