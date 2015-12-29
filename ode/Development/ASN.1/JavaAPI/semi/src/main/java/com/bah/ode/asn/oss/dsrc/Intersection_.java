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
 * Define the ASN1 Type Intersection_ from ASN1 Module DSRC.
 * @see Sequence
 */

public class Intersection_ extends Sequence {
    public DescriptiveName name;
    public IntersectionID id;
    public Position3D refPoint;
    public IntersectionID refInterNum;
    public Heading orientation;
    public LaneWidth laneWidth;
    public IntersectionStatusObject type;
    public Approaches approaches;
    public PreemptZones preemptZones;
    public PriorityZones priorityZones;
    
    /**
     * The default constructor.
     */
    public Intersection_()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Intersection_(DescriptiveName name, IntersectionID id, 
		    Position3D refPoint, IntersectionID refInterNum, 
		    Heading orientation, LaneWidth laneWidth, 
		    IntersectionStatusObject type, Approaches approaches, 
		    PreemptZones preemptZones, PriorityZones priorityZones)
    {
	setName(name);
	setId(id);
	setRefPoint(refPoint);
	setRefInterNum(refInterNum);
	setOrientation(orientation);
	setLaneWidth(laneWidth);
	setType(type);
	setApproaches(approaches);
	setPreemptZones(preemptZones);
	setPriorityZones(priorityZones);
    }
    
