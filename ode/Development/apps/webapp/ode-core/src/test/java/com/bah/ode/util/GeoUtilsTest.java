package com.bah.ode.util;

import java.awt.geom.Point2D;

import junit.framework.TestCase;

public class GeoUtilsTest extends TestCase {

   public void testNearestPointOnLine() {
   }

   public void testPointOffset() {
      assertOffset(5.0, 5.0, 10.0, 5.0, 5.0, 8.0);  //0 deg
      assertOffset(5.0, 5.0, 10.0, 10.0, 2.878, 7.121); //45 deg
      assertOffset(5.0, 5.0, 5.0, 10.0, 2.0, 5.0);  //90 deg
      assertOffset(5.0, 5.0, 0.0, 10.0, 2.878, 2.878);  //135 deg
      assertOffset(5.0, 5.0, 0.0, 5.0, 5.0, 2.0);   //180 deg
      assertOffset(5.0, 5.0, 0.0, 0.0, 7.121, 2.878);   //225 deg
      assertOffset(5.0, 5.0, 5.0, 0.0, 8.0, 5.0);   //270 deg
      assertOffset(5.0, 5.0, 10.0, 0.0, 7.121, 7.121);  //315 deg
   }

   public void assertOffset(double ax, double ay, double bx, double by, double ox, double oy) {
      Point2D a = new Point2D.Double(ax, ay);
      Point2D b = new Point2D.Double(bx, by);
      double k = 3d;
      double scale = 1000d;
      
      Point2D p1 = GeoUtils.pointOffset(a , b , k, null);
      long p1x = (long) (p1.getX() * scale);
      long p1y = (long) (p1.getY() * scale);

      assertEquals((long) (ox * scale), p1x);
      assertEquals((long) (oy * scale), p1y);
   }
   
}
