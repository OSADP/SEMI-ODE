#!/usr/bin/env bash

set -e       # Exit script on error
set -x      # Print commands and arguments

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
echo "Install Nano"
sudo yum install -y nano
echo "Update Open SSL Library"
sudo yum upgrade -y openssl
echo "Install Perl"
sudo yum install -y perl