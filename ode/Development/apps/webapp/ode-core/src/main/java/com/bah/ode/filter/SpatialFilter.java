package com.bah.ode.filter;

import java.math.BigDecimal;

import com.bah.ode.asn.OdeGeoRegion;
import com.bah.ode.asn.OdePosition3D;
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
         
         OdeGeoRegion region = new OdeGeoRegion(
               new OdePosition3D(nwLat, nwLon, new BigDecimal(0)), 
               new OdePosition3D(seLat, seLon, new BigDecimal(0)));
         
         return hasPosition.isWithinBounds(region);
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
