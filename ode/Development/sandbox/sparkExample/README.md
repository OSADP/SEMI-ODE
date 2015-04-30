
Project contains an Spark Streaming example app and a non streaming Spark application. 

The sample run command is how you can execute the JavaNetworkWordCout application  
within a vagrant based Virtual Machine. 

Change the path --jars path and sparkExample.jar path as appropriate for your target system. 

Executables were made with the maven targets of 'clean package'. 
Dependency jar is required or else spark will thrown Class Not Found Errors when executing the example program. 

sudo ./bin/spark-submit \
 --master local[2] \
 --driver-memory 2G \
 --class com.bah.test.org.apache.spark.examples.streaming.JavaNetworkWordCount  \
 --jars /vagrant/target/lib/guava-18.0.jar, \
 /vagrant/target/sparkExample-0.0.1-SNAPSHOT.jar  localhost 9998



In a separate window run the following command: 
 
nc -lk 9998 # to open netcap on console 