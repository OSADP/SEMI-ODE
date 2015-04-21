
import os
from troposphere import Ref, Tags, Template
from troposphere.ec2 import NetworkAcl, Route, \
    VPCGatewayAttachment, SubnetRouteTableAssociation, Subnet, RouteTable, \
    VPC, NetworkAclEntry, InternetGateway, SecurityGroupRule, SecurityGroup, SecurityGroupIngress

t = Template()

ref_stack_id = Ref('AWS::StackId')
ref_region = Ref('AWS::Region')
ref_stack_name = Ref('AWS::StackName')
quad_zero_ip = '0.0.0.0/0'

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
        VpcId=Ref(VPC),
        Tags=Tags(
            Application=ref_stack_id)))

public_subnet = t.add_resource(
    Subnet(
        'publicSubnet1',
        CidrBlock='10.0.1.0/24',
        VpcId=Ref(VPC),
        Tags=Tags(
            Name="Public Tools Subnet")))

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
        SubnetId=Ref(public_subnet),
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

# Private Route Table needed only if using
# NAT Instance to provide 'Internet' access
#
# private_route_table = t.add_resource(
#     Route(
#         'privateRoute1',
#         DependsOn='AttachGateway',
#         GatewayId=Ref('InternetGateway'),
#         DestinationCidrBlock='local',
#         RouteTableId=Ref(private_route_Table),
#     ))
#
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
                CidrIp=quad_zero_ip),
           SecurityGroupRule(
                IpProtocol='tcp',
                FromPort='80',
                ToPort='80',
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
                CidrIp=quad_zero_ip),
           SecurityGroupRule(               # Spark Web Interface
                IpProtocol='tcp',
                FromPort='8081',
                ToPort='8081',
                CidrIp=quad_zero_ip),
        ],
    ))

'''
 Necessary to create separate Security Group Ingress Rule objects to avoid
 circular references errors ( which are not caught during template validation )
 Allow all TCP, ICMP and UDP traffic  within  Hadoop Cluster SG
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

json_path = os.path.join('..','ODE_cfn_vpc_template.json')
with open(json_path, 'w') as f:
    f.write(t.to_json(indent=2))
print ('DONE')
