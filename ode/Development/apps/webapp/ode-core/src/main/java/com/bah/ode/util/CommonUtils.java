package com.bah.ode.util;

import java.lang.reflect.Field;

import org.apache.spark.SparkConf;
import org.slf4j.Logger;

import scala.Tuple2;

public class CommonUtils {
   
   public static long getPidOfProcess(Process p) {
      long pid = -1;

      try {
        if (p.getClass().getName().equals("java.lang.UNIXProcess")) {
          Field f = p.getClass().getDeclaredField("pid");
          f.setAccessible(true);
          pid = f.getLong(p);
          f.setAccessible(false);
        }
      } catch (Exception e) {
        pid = -1;
      }
      return pid;
    }

   public static void logSparkConf(SparkConf conf, Logger logger) {
      Tuple2<String, String>[] params = conf.getAll();
      
      for (Tuple2<String, String> param : params) {
         logger.info(param._1 + "=" + param._2);
      }
   }

}
