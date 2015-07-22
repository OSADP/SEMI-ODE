package com.bah.ode.model;


public class OdeMsgAndMetadata extends OdeObject {
   private static final long serialVersionUID = 9152243091714512036L;
   
   private String key;
   private String payloadType;
   private OdeData payload;
   private OdeMetadata metadata;
   
   public String getPayloadType() {
      return payloadType;
   }
   public OdeMsgAndMetadata setPayloadType(String payloadType) {
      this.payloadType = payloadType;
      return this;
   }
   public OdeData getPayload() {
      return payload;
   }
   public OdeMsgAndMetadata setPayload(OdeData payload) {
      this.payload = payload;
      this.payloadType = payload.getClass().getName();
      return this;
   }
   public String getKey() {
      return key;
   }
   public OdeMsgAndMetadata setKey(String key) {
      this.key = key;
      return this;
   }
   public OdeMetadata getMetadata() {
      return metadata;
   }
   public OdeMsgAndMetadata setMetadata(OdeMetadata metadata) {
      this.metadata = metadata;
      return this;
   }
   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((key == null) ? 0 : key.hashCode());
      result = prime * result + ((metadata == null) ? 0 : metadata.hashCode());
      result = prime * result + ((payload == null) ? 0 : payload.hashCode());
      result = prime * result
            + ((payloadType == null) ? 0 : payloadType.hashCode());
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
      OdeMsgAndMetadata other = (OdeMsgAndMetadata) obj;
      if (key == null) {
         if (other.key != null)
            return false;
      } else if (!key.equals(other.key))
         return false;
      if (metadata == null) {
         if (other.metadata != null)
            return false;
      } else if (!metadata.equals(other.metadata))
         return false;
      if (payload == null) {
         if (other.payload != null)
            return false;
      } else if (!payload.equals(other.payload))
         return false;
      if (payloadType == null) {
         if (other.payloadType != null)
            return false;
      } else if (!payloadType.equals(other.payloadType))
         return false;
      return true;
   }
}