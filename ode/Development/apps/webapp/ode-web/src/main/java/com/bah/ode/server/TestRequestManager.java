package com.bah.ode.server;

import com.bah.ode.model.OdeMetadata;

public class TestRequestManager extends DataRequestManager {
   private static InboundTopicManagerSingleton itms = 
         InboundTopicManagerSingleton.getInstance();
   private static OutboundTopicManagerSingleton otms = 
         OutboundTopicManagerSingleton.getInstance();
   
   public TestRequestManager(OdeMetadata metadata) {
      super(metadata, itms, otms);
   }

}
