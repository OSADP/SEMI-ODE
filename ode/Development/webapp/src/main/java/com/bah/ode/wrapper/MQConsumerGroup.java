package com.bah.ode.wrapper;

import kafka.consumer.Consumer;
import kafka.consumer.ConsumerConfig;
import kafka.consumer.KafkaStream;
import kafka.javaapi.consumer.ConsumerConnector;
import kafka.serializer.Decoder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MQConsumerGroup<K, V, R> {
   private static Logger logger = LoggerFactory
         .getLogger(MQConsumerGroup.class);

   private final ConsumerConnector consumerConnector;
   private final MQTopic topic;
   private ExecutorService executor;
   private DataProcessor<V, R> processor;
   private Decoder<K> keyDecoder;
   private Decoder<V> valueDecoder;

   public MQConsumerGroup(String zookeepers, String a_groupId, 
         MQTopic a_topic, Decoder<K> keyDecoder,
         Decoder<V> valueDecoder) {
      
      consumerConnector = Consumer.createJavaConsumerConnector(
            createConsumerConfig(zookeepers, a_groupId));
      
      this.topic = a_topic;
      this.keyDecoder = keyDecoder;
      this.valueDecoder = valueDecoder;
   }

   public void shutdown() {
      if (consumerConnector != null)
         consumerConnector.shutdown();
      if (executor != null)
         executor.shutdown();
      try {
         if (!executor.awaitTermination(5000, TimeUnit.MILLISECONDS)) {
            logger.warn("Timed out waiting for consumer threads to shut down, exiting uncleanly");
         }
      } catch (InterruptedException e) {
         logger.warn("Interrupted during shutdown, exiting uncleanly");
      }
   }

   public void consume() {
      Map<String, Integer> topicCountMap = new HashMap<String, Integer>();
      topicCountMap.put(topic.getName(), topic.getPartitions());
      Map<String, List<KafkaStream<K, V>>> consumerMap = 
            consumerConnector.createMessageStreams(topicCountMap, 
                  keyDecoder, valueDecoder);
      List<KafkaStream<K, V>> streams = 
            consumerMap.get(topic.getName());

      // now launch all the threads
      //
      executor = Executors.newFixedThreadPool(topic.getPartitions());

      // now create an object to consume the messages
      //
      int threadNumber = 0;
      for (final KafkaStream<K, V> stream : streams) {
         executor.submit(new MQConsumer<K, V, R>(stream, threadNumber, processor));
         threadNumber++;
      }
   }

   private static ConsumerConfig createConsumerConfig(String zookeepers,
         String a_groupId) {
      Properties props = new Properties();
      props.put("zookeeper.connect", zookeepers);
      props.put("group.id", a_groupId);
      props.put("zookeeper.session.timeout.ms", "400");
      props.put("zookeeper.sync.time.ms", "200");
      props.put("auto.commit.interval.ms", "1000");

      return new ConsumerConfig(props);
   }

//   public static void main(String[] args) {
//      String zooKeeper = args[0];
//      String groupId = args[1];
//      String topic = args[2];
//      int threads = Integer.parseInt(args[3]);
//
//      MQConsumerGroup example = new MQConsumerGroup(zooKeeper, groupId, topic);
//      example.run(threads);
//
//      try {
//         Thread.sleep(10000);
//      } catch (InterruptedException ie) {
//
//      }
//      example.shutdown();
//   }
}