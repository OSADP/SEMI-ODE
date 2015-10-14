package com.bah.ode.util;

import java.awt.geom.Point2D;

public class GisUtils {
   
   public static Point2D nearestPointOnLine(double ax, double ay, double bx,
         double by, double px, double py, boolean clampToSegment, Point2D dest) {
      if (dest == null) {
         dest = new Point2D.Double();
      }

      double apx = px - ax;
      double apy = py - ay;
      double abx = bx - ax;
      double aby = by - ay;

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
      dest.setLocation(ax + abx * t, ay + aby * t);
      return dest;
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
      
      if (b.getX() == a.getX()) {
         if (b.getY() > a.getY())
            dest.setLocation(a.getX() - k, a.getY());
         else
            dest.setLocation(a.getX() + k, a.getY());
      } else if (b.getY() == a.getY()) {
         if (b.getX() > a.getX())
            dest.setLocation(a.getX(), a.getY() + k);
         else
            dest.setLocation(a.getX(), a.getY() - k);
      } else {
         double l = Math.sqrt(
               (k*k*Math.pow((b.getX()-a.getX()), 2))
                               /
               (Math.pow((b.getY()-a.getY()), 2) + Math.pow((b.getX() - a.getX()), 2)));
         
         double m = (l * (b.getY() - a.getY())/(b.getX() - a.getX()));
         
         dest.setLocation(a.getX() - m, a.getY() + l);
      }
      
      return dest;
   }
}