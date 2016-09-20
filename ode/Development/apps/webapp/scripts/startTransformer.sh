#!/usr/bin/env bash
appName=transformer

#SPARK_MASTER=local[2]
SPARK_HOME=/usr/hdp/current/spark-client
ODE_HOME=/data/opt/bitnami/apache-tomcat/webapps/ode
SPARK_MASTER=spark://ip-10-0-8-111.ec2.internal:7077
className=com.bah.ode.spark.WrapperVehicleDataTransformer
kafkaConsumerThreads=9
inputTopic=spark.vehicle.$appName.input.topic
zookeeperConnectionString=ip-10-0-16-115.ec2.internal:2181,ip-10-0-16-10.ec2.internal:2181,ip-10-0-16-143.ec2.internal:2181
kafkaBrokers=ip-10-0-16-115.ec2.internal:6667,ip-10-0-16-143.ec2.internal:6667,ip-10-0-16-10.ec2.internal:6667
driverMemory=1G
executorMemory=6G
maxCores=3

echo sudo /usr/hdp/current/spark-client/bin/spark-submit  \
  --name $appName \
  --master $SPARK_MASTER  \
  --deploy-mode client \
  --driver-memory $driverMemory \
  --executor-memory $executorMemory \
  --jars /usr/hdp/current/spark-client/lib/datanucleus-api-jdo-3.2.6.jar,/usr/hdp/current/spark-client/lib/datanucleus-rdbms-3.2.9.jar,/usr/hdp/current/spark-client/lib/spark-assembly-1.3.1.2.3.0.0-2557-hadoop2.7.1.2.3.0.0-2557.jar,/usr/hdp/current/spark-client/lib/datanucleus-core-3.2.10.jar \
  --files ./spark-$appName-metrics.properties \
  --class $className \
  --properties-file ./spark-conf.properties \
  --conf spark.metrics.conf=$SPARK_HOME/conf/spark-$appName-metrics.properties \
  --conf spark.cores.max=$maxCores \
  $ODE_HOME/WEB-INF/lib/ode-spark-0.0.1-SNAPSHOT.jar $kafkaConsumerThreads $inputTopic $zookeeperConnectionString $kafkaBrokers

sudo nohup /usr/hdp/current/spark-client/bin/spark-submit  \
  --name $appName \
  --master $SPARK_MASTER  \
  --deploy-mode client \
  --driver-memory $driverMemory \
  --executor-memory $executorMemory \
  --class $className \
  --properties-file ./spark-conf.properties \
  --conf spark.metrics.conf=$SPARK_HOME/conf/spark-$appName-metrics.properties \
  --conf spark.cores.max=$maxCores \
  $ODE_HOME/WEB-INF/lib/ode-spark-0.0.1-SNAPSHOT.jar $kafkaConsumerThreads $inputTopic $zookeeperConnectionString $kafkaBrokers \
2>&1 1>transformer.log &

tail -f transformer.log


