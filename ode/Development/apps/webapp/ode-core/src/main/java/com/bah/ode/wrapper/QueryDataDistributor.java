package com.bah.ode.wrapper;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

import javax.websocket.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.filter.OdeFilter;
import com.bah.ode.filter.SpatialFilter;
import com.bah.ode.filter.TemporalFilter;
import com.bah.ode.model.InternalDataMessage;
import com.bah.ode.model.OdeControlData;
import com.bah.ode.model.OdeDataMessage;
import com.bah.ode.model.OdeDataType;
import com.bah.ode.model.OdeFilterable;
import com.bah.ode.model.OdeMetadata;
import com.bah.ode.model.OdeMsgPayload;
import com.bah.ode.model.OdeQryRequest;
import com.bah.ode.util.JsonUtils;
import com.bah.ode.util.WebSocketUtils;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

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
         ObjectNode idm = InternalDataMessage.jsonStringToObjectNode(data);
         if (idm != null) {
            JsonNode payloadNode = idm.get("payload");
            if (payloadNode != null) {
               JsonNode payloadTypeNode = idm.get("payloadType");
               if (payloadTypeNode != null) {
                  OdeDataType payloadType = OdeDataType
                        .getByShortName(payloadTypeNode.textValue());
                  if (payloadType == OdeDataType.Control) {
                     // OdeControlData payload = (OdeControlData) JsonUtils.fromObjectNode(payloadNode, OdeControlData.class);
                     // Tried using the above but it doesn't work, so I'm forced
                     // to use the string representation
                     OdeControlData controlRec = (OdeControlData) JsonUtils
                           .fromJson(payloadNode.toString(),
                                 OdeControlData.class);
                     if (controlRec.getTag() == OdeControlData.Tag.STOP) {
                        stopRecord = controlRec;
                        OdeDataMessage stopMsg = new OdeDataMessage(stopRecord);
                        WebSocketUtils.send(clientSession, stopMsg.toJson());
                     }
                     logger.info("Control Message Received: {}", controlRec.toString());
                  } else {
                     OdeMsgPayload payload = (OdeMsgPayload) JsonUtils.fromJson(payloadNode
                           .toString(), payloadNode.get("className").textValue());
                     if (payload != null && 
                           payload instanceof OdeFilterable && 
                           recordCount < limit) {
                        boolean allPassed = applyFilters((OdeFilterable)payload);

                        if (allPassed) {
                           recordCount++;
                           OdeDataMessage dataMsg = new OdeDataMessage(payload);
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
                     }
                  }
               }
            }
         }
      } catch (Exception e) {
         throw new DataProcessorException("Error processing data.", e);
      }
      return null;
   }

}
