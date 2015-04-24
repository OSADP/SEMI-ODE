package com.bah.ode.model;

import java.io.Serializable;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class OdeSerializable implements Serializable {

	/**
	 * 
	 */
   private static final long serialVersionUID = 394533419312383084L;

	@Override
	public String toString() {
		String msg = "";

		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		try {
			msg = mapper.writeValueAsString(this);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return msg;
	}
}
