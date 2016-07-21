package com.bah.ode.spark;

import java.util.ArrayList;
import java.util.List;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.broadcast.Broadcast;
import org.apache.spark.sql.DataFrame;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.RowFactory;
import org.apache.spark.sql.SQLContext;
import org.apache.spark.sql.types.DataTypes;
import org.apache.spark.sql.types.StructField;
import org.apache.spark.sql.types.StructType;
import org.apache.spark.streaming.Durations;
import org.apache.spark.streaming.api.java.JavaPairDStream;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.context.AppContext;
import com.bah.ode.metrics.SparkInstrumentation;
import com.bah.ode.wrapper.MQSerialazableProducerPool;
import com.bah.ode.wrapper.MQTopic;

import scala.Tuple2;

public class VehicleDataTransformer extends SparkJob {
   private static Logger logger = LoggerFactory
         .getLogger(VehicleDataTransformer.class);

   public JavaPairDStream<String, Tuple2<String, String>> setup(JavaStreamingContext ssc,
         MQTopic topic, String zkConnectionStrings,
         String brokerList) {
      

      SparkConf conf = ssc.sparkContext().getConf();
      JavaPairDStream<String, Tuple2<String, String>> payloadAndMetadata = 
            super.unifiedStream(
            ssc, topic, zkConnectionStrings, brokerList);
//      JavaPairDStream<String, Tuple2<String, String>> payloadAndMetadata = 
//            super.receiveDirect(
//            ssc, topic, brokerList);
      
      try {
         Integer microbatchDuration = Integer.valueOf(conf.get(
               AppContext.SPARK_STREAMING_MICROBATCH_DURATION_MS,
               String.valueOf(
                     AppContext.DEFAULT_SPARK_STREAMING_MICROBATCH_DURATION_MS)));

         Integer windowDuration = Integer.valueOf(conf.get(
               AppContext.SPARK_STREAMING_WINDOW_MICROBATCHES, String.valueOf(
                     AppContext.DEFAULT_SPARK_STREAMING_WINDOW_MICROBATCHES)));

         Integer slideDuration = Integer.valueOf(conf.get(
               AppContext.SPARK_STREAMING_SLIDE_MICROBATCHES, String.valueOf(
                     AppContext.DEFAULT_SPARK_STREAMING_SLIDE_MICROBATCHES)));

         final Broadcast<MQSerialazableProducerPool> producerPool = ssc
               .sparkContext()
               .broadcast(new MQSerialazableProducerPool(brokerList));

         /*
          * Road Segment Integration
          */
         payloadAndMetadata = payloadAndMetadata
               .mapToPair(new RoadSegmentIntegrator(new SparkInstrumentation(ssc.sparkContext(),"ode",  "RoadSegmentIntegrator").register(), 
                                                    Double.valueOf( conf.get(AppContext.SPARK_ROAD_SEGMENT_SNAPPING_TOLERANCE,
                                                                             String.valueOf(AppContext.DEFAULT_SPARK_ROAD_SEGMENT_SNAPPING_TOLERANCE)
                                                                            )
                                                                  )
                                                   )
                         );

         /*
          * Bounding Box Sanitization ODE-38
          */
         String sanitizationLocation = ssc.sparkContext().getConf()
               .get(AppContext.SPARK_STATIC_SANITIZATION_FILE_LOCATION, "");
         if (!sanitizationLocation.equals("")) {
            SQLContext sqlContext = SqlContextSingleton
                  .getInstance(ssc.sparkContext().sc());

            DataFrame sanitizationFrame = sqlContext
                  .jsonFile(sanitizationLocation);

            List<String> sanitizationData = sanitizationFrame.toJavaRDD()
                  .map(new DataFrameMapper(
                        new SparkInstrumentation(ssc.sparkContext(), "ode", "RecordSanitizerDataFrameMapper").register(), 
                        sanitizationFrame.columns()))
                  .toArray();

            payloadAndMetadata = payloadAndMetadata
                  .mapToPair(new VehicleDataSanitizer(
                        new SparkInstrumentation(ssc.sparkContext(), "ode", "RecordSanitizer").register(), 
                        sanitizationData));

         }

         /*
          * Validation ODE-68
          */
         String validationLocation = ssc.sparkContext().getConf()
               .get(AppContext.SPARK_STATIC_VALIDATION_FILE_LOCATION, "");

         if (!validationLocation.equals("")) {
            SQLContext sqlContext = SqlContextSingleton
                  .getInstance(ssc.sparkContext().sc());

            DataFrame validationFrame = sqlContext.jsonFile(validationLocation);

            List<String> validationData = validationFrame.toJavaRDD()
                  .map(new DataFrameMapper(
                        new SparkInstrumentation(ssc.sparkContext(), "ode", "RecordValidatorDataFrameMapper").register(),
                        validationFrame.columns()))
                  .toArray();

            payloadAndMetadata = payloadAndMetadata
                  .mapToPair(new VehicleDataValidator(
                        new SparkInstrumentation(ssc.sparkContext(), "ode", "RecordValidator").register(),
                        validationData));
         }

         /*
          * Weather data integration
          */

         String weatherLocation = ssc.sparkContext().getConf()
               .get(AppContext.SPARK_STATIC_WEATHER_FILE_LOCATION, "");
         if (!weatherLocation.equals("")) {
            JavaSparkContext sparkContext = ssc.sparkContext();

            JavaRDD<String> fileRDD = sparkContext.textFile(weatherLocation);
            List<String> fileArray = fileRDD.toArray();

            List<StructField> fields = new ArrayList<StructField>();
            String[] header = fileArray.get(0).split(",");
            for (String head : header)
               fields.add(DataTypes.createStructField(head,
                     DataTypes.StringType, true));

            fileArray.remove(0);
            List<Row> outRows = new ArrayList<Row>();
            for (String s : fileArray) {
               outRows.add(RowFactory.create((Object[]) s.split(",", -1)));
            }

            StructType newSchema = DataTypes.createStructType(fields);

            SQLContext sqlContext = SqlContextSingleton
                  .getInstance(ssc.sparkContext().sc());
            DataFrame weatherFrame = sqlContext.createDataFrame(
                  sparkContext.parallelize(outRows), newSchema);
            logger.info("Weather Dataframe Created: "
                  + weatherFrame.head().toString());

            List<String> weatherData = weatherFrame.toJavaRDD()
                  .map(new DataFrameMapper(
                        new SparkInstrumentation(ssc.sparkContext(), "ode", "WeatherIntegratorDataFrameMapper").register(),
                        weatherFrame.columns())).toArray();

            payloadAndMetadata = payloadAndMetadata
                  .mapToPair(new WeatherIntegrator(
                        new SparkInstrumentation(ssc.sparkContext(), "ode", "WeatherIntegrator").register(),
                        weatherData));

         }

         boolean aggInVDP = conf.getBoolean(
               AppContext.SPARK_RUN_ODE_AGGREGATOR_IN_VDP, 
               AppContext.DEFAULT_SPARK_RUN_ODE_AGGREGATOR_IN_VDP) ||
               ssc.sparkContext().master().startsWith("local");

         if (aggInVDP) {
            // Aggregator is embedded in Transformer app as a Sliding Window operation
            if (conf.getBoolean(
                     AppContext.SPARK_ODE_AGGREGATOR_ENABLED, 
                     AppContext.DEFAULT_SPARK_ODE_AGGREGATOR_ENABLED)) {
               logger.info("Aggregator is embedded in the Transformer application");

               JavaPairDStream<String, Tuple2<String, String>> 
                  aggregationEligibleRecords = payloadAndMetadata
                     .filter(new SpeedValidator(
                           new SparkInstrumentation(
                                 ssc.sparkContext(),
                                 "ode",
                                 "SpeedValidator").register()));

               // Aggregate here
               aggregationEligibleRecords.window(
                     Durations.milliseconds(
                                 microbatchDuration * windowDuration),
                     Durations.milliseconds(microbatchDuration * slideDuration))
                        .foreachRDD(
                           new Aggregator(
                                 new SparkInstrumentation(ssc.sparkContext(), "ode", "Aggregator").register(),
                                 new PayloadAggregator(
                                    new SparkInstrumentation(ssc.sparkContext(), "ode", "PayloadAggregator").register(),
                                    new SparkInstrumentation(ssc.sparkContext(), "ode", "AggregateDataDistributor").register(),
                                    producerPool, 
                                    conf.get(AppContext.SPARK_AGGREGATOR_OUTPUT_TOPIC))));
            } else {
               logger.info("Aggregator is disabled");
            }

            /*
             * Vehicle data Distribution
             */
            payloadAndMetadata.foreachRDD(new PayloadDistributor(
                  new SparkInstrumentation(ssc.sparkContext(), "ode", "PayloadDistributor").register(),
                  new SparkInstrumentation(ssc.sparkContext(), "ode", "PartitionDistributor").register(),
                  new SparkInstrumentation(ssc.sparkContext(), "ode", "ProducerSend").register(),
                  producerPool,
                  null));

         } else {// Aggregator is a separate Spark app
            if (conf.getBoolean(
                  AppContext.SPARK_ODE_AGGREGATOR_ENABLED, 
                  AppContext.DEFAULT_SPARK_ODE_AGGREGATOR_ENABLED)) {
               logger.info("Aggregator is running in its own application");
               
               /*
                * Vehicle data distribution/rollover to the Aggregator app
                */
               payloadAndMetadata.foreachRDD(new PayloadDistributor(
                     new SparkInstrumentation(ssc.sparkContext(), "ode", "PayloadDistributor").register(),
                     new SparkInstrumentation(ssc.sparkContext(), "ode", "PartitionDistributor").register(),
                     new SparkInstrumentation(ssc.sparkContext(), "ode", "ProducerSend").register(),
                     producerPool,
                     conf.get(AppContext.SPARK_AGGREGATOR_INPUT_TOPIC)));
            } else {
               logger.info("Aggregator is disabled");
               /*
                * Vehicle data Distribution
                */
               payloadAndMetadata.foreachRDD(new PayloadDistributor(
                     new SparkInstrumentation(ssc.sparkContext(), "ode", "PayloadDistributor").register(),
                     new SparkInstrumentation(ssc.sparkContext(), "ode", "PartitionDistributor").register(),
                     new SparkInstrumentation(ssc.sparkContext(), "ode", "ProducerSend").register(),
                     producerPool,
                     null));
            }
         }
            
      } catch (Exception e) {
         logger.error("Error in Spark Job {}", e);
      }

      return payloadAndMetadata;
  }


}
