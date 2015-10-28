#!/bin/bash
#set -e       # Exit script on error
#set -x       # Print commands and arguments

sudo cp /vagrant/jq /usr/local/sbin

status=$(curl -u admin:admin localhost:9080/api/v1/clusters/testCluster/services/HDFS | jq .ServiceInfo.state)

while [ "$status" != '"STARTED"' ]
	do 
		sleep 30 
		status=$(curl -u admin:admin localhost:9080/api/v1/clusters/testCluster/services/HDFS | jq .ServiceInfo.state)
done
/vagrant/set_tomcat_hdfs.sh


