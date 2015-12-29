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
 * Define the ASN1 Type Approach from ASN1 Module DSRC.
 * @see Sequence
 */

public class Approach extends Sequence {
    public DescriptiveName name;
    public ApproachNumber id;
    public DrivingLanes drivingLanes;
    public ComputedLanes computedLanes;
    public TrainsAndBuses trainsAndBuses;
    public Barriers barriers;
    public Crosswalks crosswalks;
    
    /**
     * The default constructor.
     */
    public Approach()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Approach(DescriptiveName name, ApproachNumber id, 
		    DrivingLanes drivingLanes, ComputedLanes computedLanes, 
		    TrainsAndBuses trainsAndBuses, Barriers barriers, 
		    Crosswalks crosswalks)
    {
	setName(name);
	setId(id);
	setDrivingLanes(drivingLanes);
	setComputedLanes(computedLanes);
	setTrainsAndBuses(trainsAndBuses);
	setBarriers(barriers);
	setCrosswalks(crosswalks);
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
    public ApproachNumber getId()
    {
	return this.id;
    }
    
    public void setId(ApproachNumber id)
    {
	this.id = id;
    }
    
    public boolean hasId()
    {
	return (id != null);
    }
    
    public void deleteId()
    {
	id = null;
    }
    
    
    // Methods for field "drivingLanes"
    public DrivingLanes getDrivingLanes()
    {
	return this.drivingLanes;
    }
    
    public void setDrivingLanes(DrivingLanes drivingLanes)
    {
	this.drivingLanes = drivingLanes;
    }
    
    public boolean hasDrivingLanes()
    {
	return (drivingLanes != null);
    }
    
    public void deleteDrivingLanes()
    {
	drivingLanes = null;
    }
    
    
    
    /**
     * Define the ASN1 Type DrivingLanes from ASN1 Module DSRC.
     * @see SequenceOf
     */
    public static class DrivingLanes extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public DrivingLanes()
	{
	    this.elements = new java.util.ArrayList<VehicleReferenceLane>();
	}
	
	
	/**
	 * Construct from an array of components.
	 */
	public java.util.ArrayList<VehicleReferenceLane> elements;

	public DrivingLanes(VehicleReferenceLane[] elements)
	{
	    this.elements = new java.util.ArrayList<VehicleReferenceLane>(java.util.Arrays.asList(elements));
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(VehicleReferenceLane element)
	{
	    elements.add(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(VehicleReferenceLane element, int atIndex)
	{
	    elements.set(atIndex, element);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized VehicleReferenceLane get(int atIndex)
	{
	    return (VehicleReferenceLane)elements.get(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(VehicleReferenceLane element, int atIndex)
	{
	    elements.add(atIndex, element);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(VehicleReferenceLane element)
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
	public static int encodeValue(PerCoder coder, OutputBitStream sink, DrivingLanes data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int total_len0 = data.elements.size();
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;
	    int nbits = 0;

	    if (total_len0 < 0 || total_len0 > 32)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + total_len0);
	    nbits += coder.encodeLengthDeterminant(total_len0, 0, 32, sink);
	    moreFragments0 = coder.moreFragments();
	    fragmentLength0 = (moreFragments0 ? coder.fragmentLength() : total_len0);
	    while (total_len0 > 0) {
		try {
		    VehicleReferenceLane item1 = data.elements.get(idx0);

		    nbits += VehicleReferenceLane.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "VehicleReferenceLane", idx0);
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
	public static DrivingLanes decodeValue(PerCoder coder, InputBitStream source, DrivingLanes data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    int total_len0 = 0;
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;

	    idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, 0, 32);
	    if (fragmentLength0 > 32)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + fragmentLength0);
	    moreFragments0 = coder.moreFragments();
	    if (data.elements != null)
		data.elements.clear();
	    else
		data.elements = new java.util.ArrayList<VehicleReferenceLane>(fragmentLength0);
	    while (idx0 > 0) {
		try {
		    VehicleReferenceLane item1 = new VehicleReferenceLane();

		    data.elements.add(item1);
		    item1.decodeValue(coder, source, item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "VehicleReferenceLane", total_len0);
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
			VehicleReferenceLane item1 = this.elements.get(idx0);

			item1.encodeValue(coder, sink);
		    
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "VehicleReferenceLane", idx0);
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
	public DrivingLanes decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	int total_len0 = 0;
	int idx0 = 0;

	if (this.elements != null)
	    this.elements.clear();
	else
	    this.elements = new java.util.ArrayList<VehicleReferenceLane>(total_len0);
	coder.decodeArray(source);
	if (coder.hasMoreElements(source, true))
	    do {
		try {
		    VehicleReferenceLane item1 = new VehicleReferenceLane();

		    this.elements.add(item1);
		    item1.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "VehicleReferenceLane", idx0);
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
	    return equalTo((DrivingLanes)that);
	}
	
	public boolean equalTo(SequenceOf that)
	{
	    return equalTo((DrivingLanes)that);
	}
	
	public boolean equalTo(DrivingLanes that) {
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
	public DrivingLanes clone() {
	    DrivingLanes copy = (DrivingLanes)super.clone();
	    copy.elements = new java.util.ArrayList<VehicleReferenceLane>(elements.size());
	    for (VehicleReferenceLane element : elements) {
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
    } // End class definition for DrivingLanes

    // Methods for field "computedLanes"
    public ComputedLanes getComputedLanes()
    {
	return this.computedLanes;
    }
    
    public void setComputedLanes(ComputedLanes computedLanes)
    {
	this.computedLanes = computedLanes;
    }
    
    public boolean hasComputedLanes()
    {
	return (computedLanes != null);
    }
    
    public void deleteComputedLanes()
    {
	computedLanes = null;
    }
    
    
    
    /**
     * Define the ASN1 Type ComputedLanes from ASN1 Module DSRC.
     * @see SequenceOf
     */
    public static class ComputedLanes extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public ComputedLanes()
	{
	    this.elements = new java.util.ArrayList<VehicleComputedLane>();
	}
	
	
	/**
	 * Construct from an array of components.
	 */
	public java.util.ArrayList<VehicleComputedLane> elements;

	public ComputedLanes(VehicleComputedLane[] elements)
	{
	    this.elements = new java.util.ArrayList<VehicleComputedLane>(java.util.Arrays.asList(elements));
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(VehicleComputedLane element)
	{
	    elements.add(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(VehicleComputedLane element, int atIndex)
	{
	    elements.set(atIndex, element);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized VehicleComputedLane get(int atIndex)
	{
	    return (VehicleComputedLane)elements.get(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(VehicleComputedLane element, int atIndex)
	{
	    elements.add(atIndex, element);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(VehicleComputedLane element)
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
	public static int encodeValue(PerCoder coder, OutputBitStream sink, ComputedLanes data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int total_len0 = data.elements.size();
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;
	    int nbits = 0;

	    if (total_len0 < 0 || total_len0 > 32)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + total_len0);
	    nbits += coder.encodeLengthDeterminant(total_len0, 0, 32, sink);
	    moreFragments0 = coder.moreFragments();
	    fragmentLength0 = (moreFragments0 ? coder.fragmentLength() : total_len0);
	    while (total_len0 > 0) {
		try {
		    VehicleComputedLane item1 = data.elements.get(idx0);

		    nbits += VehicleComputedLane.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "VehicleComputedLane", idx0);
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
	public static ComputedLanes decodeValue(PerCoder coder, InputBitStream source, ComputedLanes data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    int total_len0 = 0;
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;

	    idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, 0, 32);
	    if (fragmentLength0 > 32)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + fragmentLength0);
	    moreFragments0 = coder.moreFragments();
	    if (data.elements != null)
		data.elements.clear();
	    else
		data.elements = new java.util.ArrayList<VehicleComputedLane>(fragmentLength0);
	    while (idx0 > 0) {
		try {
		    VehicleComputedLane item1 = new VehicleComputedLane();

		    data.elements.add(item1);
		    item1.decodeValue(coder, source, item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "VehicleComputedLane", total_len0);
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
			VehicleComputedLane item1 = this.elements.get(idx0);

			item1.encodeValue(coder, sink);
		    
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "VehicleComputedLane", idx0);
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
	public ComputedLanes decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	int total_len0 = 0;
	int idx0 = 0;

	if (this.elements != null)
	    this.elements.clear();
	else
	    this.elements = new java.util.ArrayList<VehicleComputedLane>(total_len0);
	coder.decodeArray(source);
	if (coder.hasMoreElements(source, true))
	    do {
		try {
		    VehicleComputedLane item1 = new VehicleComputedLane();

		    this.elements.add(item1);
		    item1.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "VehicleComputedLane", idx0);
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
	    return equalTo((ComputedLanes)that);
	}
	
	public boolean equalTo(SequenceOf that)
	{
	    return equalTo((ComputedLanes)that);
	}
	
	public boolean equalTo(ComputedLanes that) {
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
	public ComputedLanes clone() {
	    ComputedLanes copy = (ComputedLanes)super.clone();
	    copy.elements = new java.util.ArrayList<VehicleComputedLane>(elements.size());
	    for (VehicleComputedLane element : elements) {
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
    } // End class definition for ComputedLanes

    // Methods for field "trainsAndBuses"
    public TrainsAndBuses getTrainsAndBuses()
    {
	return this.trainsAndBuses;
    }
    
    public void setTrainsAndBuses(TrainsAndBuses trainsAndBuses)
    {
	this.trainsAndBuses = trainsAndBuses;
    }
    
    public boolean hasTrainsAndBuses()
    {
	return (trainsAndBuses != null);
    }
    
    public void deleteTrainsAndBuses()
    {
	trainsAndBuses = null;
    }
    
    
    
    /**
     * Define the ASN1 Type TrainsAndBuses from ASN1 Module DSRC.
     * @see SequenceOf
     */
    public static class TrainsAndBuses extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public TrainsAndBuses()
	{
	    this.elements = new java.util.ArrayList<SpecialLane>();
	}
	
	
	/**
	 * Construct from an array of components.
	 */
	public java.util.ArrayList<SpecialLane> elements;

	public TrainsAndBuses(SpecialLane[] elements)
	{
	    this.elements = new java.util.ArrayList<SpecialLane>(java.util.Arrays.asList(elements));
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(SpecialLane element)
	{
	    elements.add(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(SpecialLane element, int atIndex)
	{
	    elements.set(atIndex, element);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized SpecialLane get(int atIndex)
	{
	    return (SpecialLane)elements.get(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(SpecialLane element, int atIndex)
	{
	    elements.add(atIndex, element);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(SpecialLane element)
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
	public static int encodeValue(PerCoder coder, OutputBitStream sink, TrainsAndBuses data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int total_len0 = data.elements.size();
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;
	    int nbits = 0;

	    if (total_len0 < 0 || total_len0 > 32)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + total_len0);
	    nbits += coder.encodeLengthDeterminant(total_len0, 0, 32, sink);
	    moreFragments0 = coder.moreFragments();
	    fragmentLength0 = (moreFragments0 ? coder.fragmentLength() : total_len0);
	    while (total_len0 > 0) {
		try {
		    SpecialLane item1 = data.elements.get(idx0);

		    nbits += SpecialLane.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "SpecialLane", idx0);
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
	public static TrainsAndBuses decodeValue(PerCoder coder, InputBitStream source, TrainsAndBuses data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    int total_len0 = 0;
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;

	    idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, 0, 32);
	    if (fragmentLength0 > 32)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + fragmentLength0);
	    moreFragments0 = coder.moreFragments();
	    if (data.elements != null)
		data.elements.clear();
	    else
		data.elements = new java.util.ArrayList<SpecialLane>(fragmentLength0);
	    while (idx0 > 0) {
		try {
		    SpecialLane item1 = new SpecialLane();

		    data.elements.add(item1);
		    item1.decodeValue(coder, source, item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "SpecialLane", total_len0);
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
			SpecialLane item1 = this.elements.get(idx0);

			item1.encodeValue(coder, sink);
		    
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "SpecialLane", idx0);
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
	public TrainsAndBuses decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	int total_len0 = 0;
	int idx0 = 0;

	if (this.elements != null)
	    this.elements.clear();
	else
	    this.elements = new java.util.ArrayList<SpecialLane>(total_len0);
	coder.decodeArray(source);
	if (coder.hasMoreElements(source, true))
	    do {
		try {
		    SpecialLane item1 = new SpecialLane();

		    this.elements.add(item1);
		    item1.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "SpecialLane", idx0);
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
	    return equalTo((TrainsAndBuses)that);
	}
	
	public boolean equalTo(SequenceOf that)
	{
	    return equalTo((TrainsAndBuses)that);
	}
	
	public boolean equalTo(TrainsAndBuses that) {
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
	public TrainsAndBuses clone() {
	    TrainsAndBuses copy = (TrainsAndBuses)super.clone();
	    copy.elements = new java.util.ArrayList<SpecialLane>(elements.size());
	    for (SpecialLane element : elements) {
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
    } // End class definition for TrainsAndBuses

    // Methods for field "barriers"
    public Barriers getBarriers()
    {
	return this.barriers;
    }
    
    public void setBarriers(Barriers barriers)
    {
	this.barriers = barriers;
    }
    
    public boolean hasBarriers()
    {
	return (barriers != null);
    }
    
    public void deleteBarriers()
    {
	barriers = null;
    }
    
    
    
    /**
     * Define the ASN1 Type Barriers from ASN1 Module DSRC.
     * @see SequenceOf
     */
    public static class Barriers extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public Barriers()
	{
	    this.elements = new java.util.ArrayList<BarrierLane>();
	}
	
	
	/**
	 * Construct from an array of components.
	 */
	public java.util.ArrayList<BarrierLane> elements;

	public Barriers(BarrierLane[] elements)
	{
	    this.elements = new java.util.ArrayList<BarrierLane>(java.util.Arrays.asList(elements));
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(BarrierLane element)
	{
	    elements.add(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(BarrierLane element, int atIndex)
	{
	    elements.set(atIndex, element);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized BarrierLane get(int atIndex)
	{
	    return (BarrierLane)elements.get(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(BarrierLane element, int atIndex)
	{
	    elements.add(atIndex, element);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(BarrierLane element)
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
	public static int encodeValue(PerCoder coder, OutputBitStream sink, Barriers data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int total_len0 = data.elements.size();
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;
	    int nbits = 0;

	    if (total_len0 < 0 || total_len0 > 32)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + total_len0);
	    nbits += coder.encodeLengthDeterminant(total_len0, 0, 32, sink);
	    moreFragments0 = coder.moreFragments();
	    fragmentLength0 = (moreFragments0 ? coder.fragmentLength() : total_len0);
	    while (total_len0 > 0) {
		try {
		    BarrierLane item1 = data.elements.get(idx0);

		    nbits += BarrierLane.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "BarrierLane", idx0);
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
	public static Barriers decodeValue(PerCoder coder, InputBitStream source, Barriers data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    int total_len0 = 0;
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;

	    idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, 0, 32);
	    if (fragmentLength0 > 32)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + fragmentLength0);
	    moreFragments0 = coder.moreFragments();
	    if (data.elements != null)
		data.elements.clear();
	    else
		data.elements = new java.util.ArrayList<BarrierLane>(fragmentLength0);
	    while (idx0 > 0) {
		try {
		    BarrierLane item1 = new BarrierLane();

		    data.elements.add(item1);
		    item1.decodeValue(coder, source, item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "BarrierLane", total_len0);
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
			BarrierLane item1 = this.elements.get(idx0);

			item1.encodeValue(coder, sink);
		    
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "BarrierLane", idx0);
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
	public Barriers decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	int total_len0 = 0;
	int idx0 = 0;

	if (this.elements != null)
	    this.elements.clear();
	else
	    this.elements = new java.util.ArrayList<BarrierLane>(total_len0);
	coder.decodeArray(source);
	if (coder.hasMoreElements(source, true))
	    do {
		try {
		    BarrierLane item1 = new BarrierLane();

		    this.elements.add(item1);
		    item1.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "BarrierLane", idx0);
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
	    return equalTo((Barriers)that);
	}
	
	public boolean equalTo(SequenceOf that)
	{
	    return equalTo((Barriers)that);
	}
	
	public boolean equalTo(Barriers that) {
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
	public Barriers clone() {
	    Barriers copy = (Barriers)super.clone();
	    copy.elements = new java.util.ArrayList<BarrierLane>(elements.size());
	    for (BarrierLane element : elements) {
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
    } // End class definition for Barriers

    // Methods for field "crosswalks"
    public Crosswalks getCrosswalks()
    {
	return this.crosswalks;
    }
    
    public void setCrosswalks(Crosswalks crosswalks)
    {
	this.crosswalks = crosswalks;
    }
    
    public boolean hasCrosswalks()
    {
	return (crosswalks != null);
    }
    
    public void deleteCrosswalks()
    {
	crosswalks = null;
    }
    
    
    
    /**
     * Define the ASN1 Type Crosswalks from ASN1 Module DSRC.
     * @see SequenceOf
     */
    public static class Crosswalks extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public Crosswalks()
	{
	    this.elements = new java.util.ArrayList<CrosswalkLane>();
	}
	
	
	/**
	 * Construct from an array of components.
	 */
	public java.util.ArrayList<CrosswalkLane> elements;

	public Crosswalks(CrosswalkLane[] elements)
	{
	    this.elements = new java.util.ArrayList<CrosswalkLane>(java.util.Arrays.asList(elements));
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(CrosswalkLane element)
	{
	    elements.add(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(CrosswalkLane element, int atIndex)
	{
	    elements.set(atIndex, element);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized CrosswalkLane get(int atIndex)
	{
	    return (CrosswalkLane)elements.get(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(CrosswalkLane element, int atIndex)
	{
	    elements.add(atIndex, element);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(CrosswalkLane element)
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
	public static int encodeValue(PerCoder coder, OutputBitStream sink, Crosswalks data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int total_len0 = data.elements.size();
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;
	    int nbits = 0;

	    if (total_len0 < 0 || total_len0 > 32)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + total_len0);
	    nbits += coder.encodeLengthDeterminant(total_len0, 0, 32, sink);
	    moreFragments0 = coder.moreFragments();
	    fragmentLength0 = (moreFragments0 ? coder.fragmentLength() : total_len0);
	    while (total_len0 > 0) {
		try {
		    CrosswalkLane item1 = data.elements.get(idx0);

		    nbits += CrosswalkLane.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "CrosswalkLane", idx0);
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
	public static Crosswalks decodeValue(PerCoder coder, InputBitStream source, Crosswalks data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    int total_len0 = 0;
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;

	    idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, 0, 32);
	    if (fragmentLength0 > 32)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + fragmentLength0);
	    moreFragments0 = coder.moreFragments();
	    if (data.elements != null)
		data.elements.clear();
	    else
		data.elements = new java.util.ArrayList<CrosswalkLane>(fragmentLength0);
	    while (idx0 > 0) {
		try {
		    CrosswalkLane item1 = new CrosswalkLane();

		    data.elements.add(item1);
		    item1.decodeValue(coder, source, item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "CrosswalkLane", total_len0);
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
			CrosswalkLane item1 = this.elements.get(idx0);

			item1.encodeValue(coder, sink);
		    
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "CrosswalkLane", idx0);
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
	public Crosswalks decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	int total_len0 = 0;
	int idx0 = 0;

	if (this.elements != null)
	    this.elements.clear();
	else
	    this.elements = new java.util.ArrayList<CrosswalkLane>(total_len0);
	coder.decodeArray(source);
	if (coder.hasMoreElements(source, true))
	    do {
		try {
		    CrosswalkLane item1 = new CrosswalkLane();

		    this.elements.add(item1);
		    item1.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "CrosswalkLane", idx0);
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
	    return equalTo((Crosswalks)that);
	}
	
	public boolean equalTo(SequenceOf that)
	{
	    return equalTo((Crosswalks)that);
	}
	
	public boolean equalTo(Crosswalks that) {
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
	public Crosswalks clone() {
	    Crosswalks copy = (Crosswalks)super.clone();
	    copy.elements = new java.util.ArrayList<CrosswalkLane>(elements.size());
	    for (CrosswalkLane element : elements) {
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
    } // End class definition for Crosswalks

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
	__drivingLanes("drivingLanes"),
	__computedLanes("computedLanes"),
	__trainsAndBuses("trainsAndBuses"),
	__barriers("barriers"),
	__crosswalks("crosswalks"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(8);
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
	Approach temp0 = this;

	if (temp0.crosswalks != null) {
	    try {
		int len1 = 0;
		java.util.ArrayList<CrosswalkLane> temp1 = temp0.crosswalks.elements;
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
		len0 += sink.encodeLengthTag(len1, 0xA6);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("crosswalks", "SEQUENCE OF");
		throw ee;
	    }
	}
	if (temp0.barriers != null) {
	    try {
		int len1 = 0;
		java.util.ArrayList<BarrierLane> temp1 = temp0.barriers.elements;
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
		ee.appendFieldContext("barriers", "SEQUENCE OF");
		throw ee;
	    }
	}
	if (temp0.trainsAndBuses != null) {
	    try {
		int len1 = 0;
		java.util.ArrayList<SpecialLane> temp1 = temp0.trainsAndBuses.elements;
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
		len0 += sink.encodeLengthTag(len1, 0xA4);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("trainsAndBuses", "SEQUENCE OF");
		throw ee;
	    }
	}
	if (temp0.computedLanes != null) {
	    try {
		int len1 = 0;
		java.util.ArrayList<VehicleComputedLane> temp1 = temp0.computedLanes.elements;
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
		len0 += sink.encodeLengthTag(len1, 0xA3);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("computedLanes", "SEQUENCE OF");
		throw ee;
	    }
	}
	if (temp0.drivingLanes != null) {
	    try {
		int len1 = 0;
		java.util.ArrayList<VehicleReferenceLane> temp1 = temp0.drivingLanes.elements;
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
		len0 += sink.encodeLengthTag(len1, 0xA2);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("drivingLanes", "SEQUENCE OF");
		throw ee;
	    }
	}
	if (temp0.id != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.id, sink), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("id", "ApproachNumber");
		throw ee;
	    }
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
    public Approach decodeValue(BerCoder coder, DecoderInput source)
	    throws DecoderException
    {
	int total_len0 = source.mLength;
	int end_pos0 = (total_len0 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len0);
	int tag;

	do {
	    if (source.position() >= end_pos0)
		break;
	    tag = source.decodeTagLength();
	    if (tag == 0)
		break;
	    if (tag == 0x80 || tag == 0xA0) {
		try {
		    this.name = new DescriptiveName(coder.decodeChars(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("name", "DescriptiveName");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x81) {
		try {
		    this.id = new ApproachNumber(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("id", "ApproachNumber");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xA2) {
		try {
		    this.drivingLanes = new DrivingLanes();
		    {
			int total_len1 = source.mLength;
			int end_pos1 = (total_len1 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len1);
			int idx1 = 0;

			this.drivingLanes.elements = new java.util.ArrayList<VehicleReferenceLane>();

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
				VehicleReferenceLane temp1 = new VehicleReferenceLane();
				this.drivingLanes.add(temp1);
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
		    ee.appendFieldContext("drivingLanes", "SEQUENCE OF");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xA3) {
		try {
		    this.computedLanes = new ComputedLanes();
		    {
			int total_len1 = source.mLength;
			int end_pos1 = (total_len1 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len1);
			int idx1 = 0;

			this.computedLanes.elements = new java.util.ArrayList<VehicleComputedLane>();

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
				VehicleComputedLane temp1 = new VehicleComputedLane();
				this.computedLanes.add(temp1);
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
		    ee.appendFieldContext("computedLanes", "SEQUENCE OF");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xA4) {
		try {
		    this.trainsAndBuses = new TrainsAndBuses();
		    {
			int total_len1 = source.mLength;
			int end_pos1 = (total_len1 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len1);
			int idx1 = 0;

			this.trainsAndBuses.elements = new java.util.ArrayList<SpecialLane>();

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
				SpecialLane temp1 = new SpecialLane();
				this.trainsAndBuses.add(temp1);
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
		    ee.appendFieldContext("trainsAndBuses", "SEQUENCE OF");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xA5) {
		try {
		    this.barriers = new Barriers();
		    {
			int total_len1 = source.mLength;
			int end_pos1 = (total_len1 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len1);
			int idx1 = 0;

			this.barriers.elements = new java.util.ArrayList<BarrierLane>();

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
				BarrierLane temp1 = new BarrierLane();
				this.barriers.add(temp1);
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
		    ee.appendFieldContext("barriers", "SEQUENCE OF");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xA6) {
		try {
		    this.crosswalks = new Crosswalks();
		    {
			int total_len1 = source.mLength;
			int end_pos1 = (total_len1 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len1);
			int idx1 = 0;

			this.crosswalks.elements = new java.util.ArrayList<CrosswalkLane>();

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
				CrosswalkLane temp1 = new CrosswalkLane();
				this.crosswalks.add(temp1);
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
		    ee.appendFieldContext("crosswalks", "SEQUENCE OF");
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
		    ee.appendExtensionContext("Approach", -1);
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
	Approach temp0 = this;

	if (temp0.crosswalks != null) {
	    try {
		int len1 = 0;
		java.util.ArrayList<CrosswalkLane> temp1 = temp0.crosswalks.elements;
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
		len0 += sink.encodeLengthTag(len1, 0xA6);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("crosswalks", "SEQUENCE OF");
		throw ee;
	    }
	}
	if (temp0.barriers != null) {
	    try {
		int len1 = 0;
		java.util.ArrayList<BarrierLane> temp1 = temp0.barriers.elements;
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
		ee.appendFieldContext("barriers", "SEQUENCE OF");
		throw ee;
	    }
	}
	if (temp0.trainsAndBuses != null) {
	    try {
		int len1 = 0;
		java.util.ArrayList<SpecialLane> temp1 = temp0.trainsAndBuses.elements;
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
		len0 += sink.encodeLengthTag(len1, 0xA4);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("trainsAndBuses", "SEQUENCE OF");
		throw ee;
	    }
	}
	if (temp0.computedLanes != null) {
	    try {
		int len1 = 0;
		java.util.ArrayList<VehicleComputedLane> temp1 = temp0.computedLanes.elements;
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
		len0 += sink.encodeLengthTag(len1, 0xA3);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("computedLanes", "SEQUENCE OF");
		throw ee;
	    }
	}
	if (temp0.drivingLanes != null) {
	    try {
		int len1 = 0;
		java.util.ArrayList<VehicleReferenceLane> temp1 = temp0.drivingLanes.elements;
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
		len0 += sink.encodeLengthTag(len1, 0xA2);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("drivingLanes", "SEQUENCE OF");
		throw ee;
	    }
	}
	if (temp0.id != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.id, sink), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("id", "ApproachNumber");
		throw ee;
	    }
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, Approach data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.name != null);
	sink.writeBit(data.id != null);
	sink.writeBit(data.drivingLanes != null);
	sink.writeBit(data.computedLanes != null);
	sink.writeBit(data.trainsAndBuses != null);
	sink.writeBit(data.barriers != null);
	sink.writeBit(data.crosswalks != null);
	nbits += 8;
	if (data.name != null) {
	    // Encode field 'name'
	    try {
		DescriptiveName item1 = data.name;
		int len1 = item1.getSize();

		if (len1 < 1 || len1 > 63)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerKMCString.encode(coder, item1.stringValue(), 1, 63, Approach._cEPAInfo_name, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("name", "DescriptiveName");
		throw ee;
	    }
	}
	if (data.id != null) {
	    // Encode field 'id'
	    try {
		ApproachNumber item1 = data.id;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 127)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 127, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("id", "ApproachNumber");
		throw ee;
	    }
	}
	if (data.drivingLanes != null) {
	    // Encode field 'drivingLanes'
	    try {
		DrivingLanes item1 = data.drivingLanes;

		nbits += DrivingLanes.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("drivingLanes", "SEQUENCE OF");
		throw ee;
	    }
	}
	if (data.computedLanes != null) {
	    // Encode field 'computedLanes'
	    try {
		ComputedLanes item1 = data.computedLanes;

		nbits += ComputedLanes.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("computedLanes", "SEQUENCE OF");
		throw ee;
	    }
	}
	if (data.trainsAndBuses != null) {
	    // Encode field 'trainsAndBuses'
	    try {
		TrainsAndBuses item1 = data.trainsAndBuses;

		nbits += TrainsAndBuses.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("trainsAndBuses", "SEQUENCE OF");
		throw ee;
	    }
	}
	if (data.barriers != null) {
	    // Encode field 'barriers'
	    try {
		Barriers item1 = data.barriers;

		nbits += Barriers.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("barriers", "SEQUENCE OF");
		throw ee;
	    }
	}
	if (data.crosswalks != null) {
	    // Encode field 'crosswalks'
	    try {
		Crosswalks item1 = data.crosswalks;

		nbits += Crosswalks.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("crosswalks", "SEQUENCE OF");
		throw ee;
	    }
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static Approach decodeValue(PerCoder coder, InputBitStream source, Approach data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_name0 = source.readBit();
	boolean has_id0 = source.readBit();
	boolean has_drivingLanes0 = source.readBit();
	boolean has_computedLanes0 = source.readBit();
	boolean has_trainsAndBuses0 = source.readBit();
	boolean has_barriers0 = source.readBit();
	boolean has_crosswalks0 = source.readBit();
    /** Decode root fields **/
	if (has_name0) {
	    // Decode field 'name'
	    try {
		data.name = new DescriptiveName(com.oss.coders.per.PerKMCString.decode(coder, source, 1, 63, Approach._cEPAInfo_name));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("name", "DescriptiveName");
		throw de;
	    }
	} else {
	    data.name = null;
	}
	if (has_id0) {
	    // Decode field 'id'
	    try {
		long temp1;

		if (data.id == null)
		    data.id = new ApproachNumber();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 127);
		if (temp1 > 127)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.id.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("id", "ApproachNumber");
		throw de;
	    }
	} else {
	    data.id = null;
	}
	if (has_drivingLanes0) {
	    // Decode field 'drivingLanes'
	    try {
		if (data.drivingLanes == null)
		    data.drivingLanes = new DrivingLanes();
		data.drivingLanes.decodeValue(coder, source, data.drivingLanes);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("drivingLanes", "SEQUENCE OF");
		throw de;
	    }
	} else {
	    data.drivingLanes = null;
	}
	if (has_computedLanes0) {
	    // Decode field 'computedLanes'
	    try {
		if (data.computedLanes == null)
		    data.computedLanes = new ComputedLanes();
		data.computedLanes.decodeValue(coder, source, data.computedLanes);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("computedLanes", "SEQUENCE OF");
		throw de;
	    }
	} else {
	    data.computedLanes = null;
	}
	if (has_trainsAndBuses0) {
	    // Decode field 'trainsAndBuses'
	    try {
		if (data.trainsAndBuses == null)
		    data.trainsAndBuses = new TrainsAndBuses();
		data.trainsAndBuses.decodeValue(coder, source, data.trainsAndBuses);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("trainsAndBuses", "SEQUENCE OF");
		throw de;
	    }
	} else {
	    data.trainsAndBuses = null;
	}
	if (has_barriers0) {
	    // Decode field 'barriers'
	    try {
		if (data.barriers == null)
		    data.barriers = new Barriers();
		data.barriers.decodeValue(coder, source, data.barriers);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("barriers", "SEQUENCE OF");
		throw de;
	    }
	} else {
	    data.barriers = null;
	}
	if (has_crosswalks0) {
	    // Decode field 'crosswalks'
	    try {
		if (data.crosswalks == null)
		    data.crosswalks = new Crosswalks();
		data.crosswalks.decodeValue(coder, source, data.crosswalks);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("crosswalks", "SEQUENCE OF");
		throw de;
	    }
	} else {
	    data.crosswalks = null;
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
	    ApproachNumber item1 = this.id;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("id");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "id");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("id", "ApproachNumber");
	    throw ee;
	}
	// Encode field 'drivingLanes'
	try {
	    DrivingLanes item1 = this.drivingLanes;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("drivingLanes");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "drivingLanes");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("drivingLanes", "SEQUENCE OF");
	    throw ee;
	}
	// Encode field 'computedLanes'
	try {
	    ComputedLanes item1 = this.computedLanes;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("computedLanes");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "computedLanes");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("computedLanes", "SEQUENCE OF");
	    throw ee;
	}
	// Encode field 'trainsAndBuses'
	try {
	    TrainsAndBuses item1 = this.trainsAndBuses;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("trainsAndBuses");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "trainsAndBuses");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("trainsAndBuses", "SEQUENCE OF");
	    throw ee;
	}
	// Encode field 'barriers'
	try {
	    Barriers item1 = this.barriers;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("barriers");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "barriers");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("barriers", "SEQUENCE OF");
	    throw ee;
	}
	// Encode field 'crosswalks'
	try {
	    Crosswalks item1 = this.crosswalks;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("crosswalks");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "crosswalks");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("crosswalks", "SEQUENCE OF");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public Approach decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[8];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		Approach.__Tag t_tag0 = Approach.__Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = Approach.__Tag._null_;
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
			if (!coder.isNullValue(source)) {
			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.id == null)
				this.id = new ApproachNumber();
			    this.id.setValue(coder.decodeInteger(source));
			    present0[1] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("id", "ApproachNumber");
			throw de;
		    }
		    break;
		    case __drivingLanes:
		    // Decode field 'drivingLanes'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.drivingLanes == null)
				this.drivingLanes = new DrivingLanes();
			    this.drivingLanes.decodeValue(coder, source);
			    present0[2] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("drivingLanes", "SEQUENCE OF");
			throw de;
		    }
		    break;
		    case __computedLanes:
		    // Decode field 'computedLanes'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.computedLanes == null)
				this.computedLanes = new ComputedLanes();
			    this.computedLanes.decodeValue(coder, source);
			    present0[3] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("computedLanes", "SEQUENCE OF");
			throw de;
		    }
		    break;
		    case __trainsAndBuses:
		    // Decode field 'trainsAndBuses'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[4])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.trainsAndBuses == null)
				this.trainsAndBuses = new TrainsAndBuses();
			    this.trainsAndBuses.decodeValue(coder, source);
			    present0[4] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("trainsAndBuses", "SEQUENCE OF");
			throw de;
		    }
		    break;
		    case __barriers:
		    // Decode field 'barriers'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[5])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.barriers == null)
				this.barriers = new Barriers();
			    this.barriers.decodeValue(coder, source);
			    present0[5] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("barriers", "SEQUENCE OF");
			throw de;
		    }
		    break;
		    case __crosswalks:
		    // Decode field 'crosswalks'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[6])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.crosswalks == null)
				this.crosswalks = new Crosswalks();
			    this.crosswalks.decodeValue(coder, source);
			    present0[6] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("crosswalks", "SEQUENCE OF");
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
	    this.id = null;
	if (!present0[2])
	    this.drivingLanes = null;
	if (!present0[3])
	    this.computedLanes = null;
	if (!present0[4])
	    this.trainsAndBuses = null;
	if (!present0[5])
	    this.barriers = null;
	if (!present0[6])
	    this.crosswalks = null;
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
	if (this.id != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("id ");
		writer.print(this.id.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.drivingLanes != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("drivingLanes ");
		{
		    java.util.ArrayList<VehicleReferenceLane> temp1 = this.drivingLanes.elements;
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
	if (this.computedLanes != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("computedLanes ");
		{
		    java.util.ArrayList<VehicleComputedLane> temp1 = this.computedLanes.elements;
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
	if (this.trainsAndBuses != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("trainsAndBuses ");
		{
		    java.util.ArrayList<SpecialLane> temp1 = this.trainsAndBuses.elements;
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
	if (this.barriers != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("barriers ");
		{
		    java.util.ArrayList<BarrierLane> temp1 = this.barriers.elements;
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
	if (this.crosswalks != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("crosswalks ");
		{
		    java.util.ArrayList<CrosswalkLane> temp1 = this.crosswalks.elements;
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
	if (comma0)
	    printer.newLine(writer);
	writer.print('}');
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((Approach)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((Approach)that);
    }
    
    public boolean equalTo(Approach that) {
	if (this.name != null && that.name != null) {
	    if (!this.name.equalTo(that.name))
		return false;
	}
	if (this.id != null && that.id != null) {
	    if (!this.id.equalTo(that.id))
		return false;
	}
	if (this.drivingLanes != null && that.drivingLanes != null) {
	    if (!this.drivingLanes.equalTo(that.drivingLanes))
		return false;
	}
	if (this.computedLanes != null && that.computedLanes != null) {
	    if (!this.computedLanes.equalTo(that.computedLanes))
		return false;
	}
	if (this.trainsAndBuses != null && that.trainsAndBuses != null) {
	    if (!this.trainsAndBuses.equalTo(that.trainsAndBuses))
		return false;
	}
	if (this.barriers != null && that.barriers != null) {
	    if (!this.barriers.equalTo(that.barriers))
		return false;
	}
	if (this.crosswalks != null && that.crosswalks != null) {
	    if (!this.crosswalks.equalTo(that.crosswalks))
		return false;
	}
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public Approach clone() {
	Approach copy = (Approach)super.clone();
	if (name != null) {
	    copy.name = name.clone();
	}
	if (id != null) {
	    copy.id = id.clone();
	}
	if (drivingLanes != null) {
	    copy.drivingLanes = drivingLanes.clone();
	}
	if (computedLanes != null) {
	    copy.computedLanes = computedLanes.clone();
	}
	if (trainsAndBuses != null) {
	    copy.trainsAndBuses = trainsAndBuses.clone();
	}
	if (barriers != null) {
	    copy.barriers = barriers.clone();
	}
	if (crosswalks != null) {
	    copy.crosswalks = crosswalks.clone();
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
	hash = 41 * hash + (this.drivingLanes != null ? this.drivingLanes.hashCode() : 0);
	hash = 41 * hash + (this.computedLanes != null ? this.computedLanes.hashCode() : 0);
	hash = 41 * hash + (this.trainsAndBuses != null ? this.trainsAndBuses.hashCode() : 0);
	hash = 41 * hash + (this.barriers != null ? this.barriers.hashCode() : 0);
	hash = 41 * hash + (this.crosswalks != null ? this.crosswalks.hashCode() : 0);
	return hash;
    }
} // End class definition for Approach
