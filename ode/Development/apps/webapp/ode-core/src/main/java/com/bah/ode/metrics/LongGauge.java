package com.bah.ode.metrics;

import com.bah.ode.metrics.OdeMetrics.Gauge;

public class LongGauge implements Gauge<Long> {
   private Long value;
   
   @Override
   public Long getValue() {
       return value;
   }

   public void setValue(Long value) {
      this.value = value;
   }
   
   
}
