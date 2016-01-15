package com.bah.ode.model;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.bah.ode.util.DateTimeUtils;
import com.fasterxml.jackson.databind.JsonNode;

public class OdeMsgMetadata extends OdeMessage {

   private static final long serialVersionUID = 3979762143291085955L;

   private String payloadType;
   private List<OdePayloadViolation> payloadViolations;
   private Long latency; 
   
   public OdeMsgMetadata(OdeMsgPayload payload) {
      this(payload, null);
   }

   public OdeMsgMetadata(OdeMsgPayload payload, JsonNode violations) {
      this.payloadType = OdeDataType.getByClazz(payload.getClass())
            .getShortName();

      if (violations != null) {
         this.payloadViolations = new ArrayList<OdePayloadViolation>();
         if (violations.isArray()) {
            for (final JsonNode objNode : violations) {
               if (objNode.get("fieldName") != null
                     && objNode.get("validMin") != null
                     && objNode.get("validMax") != null)
                  this.payloadViolations.add(new OdePayloadViolation(
                        objNode.get("fieldName").asText(),
                        objNode.get("validMin").asDouble(),
                        objNode.get("validMax").asDouble()));
            }
         }
      }
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

   public List<OdePayloadViolation> getPayloadViolations() {
      return payloadViolations;
   }

   public OdeMsgMetadata setPayloadViolations(
         List<OdePayloadViolation> violations) {
      this.payloadViolations = violations;
      return this;
   }

   

   public Long getLatency() {
      return latency;
   }

   public void setLatency(Long latency) {
      this.latency = latency;
   }

   public void recordLatency(String timestamp) throws ParseException {
      if (timestamp != null) {
         setLatency(DateTimeUtils.elapsedTime(DateTimeUtils.isoDateTime(timestamp)));
      }
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result
            + ((payloadType == null) ? 0 : payloadType.hashCode());
      result = prime * result
            + ((payloadViolations == null) ? 0 : payloadViolations.hashCode());
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
      if (payloadViolations == null) {
         if (other.payloadViolations != null)
            return false;
      } else if (!payloadViolations.equals(other.payloadViolations))
         return false;
      return true;
   }

}
