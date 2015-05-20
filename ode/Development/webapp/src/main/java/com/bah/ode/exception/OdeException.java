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
package com.bah.ode.exception;

import com.bah.ode.api.ws.OdeStatus;
import com.google.gson.JsonObject;

public class OdeException extends Exception {

	/**
	 * 
	 */
   private static final long serialVersionUID = -4133732677963262764L;
   
   OdeStatus.Code code;
   
   public OdeException() {
      super();
      this.code = OdeStatus.Code.FAILURE;
   }

   public OdeException(Throwable cause) {
      super(cause);
      this.code = OdeStatus.Code.FAILURE;
   }

   public OdeException (String message) {
      super(message);
      this.code = OdeStatus.Code.FAILURE;
   }

   public OdeException (String message, Throwable cause) {
      super(message, cause);
      this.code = OdeStatus.Code.FAILURE;
   }

   public OdeException (OdeStatus.Code code, String message) {
   	super(message);
   	this.code = code;
   }

   public OdeException (OdeStatus.Code code, String message, Throwable cause) {
   	super(message, cause);
   	this.code = code;
   }

   public String toJson() {
   	JsonObject json = new JsonObject();
   	json.addProperty("code", code.name());
   	json.addProperty("message", getMessage());
   	json.addProperty("cause", getCause().toString());
   	return json.toString();
   }
}
