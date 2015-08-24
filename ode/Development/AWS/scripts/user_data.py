__author__ = '562474'

from troposphere import Base64, Join, Ref, GetAtt

def hadoop_work_node_userData(instance):

    return Base64(Join('', [
        '#!/bin/bash\n',
        'yum install -y ntp  &&  chkconfig ntpd on\n',
        'service ntpd start\n'
        'yum install -y wget\n',
        'wget -nv http://public-repo-1.hortonworks.com/ambari/centos7/2.x/updates/2.1.0/ambari.repo -O /etc/yum.repos.d/ambari.repo\n'
        'yum install -y ambari-agent\n',
        '# Setup correct file ownership\n',
        'ambari_agent=/etc/ambari-agent/conf/ambari-agent.ini\n',
        "sed -i 's/hostname=.*/hostname=", GetAtt(instance, 'PrivateDnsName'), "/g' $ambari_agent\n",
        'sleep 60 \n',
        'chkconfig ambari-agent on\n'
        'ambari-agent start\n',
        # Format and Mount Drive at
        'mkdir /data\n',
        'mkfs -t ext4 /dev/xvdb\n',
        'mount /dev/xvdb /data\n',
        "echo \"/dev/xvdb' /data ext4 defaults,nofail 0 2\" >> /etc/fstab\n",
        # "service firewalld stop\n"
    ]))

def install_ambari_server():
    return Base64(Join('',[
        '#!/bin/bash\n',
        'yum install -y ntp  &&  chkconfig ntpd on\n',
        'service ntpd start\n',
        'yum install -y wget\n',
        'wget -nv http://public-repo-1.hortonworks.com/ambari/centos7/2.x/updates/2.1.0/ambari.repo -O /etc/yum.repos.d/ambari.repo\n'
        'yum install -y ambari-server\n'
        'ambari-server setup --silent\n',
        'sleep 10\n',
        'chkconfig ambari-server on\n',
        'ambari-server start\n',
        # Format and Mount Drive at
        'mkdir /data\n',
        "mkfs -t ext4 /dev/xvdb\n",
        "mount /dev/xvdb /data\n",
        "echo \"/dev/xvdb' /data ext4 defaults,nofail 0 2\" >> /etc/fstab\n",
        # "service firewalld stop\n"
    ]))


