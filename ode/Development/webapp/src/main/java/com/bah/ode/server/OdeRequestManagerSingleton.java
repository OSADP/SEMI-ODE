package com.bah.ode.server;

import com.bah.ode.model.OdeRequest;

public class OdeRequestManagerSingleton extends GenericTopicManager<OdeRequest>{
   private static OdeRequestManagerSingleton instance;

   public static OdeRequestManagerSingleton getInstance() {
      if (instance == null) {
         synchronized (OdeRequestManagerSingleton.class) {
            if (instance == null)
               instance = new OdeRequestManagerSingleton();
         }
      }
      return instance;
   }

}
