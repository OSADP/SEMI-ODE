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
import org.apache.spark.streaming.api.java.JavaPairDStream;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.context.AppContext;
import com.bah.ode.metrics.SparkInstrumentation;
import com.bah.ode.util.CommonUtils;
import com.bah.ode.wrapper.MQSerialazableProducerPool;
import com.bah.ode.wrapper.MQTopic;

import scala.Tuple2;

public class JobVehicleDataTransformer extends SparkJob {
   private static Logger logger = LoggerFactory
         .getLogger(JobVehicleDataTransformer.class);

   @Override
   public JavaPairDStream<String, Tuple2<String, String>> setup(
         JavaStreamingContext ssc, MQTopic topic, 
         String zkConnectionStrings, String brokerList) {
      

      logger.info("Getting Spark Conf...");
      SparkConf conf = ssc.sparkContext().getConf();
      
      CommonUtils.logSparkConf(conf, logger);
      
      logger.info("Getting payloadAndMetadata...");
      JavaPairDStream<String, Tuple2<String, String>> payloadAndMetadata = 
            super.unifiedStream(
            ssc, topic, zkConnectionStrings, brokerList);
      
      try {
         final Broadcast<MQSerialazableProducerPool> producerPool = ssc
               .sparkContext()
               .broadcast(new MQSerialazableProducerPool(brokerList,
                     conf.get(AppContext.SPARK_KAFKA_PRODUCER_TYPE,
                           AppContext.DEFAULT_KAFKA_PRODUCER_TYPE)));

         /*
          * Road Segment Integration
          */
         logger.info("Integrating Road Segment...");
         payloadAndMetadata = payloadAndMetadata
               .mapToPair(new RoadSegmentIntegrator(new SparkInstrumentation(ssc.sparkContext(),"ode",  "RoadSegmentIntegrator").register(), 
                                                    Double.valueOf( conf.get(AppContext.SPARK_ROAD_SEGMENT_SNAPPING_TOLERANCE,
                                                                             String.valueOf(AppContext.DEFAULT_SPARK_ROAD_SEGMENT_SNAPPING_TOLERANCE)
                                                                            )
                                                                  )
                                                   )
                         );

//         System.out.println("RoadSegmentIntegrator");
//         System.out.println("=====================");
//         payloadAndMetadata.cache().print(10);
         
         /*
          * Bounding Box Sanitization ODE-38
          */
         String sanitizationLocation = ssc.sparkContext().getConf()
               .get(AppContext.SPARK_STATIC_SANITIZATION_FILE_LOCATION, "");
         if (!sanitizationLocation.equals("")) {
            logger.info("Sanitizing...");
            SQLContext sqlContext = SqlContextSingleton
                  .getInstance(ssc.sparkContext().sc());

            logger.info("Sanitizing... Creating DataFrame...");
            DataFrame sanitizationFrame = sqlContext
                  .jsonFile(sanitizationLocation);

            logger.info("Sanitizing... Mapping...");
            List<String> sanitizationData = sanitizationFrame.toJavaRDD()
                  .map(new DataFrameMapper(
                        new SparkInstrumentation(ssc.sparkContext(), "ode", "RecordSanitizerDataFrameMapper").register(), 
                        sanitizationFrame.columns()))
                  .toArray();

            logger.info("Sanitizing... Mapping to Pairs...");
            payloadAndMetadata = payloadAndMetadata
                  .mapToPair(new VehicleDataSanitizer(
                        new SparkInstrumentation(ssc.sparkContext(), "ode", "RecordSanitizer").register(), 
                        sanitizationData));

         }
//         System.out.println("VehicleDataSanitizer");
//         System.out.println("====================");
//         payloadAndMetadata.cache().print(10);

         /*
          * Validation ODE-68
          */
         logger.info("Validating...");
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
//         System.out.println("VehicleDataValidator");
//         System.out.println("====================");
//         payloadAndMetadata.cache().print(10);

         /*
          * Weather data integration
          */

         String weatherLocation = ssc.sparkContext().getConf()
               .get(AppContext.SPARK_STATIC_WEATHER_FILE_LOCATION, "");
         if (!weatherLocation.equals("")) {
            logger.info("Integrating weather data...");
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
//         System.out.println("WeatherIntegrator");
//         System.out.println("=================");
//         payloadAndMetadata.cache().print(10);

         logger.info("Filtering...");
         JavaPairDStream<String, Tuple2<String, String>> 
            aggregationEligibleRecords = payloadAndMetadata
               .filter(new SpeedValidator(
                     new SparkInstrumentation(
                           ssc.sparkContext(),
                           "ode",
                           "SpeedValidator").register()));

//         System.out.println("aggregationEligibleRecords");
//         System.out.println("==========================");
//         aggregationEligibleRecords.print(10);
         
         if (conf.getBoolean(
               AppContext.SPARK_ODE_AGGREGATOR_ENABLED, 
               AppContext.DEFAULT_SPARK_ODE_AGGREGATOR_ENABLED)) {
            boolean aggInVDP = conf.getBoolean(
                  AppContext.SPARK_RUN_AGGREGATOR_IN_TRANSFORMER, 
                  AppContext.DEFAULT_SPARK_RUN_AGGREGATOR_IN_TRANSFORMER) ||
                  ssc.sparkContext().master().startsWith("local");

            if (aggInVDP) {
               // Aggregator is embedded in Transformer app as a Sliding Window operation
               logger.info("Aggregator is embedded in the Transformer application");

               logger.info("Calculating and distributing aggregate data...");
               JobVehicleDataAggregator.setup(ssc, conf, 
                     aggregationEligibleRecords, producerPool);

               logger.info("Distributing vehicle data...");
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
               logger.info("Aggregator is running in its own application. Distributing vehicel data...");
               
               /*
                * Vehicle data distribution/rollover to the Aggregator app
                */
               payloadAndMetadata.foreachRDD(new PayloadDistributor(
                     new SparkInstrumentation(ssc.sparkContext(), "ode", "PayloadDistributor").register(),
                     new SparkInstrumentation(ssc.sparkContext(), "ode", "PartitionDistributor").register(),
                     new SparkInstrumentation(ssc.sparkContext(), "ode", "ProducerSend").register(),
                     producerPool,
                     conf.get(AppContext.SPARK_AGGREGATOR_INPUT_TOPIC)));
            }
         } else {
            logger.info("Aggregator is disabled. Distributing vehicel data..");
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
      } catch (Exception e) {
         logger.error("Error in Spark Job {}", e);
      }

      return payloadAndMetadata;
  }


}
