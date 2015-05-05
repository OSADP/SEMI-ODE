package com.bah.ode.util;

import javax.xml.bind.DatatypeConverter;

public class CodecUtils {
	
	static public String toHex(byte[] bytes) {
		return DatatypeConverter.printHexBinary(bytes);
	}

	static public byte[] fromHex(String hex) {
		return DatatypeConverter.parseHexBinary(hex);
	}

	static public String toBase64(byte[] bytes) {
		return DatatypeConverter.printBase64Binary(bytes);
	}

	public static byte[] fromBase64(String base64) {
	   return DatatypeConverter.parseBase64Binary(base64);
   }

}
