sudo /data/opt/bitnami/ctlscript.sh stop tomcat
#grep '*** Unable to Kill application_' /opt/bitnami/apache-tomcat/logs/catalina.out
for i in `yarn application -list -appTypes SPARK 2>/dev/null | grep application_ | awk '{print $1}'|tr '\n' ' '` ; do
	yarn application -kill $i 2>nil
done

yarn application -list 2>/dev/null

