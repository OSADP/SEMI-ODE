package com.bah.ode.spark;

import java.io.Serializable;

import org.apache.spark.broadcast.Broadcast;

import com.bah.ode.wrapper.MQSerialazableProducerPool;

public abstract class BaseDistributor implements Serializable{
   private static final long serialVersionUID = -2352763652266510903L;
 
   protected Broadcast<MQSerialazableProducerPool> producerPool;
   
   public BaseDistributor(Broadcast<MQSerialazableProducerPool> producerPool) {
      this.producerPool = producerPool;
   }

   public Broadcast<MQSerialazableProducerPool> getProducerPool() {
      return producerPool;
   }

   public void setProducerPool(Broadcast<MQSerialazableProducerPool> producerPool) {
      this.producerPool = producerPool;
   }

}
