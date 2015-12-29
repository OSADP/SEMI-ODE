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
   }
   
   public class OdeMiles extends OdeObject {
      private static final long serialVersionUID = 8637008266073501722L;
      public Integer miles;
      public OdeMiles(INTEGER miles) {
         this.miles = miles.intValue();
      }
   }
   
   public class OdeRadiusSteps extends OdeObject {
      private static final long serialVersionUID = -3486914187038490933L;
      public Integer radiusSteps;
      public OdeRadiusSteps(INTEGER radiusSteps) {
         this.radiusSteps = radiusSteps.intValue();
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
         km_chosen = new OdeKilometers(radius.getKm());
         break;
      case Raduis.miles_chosen:
         miles_chosen = new OdeMiles(radius.getMiles());
         break;
      case Raduis.radiusSteps_chosen:
         radiusSteps_chosen = new OdeRadiusSteps(radius.getRadiusSteps());
         break;
      }
   }

   
}