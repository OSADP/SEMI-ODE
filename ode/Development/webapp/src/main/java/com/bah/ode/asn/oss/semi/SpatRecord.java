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
/* Created: Tue Apr 28 10:28:02 2015 */
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
 * Define the ASN1 Type SpatRecord from ASN1 Module SEMI.
 * @see Sequence
 */

public class SpatRecord extends Sequence {
    public com.bah.ode.asn.oss.dsrc.DDateTime timestamp;
    public com.bah.ode.asn.oss.dsrc.IntersectionState intersections;
    
    /**
     * The default constructor.
     */
    public SpatRecord()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SpatRecord(com.bah.ode.asn.oss.dsrc.DDateTime timestamp, 
		    com.bah.ode.asn.oss.dsrc.IntersectionState intersections)
    {
	setTimestamp(timestamp);
	setIntersections(intersections);
    }
    
    
    // Methods for field "timestamp"
    public com.bah.ode.asn.oss.dsrc.DDateTime getTimestamp()
    {
	return this.timestamp;
    }
    
    public void setTimestamp(com.bah.ode.asn.oss.dsrc.DDateTime timestamp)
    {
	this.timestamp = timestamp;
    }
    
    
    // Methods for field "intersections"
    public com.bah.ode.asn.oss.dsrc.IntersectionState getIntersections()
    {
	return this.intersections;
    }
    
    public void setIntersections(com.bah.ode.asn.oss.dsrc.IntersectionState intersections)
    {
	this.intersections = intersections;
    }
    
    
    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, SpatRecord data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	// Encode field 'timestamp'
	try {
	    com.bah.ode.asn.oss.dsrc.DDateTime item1 = data.timestamp;

	    nbits += (com.bah.ode.asn.oss.dsrc.DDateTime.encodeValue(coder, sink, item1));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("timestamp", "DDateTime");
	    throw ee;
	}
	// Encode field 'intersections'
	try {
	    com.bah.ode.asn.oss.dsrc.IntersectionState item1 = data.intersections;

	    nbits += com.bah.ode.asn.oss.dsrc.IntersectionState.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("intersections", "IntersectionState");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static SpatRecord decodeValue(PerCoder coder, InputBitStream source, SpatRecord data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	// Decode field 'timestamp'
	try {
	    if (data.timestamp == null)
		data.timestamp = new com.bah.ode.asn.oss.dsrc.DDateTime();
	    com.bah.ode.asn.oss.dsrc.DDateTime.decodeValue(coder, source, data.timestamp);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("timestamp", "DDateTime");
	    throw de;
	}
	// Decode field 'intersections'
	try {
	    if (data.intersections == null)
		data.intersections = new com.bah.ode.asn.oss.dsrc.IntersectionState();
	    com.bah.ode.asn.oss.dsrc.IntersectionState.decodeValue(coder, source, data.intersections);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("intersections", "IntersectionState");
	    throw de;
	}
	return data;
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((SpatRecord)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((SpatRecord)that);
    }
    
    public boolean equalTo(SpatRecord that) {
	if (!this.timestamp.equalTo(that.timestamp))
	    return false;
	if (!this.intersections.equalTo(that.intersections))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public SpatRecord clone() {
	SpatRecord copy = (SpatRecord)super.clone();
	copy.timestamp = timestamp.clone();
	copy.intersections = intersections.clone();
	return copy;
    }

} // End class definition for SpatRecord
