package com.bah.ode.spark;

import org.apache.spark.Accumulator;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.sql.Row;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class DataFrameMapper extends SparkProcessor 
   implements Function<Row, String> {

   private static final long serialVersionUID = 4620485681770070995L;
   private String[] dataframeHeader;

   public DataFrameMapper(Accumulator<Integer> accumulator, String[] columns) {
      super(accumulator);
      dataframeHeader = columns;
   }

   @Override
   public String call(Row row) throws Exception {
      startTimer();
      
      ObjectNode node = JsonNodeFactory.instance.objectNode();

      for (int i = 0; i < row.length(); i++) {
         /* getDouble allows non-quoted numerics in the JSON */
         try {
            node.put(dataframeHeader[i], row.getString(i));
         } catch (ClassCastException e) {
            node.put(dataframeHeader[i], row.getDouble(i));
         }

      }

      stopTimer();
      return node.toString();
   }

}
