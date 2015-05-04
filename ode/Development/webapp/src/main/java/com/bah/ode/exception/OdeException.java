package com.bah.ode.exception;

import com.bah.ode.api.ws.OdeStatus;
import com.google.gson.JsonObject;

public class OdeException extends Exception {

	/**
	 * 
	 */
   private static final long serialVersionUID = -4133732677963262764L;
   
   OdeStatus.Code code;
   
   public OdeException (OdeStatus.Code code, String message) {
   	super(message);
   	this.code = code;
   }

   public OdeException (OdeStatus.Code code, String message, Throwable cause) {
   	super(message, cause);
   	this.code = code;
   }

   public OdeException (String message) {
   	super(message);
   	this.code = OdeStatus.Code.FAILURE;
   }

   public OdeException (String message, Throwable cause) {
   	super(message, cause);
   	this.code = OdeStatus.Code.FAILURE;
   }

   public String toJson() {
   	JsonObject json = new JsonObject();
   	json.addProperty("code", code.name());
   	json.addProperty("message", getMessage());
   	json.addProperty("cause", getCause().toString());
   	return json.toString();
   }
}
