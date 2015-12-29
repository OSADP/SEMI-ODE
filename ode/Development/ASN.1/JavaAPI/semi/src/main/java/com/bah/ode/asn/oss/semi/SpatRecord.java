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
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     */
    public static enum __Tag
    {
	__timestamp("timestamp"),
	__intersections("intersections"),
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

	    nbits += (item1.encodeValue(coder, sink, item1));
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
    /** Decode root fields **/
	// Decode field 'timestamp'
	try {
	    if (data.timestamp == null)
		data.timestamp = new com.bah.ode.asn.oss.dsrc.DDateTime();
	    data.timestamp.decodeValue(coder, source, data.timestamp);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("timestamp", "DDateTime");
	    throw de;
	}
	// Decode field 'intersections'
	try {
	    if (data.intersections == null)
		data.intersections = new com.bah.ode.asn.oss.dsrc.IntersectionState();
	    data.intersections.decodeValue(coder, source, data.intersections);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("intersections", "IntersectionState");
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
	// Encode field 'timestamp'
	try {
	    com.bah.ode.asn.oss.dsrc.DDateTime item1 = this.timestamp;

	    {
		sink.encodeKey("timestamp");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("timestamp", "DDateTime");
	    throw ee;
	}
	// Encode field 'intersections'
	try {
	    com.bah.ode.asn.oss.dsrc.IntersectionState item1 = this.intersections;

	    {
		sink.writeSeparator();
		sink.encodeKey("intersections");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("intersections", "IntersectionState");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public SpatRecord decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[3];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		SpatRecord.__Tag t_tag0 = SpatRecord.__Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = SpatRecord.__Tag._null_;
		switch (t_tag0) {
		    case __timestamp:
		    // Decode field 'timestamp'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.timestamp == null)
			    this.timestamp = new com.bah.ode.asn.oss.dsrc.DDateTime();
			this.timestamp.decodeValue(coder, source);
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("timestamp", "DDateTime");
			throw de;
		    }
		    break;
		    case __intersections:
		    // Decode field 'intersections'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.intersections == null)
			    this.intersections = new com.bah.ode.asn.oss.dsrc.IntersectionState();
			this.intersections.decodeValue(coder, source);
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("intersections", "IntersectionState");
			throw de;
		    }
		    break;
		    default:
			throw new DecoderException(ExceptionDescriptor._unknown_field, ": '" + tag0 + "'");
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'timestamp'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'intersections'");
	return this;
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

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.timestamp != null ? this.timestamp.hashCode() : 0);
	hash = 41 * hash + (this.intersections != null ? this.intersections.hashCode() : 0);
	return hash;
    }
} // End class definition for SpatRecord
