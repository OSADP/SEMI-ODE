package com.bah.ode.context;

import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppContext {
   private static Logger logger = LoggerFactory.getLogger(AppContext.class);

   public static final String WEBSERVERROOT = "WebServerRoot";
   public static final String DBNAME = "dbname";
   public static final String DBHOST = "dbhost";

   public static final String MAIL_SMTP_HOST = "mail.smtp.host";
   public static final String MAIL_SMTP_PORT = "mail.smtp.port";
   public static final String MAIL_SMTP_SOCKET_FACTORY_PORT = "mail.smtp.socketFactory.port";
   public static final String MAIL_FROM = "mail.from";
   public static final String MAIL_USERNAME = "mail.user";
   public static final String MAIL_PASSWORD = "mail.password";

   public static final String JSESSIONID_KEY = "JSESSIONID";
   public static final String SDX_WEBSOCKET_URL = "sdx.websocket.url";
   public static final String SDX_KEYSTORE_FILE_PATH = "sdx.keystoreFilePath";
   public static final String SDX_KEYSTORE_PASSWORD = "sdx.keystorePassword";
   public static final String SDX_CAS_URL = "sdx.casURL";
   public static final String SDX_CAS_USERNAME = "sdx.casUserName";
   public static final String SDX_CAS_PASSWORD = "sdx.casPassword";

   private static AppContext instance = null;

   private ServletContext servletContext;

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
      @SuppressWarnings("unchecked")
      Enumeration<String> parmNames = context.getInitParameterNames();

      while (parmNames.hasMoreElements()) {
         String param = parmNames.nextElement();
         logger.info("Configuration Parameter {}:{}", param,
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

}
