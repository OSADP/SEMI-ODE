package com.bah.ode.model;

public class OdeMsgMetadata extends OdeMessage {

   private static final long serialVersionUID = 3979762143291085955L;
   
   private String payloadType;

   public OdeMsgMetadata(OdeMsgPayload payload) {
      this.payloadType = OdeDataType.getByClazz(payload.getClass()).getShortName();
   }

   public String getPayloadType() {
      return payloadType;
   }

   public OdeMsgMetadata setPayloadType(OdeDataType payloadType) {
      this.payloadType = payloadType.getShortName();
      return this;
   }
   
   public OdeMsgMetadata setPayloadType(String payloadType) {
      this.payloadType = payloadType;
      return this;
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
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
      OdeMsgMetadata other = (OdeMsgMetadata) obj;
      if (payloadType == null) {
         if (other.payloadType != null)
            return false;
      } else if (!payloadType.equals(other.payloadType))
         return false;
      return true;
   }
   
   

}
