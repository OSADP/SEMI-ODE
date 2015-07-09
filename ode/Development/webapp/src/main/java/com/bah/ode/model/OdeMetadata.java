package com.bah.ode.model;

import com.bah.ode.wrapper.MQTopic;

public class OdeMetadata extends OdeObject {
   private static final long serialVersionUID = 7892898609083630517L;

   private MQTopic inputTopic;
   private MQTopic outputTopic;
   
   public MQTopic getInputTopic() {
      return inputTopic;
   }
   public OdeMetadata setInputTopic(MQTopic inputTopic) {
      this.inputTopic = inputTopic;
      return this;
   }
   public MQTopic getOutputTopic() {
      return outputTopic;
   }
   public OdeMetadata setOutputTopic(MQTopic outputTopic) {
      this.outputTopic = outputTopic;
      return this;
   }
   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result
            + ((inputTopic == null) ? 0 : inputTopic.hashCode());
      result = prime * result
            + ((outputTopic == null) ? 0 : outputTopic.hashCode());
      return result;
   }
   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      OdeMetadata other = (OdeMetadata) obj;
      if (inputTopic == null) {
         if (other.inputTopic != null)
            return false;
      } else if (!inputTopic.equals(other.inputTopic))
         return false;
      if (outputTopic == null) {
         if (other.outputTopic != null)
            return false;
      } else if (!outputTopic.equals(other.outputTopic))
         return false;
      return true;
   }

}
