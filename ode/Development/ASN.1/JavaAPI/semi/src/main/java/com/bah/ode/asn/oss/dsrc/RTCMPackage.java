/*************************************************************/
/* Copyright (C) 2015 OSS Nokalva, Inc.  All rights reserved.*/
/*************************************************************/

/* THIS FILE IS PROPRIETARY MATERIAL OF OSS NOKALVA, INC.
 * AND MAY BE USED ONLY BY DIRECT LICENSEES OF OSS NOKALVA, INC.
 * THIS FILE MAY NOT BE DISTRIBUTED.
 * THIS COPYRIGHT STATEMENT MAY NOT BE REMOVED. */

/* Generated for: Joint Program Office (JPO) US DOT, Washington D.C. - One-year Project Start-up, Expiring May 20, 2016, License 70234 70234,
 * only for project "US DOT ITS Connected Vehicle Data Program". */
/* Abstract syntax: semi_asn */
/* ASN.1 Java project: com.bah.ode.asn.oss.Oss */
/* Created: Tue Dec 22 00:38:27 2015 */
/* ASN.1 Compiler for Java version: 6.2 */
/* ASN.1 compiler options and file names specified:
 * -toed -output com.bah.ode.asn.oss -per -uper -ber -der -json -root
 * ../../DSRC_R36_Source.asn ../../SEMI_ASN.1_Structures_2.2.asn
 */


package com.bah.ode.asn.oss.dsrc;

import com.oss.asn1.*;
import com.oss.metadata.*;
import java.io.IOException;
import com.oss.coders.EncoderException;
import com.oss.coders.DecoderException;
import com.oss.util.ExceptionDescriptor;
import com.oss.asn1printer.DataPrinter;
import com.oss.asn1printer.DataPrinterException;
import com.oss.coders.ber.EncoderOutput;
import com.oss.coders.ber.DecoderInput;
import com.oss.coders.ber.DecoderInputByteBuffer;
import com.oss.coders.ber.BERDecodable;
import com.oss.coders.ber.BerCoder;
import com.oss.coders.ber.BEREncodable;
import com.oss.coders.der.DEREncodable;
import com.oss.coders.der.DerCoder;
import com.oss.coders.json.JsonWriter;
import com.oss.coders.json.JSONEncodable;
import com.oss.coders.json.JsonReader;
import com.oss.coders.json.JSONDecodable;
import com.oss.coders.json.JsonCoder;
import com.oss.coders.OutputBitStream;
import com.oss.coders.per.PEREncodable;
import com.oss.coders.InputBitStream;
import com.oss.coders.per.PERDecodable;
import com.oss.coders.per.PerCoder;

/**
 * Define the ASN1 Type RTCMPackage from ASN1 Module DSRC.
 * @see Sequence
 */

public class RTCMPackage extends Sequence {
    public FullPositionVector anchorPoint;
    public RTCMHeader rtcmHeader;
    public OctetString msg1001;
    public OctetString msg1002;
    public OctetString msg1003;
    public OctetString msg1004;
    public OctetString msg1005;
    public OctetString msg1006;
    public OctetString msg1007;
    public OctetString msg1008;
    public OctetString msg1009;
    public OctetString msg1010;
    public OctetString msg1011;
    public OctetString msg1012;
    public OctetString msg1013;
    public OctetString msg1014;
    public OctetString msg1015;
    public OctetString msg1016;
    public OctetString msg1017;
    public OctetString msg1019;
    public OctetString msg1020;
    public OctetString msg1021;
    public OctetString msg1022;
    public OctetString msg1023;
    public OctetString msg1024;
    public OctetString msg1025;
    public OctetString msg1026;
    public OctetString msg1027;
    public OctetString msg1029;
    public OctetString msg1030;
    public OctetString msg1031;
    public OctetString msg1032;
    
    /**
     * The default constructor.
     */
    public RTCMPackage()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RTCMPackage(FullPositionVector anchorPoint, RTCMHeader rtcmHeader, 
		    OctetString msg1001, OctetString msg1002, 
		    OctetString msg1003, OctetString msg1004, 
		    OctetString msg1005, OctetString msg1006, 
		    OctetString msg1007, OctetString msg1008, 
		    OctetString msg1009, OctetString msg1010, 
		    OctetString msg1011, OctetString msg1012, 
		    OctetString msg1013, OctetString msg1014, 
		    OctetString msg1015, OctetString msg1016, 
		    OctetString msg1017, OctetString msg1019, 
		    OctetString msg1020, OctetString msg1021, 
		    OctetString msg1022, OctetString msg1023, 
		    OctetString msg1024, OctetString msg1025, 
		    OctetString msg1026, OctetString msg1027, 
		    OctetString msg1029, OctetString msg1030, 
		    OctetString msg1031, OctetString msg1032)
    {
	setAnchorPoint(anchorPoint);
	setRtcmHeader(rtcmHeader);
	setMsg1001(msg1001);
	setMsg1002(msg1002);
	setMsg1003(msg1003);
	setMsg1004(msg1004);
	setMsg1005(msg1005);
	setMsg1006(msg1006);
	setMsg1007(msg1007);
	setMsg1008(msg1008);
	setMsg1009(msg1009);
	setMsg1010(msg1010);
	setMsg1011(msg1011);
	setMsg1012(msg1012);
	setMsg1013(msg1013);
	setMsg1014(msg1014);
	setMsg1015(msg1015);
	setMsg1016(msg1016);
	setMsg1017(msg1017);
	setMsg1019(msg1019);
	setMsg1020(msg1020);
	setMsg1021(msg1021);
	setMsg1022(msg1022);
	setMsg1023(msg1023);
	setMsg1024(msg1024);
	setMsg1025(msg1025);
	setMsg1026(msg1026);
	setMsg1027(msg1027);
	setMsg1029(msg1029);
	setMsg1030(msg1030);
	setMsg1031(msg1031);
	setMsg1032(msg1032);
    }
    
    /**
     * Construct with required components.
     */
    public RTCMPackage(RTCMHeader rtcmHeader)
    {
	setRtcmHeader(rtcmHeader);
    }
    
    
    // Methods for field "anchorPoint"
    public FullPositionVector getAnchorPoint()
    {
	return this.anchorPoint;
    }
    
    public void setAnchorPoint(FullPositionVector anchorPoint)
    {
	this.anchorPoint = anchorPoint;
    }
    
    public boolean hasAnchorPoint()
    {
	return (anchorPoint != null);
    }
    
    public void deleteAnchorPoint()
    {
	anchorPoint = null;
    }
    
    
    // Methods for field "rtcmHeader"
    public RTCMHeader getRtcmHeader()
    {
	return this.rtcmHeader;
    }
    
    public void setRtcmHeader(RTCMHeader rtcmHeader)
    {
	this.rtcmHeader = rtcmHeader;
    }
    
    
    // Methods for field "msg1001"
    public OctetString getMsg1001()
    {
	return this.msg1001;
    }
    
    public void setMsg1001(OctetString msg1001)
    {
	this.msg1001 = msg1001;
    }
    
    public boolean hasMsg1001()
    {
	return (msg1001 != null);
    }
    
    public void deleteMsg1001()
    {
	msg1001 = null;
    }
    
    
    // Methods for field "msg1002"
    public OctetString getMsg1002()
    {
	return this.msg1002;
    }
    
    public void setMsg1002(OctetString msg1002)
    {
	this.msg1002 = msg1002;
    }
    
    public boolean hasMsg1002()
    {
	return (msg1002 != null);
    }
    
    public void deleteMsg1002()
    {
	msg1002 = null;
    }
    
    
    // Methods for field "msg1003"
    public OctetString getMsg1003()
    {
	return this.msg1003;
    }
    
    public void setMsg1003(OctetString msg1003)
    {
	this.msg1003 = msg1003;
    }
    
    public boolean hasMsg1003()
    {
	return (msg1003 != null);
    }
    
    public void deleteMsg1003()
    {
	msg1003 = null;
    }
    
    
    // Methods for field "msg1004"
    public OctetString getMsg1004()
    {
	return this.msg1004;
    }
    
    public void setMsg1004(OctetString msg1004)
    {
	this.msg1004 = msg1004;
    }
    
    public boolean hasMsg1004()
    {
	return (msg1004 != null);
    }
    
    public void deleteMsg1004()
    {
	msg1004 = null;
    }
    
    
    // Methods for field "msg1005"
    public OctetString getMsg1005()
    {
	return this.msg1005;
    }
    
    public void setMsg1005(OctetString msg1005)
    {
	this.msg1005 = msg1005;
    }
    
    public boolean hasMsg1005()
    {
	return (msg1005 != null);
    }
    
    public void deleteMsg1005()
    {
	msg1005 = null;
    }
    
    
    // Methods for field "msg1006"
    public OctetString getMsg1006()
    {
	return this.msg1006;
    }
    
    public void setMsg1006(OctetString msg1006)
    {
	this.msg1006 = msg1006;
    }
    
    public boolean hasMsg1006()
    {
	return (msg1006 != null);
    }
    
    public void deleteMsg1006()
    {
	msg1006 = null;
    }
    
    
    // Methods for field "msg1007"
    public OctetString getMsg1007()
    {
	return this.msg1007;
    }
    
    public void setMsg1007(OctetString msg1007)
    {
	this.msg1007 = msg1007;
    }
    
    public boolean hasMsg1007()
    {
	return (msg1007 != null);
    }
    
    public void deleteMsg1007()
    {
	msg1007 = null;
    }
    
    
    // Methods for field "msg1008"
    public OctetString getMsg1008()
    {
	return this.msg1008;
    }
    
    public void setMsg1008(OctetString msg1008)
    {
	this.msg1008 = msg1008;
    }
    
    public boolean hasMsg1008()
    {
	return (msg1008 != null);
    }
    
    public void deleteMsg1008()
    {
	msg1008 = null;
    }
    
    
    // Methods for field "msg1009"
    public OctetString getMsg1009()
    {
	return this.msg1009;
    }
    
    public void setMsg1009(OctetString msg1009)
    {
	this.msg1009 = msg1009;
    }
    
    public boolean hasMsg1009()
    {
	return (msg1009 != null);
    }
    
    public void deleteMsg1009()
    {
	msg1009 = null;
    }
    
    
    // Methods for field "msg1010"
    public OctetString getMsg1010()
    {
	return this.msg1010;
    }
    
    public void setMsg1010(OctetString msg1010)
    {
	this.msg1010 = msg1010;
    }
    
    public boolean hasMsg1010()
    {
	return (msg1010 != null);
    }
    
    public void deleteMsg1010()
    {
	msg1010 = null;
    }
    
    
    // Methods for field "msg1011"
    public OctetString getMsg1011()
    {
	return this.msg1011;
    }
    
    public void setMsg1011(OctetString msg1011)
    {
	this.msg1011 = msg1011;
    }
    
    public boolean hasMsg1011()
    {
	return (msg1011 != null);
    }
    
