package com.bah.ode.yarn;

import java.util.ArrayList;

import org.apache.spark.deploy.yarn.Client;
import org.apache.spark.deploy.yarn.ClientArguments;

import org.apache.hadoop.yarn.client.api.YarnClient;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.yarn.api.records.ApplicationId;
import org.apache.spark.SparkConf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class YarnClientManager {
	
	private static Logger logger = 
	         LoggerFactory.getLogger(YarnClientManager.class);
    // create a Hadoop Configuration object
	private static String HADOOP_HOME = "/usr/hdp/current/hadoop-client";
	private static String HADOOP_CONF_DIR = HADOOP_HOME+"/conf";
	
	private SparkConf sparkConf;
	
	private String numPartitions;
	private String odeVehDataFlatTopic;
	private String zkConnectionString;
	private String kafkaMetaDataBrokerList;
	private String sparkStreamingDefaultDuration;
	private String className;
	private String userJar;
	private Client client;
	private ApplicationId appId;
	
	public YarnClientManager(SparkConf conf) {
		this(conf,"com.bah.ode.spark.VehicleDataProcessorWrapper");			
	}
	
	public YarnClientManager(SparkConf conf, String className) {
		this.sparkConf = conf;	
		this.className = className;
	}
	
	public YarnClientManager setNumPartitions(String numPartitions) {
		this.numPartitions = numPartitions;
		return this;
	}

	public YarnClientManager setOdeVehDataFlatTopic(String odeVehDataFlatTopic) {
		this.odeVehDataFlatTopic = odeVehDataFlatTopic;
		return this;
	}

	public YarnClientManager setZkConnectionString(String zkConnectionString) {
		this.zkConnectionString = zkConnectionString;
		return this;
	}

	public YarnClientManager setKafkaMetaDataBrokerList(String kafkaMetaDataBrokerList) {
		this.kafkaMetaDataBrokerList = kafkaMetaDataBrokerList;
		return this;
	}

	public YarnClientManager setSparkStreamingDefaultDuration(
			String sparkStreamingDefaultDuration) {
		this.sparkStreamingDefaultDuration = sparkStreamingDefaultDuration;
		return this;
	}
	
	public  YarnClientManager setClass(String args){
		this.className = args;
		return this;
	}
	
	public YarnClientManager setUserJar(String args)
	{
		this.userJar = args;
		return this;
	}
	
	public ApplicationId submitSparkJob() throws Throwable{

		
		logger.info("*** Reading Hadoop Config Files ***");
	    Configuration config = new Configuration();
	    try{
		    config.addResource(new Path(HADOOP_CONF_DIR+"/yarn-site.xml"));
		    config.addResource(new Path(HADOOP_CONF_DIR+"/core-site.xml"));
		    config.addResource(new Path(HADOOP_CONF_DIR+"/hdfs-site.xml"));
	    
		 }catch (Throwable t1) {
			 logger.warn("*** Error reading Hadoop Config Files***", t1);
			 throw t1;
		 }
         
	    // identify that you will be using Spark as YARN mode
	    System.setProperty("SPARK_YARN_MODE", "true");
	    
//		String numPartitions =			args[0];
//		String odeVehDataFlatTopic = 	args[1];
//		String zkConnectionString = 	args [2];
//		String kafkaMetaDataBrokerList = args[3];
//		String sparkStreamingDefaultDuration = args[4];
//	    
	    String [] args = new String [] {"--class", className,	
	    		"--jar", userJar,
	    		"--arg" ,numPartitions,
	    		"--arg", odeVehDataFlatTopic,
	    		"--arg", zkConnectionString,
	    		"--arg", kafkaMetaDataBrokerList,
	    		"--arg", sparkStreamingDefaultDuration,
	    		};
	   
	   logger.info("**** Spark Streaming Arguments ****"
	   		+ "\nApplication Jar: {} "
	   		+ "\nPartition count: {} "
	   		+ "\nInput Topic: {}"
	   		+ "\nZookeeper Connection String: {}"
	   		+ "\nkafka Broker Connection String {}"
	   		+"\nSpark Streamin Duration: {}",
	   		userJar,numPartitions.toString(),
	   		odeVehDataFlatTopic,
	   		zkConnectionString,
	   		kafkaMetaDataBrokerList,
	   		sparkStreamingDefaultDuration);
	   
	    ClientArguments cArgs = new ClientArguments(args, sparkConf); 
	    // create an instance of yarn Client client
	    this.client = new Client(cArgs, config, sparkConf); 
	    
	    // submit Spark job to YARN 
	    this.appId = this.client.submitApplication();
	    return this.appId;
	  
	}
	
	public void stopSparkJob()
	{
		this.client.stop();
		killApplication(this.appId);
	}
	
	public static void killApplication(ApplicationId appId)
	{
		YarnClient yc = YarnClient.createYarnClient();
		logger.info("*** Reading Hadoop Config Files ***");
	    Configuration config = new Configuration();
	    try{
		    config.addResource(new Path(HADOOP_CONF_DIR+"/yarn-site.xml"));
		    config.addResource(new Path(HADOOP_CONF_DIR+"/core-site.xml"));
		    config.addResource(new Path(HADOOP_CONF_DIR+"/hdfs-site.xml"));
		     
		    yc.init(config);
			yc.killApplication(appId);
		 }catch (Throwable t1) {
			 logger.warn("*** Error reading Hadoop Config Files***", t1);
			 logger.warn("*** Unable to Kill {}", appId.toString());
		 };
		 
	}
}
