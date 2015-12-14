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
 * Define the ASN1 Type GeoRegion from ASN1 Module SEMI.
 * @see Sequence
 */

public class GeoRegion extends Sequence {
    public com.bah.ode.asn.oss.dsrc.Position3D nwCorner;
    public com.bah.ode.asn.oss.dsrc.Position3D seCorner;
    
    /**
     * The default constructor.
     */
    public GeoRegion()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public GeoRegion(com.bah.ode.asn.oss.dsrc.Position3D nwCorner, 
		    com.bah.ode.asn.oss.dsrc.Position3D seCorner)
    {
	setNwCorner(nwCorner);
	setSeCorner(seCorner);
    }
    
    
    // Methods for field "nwCorner"
    public com.bah.ode.asn.oss.dsrc.Position3D getNwCorner()
    {
	return this.nwCorner;
    }
    
    public void setNwCorner(com.bah.ode.asn.oss.dsrc.Position3D nwCorner)
    {
	this.nwCorner = nwCorner;
    }
    
    
    // Methods for field "seCorner"
    public com.bah.ode.asn.oss.dsrc.Position3D getSeCorner()
    {
	return this.seCorner;
    }
    
    public void setSeCorner(com.bah.ode.asn.oss.dsrc.Position3D seCorner)
    {
	this.seCorner = seCorner;
    }
    
    
    /**
     * Implements BER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encodeValue(BerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	int len0 = 0;
	GeoRegion temp0 = this;

	try {
	    len0 += sink.encodeLengthTag(temp0.seCorner.encodeValue(coder, sink), 0xA1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("seCorner", "Position3D");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(temp0.nwCorner.encodeValue(coder, sink), 0xA0);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("nwCorner", "Position3D");
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements BER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public GeoRegion decodeValue(BerCoder coder, DecoderInput source)
	    throws DecoderException
    {
	int total_len0 = source.mLength;
	int end_pos0 = (total_len0 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len0);
	int tag;

	tag = source.decodeTagLength();
	if (tag != 0xA0)
	    source.raiseTagMismatchException(tag);
	try {
	    this.nwCorner = new com.bah.ode.asn.oss.dsrc.Position3D();
	    this.nwCorner.decodeValue(coder, source);
	} catch (Exception e) {
	    DecoderException ee = DecoderException.wrapException(e);
	    ee.appendFieldContext("nwCorner", "Position3D");
	    throw ee;
	}
	tag = source.decodeTagLength();
	if (tag != 0xA1)
	    source.raiseTagMismatchException(tag);
	try {
	    this.seCorner = new com.bah.ode.asn.oss.dsrc.Position3D();
	    this.seCorner.decodeValue(coder, source);
	} catch (Exception e) {
	    DecoderException ee = DecoderException.wrapException(e);
	    ee.appendFieldContext("seCorner", "Position3D");
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
	GeoRegion temp0 = this;

	try {
	    len0 += sink.encodeLengthTag(temp0.seCorner.encodeValue(coder, sink), 0xA1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("seCorner", "Position3D");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(temp0.nwCorner.encodeValue(coder, sink), 0xA0);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("nwCorner", "Position3D");
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, GeoRegion data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	// Encode field 'nwCorner'
	try {
	    com.bah.ode.asn.oss.dsrc.Position3D item1 = data.nwCorner;

	    nbits += (item1.encodeValue(coder, sink, item1));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("nwCorner", "Position3D");
	    throw ee;
	}
	// Encode field 'seCorner'
	try {
	    com.bah.ode.asn.oss.dsrc.Position3D item1 = data.seCorner;

	    nbits += com.bah.ode.asn.oss.dsrc.Position3D.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("seCorner", "Position3D");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static GeoRegion decodeValue(PerCoder coder, InputBitStream source, GeoRegion data)
	    throws IOException, DecoderException, DecodeFailedException
    {
    /** Decode root fields **/
	// Decode field 'nwCorner'
	try {
	    if (data.nwCorner == null)
		data.nwCorner = new com.bah.ode.asn.oss.dsrc.Position3D();
	    data.nwCorner.decodeValue(coder, source, data.nwCorner);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("nwCorner", "Position3D");
	    throw de;
	}
	// Decode field 'seCorner'
	try {
	    if (data.seCorner == null)
		data.seCorner = new com.bah.ode.asn.oss.dsrc.Position3D();
	    data.seCorner.decodeValue(coder, source, data.seCorner);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("seCorner", "Position3D");
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
	    writer.print("nwCorner ");
	    this.nwCorner.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("seCorner ");
	    this.seCorner.printValue(printer, writer);
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
	return equalTo((GeoRegion)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((GeoRegion)that);
    }
    
    public boolean equalTo(GeoRegion that) {
	if (!this.nwCorner.equalTo(that.nwCorner))
	    return false;
	if (!this.seCorner.equalTo(that.seCorner))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public GeoRegion clone() {
	GeoRegion copy = (GeoRegion)super.clone();
	copy.nwCorner = nwCorner.clone();
	copy.seCorner = seCorner.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.nwCorner != null ? this.nwCorner.hashCode() : 0);
	hash = 41 * hash + (this.seCorner != null ? this.seCorner.hashCode() : 0);
	return hash;
    }
} // End class definition for GeoRegion
