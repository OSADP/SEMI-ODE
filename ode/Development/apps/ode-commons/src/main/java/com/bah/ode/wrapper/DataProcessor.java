package com.bah.ode.wrapper;

import com.bah.ode.model.OdeException;


public interface DataProcessor<T> {
   void process(T data) throws DataProcessorException;
   
   public static class DataProcessorException extends OdeException {

      public DataProcessorException(Exception e) {
         super(e);
      }

      private static final long serialVersionUID = 1L;
      
   }

}
