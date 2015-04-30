package com.bah.util;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class JsonUtils {
   
   private static Gson gson = new Gson();
   
   public static String toJson(Object o) {

      // convert java object to JSON format,
      // and returned as JSON formatted string
      return gson.toJson(o);

   }

   public static Object fromJson(String s, Class<?> clazz) {
      return gson.fromJson(s, clazz);
   }
   
   public static String toJson(String key, Object value) {
   	
   	JsonObject json = new JsonObject();
   	
   	json.add(key, gson.toJsonTree(value));
   	
   	return json.toString();
   }

}
