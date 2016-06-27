package com.bah.ode.server;

import com.bah.ode.distributors.BaseDataPropagator;
import com.bah.ode.model.OdeMetadata;
import com.bah.ode.model.OdeRequest;

public abstract class AbstractDataSourceManager {

   protected OdeMetadata metadata;
   protected BaseDataPropagator propagator;
   protected OdeRequest request;

   public AbstractDataSourceManager() {
      super();
   }

   public AbstractDataSourceManager(OdeMetadata metadata) {
      super();
      this.metadata = metadata;
   }

   public OdeMetadata getMetadata() {
      return metadata;
   }

   public void setMetadata(OdeMetadata metadata) {
      this.metadata = metadata;
   }

   public BaseDataPropagator getPropagator() {
      return propagator;
   }

   public void setPropagator(BaseDataPropagator propagator) {
      this.propagator = propagator;
   }

   public abstract void sendRequest(OdeRequest odeRequest) throws DataSourceManagerException;

   public abstract void close() throws DataSourceManagerException;

   public static class DataSourceManagerException extends Exception {
      private static final long serialVersionUID = 1L;

      public DataSourceManagerException(String message, Exception e) {
         super(message, e);
      }

      public DataSourceManagerException(String message) {
         super(message);
      }
      
   }

}