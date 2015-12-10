package com.bah.ode.spark;

import java.math.BigDecimal;
import java.util.Iterator;

import org.apache.spark.api.java.function.VoidFunction;
import org.apache.spark.broadcast.Broadcast;
import org.apache.spark.sql.Row;

import com.bah.ode.model.InternalDataMessage;
import com.bah.ode.model.OdeAggregateData;
import com.bah.ode.wrapper.MQProducer;
import com.bah.ode.wrapper.MQSerialazableProducerPool;

public class AggregateDataDistributor extends BaseDistributor 
   implements VoidFunction<Iterator<Row>> {

   private static final long serialVersionUID = -4182433155035620976L;
   
   private String outputTopic;
   
   public AggregateDataDistributor(
         Broadcast<MQSerialazableProducerPool> producerPool,
         String outputTopic) {
      super(producerPool);
      this.outputTopic = outputTopic;
   }

   @Override
   public void call(Iterator<Row> partitionOfRecords) throws Exception {
      MQProducer<String, String> producer = producerPool.value().checkOut();
      
      while (partitionOfRecords.hasNext()) {
         Row record = partitionOfRecords.next();
         String tempId = record.getString(0);

         OdeAggregateData payload = new OdeAggregateData();
         payload.setKey(record.getString(0));
         payload.setCount(record.getLong(1));
         payload.setMinSpeed(BigDecimal.valueOf(record.getDouble(2)));
         payload.setAvgSpeed(BigDecimal.valueOf(record.getDouble(3)));
         payload.setMaxSpeed(BigDecimal.valueOf(record.getDouble(4)));

         InternalDataMessage dm = new InternalDataMessage(
               record.getString(0),
               payload);
         
         producer.send(outputTopic, tempId, dm.toJson());
      }
      
      producerPool.value().checkIn(producer);
   }

}
