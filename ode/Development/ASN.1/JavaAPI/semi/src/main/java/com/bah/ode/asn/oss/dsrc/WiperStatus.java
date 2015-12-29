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
 * Define the ASN1 Type WiperStatus from ASN1 Module DSRC.
 * @see Sequence
 */

public class WiperStatus extends Sequence {
    public WiperStatusFront statusFront;
    public WiperRate rateFront;
    public WiperStatusRear statusRear;
    public WiperRate rateRear;
    
    /**
     * The default constructor.
     */
    public WiperStatus()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public WiperStatus(WiperStatusFront statusFront, WiperRate rateFront, 
		    WiperStatusRear statusRear, WiperRate rateRear)
    {
	setStatusFront(statusFront);
	setRateFront(rateFront);
	setStatusRear(statusRear);
	setRateRear(rateRear);
    }
    
    /**
     * Construct with required components.
     */
    public WiperStatus(WiperStatusFront statusFront, WiperRate rateFront)
    {
	setStatusFront(statusFront);
	setRateFront(rateFront);
    }
    
    
    // Methods for field "statusFront"
    public WiperStatusFront getStatusFront()
    {
	return this.statusFront;
    }
    
    public void setStatusFront(WiperStatusFront statusFront)
    {
	this.statusFront = statusFront;
    }
    
    
    // Methods for field "rateFront"
    public WiperRate getRateFront()
    {
	return this.rateFront;
    }
    
    public void setRateFront(WiperRate rateFront)
    {
	this.rateFront = rateFront;
    }
    
    
    // Methods for field "statusRear"
    public WiperStatusRear getStatusRear()
    {
	return this.statusRear;
    }
    
    public void setStatusRear(WiperStatusRear statusRear)
    {
	this.statusRear = statusRear;
    }
    
    public boolean hasStatusRear()
    {
	return (statusRear != null);
    }
    
    public void deleteStatusRear()
    {
	statusRear = null;
    }
    
    
    // Methods for field "rateRear"
    public WiperRate getRateRear()
    {
	return this.rateRear;
    }
    
    public void setRateRear(WiperRate rateRear)
    {
	this.rateRear = rateRear;
    }
    
    public boolean hasRateRear()
    {
	return (rateRear != null);
    }
    
