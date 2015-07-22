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
package com.bah.ode.dds.client.ws;

import java.io.InputStream;
import java.net.URI;

import javax.net.ssl.SSLContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.dds.client.ws.CASClient.CASException;
import com.bah.ode.wrapper.SSLBuilder;

public class DdsClientFactory {

   private static final Logger logger = LoggerFactory
         .getLogger(DdsClientFactory.class);

   private static URI uri = null;
   private static InputStream keystoreStream = null;
   private static SSLContext sslContext = null;
   private static CASClient casClient = null;
   private static String username = null;
   private static String password = null;

   public static void init(String ddsUrl, String keystoreFilePath, 
         String keystorePassword, String casUrl, String username, 
         String password)
         throws DdsClientException {

      try {

         if (uri == null) {
            if (ddsUrl.startsWith("http"))
               uri = new URI(ddsUrl.replaceFirst("http", "ws"));
            else // assume it's ws
               uri = new URI(ddsUrl);
         }

         if (keystoreStream == null) {
            keystoreStream = 
                  CASClient.class.getClassLoader().getResourceAsStream(keystoreFilePath);
         }

         if (sslContext == null) {
            sslContext = SSLBuilder.buildSSLContext(keystoreStream, keystorePassword);
         }

         if (casClient == null) {
            casClient = CASClient.configure(sslContext, casUrl, ddsUrl);
         }
         
         if (DdsClientFactory.username == null)
            DdsClientFactory.username = username;

         if (DdsClientFactory.password == null)
            DdsClientFactory.password = password;

         login();

      } catch (Exception e) {
         throw new DdsClientException(e);
      }
   }

   public static String login()
         throws CASException {
      String sessionId = casClient.login(username, password);
      logger.info("Session ID: {}", sessionId);
      return sessionId;
   }

   public static URI getUri() {
      return uri;
   }

   public static SSLContext getSslContext() {
      return sslContext;
   }

   public static CASClient getCasClient() {
      return casClient;
   }

//   public static WebSocketClient<DdsData> create(DataProcessor<DdsData> processor,
//         Class<? extends WebSocketMessageDecoder<?>> decoderClass,
//         String ddsUrl, String keystoreFilePath, String keystorePassword, 
//         String casUrl, String username, String password, 
//         Class<? extends WebSocketClient<DdsData>> wsClientClass)
//         throws DdsClientException {
//
//      WebSocketClient<DdsData> ddsClient = null;
//      try {
//
//         if (uri == null) {
//            if (ddsUrl.startsWith("http"))
//               uri = new URI(ddsUrl.replaceFirst("http", "ws"));
//            else // assume it's ws
//               uri = new URI(ddsUrl);
//         }
//
//         if (keystoreStream == null) {
//            keystoreStream = 
//                  CASClient.class.getClassLoader().getResourceAsStream(keystoreFilePath);
//         }
//
//         if (sslContext == null) {
//            sslContext = SSLBuilder.buildSSLContext(keystoreStream, keystorePassword);
//         }
//
//         if (casClient == null) {
//            casClient = CASClient.configure(sslContext, casUrl, ddsUrl);
//            casClient.login(username, password);
//            logger.info("Session ID: {}", casClient.getSessionID());
//         }
//
//         Map<String, Map<String, String>> cookieHeader = Collections
//               .singletonMap("Cookie", Collections.singletonMap(
//                     CASClient.JSESSIONID, casClient.getSessionID()));
//
//         List<Class<? extends WebSocketMessageDecoder<?>>> decoders = 
//               new ArrayList<Class<? extends WebSocketMessageDecoder<?>>>();
//         decoders.add(decoderClass);
//         
//         Constructor<? extends WebSocketClient<DdsData>> ctor =
//               wsClientClass.getConstructor(String.class, SSLContext.class,
//               Map.class, Map.class, WebSocketMessageHandler.class,
//               List.class);
//         
//         ddsClient = ctor.newInstance(uri, sslContext, null,
//               cookieHeader, new DdsMessageHandler(processor),
//               decoders);
//
//      } catch (Exception e) {
//         throw new DdsClientException(e);
//      }
//      return ddsClient;
//   }

   public static class DdsClientException extends Exception {

      private static final long serialVersionUID = 1L;

      public DdsClientException(Throwable cause) {
         super(cause);
      }

   }
}
