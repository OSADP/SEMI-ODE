package com.bah.ode.model;

import java.io.Serializable;

public class OdeMsgAndMetadata implements Serializable {
   private static final long serialVersionUID = 9152243091714512036L;
   
   private String payload;
   private String key;
   private OdeMetadata metadata;
   
   public String getPayload() {
      return payload;
   }
   public OdeMsgAndMetadata setPayload(String payload) {
      this.payload = payload;
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
      return true;
   }


}