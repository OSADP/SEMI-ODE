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

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

import org.apache.spark.SparkConf;
import org.apache.spark.streaming.Durations;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppContext {
   private static Logger logger = LoggerFactory.getLogger(AppContext.class);

   public static final String JSESSIONID_KEY = "JSESSIONID";
   public static final String DDS_DOMAIN = "dds.domain";
   public static final String DDS_PORT = "dds.port";
   public static final String DDS_RESOURCE_IDENTIFIER = "dds.resource.identifier";
   public static final String DDS_KEYSTORE_FILE_PATH = "dds.keystore.file.path";
   public static final String DDS_KEYSTORE_PASSWORD = "dds.keystore.password";
   public static final String DDS_CAS_URL = "dds.cas.url";
   public static final String DDS_CAS_USERNAME = "dds.cas.username";
   public static final String DDS_CAS_PASSWORD = "dds.cas.password";

   private static Properties prop = new Properties();
   private static AppContext instance = null;

   private SparkConf sparkConf;
   private JavaStreamingContext sparkStreamingContext;

   private AppContext() {
   }

   public AppContext init(String appName, long duration) throws IOException {

      InputStream input = null;

      try {

         String filename = "config.properties";
         input = AppContext.class.getClassLoader()
               .getResourceAsStream(filename);
         if (input == null) {
            throw new IOException("File not found: " + filename);
         }

         // load a properties file from class path
         prop.load(input);

         Enumeration<Object> parmNames = prop.elements();
   
         while (parmNames.hasMoreElements()) {
            String param = (String) parmNames.nextElement();
            logger.debug("Configuration Parameter {}:{}", param,
                  prop.getProperty(param));
         }

         sparkConf = new SparkConf()
            .setAppName(appName);

         sparkStreamingContext = new JavaStreamingContext(sparkConf,
               Durations.seconds(duration));
      
      } finally {
         if (input != null) {
            input.close();
         }
      }

      return this;
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
         result = prop.getProperty(key);
      }

      return result;
   }

   public SparkConf getSparkConf() {
      return sparkConf;
   }

   public JavaStreamingContext getSparkStreamingContext() {
      return sparkStreamingContext;
   }

}
