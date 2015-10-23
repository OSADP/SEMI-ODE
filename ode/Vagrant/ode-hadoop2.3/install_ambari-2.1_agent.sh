#!/usr/bin/env bash

set -e       # Exit script on error
set -x      # Print commands and arguments

yum install -y wget 
sudo wget -nv http://public-repo-1.hortonworks.com/ambari/centos7/2.x/updates/2.1.0/ambari.repo -O /etc/yum.repos.d/ambari.repo
sudo yum install -y ambari-agent

# Setup correct file ownership
ambari_agent=/etc/ambari-agent/conf/ambari-agent.ini
#sudo sed -i 's/hostname=.*/hostname=ambari-server.local/g' $ambari_agent
sudo chkconfig ambari-agent on
sudo ambari-agent start