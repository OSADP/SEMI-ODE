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

import java.io.File;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.yarn.api.records.ApplicationId;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.metrics.OdeMetrics;
import com.bah.ode.yarn.YarnClientManager;

//import com.bah.ode.wrapper.MQTopic;

public class AppContext {
   private static Logger logger = LoggerFactory.getLogger(AppContext.class);

   // CONSTANTS
   public static final String ODE_HOSTNAME = "ODE_HOSTNAME";
   public static final String PAYLOAD_STRING = "payload";
   public static final String METADATA_STRING = "metadata";
   public static final String METADATA_VIOLATIONS_STRING = "violations";
   public static final String PAYLOAD_TYPE_STRING = "payloadType";
   public static final String DATA_TYPE_STRING = "dataType";
   public static final String SERIAL_ID_STRING = "serialId";
   public static final String SANITIZED_STRING = "Sanitized-";
   public static final boolean DEFAULT_DDS_SEND_LATEST_VSR_IN_VSD_BUNDLE = false;
   public static final int DEFAULT_DATA_SEQUENCE_REORDER_DELAY = 1000;
   public static final int DEFAULT_DATA_SEQUENCE_REORDER_PERIOD = 3500;
   public static final int DEFAULT_SPARK_STREAMING_MICROBATCH_DURATION_MS = 1000;
   public static final int DEFAULT_SPARK_STREAMING_WINDOW_MICROBATCHES = 60;
   public static final int DEFAULT_SPARK_STREAMING_SLIDE_MICROBATCHES = 30;
   public static final int DEFAULT_KAFKA_CONSUMER_THREADS = 1;
   public static final int DEFAULT_SPARK_ROAD_SEGMENT_SNAPPING_TOLERANCE = 20;
   public static final int DEFAULT_METRICS_GRAPHITE_PORT = 2003;
   public static final int DEFAULT_METRICS_POLLING_RATE_SECONDS = 10;

   public static final String DEFAULT_SPARK_SCHEDULER_MODE = "FIFO";
   public static final boolean DEFAULT_SPARK_RUN_ODE_AGGREGATOR_IN_VDP = false;
   public static final boolean DEFAULT_SPARK_ODE_AGGREGATOR_ENABLED = true;
   public static final boolean DEFAULT_SPARK_RUN_AGGREGATOR_IN_SLIDING_WINDOW = true;
   public static final boolean DEFAULT_SPARK_USE_PARALLEL_RECEIVERS = false;


   private static final String HOST_SPECIFIC_UID = "HOST_SPECIFIC_UID";


   public static final String LOOPBACK_TEST = "loopback.test";

   // SparkConf related Constants
   public static final String ODE_SPARK_JAR = "ode.spark.jar";
   public static final String DEPLOY_HOME = "/opt/bitnami/apache-tomcat/webapps/ode/WEB-INF/lib"; // TODO Same as Web Server root?
   public static final String SPARK_HOME = "/usr/hdp/current/spark-client";
   public static final String HADOOP_HOME = "/usr/hdp/current/hadoop-client";
   public static final String HADOOP_CONF_DIR = HADOOP_HOME + "/conf";
   public static final String HADOOP_YARN_HOME = "/usr/hdp/current/hadoop-yarn-client";
   public static final String YARN_CONF_DIR = HADOOP_YARN_HOME + "/conf";

   // web.xml config parameter keys
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
   public static final String DATA_SEQUENCE_REORDER_DELAY = "data.sequence.reorder.delay";
   public static final String DATA_SEQUENCE_REORDER_PERIOD = "data.sequence.reorder.period";

   // Spark parameters
   /* 
    * All spark parameters must start with "spark." for Spark to recognize them.
    */
   public static final String SPARK_MASTER = "spark.master";
   public static final String SPARK_STREAMING_MICROBATCH_DURATION_MS = "spark.streaming.microbatch.duration.ms";
   public static final String SPARK_STREAMING_WINDOW_MICROBATCHES = "spark.streaming.window.microbatches";
   public static final String SPARK_STREAMING_SLIDE_MICROBATCHES = "spark.streaming.slide.microbatches";
   public static final String SPARK_ASSEMBLY_JAR = "spark.assembly.jar";
   public static final String SPARK_EXECUTOR_MEMORY = "spark.executor.memory";
   public static final String SPARK_DRIVER_MEMORY = "spark.driver.memory";
   public static final String SPARK_SCHEDULER_MODE = "spark.scheduler.mode";



