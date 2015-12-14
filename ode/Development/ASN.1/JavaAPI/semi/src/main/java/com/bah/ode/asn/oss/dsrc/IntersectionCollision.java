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
/* Created: Mon Dec 14 11:50:30 2015 */
/* ASN.1 Compiler for Java version: 6.2 */
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
 * Define the ASN1 Type IntersectionCollision from ASN1 Module DSRC.
 * @see Sequence
 */

public class IntersectionCollision extends Sequence implements BEREncodable, BERDecodable, DEREncodable, PEREncodable, PERDecodable {
    public DSRCmsgID msgID;
    public MsgCount msgCnt;
    public TemporaryID id;
    public DSecond secMark;
    public PathHistory path;
    public IntersectionID intersetionID;
    public LaneNumber laneNumber;
    public EventFlags eventFlag;
    
    /**
     * The default constructor.
     */
    public IntersectionCollision()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public IntersectionCollision(DSRCmsgID msgID, MsgCount msgCnt, 
		    TemporaryID id, DSecond secMark, PathHistory path, 
		    IntersectionID intersetionID, LaneNumber laneNumber, 
		    EventFlags eventFlag)
    {
	setMsgID(msgID);
	setMsgCnt(msgCnt);
	setId(id);
	setSecMark(secMark);
	setPath(path);
	setIntersetionID(intersetionID);
	setLaneNumber(laneNumber);
	setEventFlag(eventFlag);
    }
    
