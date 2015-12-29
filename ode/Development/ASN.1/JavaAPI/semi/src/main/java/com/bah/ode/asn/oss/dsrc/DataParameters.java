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
 * Define the ASN1 Type DataParameters from ASN1 Module DSRC.
 * @see Sequence
 */

public class DataParameters extends Sequence {
    public IA5String processMethod;
    public IA5String processAgency;
    public IA5String lastCheckedDate;
    public IA5String geiodUsed;
    
    /**
     * The default constructor.
     */
    public DataParameters()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DataParameters(IA5String processMethod, IA5String processAgency, 
		    IA5String lastCheckedDate, IA5String geiodUsed)
    {
	setProcessMethod(processMethod);
	setProcessAgency(processAgency);
	setLastCheckedDate(lastCheckedDate);
	setGeiodUsed(geiodUsed);
    }
    
    
    // Methods for field "processMethod"
    public IA5String getProcessMethod()
    {
	return this.processMethod;
    }
    
    public void setProcessMethod(IA5String processMethod)
    {
	this.processMethod = processMethod;
    }
    
    public boolean hasProcessMethod()
    {
	return (processMethod != null);
    }
    
    public void deleteProcessMethod()
    {
	processMethod = null;
    }
    
    
    // Methods for field "processAgency"
    public IA5String getProcessAgency()
    {
	return this.processAgency;
    }
    
    public void setProcessAgency(IA5String processAgency)
    {
	this.processAgency = processAgency;
    }
    
    public boolean hasProcessAgency()
    {
	return (processAgency != null);
    }
    
    public void deleteProcessAgency()
    {
	processAgency = null;
    }
    
    
    // Methods for field "lastCheckedDate"
    public IA5String getLastCheckedDate()
    {
	return this.lastCheckedDate;
    }
    
    public void setLastCheckedDate(IA5String lastCheckedDate)
    {
	this.lastCheckedDate = lastCheckedDate;
    }
    
    public boolean hasLastCheckedDate()
    {
	return (lastCheckedDate != null);
    }
    
    public void deleteLastCheckedDate()
    {
	lastCheckedDate = null;
    }
    
    
    // Methods for field "geiodUsed"
    public IA5String getGeiodUsed()
    {
	return this.geiodUsed;
    }
    
    public void setGeiodUsed(IA5String geiodUsed)
    {
	this.geiodUsed = geiodUsed;
    }
    
    public boolean hasGeiodUsed()
    {
	return (geiodUsed != null);
    }
    
