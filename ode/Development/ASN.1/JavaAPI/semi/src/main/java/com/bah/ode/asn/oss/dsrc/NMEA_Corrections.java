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
 * Define the ASN1 Type NMEA_Corrections from ASN1 Module DSRC.
 * @see Sequence
 */

public class NMEA_Corrections extends Sequence implements BEREncodable, BERDecodable, DEREncodable, JSONEncodable, JSONDecodable, PEREncodable, PERDecodable {
    public DSRCmsgID msgID;
    public NMEA_Revision rev;
    public NMEA_MsgType msg;
    public INTEGER wdCount;
    public NMEA_Payload payload;
    
    /**
     * The default constructor.
     */
    public NMEA_Corrections()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public NMEA_Corrections(DSRCmsgID msgID, NMEA_Revision rev, 
		    NMEA_MsgType msg, INTEGER wdCount, NMEA_Payload payload)
    {
	setMsgID(msgID);
	setRev(rev);
	setMsg(msg);
	setWdCount(wdCount);
	setPayload(payload);
    }
    
    /**
     * Construct with components.
     */
    public NMEA_Corrections(DSRCmsgID msgID, NMEA_Revision rev, 
		    NMEA_MsgType msg, long wdCount, NMEA_Payload payload)
    {
	this(msgID, rev, msg, new INTEGER(wdCount), payload);
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
    
    
    // Methods for field "rev"
    public NMEA_Revision getRev()
    {
	return this.rev;
    }
    
    public void setRev(NMEA_Revision rev)
    {
	this.rev = rev;
    }
    
    
    // Methods for field "msg"
    public NMEA_MsgType getMsg()
    {
	return this.msg;
    }
    
    public void setMsg(NMEA_MsgType msg)
    {
	this.msg = msg;
    }
    
    
    // Methods for field "wdCount"
    public long getWdCount()
    {
	return (this.wdCount).longValue();
    }
    
    public void setWdCount(long wdCount)
    {
	setWdCount(new INTEGER(wdCount));
    }
    
    public void setWdCount(INTEGER wdCount)
    {
	this.wdCount = wdCount;
    }
    
    
    // Methods for field "payload"
    public NMEA_Payload getPayload()
    {
	return this.payload;
    }
    
    public void setPayload(NMEA_Payload payload)
    {
	this.payload = payload;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     */
    public static enum __Tag
    {
	__msgID("msgID"),
	__rev("rev"),
	__msg("msg"),
	__wdCount("wdCount"),
	__payload("payload"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(6);
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
	    NMEA_Corrections temp0 = this;

	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.payload.byteArrayValue()), 0x84);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("payload", "NMEA-Payload");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.wdCount, sink), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("wdCount", "INTEGER");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.msg, sink), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg", "NMEA-MsgType");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.rev, sink), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("rev", "NMEA-Revision");
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
	    ee.appendFieldContext(null, "NMEA-Corrections");
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
		    if (tag != 0x81)
			source.raiseTagMismatchException(tag);
		    try {
			int idx1 = NMEA_Revision.indexOfValue(source.decodeLong());
			this.rev = (idx1 < 0) ? NMEA_Revision.unknownEnumerator() : NMEA_Revision.cNamedNumbers[idx1];
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("rev", "NMEA-Revision");
			throw ee;
		    }
		    tag = source.decodeTagLength();
		    if (tag != 0x82)
			source.raiseTagMismatchException(tag);
		    try {
			this.msg = new NMEA_MsgType(source.decodeLong());
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("msg", "NMEA-MsgType");
			throw ee;
		    }
		    tag = source.decodeTagLength();
		    if (tag != 0x83)
			source.raiseTagMismatchException(tag);
		    try {
			this.wdCount = new INTEGER(source.decodeLong());
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("wdCount", "INTEGER");
			throw ee;
		    }
		    tag = source.decodeTagLength();
		    if (tag != 0x84 && tag != 0xA4)
			source.raiseTagMismatchException(tag);
		    try {
			this.payload = new NMEA_Payload(coder.decodeOctetString(source));
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("payload", "NMEA-Payload");
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
			    ee.appendExtensionContext("NMEA-Corrections", -1);
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
	    ee.appendFieldContext(null, "NMEA-Corrections");
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
	    NMEA_Corrections temp0 = this;

	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.payload.byteArrayValue()), 0x84);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("payload", "NMEA-Payload");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.wdCount, sink), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("wdCount", "INTEGER");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.msg, sink), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msg", "NMEA-MsgType");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.rev, sink), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("rev", "NMEA-Revision");
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
	    ee.appendFieldContext(null, "NMEA-Corrections");
	    throw ee;
	}
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, NMEA_Corrections data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	++nbits;
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
	// Encode field 'rev'
	try {
	    NMEA_Revision item1 = data.rev;
	    int idx1;
	    boolean extroot1 = true;

	    if (item1.isUnknownEnumerator()) {
		throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
	    } else {
		idx1 = item1.indexOf();
		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		extroot1 = idx1 < 7;
	    }
	    sink.writeBit(!extroot1); ++nbits;
	    if (extroot1)
		nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 6, sink);
	    else
		nbits += coder.encodeNormallySmallNumber(idx1 - 7, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("rev", "NMEA-Revision");
	    throw ee;
	}
	// Encode field 'msg'
	try {
	    NMEA_MsgType item1 = data.msg;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 32767)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 32767, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msg", "NMEA-MsgType");
	    throw ee;
	}
	// Encode field 'wdCount'
	try {
	    INTEGER item1 = data.wdCount;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 1023)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 1023, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("wdCount", "INTEGER");
	    throw ee;
	}
	// Encode field 'payload'
	try {
	    NMEA_Payload item1 = data.payload;
	    int len1 = item1.getSize();

	    if (len1 < 1 || len1 > 1023)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 1023, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("payload", "NMEA-Payload");
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
	    ee.appendFieldContext(null, "NMEA-Corrections");
	    throw ee;
	}
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static NMEA_Corrections decodeValue(PerCoder coder, InputBitStream source, NMEA_Corrections data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

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
	// Decode field 'rev'
	try {
	    int idx1;
	    NMEA_Revision temp1;
	    boolean extroot1 = !source.readBit();

	    if (extroot1) {
		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 6);
		if (idx1 < 0 || idx1 > 6)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		temp1 = NMEA_Revision.valueAt(idx1);
	    } else {
		idx1 = 7 + (int)coder.decodeNormallySmallNumber(source);
		if (idx1 < 0)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		temp1 = NMEA_Revision.unknownEnumerator();
	    }
	    data.rev = temp1;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("rev", "NMEA-Revision");
	    throw de;
	}
	// Decode field 'msg'
	try {
	    long temp1;

	    if (data.msg == null)
		data.msg = new NMEA_MsgType();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 32767);
	    if (temp1 > 32767)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.msg.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("msg", "NMEA-MsgType");
	    throw de;
	}
	// Decode field 'wdCount'
	try {
	    long temp1;

	    if (data.wdCount == null)
		data.wdCount = new INTEGER();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 1023);
	    if (temp1 > 1023)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.wdCount.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("wdCount", "INTEGER");
	    throw de;
	}
	// Decode field 'payload'
	try {
	    data.payload = new NMEA_Payload(com.oss.coders.per.PerOctets.decode(coder, source, 1, 1023));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("payload", "NMEA-Payload");
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
	    de.appendFieldContext(null, "NMEA-Corrections");
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
	// Encode field 'msgID'
	try {
	    DSRCmsgID item1 = this.msgID;

	    {
		sink.encodeKey("msgID");
		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else 
		    sink.writeString(item1.name());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msgID", "DSRCmsgID");
	    throw ee;
	}
	// Encode field 'rev'
	try {
	    NMEA_Revision item1 = this.rev;

	    {
		sink.writeSeparator();
		sink.encodeKey("rev");
		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else 
		    sink.writeString(item1.name());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("rev", "NMEA-Revision");
	    throw ee;
	}
	// Encode field 'msg'
	try {
	    NMEA_MsgType item1 = this.msg;

	    {
		sink.writeSeparator();
		sink.encodeKey("msg");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msg", "NMEA-MsgType");
	    throw ee;
	}
	// Encode field 'wdCount'
	try {
	    INTEGER item1 = this.wdCount;

	    {
		sink.writeSeparator();
		sink.encodeKey("wdCount");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("wdCount", "INTEGER");
	    throw ee;
	}
	// Encode field 'payload'
	try {
	    NMEA_Payload item1 = this.payload;

	    {
		sink.writeSeparator();
		sink.encodeKey("payload");
		sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("payload", "NMEA-Payload");
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
	    ee.appendFieldContext(null, "NMEA-Corrections");
	    throw ee;
	}
    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public NMEA_Corrections decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[6];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		NMEA_Corrections.__Tag t_tag0 = NMEA_Corrections.__Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = NMEA_Corrections.__Tag._null_;
		switch (t_tag0) {
		    case __msgID:
		    // Decode field 'msgID'
		    try {
			String content1 = coder.decodeString(source);
			int idx1;
			DSRCmsgID temp1;

			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			idx1 = coder.resolveName(DSRCmsgID.cConstantNameList, content1);
			if (idx1 < 0 )
			    temp1 = DSRCmsgID.unknownEnumerator();
			else
			    temp1 = DSRCmsgID.cNamedNumbers[idx1];
			this.msgID = temp1;
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("msgID", "DSRCmsgID");
			throw de;
		    }
		    break;
		    case __rev:
		    // Decode field 'rev'
		    try {
			String content1 = coder.decodeString(source);
			int idx1;
			NMEA_Revision temp1;

			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			idx1 = coder.resolveName(NMEA_Revision.cConstantNameList, content1);
			if (idx1 < 0 )
			    temp1 = NMEA_Revision.unknownEnumerator();
			else
			    temp1 = NMEA_Revision.cNamedNumbers[idx1];
			this.rev = temp1;
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("rev", "NMEA-Revision");
			throw de;
		    }
		    break;
		    case __msg:
		    // Decode field 'msg'
		    try {
			if (present0[2])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.msg == null)
			    this.msg = new NMEA_MsgType();
			this.msg.setValue(coder.decodeInteger(source));
			present0[2] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("msg", "NMEA-MsgType");
			throw de;
		    }
		    break;
		    case __wdCount:
		    // Decode field 'wdCount'
		    try {
			if (present0[3])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.wdCount == null)
			    this.wdCount = new INTEGER();
			this.wdCount.setValue(coder.decodeInteger(source));
			present0[3] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("wdCount", "INTEGER");
			throw de;
		    }
		    break;
		    case __payload:
		    // Decode field 'payload'
		    try {
			if (present0[4])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			this.payload = new NMEA_Payload(coder.decodeOctetString(source));
			present0[4] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("payload", "NMEA-Payload");
			throw de;
		    }
		    break;
		    default:
			coder.skipValue(source);
			break;
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'msgID'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'rev'");
	if (!present0[2])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'msg'");
	if (!present0[3])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'wdCount'");
	if (!present0[4])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'payload'");
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
	    de.appendFieldContext(null, "NMEA-Corrections");
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
	    writer.print("rev ");
	    printer.print(this.rev, writer, this.rev.cConstantNameList);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("msg ");
	    writer.print(this.msg.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("wdCount ");
	    writer.print(this.wdCount.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("payload ");
	    printer.print(this.payload, writer);
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
	return "NMEA-Corrections";
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((NMEA_Corrections)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((NMEA_Corrections)that);
    }
    
    public boolean equalTo(NMEA_Corrections that) {
	if (!this.msgID.equalTo(that.msgID))
	    return false;
	if (!this.rev.equalTo(that.rev))
	    return false;
	if (!this.msg.equalTo(that.msg))
	    return false;
	if (!this.wdCount.equalTo(that.wdCount))
	    return false;
	if (!this.payload.equalTo(that.payload))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public NMEA_Corrections clone() {
	NMEA_Corrections copy = (NMEA_Corrections)super.clone();
	copy.msgID = msgID.clone();
	copy.rev = rev.clone();
	copy.msg = msg.clone();
	copy.wdCount = wdCount.clone();
	copy.payload = payload.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.msgID != null ? this.msgID.hashCode() : 0);
	hash = 41 * hash + (this.rev != null ? this.rev.hashCode() : 0);
	hash = 41 * hash + (this.msg != null ? this.msg.hashCode() : 0);
	hash = 41 * hash + (this.wdCount != null ? this.wdCount.hashCode() : 0);
	hash = 41 * hash + (this.payload != null ? this.payload.hashCode() : 0);
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
	    return new NMEA_Corrections();
	}
    };
    
} // End class definition for NMEA_Corrections
