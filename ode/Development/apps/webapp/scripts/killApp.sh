yarn application -kill $1
sudo -u hdfs hadoop fs -rm -r -f -skipTrash /app-logs/root/logs/$1 /user/root/.sparkStaging/$1

