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
package com.bah.ode.wrapper;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.net.ssl.SSLContext;
import javax.websocket.ClientEndpointConfig;
import javax.websocket.ClientEndpointConfig.Builder;
import javax.websocket.ClientEndpointConfig.Configurator;
import javax.websocket.CloseReason;
import javax.websocket.ContainerProvider;
import javax.websocket.Decoder;
import javax.websocket.Endpoint;
import javax.websocket.EndpointConfig;
import javax.websocket.Session;
import javax.websocket.WebSocketContainer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WebSocketClient<T> extends Endpoint {
   private static final Logger logger = LoggerFactory
         .getLogger(WebSocketClient.class);

   private URI uri;
   private SSLContext sslContext;
   private Map<String, Object> userProperties;
   private Map<String, Map<String, String>> wsHeaders;
   private Session wsSession = null;
   private WebSocketMessageHandler<T> handler;
   private List<Class<? extends Decoder>> decoders = new ArrayList<Class<? extends Decoder>>();;
   private Configurator configurator;
   private ClientEndpointConfig wsConfig;

   /**
    * General Constructor
    * 
    * @param uri
    *           - the URI of the WebSocket server
    * @param sslContext
    *           - SSL context or null if not running on SSL
    * @param userProperties
    *           - map of user properties to be included in the session object
    * @param wsHeaders
    *           - map of headers sent to in the request
    * @param handler
    *           - the incoming message handler
    * @param decoders
    *           - the incoming message decoders (or null if no decoder needed)
    * @throws URISyntaxException 
    *    - If uri string is null 
    *    - If the uri string violates RFC 2396, as augmented by the above deviations 
    */
   public WebSocketClient(String uri, SSLContext sslContext,
         Map<String, Object> userProperties,
         Map<String, Map<String, String>> wsHeaders,
         WebSocketMessageHandler<T> handler,
         List<Class<? extends WebSocketMessageDecoder<?>>> decoders) 
               throws URISyntaxException {
      
      this(new URI(uri), sslContext, userProperties, wsHeaders, handler, decoders);
   }

   /**
    * General Constructor
    * 
    * @param uri
    *           - the URI of the WebSocket server
    * @param sslContext
    *           - SSL context or null if not running on SSL
    * @param userProperties
    *           - map of user properties to be included in the session object
    * @param wsHeaders
    *           - map of headers sent to in the request
    * @param handler
    *           - the incoming message handler
    * @param decoders
    *           - the incoming message decoders (or null if no decoder needed)
    */
   public WebSocketClient(URI uri, SSLContext sslContext,
         Map<String, Object> userProperties,
         Map<String, Map<String, String>> wsHeaders,
         WebSocketMessageHandler<T> handler,
         List<Class<? extends WebSocketMessageDecoder<?>>> decoders) {
      super();
      this.uri = uri;
      this.sslContext = sslContext;
      this.userProperties = userProperties;
      this.wsHeaders = wsHeaders;
      this.handler = handler;
      
      this.configurator = createConfigurator(wsHeaders);

      Builder builder = ClientEndpointConfig.Builder.create().configurator(
            this.configurator);

      if (decoders != null) {
         this.decoders.addAll(decoders);
         builder.decoders(this.decoders);
      }

      this.wsConfig = builder.build();

      if (sslContext != null)
         wsConfig.getUserProperties().put(
               "org.apache.tomcat.websocket.SSL_CONTEXT", sslContext);

      if (this.userProperties != null) {
         for (String key : userProperties.keySet()) {
            Object prop = userProperties.get(key);
            if (prop != null)
               wsConfig.getUserProperties().put(key, prop);
         }
      }
   }

   public URI getUri() {
      return uri;
   }

   /**
    * @param uri - URI of the WebSocket server
    * @return - this client object
    */
   public WebSocketClient<T> setUri(URI uri) {
      this.uri = uri;
      return this;
   }

   /**
    * @param uri - URI of the WebSocket server
    * @return - this client object
    * @throws WebSocketException
    *    - If uri string is null 
    *    - If the uri string violates RFC 2396, as augmented by the above deviations 
    */
   public WebSocketClient<T> setUri(String uri) throws WebSocketException {
      try {
         this.uri = new URI(uri);
      } catch (Exception e) {
         throw new WebSocketException("Error setting URI.", e);
      }
      return this;
   }

   public SSLContext getSslContext() {
      return sslContext;
   }

   public WebSocketClient<T> setSslContext(SSLContext sslContext) {
      this.sslContext = sslContext;
      return this;
   }

   public Map<String, Object> getUserProperties() {
      return userProperties;
   }

   public WebSocketClient<T> setUserProperties(
         Map<String, Object> userProperties) {
      this.userProperties = userProperties;
      return this;
   }

   public Map<String, Map<String, String>> getWsHeaders() {
      return wsHeaders;
   }

   public WebSocketClient<T> setWsHeaders(
         Map<String, Map<String, String>> wsHeaders) {
      this.wsHeaders = wsHeaders;
      return this;
   }

   public WebSocketMessageHandler<T> getHandler() {
      return handler;
   }

   public WebSocketClient<T> setHandler(WebSocketMessageHandler<T> handler) {
      this.handler = handler;
      return this;
   }

   public List<Class<? extends Decoder>> getDecoders() {
      return decoders;
   }

   public WebSocketClient<T> setDecoders(List<Class<? extends Decoder>> decoders) {
      this.decoders = decoders;
      return this;
   }

   /**
    * Connects to the WebSocketServer creating a WebSocket session
    * 
    * @return - the WebSocket session created
    * @throws WebSocketException
    *            - If a message handler has already been registered for the
    *            associated message type
    */
   public Session connect() throws WebSocketException {
      try {
         WebSocketContainer container = ContainerProvider
               .getWebSocketContainer();

         logger.info("Opening connection to {}", uri.toString());
         wsSession = container.connectToServer(this, wsConfig, uri);
         wsSession.addMessageHandler(this.handler);
      } catch (Exception e) {
         throw new WebSocketException(e);
      }
      return wsSession;
   }

   /**
    * Creates a javax.websocket.ClientEndpointConfig.Configurator configured
    * with the given headers.
    * 
    * @param wsHeaders
    *           - map of key value pairs. The key is the header name, the value
    *           is a list of name-value pairs.
    * 
    * @return - a javax.websocket.ClientEndpointConfig.Configurator object
    */
   private Configurator createConfigurator(
         Map<String, Map<String, String>> wsHeaders) {
      return new Configurator() {
         @Override
         public void beforeRequest(Map<String, List<String>> headers) {
            super.beforeRequest(headers);
            for (String header : wsHeaders.keySet()) {
               Map<String, String> hmap = wsHeaders.get(header);
               ArrayList<String> headerValue = new ArrayList<String>();
               for (Entry<String, String> entry : hmap.entrySet()) {
                  StringBuilder nvp = new StringBuilder(entry.getKey());
                  nvp.append("=").append(hmap.get(entry.getValue()));
                  headerValue.add(nvp.toString());
               }
               headers.put(header, headerValue);
            }
         }
      };
   }

   /*
    * (non-Javadoc)
    * 
    * @see javax.websocket.Endpoint#onOpen(javax.websocket.Session,
    * javax.websocket.EndpointConfig)
    */
   @Override
   public void onOpen(Session session, EndpointConfig config) {
      logger.info("Connection opened");
   }

   /*
    * (non-Javadoc)
    * 
    * @see javax.websocket.Endpoint#onClose(javax.websocket.Session,
    * javax.websocket.CloseReason)
    */
   @Override
   public void onClose(Session session, CloseReason reason) {
      logger.info("Connection closed. Reason: {}", reason);
      this.wsSession = null;
   }

   /*
    * (non-Javadoc)
    * 
    * @see javax.websocket.Endpoint#onError(javax.websocket.Session,
    * java.lang.Throwable)
    */
   @Override
   public void onError(Session session, Throwable t) {
      logger.error("WebSocket Error", t);
   }

   /**
    * Sends a message to the server end-point.
    *
    * @param message
    *           - the message to be sent
    */
   public void send(String message) {
      this.wsSession.getAsyncRemote().sendText(message);
   }

   /**
    * Closes the WebSocket connection. This method should be used to gracefully
    * close a WebSocket connection.
    * 
    * Note that the method closes the session but does not set the wsSession to
    * null. wsSession is set to null in the onClose method.
    * 
    * @throws WebSocketException - if an I/O error occurs while the WebSocket 
    * session is being closed.
    */
   public void close() throws WebSocketException {
      try {
         if (null != wsSession)
            wsSession.close();
      } catch (IOException e) {
         throw new WebSocketException(e);
      }
      
      
   }

   public Session getWsSession() {
      return wsSession;
   }

   public ClientEndpointConfig getWsConfig() {
      return wsConfig;
   }

   public static class WebSocketException extends Exception {

      private static final long serialVersionUID = 1L;

      public WebSocketException(Exception e) {
         super(e);
      }

      public WebSocketException(String msg) {
         super(msg);
      }

      public WebSocketException(String msg, Exception e) {
         super(msg, e);
      }

   }
}
