package com.bah.ode.server;

public class OutboundTopicManagerSingleton extends BaseTopicManager {

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
   }

}
