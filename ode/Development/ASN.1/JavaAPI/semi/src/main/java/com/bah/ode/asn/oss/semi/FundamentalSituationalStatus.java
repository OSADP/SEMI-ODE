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


package com.bah.ode.asn.oss.semi;

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
 * Define the ASN1 Type FundamentalSituationalStatus from ASN1 Module SEMI.
 * @see Sequence
 */

public class FundamentalSituationalStatus extends Sequence {
    public com.bah.ode.asn.oss.dsrc.TransmissionAndSpeed speed;
    public com.bah.ode.asn.oss.dsrc.Heading heading;
    public com.bah.ode.asn.oss.dsrc.SteeringWheelAngle steeringAngle;
    public com.bah.ode.asn.oss.dsrc.AccelerationSet4Way accelSet;
    public com.bah.ode.asn.oss.dsrc.BrakeSystemStatus brakes;
    public com.bah.ode.asn.oss.dsrc.VehicleSize vehSize;
    public VsmEventFlag vsmEventFlag;
    
    /**
     * The default constructor.
     */
    public FundamentalSituationalStatus()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public FundamentalSituationalStatus(com.bah.ode.asn.oss.dsrc.TransmissionAndSpeed speed, 
		    com.bah.ode.asn.oss.dsrc.Heading heading, 
		    com.bah.ode.asn.oss.dsrc.SteeringWheelAngle steeringAngle, 
		    com.bah.ode.asn.oss.dsrc.AccelerationSet4Way accelSet, 
		    com.bah.ode.asn.oss.dsrc.BrakeSystemStatus brakes, 
		    com.bah.ode.asn.oss.dsrc.VehicleSize vehSize, 
		    VsmEventFlag vsmEventFlag)
    {
	setSpeed(speed);
	setHeading(heading);
	setSteeringAngle(steeringAngle);
	setAccelSet(accelSet);
	setBrakes(brakes);
	setVehSize(vehSize);
	setVsmEventFlag(vsmEventFlag);
    }
    
    /**
     * Construct with required components.
     */
    public FundamentalSituationalStatus(com.bah.ode.asn.oss.dsrc.TransmissionAndSpeed speed, 
		    com.bah.ode.asn.oss.dsrc.Heading heading, 
		    com.bah.ode.asn.oss.dsrc.SteeringWheelAngle steeringAngle, 
		    com.bah.ode.asn.oss.dsrc.AccelerationSet4Way accelSet, 
		    com.bah.ode.asn.oss.dsrc.BrakeSystemStatus brakes, 
		    com.bah.ode.asn.oss.dsrc.VehicleSize vehSize)
    {
	setSpeed(speed);
	setHeading(heading);
	setSteeringAngle(steeringAngle);
	setAccelSet(accelSet);
	setBrakes(brakes);
	setVehSize(vehSize);
    }
    
    
    // Methods for field "speed"
    public com.bah.ode.asn.oss.dsrc.TransmissionAndSpeed getSpeed()
    {
	return this.speed;
    }
    
    public void setSpeed(com.bah.ode.asn.oss.dsrc.TransmissionAndSpeed speed)
    {
	this.speed = speed;
    }
    
    
    // Methods for field "heading"
    public com.bah.ode.asn.oss.dsrc.Heading getHeading()
    {
	return this.heading;
    }
    
    public void setHeading(com.bah.ode.asn.oss.dsrc.Heading heading)
    {
	this.heading = heading;
    }
    
    
    // Methods for field "steeringAngle"
    public com.bah.ode.asn.oss.dsrc.SteeringWheelAngle getSteeringAngle()
    {
	return this.steeringAngle;
    }
    
    public void setSteeringAngle(com.bah.ode.asn.oss.dsrc.SteeringWheelAngle steeringAngle)
    {
	this.steeringAngle = steeringAngle;
    }
    
    
    // Methods for field "accelSet"
    public com.bah.ode.asn.oss.dsrc.AccelerationSet4Way getAccelSet()
    {
	return this.accelSet;
    }
    
    public void setAccelSet(com.bah.ode.asn.oss.dsrc.AccelerationSet4Way accelSet)
    {
	this.accelSet = accelSet;
    }
    
    
    // Methods for field "brakes"
    public com.bah.ode.asn.oss.dsrc.BrakeSystemStatus getBrakes()
    {
	return this.brakes;
    }
    
