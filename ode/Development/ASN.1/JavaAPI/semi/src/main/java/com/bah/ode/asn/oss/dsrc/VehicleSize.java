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
 * Define the ASN1 Type VehicleSize from ASN1 Module DSRC.
 * @see Sequence
 */

public class VehicleSize extends Sequence {
    public VehicleWidth width;
    public VehicleLength length;
    
    /**
     * The default constructor.
     */
    public VehicleSize()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public VehicleSize(VehicleWidth width, VehicleLength length)
    {
	setWidth(width);
	setLength(length);
    }
    
    
    // Methods for field "width"
    public VehicleWidth getWidth()
    {
	return this.width;
    }
    
    public void setWidth(VehicleWidth width)
    {
	this.width = width;
    }
    
    
    // Methods for field "length"
    public VehicleLength getLength()
    {
	return this.length;
    }
    
    public void setLength(VehicleLength length)
    {
	this.length = length;
    }
    
    
    /**
     * Implements BER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encodeValue(BerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	int len0 = 0;
	VehicleSize temp0 = this;

	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.length, sink), 0x81);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("length", "VehicleLength");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.width, sink), 0x80);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("width", "VehicleWidth");
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements BER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public VehicleSize decodeValue(BerCoder coder, DecoderInput source)
	    throws DecoderException
    {
	int total_len0 = source.mLength;
	int end_pos0 = (total_len0 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len0);
	int tag;

	tag = source.decodeTagLength();
	if (tag != 0x80)
	    source.raiseTagMismatchException(tag);
	try {
	    this.width = new VehicleWidth(source.decodeLong());
	} catch (Exception e) {
	    DecoderException ee = DecoderException.wrapException(e);
	    ee.appendFieldContext("width", "VehicleWidth");
	    throw ee;
	}
	tag = source.decodeTagLength();
	if (tag != 0x81)
	    source.raiseTagMismatchException(tag);
	try {
	    this.length = new VehicleLength(source.decodeLong());
	} catch (Exception e) {
	    DecoderException ee = DecoderException.wrapException(e);
	    ee.appendFieldContext("length", "VehicleLength");
	    throw ee;
	}
	if (source.position() != end_pos0) {
	    if (total_len0 >= 0)
		throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
	    tag = source.decodeTagLength();
	    if (tag != 0 || source.mLength != 0)
		throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);
	}

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
	VehicleSize temp0 = this;

	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.length, sink), 0x81);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("length", "VehicleLength");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.width, sink), 0x80);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("width", "VehicleWidth");
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, VehicleSize data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	// Encode field 'width'
	try {
	    VehicleWidth item1 = data.width;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 1023)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += (coder.encodeConstrainedWholeNumber(temp1, 0, 1023, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("width", "VehicleWidth");
	    throw ee;
	}
	// Encode field 'length'
	try {
	    VehicleLength item1 = data.length;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 16383)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 16383, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("length", "VehicleLength");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static VehicleSize decodeValue(PerCoder coder, InputBitStream source, VehicleSize data)
	    throws IOException, DecoderException, DecodeFailedException
    {
    /** Decode root fields **/
	// Decode field 'width'
	try {
	    long temp1;

	    if (data.width == null)
		data.width = new VehicleWidth();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 1023);
	    if (temp1 > 1023)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.width.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("width", "VehicleWidth");
	    throw de;
	}
	// Decode field 'length'
	try {
	    long temp1;

	    if (data.length == null)
		data.length = new VehicleLength();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 16383);
	    if (temp1 > 16383)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.length.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("length", "VehicleLength");
	    throw de;
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
	comma0 = true;
	try {
	    printer.newLine(writer);
	    writer.print("width ");
	    writer.print(this.width.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("length ");
	    writer.print(this.length.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
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
	return equalTo((VehicleSize)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((VehicleSize)that);
    }
    
    public boolean equalTo(VehicleSize that) {
	if (!this.width.equalTo(that.width))
	    return false;
	if (!this.length.equalTo(that.length))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public VehicleSize clone() {
	VehicleSize copy = (VehicleSize)super.clone();
	copy.width = width.clone();
	copy.length = length.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.width != null ? this.width.hashCode() : 0);
	hash = 41 * hash + (this.length != null ? this.length.hashCode() : 0);
	return hash;
    }
} // End class definition for VehicleSize