    /**
     * Construct with required components.
     */
    public IntersectionCollision(DSRCmsgID msgID, MsgCount msgCnt, 
		    TemporaryID id, PathHistory path, 
		    IntersectionID intersetionID, LaneNumber laneNumber, 
		    EventFlags eventFlag)
    {
	setMsgID(msgID);
	setMsgCnt(msgCnt);
	setId(id);
	setPath(path);
	setIntersetionID(intersetionID);
	setLaneNumber(laneNumber);
	setEventFlag(eventFlag);
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
    public TemporaryID getId()
    {
	return this.id;
    }
    
    public void setId(TemporaryID id)
    {
	this.id = id;
    }
    
    
    // Methods for field "secMark"
    public DSecond getSecMark()
    {
	return this.secMark;
    }
    
    public void setSecMark(DSecond secMark)
    {
	this.secMark = secMark;
    }
    
    public boolean hasSecMark()
    {
	return (secMark != null);
    }
    
    public void deleteSecMark()
    {
	secMark = null;
    }
    
    
    // Methods for field "path"
    public PathHistory getPath()
    {
	return this.path;
    }
    
    public void setPath(PathHistory path)
    {
	this.path = path;
    }
    
    
    // Methods for field "intersetionID"
    public IntersectionID getIntersetionID()
    {
	return this.intersetionID;
    }
    
    public void setIntersetionID(IntersectionID intersetionID)
    {
	this.intersetionID = intersetionID;
    }
    
    
    // Methods for field "laneNumber"
    public LaneNumber getLaneNumber()
    {
	return this.laneNumber;
    }
    
    public void setLaneNumber(LaneNumber laneNumber)
    {
	this.laneNumber = laneNumber;
    }
    
    
    // Methods for field "eventFlag"
    public EventFlags getEventFlag()
    {
	return this.eventFlag;
    }
    
    public void setEventFlag(EventFlags eventFlag)
    {
	this.eventFlag = eventFlag;
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
	    IntersectionCollision temp0 = this;

	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.eventFlag, sink), 0x87);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("eventFlag", "EventFlags");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.laneNumber.byteArrayValue()), 0x86);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("laneNumber", "LaneNumber");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.intersetionID.byteArrayValue()), 0x85);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("intersetionID", "IntersectionID");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(temp0.path.encodeValue(coder, sink), 0xA4);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("path", "PathHistory");
		throw ee;
	    }
	    if (temp0.secMark != null) {
		try {
		    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.secMark, sink), 0x83);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("secMark", "DSecond");
		    throw ee;
		}
	    }
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.id.byteArrayValue()), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("id", "TemporaryID");
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
	    ee.appendFieldContext(null, "IntersectionCollision");
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
	this.secMark = null;
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
			this.id = new TemporaryID(coder.decodeOctetString(source));
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("id", "TemporaryID");
			throw ee;
		    }
		    tag = source.decodeTagLength();
		    if (tag == 0x83) {
			try {
			    this.secMark = new DSecond(source.decodeLong());
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("secMark", "DSecond");
			    throw ee;
			}
			tag = source.decodeTagLength();
		    }
		    if (tag != 0xA4)
			source.raiseTagMismatchException(tag);
		    try {
			this.path = new PathHistory();
			this.path.decodeValue(coder, source);
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("path", "PathHistory");
			throw ee;
		    }
		    tag = source.decodeTagLength();
		    if (tag != 0x85 && tag != 0xA5)
			source.raiseTagMismatchException(tag);
		    try {
			this.intersetionID = new IntersectionID(coder.decodeOctetString(source));
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("intersetionID", "IntersectionID");
			throw ee;
		    }
		    tag = source.decodeTagLength();
		    if (tag != 0x86 && tag != 0xA6)
			source.raiseTagMismatchException(tag);
		    try {
			this.laneNumber = new LaneNumber(coder.decodeOctetString(source));
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("laneNumber", "LaneNumber");
			throw ee;
		    }
		    tag = source.decodeTagLength();
		    if (tag != 0x87)
			source.raiseTagMismatchException(tag);
		    try {
			this.eventFlag = new EventFlags(source.decodeLong());
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("eventFlag", "EventFlags");
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
			    ee.appendExtensionContext("IntersectionCollision", -1);
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
	    ee.appendFieldContext(null, "IntersectionCollision");
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
	    IntersectionCollision temp0 = this;

	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.eventFlag, sink), 0x87);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("eventFlag", "EventFlags");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.laneNumber.byteArrayValue()), 0x86);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("laneNumber", "LaneNumber");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.intersetionID.byteArrayValue()), 0x85);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("intersetionID", "IntersectionID");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(temp0.path.encodeValue(coder, sink), 0xA4);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("path", "PathHistory");
		throw ee;
	    }
	    if (temp0.secMark != null) {
		try {
		    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.secMark, sink), 0x83);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("secMark", "DSecond");
		    throw ee;
		}
	    }
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.id.byteArrayValue()), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("id", "TemporaryID");
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
	    ee.appendFieldContext(null, "IntersectionCollision");
	    throw ee;
	}
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, IntersectionCollision data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.secMark != null);
	nbits += 2;
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
	if (data.secMark != null) {
	    // Encode field 'secMark'
	    try {
		DSecond item1 = data.secMark;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 65535)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 65535, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("secMark", "DSecond");
		throw ee;
	    }
	}
	// Encode field 'path'
	try {
	    PathHistory item1 = data.path;

	    nbits += PathHistory.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("path", "PathHistory");
	    throw ee;
	}
	// Encode field 'intersetionID'
	try {
	    IntersectionID item1 = data.intersetionID;
	    int len1 = item1.getSize();

	    if (len1 < 2 || len1 > 4)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 2, 4, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("intersetionID", "IntersectionID");
	    throw ee;
	}
	// Encode field 'laneNumber'
	try {
	    LaneNumber item1 = data.laneNumber;
	    int len1 = item1.getSize();

	    if (len1 != 1)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 1, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("laneNumber", "LaneNumber");
	    throw ee;
	}
	// Encode field 'eventFlag'
	try {
	    EventFlags item1 = data.eventFlag;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 8192)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 8192, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("eventFlag", "EventFlags");
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
	    ee.appendFieldContext(null, "IntersectionCollision");
	    throw ee;
	}
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static IntersectionCollision decodeValue(PerCoder coder, InputBitStream source, IntersectionCollision data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_secMark0 = source.readBit();
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
	    data.id = new TemporaryID(com.oss.coders.per.PerOctets.decode(coder, source, 4, 4));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("id", "TemporaryID");
	    throw de;
	}
	if (has_secMark0) {
	    // Decode field 'secMark'
	    try {
		long temp1;

		if (data.secMark == null)
		    data.secMark = new DSecond();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 65535);
		if (temp1 > 65535)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.secMark.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("secMark", "DSecond");
		throw de;
	    }
	} else {
	    data.secMark = null;
	}
	// Decode field 'path'
	try {
	    if (data.path == null)
		data.path = new PathHistory();
	    data.path.decodeValue(coder, source, data.path);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("path", "PathHistory");
	    throw de;
	}
	// Decode field 'intersetionID'
	try {
	    data.intersetionID = new IntersectionID(com.oss.coders.per.PerOctets.decode(coder, source, 2, 4));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("intersetionID", "IntersectionID");
	    throw de;
	}
	// Decode field 'laneNumber'
	try {
	    data.laneNumber = new LaneNumber(com.oss.coders.per.PerOctets.decode(coder, source, 1, 1));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("laneNumber", "LaneNumber");
	    throw de;
	}
	// Decode field 'eventFlag'
	try {
	    long temp1;

	    if (data.eventFlag == null)
		data.eventFlag = new EventFlags();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 8192);
	    if (temp1 > 8192)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.eventFlag.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("eventFlag", "EventFlags");
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
	    de.appendFieldContext(null, "IntersectionCollision");
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
	if (this.secMark != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("secMark ");
		writer.print(this.secMark.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("path ");
	    this.path.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("intersetionID ");
	    printer.print(this.intersetionID, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("laneNumber ");
	    printer.print(this.laneNumber, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("eventFlag ");
	    writer.print(this.eventFlag.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	printer.undent();
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
	return "IntersectionCollision";
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((IntersectionCollision)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((IntersectionCollision)that);
    }
    
    public boolean equalTo(IntersectionCollision that) {
	if (!this.msgID.equalTo(that.msgID))
	    return false;
	if (!this.msgCnt.equalTo(that.msgCnt))
	    return false;
	if (!this.id.equalTo(that.id))
	    return false;
	if (this.secMark != null && that.secMark != null) {
	    if (!this.secMark.equalTo(that.secMark))
		return false;
	}
	if (!this.path.equalTo(that.path))
	    return false;
	if (!this.intersetionID.equalTo(that.intersetionID))
	    return false;
	if (!this.laneNumber.equalTo(that.laneNumber))
	    return false;
	if (!this.eventFlag.equalTo(that.eventFlag))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public IntersectionCollision clone() {
	IntersectionCollision copy = (IntersectionCollision)super.clone();
	copy.msgID = msgID.clone();
	copy.msgCnt = msgCnt.clone();
	copy.id = id.clone();
	if (secMark != null) {
	    copy.secMark = secMark.clone();
	}
	copy.path = path.clone();
	copy.intersetionID = intersetionID.clone();
	copy.laneNumber = laneNumber.clone();
	copy.eventFlag = eventFlag.clone();
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
	hash = 41 * hash + (this.secMark != null ? this.secMark.hashCode() : 0);
	hash = 41 * hash + (this.path != null ? this.path.hashCode() : 0);
	hash = 41 * hash + (this.intersetionID != null ? this.intersetionID.hashCode() : 0);
	hash = 41 * hash + (this.laneNumber != null ? this.laneNumber.hashCode() : 0);
	hash = 41 * hash + (this.eventFlag != null ? this.eventFlag.hashCode() : 0);
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
	    return new IntersectionCollision();
	}
    };
    
} // End class definition for IntersectionCollision