   public static final String SPARK_STATIC_WEATHER_FILE_LOCATION = "spark.static.weather.file.location";
   public static final String SPARK_STATIC_SANITIZATION_FILE_LOCATION = "spark.static.sanitization.file.location";
   public static final String SPARK_STATIC_VALIDATION_FILE_LOCATION = "spark.static.validation.file.location";

   public static final String SPARK_CONFIGURATION_DIRECTORY_HOME = "spark.configuration.file.directory";
   public static final String SPARK_YARN_CONFIGURATION_FILE = "spark.yarn.vehicle.configuration.file";
   public static final String SPARK_YARN_AGGREGATOR_CONFIGURATION_FILE = "spark.yarn.aggregator.configuration.file";
   
   // SPARK ON YARN Cluster Resource Params
   // Can be used to override defaults
   public static final String SPARK_YARN_VEHICLE_DRIVER_CORES = "spark.yarn.vehicle.driver.cores";
   public static final String SPARK_YARN_VEHICLE_DRIVER_MEMORY = "spark.yarn.vehicle.driver.memory";
   public static final String SPARK_YARN_VEHICLE_EXECUTOR_CORES = "spark.yarn.vehicle.executor.cores";
   public static final String SPARK_YARN_VEHICLE_EXECUTOR_MEMORY = "spark.yarn.vehicle.executor.memory";
   public static final String SPARK_YARN_AGGREGATOR_DRIVER_CORES = "spark.yarn.aggregator.driver.cores";
   public static final String SPARK_YARN_AGGREGATOR_DRIVER_MEMORY = "spark.yarn.aggregator.driver.memory";
   public static final String SPARK_YARN_AGGREGATOR_EXECUTOR_CORES = "spark.yarn.aggregator.executor.cores";
   public static final String SPARK_YARN_AGGREGATOR_EXECUTOR_MEMORY = "spark.yarn.aggregator.executor.memory";
   
   
   public static final String SPARK_METRICS_VEHICLE_CONFIGURATION_FILE = "spark.metrics.vehicle.configuration.file";
   public static final String SPARK_METRICS_AGGREGATOR_CONFIGURATION_FILE = "spark.metrics.aggregator.configuration.file";

   public static final String SPARK_RUN_ODE_AGGREGATOR_IN_VDP = "spark.run.ode.aggregator.in.vdp";
   public static final String SPARK_RUN_AGGREGATOR_IN_SLIDING_WINDOW = "spark.run.aggregator.in.sliding.window";
   public static final String SPARK_ODE_AGGREGATOR_ENABLED = "spark.ode.aggregator.enabled";
   public static final String SPARK_USE_PARALLEL_RECEIVERS = "spark.use.parallel.receivers";

   public static final String SPARK_ROAD_SEGMENT_SNAPPING_TOLERANCE = "spark.road.segment.snapping.tolerance";

   // Kafka Parameters
   public static final String KAFKA_METADATA_BROKER_LIST = "kafka.metadata.broker.list";
   public static final String KAFKA_CONSUMER_THREADS = "kafka.consumer.threads";
   public static final String ZK_CONNECTION_STRINGS = "zk.connection.strings";

   /////////////////////////////////////////////////////////////////////////////
   // Topics used by the Spark
   public static final String SPARK_DATA_PROCESSOR_INPUT_TOPIC = "spark.data.processor.input.topic";
   public static final String SPARK_AGGREGATOR_INPUT_TOPIC = "spark.aggregator.input.topic";
   public static final String SPARK_AGGREGATOR_OUTPUT_TOPIC = "spark.aggregator.output.topic";
   /////////////////////////////////////////////////////////////////////////////
   
   public static final String TOKEN_KEY_RSA_PEM = "token.key.rsa.pem";

   public static final String METRICS_PREFIX = "metrics.prefix";
   public static final String METRICS_POLLING_RATE_SECONDS = "metrics.polling.rate.seconds";
   public static final String METRICS_GRAPHITE_HOST = "metrics.graphite.host";
   public static final String METRICS_GRAPHITE_PORT = "metrics.graphite.port";


