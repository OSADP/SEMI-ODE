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
 * Define the ASN1 Type CommonSafetyRequest from ASN1 Module DSRC.
 * @see Sequence
 */

public class CommonSafetyRequest extends Sequence implements BEREncodable, BERDecodable, DEREncodable, PEREncodable, PERDecodable {
    public DSRCmsgID msgID;
    public MsgCount msgCnt;
    public TemporaryID id;
    public Requests requests;
    
    /**
     * The default constructor.
     */
    public CommonSafetyRequest()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CommonSafetyRequest(DSRCmsgID msgID, MsgCount msgCnt, 
		    TemporaryID id, Requests requests)
    {
	setMsgID(msgID);
	setMsgCnt(msgCnt);
	setId(id);
	setRequests(requests);
    }
    
    /**
     * Construct with required components.
     */
    public CommonSafetyRequest(DSRCmsgID msgID, Requests requests)
    {
	setMsgID(msgID);
	setRequests(requests);
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
    
    public boolean hasMsgCnt()
    {
	return (msgCnt != null);
    }
    
    public void deleteMsgCnt()
    {
	msgCnt = null;
    }
    
    
    // Methods for field "id"
    public TemporaryID getId()
    {
	return this.id;
    }
    
    public void setId(TemporaryID id)
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
    
    
    // Methods for field "requests"
    public Requests getRequests()
    {
	return this.requests;
    }
    
    public void setRequests(Requests requests)
    {
	this.requests = requests;
    }
    
    
    
    /**
     * Define the ASN1 Type Requests from ASN1 Module DSRC.
     * @see SequenceOf
     */
    public static class Requests extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public Requests()
	{
	    this.elements = new java.util.ArrayList<RequestedItem>();
	}
	
	
	/**
	 * Construct from an array of components.
	 */
	public java.util.ArrayList<RequestedItem> elements;

	public Requests(RequestedItem[] elements)
	{
	    this.elements = new java.util.ArrayList<RequestedItem>(java.util.Arrays.asList(elements));
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(RequestedItem element)
	{
	    elements.add(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(RequestedItem element, int atIndex)
	{
	    elements.set(atIndex, element);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized RequestedItem get(int atIndex)
	{
	    return (RequestedItem)elements.get(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(RequestedItem element, int atIndex)
	{
	    elements.add(atIndex, element);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(RequestedItem element)
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
	public static int encodeValue(PerCoder coder, OutputBitStream sink, Requests data)
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
		    RequestedItem item1 = data.elements.get(idx0);
		    int idx1;
		    boolean extroot1 = true;

		    if (item1.isUnknownEnumerator()) {
			throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		    } else {
			idx1 = item1.indexOf();
			if (idx1 < 0)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
			extroot1 = idx1 < 18;
		    }
		    sink.writeBit(!extroot1); ++nbits;
		    if (extroot1)
			nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 17, sink);
		    else
			nbits += coder.encodeNormallySmallNumber(idx1 - 18, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "RequestedItem", idx0);
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
	public static Requests decodeValue(PerCoder coder, InputBitStream source, Requests data)
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
		data.elements = new java.util.ArrayList<RequestedItem>(fragmentLength0);
	    while (idx0 > 0) {
		try {
		    RequestedItem item1;
		    int idx1;
		    RequestedItem temp1;
		    boolean extroot1 = !source.readBit();

		    if (extroot1) {
			idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 17);
			if (idx1 < 0 || idx1 > 17)
			    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
			temp1 = RequestedItem.valueAt(idx1);
		    } else {
			idx1 = 18 + (int)coder.decodeNormallySmallNumber(source);
			if (idx1 < 0)
			    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
			temp1 = RequestedItem.unknownEnumerator();
		    }
		    item1 = temp1;
		    data.elements.add(item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "RequestedItem", total_len0);
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
	    return equalTo((Requests)that);
	}
	
	public boolean equalTo(SequenceOf that)
	{
	    return equalTo((Requests)that);
	}
	
	public boolean equalTo(Requests that) {
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
	public Requests clone() {
	    Requests copy = (Requests)super.clone();
	    copy.elements = new java.util.ArrayList<RequestedItem>(elements.size());
	    for (RequestedItem element : elements) {
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
    } // End class definition for Requests

    /**
     * Encode the PDU using BER (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encode(BerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	try {
	    int len0 = 0;
	    CommonSafetyRequest temp0 = this;

	    try {
		int len1 = 0;
		java.util.ArrayList<RequestedItem> temp1 = temp0.requests.elements;
		int idx1 = temp1 != null ? temp1.size() : 0;

		try {
		    while(idx1-- > 0) {
			len1 += sink.encodeLengthTag(coder.encodeEnumerated(temp1.get(idx1), sink), 0xA);
		    }
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "SEQUENCE OF", idx1);
		    throw ee;
		}
		len0 += sink.encodeLengthTag(len1, 0xA3);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("requests", "SEQUENCE OF");
		throw ee;
	    }
	    if (temp0.id != null) {
		try {
		    len0 += sink.encodeLengthTag(sink.write(temp0.id.byteArrayValue()), 0x82);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("id", "TemporaryID");
		    throw ee;
		}
	    }
	    if (temp0.msgCnt != null) {
		try {
		    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.msgCnt, sink), 0x81);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("msgCnt", "MsgCount");
		    throw ee;
		}
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
	    ee.appendFieldContext(null, "CommonSafetyRequest");
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
	this.msgCnt = null;
	this.id = null;
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
		    if (tag == 0x81) {
			try {
			    this.msgCnt = new MsgCount(source.decodeLong());
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("msgCnt", "MsgCount");
			    throw ee;
			}
			tag = source.decodeTagLength();
		    }
		    if (tag == 0x82 || tag == 0xA2) {
			try {
			    this.id = new TemporaryID(coder.decodeOctetString(source));
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("id", "TemporaryID");
			    throw ee;
			}
			tag = source.decodeTagLength();
		    }
		    if (tag != 0xA3)
			source.raiseTagMismatchException(tag);
		    try {
			this.requests = new Requests();
			{
			    int total_len1 = source.mLength;
			    int end_pos1 = (total_len1 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len1);
			    int idx1 = 0;

			    this.requests.elements = new java.util.ArrayList<RequestedItem>();

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
				    RequestedItem temp1;
				    if (tag != 0xA)
					source.raiseTagMismatchException(tag);
				    {
					int idx2 = RequestedItem.indexOfValue(source.decodeLong());
					temp1 = (idx2 < 0) ? RequestedItem.unknownEnumerator() : RequestedItem.cNamedNumbers[idx2];
				    }
				    this.requests.add(temp1);
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
			ee.appendFieldContext("requests", "SEQUENCE OF");
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
			    ee.appendExtensionContext("CommonSafetyRequest", -1);
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
	    ee.appendFieldContext(null, "CommonSafetyRequest");
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
	    CommonSafetyRequest temp0 = this;

	    try {
		int len1 = 0;
		java.util.ArrayList<RequestedItem> temp1 = temp0.requests.elements;
		int idx1 = temp1 != null ? temp1.size() : 0;

		try {
		    while(idx1-- > 0) {
			len1 += sink.encodeLengthTag(coder.encodeEnumerated(temp1.get(idx1), sink), 0xA);
		    }
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "SEQUENCE OF", idx1);
		    throw ee;
		}
		len0 += sink.encodeLengthTag(len1, 0xA3);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("requests", "SEQUENCE OF");
		throw ee;
	    }
	    if (temp0.id != null) {
		try {
		    len0 += sink.encodeLengthTag(sink.write(temp0.id.byteArrayValue()), 0x82);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("id", "TemporaryID");
		    throw ee;
		}
	    }
	    if (temp0.msgCnt != null) {
		try {
		    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.msgCnt, sink), 0x81);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("msgCnt", "MsgCount");
		    throw ee;
		}
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
	    ee.appendFieldContext(null, "CommonSafetyRequest");
	    throw ee;
	}
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, CommonSafetyRequest data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.msgCnt != null);
	sink.writeBit(data.id != null);
	nbits += 3;
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
	if (data.msgCnt != null) {
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
	}
	if (data.id != null) {
	    // Encode field 'id'
	    try {
		TemporaryID item1 = data.id;
		int len1 = item1.getSize();

		if (len1 != 4)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 4, 4, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("id", "TemporaryID");
		throw ee;
	    }
	}
	// Encode field 'requests'
	try {
	    Requests item1 = data.requests;

	    nbits += Requests.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("requests", "SEQUENCE OF");
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
	    return this.encodeValue(coder, sink, this);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext(null, "CommonSafetyRequest");
	    throw ee;
	}
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static CommonSafetyRequest decodeValue(PerCoder coder, InputBitStream source, CommonSafetyRequest data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_msgCnt0 = source.readBit();
	boolean has_id0 = source.readBit();
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
	if (has_msgCnt0) {
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
	} else {
	    data.msgCnt = null;
	}
	if (has_id0) {
	    // Decode field 'id'
	    try {
		data.id = new TemporaryID(com.oss.coders.per.PerOctets.decode(coder, source, 4, 4));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("id", "TemporaryID");
		throw de;
	    }
	} else {
	    data.id = null;
	}
	// Decode field 'requests'
	try {
	    if (data.requests == null)
		data.requests = new Requests();
	    data.requests.decodeValue(coder, source, data.requests);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("requests", "SEQUENCE OF");
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
	    de.appendFieldContext(null, "CommonSafetyRequest");
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
	if (this.msgCnt != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("msgCnt ");
		writer.print(this.msgCnt.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.id != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("id ");
		printer.print(this.id, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("requests ");
	    {
		java.util.ArrayList<RequestedItem> temp1 = this.requests.elements;
		int len1 = temp1 != null ? temp1.size() : 0;
		int idx1 = 0;

		try {
		    writer.print('{');
		    printer.indent();
		    for (idx1 = 0; idx1 < len1; idx1++){
			if (idx1 > 0)
			    writer.print(',');
			printer.newLine(writer);
			printer.print(temp1.get(idx1), writer, temp1.get(idx1).cConstantNameList);
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
	return "CommonSafetyRequest";
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((CommonSafetyRequest)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((CommonSafetyRequest)that);
    }
    
    public boolean equalTo(CommonSafetyRequest that) {
	if (!this.msgID.equalTo(that.msgID))
	    return false;
	if (this.msgCnt != null && that.msgCnt != null) {
	    if (!this.msgCnt.equalTo(that.msgCnt))
		return false;
	}
	if (this.id != null && that.id != null) {
	    if (!this.id.equalTo(that.id))
		return false;
	}
	if (!this.requests.equalTo(that.requests))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public CommonSafetyRequest clone() {
	CommonSafetyRequest copy = (CommonSafetyRequest)super.clone();
	copy.msgID = msgID.clone();
	if (msgCnt != null) {
	    copy.msgCnt = msgCnt.clone();
	}
	if (id != null) {
	    copy.id = id.clone();
	}
	copy.requests = requests.clone();
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
	hash = 41 * hash + (this.requests != null ? this.requests.hashCode() : 0);
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
	    return new CommonSafetyRequest();
	}
    };
    
} // End class definition for CommonSafetyRequest
