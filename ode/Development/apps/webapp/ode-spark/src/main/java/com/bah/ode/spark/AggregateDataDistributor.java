package com.bah.ode.spark;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.UUID;

import org.apache.spark.Accumulator;
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
   private String streamId = UUID.randomUUID().toString();
   private long recordId = 0;
   
   public AggregateDataDistributor(
         Accumulator<Integer> accumulator,
         Broadcast<MQSerialazableProducerPool> producerPool,
         String outputTopic) {
      super(accumulator, producerPool);
      this.outputTopic = outputTopic;
   }

   @Override
   public void call(Iterator<Row> partitionOfRecords) throws Exception {
      startTimer();
      
      MQProducer<String, String> producer = producerPool.value().checkOut();
      
      while (partitionOfRecords.hasNext()) {
         Row record = partitionOfRecords.next();

         OdeAggregateData payload = new OdeAggregateData(streamId, 0L, recordId++);
         payload.setKey(record.getString(0));
         payload.setCount(record.getLong(1));
         payload.setMinSpeed(BigDecimal.valueOf(record.getDouble(2)));
         payload.setAvgSpeed(BigDecimal.valueOf(record.getDouble(3)));
         payload.setMaxSpeed(BigDecimal.valueOf(record.getDouble(4)));

         InternalDataMessage idm = new InternalDataMessage(
               payload.getSerialId(),
               payload);
         
         producer.send(outputTopic, payload.getSerialId(), idm.toJson());
      }
      
      producerPool.value().checkIn(producer);
      stopTimer();
   }

}
