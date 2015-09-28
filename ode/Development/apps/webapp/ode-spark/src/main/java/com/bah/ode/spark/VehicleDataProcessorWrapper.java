package com.bah.ode.spark;

import org.apache.spark.SparkConf;
import org.apache.spark.streaming.Durations;
import org.apache.spark.streaming.api.java.JavaStreamingContext;

import com.bah.ode.wrapper.MQTopic;

public class VehicleDataProcessorWrapper {

   public static final String SPARK_HOME = "/usr/hdp/current/spark-client";
   public static final String HADOOP_HOME = "/usr/hdp/current/hadoop-client";
   public static final String HADOOP_CONF_DIR = HADOOP_HOME + "/conf";
   public static final String HADOOP_YARN_HOME = "/usr/hdp/current/hadoop-yarn-client";
   public static final String YARN_CONF_DIR = HADOOP_YARN_HOME + "/conf";
   public static final String SPARK_MASTER = "yarn-client";

   /**
    * 
    * <numParitions> <odeVehDataFlatTopic> <ZookeeperString> <KafkaBrokerString>
    * <SparkDuration >
    * 
    */

   public static void main(String[] args) {

      SparkConf sparkConf = new SparkConf();

      VehicleDataProcessor ovdfWF = new VehicleDataProcessor();

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
