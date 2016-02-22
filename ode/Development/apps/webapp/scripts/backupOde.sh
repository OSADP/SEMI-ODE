backup_dir=/mnt/backup/`date -u --iso-8601=second`
sudo mkdir -p ${backup_dir}
sudo cp -r /data/opt/bitnami/apache-tomcat/webapps/ode.war ${backup_dir}
