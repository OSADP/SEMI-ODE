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
/* Created: Tue Dec 22 00:38:27 2015 */
/* ASN.1 Compiler for Java version: 6.2 */
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
 * Define the ASN1 Type RegionOffsets from ASN1 Module DSRC.
 * @see Sequence
 */

public class RegionOffsets extends Sequence {
    public INTEGER xOffset;
    public INTEGER yOffset;
    public INTEGER zOffset;
    
    /**
     * The default constructor.
     */
    public RegionOffsets()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RegionOffsets(INTEGER xOffset, INTEGER yOffset, INTEGER zOffset)
    {
	setXOffset(xOffset);
	setYOffset(yOffset);
	setZOffset(zOffset);
    }
    
    /**
     * Construct with components.
     */
    public RegionOffsets(long xOffset, long yOffset, long zOffset)
    {
	this(new INTEGER(xOffset), new INTEGER(yOffset), 
	     new INTEGER(zOffset));
    }
    
    /**
     * Construct with required components.
     */
    public RegionOffsets(long xOffset, long yOffset)
    {
	setXOffset(xOffset);
	setYOffset(yOffset);
    }
    
    
    // Methods for field "xOffset"
    public long getXOffset()
    {
	return (this.xOffset).longValue();
    }
    
    public void setXOffset(long xOffset)
    {
	setXOffset(new INTEGER(xOffset));
    }
    
    public void setXOffset(INTEGER xOffset)
    {
	this.xOffset = xOffset;
    }
    
    
    // Methods for field "yOffset"
    public long getYOffset()
    {
	return (this.yOffset).longValue();
    }
    
    public void setYOffset(long yOffset)
    {
	setYOffset(new INTEGER(yOffset));
    }
    
    public void setYOffset(INTEGER yOffset)
    {
	this.yOffset = yOffset;
    }
    
    
    // Methods for field "zOffset"
    public long getZOffset()
    {
	return (this.zOffset).longValue();
    }
    
    public void setZOffset(long zOffset)
    {
	setZOffset(new INTEGER(zOffset));
    }
    
    public void setZOffset(INTEGER zOffset)
    {
	this.zOffset = zOffset;
    }
    
    public boolean hasZOffset()
    {
	return (zOffset != null);
    }
    
