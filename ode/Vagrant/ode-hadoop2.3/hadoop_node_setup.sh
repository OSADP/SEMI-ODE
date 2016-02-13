#!/usr/bin/env bash

set -e       # Exit script on error
set -x      # Print commands and arguments

echo ""
echo "Done with Spark Install"
echo "Disabling firewall"
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

