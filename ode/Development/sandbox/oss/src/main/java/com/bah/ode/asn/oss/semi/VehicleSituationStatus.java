/*************************************************************/
/* Copyright (C) 2015 OSS Nokalva, Inc.  All rights reserved.*/
/*************************************************************/

/* THIS FILE IS PROPRIETARY MATERIAL OF OSS NOKALVA, INC.
 * AND MAY BE USED ONLY BY DIRECT LICENSEES OF OSS NOKALVA, INC.
 * THIS FILE MAY NOT BE DISTRIBUTED.
 * THIS COPYRIGHT STATEMENT MAY NOT BE REMOVED. */

/* Generated for: Booz Allen Hamilton (Trial), License 70234Z. */
/* Abstract syntax: semi_asn */
/* ASN.1 Java project: com.bah.ode.asn.oss.Oss */
/* Created: Tue Mar 24 11:33:39 2015 */
/* ASN.1 Compiler for Java version: 6.1 */
/* ASN.1 compiler options and file names specified:
 * -toed -output com.bah.ode.asn.oss -per -uper -ber -der -root -messageFormat
 * msvc C:/Users/572682/Projects/ODE/Trials/ASN.1/DSRC_R36_Source.asn
 * C:/Users/572682/Projects/ODE/Trials/ASN.1/SEMI_ASN.1_Structures_2.2.asn
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
 * Define the ASN1 Type VehicleSituationStatus from ASN1 Module SEMI.
 * @see Sequence
 */

public class VehicleSituationStatus extends Sequence {
    public com.bah.ode.asn.oss.dsrc.ExteriorLights lights;
    public com.bah.ode.asn.oss.dsrc.ThrottlePosition throttlePos;
    public TirePressure tirePressure;
    
    /**
     * The default constructor.
     */
    public VehicleSituationStatus()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public VehicleSituationStatus(com.bah.ode.asn.oss.dsrc.ExteriorLights lights, 
		    com.bah.ode.asn.oss.dsrc.ThrottlePosition throttlePos, 
		    TirePressure tirePressure)
    {
	setLights(lights);
	setThrottlePos(throttlePos);
	setTirePressure(tirePressure);
    }
    
    /**
     * Construct with required components.
     */
    public VehicleSituationStatus(com.bah.ode.asn.oss.dsrc.ExteriorLights lights)
    {
	setLights(lights);
    }
    
    
    // Methods for field "lights"
    public com.bah.ode.asn.oss.dsrc.ExteriorLights getLights()
    {
	return this.lights;
    }
    
    public void setLights(com.bah.ode.asn.oss.dsrc.ExteriorLights lights)
    {
	this.lights = lights;
    }
    
    
    // Methods for field "throttlePos"
    public com.bah.ode.asn.oss.dsrc.ThrottlePosition getThrottlePos()
    {
	return this.throttlePos;
    }
    
    public void setThrottlePos(com.bah.ode.asn.oss.dsrc.ThrottlePosition throttlePos)
    {
	this.throttlePos = throttlePos;
    }
    
    public boolean hasThrottlePos()
    {
	return (throttlePos != null);
    }
    
    public void deleteThrottlePos()
    {
	throttlePos = null;
    }
    
    
    // Methods for field "tirePressure"
    public TirePressure getTirePressure()
    {
	return this.tirePressure;
    }
    
    public void setTirePressure(TirePressure tirePressure)
    {
	this.tirePressure = tirePressure;
    }
    
    public boolean hasTirePressure()
    {
	return (tirePressure != null);
    }
    
    public void deleteTirePressure()
    {
	tirePressure = null;
    }
    
    
    
    /**
     * Define the ASN1 Type TirePressure from ASN1 Module SEMI.
     * @see Sequence
     */
    public static class TirePressure extends Sequence {
	public com.bah.ode.asn.oss.dsrc.TirePressure leftFront;
	public com.bah.ode.asn.oss.dsrc.TirePressure leftRear;
	public com.bah.ode.asn.oss.dsrc.TirePressure rightFront;
	public com.bah.ode.asn.oss.dsrc.TirePressure rightRear;
	
	/**
	 * The default constructor.
	 */
	public TirePressure()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public TirePressure(com.bah.ode.asn.oss.dsrc.TirePressure leftFront, 
			com.bah.ode.asn.oss.dsrc.TirePressure leftRear, 
			com.bah.ode.asn.oss.dsrc.TirePressure rightFront, 
			com.bah.ode.asn.oss.dsrc.TirePressure rightRear)
	{
	    setLeftFront(leftFront);
	    setLeftRear(leftRear);
	    setRightFront(rightFront);
	    setRightRear(rightRear);
	}
	
	
	// Methods for field "leftFront"
	public com.bah.ode.asn.oss.dsrc.TirePressure getLeftFront()
	{
	    return this.leftFront;
	}
	
