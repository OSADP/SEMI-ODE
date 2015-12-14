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
/* Created: Mon Dec 14 18:10:04 2015 */
/* ASN.1 Compiler for Java version: 6.2 */
/* ASN.1 compiler options and file names specified:
 * -toed -output com.bah.ode.asn.oss -per -uper -ber -der -root
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
import com.oss.coders.OutputBitStream;
import com.oss.coders.per.PEREncodable;
import com.oss.coders.InputBitStream;
import com.oss.coders.per.PERDecodable;
import com.oss.coders.per.PerCoder;

/**
 * Define the ASN1 Type VehicleStatusRequest from ASN1 Module DSRC.
 * @see Sequence
 */

public class VehicleStatusRequest extends Sequence {
    public VehicleStatusDeviceTypeTag dataType;
    public INTEGER subType;
    public INTEGER sendOnLessThenValue;
    public INTEGER sendOnMoreThenValue;
    public BOOLEAN sendAll;
    
    /**
     * The default constructor.
     */
    public VehicleStatusRequest()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public VehicleStatusRequest(VehicleStatusDeviceTypeTag dataType, 
		    INTEGER subType, INTEGER sendOnLessThenValue, 
		    INTEGER sendOnMoreThenValue, BOOLEAN sendAll)
    {
	setDataType(dataType);
	setSubType(subType);
	setSendOnLessThenValue(sendOnLessThenValue);
	setSendOnMoreThenValue(sendOnMoreThenValue);
	setSendAll(sendAll);
    }
    
    /**
     * Construct with components.
     */
    public VehicleStatusRequest(VehicleStatusDeviceTypeTag dataType, 
		    long subType, long sendOnLessThenValue, 
		    long sendOnMoreThenValue, boolean sendAll)
    {
	this(dataType, new INTEGER(subType), 
	     new INTEGER(sendOnLessThenValue), 
	     new INTEGER(sendOnMoreThenValue), new BOOLEAN(sendAll));
    }
    
    /**
     * Construct with required components.
     */
    public VehicleStatusRequest(VehicleStatusDeviceTypeTag dataType)
    {
	setDataType(dataType);
    }
    
    
    // Methods for field "dataType"
    public VehicleStatusDeviceTypeTag getDataType()
    {
	return this.dataType;
    }
    
    public void setDataType(VehicleStatusDeviceTypeTag dataType)
    {
	this.dataType = dataType;
    }
    
    
    // Methods for field "subType"
    public long getSubType()
    {
	return (this.subType).longValue();
    }
    
    public void setSubType(long subType)
    {
	setSubType(new INTEGER(subType));
    }
    
    public void setSubType(INTEGER subType)
    {
	this.subType = subType;
    }
    
    public boolean hasSubType()
    {
	return (subType != null);
    }
    
    public void deleteSubType()
    {
	subType = null;
    }
    
    
    // Methods for field "sendOnLessThenValue"
    public long getSendOnLessThenValue()
    {
	return (this.sendOnLessThenValue).longValue();
    }
    
    public void setSendOnLessThenValue(long sendOnLessThenValue)
    {
	setSendOnLessThenValue(new INTEGER(sendOnLessThenValue));
    }
    
    public void setSendOnLessThenValue(INTEGER sendOnLessThenValue)
    {
	this.sendOnLessThenValue = sendOnLessThenValue;
    }
    
    public boolean hasSendOnLessThenValue()
    {
	return (sendOnLessThenValue != null);
    }
    
    public void deleteSendOnLessThenValue()
    {
	sendOnLessThenValue = null;
    }
    
    
    // Methods for field "sendOnMoreThenValue"
    public long getSendOnMoreThenValue()
    {
	return (this.sendOnMoreThenValue).longValue();
    }
    
    public void setSendOnMoreThenValue(long sendOnMoreThenValue)
    {
	setSendOnMoreThenValue(new INTEGER(sendOnMoreThenValue));
    }
    
