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
public class OdeRequest extends BaseRequest {
   public enum DataSource {
      SDC, SDW, SDPC, TEST_UPLOAD, DEPOSIT_SDC, DEPOSIT_SDW
   }

   private String id;
   private String dataSource;
   private OdeRequestType requestType;
   private OdeDataType dataType;
   private OdePolyline polyline;

  public String getId() {
      return id;
   }

   public OdeRequest setId(String id) {
      this.id = id;
      return this;
   }

public String getDataSource() {
      return dataSource;
   }

   public OdeRequest setDataSource(String dataSource) {
      this.dataSource = dataSource;
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
      result = prime * result
            + ((dataSource == null) ? 0 : dataSource.hashCode());
      result = prime * result + ((dataType == null) ? 0 : dataType.hashCode());
      result = prime * result + ((id == null) ? 0 : id.hashCode());
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
      if (dataSource == null) {
         if (other.dataSource != null)
            return false;
      } else if (!dataSource.equals(other.dataSource))
         return false;
      if (dataType != other.dataType)
         return false;
      if (id == null) {
         if (other.id != null)
            return false;
      } else if (!id.equals(other.id))
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