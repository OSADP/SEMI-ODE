package com.bah.ode.spark;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.VoidFunction;
import org.apache.spark.broadcast.Broadcast;
import org.apache.spark.sql.DataFrame;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SQLContext;

import scala.Tuple2;

import com.bah.ode.wrapper.MQSerialazableProducerPool;

public class RddOutputer implements Function<JavaPairRDD<String, String>, Void> {
   private static final long serialVersionUID = 4946021213014494671L;
   
   private Broadcast<MQSerialazableProducerPool> producerPool;
   
   public RddOutputer(final Broadcast<MQSerialazableProducerPool> producerPool) {
      super();
      this.producerPool = producerPool;
   }

   @Override
   public Void call(JavaPairRDD<String, String> rdd) throws Exception {
      if (rdd.keys().count() == 0)
         return null;
      
      SQLContext sqlContext = SqlContextSingleton.getInstance(rdd.context());

      DataFrame ovdfDataFrame = sqlContext.jsonRDD(rdd.keys());
//      ovdfDataFrame.show(10);
      
      // Register as table
      ovdfDataFrame.registerTempTable("OVDF");

      // Calculate stats for speed column on table using SQL
      DataFrame ovdfAggsDataFrame = 
            sqlContext.sql("SELECT MIN(speed), MAX(speed), AVG(speed) FROM OVDF");

//      ovdfAggsDataFrame.show();
      
      Row row = ovdfAggsDataFrame.first();
      
      BigDecimal minSpeed = BigDecimal.valueOf(row.getDouble(0));
      BigDecimal maxSpeed = BigDecimal.valueOf(row.getDouble(1));
      BigDecimal avgSpeed = BigDecimal.valueOf(row.getDouble(2));

      VoidFunction<Iterator<Tuple2<String, String>>> partitionOutputer = 
            new MQOutputer(producerPool, minSpeed, maxSpeed, avgSpeed);
      
      rdd.foreachPartition(partitionOutputer);
 
      
      return null;
   }

   public void printPairRdd(JavaPairRDD<String, String> rdd, int n) {
      List<Tuple2<String, String>> rdds = rdd.take(n);
      
      for (Tuple2<String, String> r : rdds) {
         System.out.println("_1: " + r._1 + "_2: " + r._2);
      }
   }
}
