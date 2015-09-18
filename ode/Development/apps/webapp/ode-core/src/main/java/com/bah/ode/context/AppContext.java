/*******************************************************************************
 * Copyright (c) 2015 US DOT - Joint Program Office
 *
 * The Government has unlimited rights to all documents/material produced under 
 * this task order. All documents and materials, to include the source code of 
 * any software produced under this contract, shall be Government owned and the 
 * property of the Government with all rights and privileges of ownership/copyright 
 * belonging exclusively to the Government. These documents and materials may 
 * not be used or sold by the Contractor without written permission from the CO.
 * All materials supplied to the Government shall be the sole property of the 
 * Government and may not be used for any other purpose. This right does not 
 * abrogate any other Government rights.
 *
 * Contributors:
 *     Booz | Allen | Hamilton - initial API and implementation
 *******************************************************************************/
package com.bah.ode.context;

import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.hadoop.yarn.api.records.ApplicationId;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.yarn.YarnClientManager;

//import com.bah.ode.wrapper.MQTopic;

public class AppContext {
   private static Logger logger = LoggerFactory.getLogger(AppContext.class);

   public static final String WEB_SERVER_ROOT = "web.server.root";
   public static final String LOOPBACK_TEST = "loopback.test";
   public static final String LIFERAY_DB_NAME = "liferay.db.name";
   public static final String LIFERAY_DB_HOST = "liferay.db.host";
   public static final String LIFERAY_WS_SERVER_HOST = "liferay.ws.serverhost";
   public static final String LIFERAY_WS_COMPANY_ID = "liferay.ws.companyId";
		  
   public static final String MAIL_SMTP_HOST = "mail.smtp.host";
   public static final String MAIL_SMTP_PORT = "mail.smtp.port";
   public static final String MAIL_SMTP_SOCKET_FACTORY_PORT = "mail.smtp.socketFactory.port";
   public static final String MAIL_FROM = "mail.from";
   public static final String MAIL_USERNAME = "mail.user";
   public static final String MAIL_PASSWORD = "mail.password";

   public static final String JSESSIONID_KEY = "JSESSIONID";
   public static final String DDS_DOMAIN = "dds.domain";
   public static final String DDS_PORT = "dds.port";
   public static final String DDS_RESOURCE_IDENTIFIER = "dds.resource.identifier";
   public static final String DDS_KEYSTORE_FILE_PATH = "dds.keystore.file.path";
   public static final String DDS_KEYSTORE_PASSWORD = "dds.keystore.password";
   public static final String DDS_CAS_URL = "dds.cas.url";
   public static final String DDS_CAS_USERNAME = "dds.cas.username";
   public static final String DDS_CAS_PASSWORD = "dds.cas.password";
   public static final String DDS_SEND_LATEST_VSR_IN_VSD_BUNDLE = "send.latest.vsr.in.vsd.bundle";

   // Spark parameters
   public static final String SPARK_MASTER = "spark.master";
   public static final String SPARK_STREAMING_DEFAULT_DURATION = "spark.streaming.default.duration";
   public static final String SPARK_ASSEMBLY_JAR = "spark.assembly.jar";
   public static final String SPARK_EXECUTOR_MEMORY = "spark.executor.memory";
   public static final String SPARK_DRIVER_MEMORY = "spark.driver.memory";

   public static final String KAFKA_METADATA_BROKER_LIST = "metadata.broker.list";
   public static final String KAFKA_DEFAULT_CONSUMER_THREADS = "default.consumer.threads";
   public static final String ZK_CONNECTION_STRINGS = "zk.connection.strings";
   
   public static final String ODE_VEH_DATA_FLAT_TOPIC = "ode.veh.data.flat.topic";
   public static final String TOKEN_KEY_RSA_PEM = "token.key.rsa.pem";

   // SParkConf related Constants
   public static final String ODE_SPARK_JAR = "ode.spark.jar";
   public static final String DEPLOY_HOME = "/opt/bitnami/apache-tomcat/webapps/ode/WEB-INF/lib"; //TODO Same as Web Server root?
   public static final String SPARK_HOME = "/usr/hdp/current/spark-client";
   public static final String HADOOP_HOME = "/usr/hdp/current/hadoop-client";
   public static final String HADOOP_CONF_DIR = HADOOP_HOME+"/conf";
   public static final String HADOOP_YARN_HOME = "/usr/hdp/current/hadoop-yarn-client";
   public static final String YARN_CONF_DIR = HADOOP_YARN_HOME+"/conf";
     
   
   private static AppContext instance = null;

   private ServletContext servletContext;
   