   private static AppContext instance = null;

   private ServletContext servletContext;

   private String sparkMaster;
   private SparkConf sparkConf;
   private JavaSparkContext sparkContextLocal;
   // private SQLContext sqlContext;
   private boolean streamingContextStarted = false;
   private YarnClientManager vehicleProcessorManager = null;
   private YarnClientManager aggregatorManager = null;

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

      String hostname = System.getenv("HOSTNAME");
      String hostSpecificUid;
      if (hostname == null) {
         /*
          * If running on windows host, HOSTNAME environment variable is usually
          * not defined. So we'll assume that the software should be run in
          * local loopbackTest mode.
          */
         this.sparkMaster = "local[2]";
         this.servletContext.setInitParameter(SPARK_MASTER, this.sparkMaster);
         this.servletContext.setInitParameter(LOOPBACK_TEST, "true");
         
         //Let's get the hostname a different way
         try {
            hostname = InetAddress.getLocalHost().getHostName();
            hostSpecificUid = hostname + "-" + System.currentTimeMillis();
         } catch (UnknownHostException e) {
            // Let's just use a random hostname
            hostname = UUID.randomUUID().toString();
            hostSpecificUid = hostname;
         }

      } else {
         hostSpecificUid = hostname + "-" + System.currentTimeMillis();
         this.sparkMaster = getParam(SPARK_MASTER);
         this.servletContext.setInitParameter(LOOPBACK_TEST, "false");
      }

      this.servletContext.setInitParameter(ODE_HOSTNAME, hostname);
      // Create host-specific topic names and add to init parameters
      //////////////////////////////////////////////////////////////////////////
      
      this.servletContext.setInitParameter(HOST_SPECIFIC_UID,
            hostSpecificUid );
      
      this.servletContext.setInitParameter(SPARK_DATA_PROCESSOR_INPUT_TOPIC,
            SPARK_DATA_PROCESSOR_INPUT_TOPIC + "-" + hostSpecificUid);

      this.servletContext.setInitParameter(SPARK_AGGREGATOR_OUTPUT_TOPIC,
            SPARK_AGGREGATOR_OUTPUT_TOPIC + "-" + hostSpecificUid);

      this.servletContext.setInitParameter(SPARK_AGGREGATOR_INPUT_TOPIC,
            SPARK_AGGREGATOR_INPUT_TOPIC + "-" + hostSpecificUid);

      //////////////////////////////////////////////////////////////////////////

