#!/usr/bin/python
# -*- coding: utf-8 -*-
"""
Generates Cloud Formation Script for ODE

Info on the python library used to generate the script
https://github.com/cloudtools/troposphere

"""

import os
import datetime

from troposphere import Ref, Tags, Template,Parameter,  Base64, FindInMap, GetAtt, Join, Output
from troposphere.ec2 import Instance, NetworkAcl, Route, \
    VPCGatewayAttachment, SubnetRouteTableAssociation, Subnet, RouteTable, \
    VPC, NetworkAclEntry, InternetGateway, SecurityGroupRule, SecurityGroup, SecurityGroupIngress, EIP,\
    EIPAssociation, NetworkInterfaceProperty, Volume,VolumeAttachment

from troposphere import constants

# ODE Specific Resources
import mappings
import user_data
import template_helpers

ref_stack_id = Ref('AWS::StackId')
ref_region = Ref('AWS::Region')
ref_stack_name = Ref('AWS::StackName')
quad_zero_ip = constants.QUAD_ZERO  # '0.0.0.0/0'
bah_office_ip = '128.229.4.2/32'

# IPs for Remote Access
matt_remote_ip = "71.178.48.129/32"

team_members_remote_IP = ["96.255.208.9/32",
                          "108.48.115.235/32",
                          "69.243.9.220/32"]

t = Template()
t.add_description("""\
ODE Cloud Formation Template to create VPC with multiple public and \
private, security groups and route tables. \
Subnet are sized for 250 host each. Template Created: """ + datetime.datetime.now().strftime("%Y-%m-%d %H:%M:%S"))


liferay_instance_type_param = t.add_parameter(Parameter(
    'liferayPortalInstance',
    Type='String',
    Description='Liferay Portal EC2 HVM Instance type',
    Default='c3.large',
    AllowedValues=[
        #'t1.micro',
       # 'm1.small', 'm1.medium', 'm1.large', 'm1.xlarge',      # PV64 Architecutre
        #'m2.xlarge', 'm2.2xlarge', 'm2.4xlarge',
       # 'c1.medium', 'c1.xlarge',                              # PV64 Architecutre
       # 'g2.2xlarge',                                          # PV64 Architecutre
        't2.micro', 't2.small', 't2.medium',
        'm3.medium', 'm3.large', 'm3.xlarge', 'm3.2xlarge',
        'c3.large', 'c3.xlarge', 'c3.2xlarge', 'c3.4xlarge', 'c3.8xlarge',
        'r3.large', 'r3.xlarge', 'r3.2xlarge', 'r3.4xlarge', 'r3.8xlarge',
        'i2.xlarge', 'i2.2xlarge', 'i2.4xlarge', 'i2.8xlarge',
        'hi1.4xlarge',
        'hs1.8xlarge',
        'cr1.8xlarge',
        'cc2.8xlarge',
        'cg1.4xlarge',
    ],
    ConstraintDescription='Must be a valid EC2 instance type.',
))


amazon_NAT_instance_type_param = t.add_parameter(Parameter(
    'amazonNATInstanceType',
    Type='String',
    Description='Amazon NAT Server EC2 Instance type',
    Default='t2.small',
    AllowedValues=[
        't2.micro', 't2.small', 't2.medium',
        'm3.medium', 'm3.large', 'm3.xlarge', 'm3.2xlarge',
        'c3.large', 'c3.xlarge', 'c3.2xlarge', 'c3.4xlarge', 'c3.8xlarge',
    ],
    ConstraintDescription='Must be a valid EC2 instance type.',
))
ssh_key_param = t.add_parameter(Parameter(
    'sshKeyParam',
    Type = 'String',
    Description= 'SSH KeyPair Name used to SSH into Instances',
    ConstraintDescription='Must Not be Empty',
    MinLength=3
))

# Instance Type to architecture type -> HVM64, PV64, etc
t.add_mapping(mappings.AWSInstanceType2Arch[mappings.logicalName],
              mappings.AWSInstanceType2Arch[mappings.mapping])

