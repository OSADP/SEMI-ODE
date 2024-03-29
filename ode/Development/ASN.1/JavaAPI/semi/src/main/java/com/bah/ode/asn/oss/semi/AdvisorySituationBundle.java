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
 * Define the ASN1 Type AdvisorySituationBundle from ASN1 Module SEMI.
 * @see Sequence
 */

public class AdvisorySituationBundle extends Sequence {
    public INTEGER bundleNumber;
    public com.bah.ode.asn.oss.dsrc.TemporaryID bundleId;
    public AsdRecords asdRecords;
    
    /**
     * The default constructor.
     */
    public AdvisorySituationBundle()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public AdvisorySituationBundle(INTEGER bundleNumber, 
		    com.bah.ode.asn.oss.dsrc.TemporaryID bundleId, 
		    AsdRecords asdRecords)
    {
	setBundleNumber(bundleNumber);
	setBundleId(bundleId);
	setAsdRecords(asdRecords);
    }
    
    /**
     * Construct with components.
     */
    public AdvisorySituationBundle(long bundleNumber, 
		    com.bah.ode.asn.oss.dsrc.TemporaryID bundleId, 
		    AsdRecords asdRecords)
    {
	this(new INTEGER(bundleNumber), bundleId, asdRecords);
    }
    
    
    // Methods for field "bundleNumber"
    public long getBundleNumber()
    {
	return (this.bundleNumber).longValue();
    }
    
    public void setBundleNumber(long bundleNumber)
    {
	setBundleNumber(new INTEGER(bundleNumber));
    }
    
    public void setBundleNumber(INTEGER bundleNumber)
    {
	this.bundleNumber = bundleNumber;
    }
    
    
    // Methods for field "bundleId"
    public com.bah.ode.asn.oss.dsrc.TemporaryID getBundleId()
    {
	return this.bundleId;
    }
    
    public void setBundleId(com.bah.ode.asn.oss.dsrc.TemporaryID bundleId)
    {
	this.bundleId = bundleId;
    }
    
    
    // Methods for field "asdRecords"
    public AsdRecords getAsdRecords()
    {
	return this.asdRecords;
    }
    
    public void setAsdRecords(AsdRecords asdRecords)
    {
	this.asdRecords = asdRecords;
    }
    
    
    
    /**
     * Define the ASN1 Type AsdRecords from ASN1 Module SEMI.
     * @see SequenceOf
     */
    public static class AsdRecords extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public AsdRecords()
	{
	    this.elements = new java.util.ArrayList<AdvisoryBroadcast>();
	}
	
	
	/**
	 * Construct from an array of components.
	 */
	public java.util.ArrayList<AdvisoryBroadcast> elements;

