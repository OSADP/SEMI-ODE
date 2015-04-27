package com.bah.ode.model;

import com.bah.util.JsonUtils;

@SuppressWarnings("serial")
public class DdsRequest extends AbstractRequest{
	
	protected final int vsmType = 31;
   private SystemSubName systemSubName;
   private Dialog dialogID;
   private ResultEncoding resultEncoding;
   
   public static DdsRequest create() {
   	return new DdsRequest();
   }
   
	public SystemSubName getSystemSubName() {
		return systemSubName;
	}

	public DdsRequest setSystemSubName(SystemSubName systemSubName) {
		this.systemSubName = systemSubName;
		return this;
	}

	public Dialog getDialogID() {
		return dialogID;
	}

	public DdsRequest setDialogID(Dialog dialogID) {
		this.dialogID = dialogID;
		return this;
	}

	public ResultEncoding getResultEncoding() {
		return resultEncoding;
	}

	public DdsRequest setResultEncoding(ResultEncoding resultEncoding) {
		this.resultEncoding = resultEncoding;
		return this;
	}

	public int getVsmType() {
		return vsmType;
	}

	public String subscriptionRequest() {
		String json = "SUBSCRIBE:" + JsonUtils.toJson(this);
		return json;
	}
   
	public String queryRequest() {
		return "QUERY:" + JsonUtils.toJson(this);
	}
   
}

enum Dialog {
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
}

enum SystemSubName {
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

enum ResultEncoding {
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