    public void setBrakes(com.bah.ode.asn.oss.dsrc.BrakeSystemStatus brakes)
    {
	this.brakes = brakes;
    }
    
    
    // Methods for field "vehSize"
    public com.bah.ode.asn.oss.dsrc.VehicleSize getVehSize()
    {
	return this.vehSize;
    }
    
    public void setVehSize(com.bah.ode.asn.oss.dsrc.VehicleSize vehSize)
    {
	this.vehSize = vehSize;
    }
    
    
    // Methods for field "vsmEventFlag"
    public VsmEventFlag getVsmEventFlag()
    {
	return this.vsmEventFlag;
    }
    
    public void setVsmEventFlag(VsmEventFlag vsmEventFlag)
    {
	this.vsmEventFlag = vsmEventFlag;
    }
    
    public boolean hasVsmEventFlag()
    {
	return (vsmEventFlag != null);
    }
    
    public void deleteVsmEventFlag()
    {
	vsmEventFlag = null;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     */
    public static enum __Tag
    {
	__speed("speed"),
	__heading("heading"),
	__steeringAngle("steeringAngle"),
	__accelSet("accelSet"),
	__brakes("brakes"),
	__vehSize("vehSize"),
	__vsmEventFlag("vsmEventFlag"),
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
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, FundamentalSituationalStatus data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(data.vsmEventFlag != null);
	++nbits;
	// Encode field 'speed'
	try {
	    com.bah.ode.asn.oss.dsrc.TransmissionAndSpeed item1 = data.speed;
	    int len1 = item1.getSize();

	    if (len1 != 2)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 2, 2, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("speed", "TransmissionAndSpeed");
	    throw ee;
	}
	// Encode field 'heading'
	try {
	    com.bah.ode.asn.oss.dsrc.Heading item1 = data.heading;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 28800)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 28800, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("heading", "Heading");
	    throw ee;
	}
	// Encode field 'steeringAngle'
	try {
	    com.bah.ode.asn.oss.dsrc.SteeringWheelAngle item1 = data.steeringAngle;
	    int len1 = item1.getSize();

	    if (len1 != 1)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 1, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("steeringAngle", "SteeringWheelAngle");
	    throw ee;
	}
	// Encode field 'accelSet'
	try {
	    com.bah.ode.asn.oss.dsrc.AccelerationSet4Way item1 = data.accelSet;
	    int len1 = item1.getSize();

	    if (len1 != 7)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 7, 7, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("accelSet", "AccelerationSet4Way");
	    throw ee;
	}
	// Encode field 'brakes'
	try {
	    com.bah.ode.asn.oss.dsrc.BrakeSystemStatus item1 = data.brakes;
	    int len1 = item1.getSize();

	    if (len1 != 2)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 2, 2, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("brakes", "BrakeSystemStatus");
	    throw ee;
	}
	// Encode field 'vehSize'
	try {
	    com.bah.ode.asn.oss.dsrc.VehicleSize item1 = data.vehSize;

	    nbits += com.bah.ode.asn.oss.dsrc.VehicleSize.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("vehSize", "VehicleSize");
	    throw ee;
	}
	if (data.vsmEventFlag != null) {
	    // Encode field 'vsmEventFlag'
	    try {
		VsmEventFlag item1 = data.vsmEventFlag;
		int len1 = item1.getSize();

		if (len1 != 1)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 1, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("vsmEventFlag", "VsmEventFlag");
		throw ee;
	    }
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static FundamentalSituationalStatus decodeValue(PerCoder coder, InputBitStream source, FundamentalSituationalStatus data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean has_vsmEventFlag0 = source.readBit();
    /** Decode root fields **/
	// Decode field 'speed'
	try {
	    data.speed = new com.bah.ode.asn.oss.dsrc.TransmissionAndSpeed(com.oss.coders.per.PerOctets.decode(coder, source, 2, 2));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("speed", "TransmissionAndSpeed");
	    throw de;
	}
	// Decode field 'heading'
	try {
	    long temp1;

	    if (data.heading == null)
		data.heading = new com.bah.ode.asn.oss.dsrc.Heading();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 28800);
	    if (temp1 > 28800)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.heading.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("heading", "Heading");
	    throw de;
	}
	// Decode field 'steeringAngle'
	try {
	    data.steeringAngle = new com.bah.ode.asn.oss.dsrc.SteeringWheelAngle(com.oss.coders.per.PerOctets.decode(coder, source, 1, 1));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("steeringAngle", "SteeringWheelAngle");
	    throw de;
	}
	// Decode field 'accelSet'
	try {
	    data.accelSet = new com.bah.ode.asn.oss.dsrc.AccelerationSet4Way(com.oss.coders.per.PerOctets.decode(coder, source, 7, 7));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("accelSet", "AccelerationSet4Way");
	    throw de;
	}
	// Decode field 'brakes'
	try {
	    data.brakes = new com.bah.ode.asn.oss.dsrc.BrakeSystemStatus(com.oss.coders.per.PerOctets.decode(coder, source, 2, 2));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("brakes", "BrakeSystemStatus");
	    throw de;
	}
	// Decode field 'vehSize'
	try {
	    if (data.vehSize == null)
		data.vehSize = new com.bah.ode.asn.oss.dsrc.VehicleSize();
	    data.vehSize.decodeValue(coder, source, data.vehSize);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("vehSize", "VehicleSize");
	    throw de;
	}
	if (has_vsmEventFlag0) {
	    // Decode field 'vsmEventFlag'
	    try {
		data.vsmEventFlag = new VsmEventFlag(com.oss.coders.per.PerOctets.decode(coder, source, 1, 1));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("vsmEventFlag", "VsmEventFlag");
		throw de;
	    }
	} else {
	    data.vsmEventFlag = null;
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
	// Encode field 'speed'
	try {
	    com.bah.ode.asn.oss.dsrc.TransmissionAndSpeed item1 = this.speed;

	    {
		sink.encodeKey("speed");
		sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("speed", "TransmissionAndSpeed");
	    throw ee;
	}
	// Encode field 'heading'
	try {
	    com.bah.ode.asn.oss.dsrc.Heading item1 = this.heading;

	    {
		sink.writeSeparator();
		sink.encodeKey("heading");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("heading", "Heading");
	    throw ee;
	}
	// Encode field 'steeringAngle'
	try {
	    com.bah.ode.asn.oss.dsrc.SteeringWheelAngle item1 = this.steeringAngle;

	    {
		sink.writeSeparator();
		sink.encodeKey("steeringAngle");
		sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("steeringAngle", "SteeringWheelAngle");
	    throw ee;
	}
	// Encode field 'accelSet'
	try {
	    com.bah.ode.asn.oss.dsrc.AccelerationSet4Way item1 = this.accelSet;

	    {
		sink.writeSeparator();
		sink.encodeKey("accelSet");
		sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("accelSet", "AccelerationSet4Way");
	    throw ee;
	}
	// Encode field 'brakes'
	try {
	    com.bah.ode.asn.oss.dsrc.BrakeSystemStatus item1 = this.brakes;

	    {
		sink.writeSeparator();
		sink.encodeKey("brakes");
		sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("brakes", "BrakeSystemStatus");
	    throw ee;
	}
	// Encode field 'vehSize'
	try {
	    com.bah.ode.asn.oss.dsrc.VehicleSize item1 = this.vehSize;

	    {
		sink.writeSeparator();
		sink.encodeKey("vehSize");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("vehSize", "VehicleSize");
	    throw ee;
	}
	// Encode field 'vsmEventFlag'
	try {
	    VsmEventFlag item1 = this.vsmEventFlag;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("vsmEventFlag");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "vsmEventFlag");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("vsmEventFlag", "VsmEventFlag");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public FundamentalSituationalStatus decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[8];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		FundamentalSituationalStatus.__Tag t_tag0 = FundamentalSituationalStatus.__Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = FundamentalSituationalStatus.__Tag._null_;
		switch (t_tag0) {
		    case __speed:
		    // Decode field 'speed'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			this.speed = new com.bah.ode.asn.oss.dsrc.TransmissionAndSpeed(coder.decodeOctetString(source));
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("speed", "TransmissionAndSpeed");
			throw de;
		    }
		    break;
		    case __heading:
		    // Decode field 'heading'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.heading == null)
			    this.heading = new com.bah.ode.asn.oss.dsrc.Heading();
			this.heading.setValue(coder.decodeInteger(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("heading", "Heading");
			throw de;
		    }
		    break;
		    case __steeringAngle:
		    // Decode field 'steeringAngle'
		    try {
			if (present0[2])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			this.steeringAngle = new com.bah.ode.asn.oss.dsrc.SteeringWheelAngle(coder.decodeOctetString(source));
			present0[2] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("steeringAngle", "SteeringWheelAngle");
			throw de;
		    }
		    break;
		    case __accelSet:
		    // Decode field 'accelSet'
		    try {
			if (present0[3])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			this.accelSet = new com.bah.ode.asn.oss.dsrc.AccelerationSet4Way(coder.decodeOctetString(source));
			present0[3] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("accelSet", "AccelerationSet4Way");
			throw de;
		    }
		    break;
		    case __brakes:
		    // Decode field 'brakes'
		    try {
			if (present0[4])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			this.brakes = new com.bah.ode.asn.oss.dsrc.BrakeSystemStatus(coder.decodeOctetString(source));
			present0[4] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("brakes", "BrakeSystemStatus");
			throw de;
		    }
		    break;
		    case __vehSize:
		    // Decode field 'vehSize'
		    try {
			if (present0[5])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.vehSize == null)
			    this.vehSize = new com.bah.ode.asn.oss.dsrc.VehicleSize();
			this.vehSize.decodeValue(coder, source);
			present0[5] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("vehSize", "VehicleSize");
			throw de;
		    }
		    break;
		    case __vsmEventFlag:
		    // Decode field 'vsmEventFlag'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[6])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.vsmEventFlag = new VsmEventFlag(coder.decodeOctetString(source));
			    present0[6] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("vsmEventFlag", "VsmEventFlag");
			throw de;
		    }
		    break;
		    default:
			throw new DecoderException(ExceptionDescriptor._unknown_field, ": '" + tag0 + "'");
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'speed'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'heading'");
	if (!present0[2])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'steeringAngle'");
	if (!present0[3])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'accelSet'");
	if (!present0[4])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'brakes'");
	if (!present0[5])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'vehSize'");
	if (!present0[6])
	    this.vsmEventFlag = null;
	return this;
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((FundamentalSituationalStatus)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((FundamentalSituationalStatus)that);
    }
    
    public boolean equalTo(FundamentalSituationalStatus that) {
	if (!this.speed.equalTo(that.speed))
	    return false;
	if (!this.heading.equalTo(that.heading))
	    return false;
	if (!this.steeringAngle.equalTo(that.steeringAngle))
	    return false;
	if (!this.accelSet.equalTo(that.accelSet))
	    return false;
	if (!this.brakes.equalTo(that.brakes))
	    return false;
	if (!this.vehSize.equalTo(that.vehSize))
	    return false;
	if (this.vsmEventFlag != null && that.vsmEventFlag != null) {
	    if (!this.vsmEventFlag.equalTo(that.vsmEventFlag))
		return false;
	}
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public FundamentalSituationalStatus clone() {
	FundamentalSituationalStatus copy = (FundamentalSituationalStatus)super.clone();
	copy.speed = speed.clone();
	copy.heading = heading.clone();
	copy.steeringAngle = steeringAngle.clone();
	copy.accelSet = accelSet.clone();
	copy.brakes = brakes.clone();
	copy.vehSize = vehSize.clone();
	if (vsmEventFlag != null) {
	    copy.vsmEventFlag = vsmEventFlag.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.speed != null ? this.speed.hashCode() : 0);
	hash = 41 * hash + (this.heading != null ? this.heading.hashCode() : 0);
	hash = 41 * hash + (this.steeringAngle != null ? this.steeringAngle.hashCode() : 0);
	hash = 41 * hash + (this.accelSet != null ? this.accelSet.hashCode() : 0);
	hash = 41 * hash + (this.brakes != null ? this.brakes.hashCode() : 0);
	hash = 41 * hash + (this.vehSize != null ? this.vehSize.hashCode() : 0);
	hash = 41 * hash + (this.vsmEventFlag != null ? this.vsmEventFlag.hashCode() : 0);
	return hash;
    }
} // End class definition for FundamentalSituationalStatus
