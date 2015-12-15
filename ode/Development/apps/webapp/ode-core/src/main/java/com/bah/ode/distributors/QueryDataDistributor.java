package com.bah.ode.distributors;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

import javax.websocket.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.filter.OdeFilter;
import com.bah.ode.filter.SpatialFilter;
import com.bah.ode.filter.TemporalFilter;
import com.bah.ode.model.OdeControlData;
import com.bah.ode.model.OdeDataMessage;
import com.bah.ode.model.OdeDataType;
import com.bah.ode.model.OdeFilterable;
import com.bah.ode.model.OdeMetadata;
import com.bah.ode.model.OdeMsgPayload;
import com.bah.ode.model.OdeQryRequest;
import com.bah.ode.util.WebSocketUtils;

public class QueryDataDistributor extends BaseDataDistributor {
   private static Logger logger = LoggerFactory
         .getLogger(QueryDataDistributor.class);
   private long recordCount;
   private long limit;
   private OdeControlData stopRecord;

   public QueryDataDistributor(Session clientSession, OdeMetadata metadata) {
      super(clientSession, metadata);
      OdeQryRequest queryReq = (OdeQryRequest) metadata.getOdeRequest();
      limit = queryReq.getLimit();
   }

   @Override
   protected List<OdeFilter> createFilters() {
      List<OdeFilter> filters = new ArrayList<OdeFilter>();
      filters.add(new SpatialFilter(this.metadata));
      filters.add(new TemporalFilter(this.metadata));
      return filters;
   }

   @Override
   public Future<String> process(String data) throws DataProcessorException {
      try {
         OdeDataMessage dataMsg = getDataMsg(data);
         if (dataMsg != null) {
            OdeDataType payloadType = OdeDataType
                  .getByShortName(dataMsg.getMetadata().getPayloadType());
            if (payloadType == OdeDataType.Control) {
               // OdeControlData payload = (OdeControlData) JsonUtils.fromObjectNode(payloadNode, OdeControlData.class);
               // Tried using the above but it doesn't work, so I'm forced
               // to use the string representation
               OdeControlData controlRec = (OdeControlData) dataMsg.getPayload();
               if (controlRec != null && controlRec.getTag() == OdeControlData.Tag.STOP) {
                  stopRecord = controlRec;
                  OdeDataMessage stopMsg = new OdeDataMessage(stopRecord);
                  WebSocketUtils.send(clientSession, stopMsg.toJson());
               }
               logger.info("Control Message Received: {}", controlRec.toString());
            } else { // Not a Control record
               OdeMsgPayload payload = dataMsg.getPayload();
               if (payload != null && 
                     payload instanceof OdeFilterable && 
                     recordCount < limit) {
                  if (applyFilters((OdeFilterable)payload)) {
                     recordCount++;
                     WebSocketUtils.send(clientSession, dataMsg.toJson());
                  }

                  if (recordCount >= limit) {
                     OdeDataMessage stopMsg;
                     if (stopRecord != null) {
                        stopRecord.setSentRecordCount(recordCount);
                     } else {
                        stopRecord = new OdeControlData(OdeControlData.Tag.STOP)
                              .setSentRecordCount(recordCount);
                     }
                     stopMsg = new OdeDataMessage(stopRecord);
                     WebSocketUtils.send(clientSession, stopMsg.toJson());
                  }
               }// recordCount < limit
            }// Not a Control record
         }// dataMsg != null 
      } catch (Exception e) {
         throw new DataProcessorException("Error processing data.", e);
      }
      return null;
   }

}