      sparkConf = new SparkConf()
            .setMaster(sparkMaster)
            .setAppName(context.getServletContextName())
            .set("spark.shuffle.manager", "SORT")
            .set(SPARK_STREAMING_MICROBATCH_DURATION_MS,
                  getParam(SPARK_STREAMING_MICROBATCH_DURATION_MS,
                        String.valueOf(
                        AppContext.DEFAULT_SPARK_STREAMING_MICROBATCH_DURATION_MS)))
            .set(SPARK_STREAMING_WINDOW_MICROBATCHES,
                  getParam(SPARK_STREAMING_WINDOW_MICROBATCHES,
                        String.valueOf(DEFAULT_SPARK_STREAMING_WINDOW_MICROBATCHES)))
            .set(SPARK_STREAMING_SLIDE_MICROBATCHES,
                  getParam(SPARK_STREAMING_SLIDE_MICROBATCHES,
                        String.valueOf(DEFAULT_SPARK_STREAMING_SLIDE_MICROBATCHES)))
            .set(SPARK_STATIC_WEATHER_FILE_LOCATION,
                  getParam(SPARK_STATIC_WEATHER_FILE_LOCATION))
            .set(SPARK_STATIC_SANITIZATION_FILE_LOCATION,
                  getParam(SPARK_STATIC_SANITIZATION_FILE_LOCATION))
            .set(SPARK_STATIC_VALIDATION_FILE_LOCATION,
                  getParam(SPARK_STATIC_VALIDATION_FILE_LOCATION))
            .set(SPARK_ROAD_SEGMENT_SNAPPING_TOLERANCE,
                  getParam(SPARK_ROAD_SEGMENT_SNAPPING_TOLERANCE,
                        String.valueOf(
                        AppContext.DEFAULT_SPARK_ROAD_SEGMENT_SNAPPING_TOLERANCE)))
            .set(SPARK_DATA_PROCESSOR_INPUT_TOPIC,
                  getParam(SPARK_DATA_PROCESSOR_INPUT_TOPIC))
            .set(SPARK_AGGREGATOR_OUTPUT_TOPIC,
                  getParam(SPARK_AGGREGATOR_OUTPUT_TOPIC))
            .set(SPARK_AGGREGATOR_INPUT_TOPIC,
                  getParam(SPARK_AGGREGATOR_INPUT_TOPIC))
            .set(SPARK_USE_PARALLEL_RECEIVERS, 
                  Boolean.toString(getBoolean(SPARK_SCHEDULER_MODE, 
                        DEFAULT_SPARK_USE_PARALLEL_RECEIVERS)))
            .set(SPARK_SCHEDULER_MODE, 
                  getParam(SPARK_SCHEDULER_MODE, 
                        DEFAULT_SPARK_SCHEDULER_MODE))
            .set(SPARK_RUN_ODE_AGGREGATOR_IN_VDP, 
                  Boolean.toString(getBoolean(SPARK_RUN_ODE_AGGREGATOR_IN_VDP, 
                        DEFAULT_SPARK_RUN_ODE_AGGREGATOR_IN_VDP)))
            .set(SPARK_ODE_AGGREGATOR_ENABLED, 
                  Boolean.toString(getBoolean(SPARK_ODE_AGGREGATOR_ENABLED, 
                        DEFAULT_SPARK_ODE_AGGREGATOR_ENABLED)))
            .set(SPARK_RUN_AGGREGATOR_IN_SLIDING_WINDOW, 
                  Boolean.toString(getBoolean(SPARK_RUN_AGGREGATOR_IN_SLIDING_WINDOW, 
                        DEFAULT_SPARK_RUN_AGGREGATOR_IN_SLIDING_WINDOW)));

