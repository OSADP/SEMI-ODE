#!/usr/bin/env bash


sudo mkfs -t ext4 /dev/xvdb
mkdir /data
sudo mount /dev/xvdb /data

sudo cp /etc/fstab /etc/fstab.orig
sudo echo "/dev/xvdb       /data   ext4    defaults,nofail        0       2" >> /etc/fstab
lsblk
sudo umount /dev/xvdb
sudo mount -a