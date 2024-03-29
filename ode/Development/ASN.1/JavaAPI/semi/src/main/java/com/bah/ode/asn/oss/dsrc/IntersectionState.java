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
 * Define the ASN1 Type IntersectionState from ASN1 Module DSRC.
 * @see Sequence
 */

public class IntersectionState extends Sequence {
    public DescriptiveName name;
    public IntersectionID id;
    public IntersectionStatusObject status;
    public TimeMark timeStamp;
    public INTEGER lanesCnt;
    public States states;
    public SignalState priority;
    public SignalState preempt;
    
    /**
     * The default constructor.
     */
    public IntersectionState()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public IntersectionState(DescriptiveName name, IntersectionID id, 
		    IntersectionStatusObject status, TimeMark timeStamp, 
		    INTEGER lanesCnt, States states, SignalState priority, 
		    SignalState preempt)
    {
	setName(name);
	setId(id);
	setStatus(status);
	setTimeStamp(timeStamp);
	setLanesCnt(lanesCnt);
	setStates(states);
	setPriority(priority);
	setPreempt(preempt);
    }
    
    /**
     * Construct with components.
     */
    public IntersectionState(DescriptiveName name, IntersectionID id, 
		    IntersectionStatusObject status, TimeMark timeStamp, 
		    long lanesCnt, States states, SignalState priority, 
		    SignalState preempt)
    {
	this(name, id, status, timeStamp, new INTEGER(lanesCnt), states, 
	     priority, preempt);
    }
    
    /**
     * Construct with required components.
     */
    public IntersectionState(IntersectionID id, 
		    IntersectionStatusObject status, States states)
    {
	setId(id);
	setStatus(status);
	setStates(states);
    }
    
    
    // Methods for field "name"
    public DescriptiveName getName()
    {
	return this.name;
    }
    
    public void setName(DescriptiveName name)
    {
	this.name = name;
    }
    
    public boolean hasName()
    {
	return (name != null);
    }
    
    public void deleteName()
    {
	name = null;
    }
    
    
    // Methods for field "id"
    public IntersectionID getId()
    {
	return this.id;
    }
    
    public void setId(IntersectionID id)
    {
	this.id = id;
    }
    
    
    // Methods for field "status"
    public IntersectionStatusObject getStatus()
    {
	return this.status;
    }
    
    public void setStatus(IntersectionStatusObject status)
    {
	this.status = status;
    }
    
    
    // Methods for field "timeStamp"
    public TimeMark getTimeStamp()
    {
	return this.timeStamp;
    }
    
    public void setTimeStamp(TimeMark timeStamp)
    {
	this.timeStamp = timeStamp;
    }
    
    public boolean hasTimeStamp()
    {
	return (timeStamp != null);
    }
    
    public void deleteTimeStamp()
    {
	timeStamp = null;
    }
    
    
    // Methods for field "lanesCnt"
    public long getLanesCnt()
    {
	return (this.lanesCnt).longValue();
    }
    
    public void setLanesCnt(long lanesCnt)
    {
	setLanesCnt(new INTEGER(lanesCnt));
    }
    
    public void setLanesCnt(INTEGER lanesCnt)
    {
	this.lanesCnt = lanesCnt;
    }
    
    public boolean hasLanesCnt()
    {
	return (lanesCnt != null);
    }
    
    public void deleteLanesCnt()
    {
	lanesCnt = null;
    }
    
    
    // Methods for field "states"
    public States getStates()
    {
	return this.states;
    }
    
    public void setStates(States states)
    {
	this.states = states;
    }
    
    
    
    /**
     * Define the ASN1 Type States from ASN1 Module DSRC.
     * @see SequenceOf
     */
    public static class States extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public States()
	{
	    this.elements = new java.util.ArrayList<MovementState>();
	}
	
	
	/**
	 * Construct from an array of components.
	 */
	public java.util.ArrayList<MovementState> elements;

