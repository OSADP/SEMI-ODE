package com.bah.ode.model;

import com.bah.ode.asn.OdePosition3D;

public interface HasPosition extends OdeFilterable {
   OdePosition3D getPosition();
   boolean isInBounds(OdePosition3D position);
}
