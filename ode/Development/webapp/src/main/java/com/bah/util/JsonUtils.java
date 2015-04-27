package com.bah.util;

import com.google.gson.Gson;

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

}