# Amazon NAT Instance
t.add_mapping(mappings.ami_nat_instanceAWSRegionArch2AMI[mappings.logicalName],
              mappings.ami_nat_instanceAWSRegionArch2AMI[mappings.mapping])

# Alls Servers Centos 7
# Hadoop Cluster and Application Server
t.add_mapping(mappings.centos_7_AWSRegionArch2AMI[mappings.logicalName],
              mappings.centos_7_AWSRegionArch2AMI[mappings.mapping])

VPC = t.add_resource(
    VPC(
        'odeVPC',
        CidrBlock='10.0.0.0/16',
        EnableDnsSupport=True,
        EnableDnsHostnames=True,
        Tags=Tags(
            Name='DEV VPC')))

public_tools_subnet = t.add_resource(
    Subnet(
        'publicToolsSubnet1',
        CidrBlock='10.0.8.0/24',
        MapPublicIpOnLaunch=True,
        VpcId=Ref(VPC),
        Tags=Tags( Name="Public Tools Subnet",
            Application=ref_stack_id)))

public_api_subnet = t.add_resource(
    Subnet(
        'publicSubnet1',
        CidrBlock='10.0.1.0/24',
        MapPublicIpOnLaunch=True,
        VpcId=Ref(VPC),
        Tags=Tags(
            Name="Public API Subnet")))

private_hadoop_subnet = t.add_resource(
    Subnet(
        'privateHadoopSubnet1',
        CidrBlock='10.0.16.0/24',
        VpcId=Ref(VPC),
        Tags=Tags(
            Name="Private Hadoop Subnet1")))

private_database_subnet = t.add_resource(
    Subnet(
        'privateDatabasSubnet1',
        CidrBlock='10.0.32.0/24',
        VpcId=Ref(VPC),
        Tags=Tags(
            Name="Private Database Subnet1")))

internetGateway = t.add_resource(
    InternetGateway(
        'InternetGateway',
        Tags=Tags(
            Application=ref_stack_id)))

gatewayAttachment = t.add_resource(
    VPCGatewayAttachment(
        'AttachGateway',
        VpcId=Ref(VPC),
        InternetGatewayId=Ref(internetGateway)))

routeTable = t.add_resource(
    RouteTable(
        'publicRouteTable',
        VpcId=Ref(VPC),
        Tags=Tags(
            Application=ref_stack_id)))

route = t.add_resource(
    Route(
        'Route',
        DependsOn='AttachGateway',
        GatewayId=Ref('InternetGateway'),
        DestinationCidrBlock=quad_zero_ip,
        RouteTableId=Ref(routeTable),
    ))

t.add_resource(
    SubnetRouteTableAssociation(
        'publicSubnetRouteTableAssoc1',
        SubnetId=Ref(public_api_subnet),
        RouteTableId=Ref(routeTable),
    ))

t.add_resource(
    SubnetRouteTableAssociation(
        'publicToolsSubnetRouteTableAssoc1',
        SubnetId=Ref(public_tools_subnet),
        RouteTableId=Ref(routeTable),
    ))

private_route_Table = t.add_resource(
    RouteTable(
        'privateRouteTable1',
        VpcId=Ref(VPC),
        Tags=Tags(
            Application=ref_stack_id)))


t.add_resource(
    SubnetRouteTableAssociation(
        'privateHadoopRouteAssoc1',
        SubnetId=Ref(private_hadoop_subnet),
        RouteTableId=Ref(private_route_Table),
    ))
t.add_resource(
    SubnetRouteTableAssociation(
        'privateDatabaseRouteAssoc2',
        SubnetId=Ref(private_database_subnet),
        RouteTableId=Ref(private_route_Table),
    ))

