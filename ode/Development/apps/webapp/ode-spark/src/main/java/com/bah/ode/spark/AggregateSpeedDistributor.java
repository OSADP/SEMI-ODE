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

public class AggregateSpeedDistributor extends BaseDistributor 
   implements VoidFunction<Iterator<Row>> {

   private static final long serialVersionUID = -4182433155035620976L;
   
   private String outputTopic;
   private String streamId = UUID.randomUUID().toString();
   private long recordId = 0;
   
   public AggregateSpeedDistributor(
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
         if (!record.isNullAt(0))
            payload.setKey(record.getString(0));
            
         if (!record.isNullAt(1))
            payload.setCount(record.getLong(1));
         
         if (!record.isNullAt(2))
            payload.setMinSpeed(BigDecimal.valueOf(record.getDouble(2)));
         
         if (!record.isNullAt(3))
            payload.setAvgSpeed(BigDecimal.valueOf(record.getDouble(3)));
         
         if (!record.isNullAt(4))
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
