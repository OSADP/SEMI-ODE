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


//import com.bah.ode.context.AppContext;
import com.bah.ode.model.OdeObject;
import com.bah.ode.util.JsonUtils;
import com.bah.ode.wrapper.MQSerialazableProducerPool;
import com.bah.ode.wrapper.MQTopic;

public class VehicleDataProcessor extends OdeObject {
	private static final long serialVersionUID = 2480028249180282250L;
	private static Logger logger = LoggerFactory
			.getLogger(VehicleDataProcessor.class);
	//private static AppContext appContext = AppContext.getInstance();

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
					.mapToPair(pam -> new Tuple2<String, String>(pam._1, JsonUtils
							.getJson(pam._2, "payload")));

			// System.out.println("payloadStream2");
			// System.out.println("===============");
			// payloadStream2.cache().print(10);

			// JavaDStream<String> payloadStream =
			// unifiedStream.map(pam -> JsonUtils.getJson(pam._2, "payload"));

			JavaPairDStream<String, String> metadataStream2 = unifiedStream
					.mapToPair(pam -> new Tuple2<String, String>(pam._1, JsonUtils
							.getJson(pam._2, "metadata")));

			// System.out.println("metadataStream2");
			// System.out.println("===============");
			// metadataStream2.cache().print(10);

			// JavaDStream<String> metadataStream =
			// unifiedStream.map(pam -> JsonUtils.getJson(pam._2, "metadata"));
			//
			SparkConf conf = ssc.sparkContext().getConf();

			Integer microbatchDuration = Integer.valueOf(conf.get("spark.streaming.microbatch.duration.ms", "1000"));
			//Integer.valueOf(appContext.getParam(AppContext.SPARK_STREAMING_MICROBATCH_DURATION_MS));

			Integer windowDuration = Integer.valueOf(conf.get("spark.streaming.window.microbatches", "60"));
			//Integer.valueOf(appContext.getParam(AppContext.SPARK_STREAMING_WINDOW_MICROBATCHES));

			Integer slideDuration = Integer.valueOf(conf.get("spark.streaming.slide.microbatches", "30"));
			// Integer.valueOf(appContext.getParam(AppContext.SPARK_STREAMING_SLIDE_MICROBATCHES));

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
			// joinedStream2.mapToPair(pam->pam._2);
			// System.out.println("joinedStream");
			// System.out.println("===============");
			// joinedStream.cache().print(10);


			//			if(ssc.sparkContext().getConf().get("spark.static.weather.file.boolean").equals("true")){
			//				JavaSparkContext sparkContext = ssc.sparkContext();
			//
			//				JavaRDD<String> fileRDD = sparkContext.textFile(ssc.sparkContext().getConf().get("spark.static.weather.file.location"));
			//				List<String> fileArray = fileRDD.toArray();
			//
			//				List<StructField> fields = new ArrayList<StructField>();
			//				String[] header = fileArray.get(0).split(",");
			//				for(String head : header)
			//					fields.add(DataTypes.createStructField(head, DataTypes.StringType, true));
			//
			//				fileArray.remove(0);
			//				List<Row> outRows = new ArrayList<Row>();
			//				for(String s: fileArray){
			//					outRows.add(  RowFactory.create((Object[]) s.split(",", -1)) );
			//				}
			//
			//				StructType newSchema = DataTypes.createStructType(fields);
			//
			//				SQLContext sqlContext = SqlContextSingleton.getInstance(ssc.sparkContext().sc());
			//				DataFrame weatherFrame = sqlContext.createDataFrame(sparkContext.parallelize(outRows), newSchema);
			//
			//				List<String> weatherData = weatherFrame.toJavaRDD().map(new WeatherMapper(weatherFrame.columns())).toArray();
			//
			//
			//				JavaPairDStream<String, Tuple2<String, String>> withWeatherData =
			//						payloadAndMetadata.mapToPair(new WeatherIntegrator(weatherData, weatherFrame.columns()));
			//
			//				withWeatherData.foreachRDD(new PayloadDistributor(producerPool));
			//			}


			//			JavaPairDStream<String, Tuple2<String, String>> withRoadSegment =
			//					payloadAndMetadata.mapToPair(new RoadSegmentIntegrator());
			//
			//			withRoadSegment.foreachRDD(new PayloadDistributor(producerPool));

			payloadAndMetadata.foreachRDD(new PayloadDistributor(producerPool));
		} catch (Exception e) {
			logger.info("Error in Spark Job {}", e);
		}

	}

}
