# Prepare Hadoop server prior to ambari agent install 


echo "Disabling firewall"
sudo service iptables stop
sudo chkconfig iptables off
setenforce 0
echo "Turned off SE Linux"
echo "" 
echo "Install and turn on NTP"
sudo yum install -y ntp  &&  chkconfig ntpd on 		
sudo service ntdp start	
#echo "Install Nano" # not needed as servers have vi
#sudo yum install -y nano