    public void deleteMsg1011()
    {
	msg1011 = null;
    }
    
    
    // Methods for field "msg1012"
    public OctetString getMsg1012()
    {
	return this.msg1012;
    }
    
    public void setMsg1012(OctetString msg1012)
    {
	this.msg1012 = msg1012;
    }
    
    public boolean hasMsg1012()
    {
	return (msg1012 != null);
    }
    
    public void deleteMsg1012()
    {
	msg1012 = null;
    }
    
    
    // Methods for field "msg1013"
    public OctetString getMsg1013()
    {
	return this.msg1013;
    }
    
    public void setMsg1013(OctetString msg1013)
    {
	this.msg1013 = msg1013;
    }
    
    public boolean hasMsg1013()
    {
	return (msg1013 != null);
    }
    
    public void deleteMsg1013()
    {
	msg1013 = null;
    }
    
    
    // Methods for field "msg1014"
    public OctetString getMsg1014()
    {
	return this.msg1014;
    }
    
    public void setMsg1014(OctetString msg1014)
    {
	this.msg1014 = msg1014;
    }
    
    public boolean hasMsg1014()
    {
	return (msg1014 != null);
    }
    
    public void deleteMsg1014()
    {
	msg1014 = null;
    }
    
    
    // Methods for field "msg1015"
    public OctetString getMsg1015()
    {
	return this.msg1015;
    }
    
    public void setMsg1015(OctetString msg1015)
    {
	this.msg1015 = msg1015;
    }
    
    public boolean hasMsg1015()
    {
	return (msg1015 != null);
    }
    
    public void deleteMsg1015()
    {
	msg1015 = null;
    }
    
    
    // Methods for field "msg1016"
    public OctetString getMsg1016()
    {
	return this.msg1016;
    }
    
    public void setMsg1016(OctetString msg1016)
    {
	this.msg1016 = msg1016;
    }
    
    public boolean hasMsg1016()
    {
	return (msg1016 != null);
    }
    
    public void deleteMsg1016()
    {
	msg1016 = null;
    }
    
    
    // Methods for field "msg1017"
    public OctetString getMsg1017()
    {
	return this.msg1017;
    }
    
    public void setMsg1017(OctetString msg1017)
    {
	this.msg1017 = msg1017;
    }
    
    public boolean hasMsg1017()
    {
	return (msg1017 != null);
    }
    
    public void deleteMsg1017()
    {
	msg1017 = null;
    }
    
    
    // Methods for field "msg1019"
    public OctetString getMsg1019()
    {
	return this.msg1019;
    }
    
    public void setMsg1019(OctetString msg1019)
    {
	this.msg1019 = msg1019;
    }
    
    public boolean hasMsg1019()
    {
	return (msg1019 != null);
    }
    
    public void deleteMsg1019()
    {
	msg1019 = null;
    }
    
    
    // Methods for field "msg1020"
    public OctetString getMsg1020()
    {
	return this.msg1020;
    }
    
    public void setMsg1020(OctetString msg1020)
    {
	this.msg1020 = msg1020;
    }
    
    public boolean hasMsg1020()
    {
	return (msg1020 != null);
    }
    
    public void deleteMsg1020()
    {
	msg1020 = null;
    }
    
    
    // Methods for field "msg1021"
    public OctetString getMsg1021()
    {
	return this.msg1021;
    }
    
    public void setMsg1021(OctetString msg1021)
    {
	this.msg1021 = msg1021;
    }
    
    public boolean hasMsg1021()
    {
	return (msg1021 != null);
    }
    
    public void deleteMsg1021()
    {
	msg1021 = null;
    }
    
    
    // Methods for field "msg1022"
    public OctetString getMsg1022()
    {
	return this.msg1022;
    }
    
    public void setMsg1022(OctetString msg1022)
    {
	this.msg1022 = msg1022;
    }
    
    public boolean hasMsg1022()
    {
	return (msg1022 != null);
    }
    
    public void deleteMsg1022()
    {
	msg1022 = null;
    }
    
    
    // Methods for field "msg1023"
    public OctetString getMsg1023()
    {
	return this.msg1023;
    }
    
    public void setMsg1023(OctetString msg1023)
    {
	this.msg1023 = msg1023;
    }
    
    public boolean hasMsg1023()
    {
	return (msg1023 != null);
    }
    
    public void deleteMsg1023()
    {
	msg1023 = null;
    }
    
    
    // Methods for field "msg1024"
    public OctetString getMsg1024()
    {
	return this.msg1024;
    }
    
    public void setMsg1024(OctetString msg1024)
    {
	this.msg1024 = msg1024;
    }
    
    public boolean hasMsg1024()
    {
	return (msg1024 != null);
    }
    
    public void deleteMsg1024()
    {
	msg1024 = null;
    }
    
    
    // Methods for field "msg1025"
    public OctetString getMsg1025()
    {
	return this.msg1025;
    }
    
    public void setMsg1025(OctetString msg1025)
    {
	this.msg1025 = msg1025;
    }
    
    public boolean hasMsg1025()
    {
	return (msg1025 != null);
    }
    
    public void deleteMsg1025()
    {
	msg1025 = null;
    }
    
    
    // Methods for field "msg1026"
    public OctetString getMsg1026()
    {
	return this.msg1026;
    }
    
    public void setMsg1026(OctetString msg1026)
    {
	this.msg1026 = msg1026;
    }
    
    public boolean hasMsg1026()
    {
	return (msg1026 != null);
    }
    
    public void deleteMsg1026()
    {
	msg1026 = null;
    }
    
    
    // Methods for field "msg1027"
    public OctetString getMsg1027()
    {
	return this.msg1027;
    }
    
    public void setMsg1027(OctetString msg1027)
    {
	this.msg1027 = msg1027;
    }
    
    public boolean hasMsg1027()
    {
	return (msg1027 != null);
    }
    
    public void deleteMsg1027()
    {
	msg1027 = null;
    }
    
    
    // Methods for field "msg1029"
    public OctetString getMsg1029()
    {
	return this.msg1029;
    }
    
    public void setMsg1029(OctetString msg1029)
    {
	this.msg1029 = msg1029;
    }
    
    public boolean hasMsg1029()
    {
	return (msg1029 != null);
    }
    
    public void deleteMsg1029()
    {
	msg1029 = null;
    }
    
    
    // Methods for field "msg1030"
    public OctetString getMsg1030()
    {
	return this.msg1030;
    }
    
    public void setMsg1030(OctetString msg1030)
    {
	this.msg1030 = msg1030;
    }
    
    public boolean hasMsg1030()
    {
	return (msg1030 != null);
    }
    
    public void deleteMsg1030()
    {
	msg1030 = null;
    }
    
    
    // Methods for field "msg1031"
    public OctetString getMsg1031()
    {
	return this.msg1031;
    }
    
    public void setMsg1031(OctetString msg1031)
    {
	this.msg1031 = msg1031;
    }
    
    public boolean hasMsg1031()
    {
	return (msg1031 != null);
    }
    
    public void deleteMsg1031()
    {
	msg1031 = null;
    }
    
    
    // Methods for field "msg1032"
    public OctetString getMsg1032()
    {
	return this.msg1032;
    }
    
    public void setMsg1032(OctetString msg1032)
    {
	this.msg1032 = msg1032;
    }
    
    public boolean hasMsg1032()
    {
	return (msg1032 != null);
    }
    
