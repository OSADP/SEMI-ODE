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
/* Created: Tue Jun 07 13:54:40 2016 */
/* ASN.1 Compiler for Java version: 6.3 */
/* ASN.1 compiler options and file names specified:
 * -toed -output com.bah.ode.asn.oss -per -uper -ber -der -json -root
 * ../../DSRC_R36_Source.asn ../../SEMI_ASN.1_Structures_2.2.asn
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
import com.oss.coders.json.JsonWriter;
import com.oss.coders.json.JSONEncodable;
import com.oss.coders.json.JsonReader;
import com.oss.coders.json.JSONDecodable;
import com.oss.coders.json.JsonCoder;
import com.oss.coders.OutputBitStream;
import com.oss.coders.per.PEREncodable;
import com.oss.coders.InputBitStream;
import com.oss.coders.per.PERDecodable;
import com.oss.coders.per.PerCoder;

/**
 * Define the ASN1 Type BumperHeights from ASN1 Module DSRC.
 * @see Sequence
 */

public class BumperHeights extends Sequence {
    public BumperHeightFront frnt;
    public BumperHeightRear rear;
    
    /**
     * The default constructor.
     */
    public BumperHeights()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public BumperHeights(BumperHeightFront frnt, BumperHeightRear rear)
    {
	setFrnt(frnt);
	setRear(rear);
    }
    
    
    // Methods for field "frnt"
    public BumperHeightFront getFrnt()
    {
	return this.frnt;
    }
    
    public void setFrnt(BumperHeightFront frnt)
    {
	this.frnt = frnt;
    }
    
    
    // Methods for field "rear"
    public BumperHeightRear getRear()
    {
	return this.rear;
    }
    
    public void setRear(BumperHeightRear rear)
    {
	this.rear = rear;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     */
    public static enum __Tag
    {
	__frnt("frnt"),
	__rear("rear"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(3);
	private __Tag(String tag) {
	    this.tag = tag;
	}
	private String getTag() {
	    return tag;
	}
	/**
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public static __Tag getTagSub(String tag) {
	    return map.get(tag);
	}
	static {
	    for (__Tag t:values())
		map.put(t.getTag(), t);
	}
    }
    
    /**
     * Implements BER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encodeValue(BerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	int len0 = 0;
	BumperHeights temp0 = this;

	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.rear, sink), 0x81);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("rear", "BumperHeightRear");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.frnt, sink), 0x80);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("frnt", "BumperHeightFront");
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements BER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public BumperHeights decodeValue(BerCoder coder, DecoderInput source)
	    throws DecoderException
    {
	int total_len0 = source.mLength;
	int end_pos0 = (total_len0 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len0);
	int tag;

	tag = source.decodeTagLength();
	if (tag != 0x80)
	    source.raiseTagMismatchException(tag);
	try {
	    this.frnt = new BumperHeightFront(source.decodeLong());
	} catch (Exception e) {
	    DecoderException ee = DecoderException.wrapException(e);
	    ee.appendFieldContext("frnt", "BumperHeightFront");
	    throw ee;
	}
	tag = source.decodeTagLength();
	if (tag != 0x81)
	    source.raiseTagMismatchException(tag);
	try {
	    this.rear = new BumperHeightRear(source.decodeLong());
	} catch (Exception e) {
	    DecoderException ee = DecoderException.wrapException(e);
	    ee.appendFieldContext("rear", "BumperHeightRear");
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
	BumperHeights temp0 = this;

	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.rear, sink), 0x81);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("rear", "BumperHeightRear");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.frnt, sink), 0x80);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("frnt", "BumperHeightFront");
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, BumperHeights data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	// Encode field 'frnt'
	try {
	    BumperHeightFront item1 = data.frnt;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 127)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += (coder.encodeConstrainedWholeNumber(temp1, 0, 127, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("frnt", "BumperHeightFront");
	    throw ee;
	}
	// Encode field 'rear'
	try {
	    BumperHeightRear item1 = data.rear;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 127)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 127, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("rear", "BumperHeightRear");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static BumperHeights decodeValue(PerCoder coder, InputBitStream source, BumperHeights data)
	    throws IOException, DecoderException, DecodeFailedException
    {
    /** Decode root fields **/
	// Decode field 'frnt'
	try {
	    long temp1;

	    if (data.frnt == null)
		data.frnt = new BumperHeightFront();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 127);
	    if (temp1 > 127)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.frnt.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("frnt", "BumperHeightFront");
	    throw de;
	}
	// Decode field 'rear'
	try {
	    long temp1;

	    if (data.rear == null)
		data.rear = new BumperHeightRear();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 127);
	    if (temp1 > 127)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.rear.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("rear", "BumperHeightRear");
	    throw de;
	}
	return data;
    }

    /**
     * Implements JSON value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public void encodeValue(JsonCoder coder, JsonWriter sink)
	    throws IOException, EncoderException
    {
	sink.beginObject();
	// Encode field 'frnt'
	try {
	    BumperHeightFront item1 = this.frnt;

	    {
		sink.encodeKey("frnt");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("frnt", "BumperHeightFront");
	    throw ee;
	}
	// Encode field 'rear'
	try {
	    BumperHeightRear item1 = this.rear;

	    {
		sink.writeSeparator();
		sink.encodeKey("rear");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("rear", "BumperHeightRear");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public BumperHeights decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[3];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		BumperHeights.__Tag t_tag0 = BumperHeights.__Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = BumperHeights.__Tag._null_;
		switch (t_tag0) {
		    case __frnt:
		    // Decode field 'frnt'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.frnt == null)
			    this.frnt = new BumperHeightFront();
			this.frnt.setValue(coder.decodeInteger(source));
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("frnt", "BumperHeightFront");
			throw de;
		    }
		    break;
		    case __rear:
		    // Decode field 'rear'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.rear == null)
			    this.rear = new BumperHeightRear();
			this.rear.setValue(coder.decodeInteger(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("rear", "BumperHeightRear");
			throw de;
		    }
		    break;
		    default:
			throw new DecoderException(ExceptionDescriptor._unknown_field, ": '" + tag0 + "'");
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'frnt'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'rear'");
	return this;
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
	    writer.print("frnt ");
	    writer.print(this.frnt.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("rear ");
	    writer.print(this.rear.longValue());
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
	return equalTo((BumperHeights)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((BumperHeights)that);
    }
    
    public boolean equalTo(BumperHeights that) {
	if (!this.frnt.equalTo(that.frnt))
	    return false;
	if (!this.rear.equalTo(that.rear))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public BumperHeights clone() {
	BumperHeights copy = (BumperHeights)super.clone();
	copy.frnt = frnt.clone();
	copy.rear = rear.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.frnt != null ? this.frnt.hashCode() : 0);
	hash = 41 * hash + (this.rear != null ? this.rear.hashCode() : 0);
	return hash;
    }
} // End class definition for BumperHeights
