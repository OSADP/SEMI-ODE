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
 * Define the ASN1 Type AdvisorySituationDataDistribution from ASN1 Module SEMI.
 * @see Sequence
 */

public class AdvisorySituationDataDistribution extends Sequence implements BEREncodable, BERDecodable, DEREncodable, PEREncodable, PERDecodable {
    public SemiDialogID dialogID;
    public SemiSequenceID seqID;
    public GroupID groupID;
    public com.bah.ode.asn.oss.dsrc.TemporaryID requestID;
    public INTEGER recordCount;
    public INTEGER bundleCount;
    public AsdBundles asdBundles;
    
    /**
     * The default constructor.
     */
    public AdvisorySituationDataDistribution()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public AdvisorySituationDataDistribution(SemiDialogID dialogID, 
		    SemiSequenceID seqID, GroupID groupID, 
		    com.bah.ode.asn.oss.dsrc.TemporaryID requestID, 
		    INTEGER recordCount, INTEGER bundleCount, 
		    AsdBundles asdBundles)
    {
	setDialogID(dialogID);
	setSeqID(seqID);
	setGroupID(groupID);
	setRequestID(requestID);
	setRecordCount(recordCount);
	setBundleCount(bundleCount);
	setAsdBundles(asdBundles);
    }
    
    /**
     * Construct with components.
     */
    public AdvisorySituationDataDistribution(SemiDialogID dialogID, 
		    SemiSequenceID seqID, GroupID groupID, 
		    com.bah.ode.asn.oss.dsrc.TemporaryID requestID, 
		    long recordCount, long bundleCount, AsdBundles asdBundles)
    {
	this(dialogID, seqID, groupID, requestID, 
	     new INTEGER(recordCount), new INTEGER(bundleCount), 
	     asdBundles);
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
    
    
    // Methods for field "asdBundles"
    public AsdBundles getAsdBundles()
    {
	return this.asdBundles;
    }
    
    public void setAsdBundles(AsdBundles asdBundles)
    {
	this.asdBundles = asdBundles;
    }
    
    
    
    /**
     * Define the ASN1 Type AsdBundles from ASN1 Module SEMI.
     * @see SequenceOf
     */
    public static class AsdBundles extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public AsdBundles()
	{
	    this.elements = new java.util.ArrayList<AdvisorySituationBundle>();
	}
	
	
	/**
	 * Construct from an array of components.
	 */
	public java.util.ArrayList<AdvisorySituationBundle> elements;

	public AsdBundles(AdvisorySituationBundle[] elements)
	{
	    this.elements = new java.util.ArrayList<AdvisorySituationBundle>(java.util.Arrays.asList(elements));
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(AdvisorySituationBundle element)
	{
	    elements.add(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(AdvisorySituationBundle element, int atIndex)
	{
	    elements.set(atIndex, element);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized AdvisorySituationBundle get(int atIndex)
	{
	    return (AdvisorySituationBundle)elements.get(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(AdvisorySituationBundle element, int atIndex)
	{
	    elements.add(atIndex, element);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(AdvisorySituationBundle element)
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
	public static int encodeValue(PerCoder coder, OutputBitStream sink, AsdBundles data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int total_len0 = data.elements.size();
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;
	    int nbits = 0;

	    if (total_len0 < 0 || total_len0 > 4)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + total_len0);
	    nbits += coder.encodeLengthDeterminant(total_len0, 0, 4, sink);
	    moreFragments0 = coder.moreFragments();
	    fragmentLength0 = (moreFragments0 ? coder.fragmentLength() : total_len0);
	    while (total_len0 > 0) {
		try {
		    AdvisorySituationBundle item1 = data.elements.get(idx0);

		    nbits += AdvisorySituationBundle.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "AdvisorySituationBundle", idx0);
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
	public static AsdBundles decodeValue(PerCoder coder, InputBitStream source, AsdBundles data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    int total_len0 = 0;
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;

	    idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, 0, 4);
	    if (fragmentLength0 > 4)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + fragmentLength0);
	    moreFragments0 = coder.moreFragments();
	    if (data.elements != null)
		data.elements.clear();
	    else
		data.elements = new java.util.ArrayList<AdvisorySituationBundle>(fragmentLength0);
	    while (idx0 > 0) {
		try {
		    AdvisorySituationBundle item1 = new AdvisorySituationBundle();

		    data.elements.add(item1);
		    AdvisorySituationBundle.decodeValue(coder, source, item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "AdvisorySituationBundle", total_len0);
		    throw de;
		}
		--idx0; ++total_len0;
		if (idx0 == 0) {
		    if (moreFragments0) {
			idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, fragmentLength0);
			moreFragments0 = coder.moreFragments();
			if ((total_len0 + fragmentLength0) > 4)
			    throw new DecoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + (total_len0 + fragmentLength0));
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
	    return equalTo((AsdBundles)that);
	}
	
	public boolean equalTo(SequenceOf that)
	{
	    return equalTo((AsdBundles)that);
	}
	
	public boolean equalTo(AsdBundles that) {
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
	public AsdBundles clone() {
	    AsdBundles copy = (AsdBundles)super.clone();
	    copy.elements = new java.util.ArrayList<AdvisorySituationBundle>(elements.size());
	    for (AdvisorySituationBundle element : elements) {
		copy.elements.add(element.clone());
	    }
	    return copy;
	}

    } // End class definition for AsdBundles

    /**
     * Encode the PDU using BER (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encode(BerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	try {
	    int len0 = 0;
	    AdvisorySituationDataDistribution temp0 = this;

	    try {
		int len1 = 0;
		java.util.ArrayList<AdvisorySituationBundle> temp1 = temp0.asdBundles.elements;
		int idx1 = temp1 != null ? temp1.size() : 0;

		try {
		    while(idx1-- > 0) {
			int len2 = 0;
			AdvisorySituationBundle temp2 = temp1.get(idx1);

			try {
			    int len3 = 0;
			    java.util.ArrayList<AdvisoryBroadcast> temp3 = temp2.asdRecords.elements;
			    int idx3 = temp3 != null ? temp3.size() : 0;

			    try {
				while(idx3-- > 0) {
				    int len4 = 0;
				    AdvisoryBroadcast temp4 = temp3.get(idx3);

				    try {
					len4 += sink.encodeLengthTag(sink.write(temp4.advisoryMessage.byteArrayValue()), 0x82);
				    } catch (Exception e) {
					EncoderException ee = EncoderException.wrapException(e);
					ee.appendFieldContext("advisoryMessage", "OCTET STRING");
					throw ee;
				    }
				    if (temp4.broadcastInst != null) {
					try {
					    int len5 = 0;
					    BroadcastInstructions temp5 = temp4.broadcastInst;

					    if (temp5.dsrcInst != null) {
						try {
						    int len6 = 0;
						    DsrcInstructions temp6 = temp5.dsrcInst;

						    try {
							len6 += sink.encodeLengthTag(coder.encodeInteger(temp6.biTxInterval, sink), 0x82);
						    } catch (Exception e) {
							EncoderException ee = EncoderException.wrapException(e);
							ee.appendFieldContext("biTxInterval", "INTEGER");
							throw ee;
						    }
						    try {
							len6 += sink.encodeLengthTag(coder.encodeEnumerated(temp6.biTxChannel, sink), 0x81);
						    } catch (Exception e) {
							EncoderException ee = EncoderException.wrapException(e);
							ee.appendFieldContext("biTxChannel", "TxChannel");
							throw ee;
						    }
						    try {
							len6 += sink.encodeLengthTag(coder.encodeEnumerated(temp6.biTxMode, sink), 0x80);
						    } catch (Exception e) {
							EncoderException ee = EncoderException.wrapException(e);
							ee.appendFieldContext("biTxMode", "TxMode");
							throw ee;
						    }
						    len5 += sink.encodeLengthTag(len6, 0xA6);
						} catch (Exception e) {
						    EncoderException ee = EncoderException.wrapException(e);
						    ee.appendFieldContext("dsrcInst", "DsrcInstructions");
						    throw ee;
						}
					    }
					    try {
						len5 += sink.encodeLengthTag(coder.encodeBoolean(temp5.biEncryption, sink), 0x85);
					    } catch (Exception e) {
						EncoderException ee = EncoderException.wrapException(e);
						ee.appendFieldContext("biEncryption", "BOOLEAN");
						throw ee;
					    }
					    try {
						len5 += sink.encodeLengthTag(coder.encodeBoolean(temp5.biSignature, sink), 0x84);
					    } catch (Exception e) {
						EncoderException ee = EncoderException.wrapException(e);
						ee.appendFieldContext("biSignature", "BOOLEAN");
						throw ee;
					    }
					    try {
						len5 += sink.encodeLengthTag(temp5.biDeliveryStop.encodeValue(coder, sink), 0xA3);
					    } catch (Exception e) {
						EncoderException ee = EncoderException.wrapException(e);
						ee.appendFieldContext("biDeliveryStop", "DFullTime");
						throw ee;
					    }
					    try {
						len5 += sink.encodeLengthTag(temp5.biDeliveryStart.encodeValue(coder, sink), 0xA2);
					    } catch (Exception e) {
						EncoderException ee = EncoderException.wrapException(e);
						ee.appendFieldContext("biDeliveryStart", "DFullTime");
						throw ee;
					    }
					    try {
						len5 += sink.encodeLengthTag(sink.write(temp5.biPriority.byteArrayValue()), 0x81);
					    } catch (Exception e) {
						EncoderException ee = EncoderException.wrapException(e);
						ee.appendFieldContext("biPriority", "Priority");
						throw ee;
					    }
					    try {
						len5 += sink.encodeLengthTag(coder.encodeEnumerated(temp5.biType, sink), 0x80);
					    } catch (Exception e) {
						EncoderException ee = EncoderException.wrapException(e);
						ee.appendFieldContext("biType", "AdvisoryBroadcastType");
						throw ee;
					    }
					    len4 += sink.encodeLengthTag(len5, 0xA1);
					} catch (Exception e) {
					    EncoderException ee = EncoderException.wrapException(e);
					    ee.appendFieldContext("broadcastInst", "BroadcastInstructions");
					    throw ee;
					}
				    }
				    try {
					len4 += sink.encodeLengthTag(sink.write(temp4.messagePsid.byteArrayValue()), 0x80);
				    } catch (Exception e) {
					EncoderException ee = EncoderException.wrapException(e);
					ee.appendFieldContext("messagePsid", "Psid");
					throw ee;
				    }
				    len3 += sink.encodeLengthTag(len4, 0x30);
				}
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendElementContext(null, "SEQUENCE OF", idx3);
				throw ee;
			    }
			    len2 += sink.encodeLengthTag(len3, 0xA2);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendFieldContext("asdRecords", "SEQUENCE OF");
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
		ee.appendFieldContext("asdBundles", "SEQUENCE OF");
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
	    ee.appendFieldContext(null, "AdvisorySituationDataDistribution");
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
		    this.asdBundles = new AsdBundles();
		    {
			int total_len1 = source.mLength;
			int end_pos1 = (total_len1 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len1);
			int idx1 = 0;

			this.asdBundles.elements = new java.util.ArrayList<AdvisorySituationBundle>();

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
				AdvisorySituationBundle temp1 = new AdvisorySituationBundle();
				this.asdBundles.add(temp1);
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
					temp1.asdRecords = new com.bah.ode.asn.oss.semi.AdvisorySituationBundle.AsdRecords();
					{
					    int total_len3 = source.mLength;
					    int end_pos3 = (total_len3 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len3);
					    int idx3 = 0;

					    temp1.asdRecords.elements = new java.util.ArrayList<AdvisoryBroadcast>();

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
						    AdvisoryBroadcast temp3 = new AdvisoryBroadcast();
						    temp1.asdRecords.add(temp3);
						    if (tag != 0x30)
							source.raiseTagMismatchException(tag);
						    {
							int total_len4 = source.mLength;
							int end_pos4 = (total_len4 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len4);

							tag = source.decodeTagLength();
							if (tag != 0x80 && tag != 0xA0)
							    source.raiseTagMismatchException(tag);
							try {
							    temp3.messagePsid = new Psid(coder.decodeOctetString(source));
							} catch (Exception e) {
							    DecoderException ee = DecoderException.wrapException(e);
							    ee.appendFieldContext("messagePsid", "Psid");
							    throw ee;
							}
							tag = source.decodeTagLength();
							if (tag == 0xA1) {
							    try {
								temp3.broadcastInst = new BroadcastInstructions();
								{
								    int total_len5 = source.mLength;
								    int end_pos5 = (total_len5 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len5);

								    do {
									tag = source.decodeTagLength();
									if (tag != 0x80)
									    source.raiseTagMismatchException(tag);
									try {
									    int idx6 = AdvisoryBroadcastType.indexOfValue(source.decodeLong());
									    temp3.broadcastInst.biType = (idx6 < 0) ? AdvisoryBroadcastType.unknownEnumerator() : AdvisoryBroadcastType.cNamedNumbers[idx6];
									} catch (Exception e) {
									    DecoderException ee = DecoderException.wrapException(e);
									    ee.appendFieldContext("biType", "AdvisoryBroadcastType");
									    throw ee;
									}
									tag = source.decodeTagLength();
									if (tag != 0x81 && tag != 0xA1)
									    source.raiseTagMismatchException(tag);
									try {
									    temp3.broadcastInst.biPriority = new com.bah.ode.asn.oss.dsrc.Priority(coder.decodeOctetString(source));
									} catch (Exception e) {
									    DecoderException ee = DecoderException.wrapException(e);
									    ee.appendFieldContext("biPriority", "Priority");
									    throw ee;
									}
									tag = source.decodeTagLength();
									if (tag != 0xA2)
									    source.raiseTagMismatchException(tag);
									try {
									    temp3.broadcastInst.biDeliveryStart = new com.bah.ode.asn.oss.dsrc.DFullTime();
									    temp3.broadcastInst.biDeliveryStart.decodeValue(coder, source);
									} catch (Exception e) {
									    DecoderException ee = DecoderException.wrapException(e);
									    ee.appendFieldContext("biDeliveryStart", "DFullTime");
									    throw ee;
									}
									tag = source.decodeTagLength();
									if (tag != 0xA3)
									    source.raiseTagMismatchException(tag);
									try {
									    temp3.broadcastInst.biDeliveryStop = new com.bah.ode.asn.oss.dsrc.DFullTime();
									    temp3.broadcastInst.biDeliveryStop.decodeValue(coder, source);
									} catch (Exception e) {
									    DecoderException ee = DecoderException.wrapException(e);
									    ee.appendFieldContext("biDeliveryStop", "DFullTime");
									    throw ee;
									}
									tag = source.decodeTagLength();
									if (tag != 0x84)
									    source.raiseTagMismatchException(tag);
									try {
									    temp3.broadcastInst.biSignature = new BOOLEAN(source.decodeBoolean());
									} catch (Exception e) {
									    DecoderException ee = DecoderException.wrapException(e);
									    ee.appendFieldContext("biSignature", "BOOLEAN");
									    throw ee;
									}
									tag = source.decodeTagLength();
									if (tag != 0x85)
									    source.raiseTagMismatchException(tag);
									try {
									    temp3.broadcastInst.biEncryption = new BOOLEAN(source.decodeBoolean());
									} catch (Exception e) {
									    DecoderException ee = DecoderException.wrapException(e);
									    ee.appendFieldContext("biEncryption", "BOOLEAN");
									    throw ee;
									}
									if (source.position() >= end_pos5)
									    break;
									tag = source.decodeTagLength();
									if (tag == 0)
									    break;
									if (tag == 0xA6) {
									    try {
										temp3.broadcastInst.dsrcInst = new DsrcInstructions();
										{
										    int total_len6 = source.mLength;
										    int end_pos6 = (total_len6 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len6);

										    tag = source.decodeTagLength();
										    if (tag != 0x80)
											source.raiseTagMismatchException(tag);
										    try {
											int idx7 = TxMode.indexOfValue(source.decodeInt());
											if (idx7 < 0)
											    throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
											temp3.broadcastInst.dsrcInst.biTxMode = TxMode.cNamedNumbers[idx7];
										    } catch (Exception e) {
											DecoderException ee = DecoderException.wrapException(e);
											ee.appendFieldContext("biTxMode", "TxMode");
											throw ee;
										    }
										    tag = source.decodeTagLength();
										    if (tag != 0x81)
											source.raiseTagMismatchException(tag);
										    try {
											int idx7 = TxChannel.indexOfValue(source.decodeInt());
											if (idx7 < 0)
											    throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
											temp3.broadcastInst.dsrcInst.biTxChannel = TxChannel.cNamedNumbers[idx7];
										    } catch (Exception e) {
											DecoderException ee = DecoderException.wrapException(e);
											ee.appendFieldContext("biTxChannel", "TxChannel");
											throw ee;
										    }
										    tag = source.decodeTagLength();
										    if (tag != 0x82)
											source.raiseTagMismatchException(tag);
										    try {
											temp3.broadcastInst.dsrcInst.biTxInterval = new INTEGER(source.decodeLong());
										    } catch (Exception e) {
											DecoderException ee = DecoderException.wrapException(e);
											ee.appendFieldContext("biTxInterval", "INTEGER");
											throw ee;
										    }
										    if (source.position() != end_pos6) {
											if (total_len6 >= 0)
											    throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
											tag = source.decodeTagLength();
											if (tag != 0 || source.mLength != 0)
											    throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);
										    }
										}
									    } catch (Exception e) {
										DecoderException ee = DecoderException.wrapException(e);
										ee.appendFieldContext("dsrcInst", "DsrcInstructions");
										throw ee;
									    }
									    if (source.position() >= end_pos5)
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
										ee.appendExtensionContext("BroadcastInstructions", -1);
										throw ee;
									    }
									    if (source.position() >= end_pos5)
										break;
									    tag = source.decodeTagLength();
									    if (tag == 0)
										break;
									}
								    } while(false);

								    if (source.position() > end_pos5)
									throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
								    if (total_len5 < 0 && source.mLength != 0)
									throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);
								}
							    } catch (Exception e) {
								DecoderException ee = DecoderException.wrapException(e);
								ee.appendFieldContext("broadcastInst", "BroadcastInstructions");
								throw ee;
							    }
							    tag = source.decodeTagLength();
							}
							if (tag != 0x82 && tag != 0xA2)
							    source.raiseTagMismatchException(tag);
							try {
							    temp3.advisoryMessage = new OctetString(coder.decodeOctetString(source));
							} catch (Exception e) {
							    DecoderException ee = DecoderException.wrapException(e);
							    ee.appendFieldContext("advisoryMessage", "OCTET STRING");
							    throw ee;
							}
							if (source.position() != end_pos4) {
							    if (total_len4 >= 0)
								throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
							    tag = source.decodeTagLength();
							    if (tag != 0 || source.mLength != 0)
								throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);
							}
						    }
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
					ee.appendFieldContext("asdRecords", "SEQUENCE OF");
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
		    ee.appendFieldContext("asdBundles", "SEQUENCE OF");
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
	    ee.appendFieldContext(null, "AdvisorySituationDataDistribution");
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
	    AdvisorySituationDataDistribution temp0 = this;

	    try {
		int len1 = 0;
		java.util.ArrayList<AdvisorySituationBundle> temp1 = temp0.asdBundles.elements;
		int idx1 = temp1 != null ? temp1.size() : 0;

		try {
		    while(idx1-- > 0) {
			int len2 = 0;
			AdvisorySituationBundle temp2 = temp1.get(idx1);

			try {
			    int len3 = 0;
			    java.util.ArrayList<AdvisoryBroadcast> temp3 = temp2.asdRecords.elements;
			    int idx3 = temp3 != null ? temp3.size() : 0;

			    try {
				while(idx3-- > 0) {
				    int len4 = 0;
				    AdvisoryBroadcast temp4 = temp3.get(idx3);

				    try {
					len4 += sink.encodeLengthTag(sink.write(temp4.advisoryMessage.byteArrayValue()), 0x82);
				    } catch (Exception e) {
					EncoderException ee = EncoderException.wrapException(e);
					ee.appendFieldContext("advisoryMessage", "OCTET STRING");
					throw ee;
				    }
				    if (temp4.broadcastInst != null) {
					try {
					    int len5 = 0;
					    BroadcastInstructions temp5 = temp4.broadcastInst;

					    if (temp5.dsrcInst != null) {
						try {
						    int len6 = 0;
						    DsrcInstructions temp6 = temp5.dsrcInst;

						    try {
							len6 += sink.encodeLengthTag(coder.encodeInteger(temp6.biTxInterval, sink), 0x82);
						    } catch (Exception e) {
							EncoderException ee = EncoderException.wrapException(e);
							ee.appendFieldContext("biTxInterval", "INTEGER");
							throw ee;
						    }
						    try {
							len6 += sink.encodeLengthTag(coder.encodeEnumerated(temp6.biTxChannel, sink), 0x81);
						    } catch (Exception e) {
							EncoderException ee = EncoderException.wrapException(e);
							ee.appendFieldContext("biTxChannel", "TxChannel");
							throw ee;
						    }
						    try {
							len6 += sink.encodeLengthTag(coder.encodeEnumerated(temp6.biTxMode, sink), 0x80);
						    } catch (Exception e) {
							EncoderException ee = EncoderException.wrapException(e);
							ee.appendFieldContext("biTxMode", "TxMode");
							throw ee;
						    }
						    len5 += sink.encodeLengthTag(len6, 0xA6);
						} catch (Exception e) {
						    EncoderException ee = EncoderException.wrapException(e);
						    ee.appendFieldContext("dsrcInst", "DsrcInstructions");
						    throw ee;
						}
					    }
					    try {
						len5 += sink.encodeLengthTag(coder.encodeBoolean(temp5.biEncryption, sink), 0x85);
					    } catch (Exception e) {
						EncoderException ee = EncoderException.wrapException(e);
						ee.appendFieldContext("biEncryption", "BOOLEAN");
						throw ee;
					    }
					    try {
						len5 += sink.encodeLengthTag(coder.encodeBoolean(temp5.biSignature, sink), 0x84);
					    } catch (Exception e) {
						EncoderException ee = EncoderException.wrapException(e);
						ee.appendFieldContext("biSignature", "BOOLEAN");
						throw ee;
					    }
					    try {
						len5 += sink.encodeLengthTag(temp5.biDeliveryStop.encodeValue(coder, sink), 0xA3);
					    } catch (Exception e) {
						EncoderException ee = EncoderException.wrapException(e);
						ee.appendFieldContext("biDeliveryStop", "DFullTime");
						throw ee;
					    }
					    try {
						len5 += sink.encodeLengthTag(temp5.biDeliveryStart.encodeValue(coder, sink), 0xA2);
					    } catch (Exception e) {
						EncoderException ee = EncoderException.wrapException(e);
						ee.appendFieldContext("biDeliveryStart", "DFullTime");
						throw ee;
					    }
					    try {
						len5 += sink.encodeLengthTag(sink.write(temp5.biPriority.byteArrayValue()), 0x81);
					    } catch (Exception e) {
						EncoderException ee = EncoderException.wrapException(e);
						ee.appendFieldContext("biPriority", "Priority");
						throw ee;
					    }
					    try {
						len5 += sink.encodeLengthTag(coder.encodeEnumerated(temp5.biType, sink), 0x80);
					    } catch (Exception e) {
						EncoderException ee = EncoderException.wrapException(e);
						ee.appendFieldContext("biType", "AdvisoryBroadcastType");
						throw ee;
					    }
					    len4 += sink.encodeLengthTag(len5, 0xA1);
					} catch (Exception e) {
					    EncoderException ee = EncoderException.wrapException(e);
					    ee.appendFieldContext("broadcastInst", "BroadcastInstructions");
					    throw ee;
					}
				    }
				    try {
					len4 += sink.encodeLengthTag(sink.write(temp4.messagePsid.byteArrayValue()), 0x80);
				    } catch (Exception e) {
					EncoderException ee = EncoderException.wrapException(e);
					ee.appendFieldContext("messagePsid", "Psid");
					throw ee;
				    }
				    len3 += sink.encodeLengthTag(len4, 0x30);
				}
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendElementContext(null, "SEQUENCE OF", idx3);
				throw ee;
			    }
			    len2 += sink.encodeLengthTag(len3, 0xA2);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendFieldContext("asdRecords", "SEQUENCE OF");
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
		ee.appendFieldContext("asdBundles", "SEQUENCE OF");
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
	    ee.appendFieldContext(null, "AdvisorySituationDataDistribution");
	    throw ee;
	}
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, AdvisorySituationDataDistribution data)
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

	    if (temp1 < 0 || temp1 > 400)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 400, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("recordCount", "INTEGER");
	    throw ee;
	}
	// Encode field 'bundleCount'
	try {
	    INTEGER item1 = data.bundleCount;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 40)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 40, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("bundleCount", "INTEGER");
	    throw ee;
	}
	// Encode field 'asdBundles'
	try {
	    AsdBundles item1 = data.asdBundles;

	    nbits += AsdBundles.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("asdBundles", "SEQUENCE OF");
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
	    return AdvisorySituationDataDistribution.encodeValue(coder, sink, this);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext(null, "AdvisorySituationDataDistribution");
	    throw ee;
	}
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static AdvisorySituationDataDistribution decodeValue(PerCoder coder, InputBitStream source, AdvisorySituationDataDistribution data)
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
	// Decode field 'recordCount'
	try {
	    long temp1;

	    if (data.recordCount == null)
		data.recordCount = new INTEGER();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 400);
	    if (temp1 > 400)
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
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 40);
	    if (temp1 > 40)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.bundleCount.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("bundleCount", "INTEGER");
	    throw de;
	}
	// Decode field 'asdBundles'
	try {
	    if (data.asdBundles == null)
		data.asdBundles = new AsdBundles();
	    AsdBundles.decodeValue(coder, source, data.asdBundles);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("asdBundles", "SEQUENCE OF");
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
	    AdvisorySituationDataDistribution.decodeValue(coder, source, this);
	    return this;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext(null, "AdvisorySituationDataDistribution");
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
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("recordCount ");
	    writer.print(this.recordCount.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("bundleCount ");
	    writer.print(this.bundleCount.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("asdBundles ");
	    {
		java.util.ArrayList<AdvisorySituationBundle> temp1 = this.asdBundles.elements;
		int len1 = temp1 != null ? temp1.size() : 0;
		int idx1 = 0;

		try {
		    writer.print('{');
		    printer.indent();
		    for (idx1 = 0; idx1 < len1; idx1++){
			boolean comma2;

			if (idx1 > 0)
			    writer.print(',');
			printer.newLine(writer);
			comma2 = false;
			writer.print('{');
			printer.indent();
			try {
			    if (comma2)
				writer.print(',');
			    comma2 = true;
			    printer.newLine(writer);
			    writer.print("bundleNumber ");
			    writer.print(temp1.get(idx1).bundleNumber.longValue());
			} catch (Exception e) {
			    printer.reportError(e, null, writer);
			}
			try {
			    if (comma2)
				writer.print(',');
			    comma2 = true;
			    printer.newLine(writer);
			    writer.print("bundleId ");
			    printer.print(temp1.get(idx1).bundleId, writer);
			} catch (Exception e) {
			    printer.reportError(e, null, writer);
			}
			try {
			    if (comma2)
				writer.print(',');
			    comma2 = true;
			    printer.newLine(writer);
			    writer.print("asdRecords ");
			    {
				java.util.ArrayList<AdvisoryBroadcast> temp3 = temp1.get(idx1).asdRecords.elements;
				int len3 = temp3 != null ? temp3.size() : 0;
				int idx3 = 0;

				try {
				    writer.print('{');
				    printer.indent();
				    for (idx3 = 0; idx3 < len3; idx3++){
					boolean comma4;

					if (idx3 > 0)
					    writer.print(',');
					printer.newLine(writer);
					comma4 = false;
					writer.print('{');
					printer.indent();
					try {
					    if (comma4)
						writer.print(',');
					    comma4 = true;
					    printer.newLine(writer);
					    writer.print("messagePsid ");
					    printer.print(temp3.get(idx3).messagePsid, writer);
					} catch (Exception e) {
					    printer.reportError(e, null, writer);
					}
					if (temp3.get(idx3).broadcastInst != null) {
					    try {
						boolean comma5;

						if (comma4)
						    writer.print(',');
						comma4 = true;
						printer.newLine(writer);
						writer.print("broadcastInst ");
						comma5 = false;
						writer.print('{');
						printer.indent();
						try {
						    if (comma5)
							writer.print(',');
						    comma5 = true;
						    printer.newLine(writer);
						    writer.print("biType ");
						    printer.print(temp3.get(idx3).broadcastInst.biType, writer, temp3.get(idx3).broadcastInst.biType.cConstantNameList);
						} catch (Exception e) {
						    printer.reportError(e, null, writer);
						}
						try {
						    if (comma5)
							writer.print(',');
						    comma5 = true;
						    printer.newLine(writer);
						    writer.print("biPriority ");
						    printer.print(temp3.get(idx3).broadcastInst.biPriority, writer);
						} catch (Exception e) {
						    printer.reportError(e, null, writer);
						}
						try {
						    if (comma5)
							writer.print(',');
						    comma5 = true;
						    printer.newLine(writer);
						    writer.print("biDeliveryStart ");
						    temp3.get(idx3).broadcastInst.biDeliveryStart.printValue(printer, writer);
						} catch (Exception e) {
						    printer.reportError(e, null, writer);
						}
						try {
						    if (comma5)
							writer.print(',');
						    comma5 = true;
						    printer.newLine(writer);
						    writer.print("biDeliveryStop ");
						    temp3.get(idx3).broadcastInst.biDeliveryStop.printValue(printer, writer);
						} catch (Exception e) {
						    printer.reportError(e, null, writer);
						}
						try {
						    if (comma5)
							writer.print(',');
						    comma5 = true;
						    printer.newLine(writer);
						    writer.print("biSignature ");
						    printer.print(temp3.get(idx3).broadcastInst.biSignature, writer);
						} catch (Exception e) {
						    printer.reportError(e, null, writer);
						}
						try {
						    if (comma5)
							writer.print(',');
						    comma5 = true;
						    printer.newLine(writer);
						    writer.print("biEncryption ");
						    printer.print(temp3.get(idx3).broadcastInst.biEncryption, writer);
						} catch (Exception e) {
						    printer.reportError(e, null, writer);
						}
						if (temp3.get(idx3).broadcastInst.dsrcInst != null) {
						    try {
							boolean comma6;

							if (comma5)
							    writer.print(',');
							comma5 = true;
							printer.newLine(writer);
							writer.print("dsrcInst ");
							comma6 = false;
							writer.print('{');
							printer.indent();
							try {
							    if (comma6)
								writer.print(',');
							    comma6 = true;
							    printer.newLine(writer);
							    writer.print("biTxMode ");
							    printer.print(temp3.get(idx3).broadcastInst.dsrcInst.biTxMode, writer, temp3.get(idx3).broadcastInst.dsrcInst.biTxMode.cConstantNameList);
							} catch (Exception e) {
							    printer.reportError(e, null, writer);
							}
							try {
							    if (comma6)
								writer.print(',');
							    comma6 = true;
							    printer.newLine(writer);
							    writer.print("biTxChannel ");
							    printer.print(temp3.get(idx3).broadcastInst.dsrcInst.biTxChannel, writer, temp3.get(idx3).broadcastInst.dsrcInst.biTxChannel.cConstantNameList);
							} catch (Exception e) {
							    printer.reportError(e, null, writer);
							}
							try {
							    if (comma6)
								writer.print(',');
							    comma6 = true;
							    printer.newLine(writer);
							    writer.print("biTxInterval ");
							    writer.print(temp3.get(idx3).broadcastInst.dsrcInst.biTxInterval.longValue());
							} catch (Exception e) {
							    printer.reportError(e, null, writer);
							}
							printer.undent();
							if (comma6)
							    printer.newLine(writer);
							writer.print('}');
						    } catch (Exception e) {
							printer.reportError(e, null, writer);
						    }
						}
						printer.undent();
						if (comma5)
						    printer.newLine(writer);
						writer.print('}');
					    } catch (Exception e) {
						printer.reportError(e, null, writer);
					    }
					}
					try {
					    if (comma4)
						writer.print(',');
					    comma4 = true;
					    printer.newLine(writer);
					    writer.print("advisoryMessage ");
					    printer.print(temp3.get(idx3).advisoryMessage, writer);
					} catch (Exception e) {
					    printer.reportError(e, null, writer);
					}
					printer.undent();
					if (comma4)
					    printer.newLine(writer);
					writer.print('}');
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
			if (comma2)
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
	return "AdvisorySituationDataDistribution";
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((AdvisorySituationDataDistribution)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((AdvisorySituationDataDistribution)that);
    }
    
    public boolean equalTo(AdvisorySituationDataDistribution that) {
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
	if (!this.asdBundles.equalTo(that.asdBundles))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public AdvisorySituationDataDistribution clone() {
	AdvisorySituationDataDistribution copy = (AdvisorySituationDataDistribution)super.clone();
	copy.dialogID = dialogID.clone();
	copy.seqID = seqID.clone();
	copy.groupID = groupID.clone();
	copy.requestID = requestID.clone();
	copy.recordCount = recordCount.clone();
	copy.bundleCount = bundleCount.clone();
	copy.asdBundles = asdBundles.clone();
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
	    return new AdvisorySituationDataDistribution();
	}
    };
    
} // End class definition for AdvisorySituationDataDistribution