	public void setLeftFront(com.bah.ode.asn.oss.dsrc.TirePressure leftFront)
	{
	    this.leftFront = leftFront;
	}
	
	
	// Methods for field "leftRear"
	public com.bah.ode.asn.oss.dsrc.TirePressure getLeftRear()
	{
	    return this.leftRear;
	}
	
	public void setLeftRear(com.bah.ode.asn.oss.dsrc.TirePressure leftRear)
	{
	    this.leftRear = leftRear;
	}
	
	
	// Methods for field "rightFront"
	public com.bah.ode.asn.oss.dsrc.TirePressure getRightFront()
	{
	    return this.rightFront;
	}
	
	public void setRightFront(com.bah.ode.asn.oss.dsrc.TirePressure rightFront)
	{
	    this.rightFront = rightFront;
	}
	
	
	// Methods for field "rightRear"
	public com.bah.ode.asn.oss.dsrc.TirePressure getRightRear()
	{
	    return this.rightRear;
	}
	
	public void setRightRear(com.bah.ode.asn.oss.dsrc.TirePressure rightRear)
	{
	    this.rightRear = rightRear;
	}
	
	
	/**
	 * Implements PER value encoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public static int encodeValue(PerCoder coder, OutputBitStream sink, TirePressure data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int nbits = 0;

	    // Encode field 'leftFront'
	    try {
		com.bah.ode.asn.oss.dsrc.TirePressure item1 = data.leftFront;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 1000)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += (coder.encodeConstrainedWholeNumber(temp1, 0, 1000, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("leftFront", "TirePressure");
		throw ee;
	    }
	    // Encode field 'leftRear'
	    try {
		com.bah.ode.asn.oss.dsrc.TirePressure item1 = data.leftRear;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 1000)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 1000, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("leftRear", "TirePressure");
		throw ee;
	    }
	    // Encode field 'rightFront'
	    try {
		com.bah.ode.asn.oss.dsrc.TirePressure item1 = data.rightFront;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 1000)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 1000, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("rightFront", "TirePressure");
		throw ee;
	    }
	    // Encode field 'rightRear'
	    try {
		com.bah.ode.asn.oss.dsrc.TirePressure item1 = data.rightRear;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 1000)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 1000, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("rightRear", "TirePressure");
		throw ee;
	    }

	    return nbits;
	}

	/**
	 * Implements PER value decoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public static TirePressure decodeValue(PerCoder coder, InputBitStream source, TirePressure data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    // Decode field 'leftFront'
	    try {
		long temp1;

		if (data.leftFront == null)
		    data.leftFront = new com.bah.ode.asn.oss.dsrc.TirePressure();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 1000);
		if (temp1 > 1000)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.leftFront.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("leftFront", "TirePressure");
		throw de;
	    }
	    // Decode field 'leftRear'
	    try {
		long temp1;

		if (data.leftRear == null)
		    data.leftRear = new com.bah.ode.asn.oss.dsrc.TirePressure();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 1000);
		if (temp1 > 1000)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.leftRear.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("leftRear", "TirePressure");
		throw de;
	    }
	    // Decode field 'rightFront'
	    try {
		long temp1;

		if (data.rightFront == null)
		    data.rightFront = new com.bah.ode.asn.oss.dsrc.TirePressure();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 1000);
		if (temp1 > 1000)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.rightFront.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("rightFront", "TirePressure");
		throw de;
	    }
	    // Decode field 'rightRear'
	    try {
		long temp1;

		if (data.rightRear == null)
		    data.rightRear = new com.bah.ode.asn.oss.dsrc.TirePressure();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 1000);
		if (temp1 > 1000)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.rightRear.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("rightRear", "TirePressure");
		throw de;
	    }
	    return data;
	}

	/**
	 * Compare 'this' object to another object to see if their contents are the same.
	 */
	public boolean abstractEqualTo(AbstractData that)
	{
	    return equalTo((TirePressure)that);
	}
	
	public boolean equalTo(Sequence that)
	{
	    return equalTo((TirePressure)that);
	}
	
	public boolean equalTo(TirePressure that) {
	    if (!this.leftFront.equalTo(that.leftFront))
		return false;
	    if (!this.leftRear.equalTo(that.leftRear))
		return false;
	    if (!this.rightFront.equalTo(that.rightFront))
		return false;
	    if (!this.rightRear.equalTo(that.rightRear))
		return false;
	    return true;
	}

