package com.bah.ode.util;

import java.awt.geom.Point2D;

import junit.framework.TestCase;

public class GeoUtilsTest extends TestCase {

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
      
      Point2D p1 = GeoUtils.pointOffset(a , b , k, null);
      long p1x = (long) (p1.getX() * scale);
      long p1y = (long) (p1.getY() * scale);

      Point2D pExpected = expectedPoint(a, b, k);
      
      assertEquals((long) (pExpected.getX() * scale), p1x);
      assertEquals((long) (pExpected.getY() * scale), p1y);
   }
   
   public Point2D expectedPoint(Point2D a, Point2D b, double k) {
      double tanAlpha = (b.getY()-a.getY())/(b.getX()-a.getX());
      double alpha = Math.atan(tanAlpha);
      double sinAlpha = Math.sin(alpha);
      double cosAlpha = Math.cos(alpha);
      
      double p1xExpected;
      double p1yExpected;

      if (b.getX() < a.getX()) {
         p1xExpected = (a.getX() + k * sinAlpha);
         p1yExpected = (a.getY() - k * cosAlpha);
      } else {
         p1xExpected = (a.getX() - k * sinAlpha);
         p1yExpected = (a.getY() + k * cosAlpha);
      }
      return new Point2D.Double(p1xExpected, p1yExpected);
   }
}
