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
/* Created: Fri May 20 15:51:02 2016 */
/* ASN.1 Compiler for Java version: 6.3 */
/* ASN.1 compiler options and file names specified:
 * -toed -output com.bah.ode.asn.oss -per -uper -ber -der -root -noSampleCode
 * -messageFormat msvc
 * C:/Users/572682/Projects/ODE/GitRepo/ode/Development/ASN.1/DSRC_R36_Source.asn
 * C:/Users/572682/Projects/ODE/GitRepo/ode/Development/ASN.1/SEMI_ASN.1_Structures_2.2.asn
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
 * Define the ASN1 Type ConfidenceSet from ASN1 Module DSRC.
 * @see Sequence
 */

public class ConfidenceSet extends Sequence {
    public AccelSteerYawRateConfidence accelConfidence;
    public SpeedandHeadingandThrottleConfidence speedConfidence;
    public TimeConfidence timeConfidence;
    public PositionConfidenceSet posConfidence;
    public SteeringWheelAngleConfidence steerConfidence;
    public ThrottleConfidence throttleConfidence;
    
    /**
     * The default constructor.
     */
    public ConfidenceSet()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ConfidenceSet(AccelSteerYawRateConfidence accelConfidence, 
		    SpeedandHeadingandThrottleConfidence speedConfidence, 
		    TimeConfidence timeConfidence, 
		    PositionConfidenceSet posConfidence, 
		    SteeringWheelAngleConfidence steerConfidence, 
		    ThrottleConfidence throttleConfidence)
    {
	setAccelConfidence(accelConfidence);
	setSpeedConfidence(speedConfidence);
	setTimeConfidence(timeConfidence);
	setPosConfidence(posConfidence);
	setSteerConfidence(steerConfidence);
	setThrottleConfidence(throttleConfidence);
    }
    
    
    // Methods for field "accelConfidence"
    public AccelSteerYawRateConfidence getAccelConfidence()
    {
	return this.accelConfidence;
    }
    
    public void setAccelConfidence(AccelSteerYawRateConfidence accelConfidence)
    {
	this.accelConfidence = accelConfidence;
    }
    
    public boolean hasAccelConfidence()
    {
	return (accelConfidence != null);
    }
    
