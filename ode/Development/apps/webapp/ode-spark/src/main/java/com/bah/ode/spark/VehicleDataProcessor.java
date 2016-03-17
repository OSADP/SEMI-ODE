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
import com.bah.ode.util.JsonUtils;
import com.bah.ode.wrapper.MQSerialazableProducerPool;
import com.bah.ode.wrapper.MQTopic;

import scala.Tuple2;

public class VehicleDataProcessor extends SparkJob {
   private static Logger logger = LoggerFactory
         .getLogger(VehicleDataProcessor.class);

   public JavaPairDStream<String, String> setup(JavaStreamingContext ssc,
         MQTopic topic, String zkConnectionStrings,
         String brokerList) {
      

      SparkConf conf = ssc.sparkContext().getConf();
      JavaPairDStream<String, String> unifiedStream = super.unifiedStream(
            ssc, topic, zkConnectionStrings, brokerList);
      
      try {
         // System.out.println("unifiedStream");
         // System.out.println("===============");
         // unifiedStream.cache().print(10);

         JavaPairDStream<String, String> payloadStream2 = unifiedStream
               .mapToPair(
                     pam -> new Tuple2<String, String>(pam._1,
                           JsonUtils
                                 .getJsonNode(pam._2, AppContext.PAYLOAD_STRING)
                                 .toString()));

         // System.out.println("payloadStream2");
         // System.out.println("===============");
         // payloadStream2.cache().print(10);

         // JavaDStream<String> payloadStream =
         // unifiedStream.map(pam -> JsonUtils.getJson(pam._2,
         // AppContext.PAYLOAD_STRING));

         JavaPairDStream<String, String> metadataStream2 = unifiedStream
               .mapToPair(pam -> new Tuple2<String, String>(pam._1,
                     JsonUtils.getJsonNode(pam._2, AppContext.METADATA_STRING)
                           .toString()));

         // System.out.println("metadataStream2");
         // System.out.println("===============");
         // metadataStream2.cache().print(10);

         // JavaDStream<String> metadataStream =
         // unifiedStream.map(pam -> JsonUtils.getJson(pam._2,
         // AppContext.METADATA_STRING));
         //
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

         JavaPairDStream<String, Tuple2<String, String>> payloadAndMetadata = payloadStream2
               .join(metadataStream2);

         // System.out.println("joinedStream2");
         // System.out.println("===============");
         // joinedStream2.cache().print(10);

         // JavaPairDStream<String, String> joinedStream =
         // joinedStream2.mapToPair(pam->pam._2);
         // System.out.println("joinedStream");
         // System.out.println("===============");
         // joinedStream.cache().print(10);

         final Broadcast<MQSerialazableProducerPool> producerPool = ssc
               .sparkContext()
               .broadcast(new MQSerialazableProducerPool(brokerList));

         /*
          * Road Segment Integration
          */
         payloadAndMetadata = payloadAndMetadata
               .mapToPair(new RoadSegmentIntegrator(Double.valueOf(conf.get(
                     AppContext.SPARK_ROAD_SEGMENT_SNAPPING_TOLERANCE,
                     String.valueOf(
                           AppContext.DEFAULT_SPARK_ROAD_SEGMENT_SNAPPING_TOLERANCE)))));

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
                  .map(new DataFrameMapper(sanitizationFrame.columns()))
                  .toArray();

            payloadAndMetadata = payloadAndMetadata
                  .mapToPair(new RecordSanitizer(sanitizationData));

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
                  .map(new DataFrameMapper(validationFrame.columns()))
                  .toArray();

            payloadAndMetadata = payloadAndMetadata
                  .mapToPair(new RecordValidator(validationData));
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
                  .map(new DataFrameMapper(weatherFrame.columns())).toArray();

            payloadAndMetadata = payloadAndMetadata
                  .mapToPair(new WeatherIntegrator(weatherData));

         }

         /*
          * Vehicle Data Distribution
          */
         boolean aggInVDP = conf.getBoolean(
               AppContext.SPARK_RUN_ODE_AGGREGATOR_IN_VDP, 
               AppContext.DEFAULT_SPARK_RUN_ODE_AGGREGATOR_IN_VDP) ||
               ssc.sparkContext().master().startsWith("local");

         if (aggInVDP) {
            // We do aggregation in the same Spark app
            if (conf.getBoolean(
                     AppContext.SPARK_ODE_AGGREGATOR_ENABLED, 
                     AppContext.DEFAULT_SPARK_ODE_AGGREGATOR_ENABLED)) {
               logger.info("Aggregator is embedded in the Transformer application");
               //persist to make sure it remains in memory
               payloadAndMetadata.persist();

               // Aggregate here
               payloadAndMetadata
                     .window(
                           Durations.milliseconds(
                                 microbatchDuration * windowDuration),
                     Durations.milliseconds(microbatchDuration * slideDuration))
                     .foreachRDD(
                           new Aggregator(new PayloadAggregator(producerPool, conf.get(
                                 AppContext.SPARK_AGGREGATOR_OUTPUT_TOPIC))));
            } else {
               logger.info("Aggregator is disabled");
            }
            /*
             * Vehicle data Distribution
             */
            payloadAndMetadata.foreachRDD(new PayloadDistributor(producerPool,
                  null));

         } else {
            if (conf.getBoolean(
                  AppContext.SPARK_ODE_AGGREGATOR_ENABLED, 
                  AppContext.DEFAULT_SPARK_ODE_AGGREGATOR_ENABLED)) {
               logger.info("Aggregator is running in its own application");
               /*
                * Vehicle data distribution/rollover to the Aggregator app
                */
               payloadAndMetadata.foreachRDD(new PayloadDistributor(producerPool,
                     conf.get(AppContext.SPARK_AGGREGATOR_INPUT_TOPIC)));
            } else {
               logger.info("Aggregator is disabled");
               /*
                * Vehicle data Distribution
                */
               payloadAndMetadata.foreachRDD(new PayloadDistributor(producerPool,
                     null));
            }
         }
            
      } catch (Exception e) {
         logger.info("Error in Spark Job {}", e);
      }

      return unifiedStream;
  }


}
