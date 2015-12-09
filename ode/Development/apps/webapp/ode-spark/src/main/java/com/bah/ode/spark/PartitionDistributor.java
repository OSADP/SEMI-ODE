package com.bah.ode.spark;

import java.util.Iterator;

import org.apache.spark.api.java.function.VoidFunction;
import org.apache.spark.broadcast.Broadcast;

import scala.Tuple2;

import com.bah.ode.model.InternalDataMessage;
import com.bah.ode.model.OdeData;
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
      
      while (partitionOfRecords.hasNext()) {
         Tuple2<String, Tuple2<String, String>> record = partitionOfRecords.next();
         if(record != null){ /* result of ODE-38 records that are removed are now null */
            String key = record._1();
            String className = JsonUtils.getJsonNode(record._2()._1(), "className").textValue();
            if (className != null) {
               OdeData payload = (OdeData) JsonUtils.fromJson(record._2()._1(), className);
               OdeMetadata metadata = (OdeMetadata) JsonUtils.fromJson(record._2()._2(), OdeMetadata.class);
               InternalDataMessage idm = new InternalDataMessage(key, payload, metadata);
               producer.send(metadata.getOutputTopic().getName(), key, idm.toJson());
            }
         }
      }
      
      producerPool.value().checkIn(producer);
   }

}
