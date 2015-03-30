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
 * Define the ASN1 Type AdvisoryDetails from ASN1 Module SEMI.
 * @see Sequence
 */

public class AdvisoryDetails extends Sequence {
    public com.bah.ode.asn.oss.dsrc.TemporaryID asdmID;
    public AdvisoryBroadcastType asdmType;
    public DistributionType distType;
    public com.bah.ode.asn.oss.dsrc.DFullTime startTime;
    public com.bah.ode.asn.oss.dsrc.DFullTime stopTime;
    public OctetString advisoryMessage;
    
    /**
     * The default constructor.
     */
    public AdvisoryDetails()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public AdvisoryDetails(com.bah.ode.asn.oss.dsrc.TemporaryID asdmID, 
		    AdvisoryBroadcastType asdmType, DistributionType distType, 
		    com.bah.ode.asn.oss.dsrc.DFullTime startTime, 
		    com.bah.ode.asn.oss.dsrc.DFullTime stopTime, 
		    OctetString advisoryMessage)
    {
	setAsdmID(asdmID);
	setAsdmType(asdmType);
	setDistType(distType);
	setStartTime(startTime);
	setStopTime(stopTime);
	setAdvisoryMessage(advisoryMessage);
    }
    
    /**
     * Construct with required components.
     */
    public AdvisoryDetails(com.bah.ode.asn.oss.dsrc.TemporaryID asdmID, 
		    AdvisoryBroadcastType asdmType, DistributionType distType, 
		    OctetString advisoryMessage)
    {
	setAsdmID(asdmID);
	setAsdmType(asdmType);
	setDistType(distType);
	setAdvisoryMessage(advisoryMessage);
    }
    
    
    // Methods for field "asdmID"
    public com.bah.ode.asn.oss.dsrc.TemporaryID getAsdmID()
    {
	return this.asdmID;
    }
    
    public void setAsdmID(com.bah.ode.asn.oss.dsrc.TemporaryID asdmID)
    {
	this.asdmID = asdmID;
    }
    
    
    // Methods for field "asdmType"
    public AdvisoryBroadcastType getAsdmType()
    {
	return this.asdmType;
    }
    
    public void setAsdmType(AdvisoryBroadcastType asdmType)
    {
	this.asdmType = asdmType;
    }
    
    
    // Methods for field "distType"
    public DistributionType getDistType()
    {
	return this.distType;
    }
    
    public void setDistType(DistributionType distType)
    {
	this.distType = distType;
    }
    
    
    // Methods for field "startTime"
    public com.bah.ode.asn.oss.dsrc.DFullTime getStartTime()
    {
	return this.startTime;
    }
    
    public void setStartTime(com.bah.ode.asn.oss.dsrc.DFullTime startTime)
    {
	this.startTime = startTime;
    }
    
    public boolean hasStartTime()
    {
	return (startTime != null);
    }
    
    public void deleteStartTime()
    {
	startTime = null;
    }
    
    
    // Methods for field "stopTime"
    public com.bah.ode.asn.oss.dsrc.DFullTime getStopTime()
    {
	return this.stopTime;
    }
    
    public void setStopTime(com.bah.ode.asn.oss.dsrc.DFullTime stopTime)
    {
	this.stopTime = stopTime;
    }
    
    public boolean hasStopTime()
    {
	return (stopTime != null);
    }
    
    public void deleteStopTime()
    {
	stopTime = null;
    }
    
    
    // Methods for field "advisoryMessage"
    public OctetString getAdvisoryMessage()
    {
	return this.advisoryMessage;
    }
    
