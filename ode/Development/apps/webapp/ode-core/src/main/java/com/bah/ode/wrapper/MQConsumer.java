package com.bah.ode.wrapper;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

import kafka.consumer.ConsumerIterator;
import kafka.consumer.KafkaStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.util.JsonUtils;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MQConsumer<K, V, R> implements Callable<Object> {

	private static Logger logger = LoggerFactory.getLogger(MQConsumer.class);

	private KafkaStream<K, V> m_stream;
	private int m_threadNumber;
	private DataProcessor<V, R> processor;

	public MQConsumer(KafkaStream<K, V> a_stream, int a_threadNumber,
			DataProcessor<V, R> a_processor) {
		this.m_threadNumber = a_threadNumber;
		this.m_stream = a_stream;
		this.processor = a_processor;
	}

	@Override
	public Object call() throws Exception {
		ConsumerIterator<K, V> it = m_stream.iterator();

		ArrayList<V> vList = new ArrayList<V>();
		String lastSerialId = null;
		while (it.hasNext()) {
			V msg = it.next().message();
			ObjectNode bundleObject = JsonUtils.toObjectNode(msg.toString());
			String tempSerialId = bundleObject.get("serialId").asText();
			tempSerialId = tempSerialId.substring(0, tempSerialId.length()-2);

			if(lastSerialId == null)
				lastSerialId = tempSerialId;

			if(tempSerialId.equals(lastSerialId)){
				vList.add(msg);
			}else{
				BatchSend batchSender = new BatchSend(vList);
				Thread t = new Thread(batchSender);
				t.start();
				vList.clear();
				lastSerialId = tempSerialId;
				vList.add(msg);
			}
		}

		logger.info("Shutting down Thread: " + m_threadNumber);
		return null;
	}

	public class BatchSend implements Runnable {

		private final ArrayList<V> vList;

		@SuppressWarnings("unchecked")
		public BatchSend(ArrayList<V> vList) {
			this.vList = (ArrayList<V>) vList.clone();
		}

		public void run() {
			try{
				for(int i = 0; i < vList.size(); i ++){
					for( V msg : vList ){
						ObjectNode vObject = JsonUtils.toObjectNode(msg.toString());
						String sId = vObject.get("serialId").asText();
						int placing = Integer.parseInt(sId.substring(sId.length()-1));
						if(placing == i){
							processor.process(msg);
						}

					}
				}
			}catch(Exception e){
				logger.info("Error SENDING " + e.getMessage());
			}
		}
	}

}
