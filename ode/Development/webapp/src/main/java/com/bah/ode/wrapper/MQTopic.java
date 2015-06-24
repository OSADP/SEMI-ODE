package com.bah.ode.wrapper;

import com.bah.ode.model.OdeObject;

public class MQTopic extends OdeObject {

   private static final long serialVersionUID = 2740074498632994276L;
   
   private String name;
   private Integer partitions;

   private MQTopic(String name, Integer partitions) {
      super();
      this.name = name;
      this.partitions = partitions;
   }

   public static MQTopic create(String topicName, Integer partitions) {
/* 
 * For now, we just create a topic name and let the topic be created automatically
 * when the first data item is posted to it. In case we need to create the topic
 * in advance the following code should do the job but it's not been tested.
 * For now, we'll keep it commented out.
 */
//      // Create a ZooKeeper client
//      int sessionTimeoutMs = 10000;
//      int connectionTimeoutMs = 10000;
//      String zkClientUrl = appContext.getParam(AppContext.ZOOKEEPER_CLIENT_URL);
//      ZkClient zkClient = new ZkClient(zkClientUrl);
//      
//      // Create a topic named "myTopic" with 8 partitions and a replication factor of 3
//      int replicationFactor = 3;
//      Properties topicConfig = new Properties();
//      AdminUtils.createTopic(zkClient, topicName, partitions, 
//            replicationFactor, topicConfig);
      return new MQTopic(topicName, partitions);
   }

   public String getName() {
      return name;
   }

   public MQTopic setName(String name) {
      this.name = name;
      return this;
   }

   public Integer getPartitions() {
      return partitions;
   }

   public MQTopic setPartitions(Integer partitions) {
      this.partitions = partitions;
      return this;
   }
}
