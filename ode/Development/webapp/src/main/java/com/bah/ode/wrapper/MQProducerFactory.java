package com.bah.ode.wrapper;

import org.apache.commons.pool2.BasePooledObjectFactory;
import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.impl.DefaultPooledObject;


public class MQProducerFactory extends BasePooledObjectFactory<MQProducer<String, String>> {

   private String mqBrokers;

   public MQProducerFactory(String mqBrokers) {
      super();
      this.mqBrokers = mqBrokers;
   }

   @Override
   public MQProducer<String, String> create() throws Exception {
      return new MQProducer<String, String>(mqBrokers);
   }

   @Override
   public PooledObject<MQProducer<String, String>> wrap(
         MQProducer<String, String> producer) {
      return new DefaultPooledObject<MQProducer<String, String>>(producer);
   }

}
