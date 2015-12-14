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
/* Created: Mon Dec 14 18:10:04 2015 */
/* ASN.1 Compiler for Java version: 6.2 */
/* ASN.1 compiler options and file names specified:
 * -toed -output com.bah.ode.asn.oss -per -uper -ber -der -root
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
import com.oss.coders.OutputBitStream;
import com.oss.coders.per.PEREncodable;
import com.oss.coders.InputBitStream;
import com.oss.coders.per.PERDecodable;
import com.oss.coders.per.PerCoder;

/**
 * Define the ASN1 Type FullPositionVector from ASN1 Module DSRC.
 * @see Sequence
 */

public class FullPositionVector extends Sequence {
    public DDateTime utcTime;
    public Longitude _long;
    public Latitude lat;
    public Elevation elevation;
    public Heading heading;
    public TransmissionAndSpeed speed;
    public PositionalAccuracy posAccuracy;
    public TimeConfidence timeConfidence;
    public PositionConfidenceSet posConfidence;
    public SpeedandHeadingandThrottleConfidence speedConfidence;
    
    /**
     * The default constructor.
     */
    public FullPositionVector()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public FullPositionVector(DDateTime utcTime, Longitude _long, 
		    Latitude lat, Elevation elevation, Heading heading, 
		    TransmissionAndSpeed speed, 
		    PositionalAccuracy posAccuracy, 
		    TimeConfidence timeConfidence, 
		    PositionConfidenceSet posConfidence, 
		    SpeedandHeadingandThrottleConfidence speedConfidence)
    {
	setUtcTime(utcTime);
	set_long(_long);
	setLat(lat);
	setElevation(elevation);
	setHeading(heading);
	setSpeed(speed);
	setPosAccuracy(posAccuracy);
	setTimeConfidence(timeConfidence);
	setPosConfidence(posConfidence);
	setSpeedConfidence(speedConfidence);
    }
    
    /**
     * Construct with required components.
     */
    public FullPositionVector(Longitude _long, Latitude lat)
    {
	set_long(_long);
	setLat(lat);
    }
    
    
    // Methods for field "utcTime"
    public DDateTime getUtcTime()
    {
	return this.utcTime;
    }
    
    public void setUtcTime(DDateTime utcTime)
    {
	this.utcTime = utcTime;
    }
    
    public boolean hasUtcTime()
    {
	return (utcTime != null);
    }
    
    public void deleteUtcTime()
    {
	utcTime = null;
    }
    
    
    // Methods for field "_long"
    public Longitude get_long()
    {
	return this._long;
    }
    
    public void set_long(Longitude _long)
    {
	this._long = _long;
    }
    
    
    // Methods for field "lat"
    public Latitude getLat()
    {
	return this.lat;
    }
    
    public void setLat(Latitude lat)
    {
	this.lat = lat;
    }
    
    
    // Methods for field "elevation"
    public Elevation getElevation()
    {
	return this.elevation;
    }
    
    public void setElevation(Elevation elevation)
    {
	this.elevation = elevation;
    }
    
    public boolean hasElevation()
    {
	return (elevation != null);
    }
    
    public void deleteElevation()
    {
	elevation = null;
    }
    
    
    // Methods for field "heading"
    public Heading getHeading()
    {
	return this.heading;
    }
    
    public void setHeading(Heading heading)
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
    
    
    // Methods for field "timeConfidence"
    public TimeConfidence getTimeConfidence()
    {
	return this.timeConfidence;
    }
    
    public void setTimeConfidence(TimeConfidence timeConfidence)
    {
	this.timeConfidence = timeConfidence;
    }
    
    public boolean hasTimeConfidence()
    {
	return (timeConfidence != null);
    }
    
    public void deleteTimeConfidence()
    {
	timeConfidence = null;
    }
    
    
    // Methods for field "posConfidence"
    public PositionConfidenceSet getPosConfidence()
    {
	return this.posConfidence;
    }
    
    public void setPosConfidence(PositionConfidenceSet posConfidence)
    {
	this.posConfidence = posConfidence;
    }
    
    public boolean hasPosConfidence()
    {
	return (posConfidence != null);
    }
    
    public void deletePosConfidence()
    {
	posConfidence = null;
    }
    
    
    // Methods for field "speedConfidence"
    public SpeedandHeadingandThrottleConfidence getSpeedConfidence()
    {
	return this.speedConfidence;
    }
    
    public void setSpeedConfidence(SpeedandHeadingandThrottleConfidence speedConfidence)
    {
	this.speedConfidence = speedConfidence;
    }
    
    public boolean hasSpeedConfidence()
    {
	return (speedConfidence != null);
    }
    
