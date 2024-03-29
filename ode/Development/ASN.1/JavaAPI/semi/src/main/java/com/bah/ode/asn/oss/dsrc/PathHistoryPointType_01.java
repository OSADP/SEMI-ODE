/*************************************************************/
/* Copyright (C) 2016 OSS Nokalva, Inc.  All rights reserved.*/
/*************************************************************/

/* THIS FILE IS PROPRIETARY MATERIAL OF OSS NOKALVA, INC.
 * AND MAY BE USED ONLY BY DIRECT LICENSEES OF OSS NOKALVA, INC.
 * THIS FILE MAY NOT BE DISTRIBUTED.
 * THIS COPYRIGHT STATEMENT MAY NOT BE REMOVED. */

/* Generated for: Joint Program Office (JPO) US DOT, Washington D.C. - Research only, Project-based, License 70234 70234,
 * only for project "US DOT ITS Connected Vehicle Data Program". */
/* Abstract syntax: semi_asn */
/* ASN.1 Java project: com.bah.ode.asn.oss.Oss */
/* Created: Tue Jun 07 13:54:40 2016 */
/* ASN.1 Compiler for Java version: 6.3 */
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
 * Define the ASN1 Type PathHistoryPointType_01 from ASN1 Module DSRC.
 * @see Sequence
 */

public class PathHistoryPointType_01 extends Sequence {
    public INTEGER latOffset;
    public INTEGER longOffset;
    public INTEGER elevationOffset;
    public INTEGER timeOffset;
    public PositionalAccuracy posAccuracy;
    public INTEGER heading;
    public TransmissionAndSpeed speed;
    
    /**
     * The default constructor.
     */
    public PathHistoryPointType_01()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PathHistoryPointType_01(INTEGER latOffset, INTEGER longOffset, 
		    INTEGER elevationOffset, INTEGER timeOffset, 
		    PositionalAccuracy posAccuracy, INTEGER heading, 
		    TransmissionAndSpeed speed)
    {
	setLatOffset(latOffset);
	setLongOffset(longOffset);
	setElevationOffset(elevationOffset);
	setTimeOffset(timeOffset);
	setPosAccuracy(posAccuracy);
	setHeading(heading);
	setSpeed(speed);
    }
    
    /**
     * Construct with components.
     */
    public PathHistoryPointType_01(long latOffset, long longOffset, 
		    long elevationOffset, long timeOffset, 
		    PositionalAccuracy posAccuracy, long heading, 
		    TransmissionAndSpeed speed)
    {
	this(new INTEGER(latOffset), new INTEGER(longOffset), 
	     new INTEGER(elevationOffset), new INTEGER(timeOffset), 
	     posAccuracy, new INTEGER(heading), speed);
    }
    
    /**
     * Construct with required components.
     */
    public PathHistoryPointType_01(long latOffset, long longOffset)
    {
	setLatOffset(latOffset);
	setLongOffset(longOffset);
    }
    
    
    // Methods for field "latOffset"
    public long getLatOffset()
    {
	return (this.latOffset).longValue();
    }
    
    public void setLatOffset(long latOffset)
    {
	setLatOffset(new INTEGER(latOffset));
    }
    
    public void setLatOffset(INTEGER latOffset)
    {
	this.latOffset = latOffset;
    }
    
    
    // Methods for field "longOffset"
    public long getLongOffset()
    {
	return (this.longOffset).longValue();
    }
    
    public void setLongOffset(long longOffset)
    {
	setLongOffset(new INTEGER(longOffset));
    }
    
    public void setLongOffset(INTEGER longOffset)
    {
	this.longOffset = longOffset;
    }
    
    
    // Methods for field "elevationOffset"
    public long getElevationOffset()
    {
	return (this.elevationOffset).longValue();
    }
    
    public void setElevationOffset(long elevationOffset)
    {
	setElevationOffset(new INTEGER(elevationOffset));
    }
    
    public void setElevationOffset(INTEGER elevationOffset)
    {
	this.elevationOffset = elevationOffset;
    }
    
    public boolean hasElevationOffset()
    {
	return (elevationOffset != null);
    }
    
    public void deleteElevationOffset()
    {
	elevationOffset = null;
    }
    
    
    // Methods for field "timeOffset"
    public long getTimeOffset()
    {
	return (this.timeOffset).longValue();
    }
    
    public void setTimeOffset(long timeOffset)
    {
	setTimeOffset(new INTEGER(timeOffset));
    }
    
