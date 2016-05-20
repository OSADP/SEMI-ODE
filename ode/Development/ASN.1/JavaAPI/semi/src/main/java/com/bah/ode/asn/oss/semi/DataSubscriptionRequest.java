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
 * Define the ASN1 Type DataSubscriptionRequest from ASN1 Module SEMI.
 * @see Sequence
 */

public class DataSubscriptionRequest extends Sequence implements BEREncodable, BERDecodable, DEREncodable, PEREncodable, PERDecodable {
    public SemiDialogID dialogID;
    public SemiSequenceID seqID;
    public GroupID groupID;
    public com.bah.ode.asn.oss.dsrc.TemporaryID requestID;
    public Type type;
    public com.bah.ode.asn.oss.dsrc.DFullTime endTime;
    public GeoRegion serviceRegion;
    
    /**
     * The default constructor.
     */
    public DataSubscriptionRequest()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DataSubscriptionRequest(SemiDialogID dialogID, 
		    SemiSequenceID seqID, GroupID groupID, 
		    com.bah.ode.asn.oss.dsrc.TemporaryID requestID, Type type, 
		    com.bah.ode.asn.oss.dsrc.DFullTime endTime, 
		    GeoRegion serviceRegion)
    {
	setDialogID(dialogID);
	setSeqID(seqID);
	setGroupID(groupID);
	setRequestID(requestID);
	setType(type);
	setEndTime(endTime);
	setServiceRegion(serviceRegion);
    }
    
    /**
     * Construct with required components.
     */
    public DataSubscriptionRequest(SemiDialogID dialogID, 
		    SemiSequenceID seqID, GroupID groupID, 
		    com.bah.ode.asn.oss.dsrc.TemporaryID requestID, Type type, 
		    com.bah.ode.asn.oss.dsrc.DFullTime endTime)
    {
	setDialogID(dialogID);
	setSeqID(seqID);
	setGroupID(groupID);
	setRequestID(requestID);
	setType(type);
	setEndTime(endTime);
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
    
    
    // Methods for field "type"
    public Type getType()
    {
	return this.type;
    }
    
    public void setType(Type type)
    {
	this.type = type;
    }
    
    
    
    /**
     * Define the ASN1 Type Type from ASN1 Module SEMI.
     * @see Choice
     */
    public static class Type extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Type()
	{
	}
	
	public static final  int  vsmType_chosen = 1;
	public static final  int  isdType_chosen = 2;
	
	// Methods for field "vsmType"
	public static Type createTypeWithVsmType(VsmType vsmType)
	{
	    Type __object = new Type();

	    __object.setVsmType(vsmType);
	    return __object;
	}
	
	public boolean hasVsmType()
	{
	    return getChosenFlag() == vsmType_chosen;
	}
	
	public VsmType getVsmType()
	{
	    if (hasVsmType())
		return (VsmType)mChosenValue;
	    else
		return null;
	}
	
	public void setVsmType(VsmType vsmType)
	{
	    setChosenValue(vsmType);
	    setChosenFlag(vsmType_chosen);
	}
	
	
	// Methods for field "isdType"
	public static Type createTypeWithIsdType(IsdType isdType)
	{
	    Type __object = new Type();

	    __object.setIsdType(isdType);
	    return __object;
	}
	
	public boolean hasIsdType()
	{
	    return getChosenFlag() == isdType_chosen;
	}
	
	public IsdType getIsdType()
	{
	    if (hasIsdType())
		return (IsdType)mChosenValue;
	    else
		return null;
	}
	
	public void setIsdType(IsdType isdType)
	{
	    setChosenValue(isdType);
	    setChosenFlag(isdType_chosen);
	}
	
	
	/**
	 * Implements PER value encoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public static int encodeValue(PerCoder coder, OutputBitStream sink, Type data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int idx0 = data.mChosenFlag;
	    int nbits = 0;

	    if (idx0 < 1 || idx0 > 2)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._bad_choice, null, idx0);
	    nbits += coder.encodeConstrainedWholeNumber(idx0 - 1, 0, 1, sink);
	    switch (idx0) {
		case vsmType_chosen:
		    // Encode alternative 'vsmType'
		    try {
			VsmType item1 = (VsmType)data.mChosenValue;
			int len1 = item1.getSize();

			if (len1 != 1)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
			nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 1, sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("vsmType", "VsmType", 0);
			throw ee;
		    }
		    break;
		case isdType_chosen:
		    // Encode alternative 'isdType'
		    try {
			IsdType item1 = (IsdType)data.mChosenValue;
			int len1 = item1.getSize();

			if (len1 != 1)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
			nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 1, sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("isdType", "IsdType", 0);
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
	public static Type decodeValue(PerCoder coder, InputBitStream source, Type data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    int idx0 = 0;

	    idx0 = (int)coder.decodeConstrainedWholeNumber(source, 0, 1) + 1;
	    if (idx0 < 1 || idx0 > 2)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._bad_choice, null, idx0);
	    data.mChosenFlag = idx0;
	    switch (idx0) {
		case vsmType_chosen:
		    // Decode alternative 'vsmType'
		    try {
			VsmType item1;

			// Decode alternative 'vsmType'
			item1 = new VsmType(com.oss.coders.per.PerOctets.decode(coder, source, 1, 1));
			data.mChosenValue = item1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("vsmType", "VsmType", 0);
			throw de;
		    }
		    break;
		case isdType_chosen:
		    // Decode alternative 'isdType'
		    try {
			IsdType item1;

			// Decode alternative 'isdType'
			item1 = new IsdType(com.oss.coders.per.PerOctets.decode(coder, source, 1, 1));
			data.mChosenValue = item1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("isdType", "IsdType", 0);
			throw de;
		    }
		    break;
	    }
	    return data;
	}

	/**
	 * Clone 'this' object.
	 */
	public Type clone() {
	    return (Type)super.clone();
	}

    } // End class definition for Type

