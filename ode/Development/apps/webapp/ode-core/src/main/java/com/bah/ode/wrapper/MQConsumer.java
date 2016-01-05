package com.bah.ode.wrapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.context.AppContext;
import com.bah.ode.util.JsonUtils;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import kafka.consumer.ConsumerIterator;
import kafka.consumer.KafkaStream;

public class MQConsumer<K, V, R> implements Callable<Object> {

	private static Logger logger = LoggerFactory.getLogger(MQConsumer.class);

	private KafkaStream<K, V> m_stream;
	private int m_threadNumber;
	private DataProcessor<V, R> processor;
	private HashMap<String, ArrayList<V>> records;

	public MQConsumer(KafkaStream<K, V> a_stream, int a_threadNumber,
			DataProcessor<V, R> a_processor) {
		this.m_threadNumber = a_threadNumber;
		this.m_stream = a_stream;
		this.processor = a_processor;
		records = new HashMap<String, ArrayList<V>>();
	}

	@Override
	public Object call() throws Exception {
		ConsumerIterator<K, V> it = m_stream.iterator();


		/**
		 * Sends all received and ordered records every second as a batch
		 * Records sent as map of serialId.bundleId
		 */

		new java.util.Timer().schedule(new java.util.TimerTask() {
			@Override
			public void run() {
				/*
				 * Sends the batch every second without waiting for
				 * the next bundle if it hasn't arrived yet.
				 */
				if (records.size() != 0) {
					try {
						HashMap<String, ArrayList<V>> sendMap = new HashMap<String, ArrayList<V>>(records);
						records.clear();
						Iterator<String> iter = sendMap.keySet().iterator();
						while (iter.hasNext()) {
							String key = iter.next();
							ArrayList<V> vList = sendMap.get(key);
							for (int i = 0; i < vList.size(); i++) {
								V msg = vList.get(i);
								if(msg != null){
									processor.process(msg);
								}
							}
						}
					} catch (Exception e) {
						logger.error("Error Consuming message", e);
					}
				}
			}
		}, 1000, 1000);

		while (it.hasNext()) {
			V msg = it.next().message();
			ObjectNode bundleObject = JsonUtils.toObjectNode(msg.toString());

			JsonNode payloadNode = bundleObject.get(AppContext.PAYLOAD_STRING);
			if (payloadNode == null) {
				processor.process(msg);
			} else {
				JsonNode serialIdNode = payloadNode.get(AppContext.SERIAL_ID_STRING);
				if (serialIdNode == null) {
					processor.process(msg);
				} else {
					String tempSerialId = serialIdNode.asText();
					if (tempSerialId == null || tempSerialId.equals("")) {
						processor.process(msg);
					} else {
						try{
							String[] test = tempSerialId
									.split("[^\\w-]+"); /* Non-alphanumerics and hyphen */
							tempSerialId = test[0] + "." + test[1];
							int index = Integer.parseInt(test[2]);

							/* 
							 * vList is an array with the recordId as the index 
							 * that way there is no need to loop twice through arrays
							 * 
							 * uses map as to not lose records if multiple record Ids
							 * come in scrambled
							 */
							ArrayList<V> vList = records.get(tempSerialId);
							if(vList == null){
								vList = new ArrayList<V>();
								while(index + 1 > vList.size()){
									vList.add(vList.size(), null);
								}
								vList.set(index, msg);
								records.put(tempSerialId, vList);
							}else{
								while(index + 1 > vList.size()){
									vList.add(vList.size(), null);
								}
								records.get(tempSerialId).set(index, msg);
							}
						}catch(Exception e){
							logger.info("ERROR IN CODE : ", e);
						}

					}// End of serial ID is not blank
				}// End of 'has serialId' block
			}// End of 'has payload' block
		}//End of while loop

		logger.info("Shutting down Thread: " + m_threadNumber);
		return null;
	}

	public class BatchSend implements Runnable {

		public synchronized void run() {
		}
	}

}