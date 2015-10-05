package com.bah.ode.model;

import java.io.IOException;

import javax.websocket.Session;

public class OdeDataMessage extends OdeObject {

   private static final long serialVersionUID = 2319770058057267706L;

   private OdeMsgMetadata metadata;
   private OdePayload     payload;

   
   public OdeDataMessage() {
      super();
   }

   public OdeDataMessage(OdePayload payload) {
      super();
      this.metadata = new OdeMsgMetadata().setPayloadType(payload.getDataType());
      this.payload = payload;
   }
   
   public OdeDataMessage(OdeMsgMetadata metadata, OdePayload payload) {
      super();
      this.metadata = metadata;
      this.payload = payload;
   }
   
   public OdeMsgMetadata getMetadata() {
      return metadata;
   }
   public OdeDataMessage setMetadata(OdeMsgMetadata metadata) {
      this.metadata = metadata;
      return this;
   }
   public OdePayload getPayload() {
      return payload;
   }
   public OdeDataMessage setPayload(OdePayload payload) {
      this.payload = payload;
      return this;
   }
   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
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
      OdeDataMessage other = (OdeDataMessage) obj;
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