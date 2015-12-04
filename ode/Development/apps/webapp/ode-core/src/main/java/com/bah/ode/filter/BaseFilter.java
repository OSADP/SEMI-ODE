package com.bah.ode.filter;

import com.bah.ode.model.OdeFilterable;
import com.bah.ode.model.OdeMetadata;

public class BaseFilter implements OdeFilter {

   private OdeMetadata metadata;
   
   
   public BaseFilter() {
      super();
   }


   public BaseFilter(OdeMetadata metadata) {
      super();
      this.metadata = metadata;
   }

   public OdeMetadata getMetadata() {
      return metadata;
   }


   public BaseFilter setMetadata(OdeMetadata metadata) {
      this.metadata = metadata;
      return this;
   }


   @Override
   public boolean pass(OdeFilterable data) {
      return false;
   }

}
