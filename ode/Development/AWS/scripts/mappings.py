#!/usr/bin/python
# -*- coding: utf-8 -*-
"""
Contains Mapping values for Servers in ODE VPC

Info on the python library used to generate the script
https://github.com/cloudtools/troposphere

"""

from troposphere import constants

logicalName = 'logicalName'
mapping = 'mapping'

PV64 = 'PV64'
HVM64 = 'HVM64'
HVMG2 = 'HVMG2' # GPU Isntance

AWSInstanceType2Arch = {
    logicalName :'AWSInstanceType2Arch',
    mapping : {
        't1.micro': {'Arch': 'PV64'},
        't2.micro': {'Arch': 'HVM64'},
        't2.small': {'Arch': 'HVM64'},
        't2.medium': {'Arch': 'HVM64'},
        'm1.small': {'Arch': 'PV64'},
        'm1.medium': {'Arch': 'PV64'},
        'm1.large': {'Arch': 'PV64'},
        'm1.xlarge': {'Arch': 'PV64'},
        'm2.xlarge': {'Arch': 'PV64'},
        'm2.2xlarge': {'Arch': 'PV64'},
        'm2.4xlarge': {'Arch': 'PV64'},
        'm3.medium': {'Arch': 'HVM64'},
        'm3.large': {'Arch': 'HVM64'},
        'm3.xlarge': {'Arch': 'HVM64'},
        'm3.2xlarge': {'Arch': 'HVM64'},
        'c1.medium': {'Arch': 'PV64'},
        'c1.xlarge': {'Arch': 'PV64'},
        'c3.large': {'Arch': 'HVM64'},
        'c3.xlarge': {'Arch': 'HVM64'},
        'c3.2xlarge': {'Arch': 'HVM64'},
        'c3.4xlarge': {'Arch': 'HVM64'},
        'c3.8xlarge': {'Arch': 'HVM64'},
        'g2.2xlarge': {'Arch': 'HVMG2'},
        'r3.large': {'Arch': 'HVM64'},
        'r3.xlarge': {'Arch': 'HVM64'},
        'r3.2xlarge': {'Arch': 'HVM64'},
        'r3.4xlarge': {'Arch': 'HVM64'},
        'r3.8xlarge': {'Arch': 'HVM64'},
        'i2.xlarge': {'Arch': 'HVM64'},
        'i2.2xlarge': {'Arch': 'HVM64'},
        'i2.4xlarge': {'Arch': 'HVM64'},
        'i2.8xlarge': {'Arch': 'HVM64'},
        'hi1.4xlarge': {'Arch': 'HVM64'},
        'hs1.8xlarge': {'Arch': 'HVM64'},
        'cr1.8xlarge': {'Arch': 'HVM64'},
        'cc2.8xlarge': {'Arch': 'HVM64'},
    }}

"""
Liferay powered by Bitnami (HVM)
OS Linux/Unix, Ubuntu 14.04
https://aws.amazon.com/marketplace/pp/B00NPHLT1E

"""
AWSRegionArch2AMI = {
    logicalName: 'AWSRegionArch2AMI',
    mapping : {
        constants.US_EAST_1: {'HVM64': 'ami-a0e8eec8'},    # Private AMI Image   #'ami-4e90d426', # Market Place Liferay Public bitnami ubuntu
        constants.US_WEST_2: {'HVM64': 'ami-6df5ac5d'},    # market place image
        constants.US_WEST_1: {'HVM64': 'ami-088b924d'}     # market place image
    }}

"""
 Ambari Server and Hadoop Cluster Images
 OS: CentOS 6 (x86_64) - with Updates HVM
 AWS: https://aws.amazon.com/marketplace/pp/B00NQAYLWO

 CentOS 6 x86_64 (2014_09_29) EBS HVM
 CentOS 6 x86_64 (2014_09_29) EBS HVM-74e73035-3435-48d6-88e0-89cc02ad83ee-ami-a8a117c0.2
"""
centos_65_AWSRegionArch2AMI = {
    logicalName: 'centos65AWSRegionArch2AMI',
    mapping : {
        constants.US_EAST_1: {HVM64: 'ami-c2a818aa'},    # market place image
        constants.US_WEST_1: {HVM64: 'ami-57cfc412'},    # market place image
        constants.US_WEST_2: {HVM64: 'ami-81d092b1'}     # market place image
    }}

