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
package com.bah.ode.api.sec;

import javax.xml.bind.DatatypeConverter;

public class SecurityService {

	public static String AUTH_HEADER  ="Authorization";
	public static String INVALID_AUTHENTICATION = "Invalid Authentication Attempt";
	public static String TOKEN_QUERY_PARAM = "token";
	
	/**
    * Decode the basic auth and convert it to array login/password
    * 
    * @param auth
    *           The string encoded authentication
    * @return The login (index 0), the password (index 1)
    */
    public static String[] decode(String auth) {

      // Return if the string is empty or null
      if (auth == null || auth.length() == 0)
         return null;

      // Replacing "Basic THE_BASE_64" to "THE_BASE_64" directly
      auth = auth.replaceFirst("[B|b]asic ", "");

      if (auth == null || auth.length() == 0)
         return null;

      // Decode the Base64 into byte[]
      byte[] decodedBytes = DatatypeConverter.parseBase64Binary(auth);

      // check for plain text in the password. (ugh)

      // If the decode fails in any case
      if (decodedBytes == null || decodedBytes.length == 0) {
         return null;
      }
      // Now we can convert the byte[] into a splitted array :
      // - the first one is login,
      // - the second one password
      return new String(decodedBytes).split(":", 2);
   }
	
}
