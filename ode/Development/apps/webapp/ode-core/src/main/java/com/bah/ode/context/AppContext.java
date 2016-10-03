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
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Scanner;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.yarn.api.records.ApplicationId;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.launcher.SparkLauncher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.metrics.OdeMetrics;
import com.bah.ode.util.CommonUtils;
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
   public static final int DEFAULT_DDS_NUM_VSR_IN_BUNDLE_TO_USE = 10;
   public static final int DEFAULT_DATA_SEQUENCE_REORDER_DELAY = 1000;
   public static final int DEFAULT_DATA_SEQUENCE_REORDER_PERIOD = 3500;
   public static final int DEFAULT_SPARK_STREAMING_MICROBATCH_DURATION_MS = 1000;
   public static final int DEFAULT_SPARK_STREAMING_WINDOW_MICROBATCHES = 60;
   public static final int DEFAULT_SPARK_STREAMING_SLIDE_MICROBATCHES = 30;
   public static final int DEFAULT_KAFKA_CONSUMER_THREADS = 1;
   public static final String DEFAULT_KAFKA_PRODUCER_TYPE = "sync";

   public static final int DEFAULT_SPARK_ROAD_SEGMENT_SNAPPING_TOLERANCE = 20;
   public static final int DEFAULT_METRICS_GRAPHITE_PORT = 2003;
   public static final int DEFAULT_METRICS_POLLING_RATE_SECONDS = 10;

   public static final String DEFAULT_SPARK_SCHEDULER_MODE = "FIFO";
   public static final boolean DEFAULT_SPARK_RUN_AGGREGATOR_IN_TRANSFORMER = false;
   public static final boolean DEFAULT_SPARK_ODE_AGGREGATOR_ENABLED = true;
   public static final boolean DEFAULT_SPARK_RUN_AGGREGATOR_IN_SLIDING_WINDOW = true;
   public static final String DEFAULT_SPARK_RECEIVER = "single";


   private static final String HOST_SPECIFIC_UID = "HOST_SPECIFIC_UID";


   public static final String LOOPBACK_TEST = "loopback.test";

   // SparkConf related Constants
   public static final String ODE_SPARK_JAR = "ode.spark.jar";

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

   public static final String DDS_WEBSOCKET_URI = "dds.websocket.uri";
   public static final String DDS_KEYSTORE_FILE_PATH = "dds.keystore.file.path";
   public static final String DDS_KEYSTORE_PASSWORD = "dds.keystore.password";
   public static final String DDS_CAS_URL = "dds.cas.url";
   public static final String DDS_CAS_USERNAME = "dds.cas.username";
   public static final String DDS_CAS_PASSWORD = "dds.cas.password";
   public static final String DDS_NUM_VSR_IN_BUNDLE_TO_USE = "dds.num.vsr.in.bundle.to.use";
   public static final String DATA_SEQUENCE_REORDER_DELAY = "data.sequence.reorder.delay";
   public static final String DATA_SEQUENCE_REORDER_PERIOD = "data.sequence.reorder.period";
   public static final String SERVICE_REGION = "service.region";
   
   // Spark parameters
   /* 
    * All spark parameters must start with "spark." for Spark to recognize them.
    */
   public static final String SPARK_HOME = "spark.home";
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
   public static final String SPARK_YARN_TRANSFORMER_CONFIGURATION_FILE = "spark.yarn.transformer.configuration.file";
   public static final String SPARK_YARN_AGGREGATOR_CONFIGURATION_FILE = "spark.yarn.aggregator.configuration.file";
   public static final String SPARK_STANDALONE_PROPERTIES_FILE = "spark.standalone.properties.file";
   
   // SPARK ON YARN Cluster Resource Params
   // Can be used to override defaults
   public static final String SPARK_YARN_TRANSFORMER_DRIVER_CORES = "spark.yarn.transformer.driver.cores";
   public static final String SPARK_YARN_TRANSFORMER_DRIVER_MEMORY = "spark.yarn.transformer.driver.memory";
   public static final String SPARK_YARN_TRANSFORMER_EXECUTOR_CORES = "spark.yarn.transformer.executor.cores";
   public static final String SPARK_YARN_TRANSFORMER_EXECUTOR_MEMORY = "spark.yarn.transformer.executor.memory";
   public static final String SPARK_YARN_AGGREGATOR_DRIVER_CORES = "spark.yarn.aggregator.driver.cores";
   public static final String SPARK_YARN_AGGREGATOR_DRIVER_MEMORY = "spark.yarn.aggregator.driver.memory";
   public static final String SPARK_YARN_AGGREGATOR_EXECUTOR_CORES = "spark.yarn.aggregator.executor.cores";
   public static final String SPARK_YARN_AGGREGATOR_EXECUTOR_MEMORY = "spark.yarn.aggregator.executor.memory";
   
   
   public static final String SPARK_METRICS_TRANSFORMER_CONFIGURATION_FILE = "spark.metrics.transformer.configuration.file";
   public static final String SPARK_METRICS_AGGREGATOR_CONFIGURATION_FILE = "spark.metrics.aggregator.configuration.file";

   public static final String SPARK_RUN_AGGREGATOR_IN_TRANSFORMER = "spark.run.aggregator.in.transformer";
   public static final String SPARK_RUN_AGGREGATOR_IN_SLIDING_WINDOW = "spark.run.aggregator.in.sliding.window";
   public static final String SPARK_ODE_AGGREGATOR_ENABLED = "spark.ode.aggregator.enabled";
   public static final String SPARK_RECEIVER = "spark.receiver";

   public static final String SPARK_ROAD_SEGMENT_SNAPPING_TOLERANCE = "spark.road.segment.snapping.tolerance";

   // Kafka Parameters
   public static final String KAFKA_METADATA_BROKER_LIST = "kafka.metadata.broker.list";
   public static final String KAFKA_CONSUMER_THREADS = "kafka.consumer.threads";
   public static final String ZK_CONNECTION_STRINGS = "zk.connection.strings";
   public static final String SPARK_KAFKA_PRODUCER_TYPE = "spark.kafka.produce.type";

   /////////////////////////////////////////////////////////////////////////////
   // Topics used by Spark
   public static final String SPARK_TRANSFORMER_INPUT_TOPIC = "spark.vehicle.transformer.input.topic";
   public static final String SPARK_TRANSFORMER_OUTPUT_TOPIC = "spark.vehicle.transformer.output.topic";
   public static final String SPARK_AGGREGATOR_INPUT_TOPIC = "spark.vehicle.aggregator.input.topic";
   public static final String SPARK_AGGREGATOR_OUTPUT_TOPIC = "spark.vehicle.aggregator.output.topic";
   /////////////////////////////////////////////////////////////////////////////
   
   public static final String TOKEN_KEY_RSA_PEM = "token.key.rsa.pem";

   public static final String METRICS_PREFIX = "metrics.prefix";
   public static final String METRICS_POLLING_RATE_SECONDS = "metrics.polling.rate.seconds";
   public static final String METRICS_GRAPHITE_HOST = "metrics.graphite.host";
   public static final String METRICS_GRAPHITE_PORT = "metrics.graphite.port";

   public static final String PASS_THROUGH_OUTPUT_TOPIC = "pass.through.output.topic";


   
   private static AppContext instance = null;

   private ServletContext servletContext;

   private String sparkMaster;
   private JavaSparkContext sparkContextLocal;
   private boolean streamingContextStarted = false;
   private YarnClientManager transformerManager = null;
   private YarnClientManager aggregatorManager = null;

   private String sparkConfigDir;

   private Process transformer;
   private Process aggregator;

   public static String getServletBaseUrl(HttpServletRequest request) {
      String proto = request.getScheme();
      String host = request.getServerName();
      String port = Integer.toString(request.getServerPort());
      String path = request.getContextPath();
      return proto + "://" + host + ":" + port + path;
   }

   private AppContext() {
   }

   public void init(ServletContext context) {
      this.servletContext = context;

      String osName = System.getProperty("os.name");
      String hostSpecificUid;
      if (osName.startsWith("Windows")) {
         /*
          * If running on windows host, HOSTNAME environment variable is usually
          * not defined. So we'll assume that the software should be run in
          * local loopbackTest mode.
          */
         this.sparkMaster = "local[2]";
         this.servletContext.setInitParameter(SPARK_MASTER, this.sparkMaster);
         this.servletContext.setInitParameter(LOOPBACK_TEST, "true");
         
      } else {
         this.sparkMaster = getParam(SPARK_MASTER);
         this.servletContext.setInitParameter(LOOPBACK_TEST, "false");
      }

      logger.info("Spark Master: {}", sparkMaster);
      
      String hostname;
      try {
         hostname = InetAddress.getLocalHost().getHostName();
         //hostSpecificUid = hostname + "-" + System.currentTimeMillis();
      } catch (UnknownHostException e) {
         // Let's just use a random hostname
         hostname = UUID.randomUUID().toString();
      }
      hostSpecificUid = hostname;

      this.servletContext.setInitParameter(ODE_HOSTNAME, hostname);

      // Create host-specific topic names and add to init parameters
      //////////////////////////////////////////////////////////////////////////
      
      this.servletContext.setInitParameter(HOST_SPECIFIC_UID,
            hostSpecificUid );

      this.servletContext.setInitParameter(WEB_SERVER_ROOT, 
           this.servletContext.getRealPath("/"));

      this.servletContext.setInitParameter(SPARK_TRANSFORMER_OUTPUT_TOPIC,
            SPARK_TRANSFORMER_OUTPUT_TOPIC + "-" + hostSpecificUid);
      if (sparkMaster.startsWith("yarn") || sparkMaster.startsWith("spark:") || sparkMaster.startsWith("local")) {
         this.servletContext.setInitParameter(SPARK_TRANSFORMER_INPUT_TOPIC,
               SPARK_TRANSFORMER_INPUT_TOPIC + "-" + hostSpecificUid);
         this.servletContext.setInitParameter(SPARK_AGGREGATOR_INPUT_TOPIC,
               SPARK_AGGREGATOR_INPUT_TOPIC + "-" + hostSpecificUid);
         this.servletContext.setInitParameter(SPARK_AGGREGATOR_OUTPUT_TOPIC,
               SPARK_AGGREGATOR_OUTPUT_TOPIC + "-" + hostSpecificUid);
      } else {
         this.servletContext.setInitParameter(SPARK_TRANSFORMER_INPUT_TOPIC,
               SPARK_TRANSFORMER_INPUT_TOPIC);
         this.servletContext.setInitParameter(SPARK_AGGREGATOR_INPUT_TOPIC,
               SPARK_AGGREGATOR_INPUT_TOPIC);
         this.servletContext.setInitParameter(SPARK_AGGREGATOR_OUTPUT_TOPIC,
               SPARK_AGGREGATOR_OUTPUT_TOPIC);
      }
      


      //////////////////////////////////////////////////////////////////////////

      sparkConfigDir = this.servletContext
            .getRealPath(getParam(SPARK_CONFIGURATION_DIRECTORY_HOME));
      
      logger.info("Spark Properties File Directory Path: {} ", sparkConfigDir);

      SparkConf sparkConf = new SparkConf()
            .setMaster(sparkMaster)
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
            .set(SPARK_TRANSFORMER_INPUT_TOPIC,
                  getParam(SPARK_TRANSFORMER_INPUT_TOPIC))
            .set(SPARK_TRANSFORMER_OUTPUT_TOPIC,
                  getParam(SPARK_TRANSFORMER_OUTPUT_TOPIC))
            .set(SPARK_AGGREGATOR_OUTPUT_TOPIC,
                  getParam(SPARK_AGGREGATOR_OUTPUT_TOPIC))
            .set(SPARK_AGGREGATOR_INPUT_TOPIC,
                  getParam(SPARK_AGGREGATOR_INPUT_TOPIC))
            .set(SPARK_RECEIVER, 
                  getParam(SPARK_RECEIVER, DEFAULT_SPARK_RECEIVER))
            .set(SPARK_SCHEDULER_MODE, getParam(SPARK_SCHEDULER_MODE, 
                                                DEFAULT_SPARK_SCHEDULER_MODE))
            .set(SPARK_RUN_AGGREGATOR_IN_TRANSFORMER, 
                  Boolean.toString(getBoolean(SPARK_RUN_AGGREGATOR_IN_TRANSFORMER, 
                        DEFAULT_SPARK_RUN_AGGREGATOR_IN_TRANSFORMER)))
            .set(SPARK_ODE_AGGREGATOR_ENABLED, 
                  Boolean.toString(getBoolean(SPARK_ODE_AGGREGATOR_ENABLED, 
                        DEFAULT_SPARK_ODE_AGGREGATOR_ENABLED)))
            .set(SPARK_RUN_AGGREGATOR_IN_SLIDING_WINDOW, 
                  Boolean.toString(getBoolean(SPARK_RUN_AGGREGATOR_IN_SLIDING_WINDOW, 
                        DEFAULT_SPARK_RUN_AGGREGATOR_IN_SLIDING_WINDOW)))
            ;

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
               logger.info("Launching Spark on Yarn");
               String hadoopClassPath = "/usr/hdp/current/hadoop-client/*:"
                     + "/usr/hdp/current/hadoop-client/lib/*:"
                     + "/usr/hdp/current/hadoop-hdfs-client/*:"
                     + "/usr/hdp/current/hadoop-hdfs-client/lib/*:"
                     + "/usr/hdp/current/hadoop-yarn-client/*:"
                     + "/usr/hdp/current/hadoop-yarn-client/lib/*";
               sparkConf
                     .set("spark.serializer", "org.apache.spark.serializer.KryoSerializer")
                     .set("spark.yarn.jar",
                           getParam(SPARK_HOME) + "/lib/" + getParam(SPARK_ASSEMBLY_JAR))
                     .setExecutorEnv("CLASSPATH",
                           "$CLASSPATH:" + getParam(SPARK_HOME) + "/lib/*:"
                                 + hadoopClassPath )

                     .set("spark.yarn.application.classpath",
                           "$CLASSPATH:$HADOOP_CONF_DIR:"
                                 + hadoopClassPath)
                     ;
               launchSparkAppsOnYarn(sparkConf);
            } else if (sparkMaster.startsWith("local")) {
               logger.info("Starting Spark locally");
               startSparkLocal(sparkConf);
            } else if (sparkMaster.startsWith("spark:")) {
                  logger.info("Launching Spark on Standalone scheduler");
                  lauchSparkAppsOnStandaloneScheduler();
            } else if (sparkMaster.equalsIgnoreCase("Standalone")) {
               logger.info("Expecting Spark Standalone running externally");
            } else {
               logger.error("Spark to be started in other ways. "
                     + "Make sure spark.master and launch.spark properties"
                     + "are set correctly in web.xml");
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

   public JavaSparkContext getSparkContext() {
      return sparkContextLocal;
   }

   public void setSparkContext(JavaSparkContext sparkContext) {
      this.sparkContextLocal = sparkContext;
   }

   public void shutDown() {
      stopSpark();
   }

   public void setSparkConfFromPropertyFile(SparkConf conf, InputStream file) throws IOException
   {
      Properties props = new Properties();
      props.load(file);
      Enumeration<?> propNames =  props.propertyNames();
       
       while (propNames.hasMoreElements()){
          String key =  (String) propNames.nextElement();
          conf.set(key, props.getProperty(key));
       }
   }
   
   private synchronized void startSparkLocal(SparkConf sparkConf) {
      if (!streamingContextStarted) {
         streamingContextStarted = true;
         if (sparkContextLocal == null) {
            logger.info("Creating Local Spark Context...");

            sparkConf.setAppName(getParam(HOST_SPECIFIC_UID) + "-local")
               .set("spark.metrics.conf", sparkConfigDir + File.separator
                        + getParam(SPARK_METRICS_TRANSFORMER_CONFIGURATION_FILE));

            sparkContextLocal = new JavaSparkContext(sparkConf);
         }
      }
   }

   public synchronized void lauchSparkAppsOnStandaloneScheduler() {
      if (!streamingContextStarted) {
         streamingContextStarted = true;

         try {

            SparkLauncher transformerLauncher = new SparkLauncher()
                  .setSparkHome(getParam(SPARK_HOME))
                  .setAppResource(getParam(WEB_SERVER_ROOT) + "/WEB-INF/lib/" + getParam(ODE_SPARK_JAR))
                  .setMainClass("com.bah.ode.spark.WrapperVehicleDataTransformer")
                  .setAppName(getParam(HOST_SPECIFIC_UID) + "-Transformer")
                  .setMaster(sparkMaster)
                  .addAppArgs(
                        getParam(KAFKA_CONSUMER_THREADS,
                                 String.valueOf(DEFAULT_KAFKA_CONSUMER_THREADS)),
                        getParam(SPARK_TRANSFORMER_INPUT_TOPIC),
                        getParam(ZK_CONNECTION_STRINGS),
                        getParam(KAFKA_METADATA_BROKER_LIST))
                  .setPropertiesFile("file://" + sparkConfigDir + "/"
                        + getParam(SPARK_STANDALONE_PROPERTIES_FILE))
                  .addFile("file://" + sparkConfigDir + "/"
                        + getParam(SPARK_METRICS_TRANSFORMER_CONFIGURATION_FILE))
                  .setConf("spark.serializer", "org.apache.spark.serializer.KryoSerializer")
                  .setConf(SPARK_STREAMING_MICROBATCH_DURATION_MS,
                        getParam(SPARK_STREAMING_MICROBATCH_DURATION_MS,
                              String.valueOf(
                              AppContext.DEFAULT_SPARK_STREAMING_MICROBATCH_DURATION_MS)))
                  .setConf(SPARK_STREAMING_WINDOW_MICROBATCHES,
                        getParam(SPARK_STREAMING_WINDOW_MICROBATCHES,
                              String.valueOf(DEFAULT_SPARK_STREAMING_WINDOW_MICROBATCHES)))
                  .setConf(SPARK_STREAMING_SLIDE_MICROBATCHES,
                        getParam(SPARK_STREAMING_SLIDE_MICROBATCHES,
                              String.valueOf(DEFAULT_SPARK_STREAMING_SLIDE_MICROBATCHES)))
                  .setConf(SPARK_STATIC_WEATHER_FILE_LOCATION,
                        getParam(SPARK_STATIC_WEATHER_FILE_LOCATION))
                  .setConf(SPARK_STATIC_SANITIZATION_FILE_LOCATION,
                        getParam(SPARK_STATIC_SANITIZATION_FILE_LOCATION))
                  .setConf(SPARK_STATIC_VALIDATION_FILE_LOCATION,
                        getParam(SPARK_STATIC_VALIDATION_FILE_LOCATION))
                  .setConf(SPARK_ROAD_SEGMENT_SNAPPING_TOLERANCE,
                        getParam(SPARK_ROAD_SEGMENT_SNAPPING_TOLERANCE,
                              String.valueOf(
                              AppContext.DEFAULT_SPARK_ROAD_SEGMENT_SNAPPING_TOLERANCE)))
                  .setConf(SPARK_TRANSFORMER_INPUT_TOPIC,
                        getParam(SPARK_TRANSFORMER_INPUT_TOPIC))
                  .setConf(SPARK_TRANSFORMER_OUTPUT_TOPIC,
                        getParam(SPARK_TRANSFORMER_OUTPUT_TOPIC))
                  .setConf(SPARK_AGGREGATOR_OUTPUT_TOPIC,
                        getParam(SPARK_AGGREGATOR_OUTPUT_TOPIC))
                  .setConf(SPARK_AGGREGATOR_INPUT_TOPIC,
                        getParam(SPARK_AGGREGATOR_INPUT_TOPIC))
                  .setConf(SPARK_RECEIVER, 
                        getParam(SPARK_RECEIVER, DEFAULT_SPARK_RECEIVER))
                  .setConf(SPARK_SCHEDULER_MODE, getParam(SPARK_SCHEDULER_MODE, 
                                                          DEFAULT_SPARK_SCHEDULER_MODE))
                  .setConf(SPARK_RUN_AGGREGATOR_IN_TRANSFORMER, 
                        Boolean.toString(getBoolean(SPARK_RUN_AGGREGATOR_IN_TRANSFORMER, 
                              DEFAULT_SPARK_RUN_AGGREGATOR_IN_TRANSFORMER)))
                  .setConf(SPARK_ODE_AGGREGATOR_ENABLED, 
                        Boolean.toString(getBoolean(SPARK_ODE_AGGREGATOR_ENABLED, 
                              DEFAULT_SPARK_ODE_AGGREGATOR_ENABLED)))
                  .setConf(SPARK_RUN_AGGREGATOR_IN_SLIDING_WINDOW, 
                        Boolean.toString(getBoolean(SPARK_RUN_AGGREGATOR_IN_SLIDING_WINDOW, 
                              DEFAULT_SPARK_RUN_AGGREGATOR_IN_SLIDING_WINDOW)))
                  .setConf("spark.metrics.conf", 
                        getParam(SPARK_METRICS_TRANSFORMER_CONFIGURATION_FILE))
                  ;

            transformer = transformerLauncher.launch();
            logger.info("Displaying transformer's normal output");
            displaySubProcessOutput(transformer.getInputStream());
            logger.info("Displaying transformer's error output");
            displaySubProcessOutput(transformer.getErrorStream());
           
            logger.info("*** Started Vehicle Data Transformer. PID: {} ***", 
                  CommonUtils.getPidOfProcess(transformer));

            if (getBoolean(SPARK_ODE_AGGREGATOR_ENABLED,    
                           DEFAULT_SPARK_ODE_AGGREGATOR_ENABLED) &&
                !getBoolean(
                      AppContext.SPARK_RUN_AGGREGATOR_IN_TRANSFORMER, 
                      AppContext.DEFAULT_SPARK_RUN_AGGREGATOR_IN_TRANSFORMER)) {
               logger.info("Aggregator is enabled AND configured to run in a separate Spark application");
               
               SparkLauncher aggregatorLauncher = new SparkLauncher()
                     .setSparkHome(getParam(SPARK_HOME))
                     .setAppResource(getParam(WEB_SERVER_ROOT) + "/WEB-INF/lib/" + getParam(ODE_SPARK_JAR))
                     .setMainClass("com.bah.ode.spark.WrapperVehicleDataAggregator")
                     .setAppName(getParam(HOST_SPECIFIC_UID) + "-Aggregator")
                     .setMaster(sparkMaster)
                     .setPropertiesFile("file://" + sparkConfigDir + "/"
                           + getParam(SPARK_STANDALONE_PROPERTIES_FILE))
                     .addFile("file://" + sparkConfigDir + "/"
                           + getParam(SPARK_METRICS_AGGREGATOR_CONFIGURATION_FILE))
                     .setConf("spark.serializer", "org.apache.spark.serializer.KryoSerializer")
                     .setConf(SPARK_STREAMING_MICROBATCH_DURATION_MS,
                           getParam(SPARK_STREAMING_MICROBATCH_DURATION_MS,
                                 String.valueOf(
                                 AppContext.DEFAULT_SPARK_STREAMING_MICROBATCH_DURATION_MS)))
                     .setConf(SPARK_STREAMING_WINDOW_MICROBATCHES,
                           getParam(SPARK_STREAMING_WINDOW_MICROBATCHES,
                                 String.valueOf(DEFAULT_SPARK_STREAMING_WINDOW_MICROBATCHES)))
                     .setConf(SPARK_STREAMING_SLIDE_MICROBATCHES,
                           getParam(SPARK_STREAMING_SLIDE_MICROBATCHES,
                                 String.valueOf(DEFAULT_SPARK_STREAMING_SLIDE_MICROBATCHES)))
                     .setConf(SPARK_STATIC_WEATHER_FILE_LOCATION,
                           getParam(SPARK_STATIC_WEATHER_FILE_LOCATION))
                     .setConf(SPARK_STATIC_SANITIZATION_FILE_LOCATION,
                           getParam(SPARK_STATIC_SANITIZATION_FILE_LOCATION))
                     .setConf(SPARK_STATIC_VALIDATION_FILE_LOCATION,
                           getParam(SPARK_STATIC_VALIDATION_FILE_LOCATION))
                     .setConf(SPARK_ROAD_SEGMENT_SNAPPING_TOLERANCE,
                           getParam(SPARK_ROAD_SEGMENT_SNAPPING_TOLERANCE,
                                 String.valueOf(
                                 AppContext.DEFAULT_SPARK_ROAD_SEGMENT_SNAPPING_TOLERANCE)))
                     .setConf(SPARK_TRANSFORMER_INPUT_TOPIC,
                           getParam(SPARK_TRANSFORMER_INPUT_TOPIC))
                     .setConf(SPARK_TRANSFORMER_OUTPUT_TOPIC,
                           getParam(SPARK_TRANSFORMER_OUTPUT_TOPIC))
                     .setConf(SPARK_AGGREGATOR_OUTPUT_TOPIC,
                           getParam(SPARK_AGGREGATOR_OUTPUT_TOPIC))
                     .setConf(SPARK_AGGREGATOR_INPUT_TOPIC,
                           getParam(SPARK_AGGREGATOR_INPUT_TOPIC))
                     .setConf(SPARK_RECEIVER, 
                           getParam(SPARK_RECEIVER, DEFAULT_SPARK_RECEIVER))
                     .setConf(SPARK_SCHEDULER_MODE, getParam(SPARK_SCHEDULER_MODE, 
                                                             DEFAULT_SPARK_SCHEDULER_MODE))
                     .setConf(SPARK_RUN_AGGREGATOR_IN_TRANSFORMER, 
                           Boolean.toString(getBoolean(SPARK_RUN_AGGREGATOR_IN_TRANSFORMER, 
                                 DEFAULT_SPARK_RUN_AGGREGATOR_IN_TRANSFORMER)))
                     .setConf(SPARK_ODE_AGGREGATOR_ENABLED, 
                           Boolean.toString(getBoolean(SPARK_ODE_AGGREGATOR_ENABLED, 
                                 DEFAULT_SPARK_ODE_AGGREGATOR_ENABLED)))
                     .setConf(SPARK_RUN_AGGREGATOR_IN_SLIDING_WINDOW, 
                           Boolean.toString(getBoolean(SPARK_RUN_AGGREGATOR_IN_SLIDING_WINDOW, 
                                 DEFAULT_SPARK_RUN_AGGREGATOR_IN_SLIDING_WINDOW)))
                     .setConf("spark.metrics.conf", 
                           getParam(SPARK_METRICS_AGGREGATOR_CONFIGURATION_FILE))
               ;
               
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

                  aggregatorLauncher.addAppArgs(
                        getParam(KAFKA_CONSUMER_THREADS, String.valueOf(DEFAULT_KAFKA_CONSUMER_THREADS)),
                        getParam(SPARK_AGGREGATOR_INPUT_TOPIC),
                        getParam(ZK_CONNECTION_STRINGS),
                        getParam(KAFKA_METADATA_BROKER_LIST));

                  logger.info("Running Aggregator in Sliding Window. "
                        + "Aggregator Microbatch duration: {} ms. "
                        + "Window size: {} ms. "
                        + "Slide Duration: {} ms",
                        microbatchDuration, microbatchDuration * windowSize,
                        microbatchDuration * slideSize);
               } else {
                  aggregatorLauncher.addAppArgs(
                        getParam(KAFKA_CONSUMER_THREADS, String.valueOf(DEFAULT_KAFKA_CONSUMER_THREADS)),
                        getParam(SPARK_AGGREGATOR_INPUT_TOPIC),
                        getParam(ZK_CONNECTION_STRINGS),
                        getParam(KAFKA_METADATA_BROKER_LIST),
                                 String.valueOf(String.valueOf(microbatchDuration * windowSize)));

                  logger.info("Running Aggregator "
                        + "with Microbatch duration: {} ms",
                        microbatchDuration * windowSize);
               }
               // Default Parameters are provided in the Yarn Client Manager Class
//               if  (StringUtils.isNotEmpty(getParam(SPARK_YARN_AGGREGATOR_DRIVER_CORES)))
//               {
//                  aggregatorManager.setDriverCores(getParam(SPARK_YARN_AGGREGATOR_DRIVER_CORES));
//               }
//               if  (StringUtils.isNotEmpty(getParam(SPARK_YARN_AGGREGATOR_DRIVER_MEMORY)))
//               {
//                  aggregatorManager.setDriverMemory(getParam(SPARK_YARN_AGGREGATOR_DRIVER_MEMORY));
//               } 
//               if  (StringUtils.isNotEmpty(getParam(SPARK_YARN_AGGREGATOR_EXECUTOR_CORES)))
//               {
//                  aggregatorManager.setExectorsCores(getParam(SPARK_YARN_AGGREGATOR_EXECUTOR_CORES));
//               }
//               if  (StringUtils.isNotEmpty(getParam(SPARK_YARN_AGGREGATOR_EXECUTOR_MEMORY)))
//               {
//                  aggregatorManager.setExecutorMemory(getParam(SPARK_YARN_AGGREGATOR_EXECUTOR_MEMORY));
//               } 

               aggregator = aggregatorLauncher.launch();
               logger.info("*** Started Vehicle Data Aggregator. PID: {} ***", 
                 CommonUtils.getPidOfProcess(aggregator));

            }

         } catch (Throwable t1) {
            logger.error("*** Unable to start Spark on Yarn ***",
                     t1);
         }
      }
   }

   private void displaySubProcessOutput(InputStream tis) {
      if (tis != null) {
         logger.info("Displaying Output Stream");
           Scanner ts = new Scanner(tis);
           
           while (ts.hasNext()) {
              logger.info("transformer==>", ts.nextLine());
           }
           
           ts.close();
      } else {
         logger.info("No output stream to display");
      }
   }

   public synchronized void launchSparkAppsOnYarn(SparkConf sparkConf) {
      if (!streamingContextStarted) {
         streamingContextStarted = true;

         try {
            if (null == transformerManager) {
               sparkConf.set("spark.app.name", getParam(HOST_SPECIFIC_UID) + "-Transformer");
               
               if  (StringUtils.isNotEmpty(getParam(SPARK_YARN_TRANSFORMER_DRIVER_CORES)))
               {
                  sparkConf.set("spark.yarn.am.cores", getParam(SPARK_YARN_TRANSFORMER_DRIVER_CORES));
               }
               if  (StringUtils.isNotEmpty(getParam(SPARK_YARN_TRANSFORMER_DRIVER_MEMORY)))
               {
                  sparkConf.set("spark.yarn.am.memory", getParam(SPARK_YARN_TRANSFORMER_DRIVER_MEMORY));
               } 

               String sparkConfigFilePath = 
                     getParam(SPARK_CONFIGURATION_DIRECTORY_HOME) + File.separator
                     + getParam(SPARK_YARN_TRANSFORMER_CONFIGURATION_FILE);

               if (null != sparkConfigFilePath
                     && !sparkConfigFilePath.equals("")) {
                  setSparkConfFromPropertyFile(sparkConf, this.servletContext
                              .getResourceAsStream(sparkConfigFilePath));
               }

               transformerManager = new YarnClientManager();

               transformerManager
                     .setKafkaMetaDataBrokerList(
                           getParam(KAFKA_METADATA_BROKER_LIST))
                     .setZkConnectionString(getParam(ZK_CONNECTION_STRINGS))
                     .setNumPartitions(getParam(KAFKA_CONSUMER_THREADS,
                           String.valueOf(DEFAULT_KAFKA_CONSUMER_THREADS)))
                     .setInputTopic(
                           getParam(SPARK_TRANSFORMER_INPUT_TOPIC))
                     .setClass("com.bah.ode.spark.WrapperVehicleDataTransformer")
                     .addFile("file://" + sparkConfigDir + "/"
                           + getParam(SPARK_METRICS_TRANSFORMER_CONFIGURATION_FILE))
                     .setUserJar(getParam(WEB_SERVER_ROOT) + "/WEB-INF/lib/" + File.separator
                           + getParam(ODE_SPARK_JAR));

              // Default Parameters are provided in the Yarn Client Manager Class
              if  (StringUtils.isNotEmpty(getParam(SPARK_YARN_TRANSFORMER_DRIVER_CORES)))
              {
                 transformerManager.setDriverCores(getParam(SPARK_YARN_TRANSFORMER_DRIVER_CORES));
              }
              if  (StringUtils.isNotEmpty(getParam(SPARK_YARN_TRANSFORMER_DRIVER_MEMORY)))
              {
                 transformerManager.setDriverMemory(getParam(SPARK_YARN_TRANSFORMER_DRIVER_MEMORY));
              } 
              if  (StringUtils.isNotEmpty(getParam(SPARK_YARN_TRANSFORMER_EXECUTOR_CORES)))
              {
                 transformerManager.setExectorsCores(getParam(SPARK_YARN_TRANSFORMER_EXECUTOR_CORES));
              }
              if  (StringUtils.isNotEmpty(getParam(SPARK_YARN_TRANSFORMER_EXECUTOR_MEMORY)))
              {
                 transformerManager.setExecutorMemory(getParam(SPARK_YARN_TRANSFORMER_EXECUTOR_MEMORY));
              } 
             
              ApplicationId vehicleTransformerAppId = 
                    transformerManager.submitSparkJob(sparkConf);
              
              logger.info("*** Started Vehicle Data Transformer. ApplicationID: {} ***",
                    vehicleTransformerAppId.toString());

            }

            if (null == aggregatorManager &&
                getBoolean(SPARK_ODE_AGGREGATOR_ENABLED, 
                      DEFAULT_SPARK_ODE_AGGREGATOR_ENABLED) &&
                !getBoolean(
                      AppContext.SPARK_RUN_AGGREGATOR_IN_TRANSFORMER, 
                      AppContext.DEFAULT_SPARK_RUN_AGGREGATOR_IN_TRANSFORMER)) {
               logger.info("Aggregator is enabled AND configured to run in a separate Spark application");
               
               SparkConf aggregatorConf = sparkConf.clone()
                     .set("spark.app.name", getParam(HOST_SPECIFIC_UID) + "-Aggregator");
               
               if  (StringUtils.isNotEmpty(getParam(SPARK_YARN_AGGREGATOR_DRIVER_CORES)))
               {
                  aggregatorConf.set("spark.yarn.am.cores", getParam(SPARK_YARN_AGGREGATOR_DRIVER_CORES));
               }
               if  (StringUtils.isNotEmpty(getParam(SPARK_YARN_AGGREGATOR_DRIVER_MEMORY)))
               {
                  aggregatorConf.set("spark.yarn.am.memory", getParam(SPARK_YARN_AGGREGATOR_DRIVER_MEMORY));
               } 

               String sparkAggregatorConfigFilePath = 
                     getParam(SPARK_CONFIGURATION_DIRECTORY_HOME) + File.separator 
                     + getParam(SPARK_YARN_AGGREGATOR_CONFIGURATION_FILE);

               if (null != sparkAggregatorConfigFilePath
                     && !sparkAggregatorConfigFilePath.equals("")) {
                  setSparkConfFromPropertyFile(aggregatorConf, this.servletContext
                        .getResourceAsStream(sparkAggregatorConfigFilePath));
               }
               
               aggregatorManager = new YarnClientManager();
               
               aggregatorManager
                     .setKafkaMetaDataBrokerList(
                           getParam(KAFKA_METADATA_BROKER_LIST))
                     .setZkConnectionString(getParam(ZK_CONNECTION_STRINGS))
                     .setNumPartitions(getParam(KAFKA_CONSUMER_THREADS,
                           String.valueOf(DEFAULT_KAFKA_CONSUMER_THREADS)))
                     .setInputTopic(
                           getParam(SPARK_AGGREGATOR_INPUT_TOPIC))
                     .setUserJar(getParam(WEB_SERVER_ROOT) + "/WEB-INF/lib/" + File.separator
                           + getParam(ODE_SPARK_JAR))
                     .addFile("file://" + sparkConfigDir + "/"
                           + getParam(SPARK_METRICS_AGGREGATOR_CONFIGURATION_FILE))
                     .setClass("com.bah.ode.spark.WrapperVehicleDataAggregator");
               
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
                  logger.info("Running Aggregator in Sliding Window. "
                        + "Aggregator Microbatch duration: {} ms. "
                        + "Window size: {} ms. "
                        + "Slide Duration: {} ms",
                        microbatchDuration, microbatchDuration * windowSize,
                        microbatchDuration * slideSize);
               } else {
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

               ApplicationId aggregatorAppId = aggregatorManager.submitSparkJob(aggregatorConf);
               logger.info("*** Started Aggregator. ApplicationID: {} ***",
                     aggregatorAppId.toString());

            }

         } catch (Throwable t1) {
            logger.error("*** Unable to start Spark on Yarn ***",
                     t1);
         }
      }
   }

   public synchronized void stopSpark() {
      if (streamingContextStarted) {
         try {

            if (null != transformer) {
               transformer.destroyForcibly();
            }

            if (null != aggregator) {
               aggregator.destroyForcibly();
            }

            if (null != transformerManager) {
               transformerManager.stopSparkJob();
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
