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
/* Created: Mon Dec 14 11:50:30 2015 */
/* ASN.1 Compiler for Java version: 6.2 */
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
 * Define the ASN1 Type Sample from ASN1 Module DSRC.
 * @see Sequence
 */

public class Sample extends Sequence {
    public INTEGER sampleStart;
    public INTEGER sampleEnd;
    
    /**
     * The default constructor.
     */
    public Sample()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Sample(INTEGER sampleStart, INTEGER sampleEnd)
    {
	setSampleStart(sampleStart);
	setSampleEnd(sampleEnd);
    }
    
    /**
     * Construct with components.
     */
    public Sample(long sampleStart, long sampleEnd)
    {
	this(new INTEGER(sampleStart), new INTEGER(sampleEnd));
    }
    
    
    // Methods for field "sampleStart"
    public long getSampleStart()
    {
	return (this.sampleStart).longValue();
    }
    
    public void setSampleStart(long sampleStart)
    {
	setSampleStart(new INTEGER(sampleStart));
    }
    
    public void setSampleStart(INTEGER sampleStart)
    {
	this.sampleStart = sampleStart;
    }
    
    
    // Methods for field "sampleEnd"
    public long getSampleEnd()
    {
	return (this.sampleEnd).longValue();
    }
    
    public void setSampleEnd(long sampleEnd)
    {
	setSampleEnd(new INTEGER(sampleEnd));
    }
    
    public void setSampleEnd(INTEGER sampleEnd)
    {
	this.sampleEnd = sampleEnd;
    }
    
    
    /**
     * Implements BER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encodeValue(BerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	int len0 = 0;
	Sample temp0 = this;

	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.sampleEnd, sink), 0x81);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("sampleEnd", "INTEGER");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.sampleStart, sink), 0x80);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("sampleStart", "INTEGER");
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements BER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public Sample decodeValue(BerCoder coder, DecoderInput source)
	    throws DecoderException
    {
	int total_len0 = source.mLength;
	int end_pos0 = (total_len0 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len0);
	int tag;

	tag = source.decodeTagLength();
	if (tag != 0x80)
	    source.raiseTagMismatchException(tag);
	try {
	    this.sampleStart = new INTEGER(source.decodeLong());
	} catch (Exception e) {
	    DecoderException ee = DecoderException.wrapException(e);
	    ee.appendFieldContext("sampleStart", "INTEGER");
	    throw ee;
	}
	tag = source.decodeTagLength();
	if (tag != 0x81)
	    source.raiseTagMismatchException(tag);
	try {
	    this.sampleEnd = new INTEGER(source.decodeLong());
	} catch (Exception e) {
	    DecoderException ee = DecoderException.wrapException(e);
	    ee.appendFieldContext("sampleEnd", "INTEGER");
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
	Sample temp0 = this;

	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.sampleEnd, sink), 0x81);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("sampleEnd", "INTEGER");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.sampleStart, sink), 0x80);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("sampleStart", "INTEGER");
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, Sample data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	// Encode field 'sampleStart'
	try {
	    INTEGER item1 = data.sampleStart;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 255)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += (coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("sampleStart", "INTEGER");
	    throw ee;
	}
	// Encode field 'sampleEnd'
	try {
	    INTEGER item1 = data.sampleEnd;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 255)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("sampleEnd", "INTEGER");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static Sample decodeValue(PerCoder coder, InputBitStream source, Sample data)
	    throws IOException, DecoderException, DecodeFailedException
    {
    /** Decode root fields **/
	// Decode field 'sampleStart'
	try {
	    long temp1;

	    if (data.sampleStart == null)
		data.sampleStart = new INTEGER();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
	    if (temp1 > 255)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.sampleStart.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("sampleStart", "INTEGER");
	    throw de;
	}
	// Decode field 'sampleEnd'
	try {
	    long temp1;

	    if (data.sampleEnd == null)
		data.sampleEnd = new INTEGER();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
	    if (temp1 > 255)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.sampleEnd.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("sampleEnd", "INTEGER");
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
	    writer.print("sampleStart ");
	    writer.print(this.sampleStart.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("sampleEnd ");
	    writer.print(this.sampleEnd.longValue());
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
	return equalTo((Sample)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((Sample)that);
    }
    
    public boolean equalTo(Sample that) {
	if (!this.sampleStart.equalTo(that.sampleStart))
	    return false;
	if (!this.sampleEnd.equalTo(that.sampleEnd))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public Sample clone() {
	Sample copy = (Sample)super.clone();
	copy.sampleStart = sampleStart.clone();
	copy.sampleEnd = sampleEnd.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.sampleStart != null ? this.sampleStart.hashCode() : 0);
	hash = 41 * hash + (this.sampleEnd != null ? this.sampleEnd.hashCode() : 0);
	return hash;
    }
} // End class definition for Sample
