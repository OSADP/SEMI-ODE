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
 * Define the ASN1 Type DataSubscriptionResponse from ASN1 Module SEMI.
 * @see Sequence
 */

public class DataSubscriptionResponse extends Sequence implements BEREncodable, BERDecodable, DEREncodable, JSONEncodable, JSONDecodable, PEREncodable, PERDecodable {
    public SemiDialogID dialogID;
    public SemiSequenceID seqID;
    public GroupID groupID;
    public com.bah.ode.asn.oss.dsrc.TemporaryID requestID;
    public com.bah.ode.asn.oss.dsrc.TemporaryID subID;
    public INTEGER err;
    
    /**
     * The default constructor.
     */
    public DataSubscriptionResponse()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DataSubscriptionResponse(SemiDialogID dialogID, 
		    SemiSequenceID seqID, GroupID groupID, 
		    com.bah.ode.asn.oss.dsrc.TemporaryID requestID, 
		    com.bah.ode.asn.oss.dsrc.TemporaryID subID, INTEGER err)
    {
	setDialogID(dialogID);
	setSeqID(seqID);
	setGroupID(groupID);
	setRequestID(requestID);
	setSubID(subID);
	setErr(err);
    }
    
    /**
     * Construct with components.
     */
    public DataSubscriptionResponse(SemiDialogID dialogID, 
		    SemiSequenceID seqID, GroupID groupID, 
		    com.bah.ode.asn.oss.dsrc.TemporaryID requestID, 
		    com.bah.ode.asn.oss.dsrc.TemporaryID subID, long err)
    {
	this(dialogID, seqID, groupID, requestID, subID, 
	     new INTEGER(err));
    }
    
