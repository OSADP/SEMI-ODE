package com.bah.ode.server;

import com.bah.ode.distributors.BaseDataPropagator;
import com.bah.ode.model.OdeMetadata;

public class TestRequestManager {
   private OdeMetadata metadata;

   // FOR LOOPBACK TEST ONLY
   private BaseDataPropagator loopbackTestPropagator;
   
   public BaseDataPropagator getLoopbackTestPropagator() {
      return loopbackTestPropagator;
   }
   public void setLoopbackTestPropagator(BaseDataPropagator propagator) {
      this.loopbackTestPropagator = propagator;
   }
   // FOR LOOPBACK TEST ONLY

   public TestRequestManager(OdeMetadata metadata) {
      this.metadata = metadata;
   }

   public OdeMetadata getMetadata() {
      return metadata;
   }

   public void setMetadata(OdeMetadata metadata) {
      this.metadata = metadata;
   }

   
}