    public void setSendOnMoreThenValue(INTEGER sendOnMoreThenValue)
    {
	this.sendOnMoreThenValue = sendOnMoreThenValue;
    }
    
    public boolean hasSendOnMoreThenValue()
    {
	return (sendOnMoreThenValue != null);
    }
    
    public void deleteSendOnMoreThenValue()
    {
	sendOnMoreThenValue = null;
    }
    
    
    // Methods for field "sendAll"
    public boolean getSendAll()
    {
	return (this.sendAll).booleanValue();
    }
    
    public void setSendAll(boolean sendAll)
    {
	setSendAll(new BOOLEAN(sendAll));
    }
    
    public void setSendAll(BOOLEAN sendAll)
    {
	this.sendAll = sendAll;
    }
    
    public boolean hasSendAll()
    {
	return (sendAll != null);
    }
    
    public void deleteSendAll()
    {
	sendAll = null;
    }
    
    
    /**
     * Implements BER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encodeValue(BerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	int len0 = 0;
	VehicleStatusRequest temp0 = this;

	if (temp0.sendAll != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeBoolean(temp0.sendAll, sink), 0x84);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("sendAll", "BOOLEAN");
		throw ee;
	    }
	}
	if (temp0.sendOnMoreThenValue != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.sendOnMoreThenValue, sink), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("sendOnMoreThenValue", "INTEGER");
		throw ee;
	    }
	}
	if (temp0.sendOnLessThenValue != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.sendOnLessThenValue, sink), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("sendOnLessThenValue", "INTEGER");
		throw ee;
	    }
	}
	if (temp0.subType != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.subType, sink), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("subType", "INTEGER");
		throw ee;
	    }
	}
	try {
	    len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.dataType, sink), 0x80);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("dataType", "VehicleStatusDeviceTypeTag");
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements BER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public VehicleStatusRequest decodeValue(BerCoder coder, DecoderInput source)
	    throws DecoderException
    {
	int total_len0 = source.mLength;
	int end_pos0 = (total_len0 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len0);
	int tag;

	do {
	    tag = source.decodeTagLength();
	    if (tag != 0x80)
		source.raiseTagMismatchException(tag);
	    try {
		int idx1 = VehicleStatusDeviceTypeTag.indexOfValue(source.decodeLong());
		this.dataType = (idx1 < 0) ? VehicleStatusDeviceTypeTag.unknownEnumerator() : VehicleStatusDeviceTypeTag.cNamedNumbers[idx1];
	    } catch (Exception e) {
		DecoderException ee = DecoderException.wrapException(e);
		ee.appendFieldContext("dataType", "VehicleStatusDeviceTypeTag");
		throw ee;
	    }
	    if (source.position() >= end_pos0)
		break;
	    tag = source.decodeTagLength();
	    if (tag == 0)
		break;
	    if (tag == 0x81) {
		try {
		    this.subType = new INTEGER(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("subType", "INTEGER");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x82) {
		try {
		    this.sendOnLessThenValue = new INTEGER(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("sendOnLessThenValue", "INTEGER");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x83) {
		try {
		    this.sendOnMoreThenValue = new INTEGER(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("sendOnMoreThenValue", "INTEGER");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x84) {
		try {
		    this.sendAll = new BOOLEAN(source.decodeBoolean());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("sendAll", "BOOLEAN");
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
		    ee.appendExtensionContext("VehicleStatusRequest", -1);
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
	VehicleStatusRequest temp0 = this;

	if (temp0.sendAll != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeBoolean(temp0.sendAll, sink), 0x84);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("sendAll", "BOOLEAN");
		throw ee;
	    }
	}
	if (temp0.sendOnMoreThenValue != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.sendOnMoreThenValue, sink), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("sendOnMoreThenValue", "INTEGER");
		throw ee;
	    }
	}
	if (temp0.sendOnLessThenValue != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.sendOnLessThenValue, sink), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("sendOnLessThenValue", "INTEGER");
		throw ee;
	    }
	}
	if (temp0.subType != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.subType, sink), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("subType", "INTEGER");
		throw ee;
	    }
	}
	try {
	    len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.dataType, sink), 0x80);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("dataType", "VehicleStatusDeviceTypeTag");
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, VehicleStatusRequest data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.subType != null);
	sink.writeBit(data.sendOnLessThenValue != null);
	sink.writeBit(data.sendOnMoreThenValue != null);
	sink.writeBit(data.sendAll != null);
	nbits += 5;
	// Encode field 'dataType'
	try {
	    VehicleStatusDeviceTypeTag item1 = data.dataType;
	    int idx1;
	    boolean extroot1 = true;

	    if (item1.isUnknownEnumerator()) {
		throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
	    } else {
		idx1 = item1.indexOf();
		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		extroot1 = idx1 < 29;
	    }
	    sink.writeBit(!extroot1); ++nbits;
	    if (extroot1)
		nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 28, sink);
	    else
		nbits += coder.encodeNormallySmallNumber(idx1 - 29, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("dataType", "VehicleStatusDeviceTypeTag");
	    throw ee;
	}
	if (data.subType != null) {
	    // Encode field 'subType'
	    try {
		INTEGER item1 = data.subType;
		long temp1 = item1.longValue();

		if (temp1 < 1 || temp1 > 15)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 1, 15, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("subType", "INTEGER");
		throw ee;
	    }
	}
	if (data.sendOnLessThenValue != null) {
	    // Encode field 'sendOnLessThenValue'
	    try {
		INTEGER item1 = data.sendOnLessThenValue;
		long temp1 = item1.longValue();

		if (temp1 < -32767 || temp1 > 32767)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, -32767, 32767, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("sendOnLessThenValue", "INTEGER");
		throw ee;
	    }
	}
	if (data.sendOnMoreThenValue != null) {
	    // Encode field 'sendOnMoreThenValue'
	    try {
		INTEGER item1 = data.sendOnMoreThenValue;
		long temp1 = item1.longValue();

		if (temp1 < -32767 || temp1 > 32767)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, -32767, 32767, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("sendOnMoreThenValue", "INTEGER");
		throw ee;
	    }
	}
	if (data.sendAll != null) {
	    // Encode field 'sendAll'
	    try {
		BOOLEAN item1 = data.sendAll;

		sink.writeBit(item1.booleanValue());
		nbits += (1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("sendAll", "BOOLEAN");
		throw ee;
	    }
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static VehicleStatusRequest decodeValue(PerCoder coder, InputBitStream source, VehicleStatusRequest data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_subType0 = source.readBit();
	boolean has_sendOnLessThenValue0 = source.readBit();
	boolean has_sendOnMoreThenValue0 = source.readBit();
	boolean has_sendAll0 = source.readBit();
    /** Decode root fields **/
	// Decode field 'dataType'
	try {
	    int idx1;
	    VehicleStatusDeviceTypeTag temp1;
	    boolean extroot1 = !source.readBit();

	    if (extroot1) {
		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 28);
		if (idx1 < 0 || idx1 > 28)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		temp1 = VehicleStatusDeviceTypeTag.valueAt(idx1);
	    } else {
		idx1 = 29 + (int)coder.decodeNormallySmallNumber(source);
		if (idx1 < 0)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		temp1 = VehicleStatusDeviceTypeTag.unknownEnumerator();
	    }
	    data.dataType = temp1;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("dataType", "VehicleStatusDeviceTypeTag");
	    throw de;
	}
	if (has_subType0) {
	    // Decode field 'subType'
	    try {
		long temp1;

		if (data.subType == null)
		    data.subType = new INTEGER();
		temp1 = coder.decodeConstrainedWholeNumber(source, 1, 15);
		if (temp1 > 15)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.subType.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("subType", "INTEGER");
		throw de;
	    }
	} else {
	    data.subType = null;
	}
	if (has_sendOnLessThenValue0) {
	    // Decode field 'sendOnLessThenValue'
	    try {
		long temp1;

		if (data.sendOnLessThenValue == null)
		    data.sendOnLessThenValue = new INTEGER();
		temp1 = coder.decodeConstrainedWholeNumber(source, -32767, 32767);
		if (temp1 > 32767)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.sendOnLessThenValue.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("sendOnLessThenValue", "INTEGER");
		throw de;
	    }
	} else {
	    data.sendOnLessThenValue = null;
	}
	if (has_sendOnMoreThenValue0) {
	    // Decode field 'sendOnMoreThenValue'
	    try {
		long temp1;

		if (data.sendOnMoreThenValue == null)
		    data.sendOnMoreThenValue = new INTEGER();
		temp1 = coder.decodeConstrainedWholeNumber(source, -32767, 32767);
		if (temp1 > 32767)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.sendOnMoreThenValue.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("sendOnMoreThenValue", "INTEGER");
		throw de;
	    }
	} else {
	    data.sendOnMoreThenValue = null;
	}
	if (has_sendAll0) {
	    // Decode field 'sendAll'
	    try {
		if (data.sendAll == null)
		    data.sendAll = new BOOLEAN();
		data.sendAll.setValue(source.readBit());
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("sendAll", "BOOLEAN");
		throw de;
	    }
	} else {
	    data.sendAll = null;
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
	    writer.print("dataType ");
	    printer.print(this.dataType, writer, this.dataType.cConstantNameList);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.subType != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("subType ");
		writer.print(this.subType.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.sendOnLessThenValue != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("sendOnLessThenValue ");
		writer.print(this.sendOnLessThenValue.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.sendOnMoreThenValue != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("sendOnMoreThenValue ");
		writer.print(this.sendOnMoreThenValue.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.sendAll != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("sendAll ");
		printer.print(this.sendAll, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	printer.undent();
	printer.newLine(writer);
	writer.print('}');
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((VehicleStatusRequest)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((VehicleStatusRequest)that);
    }
    
    public boolean equalTo(VehicleStatusRequest that) {
	if (!this.dataType.equalTo(that.dataType))
	    return false;
	if (this.subType != null && that.subType != null) {
	    if (!this.subType.equalTo(that.subType))
		return false;
	}
	if (this.sendOnLessThenValue != null && that.sendOnLessThenValue != null) {
	    if (!this.sendOnLessThenValue.equalTo(that.sendOnLessThenValue))
		return false;
	}
	if (this.sendOnMoreThenValue != null && that.sendOnMoreThenValue != null) {
	    if (!this.sendOnMoreThenValue.equalTo(that.sendOnMoreThenValue))
		return false;
	}
	if (this.sendAll != null && that.sendAll != null) {
	    if (!this.sendAll.equalTo(that.sendAll))
		return false;
	}
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public VehicleStatusRequest clone() {
	VehicleStatusRequest copy = (VehicleStatusRequest)super.clone();
	copy.dataType = dataType.clone();
	if (subType != null) {
	    copy.subType = subType.clone();
	}
	if (sendOnLessThenValue != null) {
	    copy.sendOnLessThenValue = sendOnLessThenValue.clone();
	}
	if (sendOnMoreThenValue != null) {
	    copy.sendOnMoreThenValue = sendOnMoreThenValue.clone();
	}
	if (sendAll != null) {
	    copy.sendAll = sendAll.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.dataType != null ? this.dataType.hashCode() : 0);
	hash = 41 * hash + (this.subType != null ? this.subType.hashCode() : 0);
	hash = 41 * hash + (this.sendOnLessThenValue != null ? this.sendOnLessThenValue.hashCode() : 0);
	hash = 41 * hash + (this.sendOnMoreThenValue != null ? this.sendOnMoreThenValue.hashCode() : 0);
	hash = 41 * hash + (this.sendAll != null ? this.sendAll.hashCode() : 0);
	return hash;
    }
} // End class definition for VehicleStatusRequest
