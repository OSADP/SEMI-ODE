package com.bah.ode.spark;

import java.util.UUID;

import org.apache.spark.Accumulator;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.broadcast.Broadcast;

import com.bah.ode.model.InternalDataMessage;
import com.bah.ode.model.OdeVehicleCount;
import com.bah.ode.wrapper.MQProducer;
import com.bah.ode.wrapper.MQSerialazableProducerPool;

public class VehicleCountDistributor extends BaseDistributor 
   implements Function<JavaRDD<Long>, Void> {

   private static final long serialVersionUID = -4182433155035620976L;
   
   private String outputTopic;
   private String streamId = UUID.randomUUID().toString();
   private long recordId = 0;
   
   public VehicleCountDistributor(
         Accumulator<Integer> accumulator,
         Broadcast<MQSerialazableProducerPool> producerPool,
         String outputTopic) {
      super(accumulator, producerPool);
      this.outputTopic = outputTopic;
   }

      
   @Override
   public Void call(JavaRDD<Long> countRDD) throws Exception {
      
      if (countRDD.count() <= 0)
         return null;
      
      startTimer();
      
      MQProducer<String, String> producer = producerPool.value().checkOut();
      
      OdeVehicleCount vehCount = new OdeVehicleCount(streamId, 0L, recordId++);
      vehCount.setCount(countRDD.first());

      InternalDataMessage idm = new InternalDataMessage(
            vehCount.getSerialId(),
            vehCount);
      
      producer.send(outputTopic, vehCount.getSerialId(), idm.toJson());
      
      producerPool.value().checkIn(producer);
      stopTimer();
      return null;
   }

}
