package com.bah.ode.wrapper;

import org.apache.commons.pool2.PooledObjectFactory;
import org.apache.commons.pool2.impl.GenericObjectPool;

public class MQProducerPool extends GenericObjectPool<MQProducer<String, String>> {
   
   public MQProducerPool(PooledObjectFactory<MQProducer<String, String>> factory) {
      super(factory);
   }
   
   
}
