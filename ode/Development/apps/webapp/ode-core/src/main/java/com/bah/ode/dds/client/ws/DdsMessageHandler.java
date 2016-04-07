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
import com.bah.ode.distributors.BaseDataPropagator;
import com.bah.ode.metrics.OdeMetrics;
import com.bah.ode.metrics.OdeMetrics.Meter;
import com.bah.ode.model.ControlTag;
import com.bah.ode.model.DdsData;
import com.bah.ode.model.InternalDataMessage;
import com.bah.ode.model.OdeAdvisoryData;
import com.bah.ode.model.OdeControlData;
import com.bah.ode.model.OdeData;
import com.bah.ode.model.OdeDataMessage;
import com.bah.ode.model.OdeFullMessage;
import com.bah.ode.model.OdeIntersectionData;
import com.bah.ode.model.OdeMetadata;
import com.bah.ode.model.OdeQryRequest;
import com.bah.ode.model.OdeRequestType;
import com.bah.ode.model.OdeVehicleDataFlat;
import com.bah.ode.wrapper.DataProcessor.DataProcessorException;
import com.bah.ode.wrapper.MQProducer;
import com.bah.ode.wrapper.WebSocketMessageHandler;

public class DdsMessageHandler implements WebSocketMessageHandler<DdsData> {

   private static final Logger logger = LoggerFactory
         .getLogger(DdsMessageHandler.class);
   
   private String streamId;  
   private long bundleId;
   private Integer limit;
   private Integer skip;
   private long skipCount = 0;
   private long recordCount = 0;
   private long receivedRecordCount = 0;

   private MQProducer<String, String> producer;
   private OdeMetadata metadata;
   private static AppContext appContext = AppContext.getInstance(); 
   

   private Meter meter = OdeMetrics.getInstance().meter("TotalRecordsReceived");
   private Meter vsdMeter = OdeMetrics.getInstance().meter("VSD_BundlesReceived");
   private Meter isdMeter = OdeMetrics.getInstance().meter("ISD_RecordsReceived");
   private Meter asdMeter = OdeMetrics.getInstance().meter("ASD_RecordsReceived");
   

   // FOR LOOPBACK TEST ONLY
   private BaseDataPropagator loopbackTestPropagator;
   
   public BaseDataPropagator getLoopbackTestPropagator() {
      return loopbackTestPropagator;
   }
   public void setLoopbackTestPropagator(BaseDataPropagator propagator) {
      this.loopbackTestPropagator = propagator;
   }
   // FOR LOOPBACK TEST ONLY

   public DdsMessageHandler(OdeMetadata metadata) {
      if (!AppContext.loopbackTest()) {
         this.producer = new MQProducer<String, String>(
                     AppContext.getInstance().getParam(
                           AppContext.KAFKA_METADATA_BROKER_LIST));
      }
      this.metadata = metadata;
      this.streamId = UUID.randomUUID().toString();
      this.bundleId = new Long(0);
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
               int numVSRs = appContext.getInt(
                     AppContext.DDS_NUM_VSR_IN_BUNDLE_TO_USE,
                     AppContext.DEFAULT_DDS_NUM_VSR_IN_BUNDLE_TO_USE);
               List<OdeVehicleDataFlat> ovdfList = getLatestOvdfFromVsd(
                     vsd, numVSRs,
                     streamId.toString(), bundleId++);
               
               for (OdeVehicleDataFlat ovdf : ovdfList) {

                  meter.mark();
                  vsdMeter.mark();
                  OdeMetrics.getInstance().cacheIn();
                  
                  if (checkSkipAndLimit())
                     sendVehicleData(idm, topicName, ovdf);
               }
            } else {
               OdeData odeData;
               //Send records by default, unless otherwise changed by checkSkipAndLimit()
               boolean sendRecord = true;
               if (ddsData.getIsd() != null) {
                  topicName = metadata.getInputTopic().getName();
                  odeData = new OdeIntersectionData(
                        OdeData.buildSerialId(streamId, bundleId++, 0),
                        ddsData.getIsd());

                  meter.mark();
                  isdMeter.mark();
                  OdeMetrics.getInstance().cacheIn();
                  
                  idm.setKey(odeData.getSerialId());
                  idm.setPayload(odeData);
                  sendRecord = checkSkipAndLimit();
               } else if (ddsData.getAsd() != null) {
                  topicName = metadata.getInputTopic().getName();
                  odeData = new OdeAdvisoryData(
                        OdeData.buildSerialId(streamId, bundleId++, 0),
                        ddsData.getAsd());
                  
                  meter.mark();
                  asdMeter.mark();
                  OdeMetrics.getInstance().cacheIn();
                  
                  idm.setKey(odeData.getSerialId());
                  idm.setPayload(odeData);
                  sendRecord = checkSkipAndLimit();
               } else if (ddsData.getControlMessage() != null) {
                  topicName = metadata.getOutputTopic().getName();
                  OdeControlData controlData = new OdeControlData(ddsData.getControlMessage());
                  if (controlData.getTag() == ControlTag.STOP)
                     controlData.setReceivedRecordCount(receivedRecordCount);
                  
                  idm.setPayload(controlData);
               } else {
                  topicName = metadata.getOutputTopic().getName();
                  idm.setPayload(new OdeFullMessage(ddsData.getFullMessage()));
               }
               
               if (sendRecord) {
                  if (!AppContext.loopbackTest()) {
                     producer.send(topicName, idm.getKey(), idm.toJson());
                  } else {
                     loopbackTestPropagator.process(new OdeDataMessage(idm.getPayload()).toJson());
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
         loopbackTestPropagator.process(new OdeDataMessage(ovdf).toJson());
      }
   }

   public static List<OdeVehicleDataFlat> getLatestOvdfFromVsd(
         VehSitDataMessage vsd, int count, String streamId, long bundleId) {
      ArrayList<OdeVehicleDataFlat> ovdfList = new ArrayList<OdeVehicleDataFlat>();
      Bundle bundle = vsd.getBundle();
      GroupID groupId = vsd.groupID;
      int bSize = bundle.getSize();
      int recordId = 0;
      
      if (count > bSize)
         count = bSize;
      
      //data in the bundle appear to be in reverse chronological order
      if (bSize > 0 && count > 0) {
         for (int i = count-1; i >= 0; i--) {
            VehSitRecord vsr = bundle.get(i);
            OdeVehicleDataFlat ovdf = new OdeVehicleDataFlat(
                  OdeData.buildSerialId(streamId, bundleId, recordId++),
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
