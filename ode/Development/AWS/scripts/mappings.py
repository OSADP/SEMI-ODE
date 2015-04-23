#!/usr/bin/python
# -*- coding: utf-8 -*-
"""
Contains Mapping values for ODE VPC

Info on the python library used to generate the script
https://github.com/cloudtools/troposphere

"""
logicalName = 'logicalName'
mapping = 'mapping'

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
Bitnami Liferay Images

https://bitnami.com/stack/liferay/cloud/amazon
"""
AWSRegionArch2AMI = {
    logicalName: 'AWSRegionArch2AMI',
    mapping : {
        'us-east-1': { 'HVM64': 'ami-a0e8eec8', # Private AMI Image   #'ami-4e90d426', # Market Place liferay Public bitnami ubuntu
                       #'PV64': 'ami-50842d38',
                      #'HVMG2': 'ami-3a329952'
                       },
        'us-west-2': { 'HVM64': 'ami-3d80df0d',# market palce place bitnami image
                      #'PV64': 'ami-af86c69f',
                      #'HVMG2': 'ami-47296a77'
                      },
        'us-west-1': { 'HVM64': 'ami-9d0719d8',  # liferay bitnami ubuntu
                      #'PV64': 'ami-c7a8a182',
                      #'HVMG2': 'ami-331b1376'},
                      },
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
AWSRegionArch2AMI = {
    logicalName: 'AWSRegionArch2AMI',
    mapping : {
        'us-east-1': { 'PV64': None
                      'HVM64': None
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