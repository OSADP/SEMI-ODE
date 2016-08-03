package com.bah.ode.spark;

import org.apache.spark.Accumulator;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.broadcast.Broadcast;
import org.apache.spark.sql.DataFrame;
import org.apache.spark.sql.SQLContext;

import com.bah.ode.wrapper.MQSerialazableProducerPool;

public class VehicleSpeedAggregator extends BaseDistributor
   implements Function<JavaPairRDD<String, String>, Void> {

   private static final long serialVersionUID = 34991323740854373L;
   private String outputTopic;
   private Accumulator<Integer> distributorAccumulator;
   
   public VehicleSpeedAggregator(
         Accumulator<Integer> aggregatorAccumulator, 
         Accumulator<Integer> distributorAccumulator, 
         Broadcast<MQSerialazableProducerPool> producerPool,
         String outputTopic) {
      super(aggregatorAccumulator, producerPool);
      this.outputTopic = outputTopic;
      this.distributorAccumulator = distributorAccumulator;
   }

   @Override
   public Void call(JavaPairRDD<String, String> rdd)
         throws Exception {

      startTimer();
      
      if (rdd.count() == 0){
         return null;
      }
      
      SQLContext sqlContext = SqlContextSingleton.getInstance(rdd.context());

      DataFrame ovdfDataFrame = sqlContext.jsonRDD(rdd.values());
//      ovdfDataFrame.show(10);
      
      // Register as table
      ovdfDataFrame.registerTempTable("OVDF");

      // Calculate stats for speed column on table using SQL
      try {
         DataFrame ovdfAggsDataFrame = sqlContext.sql("SELECT roadSeg, COUNT(speed), "
               + "MIN(speed), AVG(speed), MAX(speed) "
               + "FROM OVDF GROUP BY roadSeg");
//       ovdfAggsDataFrame.show(10);

         ovdfAggsDataFrame.toJavaRDD().foreachPartition(new AggregateSpeedDistributor(
               distributorAccumulator,
               producerPool,
               outputTopic));
      } catch (Exception e) {
         e.printStackTrace();
      }

      
      stopTimer();
      return null;
   }

}
