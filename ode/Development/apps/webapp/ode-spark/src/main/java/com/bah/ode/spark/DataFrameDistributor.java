package com.bah.ode.spark;

import java.util.Iterator;

import org.apache.spark.api.java.function.VoidFunction;
import org.apache.spark.broadcast.Broadcast;
import org.apache.spark.sql.Row;

import com.bah.ode.context.AppContext;
import com.bah.ode.util.JsonUtils;
import com.bah.ode.wrapper.MQProducer;
import com.bah.ode.wrapper.MQSerialazableProducerPool;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class DataFrameDistributor extends BaseDistributor 
   implements VoidFunction<Iterator<Row>> {

   private static final long serialVersionUID = -4182433155035620976L;
   
   public DataFrameDistributor(
         Broadcast<MQSerialazableProducerPool> producerPool) {
      super(producerPool);
   }

   @Override
   public void call(Iterator<Row> partitionOfRecords) throws Exception {
      MQProducer<String, String> producer = producerPool.value().checkOut();
      
      while (partitionOfRecords.hasNext()) {
         Row record = partitionOfRecords.next();
         String outputTopic = AppContext.getInstance()
               .getParam(AppContext.AGGREGATES_TOPIC);
         String tempId = record.getString(0);
         
         ObjectNode aggregates = JsonUtils.newNode()
               .put("tempId", tempId)
               .put("minSpeed", record.getDouble(1))
               .put("avgSpeed", record.getDouble(2))
               .put("maxSpeed", record.getDouble(3));
         
         producer.send(outputTopic, tempId, aggregates.toString());
      }
      
      producerPool.value().checkIn(producer);
   }

}
