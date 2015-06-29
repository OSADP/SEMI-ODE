package com.bah.ode.wrapper;

public class MQTopicInOut {
   private MQTopic inTopic;
   private MQTopic[] outTopics;
   
   public MQTopicInOut() {
      super();
   }
   
   public MQTopicInOut(MQTopic inTopic, MQTopic... outTopics) {
      super();
      this.inTopic = inTopic;
      this.outTopics = outTopics;
   }
   
   public MQTopic getInTopic() {
      return inTopic;
   }
   public MQTopicInOut setInTopic(MQTopic inTopic) {
      this.inTopic = inTopic;
      return this;
   }
   public MQTopic[] getOutTopics() {
      return outTopics;
   }
   public MQTopicInOut setOutTopics(MQTopic[] outTopics) {
      this.outTopics = outTopics;
      return this;
   }
   
   
}
