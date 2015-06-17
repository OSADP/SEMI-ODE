# Example Kafka 'Hello World' application written in Python and Java

# Python
Python applications require the installation of a python library called kafka-python. 
The file ptyhon/requirements.txt specify the correct version of the 3rd party module

## run:
On two different servers run "python kafka-send.py" first, then run "python  kafka-receive.py"
Currently the ODE application server and the Ambari server have the python module installed. 

# Java Appliction

Tutorial created from 
* https://cwiki.apache.org/confluence/display/KAFKA/0.8.0+Producer+Example
* https://cwiki.apache.org/confluence/display/KAFKA/Consumer+Group+Example

Build the java application with maven by using the "clean package" target. 
This will build two sets of artifacts:
* Uber jar with all dependices included
* Application Jar with all dependencies includes in a /libs folder

The two sets of artifacts allow flexbilitiy in deployment where other applications may need need to use the common dependency jars. 

### Producer 
##### Arguments: 
   N: The number of messages to write to the topic

```sh
java -cp kafka-0.0.1-SNAPSHOT.jar  com.bah.ode.sandbox.kafka.App N
```
### Consumer: 
##### Arguments: 
   Zoo_Keeper_IP: Host of one of the Zookeeper Servers  
   Group_Name: Consumer Group Name  
   Topic_Name: Name of topic (For this demo use "page_visits" as that topic name is hard coded in the consumer app)  
   Thread_Count: Number of threads to create of topic reader. Applicable when using partitioned topics   
```sh
java -cp  kafka-0.0.1-SNAPSHOT.jar com.bah.ode.sandbox.kafka.KafkaConsumer Zoo_Keeper_IP Group_Name Topic_Name Thread_Count
```

Working code Example 
```sh
java -cp  kafka-0.0.1-SNAPSHOT.jar com.bah.ode.sandbox.kafka.KafkaConsumer ip-10-0-16-97.ec2.internal:2181 group3 page_visits 1
```

A bash scripted called "kafkaProducerTest.sh" will run the consumer app with the above command for ease of operation 
