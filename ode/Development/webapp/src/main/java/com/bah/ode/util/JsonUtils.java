/*******************************************************************************
 * Copyright (c) 2015 US DOT - Joint Program Office
 *
 * The Government has unlimited rights to all documents/material produced under 
 * this task order. All documents and materials, to include the source code of 
 * any software produced under this contract, shall be Government owned and the 
 * property of the Government with all rights and privileges of ownership/copyright 
 * belonging exclusively to the Government. These documents and materials may 
 * not be used or sold by the Contractor without written permission from the CO.
 * All materials supplied to the Government shall be the sole property of the 
 * Government and may not be used for any other purpose. This right does not 
 * abrogate any other Government rights.
 *
 * Contributors:
 *     Booz | Allen | Hamilton - initial API and implementation
 *******************************************************************************/
package com.bah.ode.util;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class JsonUtils {
   
//   private static Gson gson = new Gson();
   private static ObjectMapper mapper = new ObjectMapper();
   
   public static String toJson(Object o) {

      // convert java object to JSON format,
      // and returned as JSON formatted string
//      return gson.toJson(o);
      String json = null;
      try {
         json = mapper.writeValueAsString(o);
      } catch (JsonProcessingException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      return json;
   }

   public static Object fromJson(String s, Class<?> clazz) {
//      return gson.fromJson(s, clazz);
      Object o = null;
      try {
         o = mapper.readValue(s, clazz);
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      return o;
   }
   
   public static String newJson(String key, Object value) {
   	return newObjectNode(key, value).toString();
   }

   public static ObjectNode newObjectNode(String key, Object value) {
      
//    JsonObject json = new JsonObject();
//    
//    json.add(key, gson.toJsonTree(value));

      ObjectNode json = mapper.createObjectNode();
      json.putPOJO(key, value);
      return json;
   }
   
   public static ObjectNode addNode(ObjectNode tree, String fieldName, Object fieldValue) {
      tree.putPOJO(fieldName, fieldValue);
      return tree;
   }
   
   public static String getJson(String tree, String fieldName) {
      String node = null;
      try {
         JsonNode jsonNode = mapper.readTree(tree);
         node = jsonNode.get(fieldName).toString();
         
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      return node;
   }

   public static ObjectNode newNode() {
      return mapper.createObjectNode();
   }

   public static JsonNode toJsonNode(String tree) {
      JsonNode jsonNode = null;
      try {
         jsonNode = mapper.readTree(tree);
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      return jsonNode;
   }
}
