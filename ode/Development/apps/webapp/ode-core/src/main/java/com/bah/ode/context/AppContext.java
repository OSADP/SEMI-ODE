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

//import java.util.ArrayList;
import java.util.Enumeration;
//import java.util.List;
import java.util.UUID;

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

   //CONSTANTS
   public static final String ODE_HOSTNAME = "ODE_HOSTNAME";
   public static final String PAYLOAD_STRING = "payload";
   public static final String METADATA_STRING = "metadata";
   public static final String METADATA_VIOLATIONS_STRING = "violations";
   public static final String PAYLOAD_TYPE_STRING = "payloadType";
   public static final String DATA_TYPE_STRING = "dataType";
   public static final String SERIAL_ID_STRING = "serialId";
   public static final String SANITIZED_STRING = "Sanitized-";

   /////////////////////////////////////////////////////////////////////////////
   //Topics used by the Data Processor (Spark) 
   public static final String DATA_PROCESSOR_INPUT_TOPIC = "DPIT";
   public static final String DATA_PROCESSOR_AGGREGATES_TOPIC = "DPAT";
   // If you are adding a new DP topic, you must also add code set the host 
   // specific config parameter in the init method 
   /////////////////////////////////////////////////////////////////////////////
   
   public static final String LOOPBACK_TEST = "loopback.test";
   
   // SparkConf related Constants
   public static final String ODE_SPARK_JAR = "ode.spark.jar";
   public static final String DEPLOY_HOME = "/opt/bitnami/apache-tomcat/webapps/ode/WEB-INF/lib"; //TODO Same as Web Server root?
   public static final String SPARK_HOME = "/usr/hdp/current/spark-client";
   public static final String HADOOP_HOME = "/usr/hdp/current/hadoop-client";
   public static final String HADOOP_CONF_DIR = HADOOP_HOME+"/conf";
   public static final String HADOOP_YARN_HOME = "/usr/hdp/current/hadoop-yarn-client";
   public static final String YARN_CONF_DIR = HADOOP_YARN_HOME+"/conf";

   //web.xml config parameter keys
   public static final String WEB_SERVER_ROOT = "web.server.root";
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
   public static final String SPARK_STREAMING_MICROBATCH_DURATION_MS = "spark.streaming.microbatch.duration.ms";
   public static final String SPARK_STREAMING_WINDOW_MICROBATCHES = "spark.streaming.window.microbatches";
   public static final String SPARK_STREAMING_SLIDE_MICROBATCHES = "spark.streaming.slide.microbatches";
   public static final String SPARK_ASSEMBLY_JAR = "spark.assembly.jar";
   public static final String SPARK_EXECUTOR_MEMORY = "spark.executor.memory";
   public static final String SPARK_DRIVER_MEMORY = "spark.driver.memory";

   public static final String SPARK_STATIC_WEATHER_FILE_LOCATION = "spark.static.weather.file.location";
   public static final String SPARK_STATIC_SANITIZATION_FILE_LOCATION = "spark.static.sanitization.file.location";
   public static final String SPARK_STATIC_VALIDATION_FILE_LOCATION = "spark.static.validation.file.location";
   
   public static final String SPARK_YARN_CONFIGURATION_FILE = "spark.yarn.vehicle.configuration.file";
   public static final String SPARK_YARN_AGGREGATOR_CONFIGURATION_FILE = "spark.yarn.aggregator.configuration.file";
   public static final String SPARK_ODE_VEHICLE_AGGREGATOR_ENABLED = "spark.ode.vehicle.aggrator.enabled";

   public static final String KAFKA_METADATA_BROKER_LIST = "metadata.broker.list";
   public static final String KAFKA_DEFAULT_CONSUMER_THREADS = "default.consumer.threads";
   public static final String ZK_CONNECTION_STRINGS = "zk.connection.strings";

   public static final String TOKEN_KEY_RSA_PEM = "token.key.rsa.pem";

   public static final String SPARK_ROAD_SEGMENT_SNAPPING_TOLERANCE = "spark.road.segment.snapping.tolerance";


   private static AppContext instance = null;

   private ServletContext servletContext;

   private String sparkMaster;
   private SparkConf sparkConf;
   private JavaSparkContext sparkContext;
