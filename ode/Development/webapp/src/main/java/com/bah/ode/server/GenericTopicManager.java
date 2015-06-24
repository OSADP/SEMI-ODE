package com.bah.ode.server;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.bah.ode.context.AppContext;
import com.bah.ode.wrapper.MQTopic;

public class GenericTopicManager<T> {
   private Map<String, Integer> topics = 
         new ConcurrentHashMap<String, Integer>();

   protected GenericTopicManager () {
   }

   protected String createTopicName(T t) {
      return String.valueOf(t.hashCode());
   }
   
   public MQTopic getTopic(T t) {
      String topicName = createTopicName(t);
      Integer partitions = topics.get(topicName);
      return MQTopic.create(topicName, partitions);
   }

   public synchronized MQTopic createTopic(T t) {
      String topicName = createTopicName(t); 
      Integer partitions = topics.get(topicName);
      if (partitions == null) {
         partitions = Integer.valueOf(
               AppContext.getInstance().getParam(
                     AppContext.DEFAULT_CONSUMER_THREADS));
         topics.put(topicName, partitions);
      }
      return MQTopic.create(topicName, partitions);
   }

   public void removeTopic(T t) {
      removeTopic(createTopicName(t)); 
   }

   public void removeTopic(String topicName) {
      Integer partitions = topics.get(topicName);
      if (partitions != null) {
         topics.remove(topicName);
      }
   }

}
