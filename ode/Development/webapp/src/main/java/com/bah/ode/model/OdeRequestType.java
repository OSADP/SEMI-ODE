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
package com.bah.ode.model;

import java.util.ArrayList;

public enum OdeRequestType {
   Subscription("sub"), Query("qry"), Test("tst");

   private static final String shortNames = shortNames();
   private final String shortName;

   private OdeRequestType(String shortName) {
      this.shortName = shortName;
   }

   public String getShortName() {
      return shortName;
   }
   
   public static OdeRequestType getByShortName(String shortName) {
      OdeRequestType result = null;
      
      for (OdeRequestType value : OdeRequestType.values()) {
         if (shortName.equals(value.getShortName())) {
            result = value;
            break;
         }
      }
      return result;
   }
   
   public static String shortNames() {
      if (shortNames == null) {
         ArrayList<String> result = new ArrayList<String>();
         
         for (OdeRequestType value : OdeRequestType.values()) {
            result.add(value.getShortName());
         }
         
         return result.toArray().toString();
      }
      return shortNames;
   }
}
