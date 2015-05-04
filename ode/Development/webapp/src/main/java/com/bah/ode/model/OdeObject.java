package com.bah.ode.model;

import java.io.Serializable;

import com.bah.ode.util.JsonUtils;

@SuppressWarnings("serial")
public class OdeObject implements Serializable {

	public String toJson() {
		return JsonUtils.toJson(this);
	}

	@Override
   public String toString() {
		return JsonUtils.toJson(this);
   }
	
	
}
