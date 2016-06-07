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
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     */
    public static enum __Tag
    {
	__laneNumber("laneNumber"),
	__laneWidth("laneWidth"),
	__laneAttributes("laneAttributes"),
	__nodeList("nodeList"),
	__keepOutList("keepOutList"),
	__connectsTo("connectsTo"),
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

	sink.writeBit(false);
	sink.writeBit(data.laneWidth != null);
	sink.writeBit(data.keepOutList != null);
	sink.writeBit(data.connectsTo != null);
	nbits += 4;
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
	if (data.laneWidth != null) {
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
	if (data.keepOutList != null) {
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
	if (data.connectsTo != null) {
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
	InputBitStream bitstream0 = null;

	boolean has_laneWidth0 = source.readBit();
	boolean has_keepOutList0 = source.readBit();
	boolean has_connectsTo0 = source.readBit();
    /** Decode root fields **/
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
	    data.nodeList.decodeValue(coder, source, data.nodeList);
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
		data.keepOutList.decodeValue(coder, source, data.keepOutList);
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
     * Implements JSON value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public void encodeValue(JsonCoder coder, JsonWriter sink)
	    throws IOException, EncoderException
    {
	sink.beginObject();
	// Encode field 'laneNumber'
	try {
	    LaneNumber item1 = this.laneNumber;

	    {
		sink.encodeKey("laneNumber");
		sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("laneNumber", "LaneNumber");
	    throw ee;
	}
	// Encode field 'laneWidth'
	try {
	    LaneWidth item1 = this.laneWidth;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("laneWidth");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "laneWidth");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("laneWidth", "LaneWidth");
	    throw ee;
	}
	// Encode field 'laneAttributes'
	try {
	    CrosswalkLaneAttributes item1 = this.laneAttributes;

	    {
		sink.writeSeparator();
		sink.encodeKey("laneAttributes");
		sink.writeString(item1.name());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("laneAttributes", "CrosswalkLaneAttributes");
	    throw ee;
	}
	// Encode field 'nodeList'
	try {
	    NodeList item1 = this.nodeList;

	    {
		sink.writeSeparator();
		sink.encodeKey("nodeList");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("nodeList", "NodeList");
	    throw ee;
	}
	// Encode field 'keepOutList'
	try {
	    NodeList item1 = this.keepOutList;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("keepOutList");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "keepOutList");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("keepOutList", "NodeList");
	    throw ee;
	}
	// Encode field 'connectsTo'
	try {
	    ConnectsTo item1 = this.connectsTo;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("connectsTo");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "connectsTo");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("connectsTo", "ConnectsTo");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public CrosswalkLane decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[7];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		CrosswalkLane.__Tag t_tag0 = CrosswalkLane.__Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = CrosswalkLane.__Tag._null_;
		switch (t_tag0) {
		    case __laneNumber:
		    // Decode field 'laneNumber'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			this.laneNumber = new LaneNumber(coder.decodeOctetString(source));
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("laneNumber", "LaneNumber");
			throw de;
		    }
		    break;
		    case __laneWidth:
		    // Decode field 'laneWidth'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.laneWidth == null)
				this.laneWidth = new LaneWidth();
			    this.laneWidth.setValue(coder.decodeInteger(source));
			    present0[1] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("laneWidth", "LaneWidth");
			throw de;
		    }
		    break;
		    case __laneAttributes:
		    // Decode field 'laneAttributes'
		    try {
			String content1 = coder.decodeString(source);
			int idx1;
			CrosswalkLaneAttributes temp1;

			if (present0[2])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			idx1 = coder.resolveName(CrosswalkLaneAttributes.cConstantNameList, content1);
			if (idx1 < 0 )
			    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			else
			    temp1 = CrosswalkLaneAttributes.cNamedNumbers[idx1];
			this.laneAttributes = temp1;
			present0[2] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("laneAttributes", "CrosswalkLaneAttributes");
			throw de;
		    }
		    break;
		    case __nodeList:
		    // Decode field 'nodeList'
		    try {
			if (present0[3])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.nodeList == null)
			    this.nodeList = new NodeList();
			this.nodeList.decodeValue(coder, source);
			present0[3] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("nodeList", "NodeList");
			throw de;
		    }
		    break;
		    case __keepOutList:
		    // Decode field 'keepOutList'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[4])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.keepOutList == null)
				this.keepOutList = new NodeList();
			    this.keepOutList.decodeValue(coder, source);
			    present0[4] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("keepOutList", "NodeList");
			throw de;
		    }
		    break;
		    case __connectsTo:
		    // Decode field 'connectsTo'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[5])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.connectsTo = new ConnectsTo(coder.decodeOctetString(source));
			    present0[5] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("connectsTo", "ConnectsTo");
			throw de;
		    }
		    break;
		    default:
			coder.skipValue(source);
			break;
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'laneNumber'");
	if (!present0[1])
	    this.laneWidth = null;
	if (!present0[2])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'laneAttributes'");
	if (!present0[3])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'nodeList'");
	if (!present0[4])
	    this.keepOutList = null;
	if (!present0[5])
	    this.connectsTo = null;
	return this;
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
	    writer.print("laneNumber ");
	    printer.print(this.laneNumber, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.laneWidth != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("laneWidth ");
		writer.print(this.laneWidth.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("laneAttributes ");
	    printer.print(this.laneAttributes, writer, this.laneAttributes.cConstantNameList);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("nodeList ");
	    this.nodeList.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.keepOutList != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("keepOutList ");
		this.keepOutList.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.connectsTo != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("connectsTo ");
		printer.print(this.connectsTo, writer);
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

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.laneNumber != null ? this.laneNumber.hashCode() : 0);
	hash = 41 * hash + (this.laneWidth != null ? this.laneWidth.hashCode() : 0);
	hash = 41 * hash + (this.laneAttributes != null ? this.laneAttributes.hashCode() : 0);
	hash = 41 * hash + (this.nodeList != null ? this.nodeList.hashCode() : 0);
	hash = 41 * hash + (this.keepOutList != null ? this.keepOutList.hashCode() : 0);
	hash = 41 * hash + (this.connectsTo != null ? this.connectsTo.hashCode() : 0);
	return hash;
    }
} // End class definition for CrosswalkLane
