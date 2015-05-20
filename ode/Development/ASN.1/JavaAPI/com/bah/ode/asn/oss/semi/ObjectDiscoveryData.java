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
/* Created: Wed May 20 08:06:10 2015 */
/* ASN.1 Compiler for Java version: 6.1 */
/* ASN.1 compiler options and file names specified:
 * -toed -output com.bah.ode.asn.oss -per -uper -ber -der -root -messageFormat
 * msvc
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
 * Define the ASN1 Type ObjectDiscoveryData from ASN1 Module SEMI.
 * @see Sequence
 */

public class ObjectDiscoveryData extends Sequence implements BEREncodable, BERDecodable, DEREncodable, PEREncodable, PERDecodable {
    public SemiDialogID dialogID;
    public SemiSequenceID seqID;
    public GroupID groupID;
    public com.bah.ode.asn.oss.dsrc.TemporaryID requestID;
    public ServiceInfo serviceInfo;
    
    /**
     * The default constructor.
     */
    public ObjectDiscoveryData()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ObjectDiscoveryData(SemiDialogID dialogID, SemiSequenceID seqID, 
		    GroupID groupID, 
		    com.bah.ode.asn.oss.dsrc.TemporaryID requestID, 
		    ServiceInfo serviceInfo)
    {
	setDialogID(dialogID);
	setSeqID(seqID);
	setGroupID(groupID);
	setRequestID(requestID);
	setServiceInfo(serviceInfo);
    }
    
    
    // Methods for field "dialogID"
    public SemiDialogID getDialogID()
    {
	return this.dialogID;
    }
    
    public void setDialogID(SemiDialogID dialogID)
    {
	this.dialogID = dialogID;
    }
    
    
    // Methods for field "seqID"
    public SemiSequenceID getSeqID()
    {
	return this.seqID;
    }
    
    public void setSeqID(SemiSequenceID seqID)
    {
	this.seqID = seqID;
    }
    
    
    // Methods for field "groupID"
    public GroupID getGroupID()
    {
	return this.groupID;
    }
    
    public void setGroupID(GroupID groupID)
    {
	this.groupID = groupID;
    }
    
    
    // Methods for field "requestID"
    public com.bah.ode.asn.oss.dsrc.TemporaryID getRequestID()
    {
	return this.requestID;
    }
    
    public void setRequestID(com.bah.ode.asn.oss.dsrc.TemporaryID requestID)
    {
	this.requestID = requestID;
    }
    
    
    // Methods for field "serviceInfo"
    public ServiceInfo getServiceInfo()
    {
	return this.serviceInfo;
    }
    
    public void setServiceInfo(ServiceInfo serviceInfo)
    {
	this.serviceInfo = serviceInfo;
    }
    
    
    
    /**
     * Define the ASN1 Type ServiceInfo from ASN1 Module SEMI.
     * @see Sequence
     */
    public static class ServiceInfo extends Sequence {
	public com.bah.ode.asn.oss.dsrc.Count countRecords;
	public ServiceRecords serviceRecords;
	
	/**
	 * The default constructor.
	 */
	public ServiceInfo()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public ServiceInfo(com.bah.ode.asn.oss.dsrc.Count countRecords, 
			ServiceRecords serviceRecords)
	{
	    setCountRecords(countRecords);
	    setServiceRecords(serviceRecords);
	}
	
	
	// Methods for field "countRecords"
	public com.bah.ode.asn.oss.dsrc.Count getCountRecords()
	{
	    return this.countRecords;
	}
	
	public void setCountRecords(com.bah.ode.asn.oss.dsrc.Count countRecords)
	{
	    this.countRecords = countRecords;
	}
	
	
	// Methods for field "serviceRecords"
	public ServiceRecords getServiceRecords()
	{
	    return this.serviceRecords;
	}
	
	public void setServiceRecords(ServiceRecords serviceRecords)
	{
	    this.serviceRecords = serviceRecords;
	}
	
	
	
	/**
	 * Define the ASN1 Type ServiceRecords from ASN1 Module SEMI.
	 * @see SequenceOf
	 */
	public static class ServiceRecords extends SequenceOf {
	    
	    /**
	     * The default constructor.
	     */
	    public ServiceRecords()
	    {
		this.elements = new java.util.ArrayList<ServiceRecord>();
	    }
	    
	    
	    /**
	     * Construct from an array of components.
	     */
	    public java.util.ArrayList<ServiceRecord> elements;

