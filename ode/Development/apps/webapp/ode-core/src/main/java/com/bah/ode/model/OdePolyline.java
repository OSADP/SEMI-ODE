package com.bah.ode.model;

import java.util.Map;

public class OdePolygon extends OdeObject {

   private static final long serialVersionUID = 5134542729829508388L;

   private Map<String, OdeRoadSegment> segments;
   
   public OdePolygon addSegment(OdeRoadSegment segment) {
      segments.put(segment.getId(), segment);
      return this;
   }

   public Map<String, OdeRoadSegment> getSegments() {
      return segments;
   }

   public OdePolygon setSegments(Map<String, OdeRoadSegment> segments) {
      this.segments = segments;
      return this;
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((segments == null) ? 0 : segments.hashCode());
      return result;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      OdePolygon other = (OdePolygon) obj;
      if (segments == null) {
         if (other.segments != null)
            return false;
      } else if (!segments.equals(other.segments))
         return false;
      return true;
   }

   
}
