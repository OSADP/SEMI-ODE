package com.bah.ode.model;

import com.bah.ode.asn.OdeGeoRegion;
import com.bah.ode.asn.OdePosition3D;

public interface HasPosition extends OdeFilterable {
   OdePosition3D getPosition();
   boolean isWithinBounds(OdeGeoRegion region); /* {
   *** SAMPLE CODE ***
      return GeoUtils.isPositionWithnBounds(getPosition(), region);
   }*/
}
