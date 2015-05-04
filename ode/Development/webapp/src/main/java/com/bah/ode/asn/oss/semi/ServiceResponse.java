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
 * Define the ASN1 Type ServiceResponse from ASN1 Module SEMI.
 * @see Sequence
 */

public class ServiceResponse extends Sequence implements BEREncodable, BERDecodable, DEREncodable, PEREncodable, PERDecodable {
    public SemiDialogID dialogID;
    public SemiSequenceID seqID;
    public GroupID groupID;
    public com.bah.ode.asn.oss.dsrc.TemporaryID requestID;
    public com.bah.ode.asn.oss.dsrc.DDateTime expiration;
    public GeoRegion serviceRegion;
    public Sha256Hash hash;
    
    /**
     * The default constructor.
     */
    public ServiceResponse()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ServiceResponse(SemiDialogID dialogID, SemiSequenceID seqID, 
		    GroupID groupID, 
		    com.bah.ode.asn.oss.dsrc.TemporaryID requestID, 
		    com.bah.ode.asn.oss.dsrc.DDateTime expiration, 
		    GeoRegion serviceRegion, Sha256Hash hash)
    {
	setDialogID(dialogID);
	setSeqID(seqID);
	setGroupID(groupID);
	setRequestID(requestID);
	setExpiration(expiration);
	setServiceRegion(serviceRegion);
	setHash(hash);
    }
    
