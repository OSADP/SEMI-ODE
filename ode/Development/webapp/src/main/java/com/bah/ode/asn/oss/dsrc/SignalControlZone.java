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
/* Created: Tue Apr 28 10:28:02 2015 */
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
 * Define the ASN1 Type SignalControlZone from ASN1 Module DSRC.
 * @see Sequence
 */

public class SignalControlZone extends Sequence {
    public DescriptiveName name;
    public SignalReqScheme pValue;
    public Data data;
    
    /**
     * The default constructor.
     */
    public SignalControlZone()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SignalControlZone(DescriptiveName name, SignalReqScheme pValue, 
		    Data data)
    {
	setName(name);
	setPValue(pValue);
	setData(data);
    }
    
    /**
     * Construct with required components.
     */
    public SignalControlZone(SignalReqScheme pValue, Data data)
    {
	setPValue(pValue);
	setData(data);
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
    
    
    // Methods for field "pValue"
    public SignalReqScheme getPValue()
    {
	return this.pValue;
    }
    
    public void setPValue(SignalReqScheme pValue)
    {
	this.pValue = pValue;
    }
    
    
    // Methods for field "data"
    public Data getData()
    {
	return this.data;
    }
    
    public void setData(Data data)
    {
	this.data = data;
    }
    
    
    
    /**
     * Define the ASN1 Type Data from ASN1 Module DSRC.
     * @see Choice
     */
    public static class Data extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Data()
	{
	}
	
	public static final  int  laneSet_chosen = 1;
	public static final  int  zones_chosen = 2;
	
	// Methods for field "laneSet"
	public static Data createDataWithLaneSet(LaneSet laneSet)
	{
	    Data __object = new Data();

	    __object.setLaneSet(laneSet);
	    return __object;
	}
	
	public boolean hasLaneSet()
	{
	    return getChosenFlag() == laneSet_chosen;
	}
	
	public LaneSet getLaneSet()
	{
	    if (hasLaneSet())
		return (LaneSet)mChosenValue;
	    else
		return null;
	}
	
	public void setLaneSet(LaneSet laneSet)
	{
	    setChosenValue(laneSet);
	    setChosenFlag(laneSet_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type LaneSet from ASN1 Module DSRC.
	 * @see SequenceOf
	 */
	public static class LaneSet extends SequenceOf {
	    
	    /**
	     * The default constructor.
	     */
	    public LaneSet()
	    {
		this.elements = new java.util.ArrayList<LaneNumber>();
	    }
	    
	    
	    /**
	     * Construct from an array of components.
	     */
	    public java.util.ArrayList<LaneNumber> elements;

	    public LaneSet(LaneNumber[] elements)
	    {
		this.elements = new java.util.ArrayList<LaneNumber>(java.util.Arrays.asList(elements));
	    }
	    
	    /**
	     * Add an Element to the SEQUENCE OF/SET OF.
	     */
	    public synchronized void add(LaneNumber element)
	    {
		elements.add(element);
	    }
	    
	    /**
	     * Set an Element in the SEQUENCE OF/SET OF.
	     */
	    public synchronized void set(LaneNumber element, int atIndex)
	    {
		elements.set(atIndex, element);
	    }
	    
	    /**
	     * Get an Element from the SEQUENCE OF/SET OF.
	     */
	    public synchronized LaneNumber get(int atIndex)
	    {
		return (LaneNumber)elements.get(atIndex);
	    }
	    
	    /**
	     * Insert an Element into the SEQUENCE OF/SET OF.
	     */
	    public synchronized void insert(LaneNumber element, int atIndex)
	    {
		elements.add(atIndex, element);
	    }
	    
	    /**
	     * Remove an Element from the SEQUENCE OF/SET OF.
	     */
	    public synchronized void remove(LaneNumber element)
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
	    public static int encodeValue(PerCoder coder, OutputBitStream sink, LaneSet data)
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
			LaneNumber item1 = data.elements.get(idx0);
			int len1 = item1.getSize();

			if (len1 != 1)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
			nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 1, sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext(null, "LaneNumber", idx0);
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
	    public static LaneSet decodeValue(PerCoder coder, InputBitStream source, LaneSet data)
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
		    data.elements = new java.util.ArrayList<LaneNumber>(fragmentLength0);
		while (idx0 > 0) {
		    try {
			LaneNumber item1;

			item1 = new LaneNumber(com.oss.coders.per.PerOctets.decode(coder, source, 1, 1));
			data.elements.add(item1);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext(null, "LaneNumber", total_len0);
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
	     * Compare 'this' object to another object to see if their contents are the same.
	     */
	    public boolean abstractEqualTo(AbstractData that)
	    {
		return equalTo((LaneSet)that);
	    }
	    
	    public boolean equalTo(SequenceOf that)
	    {
		return equalTo((LaneSet)that);
	    }
	    
	    public boolean equalTo(LaneSet that) {
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
	    public LaneSet clone() {
		LaneSet copy = (LaneSet)super.clone();
		copy.elements = new java.util.ArrayList<LaneNumber>(elements.size());
		for (LaneNumber element : elements) {
		    copy.elements.add(element.clone());
		}
		return copy;
	    }

	} // End class definition for LaneSet

	// Methods for field "zones"
	public static Data createDataWithZones(Zones zones)
	{
	    Data __object = new Data();

	    __object.setZones(zones);
	    return __object;
	}
	
	public boolean hasZones()
	{
	    return getChosenFlag() == zones_chosen;
	}
	
	public Zones getZones()
	{
	    if (hasZones())
		return (Zones)mChosenValue;
	    else
		return null;
	}
	
	public void setZones(Zones zones)
	{
	    setChosenValue(zones);
	    setChosenFlag(zones_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Zones from ASN1 Module DSRC.
	 * @see SequenceOf
	 */
	public static class Zones extends SequenceOf {
	    
	    /**
	     * The default constructor.
	     */
	    public Zones()
	    {
		this.elements = new java.util.ArrayList<Sequence_>();
	    }
	    
	    
	    /**
	     * Construct from an array of components.
	     */
	    public java.util.ArrayList<Sequence_> elements;

	    public Zones(Sequence_[] elements)
	    {
		this.elements = new java.util.ArrayList<Sequence_>(java.util.Arrays.asList(elements));
	    }
	    
	    
	    /**
	     * Define the ASN1 Type Sequence_ from ASN1 Module DSRC.
	     * @see Sequence
	     */
	    public static class Sequence_ extends Sequence {
		public Enclosed enclosed;
		public LaneWidth laneWidth;
		public NodeList nodeList;
		
		/**
		 * The default constructor.
		 */
		public Sequence_()
		{
		}
		
		/**
		 * Construct with AbstractData components.
		 */
		public Sequence_(Enclosed enclosed, LaneWidth laneWidth, 
				NodeList nodeList)
		{
		    setEnclosed(enclosed);
		    setLaneWidth(laneWidth);
		    setNodeList(nodeList);
		}
		
		/**
		 * Construct with required components.
		 */
		public Sequence_(NodeList nodeList)
		{
		    setNodeList(nodeList);
		}
		
		
		// Methods for field "enclosed"
		public Enclosed getEnclosed()
		{
		    return this.enclosed;
		}
		
		public void setEnclosed(Enclosed enclosed)
		{
		    this.enclosed = enclosed;
		}
		
		public boolean hasEnclosed()
		{
		    return (enclosed != null);
		}
		
		public void deleteEnclosed()
		{
		    enclosed = null;
		}
		
		
		
		/**
		 * Define the ASN1 Type Enclosed from ASN1 Module DSRC.
		 * @see SequenceOf
		 */
		public static class Enclosed extends SequenceOf {
		    
		    /**
		     * The default constructor.
		     */
		    public Enclosed()
		    {
			this.elements = new java.util.ArrayList<LaneNumber>();
		    }
		    
		    
		    /**
		     * Construct from an array of components.
		     */
		    public java.util.ArrayList<LaneNumber> elements;

		    public Enclosed(LaneNumber[] elements)
		    {
			this.elements = new java.util.ArrayList<LaneNumber>(java.util.Arrays.asList(elements));
		    }
		    
		    /**
		     * Add an Element to the SEQUENCE OF/SET OF.
		     */
		    public synchronized void add(LaneNumber element)
		    {
			elements.add(element);
		    }
		    
		    /**
		     * Set an Element in the SEQUENCE OF/SET OF.
		     */
		    public synchronized void set(LaneNumber element, int atIndex)
		    {
			elements.set(atIndex, element);
		    }
		    
		    /**
		     * Get an Element from the SEQUENCE OF/SET OF.
		     */
		    public synchronized LaneNumber get(int atIndex)
		    {
			return (LaneNumber)elements.get(atIndex);
		    }
		    
		    /**
		     * Insert an Element into the SEQUENCE OF/SET OF.
		     */
		    public synchronized void insert(LaneNumber element, int atIndex)
		    {
			elements.add(atIndex, element);
		    }
		    
		    /**
		     * Remove an Element from the SEQUENCE OF/SET OF.
		     */
		    public synchronized void remove(LaneNumber element)
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
		    public static int encodeValue(PerCoder coder, OutputBitStream sink, Enclosed data)
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
				LaneNumber item1 = data.elements.get(idx0);
				int len1 = item1.getSize();

				if (len1 != 1)
				    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
				nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 1, sink);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendElementContext(null, "LaneNumber", idx0);
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
		    public static Enclosed decodeValue(PerCoder coder, InputBitStream source, Enclosed data)
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
			    data.elements = new java.util.ArrayList<LaneNumber>(fragmentLength0);
			while (idx0 > 0) {
			    try {
				LaneNumber item1;

				item1 = new LaneNumber(com.oss.coders.per.PerOctets.decode(coder, source, 1, 1));
				data.elements.add(item1);
			    } catch (Exception e) {
				DecoderException de = DecoderException.wrapException(e);
				de.appendElementContext(null, "LaneNumber", total_len0);
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
		     * Compare 'this' object to another object to see if their contents are the same.
		     */
		    public boolean abstractEqualTo(AbstractData that)
		    {
			return equalTo((Enclosed)that);
		    }
		    
		    public boolean equalTo(SequenceOf that)
		    {
			return equalTo((Enclosed)that);
		    }
		    
		    public boolean equalTo(Enclosed that) {
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
		    public Enclosed clone() {
			Enclosed copy = (Enclosed)super.clone();
			copy.elements = new java.util.ArrayList<LaneNumber>(elements.size());
			for (LaneNumber element : elements) {
			    copy.elements.add(element.clone());
			}
			return copy;
		    }

		} // End class definition for Enclosed

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
		
		
		// Methods for field "nodeList"
		public NodeList getNodeList()
		{
		    return this.nodeList;
		}
		
		public void setNodeList(NodeList nodeList)
		{
		    this.nodeList = nodeList;
		}
		
		
		/**
		 * Implements PER value encoder for the type (reserved for internal use).
		 * This method is reserved for internal use and must not be invoked from the application code.
		 */
		public static int encodeValue(PerCoder coder, OutputBitStream sink, Sequence_ data)
			throws IOException, EncoderException, EncodeFailedException
		{
		    int nbits = 0;

		    boolean has_enclosed0 = data.enclosed != null;
		    boolean has_laneWidth0 = data.laneWidth != null;
		    sink.writeBit(false); ++nbits;
		    sink.writeBit(has_enclosed0); ++nbits;
		    sink.writeBit(has_laneWidth0); ++nbits;
		    if (has_enclosed0) {
			// Encode field 'enclosed'
			try {
			    Enclosed item1 = data.enclosed;

			    nbits += Enclosed.encodeValue(coder, sink, item1);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendFieldContext("enclosed", "SEQUENCE OF");
			    throw ee;
			}
		    }
		    if (has_laneWidth0) {
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
		    // Encode field 'nodeList'
		    try {
			NodeList item1 = data.nodeList;

			nbits += NodeList.encodeValue(coder, sink, item1);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("nodeList", "NodeList");
			throw ee;
		    }

		    return nbits;
		}

		/**
		 * Implements PER value decoder for the type (reserved for internal use).
		 * This method is reserved for internal use and must not be invoked from the application code.
		 */
		public static Sequence_ decodeValue(PerCoder coder, InputBitStream source, Sequence_ data)
			throws IOException, DecoderException, DecodeFailedException
		{
		    boolean _has_extensions0 = source.readBit();
		    int len0 = 0;
		    int idx0;
		    InputBitStream bitstream0 = null;

		    boolean has_enclosed0 = source.readBit();
		    boolean has_laneWidth0 = source.readBit();
		    if (has_enclosed0) {
			// Decode field 'enclosed'
			try {
			    if (data.enclosed == null)
				data.enclosed = new Enclosed();
			    Enclosed.decodeValue(coder, source, data.enclosed);
			} catch (Exception e) {
			    DecoderException de = DecoderException.wrapException(e);
			    de.appendFieldContext("enclosed", "SEQUENCE OF");
			    throw de;
			}
		    } else {
			data.enclosed = null;
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
		    // Decode field 'nodeList'
		    try {
			if (data.nodeList == null)
			    data.nodeList = new NodeList();
			NodeList.decodeValue(coder, source, data.nodeList);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("nodeList", "NodeList");
			throw de;
		    }
		    if (_has_extensions0) {
			len0 = coder.decodeNormallySmallLength(source);
			if (coder.moreFragments())
			    throw new DecoderException(com.oss.util.ExceptionDescriptor._too_many_ext_additions, null, "16384 or more");
			int unknown_exts0 = 0;
			if (len0 > 0)
			    for (idx0 = 0; idx0 < len0 - 0; idx0++) {
				if (source.readBit())
				    ++unknown_exts0;
			    }
			bitstream0 = source;
			source = coder.createNestedStream(bitstream0);
			try {
			} finally {
			    source.close();
			}
			source = bitstream0;
			for (idx0 = 0; idx0 < unknown_exts0; idx0++) {
			    try {
				com.oss.coders.per.PerOctets.skip(coder, source);
			    } catch (Exception e) {
				DecoderException de = DecoderException.wrapException(e);
				de.appendExtensionContext(null, idx0);
				throw de;
			    }
			}
		    }
		    return data;
		}

		/**
		 * Compare 'this' object to another object to see if their contents are the same.
		 */
		public boolean abstractEqualTo(AbstractData that)
		{
		    return equalTo((Sequence_)that);
		}
		
		public boolean equalTo(Sequence that)
		{
		    return equalTo((Sequence_)that);
		}
		
		public boolean equalTo(Sequence_ that) {
		    if (this.enclosed != null && that.enclosed != null) {
			if (!this.enclosed.equalTo(that.enclosed))
			    return false;
		    }
		    if (this.laneWidth != null && that.laneWidth != null) {
			if (!this.laneWidth.equalTo(that.laneWidth))
			    return false;
		    }
		    if (!this.nodeList.equalTo(that.nodeList))
			return false;
		    return true;
		}

		/**
		 * Clone 'this' object.
		 */
		public Sequence_ clone() {
		    Sequence_ copy = (Sequence_)super.clone();
		    if (enclosed != null) {
			copy.enclosed = enclosed.clone();
		    }
		    if (laneWidth != null) {
			copy.laneWidth = laneWidth.clone();
		    }
		    copy.nodeList = nodeList.clone();
		    return copy;
		}

	    } // End class definition for Sequence_

	    /**
	     * Add an Element to the SEQUENCE OF/SET OF.
	     */
	    public synchronized void add(Sequence_ element)
	    {
		elements.add(element);
	    }
	    
	    /**
	     * Set an Element in the SEQUENCE OF/SET OF.
	     */
	    public synchronized void set(Sequence_ element, int atIndex)
	    {
		elements.set(atIndex, element);
	    }
	    
	    /**
	     * Get an Element from the SEQUENCE OF/SET OF.
	     */
	    public synchronized Sequence_ get(int atIndex)
	    {
		return (Sequence_)elements.get(atIndex);
	    }
	    
	    /**
	     * Insert an Element into the SEQUENCE OF/SET OF.
	     */
	    public synchronized void insert(Sequence_ element, int atIndex)
	    {
		elements.add(atIndex, element);
	    }
	    
	    /**
	     * Remove an Element from the SEQUENCE OF/SET OF.
	     */
	    public synchronized void remove(Sequence_ element)
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
	    public static int encodeValue(PerCoder coder, OutputBitStream sink, Zones data)
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
			Sequence_ item1 = data.elements.get(idx0);

			nbits += Sequence_.encodeValue(coder, sink, item1);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext(null, "SEQUENCE", idx0);
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
	    public static Zones decodeValue(PerCoder coder, InputBitStream source, Zones data)
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
		    data.elements = new java.util.ArrayList<Sequence_>(fragmentLength0);
		while (idx0 > 0) {
		    try {
			Sequence_ item1 = new Sequence_();

			data.elements.add(item1);
			Sequence_.decodeValue(coder, source, item1);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext(null, "SEQUENCE", total_len0);
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
	     * Compare 'this' object to another object to see if their contents are the same.
	     */
	    public boolean abstractEqualTo(AbstractData that)
	    {
		return equalTo((Zones)that);
	    }
	    
	    public boolean equalTo(SequenceOf that)
	    {
		return equalTo((Zones)that);
	    }
	    
	    public boolean equalTo(Zones that) {
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
	    public Zones clone() {
		Zones copy = (Zones)super.clone();
		copy.elements = new java.util.ArrayList<Sequence_>(elements.size());
		for (Sequence_ element : elements) {
		    copy.elements.add(element.clone());
		}
		return copy;
	    }

	} // End class definition for Zones

	/**
	 * Implements PER value encoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public static int encodeValue(PerCoder coder, OutputBitStream sink, Data data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int idx0 = data.mChosenFlag;
	    int nbits = 0;

	    if (idx0 < 1 || idx0 > 2)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._bad_choice, null, idx0);
	    nbits += coder.encodeConstrainedWholeNumber(idx0 - 1, 0, 1, sink);
	    switch (idx0) {
		case laneSet_chosen:
		    // Encode alternative 'laneSet'
		    try {
			LaneSet item1 = (LaneSet)data.mChosenValue;

			nbits += LaneSet.encodeValue(coder, sink, item1);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("laneSet", "SEQUENCE OF", 0);
			throw ee;
		    }
		    break;
		case zones_chosen:
		    // Encode alternative 'zones'
		    try {
			Zones item1 = (Zones)data.mChosenValue;

			nbits += Zones.encodeValue(coder, sink, item1);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("zones", "SEQUENCE OF", 0);
			throw ee;
		    }
		    break;
	    }

	    return nbits;
	}

	/**
	 * Implements PER value decoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public static Data decodeValue(PerCoder coder, InputBitStream source, Data data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    int idx0 = 0;

	    idx0 = (int)coder.decodeConstrainedWholeNumber(source, 0, 1) + 1;
	    if (idx0 < 1 || idx0 > 2)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._bad_choice, null, idx0);
	    data.mChosenFlag = idx0;
	    switch (idx0) {
		case laneSet_chosen:
		    // Decode alternative 'laneSet'
		    try {
			LaneSet item1 = new LaneSet();

			// Decode alternative 'laneSet'
			data.mChosenValue = item1;
			LaneSet.decodeValue(coder, source, item1);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("laneSet", "SEQUENCE OF", 0);
			throw de;
		    }
		    break;
		case zones_chosen:
		    // Decode alternative 'zones'
		    try {
			Zones item1 = new Zones();

			// Decode alternative 'zones'
			data.mChosenValue = item1;
			Zones.decodeValue(coder, source, item1);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("zones", "SEQUENCE OF", 0);
			throw de;
		    }
		    break;
	    }
	    return data;
	}

	/**
	 * Clone 'this' object.
	 */
	public Data clone() {
	    return (Data)super.clone();
	}

    } // End class definition for Data

    /**
     * Effective permitted alphabet (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public static final EPAInfo _cEPAInfo_name = 
	com.bah.ode.asn.oss.dsrc.DescriptiveName._cEPAInfo_;
    
    /**
     * Implements BER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encodeValue(BerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	int len0 = 0;
	SignalControlZone temp0 = this;

	try {
	    int len1;

	    switch (temp0.data.getChosenFlag()) {
	    case Data.laneSet_chosen:
		try {
		    int len2 = 0;
		    java.util.ArrayList<LaneNumber> temp2 = ((com.bah.ode.asn.oss.dsrc.SignalControlZone.Data.LaneSet)temp0.data.getChosenValue()).elements;
		    int idx2 = temp2 != null ? temp2.size() : 0;

		    try {
			while(idx2-- > 0) {
			    len2 += sink.encodeLengthTag(sink.write(temp2.get(idx2).byteArrayValue()), 0x4);
			}
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext(null, "SEQUENCE OF", idx2);
			throw ee;
		    }
		    len1 = sink.encodeLengthTag(len2, 0xA0);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("laneSet", "CHOICE", 0);
		    throw ee;
		}
		break;

	    case Data.zones_chosen:
		try {
		    int len2 = 0;
		    java.util.ArrayList<com.bah.ode.asn.oss.dsrc.SignalControlZone.Data.Zones.Sequence_> temp2 = ((com.bah.ode.asn.oss.dsrc.SignalControlZone.Data.Zones)temp0.data.getChosenValue()).elements;
		    int idx2 = temp2 != null ? temp2.size() : 0;

		    try {
			while(idx2-- > 0) {
			    int len3 = 0;
			    com.bah.ode.asn.oss.dsrc.SignalControlZone.Data.Zones.Sequence_ temp3 = temp2.get(idx2);

			    try {
				len3 += sink.encodeLengthTag(temp3.nodeList.encodeValue(coder, sink), 0xA2);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("nodeList", "NodeList");
				throw ee;
			    }
			    if (temp3.laneWidth != null) {
				try {
				    len3 += sink.encodeLengthTag(coder.encodeInteger(temp3.laneWidth, sink), 0x81);
				} catch (Exception e) {
				    EncoderException ee = EncoderException.wrapException(e);
				    ee.appendFieldContext("laneWidth", "LaneWidth");
				    throw ee;
				}
			    }
			    if (temp3.enclosed != null) {
				try {
				    int len4 = 0;
				    java.util.ArrayList<LaneNumber> temp4 = temp3.enclosed.elements;
				    int idx4 = temp4 != null ? temp4.size() : 0;

				    try {
					while(idx4-- > 0) {
					    len4 += sink.encodeLengthTag(sink.write(temp4.get(idx4).byteArrayValue()), 0x4);
					}
				    } catch (Exception e) {
					EncoderException ee = EncoderException.wrapException(e);
					ee.appendElementContext(null, "SEQUENCE OF", idx4);
					throw ee;
				    }
				    len3 += sink.encodeLengthTag(len4, 0xA0);
				} catch (Exception e) {
				    EncoderException ee = EncoderException.wrapException(e);
				    ee.appendFieldContext("enclosed", "SEQUENCE OF");
				    throw ee;
				}
			    }
			    len2 += sink.encodeLengthTag(len3, 0x30);
			}
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext(null, "SEQUENCE OF", idx2);
			throw ee;
		    }
		    len1 = sink.encodeLengthTag(len2, 0xA1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("zones", "CHOICE", 0);
		    throw ee;
		}
		break;

	    default:
		throw new EncoderException(ExceptionDescriptor._bad_choice, null);
	    }
	    len0 += sink.encodeLengthTag(len1, 0xA2);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("data", "CHOICE");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(sink.write(temp0.pValue.byteArrayValue()), 0x81);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("pValue", "SignalReqScheme");
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
    public SignalControlZone decodeValue(BerCoder coder, DecoderInput source)
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
		this.pValue = new SignalReqScheme(coder.decodeOctetString(source));
	    } catch (Exception e) {
		DecoderException ee = DecoderException.wrapException(e);
		ee.appendFieldContext("pValue", "SignalReqScheme");
		throw ee;
	    }
	    tag = source.decodeTagLength();
	    if (tag != 0xA2)
		source.raiseTagMismatchException(tag);
	    try {
		this.data = new Data();
		tag = source.decodeTagLength();
		switch (tag) {
		case 0xA0:
		    try {
			this.data.setChosenFlag(Data.laneSet_chosen);
			this.data.setChosenValue(new com.bah.ode.asn.oss.dsrc.SignalControlZone.Data.LaneSet());
			{
			    int total_len2 = source.mLength;
			    int end_pos2 = (total_len2 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len2);
			    int idx2 = 0;

			    ((com.bah.ode.asn.oss.dsrc.SignalControlZone.Data.LaneSet)this.data.getChosenValue()).elements = new java.util.ArrayList<LaneNumber>();

			    try {
				for (;;) {
				    if (source.position() >= end_pos2) {
					if (source.position() > end_pos2)
					    throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
					break;
				    }
				    tag = source.decodeTagLength();
				    if (tag == 0) {
					if (total_len2 < 0) {
					    if (source.mLength != 0)
						throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);
					    break;
					}
					if (source.mLength == 0)
					    throw new DecoderException(ExceptionDescriptor._expect_tag, null);
				    }
				    LaneNumber temp2;
				    if (tag != 0x4 && tag != 0x24)
					source.raiseTagMismatchException(tag);
				    temp2 = new LaneNumber(coder.decodeOctetString(source));
				    ((com.bah.ode.asn.oss.dsrc.SignalControlZone.Data.LaneSet)this.data.getChosenValue()).add(temp2);
				    ++idx2;
				}
			    } catch (Exception e) {
				DecoderException ee = DecoderException.wrapException(e);
				ee.appendElementContext(null, "SEQUENCE OF", idx2);
				throw ee;
			    }
			}
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendElementContext("laneSet", "SEQUENCE OF", 0);
			throw ee;
		    }
		    break;

		case 0xA1:
		    try {
			this.data.setChosenFlag(Data.zones_chosen);
			this.data.setChosenValue(new com.bah.ode.asn.oss.dsrc.SignalControlZone.Data.Zones());
			{
			    int total_len2 = source.mLength;
			    int end_pos2 = (total_len2 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len2);
			    int idx2 = 0;

			    ((com.bah.ode.asn.oss.dsrc.SignalControlZone.Data.Zones)this.data.getChosenValue()).elements = new java.util.ArrayList<com.bah.ode.asn.oss.dsrc.SignalControlZone.Data.Zones.Sequence_>();

			    try {
				for (;;) {
				    if (source.position() >= end_pos2) {
					if (source.position() > end_pos2)
					    throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
					break;
				    }
				    tag = source.decodeTagLength();
				    if (tag == 0) {
					if (total_len2 < 0) {
					    if (source.mLength != 0)
						throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);
					    break;
					}
					if (source.mLength == 0)
					    throw new DecoderException(ExceptionDescriptor._expect_tag, null);
				    }
				    com.bah.ode.asn.oss.dsrc.SignalControlZone.Data.Zones.Sequence_ temp2 = new com.bah.ode.asn.oss.dsrc.SignalControlZone.Data.Zones.Sequence_();
				    ((com.bah.ode.asn.oss.dsrc.SignalControlZone.Data.Zones)this.data.getChosenValue()).add(temp2);
				    if (tag != 0x30)
					source.raiseTagMismatchException(tag);
				    {
					int total_len3 = source.mLength;
					int end_pos3 = (total_len3 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len3);

					do {
					    tag = source.decodeTagLength();
					    if (tag == 0xA0) {
						try {
						    temp2.enclosed = new com.bah.ode.asn.oss.dsrc.SignalControlZone.Data.Zones.Sequence_.Enclosed();
						    {
							int total_len4 = source.mLength;
							int end_pos4 = (total_len4 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len4);
							int idx4 = 0;

							temp2.enclosed.elements = new java.util.ArrayList<LaneNumber>();

							try {
							    for (;;) {
								if (source.position() >= end_pos4) {
								    if (source.position() > end_pos4)
									throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
								    break;
								}
								tag = source.decodeTagLength();
								if (tag == 0) {
								    if (total_len4 < 0) {
									if (source.mLength != 0)
									    throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);
									break;
								    }
								    if (source.mLength == 0)
									throw new DecoderException(ExceptionDescriptor._expect_tag, null);
								}
								LaneNumber temp4;
								if (tag != 0x4 && tag != 0x24)
								    source.raiseTagMismatchException(tag);
								temp4 = new LaneNumber(coder.decodeOctetString(source));
								temp2.enclosed.add(temp4);
								++idx4;
							    }
							} catch (Exception e) {
							    DecoderException ee = DecoderException.wrapException(e);
							    ee.appendElementContext(null, "SEQUENCE OF", idx4);
							    throw ee;
							}
						    }
						} catch (Exception e) {
						    DecoderException ee = DecoderException.wrapException(e);
						    ee.appendFieldContext("enclosed", "SEQUENCE OF");
						    throw ee;
						}
						tag = source.decodeTagLength();
					    }
					    if (tag == 0x81) {
						try {
						    temp2.laneWidth = new LaneWidth(source.decodeLong());
						} catch (Exception e) {
						    DecoderException ee = DecoderException.wrapException(e);
						    ee.appendFieldContext("laneWidth", "LaneWidth");
						    throw ee;
						}
						tag = source.decodeTagLength();
					    }
					    if (tag != 0xA2)
						source.raiseTagMismatchException(tag);
					    try {
						temp2.nodeList = new NodeList();
						temp2.nodeList.decodeValue(coder, source);
					    } catch (Exception e) {
						DecoderException ee = DecoderException.wrapException(e);
						ee.appendFieldContext("nodeList", "NodeList");
						throw ee;
					    }
					    if (source.position() >= end_pos3)
						break;
					    tag = source.decodeTagLength();
					    if (tag == 0)
						break;
					    for (;;) {
						try {
						    coder.skipContents(source);
						} catch (Exception e) {
						    DecoderException ee = DecoderException.wrapException(e);
						    ee.appendExtensionContext("SEQUENCE", -1);
						    throw ee;
						}
						if (source.position() >= end_pos3)
						    break;
						tag = source.decodeTagLength();
						if (tag == 0)
						    break;
					    }
					} while(false);

					if (source.position() > end_pos3)
					    throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
					if (total_len3 < 0 && source.mLength != 0)
					    throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);
				    }
				    ++idx2;
				}
			    } catch (Exception e) {
				DecoderException ee = DecoderException.wrapException(e);
				ee.appendElementContext(null, "SEQUENCE OF", idx2);
				throw ee;
			    }
			}
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendElementContext("zones", "SEQUENCE OF", 0);
			throw ee;
		    }
		    break;

		default:
		    source.raiseUnknownFieldException(tag);
		}
	    } catch (Exception e) {
		DecoderException ee = DecoderException.wrapException(e);
		ee.appendFieldContext("data", "CHOICE");
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
		    ee.appendExtensionContext("SignalControlZone", -1);
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
	SignalControlZone temp0 = this;

	try {
	    int len1;

	    switch (temp0.data.getChosenFlag()) {
	    case Data.laneSet_chosen:
		try {
		    int len2 = 0;
		    java.util.ArrayList<LaneNumber> temp2 = ((com.bah.ode.asn.oss.dsrc.SignalControlZone.Data.LaneSet)temp0.data.getChosenValue()).elements;
		    int idx2 = temp2 != null ? temp2.size() : 0;

		    try {
			while(idx2-- > 0) {
			    len2 += sink.encodeLengthTag(sink.write(temp2.get(idx2).byteArrayValue()), 0x4);
			}
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext(null, "SEQUENCE OF", idx2);
			throw ee;
		    }
		    len1 = sink.encodeLengthTag(len2, 0xA0);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("laneSet", "CHOICE", 0);
		    throw ee;
		}
		break;

	    case Data.zones_chosen:
		try {
		    int len2 = 0;
		    java.util.ArrayList<com.bah.ode.asn.oss.dsrc.SignalControlZone.Data.Zones.Sequence_> temp2 = ((com.bah.ode.asn.oss.dsrc.SignalControlZone.Data.Zones)temp0.data.getChosenValue()).elements;
		    int idx2 = temp2 != null ? temp2.size() : 0;

		    try {
			while(idx2-- > 0) {
			    int len3 = 0;
			    com.bah.ode.asn.oss.dsrc.SignalControlZone.Data.Zones.Sequence_ temp3 = temp2.get(idx2);

			    try {
				len3 += sink.encodeLengthTag(temp3.nodeList.encodeValue(coder, sink), 0xA2);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("nodeList", "NodeList");
				throw ee;
			    }
			    if (temp3.laneWidth != null) {
				try {
				    len3 += sink.encodeLengthTag(coder.encodeInteger(temp3.laneWidth, sink), 0x81);
				} catch (Exception e) {
				    EncoderException ee = EncoderException.wrapException(e);
				    ee.appendFieldContext("laneWidth", "LaneWidth");
				    throw ee;
				}
			    }
			    if (temp3.enclosed != null) {
				try {
				    int len4 = 0;
				    java.util.ArrayList<LaneNumber> temp4 = temp3.enclosed.elements;
				    int idx4 = temp4 != null ? temp4.size() : 0;

				    try {
					while(idx4-- > 0) {
					    len4 += sink.encodeLengthTag(sink.write(temp4.get(idx4).byteArrayValue()), 0x4);
					}
				    } catch (Exception e) {
					EncoderException ee = EncoderException.wrapException(e);
					ee.appendElementContext(null, "SEQUENCE OF", idx4);
					throw ee;
				    }
				    len3 += sink.encodeLengthTag(len4, 0xA0);
				} catch (Exception e) {
				    EncoderException ee = EncoderException.wrapException(e);
				    ee.appendFieldContext("enclosed", "SEQUENCE OF");
				    throw ee;
				}
			    }
			    len2 += sink.encodeLengthTag(len3, 0x30);
			}
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext(null, "SEQUENCE OF", idx2);
			throw ee;
		    }
		    len1 = sink.encodeLengthTag(len2, 0xA1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("zones", "CHOICE", 0);
		    throw ee;
		}
		break;

	    default:
		throw new EncoderException(ExceptionDescriptor._bad_choice, null);
	    }
	    len0 += sink.encodeLengthTag(len1, 0xA2);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("data", "CHOICE");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(sink.write(temp0.pValue.byteArrayValue()), 0x81);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("pValue", "SignalReqScheme");
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, SignalControlZone data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	boolean has_name0 = data.name != null;
	sink.writeBit(false); ++nbits;
	sink.writeBit(has_name0); ++nbits;
	if (has_name0) {
	    // Encode field 'name'
	    try {
		DescriptiveName item1 = data.name;
		int len1 = item1.getSize();

		if (len1 < 1 || len1 > 63)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerKMCString.encode(coder, item1.stringValue(), 1, 63, SignalControlZone._cEPAInfo_name, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("name", "DescriptiveName");
		throw ee;
	    }
	}
	// Encode field 'pValue'
	try {
	    SignalReqScheme item1 = data.pValue;
	    int len1 = item1.getSize();

	    if (len1 != 1)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 1, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("pValue", "SignalReqScheme");
	    throw ee;
	}
	// Encode field 'data'
	try {
	    Data item1 = data.data;

	    nbits += Data.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("data", "CHOICE");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static SignalControlZone decodeValue(PerCoder coder, InputBitStream source, SignalControlZone data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	int idx0;
	InputBitStream bitstream0 = null;

	boolean has_name0 = source.readBit();
	if (has_name0) {
	    // Decode field 'name'
	    try {
		data.name = new DescriptiveName(com.oss.coders.per.PerKMCString.decode(coder, source, 1, 63, SignalControlZone._cEPAInfo_name));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("name", "DescriptiveName");
		throw de;
	    }
	} else {
	    data.name = null;
	}
	// Decode field 'pValue'
	try {
	    data.pValue = new SignalReqScheme(com.oss.coders.per.PerOctets.decode(coder, source, 1, 1));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("pValue", "SignalReqScheme");
	    throw de;
	}
	// Decode field 'data'
	try {
	    if (data.data == null)
		data.data = new Data();
	    Data.decodeValue(coder, source, data.data);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("data", "CHOICE");
	    throw de;
	}
	if (_has_extensions0) {
	    len0 = coder.decodeNormallySmallLength(source);
	    if (coder.moreFragments())
		throw new DecoderException(com.oss.util.ExceptionDescriptor._too_many_ext_additions, null, "16384 or more");
	    int unknown_exts0 = 0;
	    if (len0 > 0)
		for (idx0 = 0; idx0 < len0 - 0; idx0++) {
		    if (source.readBit())
			++unknown_exts0;
		}
	    bitstream0 = source;
	    source = coder.createNestedStream(bitstream0);
	    try {
	    } finally {
		source.close();
	    }
	    source = bitstream0;
	    for (idx0 = 0; idx0 < unknown_exts0; idx0++) {
		try {
		    com.oss.coders.per.PerOctets.skip(coder, source);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendExtensionContext(null, idx0);
		    throw de;
		}
	    }
	}
	return data;
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
		if (comma0)
		    writer.print(',');
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
	    writer.print("pValue ");
	    printer.print(this.pValue, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("data ");
	    {
		switch (this.data.getChosenFlag()) {
		case Data.laneSet_chosen:
		    try {
			writer.print("laneSet : ");
			{
			    java.util.ArrayList<LaneNumber> temp2 = ((com.bah.ode.asn.oss.dsrc.SignalControlZone.Data.LaneSet)this.data.getChosenValue()).elements;
			    int len2 = temp2 != null ? temp2.size() : 0;
			    int idx2 = 0;

			    try {
				writer.print('{');
				printer.indent();
				for (idx2 = 0; idx2 < len2; idx2++){
				    if (idx2 > 0)
					writer.print(',');
				    printer.newLine(writer);
				    printer.print(temp2.get(idx2), writer);
				}
				printer.undent();
				if (len2 > 0)
				    printer.newLine(writer);
				writer.print('}');
			    } catch (Exception e) {
				printer.reportError(e, null, writer);
			    }
			}
		    } catch (Exception e) {
			printer.reportError(e, null, writer);
		    }
		    break;

		case Data.zones_chosen:
		    try {
			writer.print("zones : ");
			{
			    java.util.ArrayList<com.bah.ode.asn.oss.dsrc.SignalControlZone.Data.Zones.Sequence_> temp2 = ((com.bah.ode.asn.oss.dsrc.SignalControlZone.Data.Zones)this.data.getChosenValue()).elements;
			    int len2 = temp2 != null ? temp2.size() : 0;
			    int idx2 = 0;

			    try {
				writer.print('{');
				printer.indent();
				for (idx2 = 0; idx2 < len2; idx2++){
				    boolean comma3;

				    if (idx2 > 0)
					writer.print(',');
				    printer.newLine(writer);
				    comma3 = false;
				    writer.print('{');
				    printer.indent();
				    if (temp2.get(idx2).enclosed != null) {
					try {
					    if (comma3)
						writer.print(',');
					    comma3 = true;
					    printer.newLine(writer);
					    writer.print("enclosed ");
					    {
						java.util.ArrayList<LaneNumber> temp4 = temp2.get(idx2).enclosed.elements;
						int len4 = temp4 != null ? temp4.size() : 0;
						int idx4 = 0;

						try {
						    writer.print('{');
						    printer.indent();
						    for (idx4 = 0; idx4 < len4; idx4++){
							if (idx4 > 0)
							    writer.print(',');
							printer.newLine(writer);
							printer.print(temp4.get(idx4), writer);
						    }
						    printer.undent();
						    if (len4 > 0)
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
				    if (temp2.get(idx2).laneWidth != null) {
					try {
					    if (comma3)
						writer.print(',');
					    comma3 = true;
					    printer.newLine(writer);
					    writer.print("laneWidth ");
					    writer.print(temp2.get(idx2).laneWidth.longValue());
					} catch (Exception e) {
					    printer.reportError(e, null, writer);
					}
				    }
				    try {
					if (comma3)
					    writer.print(',');
					comma3 = true;
					printer.newLine(writer);
					writer.print("nodeList ");
					temp2.get(idx2).nodeList.printValue(printer, writer);
				    } catch (Exception e) {
					printer.reportError(e, null, writer);
				    }
				    printer.undent();
				    if (comma3)
					printer.newLine(writer);
				    writer.print('}');
				}
				printer.undent();
				if (len2 > 0)
				    printer.newLine(writer);
				writer.print('}');
			    } catch (Exception e) {
				printer.reportError(e, null, writer);
			    }
			}
		    } catch (Exception e) {
			printer.reportError(e, null, writer);
		    }
		    break;

		default:
		    writer.print("-- unknown selection --");
		}
	    }
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
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
	return equalTo((SignalControlZone)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((SignalControlZone)that);
    }
    
    public boolean equalTo(SignalControlZone that) {
	if (this.name != null && that.name != null) {
	    if (!this.name.equalTo(that.name))
		return false;
	}
	if (!this.pValue.equalTo(that.pValue))
	    return false;
	if (!this.data.equalTo(that.data))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public SignalControlZone clone() {
	SignalControlZone copy = (SignalControlZone)super.clone();
	if (name != null) {
	    copy.name = name.clone();
	}
	copy.pValue = pValue.clone();
	copy.data = data.clone();
	return copy;
    }

} // End class definition for SignalControlZone
