package com.bah.ode.asn;

import java.util.ArrayList;
import java.util.List;

import com.bah.ode.asn.oss.dsrc.ValidRegion;
import com.bah.ode.model.OdeObject;

public class OdeValidRegion extends OdeObject {
   private static final long serialVersionUID = 5029639469363555078L;
   
   public enum OdeExtent {
      useInstantlyOnly, 
      useFor3meters, 
      useFor10meters, 
      useFor50meters, 
      useFor100meters, 
      useFor500meters, 
      useFor1000meters, 
      useFor5000meters, 
      useFor10000meters, 
      useFor50000meters, 
      useFor100000meters, 
      forever
   }

   private List<OdeHeadingSlice.SliceMask> directions;
   private OdeExtent extent;
   private OdeArea area;
   
   public OdeValidRegion(ValidRegion element) {
      setArea(new OdeArea(element.getArea()));;
      setDirections(OdeHeadingSlice.SliceMask.getByHeadingSlices(element.getDirection()));
      if (element.getExtent() != null)
         setExtent(OdeExtent.valueOf(element.getExtent().name()));
   }
   public List<OdeHeadingSlice.SliceMask> getDirections() {
      return directions;
   }
   public void setDirections(List<OdeHeadingSlice.SliceMask> directions) {
      this.directions = directions;
   }
   public OdeExtent getExtent() {
      return extent;
   }
   public void setExtent(OdeExtent extent) {
      this.extent = extent;
   }
   public OdeArea getArea() {
      return area;
   }
   public void setArea(OdeArea area) {
      this.area = area;
   }
   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((area == null) ? 0 : area.hashCode());
      result = prime * result
            + ((directions == null) ? 0 : directions.hashCode());
      result = prime * result + ((extent == null) ? 0 : extent.hashCode());
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
      OdeValidRegion other = (OdeValidRegion) obj;
      if (area == null) {
         if (other.area != null)
            return false;
      } else if (!area.equals(other.area))
         return false;
      if (directions == null) {
         if (other.directions != null)
            return false;
      } else if (!directions.equals(other.directions))
         return false;
      if (extent != other.extent)
         return false;
      return true;
   }
   public static ArrayList<OdeValidRegion> getRegions(
         ArrayList<ValidRegion> elements) {
      ArrayList<OdeValidRegion> regions = new ArrayList<OdeValidRegion>();
      for (ValidRegion element : elements) {
         regions.add(new OdeValidRegion(element));
      }
      return regions;
   }
   
   

}