#
# Uses Default Route Table
#
# networkAcl=t.add_resource(NetworkAcl(
#     'defaultNACL1',
#     VpcId=Ref(VPC),
#     Tags = Tags(
#         Name="DefaultNACL")
# ))
# inBoundPrivateNetworkAclEntry = t.add_resource(
#     NetworkAclEntry(
#         'InboundHTTPNetworkAclEntry',
#         NetworkAclId=Ref(networkAcl),
#         RuleNumber='100',
#         Protocol='6',
#         PortRange=PortRange(To='80', From='80'),
#         Egress='false',
#         RuleAction='allow',
#         CidrBlock='0.0.0.0/0',
#     ))

public_api_sg = t.add_resource(
    SecurityGroup(
        title='publicAPISG1',
        GroupDescription='Enable Access to the Portal GUI and Rest APIs',
        VpcId=Ref(VPC),
        Tags=Tags(Name='Public Portal Security Group'),
        SecurityGroupIngress=[
            SecurityGroupRule(              # SSH
                IpProtocol='tcp',
                FromPort='22',
                ToPort='22',
                CidrIp=bah_office_ip), # TODO IP address of BAH Office, Home office, Bastion Host etc
            SecurityGroupRule(              # SSH
                IpProtocol='tcp',
                FromPort='22',
                ToPort='22',
                CidrIp=matt_remote_ip),
            SecurityGroupRule(              # SSH
                IpProtocol='tcp',
                FromPort='22',
                ToPort='22',
                CidrIp=team_members_remote_IP[0]),
            SecurityGroupRule(              # SSH
                IpProtocol='tcp',
                FromPort='22',
                ToPort='22',
                CidrIp=team_members_remote_IP[1]),
            SecurityGroupRule(              # SSH
                IpProtocol='tcp',
                FromPort='22',
                ToPort='22',
                CidrIp=team_members_remote_IP[2]),
            SecurityGroupRule(              # Web Interface
                IpProtocol='tcp',
                FromPort='80',
                ToPort='80',
                CidrIp=quad_zero_ip),
            SecurityGroupRule(              # HTTPS Web Interface
                IpProtocol='tcp',
                FromPort='443',
                ToPort='443',
                CidrIp=quad_zero_ip),
            SecurityGroupRule(              # tomcat Web Interface
                IpProtocol='tcp',
                FromPort='8080',
                ToPort='8080',
                CidrIp=bah_office_ip),
            SecurityGroupRule(              # tomcat Web Interface
                IpProtocol='tcp',
                FromPort='8080',
                ToPort='8080',
                CidrIp=matt_remote_ip),
            SecurityGroupRule(              # tomcat Web Interface
                IpProtocol='tcp',
                FromPort='8080',
                ToPort='8080',
                CidrIp=team_members_remote_IP[0]),
            SecurityGroupRule(              # tomcat Web Interface
                IpProtocol='tcp',
                FromPort='8080',
                ToPort='8080',
                CidrIp=team_members_remote_IP[1]),
            SecurityGroupRule(              # tomcat Web Interface
                IpProtocol='tcp',
                FromPort='8080',
                ToPort='8080',
                CidrIp=team_members_remote_IP[2])
        ]
    ))

