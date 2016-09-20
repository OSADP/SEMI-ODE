#!/bin/bash
sudo yum install epel-release -y
sudo yum install -y collectd

sudo mkdir -p /etc/collectd.d
sudo cat << EOF > /etc/collectd.d/graphite.conf
LoadPlugin write_graphite
<Plugin write_graphite>
    <Node "graphing">
        Host "ip-10-0-8-41.ec2.internal"
        Port "2003"
        Protocol "tcp"
        LogSendErrors true
        Prefix "collectd."
        StoreRates true
        AlwaysAppendDS false
        EscapeCharacter "_"
    </Node>
</Plugin>
EOF

sudo cat << EOF > /etc/collectd.d/df_disk.conf
LoadPlugin df
<Plugin df>
#       Device "/dev/xvda1"
#       Device "192.168.0.2:/mnt/nfs"
#       MountPoint "/"
#       FSType "ext3"
       IgnoreSelected true
#       ReportByDevice false
#       ReportReserved false
#       ReportInodes false
#       ValuesAbsolute true
#       ValuesPercentage false
</Plugin>
EOF

sudo service collectd start
sleep  2
sudo audit2allow -a -M collectd_t
sudo  semodule -i collectd_t.pp
sudo service collectd restart
#systemd enable collectd
