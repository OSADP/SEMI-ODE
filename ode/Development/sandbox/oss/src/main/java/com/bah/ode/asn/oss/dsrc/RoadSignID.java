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
/* Created: Tue Mar 24 11:33:39 2015 */
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
 * Define the ASN1 Type RoadSignID from ASN1 Module DSRC.
 * @see Sequence
 */

public class RoadSignID extends Sequence {
    public Position3D position;
    public HeadingSlice viewAngle;
    public MUTCDCode mutcdCode;
    public MsgCRC crc;
    
    /**
     * The default constructor.
     */
    public RoadSignID()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RoadSignID(Position3D position, HeadingSlice viewAngle, 
		    MUTCDCode mutcdCode, MsgCRC crc)
    {
	setPosition(position);
	setViewAngle(viewAngle);
	setMutcdCode(mutcdCode);
	setCrc(crc);
    }
    
    /**
     * Construct with required components.
     */
    public RoadSignID(Position3D position, HeadingSlice viewAngle)
    {
	setPosition(position);
	setViewAngle(viewAngle);
    }
    
    
    // Methods for field "position"
    public Position3D getPosition()
    {
	return this.position;
    }
    
    public void setPosition(Position3D position)
    {
	this.position = position;
    }
    
    
    // Methods for field "viewAngle"
    public HeadingSlice getViewAngle()
    {
	return this.viewAngle;
    }
    
    public void setViewAngle(HeadingSlice viewAngle)
    {
	this.viewAngle = viewAngle;
    }
    
    
    // Methods for field "mutcdCode"
    public MUTCDCode getMutcdCode()
    {
	return this.mutcdCode;
    }
    
    public void setMutcdCode(MUTCDCode mutcdCode)
    {
	this.mutcdCode = mutcdCode;
    }
    
    public boolean hasMutcdCode()
    {
	return (mutcdCode != null);
    }
    
    public void deleteMutcdCode()
    {
	mutcdCode = null;
    }
    
    
    // Methods for field "crc"
    public MsgCRC getCrc()
    {
	return this.crc;
    }
    
    public void setCrc(MsgCRC crc)
    {
	this.crc = crc;
    }
    
    public boolean hasCrc()
    {
	return (crc != null);
    }
    
