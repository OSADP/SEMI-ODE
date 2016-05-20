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
/* Created: Fri May 20 15:51:02 2016 */
/* ASN.1 Compiler for Java version: 6.3 */
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
 * Define the ASN1 Type SignalStatusMessage from ASN1 Module DSRC.
 * @see Sequence
 */

public class SignalStatusMessage extends Sequence implements BEREncodable, BERDecodable, DEREncodable, PEREncodable, PERDecodable {
    public DSRCmsgID msgID;
    public MsgCount msgCnt;
    public IntersectionID id;
    public IntersectionStatusObject status;
    public Priority priority;
    public VehicleIdent priorityCause;
    public Prempt prempt;
    public VehicleIdent preemptCause;
    public TransitStatus transitStatus;
    
    /**
     * The default constructor.
     */
    public SignalStatusMessage()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SignalStatusMessage(DSRCmsgID msgID, MsgCount msgCnt, 
		    IntersectionID id, IntersectionStatusObject status, 
		    Priority priority, VehicleIdent priorityCause, 
		    Prempt prempt, VehicleIdent preemptCause, 
		    TransitStatus transitStatus)
    {
	setMsgID(msgID);
	setMsgCnt(msgCnt);
	setId(id);
	setStatus(status);
	setPriority(priority);
	setPriorityCause(priorityCause);
	setPrempt(prempt);
	setPreemptCause(preemptCause);
	setTransitStatus(transitStatus);
    }
    