    public void deleteAccelConfidence()
    {
	accelConfidence = null;
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
    
    
    // Methods for field "steerConfidence"
    public SteeringWheelAngleConfidence getSteerConfidence()
    {
	return this.steerConfidence;
    }
    
    public void setSteerConfidence(SteeringWheelAngleConfidence steerConfidence)
    {
	this.steerConfidence = steerConfidence;
    }
    
    public boolean hasSteerConfidence()
    {
	return (steerConfidence != null);
    }
    
    public void deleteSteerConfidence()
    {
	steerConfidence = null;
    }
    
    
    // Methods for field "throttleConfidence"
    public ThrottleConfidence getThrottleConfidence()
    {
	return this.throttleConfidence;
    }
    
    public void setThrottleConfidence(ThrottleConfidence throttleConfidence)
    {
	this.throttleConfidence = throttleConfidence;
    }
    
    public boolean hasThrottleConfidence()
    {
	return (throttleConfidence != null);
    }
    
    public void deleteThrottleConfidence()
    {
	throttleConfidence = null;
    }
    
    
    /**
     * Implements BER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encodeValue(BerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	int len0 = 0;
	ConfidenceSet temp0 = this;

	if (temp0.throttleConfidence != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.throttleConfidence, sink), 0x85);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("throttleConfidence", "ThrottleConfidence");
		throw ee;
	    }
	}
	if (temp0.steerConfidence != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.steerConfidence, sink), 0x84);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("steerConfidence", "SteeringWheelAngleConfidence");
		throw ee;
	    }
	}
	if (temp0.posConfidence != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.posConfidence.byteArrayValue()), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("posConfidence", "PositionConfidenceSet");
		throw ee;
	    }
	}
	if (temp0.timeConfidence != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.timeConfidence, sink), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("timeConfidence", "TimeConfidence");
		throw ee;
	    }
	}
	if (temp0.speedConfidence != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.speedConfidence.byteArrayValue()), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("speedConfidence", "SpeedandHeadingandThrottleConfidence");
		throw ee;
	    }
	}
	if (temp0.accelConfidence != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.accelConfidence.encodeValue(coder, sink), 0xA0);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("accelConfidence", "AccelSteerYawRateConfidence");
		throw ee;
	    }
	}

	return len0;
    }

    /**
     * Implements BER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public ConfidenceSet decodeValue(BerCoder coder, DecoderInput source)
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
	    if (tag == 0xA0) {
		try {
		    this.accelConfidence = new AccelSteerYawRateConfidence();
		    this.accelConfidence.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("accelConfidence", "AccelSteerYawRateConfidence");
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
	    if (tag == 0x82) {
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
	    if (tag == 0x83 || tag == 0xA3) {
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
	    if (tag == 0x84) {
		try {
		    int idx1 = SteeringWheelAngleConfidence.indexOfValue(source.decodeInt());
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
		    this.steerConfidence = SteeringWheelAngleConfidence.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("steerConfidence", "SteeringWheelAngleConfidence");
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
		    int idx1 = ThrottleConfidence.indexOfValue(source.decodeInt());
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
		    this.throttleConfidence = ThrottleConfidence.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("throttleConfidence", "ThrottleConfidence");
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
		    ee.appendExtensionContext("ConfidenceSet", -1);
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
	ConfidenceSet temp0 = this;

	if (temp0.throttleConfidence != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.throttleConfidence, sink), 0x85);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("throttleConfidence", "ThrottleConfidence");
		throw ee;
	    }
	}
	if (temp0.steerConfidence != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.steerConfidence, sink), 0x84);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("steerConfidence", "SteeringWheelAngleConfidence");
		throw ee;
	    }
	}
	if (temp0.posConfidence != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.posConfidence.byteArrayValue()), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("posConfidence", "PositionConfidenceSet");
		throw ee;
	    }
	}
	if (temp0.timeConfidence != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.timeConfidence, sink), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("timeConfidence", "TimeConfidence");
		throw ee;
	    }
	}
	if (temp0.speedConfidence != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.speedConfidence.byteArrayValue()), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("speedConfidence", "SpeedandHeadingandThrottleConfidence");
		throw ee;
	    }
	}
	if (temp0.accelConfidence != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.accelConfidence.encodeValue(coder, sink), 0xA0);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("accelConfidence", "AccelSteerYawRateConfidence");
		throw ee;
	    }
	}

	return len0;
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, ConfidenceSet data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.accelConfidence != null);
	sink.writeBit(data.speedConfidence != null);
	sink.writeBit(data.timeConfidence != null);
	sink.writeBit(data.posConfidence != null);
	sink.writeBit(data.steerConfidence != null);
	sink.writeBit(data.throttleConfidence != null);
	nbits += 7;
	if (data.accelConfidence != null) {
	    // Encode field 'accelConfidence'
	    try {
		AccelSteerYawRateConfidence item1 = data.accelConfidence;

		nbits += AccelSteerYawRateConfidence.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("accelConfidence", "AccelSteerYawRateConfidence");
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
	if (data.steerConfidence != null) {
	    // Encode field 'steerConfidence'
	    try {
		SteeringWheelAngleConfidence item1 = data.steerConfidence;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 3, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("steerConfidence", "SteeringWheelAngleConfidence");
		throw ee;
	    }
	}
	if (data.throttleConfidence != null) {
	    // Encode field 'throttleConfidence'
	    try {
		ThrottleConfidence item1 = data.throttleConfidence;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 3, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("throttleConfidence", "ThrottleConfidence");
		throw ee;
	    }
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static ConfidenceSet decodeValue(PerCoder coder, InputBitStream source, ConfidenceSet data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_accelConfidence0 = source.readBit();
	boolean has_speedConfidence0 = source.readBit();
	boolean has_timeConfidence0 = source.readBit();
	boolean has_posConfidence0 = source.readBit();
	boolean has_steerConfidence0 = source.readBit();
	boolean has_throttleConfidence0 = source.readBit();
    /** Decode root fields **/
	if (has_accelConfidence0) {
	    // Decode field 'accelConfidence'
	    try {
		if (data.accelConfidence == null)
		    data.accelConfidence = new AccelSteerYawRateConfidence();
		data.accelConfidence.decodeValue(coder, source, data.accelConfidence);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("accelConfidence", "AccelSteerYawRateConfidence");
		throw de;
	    }
	} else {
	    data.accelConfidence = null;
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
	if (has_steerConfidence0) {
	    // Decode field 'steerConfidence'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
		if (idx1 < 0 || idx1 > 3)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.steerConfidence = SteeringWheelAngleConfidence.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("steerConfidence", "SteeringWheelAngleConfidence");
		throw de;
	    }
	} else {
	    data.steerConfidence = null;
	}
	if (has_throttleConfidence0) {
	    // Decode field 'throttleConfidence'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
		if (idx1 < 0 || idx1 > 3)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.throttleConfidence = ThrottleConfidence.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("throttleConfidence", "ThrottleConfidence");
		throw de;
	    }
	} else {
	    data.throttleConfidence = null;
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
	if (this.accelConfidence != null) {
	    try {
		comma0 = true;
		printer.newLine(writer);
		writer.print("accelConfidence ");
		this.accelConfidence.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.speedConfidence != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("speedConfidence ");
		printer.print(this.speedConfidence, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.timeConfidence != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("timeConfidence ");
		printer.print(this.timeConfidence, writer, this.timeConfidence.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.posConfidence != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("posConfidence ");
		printer.print(this.posConfidence, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.steerConfidence != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("steerConfidence ");
		printer.print(this.steerConfidence, writer, this.steerConfidence.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.throttleConfidence != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("throttleConfidence ");
		printer.print(this.throttleConfidence, writer, this.throttleConfidence.cConstantNameList);
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
	return equalTo((ConfidenceSet)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((ConfidenceSet)that);
    }
    
    public boolean equalTo(ConfidenceSet that) {
	if (this.accelConfidence != null && that.accelConfidence != null) {
	    if (!this.accelConfidence.equalTo(that.accelConfidence))
		return false;
	}
	if (this.speedConfidence != null && that.speedConfidence != null) {
	    if (!this.speedConfidence.equalTo(that.speedConfidence))
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
	if (this.steerConfidence != null && that.steerConfidence != null) {
	    if (!this.steerConfidence.equalTo(that.steerConfidence))
		return false;
	}
	if (this.throttleConfidence != null && that.throttleConfidence != null) {
	    if (!this.throttleConfidence.equalTo(that.throttleConfidence))
		return false;
	}
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public ConfidenceSet clone() {
	ConfidenceSet copy = (ConfidenceSet)super.clone();
	if (accelConfidence != null) {
	    copy.accelConfidence = accelConfidence.clone();
	}
	if (speedConfidence != null) {
	    copy.speedConfidence = speedConfidence.clone();
	}
	if (timeConfidence != null) {
	    copy.timeConfidence = timeConfidence.clone();
	}
	if (posConfidence != null) {
	    copy.posConfidence = posConfidence.clone();
	}
	if (steerConfidence != null) {
	    copy.steerConfidence = steerConfidence.clone();
	}
	if (throttleConfidence != null) {
	    copy.throttleConfidence = throttleConfidence.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.accelConfidence != null ? this.accelConfidence.hashCode() : 0);
	hash = 41 * hash + (this.speedConfidence != null ? this.speedConfidence.hashCode() : 0);
	hash = 41 * hash + (this.timeConfidence != null ? this.timeConfidence.hashCode() : 0);
	hash = 41 * hash + (this.posConfidence != null ? this.posConfidence.hashCode() : 0);
	hash = 41 * hash + (this.steerConfidence != null ? this.steerConfidence.hashCode() : 0);
	hash = 41 * hash + (this.throttleConfidence != null ? this.throttleConfidence.hashCode() : 0);
	return hash;
    }
} // End class definition for ConfidenceSet
