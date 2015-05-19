#!/usr/bin/env bash

set -e       # Exit script on error
#set -x      # Print commands and arguments


echo "Install Ambari Repo"
cd /etc/yum.repos.d && sudo curl -O  http://public-repo-1.hortonworks.com/ambari/centos6/2.x/updates/2.0.0/ambari.repo
echo "install Ambari Package"
sudo yum install -y ambari-server 
echo "Running Ambari Setup Script"
sudo ambari-server setup 
#sudo ambari-server setup --silent
#sudo ambari-server start
echo "Ambari Server Setup Complete"
echo "To start, run 'ambari-server start' "