//   private SQLContext sqlContext;
   private boolean streamingContextStarted = false;
   private  YarnClientManager yarnManager = null;
   private ApplicationId sparkAppId = null;
   private ApplicationId sparkVehicleAggregatorAppId = null;

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
      this.sparkMaster = getParam(SPARK_MASTER);
      String hostname = System.getenv("HOSTNAME");
      /*
       *  If running on windows host, HOSTNAME environment variable is usually 
       *  not defined. So we'll assume that the software should be run in 
       *  loopbackTest mode. 
       */
      if (hostname == null) {
         this.servletContext.setInitParameter(LOOPBACK_TEST, "true");
         hostname = UUID.randomUUID().toString();
      } else {
         this.servletContext.setInitParameter(LOOPBACK_TEST, "false");
      }
      
      this.servletContext.setInitParameter(ODE_HOSTNAME, hostname);
      // Create host-specific topic names and add to init parameters
      //////////////////////////////////////////////////////////////////////////
      this.servletContext.setInitParameter(DATA_PROCESSOR_INPUT_TOPIC, 
            DATA_PROCESSOR_INPUT_TOPIC + hostname);
      
      this.servletContext.setInitParameter(DATA_PROCESSOR_AGGREGATES_TOPIC, 
            DATA_PROCESSOR_AGGREGATES_TOPIC + hostname);
      //////////////////////////////////////////////////////////////////////////

      sparkConf = new SparkConf()
      .setMaster(sparkMaster)
      .setAppName(context.getServletContextName())
      .set("spark.shuffle.manager", "SORT")
      .set(ODE_HOSTNAME, getParam(ODE_HOSTNAME))
      .set(LOOPBACK_TEST, getParam(LOOPBACK_TEST))
      .set(SPARK_STREAMING_MICROBATCH_DURATION_MS, getParam(SPARK_STREAMING_MICROBATCH_DURATION_MS))
      .set(SPARK_STREAMING_WINDOW_MICROBATCHES, getParam(SPARK_STREAMING_WINDOW_MICROBATCHES))
      .set(SPARK_STREAMING_SLIDE_MICROBATCHES, getParam(SPARK_STREAMING_SLIDE_MICROBATCHES))
      .set(SPARK_STATIC_WEATHER_FILE_LOCATION, getParam(SPARK_STATIC_WEATHER_FILE_LOCATION))
      .set(SPARK_STATIC_SANITIZATION_FILE_LOCATION, getParam(SPARK_STATIC_SANITIZATION_FILE_LOCATION))
      .set(SPARK_STATIC_VALIDATION_FILE_LOCATION, getParam(SPARK_STATIC_VALIDATION_FILE_LOCATION))
      .set(SPARK_ROAD_SEGMENT_SNAPPING_TOLERANCE, getParam(SPARK_ROAD_SEGMENT_SNAPPING_TOLERANCE))
      .set("spark.topics."+ DATA_PROCESSOR_INPUT_TOPIC, getParam(DATA_PROCESSOR_INPUT_TOPIC))
      .set("spark.topics."+ DATA_PROCESSOR_AGGREGATES_TOPIC, getParam(DATA_PROCESSOR_AGGREGATES_TOPIC))
      .set(SPARK_ODE_VEHICLE_AGGREGATOR_ENABLED,Boolean.toString(true));
     
      // DEBUG ONLY
      // For debugging only and running the app on local machine
      // without Spark
      //FOR TEST ONLY
      if (!loopbackTest()) {
         try {
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
//              .set("spark.metrics.conf", "/usr/hdp/current/spark-client/conf/metrics.properties")
                        ;
               
               // Load external Spark Yarn Properties
//               Properties sparkYarnPropertyFile = new Properties();
//               String sparkConfigFilePath =  getParam(SPARK_YARN_CONFIGURATION_FILE);
//               
//               if( null != sparkConfigFilePath && !sparkConfigFilePath.equals(""))
//               {   
//	               sparkYarnPropertyFile.load(this.servletContext.getResourceAsStream(sparkConfigFilePath));   
//	               Enumeration<?> sparkYarnProperties =  sparkYarnPropertyFile.propertyNames();	               
//	               
//	               while (sparkYarnProperties.hasMoreElements()){
//	            	   String key =  (String) sparkYarnProperties.nextElement();
//	            	   sparkConf.set(key,sparkYarnPropertyFile.getProperty(key));
//	               }
//               }
               startSparkOnYarn();
            } else {
               sparkContext = getOrSetSparkContext();
            }
         } catch (Throwable t) {
            logger.error("Error setting sparkConf.", t);
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

   public static AppContext getInstance() {
      if (null == instance) {
         synchronized(AppContext.class) {
            if (null == instance)
               instance = new AppContext();
         }
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

//   public SQLContext getSparkSQLContext() {
//	   return sqlContext;
//   }

   public void shutDown() {
      stopSparkOnYarn();
   }

   public  ApplicationId getApplicationId(){
	   return sparkAppId;
   }

   public synchronized void startSparkOnYarn() {
      if (!streamingContextStarted && null==yarnManager) {
         try {
         /*
          * Disable Aggregator function in Vehicle Data Proccessor by Default when running on Yarn 
          * Can be re-enabled by setting "spark.ode.vehicle.aggrator.enabled" to true in 
          * a properties file in order for it to run on yarn mode. 
          */ 
          
         sparkConf.set(SPARK_ODE_VEHICLE_AGGREGATOR_ENABLED,Boolean.toString(false));
            
         streamingContextStarted = true;           
         yarnManager = new YarnClientManager(sparkConf.clone());
            yarnManager.setKafkaMetaDataBrokerList(getParam(KAFKA_METADATA_BROKER_LIST))
               .setZkConnectionString(getParam(ZK_CONNECTION_STRINGS))
               .setNumPartitions(getParam(KAFKA_DEFAULT_CONSUMER_THREADS))
               .setDataProcessorInputTopic(getParam(DATA_PROCESSOR_INPUT_TOPIC))
               .setSparkStreamingMicrobatchDuration(getParam(SPARK_STREAMING_MICROBATCH_DURATION_MS))
               .setClass("com.bah.ode.spark.VehicleDataProcessorWrapper")
               .setUserJar(DEPLOY_HOME+"/"+getParam(ODE_SPARK_JAR));
            String sparkConfigFilePath =  getParam(SPARK_YARN_CONFIGURATION_FILE);
          
            if( null != sparkConfigFilePath && !sparkConfigFilePath.equals(""))
            {
            	yarnManager.setSparkConfPropertyFile(this.servletContext.getResourceAsStream(sparkConfigFilePath));
            }
            
            YarnClientManager aggregatorManager = new YarnClientManager(sparkConf.clone());
            aggregatorManager.setKafkaMetaDataBrokerList(getParam(KAFKA_METADATA_BROKER_LIST))
               .setZkConnectionString(getParam(ZK_CONNECTION_STRINGS))
               .setNumPartitions(getParam(KAFKA_DEFAULT_CONSUMER_THREADS))
               .setDataProcessorInputTopic(getParam(DATA_PROCESSOR_INPUT_TOPIC))
               .setSparkStreamingMicrobatchDuration(getParam(SPARK_STREAMING_MICROBATCH_DURATION_MS))
               .setUserJar(DEPLOY_HOME+"/"+getParam(ODE_SPARK_JAR))
               .setClass("com.bah.ode.spark.VehicleDataAggregatorWrapper");
            
            String sparkAggregatorConfigFilePath =  getParam(SPARK_YARN_AGGREGATOR_CONFIGURATION_FILE);
            
            if( null != sparkAggregatorConfigFilePath && !sparkAggregatorConfigFilePath.equals(""))
            {
            	aggregatorManager.setSparkConfPropertyFile(this.servletContext.getResourceAsStream(sparkAggregatorConfigFilePath));
            }
            
            logger.info("Starting Spark ...");
            
            sparkAppId = yarnManager.submitSparkJob();
            sparkVehicleAggregatorAppId = aggregatorManager.submitSparkJob();
            
            logger.info("Spark Vehicle Processor    ApplicationID: {}", sparkAppId.toString());
            logger.info("Spark Aggregator Processor ApplicationID: {}", sparkVehicleAggregatorAppId.toString());


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
            YarnClientManager.killApplication(sparkVehicleAggregatorAppId);
            
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
     return Boolean.parseBoolean(AppContext.getInstance().getSparkConf().get(LOOPBACK_TEST, "false"));
   }
}