hadoop_cluser_sg = t.add_resource(
    SecurityGroup(
        title='HadoopClusterSG1',
        GroupDescription='Enable Hadoop Cluster and Ambari services to work',
        VpcId=Ref(VPC),
        Tags=Tags(Name='Hadoop Cluster Security Group'),
        SecurityGroupIngress=[
            SecurityGroupRule(              # SSH
                IpProtocol='tcp',
                FromPort='22',
                ToPort='22',
                CidrIp=bah_office_ip),
             SecurityGroupRule(              # SSH
                IpProtocol='tcp',
                FromPort='22',
                ToPort='22',
                CidrIp=matt_remote_ip),
            SecurityGroupRule(              # SSH
                IpProtocol='tcp',
                FromPort='22',
                ToPort='22',
                CidrIp=team_members_remote_IP[0]),
            SecurityGroupRule(              # SSH
                IpProtocol='tcp',
                FromPort='22',
                ToPort='22',
                CidrIp=team_members_remote_IP[1]),
            SecurityGroupRule(              # SSH
                IpProtocol='tcp',
                FromPort='22',
                ToPort='22',
                CidrIp=team_members_remote_IP[2]),
            SecurityGroupRule(              # Hue web Interface
                IpProtocol='tcp',
                FromPort='8888',
                ToPort='8888',
                CidrIp=quad_zero_ip),
            SecurityGroupRule(              # Spark History Server
                IpProtocol='tcp',
                FromPort='18080',
                ToPort='18080',
                CidrIp=quad_zero_ip),
           SecurityGroupRule(
                IpProtocol='tcp',
                FromPort='7180',
                ToPort='7180',
                CidrIp=quad_zero_ip),
           SecurityGroupRule(               # Ambari Web Interface
                IpProtocol='tcp',
                FromPort='8080',
                ToPort='8080',
                CidrIp=bah_office_ip),
           SecurityGroupRule(               # Ambari Web Interface
                IpProtocol='tcp',
                FromPort='8080',
                ToPort='8080',
                CidrIp=matt_remote_ip),
           SecurityGroupRule(               # Ambari Web Interface
                IpProtocol='tcp',
                FromPort='8080',
                ToPort='8080',
                CidrIp=team_members_remote_IP[0]),
           SecurityGroupRule(               # Ambari Web Interface
                IpProtocol='tcp',
                FromPort='8080',
                ToPort='8080',
                CidrIp=team_members_remote_IP[1]),
           SecurityGroupRule(               # Ambari Web Interface
                IpProtocol='tcp',
                FromPort='8080',
                ToPort='8080',
                CidrIp=team_members_remote_IP[2]),
           # SecurityGroupRule(               # Spark Web Interface
           #      IpProtocol='tcp',
           #      FromPort='8081',
           #      ToPort='8081',
           #      CidrIp=quad_zero_ip),
        ],
    ))




'''
 Necessary to create separate Security Group Ingress Rule objects to avoid
 circular references errors ( which are not caught during template validation )
 Allow all TCP, ICMP and UDP traffic within  Hadoop Cluster SG
'''
# TODO: Develop specific Port list and refine security rules based on protocol port
SecurityGroupIngress(
    'hadoopClusterICPM1',
    template=t,
    IpProtocol='icmp',
    FromPort='-1',
    ToPort='-1',
    GroupId=Ref(hadoop_cluser_sg),
    SourceSecurityGroupId=Ref(hadoop_cluser_sg))

SecurityGroupIngress(
    'hadoopClusterTCP1',
    template=t,
    IpProtocol='tcp',
    ToPort='65535',
    FromPort='0',
    GroupId=Ref(hadoop_cluser_sg),
    SourceSecurityGroupId=Ref(hadoop_cluser_sg))

SecurityGroupIngress(
    'hadoopClusterUDP1',
    template=t,
    IpProtocol='udp',
    ToPort='65535',
    FromPort='0',
    GroupId=Ref(hadoop_cluser_sg),
    SourceSecurityGroupId=Ref(hadoop_cluser_sg))

'''
Allow the Application (Liferay)  Server to communicate with Hadoop Cluster Servers
over All TCP Ports
'''
SecurityGroupIngress(
    'publicClusterTCP1',
    template=t,
    IpProtocol='tcp',
    ToPort='65535',
    FromPort='0',
    GroupId=Ref(hadoop_cluser_sg),
    SourceSecurityGroupId=Ref(public_api_sg))

