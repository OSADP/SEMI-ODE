package com.bah.ode.server;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import com.bah.ode.context.AppContext;
import com.bah.ode.wrapper.MQTopic;

public class BaseTopicManager {
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
      if (topicName != null)
         return topics.get(topicName);
      else
         return null;
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

   private synchronized void removeTopic(String topicName) {
      MQTopic topic = topics.get(topicName);
      if (topic != null) {
         topics.remove(topicName);
         subscribers.remove(topicName);
      }
   }

   public int addSubscriber(String topicName) {
      return subscribers.get(topicName).incrementAndGet();
   }
   
   public int removeSubscriber(String topicName) {
      AtomicInteger atomicSubscribers = subscribers.get(topicName);
      int subscribers = 0;
      if (atomicSubscribers != null && atomicSubscribers.get() > 0) {
         subscribers = atomicSubscribers.decrementAndGet();
      }
      if (subscribers <= 0) {
         removeTopic(topicName);
         subscribers = 0;
      }
      return subscribers; 
   }
   
   public int numTopics() {
      return topics.size();
   }

   public int numSubscribers() {
      return subscribers.size();
   }

   public int numSubscribers(String topicName) {
      AtomicInteger num = subscribers.get(topicName);
      if (num != null)
         return num.get();
      else
         return 0;
   }

}