    public void deleteSpeedConfidence()
    {
	speedConfidence = null;
    }
    
    
    /**
     * Implements BER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encodeValue(BerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	int len0 = 0;
	FullPositionVector temp0 = this;

	if (temp0.speedConfidence != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.speedConfidence.byteArrayValue()), 0x89);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("speedConfidence", "SpeedandHeadingandThrottleConfidence");
		throw ee;
	    }
	}
	if (temp0.posConfidence != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.posConfidence.byteArrayValue()), 0x88);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("posConfidence", "PositionConfidenceSet");
		throw ee;
	    }
	}
	if (temp0.timeConfidence != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.timeConfidence, sink), 0x87);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("timeConfidence", "TimeConfidence");
		throw ee;
	    }
	}
	if (temp0.posAccuracy != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.posAccuracy.byteArrayValue()), 0x86);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("posAccuracy", "PositionalAccuracy");
		throw ee;
	    }
	}
	if (temp0.speed != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.speed.byteArrayValue()), 0x85);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("speed", "TransmissionAndSpeed");
		throw ee;
	    }
	}
	if (temp0.heading != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.heading, sink), 0x84);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("heading", "Heading");
		throw ee;
	    }
	}
	if (temp0.elevation != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.elevation.byteArrayValue()), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("elevation", "Elevation");
		throw ee;
	    }
	}
	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.lat, sink), 0x82);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("lat", "Latitude");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0._long, sink), 0x81);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("long", "Longitude");
	    throw ee;
	}
	if (temp0.utcTime != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.utcTime.encodeValue(coder, sink), 0xA0);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("utcTime", "DDateTime");
		throw ee;
	    }
	}

	return len0;
    }

    /**
     * Implements BER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public FullPositionVector decodeValue(BerCoder coder, DecoderInput source)
	    throws DecoderException
    {
	int total_len0 = source.mLength;
	int end_pos0 = (total_len0 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len0);
	int tag;

	do {
	    tag = source.decodeTagLength();
	    if (tag == 0xA0) {
		try {
		    this.utcTime = new DDateTime();
		    this.utcTime.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("utcTime", "DDateTime");
		    throw ee;
		}
		tag = source.decodeTagLength();
	    }
	    if (tag != 0x81)
		source.raiseTagMismatchException(tag);
	    try {
		this._long = new Longitude(source.decodeLong());
	    } catch (Exception e) {
		DecoderException ee = DecoderException.wrapException(e);
		ee.appendFieldContext("long", "Longitude");
		throw ee;
	    }
	    tag = source.decodeTagLength();
	    if (tag != 0x82)
		source.raiseTagMismatchException(tag);
	    try {
		this.lat = new Latitude(source.decodeLong());
	    } catch (Exception e) {
		DecoderException ee = DecoderException.wrapException(e);
		ee.appendFieldContext("lat", "Latitude");
		throw ee;
	    }
	    if (source.position() >= end_pos0)
		break;
	    tag = source.decodeTagLength();
	    if (tag == 0)
		break;
	    if (tag == 0x83 || tag == 0xA3) {
		try {
		    this.elevation = new Elevation(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("elevation", "Elevation");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x84) {
		try {
		    this.heading = new Heading(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("heading", "Heading");
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
	    if (tag == 0x86 || tag == 0xA6) {
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
	    if (tag == 0x87) {
		try {
		    int idx1 = TimeConfidence.indexOfValue(source.decodeInt());
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
		    this.timeConfidence = TimeConfidence.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("timeConfidence", "TimeConfidence");
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
		    this.posConfidence = new PositionConfidenceSet(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("posConfidence", "PositionConfidenceSet");
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
		    this.speedConfidence = new SpeedandHeadingandThrottleConfidence(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("speedConfidence", "SpeedandHeadingandThrottleConfidence");
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
		    ee.appendExtensionContext("FullPositionVector", -1);
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
	FullPositionVector temp0 = this;

	if (temp0.speedConfidence != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.speedConfidence.byteArrayValue()), 0x89);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("speedConfidence", "SpeedandHeadingandThrottleConfidence");
		throw ee;
	    }
	}
	if (temp0.posConfidence != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.posConfidence.byteArrayValue()), 0x88);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("posConfidence", "PositionConfidenceSet");
		throw ee;
	    }
	}
	if (temp0.timeConfidence != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.timeConfidence, sink), 0x87);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("timeConfidence", "TimeConfidence");
		throw ee;
	    }
	}
	if (temp0.posAccuracy != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.posAccuracy.byteArrayValue()), 0x86);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("posAccuracy", "PositionalAccuracy");
		throw ee;
	    }
	}
	if (temp0.speed != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.speed.byteArrayValue()), 0x85);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("speed", "TransmissionAndSpeed");
		throw ee;
	    }
	}
	if (temp0.heading != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.heading, sink), 0x84);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("heading", "Heading");
		throw ee;
	    }
	}
	if (temp0.elevation != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.elevation.byteArrayValue()), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("elevation", "Elevation");
		throw ee;
	    }
	}
	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.lat, sink), 0x82);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("lat", "Latitude");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0._long, sink), 0x81);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("long", "Longitude");
	    throw ee;
	}
	if (temp0.utcTime != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.utcTime.encodeValue(coder, sink), 0xA0);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("utcTime", "DDateTime");
		throw ee;
	    }
	}

	return len0;
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, FullPositionVector data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.utcTime != null);
	sink.writeBit(data.elevation != null);
	sink.writeBit(data.heading != null);
	sink.writeBit(data.speed != null);
	sink.writeBit(data.posAccuracy != null);
	sink.writeBit(data.timeConfidence != null);
	sink.writeBit(data.posConfidence != null);
	sink.writeBit(data.speedConfidence != null);
	nbits += 9;
	if (data.utcTime != null) {
	    // Encode field 'utcTime'
	    try {
		DDateTime item1 = data.utcTime;

		nbits += DDateTime.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("utcTime", "DDateTime");
		throw ee;
	    }
	}
	// Encode field 'long'
	try {
	    Longitude item1 = data._long;
	    long temp1 = item1.longValue();

	    if (temp1 < -1800000000 || temp1 > 1800000001)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, -1800000000, 1800000001, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("long", "Longitude");
	    throw ee;
	}
	// Encode field 'lat'
	try {
	    Latitude item1 = data.lat;
	    long temp1 = item1.longValue();

	    if (temp1 < -900000000 || temp1 > 900000001)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, -900000000, 900000001, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("lat", "Latitude");
	    throw ee;
	}
	if (data.elevation != null) {
	    // Encode field 'elevation'
	    try {
		Elevation item1 = data.elevation;
		int len1 = item1.getSize();

		if (len1 != 2)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 2, 2, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("elevation", "Elevation");
		throw ee;
	    }
	}
	if (data.heading != null) {
	    // Encode field 'heading'
	    try {
		Heading item1 = data.heading;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 28800)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 28800, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("heading", "Heading");
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
	if (data.timeConfidence != null) {
	    // Encode field 'timeConfidence'
	    try {
		TimeConfidence item1 = data.timeConfidence;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 39, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("timeConfidence", "TimeConfidence");
		throw ee;
	    }
	}
	if (data.posConfidence != null) {
	    // Encode field 'posConfidence'
	    try {
		PositionConfidenceSet item1 = data.posConfidence;
		int len1 = item1.getSize();

		if (len1 != 1)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 1, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("posConfidence", "PositionConfidenceSet");
		throw ee;
	    }
	}
	if (data.speedConfidence != null) {
	    // Encode field 'speedConfidence'
	    try {
		SpeedandHeadingandThrottleConfidence item1 = data.speedConfidence;
		int len1 = item1.getSize();

		if (len1 != 1)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 1, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("speedConfidence", "SpeedandHeadingandThrottleConfidence");
		throw ee;
	    }
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static FullPositionVector decodeValue(PerCoder coder, InputBitStream source, FullPositionVector data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_utcTime0 = source.readBit();
	boolean has_elevation0 = source.readBit();
	boolean has_heading0 = source.readBit();
	boolean has_speed0 = source.readBit();
	boolean has_posAccuracy0 = source.readBit();
	boolean has_timeConfidence0 = source.readBit();
	boolean has_posConfidence0 = source.readBit();
	boolean has_speedConfidence0 = source.readBit();
    /** Decode root fields **/
	if (has_utcTime0) {
	    // Decode field 'utcTime'
	    try {
		if (data.utcTime == null)
		    data.utcTime = new DDateTime();
		data.utcTime.decodeValue(coder, source, data.utcTime);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("utcTime", "DDateTime");
		throw de;
	    }
	} else {
	    data.utcTime = null;
	}
	// Decode field 'long'
	try {
	    long temp1;

	    if (data._long == null)
		data._long = new Longitude();
	    temp1 = coder.decodeConstrainedWholeNumber(source, -1800000000, 1800000001);
	    if (temp1 > 1800000001)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data._long.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("long", "Longitude");
	    throw de;
	}
	// Decode field 'lat'
	try {
	    long temp1;

	    if (data.lat == null)
		data.lat = new Latitude();
	    temp1 = coder.decodeConstrainedWholeNumber(source, -900000000, 900000001);
	    if (temp1 > 900000001)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.lat.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("lat", "Latitude");
	    throw de;
	}
	if (has_elevation0) {
	    // Decode field 'elevation'
	    try {
		data.elevation = new Elevation(com.oss.coders.per.PerOctets.decode(coder, source, 2, 2));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("elevation", "Elevation");
		throw de;
	    }
	} else {
	    data.elevation = null;
	}
	if (has_heading0) {
	    // Decode field 'heading'
	    try {
		long temp1;

		if (data.heading == null)
		    data.heading = new Heading();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 28800);
		if (temp1 > 28800)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.heading.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("heading", "Heading");
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
	if (has_timeConfidence0) {
	    // Decode field 'timeConfidence'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 39);
		if (idx1 < 0 || idx1 > 39)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.timeConfidence = TimeConfidence.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("timeConfidence", "TimeConfidence");
		throw de;
	    }
	} else {
	    data.timeConfidence = null;
	}
	if (has_posConfidence0) {
	    // Decode field 'posConfidence'
	    try {
		data.posConfidence = new PositionConfidenceSet(com.oss.coders.per.PerOctets.decode(coder, source, 1, 1));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("posConfidence", "PositionConfidenceSet");
		throw de;
	    }
	} else {
	    data.posConfidence = null;
	}
	if (has_speedConfidence0) {
	    // Decode field 'speedConfidence'
	    try {
		data.speedConfidence = new SpeedandHeadingandThrottleConfidence(com.oss.coders.per.PerOctets.decode(coder, source, 1, 1));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("speedConfidence", "SpeedandHeadingandThrottleConfidence");
		throw de;
	    }
	} else {
	    data.speedConfidence = null;
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
	if (this.utcTime != null) {
	    try {
		comma0 = true;
		printer.newLine(writer);
		writer.print("utcTime ");
		this.utcTime.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("long ");
	    writer.print(this._long.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("lat ");
	    writer.print(this.lat.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.elevation != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("elevation ");
		printer.print(this.elevation, writer);
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
	if (this.timeConfidence != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("timeConfidence ");
		printer.print(this.timeConfidence, writer, this.timeConfidence.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.posConfidence != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("posConfidence ");
		printer.print(this.posConfidence, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.speedConfidence != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("speedConfidence ");
		printer.print(this.speedConfidence, writer);
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
	return equalTo((FullPositionVector)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((FullPositionVector)that);
    }
    
    public boolean equalTo(FullPositionVector that) {
	if (this.utcTime != null && that.utcTime != null) {
	    if (!this.utcTime.equalTo(that.utcTime))
		return false;
	}
	if (!this._long.equalTo(that._long))
	    return false;
	if (!this.lat.equalTo(that.lat))
	    return false;
	if (this.elevation != null && that.elevation != null) {
	    if (!this.elevation.equalTo(that.elevation))
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
	if (this.posAccuracy != null && that.posAccuracy != null) {
	    if (!this.posAccuracy.equalTo(that.posAccuracy))
		return false;
	}
	if (this.timeConfidence != null && that.timeConfidence != null) {
	    if (!this.timeConfidence.equalTo(that.timeConfidence))
		return false;
	}
	if (this.posConfidence != null && that.posConfidence != null) {
	    if (!this.posConfidence.equalTo(that.posConfidence))
		return false;
	}
	if (this.speedConfidence != null && that.speedConfidence != null) {
	    if (!this.speedConfidence.equalTo(that.speedConfidence))
		return false;
	}
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public FullPositionVector clone() {
	FullPositionVector copy = (FullPositionVector)super.clone();
	if (utcTime != null) {
	    copy.utcTime = utcTime.clone();
	}
	copy._long = _long.clone();
	copy.lat = lat.clone();
	if (elevation != null) {
	    copy.elevation = elevation.clone();
	}
	if (heading != null) {
	    copy.heading = heading.clone();
	}
	if (speed != null) {
	    copy.speed = speed.clone();
	}
	if (posAccuracy != null) {
	    copy.posAccuracy = posAccuracy.clone();
	}
	if (timeConfidence != null) {
	    copy.timeConfidence = timeConfidence.clone();
	}
	if (posConfidence != null) {
	    copy.posConfidence = posConfidence.clone();
	}
	if (speedConfidence != null) {
	    copy.speedConfidence = speedConfidence.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.utcTime != null ? this.utcTime.hashCode() : 0);
	hash = 41 * hash + (this._long != null ? this._long.hashCode() : 0);
	hash = 41 * hash + (this.lat != null ? this.lat.hashCode() : 0);
	hash = 41 * hash + (this.elevation != null ? this.elevation.hashCode() : 0);
	hash = 41 * hash + (this.heading != null ? this.heading.hashCode() : 0);
	hash = 41 * hash + (this.speed != null ? this.speed.hashCode() : 0);
	hash = 41 * hash + (this.posAccuracy != null ? this.posAccuracy.hashCode() : 0);
	hash = 41 * hash + (this.timeConfidence != null ? this.timeConfidence.hashCode() : 0);
	hash = 41 * hash + (this.posConfidence != null ? this.posConfidence.hashCode() : 0);
	hash = 41 * hash + (this.speedConfidence != null ? this.speedConfidence.hashCode() : 0);
	return hash;
    }
} // End class definition for FullPositionVector
