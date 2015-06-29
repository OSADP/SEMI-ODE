package com.bah.ode.spark;

import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.VoidFunction;
import org.apache.spark.streaming.api.java.JavaPairReceiverInputDStream;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.apache.spark.streaming.kafka.KafkaUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import scala.Tuple2;

import com.bah.ode.context.AppContext;
import com.bah.ode.wrapper.MQTopicInOut;

public class SparkWorkflow {
   private static Logger logger = LoggerFactory
         .getLogger(SparkWorkflow.class);
   
   private AppContext appContext;
   private static AtomicInteger idCounter = new AtomicInteger();
   
   private String id;

   public SparkWorkflow(AppContext appContext) {
      super();
      this.appContext = appContext;
      this.id = SparkWorkflow.class.getName() + "-" + idCounter.getAndIncrement();
   }



   public void start(final MQTopicInOut... topics) {
      // stop the streaming context if it is running so a new one can be started
      JavaStreamingContext ssc = appContext.getSparkStreamingConext();
//      try {
//         ssc.stop(false);
//      } catch (Exception e) {
//         logger.warn("Error stopping context. It may already be stopped. We'll ignore it for now.", e);
//      }
      
      for (final MQTopicInOut ioTopic : topics) {
         JavaPairReceiverInputDStream<String, String> kafkaStream = 
               KafkaUtils.createStream(
                     ssc, appContext.getParam(AppContext.ZK_CONNECTION_STRINGS),
                     String.valueOf(id), Collections.singletonMap(
                           ioTopic.getInTopic().getName(), 
                           ioTopic.getInTopic().getPartitions()));
         
         Function<JavaPairRDD<String, String>, Void> rddProcessor = 
               new Function<JavaPairRDD<String, String>, Void>() {
            private static final long serialVersionUID = 4946021213014494671L;
   
            @Override
            public Void call(JavaPairRDD<String, String> rdd) throws Exception {
               VoidFunction<Iterator<Tuple2<String, String>>> partitionOutputer = 
                     new MQOutputer(appContext.getParam(
                           AppContext.METADATA_BROKER_LIST),
                           ioTopic.getOutTopics());
   
               rdd.foreachPartition(partitionOutputer);
               return null;
            }
         };
   
         kafkaStream.foreachRDD(rddProcessor);
   //      kafkaStream.print();
      }
      
      ssc.start();
      logger.info("*** Spark Streaming Context {} Started ***", id);
   }

}