	    public ServiceRecords(ServiceRecord[] elements)
	    {
		this.elements = new java.util.ArrayList<ServiceRecord>(java.util.Arrays.asList(elements));
	    }
	    
	    /**
	     * Add an Element to the SEQUENCE OF/SET OF.
	     */
	    public synchronized void add(ServiceRecord element)
	    {
		elements.add(element);
	    }
	    
	    /**
	     * Set an Element in the SEQUENCE OF/SET OF.
	     */
	    public synchronized void set(ServiceRecord element, int atIndex)
	    {
		elements.set(atIndex, element);
	    }
	    
	    /**
	     * Get an Element from the SEQUENCE OF/SET OF.
	     */
	    public synchronized ServiceRecord get(int atIndex)
	    {
		return (ServiceRecord)elements.get(atIndex);
	    }
	    
	    /**
	     * Insert an Element into the SEQUENCE OF/SET OF.
	     */
	    public synchronized void insert(ServiceRecord element, int atIndex)
	    {
		elements.add(atIndex, element);
	    }
	    
	    /**
	     * Remove an Element from the SEQUENCE OF/SET OF.
	     */
	    public synchronized void remove(ServiceRecord element)
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
	    public static int encodeValue(PerCoder coder, OutputBitStream sink, ServiceRecords data)
		    throws IOException, EncoderException, EncodeFailedException
	    {
		int total_len0 = data.elements.size();
		int fragmentLength0;
		boolean moreFragments0;
		int idx0 = 0;
		int nbits = 0;

		if (total_len0 < 1 || total_len0 > 10)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + total_len0);
		nbits += coder.encodeLengthDeterminant(total_len0, 1, 10, sink);
		moreFragments0 = coder.moreFragments();
		fragmentLength0 = (moreFragments0 ? coder.fragmentLength() : total_len0);
		while (total_len0 > 0) {
		    try {
			ServiceRecord item1 = data.elements.get(idx0);

			nbits += ServiceRecord.encodeValue(coder, sink, item1);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext(null, "ServiceRecord", idx0);
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
	    public static ServiceRecords decodeValue(PerCoder coder, InputBitStream source, ServiceRecords data)
		    throws IOException, DecoderException, DecodeFailedException
	    {
		int total_len0 = 0;
		int fragmentLength0;
		boolean moreFragments0;
		int idx0 = 0;

		idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, 1, 10);
		if (fragmentLength0 > 10)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + fragmentLength0);
		moreFragments0 = coder.moreFragments();
		if (data.elements != null)
		    data.elements.clear();
		else
		    data.elements = new java.util.ArrayList<ServiceRecord>(fragmentLength0);
		while (idx0 > 0) {
		    try {
			ServiceRecord item1 = new ServiceRecord();

			data.elements.add(item1);
			ServiceRecord.decodeValue(coder, source, item1);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext(null, "ServiceRecord", total_len0);
			throw de;
		    }
		    --idx0; ++total_len0;
		    if (idx0 == 0) {
			if (moreFragments0) {
			    idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, fragmentLength0);
			    moreFragments0 = coder.moreFragments();
			    if ((total_len0 + fragmentLength0) > 10)
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
		return equalTo((ServiceRecords)that);
	    }
	    
	    public boolean equalTo(SequenceOf that)
	    {
		return equalTo((ServiceRecords)that);
	    }
	    
	    public boolean equalTo(ServiceRecords that) {
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
	    public ServiceRecords clone() {
		ServiceRecords copy = (ServiceRecords)super.clone();
		copy.elements = new java.util.ArrayList<ServiceRecord>(elements.size());
		for (ServiceRecord element : elements) {
		    copy.elements.add(element.clone());
		}
		return copy;
	    }

	} // End class definition for ServiceRecords

	/**
	 * Implements PER value encoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public static int encodeValue(PerCoder coder, OutputBitStream sink, ServiceInfo data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int nbits = 0;

	    // Encode field 'countRecords'
	    try {
		com.bah.ode.asn.oss.dsrc.Count item1 = data.countRecords;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 32)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += (coder.encodeConstrainedWholeNumber(temp1, 0, 32, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("countRecords", "Count");
		throw ee;
	    }
	    // Encode field 'serviceRecords'
	    try {
		ServiceRecords item1 = data.serviceRecords;

		nbits += ServiceRecords.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("serviceRecords", "SEQUENCE OF");
		throw ee;
	    }

	    return nbits;
	}

	/**
	 * Implements PER value decoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public static ServiceInfo decodeValue(PerCoder coder, InputBitStream source, ServiceInfo data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    // Decode field 'countRecords'
	    try {
		long temp1;

		if (data.countRecords == null)
		    data.countRecords = new com.bah.ode.asn.oss.dsrc.Count();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 32);
		if (temp1 > 32)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.countRecords.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("countRecords", "Count");
		throw de;
	    }
	    // Decode field 'serviceRecords'
	    try {
		if (data.serviceRecords == null)
		    data.serviceRecords = new ServiceRecords();
		ServiceRecords.decodeValue(coder, source, data.serviceRecords);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("serviceRecords", "SEQUENCE OF");
		throw de;
	    }
	    return data;
	}

	/**
	 * Compare 'this' object to another object to see if their contents are the same.
	 */
	public boolean abstractEqualTo(AbstractData that)
	{
	    return equalTo((ServiceInfo)that);
	}
	
	public boolean equalTo(Sequence that)
	{
	    return equalTo((ServiceInfo)that);
	}
	
	public boolean equalTo(ServiceInfo that) {
	    if (!this.countRecords.equalTo(that.countRecords))
		return false;
	    if (!this.serviceRecords.equalTo(that.serviceRecords))
		return false;
	    return true;
	}

	/**
	 * Clone 'this' object.
	 */
	public ServiceInfo clone() {
	    ServiceInfo copy = (ServiceInfo)super.clone();
	    copy.countRecords = countRecords.clone();
	    copy.serviceRecords = serviceRecords.clone();
	    return copy;
	}

    } // End class definition for ServiceInfo

    /**
     * Encode the PDU using BER (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encode(BerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	try {
	    int len0 = 0;
	    ObjectDiscoveryData temp0 = this;

	    try {
		int len1 = 0;
		ServiceInfo temp1 = temp0.serviceInfo;

		try {
		    int len2 = 0;
		    java.util.ArrayList<ServiceRecord> temp2 = temp1.serviceRecords.elements;
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
		    len1 += sink.encodeLengthTag(len2, 0xA1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("serviceRecords", "SEQUENCE OF");
		    throw ee;
		}
		try {
		    len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.countRecords, sink), 0x80);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("countRecords", "Count");
		    throw ee;
		}
		len0 += sink.encodeLengthTag(len1, 0xA4);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("serviceInfo", "SEQUENCE");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.requestID.byteArrayValue()), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("requestID", "TemporaryID");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.groupID.byteArrayValue()), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("groupID", "GroupID");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.seqID, sink), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("seqID", "SemiSequenceID");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.dialogID, sink), 0x80);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("dialogID", "SemiDialogID");
		throw ee;
	    }

	    return sink.encodeLengthTag(len0, 0x30);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext(null, "ObjectDiscoveryData");
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

		tag = source.decodeTagLength();
		if (tag != 0x80)
		    source.raiseTagMismatchException(tag);
		try {
		    int idx1 = SemiDialogID.indexOfValue(source.decodeLong());
		    this.dialogID = (idx1 < 0) ? SemiDialogID.unknownEnumerator() : SemiDialogID.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("dialogID", "SemiDialogID");
		    throw ee;
		}
		tag = source.decodeTagLength();
		if (tag != 0x81)
		    source.raiseTagMismatchException(tag);
		try {
		    int idx1 = SemiSequenceID.indexOfValue(source.decodeLong());
		    this.seqID = (idx1 < 0) ? SemiSequenceID.unknownEnumerator() : SemiSequenceID.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("seqID", "SemiSequenceID");
		    throw ee;
		}
		tag = source.decodeTagLength();
		if (tag != 0x82 && tag != 0xA2)
		    source.raiseTagMismatchException(tag);
		try {
		    this.groupID = new GroupID(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("groupID", "GroupID");
		    throw ee;
		}
		tag = source.decodeTagLength();
		if (tag != 0x83 && tag != 0xA3)
		    source.raiseTagMismatchException(tag);
		try {
		    this.requestID = new com.bah.ode.asn.oss.dsrc.TemporaryID(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("requestID", "TemporaryID");
		    throw ee;
		}
		tag = source.decodeTagLength();
		if (tag != 0xA4)
		    source.raiseTagMismatchException(tag);
		try {
		    this.serviceInfo = new ServiceInfo();
		    {
			int total_len1 = source.mLength;
			int end_pos1 = (total_len1 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len1);

			tag = source.decodeTagLength();
			if (tag != 0x80)
			    source.raiseTagMismatchException(tag);
			try {
			    this.serviceInfo.countRecords = new com.bah.ode.asn.oss.dsrc.Count(source.decodeLong());
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("countRecords", "Count");
			    throw ee;
			}
			tag = source.decodeTagLength();
			if (tag != 0xA1)
			    source.raiseTagMismatchException(tag);
			try {
			    this.serviceInfo.serviceRecords = new com.bah.ode.asn.oss.semi.ObjectDiscoveryData.ServiceInfo.ServiceRecords();
			    {
				int total_len2 = source.mLength;
				int end_pos2 = (total_len2 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len2);
				int idx2 = 0;

				this.serviceInfo.serviceRecords.elements = new java.util.ArrayList<ServiceRecord>();

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
					ServiceRecord temp2 = new ServiceRecord();
					this.serviceInfo.serviceRecords.add(temp2);
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
			    ee.appendFieldContext("serviceRecords", "SEQUENCE OF");
			    throw ee;
			}
			if (source.position() != end_pos1) {
			    if (total_len1 >= 0)
				throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
			    tag = source.decodeTagLength();
			    if (tag != 0 || source.mLength != 0)
				throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);
			}
		    }
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("serviceInfo", "SEQUENCE");
		    throw ee;
		}
		if (source.position() != end_pos0) {
		    if (total_len0 >= 0)
			throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
		    tag = source.decodeTagLength();
		    if (tag != 0 || source.mLength != 0)
			throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);
		}
	    }

	    return this;
	} catch (Exception e) {
	    DecoderException ee = DecoderException.wrapException(e);
	    ee.appendFieldContext(null, "ObjectDiscoveryData");
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
	    ObjectDiscoveryData temp0 = this;

	    try {
		int len1 = 0;
		ServiceInfo temp1 = temp0.serviceInfo;

		try {
		    int len2 = 0;
		    java.util.ArrayList<ServiceRecord> temp2 = temp1.serviceRecords.elements;
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
		    len1 += sink.encodeLengthTag(len2, 0xA1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("serviceRecords", "SEQUENCE OF");
		    throw ee;
		}
		try {
		    len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.countRecords, sink), 0x80);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("countRecords", "Count");
		    throw ee;
		}
		len0 += sink.encodeLengthTag(len1, 0xA4);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("serviceInfo", "SEQUENCE");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.requestID.byteArrayValue()), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("requestID", "TemporaryID");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.groupID.byteArrayValue()), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("groupID", "GroupID");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.seqID, sink), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("seqID", "SemiSequenceID");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.dialogID, sink), 0x80);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("dialogID", "SemiDialogID");
		throw ee;
	    }

	    return sink.encodeLengthTag(len0, 0x30);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext(null, "ObjectDiscoveryData");
	    throw ee;
	}
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, ObjectDiscoveryData data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	// Encode field 'dialogID'
	try {
	    SemiDialogID item1 = data.dialogID;
	    int idx1;
	    boolean extroot1 = true;

	    if (item1.isUnknownEnumerator()) {
		throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
	    } else {
		idx1 = item1.indexOf();
		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		extroot1 = idx1 < 10;
	    }
	    sink.writeBit(!extroot1); ++nbits;
	    if (extroot1)
		nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 9, sink);
	    else
		nbits += coder.encodeNormallySmallNumber(idx1 - 10, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("dialogID", "SemiDialogID");
	    throw ee;
	}
	// Encode field 'seqID'
	try {
	    SemiSequenceID item1 = data.seqID;
	    int idx1;
	    boolean extroot1 = true;

	    if (item1.isUnknownEnumerator()) {
		throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
	    } else {
		idx1 = item1.indexOf();
		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		extroot1 = idx1 < 10;
	    }
	    sink.writeBit(!extroot1); ++nbits;
	    if (extroot1)
		nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 9, sink);
	    else
		nbits += coder.encodeNormallySmallNumber(idx1 - 10, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("seqID", "SemiSequenceID");
	    throw ee;
	}
	// Encode field 'groupID'
	try {
	    GroupID item1 = data.groupID;
	    int len1 = item1.getSize();

	    if (len1 != 4)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 4, 4, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("groupID", "GroupID");
	    throw ee;
	}
	// Encode field 'requestID'
	try {
	    com.bah.ode.asn.oss.dsrc.TemporaryID item1 = data.requestID;
	    int len1 = item1.getSize();

	    if (len1 != 4)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 4, 4, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("requestID", "TemporaryID");
	    throw ee;
	}
	// Encode field 'serviceInfo'
	try {
	    ServiceInfo item1 = data.serviceInfo;

	    nbits += ServiceInfo.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("serviceInfo", "SEQUENCE");
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
	    return ObjectDiscoveryData.encodeValue(coder, sink, this);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext(null, "ObjectDiscoveryData");
	    throw ee;
	}
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static ObjectDiscoveryData decodeValue(PerCoder coder, InputBitStream source, ObjectDiscoveryData data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	// Decode field 'dialogID'
	try {
	    int idx1;
	    SemiDialogID temp1;
	    boolean extroot1 = !source.readBit();

	    if (extroot1) {
		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 9);
		if (idx1 < 0 || idx1 > 9)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		temp1 = SemiDialogID.valueAt(idx1);
	    } else {
		idx1 = 10 + (int)coder.decodeNormallySmallNumber(source);
		if (idx1 < 0)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		temp1 = SemiDialogID.unknownEnumerator();
	    }
	    data.dialogID = temp1;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("dialogID", "SemiDialogID");
	    throw de;
	}
	// Decode field 'seqID'
	try {
	    int idx1;
	    SemiSequenceID temp1;
	    boolean extroot1 = !source.readBit();

	    if (extroot1) {
		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 9);
		if (idx1 < 0 || idx1 > 9)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		temp1 = SemiSequenceID.valueAt(idx1);
	    } else {
		idx1 = 10 + (int)coder.decodeNormallySmallNumber(source);
		if (idx1 < 0)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		temp1 = SemiSequenceID.unknownEnumerator();
	    }
	    data.seqID = temp1;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("seqID", "SemiSequenceID");
	    throw de;
	}
	// Decode field 'groupID'
	try {
	    data.groupID = new GroupID(com.oss.coders.per.PerOctets.decode(coder, source, 4, 4));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("groupID", "GroupID");
	    throw de;
	}
	// Decode field 'requestID'
	try {
	    data.requestID = new com.bah.ode.asn.oss.dsrc.TemporaryID(com.oss.coders.per.PerOctets.decode(coder, source, 4, 4));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("requestID", "TemporaryID");
	    throw de;
	}
	// Decode field 'serviceInfo'
	try {
	    if (data.serviceInfo == null)
		data.serviceInfo = new ServiceInfo();
	    ServiceInfo.decodeValue(coder, source, data.serviceInfo);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("serviceInfo", "SEQUENCE");
	    throw de;
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
	    ObjectDiscoveryData.decodeValue(coder, source, this);
	    return this;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext(null, "ObjectDiscoveryData");
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
	    writer.print("dialogID ");
	    printer.print(this.dialogID, writer, this.dialogID.cConstantNameList);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("seqID ");
	    printer.print(this.seqID, writer, this.seqID.cConstantNameList);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("groupID ");
	    printer.print(this.groupID, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("requestID ");
	    printer.print(this.requestID, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    boolean comma1;

	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("serviceInfo ");
	    comma1 = false;
	    writer.print('{');
	    printer.indent();
	    try {
		if (comma1)
		    writer.print(',');
		comma1 = true;
		printer.newLine(writer);
		writer.print("countRecords ");
		writer.print(this.serviceInfo.countRecords.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    try {
		if (comma1)
		    writer.print(',');
		comma1 = true;
		printer.newLine(writer);
		writer.print("serviceRecords ");
		{
		    java.util.ArrayList<ServiceRecord> temp2 = this.serviceInfo.serviceRecords.elements;
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
	    printer.undent();
	    if (comma1)
		printer.newLine(writer);
	    writer.print('}');
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
	return "ObjectDiscoveryData";
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((ObjectDiscoveryData)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((ObjectDiscoveryData)that);
    }
    
    public boolean equalTo(ObjectDiscoveryData that) {
	if (!this.dialogID.equalTo(that.dialogID))
	    return false;
	if (!this.seqID.equalTo(that.seqID))
	    return false;
	if (!this.groupID.equalTo(that.groupID))
	    return false;
	if (!this.requestID.equalTo(that.requestID))
	    return false;
	if (!this.serviceInfo.equalTo(that.serviceInfo))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public ObjectDiscoveryData clone() {
	ObjectDiscoveryData copy = (ObjectDiscoveryData)super.clone();
	copy.dialogID = dialogID.clone();
	copy.seqID = seqID.clone();
	copy.groupID = groupID.clone();
	copy.requestID = requestID.clone();
	copy.serviceInfo = serviceInfo.clone();
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
	    return new ObjectDiscoveryData();
	}
    };
    
} // End class definition for ObjectDiscoveryData