    public void deleteGeiodUsed()
    {
	geiodUsed = null;
    }
    
    
    /**
     * Effective permitted alphabet (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public static final EPAInfo _cEPAInfo_processMethod = 
	IA5StringPAInfo.paInfo;
    
    /**
     * Effective permitted alphabet (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public static final EPAInfo _cEPAInfo_processAgency = 
	IA5StringPAInfo.paInfo;
    
    /**
     * Effective permitted alphabet (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public static final EPAInfo _cEPAInfo_lastCheckedDate = 
	IA5StringPAInfo.paInfo;
    
    /**
     * Effective permitted alphabet (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public static final EPAInfo _cEPAInfo_geiodUsed = 
	IA5StringPAInfo.paInfo;
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     */
    public static enum __Tag
    {
	__processMethod("processMethod"),
	__processAgency("processAgency"),
	__lastCheckedDate("lastCheckedDate"),
	__geiodUsed("geiodUsed"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(5);
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
	DataParameters temp0 = this;

	if (temp0.geiodUsed != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeString1(temp0.geiodUsed, sink), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("geiodUsed", "IA5String");
		throw ee;
	    }
	}
	if (temp0.lastCheckedDate != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeString1(temp0.lastCheckedDate, sink), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("lastCheckedDate", "IA5String");
		throw ee;
	    }
	}
	if (temp0.processAgency != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeString1(temp0.processAgency, sink), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("processAgency", "IA5String");
		throw ee;
	    }
	}
	if (temp0.processMethod != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeString1(temp0.processMethod, sink), 0x80);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("processMethod", "IA5String");
		throw ee;
	    }
	}

	return len0;
    }

    /**
     * Implements BER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public DataParameters decodeValue(BerCoder coder, DecoderInput source)
	    throws DecoderException
    {
	int total_len0 = source.mLength;
	int end_pos0 = (total_len0 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len0);
	int tag;

	do {
	    if (source.position() >= end_pos0)
		break;
	    tag = source.decodeTagLength();
	    if (tag == 0)
		break;
	    if (tag == 0x80 || tag == 0xA0) {
		try {
		    this.processMethod = new IA5String(coder.decodeChars(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("processMethod", "IA5String");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x81 || tag == 0xA1) {
		try {
		    this.processAgency = new IA5String(coder.decodeChars(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("processAgency", "IA5String");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x82 || tag == 0xA2) {
		try {
		    this.lastCheckedDate = new IA5String(coder.decodeChars(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("lastCheckedDate", "IA5String");
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
		    this.geiodUsed = new IA5String(coder.decodeChars(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("geiodUsed", "IA5String");
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
		    ee.appendExtensionContext("DataParameters", -1);
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
	DataParameters temp0 = this;

	if (temp0.geiodUsed != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeString1(temp0.geiodUsed, sink), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("geiodUsed", "IA5String");
		throw ee;
	    }
	}
	if (temp0.lastCheckedDate != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeString1(temp0.lastCheckedDate, sink), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("lastCheckedDate", "IA5String");
		throw ee;
	    }
	}
	if (temp0.processAgency != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeString1(temp0.processAgency, sink), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("processAgency", "IA5String");
		throw ee;
	    }
	}
	if (temp0.processMethod != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeString1(temp0.processMethod, sink), 0x80);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("processMethod", "IA5String");
		throw ee;
	    }
	}

	return len0;
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, DataParameters data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.processMethod != null);
	sink.writeBit(data.processAgency != null);
	sink.writeBit(data.lastCheckedDate != null);
	sink.writeBit(data.geiodUsed != null);
	nbits += 5;
	if (data.processMethod != null) {
	    // Encode field 'processMethod'
	    try {
		IA5String item1 = data.processMethod;
		int len1 = item1.getSize();

		if (len1 < 1 || len1 > 255)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerKMCString.encode(coder, item1.stringValue(), 1, 255, DataParameters._cEPAInfo_processMethod, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("processMethod", "IA5String");
		throw ee;
	    }
	}
	if (data.processAgency != null) {
	    // Encode field 'processAgency'
	    try {
		IA5String item1 = data.processAgency;
		int len1 = item1.getSize();

		if (len1 < 1 || len1 > 255)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerKMCString.encode(coder, item1.stringValue(), 1, 255, DataParameters._cEPAInfo_processAgency, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("processAgency", "IA5String");
		throw ee;
	    }
	}
	if (data.lastCheckedDate != null) {
	    // Encode field 'lastCheckedDate'
	    try {
		IA5String item1 = data.lastCheckedDate;
		int len1 = item1.getSize();

		if (len1 < 1 || len1 > 255)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerKMCString.encode(coder, item1.stringValue(), 1, 255, DataParameters._cEPAInfo_lastCheckedDate, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("lastCheckedDate", "IA5String");
		throw ee;
	    }
	}
	if (data.geiodUsed != null) {
	    // Encode field 'geiodUsed'
	    try {
		IA5String item1 = data.geiodUsed;
		int len1 = item1.getSize();

		if (len1 < 1 || len1 > 255)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerKMCString.encode(coder, item1.stringValue(), 1, 255, DataParameters._cEPAInfo_geiodUsed, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("geiodUsed", "IA5String");
		throw ee;
	    }
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static DataParameters decodeValue(PerCoder coder, InputBitStream source, DataParameters data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_processMethod0 = source.readBit();
	boolean has_processAgency0 = source.readBit();
	boolean has_lastCheckedDate0 = source.readBit();
	boolean has_geiodUsed0 = source.readBit();
    /** Decode root fields **/
	if (has_processMethod0) {
	    // Decode field 'processMethod'
	    try {
		data.processMethod = new IA5String(com.oss.coders.per.PerKMCString.decode(coder, source, 1, 255, DataParameters._cEPAInfo_processMethod));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("processMethod", "IA5String");
		throw de;
	    }
	} else {
	    data.processMethod = null;
	}
	if (has_processAgency0) {
	    // Decode field 'processAgency'
	    try {
		data.processAgency = new IA5String(com.oss.coders.per.PerKMCString.decode(coder, source, 1, 255, DataParameters._cEPAInfo_processAgency));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("processAgency", "IA5String");
		throw de;
	    }
	} else {
	    data.processAgency = null;
	}
	if (has_lastCheckedDate0) {
	    // Decode field 'lastCheckedDate'
	    try {
		data.lastCheckedDate = new IA5String(com.oss.coders.per.PerKMCString.decode(coder, source, 1, 255, DataParameters._cEPAInfo_lastCheckedDate));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("lastCheckedDate", "IA5String");
		throw de;
	    }
	} else {
	    data.lastCheckedDate = null;
	}
	if (has_geiodUsed0) {
	    // Decode field 'geiodUsed'
	    try {
		data.geiodUsed = new IA5String(com.oss.coders.per.PerKMCString.decode(coder, source, 1, 255, DataParameters._cEPAInfo_geiodUsed));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("geiodUsed", "IA5String");
		throw de;
	    }
	} else {
	    data.geiodUsed = null;
	}
    /** Decode extensions **/
	if (!_has_extensions0) {
	    return data;
	}
	len0 = coder.decodeNormallySmallLength(source);
	if (coder.moreFragments())
	    throw new DecoderException(com.oss.util.ExceptionDescriptor._too_many_ext_additions, null, "16384 or more");
	int unknown_exts0 = 0;
	if (len0 > 0)
	    for (int idx0 = 0; idx0 < len0 - 0; idx0++) {
		if (source.readBit())
		    ++unknown_exts0;
	    }
    /** Decode extension fields **/
	bitstream0 = source;
	source = coder.createNestedStream(bitstream0);
	try {
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
	// Encode field 'processMethod'
	try {
	    IA5String item1 = this.processMethod;

	    if (item1 != null) {
		{
		    separator0 = ",";
		    sink.encodeKey("processMethod");
		    coder.encodeString(item1.stringValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "processMethod");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("processMethod", "IA5String");
	    throw ee;
	}
	// Encode field 'processAgency'
	try {
	    IA5String item1 = this.processAgency;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("processAgency");
		    coder.encodeString(item1.stringValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "processAgency");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("processAgency", "IA5String");
	    throw ee;
	}
	// Encode field 'lastCheckedDate'
	try {
	    IA5String item1 = this.lastCheckedDate;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("lastCheckedDate");
		    coder.encodeString(item1.stringValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "lastCheckedDate");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("lastCheckedDate", "IA5String");
	    throw ee;
	}
	// Encode field 'geiodUsed'
	try {
	    IA5String item1 = this.geiodUsed;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("geiodUsed");
		    coder.encodeString(item1.stringValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "geiodUsed");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("geiodUsed", "IA5String");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public DataParameters decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[5];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		DataParameters.__Tag t_tag0 = DataParameters.__Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = DataParameters.__Tag._null_;
		switch (t_tag0) {
		    case __processMethod:
		    // Decode field 'processMethod'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[0])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.processMethod = new IA5String(coder.decodeString(source));
			    present0[0] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("processMethod", "IA5String");
			throw de;
		    }
		    break;
		    case __processAgency:
		    // Decode field 'processAgency'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.processAgency = new IA5String(coder.decodeString(source));
			    present0[1] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("processAgency", "IA5String");
			throw de;
		    }
		    break;
		    case __lastCheckedDate:
		    // Decode field 'lastCheckedDate'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.lastCheckedDate = new IA5String(coder.decodeString(source));
			    present0[2] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("lastCheckedDate", "IA5String");
			throw de;
		    }
		    break;
		    case __geiodUsed:
		    // Decode field 'geiodUsed'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.geiodUsed = new IA5String(coder.decodeString(source));
			    present0[3] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("geiodUsed", "IA5String");
			throw de;
		    }
		    break;
		    default:
			coder.skipValue(source);
			break;
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    this.processMethod = null;
	if (!present0[1])
	    this.processAgency = null;
	if (!present0[2])
	    this.lastCheckedDate = null;
	if (!present0[3])
	    this.geiodUsed = null;
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
	if (this.processMethod != null) {
	    try {
		comma0 = true;
		printer.newLine(writer);
		writer.print("processMethod ");
		printer.print(this.processMethod, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.processAgency != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("processAgency ");
		printer.print(this.processAgency, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.lastCheckedDate != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("lastCheckedDate ");
		printer.print(this.lastCheckedDate, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.geiodUsed != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("geiodUsed ");
		printer.print(this.geiodUsed, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	printer.undent();
	if (comma0)
	    printer.newLine(writer);
	writer.print('}');
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((DataParameters)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((DataParameters)that);
    }
    
    public boolean equalTo(DataParameters that) {
	if (this.processMethod != null && that.processMethod != null) {
	    if (!this.processMethod.equalTo(that.processMethod))
		return false;
	}
	if (this.processAgency != null && that.processAgency != null) {
	    if (!this.processAgency.equalTo(that.processAgency))
		return false;
	}
	if (this.lastCheckedDate != null && that.lastCheckedDate != null) {
	    if (!this.lastCheckedDate.equalTo(that.lastCheckedDate))
		return false;
	}
	if (this.geiodUsed != null && that.geiodUsed != null) {
	    if (!this.geiodUsed.equalTo(that.geiodUsed))
		return false;
	}
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public DataParameters clone() {
	DataParameters copy = (DataParameters)super.clone();
	if (processMethod != null) {
	    copy.processMethod = processMethod.clone();
	}
	if (processAgency != null) {
	    copy.processAgency = processAgency.clone();
	}
	if (lastCheckedDate != null) {
	    copy.lastCheckedDate = lastCheckedDate.clone();
	}
	if (geiodUsed != null) {
	    copy.geiodUsed = geiodUsed.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.processMethod != null ? this.processMethod.hashCode() : 0);
	hash = 41 * hash + (this.processAgency != null ? this.processAgency.hashCode() : 0);
	hash = 41 * hash + (this.lastCheckedDate != null ? this.lastCheckedDate.hashCode() : 0);
	hash = 41 * hash + (this.geiodUsed != null ? this.geiodUsed.hashCode() : 0);
	return hash;
    }
} // End class definition for DataParameters
