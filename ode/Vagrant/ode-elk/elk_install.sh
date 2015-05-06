#!/usr/bin/env bash

set -e       # Exit script on error
#set -x      # Print commands and arguments

#echo "Elastic Search Install"

# -k to allow downlaod on bah network 
# due to proxy server certificate

#sudo curl -L -k -O https://download.elasticsearch.org/elasticsearch/elasticsearch/elasticsearch-1.5.2.tar.gz
#sudo tar -xvf elasticsearch-1.5.2.tar.gz

cd  /opt
sudo wget --no-cookies --no-check-certificate --header "Cookie: gpw_e24=http%3A%2F%2Fwww.oracle.com%2F; oraclelicense=accept-securebackup-cookie" "http://download.oracle.com/otn-pub/java/jdk/8u45-b14/jdk-8u45-linux-x64.tar.gz"
sudo tar -xvf jdk-8u45-linux-x64.tar.gz
sudo update-alternatives --install /usr/bin/java java /opt/jdk1.8.0_45/bin/java 11

#sudo /opt/elasticsearch-1.5.2/bin/plugin -install mobz/elasticsearch-head
#sudo /opt/elasticsearch-1.5.2/bin/plugin -install lukas-vlcek/bigdesk

wget -qO - https://packages.elasticsearch.org/GPG-KEY-elasticsearch | sudo apt-key add -
sudo add-apt-repository "deb http://packages.elasticsearch.org/elasticsearch/1.4/debian stable main"
sudo apt-get update && sudo apt-get install elasticsearch
# plugins
sudo /usr/share/elasticsearch/bin/plugin -install lukas-vlcek/bigdesk
sudo /usr/share/elasticsearch/bin/plugin -install mobz/elasticsearch-head
sudo update-rc.d elasticsearch defaults 95 10
sudo cp /vagrant/kibana-4.0.2-linux-x64.tar.gz /opt && cd /opt
sudo tar -xvf kibana-4.0.2-linux-x64.tar.gz
sudo rm kibana-4.0.2-linux-x64.tar.gz

echo ""
echo ""
