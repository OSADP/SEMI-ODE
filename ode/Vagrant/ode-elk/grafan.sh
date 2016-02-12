#!/bin/sh
sudo apt-get update
sudo DEBIAN_FRONTEND=noninteractive apt-get -q -y --force-yes install graphite-carbon
echo "CARBON_CACHE_ENABLED=true" | sudo tee /etc/default/graphite-carbon

sudo service carbon-cache start

sudo apt-get install -y graphite-web apache2 apache2-mpm-worker libapache2-mod-wsgi
# Prepare and migrate the SQLite database
sudo chown _graphite /var/lib/graphite
sudo -u _graphite graphite-manage syncdb --noinput	
# Configure httpd
sudo rm -f /etc/apache2/sites-enabled/000-default.conf
sudo cp /usr/share/graphite-web/apache2-graphite.conf /etc/apache2/sites-enabled/graphite.conf
sudo service apache2 restart

#sudo rm -f /etc/apache2/sites-enabled/000-default.conf
#sudo cp /usr/share/graphite-web/apache2-graphite.conf /etc/apache2/sites-enabled/graphite.conf
#sudo service apache2 restart
## Install on and start grafana on Port 3000

sudo wget https://grafanarel.s3.amazonaws.com/builds/grafana_2.0.2_amd64.deb
sudo apt-get install -y adduser libfontconfig
sudo dpkg -i grafana_2.0.2_amd64.deb
sudo service grafana-server start

sudo service apache2 restart
#echo "alias /grafana /usr/share/grafana" | sudo tee /etc/apache2/sites-enabled/grafana.conf
# sudo apt-get install collectd 


