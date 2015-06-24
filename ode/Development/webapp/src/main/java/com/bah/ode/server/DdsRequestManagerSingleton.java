package com.bah.ode.server;

import com.bah.ode.model.DdsRequest;
import com.bah.ode.wrapper.MQTopic;

public class DdsRequestManagerSingleton extends GenericTopicManager<DdsRequest>{
   private static DdsRequestManagerSingleton instance;

   public static DdsRequestManagerSingleton getInstance() {
      if (instance == null) {
         synchronized (DdsRequestManagerSingleton.class) {
            if (instance == null)
               instance = new DdsRequestManagerSingleton();
         }
      }
      return instance;
   }

   private DdsRequestManagerSingleton() {
   }

   @Override
   public MQTopic getTopic(DdsRequest t) {
      MQTopic topic = super.getTopic(t);
      /*
       *  TODO
       *  For DdsRequests, we need to check if a current subscription contains
       *  the data we are looking for, not if it is an identical subscription.
       *  If it contains it, return the topic. If not, return null.
       *  Then we must provide a filter in the SparkWorkflow to filter out any
       *  data that is not inside the requested bounds.
       *  
       *  But that's for another day. For now, only identical requests are 
       *  shared among multiple requesters.
       */
      
      return topic;
   }
   
}
