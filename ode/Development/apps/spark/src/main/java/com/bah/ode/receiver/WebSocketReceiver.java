package com.bah.ode.receiver;

import org.apache.spark.storage.StorageLevel;
import org.apache.spark.streaming.receiver.Receiver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.wrapper.WebSocketClient;
import com.bah.ode.wrapper.WebSocketClient.WebSocketException;

public class WebSocketReceiver extends Receiver<String> {
   private static Logger logger = LoggerFactory
         .getLogger(WebSocketReceiver.class);

   private WebSocketClient<?> wsClient;

   public WebSocketReceiver(StorageLevel storageLevel, WebSocketClient<?> wsClient) {
      super(storageLevel);
      this.wsClient = wsClient;
   }

   private static final long serialVersionUID = 1L;

   public WebSocketReceiver(StorageLevel storageLevel) {
      super(storageLevel);
   }

   @Override
   public void onStart() {
   }

   @Override
   public void onStop() {
      try {
         wsClient.close();
      } catch (WebSocketException e) {
         logger.error("Error stopping", e);
      }
   }

   public WebSocketClient<?> getWsClient() {
      return wsClient;
   }

   public WebSocketReceiver setWsClient(WebSocketClient<?> wsClient) {
      this.wsClient = wsClient;
      return this;
   }

}
