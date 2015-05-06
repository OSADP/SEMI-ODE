#!/usr/bin/env bash
#
# installs Bitnami Liferay and spark 1.2.0
#
#
set -e       # Exit script on error
#set -x      # Print commands and arguments

echo "Installing spark 1.2"
file=/ode-common/spark-1.2.0-bin-hadoop1.tgz
if [ ! -e "$file" 	]; then
	echo "Downloading Spark 1.2.0 install file"
	cd /ode-common
	wget --no-check-certificate http://d3kbcqa49mib13.cloudfront.net/spark-1.2.0-bin-hadoop1.tgz
else
	echo "File Already Downloaded. Installing file from disk."
fi
sudo cp /ode-common/spark-1.2.0-bin-hadoop1.tgz /opt/
cd /opt
sudo tar -xvf spark-1.2.0-bin-hadoop1.tgz
sudo ln -s /opt/spark-1.2.0-bin-hadoop1 /opt/spark
sudo rm /opt/spark-1.2.0-bin-hadoop1.tgz
sudo cp /opt/spark/conf/spark-env.sh.template /opt/spark/conf/spark-env.sh
