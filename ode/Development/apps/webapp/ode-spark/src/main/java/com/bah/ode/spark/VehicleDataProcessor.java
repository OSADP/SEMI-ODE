package com.bah.ode.spark;

import java.util.ArrayList;
import java.util.Collections;
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
import org.apache.spark.streaming.kafka.KafkaUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import scala.Tuple2;

import com.bah.ode.context.AppContext;
//import com.bah.ode.context.AppContext;
import com.bah.ode.model.OdeObject;
import com.bah.ode.util.JsonUtils;
import com.bah.ode.wrapper.MQSerialazableProducerPool;
import com.bah.ode.wrapper.MQTopic;

public class VehicleDataProcessor extends OdeObject {
   private static final long serialVersionUID = 2480028249180282250L;
   private static Logger logger = LoggerFactory
         .getLogger(VehicleDataProcessor.class);

   // private static AppContext appContext = AppContext.getInstance();

   public void setup(final JavaStreamingContext ssc, MQTopic ovdfTopic,
         String zkConnectionStrings, String brokerList) {

      ArrayList<JavaPairDStream<String, String>> dstreams = new ArrayList<JavaPairDStream<String, String>>();

      String groupId = VehicleDataProcessor.class.getName();

      try {
         for (int i = 0; i < ovdfTopic.getPartitions(); i++) {
            JavaPairDStream<String, String> aStream = KafkaUtils.createStream(
                  ssc,
                  zkConnectionStrings,
                  groupId,
                  Collections.singletonMap(ovdfTopic.getName(),
                        ovdfTopic.getPartitions()));

            dstreams.add(aStream);
         }

         JavaPairDStream<String, String> unifiedStream = ssc.union(
               dstreams.get(0), dstreams.subList(1, dstreams.size()));

         // System.out.println("unifiedStream");
         // System.out.println("===============");
         // unifiedStream.cache().print(10);

         JavaPairDStream<String, String> payloadStream2 = unifiedStream
               .mapToPair(pam -> new Tuple2<String, String>(pam._1, 
                     JsonUtils.getJsonNode(pam._2, "payload").toString()));

         // System.out.println("payloadStream2");
         // System.out.println("===============");
         // payloadStream2.cache().print(10);

         // JavaDStream<String> payloadStream =
         // unifiedStream.map(pam -> JsonUtils.getJson(pam._2, "payload"));

         JavaPairDStream<String, String> metadataStream2 = unifiedStream
               .mapToPair(pam -> new Tuple2<String, String>(pam._1, 
                     JsonUtils.getJsonNode(pam._2, "metadata").toString()));

         // System.out.println("metadataStream2");
         // System.out.println("===============");
         // metadataStream2.cache().print(10);

         // JavaDStream<String> metadataStream =
         // unifiedStream.map(pam -> JsonUtils.getJson(pam._2, "metadata"));
         //
         SparkConf conf = ssc.sparkContext().getConf();

         Integer microbatchDuration = Integer.valueOf(conf.get(
               AppContext.SPARK_STREAMING_MICROBATCH_DURATION_MS, "1000"));
         // Integer.valueOf(appContext.getParam(AppContext.SPARK_STREAMING_MICROBATCH_DURATION_MS));

         Integer windowDuration = Integer.valueOf(conf.get(
               AppContext.SPARK_STREAMING_WINDOW_MICROBATCHES, "60"));
         // Integer.valueOf(appContext.getParam(AppContext.SPARK_STREAMING_WINDOW_MICROBATCHES));

         Integer slideDuration = Integer.valueOf(conf.get(
               AppContext.SPARK_STREAMING_SLIDE_MICROBATCHES, "30"));
         // Integer.valueOf(appContext.getParam(AppContext.SPARK_STREAMING_SLIDE_MICROBATCHES));

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
               .sparkContext().broadcast(
                     new MQSerialazableProducerPool(brokerList));

         /*
          * Road Segment Integration
          */
         JavaPairDStream<String, Tuple2<String, String>> withRoadSegment = 
               payloadAndMetadata.mapToPair(new RoadSegmentIntegrator(
                     Double.valueOf(conf.get(AppContext.SPARK_ROAD_SEGMENT_SNAPPING_TOLERANCE, "20.0"))));

         JavaPairDStream<String, Tuple2<String, String>> windowedPnM = 
               withRoadSegment.window(
                     Durations.milliseconds(microbatchDuration
                           * windowDuration),
                     Durations.milliseconds(microbatchDuration
                           * slideDuration));

         /*
          * Bounding Box Sanitization ODE-38
          */
         String sanitizationLocation = ssc.sparkContext().getConf()
        		 .get(AppContext.SPARK_STATIC_SANITIZATION_FILE_LOCATION, "");
         if(!sanitizationLocation.equals("")){
             SQLContext sqlContext = SqlContextSingleton.getInstance(ssc
                     .sparkContext().sc());

        	 // A JSON dataset is pointed to by path.
        	 // The path can be either a single text file or a directory storing text files.
        	 DataFrame sanitization = sqlContext.jsonFile(sanitizationLocation);

             logger.info("Sanitization Dataframe Created: " + sanitization.head().toString());

         }
         
         /*
          * Vehicle Data Aggregation and Distribution
          */
         windowedPnM.foreachRDD(new Aggregator(producerPool, ssc
               .sparkContext().getConf()
               .get("spark.topics."+AppContext.DATA_PROCESSOR_AGGREGATES_TOPIC)));

         /*
          * Vehicle data Distribution
          */
         withRoadSegment.foreachRDD(new PayloadDistributor(producerPool));
            
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

            SQLContext sqlContext = SqlContextSingleton.getInstance(ssc
                  .sparkContext().sc());
            DataFrame weatherFrame = sqlContext.createDataFrame(
                  sparkContext.parallelize(outRows), newSchema);
            logger.info("Weather Dataframe Created: "
                  + weatherFrame.head().toString());

            List<String> weatherData = weatherFrame.toJavaRDD()
                  .map(new WeatherMapper(weatherFrame.columns())).toArray();

            JavaPairDStream<String, Tuple2<String, String>> withWeatherData = 
                  withRoadSegment.mapToPair(new WeatherIntegrator(weatherData));

            withWeatherData.foreachRDD(new PayloadDistributor(producerPool));
         }
      } catch (Exception e) {
         logger.info("Error in Spark Job {}", e);
      }

   }

}
