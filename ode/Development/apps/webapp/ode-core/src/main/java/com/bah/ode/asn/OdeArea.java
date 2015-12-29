package com.bah.ode.asn;

import com.bah.ode.asn.oss.dsrc.ValidRegion.Area;

public class OdeArea extends OdeChoice {

   private static final long serialVersionUID = -4164122642665529665L;

   public OdeCircle circle_chosen;
   public OdeRegionPointSet regionPointSet_chosen;
   public OdeShapePointSet shapePointSet_chosen;
   
   public OdeArea(Area area) {
      super();
      
      int flag = area.getChosenFlag();
      switch (flag) {
      case Area.circle_chosen:
         this.circle_chosen = new OdeCircle(area.getCircle());
         break;
      case Area.regionPointSet_chosen:
         this.regionPointSet_chosen = new OdeRegionPointSet(area.getRegionPointSet());
         break;
      case Area.shapePointSet_chosen:
         this.shapePointSet_chosen = new OdeShapePointSet(area.getShapePointSet());
         break;
      }
   }


   
}