package com.bah.ode.server;

import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import com.bah.ode.context.AppContext;
import com.bah.ode.wrapper.MQTopic;

abstract public class BaseTopicManager {
   private Map<String, MQTopic> topics = 
         new ConcurrentHashMap<String, MQTopic>();
   private Map<String, AtomicInteger> subscribers = 
         new ConcurrentHashMap<String, AtomicInteger>();

   protected String buildTopicName(Object o) {
      return AppContext.getInstance().getParam(AppContext.ODE_HOSTNAME) +
            o.getClass().getSimpleName() + 
            String.valueOf(o.hashCode());
   }
   
   public MQTopic getTopic(String topicName) {
      return topics.get(topicName);
   }

   public synchronized MQTopic getOrCreateTopic(String topicName) {
      MQTopic topic = topics.get(topicName);
      if (topic == null) {
         topic = MQTopic.create(topicName, MQTopic.defaultPartitions());
         topics.put(topicName, topic);
         subscribers.put(topicName, new AtomicInteger(0));
      }
      return topic;
   }

   private void removeTopic(String topicName) {
      MQTopic topic = topics.get(topicName);
      if (topic != null) {
         topics.remove(topicName);
         subscribers.remove(topicName);
      }
   }

   public int addSubscriber(String topicName) {
      AtomicInteger atomicSubscribers = subscribers.get(topicName);
      if (atomicSubscribers == null || atomicSubscribers.get() == 0) {
         getOrCreateTopic(topicName);
         atomicSubscribers = subscribers.get(topicName);
      }

      atomicSubscribers.incrementAndGet();
         
      reportMetrics();
      
      return atomicSubscribers.get();
   }
   
   public int removeSubscriber(String topicName) {
      AtomicInteger atomicSubscribers = subscribers.get(topicName);
      int subscribers = 0;
      if (atomicSubscribers != null && atomicSubscribers.get() > 0) {
         subscribers = atomicSubscribers.decrementAndGet();
         reportMetrics();
      }
      if (subscribers <= 0) {
         removeTopic(topicName);
         if (subscribers < 0)
            atomicSubscribers.set(0);
         
         subscribers = 0;
      }
      return subscribers; 
   }
   
   public int getNumSubscribers() {
      int numSubscribers = 0;
      for (Entry<String, AtomicInteger> entry : subscribers.entrySet()) {
         numSubscribers += entry.getValue().get();
      }
      
      return numSubscribers;
   }
   
   public int getNumTopics() {
      return topics.size();
   }
   
   public abstract void reportMetrics();
}
