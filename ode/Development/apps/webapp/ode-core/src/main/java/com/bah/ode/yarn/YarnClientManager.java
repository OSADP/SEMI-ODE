package com.bah.ode.yarn;

import java.util.ArrayList;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.yarn.api.records.ApplicationId;
import org.apache.hadoop.yarn.client.api.YarnClient;
import org.apache.spark.SparkConf;
import org.apache.spark.deploy.yarn.Client;
import org.apache.spark.deploy.yarn.ClientArguments;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.util.CommonUtils;

public class YarnClientManager {

   private static Logger logger = LoggerFactory
         .getLogger(YarnClientManager.class);
   // create a Hadoop Configuration object
   private static String HADOOP_HOME = "/usr/hdp/current/hadoop-client";
   private static String HADOOP_CONF_DIR = HADOOP_HOME + "/conf";

   private String numPartitions;
   private String inputTopic;
   private String zkConnectionString;
   private String kafkaMetaDataBrokerList;
   private String className;
   private String userJar;
   private Client client;
   private String driverMemory = "1024m"; //MB
   private String driverCores = "1";
   private String executorMemory = "2048m"; //MB
   private String executorCores = "1";
   private ApplicationId appId;
   private ArrayList<String> filesList;
   
   public YarnClientManager() {
      this.filesList = new ArrayList<String>();
   }

   public YarnClientManager setNumPartitions(String numPartitions) {
      this.numPartitions = numPartitions;
      return this;
   }

   public String getInputTopic() {
      return inputTopic;
   }

   public YarnClientManager setInputTopic(String inputTopic) {
      this.inputTopic = inputTopic;
      return this;
   }

   public YarnClientManager setZkConnectionString(String zkConnectionString) {
      this.zkConnectionString = zkConnectionString;
      return this;
   }

   public YarnClientManager setKafkaMetaDataBrokerList(
         String kafkaMetaDataBrokerList) {
      this.kafkaMetaDataBrokerList = kafkaMetaDataBrokerList;
      return this;
   }

   public YarnClientManager setClass(String args) {
      this.className = args;
      return this;
   }

   public YarnClientManager setUserJar(String args) {
      this.userJar = args;
      return this;
   }
   
   public YarnClientManager addFile(String filePath)
   {
	   filesList.add(filePath);
	   return this;
   }
   
   public YarnClientManager setDriverMemory(String arg)
   {
	   driverMemory = arg;
	   return this;
   }
   
   public YarnClientManager setDriverCores(String arg)
   {
	   driverCores = arg;
	   return this;
   }

   public YarnClientManager setExecutorMemory(String arg)
   {
	   executorMemory = arg;
	   return this; 
   }
   
   public YarnClientManager setExectorsCores(String arg)
   {
	   executorCores = arg;
	   return this; 
   }
   

   public ApplicationId submitSparkJob(SparkConf sparkConf) throws Throwable {

      Configuration config = getHadoopConfiguration();

      // identify that you will be using Spark as YARN mode
      System.setProperty("SPARK_YARN_MODE", "true");

      // String numPartitions = args[0];
      // String odeVehDataFlatTopic = args[1];
      // String zkConnectionString = args [2];
      // String kafkaMetaDataBrokerList = args[3];
      // String sparkStreamingDefaultDuration = args[4];
      //
      String[] args = new String[] { "--class", className, "--jar", userJar,
            "--arg", numPartitions,
            "--arg", inputTopic, 
            "--arg", zkConnectionString,
            "--arg", kafkaMetaDataBrokerList, 
            "--files", String.join(",", filesList),
            "--driver-memory", driverMemory, "--driver-cores", driverCores,
            "--executor-memory", executorMemory,"--executor-cores", executorCores
      		};

      logger.info("**** Spark Yarn Streaming Arguments ****"
            + "\nApplication Jar: {} " + "\nPartition count: {} "
            + "\nInput Topic: {}" + "\nZookeeper Connection String: {}"
            + "\nkafka Broker Connection String {}"
            + "\nSpark Streaming Microbatch Duration (ms): {}"
            + "\nFiles: {}", userJar,
            numPartitions.toString(), inputTopic, zkConnectionString,
            kafkaMetaDataBrokerList,
            String.join(",", filesList));

      CommonUtils.logSparkConf(sparkConf, logger);
      ClientArguments cArgs = new ClientArguments(args, sparkConf);
      // create an instance of yarn Client
      this.client = new Client(cArgs, config, sparkConf);

      // submit Spark job to YARN
      this.appId = this.client.submitApplication();
      return this.appId;

   }

   private static Configuration getHadoopConfiguration() {
      logger.info("*** Reading Hadoop Config Files ***");
      Configuration config = new Configuration();

      config.addResource(new Path(HADOOP_CONF_DIR, "yarn-site.xml"));
      config.addResource(new Path(HADOOP_CONF_DIR, "core-site.xml"));
      config.addResource(new Path(HADOOP_CONF_DIR, "hdfs-site.xml"));

      return config;
   }

   public void stopSparkJob() {
      this.client.stop();
      killApplication();
   }

   public void killApplication() {
      killApplication(this.appId);
   }

   public static void killApplication(ApplicationId appId) {
      YarnClient yc = YarnClient.createYarnClient();
      
      Configuration config = getHadoopConfiguration();
      try {
         yc.init(config);
         yc.killApplication(appId);
      } catch (Throwable t1) {
         logger.warn("*** Unable to Kill " + appId.toString(), t1);
      }
   }
}
