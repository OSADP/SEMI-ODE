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
package com.bah.ode.api.ws;

import com.bah.ode.model.OdeObject;

public class OdeStatus extends OdeObject {
	private static final long serialVersionUID = -8787345244306039604L;
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
