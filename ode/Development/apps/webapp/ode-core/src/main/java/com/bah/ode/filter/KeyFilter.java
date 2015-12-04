package com.bah.ode.filter;

import java.util.List;

import com.bah.ode.model.HasKey;
import com.bah.ode.model.OdeFilterable;
import com.bah.ode.model.OdeMetadata;
import com.bah.ode.model.OdeRoadSegment;

public class KeyFilter extends BaseFilter {

   
   private List<OdeRoadSegment> segments;

   public KeyFilter() {
      super();
   }

   public KeyFilter(OdeMetadata metadata) {
      super();
      setMetadata(metadata);
   }

   @Override
   public boolean pass(OdeFilterable data) {
      if (data instanceof HasKey) {
         HasKey hasKey = (HasKey) data;
         if (segments != null) {
            for (OdeRoadSegment segment : segments){
               if (hasKey.getKey().equalsIgnoreCase(segment.getId()))
                  return true;
            }
            return false;
         }
      }
      return true;
   }

   @Override
   public BaseFilter setMetadata(OdeMetadata metadata) {
      super.setMetadata(metadata);
      if (getMetadata() != null && 
            getMetadata().getOdeRequest() != null && 
            getMetadata().getOdeRequest().getPolyline() != null) {
         segments = getMetadata().getOdeRequest().getPolyline().getSegments();
      }
      return this;
   }
}