      // DEBUG ONLY
      // For debugging only and running the app on local machine
      // without Spark
      // FOR TEST ONLY
      if (!loopbackTest()) {
         try {
            //Start Metrics Reporter
            logger.info("Starting Graphite Metrics Reporter...");
            OdeMetrics.getInstance().startGraphiteReport();

            if (sparkMaster.startsWith("yarn")) {
               sparkConf
                     .set("spark.yarn.jar",
                           SPARK_HOME + "/lib/" + getParam(SPARK_ASSEMBLY_JAR))
                     .setExecutorEnv("CLASSPATH",
                           "$CLASSPATH:" + SPARK_HOME + "/lib/*:"
                                 + "/usr/hdp/current/hadoop-client/*:"
                                 + "/usr/hdp/current/hadoop-client/lib/*:"
                                 + "/usr/hdp/current/hadoop-hdfs-client/*:"
                                 + "/usr/hdp/current/hadoop-hdfs-client/lib/*:"
                                 + "/usr/hdp/current/hadoop-yarn-client/*:"
                                 + "/usr/hdp/current/hadoop-yarn-client/lib/*")
                     // .setSparkHome(SPARK_HOME)
                     // .setExecutorEnv("SPARK_HOME", SPARK_HOME)
                     // .setExecutorEnv("HADOOP_CONF_DIR", HADOOP_CONF_DIR)
                     // .setExecutorEnv("YARN_CONF_DIR", YARN_CONF_DIR)
                     // .setExecutorEnv("HADOOP_HOME", HADOOP_HOME)
                     // .setExecutorEnv("HADOOP_YARN_HOME", HADOOP_YARN_HOME )
                     // .setExecutorEnv("SPARK_YARN_MODE", "true")
                     // .set("spark.yarn.appMasterEnv.SPARK_YARN_MODE","true")

                     // .set("spark.yarn.appMasterEnv.SPARK_HOME",SPARK_HOME)
                     // .set("spark.yarn.appMasterEnv.SPARK_YARN_MODE", "false")
                     // .set("spark.yarn.appMasterEnv.HADOOP_CONF_DIR",
                     // HADOOP_CONF_DIR)
                     // .set("spark.yarn.appMasterEnv.YARN_CONF_DIR",
                     // YARN_CONF_DIR)
                     // .set("spark.yarn.appMasterEnv.HADOOP_HOME", HADOOP_HOME)
                     // .set("spark.yarn.appMasterEnv.HADOOP_YARN_HOME",HADOOP_YARN_HOME)
                     .set("spark.yarn.application.classpath",
                           "$CLASSPATH:$HADOOP_CONF_DIR:"
                                 + "/usr/hdp/current/hadoop-client/*:"
                                 + "/usr/hdp/current/hadoop-client/lib/*:"
                                 + "/usr/hdp/current/hadoop-hdfs-client/*:"
                                 + "/usr/hdp/current/hadoop-hdfs-client/lib/*:"
                                 + "/usr/hdp/current/hadoop-yarn-client/*:"
                                 + "/usr/hdp/current/hadoop-yarn-client/lib/*")
                                 //
                                 // .set("spark.yarn.access.namenodes","hdfs://localhost.localdomain:8020")
                                 // .set("spark.yarn.am.extraJavaOptions","-Dhdp.version=2.3.0.0-2557")
                                 // // TODO If required for cluster use,
                                 // .set("spark.driver.extraJavaOptions"
                                 // ,"-Dhdp.version=2.3.0.0-2557")// TODO add
                                 // these variables to web.xml

               // .set("spark.yarn.appMasterEnv.hdp.version","2.3.0.0-2557")
               // // Use Kryo to speed up serialization, recommended as default
               // setup for Spark Streaming
               // //
               // http://spark.apache.org/docs/1.1.0/tuning.html#data-serialization
               // .set("spark.serializer",
               // "org.apache.spark.serializer.KryoSerializer")
               // .set("spark.kryo.registrator", .class.getName);
               // Enable experimental sort-based shuffle manager that is more
               // memory-efficient in environments with small
               // executors, such as YARN. Will most likely become the default
               // in future Spark versions.
               // https://spark.apache.org/docs/1.1.0/configuration.html#shuffle-behavior
               // // Force RDDs generated and persisted by Spark Streaming to be
               // automatically unpersisted from Spark's memory.
               // // The raw input data received by Spark Streaming is also
               // automatically cleared. (Setting this to false will
               // // allow the raw data and persisted RDDs to be accessible
               // outside the streaming application as they will not be
               // // cleared automatically. But it comes at the cost of higher
               // memory usage in Spark.)
               // //
               // http://spark.apache.org/docs/1.1.0/configuration.html#spark-streaming
               // .set("spark.streaming.unpersist", "true")
               // .set("spark.metrics.conf",
               // "/usr/hdp/current/spark-client/conf/metrics.properties")
               ;
               
               
               // Load external Spark Yarn Properties
               // Properties sparkYarnPropertyFile = new Properties();
               // String sparkConfigFilePath =
               // getParam(SPARK_YARN_CONFIGURATION_FILE);
               //
               // if( null != sparkConfigFilePath &&
               // !sparkConfigFilePath.equals(""))
               // {
               // sparkYarnPropertyFile.load(this.servletContext.getResourceAsStream(sparkConfigFilePath));
               // Enumeration<?> sparkYarnProperties =
               // sparkYarnPropertyFile.propertyNames();
               //
               // while (sparkYarnProperties.hasMoreElements()){
               // String key = (String) sparkYarnProperties.nextElement();
               // sparkConf.set(key,sparkYarnPropertyFile.getProperty(key));
               // }
               // }
               startSparkOnYarn();
            } else { // Spark Master = local
               String absolutePath = this.servletContext
                     .getRealPath(getParam(SPARK_CONFIGURATION_DIRECTORY_HOME));
               sparkConf.set("spark.metrics.conf", absolutePath + File.separator
                     + getParam(SPARK_METRICS_VEHICLE_CONFIGURATION_FILE));
               sparkContextLocal = getOrSetSparkContextLocal();
            }
         } catch (Throwable t) {
            logger.error("Error setting sparkConf.", t);
         }

      } else {
         logger.info("*** RUNNING WITHOUT HADOOP STACK ***");
         
//         //Start Console Metrics Reporter
//         logger.info("Starting Console Metrics Reporter...");
//         OdeMetrics.getInstance().startConsoleReport();
      }

      Enumeration<String> parmNames = context.getInitParameterNames();

