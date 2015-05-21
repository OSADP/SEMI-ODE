package com.bah.ode.wrapper;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;

import javax.net.ssl.SSLContext;
import javax.websocket.CloseReason;
import javax.websocket.CloseReason.CloseCodes;
import javax.websocket.ContainerProvider;
import javax.websocket.DecodeException;
import javax.websocket.DeploymentException;
import javax.websocket.EndpointConfig;
import javax.websocket.Session;
import javax.websocket.WebSocketContainer;

import mockit.Mocked;
import mockit.StrictExpectations;
import mockit.integration.junit4.JMockit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.bah.ode.wrapper.WebSocketClient.WebSocketException;

@RunWith(JMockit.class)
public class WebSocketClientTest {
   
   @Mocked
   private SSLContext sslContext;
   
   @Mocked
   private ContainerProvider provider;

   @Mocked
   private WebSocketContainer container;
   
   @Mocked
   private Session wsSession;
   
   private final Integer expectedMessage = null;
   
   private final WebSocketMessageHandler<Integer> handler = 
         new WebSocketMessageHandler<Integer>() {
      
      @Override
      public void onMessage(Integer message) {
         assertEquals(expectedMessage, message);
      }
   };
   
   @BeforeClass
   public static void setUpBeforeClass() throws Exception {
   }

   @AfterClass
   public static void tearDownAfterClass() throws Exception {
   }

   @Before
   public void setUp() throws Exception {
   }

   @After
   public void tearDown() throws Exception {
   }

   static class String2IntegerDecoder implements WebSocketMessageDecoder<Integer> {

      @Override
      public Integer decode(java.lang.String s) throws DecodeException {
         return Integer.parseInt(s);
      }

      @Override
      public boolean willDecode(java.lang.String s) {
         Integer.parseInt(s);
         return true;
      }

      @Override
      public void init(EndpointConfig endpointConfig) {
      }

      @Override
      public void destroy() {
      }
      
   }
   
   @Test
   public void testWebSocketClientGeneralConstructor() throws URISyntaxException {
      String propName = "propName";
      String propValue = "propValue";
      
      WebSocketClient<Integer> wsClient = new WebSocketClient<Integer>(
            "http://host:port/path", sslContext, 
            Collections.singletonMap(propName, propValue), 
            Collections.singletonMap("headerKey", Collections.singletonMap("headerName", "headerValue")), 
            handler, Collections.singletonList(String2IntegerDecoder.class));
      
      assertEquals(2, wsClient.getWsConfig().getUserProperties().size());
      Object actualContext = wsClient.getWsConfig().getUserProperties().get("org.apache.tomcat.websocket.SSL_CONTEXT");
      assertNotNull(actualContext);
      assertEquals(Boolean.TRUE, actualContext instanceof SSLContext);
      assertEquals(sslContext, actualContext);
      
      Object actualPropValue = wsClient.getWsConfig().getUserProperties().get(propName);
      assertNotNull(actualPropValue);
      assertEquals(Boolean.TRUE, actualPropValue instanceof String);
      assertEquals(propValue, actualPropValue);
      
      assertArrayEquals(wsClient.getDecoders().toArray(),
            wsClient.getWsConfig().getDecoders().toArray());

      wsClient = new WebSocketClient<Integer>(
            new URI("http://host:port/path"), null, null, null, handler, null);
      
      assertEquals(0, wsClient.getWsConfig().getUserProperties().size());
      actualContext = wsClient.getWsConfig().getUserProperties().get("org.apache.tomcat.websocket.SSL_CONTEXT");
      assertNull(actualContext);
      
      actualPropValue = wsClient.getWsConfig().getUserProperties().get(propName);
      assertNull(actualPropValue);
      
      assertEquals(0, wsClient.getDecoders().size());
   }

   @Test
   public void testConnect() throws URISyntaxException, WebSocketException, DeploymentException, IOException {
      
      WebSocketClient<Integer> wsClient = new WebSocketClient<Integer>(
            "http://host:port/path", null, null, null, handler, null);
      
      new StrictExpectations() {{
         ContainerProvider.getWebSocketContainer(); result = container;
         container.connectToServer(
               wsClient, wsClient.getWsConfig(), wsClient.getUri());
         wsSession.addMessageHandler(handler);
      }};
      
      wsClient.connect();
   }

   @Test
   public void testOnOpeng() {
   }

   @Test
   public void testClose() throws URISyntaxException, DeploymentException, IOException, WebSocketException {
      WebSocketClient<Integer> wsClient = new WebSocketClient<Integer>(
            "http://host:port/path", null, null, null, handler, null);
      
      new StrictExpectations() {{
         ContainerProvider.getWebSocketContainer(); result = container;
         container.connectToServer(
               wsClient, wsClient.getWsConfig(), wsClient.getUri());
         wsSession.addMessageHandler(handler);
         wsSession.close();
      }};
      
      wsClient.connect();
      
      assertNotNull(wsClient.getWsSession());
      wsClient.close();
      wsClient.onClose(wsClient.getWsSession(), 
            new CloseReason(CloseCodes.CANNOT_ACCEPT, "Simulating onClose()"));
      assertNull(wsClient.getWsSession());
   }

   @Test
   public void testOnError() {
   }

   @Test
   public void testSend() throws URISyntaxException, DeploymentException, IOException, WebSocketException {
      WebSocketClient<Integer> wsClient = new WebSocketClient<Integer>(
            "http://host:port/path", null, null, null, handler, null);

      String message = "Test Message";
      
      new StrictExpectations() {{
         ContainerProvider.getWebSocketContainer(); result = container;
         container.connectToServer(
               wsClient, wsClient.getWsConfig(), wsClient.getUri());
         wsSession.addMessageHandler(handler);
         wsSession.getAsyncRemote().sendText(message);
      }};

      wsClient.connect();
      wsClient.send(message);
      
   }

}
