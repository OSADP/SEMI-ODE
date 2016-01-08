package com.bah.ode.spark;

import java.util.Iterator;

import org.apache.spark.api.java.function.VoidFunction;
import org.apache.spark.broadcast.Broadcast;

import scala.Tuple2;

import com.bah.ode.context.AppContext;
import com.bah.ode.model.InternalDataMessage;
import com.bah.ode.model.OdeData;
import com.bah.ode.model.OdeDataType;
import com.bah.ode.model.OdeMetadata;
import com.bah.ode.util.JsonUtils;
import com.bah.ode.wrapper.MQProducer;
import com.bah.ode.wrapper.MQSerialazableProducerPool;

public class PartitionDistributor extends BaseDistributor implements
VoidFunction<Iterator<Tuple2<String, Tuple2<String, String>>>> {

	private static final long serialVersionUID = -5994663995916421920L;

	public PartitionDistributor(Broadcast<MQSerialazableProducerPool> producerPool) {
		super(producerPool);
	}

	@Override
	public void call(Iterator<Tuple2<String, Tuple2<String, String>>> partitionOfRecords)
			throws Exception {
		MQProducer<String, String> producer = producerPool.value().checkOut();

		try {
         while (partitionOfRecords.hasNext()) {
         	Tuple2<String, Tuple2<String, String>> record = partitionOfRecords.next();
         	String key = record._1();
         	if(key.equals("sanitized")){
         		producer.logSanitizedData(record._2()._1());
         	}else{
         		String dataType = JsonUtils.getJsonNode(record._2()._1(), AppContext.DATA_TYPE_STRING).textValue();
         		if (dataType != null) {
         			OdeData payload = (OdeData) JsonUtils.fromJson(record._2()._1(), 
         					OdeDataType.valueOf(dataType).getClazz());
         			OdeMetadata metadata = (OdeMetadata) JsonUtils.fromJson(record._2()._2(), OdeMetadata.class);
         			InternalDataMessage idm = new InternalDataMessage(key, payload, metadata);
         			producer.send(metadata.getOutputTopic().getName(), key, idm.toJson());
         		}
         	}
         }
      } finally {
         producerPool.value().checkIn(producer);
      }

	}

}
