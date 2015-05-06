#!/usr/bin/env bash
#
# Installs Bitnami Liferay
# default username is user@liferay.commands
# default Password is test
#
#
set -e       # Exit script on error
#set -x      # Print commands and arguments


echo ""
echo "Starting Bitnami Liferay installation and configuration script"
file=/vagrant/bitnami-liferay-6.2-6-linux-x64-installer.run
if [ ! -e "$file" 	]; then
	echo "Downloading Liferay install file"
	cd /vagrant
	wget --no-check-certificate https://bitnami.com/redirect/to/48549/bitnami-liferay-6.2-6-linux-x64-installer.run
else
	echo "Installing file found on disk."
fi
sudo /vagrant/bitnami-liferay-6.2-6-linux-x64-installer.run --mode unattended  --base_password test --prefix /opt/bitnami
echo ""