# TODO NAT Instance Configuration
amazon_nat_instance = t.add_resource(Instance(
    'amazonNATInstance1',
    ImageId=FindInMap(mappings.ami_nat_instanceAWSRegionArch2AMI[mappings.logicalName],
                        ref_region,FindInMap('AWSInstanceType2Arch',Ref(amazon_NAT_instance_type_param),'Arch')),
    InstanceType=Ref(amazon_NAT_instance_type_param),
    KeyName=Ref(ssh_key_param),
    SourceDestCheck=False,
    Tags=Tags(Name="NAT Server",),
    NetworkInterfaces=[
        NetworkInterfaceProperty(
            GroupSet=[Ref(hadoop_cluser_sg),Ref(public_api_sg)],
            AssociatePublicIpAddress='true',
            DeviceIndex='0',
            DeleteOnTermination='true',
            SubnetId=Ref(public_api_subnet))
    ],
    # SecurityGroupIds=[Ref(hadoop_cluser_sg), Ref(pulic_api_sg)],
    # SubnetId=Ref(public_api_subnet),
    DependsOn=internetGateway.title
    ))


# Private Route Table needed only if using
# NAT Instance to provide 'Internet' access

private_route_table = t.add_resource(
    Route(
        'privateInternetRoute1',
        DependsOn='AttachGateway',
        InstanceId = Ref(amazon_nat_instance),
        DestinationCidrBlock=quad_zero_ip,
        RouteTableId=Ref(private_route_Table),
    ))

# TODO Hadoop Cluster Configuration

hadoop_cluster_ambari = t.add_resource(Instance(
     "hadoopAmbariServer1",
    ImageId= FindInMap(mappings.centos_7_AWSRegionArch2AMI[mappings.logicalName], ref_region,
                       FindInMap('AWSInstanceType2Arch',constants.M3_MEDIUM,'Arch')),
    InstanceType=constants.M3_MEDIUM,
    KeyName=Ref(ssh_key_param),
    UserData=user_data.install_ambari_server(),
    NetworkInterfaces=[
        NetworkInterfaceProperty(
            GroupSet=[Ref(hadoop_cluser_sg)],
            AssociatePublicIpAddress='true',
            DeviceIndex='0',
            DeleteOnTermination='true',
            SubnetId=Ref(public_tools_subnet))
    ],
    Tags=Tags(Name="Ambari Server",Role="Hadoop Cluster"),
    DependsOn=amazon_nat_instance.title
    ))

hadoop_master1= t.add_resource(Instance(
     "hadoopMasterServer1",
    ImageId= FindInMap(mappings.centos_7_AWSRegionArch2AMI[mappings.logicalName], ref_region,
                       FindInMap('AWSInstanceType2Arch',constants.M3_LARGE,'Arch')),
    InstanceType=constants.M3_LARGE,
    KeyName=Ref(ssh_key_param),
    UserData=user_data.hadoop_work_node_userData(hadoop_cluster_ambari),
    NetworkInterfaces=[
        NetworkInterfaceProperty(
            GroupSet=[Ref(hadoop_cluser_sg)],
          #  AssociatePublicIpAddress='true',
            DeviceIndex='0',
            DeleteOnTermination='true',
            SubnetId=Ref(private_hadoop_subnet) )
    ],
    Tags=Tags(Name="Hadoop Master Server",Role="Hadoop Cluster"),
    DependsOn=hadoop_cluster_ambari.title
    ))

hadoop_master2= t.add_resource(Instance(
    "hadoopMasterServer2",
    ImageId= FindInMap(mappings.centos_7_AWSRegionArch2AMI[mappings.logicalName], ref_region,
                       FindInMap('AWSInstanceType2Arch',constants.M3_LARGE,'Arch')),
    InstanceType=constants.M3_LARGE,
    KeyName=Ref(ssh_key_param),
    UserData=user_data.hadoop_work_node_userData(hadoop_cluster_ambari),
    NetworkInterfaces=[
        NetworkInterfaceProperty(
            GroupSet=[Ref(hadoop_cluser_sg)],
          #  AssociatePublicIpAddress='true',
            DeviceIndex='0',
            DeleteOnTermination='true',
            SubnetId=Ref(private_hadoop_subnet) )
    ],
    Tags=Tags(Name="Hadoop Master Server",Role="Hadoop Cluster"),
    DependsOn=hadoop_cluster_ambari.title
    ))

