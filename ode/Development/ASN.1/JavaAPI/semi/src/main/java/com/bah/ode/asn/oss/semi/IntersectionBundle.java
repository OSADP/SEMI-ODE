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
/* Created: Mon Dec 14 11:50:30 2015 */
/* ASN.1 Compiler for Java version: 6.2 */
/* ASN.1 compiler options and file names specified:
 * -toed -output com.bah.ode.asn.oss -per -uper -ber -der -root -noSampleCode
 * -messageFormat msvc
 * C:/Users/572682/Projects/ODE/GitRepo/ode/Development/ASN.1/DSRC_R36_Source.asn
 * C:/Users/572682/Projects/ODE/GitRepo/ode/Development/ASN.1/SEMI_ASN.1_Structures_2.2.asn
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
import com.oss.coders.OutputBitStream;
import com.oss.coders.per.PEREncodable;
import com.oss.coders.InputBitStream;
import com.oss.coders.per.PERDecodable;
import com.oss.coders.per.PerCoder;

/**
 * Define the ASN1 Type IntersectionBundle from ASN1 Module SEMI.
 * @see Sequence
 */

public class IntersectionBundle extends Sequence {
    public INTEGER bundleNumber;
    public com.bah.ode.asn.oss.dsrc.TemporaryID bundleId;
    public IsdRecords isdRecords;
    
    /**
     * The default constructor.
     */
    public IntersectionBundle()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public IntersectionBundle(INTEGER bundleNumber, 
		    com.bah.ode.asn.oss.dsrc.TemporaryID bundleId, 
		    IsdRecords isdRecords)
    {
	setBundleNumber(bundleNumber);
	setBundleId(bundleId);
	setIsdRecords(isdRecords);
    }
    
    /**
     * Construct with components.
     */
    public IntersectionBundle(long bundleNumber, 
		    com.bah.ode.asn.oss.dsrc.TemporaryID bundleId, 
		    IsdRecords isdRecords)
    {
	this(new INTEGER(bundleNumber), bundleId, isdRecords);
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
    
    
    // Methods for field "isdRecords"
    public IsdRecords getIsdRecords()
    {
	return this.isdRecords;
    }
    
    public void setIsdRecords(IsdRecords isdRecords)
    {
	this.isdRecords = isdRecords;
    }
    
    
    
    /**
     * Define the ASN1 Type IsdRecords from ASN1 Module SEMI.
     * @see SequenceOf
     */
    public static class IsdRecords extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public IsdRecords()
	{
	    this.elements = new java.util.ArrayList<IntersectionRecord>();
	}
	
	
	/**
	 * Construct from an array of components.
	 */
	public java.util.ArrayList<IntersectionRecord> elements;

	public IsdRecords(IntersectionRecord[] elements)
	{
	    this.elements = new java.util.ArrayList<IntersectionRecord>(java.util.Arrays.asList(elements));
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(IntersectionRecord element)
	{
	    elements.add(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(IntersectionRecord element, int atIndex)
	{
	    elements.set(atIndex, element);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized IntersectionRecord get(int atIndex)
	{
	    return (IntersectionRecord)elements.get(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(IntersectionRecord element, int atIndex)
	{
	    elements.add(atIndex, element);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(IntersectionRecord element)
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
	public static int encodeValue(PerCoder coder, OutputBitStream sink, IsdRecords data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int total_len0 = data.elements.size();
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;
	    int nbits = 0;

	    if (total_len0 < 1 || total_len0 > 5)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + total_len0);
	    nbits += coder.encodeLengthDeterminant(total_len0, 1, 5, sink);
	    moreFragments0 = coder.moreFragments();
	    fragmentLength0 = (moreFragments0 ? coder.fragmentLength() : total_len0);
	    while (total_len0 > 0) {
		try {
		    IntersectionRecord item1 = data.elements.get(idx0);

		    nbits += IntersectionRecord.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "IntersectionRecord", idx0);
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
	public static IsdRecords decodeValue(PerCoder coder, InputBitStream source, IsdRecords data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    int total_len0 = 0;
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;

	    idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, 1, 5);
	    if (fragmentLength0 > 5)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + fragmentLength0);
	    moreFragments0 = coder.moreFragments();
	    if (data.elements != null)
		data.elements.clear();
	    else
		data.elements = new java.util.ArrayList<IntersectionRecord>(fragmentLength0);
	    while (idx0 > 0) {
		try {
		    IntersectionRecord item1 = new IntersectionRecord();

		    data.elements.add(item1);
		    item1.decodeValue(coder, source, item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "IntersectionRecord", total_len0);
		    throw de;
		}
		--idx0; ++total_len0;
		if (idx0 == 0) {
		    if (moreFragments0) {
			idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, fragmentLength0);
			moreFragments0 = coder.moreFragments();
			if ((total_len0 + fragmentLength0) > 5)
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
	    return equalTo((IsdRecords)that);
	}
	
	public boolean equalTo(SequenceOf that)
	{
	    return equalTo((IsdRecords)that);
	}
	
	public boolean equalTo(IsdRecords that) {
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
	public IsdRecords clone() {
	    IsdRecords copy = (IsdRecords)super.clone();
	    copy.elements = new java.util.ArrayList<IntersectionRecord>(elements.size());
	    for (IntersectionRecord element : elements) {
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
    } // End class definition for IsdRecords

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, IntersectionBundle data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	// Encode field 'bundleNumber'
	try {
	    INTEGER item1 = data.bundleNumber;
	    long temp1 = item1.longValue();

	    if (temp1 < 1 || temp1 > 60)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += (coder.encodeConstrainedWholeNumber(temp1, 1, 60, sink));
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
	// Encode field 'isdRecords'
	try {
	    IsdRecords item1 = data.isdRecords;

	    nbits += IsdRecords.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("isdRecords", "SEQUENCE OF");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static IntersectionBundle decodeValue(PerCoder coder, InputBitStream source, IntersectionBundle data)
	    throws IOException, DecoderException, DecodeFailedException
    {
    /** Decode root fields **/
	// Decode field 'bundleNumber'
	try {
	    long temp1;

	    if (data.bundleNumber == null)
		data.bundleNumber = new INTEGER();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 1, 60);
	    if (temp1 > 60)
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
	// Decode field 'isdRecords'
	try {
	    if (data.isdRecords == null)
		data.isdRecords = new IsdRecords();
	    data.isdRecords.decodeValue(coder, source, data.isdRecords);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("isdRecords", "SEQUENCE OF");
	    throw de;
	}
	return data;
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((IntersectionBundle)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((IntersectionBundle)that);
    }
    
    public boolean equalTo(IntersectionBundle that) {
	if (!this.bundleNumber.equalTo(that.bundleNumber))
	    return false;
	if (!this.bundleId.equalTo(that.bundleId))
	    return false;
	if (!this.isdRecords.equalTo(that.isdRecords))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public IntersectionBundle clone() {
	IntersectionBundle copy = (IntersectionBundle)super.clone();
	copy.bundleNumber = bundleNumber.clone();
	copy.bundleId = bundleId.clone();
	copy.isdRecords = isdRecords.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.bundleNumber != null ? this.bundleNumber.hashCode() : 0);
	hash = 41 * hash + (this.bundleId != null ? this.bundleId.hashCode() : 0);
	hash = 41 * hash + (this.isdRecords != null ? this.isdRecords.hashCode() : 0);
	return hash;
    }
} // End class definition for IntersectionBundle
