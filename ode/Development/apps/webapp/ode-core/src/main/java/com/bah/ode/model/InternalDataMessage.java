package com.bah.ode.model;

import java.io.IOException;
import java.util.HashMap;

import com.bah.ode.util.JsonUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class InternalDataMessage extends OdeObject {
   private static final long serialVersionUID = 9152243091714512036L;
   
   private String key;
   private String payloadType;
   private OdeMsgPayload payload;
   private OdeMetadata metadata;
   
   public InternalDataMessage() {
      super();
   }
   public InternalDataMessage(String key, OdeMsgPayload payload, OdeMetadata metadata) throws ClassNotFoundException {
      super();
      this.key = key;
      setMetadata(metadata);
      setPayload(payload);
   }
   public String getPayloadType() {
      return payloadType;
   }
   public InternalDataMessage setPayloadType(String payloadType) {
      this.payloadType = payloadType;
      return this;
   }
   public OdeMsgPayload getPayload() {
      return payload;
   }
   public InternalDataMessage setPayload(OdeMsgPayload payload) throws ClassNotFoundException {
      this.payload = payload;
      this.payloadType = OdeDataType.getByClassName(payload.getClassName()).getShortName();
      return this;
   }
   public String getKey() {
      return key;
   }
   public InternalDataMessage setKey(String key) {
      this.key = key;
      return this;
   }
   public OdeMetadata getMetadata() {
      return metadata;
   }
   public InternalDataMessage setMetadata(OdeMetadata metadata) {
      this.metadata = metadata;
      return this;
   }
   
   public static ObjectNode createObjectNodeFromPayload(JsonNode payload, JsonNode payloadType) 
         throws JsonProcessingException, IOException, ClassNotFoundException {
      ObjectNode idm = null;
      if (payload != null && payloadType != null) {
         idm = buildJsonObjectNode(payload, payloadType);
      }
      return idm;
   }
   public static ObjectNode jsonStringToObjectNode(String data)
         throws JsonProcessingException, IOException, ClassNotFoundException {
      ObjectNode idm = null;
      ObjectNode jsonObject = JsonUtils.toObjectNode(data);
      JsonNode payload = jsonObject.get("payload");
      JsonNode payloadType = jsonObject.get("payloadType");
      idm = createObjectNodeFromPayload(payload, payloadType);
      return idm;
   }
   
   private static ObjectNode buildJsonObjectNode(JsonNode payload, JsonNode payloadType)
         throws ClassNotFoundException {
      ObjectNode idm;
      idm = JsonUtils.newNode();
      idm.put("payloadType", payloadType.textValue());
      
      HashMap<String, JsonNode> nodeProps = JsonUtils.jsonNodeToHashMap(payload);
      
      idm.putObject("payload").setAll(nodeProps);
      
      return idm;
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
      InternalDataMessage other = (InternalDataMessage) obj;
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