      while (parmNames.hasMoreElements()) {
         String key = parmNames.nextElement();
         logger.info("Configuration Parameter {}:{}", key,
               key.contains("password") ? "********"
                     : context.getInitParameter(key));
      }
   }

   public static AppContext getInstance() {
      if (null == instance) {
         synchronized (AppContext.class) {
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

   public String getParam(String key, String defaultValue) {
      String result = getParam(key);
      if (result != null) {
         return result;
      } else {
         return defaultValue;
      }
   }

   public int getInt(String key, int defaultValue) {
      String result = getParam(key);
      if (result != null) {
         return Integer.parseInt(result);
      } else {
         return defaultValue;
      }
   }

   public long getLong(String key, long defaultValue) {
      String result = getParam(key);
      if (result != null) {
         return Long.parseLong(result);
      } else {
         return defaultValue;
      }
   }

   public double getDouble(String key, double defaultValue) {
      String result = getParam(key);
      if (result != null) {
         return Double.parseDouble(result);
      } else {
         return defaultValue;
      }
   }

   public boolean getBoolean(String key, boolean defaultValue) {
      String result = getParam(key);
      if (result != null) {
         return Boolean.parseBoolean(result);
      } else {
         return defaultValue;
      }
   }

   public ServletContext getServletContext() {
      return servletContext;
   }

   public SparkConf getSparkConf() {
      return sparkConf;
   }

   public JavaSparkContext getOrSetSparkContextLocal() {
      if (sparkContextLocal == null) {
         logger.info("Creating Spark Context...");
         sparkContextLocal = new JavaSparkContext(sparkConf);
      }
      return sparkContextLocal;
   }

   public JavaSparkContext getSparkContext() {
      return sparkContextLocal;
   }

   public void setSparkContext(JavaSparkContext sparkContext) {
      this.sparkContextLocal = sparkContext;
   }

   // public SQLContext getSparkSQLContext() {
   // return sqlContext;
   // }

   public void shutDown() {
      stopSparkOnYarn();
   }

   public synchronized void startSparkOnYarn() {
      if (!streamingContextStarted) {
         streamingContextStarted = true;
         String absolutePath = this.servletContext
               .getRealPath(getParam(SPARK_CONFIGURATION_DIRECTORY_HOME));
         logger.info("Spark Properties File Directory Path: {} ", absolutePath);

         try {
            logger.info("Starting Spark Jobs ...");


            if (null == vehicleProcessorManager) {
               SparkConf cloneConf = sparkConf.clone()
                     .set("spark.app.name", getParam(HOST_SPECIFIC_UID) + "-VDP");
               
               if  (StringUtils.isNotEmpty(getParam(SPARK_YARN_VEHICLE_DRIVER_CORES)))
               {
                  cloneConf.set("spark.yarn.am.cores", getParam(SPARK_YARN_VEHICLE_DRIVER_CORES));
               }
               if  (StringUtils.isNotEmpty(getParam(SPARK_YARN_VEHICLE_DRIVER_MEMORY)))
               {
                  cloneConf.set("spark.yarn.am.memory", getParam(SPARK_YARN_VEHICLE_DRIVER_MEMORY));
               } 

               vehicleProcessorManager = new YarnClientManager(cloneConf);

               vehicleProcessorManager
                     .setKafkaMetaDataBrokerList(
                           getParam(KAFKA_METADATA_BROKER_LIST))
                     .setZkConnectionString(getParam(ZK_CONNECTION_STRINGS))
                     .setNumPartitions(getParam(KAFKA_CONSUMER_THREADS,
                           String.valueOf(DEFAULT_KAFKA_CONSUMER_THREADS)))
                     .setInputTopic(
                           getParam(SPARK_DATA_PROCESSOR_INPUT_TOPIC))
                     .setSparkStreamingMicrobatchDuration(
                           getParam(SPARK_STREAMING_MICROBATCH_DURATION_MS,
                                 String.valueOf(DEFAULT_SPARK_STREAMING_MICROBATCH_DURATION_MS)))
                     .setClass("com.bah.ode.spark.VehicleDataProcessorWrapper")
                     .addFiles("file://" + absolutePath + "/"
                           + getParam(SPARK_METRICS_VEHICLE_CONFIGURATION_FILE))
                     .setUserJar(DEPLOY_HOME + File.separator
                           + getParam(ODE_SPARK_JAR));
              
              // Default Parameters are provided in the Yarn Client Manager Class
              if  (StringUtils.isNotEmpty(getParam(SPARK_YARN_VEHICLE_DRIVER_CORES)))
              {
                 vehicleProcessorManager.setDriverCores(getParam(SPARK_YARN_VEHICLE_DRIVER_CORES));
              }
              if  (StringUtils.isNotEmpty(getParam(SPARK_YARN_VEHICLE_DRIVER_MEMORY)))
              {
                 vehicleProcessorManager.setDriverMemory(getParam(SPARK_YARN_VEHICLE_DRIVER_MEMORY));
              } 
              if  (StringUtils.isNotEmpty(getParam(SPARK_YARN_VEHICLE_EXECUTOR_CORES)))
              {
                 vehicleProcessorManager.setExectorsCores(getParam(SPARK_YARN_VEHICLE_EXECUTOR_CORES));
              }
              if  (StringUtils.isNotEmpty(getParam(SPARK_YARN_VEHICLE_EXECUTOR_MEMORY)))
              {
                 vehicleProcessorManager.setExecutorMemory(getParam(SPARK_YARN_VEHICLE_EXECUTOR_MEMORY));
              } 
             
               String sparkConfigFilePath = getParam(
                     SPARK_YARN_CONFIGURATION_FILE);

               if (null != sparkConfigFilePath
                     && !sparkConfigFilePath.equals("")) {
                  vehicleProcessorManager
                        .setSparkConfPropertyFile(this.servletContext
                              .getResourceAsStream(sparkConfigFilePath));
               }
               
               ApplicationId vehicleProcessorAppId = 
                     vehicleProcessorManager.submitSparkJob();
               logger.info("*** Started Vehicle Data Processor. ApplicationID: {} ***",
                     vehicleProcessorAppId.toString());

            }

            if (null == aggregatorManager &&
                getBoolean(SPARK_ODE_AGGREGATOR_ENABLED, 
                      DEFAULT_SPARK_ODE_AGGREGATOR_ENABLED) &&
                !getBoolean(
                      AppContext.SPARK_RUN_ODE_AGGREGATOR_IN_VDP, 
                      AppContext.DEFAULT_SPARK_RUN_ODE_AGGREGATOR_IN_VDP)) {
               logger.info("Aggregator is enabled AND configured to run in a separate Spark application");
               
               SparkConf cloneConf = sparkConf.clone()
                     .set("spark.app.name", getParam(HOST_SPECIFIC_UID) + "-VDA");
               
               if  (StringUtils.isNotEmpty(getParam(SPARK_YARN_AGGREGATOR_DRIVER_CORES)))
               {
                  cloneConf.set("spark.yarn.am.cores", getParam(SPARK_YARN_AGGREGATOR_DRIVER_CORES));
               }
               if  (StringUtils.isNotEmpty(getParam(SPARK_YARN_AGGREGATOR_DRIVER_MEMORY)))
               {
                  cloneConf.set("spark.yarn.am.memory", getParam(SPARK_YARN_AGGREGATOR_DRIVER_MEMORY));
               } 

               aggregatorManager = new YarnClientManager(cloneConf);
               
               aggregatorManager
                     .setKafkaMetaDataBrokerList(
                           getParam(KAFKA_METADATA_BROKER_LIST))
                     .setZkConnectionString(getParam(ZK_CONNECTION_STRINGS))
                     .setNumPartitions(getParam(KAFKA_CONSUMER_THREADS,
                           String.valueOf(DEFAULT_KAFKA_CONSUMER_THREADS)))
                     .setInputTopic(
                           getParam(SPARK_AGGREGATOR_INPUT_TOPIC))
                     .setUserJar(DEPLOY_HOME + File.separator
                           + getParam(ODE_SPARK_JAR))
                     .addFiles("file://" + absolutePath + "/"
                           + getParam(
                                 SPARK_METRICS_AGGREGATOR_CONFIGURATION_FILE))
                     .setClass(
                           "com.bah.ode.spark.VehicleDataAggregatorWrapper");
               
               /*
                * If the aggregator is to run in a sliding window, the microbatch
                * durations is the normal duration. Otherwise, microbatch duration
                * should be the size of the aggregation window.
                */
               int microbatchDuration = getInt(SPARK_STREAMING_MICROBATCH_DURATION_MS,
                     DEFAULT_SPARK_STREAMING_MICROBATCH_DURATION_MS);
               int windowSize = getInt(SPARK_STREAMING_WINDOW_MICROBATCHES,
                     DEFAULT_SPARK_STREAMING_WINDOW_MICROBATCHES);
               if (getBoolean(SPARK_RUN_AGGREGATOR_IN_SLIDING_WINDOW, 
                     DEFAULT_SPARK_RUN_AGGREGATOR_IN_SLIDING_WINDOW)) {
                  int slideSize = getInt(SPARK_STREAMING_SLIDE_MICROBATCHES,
                        DEFAULT_SPARK_STREAMING_SLIDE_MICROBATCHES);
                  aggregatorManager.setSparkStreamingMicrobatchDuration(
                        String.valueOf(microbatchDuration));
                  logger.info("Running Aggregator in Sliding Window. "
                        + "Aggregator Microbatch duration: {} ms. "
                        + "Window size: {} ms. "
                        + "Slide Duration: {} ms",
                        microbatchDuration, microbatchDuration * windowSize,
                        microbatchDuration * slideSize);
               } else {
                  aggregatorManager.setSparkStreamingMicrobatchDuration(
                        String.valueOf(microbatchDuration * windowSize));
                  logger.info("Running Aggregator "
                        + "with Microbatch duration: {} ms",
                        microbatchDuration * windowSize);
               }
               // Default Parameters are provided in the Yarn Client Manager Class
               if  (StringUtils.isNotEmpty(getParam(SPARK_YARN_AGGREGATOR_DRIVER_CORES)))
               {
            	   aggregatorManager.setDriverCores(getParam(SPARK_YARN_AGGREGATOR_DRIVER_CORES));
               }
               if  (StringUtils.isNotEmpty(getParam(SPARK_YARN_AGGREGATOR_DRIVER_MEMORY)))
               {
            	   aggregatorManager.setDriverMemory(getParam(SPARK_YARN_AGGREGATOR_DRIVER_MEMORY));
               } 
               if  (StringUtils.isNotEmpty(getParam(SPARK_YARN_AGGREGATOR_EXECUTOR_CORES)))
               {
            	   aggregatorManager.setExectorsCores(getParam(SPARK_YARN_AGGREGATOR_EXECUTOR_CORES));
               }
               if  (StringUtils.isNotEmpty(getParam(SPARK_YARN_AGGREGATOR_EXECUTOR_MEMORY)))
               {
            	   aggregatorManager.setExecutorMemory(getParam(SPARK_YARN_AGGREGATOR_EXECUTOR_MEMORY));
               } 

               String sparkAggregatorConfigFilePath = getParam(
                     SPARK_YARN_AGGREGATOR_CONFIGURATION_FILE);

               if (null != sparkAggregatorConfigFilePath
                     && !sparkAggregatorConfigFilePath.equals("")) {
                  aggregatorManager.setSparkConfPropertyFile(this.servletContext
                        .getResourceAsStream(sparkAggregatorConfigFilePath));
               }
               
               ApplicationId aggregatorAppId = aggregatorManager.submitSparkJob();
               logger.info("*** Started Aggregator. ApplicationID: {} ***",
                     aggregatorAppId.toString());

            }

         } catch (Throwable t1) {
            logger.error("*** Unable to start Spark on Yarn ***",
                     t1);
         }
      }
   }

   public synchronized void stopSparkOnYarn() {
      if (streamingContextStarted) {
         try {

            if (null != vehicleProcessorManager) {
               vehicleProcessorManager.stopSparkJob();
            }

            if (null != aggregatorManager) {
               aggregatorManager.stopSparkJob();
            }

            streamingContextStarted = false;
            logger.info("*** Spark Streaming Context Stopped ***");
         } catch (Throwable t) {
            logger.warn("*** Error stopping Spark Streaming Context ***", t);
         }
      }
   }

   public static boolean loopbackTest() {
      return Boolean.parseBoolean(AppContext.getInstance()
            .getParam(LOOPBACK_TEST, "false"));
   }
}
