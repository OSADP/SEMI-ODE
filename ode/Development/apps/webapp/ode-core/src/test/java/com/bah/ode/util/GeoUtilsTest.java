package com.bah.ode.util;

import java.awt.geom.Line2D;
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
   
   public void testDistanceInMapCoordinates() {
      double aLat = 43.652969118285434;
      double aLng = -85.94707489013672;
      double bLat = 40.96538194577475;
      double bLng = -81.03858947753906;
      double pLat = 42.0;
      double pLng = -83.5;
      
      Point2D a = GeoUtils.latLngToMap(aLat, aLng);
      Point2D b = GeoUtils.latLngToMap(bLat, bLng);
      Point2D p = GeoUtils.latLngToMap(pLat, pLng);
      Line2D l = new Line2D.Double(a, b);
      
      double distanceInMeters = GeoUtils.distanceLatLng(aLat, aLng, bLat, bLng, 
            LengthUtils.UnitOfMeasure.M);
      assertEquals(502073, Math.round(distanceInMeters));

      double distanceInMapCoord = GeoUtils.distance(a, b);
      assertEquals(679050, Math.round(distanceInMapCoord));
      
      double d1 = GeoUtils.distanceToLine(l, p);
      double d2 = GeoUtils.distanceToLine2(l, p);
      double d3 = GeoUtils.distanceToLine3(l, p);
      
      assertEquals(d1, d2, GeoUtils.ERROR_MARGIN);
      assertEquals(d1, d3, GeoUtils.ERROR_MARGIN);
   }
   
   public void testDistanceInLatLng() {
      double aLat = 43.652969118285434;
      double aLng = -85.94707489013672;
      double bLat = 40.96538194577475;
      double bLng = -81.03858947753906;
      double pLat = 42.0;
      double pLng = -83.5;
      
      Point2D a = new Point2D.Double(aLat, aLng);
      Point2D b = new Point2D.Double(bLat, bLng);
      Point2D p = new Point2D.Double(pLat, pLng);
      Line2D l = new Line2D.Double(a, b);
      
      double d1 = GeoUtils.distanceToLine(l, p);
      double d2 = GeoUtils.distanceToLine2(l, p);
      double d3 = GeoUtils.distanceToLine3(l, p);
      
      assertEquals(d1, d2, GeoUtils.ERROR_MARGIN);
      assertEquals(d1, d3, GeoUtils.ERROR_MARGIN);
   }
   
}
