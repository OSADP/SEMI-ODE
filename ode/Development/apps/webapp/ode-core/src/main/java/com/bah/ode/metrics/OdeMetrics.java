package com.bah.ode.metrics;

import java.net.InetSocketAddress;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

import com.bah.ode.context.AppContext;


public class OdeMetrics {
   private com.codahale.metrics.MetricRegistry registry = null; 
   private static OdeMetrics instance = null;

   public static OdeMetrics getInstance() {
      if (null == instance) {
         synchronized (OdeMetrics.class) {
            if (null == instance)
               instance = new OdeMetrics();
         }
      }
      return instance;
   }

   private OdeMetrics() {
      registry = new com.codahale.metrics.MetricRegistry();   
   }

   public class Meter {
      private com.codahale.metrics.Meter meter;

      private Meter(com.codahale.metrics.Meter meter) {
         this.meter = meter;
      }
      
      public void mark() {
         meter.mark();
      }
      
      public void mark(long n) {
         meter.mark(n);
      }
   }

   public abstract class Gauge<T> {
      private com.codahale.metrics.Gauge<T> gauge;
      
      public Gauge() {
         super();
         this.gauge = new com.codahale.metrics.Gauge<T>() {
            @Override
            public T getValue() {
                return this.getValue();
            }
        };
      }

      public abstract T getValue();
   }

   public class Counter {
      private com.codahale.metrics.Counter counter;

      private Counter(com.codahale.metrics.Counter counter) {
         this.counter = counter;
      }
      
      public void inc() {
         counter.inc();
      }
      public void dec() {
         counter.dec();
      }

      public void inc(long n) {
         counter.inc(n);
      }
      public void dec(long n) {
         counter.dec(n);
      }
      
      public long getCount() {
         return counter.getCount();
      }
      
   }

   public class Histogram {
      private com.codahale.metrics.Histogram histogram;
      
      private Histogram(com.codahale.metrics.Histogram histogram) {
         this.histogram = histogram;
      }

      /**
       * Adds a recorded value.
       *
       * @param value the length of the value
       */
      public void update(long value) {
         histogram.update(value);
      }
   }
   
   public class Timer {
      private com.codahale.metrics.Timer timer;
      
      private Timer(com.codahale.metrics.Timer timer) {
         this.timer = timer;
      }

      /**
       * Times and records the duration of event.
       *
       * @param event a {@link Callable} whose {@link Callable#call()} method implements a process
       *              whose duration should be timed
       * @param <T>   the type of the value returned by {@code event}
       * @return the value returned by {@code event}
       * @throws Exception if {@code event} throws an {@link Exception}
       */
      public <T> T time(Callable<T> event) throws Exception {
         return timer.time(event);
      }

      /**
       * Returns a new {@link Context}.
       *
       * @return a new {@link Context}
       * @see Context
       */
      public com.codahale.metrics.Timer.Context time() {
         return timer.time();
      }

   }
   
   public Meter meter(String meterId) {
      com.codahale.metrics.Meter meter = registry.meter(meterId);
      return new Meter(meter);
   }

   public void registerGauge(Gauge<?> odeGauge, String className, String... names) {
      registry.register(com.codahale.metrics.MetricRegistry.name(className, names), odeGauge.gauge);
   }
   
   public Counter counter(String name) {
      com.codahale.metrics.Counter counter = registry.counter(name);
      return new Counter(counter);
   }

   public Histogram histogram(String name) {
      com.codahale.metrics.Histogram histogram = registry.histogram(name);
      return new Histogram(histogram);
   }

   public Timer timer(String name) {
      com.codahale.metrics.Timer timer = registry.timer(name);
      return new Timer(timer);
   }

   public static void main(String args[]) {
      OdeMetrics.getInstance().startConsoleReport();
      Meter requests = OdeMetrics.getInstance().meter("requests");
      requests.mark();
      wait5Seconds();
   }

   public void startConsoleReport() {
//      Meter reporterMeter = OdeMetrics.getInstance().meter("reporter");
//      reporterMeter.mark();
      
      com.codahale.metrics.ConsoleReporter reporter = 
            com.codahale.metrics.ConsoleReporter.forRegistry(registry)
            .convertRatesTo(TimeUnit.SECONDS)
            .convertDurationsTo(TimeUnit.MILLISECONDS)
            .build();
      reporter.start(
            AppContext.getInstance().getInt(
                  AppContext.METRICS_POLLING_RATE_SECONDS,
                  AppContext.DEFAULT_METRICS_POLLING_RATE_SECONDS), 
            TimeUnit.SECONDS);
   }

   public void startGraphiteReport() {
      final com.codahale.metrics.graphite.Graphite graphite = 
            new com.codahale.metrics.graphite.Graphite(
                  new InetSocketAddress(
                        AppContext.getInstance().getParam(
                              AppContext.METRICS_GRAPHITE_HOST),
                        AppContext.getInstance().getInt(
                              AppContext.METRICS_GRAPHITE_PORT,
                              AppContext.DEFAULT_METRICS_GRAPHITE_PORT)));
      final com.codahale.metrics.graphite.GraphiteReporter reporter = 
            com.codahale.metrics.graphite.GraphiteReporter.forRegistry(registry)
            .prefixedWith(
                  AppContext.getInstance().getParam(
                        AppContext.METRICS_PREFIX))
            .convertRatesTo(TimeUnit.SECONDS)
            .convertDurationsTo(TimeUnit.MILLISECONDS)
            .filter(com.codahale.metrics.MetricFilter.ALL)
            .build(graphite);
      reporter.start(
            AppContext.getInstance().getInt(
                  AppContext.METRICS_POLLING_RATE_SECONDS,
                  AppContext.DEFAULT_METRICS_POLLING_RATE_SECONDS), 
            TimeUnit.SECONDS);
   }

   static void wait5Seconds() {
      try {
         Thread.sleep(5 * 1000);
      } catch (InterruptedException e) {
      }
   }
}