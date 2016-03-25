package com.bah.ode.spark;

import java.io.Serializable;

import org.apache.spark.Accumulator;

public abstract class SparkProcessor implements Serializable {

   private static final long serialVersionUID = 2327945140784756303L;

   private long startTime;
   protected Accumulator<Integer> accumulator;
   
   public SparkProcessor(Accumulator<Integer> accumulator) {
      this.startTime =  System.currentTimeMillis();
      this.accumulator = accumulator;
   }

   public void startTimer() {
      startTime = System.currentTimeMillis();
   }
   
   public void stopTimer() {
      accumulator.$plus$eq((int)(System.currentTimeMillis() - startTime));
   }

}