    public void setTimeOffset(INTEGER timeOffset)
    {
	this.timeOffset = timeOffset;
    }
    
    public boolean hasTimeOffset()
    {
	return (timeOffset != null);
    }
    
    public void deleteTimeOffset()
    {
	timeOffset = null;
    }
    
    
    // Methods for field "posAccuracy"
    public PositionalAccuracy getPosAccuracy()
    {
	return this.posAccuracy;
    }
    
    public void setPosAccuracy(PositionalAccuracy posAccuracy)
    {
	this.posAccuracy = posAccuracy;
    }
    
    public boolean hasPosAccuracy()
    {
	return (posAccuracy != null);
    }
    
    public void deletePosAccuracy()
    {
	posAccuracy = null;
    }
    
    
    // Methods for field "heading"
    public long getHeading()
    {
	return (this.heading).longValue();
    }
    
    public void setHeading(long heading)
    {
	setHeading(new INTEGER(heading));
    }
    
    public void setHeading(INTEGER heading)
    {
	this.heading = heading;
    }
    
    public boolean hasHeading()
    {
	return (heading != null);
    }
    
    public void deleteHeading()
    {
	heading = null;
    }
    
    
    // Methods for field "speed"
    public TransmissionAndSpeed getSpeed()
    {
	return this.speed;
    }
    
    public void setSpeed(TransmissionAndSpeed speed)
    {
	this.speed = speed;
    }
    
    public boolean hasSpeed()
    {
	return (speed != null);
    }
    
