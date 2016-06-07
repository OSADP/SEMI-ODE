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
 * Define the ASN1 Type IntersectionSituationDataBundle from ASN1 Module SEMI.
 * @see Sequence
 */

public class IntersectionSituationDataBundle extends Sequence implements BEREncodable, BERDecodable, DEREncodable, JSONEncodable, JSONDecodable, PEREncodable, PERDecodable {
    public SemiDialogID dialogID;
    public SemiSequenceID seqID;
    public GroupID groupID;
    public com.bah.ode.asn.oss.dsrc.TemporaryID requestID;
    public INTEGER recordCount;
    public INTEGER bundleCount;
    public IsdBundles isdBundles;
    
    /**
     * The default constructor.
     */
    public IntersectionSituationDataBundle()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public IntersectionSituationDataBundle(SemiDialogID dialogID, 
		    SemiSequenceID seqID, GroupID groupID, 
		    com.bah.ode.asn.oss.dsrc.TemporaryID requestID, 
		    INTEGER recordCount, INTEGER bundleCount, 
		    IsdBundles isdBundles)
    {
	setDialogID(dialogID);
	setSeqID(seqID);
	setGroupID(groupID);
	setRequestID(requestID);
	setRecordCount(recordCount);
	setBundleCount(bundleCount);
	setIsdBundles(isdBundles);
    }
    
