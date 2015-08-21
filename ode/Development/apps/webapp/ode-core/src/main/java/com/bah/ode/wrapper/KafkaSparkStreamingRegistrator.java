package com.bah.ode.wrapper;

import org.apache.spark.serializer.KryoRegistrator;

import com.esotericsoftware.kryo.Kryo;

/**
 * We register custom classes with Kryo, see the explanations in the
 * [[http://spark.apache.org/docs/1.1.0/tuning.html#data-serialization Tuning Spark]] guide.
 *
 * "If you don’t register your custom classes, Kryo will still work, but it will have to store the full class name with
 * each object, which is wasteful."
 */
public class KafkaSparkStreamingRegistrator implements KryoRegistrator {

   @Override
   public void registerClasses(Kryo kryo) {
//      // Registers a serializer for any generic Avro records.  The kafka-storm-starter project does not yet include
//      // examples that work on generic Avro records, but we keep this registration for the convenience of our readers.
//      kryo.register(GenericRecord.class, 
//            AvroSerializer.GenericRecordSerializer);
//      // Registers a serializer specifically for the, well, specific Avro record `Tweet`
//      kryo.register(classOf[Tweet], AvroSerializer.SpecificRecordSerializer[Tweet])();
   }

}
