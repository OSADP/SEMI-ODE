package com.bah.ode.wrapper;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.*;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.context.AppContext;

import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;

public class MQProducer<K, V> {
	private static Logger logger = LoggerFactory.getLogger(MQProducer.class);

	Producer<K, V> producer;
	String sanitizationTopic;


	public MQProducer (String brokers) {
		//TODO
		/*
		 * Using default encoder for now. We should define a specific encoder
		 * based on the data type.
		 */
		//props.put("serializer.class", "kafka.serializer.StringEncoder");
		//TODO
		/*
		 * Using default partitioned for now. We should define a specific partitioner
		 * based on the data type.
		 */
		// props.put("partitioner.class", "com.bah.ode.wrapper.MQPartitioner");
		this (brokers, "kafka.serializer.StringEncoder", null);

	}

	public MQProducer (String brokers, String encoderClass,
			String partitionerClass) {

		Properties props = new Properties();
		props.put("metadata.broker.list", brokers);
		if (encoderClass != null)
			props.put("serializer.class", encoderClass);

		if (partitionerClass != null)
			props.put("partitioner.class", partitionerClass);

		props.put("request.required.acks", "1");
		props.put("producer.type", "sync");

		ProducerConfig config = new ProducerConfig(props);

		producer = new Producer<K, V>(config);

		sanitizationTopic = "Sanitized-"+AppContext.getInstance().getParam(AppContext.ODE_HOSTNAME);
		logger.info("Sanitization Topic = " +sanitizationTopic);
		logger.info("Producer Created");
	}

	public void send (String topic, K key, V value) {
		KeyedMessage<K, V> data;
		if (key == null)
			data = new KeyedMessage<K, V>(topic, value);
		else
			data = new KeyedMessage<K, V>(topic, key, value);

		producer.send(data);
	}

	public void logSanitizedData(V msg){

		KeyedMessage<K, V> data = new KeyedMessage<K, V>(sanitizationTopic, msg);

		producer.send(data);
	}

	public void shutDown() {
		producer.close();
		logger.info("Producer Closed");
	}

	public Producer<K, V> getProducer() {
		return producer;
	}

	public MQProducer<K, V> setProducer(Producer<K, V> producer) {
		this.producer = producer;
		return this;
	}


}
