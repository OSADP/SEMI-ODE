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
package com.bah.ode.asn;

import com.bah.ode.model.OdeObject;

public class OdeVehicleSize extends OdeObject {
   private static final long serialVersionUID = 7666781221639612933L;

   private Integer width;
   private Integer length;

   public OdeVehicleSize(Integer width, Integer length) {
      super();
      this.width = width;
      this.length = length;
   }

   public Integer getWidth() {
      return width;
   }

   public void setWidth(Integer width) {
      this.width = width;
   }

   public Integer getLength() {
      return length;
   }

   public void setLength(Integer length) {
      this.length = length;
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((length == null) ? 0 : length.hashCode());
      result = prime * result + ((width == null) ? 0 : width.hashCode());
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
      OdeVehicleSize other = (OdeVehicleSize) obj;
      if (length == null) {
         if (other.length != null)
            return false;
      } else if (!length.equals(other.length))
         return false;
      if (width == null) {
         if (other.width != null)
            return false;
      } else if (!width.equals(other.width))
         return false;
      return true;
   }

}