   private String sparkMaster;
   private SparkConf sparkConf;
   private JavaSparkContext sparkContext;
   private boolean streamingContextStarted = false;
   private  YarnClientManager yarnManager = null;
   private ApplicationId sparkAppId = null;

   public static String getServletBaseUrl(HttpServletRequest request) {
      String proto = request.getScheme();
      String host = request.getServerName();
      String port = new Integer(request.getServerPort()).toString();
      String path = request.getContextPath();
      return proto + "://" + host + ":" + port + path;
   }

   private AppContext() {
   }

   public void init(ServletContext context) {
      this.servletContext = context;
      sparkMaster = getParam(SPARK_MASTER);

      // DEBUG ONLY
      // For debugging only and running the app on local machine
      // without Spark
      //FOR TEST ONLY
      if (!loopbackTest()) {
         try {        	
        	 
            sparkConf = new SparkConf()
               .setMaster(sparkMaster)
               .setAppName(context.getServletContextName())
               .set("spark.shuffle.manager", "SORT");
            
            if (sparkMaster.startsWith("yarn")) {
               sparkConf.set("spark.yarn.jar", SPARK_HOME+"/lib/"+ getParam(SPARK_ASSEMBLY_JAR))
                  .setExecutorEnv("CLASSPATH", "$CLASSPATH:"+SPARK_HOME+"/lib/*:"
                       + "/usr/hdp/current/hadoop-client/*:"
                       + "/usr/hdp/current/hadoop-client/lib/*:"
                       + "/usr/hdp/current/hadoop-hdfs-client/*:"
                       + "/usr/hdp/current/hadoop-hdfs-client/lib/*:"
                       + "/usr/hdp/current/hadoop-yarn-client/*:"
                       + "/usr/hdp/current/hadoop-yarn-client/lib/*")
//               .setSparkHome(SPARK_HOME)
//               .setExecutorEnv("SPARK_HOME",		SPARK_HOME)
//               .setExecutorEnv("HADOOP_CONF_DIR", 	HADOOP_CONF_DIR)
//               .setExecutorEnv("YARN_CONF_DIR",  	YARN_CONF_DIR)
//               .setExecutorEnv("HADOOP_HOME",		HADOOP_HOME)
//               .setExecutorEnv("HADOOP_YARN_HOME",	HADOOP_YARN_HOME )             
//               .setExecutorEnv("SPARK_YARN_MODE", "true")
//               .set("spark.yarn.appMasterEnv.SPARK_YARN_MODE","true")
               
//               .set("spark.yarn.appMasterEnv.SPARK_HOME",SPARK_HOME)
//               .set("spark.yarn.appMasterEnv.SPARK_YARN_MODE", "false")                             
//               .set("spark.yarn.appMasterEnv.HADOOP_CONF_DIR", HADOOP_CONF_DIR)              
//               .set("spark.yarn.appMasterEnv.YARN_CONF_DIR",  YARN_CONF_DIR)
//               .set("spark.yarn.appMasterEnv.HADOOP_HOME", HADOOP_HOME)
//               .set("spark.yarn.appMasterEnv.HADOOP_YARN_HOME",HADOOP_YARN_HOME)
                  .set("spark.yarn.application.classpath","$CLASSPATH:$HADOOP_CONF_DIR:"
                        + "/usr/hdp/current/hadoop-client/*:"
                        + "/usr/hdp/current/hadoop-client/lib/*:"
                        + "/usr/hdp/current/hadoop-hdfs-client/*:"
                        + "/usr/hdp/current/hadoop-hdfs-client/lib/*:"
                        + "/usr/hdp/current/hadoop-yarn-client/*:"
                        + "/usr/hdp/current/hadoop-yarn-client/lib/*")
//            		   				  
//          .set("spark.yarn.access.namenodes","hdfs://localhost.localdomain:8020")
//          .set("spark.yarn.am.extraJavaOptions","-Dhdp.version=2.3.0.0-2557") // TODO If required for cluster use, 
//          .set("spark.driver.extraJavaOptions" ,"-Dhdp.version=2.3.0.0-2557")// TODO  add these variables to web.xml
             
//           .set("spark.yarn.appMasterEnv.hdp.version","2.3.0.0-2557")
//            // Use Kryo to speed up serialization, recommended as default setup for Spark Streaming
//            // http://spark.apache.org/docs/1.1.0/tuning.html#data-serialization
//            .set("spark.serializer", "org.apache.spark.serializer.KryoSerializer")
//            .set("spark.kryo.registrator", .class.getName);
               // Enable experimental sort-based shuffle manager that is more memory-efficient in environments with small
               // executors, such as YARN.  Will most likely become the default in future Spark versions.
               // https://spark.apache.org/docs/1.1.0/configuration.html#shuffle-behavior
//            // Force RDDs generated and persisted by Spark Streaming to be automatically unpersisted from Spark's memory.
//            // The raw input data received by Spark Streaming is also automatically cleared.  (Setting this to false will
//            // allow the raw data and persisted RDDs to be accessible outside the streaming application as they will not be
//            // cleared automatically.  But it comes at the cost of higher memory usage in Spark.)
//            // http://spark.apache.org/docs/1.1.0/configuration.html#spark-streaming
//            .set("spark.streaming.unpersist", "true")
                        ;
               startSparkOnYarn();
            } else {
               sparkContext = getOrSetSparkContext();
            }
            
            logger.info("Creating Spark Context...");            
            

         } catch (Throwable t) {
            logger.error("Error creating spark contexts.", t);
         }
      } else {
         logger.info("*** SPARK DISABLED FOR DEBUG ***");
      }
      
      Enumeration<String> parmNames = context.getInitParameterNames();

      while (parmNames.hasMoreElements()) {
         String key = parmNames.nextElement();
         logger.info("Configuration Parameter {}:{}", key,
               key.contains("password")?"********":context.getInitParameter(key));
      }
   }

