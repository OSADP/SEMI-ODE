package com.bah.ode.server;


public class MessageQueueManager {
   private static MessageQueueManager instance;
   

   public static MessageQueueManager getInstance() {
      if (instance == null) {
         synchronized (MessageQueueManager.class) {
            if (instance == null) {
               instance = new MessageQueueManager();
            }
         }
      }
      return instance;
   }


   
}
