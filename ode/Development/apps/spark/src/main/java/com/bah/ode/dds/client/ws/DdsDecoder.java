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

import javax.websocket.DecodeException;
import javax.websocket.EndpointConfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.dds.client.ws.ControlMessage.Tag;
import com.bah.ode.model.DdsData;
import com.bah.ode.model.DdsRequest;
import com.bah.ode.wrapper.WebSocketMessageDecoder;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DdsDecoder implements WebSocketMessageDecoder<DdsData> {

   private static final Logger logger = LoggerFactory
         .getLogger(DdsDecoder.class);
   private ObjectMapper mapper = new ObjectMapper();

   @Override
   public void init(EndpointConfig endpointConfig) {
   }

   @Override
   public void destroy() {
   }

   protected static Tag getResponseTag(String message) {
      Tag[] tags = ControlMessage.Tag.values();

      for (Tag tag : tags) {
         if (message.startsWith(tag.name())) {
            return tag;
         }
      }

      return null;
   }

   @Override
   public DdsData decode(String message) throws DecodeException {
      DdsData ddsData = new DdsData();

      try {
         Tag tag = getResponseTag(message);
         if (tag != null) {
            ddsData.setControlMessage(new ControlMessage().setTag(tag));
            if (tag == Tag.START) {
               String jsonMessage = message.substring(tag.name().length() + 1);
               try {
                  JsonNode rootNode = mapper.readTree(jsonMessage);
                  ddsData
                        .getControlMessage()
                        .setDialog(
                              DdsRequest.Dialog.getById(rootNode.get("dialogID")
                                    .asInt()))
                        .setEncoding(rootNode.get("resultEncoding").textValue());
               } catch (Exception e) {
                  logger.error("Error processing Start Tag", e);
               }
            }
         } else {
            ddsData.setFullMessage(message);
         }
      } catch (Exception e) {
         logger.error("Error decoding ", e);
      } finally {
      }

      return ddsData;
   }

   @Override
   public boolean willDecode(String message) {
      return getResponseTag(message) == Tag.START;
   }
}
