MY_IP=192.168.22.12
curl -u admin:admin -H 'X-Requested-By:ambari' -X POST http://$MY_IP:9080/api/v1/blueprints/test_single_node -d @/vagrant/test_single_node.blueprint.json
curl -u admin:admin -H 'X-Requested-By:abmari' -X POST http://$MY_IP:9080/api/v1/clusters/testCluster -d @/vagrant/test_create_cluster.json