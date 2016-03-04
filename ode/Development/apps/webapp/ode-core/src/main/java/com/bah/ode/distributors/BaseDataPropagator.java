package com.bah.ode.distributors;

import java.text.ParseException;
import java.util.List;
import java.util.concurrent.Future;

import javax.websocket.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.context.AppContext;
import com.bah.ode.filter.OdeFilter;
import com.bah.ode.metrics.LongGauge;
import com.bah.ode.metrics.OdeMetrics;
import com.bah.ode.metrics.OdeMetrics.Meter;
import com.bah.ode.model.InternalDataMessage;
import com.bah.ode.model.OdeData;
import com.bah.ode.model.OdeDataMessage;
import com.bah.ode.model.OdeDataType;
import com.bah.ode.model.OdeFilterable;
import com.bah.ode.model.OdeIntersectionData;
import com.bah.ode.model.OdeMetadata;
import com.bah.ode.model.OdeMsgPayload;
import com.bah.ode.util.JsonUtils;
import com.bah.ode.util.WebSocketUtils;
import com.bah.ode.wrapper.DataProcessor;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public abstract class BaseDataPropagator implements DataProcessor<String, String> {

   private static Logger logger = LoggerFactory.getLogger(BaseDataPropagator.class);

   protected Session clientSession;
   protected OdeMetadata metadata;
   protected List<OdeFilter> filters;
   
   //Metrics
   protected Meter baseMeter = OdeMetrics.getInstance().meter("TotalRecordsPropagated");
   private static final LongGauge vsdLatency = new LongGauge();
   private static final LongGauge isdLatency = new LongGauge();
   private static final LongGauge asdLatency = new LongGauge();
   private static final LongGauge aggLatency = new LongGauge();

   static {
      OdeMetrics.getInstance().registerGauge(aggLatency, "AGG_Latency");
      OdeMetrics.getInstance().registerGauge(asdLatency, "ASD_Latency");
      OdeMetrics.getInstance().registerGauge(isdLatency, "ISD_Latency");
      OdeMetrics.getInstance().registerGauge(vsdLatency, "VSD_Latency");
   }

   public BaseDataPropagator(Session clientSession, OdeMetadata metadata) {
      super();
      this.clientSession = clientSession;
      this.metadata = metadata;
      filters = createFilters();
   }

   public BaseDataPropagator(Session session) {
      this.clientSession = session;
   }

   protected abstract List<OdeFilter> createFilters();
   
   @Override
    public Future<String> process(String data)
          throws DataProcessorException {
      
      baseMeter.mark();
      
      try {
         OdeDataMessage dataMsg = getDataMsg(data);
         if (dataMsg != null && dataMsg.getPayload() instanceof OdeFilterable) {
            if (applyFilters((OdeFilterable)dataMsg.getPayload())) {
               WebSocketUtils.send(clientSession, updateDataMsg(dataMsg));
            }
         } else {
            WebSocketUtils.send(clientSession, updateDataMsg(dataMsg));
         }
      } catch (Exception e) {
         throw new DataProcessorException(
               "Error processing data.", e);
      }
      return null;
   }

   protected String updateDataMsg(OdeDataMessage dataMsg) throws ParseException {
      if (dataMsg.getPayload() instanceof OdeData) {
         OdeMetrics.getInstance().cacheOut();

         OdeData odeData = (OdeData) dataMsg.getPayload();
         dataMsg.getMetadata().recordLatency(odeData.getReceivedAt());
      }

      OdeDataType dtype = OdeDataType.getByShortName(
            dataMsg.getMetadata().getPayloadType());
      
      switch(dtype) {
      case MapData:
         if (dataMsg.getMetadata().getLatency() != null)
            isdLatency.setValue(dataMsg.getMetadata().getLatency().longValue());
         dataMsg.getMetadata().setPayloadType(OdeDataType.MapData);
         OdeIntersectionData mapData = (OdeIntersectionData) dataMsg.getPayload();
         mapData.setSpatData(null);
         break;
      case SPaTData:
         if (dataMsg.getMetadata().getLatency() != null)
            isdLatency.setValue(dataMsg.getMetadata().getLatency().longValue());
         dataMsg.getMetadata().setPayloadType(OdeDataType.SPaTData);
         OdeIntersectionData spatData = (OdeIntersectionData) dataMsg.getPayload();
         spatData.setMapData(null);
         break;
      case VehicleData:
         if (dataMsg.getMetadata().getLatency() != null)
            vsdLatency.setValue(dataMsg.getMetadata().getLatency().longValue());
         break;
      case IntersectionData:
         if (dataMsg.getMetadata().getLatency() != null)
            isdLatency.setValue(dataMsg.getMetadata().getLatency().longValue());
         break;
      case AdvisoryData:
         if (dataMsg.getMetadata().getLatency() != null)
            asdLatency.setValue(dataMsg.getMetadata().getLatency().longValue());
         break;
      case AggregateData:
         if (dataMsg.getMetadata().getLatency() != null)
            aggLatency.setValue(dataMsg.getMetadata().getLatency().longValue());
         break;
      default:
         break;
      }
      
      return dataMsg.toJson();
   }

   protected OdeDataMessage getDataMsg(String data)
         throws DataProcessorException {
      try {
         ObjectNode idm = InternalDataMessage.jsonStringToObjectNode(data);
         if (idm != null) {
            JsonNode payloadNode = idm.get(AppContext.PAYLOAD_STRING);
            JsonNode metadataNode = idm.get(AppContext.METADATA_STRING);
            if (payloadNode != null && metadataNode != null) {
               JsonNode payloadTypeNode = metadataNode.get(AppContext.PAYLOAD_TYPE_STRING);
               if (payloadTypeNode != null) {
                  OdeDataType payloadType = OdeDataType.getByShortName(payloadTypeNode.textValue());
                  if (payloadType != null) {
                     OdeMsgPayload payload = (OdeMsgPayload) JsonUtils.fromJson(payloadNode
                           .toString(), payloadType.getClazz());
                     if (payload != null) {
                        return new OdeDataMessage(payload, 
                              metadataNode.get(AppContext.METADATA_VIOLATIONS_STRING));
                     } else {
                        throw new DataProcessorException(
                              "Unsupported payload type: " + payloadType);
                     }
                  } else {
                     throw new DataProcessorException(
                           "Unsupported payload type: " + payloadTypeNode);
                  }
               } else {
                  throw new DataProcessorException(
                        "Unsupported payload: " + payloadNode);
               }
            }
         }
      } catch (Exception e) {
         throw new DataProcessorException(
               "Error processing data.", e);
      }
      return null;
   }

   protected boolean applyFilters(OdeFilterable payload) {
      boolean allPassed = true;
      if (filters != null) {
          for (OdeFilter filter : filters) {
             if (!filter.pass(payload)) {
                allPassed = false;
                logger.info("Filtered by {}: {}",
                      filter.getClass().getSimpleName(),
                      payload.toString());
                break;
             }
          }
      }
      return allPassed;
   }
   
   public Session getClientSession() {
      return clientSession;
   }

   public void setClientSession(Session clientSession) {
      this.clientSession = clientSession;
   }

   public OdeMetadata getMetadata() {
      return metadata;
   }

   public void setMetadata(OdeMetadata metadata) {
      this.metadata = metadata;
   }
}
