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
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.net.ssl.SSLContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.context.AppContext;
import com.bah.ode.dds.client.ws.CASClient.CASException;
import com.bah.ode.model.DdsData;
import com.bah.ode.model.OdeMetadata;
import com.bah.ode.wrapper.SSLBuilder;
import com.bah.ode.wrapper.SSLBuilder.SSLException;
import com.bah.ode.wrapper.WebSocketClient;
import com.bah.ode.wrapper.WebSocketMessageDecoder;

public class DdsClientFactory {

   private static final Logger logger = LoggerFactory
         .getLogger(DdsClientFactory.class);

   private static URI uri = null;
   private static InputStream keystoreStream = null;
   private static SSLContext sslContext = null;
   

   public static WebSocketClient<DdsData> create(AppContext appContext,
         OdeMetadata metadata,
         Class<? extends WebSocketMessageDecoder<?>> decoderClass)
         throws DdsClientException {

      CASClient casClient = null;
      WebSocketClient<DdsData> ddsClient = null;
      try {

         init(appContext);

         casClient = CASClient.configure(appContext, sslContext);
         casClient.login();
         
         Map<String, Map<String, String>> cookieHeader = Collections
               .singletonMap("Cookie", Collections.singletonMap(
                     AppContext.JSESSIONID_KEY, casClient.getSessionID()));

         List<Class<? extends WebSocketMessageDecoder<?>>> decoders = 
               new ArrayList<Class<? extends WebSocketMessageDecoder<?>>>();
         decoders.add(decoderClass);
         
         ddsClient = new WebSocketClient<DdsData>(uri, sslContext, null,
               cookieHeader, new DdsMessageHandler(metadata),
               decoders);
         
         if (metadata.getInputTopic() != null && metadata.getOutputTopic() != null)
            logger.info("DDS Client created for input topic {} and output topic {}", 
                  metadata.getInputTopic().getName(), metadata.getOutputTopic().getName());

      } catch (Exception e) {
         throw new DdsClientException(e);
      }
      return ddsClient;
   }

   private static void init(AppContext appContext) throws URISyntaxException,
         SSLException, CASException {
      if (uri == null) {
         uri = new URI("wss", null, appContext.getParam(AppContext.DDS_DOMAIN),
               Integer.parseInt(appContext.getParam(AppContext.DDS_PORT)),
               appContext.getParam(AppContext.DDS_RESOURCE_IDENTIFIER), null,
               null);
      }

      if (keystoreStream == null) {
         keystoreStream = CASClient.class.getClassLoader().getResourceAsStream(
               appContext.getParam(AppContext.DDS_KEYSTORE_FILE_PATH));
      }

      if (sslContext == null) {
         sslContext = SSLBuilder.buildSSLContext(keystoreStream,
               appContext.getParam(AppContext.DDS_KEYSTORE_PASSWORD));
      }

   }

   public static class DdsClientException extends Exception {

      private static final long serialVersionUID = 1L;

      public DdsClientException(Throwable cause) {
         super(cause);
      }

   }
}