    public void setAdvisoryMessage(OctetString advisoryMessage)
    {
	this.advisoryMessage = advisoryMessage;
    }
    
    
    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, AdvisoryDetails data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	boolean has_startTime0 = data.startTime != null;
	boolean has_stopTime0 = data.stopTime != null;
	sink.writeBit(has_startTime0); ++nbits;
	sink.writeBit(has_stopTime0); ++nbits;
	// Encode field 'asdmID'
	try {
	    com.bah.ode.asn.oss.dsrc.TemporaryID item1 = data.asdmID;
	    int len1 = item1.getSize();

	    if (len1 != 4)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 4, 4, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("asdmID", "TemporaryID");
	    throw ee;
	}
	// Encode field 'asdmType'
	try {
	    AdvisoryBroadcastType item1 = data.asdmType;
	    int idx1;
	    boolean extroot1 = true;

	    if (item1.isUnknownEnumerator()) {
		throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
	    } else {
		idx1 = item1.indexOf();
		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		extroot1 = idx1 < 4;
	    }
	    sink.writeBit(!extroot1); ++nbits;
	    if (extroot1)
		nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 3, sink);
	    else
		nbits += coder.encodeNormallySmallNumber(idx1 - 4, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("asdmType", "AdvisoryBroadcastType");
	    throw ee;
	}
	// Encode field 'distType'
	try {
	    DistributionType item1 = data.distType;
	    int len1 = item1.getSize();

	    if (len1 != 1)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 1, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("distType", "DistributionType");
	    throw ee;
	}
	if (has_startTime0) {
	    // Encode field 'startTime'
	    try {
		com.bah.ode.asn.oss.dsrc.DFullTime item1 = data.startTime;

		nbits += com.bah.ode.asn.oss.dsrc.DFullTime.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("startTime", "DFullTime");
		throw ee;
	    }
	}
	if (has_stopTime0) {
	    // Encode field 'stopTime'
	    try {
		com.bah.ode.asn.oss.dsrc.DFullTime item1 = data.stopTime;

		nbits += com.bah.ode.asn.oss.dsrc.DFullTime.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("stopTime", "DFullTime");
		throw ee;
	    }
	}
	// Encode field 'advisoryMessage'
	try {
	    OctetString item1 = data.advisoryMessage;
	    int len1 = item1.getSize();

	    if (len1 < 0 || len1 > 1400)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 0, 1400, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("advisoryMessage", "OCTET STRING");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static AdvisoryDetails decodeValue(PerCoder coder, InputBitStream source, AdvisoryDetails data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean has_startTime0 = source.readBit();
	boolean has_stopTime0 = source.readBit();
	// Decode field 'asdmID'
	try {
	    data.asdmID = new com.bah.ode.asn.oss.dsrc.TemporaryID(com.oss.coders.per.PerOctets.decode(coder, source, 4, 4));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("asdmID", "TemporaryID");
	    throw de;
	}
	// Decode field 'asdmType'
	try {
	    int idx1;
	    AdvisoryBroadcastType temp1;
	    boolean extroot1 = !source.readBit();

	    if (extroot1) {
		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
		if (idx1 < 0 || idx1 > 3)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		temp1 = AdvisoryBroadcastType.valueAt(idx1);
	    } else {
		idx1 = 4 + (int)coder.decodeNormallySmallNumber(source);
		if (idx1 < 0)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		temp1 = AdvisoryBroadcastType.unknownEnumerator();
	    }
	    data.asdmType = temp1;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("asdmType", "AdvisoryBroadcastType");
	    throw de;
	}
	// Decode field 'distType'
	try {
	    data.distType = new DistributionType(com.oss.coders.per.PerOctets.decode(coder, source, 1, 1));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("distType", "DistributionType");
	    throw de;
	}
	if (has_startTime0) {
	    // Decode field 'startTime'
	    try {
		if (data.startTime == null)
		    data.startTime = new com.bah.ode.asn.oss.dsrc.DFullTime();
		com.bah.ode.asn.oss.dsrc.DFullTime.decodeValue(coder, source, data.startTime);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("startTime", "DFullTime");
		throw de;
	    }
	} else {
	    data.startTime = null;
	}
	if (has_stopTime0) {
	    // Decode field 'stopTime'
	    try {
		if (data.stopTime == null)
		    data.stopTime = new com.bah.ode.asn.oss.dsrc.DFullTime();
		com.bah.ode.asn.oss.dsrc.DFullTime.decodeValue(coder, source, data.stopTime);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("stopTime", "DFullTime");
		throw de;
	    }
	} else {
	    data.stopTime = null;
	}
	// Decode field 'advisoryMessage'
	try {
	    data.advisoryMessage = new OctetString(com.oss.coders.per.PerOctets.decode(coder, source, 0, 1400));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("advisoryMessage", "OCTET STRING");
	    throw de;
	}
	return data;
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((AdvisoryDetails)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((AdvisoryDetails)that);
    }
    
    public boolean equalTo(AdvisoryDetails that) {
	if (!this.asdmID.equalTo(that.asdmID))
	    return false;
	if (!this.asdmType.equalTo(that.asdmType))
	    return false;
	if (!this.distType.equalTo(that.distType))
	    return false;
	if (this.startTime != null && that.startTime != null) {
	    if (!this.startTime.equalTo(that.startTime))
		return false;
	}
	if (this.stopTime != null && that.stopTime != null) {
	    if (!this.stopTime.equalTo(that.stopTime))
		return false;
	}
	if (!this.advisoryMessage.equalTo(that.advisoryMessage))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public AdvisoryDetails clone() {
	AdvisoryDetails copy = (AdvisoryDetails)super.clone();
	copy.asdmID = asdmID.clone();
	copy.asdmType = asdmType.clone();
	copy.distType = distType.clone();
	if (startTime != null) {
	    copy.startTime = startTime.clone();
	}
	if (stopTime != null) {
	    copy.stopTime = stopTime.clone();
	}
	copy.advisoryMessage = advisoryMessage.clone();
	return copy;
    }

} // End class definition for AdvisoryDetails
