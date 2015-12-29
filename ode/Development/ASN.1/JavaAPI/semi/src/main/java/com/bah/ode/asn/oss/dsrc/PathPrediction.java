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
 * Define the ASN1 Type PathPrediction from ASN1 Module DSRC.
 * @see Sequence
 */

public class PathPrediction extends Sequence {
    public INTEGER radiusOfCurve;
    public INTEGER confidence;
    
    /**
     * The default constructor.
     */
    public PathPrediction()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PathPrediction(INTEGER radiusOfCurve, INTEGER confidence)
    {
	setRadiusOfCurve(radiusOfCurve);
	setConfidence(confidence);
    }
    
    /**
     * Construct with components.
     */
    public PathPrediction(long radiusOfCurve, long confidence)
    {
	this(new INTEGER(radiusOfCurve), new INTEGER(confidence));
    }
    
    
    // Methods for field "radiusOfCurve"
    public long getRadiusOfCurve()
    {
	return (this.radiusOfCurve).longValue();
    }
    
    public void setRadiusOfCurve(long radiusOfCurve)
    {
	setRadiusOfCurve(new INTEGER(radiusOfCurve));
    }
    
    public void setRadiusOfCurve(INTEGER radiusOfCurve)
    {
	this.radiusOfCurve = radiusOfCurve;
    }
    
    
    // Methods for field "confidence"
    public long getConfidence()
    {
	return (this.confidence).longValue();
    }
    
    public void setConfidence(long confidence)
    {
	setConfidence(new INTEGER(confidence));
    }
    
    public void setConfidence(INTEGER confidence)
    {
	this.confidence = confidence;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     */
    public static enum __Tag
    {
	__radiusOfCurve("radiusOfCurve"),
	__confidence("confidence"),
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
	PathPrediction temp0 = this;

	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.confidence, sink), 0x81);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("confidence", "INTEGER");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.radiusOfCurve, sink), 0x80);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("radiusOfCurve", "INTEGER");
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements BER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public PathPrediction decodeValue(BerCoder coder, DecoderInput source)
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
		this.radiusOfCurve = new INTEGER(source.decodeLong());
	    } catch (Exception e) {
		DecoderException ee = DecoderException.wrapException(e);
		ee.appendFieldContext("radiusOfCurve", "INTEGER");
		throw ee;
	    }
	    tag = source.decodeTagLength();
	    if (tag != 0x81)
		source.raiseTagMismatchException(tag);
	    try {
		this.confidence = new INTEGER(source.decodeLong());
	    } catch (Exception e) {
		DecoderException ee = DecoderException.wrapException(e);
		ee.appendFieldContext("confidence", "INTEGER");
		throw ee;
	    }
	    if (source.position() >= end_pos0)
		break;
	    tag = source.decodeTagLength();
	    if (tag == 0)
		break;
	    for (;;) {
		try {
		    coder.skipContents(source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendExtensionContext("PathPrediction", -1);
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
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
	PathPrediction temp0 = this;

	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.confidence, sink), 0x81);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("confidence", "INTEGER");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.radiusOfCurve, sink), 0x80);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("radiusOfCurve", "INTEGER");
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, PathPrediction data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	++nbits;
	// Encode field 'radiusOfCurve'
	try {
	    INTEGER item1 = data.radiusOfCurve;
	    long temp1 = item1.longValue();

	    if (temp1 < -32767 || temp1 > 32767)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, -32767, 32767, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("radiusOfCurve", "INTEGER");
	    throw ee;
	}
	// Encode field 'confidence'
	try {
	    INTEGER item1 = data.confidence;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 200)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 200, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("confidence", "INTEGER");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static PathPrediction decodeValue(PerCoder coder, InputBitStream source, PathPrediction data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

    /** Decode root fields **/
	// Decode field 'radiusOfCurve'
	try {
	    long temp1;

	    if (data.radiusOfCurve == null)
		data.radiusOfCurve = new INTEGER();
	    temp1 = coder.decodeConstrainedWholeNumber(source, -32767, 32767);
	    if (temp1 > 32767)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.radiusOfCurve.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("radiusOfCurve", "INTEGER");
	    throw de;
	}
	// Decode field 'confidence'
	try {
	    long temp1;

	    if (data.confidence == null)
		data.confidence = new INTEGER();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 200);
	    if (temp1 > 200)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.confidence.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("confidence", "INTEGER");
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
     * Implements JSON value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public void encodeValue(JsonCoder coder, JsonWriter sink)
	    throws IOException, EncoderException
    {
	sink.beginObject();
	// Encode field 'radiusOfCurve'
	try {
	    INTEGER item1 = this.radiusOfCurve;

	    {
		sink.encodeKey("radiusOfCurve");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("radiusOfCurve", "INTEGER");
	    throw ee;
	}
	// Encode field 'confidence'
	try {
	    INTEGER item1 = this.confidence;

	    {
		sink.writeSeparator();
		sink.encodeKey("confidence");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("confidence", "INTEGER");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public PathPrediction decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[3];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		PathPrediction.__Tag t_tag0 = PathPrediction.__Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = PathPrediction.__Tag._null_;
		switch (t_tag0) {
		    case __radiusOfCurve:
		    // Decode field 'radiusOfCurve'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.radiusOfCurve == null)
			    this.radiusOfCurve = new INTEGER();
			this.radiusOfCurve.setValue(coder.decodeInteger(source));
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("radiusOfCurve", "INTEGER");
			throw de;
		    }
		    break;
		    case __confidence:
		    // Decode field 'confidence'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.confidence == null)
			    this.confidence = new INTEGER();
			this.confidence.setValue(coder.decodeInteger(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("confidence", "INTEGER");
			throw de;
		    }
		    break;
		    default:
			coder.skipValue(source);
			break;
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'radiusOfCurve'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'confidence'");
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
	    writer.print("radiusOfCurve ");
	    writer.print(this.radiusOfCurve.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("confidence ");
	    writer.print(this.confidence.longValue());
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
	return equalTo((PathPrediction)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((PathPrediction)that);
    }
    
    public boolean equalTo(PathPrediction that) {
	if (!this.radiusOfCurve.equalTo(that.radiusOfCurve))
	    return false;
	if (!this.confidence.equalTo(that.confidence))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public PathPrediction clone() {
	PathPrediction copy = (PathPrediction)super.clone();
	copy.radiusOfCurve = radiusOfCurve.clone();
	copy.confidence = confidence.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.radiusOfCurve != null ? this.radiusOfCurve.hashCode() : 0);
	hash = 41 * hash + (this.confidence != null ? this.confidence.hashCode() : 0);
	return hash;
    }
} // End class definition for PathPrediction
