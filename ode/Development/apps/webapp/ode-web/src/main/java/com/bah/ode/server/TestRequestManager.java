package com.bah.ode.server;

import com.bah.ode.model.OdeMetadata;
import com.bah.ode.model.OdeRequest;

public class TestRequestManager extends AbstractDataSourceManager {

   public TestRequestManager(OdeMetadata metadata) {
      this.metadata = metadata;
   }

   @Override
   public void sendRequest(OdeRequest odeRequest)
         throws DataSourceManagerException {
   }

   @Override
   public void close() throws DataSourceManagerException {
   }
}