	public States(MovementState[] elements)
	{
	    this.elements = new java.util.ArrayList<MovementState>(java.util.Arrays.asList(elements));
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(MovementState element)
	{
	    elements.add(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(MovementState element, int atIndex)
	{
	    elements.set(atIndex, element);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized MovementState get(int atIndex)
	{
	    return (MovementState)elements.get(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(MovementState element, int atIndex)
	{
	    elements.add(atIndex, element);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(MovementState element)
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
	public static int encodeValue(PerCoder coder, OutputBitStream sink, States data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int total_len0 = data.elements.size();
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;
	    int nbits = 0;

	    if (total_len0 < 1 || total_len0 > 255)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + total_len0);
	    nbits += coder.encodeLengthDeterminant(total_len0, 1, 255, sink);
	    moreFragments0 = coder.moreFragments();
	    fragmentLength0 = (moreFragments0 ? coder.fragmentLength() : total_len0);
	    while (total_len0 > 0) {
		try {
		    MovementState item1 = data.elements.get(idx0);

		    nbits += MovementState.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "MovementState", idx0);
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
	public static States decodeValue(PerCoder coder, InputBitStream source, States data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    int total_len0 = 0;
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;

	    idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, 1, 255);
	    if (fragmentLength0 > 255)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + fragmentLength0);
	    moreFragments0 = coder.moreFragments();
	    if (data.elements != null)
		data.elements.clear();
	    else
		data.elements = new java.util.ArrayList<MovementState>(fragmentLength0);
	    while (idx0 > 0) {
		try {
		    MovementState item1 = new MovementState();

		    data.elements.add(item1);
		    item1.decodeValue(coder, source, item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "MovementState", total_len0);
		    throw de;
		}
		--idx0; ++total_len0;
		if (idx0 == 0) {
		    if (moreFragments0) {
			idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, fragmentLength0);
			moreFragments0 = coder.moreFragments();
			if ((total_len0 + fragmentLength0) > 255)
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
			MovementState item1 = this.elements.get(idx0);

			item1.encodeValue(coder, sink);
		    
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "MovementState", idx0);
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
	public States decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	int total_len0 = 0;
	int idx0 = 0;

	if (this.elements != null)
	    this.elements.clear();
	else
	    this.elements = new java.util.ArrayList<MovementState>(total_len0);
	coder.decodeArray(source);
	if (coder.hasMoreElements(source, true))
	    do {
		try {
		    MovementState item1 = new MovementState();

		    this.elements.add(item1);
		    item1.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "MovementState", idx0);
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
	    return equalTo((States)that);
	}
	
	public boolean equalTo(SequenceOf that)
	{
	    return equalTo((States)that);
	}
	
	public boolean equalTo(States that) {
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
	public States clone() {
	    States copy = (States)super.clone();
	    copy.elements = new java.util.ArrayList<MovementState>(elements.size());
	    for (MovementState element : elements) {
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
    } // End class definition for States

    // Methods for field "priority"
    public SignalState getPriority()
    {
	return this.priority;
    }
    
    public void setPriority(SignalState priority)
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
    
    
    // Methods for field "preempt"
    public SignalState getPreempt()
    {
	return this.preempt;
    }
    
    public void setPreempt(SignalState preempt)
    {
	this.preempt = preempt;
    }
    
    public boolean hasPreempt()
    {
	return (preempt != null);
    }
    
    public void deletePreempt()
    {
	preempt = null;
    }
    
    
    /**
     * Effective permitted alphabet (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public static final EPAInfo _cEPAInfo_name = 
	com.bah.ode.asn.oss.dsrc.DescriptiveName._cEPAInfo_;
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     */
    public static enum __Tag
    {
	__name("name"),
	__id("id"),
	__status("status"),
	__timeStamp("timeStamp"),
	__lanesCnt("lanesCnt"),
	__states("states"),
	__priority("priority"),
	__preempt("preempt"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(9);
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
	IntersectionState temp0 = this;

	if (temp0.preempt != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.preempt.byteArrayValue()), 0x87);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("preempt", "SignalState");
		throw ee;
	    }
	}
	if (temp0.priority != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.priority.byteArrayValue()), 0x86);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("priority", "SignalState");
		throw ee;
	    }
	}
	try {
	    int len1 = 0;
	    java.util.ArrayList<MovementState> temp1 = temp0.states.elements;
	    int idx1 = temp1 != null ? temp1.size() : 0;

	    try {
		while(idx1-- > 0) {
		    len1 += sink.encodeLengthTag(temp1.get(idx1).encodeValue(coder, sink), 0x30);
		}
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext(null, "SEQUENCE OF", idx1);
		throw ee;
	    }
	    len0 += sink.encodeLengthTag(len1, 0xA5);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("states", "SEQUENCE OF");
	    throw ee;
	}
	if (temp0.lanesCnt != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.lanesCnt, sink), 0x84);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("lanesCnt", "INTEGER");
		throw ee;
	    }
	}
	if (temp0.timeStamp != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.timeStamp, sink), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("timeStamp", "TimeMark");
		throw ee;
	    }
	}
	try {
	    len0 += sink.encodeLengthTag(sink.write(temp0.status.byteArrayValue()), 0x82);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("status", "IntersectionStatusObject");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(sink.write(temp0.id.byteArrayValue()), 0x81);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("id", "IntersectionID");
	    throw ee;
	}
	if (temp0.name != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeString1(temp0.name, sink), 0x80);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("name", "DescriptiveName");
		throw ee;
	    }
	}

	return len0;
    }

    /**
     * Implements BER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public IntersectionState decodeValue(BerCoder coder, DecoderInput source)
	    throws DecoderException
    {
	int total_len0 = source.mLength;
	int end_pos0 = (total_len0 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len0);
	int tag;

	do {
	    tag = source.decodeTagLength();
	    if (tag == 0x80 || tag == 0xA0) {
		try {
		    this.name = new DescriptiveName(coder.decodeChars(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("name", "DescriptiveName");
		    throw ee;
		}
		tag = source.decodeTagLength();
	    }
	    if (tag != 0x81 && tag != 0xA1)
		source.raiseTagMismatchException(tag);
	    try {
		this.id = new IntersectionID(coder.decodeOctetString(source));
	    } catch (Exception e) {
		DecoderException ee = DecoderException.wrapException(e);
		ee.appendFieldContext("id", "IntersectionID");
		throw ee;
	    }
	    tag = source.decodeTagLength();
	    if (tag != 0x82 && tag != 0xA2)
		source.raiseTagMismatchException(tag);
	    try {
		this.status = new IntersectionStatusObject(coder.decodeOctetString(source));
	    } catch (Exception e) {
		DecoderException ee = DecoderException.wrapException(e);
		ee.appendFieldContext("status", "IntersectionStatusObject");
		throw ee;
	    }
	    tag = source.decodeTagLength();
	    if (tag == 0x83) {
		try {
		    this.timeStamp = new TimeMark(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("timeStamp", "TimeMark");
		    throw ee;
		}
		tag = source.decodeTagLength();
	    }
	    if (tag == 0x84) {
		try {
		    this.lanesCnt = new INTEGER(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("lanesCnt", "INTEGER");
		    throw ee;
		}
		tag = source.decodeTagLength();
	    }
	    if (tag != 0xA5)
		source.raiseTagMismatchException(tag);
	    try {
		this.states = new States();
		{
		    int total_len1 = source.mLength;
		    int end_pos1 = (total_len1 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len1);
		    int idx1 = 0;

		    this.states.elements = new java.util.ArrayList<MovementState>();

		    try {
			for (;;) {
			    if (source.position() >= end_pos1) {
				if (source.position() > end_pos1)
				    throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
				break;
			    }
			    tag = source.decodeTagLength();
			    if (tag == 0) {
				if (total_len1 < 0) {
				    if (source.mLength != 0)
					throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);
				    break;
				}
				if (source.mLength == 0)
				    throw new DecoderException(ExceptionDescriptor._expect_tag, null);
			    }
			    MovementState temp1 = new MovementState();
			    this.states.add(temp1);
			    if (tag != 0x30)
				source.raiseTagMismatchException(tag);
			    temp1.decodeValue(coder, source);
			    ++idx1;
			}
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendElementContext(null, "SEQUENCE OF", idx1);
			throw ee;
		    }
		}
	    } catch (Exception e) {
		DecoderException ee = DecoderException.wrapException(e);
		ee.appendFieldContext("states", "SEQUENCE OF");
		throw ee;
	    }
	    if (source.position() >= end_pos0)
		break;
	    tag = source.decodeTagLength();
	    if (tag == 0)
		break;
	    if (tag == 0x86 || tag == 0xA6) {
		try {
		    this.priority = new SignalState(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("priority", "SignalState");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x87 || tag == 0xA7) {
		try {
		    this.preempt = new SignalState(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("preempt", "SignalState");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    for (;;) {
		try {
		    coder.skipContents(source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendExtensionContext("IntersectionState", -1);
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
	IntersectionState temp0 = this;

	if (temp0.preempt != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.preempt.byteArrayValue()), 0x87);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("preempt", "SignalState");
		throw ee;
	    }
	}
	if (temp0.priority != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.priority.byteArrayValue()), 0x86);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("priority", "SignalState");
		throw ee;
	    }
	}
	try {
	    int len1 = 0;
	    java.util.ArrayList<MovementState> temp1 = temp0.states.elements;
	    int idx1 = temp1 != null ? temp1.size() : 0;

	    try {
		while(idx1-- > 0) {
		    len1 += sink.encodeLengthTag(temp1.get(idx1).encodeValue(coder, sink), 0x30);
		}
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext(null, "SEQUENCE OF", idx1);
		throw ee;
	    }
	    len0 += sink.encodeLengthTag(len1, 0xA5);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("states", "SEQUENCE OF");
	    throw ee;
	}
	if (temp0.lanesCnt != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.lanesCnt, sink), 0x84);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("lanesCnt", "INTEGER");
		throw ee;
	    }
	}
	if (temp0.timeStamp != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.timeStamp, sink), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("timeStamp", "TimeMark");
		throw ee;
	    }
	}
	try {
	    len0 += sink.encodeLengthTag(sink.write(temp0.status.byteArrayValue()), 0x82);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("status", "IntersectionStatusObject");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(sink.write(temp0.id.byteArrayValue()), 0x81);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("id", "IntersectionID");
	    throw ee;
	}
	if (temp0.name != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeString1(temp0.name, sink), 0x80);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("name", "DescriptiveName");
		throw ee;
	    }
	}

	return len0;
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, IntersectionState data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.name != null);
	sink.writeBit(data.timeStamp != null);
	sink.writeBit(data.lanesCnt != null);
	sink.writeBit(data.priority != null);
	sink.writeBit(data.preempt != null);
	nbits += 6;
	if (data.name != null) {
	    // Encode field 'name'
	    try {
		DescriptiveName item1 = data.name;
		int len1 = item1.getSize();

		if (len1 < 1 || len1 > 63)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerKMCString.encode(coder, item1.stringValue(), 1, 63, IntersectionState._cEPAInfo_name, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("name", "DescriptiveName");
		throw ee;
	    }
	}
	// Encode field 'id'
	try {
	    IntersectionID item1 = data.id;
	    int len1 = item1.getSize();

	    if (len1 < 2 || len1 > 4)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 2, 4, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("id", "IntersectionID");
	    throw ee;
	}
	// Encode field 'status'
	try {
	    IntersectionStatusObject item1 = data.status;
	    int len1 = item1.getSize();

	    if (len1 != 1)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 1, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("status", "IntersectionStatusObject");
	    throw ee;
	}
	if (data.timeStamp != null) {
	    // Encode field 'timeStamp'
	    try {
		TimeMark item1 = data.timeStamp;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 12002)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 12002, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("timeStamp", "TimeMark");
		throw ee;
	    }
	}
	if (data.lanesCnt != null) {
	    // Encode field 'lanesCnt'
	    try {
		INTEGER item1 = data.lanesCnt;
		long temp1 = item1.longValue();

		if (temp1 < 1 || temp1 > 255)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 1, 255, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("lanesCnt", "INTEGER");
		throw ee;
	    }
	}
	// Encode field 'states'
	try {
	    States item1 = data.states;

	    nbits += States.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("states", "SEQUENCE OF");
	    throw ee;
	}
	if (data.priority != null) {
	    // Encode field 'priority'
	    try {
		SignalState item1 = data.priority;
		int len1 = item1.getSize();

		if (len1 != 1)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 1, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("priority", "SignalState");
		throw ee;
	    }
	}
	if (data.preempt != null) {
	    // Encode field 'preempt'
	    try {
		SignalState item1 = data.preempt;
		int len1 = item1.getSize();

		if (len1 != 1)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 1, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("preempt", "SignalState");
		throw ee;
	    }
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static IntersectionState decodeValue(PerCoder coder, InputBitStream source, IntersectionState data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_name0 = source.readBit();
	boolean has_timeStamp0 = source.readBit();
	boolean has_lanesCnt0 = source.readBit();
	boolean has_priority0 = source.readBit();
	boolean has_preempt0 = source.readBit();
    /** Decode root fields **/
	if (has_name0) {
	    // Decode field 'name'
	    try {
		data.name = new DescriptiveName(com.oss.coders.per.PerKMCString.decode(coder, source, 1, 63, IntersectionState._cEPAInfo_name));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("name", "DescriptiveName");
		throw de;
	    }
	} else {
	    data.name = null;
	}
	// Decode field 'id'
	try {
	    data.id = new IntersectionID(com.oss.coders.per.PerOctets.decode(coder, source, 2, 4));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("id", "IntersectionID");
	    throw de;
	}
	// Decode field 'status'
	try {
	    data.status = new IntersectionStatusObject(com.oss.coders.per.PerOctets.decode(coder, source, 1, 1));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("status", "IntersectionStatusObject");
	    throw de;
	}
	if (has_timeStamp0) {
	    // Decode field 'timeStamp'
	    try {
		long temp1;

		if (data.timeStamp == null)
		    data.timeStamp = new TimeMark();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 12002);
		if (temp1 > 12002)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.timeStamp.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("timeStamp", "TimeMark");
		throw de;
	    }
	} else {
	    data.timeStamp = null;
	}
	if (has_lanesCnt0) {
	    // Decode field 'lanesCnt'
	    try {
		long temp1;

		if (data.lanesCnt == null)
		    data.lanesCnt = new INTEGER();
		temp1 = coder.decodeConstrainedWholeNumber(source, 1, 255);
		if (temp1 > 255)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.lanesCnt.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("lanesCnt", "INTEGER");
		throw de;
	    }
	} else {
	    data.lanesCnt = null;
	}
	// Decode field 'states'
	try {
	    if (data.states == null)
		data.states = new States();
	    data.states.decodeValue(coder, source, data.states);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("states", "SEQUENCE OF");
	    throw de;
	}
	if (has_priority0) {
	    // Decode field 'priority'
	    try {
		data.priority = new SignalState(com.oss.coders.per.PerOctets.decode(coder, source, 1, 1));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("priority", "SignalState");
		throw de;
	    }
	} else {
	    data.priority = null;
	}
	if (has_preempt0) {
	    // Decode field 'preempt'
	    try {
		data.preempt = new SignalState(com.oss.coders.per.PerOctets.decode(coder, source, 1, 1));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("preempt", "SignalState");
		throw de;
	    }
	} else {
	    data.preempt = null;
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
	String separator0 = null;

	sink.beginObject();
	// Encode field 'name'
	try {
	    DescriptiveName item1 = this.name;

	    if (item1 != null) {
		{
		    separator0 = ",";
		    sink.encodeKey("name");
		    coder.encodeString(item1.stringValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "name");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("name", "DescriptiveName");
	    throw ee;
	}
	// Encode field 'id'
	try {
	    IntersectionID item1 = this.id;

	    {
		sink.writeSeparator(separator0);
		sink.encodeKey("id");
		sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("id", "IntersectionID");
	    throw ee;
	}
	// Encode field 'status'
	try {
	    IntersectionStatusObject item1 = this.status;

	    {
		sink.writeSeparator();
		sink.encodeKey("status");
		sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("status", "IntersectionStatusObject");
	    throw ee;
	}
	// Encode field 'timeStamp'
	try {
	    TimeMark item1 = this.timeStamp;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("timeStamp");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "timeStamp");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("timeStamp", "TimeMark");
	    throw ee;
	}
	// Encode field 'lanesCnt'
	try {
	    INTEGER item1 = this.lanesCnt;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("lanesCnt");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "lanesCnt");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("lanesCnt", "INTEGER");
	    throw ee;
	}
	// Encode field 'states'
	try {
	    States item1 = this.states;

	    {
		sink.writeSeparator();
		sink.encodeKey("states");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("states", "SEQUENCE OF");
	    throw ee;
	}
	// Encode field 'priority'
	try {
	    SignalState item1 = this.priority;

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
	    ee.appendFieldContext("priority", "SignalState");
	    throw ee;
	}
	// Encode field 'preempt'
	try {
	    SignalState item1 = this.preempt;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("preempt");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "preempt");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("preempt", "SignalState");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public IntersectionState decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[9];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		IntersectionState.__Tag t_tag0 = IntersectionState.__Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = IntersectionState.__Tag._null_;
		switch (t_tag0) {
		    case __name:
		    // Decode field 'name'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[0])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.name = new DescriptiveName(coder.decodeString(source));
			    present0[0] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("name", "DescriptiveName");
			throw de;
		    }
		    break;
		    case __id:
		    // Decode field 'id'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			this.id = new IntersectionID(coder.decodeOctetString(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("id", "IntersectionID");
			throw de;
		    }
		    break;
		    case __status:
		    // Decode field 'status'
		    try {
			if (present0[2])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			this.status = new IntersectionStatusObject(coder.decodeOctetString(source));
			present0[2] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("status", "IntersectionStatusObject");
			throw de;
		    }
		    break;
		    case __timeStamp:
		    // Decode field 'timeStamp'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.timeStamp == null)
				this.timeStamp = new TimeMark();
			    this.timeStamp.setValue(coder.decodeInteger(source));
			    present0[3] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("timeStamp", "TimeMark");
			throw de;
		    }
		    break;
		    case __lanesCnt:
		    // Decode field 'lanesCnt'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[4])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.lanesCnt == null)
				this.lanesCnt = new INTEGER();
			    this.lanesCnt.setValue(coder.decodeInteger(source));
			    present0[4] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("lanesCnt", "INTEGER");
			throw de;
		    }
		    break;
		    case __states:
		    // Decode field 'states'
		    try {
			if (present0[5])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.states == null)
			    this.states = new States();
			this.states.decodeValue(coder, source);
			present0[5] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("states", "SEQUENCE OF");
			throw de;
		    }
		    break;
		    case __priority:
		    // Decode field 'priority'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[6])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.priority = new SignalState(coder.decodeOctetString(source));
			    present0[6] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("priority", "SignalState");
			throw de;
		    }
		    break;
		    case __preempt:
		    // Decode field 'preempt'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[7])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.preempt = new SignalState(coder.decodeOctetString(source));
			    present0[7] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("preempt", "SignalState");
			throw de;
		    }
		    break;
		    default:
			coder.skipValue(source);
			break;
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    this.name = null;
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'id'");
	if (!present0[2])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'status'");
	if (!present0[3])
	    this.timeStamp = null;
	if (!present0[4])
	    this.lanesCnt = null;
	if (!present0[5])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'states'");
	if (!present0[6])
	    this.priority = null;
	if (!present0[7])
	    this.preempt = null;
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
	if (this.name != null) {
	    try {
		comma0 = true;
		printer.newLine(writer);
		writer.print("name ");
		printer.print(this.name, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("id ");
	    printer.print(this.id, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("status ");
	    printer.print(this.status, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.timeStamp != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("timeStamp ");
		writer.print(this.timeStamp.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.lanesCnt != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("lanesCnt ");
		writer.print(this.lanesCnt.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("states ");
	    {
		java.util.ArrayList<MovementState> temp1 = this.states.elements;
		int len1 = temp1 != null ? temp1.size() : 0;
		int idx1 = 0;

		try {
		    writer.print('{');
		    printer.indent();
		    for (idx1 = 0; idx1 < len1; idx1++){
			if (idx1 > 0)
			    writer.print(',');
			printer.newLine(writer);
			temp1.get(idx1).printValue(printer, writer);
		    }
		    printer.undent();
		    if (len1 > 0)
			printer.newLine(writer);
		    writer.print('}');
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
	    }
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.priority != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("priority ");
		printer.print(this.priority, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.preempt != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("preempt ");
		printer.print(this.preempt, writer);
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
	return equalTo((IntersectionState)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((IntersectionState)that);
    }
    
    public boolean equalTo(IntersectionState that) {
	if (this.name != null && that.name != null) {
	    if (!this.name.equalTo(that.name))
		return false;
	}
	if (!this.id.equalTo(that.id))
	    return false;
	if (!this.status.equalTo(that.status))
	    return false;
	if (this.timeStamp != null && that.timeStamp != null) {
	    if (!this.timeStamp.equalTo(that.timeStamp))
		return false;
	}
	if (this.lanesCnt != null && that.lanesCnt != null) {
	    if (!this.lanesCnt.equalTo(that.lanesCnt))
		return false;
	}
	if (!this.states.equalTo(that.states))
	    return false;
	if (this.priority != null && that.priority != null) {
	    if (!this.priority.equalTo(that.priority))
		return false;
	}
	if (this.preempt != null && that.preempt != null) {
	    if (!this.preempt.equalTo(that.preempt))
		return false;
	}
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public IntersectionState clone() {
	IntersectionState copy = (IntersectionState)super.clone();
	if (name != null) {
	    copy.name = name.clone();
	}
	copy.id = id.clone();
	copy.status = status.clone();
	if (timeStamp != null) {
	    copy.timeStamp = timeStamp.clone();
	}
	if (lanesCnt != null) {
	    copy.lanesCnt = lanesCnt.clone();
	}
	copy.states = states.clone();
	if (priority != null) {
	    copy.priority = priority.clone();
	}
	if (preempt != null) {
	    copy.preempt = preempt.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.name != null ? this.name.hashCode() : 0);
	hash = 41 * hash + (this.id != null ? this.id.hashCode() : 0);
	hash = 41 * hash + (this.status != null ? this.status.hashCode() : 0);
	hash = 41 * hash + (this.timeStamp != null ? this.timeStamp.hashCode() : 0);
	hash = 41 * hash + (this.lanesCnt != null ? this.lanesCnt.hashCode() : 0);
	hash = 41 * hash + (this.states != null ? this.states.hashCode() : 0);
	hash = 41 * hash + (this.priority != null ? this.priority.hashCode() : 0);
	hash = 41 * hash + (this.preempt != null ? this.preempt.hashCode() : 0);
	return hash;
    }
} // End class definition for IntersectionState
