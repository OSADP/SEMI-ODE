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
public class BaseRequest extends OdeObject {

   private Double nwLat;
   private Double nwLon;
   private Double seLat;
   private Double seLon;
   
   public BaseRequest() {
   	super();
   }
   
	public BaseRequest(Double nwLat, Double nwLon, Double seLat, Double seLon) {
	   super();
	   this.nwLat = nwLat;
	   this.nwLon = nwLon;
	   this.seLat = seLat;
	   this.seLon = seLon;
   }

	static BaseRequest create() {
		return new BaseRequest();
	}
	
	public Double getNwLat() {
		return nwLat;
	}

	public BaseRequest setNwLat(Double nwLat) {
		this.nwLat = nwLat;
		return this;
	}

	public Double getNwLon() {
		return nwLon;
	}

	public BaseRequest setNwLon(Double nwLon) {
		this.nwLon = nwLon;
		return this;
	}

	public Double getSeLat() {
		return seLat;
	}

	public BaseRequest setSeLat(Double seLat) {
		this.seLat = seLat;
		return this;
	}

	public Double getSeLon() {
		return seLon;
	}

	public BaseRequest setSeLon(Double seLon) {
		this.seLon = seLon;
		return this;
	}

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((nwLat == null) ? 0 : nwLat.hashCode());
      result = prime * result + ((nwLon == null) ? 0 : nwLon.hashCode());
      result = prime * result + ((seLat == null) ? 0 : seLat.hashCode());
      result = prime * result + ((seLon == null) ? 0 : seLon.hashCode());
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
      BaseRequest other = (BaseRequest) obj;
      if (nwLat == null) {
         if (other.nwLat != null)
            return false;
      } else if (!nwLat.equals(other.nwLat))
         return false;
      if (nwLon == null) {
         if (other.nwLon != null)
            return false;
      } else if (!nwLon.equals(other.nwLon))
         return false;
      if (seLat == null) {
         if (other.seLat != null)
            return false;
      } else if (!seLat.equals(other.seLat))
         return false;
      if (seLon == null) {
         if (other.seLon != null)
            return false;
      } else if (!seLon.equals(other.seLon))
         return false;
      return true;
   }

}
