#!/usr/bin/env bash
#
# Installs Bitnami Liferay
# default username is user@liferay.commands
# default Password is test
#
#
set -e       # Exit script on error
set -x      # Print commands and arguments


echo ""
echo "updating Liferay Config Files"
sudo cp /ode-config/Bitnami-Liferay/apache-tomcat/conf/server.xml /opt/bitnami/apache-tomcat/conf/server.xml
sudo cp /ode-config/Bitnami-Liferay/apache-tomcat/bin/setenv.sh /opt/bitnami/apache-tomcat/bin/setenv.sh
sudo cp /ode-config/Bitnami-Liferay/apps/liferay/conf/httpd-app.conf /opt/bitnami/apps/liferay/conf/httpd-app.conf
sudo /opt/bitnami/ctlscript.sh restart 