    // Methods for field "endTime"
    public com.bah.ode.asn.oss.dsrc.DFullTime getEndTime()
    {
	return this.endTime;
    }
    
    public void setEndTime(com.bah.ode.asn.oss.dsrc.DFullTime endTime)
    {
	this.endTime = endTime;
    }
    
    
    // Methods for field "serviceRegion"
    public GeoRegion getServiceRegion()
    {
	return this.serviceRegion;
    }
    
    public void setServiceRegion(GeoRegion serviceRegion)
    {
	this.serviceRegion = serviceRegion;
    }
    
    public boolean hasServiceRegion()
    {
	return (serviceRegion != null);
    }
    
    public void deleteServiceRegion()
    {
	serviceRegion = null;
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
	    DataSubscriptionRequest temp0 = this;

	    if (temp0.serviceRegion != null) {
		try {
		    len0 += sink.encodeLengthTag(temp0.serviceRegion.encodeValue(coder, sink), 0xA6);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("serviceRegion", "GeoRegion");
		    throw ee;
		}
	    }
	    try {
		len0 += sink.encodeLengthTag(temp0.endTime.encodeValue(coder, sink), 0xA5);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("endTime", "DFullTime");
		throw ee;
	    }
	    try {
		int len1 = 0;

		switch (temp0.type.getChosenFlag()) {
		case Type.vsmType_chosen:
		    try {
			len1 = sink.encodeLengthTag(sink.write(((VsmType)temp0.type.getChosenValue()).byteArrayValue()), 0x80);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("vsmType", "CHOICE", 0);
			throw ee;
		    }
		    break;

		case Type.isdType_chosen:
		    try {
			len1 = sink.encodeLengthTag(sink.write(((IsdType)temp0.type.getChosenValue()).byteArrayValue()), 0x81);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("isdType", "CHOICE", 0);
			throw ee;
		    }
		    break;

		default:
		    throw new EncoderException(ExceptionDescriptor._bad_choice, null);
		}
		len0 += sink.encodeLengthTag(len1, 0xA4);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("type", "CHOICE");
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
	    ee.appendFieldContext(null, "DataSubscriptionRequest");
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
	this.serviceRegion = null;
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
		    if (tag != 0xA4)
			source.raiseTagMismatchException(tag);
		    try {
			this.type = new Type();
			{
			    int indef_tags1 = 0;

			    if (source.mLength < 0)
				++indef_tags1;
			    tag = source.decodeTagLength();
			    switch (tag & 0xFFFFFFDF) {
			    case 0x80:
				try {
				    this.type.setChosenFlag(Type.vsmType_chosen);
				    this.type.setChosenValue(new VsmType(coder.decodeOctetString(source)));
				} catch (Exception e) {
				    DecoderException ee = DecoderException.wrapException(e);
				    ee.appendElementContext("vsmType", "VsmType", 0);
				    throw ee;
				}
				break;

			    case 0x81:
				try {
				    this.type.setChosenFlag(Type.isdType_chosen);
				    this.type.setChosenValue(new IsdType(coder.decodeOctetString(source)));
				} catch (Exception e) {
				    DecoderException ee = DecoderException.wrapException(e);
				    ee.appendElementContext("isdType", "IsdType", 0);
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
			ee.appendFieldContext("type", "CHOICE");
			throw ee;
		    }
		    tag = source.decodeTagLength();
		    if (tag != 0xA5)
			source.raiseTagMismatchException(tag);
		    try {
			this.endTime = new com.bah.ode.asn.oss.dsrc.DFullTime();
			this.endTime.decodeValue(coder, source);
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("endTime", "DFullTime");
			throw ee;
		    }
		    if (source.position() >= end_pos0)
			break;
		    tag = source.decodeTagLength();
		    if (tag == 0)
			break;
		    if (tag == 0xA6) {
			try {
			    this.serviceRegion = new GeoRegion();
			    this.serviceRegion.decodeValue(coder, source);
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("serviceRegion", "GeoRegion");
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
	    ee.appendFieldContext(null, "DataSubscriptionRequest");
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
	    DataSubscriptionRequest temp0 = this;

	    if (temp0.serviceRegion != null) {
		try {
		    len0 += sink.encodeLengthTag(temp0.serviceRegion.encodeValue(coder, sink), 0xA6);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("serviceRegion", "GeoRegion");
		    throw ee;
		}
	    }
	    try {
		len0 += sink.encodeLengthTag(temp0.endTime.encodeValue(coder, sink), 0xA5);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("endTime", "DFullTime");
		throw ee;
	    }
	    try {
		int len1 = 0;

		switch (temp0.type.getChosenFlag()) {
		case Type.vsmType_chosen:
		    try {
			len1 = sink.encodeLengthTag(sink.write(((VsmType)temp0.type.getChosenValue()).byteArrayValue()), 0x80);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("vsmType", "CHOICE", 0);
			throw ee;
		    }
		    break;

		case Type.isdType_chosen:
		    try {
			len1 = sink.encodeLengthTag(sink.write(((IsdType)temp0.type.getChosenValue()).byteArrayValue()), 0x81);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("isdType", "CHOICE", 0);
			throw ee;
		    }
		    break;

		default:
		    throw new EncoderException(ExceptionDescriptor._bad_choice, null);
		}
		len0 += sink.encodeLengthTag(len1, 0xA4);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("type", "CHOICE");
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
	    ee.appendFieldContext(null, "DataSubscriptionRequest");
	    throw ee;
	}
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, DataSubscriptionRequest data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(data.serviceRegion != null);
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
	// Encode field 'type'
	try {
	    Type item1 = data.type;

	    nbits += Type.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("type", "CHOICE");
	    throw ee;
	}
	// Encode field 'endTime'
	try {
	    com.bah.ode.asn.oss.dsrc.DFullTime item1 = data.endTime;

	    nbits += com.bah.ode.asn.oss.dsrc.DFullTime.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("endTime", "DFullTime");
	    throw ee;
	}
	if (data.serviceRegion != null) {
	    // Encode field 'serviceRegion'
	    try {
		GeoRegion item1 = data.serviceRegion;

		nbits += GeoRegion.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("serviceRegion", "GeoRegion");
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
	    ee.appendFieldContext(null, "DataSubscriptionRequest");
	    throw ee;
	}
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static DataSubscriptionRequest decodeValue(PerCoder coder, InputBitStream source, DataSubscriptionRequest data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean has_serviceRegion0 = source.readBit();
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
	// Decode field 'type'
	try {
	    if (data.type == null)
		data.type = new Type();
	    data.type.decodeValue(coder, source, data.type);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("type", "CHOICE");
	    throw de;
	}
	// Decode field 'endTime'
	try {
	    if (data.endTime == null)
		data.endTime = new com.bah.ode.asn.oss.dsrc.DFullTime();
	    data.endTime.decodeValue(coder, source, data.endTime);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("endTime", "DFullTime");
	    throw de;
	}
	if (has_serviceRegion0) {
	    // Decode field 'serviceRegion'
	    try {
		if (data.serviceRegion == null)
		    data.serviceRegion = new GeoRegion();
		data.serviceRegion.decodeValue(coder, source, data.serviceRegion);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("serviceRegion", "GeoRegion");
		throw de;
	    }
	} else {
	    data.serviceRegion = null;
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
	    de.appendFieldContext(null, "DataSubscriptionRequest");
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
	    writer.print("type ");
	    {
		switch (this.type.getChosenFlag()) {
		case Type.vsmType_chosen:
		    try {
			writer.print("vsmType : ");
			printer.print(((VsmType)this.type.getChosenValue()), writer);
		    } catch (Exception e) {
			printer.reportError(e, null, writer);
		    }
		    break;

		case Type.isdType_chosen:
		    try {
			writer.print("isdType : ");
			printer.print(((IsdType)this.type.getChosenValue()), writer);
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
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("endTime ");
	    this.endTime.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.serviceRegion != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("serviceRegion ");
		this.serviceRegion.printValue(printer, writer);
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
	return "DataSubscriptionRequest";
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((DataSubscriptionRequest)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((DataSubscriptionRequest)that);
    }
    
    public boolean equalTo(DataSubscriptionRequest that) {
	if (!this.dialogID.equalTo(that.dialogID))
	    return false;
	if (!this.seqID.equalTo(that.seqID))
	    return false;
	if (!this.groupID.equalTo(that.groupID))
	    return false;
	if (!this.requestID.equalTo(that.requestID))
	    return false;
	if (!this.type.equalTo(that.type))
	    return false;
	if (!this.endTime.equalTo(that.endTime))
	    return false;
	if (this.serviceRegion != null && that.serviceRegion != null) {
	    if (!this.serviceRegion.equalTo(that.serviceRegion))
		return false;
	}
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public DataSubscriptionRequest clone() {
	DataSubscriptionRequest copy = (DataSubscriptionRequest)super.clone();
	copy.dialogID = dialogID.clone();
	copy.seqID = seqID.clone();
	copy.groupID = groupID.clone();
	copy.requestID = requestID.clone();
	copy.type = type.clone();
	copy.endTime = endTime.clone();
	if (serviceRegion != null) {
	    copy.serviceRegion = serviceRegion.clone();
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
	hash = 41 * hash + (this.type != null ? this.type.hashCode() : 0);
	hash = 41 * hash + (this.endTime != null ? this.endTime.hashCode() : 0);
	hash = 41 * hash + (this.serviceRegion != null ? this.serviceRegion.hashCode() : 0);
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
	    return new DataSubscriptionRequest();
	}
    };
    
} // End class definition for DataSubscriptionRequest