    /**
     * Construct with required components.
     */
    public ServiceResponse(SemiDialogID dialogID, SemiSequenceID seqID, 
		    GroupID groupID, 
		    com.bah.ode.asn.oss.dsrc.TemporaryID requestID, 
		    com.bah.ode.asn.oss.dsrc.DDateTime expiration, 
		    Sha256Hash hash)
    {
	setDialogID(dialogID);
	setSeqID(seqID);
	setGroupID(groupID);
	setRequestID(requestID);
	setExpiration(expiration);
	setHash(hash);
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
    
    
    // Methods for field "expiration"
    public com.bah.ode.asn.oss.dsrc.DDateTime getExpiration()
    {
	return this.expiration;
    }
    
    public void setExpiration(com.bah.ode.asn.oss.dsrc.DDateTime expiration)
    {
	this.expiration = expiration;
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
    
    
    // Methods for field "hash"
    public Sha256Hash getHash()
    {
	return this.hash;
    }
    
    public void setHash(Sha256Hash hash)
    {
	this.hash = hash;
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
	    ServiceResponse temp0 = this;

	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.hash.byteArrayValue()), 0x86);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("hash", "Sha256Hash");
		throw ee;
	    }
	    if (temp0.serviceRegion != null) {
		try {
		    len0 += sink.encodeLengthTag(temp0.serviceRegion.encodeValue(coder, sink), 0xA5);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("serviceRegion", "GeoRegion");
		    throw ee;
		}
	    }
	    try {
		len0 += sink.encodeLengthTag(temp0.expiration.encodeValue(coder, sink), 0xA4);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("expiration", "DDateTime");
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
	    ee.appendFieldContext(null, "ServiceResponse");
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
		    this.expiration = new com.bah.ode.asn.oss.dsrc.DDateTime();
		    this.expiration.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("expiration", "DDateTime");
		    throw ee;
		}
		tag = source.decodeTagLength();
		if (tag == 0xA5) {
		    try {
			this.serviceRegion = new GeoRegion();
			this.serviceRegion.decodeValue(coder, source);
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("serviceRegion", "GeoRegion");
			throw ee;
		    }
		    tag = source.decodeTagLength();
		}
		if (tag != 0x86 && tag != 0xA6)
		    source.raiseTagMismatchException(tag);
		try {
		    this.hash = new Sha256Hash(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("hash", "Sha256Hash");
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
	    ee.appendFieldContext(null, "ServiceResponse");
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
	    ServiceResponse temp0 = this;

	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.hash.byteArrayValue()), 0x86);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("hash", "Sha256Hash");
		throw ee;
	    }
	    if (temp0.serviceRegion != null) {
		try {
		    len0 += sink.encodeLengthTag(temp0.serviceRegion.encodeValue(coder, sink), 0xA5);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("serviceRegion", "GeoRegion");
		    throw ee;
		}
	    }
	    try {
		len0 += sink.encodeLengthTag(temp0.expiration.encodeValue(coder, sink), 0xA4);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("expiration", "DDateTime");
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
	    ee.appendFieldContext(null, "ServiceResponse");
	    throw ee;
	}
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, ServiceResponse data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	boolean has_serviceRegion0 = data.serviceRegion != null;
	sink.writeBit(has_serviceRegion0); ++nbits;
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
	// Encode field 'expiration'
	try {
	    com.bah.ode.asn.oss.dsrc.DDateTime item1 = data.expiration;

	    nbits += com.bah.ode.asn.oss.dsrc.DDateTime.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("expiration", "DDateTime");
	    throw ee;
	}
	if (has_serviceRegion0) {
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
	// Encode field 'hash'
	try {
	    Sha256Hash item1 = data.hash;
	    int len1 = item1.getSize();

	    if (len1 != 32)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 32, 32, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("hash", "Sha256Hash");
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
	    return ServiceResponse.encodeValue(coder, sink, this);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext(null, "ServiceResponse");
	    throw ee;
	}
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static ServiceResponse decodeValue(PerCoder coder, InputBitStream source, ServiceResponse data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean has_serviceRegion0 = source.readBit();
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
	// Decode field 'expiration'
	try {
	    if (data.expiration == null)
		data.expiration = new com.bah.ode.asn.oss.dsrc.DDateTime();
	    com.bah.ode.asn.oss.dsrc.DDateTime.decodeValue(coder, source, data.expiration);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("expiration", "DDateTime");
	    throw de;
	}
	if (has_serviceRegion0) {
	    // Decode field 'serviceRegion'
	    try {
		if (data.serviceRegion == null)
		    data.serviceRegion = new GeoRegion();
		GeoRegion.decodeValue(coder, source, data.serviceRegion);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("serviceRegion", "GeoRegion");
		throw de;
	    }
	} else {
	    data.serviceRegion = null;
	}
	// Decode field 'hash'
	try {
	    data.hash = new Sha256Hash(com.oss.coders.per.PerOctets.decode(coder, source, 32, 32));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("hash", "Sha256Hash");
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
	    ServiceResponse.decodeValue(coder, source, this);
	    return this;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext(null, "ServiceResponse");
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
	    writer.print("expiration ");
	    this.expiration.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.serviceRegion != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("serviceRegion ");
		this.serviceRegion.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("hash ");
	    printer.print(this.hash, writer);
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
	return "ServiceResponse";
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((ServiceResponse)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((ServiceResponse)that);
    }
    
    public boolean equalTo(ServiceResponse that) {
	if (!this.dialogID.equalTo(that.dialogID))
	    return false;
	if (!this.seqID.equalTo(that.seqID))
	    return false;
	if (!this.groupID.equalTo(that.groupID))
	    return false;
	if (!this.requestID.equalTo(that.requestID))
	    return false;
	if (!this.expiration.equalTo(that.expiration))
	    return false;
	if (this.serviceRegion != null && that.serviceRegion != null) {
	    if (!this.serviceRegion.equalTo(that.serviceRegion))
		return false;
	}
	if (!this.hash.equalTo(that.hash))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public ServiceResponse clone() {
	ServiceResponse copy = (ServiceResponse)super.clone();
	copy.dialogID = dialogID.clone();
	copy.seqID = seqID.clone();
	copy.groupID = groupID.clone();
	copy.requestID = requestID.clone();
	copy.expiration = expiration.clone();
	if (serviceRegion != null) {
	    copy.serviceRegion = serviceRegion.clone();
	}
	copy.hash = hash.clone();
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
	    return new ServiceResponse();
	}
    };
    
} // End class definition for ServiceResponse
