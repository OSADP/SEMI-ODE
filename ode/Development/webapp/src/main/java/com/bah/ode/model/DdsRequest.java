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

import com.bah.ode.util.JsonUtils;

@SuppressWarnings("serial")
public class DdsRequest extends BaseRequest{
	
	public enum Dialog {
		VSD (154),
		ISD (162),
		ASD (156),
		ALL (-1);
		
		private final int id;

		Dialog(int id) {
			this.id = id;
		}
		
		public int getId() {
			return id;
		}
		
		public static Dialog getById(int id) {
			Dialog result = null;
			for (Dialog d : Dialog.values()) {
				if (d.getId() == id) {
					result = d;
					break;
				}
			}
			return result;
		}
	}

	public enum SystemSubName {
		SDC ("SDC 2.2"),
		SDW ("SDW 2.2"),
		SDPC ("SDPC 2.2");
		
		private final String name;
		
		SystemSubName (String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}
	}

	public enum ResultEncoding {
		BASE_64 ("base64"),
		HEX ("hex"),
		FULL ("full");
		
		private final String enc;
		
		ResultEncoding (String enc) {
			this.enc = enc;
		}

		public String getEnc() {
			return enc;
		}
	}

	private final int vsmType = 31;
   private String 	systemSubName;
   private int 		dialogID;
   private String 	resultEncoding;
   
   public static DdsRequest create() {
   	return new DdsRequest();
   }
   
   public DdsRequest initBase(BaseRequest base) {
   	super.setNwLat(base.getNwLat())
   	     .setNwLon(base.getNwLon())
   	     .setSeLat(base.getSeLat())
   	     .setSeLon(base.getSeLon());
   	return this;
   }
   
	public int getVsmType() {
		return vsmType;
	}

	
	public String getSystemSubName() {
		return systemSubName;
	}

	public DdsRequest setSystemSubName(String systemSubName) {
		this.systemSubName = systemSubName;
		return this;
	}

	public int getDialogID() {
		return dialogID;
	}

	public DdsRequest setDialogID(int dialogID) {
		this.dialogID = dialogID;
		return this;
	}

	public String getResultEncoding() {
		return resultEncoding;
	}

	public DdsRequest setResultEncoding(String resultEncoding) {
		this.resultEncoding = resultEncoding;
		return this;
	}

	public String subscriptionRequest() {
		String json = "SUBSCRIBE:" + JsonUtils.toJson(this);
		return json;
	}
   
	public String queryRequest() {
		return "QUERY:" + JsonUtils.toJson(this);
	}
   
}


