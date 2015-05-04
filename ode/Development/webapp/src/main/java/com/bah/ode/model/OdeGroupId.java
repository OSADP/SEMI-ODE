package com.bah.ode.model;

import com.bah.ode.asn.oss.semi.GroupID;

public class OdeGroupId {
	private byte[] id;

	public OdeGroupId(GroupID groupID) {
		this.id = groupID.byteArrayValue();
   }

	public byte[] getId() {
		return id;
	}

	public OdeGroupId setId(byte[] id) {
		this.id = id;
		return this;
	}

}
