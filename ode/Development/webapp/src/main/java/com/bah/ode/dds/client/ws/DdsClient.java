package com.bah.ode.dds.client.ws;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.net.ssl.SSLContext;
import javax.websocket.ClientEndpoint;
import javax.websocket.ClientEndpointConfig;
import javax.websocket.ClientEndpointConfig.Configurator;
import javax.websocket.CloseReason;
import javax.websocket.ContainerProvider;
import javax.websocket.DeploymentException;
import javax.websocket.Endpoint;
import javax.websocket.EndpointConfig;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.Session;
import javax.websocket.WebSocketContainer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.context.AppContext;
import com.bah.ode.dds.client.ws.CASClient.CASLoginException;

@ClientEndpoint
public class DdsClient extends Endpoint {
	private static final Logger logger = LoggerFactory.getLogger(DdsClient.class);

	private Session userSession = null;
	private String  casSessionId = null;
	private ResponseHandler handler;
   private Configurator configurator = new DdsClientConfigurator();

	@SuppressWarnings("unchecked")
	public static DdsClient create(AppContext appContext,
	      ResponseHandler handler) throws URISyntaxException,
	      KeyManagementException, KeyStoreException, NoSuchAlgorithmException,
	      CertificateException, IOException, CASLoginException, DeploymentException {

      logger.info("Logging in to {}", appContext.getParam(AppContext.DDS_CAS_URL));
      DdsClient wsClient = new DdsClient();
		wsClient.handler = handler;

      CASClient casClient = CASClient.configure(appContext);
      wsClient.casSessionId = casClient.login();
		logger.info("Session ID: {}", wsClient.casSessionId);

//		@SuppressWarnings("rawtypes")
//		Map headers = new HashMap();
//		headers.put("Cookie", AppContext.JSESSIONID_KEY + "=" + jSessionID);

		URI ddsWsUri = new URI("wss", null, 
      		appContext.getParam(AppContext.DDS_DOMAIN),
      		Integer.parseInt(appContext.getParam(AppContext.DDS_PORT)),
				appContext.getParam(AppContext.DDS_RESOURCE_IDENTIFIER),
				null, null);
		
		SSLContext sslContext = SSLBuilder.buildSSLContext(
		      appContext.getParam(AppContext.DDS_KEYSTORE_FILE_PATH),
		      appContext.getParam(AppContext.DDS_KEYSTORE_PASSWORD));
		
      logger.info("Opening connection to {}", ddsWsUri.toString());
      
      WebSocketContainer container = ContainerProvider.getWebSocketContainer();
      ClientEndpointConfig wsConfig = ClientEndpointConfig.Builder.create().configurator(wsClient.configurator).build();
      wsConfig.getUserProperties().put("org.apache.tomcat.websocket.SSL_CONTEXT", sslContext);
      wsClient.userSession = container.connectToServer(wsClient, wsConfig, ddsWsUri);

		return wsClient;
	}

   /**
    * Callback hook for Connection open events.
    *
    * @param userSession the userSession which is opened.
    */
	@Override
   public void onOpen(Session userSession, EndpointConfig config) {
		logger.info("Connection opened");
		this.userSession = userSession;
		this.userSession.addMessageHandler(this.handler);
   }

   /**
    * Callback hook for Connection close events.
    *
    * @param userSession the userSession which is getting closed.
    * @param reason the reason for connection close
    */
   @OnClose
   public void onClose(Session userSession, CloseReason reason) {
		logger.info("Connection closed. Reason: {}", reason);
		this.userSession = null;
   }

//   /**
//    * Callback hook for Message Events. This method will be invoked when a client send a message.
//    *
//    * @param message The text message
//    */
//   @OnMessage
//   public void onMessage(String message) {
//   	if (handler != null)
//   		handler.handleMessage(message);
//   }

   @OnError
   public void OnError(Session userSession, Throwable t) {
		logger.error("WebSocket Error", t);
   }
   
   /**
    * Send a message.
    *
    * @param user
    * @param message
    */
   public void send(String message) {
       this.userSession.getAsyncRemote().sendText(message);
   }

   public void close() throws IOException {
   	userSession.close();
   	handler.disable();
   }
   
   public class DdsClientConfigurator extends Configurator {

		@Override
      public void beforeRequest(Map<String, List<String>> headers) {
	      super.beforeRequest(headers);
			headers.put("Cookie", Collections.singletonList(AppContext.JSESSIONID_KEY + "=" + casSessionId));
      }
   	
   }
}
