package com.bah.ode.server;

import com.bah.ode.metrics.LongGauge;

public class OutboundTopicManagerSingleton extends BaseTopicManager {

   private LongGauge numSubscriptionsGauge;
   private LongGauge numSubscribersGauge;
   
   private static OutboundTopicManagerSingleton instance;
   
   public static OutboundTopicManagerSingleton getInstance() {
      if (instance == null) {
         synchronized (OutboundTopicManagerSingleton.class) {
            if (instance == null)
               instance = new OutboundTopicManagerSingleton();
         }
      }
      return instance;
   }

   private OutboundTopicManagerSingleton() {
      numSubscriptionsGauge = new LongGauge();
      numSubscriptionsGauge.register("NumberOfSubscriptions");
      
      numSubscribersGauge = new LongGauge();
      numSubscribersGauge.register("NumberOfSubscribers");
   }

   @Override
   public void reportMetrics() {
      numSubscriptionsGauge.setValue((long) getNumTopics());
      numSubscribersGauge.setValue((long) getNumSubscribers());
   }

}