   public static synchronized AppContext getInstance() {
      if (null == instance) {
         instance = new AppContext();
      }
      return instance;
   }

   public String getParam(String key) {
      String result = null;
      if (key != null) {
         result = servletContext.getInitParameter(key);
      }

      return result;
   }

   public ServletContext getServletContext() {
      return servletContext;
   }

   public SparkConf getSparkConf() {
      return sparkConf;
   }

   public JavaSparkContext getOrSetSparkContext() {
      if (sparkContext == null){
         logger.info("Creating Spark Context...");
         sparkContext = new JavaSparkContext(sparkConf);
      }
      return sparkContext;
   }

   public JavaSparkContext getSparkContext() {
      return sparkContext;
   }

   public void setSparkContext(JavaSparkContext sparkContext) {
      this.sparkContext = sparkContext;
   }

   public void shutDown() {
      stopSparkOnYarn();
   }
   
   public  ApplicationId getApplicationId(){
	   return sparkAppId;
   }
   
   public synchronized void startSparkOnYarn() {
      if (!streamingContextStarted && null==yarnManager) {
         try {
            streamingContextStarted = true;
            yarnManager = new YarnClientManager(sparkConf);
            yarnManager.setKafkaMetaDataBrokerList(getParam(KAFKA_METADATA_BROKER_LIST))
               .setZkConnectionString(getParam(ZK_CONNECTION_STRINGS))
               .setNumPartitions(getParam(KAFKA_DEFAULT_CONSUMER_THREADS))
               .setOdeVehDataFlatTopic(getParam(ODE_VEH_DATA_FLAT_TOPIC))
               .setSparkStreamingDefaultDuration(getParam(SPARK_STREAMING_DEFAULT_DURATION))
               .setClass("com.bah.ode.spark.VehicleDataProcessorWrapper")
               .setUserJar(DEPLOY_HOME+"/"+getParam(ODE_SPARK_JAR));
            logger.info("Starting Spark ...");
            sparkAppId = yarnManager.submitSparkJob();
            logger.info("Spark ApplicationID: {}", sparkAppId.toString());    
            
            
            logger.info("*** Spark Streaming Context Started ***");
         } catch (Throwable t1) {
            logger.warn("*** Error starting Spark Streaming Context. Stopping... ***", t1);
            try {
               logger.info("*** Spark Streaming Context Stopped ***");
            } catch (Throwable t2) {
               logger.warn("*** Error stopping Spark Streaming Context. Starting... ***", t2);
            }
            try {
               logger.info("*** Restarting Spark Streaming Context. ***");
               streamingContextStarted = true;
               logger.info("*** Spark Streaming Context Restarted ***");
            } catch (Throwable t3) {
               logger.error("*** Unable to start Spark Streaming Context ***", t3);
            }
         }
      }
   }

   public synchronized void stopSparkOnYarn() {
      if (streamingContextStarted || null != yarnManager) {
         try {
            yarnManager.stopSparkJob();
            yarnManager = null;
            sparkAppId = null;
            streamingContextStarted = false;
            logger.info("*** Spark Streaming Context Stopped ***");
         } catch (Throwable t) {
            logger.warn("*** Error stopping Spark Streaming Context ***", t);
         }
      }
   }

   public static boolean loopbackTest() {
      return Boolean.parseBoolean(getInstance().getParam(LOOPBACK_TEST));
   }
}
