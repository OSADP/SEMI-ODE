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
 * Define the ASN1 Type ProbeDataManagement from ASN1 Module DSRC.
 * @see Sequence
 */

public class ProbeDataManagement extends Sequence implements BEREncodable, BERDecodable, DEREncodable, PEREncodable, PERDecodable {
    public DSRCmsgID msgID;
    public Sample sample;
    public HeadingSlice directions;
    public Term term;
    public Snapshot snapshot;
    public TxTime txInterval;
    public Count cntTthreshold;
    public DataElements dataElements;
    
    /**
     * The default constructor.
     */
    public ProbeDataManagement()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ProbeDataManagement(DSRCmsgID msgID, Sample sample, 
		    HeadingSlice directions, Term term, Snapshot snapshot, 
		    TxTime txInterval, Count cntTthreshold, 
		    DataElements dataElements)
    {
	setMsgID(msgID);
	setSample(sample);
	setDirections(directions);
	setTerm(term);
	setSnapshot(snapshot);
	setTxInterval(txInterval);
	setCntTthreshold(cntTthreshold);
	setDataElements(dataElements);
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
    
    
    // Methods for field "sample"
    public Sample getSample()
    {
	return this.sample;
    }
    
    public void setSample(Sample sample)
    {
	this.sample = sample;
    }
    
    
    // Methods for field "directions"
    public HeadingSlice getDirections()
    {
	return this.directions;
    }
    
    public void setDirections(HeadingSlice directions)
    {
	this.directions = directions;
    }
    
    
    // Methods for field "term"
    public Term getTerm()
    {
	return this.term;
    }
    
    public void setTerm(Term term)
    {
	this.term = term;
    }
    
    
    
    /**
     * Define the ASN1 Type Term from ASN1 Module DSRC.
     * @see Choice
     */
    public static class Term extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Term()
	{
	}
	
	public static final  int  termtime_chosen = 1;
	public static final  int  termDistance_chosen = 2;
	
	// Methods for field "termtime"
	public static Term createTermWithTermtime(long termtime)
	{
	    return createTermWithTermtime(new TermTime(termtime));
	}
	
	public static Term createTermWithTermtime(TermTime termtime)
	{
	    Term __object = new Term();

	    __object.setTermtime(termtime);
	    return __object;
	}
	
	public boolean hasTermtime()
	{
	    return getChosenFlag() == termtime_chosen;
	}
	
	public TermTime getTermtime()
	{
	    if (hasTermtime())
		return (TermTime)mChosenValue;
	    else
		return null;
	}
	
	public void setTermtime(long termtime)
	{
	    setTermtime(new TermTime(termtime));
	}
	
	public void setTermtime(TermTime termtime)
	{
	    setChosenValue(termtime);
	    setChosenFlag(termtime_chosen);
	}
	
	
	// Methods for field "termDistance"
	public static Term createTermWithTermDistance(long termDistance)
	{
	    return createTermWithTermDistance(new TermDistance(termDistance));
	}
	
	public static Term createTermWithTermDistance(TermDistance termDistance)
	{
	    Term __object = new Term();

	    __object.setTermDistance(termDistance);
	    return __object;
	}
	
	public boolean hasTermDistance()
	{
	    return getChosenFlag() == termDistance_chosen;
	}
	
	public TermDistance getTermDistance()
	{
	    if (hasTermDistance())
		return (TermDistance)mChosenValue;
	    else
		return null;
	}
	
	public void setTermDistance(long termDistance)
	{
	    setTermDistance(new TermDistance(termDistance));
	}
	
	public void setTermDistance(TermDistance termDistance)
	{
	    setChosenValue(termDistance);
	    setChosenFlag(termDistance_chosen);
	}
	
	
	/**
	 * Implements PER value encoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public static int encodeValue(PerCoder coder, OutputBitStream sink, Term data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int idx0 = data.mChosenFlag;
	    int nbits = 0;

	    if (idx0 < 1 || idx0 > 2)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._bad_choice, null, idx0);
	    nbits += coder.encodeConstrainedWholeNumber(idx0 - 1, 0, 1, sink);
	    switch (idx0) {
		case termtime_chosen:
		    // Encode alternative 'termtime'
		    try {
			TermTime item1 = (TermTime)data.mChosenValue;
			long temp1 = item1.longValue();

			if (temp1 < 1 || temp1 > 1800)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
			nbits += coder.encodeConstrainedWholeNumber(temp1, 1, 1800, sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("termtime", "TermTime", 0);
			throw ee;
		    }
		    break;
		case termDistance_chosen:
		    // Encode alternative 'termDistance'
		    try {
			TermDistance item1 = (TermDistance)data.mChosenValue;
			long temp1 = item1.longValue();

			if (temp1 < 1 || temp1 > 30000)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
			nbits += coder.encodeConstrainedWholeNumber(temp1, 1, 30000, sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("termDistance", "TermDistance", 0);
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
	public static Term decodeValue(PerCoder coder, InputBitStream source, Term data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    int idx0 = 0;

	    idx0 = (int)coder.decodeConstrainedWholeNumber(source, 0, 1) + 1;
	    if (idx0 < 1 || idx0 > 2)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._bad_choice, null, idx0);
	    data.mChosenFlag = idx0;
	    switch (idx0) {
		case termtime_chosen:
		    // Decode alternative 'termtime'
		    try {
			TermTime item1 = new TermTime();
			long temp1;

			// Decode alternative 'termtime'
			temp1 = coder.decodeConstrainedWholeNumber(source, 1, 1800);
			if (temp1 > 1800)
			    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
			item1.setValue(temp1);
			data.mChosenValue = item1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("termtime", "TermTime", 0);
			throw de;
		    }
		    break;
		case termDistance_chosen:
		    // Decode alternative 'termDistance'
		    try {
			TermDistance item1 = new TermDistance();
			long temp1;

			// Decode alternative 'termDistance'
			temp1 = coder.decodeConstrainedWholeNumber(source, 1, 30000);
			if (temp1 > 30000)
			    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
			item1.setValue(temp1);
			data.mChosenValue = item1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("termDistance", "TermDistance", 0);
			throw de;
		    }
		    break;
	    }
	    return data;
	}

	/**
	 * Clone 'this' object.
	 */
	public Term clone() {
	    return (Term)super.clone();
	}

    } // End class definition for Term

