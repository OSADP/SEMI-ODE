package com.bah.ode.spark;

import java.util.ArrayList;
import java.util.Collections;

import org.apache.spark.broadcast.Broadcast;
import org.apache.spark.streaming.Durations;
import org.apache.spark.streaming.api.java.JavaPairDStream;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.apache.spark.streaming.kafka.KafkaUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import scala.Tuple2;

import com.bah.ode.context.AppContext;
import com.bah.ode.model.OdeObject;
import com.bah.ode.util.JsonUtils;
import com.bah.ode.wrapper.MQSerialazableProducerPool;
import com.bah.ode.wrapper.MQTopic;

public class VehicleDataProcessor extends OdeObject {
   private static final long serialVersionUID = 2480028249180282250L;
   private static Logger logger = LoggerFactory
         .getLogger(VehicleDataProcessor.class);
   private static AppContext appContext = AppContext.getInstance();

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
               .mapToPair(omam -> new Tuple2<String, String>(omam._1, JsonUtils
                     .getJson(omam._2, "payload")));

         // System.out.println("payloadStream2");
         // System.out.println("===============");
         // payloadStream2.cache().print(10);

         // JavaDStream<String> payloadStream =
         // unifiedStream.map(omam -> JsonUtils.getJson(omam._2, "payload"));

         JavaPairDStream<String, String> metadataStream2 = unifiedStream
               .mapToPair(omam -> new Tuple2<String, String>(omam._1, JsonUtils
                     .getJson(omam._2, "metadata")));

         // System.out.println("metadataStream2");
         // System.out.println("===============");
         // metadataStream2.cache().print(10);

         // JavaDStream<String> metadataStream =
         // unifiedStream.map(omam -> JsonUtils.getJson(omam._2, "metadata"));
         //
         Integer microbatchDuration = Integer.valueOf(appContext
               .getParam(AppContext.SPARK_STREAMING_MICROBATCH_DURATION_MS));

         Integer windowDuration = Integer.valueOf(appContext
               .getParam(AppContext.SPARK_STREAMING_WINDOW_MICROBATCHES));

         Integer slideDuration = Integer.valueOf(appContext
               .getParam(AppContext.SPARK_STREAMING_SLIDE_MICROBATCHES));

         JavaPairDStream<String, Tuple2<String, String>> payloadAndMetadata =
               payloadStream2.join(metadataStream2);

         JavaPairDStream<String, Tuple2<String, String>> windowedPnM =
               payloadAndMetadata.window(
                     Durations.milliseconds(microbatchDuration * windowDuration),
                     Durations.milliseconds(microbatchDuration * slideDuration));
         
         final Broadcast<MQSerialazableProducerPool> producerPool = ssc
               .sparkContext().broadcast(
                     new MQSerialazableProducerPool(brokerList));

         windowedPnM.foreachRDD(new AggregatorDistributor(producerPool));
         // System.out.println("joinedStream2");
         // System.out.println("===============");
         // joinedStream2.cache().print(10);

         // JavaPairDStream<String, String> joinedStream =
         // joinedStream2.mapToPair(omam->omam._2);
         // System.out.println("joinedStream");
         // System.out.println("===============");
         // joinedStream.cache().print(10);


         payloadAndMetadata.foreachRDD(new PayloadDistributor(producerPool));
      } catch (Exception e) {
         logger.info("Error in Spark Job {}", e);
      }

   }

}