	public AsdRecords(AdvisoryBroadcast[] elements)
	{
	    this.elements = new java.util.ArrayList<AdvisoryBroadcast>(java.util.Arrays.asList(elements));
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(AdvisoryBroadcast element)
	{
	    elements.add(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(AdvisoryBroadcast element, int atIndex)
	{
	    elements.set(atIndex, element);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized AdvisoryBroadcast get(int atIndex)
	{
	    return (AdvisoryBroadcast)elements.get(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(AdvisoryBroadcast element, int atIndex)
	{
	    elements.add(atIndex, element);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(AdvisoryBroadcast element)
	{
	    elements.remove(element);
	}
	
	/**
	 * Remove an Element at the specified position from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(int index)
	{
	    elements.remove(index);
	}
	
	/**
	 * Implements PER value encoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public static int encodeValue(PerCoder coder, OutputBitStream sink, AsdRecords data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int total_len0 = data.elements.size();
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;
	    int nbits = 0;

	    if (total_len0 < 1 || total_len0 > 10)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + total_len0);
	    nbits += coder.encodeLengthDeterminant(total_len0, 1, 10, sink);
	    moreFragments0 = coder.moreFragments();
	    fragmentLength0 = (moreFragments0 ? coder.fragmentLength() : total_len0);
	    while (total_len0 > 0) {
		try {
		    AdvisoryBroadcast item1 = data.elements.get(idx0);

		    nbits += AdvisoryBroadcast.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "AdvisoryBroadcast", idx0);
		    throw ee;
		}
		--total_len0; --fragmentLength0; ++idx0;
		if (fragmentLength0 == 0) {
		    if (moreFragments0) {
			nbits += coder.encodeLengthDeterminant(total_len0, sink);
			moreFragments0 = coder.moreFragments();
			fragmentLength0 = (moreFragments0 ? coder.fragmentLength() : total_len0);
		    }
		}
	    }

	    return nbits;
	}

	/**
	 * Implements PER value decoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public static AsdRecords decodeValue(PerCoder coder, InputBitStream source, AsdRecords data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    int total_len0 = 0;
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;

	    idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, 1, 10);
	    if (fragmentLength0 > 10)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + fragmentLength0);
	    moreFragments0 = coder.moreFragments();
	    if (data.elements != null)
		data.elements.clear();
	    else
		data.elements = new java.util.ArrayList<AdvisoryBroadcast>(fragmentLength0);
	    while (idx0 > 0) {
		try {
		    AdvisoryBroadcast item1 = new AdvisoryBroadcast();

		    data.elements.add(item1);
		    item1.decodeValue(coder, source, item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "AdvisoryBroadcast", total_len0);
		    throw de;
		}
		--idx0; ++total_len0;
		if (idx0 == 0) {
		    if (moreFragments0) {
			idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, fragmentLength0);
			moreFragments0 = coder.moreFragments();
			if ((total_len0 + fragmentLength0) > 10)
			    throw new DecoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + (total_len0 + fragmentLength0));
		    }
		}
	    }
	    if (total_len0 < 1)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + total_len0);
	    return data;
	}

	/**
	 * Implements JSON value encoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public void encodeValue(JsonCoder coder, JsonWriter sink)
		throws IOException, EncoderException
	{
	    int total_len0 = this.elements.size();
	    int idx0 = 0;

	    sink.beginArray();
	    if (total_len0 > 0) {
		while (true) {
		    try {
			AdvisoryBroadcast item1 = this.elements.get(idx0);

			item1.encodeValue(coder, sink);
		    
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "AdvisoryBroadcast", idx0);
		    throw ee;
		}
		idx0++;
		if (idx0 == total_len0) break;
		sink.writeSeparator();
	    }
	}
	sink.endArray();

    }

	/**
	 * Implements JSON value decoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public AsdRecords decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	int total_len0 = 0;
	int idx0 = 0;

	if (this.elements != null)
	    this.elements.clear();
	else
	    this.elements = new java.util.ArrayList<AdvisoryBroadcast>(total_len0);
	coder.decodeArray(source);
	if (coder.hasMoreElements(source, true))
	    do {
		try {
		    AdvisoryBroadcast item1 = new AdvisoryBroadcast();

		    this.elements.add(item1);
		    item1.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "AdvisoryBroadcast", idx0);
		    throw de;
		}
		++idx0;
	    } while (coder.hasMoreElements(source, false));
	    return this;
	}

	/**
	 * Compare 'this' object to another object to see if their contents are the same.
	 */
	public boolean abstractEqualTo(AbstractData that)
	{
	    return equalTo((AsdRecords)that);
	}
	
	public boolean equalTo(SequenceOf that)
	{
	    return equalTo((AsdRecords)that);
	}
	
	public boolean equalTo(AsdRecords that) {
	    int size = this.getSize();
	    if (size != that.getSize())
		return false;
	    for (int i = 0; i < size; i++) {
		if (!this.get(i).equalTo(that.get(i)))
		    return false;
	    }
	    return true;
	}

	public int getSize()
	{
	    return elements.size();
	}
	
	public void removeAllElements() {
	    if (elements != null)
		elements.clear();
	}

	/**
	 * Clone 'this' object.
	 */
	public AsdRecords clone() {
	    AsdRecords copy = (AsdRecords)super.clone();
	    copy.elements = new java.util.ArrayList<AdvisoryBroadcast>(elements.size());
	    for (AdvisoryBroadcast element : elements) {
		copy.elements.add(element.clone());
	    }
	    return copy;
	}

	/**
	 * Returns a hash code for 'this' object.
	 */
	public int hashCode() {
	    int hash = 7;
	    hash = 79 * hash + (this.elements != null ? this.elements.hashCode() : 0);
	    return hash;
	}
    } // End class definition for AsdRecords

    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     */
    public static enum __Tag
    {
	__bundleNumber("bundleNumber"),
	__bundleId("bundleId"),
	__asdRecords("asdRecords"),
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
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, AdvisorySituationBundle data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	// Encode field 'bundleNumber'
	try {
	    INTEGER item1 = data.bundleNumber;
	    long temp1 = item1.longValue();

	    if (temp1 < 1 || temp1 > 40)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += (coder.encodeConstrainedWholeNumber(temp1, 1, 40, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("bundleNumber", "INTEGER");
	    throw ee;
	}
	// Encode field 'bundleId'
	try {
	    com.bah.ode.asn.oss.dsrc.TemporaryID item1 = data.bundleId;
	    int len1 = item1.getSize();

	    if (len1 != 4)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 4, 4, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("bundleId", "TemporaryID");
	    throw ee;
	}
	// Encode field 'asdRecords'
	try {
	    AsdRecords item1 = data.asdRecords;

	    nbits += AsdRecords.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("asdRecords", "SEQUENCE OF");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static AdvisorySituationBundle decodeValue(PerCoder coder, InputBitStream source, AdvisorySituationBundle data)
	    throws IOException, DecoderException, DecodeFailedException
    {
    /** Decode root fields **/
	// Decode field 'bundleNumber'
	try {
	    long temp1;

	    if (data.bundleNumber == null)
		data.bundleNumber = new INTEGER();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 1, 40);
	    if (temp1 > 40)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.bundleNumber.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("bundleNumber", "INTEGER");
	    throw de;
	}
	// Decode field 'bundleId'
	try {
	    data.bundleId = new com.bah.ode.asn.oss.dsrc.TemporaryID(com.oss.coders.per.PerOctets.decode(coder, source, 4, 4));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("bundleId", "TemporaryID");
	    throw de;
	}
	// Decode field 'asdRecords'
	try {
	    if (data.asdRecords == null)
		data.asdRecords = new AsdRecords();
	    data.asdRecords.decodeValue(coder, source, data.asdRecords);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("asdRecords", "SEQUENCE OF");
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
	// Encode field 'bundleNumber'
	try {
	    INTEGER item1 = this.bundleNumber;

	    {
		sink.encodeKey("bundleNumber");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("bundleNumber", "INTEGER");
	    throw ee;
	}
	// Encode field 'bundleId'
	try {
	    com.bah.ode.asn.oss.dsrc.TemporaryID item1 = this.bundleId;

	    {
		sink.writeSeparator();
		sink.encodeKey("bundleId");
		sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("bundleId", "TemporaryID");
	    throw ee;
	}
	// Encode field 'asdRecords'
	try {
	    AsdRecords item1 = this.asdRecords;

	    {
		sink.writeSeparator();
		sink.encodeKey("asdRecords");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("asdRecords", "SEQUENCE OF");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public AdvisorySituationBundle decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[4];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		AdvisorySituationBundle.__Tag t_tag0 = AdvisorySituationBundle.__Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = AdvisorySituationBundle.__Tag._null_;
		switch (t_tag0) {
		    case __bundleNumber:
		    // Decode field 'bundleNumber'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.bundleNumber == null)
			    this.bundleNumber = new INTEGER();
			this.bundleNumber.setValue(coder.decodeInteger(source));
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("bundleNumber", "INTEGER");
			throw de;
		    }
		    break;
		    case __bundleId:
		    // Decode field 'bundleId'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			this.bundleId = new com.bah.ode.asn.oss.dsrc.TemporaryID(coder.decodeOctetString(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("bundleId", "TemporaryID");
			throw de;
		    }
		    break;
		    case __asdRecords:
		    // Decode field 'asdRecords'
		    try {
			if (present0[2])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.asdRecords == null)
			    this.asdRecords = new AsdRecords();
			this.asdRecords.decodeValue(coder, source);
			present0[2] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("asdRecords", "SEQUENCE OF");
			throw de;
		    }
		    break;
		    default:
			throw new DecoderException(ExceptionDescriptor._unknown_field, ": '" + tag0 + "'");
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'bundleNumber'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'bundleId'");
	if (!present0[2])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'asdRecords'");
	return this;
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((AdvisorySituationBundle)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((AdvisorySituationBundle)that);
    }
    
    public boolean equalTo(AdvisorySituationBundle that) {
	if (!this.bundleNumber.equalTo(that.bundleNumber))
	    return false;
	if (!this.bundleId.equalTo(that.bundleId))
	    return false;
	if (!this.asdRecords.equalTo(that.asdRecords))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public AdvisorySituationBundle clone() {
	AdvisorySituationBundle copy = (AdvisorySituationBundle)super.clone();
	copy.bundleNumber = bundleNumber.clone();
	copy.bundleId = bundleId.clone();
	copy.asdRecords = asdRecords.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.bundleNumber != null ? this.bundleNumber.hashCode() : 0);
	hash = 41 * hash + (this.bundleId != null ? this.bundleId.hashCode() : 0);
	hash = 41 * hash + (this.asdRecords != null ? this.asdRecords.hashCode() : 0);
	return hash;
    }
} // End class definition for AdvisorySituationBundle