    /**
     * Construct with components.
     */
    public IntersectionSituationDataBundle(SemiDialogID dialogID, 
		    SemiSequenceID seqID, GroupID groupID, 
		    com.bah.ode.asn.oss.dsrc.TemporaryID requestID, 
		    long recordCount, long bundleCount, IsdBundles isdBundles)
    {
	this(dialogID, seqID, groupID, requestID, 
	     new INTEGER(recordCount), new INTEGER(bundleCount), 
	     isdBundles);
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
    
    
    // Methods for field "recordCount"
    public long getRecordCount()
    {
	return (this.recordCount).longValue();
    }
    
    public void setRecordCount(long recordCount)
    {
	setRecordCount(new INTEGER(recordCount));
    }
    
    public void setRecordCount(INTEGER recordCount)
    {
	this.recordCount = recordCount;
    }
    
    
    // Methods for field "bundleCount"
    public long getBundleCount()
    {
	return (this.bundleCount).longValue();
    }
    
    public void setBundleCount(long bundleCount)
    {
	setBundleCount(new INTEGER(bundleCount));
    }
    
    public void setBundleCount(INTEGER bundleCount)
    {
	this.bundleCount = bundleCount;
    }
    
    
    // Methods for field "isdBundles"
    public IsdBundles getIsdBundles()
    {
	return this.isdBundles;
    }
    
    public void setIsdBundles(IsdBundles isdBundles)
    {
	this.isdBundles = isdBundles;
    }
    
    
    
    /**
     * Define the ASN1 Type IsdBundles from ASN1 Module SEMI.
     * @see SequenceOf
     */
    public static class IsdBundles extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public IsdBundles()
	{
	    this.elements = new java.util.ArrayList<IntersectionBundle>();
	}
	
	
	/**
	 * Construct from an array of components.
	 */
	public java.util.ArrayList<IntersectionBundle> elements;

	public IsdBundles(IntersectionBundle[] elements)
	{
	    this.elements = new java.util.ArrayList<IntersectionBundle>(java.util.Arrays.asList(elements));
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(IntersectionBundle element)
	{
	    elements.add(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(IntersectionBundle element, int atIndex)
	{
	    elements.set(atIndex, element);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized IntersectionBundle get(int atIndex)
	{
	    return (IntersectionBundle)elements.get(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(IntersectionBundle element, int atIndex)
	{
	    elements.add(atIndex, element);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(IntersectionBundle element)
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
	public static int encodeValue(PerCoder coder, OutputBitStream sink, IsdBundles data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int total_len0 = data.elements.size();
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;
	    int nbits = 0;

	    if (total_len0 < 0 || total_len0 > 5)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + total_len0);
	    nbits += coder.encodeLengthDeterminant(total_len0, 0, 5, sink);
	    moreFragments0 = coder.moreFragments();
	    fragmentLength0 = (moreFragments0 ? coder.fragmentLength() : total_len0);
	    while (total_len0 > 0) {
		try {
		    IntersectionBundle item1 = data.elements.get(idx0);

		    nbits += IntersectionBundle.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "IntersectionBundle", idx0);
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
	public static IsdBundles decodeValue(PerCoder coder, InputBitStream source, IsdBundles data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    int total_len0 = 0;
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;

	    idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, 0, 5);
	    if (fragmentLength0 > 5)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + fragmentLength0);
	    moreFragments0 = coder.moreFragments();
	    if (data.elements != null)
		data.elements.clear();
	    else
		data.elements = new java.util.ArrayList<IntersectionBundle>(fragmentLength0);
	    while (idx0 > 0) {
		try {
		    IntersectionBundle item1 = new IntersectionBundle();

		    data.elements.add(item1);
		    item1.decodeValue(coder, source, item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "IntersectionBundle", total_len0);
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
			IntersectionBundle item1 = this.elements.get(idx0);

			item1.encodeValue(coder, sink);
		    
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "IntersectionBundle", idx0);
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
	public IsdBundles decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	int total_len0 = 0;
	int idx0 = 0;

	if (this.elements != null)
	    this.elements.clear();
	else
	    this.elements = new java.util.ArrayList<IntersectionBundle>(total_len0);
	coder.decodeArray(source);
	if (coder.hasMoreElements(source, true))
	    do {
		try {
		    IntersectionBundle item1 = new IntersectionBundle();

		    this.elements.add(item1);
		    item1.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "IntersectionBundle", idx0);
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
	    return equalTo((IsdBundles)that);
	}
	
	public boolean equalTo(SequenceOf that)
	{
	    return equalTo((IsdBundles)that);
	}
	
	public boolean equalTo(IsdBundles that) {
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
	public IsdBundles clone() {
	    IsdBundles copy = (IsdBundles)super.clone();
	    copy.elements = new java.util.ArrayList<IntersectionBundle>(elements.size());
	    for (IntersectionBundle element : elements) {
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
    } // End class definition for IsdBundles

    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     */
    public static enum __Tag
    {
	__dialogID("dialogID"),
	__seqID("seqID"),
	__groupID("groupID"),
	__requestID("requestID"),
	__recordCount("recordCount"),
	__bundleCount("bundleCount"),
	__isdBundles("isdBundles"),
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
     * Encode the PDU using BER (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encode(BerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	try {
	    int len0 = 0;
	    IntersectionSituationDataBundle temp0 = this;

	    try {
		int len1 = 0;
		java.util.ArrayList<IntersectionBundle> temp1 = temp0.isdBundles.elements;
		int idx1 = temp1 != null ? temp1.size() : 0;

		try {
		    while(idx1-- > 0) {
			int len2 = 0;
			IntersectionBundle temp2 = temp1.get(idx1);

			try {
			    int len3 = 0;
			    java.util.ArrayList<IntersectionRecord> temp3 = temp2.isdRecords.elements;
			    int idx3 = temp3 != null ? temp3.size() : 0;

			    try {
				while(idx3-- > 0) {
				    len3 += sink.encodeLengthTag(temp3.get(idx3).encodeValue(coder, sink), 0x30);
				}
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendElementContext(null, "SEQUENCE OF", idx3);
				throw ee;
			    }
			    len2 += sink.encodeLengthTag(len3, 0xA2);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendFieldContext("isdRecords", "SEQUENCE OF");
			    throw ee;
			}
			try {
			    len2 += sink.encodeLengthTag(sink.write(temp2.bundleId.byteArrayValue()), 0x81);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendFieldContext("bundleId", "TemporaryID");
			    throw ee;
			}
			try {
			    len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.bundleNumber, sink), 0x80);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendFieldContext("bundleNumber", "INTEGER");
			    throw ee;
			}
			len1 += sink.encodeLengthTag(len2, 0x30);
		    }
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "SEQUENCE OF", idx1);
		    throw ee;
		}
		len0 += sink.encodeLengthTag(len1, 0xA6);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("isdBundles", "SEQUENCE OF");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.bundleCount, sink), 0x85);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("bundleCount", "INTEGER");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.recordCount, sink), 0x84);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("recordCount", "INTEGER");
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
	    ee.appendFieldContext(null, "IntersectionSituationDataBundle");
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
		if (tag != 0x84)
		    source.raiseTagMismatchException(tag);
		try {
		    this.recordCount = new INTEGER(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("recordCount", "INTEGER");
		    throw ee;
		}
		tag = source.decodeTagLength();
		if (tag != 0x85)
		    source.raiseTagMismatchException(tag);
		try {
		    this.bundleCount = new INTEGER(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("bundleCount", "INTEGER");
		    throw ee;
		}
		tag = source.decodeTagLength();
		if (tag != 0xA6)
		    source.raiseTagMismatchException(tag);
		try {
		    this.isdBundles = new IsdBundles();
		    {
			int total_len1 = source.mLength;
			int end_pos1 = (total_len1 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len1);
			int idx1 = 0;

			this.isdBundles.elements = new java.util.ArrayList<IntersectionBundle>();

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
				IntersectionBundle temp1 = new IntersectionBundle();
				this.isdBundles.add(temp1);
				if (tag != 0x30)
				    source.raiseTagMismatchException(tag);
				{
				    int total_len2 = source.mLength;
				    int end_pos2 = (total_len2 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len2);

				    tag = source.decodeTagLength();
				    if (tag != 0x80)
					source.raiseTagMismatchException(tag);
				    try {
					temp1.bundleNumber = new INTEGER(source.decodeLong());
				    } catch (Exception e) {
					DecoderException ee = DecoderException.wrapException(e);
					ee.appendFieldContext("bundleNumber", "INTEGER");
					throw ee;
				    }
				    tag = source.decodeTagLength();
				    if (tag != 0x81 && tag != 0xA1)
					source.raiseTagMismatchException(tag);
				    try {
					temp1.bundleId = new com.bah.ode.asn.oss.dsrc.TemporaryID(coder.decodeOctetString(source));
				    } catch (Exception e) {
					DecoderException ee = DecoderException.wrapException(e);
					ee.appendFieldContext("bundleId", "TemporaryID");
					throw ee;
				    }
				    tag = source.decodeTagLength();
				    if (tag != 0xA2)
					source.raiseTagMismatchException(tag);
				    try {
					temp1.isdRecords = new com.bah.ode.asn.oss.semi.IntersectionBundle.IsdRecords();
					{
					    int total_len3 = source.mLength;
					    int end_pos3 = (total_len3 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len3);
					    int idx3 = 0;

					    temp1.isdRecords.elements = new java.util.ArrayList<IntersectionRecord>();

					    try {
						for (;;) {
						    if (source.position() >= end_pos3) {
							if (source.position() > end_pos3)
							    throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
							break;
						    }
						    tag = source.decodeTagLength();
						    if (tag == 0) {
							if (total_len3 < 0) {
							    if (source.mLength != 0)
								throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);
							    break;
							}
							if (source.mLength == 0)
							    throw new DecoderException(ExceptionDescriptor._expect_tag, null);
						    }
						    IntersectionRecord temp3 = new IntersectionRecord();
						    temp1.isdRecords.add(temp3);
						    if (tag != 0x30)
							source.raiseTagMismatchException(tag);
						    temp3.decodeValue(coder, source);
						    ++idx3;
						}
					    } catch (Exception e) {
						DecoderException ee = DecoderException.wrapException(e);
						ee.appendElementContext(null, "SEQUENCE OF", idx3);
						throw ee;
					    }
					}
				    } catch (Exception e) {
					DecoderException ee = DecoderException.wrapException(e);
					ee.appendFieldContext("isdRecords", "SEQUENCE OF");
					throw ee;
				    }
				    if (source.position() != end_pos2) {
					if (total_len2 >= 0)
					    throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
					tag = source.decodeTagLength();
					if (tag != 0 || source.mLength != 0)
					    throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);
				    }
				}
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
		    ee.appendFieldContext("isdBundles", "SEQUENCE OF");
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
	    ee.appendFieldContext(null, "IntersectionSituationDataBundle");
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
	    IntersectionSituationDataBundle temp0 = this;

	    try {
		int len1 = 0;
		java.util.ArrayList<IntersectionBundle> temp1 = temp0.isdBundles.elements;
		int idx1 = temp1 != null ? temp1.size() : 0;

		try {
		    while(idx1-- > 0) {
			int len2 = 0;
			IntersectionBundle temp2 = temp1.get(idx1);

			try {
			    int len3 = 0;
			    java.util.ArrayList<IntersectionRecord> temp3 = temp2.isdRecords.elements;
			    int idx3 = temp3 != null ? temp3.size() : 0;

			    try {
				while(idx3-- > 0) {
				    len3 += sink.encodeLengthTag(temp3.get(idx3).encodeValue(coder, sink), 0x30);
				}
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendElementContext(null, "SEQUENCE OF", idx3);
				throw ee;
			    }
			    len2 += sink.encodeLengthTag(len3, 0xA2);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendFieldContext("isdRecords", "SEQUENCE OF");
			    throw ee;
			}
			try {
			    len2 += sink.encodeLengthTag(sink.write(temp2.bundleId.byteArrayValue()), 0x81);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendFieldContext("bundleId", "TemporaryID");
			    throw ee;
			}
			try {
			    len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.bundleNumber, sink), 0x80);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendFieldContext("bundleNumber", "INTEGER");
			    throw ee;
			}
			len1 += sink.encodeLengthTag(len2, 0x30);
		    }
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "SEQUENCE OF", idx1);
		    throw ee;
		}
		len0 += sink.encodeLengthTag(len1, 0xA6);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("isdBundles", "SEQUENCE OF");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.bundleCount, sink), 0x85);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("bundleCount", "INTEGER");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.recordCount, sink), 0x84);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("recordCount", "INTEGER");
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
	    ee.appendFieldContext(null, "IntersectionSituationDataBundle");
	    throw ee;
	}
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, IntersectionSituationDataBundle data)
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
	// Encode field 'recordCount'
	try {
	    INTEGER item1 = data.recordCount;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 300)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 300, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("recordCount", "INTEGER");
	    throw ee;
	}
	// Encode field 'bundleCount'
	try {
	    INTEGER item1 = data.bundleCount;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 60)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 60, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("bundleCount", "INTEGER");
	    throw ee;
	}
	// Encode field 'isdBundles'
	try {
	    IsdBundles item1 = data.isdBundles;

	    nbits += IsdBundles.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("isdBundles", "SEQUENCE OF");
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
	    ee.appendFieldContext(null, "IntersectionSituationDataBundle");
	    throw ee;
	}
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static IntersectionSituationDataBundle decodeValue(PerCoder coder, InputBitStream source, IntersectionSituationDataBundle data)
	    throws IOException, DecoderException, DecodeFailedException
    {
    /** Decode root fields **/
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
	// Decode field 'recordCount'
	try {
	    long temp1;

	    if (data.recordCount == null)
		data.recordCount = new INTEGER();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 300);
	    if (temp1 > 300)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.recordCount.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("recordCount", "INTEGER");
	    throw de;
	}
	// Decode field 'bundleCount'
	try {
	    long temp1;

	    if (data.bundleCount == null)
		data.bundleCount = new INTEGER();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 60);
	    if (temp1 > 60)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.bundleCount.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("bundleCount", "INTEGER");
	    throw de;
	}
	// Decode field 'isdBundles'
	try {
	    if (data.isdBundles == null)
		data.isdBundles = new IsdBundles();
	    data.isdBundles.decodeValue(coder, source, data.isdBundles);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("isdBundles", "SEQUENCE OF");
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
	    this.decodeValue(coder, source, this);
	    return this;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext(null, "IntersectionSituationDataBundle");
	    throw de;
	}
    }

    /**
     * Implements JSON value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public void encodeValue(JsonCoder coder, JsonWriter sink)
	    throws IOException, EncoderException
    {
	sink.beginObject();
	// Encode field 'dialogID'
	try {
	    SemiDialogID item1 = this.dialogID;

	    {
		sink.encodeKey("dialogID");
		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else 
		    sink.writeString(item1.name());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("dialogID", "SemiDialogID");
	    throw ee;
	}
	// Encode field 'seqID'
	try {
	    SemiSequenceID item1 = this.seqID;

	    {
		sink.writeSeparator();
		sink.encodeKey("seqID");
		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else 
		    sink.writeString(item1.name());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("seqID", "SemiSequenceID");
	    throw ee;
	}
	// Encode field 'groupID'
	try {
	    GroupID item1 = this.groupID;

	    {
		sink.writeSeparator();
		sink.encodeKey("groupID");
		sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("groupID", "GroupID");
	    throw ee;
	}
	// Encode field 'requestID'
	try {
	    com.bah.ode.asn.oss.dsrc.TemporaryID item1 = this.requestID;

	    {
		sink.writeSeparator();
		sink.encodeKey("requestID");
		sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("requestID", "TemporaryID");
	    throw ee;
	}
	// Encode field 'recordCount'
	try {
	    INTEGER item1 = this.recordCount;

	    {
		sink.writeSeparator();
		sink.encodeKey("recordCount");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("recordCount", "INTEGER");
	    throw ee;
	}
	// Encode field 'bundleCount'
	try {
	    INTEGER item1 = this.bundleCount;

	    {
		sink.writeSeparator();
		sink.encodeKey("bundleCount");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("bundleCount", "INTEGER");
	    throw ee;
	}
	// Encode field 'isdBundles'
	try {
	    IsdBundles item1 = this.isdBundles;

	    {
		sink.writeSeparator();
		sink.encodeKey("isdBundles");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("isdBundles", "SEQUENCE OF");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Encode the PDU using JSON (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public void encode(JsonCoder coder, JsonWriter sink)
	    throws EncoderException
    {
	try {
	    this.encodeValue(coder, sink);

	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext(null, "IntersectionSituationDataBundle");
	    throw ee;
	}
    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public IntersectionSituationDataBundle decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[8];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		IntersectionSituationDataBundle.__Tag t_tag0 = IntersectionSituationDataBundle.__Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = IntersectionSituationDataBundle.__Tag._null_;
		switch (t_tag0) {
		    case __dialogID:
		    // Decode field 'dialogID'
		    try {
			String content1 = coder.decodeString(source);
			int idx1;
			SemiDialogID temp1;

			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			idx1 = coder.resolveName(SemiDialogID.cConstantNameList, content1);
			if (idx1 < 0 )
			    temp1 = SemiDialogID.unknownEnumerator();
			else
			    temp1 = SemiDialogID.cNamedNumbers[idx1];
			this.dialogID = temp1;
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("dialogID", "SemiDialogID");
			throw de;
		    }
		    break;
		    case __seqID:
		    // Decode field 'seqID'
		    try {
			String content1 = coder.decodeString(source);
			int idx1;
			SemiSequenceID temp1;

			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			idx1 = coder.resolveName(SemiSequenceID.cConstantNameList, content1);
			if (idx1 < 0 )
			    temp1 = SemiSequenceID.unknownEnumerator();
			else
			    temp1 = SemiSequenceID.cNamedNumbers[idx1];
			this.seqID = temp1;
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("seqID", "SemiSequenceID");
			throw de;
		    }
		    break;
		    case __groupID:
		    // Decode field 'groupID'
		    try {
			if (present0[2])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			this.groupID = new GroupID(coder.decodeOctetString(source));
			present0[2] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("groupID", "GroupID");
			throw de;
		    }
		    break;
		    case __requestID:
		    // Decode field 'requestID'
		    try {
			if (present0[3])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			this.requestID = new com.bah.ode.asn.oss.dsrc.TemporaryID(coder.decodeOctetString(source));
			present0[3] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("requestID", "TemporaryID");
			throw de;
		    }
		    break;
		    case __recordCount:
		    // Decode field 'recordCount'
		    try {
			if (present0[4])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.recordCount == null)
			    this.recordCount = new INTEGER();
			this.recordCount.setValue(coder.decodeInteger(source));
			present0[4] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("recordCount", "INTEGER");
			throw de;
		    }
		    break;
		    case __bundleCount:
		    // Decode field 'bundleCount'
		    try {
			if (present0[5])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.bundleCount == null)
			    this.bundleCount = new INTEGER();
			this.bundleCount.setValue(coder.decodeInteger(source));
			present0[5] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("bundleCount", "INTEGER");
			throw de;
		    }
		    break;
		    case __isdBundles:
		    // Decode field 'isdBundles'
		    try {
			if (present0[6])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.isdBundles == null)
			    this.isdBundles = new IsdBundles();
			this.isdBundles.decodeValue(coder, source);
			present0[6] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("isdBundles", "SEQUENCE OF");
			throw de;
		    }
		    break;
		    default:
			throw new DecoderException(ExceptionDescriptor._unknown_field, ": '" + tag0 + "'");
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'dialogID'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'seqID'");
	if (!present0[2])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'groupID'");
	if (!present0[3])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'requestID'");
	if (!present0[4])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'recordCount'");
	if (!present0[5])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'bundleCount'");
	if (!present0[6])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'isdBundles'");
	return this;
    }

    /**
     * Decode the PDU using JSON (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public AbstractData decode(JsonCoder coder, JsonReader source)
	    throws DecoderException
    {
	try {
	    this.decodeValue(coder, source);
	    return this;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext(null, "IntersectionSituationDataBundle");
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
	    writer.print("dialogID ");
	    printer.print(this.dialogID, writer, this.dialogID.cConstantNameList);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("seqID ");
	    printer.print(this.seqID, writer, this.seqID.cConstantNameList);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("groupID ");
	    printer.print(this.groupID, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("requestID ");
	    printer.print(this.requestID, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("recordCount ");
	    writer.print(this.recordCount.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("bundleCount ");
	    writer.print(this.bundleCount.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("isdBundles ");
	    {
		java.util.ArrayList<IntersectionBundle> temp1 = this.isdBundles.elements;
		int len1 = temp1 != null ? temp1.size() : 0;
		int idx1 = 0;

		try {
		    writer.print('{');
		    printer.indent();
		    for (idx1 = 0; idx1 < len1; idx1++){
			if (idx1 > 0)
			    writer.print(',');
			printer.newLine(writer);
			boolean comma2;
			comma2 = false;
			writer.print('{');
			printer.indent();
			comma2 = true;
			try {
			    printer.newLine(writer);
			    writer.print("bundleNumber ");
			    writer.print(temp1.get(idx1).bundleNumber.longValue());
			} catch (Exception e) {
			    printer.reportError(e, null, writer);
			}
			try {
			    writer.print(',');
			    printer.newLine(writer);
			    writer.print("bundleId ");
			    printer.print(temp1.get(idx1).bundleId, writer);
			} catch (Exception e) {
			    printer.reportError(e, null, writer);
			}
			try {
			    writer.print(',');
			    printer.newLine(writer);
			    writer.print("isdRecords ");
			    {
				java.util.ArrayList<IntersectionRecord> temp3 = temp1.get(idx1).isdRecords.elements;
				int len3 = temp3 != null ? temp3.size() : 0;
				int idx3 = 0;

				try {
				    writer.print('{');
				    printer.indent();
				    for (idx3 = 0; idx3 < len3; idx3++){
					if (idx3 > 0)
					    writer.print(',');
					printer.newLine(writer);
					temp3.get(idx3).printValue(printer, writer);
				    }
				    printer.undent();
				    if (len3 > 0)
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
	return "IntersectionSituationDataBundle";
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((IntersectionSituationDataBundle)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((IntersectionSituationDataBundle)that);
    }
    
    public boolean equalTo(IntersectionSituationDataBundle that) {
	if (!this.dialogID.equalTo(that.dialogID))
	    return false;
	if (!this.seqID.equalTo(that.seqID))
	    return false;
	if (!this.groupID.equalTo(that.groupID))
	    return false;
	if (!this.requestID.equalTo(that.requestID))
	    return false;
	if (!this.recordCount.equalTo(that.recordCount))
	    return false;
	if (!this.bundleCount.equalTo(that.bundleCount))
	    return false;
	if (!this.isdBundles.equalTo(that.isdBundles))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public IntersectionSituationDataBundle clone() {
	IntersectionSituationDataBundle copy = (IntersectionSituationDataBundle)super.clone();
	copy.dialogID = dialogID.clone();
	copy.seqID = seqID.clone();
	copy.groupID = groupID.clone();
	copy.requestID = requestID.clone();
	copy.recordCount = recordCount.clone();
	copy.bundleCount = bundleCount.clone();
	copy.isdBundles = isdBundles.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.dialogID != null ? this.dialogID.hashCode() : 0);
	hash = 41 * hash + (this.seqID != null ? this.seqID.hashCode() : 0);
	hash = 41 * hash + (this.groupID != null ? this.groupID.hashCode() : 0);
	hash = 41 * hash + (this.requestID != null ? this.requestID.hashCode() : 0);
	hash = 41 * hash + (this.recordCount != null ? this.recordCount.hashCode() : 0);
	hash = 41 * hash + (this.bundleCount != null ? this.bundleCount.hashCode() : 0);
	hash = 41 * hash + (this.isdBundles != null ? this.isdBundles.hashCode() : 0);
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
	    return new IntersectionSituationDataBundle();
	}
    };
    
} // End class definition for IntersectionSituationDataBundle
