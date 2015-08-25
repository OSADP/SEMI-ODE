JAVA_HOME=/usr/jdk64/jdk1.8.0_40
#export CLASSPATH=$CLASSPATH:/usr/hdp/current/hadoop-client/conf
export SPARK_HOME=/usr/hdp/current/spark-client
export HADOOP_CONF_DIR=/usr/hdp/current/hadoop-client/conf
export YARN_CONF_DIR=/usr/hdp/current/hadoop-client/conf
#export CLASSPATH=$CLASSPATH:/usr/hdp/current/zookeeper-client:\
#/usr/hdp/current/tez-client:\
#/usr/hdp/current/spark-client:\
#/usr/hdp/current/hadoop-client:\
#/usr/hdp/current/hadoop-client/conf:\	
#/usr/hdp/current/hadoop-hdfs-client:\
#/usr/hdp/current/hadoop-yarn-client:\
#/usr/hdp/current/hadoop-mapreduce-client

#JAVA_HOME=/opt/bitnami/java
JRE_HOME=$JAVA_HOME
JAVA_OPTS="-Djava.awt.headless=true -XX:+UseG1GC -Dfile.encoding=UTF8 -Duser.timezone=GMT $JAVA_OPTS "
JAVA_OPTS="-XX:MaxPermSize=512M -Xss128M -Xms1024M -Xmx1536M -Dfile.encoding=UTF8 -Duser.timezone=GMT $JAVA_OPTS " # java-memory-settings
export JAVA_HOME
export JRE_HOME
export JAVA_OPTS
  
unset RUBYLIB
