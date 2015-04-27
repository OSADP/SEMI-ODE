package com.bah.util;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class JsonUtils {
   
   public static String toJson(Object o) {
      Gson gson = new Gson();

      // convert java object to JSON format,
      // and returned as JSON formatted string
      return gson.toJson(o);

   }

   public static Object fromJson(String s, Class<?> clazz) {
      Gson gson = new Gson();

      return gson.fromJson(s, clazz);
   }
   
   public static String toJson(String key, String value) {
   	JsonObject json = new JsonObject();
   	
   	json.addProperty(key, value);
   	
   	return json.toString();
   }

}
