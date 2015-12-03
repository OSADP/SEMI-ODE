package com.bah.ode.wrapper;

import java.util.ArrayList;
import java.util.Date;
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
	private boolean hasSent = false;
	private String lastSerialId = null;

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
		while (it.hasNext()) {
			V msg = it.next().message();
			ObjectNode bundleObject = JsonUtils.toObjectNode(msg.toString());
			String tempSerialId = bundleObject.get("serialId").asText();
			if(tempSerialId == null || tempSerialId.equals("")){
				logger.info("No Serial ID");
				processor.process(msg);
			}else{
				String[] test = tempSerialId.split("[^\\w-]+"); /* Non-alphanumerics and hyphen */
				tempSerialId = test[0] + "." + test[1];
				
				if(lastSerialId == null)
					lastSerialId = tempSerialId;
	
				if(tempSerialId.equals(lastSerialId)){
					hasSent = false;
					vList.add(msg);
					new java.util.Timer().schedule( 
							new java.util.TimerTask() {
								@Override
								public void run() {
									if(!hasSent){
										/* Sends the batch after 5 seconds without waiting for the next bundle if it hasn't arrived yet. */
										if(vList.size() != 0){
											BatchSend batchSender = new BatchSend(vList);
											Thread t = new Thread(batchSender);
											t.start();
											vList.clear();
											lastSerialId = null;
										}
									}
								}
							},5000);
				}else{
					/* If it receives the next bundle send */
					hasSent = true;
					BatchSend batchSender = new BatchSend(vList);
					Thread t = new Thread(batchSender);
					t.start();
					vList.clear();
					lastSerialId = tempSerialId;
					vList.add(msg);
				}
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
