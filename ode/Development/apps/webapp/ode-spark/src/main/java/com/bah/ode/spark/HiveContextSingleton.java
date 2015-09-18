package com.bah.ode.spark;

import org.apache.spark.SparkContext;
import org.apache.spark.sql.hive.HiveContext;

/** Lazily instantiated singleton instance of SQLContext */
public class HiveContextSingleton {
  static private transient HiveContext instance = null;
  static public HiveContext getInstance(SparkContext sparkContext) {
    if (instance == null) {
      instance = new HiveContext(sparkContext);
    }
    return instance;
  }
}