    public void deleteRateRear()
    {
	rateRear = null;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     */
    public static enum __Tag
    {
	__statusFront("statusFront"),
	__rateFront("rateFront"),
	__statusRear("statusRear"),
	__rateRear("rateRear"),
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
	WiperStatus temp0 = this;

	if (temp0.rateRear != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.rateRear, sink), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("rateRear", "WiperRate");
		throw ee;
	    }
	}
	if (temp0.statusRear != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.statusRear, sink), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("statusRear", "WiperStatusRear");
		throw ee;
	    }
	}
	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.rateFront, sink), 0x81);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("rateFront", "WiperRate");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.statusFront, sink), 0x80);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("statusFront", "WiperStatusFront");
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements BER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public WiperStatus decodeValue(BerCoder coder, DecoderInput source)
	    throws DecoderException
    {
	int total_len0 = source.mLength;
	int end_pos0 = (total_len0 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len0);
	int tag;

	do {
	    tag = source.decodeTagLength();
	    if (tag != 0x80)
		source.raiseTagMismatchException(tag);
	    try {
		int idx1 = WiperStatusFront.indexOfValue(source.decodeLong());
		this.statusFront = (idx1 < 0) ? WiperStatusFront.unknownEnumerator() : WiperStatusFront.cNamedNumbers[idx1];
	    } catch (Exception e) {
		DecoderException ee = DecoderException.wrapException(e);
		ee.appendFieldContext("statusFront", "WiperStatusFront");
		throw ee;
	    }
	    tag = source.decodeTagLength();
	    if (tag != 0x81)
		source.raiseTagMismatchException(tag);
	    try {
		this.rateFront = new WiperRate(source.decodeLong());
	    } catch (Exception e) {
		DecoderException ee = DecoderException.wrapException(e);
		ee.appendFieldContext("rateFront", "WiperRate");
		throw ee;
	    }
	    if (source.position() >= end_pos0)
		break;
	    tag = source.decodeTagLength();
	    if (tag == 0)
		break;
	    if (tag == 0x82) {
		try {
		    int idx1 = WiperStatusRear.indexOfValue(source.decodeLong());
		    this.statusRear = (idx1 < 0) ? WiperStatusRear.unknownEnumerator() : WiperStatusRear.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("statusRear", "WiperStatusRear");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x83) {
		try {
		    this.rateRear = new WiperRate(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("rateRear", "WiperRate");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    source.raiseUnknownFieldException(tag);
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
	WiperStatus temp0 = this;

	if (temp0.rateRear != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.rateRear, sink), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("rateRear", "WiperRate");
		throw ee;
	    }
	}
	if (temp0.statusRear != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.statusRear, sink), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("statusRear", "WiperStatusRear");
		throw ee;
	    }
	}
	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.rateFront, sink), 0x81);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("rateFront", "WiperRate");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.statusFront, sink), 0x80);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("statusFront", "WiperStatusFront");
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, WiperStatus data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(data.statusRear != null);
	sink.writeBit(data.rateRear != null);
	nbits += 2;
	// Encode field 'statusFront'
	try {
	    WiperStatusFront item1 = data.statusFront;
	    int idx1;
	    boolean extroot1 = true;

	    if (item1.isUnknownEnumerator()) {
		throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
	    } else {
		idx1 = item1.indexOf();
		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		extroot1 = idx1 < 7;
	    }
	    sink.writeBit(!extroot1); ++nbits;
	    if (extroot1)
		nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 6, sink);
	    else
		nbits += coder.encodeNormallySmallNumber(idx1 - 7, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("statusFront", "WiperStatusFront");
	    throw ee;
	}
	// Encode field 'rateFront'
	try {
	    WiperRate item1 = data.rateFront;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 127)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 127, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("rateFront", "WiperRate");
	    throw ee;
	}
	if (data.statusRear != null) {
	    // Encode field 'statusRear'
	    try {
		WiperStatusRear item1 = data.statusRear;
		int idx1;
		boolean extroot1 = true;

		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else {
		    idx1 = item1.indexOf();
		    if (idx1 < 0)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    extroot1 = idx1 < 7;
		}
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 6, sink);
		else
		    nbits += coder.encodeNormallySmallNumber(idx1 - 7, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("statusRear", "WiperStatusRear");
		throw ee;
	    }
	}
	if (data.rateRear != null) {
	    // Encode field 'rateRear'
	    try {
		WiperRate item1 = data.rateRear;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 127)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 127, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("rateRear", "WiperRate");
		throw ee;
	    }
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static WiperStatus decodeValue(PerCoder coder, InputBitStream source, WiperStatus data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean has_statusRear0 = source.readBit();
	boolean has_rateRear0 = source.readBit();
    /** Decode root fields **/
	// Decode field 'statusFront'
	try {
	    int idx1;
	    WiperStatusFront temp1;
	    boolean extroot1 = !source.readBit();

	    if (extroot1) {
		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 6);
		if (idx1 < 0 || idx1 > 6)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		temp1 = WiperStatusFront.valueAt(idx1);
	    } else {
		idx1 = 7 + (int)coder.decodeNormallySmallNumber(source);
		if (idx1 < 0)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		temp1 = WiperStatusFront.unknownEnumerator();
	    }
	    data.statusFront = temp1;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("statusFront", "WiperStatusFront");
	    throw de;
	}
	// Decode field 'rateFront'
	try {
	    long temp1;

	    if (data.rateFront == null)
		data.rateFront = new WiperRate();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 127);
	    if (temp1 > 127)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.rateFront.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("rateFront", "WiperRate");
	    throw de;
	}
	if (has_statusRear0) {
	    // Decode field 'statusRear'
	    try {
		int idx1;
		WiperStatusRear temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 6);
		    if (idx1 < 0 || idx1 > 6)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = WiperStatusRear.valueAt(idx1);
		} else {
		    idx1 = 7 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = WiperStatusRear.unknownEnumerator();
		}
		data.statusRear = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("statusRear", "WiperStatusRear");
		throw de;
	    }
	} else {
	    data.statusRear = null;
	}
	if (has_rateRear0) {
	    // Decode field 'rateRear'
	    try {
		long temp1;

		if (data.rateRear == null)
		    data.rateRear = new WiperRate();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 127);
		if (temp1 > 127)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.rateRear.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("rateRear", "WiperRate");
		throw de;
	    }
	} else {
	    data.rateRear = null;
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
	sink.beginObject();
	// Encode field 'statusFront'
	try {
	    WiperStatusFront item1 = this.statusFront;

	    {
		sink.encodeKey("statusFront");
		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else 
		    sink.writeString(item1.name());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("statusFront", "WiperStatusFront");
	    throw ee;
	}
	// Encode field 'rateFront'
	try {
	    WiperRate item1 = this.rateFront;

	    {
		sink.writeSeparator();
		sink.encodeKey("rateFront");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("rateFront", "WiperRate");
	    throw ee;
	}
	// Encode field 'statusRear'
	try {
	    WiperStatusRear item1 = this.statusRear;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("statusRear");
		    if (item1.isUnknownEnumerator()) {
			throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		    } else 
			sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "statusRear");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("statusRear", "WiperStatusRear");
	    throw ee;
	}
	// Encode field 'rateRear'
	try {
	    WiperRate item1 = this.rateRear;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("rateRear");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "rateRear");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("rateRear", "WiperRate");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public WiperStatus decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[5];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		WiperStatus.__Tag t_tag0 = WiperStatus.__Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = WiperStatus.__Tag._null_;
		switch (t_tag0) {
		    case __statusFront:
		    // Decode field 'statusFront'
		    try {
			String content1 = coder.decodeString(source);
			int idx1;
			WiperStatusFront temp1;

			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			idx1 = coder.resolveName(WiperStatusFront.cConstantNameList, content1);
			if (idx1 < 0 )
			    temp1 = WiperStatusFront.unknownEnumerator();
			else
			    temp1 = WiperStatusFront.cNamedNumbers[idx1];
			this.statusFront = temp1;
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("statusFront", "WiperStatusFront");
			throw de;
		    }
		    break;
		    case __rateFront:
		    // Decode field 'rateFront'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.rateFront == null)
			    this.rateFront = new WiperRate();
			this.rateFront.setValue(coder.decodeInteger(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("rateFront", "WiperRate");
			throw de;
		    }
		    break;
		    case __statusRear:
		    // Decode field 'statusRear'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    WiperStatusRear temp1;

			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(WiperStatusRear.cConstantNameList, content1);
			    if (idx1 < 0 )
				temp1 = WiperStatusRear.unknownEnumerator();
			    else
				temp1 = WiperStatusRear.cNamedNumbers[idx1];
			    this.statusRear = temp1;
			    present0[2] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("statusRear", "WiperStatusRear");
			throw de;
		    }
		    break;
		    case __rateRear:
		    // Decode field 'rateRear'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.rateRear == null)
				this.rateRear = new WiperRate();
			    this.rateRear.setValue(coder.decodeInteger(source));
			    present0[3] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("rateRear", "WiperRate");
			throw de;
		    }
		    break;
		    default:
			throw new DecoderException(ExceptionDescriptor._unknown_field, ": '" + tag0 + "'");
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'statusFront'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'rateFront'");
	if (!present0[2])
	    this.statusRear = null;
	if (!present0[3])
	    this.rateRear = null;
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
	comma0 = true;
	try {
	    printer.newLine(writer);
	    writer.print("statusFront ");
	    printer.print(this.statusFront, writer, this.statusFront.cConstantNameList);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("rateFront ");
	    writer.print(this.rateFront.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.statusRear != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("statusRear ");
		printer.print(this.statusRear, writer, this.statusRear.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.rateRear != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("rateRear ");
		writer.print(this.rateRear.longValue());
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
	return equalTo((WiperStatus)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((WiperStatus)that);
    }
    
    public boolean equalTo(WiperStatus that) {
	if (!this.statusFront.equalTo(that.statusFront))
	    return false;
	if (!this.rateFront.equalTo(that.rateFront))
	    return false;
	if (this.statusRear != null && that.statusRear != null) {
	    if (!this.statusRear.equalTo(that.statusRear))
		return false;
	}
	if (this.rateRear != null && that.rateRear != null) {
	    if (!this.rateRear.equalTo(that.rateRear))
		return false;
	}
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public WiperStatus clone() {
	WiperStatus copy = (WiperStatus)super.clone();
	copy.statusFront = statusFront.clone();
	copy.rateFront = rateFront.clone();
	if (statusRear != null) {
	    copy.statusRear = statusRear.clone();
	}
	if (rateRear != null) {
	    copy.rateRear = rateRear.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.statusFront != null ? this.statusFront.hashCode() : 0);
	hash = 41 * hash + (this.rateFront != null ? this.rateFront.hashCode() : 0);
	hash = 41 * hash + (this.statusRear != null ? this.statusRear.hashCode() : 0);
	hash = 41 * hash + (this.rateRear != null ? this.rateRear.hashCode() : 0);
	return hash;
    }
} // End class definition for WiperStatus
