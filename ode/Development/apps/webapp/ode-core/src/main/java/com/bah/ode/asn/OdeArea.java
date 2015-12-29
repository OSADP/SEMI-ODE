package com.bah.ode.asn;

import com.bah.ode.asn.oss.dsrc.ValidRegion.Area;

public class OdeArea extends OdeChoice {

   private static final long serialVersionUID = -4164122642665529665L;

   public OdeArea(Area area) {
      int flag = area.getChosenFlag();
      switch (flag) {
      case Area.circle_chosen:
         setChosenObject(new OdeCircle(area.getCircle()));
         break;
      case Area.regionPointSet_chosen:
         setChosenObject(new OdeRegionPointSet(area.getRegionPointSet()));
         break;
      case Area.shapePointSet_chosen:
         setChosenObject(new OdeShapePointSet(area.getShapePointSet()));
         break;
      }
   }

   
}