    /**
     * Construct with required components.
     */
    public DataSubscriptionResponse(SemiDialogID dialogID, 
		    SemiSequenceID seqID, GroupID groupID, 
		    com.bah.ode.asn.oss.dsrc.TemporaryID requestID, 
		    com.bah.ode.asn.oss.dsrc.TemporaryID subID)
    {
	setDialogID(dialogID);
	setSeqID(seqID);
	setGroupID(groupID);
	setRequestID(requestID);
	setSubID(subID);
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
    
    
    // Methods for field "subID"
    public com.bah.ode.asn.oss.dsrc.TemporaryID getSubID()
    {
	return this.subID;
    }
    
    public void setSubID(com.bah.ode.asn.oss.dsrc.TemporaryID subID)
    {
	this.subID = subID;
    }
    
    
    // Methods for field "err"
    public long getErr()
    {
	return (this.err).longValue();
    }
    
    public void setErr(long err)
    {
	setErr(new INTEGER(err));
    }
    
    public void setErr(INTEGER err)
    {
	this.err = err;
    }
    
    public boolean hasErr()
    {
	return (err != null);
    }
    
    public void deleteErr()
    {
	err = null;
    }
    
    
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
	__subID("subID"),
	__err("err"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(7);
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
	    DataSubscriptionResponse temp0 = this;

	    if (temp0.err != null) {
		try {
		    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.err, sink), 0x85);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("err", "INTEGER");
		    throw ee;
		}
	    }
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.subID.byteArrayValue()), 0x84);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("subID", "TemporaryID");
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
	    ee.appendFieldContext(null, "DataSubscriptionResponse");
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
	this.err = null;
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
		    if (tag != 0x84 && tag != 0xA4)
			source.raiseTagMismatchException(tag);
		    try {
			this.subID = new com.bah.ode.asn.oss.dsrc.TemporaryID(coder.decodeOctetString(source));
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("subID", "TemporaryID");
			throw ee;
		    }
		    if (source.position() >= end_pos0)
			break;
		    tag = source.decodeTagLength();
		    if (tag == 0)
			break;
		    if (tag == 0x85) {
			try {
			    this.err = new INTEGER(source.decodeLong());
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("err", "INTEGER");
			    throw ee;
			}
			if (source.position() >= end_pos0)
			    break;
			tag = source.decodeTagLength();
			if (tag == 0)
			    break;
		    }
		    source.raiseUnknownFieldException(tag);
		} while(false);

		if (source.position() > end_pos0)
		    throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
		if (total_len0 < 0 && source.mLength != 0)
		    throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);
	    }

	    return this;
	} catch (Exception e) {
	    DecoderException ee = DecoderException.wrapException(e);
	    ee.appendFieldContext(null, "DataSubscriptionResponse");
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
	    DataSubscriptionResponse temp0 = this;

	    if (temp0.err != null) {
		try {
		    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.err, sink), 0x85);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("err", "INTEGER");
		    throw ee;
		}
	    }
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.subID.byteArrayValue()), 0x84);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("subID", "TemporaryID");
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
	    ee.appendFieldContext(null, "DataSubscriptionResponse");
	    throw ee;
	}
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, DataSubscriptionResponse data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(data.err != null);
	++nbits;
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
	// Encode field 'subID'
	try {
	    com.bah.ode.asn.oss.dsrc.TemporaryID item1 = data.subID;
	    int len1 = item1.getSize();

	    if (len1 != 4)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 4, 4, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("subID", "TemporaryID");
	    throw ee;
	}
	if (data.err != null) {
	    // Encode field 'err'
	    try {
		INTEGER item1 = data.err;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 65535)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 65535, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("err", "INTEGER");
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
	    ee.appendFieldContext(null, "DataSubscriptionResponse");
	    throw ee;
	}
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static DataSubscriptionResponse decodeValue(PerCoder coder, InputBitStream source, DataSubscriptionResponse data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean has_err0 = source.readBit();
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
	// Decode field 'subID'
	try {
	    data.subID = new com.bah.ode.asn.oss.dsrc.TemporaryID(com.oss.coders.per.PerOctets.decode(coder, source, 4, 4));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("subID", "TemporaryID");
	    throw de;
	}
	if (has_err0) {
	    // Decode field 'err'
	    try {
		long temp1;

		if (data.err == null)
		    data.err = new INTEGER();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 65535);
		if (temp1 > 65535)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.err.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("err", "INTEGER");
		throw de;
	    }
	} else {
	    data.err = null;
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
	    de.appendFieldContext(null, "DataSubscriptionResponse");
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
	// Encode field 'subID'
	try {
	    com.bah.ode.asn.oss.dsrc.TemporaryID item1 = this.subID;

	    {
		sink.writeSeparator();
		sink.encodeKey("subID");
		sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("subID", "TemporaryID");
	    throw ee;
	}
	// Encode field 'err'
	try {
	    INTEGER item1 = this.err;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("err");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "err");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("err", "INTEGER");
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
	    ee.appendFieldContext(null, "DataSubscriptionResponse");
	    throw ee;
	}
    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public DataSubscriptionResponse decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[7];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		DataSubscriptionResponse.__Tag t_tag0 = DataSubscriptionResponse.__Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = DataSubscriptionResponse.__Tag._null_;
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
		    case __subID:
		    // Decode field 'subID'
		    try {
			if (present0[4])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			this.subID = new com.bah.ode.asn.oss.dsrc.TemporaryID(coder.decodeOctetString(source));
			present0[4] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("subID", "TemporaryID");
			throw de;
		    }
		    break;
		    case __err:
		    // Decode field 'err'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[5])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.err == null)
				this.err = new INTEGER();
			    this.err.setValue(coder.decodeInteger(source));
			    present0[5] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("err", "INTEGER");
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
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'subID'");
	if (!present0[5])
	    this.err = null;
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
	    de.appendFieldContext(null, "DataSubscriptionResponse");
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
	    writer.print("subID ");
	    printer.print(this.subID, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.err != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("err ");
		writer.print(this.err.longValue());
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
	return "DataSubscriptionResponse";
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((DataSubscriptionResponse)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((DataSubscriptionResponse)that);
    }
    
    public boolean equalTo(DataSubscriptionResponse that) {
	if (!this.dialogID.equalTo(that.dialogID))
	    return false;
	if (!this.seqID.equalTo(that.seqID))
	    return false;
	if (!this.groupID.equalTo(that.groupID))
	    return false;
	if (!this.requestID.equalTo(that.requestID))
	    return false;
	if (!this.subID.equalTo(that.subID))
	    return false;
	if (this.err != null && that.err != null) {
	    if (!this.err.equalTo(that.err))
		return false;
	}
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public DataSubscriptionResponse clone() {
	DataSubscriptionResponse copy = (DataSubscriptionResponse)super.clone();
	copy.dialogID = dialogID.clone();
	copy.seqID = seqID.clone();
	copy.groupID = groupID.clone();
	copy.requestID = requestID.clone();
	copy.subID = subID.clone();
	if (err != null) {
	    copy.err = err.clone();
	}
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
	hash = 41 * hash + (this.subID != null ? this.subID.hashCode() : 0);
	hash = 41 * hash + (this.err != null ? this.err.hashCode() : 0);
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
	    return new DataSubscriptionResponse();
	}
    };
    
} // End class definition for DataSubscriptionResponse
