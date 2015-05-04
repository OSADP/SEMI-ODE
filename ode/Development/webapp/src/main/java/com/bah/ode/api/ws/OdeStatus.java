package com.bah.ode.api.ws;

import com.bah.ode.model.OdeObject;

public class OdeStatus extends OdeObject {
	public static enum Code {
   	SUCCESS,
   	FAILURE,
   	SOURCE_CONNECTION_ERROR,
   	INVALID_REQUEST_TYPE_ERROR,
   	INVALID_DATA_TYPE_ERROR
	}
	
	Code code;
	String message;
	public OdeStatus() {
	   super();
	   // TODO Auto-generated constructor stub
   }
	public OdeStatus(Code code, String message) {
	   super();
	   this.code = code;
	   this.message = message;
   }
	
	public Code getCode() {
		return code;
	}
	public OdeStatus setCode(Code code) {
		this.code = code;
		return this;
	}
	public String getMessage() {
		return message;
	}
	public OdeStatus setMessage(String message) {
		this.message = message;
		return this;
	}
	
	
}
