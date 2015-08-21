package com.bah.ode.wrapper;

import com.bah.ode.util.SerializableObjectPool;

public class MQSerialazableProducerPool 
   extends SerializableObjectPool<MQProducer<String, String>> {
   private static final long serialVersionUID = 322882189929664360L;
   
   private String brokers; 
   
   public MQSerialazableProducerPool(String brokers) {
      this.brokers = brokers;
   }

   @Override
   protected MQProducer<String, String> create() {
      return new MQProducer<String, String>(brokers);
   }

   @Override
   public boolean validate(MQProducer<String, String> o) {
      return o.getProducer() != null;
   }

   @Override
   public void expire(MQProducer<String, String> o) {
      o.shutDown();
   }

}
