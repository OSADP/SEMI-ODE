package com.bah.ode.dds.client.ws;

import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.Map;

import javax.net.ssl.SSLContext;
import javax.websocket.RemoteEndpoint.Async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.context.AppContext;
import com.bah.ode.dds.client.ws.CASClient.CASException;
import com.bah.ode.model.DdsData;
import com.bah.ode.wrapper.SSLBuilder;
import com.bah.ode.wrapper.SSLBuilder.SSLException;
import com.bah.ode.wrapper.WebSocketClient;
import com.bah.ode.wrapper.WebSocketMessageDecoder;

public class DdsClientFactory {
	
	private static final Logger logger = LoggerFactory.getLogger(DdsClientFactory.class);

	private static URI uri = null;
	private static InputStream keystoreStream = null;
	private static SSLContext sslContext = null;
	private static CASClient casClient = null;
	
	public static WebSocketClient<DdsData>
		create(AppContext appContext, Async async, 
				Class<? extends WebSocketMessageDecoder> decoderClass) 
						throws DdsClientException {
		
      WebSocketClient<DdsData> ddsClient = null; 
		try {
	      
			init(appContext);

			Map<String, Map<String, String>> cookieHeader =
					Collections.singletonMap(
   				"Cookie", Collections.singletonMap(
   						AppContext.JSESSIONID_KEY, casClient.getSessionID()));
			
			ddsClient = new WebSocketClient<DdsData>(
	      		uri, sslContext,
	      		null, 
	      		cookieHeader,
					new DdsMessageHandler(async),
					Collections.singletonList(decoderClass));
	      
      } catch (Exception e) {
      	throw new DdsClientException(e);
      }
      return ddsClient;
	}

	private static void init(AppContext appContext) throws URISyntaxException,
         SSLException, CASException {
	   if (uri == null) {
	      uri = new URI("wss", null, 
	      		appContext.getParam(AppContext.DDS_DOMAIN),
	      		Integer.parseInt(appContext.getParam(AppContext.DDS_PORT)),
	      		appContext.getParam(AppContext.DDS_RESOURCE_IDENTIFIER),
	      		null, null);
	   }
	   
	   if (keystoreStream == null) {
	      keystoreStream = 
	      		CASClient.class.getClassLoader()
	      		.getResourceAsStream(appContext.getParam(AppContext.DDS_KEYSTORE_FILE_PATH));
	   }
	   
	   if (sslContext == null) {
	   	sslContext = SSLBuilder.buildSSLContext(keystoreStream, 
	   			appContext.getParam(AppContext.DDS_KEYSTORE_PASSWORD));
	   }
	   
	   if (casClient == null) {
	      casClient = CASClient.configure(appContext, sslContext);
	      casClient.login();
	   	logger.info("Session ID: {}", casClient.getSessionID());
	   }
   }

	public static class DdsClientException extends Exception {

      private static final long serialVersionUID = 1L;

		public DdsClientException(Throwable cause) {
	      super(cause);
      }
		
	}
}