    public void deleteZOffset()
    {
	zOffset = null;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     */
    public static enum __Tag
    {
	__xOffset("xOffset"),
	__yOffset("yOffset"),
	__zOffset("zOffset"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(4);
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
	RegionOffsets temp0 = this;

	if (temp0.zOffset != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.zOffset, sink), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("zOffset", "INTEGER");
		throw ee;
	    }
	}
	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.yOffset, sink), 0x81);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("yOffset", "INTEGER");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.xOffset, sink), 0x80);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("xOffset", "INTEGER");
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements BER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public RegionOffsets decodeValue(BerCoder coder, DecoderInput source)
	    throws DecoderException
    {
	int total_len0 = source.mLength;
	int end_pos0 = (total_len0 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len0);
	int tag;

	do {
	    tag = source.decodeTagLength();
	    if (tag != 0x80)
		source.raiseTagMismatchException(tag);
	    try {
		this.xOffset = new INTEGER(source.decodeLong());
	    } catch (Exception e) {
		DecoderException ee = DecoderException.wrapException(e);
		ee.appendFieldContext("xOffset", "INTEGER");
		throw ee;
	    }
	    tag = source.decodeTagLength();
	    if (tag != 0x81)
		source.raiseTagMismatchException(tag);
	    try {
		this.yOffset = new INTEGER(source.decodeLong());
	    } catch (Exception e) {
		DecoderException ee = DecoderException.wrapException(e);
		ee.appendFieldContext("yOffset", "INTEGER");
		throw ee;
	    }
	    if (source.position() >= end_pos0)
		break;
	    tag = source.decodeTagLength();
	    if (tag == 0)
		break;
	    if (tag == 0x82) {
		try {
		    this.zOffset = new INTEGER(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("zOffset", "INTEGER");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    source.raiseUnknownFieldException(tag);
	} while(false);

	if (source.position() > end_pos0)
	    throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
	if (total_len0 < 0 && source.mLength != 0)
	    throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);

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
	RegionOffsets temp0 = this;

	if (temp0.zOffset != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.zOffset, sink), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("zOffset", "INTEGER");
		throw ee;
	    }
	}
	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.yOffset, sink), 0x81);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("yOffset", "INTEGER");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.xOffset, sink), 0x80);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("xOffset", "INTEGER");
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, RegionOffsets data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(data.zOffset != null);
	++nbits;
	// Encode field 'xOffset'
	try {
	    INTEGER item1 = data.xOffset;
	    long temp1 = item1.longValue();

	    if (temp1 < -32767 || temp1 > 32767)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, -32767, 32767, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("xOffset", "INTEGER");
	    throw ee;
	}
	// Encode field 'yOffset'
	try {
	    INTEGER item1 = data.yOffset;
	    long temp1 = item1.longValue();

	    if (temp1 < -32767 || temp1 > 32767)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, -32767, 32767, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("yOffset", "INTEGER");
	    throw ee;
	}
	if (data.zOffset != null) {
	    // Encode field 'zOffset'
	    try {
		INTEGER item1 = data.zOffset;
		long temp1 = item1.longValue();

		if (temp1 < -32767 || temp1 > 32767)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, -32767, 32767, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("zOffset", "INTEGER");
		throw ee;
	    }
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static RegionOffsets decodeValue(PerCoder coder, InputBitStream source, RegionOffsets data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean has_zOffset0 = source.readBit();
    /** Decode root fields **/
	// Decode field 'xOffset'
	try {
	    long temp1;

	    if (data.xOffset == null)
		data.xOffset = new INTEGER();
	    temp1 = coder.decodeConstrainedWholeNumber(source, -32767, 32767);
	    if (temp1 > 32767)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.xOffset.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("xOffset", "INTEGER");
	    throw de;
	}
	// Decode field 'yOffset'
	try {
	    long temp1;

	    if (data.yOffset == null)
		data.yOffset = new INTEGER();
	    temp1 = coder.decodeConstrainedWholeNumber(source, -32767, 32767);
	    if (temp1 > 32767)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.yOffset.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("yOffset", "INTEGER");
	    throw de;
	}
	if (has_zOffset0) {
	    // Decode field 'zOffset'
	    try {
		long temp1;

		if (data.zOffset == null)
		    data.zOffset = new INTEGER();
		temp1 = coder.decodeConstrainedWholeNumber(source, -32767, 32767);
		if (temp1 > 32767)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.zOffset.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("zOffset", "INTEGER");
		throw de;
	    }
	} else {
	    data.zOffset = null;
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
	// Encode field 'xOffset'
	try {
	    INTEGER item1 = this.xOffset;

	    {
		sink.encodeKey("xOffset");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("xOffset", "INTEGER");
	    throw ee;
	}
	// Encode field 'yOffset'
	try {
	    INTEGER item1 = this.yOffset;

	    {
		sink.writeSeparator();
		sink.encodeKey("yOffset");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("yOffset", "INTEGER");
	    throw ee;
	}
	// Encode field 'zOffset'
	try {
	    INTEGER item1 = this.zOffset;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("zOffset");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "zOffset");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("zOffset", "INTEGER");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public RegionOffsets decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[4];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		RegionOffsets.__Tag t_tag0 = RegionOffsets.__Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = RegionOffsets.__Tag._null_;
		switch (t_tag0) {
		    case __xOffset:
		    // Decode field 'xOffset'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.xOffset == null)
			    this.xOffset = new INTEGER();
			this.xOffset.setValue(coder.decodeInteger(source));
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("xOffset", "INTEGER");
			throw de;
		    }
		    break;
		    case __yOffset:
		    // Decode field 'yOffset'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.yOffset == null)
			    this.yOffset = new INTEGER();
			this.yOffset.setValue(coder.decodeInteger(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("yOffset", "INTEGER");
			throw de;
		    }
		    break;
		    case __zOffset:
		    // Decode field 'zOffset'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.zOffset == null)
				this.zOffset = new INTEGER();
			    this.zOffset.setValue(coder.decodeInteger(source));
			    present0[2] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("zOffset", "INTEGER");
			throw de;
		    }
		    break;
		    default:
			throw new DecoderException(ExceptionDescriptor._unknown_field, ": '" + tag0 + "'");
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'xOffset'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'yOffset'");
	if (!present0[2])
	    this.zOffset = null;
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
	    writer.print("xOffset ");
	    writer.print(this.xOffset.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("yOffset ");
	    writer.print(this.yOffset.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.zOffset != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("zOffset ");
		writer.print(this.zOffset.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
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
	return equalTo((RegionOffsets)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((RegionOffsets)that);
    }
    
    public boolean equalTo(RegionOffsets that) {
	if (!this.xOffset.equalTo(that.xOffset))
	    return false;
	if (!this.yOffset.equalTo(that.yOffset))
	    return false;
	if (this.zOffset != null && that.zOffset != null) {
	    if (!this.zOffset.equalTo(that.zOffset))
		return false;
	}
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public RegionOffsets clone() {
	RegionOffsets copy = (RegionOffsets)super.clone();
	copy.xOffset = xOffset.clone();
	copy.yOffset = yOffset.clone();
	if (zOffset != null) {
	    copy.zOffset = zOffset.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.xOffset != null ? this.xOffset.hashCode() : 0);
	hash = 41 * hash + (this.yOffset != null ? this.yOffset.hashCode() : 0);
	hash = 41 * hash + (this.zOffset != null ? this.zOffset.hashCode() : 0);
	return hash;
    }
} // End class definition for RegionOffsets
