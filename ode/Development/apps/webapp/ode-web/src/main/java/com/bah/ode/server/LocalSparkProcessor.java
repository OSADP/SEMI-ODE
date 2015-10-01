package com.bah.ode.server;

import org.apache.spark.streaming.Durations;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.context.AppContext;
import com.bah.ode.spark.VehicleDataProcessor;
import com.bah.ode.wrapper.MQTopic;

public class LocalSparkProcessor {

   private static Logger logger = 
         LoggerFactory.getLogger(LocalSparkProcessor.class);
   
   private static VehicleDataProcessor ovdfProcessor;
   private static JavaStreamingContext ssc;
   private static boolean streamingContextStarted = false;
   
   private static AppContext appContext = AppContext.getInstance();

   public static synchronized void startStreamingContext() {
      if (!streamingContextStarted) {
         int numParitions = 
         Integer.parseInt(appContext.getParam(AppContext.KAFKA_DEFAULT_CONSUMER_THREADS));

         if (ssc == null) {
            logger.info("Creating Spark Streaming Context...");
            ssc = new JavaStreamingContext(
                  appContext.getOrSetSparkContext(),
                  Durations.milliseconds(Integer.parseInt(
                        AppContext.getInstance().getParam(
                              AppContext.SPARK_STREAMING_MICROBATCH_DURATION_MS))));
         }
         
         if (ovdfProcessor == null) {
            logger.info("Creating OVDF Process Flow...");
            ovdfProcessor = new VehicleDataProcessor();
            ovdfProcessor.setup(ssc,
                  MQTopic.create(appContext.getParam(AppContext.ODE_VEH_DATA_FLAT_TOPIC), numParitions),
                  appContext.getParam(AppContext.ZK_CONNECTION_STRINGS),
                  appContext.getParam(AppContext.KAFKA_METADATA_BROKER_LIST));
         }
            
         try {
            logger.info("Starting Spark Streaming Context...");
            ssc.start();
            streamingContextStarted = true;
            logger.info("*** Spark Streaming Context Started ***");
         } catch (Throwable t1) {
            logger.warn("*** Error starting Spark Streaming Context. ***", t1);
         }
      }
   }

   public static void stopStreamingContext() {
      if (streamingContextStarted && ssc != null) {
         streamingContextStarted = false;
         try {
            ssc.stop(false);
            logger.info("*** Spark Streaming Context Stopped ***");
            
            try {
               ssc.awaitTerminationOrTimeout(10000);
            } catch (Throwable t) {
               logger.warn("Exception during spark job execution: " + t.getMessage());
            } finally {
               ssc = null;
               ovdfProcessor = null;
            }
         } catch (Throwable t) {
            logger.warn("*** Error stopping Spark Streaming Context ***", t);
         }
      }
   }

   public JavaStreamingContext getSparkStreamingConext() {
      return ssc;
   }

}