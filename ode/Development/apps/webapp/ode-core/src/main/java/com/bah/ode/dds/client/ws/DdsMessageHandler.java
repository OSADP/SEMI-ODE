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

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.websocket.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.asn.oss.semi.GroupID;
import com.bah.ode.asn.oss.semi.VehSitDataMessage;
import com.bah.ode.asn.oss.semi.VehSitDataMessage.Bundle;
import com.bah.ode.asn.oss.semi.VehSitRecord;
import com.bah.ode.context.AppContext;
import com.bah.ode.model.DdsData;
import com.bah.ode.model.OdeAdvisoryDataRaw;
import com.bah.ode.model.OdeFullMessage;
import com.bah.ode.model.OdeIntersectionDataRaw;
import com.bah.ode.model.OdeMetadata;
import com.bah.ode.model.OdeMsgAndMetadata;
import com.bah.ode.model.OdeVehicleDataFlat;
import com.bah.ode.wrapper.MQProducer;
import com.bah.ode.wrapper.WebSocketMessageHandler;

public class DdsMessageHandler implements WebSocketMessageHandler<DdsData> {

   private static final Logger logger = LoggerFactory
         .getLogger(DdsMessageHandler.class);
   
   private UUID uuid;  
   private Long seqNum;

   private MQProducer<String, String> producer;
   private OdeMetadata metadata;
   private static AppContext appContext = AppContext.getInstance(); 
   
   // FOR LOOPBACK TEST ONLY
   private Session clientSession;
   public Session getClientSession() {
      return clientSession;
   }
   public void setClientSession(Session clientSession) {
      this.clientSession = clientSession;
   }
   // FOR LOOPBACK TEST ONLY

   public DdsMessageHandler(OdeMetadata metadata) {
      if (!AppContext.loopbackTest()) {
         this.producer = new MQProducer<String, String>(
                     AppContext.getInstance().getParam(
                           AppContext.KAFKA_METADATA_BROKER_LIST));
      }
      this.metadata = metadata;
      this.uuid = UUID.randomUUID();
      this.seqNum = new Long(0);
   }

   @Override
   public void onMessage(DdsData ddsData) {
      try {
         if (ddsData.haveData()) {
            OdeMsgAndMetadata omam = new OdeMsgAndMetadata();
            omam.setMetadata(metadata);
            omam.setKey(metadata.getOutputTopic().getName());
            
            String topicName = metadata.getInputTopic().getName();
            if (ddsData.getVsd() != null) {
               VehSitDataMessage vsd = ddsData.getVsd();
               List<OdeVehicleDataFlat> ovdfList;
               if (Boolean.valueOf(
                     appContext.getParam(
                           AppContext.DDS_SEND_LATEST_VSR_IN_VSD_BUNDLE))) {
                  ovdfList = getLatestOvdfFromVsd(vsd, 1,
                        uuid.toString() + "." + seqNum++);
               } else {
                  ovdfList = getLatestOvdfFromVsd(
                        vsd, vsd.getBundle().getSize(),
                        uuid.toString() + "." + seqNum++);
               }
               
               for (OdeVehicleDataFlat ovdf : ovdfList) {
                  omam.setPayload(ovdf);
                  if (!AppContext.loopbackTest()) {
                     producer.send(topicName, metadata.getOutputTopic().getName(),
                           omam.toJson());
                  } else {
                     clientSession.getBasicRemote().sendText(omam.toJson());
                  }
               }
            } else { 
               if (ddsData.getIsd() != null) {
                  omam.setPayload(new OdeIntersectionDataRaw(ddsData.getIsd()));
               } else if (ddsData.getAsd() != null) {
                  omam.setPayload(new OdeAdvisoryDataRaw(ddsData.getAsd()));
               } else {
                  omam.setPayload(new OdeFullMessage(ddsData.getFullMessage()));
               }
               if (!AppContext.loopbackTest()) {
                  producer.send(topicName, metadata.getOutputTopic().getName(),
                        omam.toJson());
               } else {
                  clientSession.getBasicRemote().sendText(omam.toJson());
               }
            }
         }
      } catch (Exception e) {
         logger.error("Error handling DDS message. ", e);
      } finally {
      }
   }

   public static List<OdeVehicleDataFlat> getLatestOvdfFromVsd(
         VehSitDataMessage vsd, int count, String serialIdPrefix) {
      ArrayList<OdeVehicleDataFlat> ovdfList = new ArrayList<OdeVehicleDataFlat>();
      Bundle bundle = vsd.getBundle();
      GroupID groupId = vsd.groupID;
      int bSize = bundle.getSize();
      int id = 0;
      //data in the bundle appear to be in reverse chronological order
      if (bSize > 0 && count > 0 && count <= bSize) {
         for (int i = count-1; i >= 0; i--) {
            VehSitRecord vsr = bundle.get(i);
            OdeVehicleDataFlat ovdf = new OdeVehicleDataFlat(
                  serialIdPrefix + "." +id, 
                  groupId, vsr);
            ovdfList.add(ovdf);
         }
      }
      return ovdfList;
   }

   public void disable() {
      if (null != producer) {
         producer.shutDown();
         producer = null;
      }
   }

}
