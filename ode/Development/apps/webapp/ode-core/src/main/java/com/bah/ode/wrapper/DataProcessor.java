package com.bah.ode.wrapper;

import java.io.IOException;
import java.text.ParseException;
import java.util.concurrent.Future;

import com.bah.ode.exception.OdeException;

public interface DataProcessor<D, R> {
   Future<R> process(D data) throws DataProcessorException;
   public void filterAndSend(D msg) throws DataProcessorException, IOException, ParseException;

   public static class DataProcessorException extends OdeException {

      private static final long serialVersionUID = -3319078097438578006L;

      public DataProcessorException(Exception e) {
         super(e);
      }

      public DataProcessorException(String message, Exception cause) {
         super(message, cause);
      }

      public DataProcessorException(String message) {
         super(message);
      }

   }

}
