package com.bah.ode.asn;

import com.bah.ode.asn.oss.dsrc.Circle;
import com.bah.ode.model.OdeObject;

public class OdeCircle extends OdeObject {

   private static final long serialVersionUID = 3009231304492798761L;

   public OdePosition3D center;
   public OdeRadius radius;

   public OdeCircle(Circle circle) {
      this.center = new OdePosition3D(circle.getCenter());
      this.radius = new OdeRadius(circle.getRaduis());
   }

}