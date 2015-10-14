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



@SuppressWarnings("serial")
public abstract class OdeRequest extends BaseRequest {
   private OdeRequestType requestType;
   private OdeDataType dataType;
   private OdePolyline polyline;

   public OdeRequest addSegment(OdeRoadSegment segment) {
      polyline.getSegments().put(segment.getId(), segment);
      return this;
   }
   public OdeRequestType getRequestType() {
      return requestType;
   }

   public OdeRequest setRequestType(OdeRequestType requestType) {
      this.requestType = requestType;
      return this;
   }

   public OdeDataType getDataType() {
      return dataType;
   }

   public OdeRequest setDataType(OdeDataType dataType) {
      this.dataType = dataType;
      return this;
   }

   public OdePolyline getPolyline() {
      return polyline;
   }

   public OdeRequest setPolyline(OdePolyline polyline) {
      this.polyline = polyline;
      return this;
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = super.hashCode();
      result = prime * result + ((dataType == null) ? 0 : dataType.hashCode());
      result = prime * result + ((polyline == null) ? 0 : polyline.hashCode());
      result = prime * result
            + ((requestType == null) ? 0 : requestType.hashCode());
      return result;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (!super.equals(obj))
         return false;
      if (getClass() != obj.getClass())
         return false;
      OdeRequest other = (OdeRequest) obj;
      if (dataType != other.dataType)
         return false;
      if (polyline == null) {
         if (other.polyline != null)
            return false;
      } else if (!polyline.equals(other.polyline))
         return false;
      if (requestType != other.requestType)
         return false;
      return true;
   }

}