    /**
     * Construct with required components.
     */
    public Intersection_(IntersectionID id, Approaches approaches)
    {
	setId(id);
	setApproaches(approaches);
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
    
    
    // Methods for field "refPoint"
    public Position3D getRefPoint()
    {
	return this.refPoint;
    }
    
    public void setRefPoint(Position3D refPoint)
    {
	this.refPoint = refPoint;
    }
    
    public boolean hasRefPoint()
    {
	return (refPoint != null);
    }
    
    public void deleteRefPoint()
    {
	refPoint = null;
    }
    
    
    // Methods for field "refInterNum"
    public IntersectionID getRefInterNum()
    {
	return this.refInterNum;
    }
    
    public void setRefInterNum(IntersectionID refInterNum)
    {
	this.refInterNum = refInterNum;
    }
    
    public boolean hasRefInterNum()
    {
	return (refInterNum != null);
    }
    
    public void deleteRefInterNum()
    {
	refInterNum = null;
    }
    
    
    // Methods for field "orientation"
    public Heading getOrientation()
    {
	return this.orientation;
    }
    
    public void setOrientation(Heading orientation)
    {
	this.orientation = orientation;
    }
    
    public boolean hasOrientation()
    {
	return (orientation != null);
    }
    
    public void deleteOrientation()
    {
	orientation = null;
    }
    
    
    // Methods for field "laneWidth"
    public LaneWidth getLaneWidth()
    {
	return this.laneWidth;
    }
    
    public void setLaneWidth(LaneWidth laneWidth)
    {
	this.laneWidth = laneWidth;
    }
    
    public boolean hasLaneWidth()
    {
	return (laneWidth != null);
    }
    
    public void deleteLaneWidth()
    {
	laneWidth = null;
    }
    
    
    // Methods for field "type"
    public IntersectionStatusObject getType()
    {
	return this.type;
    }
    
    public void setType(IntersectionStatusObject type)
    {
	this.type = type;
    }
    
    public boolean hasType()
    {
	return (type != null);
    }
    
    public void deleteType()
    {
	type = null;
    }
    
    
    // Methods for field "approaches"
    public Approaches getApproaches()
    {
	return this.approaches;
    }
    
    public void setApproaches(Approaches approaches)
    {
	this.approaches = approaches;
    }
    
    
    
    /**
     * Define the ASN1 Type Approaches from ASN1 Module DSRC.
     * @see SequenceOf
     */
    public static class Approaches extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public Approaches()
	{
	    this.elements = new java.util.ArrayList<ApproachObject>();
	}
	
	
	/**
	 * Construct from an array of components.
	 */
	public java.util.ArrayList<ApproachObject> elements;

	public Approaches(ApproachObject[] elements)
	{
	    this.elements = new java.util.ArrayList<ApproachObject>(java.util.Arrays.asList(elements));
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(ApproachObject element)
	{
	    elements.add(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(ApproachObject element, int atIndex)
	{
	    elements.set(atIndex, element);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized ApproachObject get(int atIndex)
	{
	    return (ApproachObject)elements.get(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(ApproachObject element, int atIndex)
	{
	    elements.add(atIndex, element);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(ApproachObject element)
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
	public static int encodeValue(PerCoder coder, OutputBitStream sink, Approaches data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int total_len0 = data.elements.size();
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;
	    int nbits = 0;

	    if (total_len0 < 1 || total_len0 > 32)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + total_len0);
	    nbits += coder.encodeLengthDeterminant(total_len0, 1, 32, sink);
	    moreFragments0 = coder.moreFragments();
	    fragmentLength0 = (moreFragments0 ? coder.fragmentLength() : total_len0);
	    while (total_len0 > 0) {
		try {
		    ApproachObject item1 = data.elements.get(idx0);

		    nbits += ApproachObject.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "ApproachObject", idx0);
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
	public static Approaches decodeValue(PerCoder coder, InputBitStream source, Approaches data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    int total_len0 = 0;
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;

	    idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, 1, 32);
	    if (fragmentLength0 > 32)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + fragmentLength0);
	    moreFragments0 = coder.moreFragments();
	    if (data.elements != null)
		data.elements.clear();
	    else
		data.elements = new java.util.ArrayList<ApproachObject>(fragmentLength0);
	    while (idx0 > 0) {
		try {
		    ApproachObject item1 = new ApproachObject();

		    data.elements.add(item1);
		    item1.decodeValue(coder, source, item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "ApproachObject", total_len0);
		    throw de;
		}
		--idx0; ++total_len0;
		if (idx0 == 0) {
		    if (moreFragments0) {
			idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, fragmentLength0);
			moreFragments0 = coder.moreFragments();
			if ((total_len0 + fragmentLength0) > 32)
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
			ApproachObject item1 = this.elements.get(idx0);

			item1.encodeValue(coder, sink);
		    
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "ApproachObject", idx0);
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
	public Approaches decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	int total_len0 = 0;
	int idx0 = 0;

	if (this.elements != null)
	    this.elements.clear();
	else
	    this.elements = new java.util.ArrayList<ApproachObject>(total_len0);
	coder.decodeArray(source);
	if (coder.hasMoreElements(source, true))
	    do {
		try {
		    ApproachObject item1 = new ApproachObject();

		    this.elements.add(item1);
		    item1.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "ApproachObject", idx0);
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
	    return equalTo((Approaches)that);
	}
	
	public boolean equalTo(SequenceOf that)
	{
	    return equalTo((Approaches)that);
	}
	
	public boolean equalTo(Approaches that) {
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
	public Approaches clone() {
	    Approaches copy = (Approaches)super.clone();
	    copy.elements = new java.util.ArrayList<ApproachObject>(elements.size());
	    for (ApproachObject element : elements) {
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
    } // End class definition for Approaches

    // Methods for field "preemptZones"
    public PreemptZones getPreemptZones()
    {
	return this.preemptZones;
    }
    
    public void setPreemptZones(PreemptZones preemptZones)
    {
	this.preemptZones = preemptZones;
    }
    
    public boolean hasPreemptZones()
    {
	return (preemptZones != null);
    }
    
    public void deletePreemptZones()
    {
	preemptZones = null;
    }
    
    
    
    /**
     * Define the ASN1 Type PreemptZones from ASN1 Module DSRC.
     * @see SequenceOf
     */
    public static class PreemptZones extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public PreemptZones()
	{
	    this.elements = new java.util.ArrayList<SignalControlZone>();
	}
	
	
	/**
	 * Construct from an array of components.
	 */
	public java.util.ArrayList<SignalControlZone> elements;

	public PreemptZones(SignalControlZone[] elements)
	{
	    this.elements = new java.util.ArrayList<SignalControlZone>(java.util.Arrays.asList(elements));
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(SignalControlZone element)
	{
	    elements.add(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(SignalControlZone element, int atIndex)
	{
	    elements.set(atIndex, element);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized SignalControlZone get(int atIndex)
	{
	    return (SignalControlZone)elements.get(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(SignalControlZone element, int atIndex)
	{
	    elements.add(atIndex, element);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(SignalControlZone element)
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
	public static int encodeValue(PerCoder coder, OutputBitStream sink, PreemptZones data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int total_len0 = data.elements.size();
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;
	    int nbits = 0;

	    if (total_len0 < 1 || total_len0 > 32)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + total_len0);
	    nbits += coder.encodeLengthDeterminant(total_len0, 1, 32, sink);
	    moreFragments0 = coder.moreFragments();
	    fragmentLength0 = (moreFragments0 ? coder.fragmentLength() : total_len0);
	    while (total_len0 > 0) {
		try {
		    SignalControlZone item1 = data.elements.get(idx0);

		    nbits += SignalControlZone.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "SignalControlZone", idx0);
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
	public static PreemptZones decodeValue(PerCoder coder, InputBitStream source, PreemptZones data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    int total_len0 = 0;
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;

	    idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, 1, 32);
	    if (fragmentLength0 > 32)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + fragmentLength0);
	    moreFragments0 = coder.moreFragments();
	    if (data.elements != null)
		data.elements.clear();
	    else
		data.elements = new java.util.ArrayList<SignalControlZone>(fragmentLength0);
	    while (idx0 > 0) {
		try {
		    SignalControlZone item1 = new SignalControlZone();

		    data.elements.add(item1);
		    item1.decodeValue(coder, source, item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "SignalControlZone", total_len0);
		    throw de;
		}
		--idx0; ++total_len0;
		if (idx0 == 0) {
		    if (moreFragments0) {
			idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, fragmentLength0);
			moreFragments0 = coder.moreFragments();
			if ((total_len0 + fragmentLength0) > 32)
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
			SignalControlZone item1 = this.elements.get(idx0);

			item1.encodeValue(coder, sink);
		    
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "SignalControlZone", idx0);
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
	public PreemptZones decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	int total_len0 = 0;
	int idx0 = 0;

	if (this.elements != null)
	    this.elements.clear();
	else
	    this.elements = new java.util.ArrayList<SignalControlZone>(total_len0);
	coder.decodeArray(source);
	if (coder.hasMoreElements(source, true))
	    do {
		try {
		    SignalControlZone item1 = new SignalControlZone();

		    this.elements.add(item1);
		    item1.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "SignalControlZone", idx0);
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
	    return equalTo((PreemptZones)that);
	}
	
	public boolean equalTo(SequenceOf that)
	{
	    return equalTo((PreemptZones)that);
	}
	
	public boolean equalTo(PreemptZones that) {
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
	public PreemptZones clone() {
	    PreemptZones copy = (PreemptZones)super.clone();
	    copy.elements = new java.util.ArrayList<SignalControlZone>(elements.size());
	    for (SignalControlZone element : elements) {
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
    } // End class definition for PreemptZones

    // Methods for field "priorityZones"
    public PriorityZones getPriorityZones()
    {
	return this.priorityZones;
    }
    
    public void setPriorityZones(PriorityZones priorityZones)
    {
	this.priorityZones = priorityZones;
    }
    
    public boolean hasPriorityZones()
    {
	return (priorityZones != null);
    }
    
    public void deletePriorityZones()
    {
	priorityZones = null;
    }
    
    
    
    /**
     * Define the ASN1 Type PriorityZones from ASN1 Module DSRC.
     * @see SequenceOf
     */
    public static class PriorityZones extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public PriorityZones()
	{
	    this.elements = new java.util.ArrayList<SignalControlZone>();
	}
	
	
	/**
	 * Construct from an array of components.
	 */
	public java.util.ArrayList<SignalControlZone> elements;

	public PriorityZones(SignalControlZone[] elements)
	{
	    this.elements = new java.util.ArrayList<SignalControlZone>(java.util.Arrays.asList(elements));
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(SignalControlZone element)
	{
	    elements.add(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(SignalControlZone element, int atIndex)
	{
	    elements.set(atIndex, element);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized SignalControlZone get(int atIndex)
	{
	    return (SignalControlZone)elements.get(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(SignalControlZone element, int atIndex)
	{
	    elements.add(atIndex, element);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(SignalControlZone element)
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
	public static int encodeValue(PerCoder coder, OutputBitStream sink, PriorityZones data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int total_len0 = data.elements.size();
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;
	    int nbits = 0;

	    if (total_len0 < 1 || total_len0 > 32)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + total_len0);
	    nbits += coder.encodeLengthDeterminant(total_len0, 1, 32, sink);
	    moreFragments0 = coder.moreFragments();
	    fragmentLength0 = (moreFragments0 ? coder.fragmentLength() : total_len0);
	    while (total_len0 > 0) {
		try {
		    SignalControlZone item1 = data.elements.get(idx0);

		    nbits += SignalControlZone.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "SignalControlZone", idx0);
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
	public static PriorityZones decodeValue(PerCoder coder, InputBitStream source, PriorityZones data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    int total_len0 = 0;
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;

	    idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, 1, 32);
	    if (fragmentLength0 > 32)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + fragmentLength0);
	    moreFragments0 = coder.moreFragments();
	    if (data.elements != null)
		data.elements.clear();
	    else
		data.elements = new java.util.ArrayList<SignalControlZone>(fragmentLength0);
	    while (idx0 > 0) {
		try {
		    SignalControlZone item1 = new SignalControlZone();

		    data.elements.add(item1);
		    item1.decodeValue(coder, source, item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "SignalControlZone", total_len0);
		    throw de;
		}
		--idx0; ++total_len0;
		if (idx0 == 0) {
		    if (moreFragments0) {
			idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, fragmentLength0);
			moreFragments0 = coder.moreFragments();
			if ((total_len0 + fragmentLength0) > 32)
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
			SignalControlZone item1 = this.elements.get(idx0);

			item1.encodeValue(coder, sink);
		    
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "SignalControlZone", idx0);
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
	public PriorityZones decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	int total_len0 = 0;
	int idx0 = 0;

	if (this.elements != null)
	    this.elements.clear();
	else
	    this.elements = new java.util.ArrayList<SignalControlZone>(total_len0);
	coder.decodeArray(source);
	if (coder.hasMoreElements(source, true))
	    do {
		try {
		    SignalControlZone item1 = new SignalControlZone();

		    this.elements.add(item1);
		    item1.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "SignalControlZone", idx0);
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
	    return equalTo((PriorityZones)that);
	}
	
	public boolean equalTo(SequenceOf that)
	{
	    return equalTo((PriorityZones)that);
	}
	
	public boolean equalTo(PriorityZones that) {
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
	public PriorityZones clone() {
	    PriorityZones copy = (PriorityZones)super.clone();
	    copy.elements = new java.util.ArrayList<SignalControlZone>(elements.size());
	    for (SignalControlZone element : elements) {
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
    } // End class definition for PriorityZones

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
	__refPoint("refPoint"),
	__refInterNum("refInterNum"),
	__orientation("orientation"),
	__laneWidth("laneWidth"),
	__type("type"),
	__approaches("approaches"),
	__preemptZones("preemptZones"),
	__priorityZones("priorityZones"),
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
     * Implements BER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encodeValue(BerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	int len0 = 0;
	Intersection_ temp0 = this;

	if (temp0.priorityZones != null) {
	    try {
		int len1 = 0;
		java.util.ArrayList<SignalControlZone> temp1 = temp0.priorityZones.elements;
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
		len0 += sink.encodeLengthTag(len1, 0xA9);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("priorityZones", "SEQUENCE OF");
		throw ee;
	    }
	}
	if (temp0.preemptZones != null) {
	    try {
		int len1 = 0;
		java.util.ArrayList<SignalControlZone> temp1 = temp0.preemptZones.elements;
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
		len0 += sink.encodeLengthTag(len1, 0xA8);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("preemptZones", "SEQUENCE OF");
		throw ee;
	    }
	}
	try {
	    int len1 = 0;
	    java.util.ArrayList<ApproachObject> temp1 = temp0.approaches.elements;
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
	    len0 += sink.encodeLengthTag(len1, 0xA7);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("approaches", "SEQUENCE OF");
	    throw ee;
	}
	if (temp0.type != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.type.byteArrayValue()), 0x86);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("type", "IntersectionStatusObject");
		throw ee;
	    }
	}
	if (temp0.laneWidth != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.laneWidth, sink), 0x85);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("laneWidth", "LaneWidth");
		throw ee;
	    }
	}
	if (temp0.orientation != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.orientation, sink), 0x84);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("orientation", "Heading");
		throw ee;
	    }
	}
	if (temp0.refInterNum != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.refInterNum.byteArrayValue()), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("refInterNum", "IntersectionID");
		throw ee;
	    }
	}
	if (temp0.refPoint != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.refPoint.encodeValue(coder, sink), 0xA2);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("refPoint", "Position3D");
		throw ee;
	    }
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
    public Intersection_ decodeValue(BerCoder coder, DecoderInput source)
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
	    if (tag == 0xA2) {
		try {
		    this.refPoint = new Position3D();
		    this.refPoint.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("refPoint", "Position3D");
		    throw ee;
		}
		tag = source.decodeTagLength();
	    }
	    if (tag == 0x83 || tag == 0xA3) {
		try {
		    this.refInterNum = new IntersectionID(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("refInterNum", "IntersectionID");
		    throw ee;
		}
		tag = source.decodeTagLength();
	    }
	    if (tag == 0x84) {
		try {
		    this.orientation = new Heading(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("orientation", "Heading");
		    throw ee;
		}
		tag = source.decodeTagLength();
	    }
	    if (tag == 0x85) {
		try {
		    this.laneWidth = new LaneWidth(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("laneWidth", "LaneWidth");
		    throw ee;
		}
		tag = source.decodeTagLength();
	    }
	    if (tag == 0x86 || tag == 0xA6) {
		try {
		    this.type = new IntersectionStatusObject(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("type", "IntersectionStatusObject");
		    throw ee;
		}
		tag = source.decodeTagLength();
	    }
	    if (tag != 0xA7)
		source.raiseTagMismatchException(tag);
	    try {
		this.approaches = new Approaches();
		{
		    int total_len1 = source.mLength;
		    int end_pos1 = (total_len1 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len1);
		    int idx1 = 0;

		    this.approaches.elements = new java.util.ArrayList<ApproachObject>();

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
			    ApproachObject temp1 = new ApproachObject();
			    this.approaches.add(temp1);
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
		ee.appendFieldContext("approaches", "SEQUENCE OF");
		throw ee;
	    }
	    if (source.position() >= end_pos0)
		break;
	    tag = source.decodeTagLength();
	    if (tag == 0)
		break;
	    if (tag == 0xA8) {
		try {
		    this.preemptZones = new PreemptZones();
		    {
			int total_len1 = source.mLength;
			int end_pos1 = (total_len1 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len1);
			int idx1 = 0;

			this.preemptZones.elements = new java.util.ArrayList<SignalControlZone>();

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
				SignalControlZone temp1 = new SignalControlZone();
				this.preemptZones.add(temp1);
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
		    ee.appendFieldContext("preemptZones", "SEQUENCE OF");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xA9) {
		try {
		    this.priorityZones = new PriorityZones();
		    {
			int total_len1 = source.mLength;
			int end_pos1 = (total_len1 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len1);
			int idx1 = 0;

			this.priorityZones.elements = new java.util.ArrayList<SignalControlZone>();

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
				SignalControlZone temp1 = new SignalControlZone();
				this.priorityZones.add(temp1);
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
		    ee.appendFieldContext("priorityZones", "SEQUENCE OF");
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
		    ee.appendExtensionContext("Intersection", -1);
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
	Intersection_ temp0 = this;

	if (temp0.priorityZones != null) {
	    try {
		int len1 = 0;
		java.util.ArrayList<SignalControlZone> temp1 = temp0.priorityZones.elements;
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
		len0 += sink.encodeLengthTag(len1, 0xA9);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("priorityZones", "SEQUENCE OF");
		throw ee;
	    }
	}
	if (temp0.preemptZones != null) {
	    try {
		int len1 = 0;
		java.util.ArrayList<SignalControlZone> temp1 = temp0.preemptZones.elements;
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
		len0 += sink.encodeLengthTag(len1, 0xA8);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("preemptZones", "SEQUENCE OF");
		throw ee;
	    }
	}
	try {
	    int len1 = 0;
	    java.util.ArrayList<ApproachObject> temp1 = temp0.approaches.elements;
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
	    len0 += sink.encodeLengthTag(len1, 0xA7);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("approaches", "SEQUENCE OF");
	    throw ee;
	}
	if (temp0.type != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.type.byteArrayValue()), 0x86);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("type", "IntersectionStatusObject");
		throw ee;
	    }
	}
	if (temp0.laneWidth != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.laneWidth, sink), 0x85);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("laneWidth", "LaneWidth");
		throw ee;
	    }
	}
	if (temp0.orientation != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.orientation, sink), 0x84);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("orientation", "Heading");
		throw ee;
	    }
	}
	if (temp0.refInterNum != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.refInterNum.byteArrayValue()), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("refInterNum", "IntersectionID");
		throw ee;
	    }
	}
	if (temp0.refPoint != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.refPoint.encodeValue(coder, sink), 0xA2);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("refPoint", "Position3D");
		throw ee;
	    }
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, Intersection_ data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.name != null);
	sink.writeBit(data.refPoint != null);
	sink.writeBit(data.refInterNum != null);
	sink.writeBit(data.orientation != null);
	sink.writeBit(data.laneWidth != null);
	sink.writeBit(data.type != null);
	sink.writeBit(data.preemptZones != null);
	sink.writeBit(data.priorityZones != null);
	nbits += 9;
	if (data.name != null) {
	    // Encode field 'name'
	    try {
		DescriptiveName item1 = data.name;
		int len1 = item1.getSize();

		if (len1 < 1 || len1 > 63)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerKMCString.encode(coder, item1.stringValue(), 1, 63, Intersection_._cEPAInfo_name, sink);
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
	if (data.refPoint != null) {
	    // Encode field 'refPoint'
	    try {
		Position3D item1 = data.refPoint;

		nbits += Position3D.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("refPoint", "Position3D");
		throw ee;
	    }
	}
	if (data.refInterNum != null) {
	    // Encode field 'refInterNum'
	    try {
		IntersectionID item1 = data.refInterNum;
		int len1 = item1.getSize();

		if (len1 < 2 || len1 > 4)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 2, 4, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("refInterNum", "IntersectionID");
		throw ee;
	    }
	}
	if (data.orientation != null) {
	    // Encode field 'orientation'
	    try {
		Heading item1 = data.orientation;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 28800)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 28800, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("orientation", "Heading");
		throw ee;
	    }
	}
	if (data.laneWidth != null) {
	    // Encode field 'laneWidth'
	    try {
		LaneWidth item1 = data.laneWidth;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 32767)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 32767, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("laneWidth", "LaneWidth");
		throw ee;
	    }
	}
	if (data.type != null) {
	    // Encode field 'type'
	    try {
		IntersectionStatusObject item1 = data.type;
		int len1 = item1.getSize();

		if (len1 != 1)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 1, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("type", "IntersectionStatusObject");
		throw ee;
	    }
	}
	// Encode field 'approaches'
	try {
	    Approaches item1 = data.approaches;

	    nbits += Approaches.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("approaches", "SEQUENCE OF");
	    throw ee;
	}
	if (data.preemptZones != null) {
	    // Encode field 'preemptZones'
	    try {
		PreemptZones item1 = data.preemptZones;

		nbits += PreemptZones.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("preemptZones", "SEQUENCE OF");
		throw ee;
	    }
	}
	if (data.priorityZones != null) {
	    // Encode field 'priorityZones'
	    try {
		PriorityZones item1 = data.priorityZones;

		nbits += PriorityZones.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("priorityZones", "SEQUENCE OF");
		throw ee;
	    }
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static Intersection_ decodeValue(PerCoder coder, InputBitStream source, Intersection_ data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_name0 = source.readBit();
	boolean has_refPoint0 = source.readBit();
	boolean has_refInterNum0 = source.readBit();
	boolean has_orientation0 = source.readBit();
	boolean has_laneWidth0 = source.readBit();
	boolean has_type0 = source.readBit();
	boolean has_preemptZones0 = source.readBit();
	boolean has_priorityZones0 = source.readBit();
    /** Decode root fields **/
	if (has_name0) {
	    // Decode field 'name'
	    try {
		data.name = new DescriptiveName(com.oss.coders.per.PerKMCString.decode(coder, source, 1, 63, Intersection_._cEPAInfo_name));
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
	if (has_refPoint0) {
	    // Decode field 'refPoint'
	    try {
		if (data.refPoint == null)
		    data.refPoint = new Position3D();
		data.refPoint.decodeValue(coder, source, data.refPoint);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("refPoint", "Position3D");
		throw de;
	    }
	} else {
	    data.refPoint = null;
	}
	if (has_refInterNum0) {
	    // Decode field 'refInterNum'
	    try {
		data.refInterNum = new IntersectionID(com.oss.coders.per.PerOctets.decode(coder, source, 2, 4));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("refInterNum", "IntersectionID");
		throw de;
	    }
	} else {
	    data.refInterNum = null;
	}
	if (has_orientation0) {
	    // Decode field 'orientation'
	    try {
		long temp1;

		if (data.orientation == null)
		    data.orientation = new Heading();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 28800);
		if (temp1 > 28800)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.orientation.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("orientation", "Heading");
		throw de;
	    }
	} else {
	    data.orientation = null;
	}
	if (has_laneWidth0) {
	    // Decode field 'laneWidth'
	    try {
		long temp1;

		if (data.laneWidth == null)
		    data.laneWidth = new LaneWidth();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 32767);
		if (temp1 > 32767)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.laneWidth.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("laneWidth", "LaneWidth");
		throw de;
	    }
	} else {
	    data.laneWidth = null;
	}
	if (has_type0) {
	    // Decode field 'type'
	    try {
		data.type = new IntersectionStatusObject(com.oss.coders.per.PerOctets.decode(coder, source, 1, 1));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("type", "IntersectionStatusObject");
		throw de;
	    }
	} else {
	    data.type = null;
	}
	// Decode field 'approaches'
	try {
	    if (data.approaches == null)
		data.approaches = new Approaches();
	    data.approaches.decodeValue(coder, source, data.approaches);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("approaches", "SEQUENCE OF");
	    throw de;
	}
	if (has_preemptZones0) {
	    // Decode field 'preemptZones'
	    try {
		if (data.preemptZones == null)
		    data.preemptZones = new PreemptZones();
		data.preemptZones.decodeValue(coder, source, data.preemptZones);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("preemptZones", "SEQUENCE OF");
		throw de;
	    }
	} else {
	    data.preemptZones = null;
	}
	if (has_priorityZones0) {
	    // Decode field 'priorityZones'
	    try {
		if (data.priorityZones == null)
		    data.priorityZones = new PriorityZones();
		data.priorityZones.decodeValue(coder, source, data.priorityZones);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("priorityZones", "SEQUENCE OF");
		throw de;
	    }
	} else {
	    data.priorityZones = null;
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
	// Encode field 'refPoint'
	try {
	    Position3D item1 = this.refPoint;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("refPoint");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "refPoint");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("refPoint", "Position3D");
	    throw ee;
	}
	// Encode field 'refInterNum'
	try {
	    IntersectionID item1 = this.refInterNum;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("refInterNum");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "refInterNum");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("refInterNum", "IntersectionID");
	    throw ee;
	}
	// Encode field 'orientation'
	try {
	    Heading item1 = this.orientation;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("orientation");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "orientation");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("orientation", "Heading");
	    throw ee;
	}
	// Encode field 'laneWidth'
	try {
	    LaneWidth item1 = this.laneWidth;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("laneWidth");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "laneWidth");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("laneWidth", "LaneWidth");
	    throw ee;
	}
	// Encode field 'type'
	try {
	    IntersectionStatusObject item1 = this.type;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("type");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "type");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("type", "IntersectionStatusObject");
	    throw ee;
	}
	// Encode field 'approaches'
	try {
	    Approaches item1 = this.approaches;

	    {
		sink.writeSeparator();
		sink.encodeKey("approaches");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("approaches", "SEQUENCE OF");
	    throw ee;
	}
	// Encode field 'preemptZones'
	try {
	    PreemptZones item1 = this.preemptZones;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("preemptZones");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "preemptZones");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("preemptZones", "SEQUENCE OF");
	    throw ee;
	}
	// Encode field 'priorityZones'
	try {
	    PriorityZones item1 = this.priorityZones;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("priorityZones");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "priorityZones");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("priorityZones", "SEQUENCE OF");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public Intersection_ decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[11];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		Intersection_.__Tag t_tag0 = Intersection_.__Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = Intersection_.__Tag._null_;
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
		    case __refPoint:
		    // Decode field 'refPoint'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.refPoint == null)
				this.refPoint = new Position3D();
			    this.refPoint.decodeValue(coder, source);
			    present0[2] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("refPoint", "Position3D");
			throw de;
		    }
		    break;
		    case __refInterNum:
		    // Decode field 'refInterNum'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.refInterNum = new IntersectionID(coder.decodeOctetString(source));
			    present0[3] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("refInterNum", "IntersectionID");
			throw de;
		    }
		    break;
		    case __orientation:
		    // Decode field 'orientation'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[4])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.orientation == null)
				this.orientation = new Heading();
			    this.orientation.setValue(coder.decodeInteger(source));
			    present0[4] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("orientation", "Heading");
			throw de;
		    }
		    break;
		    case __laneWidth:
		    // Decode field 'laneWidth'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[5])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.laneWidth == null)
				this.laneWidth = new LaneWidth();
			    this.laneWidth.setValue(coder.decodeInteger(source));
			    present0[5] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("laneWidth", "LaneWidth");
			throw de;
		    }
		    break;
		    case __type:
		    // Decode field 'type'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[6])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.type = new IntersectionStatusObject(coder.decodeOctetString(source));
			    present0[6] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("type", "IntersectionStatusObject");
			throw de;
		    }
		    break;
		    case __approaches:
		    // Decode field 'approaches'
		    try {
			if (present0[7])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.approaches == null)
			    this.approaches = new Approaches();
			this.approaches.decodeValue(coder, source);
			present0[7] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("approaches", "SEQUENCE OF");
			throw de;
		    }
		    break;
		    case __preemptZones:
		    // Decode field 'preemptZones'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[8])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.preemptZones == null)
				this.preemptZones = new PreemptZones();
			    this.preemptZones.decodeValue(coder, source);
			    present0[8] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("preemptZones", "SEQUENCE OF");
			throw de;
		    }
		    break;
		    case __priorityZones:
		    // Decode field 'priorityZones'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[9])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.priorityZones == null)
				this.priorityZones = new PriorityZones();
			    this.priorityZones.decodeValue(coder, source);
			    present0[9] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("priorityZones", "SEQUENCE OF");
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
	    this.refPoint = null;
	if (!present0[3])
	    this.refInterNum = null;
	if (!present0[4])
	    this.orientation = null;
	if (!present0[5])
	    this.laneWidth = null;
	if (!present0[6])
	    this.type = null;
	if (!present0[7])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'approaches'");
	if (!present0[8])
	    this.preemptZones = null;
	if (!present0[9])
	    this.priorityZones = null;
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
	if (this.refPoint != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("refPoint ");
		this.refPoint.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.refInterNum != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("refInterNum ");
		printer.print(this.refInterNum, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.orientation != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("orientation ");
		writer.print(this.orientation.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.laneWidth != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("laneWidth ");
		writer.print(this.laneWidth.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.type != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("type ");
		printer.print(this.type, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("approaches ");
	    {
		java.util.ArrayList<ApproachObject> temp1 = this.approaches.elements;
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
	if (this.preemptZones != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("preemptZones ");
		{
		    java.util.ArrayList<SignalControlZone> temp1 = this.preemptZones.elements;
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
	}
	if (this.priorityZones != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("priorityZones ");
		{
		    java.util.ArrayList<SignalControlZone> temp1 = this.priorityZones.elements;
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
	return equalTo((Intersection_)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((Intersection_)that);
    }
    
    public boolean equalTo(Intersection_ that) {
	if (this.name != null && that.name != null) {
	    if (!this.name.equalTo(that.name))
		return false;
	}
	if (!this.id.equalTo(that.id))
	    return false;
	if (this.refPoint != null && that.refPoint != null) {
	    if (!this.refPoint.equalTo(that.refPoint))
		return false;
	}
	if (this.refInterNum != null && that.refInterNum != null) {
	    if (!this.refInterNum.equalTo(that.refInterNum))
		return false;
	}
	if (this.orientation != null && that.orientation != null) {
	    if (!this.orientation.equalTo(that.orientation))
		return false;
	}
	if (this.laneWidth != null && that.laneWidth != null) {
	    if (!this.laneWidth.equalTo(that.laneWidth))
		return false;
	}
	if (this.type != null && that.type != null) {
	    if (!this.type.equalTo(that.type))
		return false;
	}
	if (!this.approaches.equalTo(that.approaches))
	    return false;
	if (this.preemptZones != null && that.preemptZones != null) {
	    if (!this.preemptZones.equalTo(that.preemptZones))
		return false;
	}
	if (this.priorityZones != null && that.priorityZones != null) {
	    if (!this.priorityZones.equalTo(that.priorityZones))
		return false;
	}
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public Intersection_ clone() {
	Intersection_ copy = (Intersection_)super.clone();
	if (name != null) {
	    copy.name = name.clone();
	}
	copy.id = id.clone();
	if (refPoint != null) {
	    copy.refPoint = refPoint.clone();
	}
	if (refInterNum != null) {
	    copy.refInterNum = refInterNum.clone();
	}
	if (orientation != null) {
	    copy.orientation = orientation.clone();
	}
	if (laneWidth != null) {
	    copy.laneWidth = laneWidth.clone();
	}
	if (type != null) {
	    copy.type = type.clone();
	}
	copy.approaches = approaches.clone();
	if (preemptZones != null) {
	    copy.preemptZones = preemptZones.clone();
	}
	if (priorityZones != null) {
	    copy.priorityZones = priorityZones.clone();
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
	hash = 41 * hash + (this.refPoint != null ? this.refPoint.hashCode() : 0);
	hash = 41 * hash + (this.refInterNum != null ? this.refInterNum.hashCode() : 0);
	hash = 41 * hash + (this.orientation != null ? this.orientation.hashCode() : 0);
	hash = 41 * hash + (this.laneWidth != null ? this.laneWidth.hashCode() : 0);
	hash = 41 * hash + (this.type != null ? this.type.hashCode() : 0);
	hash = 41 * hash + (this.approaches != null ? this.approaches.hashCode() : 0);
	hash = 41 * hash + (this.preemptZones != null ? this.preemptZones.hashCode() : 0);
	hash = 41 * hash + (this.priorityZones != null ? this.priorityZones.hashCode() : 0);
	return hash;
    }
} // End class definition for Intersection_
