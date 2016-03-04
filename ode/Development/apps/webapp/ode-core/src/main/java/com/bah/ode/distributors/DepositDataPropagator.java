package com.bah.ode.distributors;

import java.util.List;
import java.util.concurrent.Future;

import javax.websocket.Session;

import com.bah.ode.filter.OdeFilter;
import com.bah.ode.model.OdeControlData;
import com.bah.ode.model.OdeDataMessage;
import com.bah.ode.model.OdeDataType;
import com.bah.ode.model.OdeMetadata;
import com.bah.ode.model.OdeMsgPayload;
import com.bah.ode.util.WebSocketUtils;

public class DepositDataPropagator extends BaseDataPropagator {

   public DepositDataPropagator(Session clientSession, OdeMetadata metadata) {
      super(clientSession, metadata);
   }

   public DepositDataPropagator(Session session) {
      super(session);
   }

   @Override
   protected List<OdeFilter> createFilters() {
      return null;
   }

   @Override
   public Future<String> process(String data)
         throws com.bah.ode.wrapper.DataProcessor.DataProcessorException {
      //Disregard the deposit response
      try {
         OdeDataMessage dataMsg = getDataMsg(data);
         if (dataMsg != null) {
            OdeMsgPayload payload = dataMsg.getPayload();
            if (payload.getDataType() == OdeDataType.Control) {
               OdeControlData controlData = (OdeControlData) payload;
               if (controlData.getDepositCount() > 0) {
                  WebSocketUtils.send(clientSession, metadata.getOdeRequest().toJson());
               }
            }
         }
      } catch (Exception e) {
         throw new DataProcessorException(
               "Error processing deposit response.", e);
      }

      return null;
   }

   
}
