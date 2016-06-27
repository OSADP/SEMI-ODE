package com.bah.ode.distributors;

import java.util.List;
import java.util.concurrent.Future;

import javax.websocket.Session;

import com.bah.ode.filter.OdeFilter;
import com.bah.ode.model.OdeMetadata;
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
   public synchronized Future<String> process(String data)
         throws com.bah.ode.wrapper.DataProcessor.DataProcessorException {
      try {
         if (clientSessionIsOpen())
         WebSocketUtils.send(clientSession, data);
      } catch (Exception e) {
         throw new DataProcessorException(
               "Error processing deposit response.", e);
      }

      return null;
   }

   
}
