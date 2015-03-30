package com.bah.ode.asn.oss.app;

import com.oss.util.HexTool;

public class OdeHexTool {
	
	static public String getHex(byte[] bytes) {
		return "0x" + HexTool.getHex(bytes);
	}

}
