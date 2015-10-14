package com.bah.ode.util;

import java.awt.geom.Point2D;

public class GeoUtils {
   
   public static Point2D nearestPointOnLine(Point2D a, Point2D b, Point2D p,
         boolean clampToSegment, Point2D dest) {
      if (dest == null) {
         dest = new Point2D.Double();
      }

      double apx = p.getX() - a.getX();
      double apy = p.getY() - a.getY();
      double abx = b.getX() - a.getX();
      double aby = b.getY() - a.getY();

      double ab2 = abx * abx + aby * aby;
      double ap_ab = apx * abx + apy * aby;
      double t = ap_ab / ab2;
      if (clampToSegment) {
         if (t < 0) {
            t = 0;
         } else if (t > 1) {
            t = 1;
         }
      }
      dest.setLocation(a.getX() + abx * t, a.getY() + aby * t);
      return dest;
   }
   
   public static double lineLength(Point2D a, Point2D b) {
      double abx = Math.abs(b.getX() - a.getX());
      double aby = Math.abs(b.getY() - a.getY());
      return Math.sqrt(abx * abx + aby * aby);
   }
   
   public static double distanceToLine(Point2D a, Point2D b, Point2D p) {

      Point2D p2 = nearestPointOnLine(a, b, p, true, null);
      return p.distance(p2);
   }
   
   
   
   
   /**
    * This function returns a Point2D that is offset to a point 'a' by distance 'k'
    * and perpendicular to the line 'a-b'
    * 
    *                              b
    *                             /
    *          dest              /
    *            *--- m -----   /
    *            |             /
    *            l     k      /
    *            |           a
    * 
    * @param a
    * @param b
    * @param k
    * @param dest
    * @return
    */
   public static Point2D pointOffset(Point2D a, Point2D b, double k, Point2D dest){
      if (dest == null) {
         dest = new Point2D.Double();
      }
      
//      if (b.getX() == a.getX()) {
//         if (b.getY() > a.getY())
//            dest.setLocation(a.getX() - k, a.getY());
//         else
//            dest.setLocation(a.getX() + k, a.getY());
//      } else if (b.getY() == a.getY()) {
//         if (b.getX() > a.getX())
//            dest.setLocation(a.getX(), a.getY() + k);
//         else
//            dest.setLocation(a.getX(), a.getY() - k);
//      } else {
//         double l = Math.sqrt(
//               (k*k*Math.pow((b.getX()-a.getX()), 2))
//                               /
//               (Math.pow((b.getY()-a.getY()), 2) + Math.pow((b.getX() - a.getX()), 2)));
//         
//         double m = (l * (b.getY() - a.getY())/(b.getX() - a.getX()));
//         
//         dest.setLocation(a.getX() - m, a.getY() + l);
//      }
      
      double tanAlpha = (b.getY()-a.getY())/(b.getX()-a.getX());
      double alpha = Math.atan(tanAlpha);
      double sinAlpha = Math.sin(alpha);
      double cosAlpha = Math.cos(alpha);
      
      double destX;
      double destY;
      if (b.getX() < a.getX()) {
         destX = (a.getX() + k * sinAlpha);
         destY = (a.getY() - k * cosAlpha);
      } else {
         destX = (a.getX() - k * sinAlpha);
         destY = (a.getY() + k * cosAlpha);
      }

      dest.setLocation(destX, destY);
      return dest;
   }
}