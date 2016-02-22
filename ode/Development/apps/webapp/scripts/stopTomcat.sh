sudo /data/opt/bitnami/ctlscript.sh stop tomcat
grep '*** Unable to Kill application_' /opt/bitnami/apache-tomcat/logs/catalina.out
