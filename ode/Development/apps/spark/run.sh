#!/usr/bin/env bash

ODE_ARGS='ode  5 {"dataType":"IntersectionData","nwLat":43.652969118285434,"nwLon":-85.94707489013672,"seLat":36.4765153148293,"seLon":-74.53468322753906}'
SPARK_MASTER=local[2]

export LIBDIR="$(cd "`dirname "$0"`"/lib ; pwd -P)"

for i in `ls -a $LIBDIR/*.jar`; do  
  if [ ".$CLASSPATH" == "." ]; then
   CLASSPATH=$i
  else
   CLASSPATH=$CLASSPATH","$i
  fi
done  

if [ ".$1" == ".debug" ]; then
  sudo /usr/hdp/current/spark-client/bin/spark-submit  \
  --master $SPARK_MASTER  \
  --jars $CLASSPATH  \
  --driver-java-options '-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=8001' \
  --class com.bah.ode.main.OdeSparkApp  \
  /home/bitnami/hamid/spark-app/spark-app-0.0.1-SNAPSHOT.jar $ODE_ARGS
else
  echo sudo /usr/hdp/current/spark-client/bin/spark-submit  \
  --master $SPARK_MASTER  \
  --jars $CLASSPATH  \
  --class com.bah.ode.main.OdeSparkApp  \
  /home/bitnami/hamid/spark-app/spark-app-0.0.1-SNAPSHOT.jar $ODE_ARGS
  
  sudo /usr/hdp/current/spark-client/bin/spark-submit  \
  --master $SPARK_MASTER  \
  --jars $CLASSPATH  \
  --class com.bah.ode.main.OdeSparkApp  \
  /home/bitnami/hamid/spark-app/spark-app-0.0.1-SNAPSHOT.jar $ODE_ARGS
fi