    /**
     * Construct with required components.
     */
    public SignalStatusMessage(DSRCmsgID msgID, MsgCount msgCnt, 
		    IntersectionID id, IntersectionStatusObject status)
    {
	setMsgID(msgID);
	setMsgCnt(msgCnt);
	setId(id);
	setStatus(status);
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
    
    
    
    /**
     * Define the ASN1 Type Priority from ASN1 Module DSRC.
     * @see SequenceOf
     */
    public static class Priority extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public Priority()
	{
	    this.elements = new java.util.ArrayList<SignalState>();
	}
	
	
	/**
	 * Construct from an array of components.
	 */
	public java.util.ArrayList<SignalState> elements;

	public Priority(SignalState[] elements)
	{
	    this.elements = new java.util.ArrayList<SignalState>(java.util.Arrays.asList(elements));
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(SignalState element)
	{
	    elements.add(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(SignalState element, int atIndex)
	{
	    elements.set(atIndex, element);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized SignalState get(int atIndex)
	{
	    return (SignalState)elements.get(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(SignalState element, int atIndex)
	{
	    elements.add(atIndex, element);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(SignalState element)
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
	public static int encodeValue(PerCoder coder, OutputBitStream sink, Priority data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int total_len0 = data.elements.size();
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;
	    int nbits = 0;

	    if (total_len0 < 1 || total_len0 > 7)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + total_len0);
	    nbits += coder.encodeLengthDeterminant(total_len0, 1, 7, sink);
	    moreFragments0 = coder.moreFragments();
	    fragmentLength0 = (moreFragments0 ? coder.fragmentLength() : total_len0);
	    while (total_len0 > 0) {
		try {
		    SignalState item1 = data.elements.get(idx0);
		    int len1 = item1.getSize();

		    if (len1 != 1)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 1, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "SignalState", idx0);
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
	public static Priority decodeValue(PerCoder coder, InputBitStream source, Priority data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    int total_len0 = 0;
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;

	    idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, 1, 7);
	    if (fragmentLength0 > 7)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + fragmentLength0);
	    moreFragments0 = coder.moreFragments();
	    if (data.elements != null)
		data.elements.clear();
	    else
		data.elements = new java.util.ArrayList<SignalState>(fragmentLength0);
	    while (idx0 > 0) {
		try {
		    SignalState item1;

		    item1 = new SignalState(com.oss.coders.per.PerOctets.decode(coder, source, 1, 1));
		    data.elements.add(item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "SignalState", total_len0);
		    throw de;
		}
		--idx0; ++total_len0;
		if (idx0 == 0) {
		    if (moreFragments0) {
			idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, fragmentLength0);
			moreFragments0 = coder.moreFragments();
			if ((total_len0 + fragmentLength0) > 7)
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
	    return equalTo((Priority)that);
	}
	
	public boolean equalTo(SequenceOf that)
	{
	    return equalTo((Priority)that);
	}
	
	public boolean equalTo(Priority that) {
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
	public Priority clone() {
	    Priority copy = (Priority)super.clone();
	    copy.elements = new java.util.ArrayList<SignalState>(elements.size());
	    for (SignalState element : elements) {
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
    } // End class definition for Priority

    // Methods for field "priorityCause"
    public VehicleIdent getPriorityCause()
    {
	return this.priorityCause;
    }
    
    public void setPriorityCause(VehicleIdent priorityCause)
    {
	this.priorityCause = priorityCause;
    }
    
    public boolean hasPriorityCause()
    {
	return (priorityCause != null);
    }
    
    public void deletePriorityCause()
    {
	priorityCause = null;
    }
    
    
    // Methods for field "prempt"
    public Prempt getPrempt()
    {
	return this.prempt;
    }
    
    public void setPrempt(Prempt prempt)
    {
	this.prempt = prempt;
    }
    
    public boolean hasPrempt()
    {
	return (prempt != null);
    }
    
    public void deletePrempt()
    {
	prempt = null;
    }
    
    
    
    /**
     * Define the ASN1 Type Prempt from ASN1 Module DSRC.
     * @see SequenceOf
     */
    public static class Prempt extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public Prempt()
	{
	    this.elements = new java.util.ArrayList<SignalState>();
	}
	
	
	/**
	 * Construct from an array of components.
	 */
	public java.util.ArrayList<SignalState> elements;

	public Prempt(SignalState[] elements)
	{
	    this.elements = new java.util.ArrayList<SignalState>(java.util.Arrays.asList(elements));
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(SignalState element)
	{
	    elements.add(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(SignalState element, int atIndex)
	{
	    elements.set(atIndex, element);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized SignalState get(int atIndex)
	{
	    return (SignalState)elements.get(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(SignalState element, int atIndex)
	{
	    elements.add(atIndex, element);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(SignalState element)
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
	public static int encodeValue(PerCoder coder, OutputBitStream sink, Prempt data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int total_len0 = data.elements.size();
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;
	    int nbits = 0;

	    if (total_len0 < 1 || total_len0 > 7)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + total_len0);
	    nbits += coder.encodeLengthDeterminant(total_len0, 1, 7, sink);
	    moreFragments0 = coder.moreFragments();
	    fragmentLength0 = (moreFragments0 ? coder.fragmentLength() : total_len0);
	    while (total_len0 > 0) {
		try {
		    SignalState item1 = data.elements.get(idx0);
		    int len1 = item1.getSize();

		    if (len1 != 1)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 1, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "SignalState", idx0);
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
	public static Prempt decodeValue(PerCoder coder, InputBitStream source, Prempt data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    int total_len0 = 0;
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;

	    idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, 1, 7);
	    if (fragmentLength0 > 7)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + fragmentLength0);
	    moreFragments0 = coder.moreFragments();
	    if (data.elements != null)
		data.elements.clear();
	    else
		data.elements = new java.util.ArrayList<SignalState>(fragmentLength0);
	    while (idx0 > 0) {
		try {
		    SignalState item1;

		    item1 = new SignalState(com.oss.coders.per.PerOctets.decode(coder, source, 1, 1));
		    data.elements.add(item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "SignalState", total_len0);
		    throw de;
		}
		--idx0; ++total_len0;
		if (idx0 == 0) {
		    if (moreFragments0) {
			idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, fragmentLength0);
			moreFragments0 = coder.moreFragments();
			if ((total_len0 + fragmentLength0) > 7)
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
	    return equalTo((Prempt)that);
	}
	
	public boolean equalTo(SequenceOf that)
	{
	    return equalTo((Prempt)that);
	}
	
	public boolean equalTo(Prempt that) {
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
	public Prempt clone() {
	    Prempt copy = (Prempt)super.clone();
	    copy.elements = new java.util.ArrayList<SignalState>(elements.size());
	    for (SignalState element : elements) {
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
    } // End class definition for Prempt

    // Methods for field "preemptCause"
    public VehicleIdent getPreemptCause()
    {
	return this.preemptCause;
    }
    
    public void setPreemptCause(VehicleIdent preemptCause)
    {
	this.preemptCause = preemptCause;
    }
    
    public boolean hasPreemptCause()
    {
	return (preemptCause != null);
    }
    
    public void deletePreemptCause()
    {
	preemptCause = null;
    }
    
    
    // Methods for field "transitStatus"
    public TransitStatus getTransitStatus()
    {
	return this.transitStatus;
    }
    
    public void setTransitStatus(TransitStatus transitStatus)
    {
	this.transitStatus = transitStatus;
    }
    
    public boolean hasTransitStatus()
    {
	return (transitStatus != null);
    }
    
    public void deleteTransitStatus()
    {
	transitStatus = null;
    }
    
    
    /**
     * Effective size constraint (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public static final Bounds _cBounds_transitStatus = 
	com.bah.ode.asn.oss.dsrc.TransitStatus._cBounds_;
    
    /**
     * Encode the PDU using BER (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encode(BerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	try {
	    int len0 = 0;
	    SignalStatusMessage temp0 = this;

	    if (temp0.transitStatus != null) {
		try {
		    len0 += sink.encodeLengthTag(coder.encodeBitString(temp0.transitStatus, sink), 0x88);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("transitStatus", "TransitStatus");
		    throw ee;
		}
	    }
	    if (temp0.preemptCause != null) {
		try {
		    len0 += sink.encodeLengthTag(temp0.preemptCause.encodeValue(coder, sink), 0xA7);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("preemptCause", "VehicleIdent");
		    throw ee;
		}
	    }
	    if (temp0.prempt != null) {
		try {
		    int len1 = 0;
		    java.util.ArrayList<SignalState> temp1 = temp0.prempt.elements;
		    int idx1 = temp1 != null ? temp1.size() : 0;

		    try {
			while(idx1-- > 0) {
			    len1 += sink.encodeLengthTag(sink.write(temp1.get(idx1).byteArrayValue()), 0x4);
			}
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext(null, "SEQUENCE OF", idx1);
			throw ee;
		    }
		    len0 += sink.encodeLengthTag(len1, 0xA6);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("prempt", "SEQUENCE OF");
		    throw ee;
		}
	    }
	    if (temp0.priorityCause != null) {
		try {
		    len0 += sink.encodeLengthTag(temp0.priorityCause.encodeValue(coder, sink), 0xA5);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("priorityCause", "VehicleIdent");
		    throw ee;
		}
	    }
	    if (temp0.priority != null) {
		try {
		    int len1 = 0;
		    java.util.ArrayList<SignalState> temp1 = temp0.priority.elements;
		    int idx1 = temp1 != null ? temp1.size() : 0;

		    try {
			while(idx1-- > 0) {
			    len1 += sink.encodeLengthTag(sink.write(temp1.get(idx1).byteArrayValue()), 0x4);
			}
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext(null, "SEQUENCE OF", idx1);
			throw ee;
		    }
		    len0 += sink.encodeLengthTag(len1, 0xA4);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("priority", "SEQUENCE OF");
		    throw ee;
		}
	    }
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.status.byteArrayValue()), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("status", "IntersectionStatusObject");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.id.byteArrayValue()), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("id", "IntersectionID");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.msgCnt, sink), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msgCnt", "MsgCount");
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
	    ee.appendFieldContext(null, "SignalStatusMessage");
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
	this.priority = null;
	this.priorityCause = null;
	this.prempt = null;
	this.preemptCause = null;
	this.transitStatus = null;
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
		    if (tag != 0x81)
			source.raiseTagMismatchException(tag);
		    try {
			this.msgCnt = new MsgCount(source.decodeLong());
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("msgCnt", "MsgCount");
			throw ee;
		    }
		    tag = source.decodeTagLength();
		    if (tag != 0x82 && tag != 0xA2)
			source.raiseTagMismatchException(tag);
		    try {
			this.id = new IntersectionID(coder.decodeOctetString(source));
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("id", "IntersectionID");
			throw ee;
		    }
		    tag = source.decodeTagLength();
		    if (tag != 0x83 && tag != 0xA3)
			source.raiseTagMismatchException(tag);
		    try {
			this.status = new IntersectionStatusObject(coder.decodeOctetString(source));
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("status", "IntersectionStatusObject");
			throw ee;
		    }
		    if (source.position() >= end_pos0)
			break;
		    tag = source.decodeTagLength();
		    if (tag == 0)
			break;
		    if (tag == 0xA4) {
			try {
			    this.priority = new Priority();
			    {
				int total_len1 = source.mLength;
				int end_pos1 = (total_len1 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len1);
				int idx1 = 0;

				this.priority.elements = new java.util.ArrayList<SignalState>();

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
					SignalState temp1;
					if (tag != 0x4 && tag != 0x24)
					    source.raiseTagMismatchException(tag);
					temp1 = new SignalState(coder.decodeOctetString(source));
					this.priority.add(temp1);
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
			    ee.appendFieldContext("priority", "SEQUENCE OF");
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
			    this.priorityCause = new VehicleIdent();
			    this.priorityCause.decodeValue(coder, source);
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("priorityCause", "VehicleIdent");
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
			    this.prempt = new Prempt();
			    {
				int total_len1 = source.mLength;
				int end_pos1 = (total_len1 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len1);
				int idx1 = 0;

				this.prempt.elements = new java.util.ArrayList<SignalState>();

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
					SignalState temp1;
					if (tag != 0x4 && tag != 0x24)
					    source.raiseTagMismatchException(tag);
					temp1 = new SignalState(coder.decodeOctetString(source));
					this.prempt.add(temp1);
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
			    ee.appendFieldContext("prempt", "SEQUENCE OF");
			    throw ee;
			}
			if (source.position() >= end_pos0)
			    break;
			tag = source.decodeTagLength();
			if (tag == 0)
			    break;
		    }
		    if (tag == 0xA7) {
			try {
			    this.preemptCause = new VehicleIdent();
			    this.preemptCause.decodeValue(coder, source);
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("preemptCause", "VehicleIdent");
			    throw ee;
			}
			if (source.position() >= end_pos0)
			    break;
			tag = source.decodeTagLength();
			if (tag == 0)
			    break;
		    }
		    if (tag == 0x88 || tag == 0xA8) {
			try {
			    this.transitStatus = new TransitStatus();
			    byte[] b = coder.decodeBitString(source);
			    int bitsToTransfer = com.oss.util.BitTool.computeMinimalLength(this.transitStatus, this.transitStatus._cBounds_);
			    int usedBits = b.length * 8 - coder.getUnused();
			    this.transitStatus.setValue(b, bitsToTransfer > usedBits ? bitsToTransfer : usedBits);
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("transitStatus", "TransitStatus");
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
			    ee.appendExtensionContext("SignalStatusMessage", -1);
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
	    ee.appendFieldContext(null, "SignalStatusMessage");
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
	    SignalStatusMessage temp0 = this;

	    if (temp0.transitStatus != null) {
		try {
		    int bitsToTransfer = com.oss.util.BitTool.truncateTrailingZeroes(temp0.transitStatus);
		    len0 += sink.encodeLengthTag(coder.encodeBitString(temp0.transitStatus, sink, bitsToTransfer), 0x88);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("transitStatus", "TransitStatus");
		    throw ee;
		}
	    }
	    if (temp0.preemptCause != null) {
		try {
		    len0 += sink.encodeLengthTag(temp0.preemptCause.encodeValue(coder, sink), 0xA7);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("preemptCause", "VehicleIdent");
		    throw ee;
		}
	    }
	    if (temp0.prempt != null) {
		try {
		    int len1 = 0;
		    java.util.ArrayList<SignalState> temp1 = temp0.prempt.elements;
		    int idx1 = temp1 != null ? temp1.size() : 0;

		    try {
			while(idx1-- > 0) {
			    len1 += sink.encodeLengthTag(sink.write(temp1.get(idx1).byteArrayValue()), 0x4);
			}
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext(null, "SEQUENCE OF", idx1);
			throw ee;
		    }
		    len0 += sink.encodeLengthTag(len1, 0xA6);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("prempt", "SEQUENCE OF");
		    throw ee;
		}
	    }
	    if (temp0.priorityCause != null) {
		try {
		    len0 += sink.encodeLengthTag(temp0.priorityCause.encodeValue(coder, sink), 0xA5);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("priorityCause", "VehicleIdent");
		    throw ee;
		}
	    }
	    if (temp0.priority != null) {
		try {
		    int len1 = 0;
		    java.util.ArrayList<SignalState> temp1 = temp0.priority.elements;
		    int idx1 = temp1 != null ? temp1.size() : 0;

		    try {
			while(idx1-- > 0) {
			    len1 += sink.encodeLengthTag(sink.write(temp1.get(idx1).byteArrayValue()), 0x4);
			}
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext(null, "SEQUENCE OF", idx1);
			throw ee;
		    }
		    len0 += sink.encodeLengthTag(len1, 0xA4);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("priority", "SEQUENCE OF");
		    throw ee;
		}
	    }
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.status.byteArrayValue()), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("status", "IntersectionStatusObject");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.id.byteArrayValue()), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("id", "IntersectionID");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.msgCnt, sink), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msgCnt", "MsgCount");
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
	    ee.appendFieldContext(null, "SignalStatusMessage");
	    throw ee;
	}
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, SignalStatusMessage data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.priority != null);
	sink.writeBit(data.priorityCause != null);
	sink.writeBit(data.prempt != null);
	sink.writeBit(data.preemptCause != null);
	sink.writeBit(data.transitStatus != null);
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
	if (data.priority != null) {
	    // Encode field 'priority'
	    try {
		Priority item1 = data.priority;

		nbits += Priority.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("priority", "SEQUENCE OF");
		throw ee;
	    }
	}
	if (data.priorityCause != null) {
	    // Encode field 'priorityCause'
	    try {
		VehicleIdent item1 = data.priorityCause;

		nbits += VehicleIdent.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("priorityCause", "VehicleIdent");
		throw ee;
	    }
	}
	if (data.prempt != null) {
	    // Encode field 'prempt'
	    try {
		Prempt item1 = data.prempt;

		nbits += Prempt.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("prempt", "SEQUENCE OF");
		throw ee;
	    }
	}
	if (data.preemptCause != null) {
	    // Encode field 'preemptCause'
	    try {
		VehicleIdent item1 = data.preemptCause;

		nbits += VehicleIdent.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("preemptCause", "VehicleIdent");
		throw ee;
	    }
	}
	if (data.transitStatus != null) {
	    // Encode field 'transitStatus'
	    try {
		TransitStatus item1 = data.transitStatus;
		int len1 = item1.getSize();
		int total_len1;

		total_len1 = com.oss.util.BitTool.computeMinimalLength(item1, SignalStatusMessage._cBounds_transitStatus);
		if (total_len1 != 6)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + total_len1);
		nbits += com.oss.coders.per.PerBitstring.encode(coder, item1.byteArrayValue(), len1, total_len1, 6, 6, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("transitStatus", "TransitStatus");
		throw ee;
	    }
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
	    return this.encodeValue(coder, sink, this);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext(null, "SignalStatusMessage");
	    throw ee;
	}
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static SignalStatusMessage decodeValue(PerCoder coder, InputBitStream source, SignalStatusMessage data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_priority0 = source.readBit();
	boolean has_priorityCause0 = source.readBit();
	boolean has_prempt0 = source.readBit();
	boolean has_preemptCause0 = source.readBit();
	boolean has_transitStatus0 = source.readBit();
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
	if (has_priority0) {
	    // Decode field 'priority'
	    try {
		if (data.priority == null)
		    data.priority = new Priority();
		data.priority.decodeValue(coder, source, data.priority);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("priority", "SEQUENCE OF");
		throw de;
	    }
	} else {
	    data.priority = null;
	}
	if (has_priorityCause0) {
	    // Decode field 'priorityCause'
	    try {
		if (data.priorityCause == null)
		    data.priorityCause = new VehicleIdent();
		data.priorityCause.decodeValue(coder, source, data.priorityCause);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("priorityCause", "VehicleIdent");
		throw de;
	    }
	} else {
	    data.priorityCause = null;
	}
	if (has_prempt0) {
	    // Decode field 'prempt'
	    try {
		if (data.prempt == null)
		    data.prempt = new Prempt();
		data.prempt.decodeValue(coder, source, data.prempt);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("prempt", "SEQUENCE OF");
		throw de;
	    }
	} else {
	    data.prempt = null;
	}
	if (has_preemptCause0) {
	    // Decode field 'preemptCause'
	    try {
		if (data.preemptCause == null)
		    data.preemptCause = new VehicleIdent();
		data.preemptCause.decodeValue(coder, source, data.preemptCause);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("preemptCause", "VehicleIdent");
		throw de;
	    }
	} else {
	    data.preemptCause = null;
	}
	if (has_transitStatus0) {
	    // Decode field 'transitStatus'
	    try {
		if (data.transitStatus == null)
		    data.transitStatus = new TransitStatus();
		com.oss.coders.per.PerBitstring.decode(coder, source, 6, 6, data.transitStatus);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("transitStatus", "TransitStatus");
		throw de;
	    }
	} else {
	    data.transitStatus = null;
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
     * Decode the PDU using PER (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public AbstractData decode(PerCoder coder, InputBitStream source)
	    throws DecoderException
    {
	try {
	    this.decodeValue(coder, source, this);
	    return this;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext(null, "SignalStatusMessage");
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
	comma0 = true;
	try {
	    printer.newLine(writer);
	    writer.print("msgID ");
	    printer.print(this.msgID, writer, this.msgID.cConstantNameList);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("msgCnt ");
	    writer.print(this.msgCnt.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
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
	if (this.priority != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("priority ");
		{
		    java.util.ArrayList<SignalState> temp1 = this.priority.elements;
		    int len1 = temp1 != null ? temp1.size() : 0;
		    int idx1 = 0;

		    try {
			writer.print('{');
			printer.indent();
			for (idx1 = 0; idx1 < len1; idx1++){
			    if (idx1 > 0)
				writer.print(',');
			    printer.newLine(writer);
			    printer.print(temp1.get(idx1), writer);
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
	if (this.priorityCause != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("priorityCause ");
		this.priorityCause.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.prempt != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("prempt ");
		{
		    java.util.ArrayList<SignalState> temp1 = this.prempt.elements;
		    int len1 = temp1 != null ? temp1.size() : 0;
		    int idx1 = 0;

		    try {
			writer.print('{');
			printer.indent();
			for (idx1 = 0; idx1 < len1; idx1++){
			    if (idx1 > 0)
				writer.print(',');
			    printer.newLine(writer);
			    printer.print(temp1.get(idx1), writer);
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
	if (this.preemptCause != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("preemptCause ");
		this.preemptCause.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.transitStatus != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("transitStatus ");
		printer.print(this.transitStatus, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	printer.undent();
	printer.newLine(writer);
	writer.print('}');
    }

    /**
     * Convert the PDU value to a string. If the conversion is aborted due an error the method returns null.
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
	return "SignalStatusMessage";
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((SignalStatusMessage)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((SignalStatusMessage)that);
    }
    
    public boolean equalTo(SignalStatusMessage that) {
	if (!this.msgID.equalTo(that.msgID))
	    return false;
	if (!this.msgCnt.equalTo(that.msgCnt))
	    return false;
	if (!this.id.equalTo(that.id))
	    return false;
	if (!this.status.equalTo(that.status))
	    return false;
	if (this.priority != null && that.priority != null) {
	    if (!this.priority.equalTo(that.priority))
		return false;
	}
	if (this.priorityCause != null && that.priorityCause != null) {
	    if (!this.priorityCause.equalTo(that.priorityCause))
		return false;
	}
	if (this.prempt != null && that.prempt != null) {
	    if (!this.prempt.equalTo(that.prempt))
		return false;
	}
	if (this.preemptCause != null && that.preemptCause != null) {
	    if (!this.preemptCause.equalTo(that.preemptCause))
		return false;
	}
	if (this.transitStatus != null && that.transitStatus != null) {
	    if (!this.transitStatus.equalTo(that.transitStatus))
		return false;
	}
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public SignalStatusMessage clone() {
	SignalStatusMessage copy = (SignalStatusMessage)super.clone();
	copy.msgID = msgID.clone();
	copy.msgCnt = msgCnt.clone();
	copy.id = id.clone();
	copy.status = status.clone();
	if (priority != null) {
	    copy.priority = priority.clone();
	}
	if (priorityCause != null) {
	    copy.priorityCause = priorityCause.clone();
	}
	if (prempt != null) {
	    copy.prempt = prempt.clone();
	}
	if (preemptCause != null) {
	    copy.preemptCause = preemptCause.clone();
	}
	if (transitStatus != null) {
	    copy.transitStatus = transitStatus.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.msgID != null ? this.msgID.hashCode() : 0);
	hash = 41 * hash + (this.msgCnt != null ? this.msgCnt.hashCode() : 0);
	hash = 41 * hash + (this.id != null ? this.id.hashCode() : 0);
	hash = 41 * hash + (this.status != null ? this.status.hashCode() : 0);
	hash = 41 * hash + (this.priority != null ? this.priority.hashCode() : 0);
	hash = 41 * hash + (this.priorityCause != null ? this.priorityCause.hashCode() : 0);
	hash = 41 * hash + (this.prempt != null ? this.prempt.hashCode() : 0);
	hash = 41 * hash + (this.preemptCause != null ? this.preemptCause.hashCode() : 0);
	hash = 41 * hash + (this.transitStatus != null ? this.transitStatus.hashCode() : 0);
	return hash;
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
	    return new SignalStatusMessage();
	}
    };
    
} // End class definition for SignalStatusMessage
