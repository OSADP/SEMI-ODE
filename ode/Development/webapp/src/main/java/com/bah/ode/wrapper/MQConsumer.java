package com.bah.ode.wrapper;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

import kafka.consumer.ConsumerIterator;
import kafka.consumer.KafkaStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MQConsumer<K, V, R> implements Callable<Object> {

   private static Logger logger = LoggerFactory.getLogger(MQConsumer.class);

   private KafkaStream<K, V> m_stream;
   private int m_threadNumber;
   private DataProcessor<V, R> processor;

   public MQConsumer(KafkaStream<K, V> a_stream, int a_threadNumber,
         DataProcessor<V, R> a_processor) {
      this.m_threadNumber = a_threadNumber;
      this.m_stream = a_stream;
      this.processor = a_processor;
   }

   @Override
   public Object call() throws Exception {
      ConsumerIterator<K, V> it = m_stream.iterator();
      while (it.hasNext()) {
         V msg = it.next().message();
         @SuppressWarnings("unused")
         Future<R> result = processor.process(msg);
      }
      logger.info("Shutting down Thread: " + m_threadNumber);
      return null;
   }

}
