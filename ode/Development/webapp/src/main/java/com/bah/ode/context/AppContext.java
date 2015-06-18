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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppContext {
   private static Logger logger = LoggerFactory.getLogger(AppContext.class);

   public static final String WEB_SERVER_ROOT = "web.server.root";
   public static final String LIFERAY_DB_NAME = "liferay.db.name";
   public static final String LIFERAY_DB_HOST = "liferay.db.host";

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

   private static AppContext instance = null;

   private ServletContext servletContext;
   
   private SparkConf sparkConf;
   private JavaSparkContext sparkContext;

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
      }
      
      @SuppressWarnings("unchecked")
      Enumeration<String> parmNames = context.getInitParameterNames();

      while (parmNames.hasMoreElements()) {
         String param = parmNames.nextElement();
         logger.debug("Configuration Parameter {}:{}", param,
               context.getInitParameter(param));
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

}
