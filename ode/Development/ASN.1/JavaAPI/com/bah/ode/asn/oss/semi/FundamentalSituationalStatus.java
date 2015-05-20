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
/* Created: Wed May 20 08:06:10 2015 */
/* ASN.1 Compiler for Java version: 6.1 */
/* ASN.1 compiler options and file names specified:
 * -toed -output com.bah.ode.asn.oss -per -uper -ber -der -root -messageFormat
 * msvc
 * C:/Users/572682/Projects/ODE/GitRepo/ode/Development/ASN.1/DSRC_R36_Source.asn
 * C:/Users/572682/Projects/ODE/GitRepo/ode/Development/ASN.1/SEMI_ASN.1_Structures_2.2.asn
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
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, FundamentalSituationalStatus data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	boolean has_vsmEventFlag0 = data.vsmEventFlag != null;
	sink.writeBit(has_vsmEventFlag0); ++nbits;
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
	if (has_vsmEventFlag0) {
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
	    com.bah.ode.asn.oss.dsrc.VehicleSize.decodeValue(coder, source, data.vehSize);
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

} // End class definition for FundamentalSituationalStatus
