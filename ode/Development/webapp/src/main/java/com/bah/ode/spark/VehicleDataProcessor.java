package com.bah.ode.spark;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.VoidFunction;
import org.apache.spark.broadcast.Broadcast;
import org.apache.spark.streaming.api.java.JavaPairDStream;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.apache.spark.streaming.kafka.KafkaUtils;

import scala.Tuple2;

import com.bah.ode.model.OdeMsgAndMetadata;
import com.bah.ode.model.OdeObject;
import com.bah.ode.util.JsonUtils;
import com.bah.ode.wrapper.MQProducer;
import com.bah.ode.wrapper.MQSerialazableProducerPool;
import com.bah.ode.wrapper.MQTopic;

public class VehicleDataProcessor extends OdeObject {
   private static final long serialVersionUID = 2480028249180282250L;

   public void setup(final JavaStreamingContext ssc, 
         MQTopic ovdfTopic, 
         String zkConnectionStrings, 
         String brokerList) {
      
      // The code below demonstrates how to read from all the topic's partitions.  We create an input DStream for each
      // partition of the topic, unify those streams, and then repartition the unified stream.  This last step allows
      // us to decouple the desired "downstream" parallelism (data processing) from the "upstream" parallelism
      // (number of partitions).
      //
      // Note: In our case the input topic has only 1 partition, so you won't see a real effect of this fancy setup.
      //
      // And yes, the way we do this looks quite strange -- we combine a hardcoded `1` in the topic map with a
      // subsequent `(1..N)` construct.  But this approach is the recommended way.
      // See http://spark.apache.org/docs/1.1.0/streaming-programming-guide.html#reducing-the-processing-time-of-each-batch
      //      val streams = (1 to inputTopic.partitions) map { _ =>
      //      KafkaUtils.createStream[Array[Byte], Array[Byte], DefaultDecoder, DefaultDecoder](
      //        ssc,
      //        kafkaParams,
      //        Map(inputTopic.name -> 1),
      //        storageLevel = StorageLevel.MEMORY_ONLY_SER // or: StorageLevel.MEMORY_AND_DISK_SER
      //      ).map(_._2)
      //    }
      //    val unifiedStream = ssc.union(streams) // Merge the "per-partition" DStreams
      //    val sparkProcessingParallelism = 1 // You'd probably pick a higher value than 1 in production.
      //    // Repartition distributes the received batches of data across specified number of machines in the cluster
      //    // before further processing.  Essentially, what we are doing here is to decouple processing parallelism from
      //    // reading parallelism (limited by #partitions).
      //    unifiedStream.repartition(sparkProcessingParallelism)
      //  }
      
      ArrayList<JavaPairDStream<String, String>> dstreams = 
            new ArrayList<JavaPairDStream<String, String>>();

      for (int i = 0; i < ovdfTopic.getPartitions(); i++) {
         JavaPairDStream<String, String> aStream = KafkaUtils
               .createStream(ssc, zkConnectionStrings, VehicleDataProcessor.class.getName(), 
                     Collections.singletonMap(ovdfTopic.getName(), 
                           ovdfTopic.getPartitions()));

         dstreams.add(aStream);
      }
      JavaPairDStream<String, String> unifiedStream = 
            ssc.union(dstreams.get(0), dstreams.subList(1, dstreams.size()));
//    unifiedStream.print();



    // We use accumulators to track the number of consumed and produced messages across all tasks.  Named accumulators
    // are also said to be displayed in Spark's UI but we haven't found them yet. :-)
//    Accumulator<Double> numInputMessages = 
//          ssc.sparkContext().accumulator(0L, "Kafka messages consumed");
//    Accumulator<Double> numOutputMessages = 
//    ssc.sparkContext().accumulator(0L, "Kafka messages produced");
    
    // We use a broadcast variable to share a pool of Kafka producers, which we use to write data from Spark to Kafka.
//    final Broadcast<MQProducerPool> producerPool = 
//          ssc.sparkContext().broadcast(createProducerPool(
//          appContext.getParam(AppContext.METADATA_BROKER_LIST)));
    
    final Broadcast<MQSerialazableProducerPool> producerPool = 
          ssc.sparkContext().broadcast(new MQSerialazableProducerPool(
          brokerList));
    
    // We also use a broadcast variable for Bijection/Injection.
    //    val converter = ssc.sparkContext.broadcast(specificAvroBinaryInjectionForTweet)

    // Note: When working on PairDStreams (which we are not doing here) do not forget to import the corresponding
    // implicits (see import statement below) in order to pick up implicits that allow `DStream.reduceByKey` etc.
    // (versus `DStream.transform(rddBatch => rddBatch.reduceByKey()`).  In other words, DStreams appear to be
    // relatively featureless until you import this implicit -- if you don't, you must operate on the underlying RRDs
    // explicitly which is not ideal.
    //
    //    import org.apache.spark.streaming.StreamingContext.toPairDStreamFunctions
    //
    // See https://www.mail-archive.com/user@spark.apache.org/msg10105.html

    // Define the actual data flow of the streaming job
//    kafkaStream.foreachRDD(rdd => {
//       rdd.foreachPartition(partitionOfRecords => {
//         val p = producerPool.value.borrowObject()
//         partitionOfRecords.foreach { case tweet: Tweet =>
//           val bytes = converter.value.apply(tweet)
//           p.send(bytes)
//           numOutputMessages += 1
//         }
//         producerPool.value.returnObject(p)
//       })
//     })
//    RddProcessor rddProcessor = new RddProcessor(producerPool, 
//          ioTopic.getOutTopics());

    Function<JavaPairRDD<String, String>, Void> rddProcessor = 
          new Function<JavaPairRDD<String, String>, Void>() {
       private static final long serialVersionUID = 4946021213014494671L;

       @Override
       public Void call(JavaPairRDD<String, String> rdd) throws Exception {
          VoidFunction<Iterator<Tuple2<String, String>>> partitionOutputer =
                new VoidFunction<Iterator<Tuple2<String,String>>>() {
                  private static final long serialVersionUID = 1L;

                  @Override
                  public void call(Iterator<
                        Tuple2<String, String>> partitionOfRecords) 
                        throws Exception {
                     MQProducer<String, String> producer = 
                           producerPool.value().checkOut();
                     while (partitionOfRecords.hasNext()) {
                        Tuple2<String, String> record = 
                              partitionOfRecords.next();
                        OdeMsgAndMetadata msgAndMetadata = 
                              (OdeMsgAndMetadata) JsonUtils.fromJson(
                              record._2(), OdeMsgAndMetadata.class);
                        
                        producer.send(msgAndMetadata.getMetadata().getOutputTopic().getName(),
                              record._1(), record._2());
                     }
                     producerPool.value().checkIn(producer);
                  }
               };
//                new MQOutputer(producerPool,
//                      ioTopic.getOutTopics());

          rdd.foreachPartition(partitionOutputer);
          return null;
       }
    };
    unifiedStream.foreachRDD(rddProcessor);
//    unifiedStream.print();
   }

}
