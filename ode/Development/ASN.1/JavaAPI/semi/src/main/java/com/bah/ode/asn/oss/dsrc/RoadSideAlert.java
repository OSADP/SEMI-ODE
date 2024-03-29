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
 * Define the ASN1 Type RoadSideAlert from ASN1 Module DSRC.
 * @see Sequence
 */

public class RoadSideAlert extends Sequence {
    public DSRCmsgID msgID;
    public MsgCount msgCnt;
    public com.bah.ode.asn.oss.itis.ITIScodes typeEvent;
    public Description description;
    public Priority priority;
    public HeadingSlice heading;
    public Extent extent;
    public FullPositionVector positon;
    public FurtherInfoID furtherInfoID;
    public MsgCRC crc;
    
    /**
     * The default constructor.
     */
    public RoadSideAlert()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RoadSideAlert(DSRCmsgID msgID, MsgCount msgCnt, 
		    com.bah.ode.asn.oss.itis.ITIScodes typeEvent, 
		    Description description, Priority priority, 
		    HeadingSlice heading, Extent extent, 
		    FullPositionVector positon, FurtherInfoID furtherInfoID, 
		    MsgCRC crc)
    {
	setMsgID(msgID);
	setMsgCnt(msgCnt);
	setTypeEvent(typeEvent);
	setDescription(description);
	setPriority(priority);
	setHeading(heading);
	setExtent(extent);
	setPositon(positon);
	setFurtherInfoID(furtherInfoID);
	setCrc(crc);
    }
    
    /**
     * Construct with required components.
     */
    public RoadSideAlert(DSRCmsgID msgID, MsgCount msgCnt, 
		    com.bah.ode.asn.oss.itis.ITIScodes typeEvent, MsgCRC crc)
    {
	setMsgID(msgID);
	setMsgCnt(msgCnt);
	setTypeEvent(typeEvent);
	setCrc(crc);
    }
    
    
    // Methods for field "msgID"
    public DSRCmsgID getMsgID()
    {
	return this.msgID;
    }
    
    public void setMsgID(DSRCmsgID msgID)
    {
	this.msgID = msgID;
    }
    
    
    // Methods for field "msgCnt"
    public MsgCount getMsgCnt()
    {
	return this.msgCnt;
    }
    
    public void setMsgCnt(MsgCount msgCnt)
    {
	this.msgCnt = msgCnt;
    }
    
    
    // Methods for field "typeEvent"
    public com.bah.ode.asn.oss.itis.ITIScodes getTypeEvent()
    {
	return this.typeEvent;
    }
    
    public void setTypeEvent(com.bah.ode.asn.oss.itis.ITIScodes typeEvent)
    {
	this.typeEvent = typeEvent;
    }
    
    
    // Methods for field "description"
    public Description getDescription()
    {
	return this.description;
    }
    
    public void setDescription(Description description)
    {
	this.description = description;
    }
    
    public boolean hasDescription()
    {
	return (description != null);
    }
    
    public void deleteDescription()
    {
	description = null;
    }
    
    
    
    /**
     * Define the ASN1 Type Description from ASN1 Module DSRC.
     * @see SequenceOf
     */
    public static class Description extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public Description()
	{
	    this.elements = new java.util.ArrayList<com.bah.ode.asn.oss.itis.ITIScodes>();
	}
	
	
	/**
	 * Construct from an array of components.
	 */
	public java.util.ArrayList<com.bah.ode.asn.oss.itis.ITIScodes> elements;

