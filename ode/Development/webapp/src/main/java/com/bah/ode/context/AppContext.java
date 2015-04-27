package com.bah.ode.context;

import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

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
