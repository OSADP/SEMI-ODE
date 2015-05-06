#!/bin/sh
sudo apt-get install -y graphite-carbon
echo "CARBON_CACHE_ENABLED=true" > /etc/default/graphite-carbon

service carbon-cache start

apt-get install -y graphite-web apache2 apache2-mpm-worker libapache2-mod-wsgi

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

sudo wget https://grafanarel.s3.amazonaws.com/builds/grafana_2.0.2_amd64.deb
sudo apt-get install -y adduser libfontconfig
sudo dpkg -i grafana_2.0.2_amd64.deb

sudo echo "alias /grafana /usr/share/grafana" > /etc/apache2/sites-enabled/grafana.conf

sudo service apache2 restart
