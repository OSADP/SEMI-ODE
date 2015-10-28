#!/bin/bash
set -e       # Exit script on error
set -x       # Print commands and arguments


sudo su hdfs -c 'hadoop fs -mkdir -p /user/tomcat'
sudo su hdfs -c 'hadoop fs -chown tomcat:hdfs /user/tomcat'
