package com.bah.ode.spark;

import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.broadcast.Broadcast;
import org.apache.spark.sql.DataFrame;
import org.apache.spark.sql.SQLContext;

import com.bah.ode.wrapper.MQSerialazableProducerPool;

import scala.Tuple2;

public class Aggregator extends BaseDistributor
   implements Function<JavaPairRDD<String, Tuple2<String, String>>, Void> {

   private static final long serialVersionUID = 34991323740854373L;
   private String outputTopic;
   
   public Aggregator(Broadcast<MQSerialazableProducerPool> producerPool,
         String outputTopic) {
      super(producerPool);
      this.outputTopic = outputTopic;
   }

   @Override
   public Void call(JavaPairRDD<String, Tuple2<String, String>> rdd)
         throws Exception {
      rdd.cache();
      if (rdd.count() == 0){
         return null;
      }
      
      SQLContext sqlContext = SqlContextSingleton.getInstance(rdd.context());

      DataFrame ovdfDataFrame = sqlContext.jsonRDD(rdd.values().map(t -> t._1));
//      ovdfDataFrame.show(10);
      rdd.unpersist(false);
      
      // Register as table
      ovdfDataFrame.registerTempTable("OVDF");

      // Calculate stats for speed column on table using SQL
      DataFrame ovdfAggsDataFrame = 
            sqlContext.sql("SELECT roadSeg, COUNT(speed), "
                  + "MIN(speed), AVG(speed), MAX(speed) "
                  + "FROM OVDF GROUP BY roadSeg");

//      ovdfAggsDataFrame.show(10);

      ovdfAggsDataFrame.toJavaRDD().foreachPartition(new AggregateDataDistributor(producerPool,
            outputTopic));
      return null;
   }

}
