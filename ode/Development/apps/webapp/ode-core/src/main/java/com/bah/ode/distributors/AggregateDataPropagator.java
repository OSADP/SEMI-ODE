package com.bah.ode.distributors;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

import javax.websocket.Session;

import com.bah.ode.filter.KeyFilter;
import com.bah.ode.filter.OdeFilter;
import com.bah.ode.metrics.OdeMetrics;
import com.bah.ode.metrics.OdeMetrics.Meter;
import com.bah.ode.model.OdeMetadata;

public class AggregateDataPropagator extends BaseDataPropagator {

   private Meter aggMeter = OdeMetrics.getInstance().meter("AggregateDataPropagated");
   
   public AggregateDataPropagator(Session clientSession,
         OdeMetadata metadata) {
      super(clientSession, metadata);
   }

   @Override
   public Future<String> process(String data)
         throws com.bah.ode.wrapper.DataProcessor.DataProcessorException {
      aggMeter.mark();
      return super.process(data);
   }
   
   @Override
   protected List<OdeFilter> createFilters() {
      List<OdeFilter> filters = new ArrayList<OdeFilter>();
      filters.add(new KeyFilter(this.metadata));
      return filters;
   }

}
