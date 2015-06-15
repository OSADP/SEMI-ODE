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
