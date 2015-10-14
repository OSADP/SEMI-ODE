package com.bah.ode.util;

import java.awt.geom.Point2D;
import java.math.BigDecimal;

import junit.framework.TestCase;

public class GisUtilTest extends TestCase {

   public void testNearestPointOnLine() {
   }

   public void testPointOffset() {
      pointOffset(5.0, 5.0, 10.0, 5.0);  //0 deg
      pointOffset(5.0, 5.0, 10.0, 10.0); //45 deg
      pointOffset(5.0, 5.0, 5.0, 10.0);  //90 deg
      pointOffset(5.0, 5.0, 0.0, 10.0);  //135 deg
      pointOffset(5.0, 5.0, 0.0, 5.0);   //180 deg
      pointOffset(5.0, 5.0, 0.0, 0.0);   //225 deg
      pointOffset(5.0, 5.0, 5.0, 0.0);   //270 deg
      pointOffset(5.0, 5.0, 10.0, 0.0);  //315 deg
   }

   public void pointOffset(double ax, double ay, double bx, double by) {
      Point2D a = new Point2D.Double(ax, ay);
      Point2D b = new Point2D.Double(bx, by);
      double k = 3d;
      double scale = 1000d;
      
      Point2D p1 = GisUtils.pointOffset(a , b , k, null);
      long p1x = (long) (p1.getX() * scale);
      long p1y = (long) (p1.getY() * scale);
      double alpha = Math.atan((b.getY()-a.getY())/(b.getX()-a.getX()));
      
      long p1xExpected = (long) ((a.getX() - k*Math.sin(alpha))*scale);
      long p1yExpected = (long) ((a.getY() + k*Math.cos(alpha))*scale);
      assertEquals(p1xExpected, p1x);
      assertEquals(p1yExpected, p1y);
   }
}
