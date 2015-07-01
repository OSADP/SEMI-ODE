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

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.streaming.Durations;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.spark.VsdWorkflow;
import com.bah.ode.wrapper.MQTopic;
import com.bah.ode.wrapper.MQTopicInOut;

public class AppContext {
   private static Logger logger = LoggerFactory.getLogger(AppContext.class);

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

	public static final String REQUEST_FILE_DIR = "request.file.dir";
	public static final String RESPONSE_FILE_DIR = "response.file.dir";
	public static final String DEPOSIT_FILE_DIR = "deposit.file.dir";
	public static final String DEPOSIT_SYSTEM_NAME = "deposit.system.name";
	public static final String DEPOSIT_ENCODE_TYPE = "deposit.encode.type";
	public static final String DEPOSIT_DELAY = "deposit.delay";
	
	//Spark parameters
   public static final String SPARK_MASTER = "spark.master";
   public static final String SPARK_STREAMING_DEFAULT_DURATION = "spark.streaming.default.duration";

   public static final String METADATA_BROKER_LIST = "metadata.broker.list";
   public static final String DEFAULT_CONSUMER_THREADS = "default.consumer.threads";
   public static final String ZK_CONNECTION_STRINGS = "zk.connection.strings";
   
   public static final String VSD_INBOUND_TOPIC = "VSD_IN";
   
   private static AppContext instance = null;

   private ServletContext servletContext;
   
   private SparkConf sparkConf;
   private JavaSparkContext sparkContext;
   private JavaStreamingContext ssc;

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

      // DEBUG ONLY
      // For debugging only and running the app on local machine
      // without Spark
      if (!getParam(SPARK_MASTER).isEmpty()) {
         sparkConf = new SparkConf()
            .setMaster(getParam(SPARK_MASTER))
            .setAppName(context.getServletContextName());
         
         sparkContext = new JavaSparkContext(sparkConf);
         ssc = new JavaStreamingContext(
               sparkContext,
               Durations.seconds(Integer.parseInt(
                     getParam(SPARK_STREAMING_DEFAULT_DURATION))));
         
         
         int numParitions = 
               Integer.parseInt(getParam(DEFAULT_CONSUMER_THREADS));
         
         VsdWorkflow vsdwf = new VsdWorkflow(this);
         vsdwf.setup(new MQTopicInOut(MQTopic.create(VSD_INBOUND_TOPIC, numParitions),
               MQTopic.create("VSD_OUT", numParitions)));
         
         ssc.start();
         logger.info("*** Spark Streaming Context Started ***");
      } else {
         logger.info("*** SPARK DISABLED FOR DEBUG ***");
      }
      
      @SuppressWarnings("unchecked")
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

   public JavaSparkContext getSparkContext() {
      return sparkContext;
   }

   public JavaStreamingContext getSparkStreamingConext() {
      return ssc;
   }

   public void shutDown() {
      if (null != ssc) {
         ssc.stop(true);
         ssc.close();
         ssc = null;
      }
      
   }

}
