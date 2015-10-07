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

public abstract class OdeMsgPayload extends OdeMessage {
   private static final long serialVersionUID = -7711340868799607662L;
   private String  dataType;

   
   public OdeMsgPayload() {
      super();
      setDataType();
   }

   protected abstract void setDataType();
   
   public String getDataType() {
      return dataType;
   }

   public OdeMsgPayload setDataType(OdeDataType dataType) {
      this.dataType = dataType.getShortName();
      return this;
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((dataType == null) ? 0 : dataType.hashCode());
      return result;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      OdeMsgPayload other = (OdeMsgPayload) obj;
      if (dataType == null) {
         if (other.dataType != null)
            return false;
      } else if (!dataType.equals(other.dataType))
         return false;
      return true;
   }
}
