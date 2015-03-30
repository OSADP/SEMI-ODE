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
 * Define the ASN1 Type BasicSafetyMessage from ASN1 Module DSRC.
 * @see Sequence
 */

public class BasicSafetyMessage extends Sequence implements BEREncodable, BERDecodable, DEREncodable, PEREncodable, PERDecodable {
    public DSRCmsgID msgID;
    public BSMblob blob1;
    public VehicleSafetyExtension safetyExt;
    public VehicleStatus status;
    
    /**
     * The default constructor.
     */
    public BasicSafetyMessage()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public BasicSafetyMessage(DSRCmsgID msgID, BSMblob blob1, 
		    VehicleSafetyExtension safetyExt, VehicleStatus status)
    {
	setMsgID(msgID);
	setBlob1(blob1);
	setSafetyExt(safetyExt);
	setStatus(status);
    }
    
    /**
     * Construct with required components.
     */
    public BasicSafetyMessage(DSRCmsgID msgID, BSMblob blob1)
    {
	setMsgID(msgID);
	setBlob1(blob1);
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
    
    
    // Methods for field "blob1"
    public BSMblob getBlob1()
    {
	return this.blob1;
    }
    
    public void setBlob1(BSMblob blob1)
    {
	this.blob1 = blob1;
    }
    
    
    // Methods for field "safetyExt"
    public VehicleSafetyExtension getSafetyExt()
    {
	return this.safetyExt;
    }
    
    public void setSafetyExt(VehicleSafetyExtension safetyExt)
    {
	this.safetyExt = safetyExt;
    }
    
    public boolean hasSafetyExt()
    {
	return (safetyExt != null);
    }
    
    public void deleteSafetyExt()
    {
	safetyExt = null;
    }
    
    
    // Methods for field "status"
    public VehicleStatus getStatus()
    {
	return this.status;
    }
    
    public void setStatus(VehicleStatus status)
    {
	this.status = status;
    }
    
    public boolean hasStatus()
    {
	return (status != null);
    }
    
    public void deleteStatus()
    {
	status = null;
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
	    BasicSafetyMessage temp0 = this;

	    if (temp0.status != null) {
		try {
		    len0 += sink.encodeLengthTag(temp0.status.encodeValue(coder, sink), 0xA3);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("status", "VehicleStatus");
		    throw ee;
		}
	    }
	    if (temp0.safetyExt != null) {
		try {
		    len0 += sink.encodeLengthTag(temp0.safetyExt.encodeValue(coder, sink), 0xA2);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("safetyExt", "VehicleSafetyExtension");
		    throw ee;
		}
	    }
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.blob1.byteArrayValue()), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("blob1", "BSMblob");
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
	    ee.appendFieldContext(null, "BasicSafetyMessage");
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
	this.safetyExt = null;
	this.status = null;
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
		    if (tag != 0x81 && tag != 0xA1)
			source.raiseTagMismatchException(tag);
		    try {
			this.blob1 = new BSMblob(coder.decodeOctetString(source));
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("blob1", "BSMblob");
			throw ee;
		    }
		    if (source.position() >= end_pos0)
			break;
		    tag = source.decodeTagLength();
		    if (tag == 0)
			break;
		    if (tag == 0xA2) {
			try {
			    this.safetyExt = new VehicleSafetyExtension();
			    this.safetyExt.decodeValue(coder, source);
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("safetyExt", "VehicleSafetyExtension");
			    throw ee;
			}
			if (source.position() >= end_pos0)
			    break;
			tag = source.decodeTagLength();
			if (tag == 0)
			    break;
		    }
		    if (tag == 0xA3) {
			try {
			    this.status = new VehicleStatus();
			    this.status.decodeValue(coder, source);
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("status", "VehicleStatus");
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
			    ee.appendExtensionContext("BasicSafetyMessage", -1);
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
	    ee.appendFieldContext(null, "BasicSafetyMessage");
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
	    BasicSafetyMessage temp0 = this;

	    if (temp0.status != null) {
		try {
		    len0 += sink.encodeLengthTag(temp0.status.encodeValue(coder, sink), 0xA3);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("status", "VehicleStatus");
		    throw ee;
		}
	    }
	    if (temp0.safetyExt != null) {
		try {
		    len0 += sink.encodeLengthTag(temp0.safetyExt.encodeValue(coder, sink), 0xA2);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("safetyExt", "VehicleSafetyExtension");
		    throw ee;
		}
	    }
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.blob1.byteArrayValue()), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("blob1", "BSMblob");
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
	    ee.appendFieldContext(null, "BasicSafetyMessage");
	    throw ee;
	}
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, BasicSafetyMessage data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	boolean has_safetyExt0 = data.safetyExt != null;
	boolean has_status0 = data.status != null;
	sink.writeBit(false); ++nbits;
	sink.writeBit(has_safetyExt0); ++nbits;
	sink.writeBit(has_status0); ++nbits;
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
	// Encode field 'blob1'
	try {
	    BSMblob item1 = data.blob1;
	    int len1 = item1.getSize();

	    if (len1 != 38)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 38, 38, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("blob1", "BSMblob");
	    throw ee;
	}
	if (has_safetyExt0) {
	    // Encode field 'safetyExt'
	    try {
		VehicleSafetyExtension item1 = data.safetyExt;

		nbits += VehicleSafetyExtension.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("safetyExt", "VehicleSafetyExtension");
		throw ee;
	    }
	}
	if (has_status0) {
	    // Encode field 'status'
	    try {
		VehicleStatus item1 = data.status;

		nbits += VehicleStatus.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("status", "VehicleStatus");
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
	    return BasicSafetyMessage.encodeValue(coder, sink, this);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext(null, "BasicSafetyMessage");
	    throw ee;
	}
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static BasicSafetyMessage decodeValue(PerCoder coder, InputBitStream source, BasicSafetyMessage data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	int idx0;
	InputBitStream bitstream0 = null;

	boolean has_safetyExt0 = source.readBit();
	boolean has_status0 = source.readBit();
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
	// Decode field 'blob1'
	try {
	    data.blob1 = new BSMblob(com.oss.coders.per.PerOctets.decode(coder, source, 38, 38));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("blob1", "BSMblob");
	    throw de;
	}
	if (has_safetyExt0) {
	    // Decode field 'safetyExt'
	    try {
		if (data.safetyExt == null)
		    data.safetyExt = new VehicleSafetyExtension();
		VehicleSafetyExtension.decodeValue(coder, source, data.safetyExt);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("safetyExt", "VehicleSafetyExtension");
		throw de;
	    }
	} else {
	    data.safetyExt = null;
	}
	if (has_status0) {
	    // Decode field 'status'
	    try {
		if (data.status == null)
		    data.status = new VehicleStatus();
		VehicleStatus.decodeValue(coder, source, data.status);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("status", "VehicleStatus");
		throw de;
	    }
	} else {
	    data.status = null;
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
     * Decode the PDU using PER (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public AbstractData decode(PerCoder coder, InputBitStream source)
	    throws DecoderException
    {
	try {
	    BasicSafetyMessage.decodeValue(coder, source, this);
	    return this;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext(null, "BasicSafetyMessage");
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
	    writer.print("msgID ");
	    printer.print(this.msgID, writer, this.msgID.cConstantNameList);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("blob1 ");
	    printer.print(this.blob1, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.safetyExt != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("safetyExt ");
		this.safetyExt.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.status != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("status ");
		this.status.printValue(printer, writer);
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
	return "BasicSafetyMessage";
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((BasicSafetyMessage)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((BasicSafetyMessage)that);
    }
    
    public boolean equalTo(BasicSafetyMessage that) {
	if (!this.msgID.equalTo(that.msgID))
	    return false;
	if (!this.blob1.equalTo(that.blob1))
	    return false;
	if (this.safetyExt != null && that.safetyExt != null) {
	    if (!this.safetyExt.equalTo(that.safetyExt))
		return false;
	}
	if (this.status != null && that.status != null) {
	    if (!this.status.equalTo(that.status))
		return false;
	}
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public BasicSafetyMessage clone() {
	BasicSafetyMessage copy = (BasicSafetyMessage)super.clone();
	copy.msgID = msgID.clone();
	copy.blob1 = blob1.clone();
	if (safetyExt != null) {
	    copy.safetyExt = safetyExt.clone();
	}
	if (status != null) {
	    copy.status = status.clone();
	}
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
	    return new BasicSafetyMessage();
	}
    };
    
} // End class definition for BasicSafetyMessage
