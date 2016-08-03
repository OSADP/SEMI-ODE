package com.bah.ode.spark;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.function.PairFunction;
import org.apache.spark.broadcast.Broadcast;
import org.apache.spark.streaming.Durations;
import org.apache.spark.streaming.api.java.JavaDStream;
import org.apache.spark.streaming.api.java.JavaPairDStream;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.context.AppContext;
import com.bah.ode.metrics.SparkInstrumentation;
import com.bah.ode.model.OdeVehicleDataFlat;
import com.bah.ode.util.JsonUtils;
import com.bah.ode.wrapper.MQSerialazableProducerPool;
import com.bah.ode.wrapper.MQTopic;

import scala.Tuple2;

public class JobVehicleDataAggregator extends SparkJob {
   private static Logger logger = LoggerFactory.getLogger(JobVehicleDataAggregator.class);

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
         
         /*
          * To run in a sliding window, then create windowed DStream.
          * otherwise, the normal microbatch DStream which should already be
          * set for the size of the aggregation window, will do. 
          */
         if (useWindow) {
            payloadAndMetadata = payloadAndMetadata
                  .window(
                        Durations
                              .milliseconds(microbatchDuration * windowDuration),
                        Durations
                              .milliseconds(microbatchDuration * slideDuration));
         }
         
         //cache the data for multiple uses
         payloadAndMetadata.cache();
         
         String aggregateDataTopic = conf.get(AppContext.SPARK_AGGREGATOR_OUTPUT_TOPIC);
         payloadAndMetadata.foreachRDD(
               new PayloadAggregator(
                     new SparkInstrumentation(ssc.sparkContext(), "ode", "PayloadAggregator").register(),
                     new VehicleSpeedAggregator(
                        new SparkInstrumentation(ssc.sparkContext(), "ode", "VehicleSpeedAggregator").register(),
                        new SparkInstrumentation(ssc.sparkContext(), "ode", "AggregateSpeedDistributor").register(),
                        producerPool, 
                        aggregateDataTopic)));

         /*
          * Calculate number of tempIds to represent the number of vehicles
          * in the system
          */
         JavaPairDStream<String, Integer> tempIdStream = 
               payloadAndMetadata.mapToPair(
               (PairFunction<Tuple2<String, Tuple2<String, String>>, String, Integer>) 
               pam -> {
                  Tuple2<String, String> value = pam._2();
                  String sPayload = value._1();

                  OdeVehicleDataFlat ovdf = 
                        (OdeVehicleDataFlat) JsonUtils.fromJson(sPayload, 
                              OdeVehicleDataFlat.class);
                  
                  Tuple2<String, Integer> tempId = 
                        new Tuple2<String, Integer>(ovdf.getTempId(), 1);
                  
                  return tempId;
               }).reduceByKey((v1, v2) -> v1 + v2);
         
         JavaDStream<Long> vehicleCount = tempIdStream.count();

         vehicleCount.foreachRDD(new VehicleCountDistributor(
               new SparkInstrumentation(ssc.sparkContext(), "ode", "VehicleCountDistributor").register(),
               producerPool, aggregateDataTopic));
         
      } catch (Exception e) {
         logger.info("Error in Spark Job {}", e);
      }
      
      return payloadAndMetadata;
   }
}