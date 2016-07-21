package com.bah.ode.spark;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import org.apache.spark.SparkConf;
import org.apache.spark.streaming.api.java.JavaPairDStream;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.apache.spark.streaming.kafka.KafkaUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.context.AppContext;
import com.bah.ode.util.JsonUtils;
import com.bah.ode.wrapper.MQTopic;

import kafka.serializer.StringDecoder;
import scala.Tuple2;

public abstract class SparkJob {
   private static Logger logger = LoggerFactory.getLogger(SparkJob.class);

   public JavaPairDStream<String, String> parallelReceivers(
         final JavaStreamingContext ssc, String groupId, MQTopic topic,
         String zkConnectionStrings, String brokerList) {
      ArrayList<JavaPairDStream<String, String>> dstreams = new ArrayList<JavaPairDStream<String, String>>();

      for (int i = 0; i < topic.getPartitions(); i++) {
         JavaPairDStream<String, String> aStream = KafkaUtils.createStream(ssc,
               zkConnectionStrings, groupId,
               Collections.singletonMap(topic.getName(), 1));

         dstreams.add(aStream);
      }

      JavaPairDStream<String, String> unifiedStream = ssc.union(dstreams.get(0),
            dstreams.subList(1, dstreams.size()));

      return unifiedStream;
   }

   public JavaPairDStream<String, String> singleReceiver(
         final JavaStreamingContext ssc, String groupId, MQTopic topic,
         String zkConnectionStrings, String brokerList) {
      JavaPairDStream<String, String> unifiedStream = KafkaUtils.createStream(
            ssc, zkConnectionStrings, groupId,
            Collections.singletonMap(topic.getName(), topic.getPartitions()));

      return unifiedStream;
   }

   public JavaPairDStream<String,Tuple2<String,String>> receiveDirect (
         final JavaStreamingContext ssc, MQTopic topic, String brokerList) {
      HashSet<String> topicsSet = new HashSet<String>();
      topicsSet.add(topic.getName());
      JavaPairDStream<String, String> unifiedStream = KafkaUtils.createDirectStream(
            ssc,
            String.class,
            String.class,
            StringDecoder.class,
            StringDecoder.class,
            Collections.singletonMap("metadata.broker.list",
                  brokerList),
            topicsSet
        );

      JavaPairDStream<String, Tuple2<String, String>> payloadAndMetadata = 
            joinPayloadAndMetadata(
            topic, unifiedStream);

      
      return payloadAndMetadata;
   }

   public JavaPairDStream<String, Tuple2<String, String>> unifiedStream(
         final JavaStreamingContext ssc, MQTopic topic,
         String zkConnectionStrings, String brokerList) {

      SparkConf conf = ssc.sparkContext().getConf();
      JavaPairDStream<String, String> unifiedStream;

      if (conf.getBoolean(AppContext.SPARK_USE_PARALLEL_RECEIVERS,
            AppContext.DEFAULT_SPARK_USE_PARALLEL_RECEIVERS)
            && topic.getPartitions() > 1) {
         logger.info("Spark using parallel receivers each consuming a single partition");
         unifiedStream = parallelReceivers(ssc, this.getClass().getName(),
               topic, zkConnectionStrings, brokerList);
      } else {
         logger.info("Spark using a single receiver consuming all available partitions");
         unifiedStream = singleReceiver(ssc, this.getClass().getName(), topic,
               zkConnectionStrings, brokerList);
      }
      
      JavaPairDStream<String, Tuple2<String, String>> payloadAndMetadata = 
            joinPayloadAndMetadata(
            topic, unifiedStream);

      
      return payloadAndMetadata;
   }

   private JavaPairDStream<String, Tuple2<String, String>> joinPayloadAndMetadata(
         MQTopic topic, JavaPairDStream<String, String> unifiedStream) {
      // System.out.println("unifiedStream");
      // System.out.println("===============");
      // unifiedStream.cache().print(10);

      JavaPairDStream<String, String> payloadStream = unifiedStream
            .mapToPair(
                  pam -> new Tuple2<String, String>(pam._1,
                        JsonUtils
                              .getJsonNode(pam._2, AppContext.PAYLOAD_STRING)
                              .toString()));

      // System.out.println("payloadStream");
      // System.out.println("===============");
      // payloadStream.cache().print(10);

      JavaPairDStream<String, String> metadataStream = unifiedStream
            .mapToPair(pam -> new Tuple2<String, String>(pam._1,
                  JsonUtils.getJsonNode(pam._2, AppContext.METADATA_STRING)
                        .toString()));

      // System.out.println("metadataStream");
      // System.out.println("===============");
      // metadataStream.cache().print(10);


      JavaPairDStream<String, Tuple2<String, String>> payloadAndMetadata = 
            payloadStream.join(metadataStream);

      // System.out.println("joinedStream");
      // System.out.println("===============");
      // joinedStream.cache().print(10);
      return payloadAndMetadata;
   }

}