    // Methods for field "snapshot"
    public Snapshot getSnapshot()
    {
	return this.snapshot;
    }
    
    public void setSnapshot(Snapshot snapshot)
    {
	this.snapshot = snapshot;
    }
    
    
    
    /**
     * Define the ASN1 Type Snapshot from ASN1 Module DSRC.
     * @see Choice
     */
    public static class Snapshot extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Snapshot()
	{
	}
	
	public static final  int  snapshotTime_chosen = 1;
	public static final  int  snapshotDistance_chosen = 2;
	
	// Methods for field "snapshotTime"
	public static Snapshot createSnapshotWithSnapshotTime(SnapshotTime snapshotTime)
	{
	    Snapshot __object = new Snapshot();

	    __object.setSnapshotTime(snapshotTime);
	    return __object;
	}
	
	public boolean hasSnapshotTime()
	{
	    return getChosenFlag() == snapshotTime_chosen;
	}
	
	public SnapshotTime getSnapshotTime()
	{
	    if (hasSnapshotTime())
		return (SnapshotTime)mChosenValue;
	    else
		return null;
	}
	
	public void setSnapshotTime(SnapshotTime snapshotTime)
	{
	    setChosenValue(snapshotTime);
	    setChosenFlag(snapshotTime_chosen);
	}
	
	
	// Methods for field "snapshotDistance"
	public static Snapshot createSnapshotWithSnapshotDistance(SnapshotDistance snapshotDistance)
	{
	    Snapshot __object = new Snapshot();

	    __object.setSnapshotDistance(snapshotDistance);
	    return __object;
	}
	
