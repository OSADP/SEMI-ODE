package com.bah.ode.asn;

import com.bah.ode.asn.oss.semi.GroupID;

public class OdeGroupId {
	private byte[] id;

	public byte[] getId() {
		return id;
	}

	public OdeGroupId setId(byte[] id) {
		this.id = id;
		return this;
	}

	public OdeGroupId(GroupID groupID) {
		this.id = groupID.byteArrayValue();
   }

}