	/**
	 * Clone 'this' object.
	 */
	public TirePressure clone() {
	    TirePressure copy = (TirePressure)super.clone();
	    copy.leftFront = leftFront.clone();
	    copy.leftRear = leftRear.clone();
	    copy.rightFront = rightFront.clone();
	    copy.rightRear = rightRear.clone();
	    return copy;
	}

    } // End class definition for TirePressure

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, VehicleSituationStatus data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	boolean has_throttlePos0 = data.throttlePos != null;
	boolean has_tirePressure0 = data.tirePressure != null;
	sink.writeBit(false); ++nbits;
	sink.writeBit(has_throttlePos0); ++nbits;
	sink.writeBit(has_tirePressure0); ++nbits;
	// Encode field 'lights'
	try {
	    com.bah.ode.asn.oss.dsrc.ExteriorLights item1 = data.lights;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 256)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 256, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("lights", "ExteriorLights");
	    throw ee;
	}
	if (has_throttlePos0) {
	    // Encode field 'throttlePos'
	    try {
		com.bah.ode.asn.oss.dsrc.ThrottlePosition item1 = data.throttlePos;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 200)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 200, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("throttlePos", "ThrottlePosition");
		throw ee;
	    }
	}
	if (has_tirePressure0) {
	    // Encode field 'tirePressure'
	    try {
		TirePressure item1 = data.tirePressure;

		nbits += TirePressure.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("tirePressure", "SEQUENCE");
		throw ee;
	    }
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static VehicleSituationStatus decodeValue(PerCoder coder, InputBitStream source, VehicleSituationStatus data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	int idx0;
	InputBitStream bitstream0 = null;

	boolean has_throttlePos0 = source.readBit();
	boolean has_tirePressure0 = source.readBit();
	// Decode field 'lights'
	try {
	    long temp1;

	    if (data.lights == null)
		data.lights = new com.bah.ode.asn.oss.dsrc.ExteriorLights();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 256);
	    if (temp1 > 256)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.lights.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("lights", "ExteriorLights");
	    throw de;
	}
	if (has_throttlePos0) {
	    // Decode field 'throttlePos'
	    try {
		long temp1;

		if (data.throttlePos == null)
		    data.throttlePos = new com.bah.ode.asn.oss.dsrc.ThrottlePosition();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 200);
		if (temp1 > 200)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.throttlePos.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("throttlePos", "ThrottlePosition");
		throw de;
	    }
	} else {
	    data.throttlePos = null;
	}
	if (has_tirePressure0) {
	    // Decode field 'tirePressure'
	    try {
		if (data.tirePressure == null)
		    data.tirePressure = new TirePressure();
		TirePressure.decodeValue(coder, source, data.tirePressure);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("tirePressure", "SEQUENCE");
		throw de;
	    }
	} else {
	    data.tirePressure = null;
	}
	if (_has_extensions0) {
	    len0 = coder.decodeNormallySmallLength(source);
	    if (coder.moreFragments())
		throw new DecoderException(com.oss.util.ExceptionDescriptor._too_many_ext_additions, null, "16384 or more");
	    int unknown_exts0 = 0;
	    if (len0 > 0)
		for (idx0 = 0; idx0 < len0 - 0; idx0++) {
		    if (source.readBit())
			++unknown_exts0;
		}
	    bitstream0 = source;
	    source = coder.createNestedStream(bitstream0);
	    try {
	    } finally {
		source.close();
	    }
	    source = bitstream0;
	    for (idx0 = 0; idx0 < unknown_exts0; idx0++) {
		try {
		    com.oss.coders.per.PerOctets.skip(coder, source);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendExtensionContext(null, idx0);
		    throw de;
		}
	    }
	}
	return data;
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((VehicleSituationStatus)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((VehicleSituationStatus)that);
    }
    
    public boolean equalTo(VehicleSituationStatus that) {
	if (!this.lights.equalTo(that.lights))
	    return false;
	if (this.throttlePos != null && that.throttlePos != null) {
	    if (!this.throttlePos.equalTo(that.throttlePos))
		return false;
	}
	if (this.tirePressure != null && that.tirePressure != null) {
	    if (!this.tirePressure.equalTo(that.tirePressure))
		return false;
	}
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public VehicleSituationStatus clone() {
	VehicleSituationStatus copy = (VehicleSituationStatus)super.clone();
	copy.lights = lights.clone();
	if (throttlePos != null) {
	    copy.throttlePos = throttlePos.clone();
	}
	if (tirePressure != null) {
	    copy.tirePressure = tirePressure.clone();
	}
	return copy;
    }

} // End class definition for VehicleSituationStatus
