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
import com.bah.ode.util.JsonUtils;
import com.bah.ode.wrapper.WebSocketMessageDecoder;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class DdsDecoder implements WebSocketMessageDecoder<DdsData> {

   private static final Logger logger = LoggerFactory
         .getLogger(DdsDecoder.class);
   private static final int MSG_COMPONENT_TAG_INDEX = 0;
   private static final int MSG_COMPONENT_VALUE_INDEX = 1;
   private static final int RECORD_COUNT_VALUE_INDEX = 1;

   @Override
   public void init(EndpointConfig endpointConfig) {
   }

   @Override
   public void destroy() {
   }

   protected static Tag getResponseTag(String tagName) {
      Tag[] tags = ControlMessage.Tag.values();

      for (Tag tag : tags) {
         if (tagName.equals(tag.name())) {
            return tag;
         }
      }

      return null;
   }

   @Override
   public DdsData decode(String message) throws DecodeException {
      DdsData ddsData = new DdsData();

      try {
         ddsData.setFullMessage(message);
         String[] msgComponents = parseFullMsg(message);
         Tag tag = getResponseTag(msgComponents[MSG_COMPONENT_TAG_INDEX]);
         if (tag != null) {
            ControlMessage controlMsg = new ControlMessage().setTag(tag);
            ddsData.setControlMessage(controlMsg);
            switch(tag) {
            case CONNECTED: {
               String connectionDetails = msgComponents[MSG_COMPONENT_VALUE_INDEX];
               controlMsg.setConnectionDetails(connectionDetails);
            }
            break;
            case START: {
               String jsonMessage = msgComponents[MSG_COMPONENT_VALUE_INDEX];
               try {
                  ObjectNode rootNode = JsonUtils.toObjectNode(jsonMessage);
                  
                  controlMsg
                     .setDialog(DdsRequest.Dialog.getById(rootNode.get("dialogID").asInt()))
                     .setEncoding(rootNode.get("resultEncoding").textValue());
                        
               } catch (Exception e) {
                  logger.error("Error processing Start Tag", e);
               }
            }
            break;
            case STOP: {
               String recordCount = msgComponents[MSG_COMPONENT_VALUE_INDEX];
               String[] rcArray = patseRecordCount(recordCount);
               if (rcArray.length == 2) {
                  try {
                     if (controlMsg != null) {
                        controlMsg.setRecordCount(Integer.valueOf(rcArray[RECORD_COUNT_VALUE_INDEX]));
                     }
                  } catch (Exception e) {
                     logger.error("Error processing Stop Tag", e);
                  }
               } else {
                  logger.error("Invalid format for recordCount. "
                        + "Expecting \"recordCount=n\" but received \"{}\"", 
                        recordCount);
               }
            }
            break;
            default:
               logger.info("Received {} message", tag);
            }
         }
      } catch (Exception e) {
         logger.error("Error decoding ", e);
      } finally {
      }

      return ddsData;
   }

   public String[] patseRecordCount(String recordCount) {
      return recordCount.split("\\s*=\\s*");
   }

   public String[] parseFullMsg(String message) {
      return message.split("\\s*:\\s*", 2);
   }

   @Override
   public boolean willDecode(String message) {
      return getResponseTag(parseFullMsg(message)[MSG_COMPONENT_TAG_INDEX]) == Tag.START;
   }
}
