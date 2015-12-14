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
 * Define the ASN1 Type PathHistory from ASN1 Module DSRC.
 * @see Sequence
 */

public class PathHistory extends Sequence {
    public FullPositionVector initialPosition;
    public GPSstatus currGPSstatus;
    public Count itemCnt;
    public CrumbData crumbData;
    
    /**
     * The default constructor.
     */
    public PathHistory()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PathHistory(FullPositionVector initialPosition, 
		    GPSstatus currGPSstatus, Count itemCnt, 
		    CrumbData crumbData)
    {
	setInitialPosition(initialPosition);
	setCurrGPSstatus(currGPSstatus);
	setItemCnt(itemCnt);
	setCrumbData(crumbData);
    }
    
    /**
     * Construct with required components.
     */
    public PathHistory(CrumbData crumbData)
    {
	setCrumbData(crumbData);
    }
    
    
    // Methods for field "initialPosition"
    public FullPositionVector getInitialPosition()
    {
	return this.initialPosition;
    }
    
    public void setInitialPosition(FullPositionVector initialPosition)
    {
	this.initialPosition = initialPosition;
    }
    
    public boolean hasInitialPosition()
    {
	return (initialPosition != null);
    }
    
    public void deleteInitialPosition()
    {
	initialPosition = null;
    }
    
    
    // Methods for field "currGPSstatus"
    public GPSstatus getCurrGPSstatus()
    {
	return this.currGPSstatus;
    }
    
    public void setCurrGPSstatus(GPSstatus currGPSstatus)
    {
	this.currGPSstatus = currGPSstatus;
    }
    
    public boolean hasCurrGPSstatus()
    {
	return (currGPSstatus != null);
    }
    
    public void deleteCurrGPSstatus()
    {
	currGPSstatus = null;
    }
    
    
    // Methods for field "itemCnt"
    public Count getItemCnt()
    {
	return this.itemCnt;
    }
    
    public void setItemCnt(Count itemCnt)
    {
	this.itemCnt = itemCnt;
    }
    
    public boolean hasItemCnt()
    {
	return (itemCnt != null);
    }
    
    public void deleteItemCnt()
    {
	itemCnt = null;
    }
    
    
    // Methods for field "crumbData"
    public CrumbData getCrumbData()
    {
	return this.crumbData;
    }
    
    public void setCrumbData(CrumbData crumbData)
    {
	this.crumbData = crumbData;
    }
    
    
    
    /**
     * Define the ASN1 Type CrumbData from ASN1 Module DSRC.
     * @see Choice
     */
    public static class CrumbData extends Choice {
	
	/**
	 * The default constructor.
	 */
	public CrumbData()
	{
	}
	
	public static final  int  pathHistoryPointSets_01_chosen = 1;
	public static final  int  pathHistoryPointSets_02_chosen = 2;
	public static final  int  pathHistoryPointSets_03_chosen = 3;
	public static final  int  pathHistoryPointSets_04_chosen = 4;
	public static final  int  pathHistoryPointSets_05_chosen = 5;
	public static final  int  pathHistoryPointSets_06_chosen = 6;
	public static final  int  pathHistoryPointSets_07_chosen = 7;
	public static final  int  pathHistoryPointSets_08_chosen = 8;
	public static final  int  pathHistoryPointSets_09_chosen = 9;
	public static final  int  pathHistoryPointSets_10_chosen = 10;
	
	// Methods for field "pathHistoryPointSets_01"
	public static CrumbData createCrumbDataWithPathHistoryPointSets_01(PathHistoryPointSets_01 pathHistoryPointSets_01)
	{
	    CrumbData __object = new CrumbData();

	    __object.setPathHistoryPointSets_01(pathHistoryPointSets_01);
	    return __object;
	}
	
	public boolean hasPathHistoryPointSets_01()
	{
	    return getChosenFlag() == pathHistoryPointSets_01_chosen;
	}
	
	public PathHistoryPointSets_01 getPathHistoryPointSets_01()
	{
	    if (hasPathHistoryPointSets_01())
		return (PathHistoryPointSets_01)mChosenValue;
	    else
		return null;
	}
	
