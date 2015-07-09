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

import com.bah.ode.context.AppContext;
import com.bah.ode.model.DdsData;
import com.bah.ode.model.OdeMetadata;
import com.bah.ode.model.OdeMsgAndMetadata;
import com.bah.ode.util.JsonUtils;
import com.bah.ode.wrapper.MQProducer;
import com.bah.ode.wrapper.WebSocketMessageHandler;

public class DdsMessageHandler implements WebSocketMessageHandler<DdsData> {

   private static final Logger logger = LoggerFactory
         .getLogger(DdsMessageHandler.class);

   private MQProducer<String, String> producer;
   private OdeMetadata metadata;
   
   public DdsMessageHandler(OdeMetadata metadata) {
      this.producer = new MQProducer<String, String>(
                  AppContext.getInstance().getParam(
                        AppContext.KAFKA_METADATA_BROKER_LIST));
      this.metadata = metadata;
   }

   @Override
   public void onMessage(DdsData ddsData) {
      try {
         if (producer != null && ddsData.haveData()) {
            OdeMsgAndMetadata omam = new OdeMsgAndMetadata();
            omam.setMetadata(metadata);
            omam.setKey(metadata.getOutputTopic().getName());
            
            String topicName = metadata.getInputTopic().getName();
            if (ddsData.getIsd() != null) {
               omam.setPayload(JsonUtils.toJson(ddsData.getIsd()));
            } else if (ddsData.getVsd() != null) {
               omam.setPayload(JsonUtils.toJson(ddsData.getVsd()));
            } else if (ddsData.getAsd() != null) {
               omam.setPayload(JsonUtils.toJson(ddsData.getAsd()));
            } else {
               //Send non-data messages directly to the output topic
               topicName = metadata.getOutputTopic().getName();
               omam.setPayload(ddsData.getFullMessage());
            }
            producer.send(topicName, metadata.getOutputTopic().getName(),
                  JsonUtils.toJson(omam));
         }
      } catch (Exception e) {
         logger.error("Error handling DDS message. ", e);
      } finally {
      }
   }


   public void disable() {
      if (null != producer) {
         producer.shutDown();
         producer = null;
      }
   }

}
