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
 * Define the ASN1 Type ElectricVeh from ASN1 Module SEMI.
 * @see Sequence
 */

public class ElectricVeh extends Sequence {
    public StateOfCharge soc;
    public Capacity cap;
    public Range range;
    
    /**
     * The default constructor.
     */
    public ElectricVeh()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ElectricVeh(StateOfCharge soc, Capacity cap, Range range)
    {
	setSoc(soc);
	setCap(cap);
	setRange(range);
    }
    
    
    // Methods for field "soc"
    public StateOfCharge getSoc()
    {
	return this.soc;
    }
    
    public void setSoc(StateOfCharge soc)
    {
	this.soc = soc;
    }
    
    
    // Methods for field "cap"
    public Capacity getCap()
    {
	return this.cap;
    }
    
    public void setCap(Capacity cap)
    {
	this.cap = cap;
    }
    
    
    // Methods for field "range"
    public Range getRange()
    {
	return this.range;
    }
    
    public void setRange(Range range)
    {
	this.range = range;
    }
    
    
    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, ElectricVeh data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	++nbits;
	// Encode field 'soc'
	try {
	    StateOfCharge item1 = data.soc;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 255)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("soc", "StateOfCharge");
	    throw ee;
	}
	// Encode field 'cap'
	try {
	    Capacity item1 = data.cap;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 255)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("cap", "Capacity");
	    throw ee;
	}
	// Encode field 'range'
	try {
	    Range item1 = data.range;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 255)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("range", "Range");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static ElectricVeh decodeValue(PerCoder coder, InputBitStream source, ElectricVeh data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

    /** Decode root fields **/
	// Decode field 'soc'
	try {
	    long temp1;

	    if (data.soc == null)
		data.soc = new StateOfCharge();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
	    if (temp1 > 255)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.soc.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("soc", "StateOfCharge");
	    throw de;
	}
	// Decode field 'cap'
	try {
	    long temp1;

	    if (data.cap == null)
		data.cap = new Capacity();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
	    if (temp1 > 255)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.cap.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("cap", "Capacity");
	    throw de;
	}
	// Decode field 'range'
	try {
	    long temp1;

	    if (data.range == null)
		data.range = new Range();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
	    if (temp1 > 255)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.range.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("range", "Range");
	    throw de;
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
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((ElectricVeh)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((ElectricVeh)that);
    }
    
    public boolean equalTo(ElectricVeh that) {
	if (!this.soc.equalTo(that.soc))
	    return false;
	if (!this.cap.equalTo(that.cap))
	    return false;
	if (!this.range.equalTo(that.range))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public ElectricVeh clone() {
	ElectricVeh copy = (ElectricVeh)super.clone();
	copy.soc = soc.clone();
	copy.cap = cap.clone();
	copy.range = range.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.soc != null ? this.soc.hashCode() : 0);
	hash = 41 * hash + (this.cap != null ? this.cap.hashCode() : 0);
	hash = 41 * hash + (this.range != null ? this.range.hashCode() : 0);
	return hash;
    }
} // End class definition for ElectricVeh
