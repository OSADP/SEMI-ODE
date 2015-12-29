package com.bah.ode.asn;

import java.util.List;

import com.bah.ode.asn.oss.dsrc.ShapePointSet;
import com.bah.ode.model.OdeObject;

public class OdeShapePointSet extends OdeObject {

   private static final long serialVersionUID = 196400689274442073L;

   public OdePosition3D anchor;
   public Integer laneWidth;
   public OdeDirectionOfUse directionality;
   public List<OdeLaneOffsets> nodeList;

   public OdeShapePointSet(ShapePointSet shapePointSet) {
      this.anchor = new OdePosition3D(shapePointSet.getAnchor());
      if (shapePointSet.getLaneWidth() != null)
         this.laneWidth = shapePointSet.getLaneWidth().intValue();
      if (shapePointSet.getDirectionality() != null)
         this.directionality = OdeDirectionOfUse.valueOf(shapePointSet.getDirectionality().name());
      this.nodeList = OdeLaneOffsets.createList(shapePointSet.getNodeList());
   }

}