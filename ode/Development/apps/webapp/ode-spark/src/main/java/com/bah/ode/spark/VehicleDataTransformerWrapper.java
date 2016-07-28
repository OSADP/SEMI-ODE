package com.bah.ode.spark;

import org.apache.spark.SparkConf;
import org.apache.spark.streaming.Durations;
import org.apache.spark.streaming.api.java.JavaStreamingContext;

import com.bah.ode.wrapper.MQTopic;

public class VehicleDataTransformerWrapper {

   /**
    * 
    * <numParitions> <odeVehDataFlatTopic> <ZookeeperString> <KafkaBrokerString>
    * <SparkDuration >
    * 
    */

   public static void main(String[] args) {

      SparkConf sparkConf = new SparkConf();

      VehicleDataTransformer ovdfWF = new VehicleDataTransformer();

      String numPartitions = args[0];
      String odeVehDataFlatTopic = args[1];
      String zkConnectionString = args[2];
      String kafkaMetaDataBrokerList = args[3];
      String sparkStreamingMicrobatchDurationMs = args[4];

      JavaStreamingContext ssc = new JavaStreamingContext(sparkConf,
            Durations.milliseconds(Integer
                  .parseInt(sparkStreamingMicrobatchDurationMs)));

      ovdfWF.setup(ssc, MQTopic.create(odeVehDataFlatTopic,
            Integer.parseInt(numPartitions)), zkConnectionString,
            kafkaMetaDataBrokerList);

      ssc.start();
      ssc.awaitTermination();

   }

}