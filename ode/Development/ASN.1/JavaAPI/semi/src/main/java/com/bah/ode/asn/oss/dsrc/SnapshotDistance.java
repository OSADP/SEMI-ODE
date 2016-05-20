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
 * Define the ASN1 Type SnapshotDistance from ASN1 Module DSRC.
 * @see Sequence
 */

public class SnapshotDistance extends Sequence {
    public INTEGER d1;
    public INTEGER s1;
    public INTEGER d2;
    public INTEGER s2;
    
    /**
     * The default constructor.
     */
    public SnapshotDistance()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SnapshotDistance(INTEGER d1, INTEGER s1, INTEGER d2, INTEGER s2)
    {
	setD1(d1);
	setS1(s1);
	setD2(d2);
	setS2(s2);
    }
    
    /**
     * Construct with components.
     */
    public SnapshotDistance(long d1, long s1, long d2, long s2)
    {
	this(new INTEGER(d1), new INTEGER(s1), new INTEGER(d2), 
	     new INTEGER(s2));
    }
    
    
    // Methods for field "d1"
    public long getD1()
    {
	return (this.d1).longValue();
    }
    
    public void setD1(long d1)
    {
	setD1(new INTEGER(d1));
    }
    
    public void setD1(INTEGER d1)
    {
	this.d1 = d1;
    }
    
    
    // Methods for field "s1"
    public long getS1()
    {
	return (this.s1).longValue();
    }
    
    public void setS1(long s1)
    {
	setS1(new INTEGER(s1));
    }
    
    public void setS1(INTEGER s1)
    {
	this.s1 = s1;
    }
    
    
    // Methods for field "d2"
    public long getD2()
    {
	return (this.d2).longValue();
    }
    
    public void setD2(long d2)
    {
	setD2(new INTEGER(d2));
    }
    
    public void setD2(INTEGER d2)
    {
	this.d2 = d2;
    }
    
    
    // Methods for field "s2"
    public long getS2()
    {
	return (this.s2).longValue();
    }
    
    public void setS2(long s2)
    {
	setS2(new INTEGER(s2));
    }
    
    public void setS2(INTEGER s2)
    {
	this.s2 = s2;
    }
    
    
    /**
     * Implements BER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encodeValue(BerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	int len0 = 0;
	SnapshotDistance temp0 = this;

	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.s2, sink), 0x83);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("s2", "INTEGER");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.d2, sink), 0x82);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("d2", "INTEGER");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.s1, sink), 0x81);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("s1", "INTEGER");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.d1, sink), 0x80);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("d1", "INTEGER");
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements BER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public SnapshotDistance decodeValue(BerCoder coder, DecoderInput source)
	    throws DecoderException
    {
	int total_len0 = source.mLength;
	int end_pos0 = (total_len0 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len0);
	int tag;

	tag = source.decodeTagLength();
	if (tag != 0x80)
	    source.raiseTagMismatchException(tag);
	try {
	    this.d1 = new INTEGER(source.decodeLong());
	} catch (Exception e) {
	    DecoderException ee = DecoderException.wrapException(e);
	    ee.appendFieldContext("d1", "INTEGER");
	    throw ee;
	}
	tag = source.decodeTagLength();
	if (tag != 0x81)
	    source.raiseTagMismatchException(tag);
	try {
	    this.s1 = new INTEGER(source.decodeLong());
	} catch (Exception e) {
	    DecoderException ee = DecoderException.wrapException(e);
	    ee.appendFieldContext("s1", "INTEGER");
	    throw ee;
	}
	tag = source.decodeTagLength();
	if (tag != 0x82)
	    source.raiseTagMismatchException(tag);
	try {
	    this.d2 = new INTEGER(source.decodeLong());
	} catch (Exception e) {
	    DecoderException ee = DecoderException.wrapException(e);
	    ee.appendFieldContext("d2", "INTEGER");
	    throw ee;
	}
	tag = source.decodeTagLength();
	if (tag != 0x83)
	    source.raiseTagMismatchException(tag);
	try {
	    this.s2 = new INTEGER(source.decodeLong());
	} catch (Exception e) {
	    DecoderException ee = DecoderException.wrapException(e);
	    ee.appendFieldContext("s2", "INTEGER");
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
	SnapshotDistance temp0 = this;

	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.s2, sink), 0x83);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("s2", "INTEGER");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.d2, sink), 0x82);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("d2", "INTEGER");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.s1, sink), 0x81);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("s1", "INTEGER");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.d1, sink), 0x80);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("d1", "INTEGER");
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, SnapshotDistance data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	// Encode field 'd1'
	try {
	    INTEGER item1 = data.d1;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 999)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += (coder.encodeConstrainedWholeNumber(temp1, 0, 999, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("d1", "INTEGER");
	    throw ee;
	}
	// Encode field 's1'
	try {
	    INTEGER item1 = data.s1;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 50)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 50, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("s1", "INTEGER");
	    throw ee;
	}
	// Encode field 'd2'
	try {
	    INTEGER item1 = data.d2;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 999)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 999, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("d2", "INTEGER");
	    throw ee;
	}
	// Encode field 's2'
	try {
	    INTEGER item1 = data.s2;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 50)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 50, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("s2", "INTEGER");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static SnapshotDistance decodeValue(PerCoder coder, InputBitStream source, SnapshotDistance data)
	    throws IOException, DecoderException, DecodeFailedException
    {
    /** Decode root fields **/
	// Decode field 'd1'
	try {
	    long temp1;

	    if (data.d1 == null)
		data.d1 = new INTEGER();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 999);
	    if (temp1 > 999)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.d1.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("d1", "INTEGER");
	    throw de;
	}
	// Decode field 's1'
	try {
	    long temp1;

	    if (data.s1 == null)
		data.s1 = new INTEGER();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 50);
	    if (temp1 > 50)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.s1.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("s1", "INTEGER");
	    throw de;
	}
	// Decode field 'd2'
	try {
	    long temp1;

	    if (data.d2 == null)
		data.d2 = new INTEGER();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 999);
	    if (temp1 > 999)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.d2.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("d2", "INTEGER");
	    throw de;
	}
	// Decode field 's2'
	try {
	    long temp1;

	    if (data.s2 == null)
		data.s2 = new INTEGER();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 50);
	    if (temp1 > 50)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.s2.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("s2", "INTEGER");
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
	    writer.print("d1 ");
	    writer.print(this.d1.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("s1 ");
	    writer.print(this.s1.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("d2 ");
	    writer.print(this.d2.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("s2 ");
	    writer.print(this.s2.longValue());
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
	return equalTo((SnapshotDistance)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((SnapshotDistance)that);
    }
    
    public boolean equalTo(SnapshotDistance that) {
	if (!this.d1.equalTo(that.d1))
	    return false;
	if (!this.s1.equalTo(that.s1))
	    return false;
	if (!this.d2.equalTo(that.d2))
	    return false;
	if (!this.s2.equalTo(that.s2))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public SnapshotDistance clone() {
	SnapshotDistance copy = (SnapshotDistance)super.clone();
	copy.d1 = d1.clone();
	copy.s1 = s1.clone();
	copy.d2 = d2.clone();
	copy.s2 = s2.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.d1 != null ? this.d1.hashCode() : 0);
	hash = 41 * hash + (this.s1 != null ? this.s1.hashCode() : 0);
	hash = 41 * hash + (this.d2 != null ? this.d2.hashCode() : 0);
	hash = 41 * hash + (this.s2 != null ? this.s2.hashCode() : 0);
	return hash;
    }
} // End class definition for SnapshotDistance
