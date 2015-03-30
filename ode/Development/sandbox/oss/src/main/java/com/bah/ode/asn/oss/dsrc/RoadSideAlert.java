/*************************************************************/
/* Copyright (C) 2015 OSS Nokalva, Inc.  All rights reserved.*/
/*************************************************************/

/* THIS FILE IS PROPRIETARY MATERIAL OF OSS NOKALVA, INC.
 * AND MAY BE USED ONLY BY DIRECT LICENSEES OF OSS NOKALVA, INC.
 * THIS FILE MAY NOT BE DISTRIBUTED.
 * THIS COPYRIGHT STATEMENT MAY NOT BE REMOVED. */

/* Generated for: Booz Allen Hamilton (Trial), License 70234Z. */
/* Abstract syntax: semi_asn */
/* ASN.1 Java project: com.bah.ode.asn.oss.Oss */
/* Created: Tue Mar 24 11:33:39 2015 */
/* ASN.1 Compiler for Java version: 6.1 */
/* ASN.1 compiler options and file names specified:
 * -toed -output com.bah.ode.asn.oss -per -uper -ber -der -root -messageFormat
 * msvc C:/Users/572682/Projects/ODE/Trials/ASN.1/DSRC_R36_Source.asn
 * C:/Users/572682/Projects/ODE/Trials/ASN.1/SEMI_ASN.1_Structures_2.2.asn
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
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, RoadSideAlert data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	boolean has_description0 = data.description != null;
	boolean has_priority0 = data.priority != null;
	boolean has_heading0 = data.heading != null;
	boolean has_extent0 = data.extent != null;
	boolean has_positon0 = data.positon != null;
	boolean has_furtherInfoID0 = data.furtherInfoID != null;
	sink.writeBit(has_description0); ++nbits;
	sink.writeBit(has_priority0); ++nbits;
	sink.writeBit(has_heading0); ++nbits;
	sink.writeBit(has_extent0); ++nbits;
	sink.writeBit(has_positon0); ++nbits;
	sink.writeBit(has_furtherInfoID0); ++nbits;
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
	if (has_description0) {
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
	if (has_priority0) {
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
	if (has_heading0) {
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
	if (has_extent0) {
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
	if (has_positon0) {
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
	if (has_furtherInfoID0) {
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
		Description.decodeValue(coder, source, data.description);
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
		FullPositionVector.decodeValue(coder, source, data.positon);
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

} // End class definition for RoadSideAlert
