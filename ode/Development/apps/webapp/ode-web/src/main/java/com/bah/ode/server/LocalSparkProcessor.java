package com.bah.ode.server;

import org.apache.spark.sql.AnalysisException;
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
      if (appContext.getParam(AppContext.SPARK_MASTER).startsWith("local")) {
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
            logger.warn("*** Error starting Spark Streaming Context. Stopping... ***", t1);
            try {
               ssc.stop(false);
               logger.info("*** Spark Streaming Context Stopped ***");
            } catch (Throwable t2) {
               logger.warn("*** Error stopping Spark Streaming Context. Starting... ***", t2);
            }
            try {
               logger.info("*** Restarting Spark Streaming Context. ***");
               ssc.start();
               logger.info("*** Spark Streaming Context Restarted ***");
            } catch (Throwable t3) {
               logger.error("*** Unable to start Spark Streaming Context ***", t3);
            }
         }
      }
   }

   public static void stopStreamingContext() {
      if (streamingContextStarted && ssc != null) {
         streamingContextStarted = false;
         try {
            ssc.stop(false);
            logger.info("*** Spark Streaming Context Stopped ***");
            ssc.awaitTerminationOrTimeout(10000);
            ssc = null;
            ovdfProcessor = null;
         } catch (Throwable t) {
            if (t instanceof AnalysisException)
               logger.warn("Exception during spark job execution: " + t.getMessage());
            else
               logger.warn("*** Error stopping Spark Streaming Context ***", t);
         }
      }
   }

   public JavaStreamingContext getSparkStreamingConext() {
      return ssc;
   }

}