    public void deleteMsg1032()
    {
	msg1032 = null;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     */
    public static enum __Tag
    {
	__anchorPoint("anchorPoint"),
	__rtcmHeader("rtcmHeader"),
	__msg1001("msg1001"),
	__msg1002("msg1002"),
	__msg1003("msg1003"),
	__msg1004("msg1004"),
	__msg1005("msg1005"),
	__msg1006("msg1006"),
	__msg1007("msg1007"),
	__msg1008("msg1008"),
	__msg1009("msg1009"),
	__msg1010("msg1010"),
	__msg1011("msg1011"),
	__msg1012("msg1012"),
	__msg1013("msg1013"),
	__msg1014("msg1014"),
	__msg1015("msg1015"),
	__msg1016("msg1016"),
	__msg1017("msg1017"),
	__msg1019("msg1019"),
	__msg1020("msg1020"),
	__msg1021("msg1021"),
	__msg1022("msg1022"),
	__msg1023("msg1023"),
	__msg1024("msg1024"),
	__msg1025("msg1025"),
	__msg1026("msg1026"),
	__msg1027("msg1027"),
	__msg1029("msg1029"),
	__msg1030("msg1030"),
	__msg1031("msg1031"),
	__msg1032("msg1032"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(33);
	private __Tag(String tag) {
	    this.tag = tag;
	}
	private String getTag() {
	    return tag;
	}
	/**
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public static __Tag getTagSub(String tag) {
	    return map.get(tag);
	}
	static {
	    for (__Tag t:values())
		map.put(t.getTag(), t);
	}
    }
    
    /**
     * Implements BER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encodeValue(BerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	int len0 = 0;
	RTCMPackage temp0 = this;

	if (temp0.msg1032 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1032.byteArrayValue()), 0x9F1F);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1032", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1031 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1031.byteArrayValue()), 0x9E);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1031", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1030 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1030.byteArrayValue()), 0x9D);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1030", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1029 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1029.byteArrayValue()), 0x9C);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1029", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1027 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1027.byteArrayValue()), 0x9B);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1027", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1026 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1026.byteArrayValue()), 0x9A);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1026", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1025 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1025.byteArrayValue()), 0x99);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1025", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1024 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1024.byteArrayValue()), 0x98);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1024", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1023 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1023.byteArrayValue()), 0x97);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1023", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1022 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1022.byteArrayValue()), 0x96);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1022", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1021 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1021.byteArrayValue()), 0x95);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1021", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1020 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1020.byteArrayValue()), 0x94);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1020", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1019 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1019.byteArrayValue()), 0x93);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1019", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1017 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1017.byteArrayValue()), 0x92);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1017", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1016 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1016.byteArrayValue()), 0x91);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1016", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1015 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1015.byteArrayValue()), 0x90);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1015", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1014 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1014.byteArrayValue()), 0x8F);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1014", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1013 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1013.byteArrayValue()), 0x8E);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1013", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1012 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1012.byteArrayValue()), 0x8D);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1012", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1011 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1011.byteArrayValue()), 0x8C);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1011", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1010 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1010.byteArrayValue()), 0x8B);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1010", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1009 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1009.byteArrayValue()), 0x8A);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1009", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1008 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1008.byteArrayValue()), 0x89);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1008", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1007 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1007.byteArrayValue()), 0x88);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1007", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1006 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1006.byteArrayValue()), 0x87);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1006", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1005 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1005.byteArrayValue()), 0x86);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1005", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1004 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1004.byteArrayValue()), 0x85);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1004", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1003 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1003.byteArrayValue()), 0x84);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1003", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1002 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1002.byteArrayValue()), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1002", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1001 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1001.byteArrayValue()), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1001", "OCTET STRING");
		throw ee;
	    }
	}
	try {
	    len0 += sink.encodeLengthTag(sink.write(temp0.rtcmHeader.byteArrayValue()), 0x81);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("rtcmHeader", "RTCMHeader");
	    throw ee;
	}
	if (temp0.anchorPoint != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.anchorPoint.encodeValue(coder, sink), 0xA0);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("anchorPoint", "FullPositionVector");
		throw ee;
	    }
	}

	return len0;
    }

    /**
     * Implements BER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public RTCMPackage decodeValue(BerCoder coder, DecoderInput source)
	    throws DecoderException
    {
	int total_len0 = source.mLength;
	int end_pos0 = (total_len0 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len0);
	int tag;

	do {
	    tag = source.decodeTagLength();
	    if (tag == 0xA0) {
		try {
		    this.anchorPoint = new FullPositionVector();
		    this.anchorPoint.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("anchorPoint", "FullPositionVector");
		    throw ee;
		}
		tag = source.decodeTagLength();
	    }
	    if (tag != 0x81 && tag != 0xA1)
		source.raiseTagMismatchException(tag);
	    try {
		this.rtcmHeader = new RTCMHeader(coder.decodeOctetString(source));
	    } catch (Exception e) {
		DecoderException ee = DecoderException.wrapException(e);
		ee.appendFieldContext("rtcmHeader", "RTCMHeader");
		throw ee;
	    }
	    if (source.position() >= end_pos0)
		break;
	    tag = source.decodeTagLength();
	    if (tag == 0)
		break;
	    if (tag == 0x82 || tag == 0xA2) {
		try {
		    this.msg1001 = new OctetString(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("msg1001", "OCTET STRING");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x83 || tag == 0xA3) {
		try {
		    this.msg1002 = new OctetString(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("msg1002", "OCTET STRING");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x84 || tag == 0xA4) {
		try {
		    this.msg1003 = new OctetString(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("msg1003", "OCTET STRING");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x85 || tag == 0xA5) {
		try {
		    this.msg1004 = new OctetString(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("msg1004", "OCTET STRING");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x86 || tag == 0xA6) {
		try {
		    this.msg1005 = new OctetString(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("msg1005", "OCTET STRING");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x87 || tag == 0xA7) {
		try {
		    this.msg1006 = new OctetString(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("msg1006", "OCTET STRING");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x88 || tag == 0xA8) {
		try {
		    this.msg1007 = new OctetString(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("msg1007", "OCTET STRING");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x89 || tag == 0xA9) {
		try {
		    this.msg1008 = new OctetString(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("msg1008", "OCTET STRING");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x8A || tag == 0xAA) {
		try {
		    this.msg1009 = new OctetString(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("msg1009", "OCTET STRING");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x8B || tag == 0xAB) {
		try {
		    this.msg1010 = new OctetString(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("msg1010", "OCTET STRING");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x8C || tag == 0xAC) {
		try {
		    this.msg1011 = new OctetString(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("msg1011", "OCTET STRING");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x8D || tag == 0xAD) {
		try {
		    this.msg1012 = new OctetString(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("msg1012", "OCTET STRING");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x8E || tag == 0xAE) {
		try {
		    this.msg1013 = new OctetString(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("msg1013", "OCTET STRING");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x8F || tag == 0xAF) {
		try {
		    this.msg1014 = new OctetString(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("msg1014", "OCTET STRING");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x90 || tag == 0xB0) {
		try {
		    this.msg1015 = new OctetString(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("msg1015", "OCTET STRING");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x91 || tag == 0xB1) {
		try {
		    this.msg1016 = new OctetString(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("msg1016", "OCTET STRING");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x92 || tag == 0xB2) {
		try {
		    this.msg1017 = new OctetString(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("msg1017", "OCTET STRING");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x93 || tag == 0xB3) {
		try {
		    this.msg1019 = new OctetString(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("msg1019", "OCTET STRING");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x94 || tag == 0xB4) {
		try {
		    this.msg1020 = new OctetString(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("msg1020", "OCTET STRING");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x95 || tag == 0xB5) {
		try {
		    this.msg1021 = new OctetString(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("msg1021", "OCTET STRING");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x96 || tag == 0xB6) {
		try {
		    this.msg1022 = new OctetString(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("msg1022", "OCTET STRING");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x97 || tag == 0xB7) {
		try {
		    this.msg1023 = new OctetString(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("msg1023", "OCTET STRING");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x98 || tag == 0xB8) {
		try {
		    this.msg1024 = new OctetString(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("msg1024", "OCTET STRING");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x99 || tag == 0xB9) {
		try {
		    this.msg1025 = new OctetString(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("msg1025", "OCTET STRING");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9A || tag == 0xBA) {
		try {
		    this.msg1026 = new OctetString(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("msg1026", "OCTET STRING");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9B || tag == 0xBB) {
		try {
		    this.msg1027 = new OctetString(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("msg1027", "OCTET STRING");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9C || tag == 0xBC) {
		try {
		    this.msg1029 = new OctetString(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("msg1029", "OCTET STRING");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9D || tag == 0xBD) {
		try {
		    this.msg1030 = new OctetString(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("msg1030", "OCTET STRING");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9E || tag == 0xBE) {
		try {
		    this.msg1031 = new OctetString(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("msg1031", "OCTET STRING");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F1F || tag == 0xBF1F) {
		try {
		    this.msg1032 = new OctetString(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("msg1032", "OCTET STRING");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    for (;;) {
		try {
		    coder.skipContents(source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendExtensionContext("RTCMPackage", -1);
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	} while(false);

	if (source.position() > end_pos0)
	    throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
	if (total_len0 < 0 && source.mLength != 0)
	    throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);

	return this;
    }

    /**
     * Implements BER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encodeValue(DerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	int len0 = 0;
	RTCMPackage temp0 = this;

	if (temp0.msg1032 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1032.byteArrayValue()), 0x9F1F);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1032", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1031 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1031.byteArrayValue()), 0x9E);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1031", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1030 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1030.byteArrayValue()), 0x9D);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1030", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1029 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1029.byteArrayValue()), 0x9C);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1029", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1027 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1027.byteArrayValue()), 0x9B);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1027", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1026 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1026.byteArrayValue()), 0x9A);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1026", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1025 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1025.byteArrayValue()), 0x99);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1025", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1024 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1024.byteArrayValue()), 0x98);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1024", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1023 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1023.byteArrayValue()), 0x97);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1023", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1022 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1022.byteArrayValue()), 0x96);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1022", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1021 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1021.byteArrayValue()), 0x95);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1021", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1020 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1020.byteArrayValue()), 0x94);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1020", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1019 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1019.byteArrayValue()), 0x93);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1019", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1017 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1017.byteArrayValue()), 0x92);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1017", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1016 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1016.byteArrayValue()), 0x91);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1016", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1015 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1015.byteArrayValue()), 0x90);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1015", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1014 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1014.byteArrayValue()), 0x8F);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1014", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1013 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1013.byteArrayValue()), 0x8E);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1013", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1012 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1012.byteArrayValue()), 0x8D);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1012", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1011 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1011.byteArrayValue()), 0x8C);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1011", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1010 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1010.byteArrayValue()), 0x8B);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1010", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1009 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1009.byteArrayValue()), 0x8A);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1009", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1008 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1008.byteArrayValue()), 0x89);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1008", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1007 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1007.byteArrayValue()), 0x88);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1007", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1006 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1006.byteArrayValue()), 0x87);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1006", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1005 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1005.byteArrayValue()), 0x86);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1005", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1004 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1004.byteArrayValue()), 0x85);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1004", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1003 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1003.byteArrayValue()), 0x84);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1003", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1002 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1002.byteArrayValue()), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1002", "OCTET STRING");
		throw ee;
	    }
	}
	if (temp0.msg1001 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.msg1001.byteArrayValue()), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1001", "OCTET STRING");
		throw ee;
	    }
	}
	try {
	    len0 += sink.encodeLengthTag(sink.write(temp0.rtcmHeader.byteArrayValue()), 0x81);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("rtcmHeader", "RTCMHeader");
	    throw ee;
	}
	if (temp0.anchorPoint != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.anchorPoint.encodeValue(coder, sink), 0xA0);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("anchorPoint", "FullPositionVector");
		throw ee;
	    }
	}

	return len0;
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, RTCMPackage data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	boolean _has_extensions0 = false;
	OutputBitStream bitstream0 = null;
	int nbits = 0;

	_has_extensions0 = data.msg1014 != null ||
	    data.msg1015 != null ||
	    data.msg1016 != null ||
	    data.msg1017 != null ||
	    data.msg1019 != null ||
	    data.msg1020 != null ||
	    data.msg1021 != null ||
	    data.msg1022 != null ||
	    data.msg1023 != null ||
	    data.msg1024 != null ||
	    data.msg1025 != null ||
	    data.msg1026 != null ||
	    data.msg1027 != null ||
	    data.msg1029 != null ||
	    data.msg1030 != null ||
	    data.msg1031 != null ||
	    data.msg1032 != null;
	sink.writeBit(_has_extensions0);
	sink.writeBit(data.anchorPoint != null);
	sink.writeBit(data.msg1001 != null);
	sink.writeBit(data.msg1002 != null);
	sink.writeBit(data.msg1003 != null);
	sink.writeBit(data.msg1004 != null);
	sink.writeBit(data.msg1005 != null);
	sink.writeBit(data.msg1006 != null);
	sink.writeBit(data.msg1007 != null);
	sink.writeBit(data.msg1008 != null);
	sink.writeBit(data.msg1009 != null);
	sink.writeBit(data.msg1010 != null);
	sink.writeBit(data.msg1011 != null);
	sink.writeBit(data.msg1012 != null);
	sink.writeBit(data.msg1013 != null);
	nbits += 15;
	if (data.anchorPoint != null) {
	    // Encode field 'anchorPoint'
	    try {
		FullPositionVector item1 = data.anchorPoint;

		nbits += FullPositionVector.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("anchorPoint", "FullPositionVector");
		throw ee;
	    }
	}
	// Encode field 'rtcmHeader'
	try {
	    RTCMHeader item1 = data.rtcmHeader;
	    int len1 = item1.getSize();

	    if (len1 != 5)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 5, 5, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("rtcmHeader", "RTCMHeader");
	    throw ee;
	}
	if (data.msg1001 != null) {
	    // Encode field 'msg1001'
	    try {
		OctetString item1 = data.msg1001;
		int len1 = item1.getSize();

		if (len1 < 16 || len1 > 124)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 16, 124, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1001", "OCTET STRING");
		throw ee;
	    }
	}
	if (data.msg1002 != null) {
	    // Encode field 'msg1002'
	    try {
		OctetString item1 = data.msg1002;
		int len1 = item1.getSize();

		if (len1 < 18 || len1 > 156)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 18, 156, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1002", "OCTET STRING");
		throw ee;
	    }
	}
	if (data.msg1003 != null) {
	    // Encode field 'msg1003'
	    try {
		OctetString item1 = data.msg1003;
		int len1 = item1.getSize();

		if (len1 < 21 || len1 > 210)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 21, 210, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1003", "OCTET STRING");
		throw ee;
	    }
	}
	if (data.msg1004 != null) {
	    // Encode field 'msg1004'
	    try {
		OctetString item1 = data.msg1004;
		int len1 = item1.getSize();

		if (len1 < 24 || len1 > 258)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 24, 258, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1004", "OCTET STRING");
		throw ee;
	    }
	}
	if (data.msg1005 != null) {
	    // Encode field 'msg1005'
	    try {
		OctetString item1 = data.msg1005;
		int len1 = item1.getSize();

		if (len1 != 19)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 19, 19, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1005", "OCTET STRING");
		throw ee;
	    }
	}
	if (data.msg1006 != null) {
	    // Encode field 'msg1006'
	    try {
		OctetString item1 = data.msg1006;
		int len1 = item1.getSize();

		if (len1 != 21)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 21, 21, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1006", "OCTET STRING");
		throw ee;
	    }
	}
	if (data.msg1007 != null) {
	    // Encode field 'msg1007'
	    try {
		OctetString item1 = data.msg1007;
		int len1 = item1.getSize();

		if (len1 < 5 || len1 > 36)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 5, 36, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1007", "OCTET STRING");
		throw ee;
	    }
	}
	if (data.msg1008 != null) {
	    // Encode field 'msg1008'
	    try {
		OctetString item1 = data.msg1008;
		int len1 = item1.getSize();

		if (len1 < 6 || len1 > 68)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 6, 68, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1008", "OCTET STRING");
		throw ee;
	    }
	}
	if (data.msg1009 != null) {
	    // Encode field 'msg1009'
	    try {
		OctetString item1 = data.msg1009;
		int len1 = item1.getSize();

		if (len1 < 16 || len1 > 136)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 16, 136, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1009", "OCTET STRING");
		throw ee;
	    }
	}
	if (data.msg1010 != null) {
	    // Encode field 'msg1010'
	    try {
		OctetString item1 = data.msg1010;
		int len1 = item1.getSize();

		if (len1 < 18 || len1 > 166)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 18, 166, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1010", "OCTET STRING");
		throw ee;
	    }
	}
	if (data.msg1011 != null) {
	    // Encode field 'msg1011'
	    try {
		OctetString item1 = data.msg1011;
		int len1 = item1.getSize();

		if (len1 < 21 || len1 > 222)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 21, 222, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1011", "OCTET STRING");
		throw ee;
	    }
	}
	if (data.msg1012 != null) {
	    // Encode field 'msg1012'
	    try {
		OctetString item1 = data.msg1012;
		int len1 = item1.getSize();

		if (len1 < 24 || len1 > 268)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 24, 268, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1012", "OCTET STRING");
		throw ee;
	    }
	}
	if (data.msg1013 != null) {
	    // Encode field 'msg1013'
	    try {
		OctetString item1 = data.msg1013;
		int len1 = item1.getSize();

		if (len1 < 13 || len1 > 27)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 13, 27, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg1013", "OCTET STRING");
		throw ee;
	    }
	}
	if (_has_extensions0) {
	    nbits += coder.encodeNormallySmallLength(17, sink);
	    if (coder.moreFragments())
		throw new EncoderException(com.oss.util.ExceptionDescriptor._too_many_ext_additions, null, "16384 or more");
	    sink.writeBit(data.msg1014 != null);
	    sink.writeBit(data.msg1015 != null);
	    sink.writeBit(data.msg1016 != null);
	    sink.writeBit(data.msg1017 != null);
	    sink.writeBit(data.msg1019 != null);
	    sink.writeBit(data.msg1020 != null);
	    sink.writeBit(data.msg1021 != null);
	    sink.writeBit(data.msg1022 != null);
	    sink.writeBit(data.msg1023 != null);
	    sink.writeBit(data.msg1024 != null);
	    sink.writeBit(data.msg1025 != null);
	    sink.writeBit(data.msg1026 != null);
	    sink.writeBit(data.msg1027 != null);
	    sink.writeBit(data.msg1029 != null);
	    sink.writeBit(data.msg1030 != null);
	    sink.writeBit(data.msg1031 != null);
	    sink.writeBit(data.msg1032 != null);
	    nbits += 17;
	    bitstream0 = sink;
	    sink = coder.createNestedStream(bitstream0);
	    try {
		if (data.msg1014 != null) {
		    // Encode extension 'msg1014'
		    try {
			OctetString item1 = data.msg1014;
			int len1 = item1.getSize();

			if (len1 != 15)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
			nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 15, 15, sink);
			nbits += coder.completeWrappedEncoding(sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("msg1014", "OCTET STRING");
			throw ee;
		    }
		}
		if (data.msg1015 != null) {
		    // Encode extension 'msg1015'
		    try {
			OctetString item1 = data.msg1015;
			int len1 = item1.getSize();

			if (len1 < 13 || len1 > 69)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
			nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 13, 69, sink);
			nbits += coder.completeWrappedEncoding(sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("msg1015", "OCTET STRING");
			throw ee;
		    }
		}
		if (data.msg1016 != null) {
		    // Encode extension 'msg1016'
		    try {
			OctetString item1 = data.msg1016;
			int len1 = item1.getSize();

			if (len1 < 14 || len1 > 81)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
			nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 14, 81, sink);
			nbits += coder.completeWrappedEncoding(sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("msg1016", "OCTET STRING");
			throw ee;
		    }
		}
		if (data.msg1017 != null) {
		    // Encode extension 'msg1017'
		    try {
			OctetString item1 = data.msg1017;
			int len1 = item1.getSize();

			if (len1 < 16 || len1 > 115)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
			nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 16, 115, sink);
			nbits += coder.completeWrappedEncoding(sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("msg1017", "OCTET STRING");
			throw ee;
		    }
		}
		if (data.msg1019 != null) {
		    // Encode extension 'msg1019'
		    try {
			OctetString item1 = data.msg1019;
			int len1 = item1.getSize();

			if (len1 != 62)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
			nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 62, 62, sink);
			nbits += coder.completeWrappedEncoding(sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("msg1019", "OCTET STRING");
			throw ee;
		    }
		}
		if (data.msg1020 != null) {
		    // Encode extension 'msg1020'
		    try {
			OctetString item1 = data.msg1020;
			int len1 = item1.getSize();

			if (len1 != 45)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
			nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 45, 45, sink);
			nbits += coder.completeWrappedEncoding(sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("msg1020", "OCTET STRING");
			throw ee;
		    }
		}
		if (data.msg1021 != null) {
		    // Encode extension 'msg1021'
		    try {
			OctetString item1 = data.msg1021;
			int len1 = item1.getSize();

			if (len1 != 62)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
			nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 62, 62, sink);
			nbits += coder.completeWrappedEncoding(sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("msg1021", "OCTET STRING");
			throw ee;
		    }
		}
		if (data.msg1022 != null) {
		    // Encode extension 'msg1022'
		    try {
			OctetString item1 = data.msg1022;
			int len1 = item1.getSize();

			if (len1 != 75)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
			nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 75, 75, sink);
			nbits += coder.completeWrappedEncoding(sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("msg1022", "OCTET STRING");
			throw ee;
		    }
		}
		if (data.msg1023 != null) {
		    // Encode extension 'msg1023'
		    try {
			OctetString item1 = data.msg1023;
			int len1 = item1.getSize();

			if (len1 != 73)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
			nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 73, 73, sink);
			nbits += coder.completeWrappedEncoding(sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("msg1023", "OCTET STRING");
			throw ee;
		    }
		}
		if (data.msg1024 != null) {
		    // Encode extension 'msg1024'
		    try {
			OctetString item1 = data.msg1024;
			int len1 = item1.getSize();

			if (len1 != 74)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
			nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 74, 74, sink);
			nbits += coder.completeWrappedEncoding(sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("msg1024", "OCTET STRING");
			throw ee;
		    }
		}
		if (data.msg1025 != null) {
		    // Encode extension 'msg1025'
		    try {
			OctetString item1 = data.msg1025;
			int len1 = item1.getSize();

			if (len1 != 25)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
			nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 25, 25, sink);
			nbits += coder.completeWrappedEncoding(sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("msg1025", "OCTET STRING");
			throw ee;
		    }
		}
		if (data.msg1026 != null) {
		    // Encode extension 'msg1026'
		    try {
			OctetString item1 = data.msg1026;
			int len1 = item1.getSize();

			if (len1 != 30)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
			nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 30, 30, sink);
			nbits += coder.completeWrappedEncoding(sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("msg1026", "OCTET STRING");
			throw ee;
		    }
		}
		if (data.msg1027 != null) {
		    // Encode extension 'msg1027'
		    try {
			OctetString item1 = data.msg1027;
			int len1 = item1.getSize();

			if (len1 != 33)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
			nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 33, 33, sink);
			nbits += coder.completeWrappedEncoding(sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("msg1027", "OCTET STRING");
			throw ee;
		    }
		}
		if (data.msg1029 != null) {
		    // Encode extension 'msg1029'
		    try {
			OctetString item1 = data.msg1029;
			int len1 = item1.getSize();

			if (len1 < 10 || len1 > 69)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
			nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 10, 69, sink);
			nbits += coder.completeWrappedEncoding(sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("msg1029", "OCTET STRING");
			throw ee;
		    }
		}
		if (data.msg1030 != null) {
		    // Encode extension 'msg1030'
		    try {
			OctetString item1 = data.msg1030;
			int len1 = item1.getSize();

			if (len1 < 14 || len1 > 105)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
			nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 14, 105, sink);
			nbits += coder.completeWrappedEncoding(sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("msg1030", "OCTET STRING");
			throw ee;
		    }
		}
		if (data.msg1031 != null) {
		    // Encode extension 'msg1031'
		    try {
			OctetString item1 = data.msg1031;
			int len1 = item1.getSize();

			if (len1 < 15 || len1 > 107)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
			nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 15, 107, sink);
			nbits += coder.completeWrappedEncoding(sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("msg1031", "OCTET STRING");
			throw ee;
		    }
		}
		if (data.msg1032 != null) {
		    // Encode extension 'msg1032'
		    try {
			OctetString item1 = data.msg1032;
			int len1 = item1.getSize();

			if (len1 != 20)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
			nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 20, 20, sink);
			nbits += coder.completeWrappedEncoding(sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("msg1032", "OCTET STRING");
			throw ee;
		    }
		}
	    } finally {
		sink.close();
	    }
	    sink = bitstream0;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static RTCMPackage decodeValue(PerCoder coder, InputBitStream source, RTCMPackage data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_anchorPoint0 = source.readBit();
	boolean has_msg10010 = source.readBit();
	boolean has_msg10020 = source.readBit();
	boolean has_msg10030 = source.readBit();
	boolean has_msg10040 = source.readBit();
	boolean has_msg10050 = source.readBit();
	boolean has_msg10060 = source.readBit();
	boolean has_msg10070 = source.readBit();
	boolean has_msg10080 = source.readBit();
	boolean has_msg10090 = source.readBit();
	boolean has_msg10100 = source.readBit();
	boolean has_msg10110 = source.readBit();
	boolean has_msg10120 = source.readBit();
	boolean has_msg10130 = source.readBit();
    /** Decode root fields **/
	if (has_anchorPoint0) {
	    // Decode field 'anchorPoint'
	    try {
		if (data.anchorPoint == null)
		    data.anchorPoint = new FullPositionVector();
		data.anchorPoint.decodeValue(coder, source, data.anchorPoint);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("anchorPoint", "FullPositionVector");
		throw de;
	    }
	} else {
	    data.anchorPoint = null;
	}
	// Decode field 'rtcmHeader'
	try {
	    data.rtcmHeader = new RTCMHeader(com.oss.coders.per.PerOctets.decode(coder, source, 5, 5));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("rtcmHeader", "RTCMHeader");
	    throw de;
	}
	if (has_msg10010) {
	    // Decode field 'msg1001'
	    try {
		data.msg1001 = new OctetString(com.oss.coders.per.PerOctets.decode(coder, source, 16, 124));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("msg1001", "OCTET STRING");
		throw de;
	    }
	} else {
	    data.msg1001 = null;
	}
	if (has_msg10020) {
	    // Decode field 'msg1002'
	    try {
		data.msg1002 = new OctetString(com.oss.coders.per.PerOctets.decode(coder, source, 18, 156));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("msg1002", "OCTET STRING");
		throw de;
	    }
	} else {
	    data.msg1002 = null;
	}
	if (has_msg10030) {
	    // Decode field 'msg1003'
	    try {
		data.msg1003 = new OctetString(com.oss.coders.per.PerOctets.decode(coder, source, 21, 210));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("msg1003", "OCTET STRING");
		throw de;
	    }
	} else {
	    data.msg1003 = null;
	}
	if (has_msg10040) {
	    // Decode field 'msg1004'
	    try {
		data.msg1004 = new OctetString(com.oss.coders.per.PerOctets.decode(coder, source, 24, 258));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("msg1004", "OCTET STRING");
		throw de;
	    }
	} else {
	    data.msg1004 = null;
	}
	if (has_msg10050) {
	    // Decode field 'msg1005'
	    try {
		data.msg1005 = new OctetString(com.oss.coders.per.PerOctets.decode(coder, source, 19, 19));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("msg1005", "OCTET STRING");
		throw de;
	    }
	} else {
	    data.msg1005 = null;
	}
	if (has_msg10060) {
	    // Decode field 'msg1006'
	    try {
		data.msg1006 = new OctetString(com.oss.coders.per.PerOctets.decode(coder, source, 21, 21));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("msg1006", "OCTET STRING");
		throw de;
	    }
	} else {
	    data.msg1006 = null;
	}
	if (has_msg10070) {
	    // Decode field 'msg1007'
	    try {
		data.msg1007 = new OctetString(com.oss.coders.per.PerOctets.decode(coder, source, 5, 36));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("msg1007", "OCTET STRING");
		throw de;
	    }
	} else {
	    data.msg1007 = null;
	}
	if (has_msg10080) {
	    // Decode field 'msg1008'
	    try {
		data.msg1008 = new OctetString(com.oss.coders.per.PerOctets.decode(coder, source, 6, 68));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("msg1008", "OCTET STRING");
		throw de;
	    }
	} else {
	    data.msg1008 = null;
	}
	if (has_msg10090) {
	    // Decode field 'msg1009'
	    try {
		data.msg1009 = new OctetString(com.oss.coders.per.PerOctets.decode(coder, source, 16, 136));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("msg1009", "OCTET STRING");
		throw de;
	    }
	} else {
	    data.msg1009 = null;
	}
	if (has_msg10100) {
	    // Decode field 'msg1010'
	    try {
		data.msg1010 = new OctetString(com.oss.coders.per.PerOctets.decode(coder, source, 18, 166));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("msg1010", "OCTET STRING");
		throw de;
	    }
	} else {
	    data.msg1010 = null;
	}
	if (has_msg10110) {
	    // Decode field 'msg1011'
	    try {
		data.msg1011 = new OctetString(com.oss.coders.per.PerOctets.decode(coder, source, 21, 222));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("msg1011", "OCTET STRING");
		throw de;
	    }
	} else {
	    data.msg1011 = null;
	}
	if (has_msg10120) {
	    // Decode field 'msg1012'
	    try {
		data.msg1012 = new OctetString(com.oss.coders.per.PerOctets.decode(coder, source, 24, 268));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("msg1012", "OCTET STRING");
		throw de;
	    }
	} else {
	    data.msg1012 = null;
	}
	if (has_msg10130) {
	    // Decode field 'msg1013'
	    try {
		data.msg1013 = new OctetString(com.oss.coders.per.PerOctets.decode(coder, source, 13, 27));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("msg1013", "OCTET STRING");
		throw de;
	    }
	} else {
	    data.msg1013 = null;
	}
    /** Decode extensions **/
	if (!_has_extensions0) {
	    data.msg1014 = null;
	    data.msg1015 = null;
	    data.msg1016 = null;
	    data.msg1017 = null;
	    data.msg1019 = null;
	    data.msg1020 = null;
	    data.msg1021 = null;
	    data.msg1022 = null;
	    data.msg1023 = null;
	    data.msg1024 = null;
	    data.msg1025 = null;
	    data.msg1026 = null;
	    data.msg1027 = null;
	    data.msg1029 = null;
	    data.msg1030 = null;
	    data.msg1031 = null;
	    data.msg1032 = null;
	    return data;
	}
	len0 = coder.decodeNormallySmallLength(source);
	if (coder.moreFragments())
	    throw new DecoderException(com.oss.util.ExceptionDescriptor._too_many_ext_additions, null, "16384 or more");
	boolean has_msg10140 = len0 > 0 ? source.readBit() : false;
	boolean has_msg10150 = len0 > 1 ? source.readBit() : false;
	boolean has_msg10160 = len0 > 2 ? source.readBit() : false;
	boolean has_msg10170 = len0 > 3 ? source.readBit() : false;
	boolean has_msg10190 = len0 > 4 ? source.readBit() : false;
	boolean has_msg10200 = len0 > 5 ? source.readBit() : false;
	boolean has_msg10210 = len0 > 6 ? source.readBit() : false;
	boolean has_msg10220 = len0 > 7 ? source.readBit() : false;
	boolean has_msg10230 = len0 > 8 ? source.readBit() : false;
	boolean has_msg10240 = len0 > 9 ? source.readBit() : false;
	boolean has_msg10250 = len0 > 10 ? source.readBit() : false;
	boolean has_msg10260 = len0 > 11 ? source.readBit() : false;
	boolean has_msg10270 = len0 > 12 ? source.readBit() : false;
	boolean has_msg10290 = len0 > 13 ? source.readBit() : false;
	boolean has_msg10300 = len0 > 14 ? source.readBit() : false;
	boolean has_msg10310 = len0 > 15 ? source.readBit() : false;
	boolean has_msg10320 = len0 > 16 ? source.readBit() : false;
	int unknown_exts0 = 0;
	if (len0 > 17)
	    for (int idx0 = 0; idx0 < len0 - 17; idx0++) {
		if (source.readBit())
		    ++unknown_exts0;
	    }
    /** Decode extension fields **/
	bitstream0 = source;
	source = coder.createNestedStream(bitstream0);
	try {
	    if (has_msg10140) {
		// Decode extension 'msg1014'
		try {
		    data.msg1014 = new OctetString(com.oss.coders.per.PerOctets.decode(coder, source, 15, 15));
		    coder.completeWrappedEncoding(source);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("msg1014", "OCTET STRING");
		    throw de;
		}
	     } else {
		data.msg1014 = null;
	    }
	    if (has_msg10150) {
		// Decode extension 'msg1015'
		try {
		    data.msg1015 = new OctetString(com.oss.coders.per.PerOctets.decode(coder, source, 13, 69));
		    coder.completeWrappedEncoding(source);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("msg1015", "OCTET STRING");
		    throw de;
		}
	     } else {
		data.msg1015 = null;
	    }
	    if (has_msg10160) {
		// Decode extension 'msg1016'
		try {
		    data.msg1016 = new OctetString(com.oss.coders.per.PerOctets.decode(coder, source, 14, 81));
		    coder.completeWrappedEncoding(source);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("msg1016", "OCTET STRING");
		    throw de;
		}
	     } else {
		data.msg1016 = null;
	    }
	    if (has_msg10170) {
		// Decode extension 'msg1017'
		try {
		    data.msg1017 = new OctetString(com.oss.coders.per.PerOctets.decode(coder, source, 16, 115));
		    coder.completeWrappedEncoding(source);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("msg1017", "OCTET STRING");
		    throw de;
		}
	     } else {
		data.msg1017 = null;
	    }
	    if (has_msg10190) {
		// Decode extension 'msg1019'
		try {
		    data.msg1019 = new OctetString(com.oss.coders.per.PerOctets.decode(coder, source, 62, 62));
		    coder.completeWrappedEncoding(source);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("msg1019", "OCTET STRING");
		    throw de;
		}
	     } else {
		data.msg1019 = null;
	    }
	    if (has_msg10200) {
		// Decode extension 'msg1020'
		try {
		    data.msg1020 = new OctetString(com.oss.coders.per.PerOctets.decode(coder, source, 45, 45));
		    coder.completeWrappedEncoding(source);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("msg1020", "OCTET STRING");
		    throw de;
		}
	     } else {
		data.msg1020 = null;
	    }
	    if (has_msg10210) {
		// Decode extension 'msg1021'
		try {
		    data.msg1021 = new OctetString(com.oss.coders.per.PerOctets.decode(coder, source, 62, 62));
		    coder.completeWrappedEncoding(source);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("msg1021", "OCTET STRING");
		    throw de;
		}
	     } else {
		data.msg1021 = null;
	    }
	    if (has_msg10220) {
		// Decode extension 'msg1022'
		try {
		    data.msg1022 = new OctetString(com.oss.coders.per.PerOctets.decode(coder, source, 75, 75));
		    coder.completeWrappedEncoding(source);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("msg1022", "OCTET STRING");
		    throw de;
		}
	     } else {
		data.msg1022 = null;
	    }
	    if (has_msg10230) {
		// Decode extension 'msg1023'
		try {
		    data.msg1023 = new OctetString(com.oss.coders.per.PerOctets.decode(coder, source, 73, 73));
		    coder.completeWrappedEncoding(source);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("msg1023", "OCTET STRING");
		    throw de;
		}
	     } else {
		data.msg1023 = null;
	    }
	    if (has_msg10240) {
		// Decode extension 'msg1024'
		try {
		    data.msg1024 = new OctetString(com.oss.coders.per.PerOctets.decode(coder, source, 74, 74));
		    coder.completeWrappedEncoding(source);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("msg1024", "OCTET STRING");
		    throw de;
		}
	     } else {
		data.msg1024 = null;
	    }
	    if (has_msg10250) {
		// Decode extension 'msg1025'
		try {
		    data.msg1025 = new OctetString(com.oss.coders.per.PerOctets.decode(coder, source, 25, 25));
		    coder.completeWrappedEncoding(source);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("msg1025", "OCTET STRING");
		    throw de;
		}
	     } else {
		data.msg1025 = null;
	    }
	    if (has_msg10260) {
		// Decode extension 'msg1026'
		try {
		    data.msg1026 = new OctetString(com.oss.coders.per.PerOctets.decode(coder, source, 30, 30));
		    coder.completeWrappedEncoding(source);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("msg1026", "OCTET STRING");
		    throw de;
		}
	     } else {
		data.msg1026 = null;
	    }
	    if (has_msg10270) {
		// Decode extension 'msg1027'
		try {
		    data.msg1027 = new OctetString(com.oss.coders.per.PerOctets.decode(coder, source, 33, 33));
		    coder.completeWrappedEncoding(source);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("msg1027", "OCTET STRING");
		    throw de;
		}
	     } else {
		data.msg1027 = null;
	    }
	    if (has_msg10290) {
		// Decode extension 'msg1029'
		try {
		    data.msg1029 = new OctetString(com.oss.coders.per.PerOctets.decode(coder, source, 10, 69));
		    coder.completeWrappedEncoding(source);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("msg1029", "OCTET STRING");
		    throw de;
		}
	     } else {
		data.msg1029 = null;
	    }
	    if (has_msg10300) {
		// Decode extension 'msg1030'
		try {
		    data.msg1030 = new OctetString(com.oss.coders.per.PerOctets.decode(coder, source, 14, 105));
		    coder.completeWrappedEncoding(source);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("msg1030", "OCTET STRING");
		    throw de;
		}
	     } else {
		data.msg1030 = null;
	    }
	    if (has_msg10310) {
		// Decode extension 'msg1031'
		try {
		    data.msg1031 = new OctetString(com.oss.coders.per.PerOctets.decode(coder, source, 15, 107));
		    coder.completeWrappedEncoding(source);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("msg1031", "OCTET STRING");
		    throw de;
		}
	     } else {
		data.msg1031 = null;
	    }
	    if (has_msg10320) {
		// Decode extension 'msg1032'
		try {
		    data.msg1032 = new OctetString(com.oss.coders.per.PerOctets.decode(coder, source, 20, 20));
		    coder.completeWrappedEncoding(source);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("msg1032", "OCTET STRING");
		    throw de;
		}
	     } else {
		data.msg1032 = null;
	    }
	} finally {
	    source.close();
	}
	source = bitstream0;
	for (int idx0 = 0; idx0 < unknown_exts0; idx0++) {
	    try {
		com.oss.coders.per.PerOctets.skip(coder, source);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendExtensionContext(null, idx0);
		throw de;
	    }
	}
	return data;
    }

    /**
     * Implements JSON value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public void encodeValue(JsonCoder coder, JsonWriter sink)
	    throws IOException, EncoderException
    {
	String separator0 = null;

	sink.beginObject();
	// Encode field 'anchorPoint'
	try {
	    FullPositionVector item1 = this.anchorPoint;

	    if (item1 != null) {
		{
		    separator0 = ",";
		    sink.encodeKey("anchorPoint");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "anchorPoint");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("anchorPoint", "FullPositionVector");
	    throw ee;
	}
	// Encode field 'rtcmHeader'
	try {
	    RTCMHeader item1 = this.rtcmHeader;

	    {
		sink.writeSeparator(separator0);
		sink.encodeKey("rtcmHeader");
		sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("rtcmHeader", "RTCMHeader");
	    throw ee;
	}
	// Encode field 'msg1001'
	try {
	    OctetString item1 = this.msg1001;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("msg1001");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "msg1001");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msg1001", "OCTET STRING");
	    throw ee;
	}
	// Encode field 'msg1002'
	try {
	    OctetString item1 = this.msg1002;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("msg1002");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "msg1002");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msg1002", "OCTET STRING");
	    throw ee;
	}
	// Encode field 'msg1003'
	try {
	    OctetString item1 = this.msg1003;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("msg1003");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "msg1003");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msg1003", "OCTET STRING");
	    throw ee;
	}
	// Encode field 'msg1004'
	try {
	    OctetString item1 = this.msg1004;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("msg1004");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "msg1004");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msg1004", "OCTET STRING");
	    throw ee;
	}
	// Encode field 'msg1005'
	try {
	    OctetString item1 = this.msg1005;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("msg1005");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "msg1005");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msg1005", "OCTET STRING");
	    throw ee;
	}
	// Encode field 'msg1006'
	try {
	    OctetString item1 = this.msg1006;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("msg1006");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "msg1006");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msg1006", "OCTET STRING");
	    throw ee;
	}
	// Encode field 'msg1007'
	try {
	    OctetString item1 = this.msg1007;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("msg1007");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "msg1007");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msg1007", "OCTET STRING");
	    throw ee;
	}
	// Encode field 'msg1008'
	try {
	    OctetString item1 = this.msg1008;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("msg1008");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "msg1008");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msg1008", "OCTET STRING");
	    throw ee;
	}
	// Encode field 'msg1009'
	try {
	    OctetString item1 = this.msg1009;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("msg1009");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "msg1009");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msg1009", "OCTET STRING");
	    throw ee;
	}
	// Encode field 'msg1010'
	try {
	    OctetString item1 = this.msg1010;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("msg1010");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "msg1010");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msg1010", "OCTET STRING");
	    throw ee;
	}
	// Encode field 'msg1011'
	try {
	    OctetString item1 = this.msg1011;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("msg1011");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "msg1011");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msg1011", "OCTET STRING");
	    throw ee;
	}
	// Encode field 'msg1012'
	try {
	    OctetString item1 = this.msg1012;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("msg1012");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "msg1012");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msg1012", "OCTET STRING");
	    throw ee;
	}
	// Encode field 'msg1013'
	try {
	    OctetString item1 = this.msg1013;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("msg1013");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "msg1013");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msg1013", "OCTET STRING");
	    throw ee;
	}
	// Encode extension 'msg1014'
	try {
	    OctetString item1 = this.msg1014;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("msg1014");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "msg1014");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msg1014", "OCTET STRING");
	    throw ee;
	}
	// Encode extension 'msg1015'
	try {
	    OctetString item1 = this.msg1015;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("msg1015");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "msg1015");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msg1015", "OCTET STRING");
	    throw ee;
	}
	// Encode extension 'msg1016'
	try {
	    OctetString item1 = this.msg1016;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("msg1016");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "msg1016");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msg1016", "OCTET STRING");
	    throw ee;
	}
	// Encode extension 'msg1017'
	try {
	    OctetString item1 = this.msg1017;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("msg1017");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "msg1017");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msg1017", "OCTET STRING");
	    throw ee;
	}
	// Encode extension 'msg1019'
	try {
	    OctetString item1 = this.msg1019;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("msg1019");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "msg1019");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msg1019", "OCTET STRING");
	    throw ee;
	}
	// Encode extension 'msg1020'
	try {
	    OctetString item1 = this.msg1020;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("msg1020");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "msg1020");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msg1020", "OCTET STRING");
	    throw ee;
	}
	// Encode extension 'msg1021'
	try {
	    OctetString item1 = this.msg1021;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("msg1021");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "msg1021");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msg1021", "OCTET STRING");
	    throw ee;
	}
	// Encode extension 'msg1022'
	try {
	    OctetString item1 = this.msg1022;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("msg1022");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "msg1022");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msg1022", "OCTET STRING");
	    throw ee;
	}
	// Encode extension 'msg1023'
	try {
	    OctetString item1 = this.msg1023;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("msg1023");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "msg1023");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msg1023", "OCTET STRING");
	    throw ee;
	}
	// Encode extension 'msg1024'
	try {
	    OctetString item1 = this.msg1024;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("msg1024");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "msg1024");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msg1024", "OCTET STRING");
	    throw ee;
	}
	// Encode extension 'msg1025'
	try {
	    OctetString item1 = this.msg1025;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("msg1025");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "msg1025");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msg1025", "OCTET STRING");
	    throw ee;
	}
	// Encode extension 'msg1026'
	try {
	    OctetString item1 = this.msg1026;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("msg1026");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "msg1026");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msg1026", "OCTET STRING");
	    throw ee;
	}
	// Encode extension 'msg1027'
	try {
	    OctetString item1 = this.msg1027;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("msg1027");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "msg1027");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msg1027", "OCTET STRING");
	    throw ee;
	}
	// Encode extension 'msg1029'
	try {
	    OctetString item1 = this.msg1029;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("msg1029");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "msg1029");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msg1029", "OCTET STRING");
	    throw ee;
	}
	// Encode extension 'msg1030'
	try {
	    OctetString item1 = this.msg1030;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("msg1030");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "msg1030");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msg1030", "OCTET STRING");
	    throw ee;
	}
	// Encode extension 'msg1031'
	try {
	    OctetString item1 = this.msg1031;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("msg1031");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "msg1031");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msg1031", "OCTET STRING");
	    throw ee;
	}
	// Encode extension 'msg1032'
	try {
	    OctetString item1 = this.msg1032;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("msg1032");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "msg1032");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msg1032", "OCTET STRING");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public RTCMPackage decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[33];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		RTCMPackage.__Tag t_tag0 = RTCMPackage.__Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = RTCMPackage.__Tag._null_;
		switch (t_tag0) {
		    case __anchorPoint:
		    // Decode field 'anchorPoint'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[0])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.anchorPoint == null)
				this.anchorPoint = new FullPositionVector();
			    this.anchorPoint.decodeValue(coder, source);
			    present0[0] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("anchorPoint", "FullPositionVector");
			throw de;
		    }
		    break;
		    case __rtcmHeader:
		    // Decode field 'rtcmHeader'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			this.rtcmHeader = new RTCMHeader(coder.decodeOctetString(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("rtcmHeader", "RTCMHeader");
			throw de;
		    }
		    break;
		    case __msg1001:
		    // Decode field 'msg1001'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.msg1001 = new OctetString(coder.decodeOctetString(source));
			    present0[2] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("msg1001", "OCTET STRING");
			throw de;
		    }
		    break;
		    case __msg1002:
		    // Decode field 'msg1002'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.msg1002 = new OctetString(coder.decodeOctetString(source));
			    present0[3] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("msg1002", "OCTET STRING");
			throw de;
		    }
		    break;
		    case __msg1003:
		    // Decode field 'msg1003'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[4])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.msg1003 = new OctetString(coder.decodeOctetString(source));
			    present0[4] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("msg1003", "OCTET STRING");
			throw de;
		    }
		    break;
		    case __msg1004:
		    // Decode field 'msg1004'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[5])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.msg1004 = new OctetString(coder.decodeOctetString(source));
			    present0[5] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("msg1004", "OCTET STRING");
			throw de;
		    }
		    break;
		    case __msg1005:
		    // Decode field 'msg1005'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[6])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.msg1005 = new OctetString(coder.decodeOctetString(source));
			    present0[6] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("msg1005", "OCTET STRING");
			throw de;
		    }
		    break;
		    case __msg1006:
		    // Decode field 'msg1006'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[7])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.msg1006 = new OctetString(coder.decodeOctetString(source));
			    present0[7] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("msg1006", "OCTET STRING");
			throw de;
		    }
		    break;
		    case __msg1007:
		    // Decode field 'msg1007'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[8])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.msg1007 = new OctetString(coder.decodeOctetString(source));
			    present0[8] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("msg1007", "OCTET STRING");
			throw de;
		    }
		    break;
		    case __msg1008:
		    // Decode field 'msg1008'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[9])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.msg1008 = new OctetString(coder.decodeOctetString(source));
			    present0[9] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("msg1008", "OCTET STRING");
			throw de;
		    }
		    break;
		    case __msg1009:
		    // Decode field 'msg1009'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[10])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.msg1009 = new OctetString(coder.decodeOctetString(source));
			    present0[10] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("msg1009", "OCTET STRING");
			throw de;
		    }
		    break;
		    case __msg1010:
		    // Decode field 'msg1010'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[11])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.msg1010 = new OctetString(coder.decodeOctetString(source));
			    present0[11] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("msg1010", "OCTET STRING");
			throw de;
		    }
		    break;
		    case __msg1011:
		    // Decode field 'msg1011'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[12])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.msg1011 = new OctetString(coder.decodeOctetString(source));
			    present0[12] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("msg1011", "OCTET STRING");
			throw de;
		    }
		    break;
		    case __msg1012:
		    // Decode field 'msg1012'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[13])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.msg1012 = new OctetString(coder.decodeOctetString(source));
			    present0[13] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("msg1012", "OCTET STRING");
			throw de;
		    }
		    break;
		    case __msg1013:
		    // Decode field 'msg1013'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[14])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.msg1013 = new OctetString(coder.decodeOctetString(source));
			    present0[14] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("msg1013", "OCTET STRING");
			throw de;
		    }
		    break;
		    case __msg1014:
		    // Decode extension 'msg1014'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[15])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.msg1014 = new OctetString(coder.decodeOctetString(source));
			    present0[15] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("msg1014", "OCTET STRING");
			throw de;
		    }
		    break;
		    case __msg1015:
		    // Decode extension 'msg1015'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[16])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.msg1015 = new OctetString(coder.decodeOctetString(source));
			    present0[16] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("msg1015", "OCTET STRING");
			throw de;
		    }
		    break;
		    case __msg1016:
		    // Decode extension 'msg1016'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[17])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.msg1016 = new OctetString(coder.decodeOctetString(source));
			    present0[17] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("msg1016", "OCTET STRING");
			throw de;
		    }
		    break;
		    case __msg1017:
		    // Decode extension 'msg1017'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[18])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.msg1017 = new OctetString(coder.decodeOctetString(source));
			    present0[18] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("msg1017", "OCTET STRING");
			throw de;
		    }
		    break;
		    case __msg1019:
		    // Decode extension 'msg1019'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[19])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.msg1019 = new OctetString(coder.decodeOctetString(source));
			    present0[19] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("msg1019", "OCTET STRING");
			throw de;
		    }
		    break;
		    case __msg1020:
		    // Decode extension 'msg1020'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[20])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.msg1020 = new OctetString(coder.decodeOctetString(source));
			    present0[20] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("msg1020", "OCTET STRING");
			throw de;
		    }
		    break;
		    case __msg1021:
		    // Decode extension 'msg1021'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[21])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.msg1021 = new OctetString(coder.decodeOctetString(source));
			    present0[21] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("msg1021", "OCTET STRING");
			throw de;
		    }
		    break;
		    case __msg1022:
		    // Decode extension 'msg1022'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[22])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.msg1022 = new OctetString(coder.decodeOctetString(source));
			    present0[22] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("msg1022", "OCTET STRING");
			throw de;
		    }
		    break;
		    case __msg1023:
		    // Decode extension 'msg1023'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[23])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.msg1023 = new OctetString(coder.decodeOctetString(source));
			    present0[23] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("msg1023", "OCTET STRING");
			throw de;
		    }
		    break;
		    case __msg1024:
		    // Decode extension 'msg1024'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[24])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.msg1024 = new OctetString(coder.decodeOctetString(source));
			    present0[24] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("msg1024", "OCTET STRING");
			throw de;
		    }
		    break;
		    case __msg1025:
		    // Decode extension 'msg1025'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[25])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.msg1025 = new OctetString(coder.decodeOctetString(source));
			    present0[25] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("msg1025", "OCTET STRING");
			throw de;
		    }
		    break;
		    case __msg1026:
		    // Decode extension 'msg1026'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[26])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.msg1026 = new OctetString(coder.decodeOctetString(source));
			    present0[26] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("msg1026", "OCTET STRING");
			throw de;
		    }
		    break;
		    case __msg1027:
		    // Decode extension 'msg1027'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[27])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.msg1027 = new OctetString(coder.decodeOctetString(source));
			    present0[27] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("msg1027", "OCTET STRING");
			throw de;
		    }
		    break;
		    case __msg1029:
		    // Decode extension 'msg1029'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[28])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.msg1029 = new OctetString(coder.decodeOctetString(source));
			    present0[28] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("msg1029", "OCTET STRING");
			throw de;
		    }
		    break;
		    case __msg1030:
		    // Decode extension 'msg1030'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[29])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.msg1030 = new OctetString(coder.decodeOctetString(source));
			    present0[29] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("msg1030", "OCTET STRING");
			throw de;
		    }
		    break;
		    case __msg1031:
		    // Decode extension 'msg1031'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[30])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.msg1031 = new OctetString(coder.decodeOctetString(source));
			    present0[30] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("msg1031", "OCTET STRING");
			throw de;
		    }
		    break;
		    case __msg1032:
		    // Decode extension 'msg1032'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[31])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.msg1032 = new OctetString(coder.decodeOctetString(source));
			    present0[31] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("msg1032", "OCTET STRING");
			throw de;
		    }
		    break;
		    default:
			coder.skipValue(source);
			break;
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    this.anchorPoint = null;
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'rtcmHeader'");
	if (!present0[2])
	    this.msg1001 = null;
	if (!present0[3])
	    this.msg1002 = null;
	if (!present0[4])
	    this.msg1003 = null;
	if (!present0[5])
	    this.msg1004 = null;
	if (!present0[6])
	    this.msg1005 = null;
	if (!present0[7])
	    this.msg1006 = null;
	if (!present0[8])
	    this.msg1007 = null;
	if (!present0[9])
	    this.msg1008 = null;
	if (!present0[10])
	    this.msg1009 = null;
	if (!present0[11])
	    this.msg1010 = null;
	if (!present0[12])
	    this.msg1011 = null;
	if (!present0[13])
	    this.msg1012 = null;
	if (!present0[14])
	    this.msg1013 = null;
	if (!present0[15])
	    this.msg1014 = null;
	if (!present0[16])
	    this.msg1015 = null;
	if (!present0[17])
	    this.msg1016 = null;
	if (!present0[18])
	    this.msg1017 = null;
	if (!present0[19])
	    this.msg1019 = null;
	if (!present0[20])
	    this.msg1020 = null;
	if (!present0[21])
	    this.msg1021 = null;
	if (!present0[22])
	    this.msg1022 = null;
	if (!present0[23])
	    this.msg1023 = null;
	if (!present0[24])
	    this.msg1024 = null;
	if (!present0[25])
	    this.msg1025 = null;
	if (!present0[26])
	    this.msg1026 = null;
	if (!present0[27])
	    this.msg1027 = null;
	if (!present0[28])
	    this.msg1029 = null;
	if (!present0[29])
	    this.msg1030 = null;
	if (!present0[30])
	    this.msg1031 = null;
	if (!present0[31])
	    this.msg1032 = null;
	return this;
    }

    /**
     * Implements value printer for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public void printValue(DataPrinter printer, java.io.PrintWriter writer)
	    throws Exception
    {
	boolean comma0;
	comma0 = false;
	writer.print('{');
	printer.indent();
	if (this.anchorPoint != null) {
	    try {
		comma0 = true;
		printer.newLine(writer);
		writer.print("anchorPoint ");
		this.anchorPoint.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("rtcmHeader ");
	    printer.print(this.rtcmHeader, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.msg1001 != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("msg1001 ");
		printer.print(this.msg1001, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.msg1002 != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("msg1002 ");
		printer.print(this.msg1002, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.msg1003 != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("msg1003 ");
		printer.print(this.msg1003, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.msg1004 != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("msg1004 ");
		printer.print(this.msg1004, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.msg1005 != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("msg1005 ");
		printer.print(this.msg1005, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.msg1006 != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("msg1006 ");
		printer.print(this.msg1006, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.msg1007 != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("msg1007 ");
		printer.print(this.msg1007, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.msg1008 != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("msg1008 ");
		printer.print(this.msg1008, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.msg1009 != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("msg1009 ");
		printer.print(this.msg1009, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.msg1010 != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("msg1010 ");
		printer.print(this.msg1010, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.msg1011 != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("msg1011 ");
		printer.print(this.msg1011, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.msg1012 != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("msg1012 ");
		printer.print(this.msg1012, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.msg1013 != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("msg1013 ");
		printer.print(this.msg1013, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.msg1014 != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("msg1014 ");
		printer.print(this.msg1014, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.msg1015 != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("msg1015 ");
		printer.print(this.msg1015, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.msg1016 != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("msg1016 ");
		printer.print(this.msg1016, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.msg1017 != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("msg1017 ");
		printer.print(this.msg1017, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.msg1019 != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("msg1019 ");
		printer.print(this.msg1019, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.msg1020 != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("msg1020 ");
		printer.print(this.msg1020, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.msg1021 != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("msg1021 ");
		printer.print(this.msg1021, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.msg1022 != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("msg1022 ");
		printer.print(this.msg1022, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.msg1023 != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("msg1023 ");
		printer.print(this.msg1023, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.msg1024 != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("msg1024 ");
		printer.print(this.msg1024, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.msg1025 != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("msg1025 ");
		printer.print(this.msg1025, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.msg1026 != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("msg1026 ");
		printer.print(this.msg1026, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.msg1027 != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("msg1027 ");
		printer.print(this.msg1027, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.msg1029 != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("msg1029 ");
		printer.print(this.msg1029, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.msg1030 != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("msg1030 ");
		printer.print(this.msg1030, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.msg1031 != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("msg1031 ");
		printer.print(this.msg1031, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.msg1032 != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("msg1032 ");
		printer.print(this.msg1032, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	printer.undent();
	printer.newLine(writer);
	writer.print('}');
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((RTCMPackage)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((RTCMPackage)that);
    }
    
    public boolean equalTo(RTCMPackage that) {
	if (this.anchorPoint != null && that.anchorPoint != null) {
	    if (!this.anchorPoint.equalTo(that.anchorPoint))
		return false;
	}
	if (!this.rtcmHeader.equalTo(that.rtcmHeader))
	    return false;
	if (this.msg1001 != null && that.msg1001 != null) {
	    if (!this.msg1001.equalTo(that.msg1001))
		return false;
	}
	if (this.msg1002 != null && that.msg1002 != null) {
	    if (!this.msg1002.equalTo(that.msg1002))
		return false;
	}
	if (this.msg1003 != null && that.msg1003 != null) {
	    if (!this.msg1003.equalTo(that.msg1003))
		return false;
	}
	if (this.msg1004 != null && that.msg1004 != null) {
	    if (!this.msg1004.equalTo(that.msg1004))
		return false;
	}
	if (this.msg1005 != null && that.msg1005 != null) {
	    if (!this.msg1005.equalTo(that.msg1005))
		return false;
	}
	if (this.msg1006 != null && that.msg1006 != null) {
	    if (!this.msg1006.equalTo(that.msg1006))
		return false;
	}
	if (this.msg1007 != null && that.msg1007 != null) {
	    if (!this.msg1007.equalTo(that.msg1007))
		return false;
	}
	if (this.msg1008 != null && that.msg1008 != null) {
	    if (!this.msg1008.equalTo(that.msg1008))
		return false;
	}
	if (this.msg1009 != null && that.msg1009 != null) {
	    if (!this.msg1009.equalTo(that.msg1009))
		return false;
	}
	if (this.msg1010 != null && that.msg1010 != null) {
	    if (!this.msg1010.equalTo(that.msg1010))
		return false;
	}
	if (this.msg1011 != null && that.msg1011 != null) {
	    if (!this.msg1011.equalTo(that.msg1011))
		return false;
	}
	if (this.msg1012 != null && that.msg1012 != null) {
	    if (!this.msg1012.equalTo(that.msg1012))
		return false;
	}
	if (this.msg1013 != null && that.msg1013 != null) {
	    if (!this.msg1013.equalTo(that.msg1013))
		return false;
	}
	if (this.msg1014 != null && that.msg1014 != null) {
	    if (!this.msg1014.equalTo(that.msg1014))
		return false;
	}
	if (this.msg1015 != null && that.msg1015 != null) {
	    if (!this.msg1015.equalTo(that.msg1015))
		return false;
	}
	if (this.msg1016 != null && that.msg1016 != null) {
	    if (!this.msg1016.equalTo(that.msg1016))
		return false;
	}
	if (this.msg1017 != null && that.msg1017 != null) {
	    if (!this.msg1017.equalTo(that.msg1017))
		return false;
	}
	if (this.msg1019 != null && that.msg1019 != null) {
	    if (!this.msg1019.equalTo(that.msg1019))
		return false;
	}
	if (this.msg1020 != null && that.msg1020 != null) {
	    if (!this.msg1020.equalTo(that.msg1020))
		return false;
	}
	if (this.msg1021 != null && that.msg1021 != null) {
	    if (!this.msg1021.equalTo(that.msg1021))
		return false;
	}
	if (this.msg1022 != null && that.msg1022 != null) {
	    if (!this.msg1022.equalTo(that.msg1022))
		return false;
	}
	if (this.msg1023 != null && that.msg1023 != null) {
	    if (!this.msg1023.equalTo(that.msg1023))
		return false;
	}
	if (this.msg1024 != null && that.msg1024 != null) {
	    if (!this.msg1024.equalTo(that.msg1024))
		return false;
	}
	if (this.msg1025 != null && that.msg1025 != null) {
	    if (!this.msg1025.equalTo(that.msg1025))
		return false;
	}
	if (this.msg1026 != null && that.msg1026 != null) {
	    if (!this.msg1026.equalTo(that.msg1026))
		return false;
	}
	if (this.msg1027 != null && that.msg1027 != null) {
	    if (!this.msg1027.equalTo(that.msg1027))
		return false;
	}
	if (this.msg1029 != null && that.msg1029 != null) {
	    if (!this.msg1029.equalTo(that.msg1029))
		return false;
	}
	if (this.msg1030 != null && that.msg1030 != null) {
	    if (!this.msg1030.equalTo(that.msg1030))
		return false;
	}
	if (this.msg1031 != null && that.msg1031 != null) {
	    if (!this.msg1031.equalTo(that.msg1031))
		return false;
	}
	if (this.msg1032 != null && that.msg1032 != null) {
	    if (!this.msg1032.equalTo(that.msg1032))
		return false;
	}
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public RTCMPackage clone() {
	RTCMPackage copy = (RTCMPackage)super.clone();
	if (anchorPoint != null) {
	    copy.anchorPoint = anchorPoint.clone();
	}
	copy.rtcmHeader = rtcmHeader.clone();
	if (msg1001 != null) {
	    copy.msg1001 = msg1001.clone();
	}
	if (msg1002 != null) {
	    copy.msg1002 = msg1002.clone();
	}
	if (msg1003 != null) {
	    copy.msg1003 = msg1003.clone();
	}
	if (msg1004 != null) {
	    copy.msg1004 = msg1004.clone();
	}
	if (msg1005 != null) {
	    copy.msg1005 = msg1005.clone();
	}
	if (msg1006 != null) {
	    copy.msg1006 = msg1006.clone();
	}
	if (msg1007 != null) {
	    copy.msg1007 = msg1007.clone();
	}
	if (msg1008 != null) {
	    copy.msg1008 = msg1008.clone();
	}
	if (msg1009 != null) {
	    copy.msg1009 = msg1009.clone();
	}
	if (msg1010 != null) {
	    copy.msg1010 = msg1010.clone();
	}
	if (msg1011 != null) {
	    copy.msg1011 = msg1011.clone();
	}
	if (msg1012 != null) {
	    copy.msg1012 = msg1012.clone();
	}
	if (msg1013 != null) {
	    copy.msg1013 = msg1013.clone();
	}
	if (msg1014 != null) {
	    copy.msg1014 = msg1014.clone();
	}
	if (msg1015 != null) {
	    copy.msg1015 = msg1015.clone();
	}
	if (msg1016 != null) {
	    copy.msg1016 = msg1016.clone();
	}
	if (msg1017 != null) {
	    copy.msg1017 = msg1017.clone();
	}
	if (msg1019 != null) {
	    copy.msg1019 = msg1019.clone();
	}
	if (msg1020 != null) {
	    copy.msg1020 = msg1020.clone();
	}
	if (msg1021 != null) {
	    copy.msg1021 = msg1021.clone();
	}
	if (msg1022 != null) {
	    copy.msg1022 = msg1022.clone();
	}
	if (msg1023 != null) {
	    copy.msg1023 = msg1023.clone();
	}
	if (msg1024 != null) {
	    copy.msg1024 = msg1024.clone();
	}
	if (msg1025 != null) {
	    copy.msg1025 = msg1025.clone();
	}
	if (msg1026 != null) {
	    copy.msg1026 = msg1026.clone();
	}
	if (msg1027 != null) {
	    copy.msg1027 = msg1027.clone();
	}
	if (msg1029 != null) {
	    copy.msg1029 = msg1029.clone();
	}
	if (msg1030 != null) {
	    copy.msg1030 = msg1030.clone();
	}
	if (msg1031 != null) {
	    copy.msg1031 = msg1031.clone();
	}
	if (msg1032 != null) {
	    copy.msg1032 = msg1032.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.anchorPoint != null ? this.anchorPoint.hashCode() : 0);
	hash = 41 * hash + (this.rtcmHeader != null ? this.rtcmHeader.hashCode() : 0);
	hash = 41 * hash + (this.msg1001 != null ? this.msg1001.hashCode() : 0);
	hash = 41 * hash + (this.msg1002 != null ? this.msg1002.hashCode() : 0);
	hash = 41 * hash + (this.msg1003 != null ? this.msg1003.hashCode() : 0);
	hash = 41 * hash + (this.msg1004 != null ? this.msg1004.hashCode() : 0);
	hash = 41 * hash + (this.msg1005 != null ? this.msg1005.hashCode() : 0);
	hash = 41 * hash + (this.msg1006 != null ? this.msg1006.hashCode() : 0);
	hash = 41 * hash + (this.msg1007 != null ? this.msg1007.hashCode() : 0);
	hash = 41 * hash + (this.msg1008 != null ? this.msg1008.hashCode() : 0);
	hash = 41 * hash + (this.msg1009 != null ? this.msg1009.hashCode() : 0);
	hash = 41 * hash + (this.msg1010 != null ? this.msg1010.hashCode() : 0);
	hash = 41 * hash + (this.msg1011 != null ? this.msg1011.hashCode() : 0);
	hash = 41 * hash + (this.msg1012 != null ? this.msg1012.hashCode() : 0);
	hash = 41 * hash + (this.msg1013 != null ? this.msg1013.hashCode() : 0);
	hash = 41 * hash + (this.msg1014 != null ? this.msg1014.hashCode() : 0);
	hash = 41 * hash + (this.msg1015 != null ? this.msg1015.hashCode() : 0);
	hash = 41 * hash + (this.msg1016 != null ? this.msg1016.hashCode() : 0);
	hash = 41 * hash + (this.msg1017 != null ? this.msg1017.hashCode() : 0);
	hash = 41 * hash + (this.msg1019 != null ? this.msg1019.hashCode() : 0);
	hash = 41 * hash + (this.msg1020 != null ? this.msg1020.hashCode() : 0);
	hash = 41 * hash + (this.msg1021 != null ? this.msg1021.hashCode() : 0);
	hash = 41 * hash + (this.msg1022 != null ? this.msg1022.hashCode() : 0);
	hash = 41 * hash + (this.msg1023 != null ? this.msg1023.hashCode() : 0);
	hash = 41 * hash + (this.msg1024 != null ? this.msg1024.hashCode() : 0);
	hash = 41 * hash + (this.msg1025 != null ? this.msg1025.hashCode() : 0);
	hash = 41 * hash + (this.msg1026 != null ? this.msg1026.hashCode() : 0);
	hash = 41 * hash + (this.msg1027 != null ? this.msg1027.hashCode() : 0);
	hash = 41 * hash + (this.msg1029 != null ? this.msg1029.hashCode() : 0);
	hash = 41 * hash + (this.msg1030 != null ? this.msg1030.hashCode() : 0);
	hash = 41 * hash + (this.msg1031 != null ? this.msg1031.hashCode() : 0);
	hash = 41 * hash + (this.msg1032 != null ? this.msg1032.hashCode() : 0);
	return hash;
    }
} // End class definition for RTCMPackage
