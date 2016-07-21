package com.bah.ode.spark;

import org.apache.spark.SparkConf;
import org.apache.spark.broadcast.Broadcast;
import org.apache.spark.streaming.Durations;
import org.apache.spark.streaming.api.java.JavaPairDStream;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.context.AppContext;
import com.bah.ode.metrics.SparkInstrumentation;
import com.bah.ode.wrapper.MQSerialazableProducerPool;
import com.bah.ode.wrapper.MQTopic;

import scala.Tuple2;

public class VehicleDataAggregator extends SparkJob {
   private static Logger logger = LoggerFactory.getLogger(VehicleDataAggregator.class);

   public JavaPairDStream<String, Tuple2<String, String>> setup(JavaStreamingContext ssc,
         MQTopic topic, String zkConnectionStrings,
         String brokerList) {

      SparkConf conf = ssc.sparkContext().getConf();
      JavaPairDStream<String, Tuple2<String, String>> payloadAndMetadata = 
            super.unifiedStream(ssc, topic, zkConnectionStrings, brokerList);
//      JavaPairDStream<String, Tuple2<String, String>> payloadAndMetadata = 
//            super.receiveDirect(
//            ssc, topic, brokerList);
      
      payloadAndMetadata = payloadAndMetadata.filter(new SpeedValidator(
                  new SparkInstrumentation(
                        ssc.sparkContext(),
                        "ode",
                        "SpeedValidator").register()));
      
      Integer microbatchDuration = Integer.valueOf(conf.get(
            AppContext.SPARK_STREAMING_MICROBATCH_DURATION_MS, String.valueOf(
                  AppContext.DEFAULT_SPARK_STREAMING_MICROBATCH_DURATION_MS)));

      Integer windowDuration = Integer.valueOf(conf
            .get(AppContext.SPARK_STREAMING_WINDOW_MICROBATCHES, String.valueOf(
                  AppContext.DEFAULT_SPARK_STREAMING_WINDOW_MICROBATCHES)));

      Integer slideDuration = Integer.valueOf(conf
            .get(AppContext.SPARK_STREAMING_SLIDE_MICROBATCHES, String.valueOf(
                  AppContext.DEFAULT_SPARK_STREAMING_SLIDE_MICROBATCHES)));

      try {
         final Broadcast<MQSerialazableProducerPool> producerPool = ssc
               .sparkContext()
               .broadcast(new MQSerialazableProducerPool(brokerList));

         boolean useWindow = conf.getBoolean(
               AppContext.SPARK_RUN_AGGREGATOR_IN_SLIDING_WINDOW, 
               AppContext.DEFAULT_SPARK_RUN_AGGREGATOR_IN_SLIDING_WINDOW);
         boolean aggInVDP = conf.getBoolean(
               AppContext.SPARK_RUN_ODE_AGGREGATOR_IN_VDP, 
               AppContext.DEFAULT_SPARK_RUN_ODE_AGGREGATOR_IN_VDP);
         
         /*
          * If the aggregator is to run from within the VDP process OR
          * if to run in a sliding window, then create windowed DStream.
          * otherwise, the normal microbatch DStream which should already be
          * set for the size of the aggregation window, will do. 
          */
         if (aggInVDP || useWindow) {
            payloadAndMetadata = payloadAndMetadata
                  .window(
                        Durations
                              .milliseconds(microbatchDuration * windowDuration),
                        Durations
                              .milliseconds(microbatchDuration * slideDuration));
         }
         
         payloadAndMetadata.foreachRDD(
               new Aggregator(
                     new SparkInstrumentation(ssc.sparkContext(), "ode", "Aggregator").register(),
                     new PayloadAggregator(
                        new SparkInstrumentation(ssc.sparkContext(), "ode", "PayloadAggregator").register(),
                        new SparkInstrumentation(ssc.sparkContext(), "ode", "AggregateDataDistributor").register(),
                        producerPool, 
                        conf.get(AppContext.SPARK_AGGREGATOR_OUTPUT_TOPIC))));
         
      } catch (Exception e) {
         logger.info("Error in Spark Job {}", e);
      }
      
      return payloadAndMetadata;
   }
}