package com.bah.ode.server;

public class InboundTopicManagerSingleton extends BaseTopicManager {

   private static InboundTopicManagerSingleton instance;
   
   public static InboundTopicManagerSingleton getInstance() {
      if (instance == null) {
         synchronized (InboundTopicManagerSingleton.class) {
            if (instance == null)
               instance = new InboundTopicManagerSingleton();
         }
      }
      return instance;
   }

   private InboundTopicManagerSingleton() {
   }

   @Override
   public void reportMetrics() {
      // TODO Auto-generated method stub
      
   }

}
