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
 * Define the ASN1 Type CrosswalkLane from ASN1 Module DSRC.
 * @see Sequence
 */

public class CrosswalkLane extends Sequence {
    public LaneNumber laneNumber;
    public LaneWidth laneWidth;
    public CrosswalkLaneAttributes laneAttributes;
    public NodeList nodeList;
    public NodeList keepOutList;
    public ConnectsTo connectsTo;
    
    /**
     * The default constructor.
     */
    public CrosswalkLane()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CrosswalkLane(LaneNumber laneNumber, LaneWidth laneWidth, 
		    CrosswalkLaneAttributes laneAttributes, NodeList nodeList, 
		    NodeList keepOutList, ConnectsTo connectsTo)
    {
	setLaneNumber(laneNumber);
	setLaneWidth(laneWidth);
	setLaneAttributes(laneAttributes);
	setNodeList(nodeList);
	setKeepOutList(keepOutList);
	setConnectsTo(connectsTo);
    }
    
    /**
     * Construct with required components.
     */
    public CrosswalkLane(LaneNumber laneNumber, 
		    CrosswalkLaneAttributes laneAttributes, NodeList nodeList)
    {
	setLaneNumber(laneNumber);
	setLaneAttributes(laneAttributes);
	setNodeList(nodeList);
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
    
    
    // Methods for field "laneWidth"
    public LaneWidth getLaneWidth()
    {
	return this.laneWidth;
    }
    
    public void setLaneWidth(LaneWidth laneWidth)
    {
	this.laneWidth = laneWidth;
    }
    
    public boolean hasLaneWidth()
    {
	return (laneWidth != null);
    }
    
    public void deleteLaneWidth()
    {
	laneWidth = null;
    }
    
    
    // Methods for field "laneAttributes"
    public CrosswalkLaneAttributes getLaneAttributes()
    {
	return this.laneAttributes;
    }
    
    public void setLaneAttributes(CrosswalkLaneAttributes laneAttributes)
    {
	this.laneAttributes = laneAttributes;
    }
    
    
    // Methods for field "nodeList"
    public NodeList getNodeList()
    {
	return this.nodeList;
    }
    
    public void setNodeList(NodeList nodeList)
    {
	this.nodeList = nodeList;
    }
    
    
    // Methods for field "keepOutList"
    public NodeList getKeepOutList()
    {
	return this.keepOutList;
    }
    
    public void setKeepOutList(NodeList keepOutList)
    {
	this.keepOutList = keepOutList;
    }
    
    public boolean hasKeepOutList()
    {
	return (keepOutList != null);
    }
    
    public void deleteKeepOutList()
    {
	keepOutList = null;
    }
    
    
    // Methods for field "connectsTo"
    public ConnectsTo getConnectsTo()
    {
	return this.connectsTo;
    }
    
    public void setConnectsTo(ConnectsTo connectsTo)
    {
	this.connectsTo = connectsTo;
    }
    
    public boolean hasConnectsTo()
    {
	return (connectsTo != null);
    }
    
    public void deleteConnectsTo()
    {
	connectsTo = null;
    }
    
    
    /**
     * Implements BER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encodeValue(BerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	int len0 = 0;
	CrosswalkLane temp0 = this;

	if (temp0.connectsTo != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.connectsTo.byteArrayValue()), 0x85);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("connectsTo", "ConnectsTo");
		throw ee;
	    }
	}
	if (temp0.keepOutList != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.keepOutList.encodeValue(coder, sink), 0xA4);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("keepOutList", "NodeList");
		throw ee;
	    }
	}
	try {
	    len0 += sink.encodeLengthTag(temp0.nodeList.encodeValue(coder, sink), 0xA3);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("nodeList", "NodeList");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.laneAttributes, sink), 0x82);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("laneAttributes", "CrosswalkLaneAttributes");
	    throw ee;
	}
	if (temp0.laneWidth != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.laneWidth, sink), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("laneWidth", "LaneWidth");
		throw ee;
	    }
	}
	try {
	    len0 += sink.encodeLengthTag(sink.write(temp0.laneNumber.byteArrayValue()), 0x80);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("laneNumber", "LaneNumber");
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements BER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public CrosswalkLane decodeValue(BerCoder coder, DecoderInput source)
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
		this.laneNumber = new LaneNumber(coder.decodeOctetString(source));
	    } catch (Exception e) {
		DecoderException ee = DecoderException.wrapException(e);
		ee.appendFieldContext("laneNumber", "LaneNumber");
		throw ee;
	    }
	    tag = source.decodeTagLength();
	    if (tag == 0x81) {
		try {
		    this.laneWidth = new LaneWidth(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("laneWidth", "LaneWidth");
		    throw ee;
		}
		tag = source.decodeTagLength();
	    }
	    if (tag != 0x82)
		source.raiseTagMismatchException(tag);
	    try {
		int idx1 = CrosswalkLaneAttributes.indexOfValue(source.decodeInt());
		if (idx1 < 0)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
		this.laneAttributes = CrosswalkLaneAttributes.cNamedNumbers[idx1];
	    } catch (Exception e) {
		DecoderException ee = DecoderException.wrapException(e);
		ee.appendFieldContext("laneAttributes", "CrosswalkLaneAttributes");
		throw ee;
	    }
	    tag = source.decodeTagLength();
	    if (tag != 0xA3)
		source.raiseTagMismatchException(tag);
	    try {
		this.nodeList = new NodeList();
		this.nodeList.decodeValue(coder, source);
	    } catch (Exception e) {
		DecoderException ee = DecoderException.wrapException(e);
		ee.appendFieldContext("nodeList", "NodeList");
		throw ee;
	    }
	    if (source.position() >= end_pos0)
		break;
	    tag = source.decodeTagLength();
	    if (tag == 0)
		break;
	    if (tag == 0xA4) {
		try {
		    this.keepOutList = new NodeList();
		    this.keepOutList.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("keepOutList", "NodeList");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x85 || tag == 0xA5) {
		try {
		    this.connectsTo = new ConnectsTo(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("connectsTo", "ConnectsTo");
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
		    ee.appendExtensionContext("CrosswalkLane", -1);
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
	CrosswalkLane temp0 = this;

	if (temp0.connectsTo != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.connectsTo.byteArrayValue()), 0x85);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("connectsTo", "ConnectsTo");
		throw ee;
	    }
	}
	if (temp0.keepOutList != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.keepOutList.encodeValue(coder, sink), 0xA4);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("keepOutList", "NodeList");
		throw ee;
	    }
	}
	try {
	    len0 += sink.encodeLengthTag(temp0.nodeList.encodeValue(coder, sink), 0xA3);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("nodeList", "NodeList");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.laneAttributes, sink), 0x82);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("laneAttributes", "CrosswalkLaneAttributes");
	    throw ee;
	}
	if (temp0.laneWidth != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.laneWidth, sink), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("laneWidth", "LaneWidth");
		throw ee;
	    }
	}
	try {
	    len0 += sink.encodeLengthTag(sink.write(temp0.laneNumber.byteArrayValue()), 0x80);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("laneNumber", "LaneNumber");
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, CrosswalkLane data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	boolean has_laneWidth0 = data.laneWidth != null;
	boolean has_keepOutList0 = data.keepOutList != null;
	boolean has_connectsTo0 = data.connectsTo != null;
	sink.writeBit(false); ++nbits;
	sink.writeBit(has_laneWidth0); ++nbits;
	sink.writeBit(has_keepOutList0); ++nbits;
	sink.writeBit(has_connectsTo0); ++nbits;
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
	if (has_laneWidth0) {
	    // Encode field 'laneWidth'
	    try {
		LaneWidth item1 = data.laneWidth;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 32767)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 32767, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("laneWidth", "LaneWidth");
		throw ee;
	    }
	}
	// Encode field 'laneAttributes'
	try {
	    CrosswalkLaneAttributes item1 = data.laneAttributes;
	    int idx1 = item1.indexOf();

	    if (idx1 < 0)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
	    nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 8, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("laneAttributes", "CrosswalkLaneAttributes");
	    throw ee;
	}
	// Encode field 'nodeList'
	try {
	    NodeList item1 = data.nodeList;

	    nbits += NodeList.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("nodeList", "NodeList");
	    throw ee;
	}
	if (has_keepOutList0) {
	    // Encode field 'keepOutList'
	    try {
		NodeList item1 = data.keepOutList;

		nbits += NodeList.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("keepOutList", "NodeList");
		throw ee;
	    }
	}
	if (has_connectsTo0) {
	    // Encode field 'connectsTo'
	    try {
		ConnectsTo item1 = data.connectsTo;
		int len1 = item1.getSize();

		if (len1 < 2 || len1 > 32)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 2, 32, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("connectsTo", "ConnectsTo");
		throw ee;
	    }
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static CrosswalkLane decodeValue(PerCoder coder, InputBitStream source, CrosswalkLane data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	int idx0;
	InputBitStream bitstream0 = null;

	boolean has_laneWidth0 = source.readBit();
	boolean has_keepOutList0 = source.readBit();
	boolean has_connectsTo0 = source.readBit();
	// Decode field 'laneNumber'
	try {
	    data.laneNumber = new LaneNumber(com.oss.coders.per.PerOctets.decode(coder, source, 1, 1));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("laneNumber", "LaneNumber");
	    throw de;
	}
	if (has_laneWidth0) {
	    // Decode field 'laneWidth'
	    try {
		long temp1;

		if (data.laneWidth == null)
		    data.laneWidth = new LaneWidth();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 32767);
		if (temp1 > 32767)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.laneWidth.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("laneWidth", "LaneWidth");
		throw de;
	    }
	} else {
	    data.laneWidth = null;
	}
	// Decode field 'laneAttributes'
	try {
	    int idx1;

	    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 8);
	    if (idx1 < 0 || idx1 > 8)
		throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
	    data.laneAttributes = CrosswalkLaneAttributes.valueAt(idx1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("laneAttributes", "CrosswalkLaneAttributes");
	    throw de;
	}
	// Decode field 'nodeList'
	try {
	    if (data.nodeList == null)
		data.nodeList = new NodeList();
	    NodeList.decodeValue(coder, source, data.nodeList);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("nodeList", "NodeList");
	    throw de;
	}
	if (has_keepOutList0) {
	    // Decode field 'keepOutList'
	    try {
		if (data.keepOutList == null)
		    data.keepOutList = new NodeList();
		NodeList.decodeValue(coder, source, data.keepOutList);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("keepOutList", "NodeList");
		throw de;
	    }
	} else {
	    data.keepOutList = null;
	}
	if (has_connectsTo0) {
	    // Decode field 'connectsTo'
	    try {
		data.connectsTo = new ConnectsTo(com.oss.coders.per.PerOctets.decode(coder, source, 2, 32));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("connectsTo", "ConnectsTo");
		throw de;
	    }
	} else {
	    data.connectsTo = null;
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
	    writer.print("laneNumber ");
	    printer.print(this.laneNumber, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.laneWidth != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("laneWidth ");
		writer.print(this.laneWidth.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("laneAttributes ");
	    printer.print(this.laneAttributes, writer, this.laneAttributes.cConstantNameList);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("nodeList ");
	    this.nodeList.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.keepOutList != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("keepOutList ");
		this.keepOutList.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.connectsTo != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("connectsTo ");
		printer.print(this.connectsTo, writer);
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
	return equalTo((CrosswalkLane)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((CrosswalkLane)that);
    }
    
    public boolean equalTo(CrosswalkLane that) {
	if (!this.laneNumber.equalTo(that.laneNumber))
	    return false;
	if (this.laneWidth != null && that.laneWidth != null) {
	    if (!this.laneWidth.equalTo(that.laneWidth))
		return false;
	}
	if (!this.laneAttributes.equalTo(that.laneAttributes))
	    return false;
	if (!this.nodeList.equalTo(that.nodeList))
	    return false;
	if (this.keepOutList != null && that.keepOutList != null) {
	    if (!this.keepOutList.equalTo(that.keepOutList))
		return false;
	}
	if (this.connectsTo != null && that.connectsTo != null) {
	    if (!this.connectsTo.equalTo(that.connectsTo))
		return false;
	}
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public CrosswalkLane clone() {
	CrosswalkLane copy = (CrosswalkLane)super.clone();
	copy.laneNumber = laneNumber.clone();
	if (laneWidth != null) {
	    copy.laneWidth = laneWidth.clone();
	}
	copy.laneAttributes = laneAttributes.clone();
	copy.nodeList = nodeList.clone();
	if (keepOutList != null) {
	    copy.keepOutList = keepOutList.clone();
	}
	if (connectsTo != null) {
	    copy.connectsTo = connectsTo.clone();
	}
	return copy;
    }

} // End class definition for CrosswalkLane