    public void deleteCrc()
    {
	crc = null;
    }
    
    
    /**
     * Implements BER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encodeValue(BerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	int len0 = 0;
	RoadSignID temp0 = this;

	if (temp0.crc != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.crc.byteArrayValue()), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("crc", "MsgCRC");
		throw ee;
	    }
	}
	if (temp0.mutcdCode != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.mutcdCode, sink), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("mutcdCode", "MUTCDCode");
		throw ee;
	    }
	}
	try {
	    len0 += sink.encodeLengthTag(sink.write(temp0.viewAngle.byteArrayValue()), 0x81);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("viewAngle", "HeadingSlice");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(temp0.position.encodeValue(coder, sink), 0xA0);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("position", "Position3D");
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements BER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public RoadSignID decodeValue(BerCoder coder, DecoderInput source)
	    throws DecoderException
    {
	int total_len0 = source.mLength;
	int end_pos0 = (total_len0 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len0);
	int tag;

	do {
	    tag = source.decodeTagLength();
	    if (tag != 0xA0)
		source.raiseTagMismatchException(tag);
	    try {
		this.position = new Position3D();
		this.position.decodeValue(coder, source);
	    } catch (Exception e) {
		DecoderException ee = DecoderException.wrapException(e);
		ee.appendFieldContext("position", "Position3D");
		throw ee;
	    }
	    tag = source.decodeTagLength();
	    if (tag != 0x81 && tag != 0xA1)
		source.raiseTagMismatchException(tag);
	    try {
		this.viewAngle = new HeadingSlice(coder.decodeOctetString(source));
	    } catch (Exception e) {
		DecoderException ee = DecoderException.wrapException(e);
		ee.appendFieldContext("viewAngle", "HeadingSlice");
		throw ee;
	    }
	    if (source.position() >= end_pos0)
		break;
	    tag = source.decodeTagLength();
	    if (tag == 0)
		break;
	    if (tag == 0x82) {
		try {
		    int idx1 = MUTCDCode.indexOfValue(source.decodeLong());
		    this.mutcdCode = (idx1 < 0) ? MUTCDCode.unknownEnumerator() : MUTCDCode.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("mutcdCode", "MUTCDCode");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x83 || tag == 0xA3) {
		try {
		    this.crc = new MsgCRC(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("crc", "MsgCRC");
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
	RoadSignID temp0 = this;

	if (temp0.crc != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.crc.byteArrayValue()), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("crc", "MsgCRC");
		throw ee;
	    }
	}
	if (temp0.mutcdCode != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.mutcdCode, sink), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("mutcdCode", "MUTCDCode");
		throw ee;
	    }
	}
	try {
	    len0 += sink.encodeLengthTag(sink.write(temp0.viewAngle.byteArrayValue()), 0x81);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("viewAngle", "HeadingSlice");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(temp0.position.encodeValue(coder, sink), 0xA0);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("position", "Position3D");
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, RoadSignID data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	boolean has_mutcdCode0 = data.mutcdCode != null;
	boolean has_crc0 = data.crc != null;
	sink.writeBit(has_mutcdCode0); ++nbits;
	sink.writeBit(has_crc0); ++nbits;
	// Encode field 'position'
	try {
	    Position3D item1 = data.position;

	    nbits += Position3D.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("position", "Position3D");
	    throw ee;
	}
	// Encode field 'viewAngle'
	try {
	    HeadingSlice item1 = data.viewAngle;
	    int len1 = item1.getSize();

	    if (len1 != 2)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 2, 2, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("viewAngle", "HeadingSlice");
	    throw ee;
	}
	if (has_mutcdCode0) {
	    // Encode field 'mutcdCode'
	    try {
		MUTCDCode item1 = data.mutcdCode;
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
		ee.appendFieldContext("mutcdCode", "MUTCDCode");
		throw ee;
	    }
	}
	if (has_crc0) {
	    // Encode field 'crc'
	    try {
		MsgCRC item1 = data.crc;
		int len1 = item1.getSize();

		if (len1 != 2)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 2, 2, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("crc", "MsgCRC");
		throw ee;
	    }
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static RoadSignID decodeValue(PerCoder coder, InputBitStream source, RoadSignID data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean has_mutcdCode0 = source.readBit();
	boolean has_crc0 = source.readBit();
	// Decode field 'position'
	try {
	    if (data.position == null)
		data.position = new Position3D();
	    Position3D.decodeValue(coder, source, data.position);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("position", "Position3D");
	    throw de;
	}
	// Decode field 'viewAngle'
	try {
	    data.viewAngle = new HeadingSlice(com.oss.coders.per.PerOctets.decode(coder, source, 2, 2));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("viewAngle", "HeadingSlice");
	    throw de;
	}
	if (has_mutcdCode0) {
	    // Decode field 'mutcdCode'
	    try {
		int idx1;
		MUTCDCode temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 6);
		    if (idx1 < 0 || idx1 > 6)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = MUTCDCode.valueAt(idx1);
		} else {
		    idx1 = 7 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = MUTCDCode.unknownEnumerator();
		}
		data.mutcdCode = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("mutcdCode", "MUTCDCode");
		throw de;
	    }
	} else {
	    data.mutcdCode = null;
	}
	if (has_crc0) {
	    // Decode field 'crc'
	    try {
		data.crc = new MsgCRC(com.oss.coders.per.PerOctets.decode(coder, source, 2, 2));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("crc", "MsgCRC");
		throw de;
	    }
	} else {
	    data.crc = null;
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
	    writer.print("position ");
	    this.position.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("viewAngle ");
	    printer.print(this.viewAngle, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.mutcdCode != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("mutcdCode ");
		printer.print(this.mutcdCode, writer, this.mutcdCode.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.crc != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("crc ");
		printer.print(this.crc, writer);
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
	return equalTo((RoadSignID)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((RoadSignID)that);
    }
    
    public boolean equalTo(RoadSignID that) {
	if (!this.position.equalTo(that.position))
	    return false;
	if (!this.viewAngle.equalTo(that.viewAngle))
	    return false;
	if (this.mutcdCode != null && that.mutcdCode != null) {
	    if (!this.mutcdCode.equalTo(that.mutcdCode))
		return false;
	}
	if (this.crc != null && that.crc != null) {
	    if (!this.crc.equalTo(that.crc))
		return false;
	}
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public RoadSignID clone() {
	RoadSignID copy = (RoadSignID)super.clone();
	copy.position = position.clone();
	copy.viewAngle = viewAngle.clone();
	if (mutcdCode != null) {
	    copy.mutcdCode = mutcdCode.clone();
	}
	if (crc != null) {
	    copy.crc = crc.clone();
	}
	return copy;
    }

} // End class definition for RoadSignID