"""
 Ubuntu 14.04 Trusty 64 hvm-ssd instances
 ubuntu/images/hvm-ssd/ubuntu-trusty-14.04-amd64-server-20150325

 http://cloud-images.ubuntu.com/locator/

"""
ubuntu_14_AWSRegionArch2AMI = {
    logicalName: 'ubuntu14AWSRegionArch2AMI',
    mapping : {
        constants.US_EAST_1: {HVM64: 'ami-d05e75b8'},
        constants.US_WEST_1: { HVM64: 'ami-df6a8b9b'},
        constants.US_WEST_2: {HVM64: 'ami-5189a661'}
    }}

"""
 Ubuntu Server 12.04 LTS (HVM)
 ubuntu/images/hvm-ssd/ubuntu-precise-12.04-amd64-server-20150127-f4f523b3-d6b3-42a4-82e8-5f264cf4cf91-ami-f2bbff9a.2

http://cloud-images.ubuntu.com/locator/
"""
ubuntu_12_AWSRegionArch2AMI = {
    logicalName: 'ubuntu12AWSRegionArch2AMI',
    mapping : {
        constants.US_EAST_1: {HVM64: 'ami-427a392a'},
        constants.US_WEST_1: { HVM64: 'ami-82bba3c7'},
        constants.US_WEST_2: {HVM64: 'ami-2b471c1b'}
    }}

"""
aws ec2 describe-images --region us-xxxx-n --filter "Name=name,Values=amzn-ami-vpc-nat-hvm-2015*"
-query Images[*].{Name:Name,Arch:Architecture,Description:Description,Id:ImageId,CreationDate:CreationDate,RootVolumeType:RootDeviceType}

Amazon Linux AMI VPC NAT x86_64 HVM
amzn-ami-vpc-nat-hvm-2015.03.0.x86_64-ebs
"""

ami_nat_instanceAWSRegionArch2AMI = {
    logicalName: 'amazonNATInstance',
    mapping :{
            constants.US_EAST_1: {HVM64: 'ami-b0210ed8'},
            constants.US_WEST_1: {HVM64: 'ami-ada746e9'},
            constants.US_WEST_2: {HVM64: 'ami-75ae8245'}
    }}

"""
Instance Mapping Template

AWSRegionArch2AMI = {
    logicalName: 'AWSRegionArch2AMI',
    mapping : {
        'us-east-1': { 'PV64': None,
                      'HVM64': None,
                      'HVMG2': None'},
        'us-west-2': {'PV64': None,
                      'HVM64': None,
                      'HVMG2': None},
        'us-west-1': {'PV64': None,
                      'HVM64': None,
                      'HVMG2': None},
        # 'eu-west-1': {'PV64': 'ami-aa8f28dd',
        #               'HVM64': 'ami-748e2903',
        #               'HVMG2': 'ami-00913777'},
        # 'ap-southeast-1': {'PV64': 'ami-20e1c572',
        #                    'HVM64': 'ami-d6e1c584',
        #                    'HVMG2': 'ami-fabe9aa8'},
        # 'ap-northeast-1': {'PV64': 'ami-21072820',
        #                    'HVM64': 'ami-35072834',
        #                    'HVMG2': 'ami-5dd1ff5c'},
        # 'ap-southeast-2': {'PV64': 'ami-8b4724b1',
        #                    'HVM64': 'ami-fd4724c7',
        #                    'HVMG2': 'ami-e98ae9d3'},
        # 'sa-east-1': {'PV64': 'ami-9d6cc680',
        #               'HVM64': 'ami-956cc688',
        #               'HVMG2': 'NOT_SUPPORTED'},
        # 'cn-north-1': {'PV64': 'ami-a857c591',
        #                'HVM64': 'ami-ac57c595',
        #                'HVMG2': 'NOT_SUPPORTED'},
        # 'eu-central-1': {'PV64': 'ami-a03503bd',
        #                  'HVM64': 'ami-b43503a9',
        #                  'HVMG2': 'ami-b03503ad'},
    }}

"""