hadoop_node_1 = t.add_resource(Instance(
     "hadoopNode1",
    ImageId= FindInMap(mappings.centos_7_AWSRegionArch2AMI[mappings.logicalName], ref_region,
                       FindInMap('AWSInstanceType2Arch',constants.M3_MEDIUM,'Arch')),
    InstanceType=constants.M3_MEDIUM,
    KeyName=Ref(ssh_key_param),
    UserData=user_data.hadoop_work_node_userData(hadoop_cluster_ambari),
    NetworkInterfaces=[
        NetworkInterfaceProperty(
            GroupSet=[Ref(hadoop_cluser_sg)],
          #  AssociatePublicIpAddress='true',
            DeviceIndex='0',
            DeleteOnTermination='true',
            SubnetId=Ref(private_hadoop_subnet) )
    ],
    Tags=Tags(Name="Hadoop Node Server",Role="Hadoop Cluster"),
    DependsOn=hadoop_cluster_ambari.title
    ))

hadoop_node_2 = t.add_resource(Instance(
     "hadoopNode2",
    ImageId= FindInMap(mappings.centos_7_AWSRegionArch2AMI[mappings.logicalName], ref_region,
                       FindInMap('AWSInstanceType2Arch',constants.M3_MEDIUM,'Arch')),
    InstanceType=constants.M3_MEDIUM,
    KeyName=Ref(ssh_key_param),
    UserData=user_data.hadoop_work_node_userData(hadoop_cluster_ambari),
    NetworkInterfaces=[
        NetworkInterfaceProperty(
            GroupSet=[Ref(hadoop_cluser_sg)],
          #  AssociatePublicIpAddress='true',
            DeviceIndex='0',
            DeleteOnTermination='true',
            SubnetId=Ref(private_hadoop_subnet) )
    ],
    Tags=Tags(Name="Hadoop Node Server",Role="Hadoop Cluster"),
    DependsOn=hadoop_cluster_ambari.title
    ))

hadoop_node_3 = t.add_resource(Instance(
     "hadoopNode3",
    ImageId= FindInMap(mappings.centos_7_AWSRegionArch2AMI[mappings.logicalName], ref_region,
                       FindInMap('AWSInstanceType2Arch',constants.M3_MEDIUM,'Arch')),
    InstanceType=constants.M3_MEDIUM,
    KeyName=Ref(ssh_key_param),
    UserData=user_data.hadoop_work_node_userData(hadoop_cluster_ambari),
    NetworkInterfaces=[
        NetworkInterfaceProperty(
            GroupSet=[Ref(hadoop_cluser_sg)],
          #  AssociatePublicIpAddress='true',
            DeviceIndex='0',
            DeleteOnTermination='true',
            SubnetId=Ref(private_hadoop_subnet) )
    ],
    Tags=Tags(Name="Hadoop Node Server",Role="Hadoop Cluster"),
    DependsOn=hadoop_cluster_ambari.title
    ))
'''
hadoop_node_4 = t.add_resource(Instance(
     "hadoopNode4",
    ImageId= FindInMap(mappings.centos_7_AWSRegionArch2AMI[mappings.logicalName], ref_region,
                       FindInMap('AWSInstanceType2Arch',constants.M3_MEDIUM,'Arch')),
    InstanceType=constants.M3_MEDIUM,
    KeyName=Ref(ssh_key_param),
    UserData=user_data.hadoop_work_node_userData(hadoop_cluster_ambari),
    NetworkInterfaces=[
        NetworkInterfaceProperty(
            GroupSet=[Ref(hadoop_cluser_sg)],
          #  AssociatePublicIpAddress='true',
            DeviceIndex='0',
            DeleteOnTermination='true',
            SubnetId=Ref(private_hadoop_subnet) )
    ],
    Tags=Tags(Name="Hadoop Node Server",Role="Hadoop Cluster"),
    DependsOn=hadoop_cluster_ambari.title
    ))

hadoop_node_5 = t.add_resource(Instance(
     "hadoopNode5",
    ImageId=FindInMap(mappings.centos_7_AWSRegionArch2AMI[mappings.logicalName], ref_region,
                       FindInMap('AWSInstanceType2Arch',constants.M3_MEDIUM,'Arch')),
    InstanceType=constants.M3_MEDIUM,
    KeyName=Ref(ssh_key_param),
    UserData=user_data.hadoop_work_node_userData(hadoop_cluster_ambari),
    NetworkInterfaces=[
        NetworkInterfaceProperty(
            GroupSet=[Ref(hadoop_cluser_sg)],
          #  AssociatePublicIpAddress='true',
            DeviceIndex='0',
            DeleteOnTermination='true',
            SubnetId=Ref(private_hadoop_subnet) )
    ],
    Tags=Tags(Name="Hadoop Node Server",Role="Hadoop Cluster"),
    DependsOn=hadoop_cluster_ambari.title
    ))
'''
# TODO Liferay  Configure Instance