    public void deleteSpeed()
    {
	speed = null;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     */
    public static enum __Tag
    {
	__latOffset("latOffset"),
	__longOffset("longOffset"),
	__elevationOffset("elevationOffset"),
	__timeOffset("timeOffset"),
	__posAccuracy("posAccuracy"),
	__heading("heading"),
	__speed("speed"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(8);
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
	PathHistoryPointType_01 temp0 = this;

	if (temp0.speed != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.speed.byteArrayValue()), 0x86);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("speed", "TransmissionAndSpeed");
		throw ee;
	    }
	}
	if (temp0.heading != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.heading, sink), 0x85);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("heading", "INTEGER");
		throw ee;
	    }
	}
	if (temp0.posAccuracy != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.posAccuracy.byteArrayValue()), 0x84);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("posAccuracy", "PositionalAccuracy");
		throw ee;
	    }
	}
	if (temp0.timeOffset != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.timeOffset, sink), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("timeOffset", "INTEGER");
		throw ee;
	    }
	}
	if (temp0.elevationOffset != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.elevationOffset, sink), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("elevationOffset", "INTEGER");
		throw ee;
	    }
	}
	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.longOffset, sink), 0x81);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("longOffset", "INTEGER");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.latOffset, sink), 0x80);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("latOffset", "INTEGER");
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements BER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public PathHistoryPointType_01 decodeValue(BerCoder coder, DecoderInput source)
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
		this.latOffset = new INTEGER(source.decodeLong());
	    } catch (Exception e) {
		DecoderException ee = DecoderException.wrapException(e);
		ee.appendFieldContext("latOffset", "INTEGER");
		throw ee;
	    }
	    tag = source.decodeTagLength();
	    if (tag != 0x81)
		source.raiseTagMismatchException(tag);
	    try {
		this.longOffset = new INTEGER(source.decodeLong());
	    } catch (Exception e) {
		DecoderException ee = DecoderException.wrapException(e);
		ee.appendFieldContext("longOffset", "INTEGER");
		throw ee;
	    }
	    if (source.position() >= end_pos0)
		break;
	    tag = source.decodeTagLength();
	    if (tag == 0)
		break;
	    if (tag == 0x82) {
		try {
		    this.elevationOffset = new INTEGER(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("elevationOffset", "INTEGER");
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
		    this.timeOffset = new INTEGER(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("timeOffset", "INTEGER");
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
		    this.posAccuracy = new PositionalAccuracy(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("posAccuracy", "PositionalAccuracy");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x85) {
		try {
		    this.heading = new INTEGER(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("heading", "INTEGER");
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
		    this.speed = new TransmissionAndSpeed(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("speed", "TransmissionAndSpeed");
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
	PathHistoryPointType_01 temp0 = this;

	if (temp0.speed != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.speed.byteArrayValue()), 0x86);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("speed", "TransmissionAndSpeed");
		throw ee;
	    }
	}
	if (temp0.heading != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.heading, sink), 0x85);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("heading", "INTEGER");
		throw ee;
	    }
	}
	if (temp0.posAccuracy != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.posAccuracy.byteArrayValue()), 0x84);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("posAccuracy", "PositionalAccuracy");
		throw ee;
	    }
	}
	if (temp0.timeOffset != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.timeOffset, sink), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("timeOffset", "INTEGER");
		throw ee;
	    }
	}
	if (temp0.elevationOffset != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.elevationOffset, sink), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("elevationOffset", "INTEGER");
		throw ee;
	    }
	}
	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.longOffset, sink), 0x81);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("longOffset", "INTEGER");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.latOffset, sink), 0x80);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("latOffset", "INTEGER");
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, PathHistoryPointType_01 data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(data.elevationOffset != null);
	sink.writeBit(data.timeOffset != null);
	sink.writeBit(data.posAccuracy != null);
	sink.writeBit(data.heading != null);
	sink.writeBit(data.speed != null);
	nbits += 5;
	// Encode field 'latOffset'
	try {
	    INTEGER item1 = data.latOffset;
	    long temp1 = item1.longValue();

	    if (temp1 < -131072 || temp1 > 131071)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, -131072, 131071, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("latOffset", "INTEGER");
	    throw ee;
	}
	// Encode field 'longOffset'
	try {
	    INTEGER item1 = data.longOffset;
	    long temp1 = item1.longValue();

	    if (temp1 < -131072 || temp1 > 131071)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, -131072, 131071, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("longOffset", "INTEGER");
	    throw ee;
	}
	if (data.elevationOffset != null) {
	    // Encode field 'elevationOffset'
	    try {
		INTEGER item1 = data.elevationOffset;
		long temp1 = item1.longValue();

		if (temp1 < -2048 || temp1 > 2047)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, -2048, 2047, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("elevationOffset", "INTEGER");
		throw ee;
	    }
	}
	if (data.timeOffset != null) {
	    // Encode field 'timeOffset'
	    try {
		INTEGER item1 = data.timeOffset;
		long temp1 = item1.longValue();

		if (temp1 < 1 || temp1 > 65535)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 1, 65535, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("timeOffset", "INTEGER");
		throw ee;
	    }
	}
	if (data.posAccuracy != null) {
	    // Encode field 'posAccuracy'
	    try {
		PositionalAccuracy item1 = data.posAccuracy;
		int len1 = item1.getSize();

		if (len1 != 4)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 4, 4, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("posAccuracy", "PositionalAccuracy");
		throw ee;
	    }
	}
	if (data.heading != null) {
	    // Encode field 'heading'
	    try {
		INTEGER item1 = data.heading;
		long temp1 = item1.longValue();

		if (temp1 < -128 || temp1 > 127)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, -128, 127, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("heading", "INTEGER");
		throw ee;
	    }
	}
	if (data.speed != null) {
	    // Encode field 'speed'
	    try {
		TransmissionAndSpeed item1 = data.speed;
		int len1 = item1.getSize();

		if (len1 != 2)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 2, 2, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("speed", "TransmissionAndSpeed");
		throw ee;
	    }
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static PathHistoryPointType_01 decodeValue(PerCoder coder, InputBitStream source, PathHistoryPointType_01 data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean has_elevationOffset0 = source.readBit();
	boolean has_timeOffset0 = source.readBit();
	boolean has_posAccuracy0 = source.readBit();
	boolean has_heading0 = source.readBit();
	boolean has_speed0 = source.readBit();
    /** Decode root fields **/
	// Decode field 'latOffset'
	try {
	    long temp1;

	    if (data.latOffset == null)
		data.latOffset = new INTEGER();
	    temp1 = coder.decodeConstrainedWholeNumber(source, -131072, 131071);
	    if (temp1 > 131071)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.latOffset.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("latOffset", "INTEGER");
	    throw de;
	}
	// Decode field 'longOffset'
	try {
	    long temp1;

	    if (data.longOffset == null)
		data.longOffset = new INTEGER();
	    temp1 = coder.decodeConstrainedWholeNumber(source, -131072, 131071);
	    if (temp1 > 131071)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.longOffset.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("longOffset", "INTEGER");
	    throw de;
	}
	if (has_elevationOffset0) {
	    // Decode field 'elevationOffset'
	    try {
		long temp1;

		if (data.elevationOffset == null)
		    data.elevationOffset = new INTEGER();
		temp1 = coder.decodeConstrainedWholeNumber(source, -2048, 2047);
		if (temp1 > 2047)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.elevationOffset.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("elevationOffset", "INTEGER");
		throw de;
	    }
	} else {
	    data.elevationOffset = null;
	}
	if (has_timeOffset0) {
	    // Decode field 'timeOffset'
	    try {
		long temp1;

		if (data.timeOffset == null)
		    data.timeOffset = new INTEGER();
		temp1 = coder.decodeConstrainedWholeNumber(source, 1, 65535);
		if (temp1 > 65535)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.timeOffset.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("timeOffset", "INTEGER");
		throw de;
	    }
	} else {
	    data.timeOffset = null;
	}
	if (has_posAccuracy0) {
	    // Decode field 'posAccuracy'
	    try {
		data.posAccuracy = new PositionalAccuracy(com.oss.coders.per.PerOctets.decode(coder, source, 4, 4));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("posAccuracy", "PositionalAccuracy");
		throw de;
	    }
	} else {
	    data.posAccuracy = null;
	}
	if (has_heading0) {
	    // Decode field 'heading'
	    try {
		long temp1;

		if (data.heading == null)
		    data.heading = new INTEGER();
		temp1 = coder.decodeConstrainedWholeNumber(source, -128, 127);
		if (temp1 > 127)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.heading.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("heading", "INTEGER");
		throw de;
	    }
	} else {
	    data.heading = null;
	}
	if (has_speed0) {
	    // Decode field 'speed'
	    try {
		data.speed = new TransmissionAndSpeed(com.oss.coders.per.PerOctets.decode(coder, source, 2, 2));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("speed", "TransmissionAndSpeed");
		throw de;
	    }
	} else {
	    data.speed = null;
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
	// Encode field 'latOffset'
	try {
	    INTEGER item1 = this.latOffset;

	    {
		sink.encodeKey("latOffset");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("latOffset", "INTEGER");
	    throw ee;
	}
	// Encode field 'longOffset'
	try {
	    INTEGER item1 = this.longOffset;

	    {
		sink.writeSeparator();
		sink.encodeKey("longOffset");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("longOffset", "INTEGER");
	    throw ee;
	}
	// Encode field 'elevationOffset'
	try {
	    INTEGER item1 = this.elevationOffset;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("elevationOffset");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "elevationOffset");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("elevationOffset", "INTEGER");
	    throw ee;
	}
	// Encode field 'timeOffset'
	try {
	    INTEGER item1 = this.timeOffset;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("timeOffset");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "timeOffset");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("timeOffset", "INTEGER");
	    throw ee;
	}
	// Encode field 'posAccuracy'
	try {
	    PositionalAccuracy item1 = this.posAccuracy;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("posAccuracy");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "posAccuracy");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("posAccuracy", "PositionalAccuracy");
	    throw ee;
	}
	// Encode field 'heading'
	try {
	    INTEGER item1 = this.heading;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("heading");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "heading");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("heading", "INTEGER");
	    throw ee;
	}
	// Encode field 'speed'
	try {
	    TransmissionAndSpeed item1 = this.speed;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("speed");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "speed");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("speed", "TransmissionAndSpeed");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public PathHistoryPointType_01 decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[8];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		PathHistoryPointType_01.__Tag t_tag0 = PathHistoryPointType_01.__Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = PathHistoryPointType_01.__Tag._null_;
		switch (t_tag0) {
		    case __latOffset:
		    // Decode field 'latOffset'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.latOffset == null)
			    this.latOffset = new INTEGER();
			this.latOffset.setValue(coder.decodeInteger(source));
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("latOffset", "INTEGER");
			throw de;
		    }
		    break;
		    case __longOffset:
		    // Decode field 'longOffset'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.longOffset == null)
			    this.longOffset = new INTEGER();
			this.longOffset.setValue(coder.decodeInteger(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("longOffset", "INTEGER");
			throw de;
		    }
		    break;
		    case __elevationOffset:
		    // Decode field 'elevationOffset'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.elevationOffset == null)
				this.elevationOffset = new INTEGER();
			    this.elevationOffset.setValue(coder.decodeInteger(source));
			    present0[2] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("elevationOffset", "INTEGER");
			throw de;
		    }
		    break;
		    case __timeOffset:
		    // Decode field 'timeOffset'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.timeOffset == null)
				this.timeOffset = new INTEGER();
			    this.timeOffset.setValue(coder.decodeInteger(source));
			    present0[3] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("timeOffset", "INTEGER");
			throw de;
		    }
		    break;
		    case __posAccuracy:
		    // Decode field 'posAccuracy'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[4])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.posAccuracy = new PositionalAccuracy(coder.decodeOctetString(source));
			    present0[4] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("posAccuracy", "PositionalAccuracy");
			throw de;
		    }
		    break;
		    case __heading:
		    // Decode field 'heading'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[5])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.heading == null)
				this.heading = new INTEGER();
			    this.heading.setValue(coder.decodeInteger(source));
			    present0[5] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("heading", "INTEGER");
			throw de;
		    }
		    break;
		    case __speed:
		    // Decode field 'speed'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[6])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.speed = new TransmissionAndSpeed(coder.decodeOctetString(source));
			    present0[6] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("speed", "TransmissionAndSpeed");
			throw de;
		    }
		    break;
		    default:
			throw new DecoderException(ExceptionDescriptor._unknown_field, ": '" + tag0 + "'");
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'latOffset'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'longOffset'");
	if (!present0[2])
	    this.elevationOffset = null;
	if (!present0[3])
	    this.timeOffset = null;
	if (!present0[4])
	    this.posAccuracy = null;
	if (!present0[5])
	    this.heading = null;
	if (!present0[6])
	    this.speed = null;
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
	    writer.print("latOffset ");
	    writer.print(this.latOffset.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("longOffset ");
	    writer.print(this.longOffset.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.elevationOffset != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("elevationOffset ");
		writer.print(this.elevationOffset.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.timeOffset != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("timeOffset ");
		writer.print(this.timeOffset.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.posAccuracy != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("posAccuracy ");
		printer.print(this.posAccuracy, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.heading != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("heading ");
		writer.print(this.heading.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.speed != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("speed ");
		printer.print(this.speed, writer);
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
	return equalTo((PathHistoryPointType_01)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((PathHistoryPointType_01)that);
    }
    
    public boolean equalTo(PathHistoryPointType_01 that) {
	if (!this.latOffset.equalTo(that.latOffset))
	    return false;
	if (!this.longOffset.equalTo(that.longOffset))
	    return false;
	if (this.elevationOffset != null && that.elevationOffset != null) {
	    if (!this.elevationOffset.equalTo(that.elevationOffset))
		return false;
	}
	if (this.timeOffset != null && that.timeOffset != null) {
	    if (!this.timeOffset.equalTo(that.timeOffset))
		return false;
	}
	if (this.posAccuracy != null && that.posAccuracy != null) {
	    if (!this.posAccuracy.equalTo(that.posAccuracy))
		return false;
	}
	if (this.heading != null && that.heading != null) {
	    if (!this.heading.equalTo(that.heading))
		return false;
	}
	if (this.speed != null && that.speed != null) {
	    if (!this.speed.equalTo(that.speed))
		return false;
	}
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public PathHistoryPointType_01 clone() {
	PathHistoryPointType_01 copy = (PathHistoryPointType_01)super.clone();
	copy.latOffset = latOffset.clone();
	copy.longOffset = longOffset.clone();
	if (elevationOffset != null) {
	    copy.elevationOffset = elevationOffset.clone();
	}
	if (timeOffset != null) {
	    copy.timeOffset = timeOffset.clone();
	}
	if (posAccuracy != null) {
	    copy.posAccuracy = posAccuracy.clone();
	}
	if (heading != null) {
	    copy.heading = heading.clone();
	}
	if (speed != null) {
	    copy.speed = speed.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.latOffset != null ? this.latOffset.hashCode() : 0);
	hash = 41 * hash + (this.longOffset != null ? this.longOffset.hashCode() : 0);
	hash = 41 * hash + (this.elevationOffset != null ? this.elevationOffset.hashCode() : 0);
	hash = 41 * hash + (this.timeOffset != null ? this.timeOffset.hashCode() : 0);
	hash = 41 * hash + (this.posAccuracy != null ? this.posAccuracy.hashCode() : 0);
	hash = 41 * hash + (this.heading != null ? this.heading.hashCode() : 0);
	hash = 41 * hash + (this.speed != null ? this.speed.hashCode() : 0);
	return hash;
    }
} // End class definition for PathHistoryPointType_01
