package com.bah.ode.asn;

import java.util.List;

import com.bah.ode.asn.oss.dsrc.RegionPointSet;
import com.bah.ode.model.OdeObject;

public class OdeRegionPointSet extends OdeObject {

   private static final long serialVersionUID = -2354156235911875831L;

   public OdePosition3D anchor;
   public List<OdeRegionOffsets> nodeList;

   public OdeRegionPointSet(RegionPointSet regionPointSet) {
      this.anchor = new OdePosition3D(regionPointSet.getAnchor());
      this.nodeList = OdeRegionOffsets.createList(regionPointSet.getNodeList());
   }

}