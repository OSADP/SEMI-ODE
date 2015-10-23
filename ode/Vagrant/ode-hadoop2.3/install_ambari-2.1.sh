#!/usr/bin/env bash

set -e       # Exit script on error
set -x      # Print commands and arguments

sudo wget -nv http://public-repo-1.hortonworks.com/ambari/centos7/2.x/updates/2.1.0/ambari.repo -O /etc/yum.repos.d/ambari.repo

sudo yum install -y ambari-server
sudo echo "client.api.port=9080" >> /etc/ambari-server/conf/ambari.properties
sudo ambari-server setup --silent
sudo ambari-server start
sudo chkconfig ambari-server on  
echo "Ambari Server Setup Complete"