liferay_ec2_instance = t.add_resource(Instance(
    "liferayInstance1",
    ImageId=FindInMap(mappings.centos_7_AWSRegionArch2AMI[mappings.logicalName], ref_region,
                       FindInMap('AWSInstanceType2Arch',Ref(liferay_instance_type_param),'Arch')),

    InstanceType = Ref(liferay_instance_type_param),
    KeyName=Ref(ssh_key_param),
    UserData=user_data.hadoop_work_node_userData(hadoop_cluster_ambari),
    NetworkInterfaces=[
        NetworkInterfaceProperty(
            GroupSet=[Ref(public_api_sg)],
            AssociatePublicIpAddress='true',
            DeviceIndex='0',
            DeleteOnTermination='true',
            SubnetId=Ref(public_api_subnet) )
    ],
    Tags=Tags(Name="Liferay Portal Server",),
    DependsOn=internetGateway.title
))

# Attaches volume to instance.
# Default Volume size 20GB
# Default Mount Point is /dev/xvdb
template_helpers.create_and_attach_volume(t,"Volume1", hadoop_cluster_ambari,Size="20")
template_helpers.create_and_attach_volume(t,"Volume1", hadoop_master1, Size="15")   #Size='10')
template_helpers.create_and_attach_volume(t,"Volume1", hadoop_master2, Size="15")   #,Size=30)
template_helpers.create_and_attach_volume(t,"Volume1", hadoop_node_1, Size="15")    #,Size=20)
template_helpers.create_and_attach_volume(t,"Volume1", hadoop_node_2, Size="15")    #,Size=20)
template_helpers.create_and_attach_volume(t,"Volume1", hadoop_node_3, Size="15")    #,Size=20)
template_helpers.create_and_attach_volume(t,"Volume1", liferay_ec2_instance, Size="15")
# template_helpers.create_and_attach_volume(t,"Volume1",hadoop_node_4)    #,Size=20)
# template_helpers.create_and_attach_volume(t,"Volume1",hadoop_node_5)    #,Size=20)


# ipAddress = t.add_resource(
#     EIP('IPAddress',
#         DependsOn='AttachGateway',
#         Domain=Ref(VPC),
#         InstanceId=Ref(liferay_ec2_instance)
#         ))

t.add_output(
    [Output('LiferayURL',
            Description='Liferay Server application URL with EIP',
            Value=Join('',
                   ['http://', GetAtt(liferay_ec2_instance.title, 'PublicIp')]) # Would not validate against the aws cli
                                                                                # when using Ref(liferay_ec2_instance)
            ),
    Output('AmbariURL',
           Description='Ambari Server IP address',
           Value=Join('',
                      ['http://',GetAtt(hadoop_cluster_ambari.title, 'PublicIp'),':8080'])
            )
     ]
    )


json_path = os.path.join('..','ODE_cfn_vpc_template_cluster.json')
with open(json_path, 'w') as f:
    f.write(t.to_json(indent=2))
print ('DONE')

import subprocess # Validate with aws commandline tool
subprocess.call("aws cloudformation validate-template --template-body file://{0}".format(json_path))