	public boolean hasSnapshotDistance()
	{
	    return getChosenFlag() == snapshotDistance_chosen;
	}
	
	public SnapshotDistance getSnapshotDistance()
	{
	    if (hasSnapshotDistance())
		return (SnapshotDistance)mChosenValue;
	    else
		return null;
	}
	
	public void setSnapshotDistance(SnapshotDistance snapshotDistance)
	{
	    setChosenValue(snapshotDistance);
	    setChosenFlag(snapshotDistance_chosen);
	}
	
	
	/**
	 * Implements PER value encoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public static int encodeValue(PerCoder coder, OutputBitStream sink, Snapshot data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int idx0 = data.mChosenFlag;
	    int nbits = 0;

	    if (idx0 < 1 || idx0 > 2)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._bad_choice, null, idx0);
	    nbits += coder.encodeConstrainedWholeNumber(idx0 - 1, 0, 1, sink);
	    switch (idx0) {
		case snapshotTime_chosen:
		    // Encode alternative 'snapshotTime'
		    try {
			SnapshotTime item1 = (SnapshotTime)data.mChosenValue;

			nbits += SnapshotTime.encodeValue(coder, sink, item1);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("snapshotTime", "SnapshotTime", 0);
			throw ee;
		    }
		    break;
		case snapshotDistance_chosen:
		    // Encode alternative 'snapshotDistance'
		    try {
			SnapshotDistance item1 = (SnapshotDistance)data.mChosenValue;

			nbits += SnapshotDistance.encodeValue(coder, sink, item1);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("snapshotDistance", "SnapshotDistance", 0);
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
	public static Snapshot decodeValue(PerCoder coder, InputBitStream source, Snapshot data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    int idx0 = 0;

	    idx0 = (int)coder.decodeConstrainedWholeNumber(source, 0, 1) + 1;
	    if (idx0 < 1 || idx0 > 2)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._bad_choice, null, idx0);
	    data.mChosenFlag = idx0;
	    switch (idx0) {
		case snapshotTime_chosen:
		    // Decode alternative 'snapshotTime'
		    try {
			SnapshotTime item1 = new SnapshotTime();

			// Decode alternative 'snapshotTime'
			data.mChosenValue = item1;
			SnapshotTime.decodeValue(coder, source, item1);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("snapshotTime", "SnapshotTime", 0);
			throw de;
		    }
		    break;
		case snapshotDistance_chosen:
		    // Decode alternative 'snapshotDistance'
		    try {
			SnapshotDistance item1 = new SnapshotDistance();

			// Decode alternative 'snapshotDistance'
			data.mChosenValue = item1;
			SnapshotDistance.decodeValue(coder, source, item1);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("snapshotDistance", "SnapshotDistance", 0);
			throw de;
		    }
		    break;
	    }
	    return data;
	}

	/**
	 * Clone 'this' object.
	 */
	public Snapshot clone() {
	    return (Snapshot)super.clone();
	}

    } // End class definition for Snapshot

    // Methods for field "txInterval"
    public TxTime getTxInterval()
    {
	return this.txInterval;
    }
    
    public void setTxInterval(TxTime txInterval)
    {
	this.txInterval = txInterval;
    }
    
    
    // Methods for field "cntTthreshold"
    public Count getCntTthreshold()
    {
	return this.cntTthreshold;
    }
    
    public void setCntTthreshold(Count cntTthreshold)
    {
	this.cntTthreshold = cntTthreshold;
    }
    
    
    // Methods for field "dataElements"
    public DataElements getDataElements()
    {
	return this.dataElements;
    }
    
    public void setDataElements(DataElements dataElements)
    {
	this.dataElements = dataElements;
    }
    
    
    
    /**
     * Define the ASN1 Type DataElements from ASN1 Module DSRC.
     * @see SequenceOf
     */
    public static class DataElements extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public DataElements()
	{
	    this.elements = new java.util.ArrayList<VehicleStatusRequest>();
	}
	
	
	/**
	 * Construct from an array of components.
	 */
	public java.util.ArrayList<VehicleStatusRequest> elements;

	public DataElements(VehicleStatusRequest[] elements)
	{
	    this.elements = new java.util.ArrayList<VehicleStatusRequest>(java.util.Arrays.asList(elements));
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(VehicleStatusRequest element)
	{
	    elements.add(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(VehicleStatusRequest element, int atIndex)
	{
	    elements.set(atIndex, element);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized VehicleStatusRequest get(int atIndex)
	{
	    return (VehicleStatusRequest)elements.get(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(VehicleStatusRequest element, int atIndex)
	{
	    elements.add(atIndex, element);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(VehicleStatusRequest element)
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
	public static int encodeValue(PerCoder coder, OutputBitStream sink, DataElements data)
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
		    VehicleStatusRequest item1 = data.elements.get(idx0);

		    nbits += VehicleStatusRequest.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "VehicleStatusRequest", idx0);
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
	public static DataElements decodeValue(PerCoder coder, InputBitStream source, DataElements data)
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
		data.elements = new java.util.ArrayList<VehicleStatusRequest>(fragmentLength0);
	    while (idx0 > 0) {
		try {
		    VehicleStatusRequest item1 = new VehicleStatusRequest();

		    data.elements.add(item1);
		    VehicleStatusRequest.decodeValue(coder, source, item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "VehicleStatusRequest", total_len0);
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
	    return equalTo((DataElements)that);
	}
	
	public boolean equalTo(SequenceOf that)
	{
	    return equalTo((DataElements)that);
	}
	
	public boolean equalTo(DataElements that) {
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
	public DataElements clone() {
	    DataElements copy = (DataElements)super.clone();
	    copy.elements = new java.util.ArrayList<VehicleStatusRequest>(elements.size());
	    for (VehicleStatusRequest element : elements) {
		copy.elements.add(element.clone());
	    }
	    return copy;
	}

    } // End class definition for DataElements

    /**
     * Encode the PDU using BER (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encode(BerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	try {
	    int len0 = 0;
	    ProbeDataManagement temp0 = this;

	    try {
		int len1 = 0;
		java.util.ArrayList<VehicleStatusRequest> temp1 = temp0.dataElements.elements;
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
		ee.appendFieldContext("dataElements", "SEQUENCE OF");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.cntTthreshold, sink), 0x86);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("cntTthreshold", "Count");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.txInterval, sink), 0x85);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("txInterval", "TxTime");
		throw ee;
	    }
	    try {
		int len1;

		switch (temp0.snapshot.getChosenFlag()) {
		case Snapshot.snapshotTime_chosen:
		    try {
			len1 = sink.encodeLengthTag(((SnapshotTime)temp0.snapshot.getChosenValue()).encodeValue(coder, sink), 0xA0);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("snapshotTime", "CHOICE", 0);
			throw ee;
		    }
		    break;

		case Snapshot.snapshotDistance_chosen:
		    try {
			len1 = sink.encodeLengthTag(((SnapshotDistance)temp0.snapshot.getChosenValue()).encodeValue(coder, sink), 0xA1);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("snapshotDistance", "CHOICE", 0);
			throw ee;
		    }
		    break;

		default:
		    throw new EncoderException(ExceptionDescriptor._bad_choice, null);
		}
		len0 += sink.encodeLengthTag(len1, 0xA4);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("snapshot", "CHOICE");
		throw ee;
	    }
	    try {
		int len1;

		switch (temp0.term.getChosenFlag()) {
		case Term.termtime_chosen:
		    try {
			len1 = sink.encodeLengthTag(coder.encodeInteger(((TermTime)temp0.term.getChosenValue()), sink), 0x80);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("termtime", "CHOICE", 0);
			throw ee;
		    }
		    break;

		case Term.termDistance_chosen:
		    try {
			len1 = sink.encodeLengthTag(coder.encodeInteger(((TermDistance)temp0.term.getChosenValue()), sink), 0x81);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("termDistance", "CHOICE", 0);
			throw ee;
		    }
		    break;

		default:
		    throw new EncoderException(ExceptionDescriptor._bad_choice, null);
		}
		len0 += sink.encodeLengthTag(len1, 0xA3);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("term", "CHOICE");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.directions.byteArrayValue()), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("directions", "HeadingSlice");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(temp0.sample.encodeValue(coder, sink), 0xA1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("sample", "Sample");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.msgID, sink), 0x80);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msgID", "DSRCmsgID");
		throw ee;
	    }

	    return sink.encodeLengthTag(len0, 0x30);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext(null, "ProbeDataManagement");
	    throw ee;
	}
    }

    /**
     * Decode the PDU using BER (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public AbstractData decode(BerCoder coder, DecoderInput source, int tag)
	    throws DecoderException
    {
	try {
	    if (tag != 0x30)
	    {
		throw new DecoderException(ExceptionDescriptor._pdu_mismatch, null, source.formatTag(tag));
	    }
	    {
		int total_len0 = source.mLength;
		int end_pos0 = (total_len0 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len0);

		do {
		    tag = source.decodeTagLength();
		    if (tag != 0x80)
			source.raiseTagMismatchException(tag);
		    try {
			int idx1 = DSRCmsgID.indexOfValue(source.decodeLong());
			this.msgID = (idx1 < 0) ? DSRCmsgID.unknownEnumerator() : DSRCmsgID.cNamedNumbers[idx1];
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("msgID", "DSRCmsgID");
			throw ee;
		    }
		    tag = source.decodeTagLength();
		    if (tag != 0xA1)
			source.raiseTagMismatchException(tag);
		    try {
			this.sample = new Sample();
			this.sample.decodeValue(coder, source);
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("sample", "Sample");
			throw ee;
		    }
		    tag = source.decodeTagLength();
		    if (tag != 0x82 && tag != 0xA2)
			source.raiseTagMismatchException(tag);
		    try {
			this.directions = new HeadingSlice(coder.decodeOctetString(source));
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("directions", "HeadingSlice");
			throw ee;
		    }
		    tag = source.decodeTagLength();
		    if (tag != 0xA3)
			source.raiseTagMismatchException(tag);
		    try {
			this.term = new Term();
			tag = source.decodeTagLength();
			switch (tag) {
			case 0x80:
			    try {
				this.term.setChosenFlag(Term.termtime_chosen);
				this.term.setChosenValue(new TermTime(source.decodeLong()));
			    } catch (Exception e) {
				DecoderException ee = DecoderException.wrapException(e);
				ee.appendElementContext("termtime", "TermTime", 0);
				throw ee;
			    }
			    break;

			case 0x81:
			    try {
				this.term.setChosenFlag(Term.termDistance_chosen);
				this.term.setChosenValue(new TermDistance(source.decodeLong()));
			    } catch (Exception e) {
				DecoderException ee = DecoderException.wrapException(e);
				ee.appendElementContext("termDistance", "TermDistance", 0);
				throw ee;
			    }
			    break;

			default:
			    source.raiseUnknownFieldException(tag);
			}
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("term", "CHOICE");
			throw ee;
		    }
		    tag = source.decodeTagLength();
		    if (tag != 0xA4)
			source.raiseTagMismatchException(tag);
		    try {
			this.snapshot = new Snapshot();
			tag = source.decodeTagLength();
			switch (tag) {
			case 0xA0:
			    try {
				this.snapshot.setChosenFlag(Snapshot.snapshotTime_chosen);
				this.snapshot.setChosenValue(new SnapshotTime());
				((SnapshotTime)this.snapshot.getChosenValue()).decodeValue(coder, source);
			    } catch (Exception e) {
				DecoderException ee = DecoderException.wrapException(e);
				ee.appendElementContext("snapshotTime", "SnapshotTime", 0);
				throw ee;
			    }
			    break;

			case 0xA1:
			    try {
				this.snapshot.setChosenFlag(Snapshot.snapshotDistance_chosen);
				this.snapshot.setChosenValue(new SnapshotDistance());
				((SnapshotDistance)this.snapshot.getChosenValue()).decodeValue(coder, source);
			    } catch (Exception e) {
				DecoderException ee = DecoderException.wrapException(e);
				ee.appendElementContext("snapshotDistance", "SnapshotDistance", 0);
				throw ee;
			    }
			    break;

			default:
			    source.raiseUnknownFieldException(tag);
			}
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("snapshot", "CHOICE");
			throw ee;
		    }
		    tag = source.decodeTagLength();
		    if (tag != 0x85)
			source.raiseTagMismatchException(tag);
		    try {
			this.txInterval = new TxTime(source.decodeLong());
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("txInterval", "TxTime");
			throw ee;
		    }
		    tag = source.decodeTagLength();
		    if (tag != 0x86)
			source.raiseTagMismatchException(tag);
		    try {
			this.cntTthreshold = new Count(source.decodeLong());
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("cntTthreshold", "Count");
			throw ee;
		    }
		    tag = source.decodeTagLength();
		    if (tag != 0xA7)
			source.raiseTagMismatchException(tag);
		    try {
			this.dataElements = new DataElements();
			{
			    int total_len1 = source.mLength;
			    int end_pos1 = (total_len1 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len1);
			    int idx1 = 0;

			    this.dataElements.elements = new java.util.ArrayList<VehicleStatusRequest>();

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
				    VehicleStatusRequest temp1 = new VehicleStatusRequest();
				    this.dataElements.add(temp1);
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
			ee.appendFieldContext("dataElements", "SEQUENCE OF");
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
			    ee.appendExtensionContext("ProbeDataManagement", -1);
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
	    }

	    return this;
	} catch (Exception e) {
	    DecoderException ee = DecoderException.wrapException(e);
	    ee.appendFieldContext(null, "ProbeDataManagement");
	    throw ee;
	}
    }

    /**
     * Encode the PDU using DER (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encode(DerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	try {
	    int len0 = 0;
	    ProbeDataManagement temp0 = this;

	    try {
		int len1 = 0;
		java.util.ArrayList<VehicleStatusRequest> temp1 = temp0.dataElements.elements;
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
		ee.appendFieldContext("dataElements", "SEQUENCE OF");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.cntTthreshold, sink), 0x86);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("cntTthreshold", "Count");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.txInterval, sink), 0x85);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("txInterval", "TxTime");
		throw ee;
	    }
	    try {
		int len1;

		switch (temp0.snapshot.getChosenFlag()) {
		case Snapshot.snapshotTime_chosen:
		    try {
			len1 = sink.encodeLengthTag(((SnapshotTime)temp0.snapshot.getChosenValue()).encodeValue(coder, sink), 0xA0);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("snapshotTime", "CHOICE", 0);
			throw ee;
		    }
		    break;

		case Snapshot.snapshotDistance_chosen:
		    try {
			len1 = sink.encodeLengthTag(((SnapshotDistance)temp0.snapshot.getChosenValue()).encodeValue(coder, sink), 0xA1);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("snapshotDistance", "CHOICE", 0);
			throw ee;
		    }
		    break;

		default:
		    throw new EncoderException(ExceptionDescriptor._bad_choice, null);
		}
		len0 += sink.encodeLengthTag(len1, 0xA4);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("snapshot", "CHOICE");
		throw ee;
	    }
	    try {
		int len1;

		switch (temp0.term.getChosenFlag()) {
		case Term.termtime_chosen:
		    try {
			len1 = sink.encodeLengthTag(coder.encodeInteger(((TermTime)temp0.term.getChosenValue()), sink), 0x80);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("termtime", "CHOICE", 0);
			throw ee;
		    }
		    break;

		case Term.termDistance_chosen:
		    try {
			len1 = sink.encodeLengthTag(coder.encodeInteger(((TermDistance)temp0.term.getChosenValue()), sink), 0x81);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("termDistance", "CHOICE", 0);
			throw ee;
		    }
		    break;

		default:
		    throw new EncoderException(ExceptionDescriptor._bad_choice, null);
		}
		len0 += sink.encodeLengthTag(len1, 0xA3);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("term", "CHOICE");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.directions.byteArrayValue()), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("directions", "HeadingSlice");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(temp0.sample.encodeValue(coder, sink), 0xA1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("sample", "Sample");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.msgID, sink), 0x80);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msgID", "DSRCmsgID");
		throw ee;
	    }

	    return sink.encodeLengthTag(len0, 0x30);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext(null, "ProbeDataManagement");
	    throw ee;
	}
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, ProbeDataManagement data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false); ++nbits;
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
	// Encode field 'sample'
	try {
	    Sample item1 = data.sample;

	    nbits += Sample.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("sample", "Sample");
	    throw ee;
	}
	// Encode field 'directions'
	try {
	    HeadingSlice item1 = data.directions;
	    int len1 = item1.getSize();

	    if (len1 != 2)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 2, 2, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("directions", "HeadingSlice");
	    throw ee;
	}
	// Encode field 'term'
	try {
	    Term item1 = data.term;

	    nbits += Term.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("term", "CHOICE");
	    throw ee;
	}
	// Encode field 'snapshot'
	try {
	    Snapshot item1 = data.snapshot;

	    nbits += Snapshot.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("snapshot", "CHOICE");
	    throw ee;
	}
	// Encode field 'txInterval'
	try {
	    TxTime item1 = data.txInterval;
	    long temp1 = item1.longValue();

	    if (temp1 < 1 || temp1 > 20)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 1, 20, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("txInterval", "TxTime");
	    throw ee;
	}
	// Encode field 'cntTthreshold'
	try {
	    Count item1 = data.cntTthreshold;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 32)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 32, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("cntTthreshold", "Count");
	    throw ee;
	}
	// Encode field 'dataElements'
	try {
	    DataElements item1 = data.dataElements;

	    nbits += DataElements.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("dataElements", "SEQUENCE OF");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Encode the PDU using PER (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encode(PerCoder coder, OutputBitStream sink)
	    throws EncoderException
    {
	try {
	    return ProbeDataManagement.encodeValue(coder, sink, this);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext(null, "ProbeDataManagement");
	    throw ee;
	}
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static ProbeDataManagement decodeValue(PerCoder coder, InputBitStream source, ProbeDataManagement data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	int idx0;
	InputBitStream bitstream0 = null;

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
	// Decode field 'sample'
	try {
	    if (data.sample == null)
		data.sample = new Sample();
	    Sample.decodeValue(coder, source, data.sample);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("sample", "Sample");
	    throw de;
	}
	// Decode field 'directions'
	try {
	    data.directions = new HeadingSlice(com.oss.coders.per.PerOctets.decode(coder, source, 2, 2));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("directions", "HeadingSlice");
	    throw de;
	}
	// Decode field 'term'
	try {
	    if (data.term == null)
		data.term = new Term();
	    Term.decodeValue(coder, source, data.term);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("term", "CHOICE");
	    throw de;
	}
	// Decode field 'snapshot'
	try {
	    if (data.snapshot == null)
		data.snapshot = new Snapshot();
	    Snapshot.decodeValue(coder, source, data.snapshot);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("snapshot", "CHOICE");
	    throw de;
	}
	// Decode field 'txInterval'
	try {
	    long temp1;

	    if (data.txInterval == null)
		data.txInterval = new TxTime();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 1, 20);
	    if (temp1 > 20)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.txInterval.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("txInterval", "TxTime");
	    throw de;
	}
	// Decode field 'cntTthreshold'
	try {
	    long temp1;

	    if (data.cntTthreshold == null)
		data.cntTthreshold = new Count();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 32);
	    if (temp1 > 32)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.cntTthreshold.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("cntTthreshold", "Count");
	    throw de;
	}
	// Decode field 'dataElements'
	try {
	    if (data.dataElements == null)
		data.dataElements = new DataElements();
	    DataElements.decodeValue(coder, source, data.dataElements);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("dataElements", "SEQUENCE OF");
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
     * Decode the PDU using PER (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public AbstractData decode(PerCoder coder, InputBitStream source)
	    throws DecoderException
    {
	try {
	    ProbeDataManagement.decodeValue(coder, source, this);
	    return this;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext(null, "ProbeDataManagement");
	    throw de;
	}
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
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("msgID ");
	    printer.print(this.msgID, writer, this.msgID.cConstantNameList);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("sample ");
	    this.sample.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("directions ");
	    printer.print(this.directions, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("term ");
	    {
		switch (this.term.getChosenFlag()) {
		case Term.termtime_chosen:
		    try {
			writer.print("termtime : ");
			writer.print(((TermTime)this.term.getChosenValue()).longValue());
		    } catch (Exception e) {
			printer.reportError(e, null, writer);
		    }
		    break;

		case Term.termDistance_chosen:
		    try {
			writer.print("termDistance : ");
			writer.print(((TermDistance)this.term.getChosenValue()).longValue());
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
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("snapshot ");
	    {
		switch (this.snapshot.getChosenFlag()) {
		case Snapshot.snapshotTime_chosen:
		    try {
			writer.print("snapshotTime : ");
			((SnapshotTime)this.snapshot.getChosenValue()).printValue(printer, writer);
		    } catch (Exception e) {
			printer.reportError(e, null, writer);
		    }
		    break;

		case Snapshot.snapshotDistance_chosen:
		    try {
			writer.print("snapshotDistance : ");
			((SnapshotDistance)this.snapshot.getChosenValue()).printValue(printer, writer);
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
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("txInterval ");
	    writer.print(this.txInterval.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("cntTthreshold ");
	    writer.print(this.cntTthreshold.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("dataElements ");
	    {
		java.util.ArrayList<VehicleStatusRequest> temp1 = this.dataElements.elements;
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
	printer.undent();
	if (comma0)
	    printer.newLine(writer);
	writer.print('}');
    }

    /**
     * Convert the PDU value to a string.
     */
    public String toString()
    {
	try {
	    return (new DataPrinter()).print(this);
	} catch (DataPrinterException e) {
	    return null;
	}
    }

    /**
     * Return the ASN.1 type name.
     */
    public String getTypeName()
    {
	return "ProbeDataManagement";
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((ProbeDataManagement)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((ProbeDataManagement)that);
    }
    
    public boolean equalTo(ProbeDataManagement that) {
	if (!this.msgID.equalTo(that.msgID))
	    return false;
	if (!this.sample.equalTo(that.sample))
	    return false;
	if (!this.directions.equalTo(that.directions))
	    return false;
	if (!this.term.equalTo(that.term))
	    return false;
	if (!this.snapshot.equalTo(that.snapshot))
	    return false;
	if (!this.txInterval.equalTo(that.txInterval))
	    return false;
	if (!this.cntTthreshold.equalTo(that.cntTthreshold))
	    return false;
	if (!this.dataElements.equalTo(that.dataElements))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public ProbeDataManagement clone() {
	ProbeDataManagement copy = (ProbeDataManagement)super.clone();
	copy.msgID = msgID.clone();
	copy.sample = sample.clone();
	copy.directions = directions.clone();
	copy.term = term.clone();
	copy.snapshot = snapshot.clone();
	copy.txInterval = txInterval.clone();
	copy.cntTthreshold = cntTthreshold.clone();
	copy.dataElements = dataElements.clone();
	return copy;
    }

    /**
     * The type is a PDU.
     */
    public boolean isPDU()
    {
	return true;
    }
    
    /**
     * This member is reserved for internal use and must not be used in the application code.
     */
    public static final ASN1Type _type = new ASN1Type() {
	public AbstractData newInstance()
	{
	    return new ProbeDataManagement();
	}
    };
    
} // End class definition for ProbeDataManagement
