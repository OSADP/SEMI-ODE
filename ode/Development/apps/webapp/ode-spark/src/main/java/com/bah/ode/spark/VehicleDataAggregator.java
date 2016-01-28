package com.bah.ode.spark;

import java.util.ArrayList;
import java.util.Collections;

import org.apache.spark.SparkConf;
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

public class VehicleDataAggregator extends OdeObject {
		   private static final long serialVersionUID = 2480028249180282251L;
		   private static Logger logger = LoggerFactory
		         .getLogger(VehicleDataAggregator.class);

	public void setup(final JavaStreamingContext ssc, MQTopic ovdfTopic,
						String zkConnectionStrings, String brokerList) { 

	
	    SparkConf conf = ssc.sparkContext().getConf();
	
	    Integer microbatchDuration = Integer.valueOf(conf.get(
	          AppContext.SPARK_STREAMING_MICROBATCH_DURATION_MS, "1000"));

	
	    Integer windowDuration = Integer.valueOf(conf.get(
	          AppContext.SPARK_STREAMING_WINDOW_MICROBATCHES, "60"));

	
	    Integer slideDuration = Integer.valueOf(conf.get(
	          AppContext.SPARK_STREAMING_SLIDE_MICROBATCHES, "30"));

	
	      ArrayList<JavaPairDStream<String, String>> dstreams = new ArrayList<JavaPairDStream<String, String>>();

	      String groupId = VehicleDataAggregator.class.getName();

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

	         JavaPairDStream<String, String> payloadStream2 = unifiedStream
	                 .mapToPair(pam -> new Tuple2<String, String>(pam._1, 
	                       JsonUtils.getJsonNode(pam._2, AppContext.PAYLOAD_STRING).toString()));


	          JavaPairDStream<String, String> metadataStream2 = unifiedStream
	                 .mapToPair(pam -> new Tuple2<String, String>(pam._1, 
	                       JsonUtils.getJsonNode(pam._2, AppContext.METADATA_STRING).toString()));

	        
	          JavaPairDStream<String, Tuple2<String, String>> payloadAndMetadata = payloadStream2
	        		   .join(metadataStream2);
		
	
	          final Broadcast<MQSerialazableProducerPool> producerPool = ssc
						.sparkContext().broadcast(
	                     new MQSerialazableProducerPool(brokerList));

	          /*
			   * Road Segment Integration			
			   */
		      payloadAndMetadata = payloadAndMetadata.mapToPair(new RoadSegmentIntegrator(
		                    Double.valueOf(conf.get(AppContext.SPARK_ROAD_SEGMENT_SNAPPING_TOLERANCE, "20.0"))));
		
		        JavaPairDStream<String, Tuple2<String, String>> windowedPnM = 
		        		payloadAndMetadata.window(
		                    Durations.milliseconds(microbatchDuration
		                          * windowDuration),
		                    Durations.milliseconds(microbatchDuration
		                          * slideDuration));
				
		       /*
		        * Vehicle Data Aggregation and Distribution
		        */ 
		        windowedPnM.foreachRDD(new Aggregator(producerPool, 
    						conf.get("spark.topics."+AppContext.DATA_PROCESSOR_AGGREGATES_TOPIC)));
	            
	      } catch (Exception e) {
	    	  logger.info("Error in Spark Job {}", e);
	       }
	}
}