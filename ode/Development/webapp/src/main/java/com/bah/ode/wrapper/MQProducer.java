package com.bah.ode.wrapper;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;
 
public class MQProducer<K, V> {
   private static Logger logger = LoggerFactory.getLogger(MQProducer.class);
   
   Producer<K, V> producer;
   
   public MQProducer (String brokers) {
       //TODO
       /*
        * Using default encoder for now. We should define a specific encoder
        * based on the data type. 
        */
       //props.put("serializer.class", "kafka.serializer.StringEncoder");
       //TODO
       /*
        * Using default partitioned for now. We should define a specific partitioner
        * based on the data type. 
        */
       // props.put("partitioner.class", "com.bah.ode.wrapper.MQPartitioner");
      this (brokers, null, null);
   }
    public MQProducer (String brokers, String encoderClass, 
          String partitionerClass) {
       
        Properties props = new Properties();
        props.put("metadata.broker.list", brokers);
        if (encoderClass != null)
           props.put("serializer.class", encoderClass);
        
        if (partitionerClass != null)
           props.put("partitioner.class", partitionerClass);
        
        props.put("request.required.acks", "1");
 
        ProducerConfig config = new ProducerConfig(props);
 
        producer = new Producer<K, V>(config);
        
        logger.info("Producer Created");
    }

    public void send (String topic, K key, V value) {
       KeyedMessage<K, V> data = new KeyedMessage<K, V>(topic, key, value);
       
       producer.send(data);
    }
    
    public void close() {
       producer.close();
       logger.info("Producer Closed");
    }
}