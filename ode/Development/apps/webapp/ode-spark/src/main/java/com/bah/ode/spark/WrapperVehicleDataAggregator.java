package com.bah.ode.spark;

import org.apache.spark.SparkConf;
import org.apache.spark.streaming.Durations;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.context.AppContext;
import com.bah.ode.wrapper.MQTopic;

public class WrapperVehicleDataAggregator {

   private static Logger logger = 
         LoggerFactory.getLogger(WrapperVehicleDataAggregator.class);

   /**
    * 
    * <numParitions> <odeVehDataFlatTopic> <ZookeeperString> <KafkaBrokerString>
    * <SparkDuration >
    * 
    */
   public static void main(String[] args) {

      SparkConf sparkConf = new SparkConf();

      JobVehicleDataAggregator vdap = new JobVehicleDataAggregator();

      String numPartitions = args[0];
      String odeVehDataFlatTopic = args[1];
      String zkConnectionString = args[2];
      String kafkaMetaDataBrokerList = args[3];

      logger.info("Creating Streaming Context...");
      JavaStreamingContext ssc = new JavaStreamingContext(sparkConf,
            Durations.milliseconds(sparkConf.getLong(
                  AppContext.SPARK_STREAMING_MICROBATCH_DURATION_MS, 
                  AppContext.DEFAULT_SPARK_STREAMING_MICROBATCH_DURATION_MS)));

      logger.info("Setting up the job...");
      vdap.setup(ssc, MQTopic.create(odeVehDataFlatTopic,
            Integer.parseInt(numPartitions)), zkConnectionString,
            kafkaMetaDataBrokerList);

      logger.info("Starting Streaming Context...");
      ssc.start();

      logger.info("Waiting for termination...");
      ssc.awaitTermination();
	  
   }
}