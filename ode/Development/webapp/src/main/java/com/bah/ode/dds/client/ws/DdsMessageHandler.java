package com.bah.ode.dds.client.ws;

import javax.websocket.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.model.DdsData;
import com.bah.ode.util.JsonUtils;
import com.bah.ode.wrapper.WebSocketMessageHandler;

public class DdsMessageHandler implements WebSocketMessageHandler<DdsData> {

   private static final Logger logger = LoggerFactory
         .getLogger(DdsMessageHandler.class);

   protected Session clientApp;

   public DdsMessageHandler(Session clientApp) {
      this.clientApp = clientApp;
   }

   @Override
   public void onMessage(DdsData ddsData) {
      if (clientApp != null && ddsData.haveData()) {
         int retryCount = 3;

         while (retryCount-- > 0) {
            try {
               if (ddsData.getIsd() != null)
                  clientApp.getBasicRemote().sendText(JsonUtils.toJson(ddsData.getIsd()));
               else if (ddsData.getVsd() != null)
                  clientApp.getBasicRemote().sendText(JsonUtils.toJson(ddsData.getVsd()));
               else if (ddsData.getAsd() != null)
                  clientApp.getBasicRemote().sendText(JsonUtils.toJson(ddsData.getAsd()));
               else
                  clientApp.getBasicRemote().sendText(JsonUtils.toJson(ddsData.getFullMessage()));

               break;
            } catch (Exception e) {
               if (retryCount > 0) {
                  logger.warn("Error sending message to remote end-point. Retrying... count "
                        + retryCount);
               } else {
                  logger.error("Error sending message to remote end-point. ", e);
               }
            } finally {
            }
         }
      }
   }

   public void disable() {
      clientApp = null;
   }
}
