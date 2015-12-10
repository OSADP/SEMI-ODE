package com.bah.ode.model;

import java.io.IOException;

import com.bah.ode.util.JsonUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;


public class OdeDataMessage extends OdeMessage {

   private static final long serialVersionUID = 2319770058057267706L;

   private OdeMsgMetadata metadata;
   private OdeMsgPayload  payload;

   
   public OdeDataMessage() {
      super();
   }

   public OdeDataMessage(OdeMsgPayload payload) {
      super();
      this.metadata = new OdeMsgMetadata(payload);
      this.payload  = payload;
   }
   
   public OdeDataMessage(OdeMsgMetadata metadata, OdeMsgPayload payload) {
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
   public OdeMsgPayload getPayload() {
      return payload;
   }
   public OdeDataMessage setPayload(OdeMsgPayload payload) {
      this.payload = payload;
      return this;
   }
   
   /**
    * @param data - json string representation of an OdeDataMessage object
    * @return ObjectNode representation of the given OdeDataMessage object
    * @throws JsonProcessingException
    * @throws IOException
    * @throws ClassNotFoundException
    */
   public static ObjectNode jsonStringToObjectNode(String data)
         throws JsonProcessingException, IOException, ClassNotFoundException {
      ObjectNode dm = null;
      ObjectNode jsonObject = JsonUtils.toObjectNode(data);
      JsonNode payload = jsonObject.get("payload");
      JsonNode metadata = jsonObject.get("metadata");
      if (payload != null && metadata != null) {
         JsonNode payloadType = metadata.get("payloadType");
         if (payloadType != null)
            dm = jsonObject;
      } else {
         JsonNode className = jsonObject.get("className");
         if (className != null) {
            dm = JsonUtils.newNode();
            dm.putObject("metadata")
                  .put("payloadType", OdeDataType.getByClassName(className.textValue()).getShortName());
            dm.putObject("payload").setAll(jsonObject);
         }
      }
      return dm;
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
