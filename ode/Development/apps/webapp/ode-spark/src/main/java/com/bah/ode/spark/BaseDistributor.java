package com.bah.ode.spark;

import org.apache.spark.Accumulator;
import org.apache.spark.broadcast.Broadcast;

import com.bah.ode.wrapper.MQSerialazableProducerPool;

public abstract class BaseDistributor extends SparkProcessor {
   private static final long serialVersionUID = -2352763652266510903L;
 
   protected Broadcast<MQSerialazableProducerPool> producerPool;
   
   public BaseDistributor(Accumulator<Integer> accumulator, 
         Broadcast<MQSerialazableProducerPool> producerPool) {
      super(accumulator);
      this.producerPool = producerPool;
   }

   public Broadcast<MQSerialazableProducerPool> getProducerPool() {
      return producerPool;
   }

   public void setProducerPool(Broadcast<MQSerialazableProducerPool> producerPool) {
      this.producerPool = producerPool;
   }

}
