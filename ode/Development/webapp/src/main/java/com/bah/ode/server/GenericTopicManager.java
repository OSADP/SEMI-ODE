package com.bah.ode.server;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import com.bah.ode.context.AppContext;
import com.bah.ode.wrapper.MQTopic;

public class GenericTopicManager<T> {
   private Map<String, Integer> topicPartitions = 
         new ConcurrentHashMap<String, Integer>();
   
   private Map<String, AtomicInteger> topicSubscribers = 
         new ConcurrentHashMap<String, AtomicInteger>();

   protected GenericTopicManager () {
   }

   protected String buildTopicName(T t) {
      return t.getClass().getSimpleName() + String.valueOf(t.hashCode());
   }
   
   public MQTopic getTopic(T t) {
      String topicName = buildTopicName(t);
      Integer partitions = topicPartitions.get(topicName);
      if (partitions == null)
         return null;
      else
         return MQTopic.create(topicName, partitions);
   }

   public synchronized MQTopic createTopic(T t) {
      String topicName = buildTopicName(t); 
      Integer partitions = topicPartitions.get(topicName);
      if (partitions == null) {
         partitions = Integer.valueOf(
               AppContext.getInstance().getParam(
                     AppContext.DEFAULT_CONSUMER_THREADS));
         topicPartitions.put(topicName, partitions);
         topicSubscribers.put(topicName, new AtomicInteger(0));
      }
      return MQTopic.create(topicName, partitions);
   }

   public void removeTopic(T t) {
      removeTopic(buildTopicName(t)); 
   }

   public void removeTopic(String topicName) {
      Integer partitions = topicPartitions.get(topicName);
      if (partitions != null) {
         topicPartitions.remove(topicName);
         topicSubscribers.remove(topicName);
      }
   }

   public int requesterConnected(String topicName) {
      return topicSubscribers.get(topicName).incrementAndGet();
   }
   
   public int requesterDisconnected(String topicName) {
      int subscribers = topicSubscribers.get(topicName).decrementAndGet();
      if (subscribers == 0)
         removeTopic(topicName);
      return subscribers; 
   }
}
