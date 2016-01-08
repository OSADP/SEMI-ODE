package com.bah.ode.asn;

import com.bah.ode.asn.oss.dsrc.Circle.Raduis;
import com.bah.ode.model.OdeObject;
import com.oss.asn1.INTEGER;

public class OdeRadius extends OdeChoice {

   private static final long serialVersionUID = -1615313015072982197L;

   public class OdeKilometers extends OdeObject {
      private static final long serialVersionUID = -7588769034537763059L;
      public Integer km;
      public OdeKilometers(INTEGER km) {
         this.km = km.intValue();
      }
      @Override
      public int hashCode() {
         final int prime = 31;
         int result = 1;
         result = prime * result + getOuterType().hashCode();
         result = prime * result + ((km == null) ? 0 : km.hashCode());
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
         OdeKilometers other = (OdeKilometers) obj;
         if (!getOuterType().equals(other.getOuterType()))
            return false;
         if (km == null) {
            if (other.km != null)
               return false;
         } else if (!km.equals(other.km))
            return false;
         return true;
      }
      private OdeRadius getOuterType() {
         return OdeRadius.this;
      }
      
   }
   
   public class OdeMiles extends OdeObject {
      private static final long serialVersionUID = 8637008266073501722L;
      public Integer miles;
      public OdeMiles(INTEGER miles) {
         this.miles = miles.intValue();
      }
      @Override
      public int hashCode() {
         final int prime = 31;
         int result = 1;
         result = prime * result + getOuterType().hashCode();
         result = prime * result + ((miles == null) ? 0 : miles.hashCode());
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
         OdeMiles other = (OdeMiles) obj;
         if (!getOuterType().equals(other.getOuterType()))
            return false;
         if (miles == null) {
            if (other.miles != null)
               return false;
         } else if (!miles.equals(other.miles))
            return false;
         return true;
      }
      private OdeRadius getOuterType() {
         return OdeRadius.this;
      }
      
      
   }
   
   public class OdeRadiusSteps extends OdeObject {
      private static final long serialVersionUID = -3486914187038490933L;
      public Integer radiusSteps;
      public OdeRadiusSteps(INTEGER radiusSteps) {
         this.radiusSteps = radiusSteps.intValue();
      }
      @Override
      public int hashCode() {
         final int prime = 31;
         int result = 1;
         result = prime * result + getOuterType().hashCode();
         result = prime * result
               + ((radiusSteps == null) ? 0 : radiusSteps.hashCode());
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
         OdeRadiusSteps other = (OdeRadiusSteps) obj;
         if (!getOuterType().equals(other.getOuterType()))
            return false;
         if (radiusSteps == null) {
            if (other.radiusSteps != null)
               return false;
         } else if (!radiusSteps.equals(other.radiusSteps))
            return false;
         return true;
      }
      private OdeRadius getOuterType() {
         return OdeRadius.this;
      }
      
      
   }
   
   public OdeKilometers km_chosen;
   public OdeMiles miles_chosen;
   public OdeRadiusSteps radiusSteps_chosen;
   
   public OdeRadius(Raduis radius) {
      super();

      int flag = radius.getChosenFlag();
      switch (flag) {
      case Raduis.km_chosen:
         if (radius.hasKm())
            km_chosen = new OdeKilometers(radius.getKm());
         break;
      case Raduis.miles_chosen:
         if (radius.hasMiles())
            miles_chosen = new OdeMiles(radius.getMiles());
         break;
      case Raduis.radiusSteps_chosen:
         if (radius.hasRadiusSteps())
            radiusSteps_chosen = new OdeRadiusSteps(radius.getRadiusSteps());
         break;
      }
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result
            + ((km_chosen == null) ? 0 : km_chosen.hashCode());
      result = prime * result
            + ((miles_chosen == null) ? 0 : miles_chosen.hashCode());
      result = prime * result + ((radiusSteps_chosen == null) ? 0
            : radiusSteps_chosen.hashCode());
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
      OdeRadius other = (OdeRadius) obj;
      if (km_chosen == null) {
         if (other.km_chosen != null)
            return false;
      } else if (!km_chosen.equals(other.km_chosen))
         return false;
      if (miles_chosen == null) {
         if (other.miles_chosen != null)
            return false;
      } else if (!miles_chosen.equals(other.miles_chosen))
         return false;
      if (radiusSteps_chosen == null) {
         if (other.radiusSteps_chosen != null)
            return false;
      } else if (!radiusSteps_chosen.equals(other.radiusSteps_chosen))
         return false;
      return true;
   }

   
}