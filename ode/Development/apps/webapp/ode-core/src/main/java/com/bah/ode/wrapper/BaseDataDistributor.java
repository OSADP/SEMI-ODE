package com.bah.ode.wrapper;

import java.util.List;
import java.util.concurrent.Future;

import javax.websocket.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.context.AppContext;
import com.bah.ode.filter.OdeFilter;
import com.bah.ode.model.InternalDataMessage;
import com.bah.ode.model.OdeDataMessage;
import com.bah.ode.model.OdeDataType;
import com.bah.ode.model.OdeFilterable;
import com.bah.ode.model.OdeMetadata;
import com.bah.ode.model.OdeMsgPayload;
import com.bah.ode.util.JsonUtils;
import com.bah.ode.util.WebSocketUtils;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public abstract class BaseDataDistributor implements DataProcessor<String, String> {

   private static Logger logger = LoggerFactory.getLogger(BaseDataDistributor.class);

   protected Session clientSession;
   protected OdeMetadata metadata;
   protected List<OdeFilter> filters;

   public BaseDataDistributor(Session clientSession, OdeMetadata metadata) {
      super();
      this.clientSession = clientSession;
      this.metadata = metadata;
      filters = createFilters();
   }

   protected abstract List<OdeFilter> createFilters();
   
   @Override
    public Future<String> process(String data)
          throws DataProcessorException {
       try {
          ObjectNode idm = InternalDataMessage.jsonStringToObjectNode(data);
          if (idm != null) {
             JsonNode payloadNode = idm.get(AppContext.PAYLOAD_STRING);
             if (payloadNode != null) {
                JsonNode payloadTypeNode = idm.get(AppContext.METADATA_STRING).get(AppContext.PAYLOAD_TYPE_STRING);
                if (payloadTypeNode != null) {
                   OdeDataType payloadType = OdeDataType.getByShortName(payloadTypeNode.textValue());
                   if (payloadType != null) {
                      OdeMsgPayload payload = (OdeMsgPayload) JsonUtils.fromJson(payloadNode
                            .toString(), payloadType.getClazz());
                      if (payload != null && payload instanceof OdeFilterable) {
                         boolean allPassed = applyFilters((OdeFilterable)payload);
   
                         if (allPassed) {
                            OdeDataMessage dataMsg = new OdeDataMessage(payload);
                            WebSocketUtils.send(clientSession, dataMsg.toJson());
                         }
                      }
                   } else {
                      throw new DataProcessorException(
                            "Unsupported payload type: " + payloadTypeNode);
                   }
                } else {
                   throw new DataProcessorException(
                         "Unsupported payload type: " + payloadNode);
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
       for (OdeFilter filter : filters) {
          if (!filter.pass(payload)) {
             allPassed = false;
             logger.info("Filtered by {}: {}",
                   filter.getClass().getSimpleName(),
                   payload.toString());
             break;
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
