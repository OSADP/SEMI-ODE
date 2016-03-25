package com.bah.ode.metrics;

import java.io.Serializable;
import java.util.HashMap;

import org.apache.spark.Accumulator;
import org.apache.spark.SparkEnv;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.metrics.source.Source;

//==================================================================
// SPARK INSTRUMENTATION
//==================================================================
import com.codahale.metrics.Gauge;
import com.codahale.metrics.Meter;
import com.codahale.metrics.MetricRegistry;

/**
 * Instrumentation for Spark based on accumulators.
 *
 * Usage: 
 *    SparkInstrumentation instrumentation = new SparkInstrumentation("example.metrics")
 *    numReqs = sc.accumulator(0L)
 *    instrumentation.source.registerAccumulator(numReqs, "numReqs")
 *    instrumentation.register()
 *
 * Will create and report the following metrics: - Gauge with total number of
 * requests (daily) - Meter with rate of requests
 *
 * @param name
 *           name for all metrics that will be reported by this
 *           Instrumentation
 */
public class SparkInstrumentation implements Serializable {
   private static final long serialVersionUID = -6384977327125524773L;

   private static HashMap<String, Accumulator<Integer>> accumulators =
         new HashMap<String, Accumulator<Integer>>();

   private InstrumentationSource source;

   /**
    * @param jsc JavaSparkContext
    * @param prefix for all metric names that will be reported by this
    *        Instrumentation
    * @param names for all metric names that will be reported by this
    *        Instrumentation
    */
   public SparkInstrumentation(JavaSparkContext jsc, String prefix, String... names) {
      super();
      this.source = new InstrumentationSource(MetricRegistry.name(prefix, names));
      accumulators.put(source.sourceName(), jsc.accumulator(0, source.sourceName()));
   }

   /**
    * Register the Instrumentation with Spark so the metrics are reported to any
    * provided Sink.
    */
   public Accumulator<Integer> register() {
      Accumulator<Integer> a = accumulators.get(source.sourceName());
      source.registerAccumulator(a);
      SparkEnv.get().metricsSystem().registerSource(source);
      return a;
   }

   public Source getSource() {
      return source;
   }


   public class InstrumentationSource implements Source {

      private HashMap<String, Integer> oldgauges = new HashMap<String, Integer>();
      private HashMap<String, Meter> meters = new HashMap<String, Meter>();

      private String name;
      private MetricRegistry metricRegistry;

      public InstrumentationSource(String name) {
         super();
         this.name = name;
         this.metricRegistry = new MetricRegistry();
      }

      @Override
      public MetricRegistry metricRegistry() {
         return metricRegistry;
      }

      @Override
      public String sourceName() {
         return name;
      }

      /**
       * Computes metrics based on accumulator. Gauge never resets.
       *
       * @param a
       *           Metrics will be derived from this accumulator
       * @param name
       *           Name of the metrics
       */
      public void registerAccumulator(Accumulator<Integer> a) {
         oldgauges.put(name, 0);
         meters.put(name, metricRegistry.meter(
               MetricRegistry.name(name, "meter")));

         metricRegistry.register(MetricRegistry.name(name, "gauge"), new Gauge<Integer>() {
            public Integer getValue() {
               long delta = a.value().longValue() - oldgauges.get(name);
               meters.get(name).mark(delta);
               oldgauges.put(name, a.value());
               return (int) delta;
            }
         });
      }

   }


}
