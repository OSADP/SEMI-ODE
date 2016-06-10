#!/usr/bin/env bash

set -e       # Exit script on error
set -x      # Print commands and arguments

echo ""
echo "Done with Spark Install"
echo "Disabling firewall"
#sudo service iptables stop
#sudo chkconfig iptables off
sudo service firewalld stop
sudo chkconfig firewalld off
setenforce 0 
echo "Turned off SE Linux"
echo "" 
echo "Install and turn on NTP"
sudo yum install -y ntp  &&  chkconfig ntpd on
sudo service ntpd start
echo "Install Nano"
sudo yum install -y nano
echo "Update Open SSL Library"
sudo yum upgrade -y openssl  

sudo cat /ode-common/public_key.txt >> /home/vagrant/.ssh/authorized_keys
#echo "Install ambari Repo"
#cd /etc/yum.repos.d && sudo curl -O http://public-repo-1.hortonworks.com/ambari/centos6/1.x/updates/1.7.0/ambari.repo
#echo "install Ambari Package"
#sudo yum install -y ambari-server 
#echo "Running Ambari Setup Script"
#sudo ambari-server setup --silent
#sudo ambari-server start
#echo "Ambari Server Setup Complete"