	public Description(com.bah.ode.asn.oss.itis.ITIScodes[] elements)
	{
	    this.elements = new java.util.ArrayList<com.bah.ode.asn.oss.itis.ITIScodes>(java.util.Arrays.asList(elements));
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(com.bah.ode.asn.oss.itis.ITIScodes element)
	{
	    elements.add(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(com.bah.ode.asn.oss.itis.ITIScodes element, int atIndex)
	{
	    elements.set(atIndex, element);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized com.bah.ode.asn.oss.itis.ITIScodes get(int atIndex)
	{
	    return (com.bah.ode.asn.oss.itis.ITIScodes)elements.get(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(com.bah.ode.asn.oss.itis.ITIScodes element, int atIndex)
	{
	    elements.add(atIndex, element);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(com.bah.ode.asn.oss.itis.ITIScodes element)
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
	public static int encodeValue(PerCoder coder, OutputBitStream sink, Description data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int total_len0 = data.elements.size();
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;
	    int nbits = 0;

	    if (total_len0 < 1 || total_len0 > 8)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + total_len0);
	    nbits += coder.encodeLengthDeterminant(total_len0, 1, 8, sink);
	    moreFragments0 = coder.moreFragments();
	    fragmentLength0 = (moreFragments0 ? coder.fragmentLength() : total_len0);
	    while (total_len0 > 0) {
		try {
		    com.bah.ode.asn.oss.itis.ITIScodes item1 = data.elements.get(idx0);
		    long temp1 = item1.longValue();

		    if (temp1 < 0 || temp1 > 65565)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 65565, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "ITIScodes", idx0);
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
	public static Description decodeValue(PerCoder coder, InputBitStream source, Description data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    int total_len0 = 0;
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;

	    idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, 1, 8);
	    if (fragmentLength0 > 8)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + fragmentLength0);
	    moreFragments0 = coder.moreFragments();
	    if (data.elements != null)
		data.elements.clear();
	    else
		data.elements = new java.util.ArrayList<com.bah.ode.asn.oss.itis.ITIScodes>(fragmentLength0);
	    while (idx0 > 0) {
		try {
		    com.bah.ode.asn.oss.itis.ITIScodes item1 = new com.bah.ode.asn.oss.itis.ITIScodes();
		    long temp1;

		    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 65565);
		    if (temp1 > 65565)
			throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		    item1.setValue(temp1);
		    data.elements.add(item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "ITIScodes", total_len0);
		    throw de;
		}
		--idx0; ++total_len0;
		if (idx0 == 0) {
		    if (moreFragments0) {
			idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, fragmentLength0);
			moreFragments0 = coder.moreFragments();
			if ((total_len0 + fragmentLength0) > 8)
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
			com.bah.ode.asn.oss.itis.ITIScodes item1 = this.elements.get(idx0);

			coder.encodeInteger(item1.longValue(), sink);
		    
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "ITIScodes", idx0);
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
	public Description decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	int total_len0 = 0;
	int idx0 = 0;

	if (this.elements != null)
	    this.elements.clear();
	else
	    this.elements = new java.util.ArrayList<com.bah.ode.asn.oss.itis.ITIScodes>(total_len0);
	coder.decodeArray(source);
	if (coder.hasMoreElements(source, true))
	    do {
		try {
		    com.bah.ode.asn.oss.itis.ITIScodes item1 = new com.bah.ode.asn.oss.itis.ITIScodes();

		    item1.setValue(coder.decodeInteger(source));
		    this.elements.add(item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "ITIScodes", idx0);
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
	    return equalTo((Description)that);
	}
	
	public boolean equalTo(SequenceOf that)
	{
	    return equalTo((Description)that);
	}
	
	public boolean equalTo(Description that) {
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
	public Description clone() {
	    Description copy = (Description)super.clone();
	    copy.elements = new java.util.ArrayList<com.bah.ode.asn.oss.itis.ITIScodes>(elements.size());
	    for (com.bah.ode.asn.oss.itis.ITIScodes element : elements) {
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
    } // End class definition for Description

    // Methods for field "priority"
    public Priority getPriority()
    {
	return this.priority;
    }
    
    public void setPriority(Priority priority)
    {
	this.priority = priority;
    }
    
    public boolean hasPriority()
    {
	return (priority != null);
    }
    
    public void deletePriority()
    {
	priority = null;
    }
    
    
    // Methods for field "heading"
    public HeadingSlice getHeading()
    {
	return this.heading;
    }
    
    public void setHeading(HeadingSlice heading)
    {
	this.heading = heading;
    }
    
    public boolean hasHeading()
    {
	return (heading != null);
    }
    
    public void deleteHeading()
    {
	heading = null;
    }
    
    
    // Methods for field "extent"
    public Extent getExtent()
    {
	return this.extent;
    }
    
    public void setExtent(Extent extent)
    {
	this.extent = extent;
    }
    
    public boolean hasExtent()
    {
	return (extent != null);
    }
    
    public void deleteExtent()
    {
	extent = null;
    }
    
    
    // Methods for field "positon"
    public FullPositionVector getPositon()
    {
	return this.positon;
    }
    
    public void setPositon(FullPositionVector positon)
    {
	this.positon = positon;
    }
    
    public boolean hasPositon()
    {
	return (positon != null);
    }
    
    public void deletePositon()
    {
	positon = null;
    }
    
    
    // Methods for field "furtherInfoID"
    public FurtherInfoID getFurtherInfoID()
    {
	return this.furtherInfoID;
    }
    
    public void setFurtherInfoID(FurtherInfoID furtherInfoID)
    {
	this.furtherInfoID = furtherInfoID;
    }
    
    public boolean hasFurtherInfoID()
    {
	return (furtherInfoID != null);
    }
    
    public void deleteFurtherInfoID()
    {
	furtherInfoID = null;
    }
    
    
    // Methods for field "crc"
    public MsgCRC getCrc()
    {
	return this.crc;
    }
    
    public void setCrc(MsgCRC crc)
    {
	this.crc = crc;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     */
    public static enum __Tag
    {
	__msgID("msgID"),
	__msgCnt("msgCnt"),
	__typeEvent("typeEvent"),
	__description("description"),
	__priority("priority"),
	__heading("heading"),
	__extent("extent"),
	__positon("positon"),
	__furtherInfoID("furtherInfoID"),
	__crc("crc"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(11);
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, RoadSideAlert data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(data.description != null);
	sink.writeBit(data.priority != null);
	sink.writeBit(data.heading != null);
	sink.writeBit(data.extent != null);
	sink.writeBit(data.positon != null);
	sink.writeBit(data.furtherInfoID != null);
	nbits += 6;
	// Encode field 'msgID'
	try {
	    DSRCmsgID item1 = data.msgID;
	    int idx1;
	    boolean extroot1 = true;

	    if (item1.isUnknownEnumerator()) {
		throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
	    } else {
		idx1 = item1.indexOf();
		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		extroot1 = idx1 < 17;
	    }
	    sink.writeBit(!extroot1); ++nbits;
	    if (extroot1)
		nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 16, sink);
	    else
		nbits += coder.encodeNormallySmallNumber(idx1 - 17, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msgID", "DSRCmsgID");
	    throw ee;
	}
	// Encode field 'msgCnt'
	try {
	    MsgCount item1 = data.msgCnt;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 127)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 127, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msgCnt", "MsgCount");
	    throw ee;
	}
	// Encode field 'typeEvent'
	try {
	    com.bah.ode.asn.oss.itis.ITIScodes item1 = data.typeEvent;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 65565)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 65565, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("typeEvent", "ITIScodes");
	    throw ee;
	}
	if (data.description != null) {
	    // Encode field 'description'
	    try {
		Description item1 = data.description;

		nbits += Description.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("description", "SEQUENCE OF");
		throw ee;
	    }
	}
	if (data.priority != null) {
	    // Encode field 'priority'
	    try {
		Priority item1 = data.priority;
		int len1 = item1.getSize();

		if (len1 != 1)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 1, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("priority", "Priority");
		throw ee;
	    }
	}
	if (data.heading != null) {
	    // Encode field 'heading'
	    try {
		HeadingSlice item1 = data.heading;
		int len1 = item1.getSize();

		if (len1 != 2)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 2, 2, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("heading", "HeadingSlice");
		throw ee;
	    }
	}
	if (data.extent != null) {
	    // Encode field 'extent'
	    try {
		Extent item1 = data.extent;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 11, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("extent", "Extent");
		throw ee;
	    }
	}
	if (data.positon != null) {
	    // Encode field 'positon'
	    try {
		FullPositionVector item1 = data.positon;

		nbits += FullPositionVector.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("positon", "FullPositionVector");
		throw ee;
	    }
	}
	if (data.furtherInfoID != null) {
	    // Encode field 'furtherInfoID'
	    try {
		FurtherInfoID item1 = data.furtherInfoID;
		int len1 = item1.getSize();

		if (len1 != 2)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 2, 2, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("furtherInfoID", "FurtherInfoID");
		throw ee;
	    }
	}
	// Encode field 'crc'
	try {
	    MsgCRC item1 = data.crc;
	    int len1 = item1.getSize();

	    if (len1 != 2)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 2, 2, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("crc", "MsgCRC");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static RoadSideAlert decodeValue(PerCoder coder, InputBitStream source, RoadSideAlert data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean has_description0 = source.readBit();
	boolean has_priority0 = source.readBit();
	boolean has_heading0 = source.readBit();
	boolean has_extent0 = source.readBit();
	boolean has_positon0 = source.readBit();
	boolean has_furtherInfoID0 = source.readBit();
    /** Decode root fields **/
	// Decode field 'msgID'
	try {
	    int idx1;
	    DSRCmsgID temp1;
	    boolean extroot1 = !source.readBit();

	    if (extroot1) {
		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 16);
		if (idx1 < 0 || idx1 > 16)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		temp1 = DSRCmsgID.valueAt(idx1);
	    } else {
		idx1 = 17 + (int)coder.decodeNormallySmallNumber(source);
		if (idx1 < 0)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		temp1 = DSRCmsgID.unknownEnumerator();
	    }
	    data.msgID = temp1;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("msgID", "DSRCmsgID");
	    throw de;
	}
	// Decode field 'msgCnt'
	try {
	    long temp1;

	    if (data.msgCnt == null)
		data.msgCnt = new MsgCount();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 127);
	    if (temp1 > 127)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.msgCnt.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("msgCnt", "MsgCount");
	    throw de;
	}
	// Decode field 'typeEvent'
	try {
	    long temp1;

	    if (data.typeEvent == null)
		data.typeEvent = new com.bah.ode.asn.oss.itis.ITIScodes();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 65565);
	    if (temp1 > 65565)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.typeEvent.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("typeEvent", "ITIScodes");
	    throw de;
	}
	if (has_description0) {
	    // Decode field 'description'
	    try {
		if (data.description == null)
		    data.description = new Description();
		data.description.decodeValue(coder, source, data.description);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("description", "SEQUENCE OF");
		throw de;
	    }
	} else {
	    data.description = null;
	}
	if (has_priority0) {
	    // Decode field 'priority'
	    try {
		data.priority = new Priority(com.oss.coders.per.PerOctets.decode(coder, source, 1, 1));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("priority", "Priority");
		throw de;
	    }
	} else {
	    data.priority = null;
	}
	if (has_heading0) {
	    // Decode field 'heading'
	    try {
		data.heading = new HeadingSlice(com.oss.coders.per.PerOctets.decode(coder, source, 2, 2));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("heading", "HeadingSlice");
		throw de;
	    }
	} else {
	    data.heading = null;
	}
	if (has_extent0) {
	    // Decode field 'extent'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 11);
		if (idx1 < 0 || idx1 > 11)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.extent = Extent.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("extent", "Extent");
		throw de;
	    }
	} else {
	    data.extent = null;
	}
	if (has_positon0) {
	    // Decode field 'positon'
	    try {
		if (data.positon == null)
		    data.positon = new FullPositionVector();
		data.positon.decodeValue(coder, source, data.positon);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("positon", "FullPositionVector");
		throw de;
	    }
	} else {
	    data.positon = null;
	}
	if (has_furtherInfoID0) {
	    // Decode field 'furtherInfoID'
	    try {
		data.furtherInfoID = new FurtherInfoID(com.oss.coders.per.PerOctets.decode(coder, source, 2, 2));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("furtherInfoID", "FurtherInfoID");
		throw de;
	    }
	} else {
	    data.furtherInfoID = null;
	}
	// Decode field 'crc'
	try {
	    data.crc = new MsgCRC(com.oss.coders.per.PerOctets.decode(coder, source, 2, 2));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("crc", "MsgCRC");
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
	// Encode field 'msgID'
	try {
	    DSRCmsgID item1 = this.msgID;

	    {
		sink.encodeKey("msgID");
		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else 
		    sink.writeString(item1.name());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msgID", "DSRCmsgID");
	    throw ee;
	}
	// Encode field 'msgCnt'
	try {
	    MsgCount item1 = this.msgCnt;

	    {
		sink.writeSeparator();
		sink.encodeKey("msgCnt");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msgCnt", "MsgCount");
	    throw ee;
	}
	// Encode field 'typeEvent'
	try {
	    com.bah.ode.asn.oss.itis.ITIScodes item1 = this.typeEvent;

	    {
		sink.writeSeparator();
		sink.encodeKey("typeEvent");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("typeEvent", "ITIScodes");
	    throw ee;
	}
	// Encode field 'description'
	try {
	    Description item1 = this.description;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("description");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "description");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("description", "SEQUENCE OF");
	    throw ee;
	}
	// Encode field 'priority'
	try {
	    Priority item1 = this.priority;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("priority");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "priority");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("priority", "Priority");
	    throw ee;
	}
	// Encode field 'heading'
	try {
	    HeadingSlice item1 = this.heading;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("heading");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "heading");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("heading", "HeadingSlice");
	    throw ee;
	}
	// Encode field 'extent'
	try {
	    Extent item1 = this.extent;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("extent");
		    sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "extent");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("extent", "Extent");
	    throw ee;
	}
	// Encode field 'positon'
	try {
	    FullPositionVector item1 = this.positon;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("positon");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "positon");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("positon", "FullPositionVector");
	    throw ee;
	}
	// Encode field 'furtherInfoID'
	try {
	    FurtherInfoID item1 = this.furtherInfoID;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("furtherInfoID");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "furtherInfoID");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("furtherInfoID", "FurtherInfoID");
	    throw ee;
	}
	// Encode field 'crc'
	try {
	    MsgCRC item1 = this.crc;

	    {
		sink.writeSeparator();
		sink.encodeKey("crc");
		sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("crc", "MsgCRC");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public RoadSideAlert decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[11];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		RoadSideAlert.__Tag t_tag0 = RoadSideAlert.__Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = RoadSideAlert.__Tag._null_;
		switch (t_tag0) {
		    case __msgID:
		    // Decode field 'msgID'
		    try {
			String content1 = coder.decodeString(source);
			int idx1;
			DSRCmsgID temp1;

			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			idx1 = coder.resolveName(DSRCmsgID.cConstantNameList, content1);
			if (idx1 < 0 )
			    temp1 = DSRCmsgID.unknownEnumerator();
			else
			    temp1 = DSRCmsgID.cNamedNumbers[idx1];
			this.msgID = temp1;
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("msgID", "DSRCmsgID");
			throw de;
		    }
		    break;
		    case __msgCnt:
		    // Decode field 'msgCnt'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.msgCnt == null)
			    this.msgCnt = new MsgCount();
			this.msgCnt.setValue(coder.decodeInteger(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("msgCnt", "MsgCount");
			throw de;
		    }
		    break;
		    case __typeEvent:
		    // Decode field 'typeEvent'
		    try {
			if (present0[2])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.typeEvent == null)
			    this.typeEvent = new com.bah.ode.asn.oss.itis.ITIScodes();
			this.typeEvent.setValue(coder.decodeInteger(source));
			present0[2] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("typeEvent", "ITIScodes");
			throw de;
		    }
		    break;
		    case __description:
		    // Decode field 'description'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.description == null)
				this.description = new Description();
			    this.description.decodeValue(coder, source);
			    present0[3] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("description", "SEQUENCE OF");
			throw de;
		    }
		    break;
		    case __priority:
		    // Decode field 'priority'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[4])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.priority = new Priority(coder.decodeOctetString(source));
			    present0[4] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("priority", "Priority");
			throw de;
		    }
		    break;
		    case __heading:
		    // Decode field 'heading'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[5])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.heading = new HeadingSlice(coder.decodeOctetString(source));
			    present0[5] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("heading", "HeadingSlice");
			throw de;
		    }
		    break;
		    case __extent:
		    // Decode field 'extent'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    Extent temp1;

			    if (present0[6])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(Extent.cConstantNameList, content1);
			    if (idx1 < 0 )
				throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			    else
				temp1 = Extent.cNamedNumbers[idx1];
			    this.extent = temp1;
			    present0[6] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("extent", "Extent");
			throw de;
		    }
		    break;
		    case __positon:
		    // Decode field 'positon'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[7])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.positon == null)
				this.positon = new FullPositionVector();
			    this.positon.decodeValue(coder, source);
			    present0[7] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("positon", "FullPositionVector");
			throw de;
		    }
		    break;
		    case __furtherInfoID:
		    // Decode field 'furtherInfoID'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[8])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.furtherInfoID = new FurtherInfoID(coder.decodeOctetString(source));
			    present0[8] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("furtherInfoID", "FurtherInfoID");
			throw de;
		    }
		    break;
		    case __crc:
		    // Decode field 'crc'
		    try {
			if (present0[9])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			this.crc = new MsgCRC(coder.decodeOctetString(source));
			present0[9] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("crc", "MsgCRC");
			throw de;
		    }
		    break;
		    default:
			throw new DecoderException(ExceptionDescriptor._unknown_field, ": '" + tag0 + "'");
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'msgID'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'msgCnt'");
	if (!present0[2])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'typeEvent'");
	if (!present0[3])
	    this.description = null;
	if (!present0[4])
	    this.priority = null;
	if (!present0[5])
	    this.heading = null;
	if (!present0[6])
	    this.extent = null;
	if (!present0[7])
	    this.positon = null;
	if (!present0[8])
	    this.furtherInfoID = null;
	if (!present0[9])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'crc'");
	return this;
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((RoadSideAlert)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((RoadSideAlert)that);
    }
    
    public boolean equalTo(RoadSideAlert that) {
	if (!this.msgID.equalTo(that.msgID))
	    return false;
	if (!this.msgCnt.equalTo(that.msgCnt))
	    return false;
	if (!this.typeEvent.equalTo(that.typeEvent))
	    return false;
	if (this.description != null && that.description != null) {
	    if (!this.description.equalTo(that.description))
		return false;
	}
	if (this.priority != null && that.priority != null) {
	    if (!this.priority.equalTo(that.priority))
		return false;
	}
	if (this.heading != null && that.heading != null) {
	    if (!this.heading.equalTo(that.heading))
		return false;
	}
	if (this.extent != null && that.extent != null) {
	    if (!this.extent.equalTo(that.extent))
		return false;
	}
	if (this.positon != null && that.positon != null) {
	    if (!this.positon.equalTo(that.positon))
		return false;
	}
	if (this.furtherInfoID != null && that.furtherInfoID != null) {
	    if (!this.furtherInfoID.equalTo(that.furtherInfoID))
		return false;
	}
	if (!this.crc.equalTo(that.crc))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public RoadSideAlert clone() {
	RoadSideAlert copy = (RoadSideAlert)super.clone();
	copy.msgID = msgID.clone();
	copy.msgCnt = msgCnt.clone();
	copy.typeEvent = typeEvent.clone();
	if (description != null) {
	    copy.description = description.clone();
	}
	if (priority != null) {
	    copy.priority = priority.clone();
	}
	if (heading != null) {
	    copy.heading = heading.clone();
	}
	if (extent != null) {
	    copy.extent = extent.clone();
	}
	if (positon != null) {
	    copy.positon = positon.clone();
	}
	if (furtherInfoID != null) {
	    copy.furtherInfoID = furtherInfoID.clone();
	}
	copy.crc = crc.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.msgID != null ? this.msgID.hashCode() : 0);
	hash = 41 * hash + (this.msgCnt != null ? this.msgCnt.hashCode() : 0);
	hash = 41 * hash + (this.typeEvent != null ? this.typeEvent.hashCode() : 0);
	hash = 41 * hash + (this.description != null ? this.description.hashCode() : 0);
	hash = 41 * hash + (this.priority != null ? this.priority.hashCode() : 0);
	hash = 41 * hash + (this.heading != null ? this.heading.hashCode() : 0);
	hash = 41 * hash + (this.extent != null ? this.extent.hashCode() : 0);
	hash = 41 * hash + (this.positon != null ? this.positon.hashCode() : 0);
	hash = 41 * hash + (this.furtherInfoID != null ? this.furtherInfoID.hashCode() : 0);
	hash = 41 * hash + (this.crc != null ? this.crc.hashCode() : 0);
	return hash;
    }
} // End class definition for RoadSideAlert
