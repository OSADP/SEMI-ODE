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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.model.DdsData;
import com.bah.ode.receiver.WebSocketReceiver;
import com.bah.ode.util.JsonUtils;
import com.bah.ode.wrapper.WebSocketMessageHandler;

public class DdsMessageHandler implements WebSocketMessageHandler<DdsData> {

   private static final Logger logger = LoggerFactory
         .getLogger(DdsMessageHandler.class);

   protected WebSocketReceiver receiver;

   public DdsMessageHandler(WebSocketReceiver receiver) {
      this.receiver = receiver;
   }

   @Override
   public void onMessage(DdsData ddsData) {
      if (receiver != null && ddsData.haveData()) {
         int retryCount = 3;

         while (retryCount-- > 0) {
            try {
               if (ddsData.getIsd() != null)
                  receiver.store(JsonUtils.toJson(ddsData.getIsd()));
               else if (ddsData.getVsd() != null)
                  receiver.store(JsonUtils.toJson(ddsData.getVsd()));
               else if (ddsData.getAsd() != null)
                  receiver.store(JsonUtils.toJson(ddsData.getAsd()));
               else
                  receiver.store(JsonUtils.toJson(ddsData.getFullMessage()));

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
      receiver = null;
   }

   public WebSocketReceiver getReceiver() {
      return receiver;
   }

}
