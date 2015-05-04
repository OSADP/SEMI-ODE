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
 * Define the ASN1 Type SignalRequest from ASN1 Module DSRC.
 * @see Sequence
 */

public class SignalRequest extends Sequence {
    public IntersectionID id;
    public SignalReqScheme isCancel;
    public SignalReqScheme requestedAction;
    public LaneNumber inLane;
    public LaneNumber outLane;
    public NTCIPVehicleclass type;
    public CodeWord codeWord;
    
    /**
     * The default constructor.
     */
    public SignalRequest()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SignalRequest(IntersectionID id, SignalReqScheme isCancel, 
		    SignalReqScheme requestedAction, LaneNumber inLane, 
		    LaneNumber outLane, NTCIPVehicleclass type, 
		    CodeWord codeWord)
    {
	setId(id);
	setIsCancel(isCancel);
	setRequestedAction(requestedAction);
	setInLane(inLane);
	setOutLane(outLane);
	setType(type);
	setCodeWord(codeWord);
    }
    
    /**
     * Construct with required components.
     */
    public SignalRequest(IntersectionID id, NTCIPVehicleclass type)
    {
	setId(id);
	setType(type);
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
    
    
    // Methods for field "isCancel"
    public SignalReqScheme getIsCancel()
    {
	return this.isCancel;
    }
    
    public void setIsCancel(SignalReqScheme isCancel)
    {
	this.isCancel = isCancel;
    }
    
    public boolean hasIsCancel()
    {
	return (isCancel != null);
    }
    
    public void deleteIsCancel()
    {
	isCancel = null;
    }
    
    
    // Methods for field "requestedAction"
    public SignalReqScheme getRequestedAction()
    {
	return this.requestedAction;
    }
    
    public void setRequestedAction(SignalReqScheme requestedAction)
    {
	this.requestedAction = requestedAction;
    }
    
    public boolean hasRequestedAction()
    {
	return (requestedAction != null);
    }
    
    public void deleteRequestedAction()
    {
	requestedAction = null;
    }
    
    
    // Methods for field "inLane"
    public LaneNumber getInLane()
    {
	return this.inLane;
    }
    
    public void setInLane(LaneNumber inLane)
    {
	this.inLane = inLane;
    }
    
    public boolean hasInLane()
    {
	return (inLane != null);
    }
    
    public void deleteInLane()
    {
	inLane = null;
    }
    
    
    // Methods for field "outLane"
    public LaneNumber getOutLane()
    {
	return this.outLane;
    }
    
    public void setOutLane(LaneNumber outLane)
    {
	this.outLane = outLane;
    }
    
    public boolean hasOutLane()
    {
	return (outLane != null);
    }
    
    public void deleteOutLane()
    {
	outLane = null;
    }
    
    
    // Methods for field "type"
    public NTCIPVehicleclass getType()
    {
	return this.type;
    }
    
    public void setType(NTCIPVehicleclass type)
    {
	this.type = type;
    }
    
    
    // Methods for field "codeWord"
    public CodeWord getCodeWord()
    {
	return this.codeWord;
    }
    
    public void setCodeWord(CodeWord codeWord)
    {
	this.codeWord = codeWord;
    }
    
    public boolean hasCodeWord()
    {
	return (codeWord != null);
    }
    
    public void deleteCodeWord()
    {
	codeWord = null;
    }
    
    
    /**
     * Implements BER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encodeValue(BerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	int len0 = 0;
	SignalRequest temp0 = this;

	if (temp0.codeWord != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.codeWord.byteArrayValue()), 0x86);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("codeWord", "CodeWord");
		throw ee;
	    }
	}
	try {
	    len0 += sink.encodeLengthTag(sink.write(temp0.type.byteArrayValue()), 0x85);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("type", "NTCIPVehicleclass");
	    throw ee;
	}
	if (temp0.outLane != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.outLane.byteArrayValue()), 0x84);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("outLane", "LaneNumber");
		throw ee;
	    }
	}
	if (temp0.inLane != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.inLane.byteArrayValue()), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("inLane", "LaneNumber");
		throw ee;
	    }
	}
	if (temp0.requestedAction != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.requestedAction.byteArrayValue()), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("requestedAction", "SignalReqScheme");
		throw ee;
	    }
	}
	if (temp0.isCancel != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.isCancel.byteArrayValue()), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("isCancel", "SignalReqScheme");
		throw ee;
	    }
	}
	try {
	    len0 += sink.encodeLengthTag(sink.write(temp0.id.byteArrayValue()), 0x80);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("id", "IntersectionID");
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements BER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public SignalRequest decodeValue(BerCoder coder, DecoderInput source)
	    throws DecoderException
    {
	int total_len0 = source.mLength;
	int end_pos0 = (total_len0 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len0);
	int tag;

	do {
	    tag = source.decodeTagLength();
	    if (tag != 0x80 && tag != 0xA0)
		source.raiseTagMismatchException(tag);
	    try {
		this.id = new IntersectionID(coder.decodeOctetString(source));
	    } catch (Exception e) {
		DecoderException ee = DecoderException.wrapException(e);
		ee.appendFieldContext("id", "IntersectionID");
		throw ee;
	    }
	    tag = source.decodeTagLength();
	    if (tag == 0x81 || tag == 0xA1) {
		try {
		    this.isCancel = new SignalReqScheme(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("isCancel", "SignalReqScheme");
		    throw ee;
		}
		tag = source.decodeTagLength();
	    }
	    if (tag == 0x82 || tag == 0xA2) {
		try {
		    this.requestedAction = new SignalReqScheme(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("requestedAction", "SignalReqScheme");
		    throw ee;
		}
		tag = source.decodeTagLength();
	    }
	    if (tag == 0x83 || tag == 0xA3) {
		try {
		    this.inLane = new LaneNumber(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("inLane", "LaneNumber");
		    throw ee;
		}
		tag = source.decodeTagLength();
	    }
	    if (tag == 0x84 || tag == 0xA4) {
		try {
		    this.outLane = new LaneNumber(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("outLane", "LaneNumber");
		    throw ee;
		}
		tag = source.decodeTagLength();
	    }
	    if (tag != 0x85 && tag != 0xA5)
		source.raiseTagMismatchException(tag);
	    try {
		this.type = new NTCIPVehicleclass(coder.decodeOctetString(source));
	    } catch (Exception e) {
		DecoderException ee = DecoderException.wrapException(e);
		ee.appendFieldContext("type", "NTCIPVehicleclass");
		throw ee;
	    }
	    if (source.position() >= end_pos0)
		break;
	    tag = source.decodeTagLength();
	    if (tag == 0)
		break;
	    if (tag == 0x86 || tag == 0xA6) {
		try {
		    this.codeWord = new CodeWord(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("codeWord", "CodeWord");
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
		    ee.appendExtensionContext("SignalRequest", -1);
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

	return this;
    }

    /**
     * Implements BER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encodeValue(DerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	int len0 = 0;
	SignalRequest temp0 = this;

	if (temp0.codeWord != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.codeWord.byteArrayValue()), 0x86);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("codeWord", "CodeWord");
		throw ee;
	    }
	}
	try {
	    len0 += sink.encodeLengthTag(sink.write(temp0.type.byteArrayValue()), 0x85);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("type", "NTCIPVehicleclass");
	    throw ee;
	}
	if (temp0.outLane != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.outLane.byteArrayValue()), 0x84);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("outLane", "LaneNumber");
		throw ee;
	    }
	}
	if (temp0.inLane != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.inLane.byteArrayValue()), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("inLane", "LaneNumber");
		throw ee;
	    }
	}
	if (temp0.requestedAction != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.requestedAction.byteArrayValue()), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("requestedAction", "SignalReqScheme");
		throw ee;
	    }
	}
	if (temp0.isCancel != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.isCancel.byteArrayValue()), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("isCancel", "SignalReqScheme");
		throw ee;
	    }
	}
	try {
	    len0 += sink.encodeLengthTag(sink.write(temp0.id.byteArrayValue()), 0x80);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("id", "IntersectionID");
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, SignalRequest data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	boolean has_isCancel0 = data.isCancel != null;
	boolean has_requestedAction0 = data.requestedAction != null;
	boolean has_inLane0 = data.inLane != null;
	boolean has_outLane0 = data.outLane != null;
	boolean has_codeWord0 = data.codeWord != null;
	sink.writeBit(false); ++nbits;
	sink.writeBit(has_isCancel0); ++nbits;
	sink.writeBit(has_requestedAction0); ++nbits;
	sink.writeBit(has_inLane0); ++nbits;
	sink.writeBit(has_outLane0); ++nbits;
	sink.writeBit(has_codeWord0); ++nbits;
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
	if (has_isCancel0) {
	    // Encode field 'isCancel'
	    try {
		SignalReqScheme item1 = data.isCancel;
		int len1 = item1.getSize();

		if (len1 != 1)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 1, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("isCancel", "SignalReqScheme");
		throw ee;
	    }
	}
	if (has_requestedAction0) {
	    // Encode field 'requestedAction'
	    try {
		SignalReqScheme item1 = data.requestedAction;
		int len1 = item1.getSize();

		if (len1 != 1)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 1, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("requestedAction", "SignalReqScheme");
		throw ee;
	    }
	}
	if (has_inLane0) {
	    // Encode field 'inLane'
	    try {
		LaneNumber item1 = data.inLane;
		int len1 = item1.getSize();

		if (len1 != 1)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 1, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("inLane", "LaneNumber");
		throw ee;
	    }
	}
	if (has_outLane0) {
	    // Encode field 'outLane'
	    try {
		LaneNumber item1 = data.outLane;
		int len1 = item1.getSize();

		if (len1 != 1)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 1, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("outLane", "LaneNumber");
		throw ee;
	    }
	}
	// Encode field 'type'
	try {
	    NTCIPVehicleclass item1 = data.type;
	    int len1 = item1.getSize();

	    if (len1 != 1)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 1, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("type", "NTCIPVehicleclass");
	    throw ee;
	}
	if (has_codeWord0) {
	    // Encode field 'codeWord'
	    try {
		CodeWord item1 = data.codeWord;
		int len1 = item1.getSize();

		if (len1 < 1 || len1 > 16)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 16, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("codeWord", "CodeWord");
		throw ee;
	    }
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static SignalRequest decodeValue(PerCoder coder, InputBitStream source, SignalRequest data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	int idx0;
	InputBitStream bitstream0 = null;

	boolean has_isCancel0 = source.readBit();
	boolean has_requestedAction0 = source.readBit();
	boolean has_inLane0 = source.readBit();
	boolean has_outLane0 = source.readBit();
	boolean has_codeWord0 = source.readBit();
	// Decode field 'id'
	try {
	    data.id = new IntersectionID(com.oss.coders.per.PerOctets.decode(coder, source, 2, 4));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("id", "IntersectionID");
	    throw de;
	}
	if (has_isCancel0) {
	    // Decode field 'isCancel'
	    try {
		data.isCancel = new SignalReqScheme(com.oss.coders.per.PerOctets.decode(coder, source, 1, 1));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("isCancel", "SignalReqScheme");
		throw de;
	    }
	} else {
	    data.isCancel = null;
	}
	if (has_requestedAction0) {
	    // Decode field 'requestedAction'
	    try {
		data.requestedAction = new SignalReqScheme(com.oss.coders.per.PerOctets.decode(coder, source, 1, 1));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("requestedAction", "SignalReqScheme");
		throw de;
	    }
	} else {
	    data.requestedAction = null;
	}
	if (has_inLane0) {
	    // Decode field 'inLane'
	    try {
		data.inLane = new LaneNumber(com.oss.coders.per.PerOctets.decode(coder, source, 1, 1));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("inLane", "LaneNumber");
		throw de;
	    }
	} else {
	    data.inLane = null;
	}
	if (has_outLane0) {
	    // Decode field 'outLane'
	    try {
		data.outLane = new LaneNumber(com.oss.coders.per.PerOctets.decode(coder, source, 1, 1));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("outLane", "LaneNumber");
		throw de;
	    }
	} else {
	    data.outLane = null;
	}
	// Decode field 'type'
	try {
	    data.type = new NTCIPVehicleclass(com.oss.coders.per.PerOctets.decode(coder, source, 1, 1));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("type", "NTCIPVehicleclass");
	    throw de;
	}
	if (has_codeWord0) {
	    // Decode field 'codeWord'
	    try {
		data.codeWord = new CodeWord(com.oss.coders.per.PerOctets.decode(coder, source, 1, 16));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("codeWord", "CodeWord");
		throw de;
	    }
	} else {
	    data.codeWord = null;
	}
	if (_has_extensions0) {
	    len0 = coder.decodeNormallySmallLength(source);
	    if (coder.moreFragments())
		throw new DecoderException(com.oss.util.ExceptionDescriptor._too_many_ext_additions, null, "16384 or more");
	    int unknown_exts0 = 0;
	    if (len0 > 0)
		for (idx0 = 0; idx0 < len0 - 0; idx0++) {
		    if (source.readBit())
			++unknown_exts0;
		}
	    bitstream0 = source;
	    source = coder.createNestedStream(bitstream0);
	    try {
	    } finally {
		source.close();
	    }
	    source = bitstream0;
	    for (idx0 = 0; idx0 < unknown_exts0; idx0++) {
		try {
		    com.oss.coders.per.PerOctets.skip(coder, source);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendExtensionContext(null, idx0);
		    throw de;
		}
	    }
	}
	return data;
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
	    writer.print("id ");
	    printer.print(this.id, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.isCancel != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("isCancel ");
		printer.print(this.isCancel, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.requestedAction != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("requestedAction ");
		printer.print(this.requestedAction, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.inLane != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("inLane ");
		printer.print(this.inLane, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.outLane != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("outLane ");
		printer.print(this.outLane, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("type ");
	    printer.print(this.type, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.codeWord != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("codeWord ");
		printer.print(this.codeWord, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	printer.undent();
	if (comma0)
	    printer.newLine(writer);
	writer.print('}');
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((SignalRequest)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((SignalRequest)that);
    }
    
    public boolean equalTo(SignalRequest that) {
	if (!this.id.equalTo(that.id))
	    return false;
	if (this.isCancel != null && that.isCancel != null) {
	    if (!this.isCancel.equalTo(that.isCancel))
		return false;
	}
	if (this.requestedAction != null && that.requestedAction != null) {
	    if (!this.requestedAction.equalTo(that.requestedAction))
		return false;
	}
	if (this.inLane != null && that.inLane != null) {
	    if (!this.inLane.equalTo(that.inLane))
		return false;
	}
	if (this.outLane != null && that.outLane != null) {
	    if (!this.outLane.equalTo(that.outLane))
		return false;
	}
	if (!this.type.equalTo(that.type))
	    return false;
	if (this.codeWord != null && that.codeWord != null) {
	    if (!this.codeWord.equalTo(that.codeWord))
		return false;
	}
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public SignalRequest clone() {
	SignalRequest copy = (SignalRequest)super.clone();
	copy.id = id.clone();
	if (isCancel != null) {
	    copy.isCancel = isCancel.clone();
	}
	if (requestedAction != null) {
	    copy.requestedAction = requestedAction.clone();
	}
	if (inLane != null) {
	    copy.inLane = inLane.clone();
	}
	if (outLane != null) {
	    copy.outLane = outLane.clone();
	}
	copy.type = type.clone();
	if (codeWord != null) {
	    copy.codeWord = codeWord.clone();
	}
	return copy;
    }

} // End class definition for SignalRequest
