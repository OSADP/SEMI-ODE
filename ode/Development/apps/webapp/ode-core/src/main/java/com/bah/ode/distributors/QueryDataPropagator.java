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
import com.bah.ode.metrics.OdeMetrics;
import com.bah.ode.metrics.OdeMetrics.Context;
import com.bah.ode.metrics.OdeMetrics.Meter;
import com.bah.ode.model.OdeControlData;
import com.bah.ode.model.OdeDataMessage;
import com.bah.ode.model.OdeDataType;
import com.bah.ode.model.OdeFilterable;
import com.bah.ode.model.OdeMetadata;
import com.bah.ode.model.OdeMsgPayload;
import com.bah.ode.model.OdeQryRequest;
import com.bah.ode.model.ControlTag;
import com.bah.ode.util.WebSocketUtils;

public class QueryDataPropagator extends BaseDataPropagator {
   private static Logger logger = LoggerFactory
         .getLogger(QueryDataPropagator.class);
   private long recordCount;
   private Integer limit;
   private OdeControlData stopRecord;
   private Meter queryMeter = OdeMetrics.getInstance().meter("QueryDataPropagated");

   public QueryDataPropagator(Session clientSession, OdeMetadata metadata) {
      super(clientSession, metadata);
      OdeQryRequest queryReq = (OdeQryRequest) metadata.getOdeRequest();
      limit = queryReq.getLimit();
   }

   public QueryDataPropagator(Session session) {
      super(session);
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
      queryMeter.mark();
      baseMeter.mark();
      Context context = timer.time();
      
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
               if (controlRec != null && controlRec.getTag() == ControlTag.STOP) {
                  stopRecord = controlRec;
                  OdeDataMessage stopMsg = new OdeDataMessage(stopRecord);
                  WebSocketUtils.send(clientSession, stopMsg.toJson());
               }
               logger.info("Control Message Received: {}", controlRec.toString());
            } else { // Not a Control record
               OdeMsgPayload payload = dataMsg.getPayload();
               if (payload != null && payload instanceof OdeFilterable) { 
                  if (limit != null) {
                     if (recordCount < limit) {
                        if (applyFilters((OdeFilterable)payload)) {
                           recordCount++;
                           WebSocketUtils.send(clientSession, updateDataMsg(dataMsg));
                        }

                        if (recordCount >= limit) {
                           OdeDataMessage stopMsg;
                           if (stopRecord != null) {
                              stopRecord.setSentRecordCount(recordCount);
                           } else {
                              stopRecord = new OdeControlData(ControlTag.STOP)
                                    .setSentRecordCount(recordCount);
                           }
                           stopMsg = new OdeDataMessage(stopRecord);
                           WebSocketUtils.send(clientSession, stopMsg.toJson());
                        }
                     }
                  } else { // We DON'T have a limit
                     if (applyFilters((OdeFilterable)payload)) {
                        recordCount++;
                        WebSocketUtils.send(clientSession, updateDataMsg(dataMsg));
                     }

                     if (stopRecord != null &&
                           stopRecord.getSentRecordCount() != null &&
                           recordCount >= stopRecord.getSentRecordCount()) {
                        stopRecord.setSentRecordCount(recordCount);
                        OdeDataMessage stopMsg = new OdeDataMessage(stopRecord);
                        WebSocketUtils.send(clientSession, stopMsg.toJson());
                     }
                  }
               }// We have a Filterable paylaod
            }// Not a Control record
         }// dataMsg != null 
      } catch (Exception e) {
         //if the session is not open, ignore the exception
         if (clientSession.isOpen())
            logger.error("Error processing data.", e);
      }
      context.stop();
      
      return null;
   }

}
