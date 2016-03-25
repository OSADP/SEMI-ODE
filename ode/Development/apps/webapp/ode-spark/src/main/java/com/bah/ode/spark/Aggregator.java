package com.bah.ode.spark;

import org.apache.spark.Accumulator;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.function.Function;

import scala.Tuple2;

public class Aggregator extends SparkProcessor
   implements Function<JavaPairRDD<String, Tuple2<String, String>>, Void> {

   private static final long serialVersionUID = 34991323740854373L;
   private PayloadAggregator aggregator;
   
   public Aggregator(Accumulator<Integer> accumulator, PayloadAggregator aggregator) {
      super(accumulator);
      this.aggregator = aggregator;
   }

   @Override
   public Void call(JavaPairRDD<String, Tuple2<String, String>> rdd)
         throws Exception {
      startTimer();
      JavaPairRDD<String, String> rdd2 = 
            rdd.mapToPair((Tuple2<String, Tuple2<String, String>> t) -> 
            new Tuple2<String, String>(t._1, t._2._1));
      aggregator.call(rdd2);
      stopTimer();
      return null;
   }

}
