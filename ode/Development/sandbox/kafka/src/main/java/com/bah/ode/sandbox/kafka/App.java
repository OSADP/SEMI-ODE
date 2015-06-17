package com.bah.ode.sandbox.kafka;

import java.util.Date;
import java.util.Properties;
import java.util.Random;

import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;


/**
 * Hello world!
 * Write to Kafka Topic 
 * 
 * Followed by using the tutorial here: 
 * https://cwiki.apache.org/confluence/display/KAFKA/0.8.0+Producer+Example
 * which explain some of the Properties
 * 
 */
public class App 
{
    public static void main( String[] args )
    {
    	long events = Long.parseLong(args[0]);
    	
    	Properties props = new Properties();
    	 
    	// Brokers with Format Host:port,Host:port
    	// Broker info can be found via ambari console
    	props.put("metadata.broker.list", "ip-10-0-16-12.ec2.internal:6667,ip-10-0-16-91.ec2.internal:6667,ip-10-0-16-97.ec2.internal:6667");
    	props.put("serializer.class", "kafka.serializer.StringEncoder");
    	// Partitioner is something we would write if we wanted to create 
    	// topic partitions according to rule 
    	//props.put("partitioner.class", "package com.bah.ode.sandbox.kafka.SimplePartitioner");
    	props.put("request.required.acks", "1");
    	 
    	ProducerConfig config = new ProducerConfig(props);
    	
     	// First Generic is Partition Key
    	// Second Generic is Messasge Type
    	Producer<String, String> producer = new Producer<String, String>(config);
    	
    	// Build random message payload
    	Random rnd = new Random();
    	 

    	
    	for (long nEvents = 0; nEvents < events; nEvents++) { 
	    	long runtime = new Date().getTime();

	    	StringBuilder ip = new StringBuilder();
	    	ip.append("192.168.2."); 
	    	
	    	StringBuilder msg = new StringBuilder();
	    	msg.append(runtime);
	    	msg.append(", www.example.com, ");
	    	
	    	ip.append(rnd.nextInt(255));
	    	
	    	String topic_name = "page_visits";
	    	
	    	KeyedMessage<String, String> data = new KeyedMessage<String, String>(topic_name, ip.toString(),msg.append(ip).toString());
	    	// Print out message in the form of Topic, key, parition key, message
	    	// System.out.println(data.toString());		
	    	producer.send(data);
    	}
    	
    	producer.close();
    }
}
