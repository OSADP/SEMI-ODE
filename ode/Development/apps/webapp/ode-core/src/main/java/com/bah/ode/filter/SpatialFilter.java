package com.bah.ode.filter;

import java.math.BigDecimal;

import com.bah.ode.model.HasPosition;
import com.bah.ode.model.OdeFilterable;
import com.bah.ode.model.OdeMetadata;

public class SpatialFilter extends BaseFilter {

   
   private BigDecimal nwLat;
   private BigDecimal nwLon;
   private BigDecimal seLat;
   private BigDecimal seLon;

   public SpatialFilter() {
      super();
   }

   public SpatialFilter(OdeMetadata metadata) {
      super();
      this.setMetadata(metadata);
   }

   @Override
   public boolean pass(OdeFilterable data) {
      if (data instanceof HasPosition) {
         HasPosition hasPosition = (HasPosition) data;
         if (nwLat == null || hasPosition.getLatitude().doubleValue() > nwLat.doubleValue())
            return false;
         if (nwLon == null || hasPosition.getLongitude().doubleValue() < nwLon.doubleValue())
            return false;
         if (seLat == null || hasPosition.getLatitude().doubleValue() < seLat.doubleValue())
            return false;
         if (seLon == null || hasPosition.getLongitude().doubleValue() > seLon.doubleValue())
            return false;
      }
      return true;
   }

   @Override
   public BaseFilter setMetadata(OdeMetadata metadata) {
      super.setMetadata(metadata);
      if (getMetadata() != null && getMetadata().getOdeRequest() != null) {
         if (getMetadata().getOdeRequest().getNwLat() != null)
            nwLat = getMetadata().getOdeRequest().getNwLat();
         if (getMetadata().getOdeRequest().getNwLon() != null)
            nwLon = getMetadata().getOdeRequest().getNwLon();
         if (getMetadata().getOdeRequest().getSeLat() != null)
            seLat = getMetadata().getOdeRequest().getSeLat();
         if (getMetadata().getOdeRequest().getSeLon() != null)
            seLon = getMetadata().getOdeRequest().getSeLon();
      }
      return this;
   }

}
