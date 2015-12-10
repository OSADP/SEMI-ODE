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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.asn.oss.semi.GroupID;
import com.bah.ode.asn.oss.semi.VehSitDataMessage;
import com.bah.ode.asn.oss.semi.VehSitDataMessage.Bundle;
import com.bah.ode.asn.oss.semi.VehSitRecord;
import com.bah.ode.context.AppContext;
import com.bah.ode.model.DdsData;
import com.bah.ode.model.InternalDataMessage;
import com.bah.ode.model.OdeAdvisoryDataRaw;
import com.bah.ode.model.OdeControlData;
import com.bah.ode.model.OdeData;
import com.bah.ode.model.OdeDataMessage;
import com.bah.ode.model.OdeFullMessage;
import com.bah.ode.model.OdeIntersectionDataRaw;
import com.bah.ode.model.OdeMetadata;
import com.bah.ode.model.OdeQryRequest;
import com.bah.ode.model.OdeRequestType;
import com.bah.ode.model.OdeVehicleDataFlat;
import com.bah.ode.wrapper.BaseDataDistributor;
import com.bah.ode.wrapper.DataProcessor.DataProcessorException;
import com.bah.ode.wrapper.MQProducer;
import com.bah.ode.wrapper.WebSocketMessageHandler;

public class DdsMessageHandler implements WebSocketMessageHandler<DdsData> {

   private static final Logger logger = LoggerFactory
         .getLogger(DdsMessageHandler.class);
   
   private UUID uuid;  
   private Long seqNum;
   private Integer limit;
   private Integer skip;
   private long skipCount = 0;
   private long recordCount = 0;
   private long receivedRecordCount = 0;

   private MQProducer<String, String> producer;
   private OdeMetadata metadata;
   private static AppContext appContext = AppContext.getInstance(); 
   
   // FOR LOOPBACK TEST ONLY
   private BaseDataDistributor distributor;
   
   public BaseDataDistributor getDistributor() {
      return distributor;
   }
   public void setDistributor(BaseDataDistributor distributor) {
      this.distributor = distributor;
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
      if (this.metadata.getOdeRequest().getRequestType() == OdeRequestType.Query) {
         OdeQryRequest queryReq = (OdeQryRequest) this.metadata.getOdeRequest();
         skip = queryReq.getSkip();
         limit = queryReq.getLimit();
      }
   }

   @Override
   public void onMessage(DdsData ddsData) {
      try {
         if (ddsData.haveData()) {
            InternalDataMessage idm = new InternalDataMessage();
            idm.setMetadata(metadata);
            
            String topicName;
            if (ddsData.getVsd() != null) {
               topicName = metadata.getInputTopic().getName();
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
                  if (checkSkipAndLimit())
                     sendVehicleData(idm, topicName, ovdf);
               }
            } else {
               OdeData odeData;
               boolean sendRecord = checkSkipAndLimit();
               if (ddsData.getIsd() != null) {
                  topicName = metadata.getInputTopic().getName();
                  odeData = new OdeIntersectionDataRaw(ddsData.getIsd());
                  idm.setKey(odeData.getSerialId());
                  idm.setPayload(odeData);
               } else if (ddsData.getAsd() != null) {
                  topicName = metadata.getInputTopic().getName();
                  odeData = new OdeAdvisoryDataRaw(ddsData.getAsd());
                  idm.setKey(odeData.getSerialId());
                  idm.setPayload(odeData);
               } else if (ddsData.getControlMessage() != null) {
                  topicName = metadata.getOutputTopic().getName();
                  OdeControlData controlData = new OdeControlData(ddsData.getControlMessage());
                  if (controlData.getTag() == OdeControlData.Tag.STOP)
                     controlData.setReceivedRecordCount(receivedRecordCount);
                  
                  idm.setPayload(controlData);
                  // Always send control data
                  sendRecord = true;
               } else {
                  topicName = metadata.getOutputTopic().getName();
                  idm.setPayload(new OdeFullMessage(ddsData.getFullMessage()));
                  //Always send unknown data
                  sendRecord = true;
               }
               
               if (sendRecord) {
                  if (!AppContext.loopbackTest()) {
                     producer.send(topicName, idm.getKey(), idm.toJson());
                  } else {
                     distributor.process(new OdeDataMessage(idm.getPayload()).toJson());
                  }
               }
            }
         }
      } catch (Exception e) {
         logger.error("Error handling DDS message. ", e);
      } finally {
      }
   }
   
   private boolean checkSkipAndLimit() {
      receivedRecordCount++;
      if (skip != null && skipCount < skip.intValue()) {
         skipCount++;
         return false;
      }
      
      if (limit == null || recordCount < limit.intValue()) {
         // Only count when limit is specified
         if (limit != null)
            recordCount++;
         return true;
      }
      return false;
   }
   
   private void sendVehicleData(InternalDataMessage idm, String topicName,
         OdeVehicleDataFlat ovdf)
               throws DataProcessorException {
      idm.setKey(ovdf.getSerialId());
      idm.getMetadata().setKey(idm.getKey());
      idm.setPayload(ovdf);
      if (!AppContext.loopbackTest()) {
         producer.send(topicName, idm.getKey(), idm.toJson());
      } else {
         distributor.process(new OdeDataMessage(ovdf).toJson());
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
            String serialId = serialIdPrefix + "." + id++;
            OdeVehicleDataFlat ovdf = new OdeVehicleDataFlat(
                  serialId, 
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