	public void setPathHistoryPointSets_01(PathHistoryPointSets_01 pathHistoryPointSets_01)
	{
	    setChosenValue(pathHistoryPointSets_01);
	    setChosenFlag(pathHistoryPointSets_01_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type PathHistoryPointSets_01 from ASN1 Module DSRC.
	 * @see SequenceOf
	 */
	public static class PathHistoryPointSets_01 extends SequenceOf {
	    
	    /**
	     * The default constructor.
	     */
	    public PathHistoryPointSets_01()
	    {
		this.elements = new java.util.ArrayList<PathHistoryPointType_01>();
	    }
	    
	    
	    /**
	     * Construct from an array of components.
	     */
	    public java.util.ArrayList<PathHistoryPointType_01> elements;

	    public PathHistoryPointSets_01(PathHistoryPointType_01[] elements)
	    {
		this.elements = new java.util.ArrayList<PathHistoryPointType_01>(java.util.Arrays.asList(elements));
	    }
	    
	    /**
	     * Add an Element to the SEQUENCE OF/SET OF.
	     */
	    public synchronized void add(PathHistoryPointType_01 element)
	    {
		elements.add(element);
	    }
	    
	    /**
	     * Set an Element in the SEQUENCE OF/SET OF.
	     */
	    public synchronized void set(PathHistoryPointType_01 element, int atIndex)
	    {
		elements.set(atIndex, element);
	    }
	    
	    /**
	     * Get an Element from the SEQUENCE OF/SET OF.
	     */
	    public synchronized PathHistoryPointType_01 get(int atIndex)
	    {
		return (PathHistoryPointType_01)elements.get(atIndex);
	    }
	    
	    /**
	     * Insert an Element into the SEQUENCE OF/SET OF.
	     */
	    public synchronized void insert(PathHistoryPointType_01 element, int atIndex)
	    {
		elements.add(atIndex, element);
	    }
	    
	    /**
	     * Remove an Element from the SEQUENCE OF/SET OF.
	     */
	    public synchronized void remove(PathHistoryPointType_01 element)
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
	    public static int encodeValue(PerCoder coder, OutputBitStream sink, PathHistoryPointSets_01 data)
		    throws IOException, EncoderException, EncodeFailedException
	    {
		int total_len0 = data.elements.size();
		int fragmentLength0;
		boolean moreFragments0;
		int idx0 = 0;
		int nbits = 0;

		if (total_len0 < 1 || total_len0 > 23)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + total_len0);
		nbits += coder.encodeLengthDeterminant(total_len0, 1, 23, sink);
		moreFragments0 = coder.moreFragments();
		fragmentLength0 = (moreFragments0 ? coder.fragmentLength() : total_len0);
		while (total_len0 > 0) {
		    try {
			PathHistoryPointType_01 item1 = data.elements.get(idx0);

			nbits += PathHistoryPointType_01.encodeValue(coder, sink, item1);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext(null, "PathHistoryPointType-01", idx0);
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
	    public static PathHistoryPointSets_01 decodeValue(PerCoder coder, InputBitStream source, PathHistoryPointSets_01 data)
		    throws IOException, DecoderException, DecodeFailedException
	    {
		int total_len0 = 0;
		int fragmentLength0;
		boolean moreFragments0;
		int idx0 = 0;

		idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, 1, 23);
		if (fragmentLength0 > 23)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + fragmentLength0);
		moreFragments0 = coder.moreFragments();
		if (data.elements != null)
		    data.elements.clear();
		else
		    data.elements = new java.util.ArrayList<PathHistoryPointType_01>(fragmentLength0);
		while (idx0 > 0) {
		    try {
			PathHistoryPointType_01 item1 = new PathHistoryPointType_01();

			data.elements.add(item1);
			item1.decodeValue(coder, source, item1);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext(null, "PathHistoryPointType-01", total_len0);
			throw de;
		    }
		    --idx0; ++total_len0;
		    if (idx0 == 0) {
			if (moreFragments0) {
			    idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, fragmentLength0);
			    moreFragments0 = coder.moreFragments();
			    if ((total_len0 + fragmentLength0) > 23)
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
		return equalTo((PathHistoryPointSets_01)that);
	    }
	    
	    public boolean equalTo(SequenceOf that)
	    {
		return equalTo((PathHistoryPointSets_01)that);
	    }
	    
	    public boolean equalTo(PathHistoryPointSets_01 that) {
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
	    public PathHistoryPointSets_01 clone() {
		PathHistoryPointSets_01 copy = (PathHistoryPointSets_01)super.clone();
		copy.elements = new java.util.ArrayList<PathHistoryPointType_01>(elements.size());
		for (PathHistoryPointType_01 element : elements) {
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
	} // End class definition for PathHistoryPointSets_01

	// Methods for field "pathHistoryPointSets_02"
	public static CrumbData createCrumbDataWithPathHistoryPointSets_02(OctetString pathHistoryPointSets_02)
	{
	    CrumbData __object = new CrumbData();

	    __object.setPathHistoryPointSets_02(pathHistoryPointSets_02);
	    return __object;
	}
	
	public boolean hasPathHistoryPointSets_02()
	{
	    return getChosenFlag() == pathHistoryPointSets_02_chosen;
	}
	
	public OctetString getPathHistoryPointSets_02()
	{
	    if (hasPathHistoryPointSets_02())
		return (OctetString)mChosenValue;
	    else
		return null;
	}
	
	public void setPathHistoryPointSets_02(OctetString pathHistoryPointSets_02)
	{
	    setChosenValue(pathHistoryPointSets_02);
	    setChosenFlag(pathHistoryPointSets_02_chosen);
	}
	
	
	// Methods for field "pathHistoryPointSets_03"
	public static CrumbData createCrumbDataWithPathHistoryPointSets_03(OctetString pathHistoryPointSets_03)
	{
	    CrumbData __object = new CrumbData();

	    __object.setPathHistoryPointSets_03(pathHistoryPointSets_03);
	    return __object;
	}
	
	public boolean hasPathHistoryPointSets_03()
	{
	    return getChosenFlag() == pathHistoryPointSets_03_chosen;
	}
	
	public OctetString getPathHistoryPointSets_03()
	{
	    if (hasPathHistoryPointSets_03())
		return (OctetString)mChosenValue;
	    else
		return null;
	}
	
	public void setPathHistoryPointSets_03(OctetString pathHistoryPointSets_03)
	{
	    setChosenValue(pathHistoryPointSets_03);
	    setChosenFlag(pathHistoryPointSets_03_chosen);
	}
	
	
	// Methods for field "pathHistoryPointSets_04"
	public static CrumbData createCrumbDataWithPathHistoryPointSets_04(OctetString pathHistoryPointSets_04)
	{
	    CrumbData __object = new CrumbData();

	    __object.setPathHistoryPointSets_04(pathHistoryPointSets_04);
	    return __object;
	}
	
	public boolean hasPathHistoryPointSets_04()
	{
	    return getChosenFlag() == pathHistoryPointSets_04_chosen;
	}
	
	public OctetString getPathHistoryPointSets_04()
	{
	    if (hasPathHistoryPointSets_04())
		return (OctetString)mChosenValue;
	    else
		return null;
	}
	
	public void setPathHistoryPointSets_04(OctetString pathHistoryPointSets_04)
	{
	    setChosenValue(pathHistoryPointSets_04);
	    setChosenFlag(pathHistoryPointSets_04_chosen);
	}
	
	
	// Methods for field "pathHistoryPointSets_05"
	public static CrumbData createCrumbDataWithPathHistoryPointSets_05(OctetString pathHistoryPointSets_05)
	{
	    CrumbData __object = new CrumbData();

	    __object.setPathHistoryPointSets_05(pathHistoryPointSets_05);
	    return __object;
	}
	
	public boolean hasPathHistoryPointSets_05()
	{
	    return getChosenFlag() == pathHistoryPointSets_05_chosen;
	}
	
	public OctetString getPathHistoryPointSets_05()
	{
	    if (hasPathHistoryPointSets_05())
		return (OctetString)mChosenValue;
	    else
		return null;
	}
	
	public void setPathHistoryPointSets_05(OctetString pathHistoryPointSets_05)
	{
	    setChosenValue(pathHistoryPointSets_05);
	    setChosenFlag(pathHistoryPointSets_05_chosen);
	}
	
	
	// Methods for field "pathHistoryPointSets_06"
	public static CrumbData createCrumbDataWithPathHistoryPointSets_06(OctetString pathHistoryPointSets_06)
	{
	    CrumbData __object = new CrumbData();

	    __object.setPathHistoryPointSets_06(pathHistoryPointSets_06);
	    return __object;
	}
	
	public boolean hasPathHistoryPointSets_06()
	{
	    return getChosenFlag() == pathHistoryPointSets_06_chosen;
	}
	
	public OctetString getPathHistoryPointSets_06()
	{
	    if (hasPathHistoryPointSets_06())
		return (OctetString)mChosenValue;
	    else
		return null;
	}
	
	public void setPathHistoryPointSets_06(OctetString pathHistoryPointSets_06)
	{
	    setChosenValue(pathHistoryPointSets_06);
	    setChosenFlag(pathHistoryPointSets_06_chosen);
	}
	
	
	// Methods for field "pathHistoryPointSets_07"
	public static CrumbData createCrumbDataWithPathHistoryPointSets_07(OctetString pathHistoryPointSets_07)
	{
	    CrumbData __object = new CrumbData();

	    __object.setPathHistoryPointSets_07(pathHistoryPointSets_07);
	    return __object;
	}
	
	public boolean hasPathHistoryPointSets_07()
	{
	    return getChosenFlag() == pathHistoryPointSets_07_chosen;
	}
	
	public OctetString getPathHistoryPointSets_07()
	{
	    if (hasPathHistoryPointSets_07())
		return (OctetString)mChosenValue;
	    else
		return null;
	}
	
	public void setPathHistoryPointSets_07(OctetString pathHistoryPointSets_07)
	{
	    setChosenValue(pathHistoryPointSets_07);
	    setChosenFlag(pathHistoryPointSets_07_chosen);
	}
	
	
	// Methods for field "pathHistoryPointSets_08"
	public static CrumbData createCrumbDataWithPathHistoryPointSets_08(OctetString pathHistoryPointSets_08)
	{
	    CrumbData __object = new CrumbData();

	    __object.setPathHistoryPointSets_08(pathHistoryPointSets_08);
	    return __object;
	}
	
	public boolean hasPathHistoryPointSets_08()
	{
	    return getChosenFlag() == pathHistoryPointSets_08_chosen;
	}
	
	public OctetString getPathHistoryPointSets_08()
	{
	    if (hasPathHistoryPointSets_08())
		return (OctetString)mChosenValue;
	    else
		return null;
	}
	
	public void setPathHistoryPointSets_08(OctetString pathHistoryPointSets_08)
	{
	    setChosenValue(pathHistoryPointSets_08);
	    setChosenFlag(pathHistoryPointSets_08_chosen);
	}
	
	
	// Methods for field "pathHistoryPointSets_09"
	public static CrumbData createCrumbDataWithPathHistoryPointSets_09(OctetString pathHistoryPointSets_09)
	{
	    CrumbData __object = new CrumbData();

	    __object.setPathHistoryPointSets_09(pathHistoryPointSets_09);
	    return __object;
	}
	
	public boolean hasPathHistoryPointSets_09()
	{
	    return getChosenFlag() == pathHistoryPointSets_09_chosen;
	}
	
	public OctetString getPathHistoryPointSets_09()
	{
	    if (hasPathHistoryPointSets_09())
		return (OctetString)mChosenValue;
	    else
		return null;
	}
	
	public void setPathHistoryPointSets_09(OctetString pathHistoryPointSets_09)
	{
	    setChosenValue(pathHistoryPointSets_09);
	    setChosenFlag(pathHistoryPointSets_09_chosen);
	}
	
	
	// Methods for field "pathHistoryPointSets_10"
	public static CrumbData createCrumbDataWithPathHistoryPointSets_10(OctetString pathHistoryPointSets_10)
	{
	    CrumbData __object = new CrumbData();

	    __object.setPathHistoryPointSets_10(pathHistoryPointSets_10);
	    return __object;
	}
	
	public boolean hasPathHistoryPointSets_10()
	{
	    return getChosenFlag() == pathHistoryPointSets_10_chosen;
	}
	
	public OctetString getPathHistoryPointSets_10()
	{
	    if (hasPathHistoryPointSets_10())
		return (OctetString)mChosenValue;
	    else
		return null;
	}
	
	public void setPathHistoryPointSets_10(OctetString pathHistoryPointSets_10)
	{
	    setChosenValue(pathHistoryPointSets_10);
	    setChosenFlag(pathHistoryPointSets_10_chosen);
	}
	
	
	/**
	 * Implements PER value encoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public static int encodeValue(PerCoder coder, OutputBitStream sink, CrumbData data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int idx0 = data.mChosenFlag;
	    int nbits = 0;

	    if (idx0 < 1 || idx0 > 10)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._bad_choice, null, idx0);
	    nbits += coder.encodeConstrainedWholeNumber(idx0 - 1, 0, 9, sink);
	    switch (idx0) {
		case pathHistoryPointSets_01_chosen:
		    // Encode alternative 'pathHistoryPointSets-01'
		    try {
			PathHistoryPointSets_01 item1 = (PathHistoryPointSets_01)data.mChosenValue;

			nbits += PathHistoryPointSets_01.encodeValue(coder, sink, item1);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("pathHistoryPointSets-01", "SEQUENCE OF", 0);
			throw ee;
		    }
		    break;
		case pathHistoryPointSets_02_chosen:
		    // Encode alternative 'pathHistoryPointSets-02'
		    try {
			OctetString item1 = (OctetString)data.mChosenValue;
			int len1 = item1.getSize();

			if (len1 < 15 || len1 > 345)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
			nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 15, 345, sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("pathHistoryPointSets-02", "OCTET STRING", 0);
			throw ee;
		    }
		    break;
		case pathHistoryPointSets_03_chosen:
		    // Encode alternative 'pathHistoryPointSets-03'
		    try {
			OctetString item1 = (OctetString)data.mChosenValue;
			int len1 = item1.getSize();

			if (len1 < 12 || len1 > 276)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
			nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 12, 276, sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("pathHistoryPointSets-03", "OCTET STRING", 0);
			throw ee;
		    }
		    break;
		case pathHistoryPointSets_04_chosen:
		    // Encode alternative 'pathHistoryPointSets-04'
		    try {
			OctetString item1 = (OctetString)data.mChosenValue;
			int len1 = item1.getSize();

			if (len1 < 8 || len1 > 184)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
			nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 8, 184, sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("pathHistoryPointSets-04", "OCTET STRING", 0);
			throw ee;
		    }
		    break;
		case pathHistoryPointSets_05_chosen:
		    // Encode alternative 'pathHistoryPointSets-05'
		    try {
			OctetString item1 = (OctetString)data.mChosenValue;
			int len1 = item1.getSize();

			if (len1 < 10 || len1 > 230)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
			nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 10, 230, sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("pathHistoryPointSets-05", "OCTET STRING", 0);
			throw ee;
		    }
		    break;
		case pathHistoryPointSets_06_chosen:
		    // Encode alternative 'pathHistoryPointSets-06'
		    try {
			OctetString item1 = (OctetString)data.mChosenValue;
			int len1 = item1.getSize();

			if (len1 < 6 || len1 > 138)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
			nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 6, 138, sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("pathHistoryPointSets-06", "OCTET STRING", 0);
			throw ee;
		    }
		    break;
		case pathHistoryPointSets_07_chosen:
		    // Encode alternative 'pathHistoryPointSets-07'
		    try {
			OctetString item1 = (OctetString)data.mChosenValue;
			int len1 = item1.getSize();

			if (len1 < 11 || len1 > 242)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
			nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 11, 242, sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("pathHistoryPointSets-07", "OCTET STRING", 0);
			throw ee;
		    }
		    break;
		case pathHistoryPointSets_08_chosen:
		    // Encode alternative 'pathHistoryPointSets-08'
		    try {
			OctetString item1 = (OctetString)data.mChosenValue;
			int len1 = item1.getSize();

			if (len1 < 7 || len1 > 161)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
			nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 7, 161, sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("pathHistoryPointSets-08", "OCTET STRING", 0);
			throw ee;
		    }
		    break;
		case pathHistoryPointSets_09_chosen:
		    // Encode alternative 'pathHistoryPointSets-09'
		    try {
			OctetString item1 = (OctetString)data.mChosenValue;
			int len1 = item1.getSize();

			if (len1 < 9 || len1 > 196)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
			nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 9, 196, sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("pathHistoryPointSets-09", "OCTET STRING", 0);
			throw ee;
		    }
		    break;
		case pathHistoryPointSets_10_chosen:
		    // Encode alternative 'pathHistoryPointSets-10'
		    try {
			OctetString item1 = (OctetString)data.mChosenValue;
			int len1 = item1.getSize();

			if (len1 < 5 || len1 > 104)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
			nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 5, 104, sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("pathHistoryPointSets-10", "OCTET STRING", 0);
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
	public static CrumbData decodeValue(PerCoder coder, InputBitStream source, CrumbData data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    int idx0 = 0;

	    idx0 = (int)coder.decodeConstrainedWholeNumber(source, 0, 9) + 1;
	    if (idx0 < 1 || idx0 > 10)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._bad_choice, null, idx0);
	    data.mChosenFlag = idx0;
	    switch (idx0) {
		case pathHistoryPointSets_01_chosen:
		    // Decode alternative 'pathHistoryPointSets-01'
		    try {
			PathHistoryPointSets_01 item1 = new PathHistoryPointSets_01();

			// Decode alternative 'pathHistoryPointSets-01'
			data.mChosenValue = item1;
			item1.decodeValue(coder, source, item1);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("pathHistoryPointSets-01", "SEQUENCE OF", 0);
			throw de;
		    }
		    break;
		case pathHistoryPointSets_02_chosen:
		    // Decode alternative 'pathHistoryPointSets-02'
		    try {
			OctetString item1;

			// Decode alternative 'pathHistoryPointSets-02'
			item1 = new OctetString(com.oss.coders.per.PerOctets.decode(coder, source, 15, 345));
			data.mChosenValue = item1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("pathHistoryPointSets-02", "OCTET STRING", 0);
			throw de;
		    }
		    break;
		case pathHistoryPointSets_03_chosen:
		    // Decode alternative 'pathHistoryPointSets-03'
		    try {
			OctetString item1;

			// Decode alternative 'pathHistoryPointSets-03'
			item1 = new OctetString(com.oss.coders.per.PerOctets.decode(coder, source, 12, 276));
			data.mChosenValue = item1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("pathHistoryPointSets-03", "OCTET STRING", 0);
			throw de;
		    }
		    break;
		case pathHistoryPointSets_04_chosen:
		    // Decode alternative 'pathHistoryPointSets-04'
		    try {
			OctetString item1;

			// Decode alternative 'pathHistoryPointSets-04'
			item1 = new OctetString(com.oss.coders.per.PerOctets.decode(coder, source, 8, 184));
			data.mChosenValue = item1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("pathHistoryPointSets-04", "OCTET STRING", 0);
			throw de;
		    }
		    break;
		case pathHistoryPointSets_05_chosen:
		    // Decode alternative 'pathHistoryPointSets-05'
		    try {
			OctetString item1;

			// Decode alternative 'pathHistoryPointSets-05'
			item1 = new OctetString(com.oss.coders.per.PerOctets.decode(coder, source, 10, 230));
			data.mChosenValue = item1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("pathHistoryPointSets-05", "OCTET STRING", 0);
			throw de;
		    }
		    break;
		case pathHistoryPointSets_06_chosen:
		    // Decode alternative 'pathHistoryPointSets-06'
		    try {
			OctetString item1;

			// Decode alternative 'pathHistoryPointSets-06'
			item1 = new OctetString(com.oss.coders.per.PerOctets.decode(coder, source, 6, 138));
			data.mChosenValue = item1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("pathHistoryPointSets-06", "OCTET STRING", 0);
			throw de;
		    }
		    break;
		case pathHistoryPointSets_07_chosen:
		    // Decode alternative 'pathHistoryPointSets-07'
		    try {
			OctetString item1;

			// Decode alternative 'pathHistoryPointSets-07'
			item1 = new OctetString(com.oss.coders.per.PerOctets.decode(coder, source, 11, 242));
			data.mChosenValue = item1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("pathHistoryPointSets-07", "OCTET STRING", 0);
			throw de;
		    }
		    break;
		case pathHistoryPointSets_08_chosen:
		    // Decode alternative 'pathHistoryPointSets-08'
		    try {
			OctetString item1;

			// Decode alternative 'pathHistoryPointSets-08'
			item1 = new OctetString(com.oss.coders.per.PerOctets.decode(coder, source, 7, 161));
			data.mChosenValue = item1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("pathHistoryPointSets-08", "OCTET STRING", 0);
			throw de;
		    }
		    break;
		case pathHistoryPointSets_09_chosen:
		    // Decode alternative 'pathHistoryPointSets-09'
		    try {
			OctetString item1;

			// Decode alternative 'pathHistoryPointSets-09'
			item1 = new OctetString(com.oss.coders.per.PerOctets.decode(coder, source, 9, 196));
			data.mChosenValue = item1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("pathHistoryPointSets-09", "OCTET STRING", 0);
			throw de;
		    }
		    break;
		case pathHistoryPointSets_10_chosen:
		    // Decode alternative 'pathHistoryPointSets-10'
		    try {
			OctetString item1;

			// Decode alternative 'pathHistoryPointSets-10'
			item1 = new OctetString(com.oss.coders.per.PerOctets.decode(coder, source, 5, 104));
			data.mChosenValue = item1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("pathHistoryPointSets-10", "OCTET STRING", 0);
			throw de;
		    }
		    break;
	    }
	    return data;
	}

	/**
	 * Clone 'this' object.
	 */
	public CrumbData clone() {
	    return (CrumbData)super.clone();
	}

    } // End class definition for CrumbData

    /**
     * Implements BER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encodeValue(BerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	int len0 = 0;
	PathHistory temp0 = this;

	try {
	    int len1 = 0;

	    switch (temp0.crumbData.getChosenFlag()) {
	    case CrumbData.pathHistoryPointSets_01_chosen:
		try {
		    int len2 = 0;
		    java.util.ArrayList<PathHistoryPointType_01> temp2 = ((com.bah.ode.asn.oss.dsrc.PathHistory.CrumbData.PathHistoryPointSets_01)temp0.crumbData.getChosenValue()).elements;
		    int idx2 = temp2 != null ? temp2.size() : 0;

		    try {
			while(idx2-- > 0) {
			    len2 += sink.encodeLengthTag(temp2.get(idx2).encodeValue(coder, sink), 0x30);
			}
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext(null, "SEQUENCE OF", idx2);
			throw ee;
		    }
		    len1 = sink.encodeLengthTag(len2, 0xA0);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("pathHistoryPointSets-01", "CHOICE", 0);
		    throw ee;
		}
		break;

	    case CrumbData.pathHistoryPointSets_02_chosen:
		try {
		    len1 = sink.encodeLengthTag(sink.write(((OctetString)temp0.crumbData.getChosenValue()).byteArrayValue()), 0x81);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("pathHistoryPointSets-02", "CHOICE", 0);
		    throw ee;
		}
		break;

	    case CrumbData.pathHistoryPointSets_03_chosen:
		try {
		    len1 = sink.encodeLengthTag(sink.write(((OctetString)temp0.crumbData.getChosenValue()).byteArrayValue()), 0x82);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("pathHistoryPointSets-03", "CHOICE", 0);
		    throw ee;
		}
		break;

	    case CrumbData.pathHistoryPointSets_04_chosen:
		try {
		    len1 = sink.encodeLengthTag(sink.write(((OctetString)temp0.crumbData.getChosenValue()).byteArrayValue()), 0x83);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("pathHistoryPointSets-04", "CHOICE", 0);
		    throw ee;
		}
		break;

	    case CrumbData.pathHistoryPointSets_05_chosen:
		try {
		    len1 = sink.encodeLengthTag(sink.write(((OctetString)temp0.crumbData.getChosenValue()).byteArrayValue()), 0x84);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("pathHistoryPointSets-05", "CHOICE", 0);
		    throw ee;
		}
		break;

	    case CrumbData.pathHistoryPointSets_06_chosen:
		try {
		    len1 = sink.encodeLengthTag(sink.write(((OctetString)temp0.crumbData.getChosenValue()).byteArrayValue()), 0x85);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("pathHistoryPointSets-06", "CHOICE", 0);
		    throw ee;
		}
		break;

	    case CrumbData.pathHistoryPointSets_07_chosen:
		try {
		    len1 = sink.encodeLengthTag(sink.write(((OctetString)temp0.crumbData.getChosenValue()).byteArrayValue()), 0x86);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("pathHistoryPointSets-07", "CHOICE", 0);
		    throw ee;
		}
		break;

	    case CrumbData.pathHistoryPointSets_08_chosen:
		try {
		    len1 = sink.encodeLengthTag(sink.write(((OctetString)temp0.crumbData.getChosenValue()).byteArrayValue()), 0x87);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("pathHistoryPointSets-08", "CHOICE", 0);
		    throw ee;
		}
		break;

	    case CrumbData.pathHistoryPointSets_09_chosen:
		try {
		    len1 = sink.encodeLengthTag(sink.write(((OctetString)temp0.crumbData.getChosenValue()).byteArrayValue()), 0x88);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("pathHistoryPointSets-09", "CHOICE", 0);
		    throw ee;
		}
		break;

	    case CrumbData.pathHistoryPointSets_10_chosen:
		try {
		    len1 = sink.encodeLengthTag(sink.write(((OctetString)temp0.crumbData.getChosenValue()).byteArrayValue()), 0x89);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("pathHistoryPointSets-10", "CHOICE", 0);
		    throw ee;
		}
		break;

	    default:
		throw new EncoderException(ExceptionDescriptor._bad_choice, null);
	    }
	    len0 += sink.encodeLengthTag(len1, 0xA3);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("crumbData", "CHOICE");
	    throw ee;
	}
	if (temp0.itemCnt != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.itemCnt, sink), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("itemCnt", "Count");
		throw ee;
	    }
	}
	if (temp0.currGPSstatus != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeBitString(temp0.currGPSstatus, sink), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("currGPSstatus", "GPSstatus");
		throw ee;
	    }
	}
	if (temp0.initialPosition != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.initialPosition.encodeValue(coder, sink), 0xA0);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("initialPosition", "FullPositionVector");
		throw ee;
	    }
	}

	return len0;
    }

    /**
     * Implements BER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public PathHistory decodeValue(BerCoder coder, DecoderInput source)
	    throws DecoderException
    {
	int total_len0 = source.mLength;
	int end_pos0 = (total_len0 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len0);
	int tag;

	do {
	    tag = source.decodeTagLength();
	    if (tag == 0xA0) {
		try {
		    this.initialPosition = new FullPositionVector();
		    this.initialPosition.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("initialPosition", "FullPositionVector");
		    throw ee;
		}
		tag = source.decodeTagLength();
	    }
	    if (tag == 0x81 || tag == 0xA1) {
		try {
		    this.currGPSstatus = new GPSstatus();
		    byte[] b = coder.decodeBitString(source);
		    this.currGPSstatus.setValue(b, b.length * 8 - coder.getUnused());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("currGPSstatus", "GPSstatus");
		    throw ee;
		}
		tag = source.decodeTagLength();
	    }
	    if (tag == 0x82) {
		try {
		    this.itemCnt = new Count(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("itemCnt", "Count");
		    throw ee;
		}
		tag = source.decodeTagLength();
	    }
	    if (tag != 0xA3)
		source.raiseTagMismatchException(tag);
	    try {
		this.crumbData = new CrumbData();
		{
		    int indef_tags1 = 0;

		    if (source.mLength < 0)
			++indef_tags1;
		    tag = source.decodeTagLength();
		    switch (tag & 0xFFFFFFDF) {
		    case 0x80:
			try {
			    this.crumbData.setChosenFlag(CrumbData.pathHistoryPointSets_01_chosen);
			    this.crumbData.setChosenValue(new com.bah.ode.asn.oss.dsrc.PathHistory.CrumbData.PathHistoryPointSets_01());
			    {
				int total_len2 = source.mLength;
				int end_pos2 = (total_len2 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len2);
				int idx2 = 0;

				((com.bah.ode.asn.oss.dsrc.PathHistory.CrumbData.PathHistoryPointSets_01)this.crumbData.getChosenValue()).elements = new java.util.ArrayList<PathHistoryPointType_01>();

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
					PathHistoryPointType_01 temp2 = new PathHistoryPointType_01();
					((com.bah.ode.asn.oss.dsrc.PathHistory.CrumbData.PathHistoryPointSets_01)this.crumbData.getChosenValue()).add(temp2);
					if (tag != 0x30)
					    source.raiseTagMismatchException(tag);
					temp2.decodeValue(coder, source);
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
			    ee.appendElementContext("pathHistoryPointSets-01", "SEQUENCE OF", 0);
			    throw ee;
			}
			break;

		    case 0x81:
			try {
			    this.crumbData.setChosenFlag(CrumbData.pathHistoryPointSets_02_chosen);
			    this.crumbData.setChosenValue(new OctetString(coder.decodeOctetString(source)));
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendElementContext("pathHistoryPointSets-02", "OCTET STRING", 0);
			    throw ee;
			}
			break;

		    case 0x82:
			try {
			    this.crumbData.setChosenFlag(CrumbData.pathHistoryPointSets_03_chosen);
			    this.crumbData.setChosenValue(new OctetString(coder.decodeOctetString(source)));
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendElementContext("pathHistoryPointSets-03", "OCTET STRING", 0);
			    throw ee;
			}
			break;

		    case 0x83:
			try {
			    this.crumbData.setChosenFlag(CrumbData.pathHistoryPointSets_04_chosen);
			    this.crumbData.setChosenValue(new OctetString(coder.decodeOctetString(source)));
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendElementContext("pathHistoryPointSets-04", "OCTET STRING", 0);
			    throw ee;
			}
			break;

		    case 0x84:
			try {
			    this.crumbData.setChosenFlag(CrumbData.pathHistoryPointSets_05_chosen);
			    this.crumbData.setChosenValue(new OctetString(coder.decodeOctetString(source)));
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendElementContext("pathHistoryPointSets-05", "OCTET STRING", 0);
			    throw ee;
			}
			break;

		    case 0x85:
			try {
			    this.crumbData.setChosenFlag(CrumbData.pathHistoryPointSets_06_chosen);
			    this.crumbData.setChosenValue(new OctetString(coder.decodeOctetString(source)));
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendElementContext("pathHistoryPointSets-06", "OCTET STRING", 0);
			    throw ee;
			}
			break;

		    case 0x86:
			try {
			    this.crumbData.setChosenFlag(CrumbData.pathHistoryPointSets_07_chosen);
			    this.crumbData.setChosenValue(new OctetString(coder.decodeOctetString(source)));
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendElementContext("pathHistoryPointSets-07", "OCTET STRING", 0);
			    throw ee;
			}
			break;

		    case 0x87:
			try {
			    this.crumbData.setChosenFlag(CrumbData.pathHistoryPointSets_08_chosen);
			    this.crumbData.setChosenValue(new OctetString(coder.decodeOctetString(source)));
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendElementContext("pathHistoryPointSets-08", "OCTET STRING", 0);
			    throw ee;
			}
			break;

		    case 0x88:
			try {
			    this.crumbData.setChosenFlag(CrumbData.pathHistoryPointSets_09_chosen);
			    this.crumbData.setChosenValue(new OctetString(coder.decodeOctetString(source)));
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendElementContext("pathHistoryPointSets-09", "OCTET STRING", 0);
			    throw ee;
			}
			break;

		    case 0x89:
			try {
			    this.crumbData.setChosenFlag(CrumbData.pathHistoryPointSets_10_chosen);
			    this.crumbData.setChosenValue(new OctetString(coder.decodeOctetString(source)));
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendElementContext("pathHistoryPointSets-10", "OCTET STRING", 0);
			    throw ee;
			}
			break;

		    default:
			source.raiseUnknownFieldException(tag);
		    }
		    if (indef_tags1 > 0)
			coder.consumeEOCs(source, indef_tags1);
		}
	    } catch (Exception e) {
		DecoderException ee = DecoderException.wrapException(e);
		ee.appendFieldContext("crumbData", "CHOICE");
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
		    ee.appendExtensionContext("PathHistory", -1);
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
	PathHistory temp0 = this;

	try {
	    int len1 = 0;

	    switch (temp0.crumbData.getChosenFlag()) {
	    case CrumbData.pathHistoryPointSets_01_chosen:
		try {
		    int len2 = 0;
		    java.util.ArrayList<PathHistoryPointType_01> temp2 = ((com.bah.ode.asn.oss.dsrc.PathHistory.CrumbData.PathHistoryPointSets_01)temp0.crumbData.getChosenValue()).elements;
		    int idx2 = temp2 != null ? temp2.size() : 0;

		    try {
			while(idx2-- > 0) {
			    len2 += sink.encodeLengthTag(temp2.get(idx2).encodeValue(coder, sink), 0x30);
			}
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext(null, "SEQUENCE OF", idx2);
			throw ee;
		    }
		    len1 = sink.encodeLengthTag(len2, 0xA0);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("pathHistoryPointSets-01", "CHOICE", 0);
		    throw ee;
		}
		break;

	    case CrumbData.pathHistoryPointSets_02_chosen:
		try {
		    len1 = sink.encodeLengthTag(sink.write(((OctetString)temp0.crumbData.getChosenValue()).byteArrayValue()), 0x81);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("pathHistoryPointSets-02", "CHOICE", 0);
		    throw ee;
		}
		break;

	    case CrumbData.pathHistoryPointSets_03_chosen:
		try {
		    len1 = sink.encodeLengthTag(sink.write(((OctetString)temp0.crumbData.getChosenValue()).byteArrayValue()), 0x82);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("pathHistoryPointSets-03", "CHOICE", 0);
		    throw ee;
		}
		break;

	    case CrumbData.pathHistoryPointSets_04_chosen:
		try {
		    len1 = sink.encodeLengthTag(sink.write(((OctetString)temp0.crumbData.getChosenValue()).byteArrayValue()), 0x83);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("pathHistoryPointSets-04", "CHOICE", 0);
		    throw ee;
		}
		break;

	    case CrumbData.pathHistoryPointSets_05_chosen:
		try {
		    len1 = sink.encodeLengthTag(sink.write(((OctetString)temp0.crumbData.getChosenValue()).byteArrayValue()), 0x84);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("pathHistoryPointSets-05", "CHOICE", 0);
		    throw ee;
		}
		break;

	    case CrumbData.pathHistoryPointSets_06_chosen:
		try {
		    len1 = sink.encodeLengthTag(sink.write(((OctetString)temp0.crumbData.getChosenValue()).byteArrayValue()), 0x85);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("pathHistoryPointSets-06", "CHOICE", 0);
		    throw ee;
		}
		break;

	    case CrumbData.pathHistoryPointSets_07_chosen:
		try {
		    len1 = sink.encodeLengthTag(sink.write(((OctetString)temp0.crumbData.getChosenValue()).byteArrayValue()), 0x86);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("pathHistoryPointSets-07", "CHOICE", 0);
		    throw ee;
		}
		break;

	    case CrumbData.pathHistoryPointSets_08_chosen:
		try {
		    len1 = sink.encodeLengthTag(sink.write(((OctetString)temp0.crumbData.getChosenValue()).byteArrayValue()), 0x87);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("pathHistoryPointSets-08", "CHOICE", 0);
		    throw ee;
		}
		break;

	    case CrumbData.pathHistoryPointSets_09_chosen:
		try {
		    len1 = sink.encodeLengthTag(sink.write(((OctetString)temp0.crumbData.getChosenValue()).byteArrayValue()), 0x88);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("pathHistoryPointSets-09", "CHOICE", 0);
		    throw ee;
		}
		break;

	    case CrumbData.pathHistoryPointSets_10_chosen:
		try {
		    len1 = sink.encodeLengthTag(sink.write(((OctetString)temp0.crumbData.getChosenValue()).byteArrayValue()), 0x89);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("pathHistoryPointSets-10", "CHOICE", 0);
		    throw ee;
		}
		break;

	    default:
		throw new EncoderException(ExceptionDescriptor._bad_choice, null);
	    }
	    len0 += sink.encodeLengthTag(len1, 0xA3);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("crumbData", "CHOICE");
	    throw ee;
	}
	if (temp0.itemCnt != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.itemCnt, sink), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("itemCnt", "Count");
		throw ee;
	    }
	}
	if (temp0.currGPSstatus != null) {
	    try {
		int bitsToTransfer = com.oss.util.BitTool.truncateTrailingZeroes(temp0.currGPSstatus);
		len0 += sink.encodeLengthTag(coder.encodeBitString(temp0.currGPSstatus, sink, bitsToTransfer), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("currGPSstatus", "GPSstatus");
		throw ee;
	    }
	}
	if (temp0.initialPosition != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.initialPosition.encodeValue(coder, sink), 0xA0);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("initialPosition", "FullPositionVector");
		throw ee;
	    }
	}

	return len0;
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, PathHistory data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.initialPosition != null);
	sink.writeBit(data.currGPSstatus != null);
	sink.writeBit(data.itemCnt != null);
	nbits += 4;
	if (data.initialPosition != null) {
	    // Encode field 'initialPosition'
	    try {
		FullPositionVector item1 = data.initialPosition;

		nbits += FullPositionVector.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("initialPosition", "FullPositionVector");
		throw ee;
	    }
	}
	if (data.currGPSstatus != null) {
	    // Encode field 'currGPSstatus'
	    try {
		GPSstatus item1 = data.currGPSstatus;
		int len1 = item1.getSize();
		int total_len1;

		total_len1 = item1.getLastBit();
		nbits += com.oss.coders.per.PerBitstring.encode(coder, item1.byteArrayValue(), len1, total_len1, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("currGPSstatus", "GPSstatus");
		throw ee;
	    }
	}
	if (data.itemCnt != null) {
	    // Encode field 'itemCnt'
	    try {
		Count item1 = data.itemCnt;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 32)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 32, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("itemCnt", "Count");
		throw ee;
	    }
	}
	// Encode field 'crumbData'
	try {
	    CrumbData item1 = data.crumbData;

	    nbits += CrumbData.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("crumbData", "CHOICE");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static PathHistory decodeValue(PerCoder coder, InputBitStream source, PathHistory data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_initialPosition0 = source.readBit();
	boolean has_currGPSstatus0 = source.readBit();
	boolean has_itemCnt0 = source.readBit();
    /** Decode root fields **/
	if (has_initialPosition0) {
	    // Decode field 'initialPosition'
	    try {
		if (data.initialPosition == null)
		    data.initialPosition = new FullPositionVector();
		data.initialPosition.decodeValue(coder, source, data.initialPosition);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("initialPosition", "FullPositionVector");
		throw de;
	    }
	} else {
	    data.initialPosition = null;
	}
	if (has_currGPSstatus0) {
	    // Decode field 'currGPSstatus'
	    try {
		if (data.currGPSstatus == null)
		    data.currGPSstatus = new GPSstatus();
		com.oss.coders.per.PerBitstring.decode(coder, source, -1, data.currGPSstatus);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("currGPSstatus", "GPSstatus");
		throw de;
	    }
	} else {
	    data.currGPSstatus = null;
	}
	if (has_itemCnt0) {
	    // Decode field 'itemCnt'
	    try {
		long temp1;

		if (data.itemCnt == null)
		    data.itemCnt = new Count();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 32);
		if (temp1 > 32)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.itemCnt.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("itemCnt", "Count");
		throw de;
	    }
	} else {
	    data.itemCnt = null;
	}
	// Decode field 'crumbData'
	try {
	    if (data.crumbData == null)
		data.crumbData = new CrumbData();
	    data.crumbData.decodeValue(coder, source, data.crumbData);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("crumbData", "CHOICE");
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
	if (this.initialPosition != null) {
	    try {
		comma0 = true;
		printer.newLine(writer);
		writer.print("initialPosition ");
		this.initialPosition.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.currGPSstatus != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("currGPSstatus ");
		printer.print(this.currGPSstatus, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.itemCnt != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("itemCnt ");
		writer.print(this.itemCnt.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("crumbData ");
	    {
		switch (this.crumbData.getChosenFlag()) {
		case CrumbData.pathHistoryPointSets_01_chosen:
		    try {
			writer.print("pathHistoryPointSets-01 : ");
			{
			    java.util.ArrayList<PathHistoryPointType_01> temp2 = ((com.bah.ode.asn.oss.dsrc.PathHistory.CrumbData.PathHistoryPointSets_01)this.crumbData.getChosenValue()).elements;
			    int len2 = temp2 != null ? temp2.size() : 0;
			    int idx2 = 0;

			    try {
				writer.print('{');
				printer.indent();
				for (idx2 = 0; idx2 < len2; idx2++){
				    if (idx2 > 0)
					writer.print(',');
				    printer.newLine(writer);
				    temp2.get(idx2).printValue(printer, writer);
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

		case CrumbData.pathHistoryPointSets_02_chosen:
		    try {
			writer.print("pathHistoryPointSets-02 : ");
			printer.print(((OctetString)this.crumbData.getChosenValue()), writer);
		    } catch (Exception e) {
			printer.reportError(e, null, writer);
		    }
		    break;

		case CrumbData.pathHistoryPointSets_03_chosen:
		    try {
			writer.print("pathHistoryPointSets-03 : ");
			printer.print(((OctetString)this.crumbData.getChosenValue()), writer);
		    } catch (Exception e) {
			printer.reportError(e, null, writer);
		    }
		    break;

		case CrumbData.pathHistoryPointSets_04_chosen:
		    try {
			writer.print("pathHistoryPointSets-04 : ");
			printer.print(((OctetString)this.crumbData.getChosenValue()), writer);
		    } catch (Exception e) {
			printer.reportError(e, null, writer);
		    }
		    break;

		case CrumbData.pathHistoryPointSets_05_chosen:
		    try {
			writer.print("pathHistoryPointSets-05 : ");
			printer.print(((OctetString)this.crumbData.getChosenValue()), writer);
		    } catch (Exception e) {
			printer.reportError(e, null, writer);
		    }
		    break;

		case CrumbData.pathHistoryPointSets_06_chosen:
		    try {
			writer.print("pathHistoryPointSets-06 : ");
			printer.print(((OctetString)this.crumbData.getChosenValue()), writer);
		    } catch (Exception e) {
			printer.reportError(e, null, writer);
		    }
		    break;

		case CrumbData.pathHistoryPointSets_07_chosen:
		    try {
			writer.print("pathHistoryPointSets-07 : ");
			printer.print(((OctetString)this.crumbData.getChosenValue()), writer);
		    } catch (Exception e) {
			printer.reportError(e, null, writer);
		    }
		    break;

		case CrumbData.pathHistoryPointSets_08_chosen:
		    try {
			writer.print("pathHistoryPointSets-08 : ");
			printer.print(((OctetString)this.crumbData.getChosenValue()), writer);
		    } catch (Exception e) {
			printer.reportError(e, null, writer);
		    }
		    break;

		case CrumbData.pathHistoryPointSets_09_chosen:
		    try {
			writer.print("pathHistoryPointSets-09 : ");
			printer.print(((OctetString)this.crumbData.getChosenValue()), writer);
		    } catch (Exception e) {
			printer.reportError(e, null, writer);
		    }
		    break;

		case CrumbData.pathHistoryPointSets_10_chosen:
		    try {
			writer.print("pathHistoryPointSets-10 : ");
			printer.print(((OctetString)this.crumbData.getChosenValue()), writer);
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
	printer.newLine(writer);
	writer.print('}');
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((PathHistory)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((PathHistory)that);
    }
    
    public boolean equalTo(PathHistory that) {
	if (this.initialPosition != null && that.initialPosition != null) {
	    if (!this.initialPosition.equalTo(that.initialPosition))
		return false;
	}
	if (this.currGPSstatus != null && that.currGPSstatus != null) {
	    if (!this.currGPSstatus.equalTo(that.currGPSstatus))
		return false;
	}
	if (this.itemCnt != null && that.itemCnt != null) {
	    if (!this.itemCnt.equalTo(that.itemCnt))
		return false;
	}
	if (!this.crumbData.equalTo(that.crumbData))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public PathHistory clone() {
	PathHistory copy = (PathHistory)super.clone();
	if (initialPosition != null) {
	    copy.initialPosition = initialPosition.clone();
	}
	if (currGPSstatus != null) {
	    copy.currGPSstatus = currGPSstatus.clone();
	}
	if (itemCnt != null) {
	    copy.itemCnt = itemCnt.clone();
	}
	copy.crumbData = crumbData.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.initialPosition != null ? this.initialPosition.hashCode() : 0);
	hash = 41 * hash + (this.currGPSstatus != null ? this.currGPSstatus.hashCode() : 0);
	hash = 41 * hash + (this.itemCnt != null ? this.itemCnt.hashCode() : 0);
	hash = 41 * hash + (this.crumbData != null ? this.crumbData.hashCode() : 0);
	return hash;
    }
} // End class definition for PathHistory
