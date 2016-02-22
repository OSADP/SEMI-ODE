package com.bah.ode.server;

import com.bah.ode.model.OdeMetadata;

public class TestRequestManager extends DataRequestManager {
   private static InboundTopicManagerSingleton itms = 
         InboundTopicManagerSingleton.getInstance();
   
   private OdeMetadata metadata;

   public TestRequestManager(OdeMetadata metadata) {
      super(metadata.getInputTopic().getName(), 
            metadata.getOdeRequest().getDataType(), 
            itms);
      
      this.metadata = metadata;
   }

   public OdeMetadata getMetadata() {
      return metadata;
   }

   public void setMetadata(OdeMetadata metadata) {
      this.metadata = metadata;
   }

   
}
