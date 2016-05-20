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
 * Define the ASN1 Type ShapePointSet from ASN1 Module DSRC.
 * @see Sequence
 */

public class ShapePointSet extends Sequence {
    public Position3D anchor;
    public LaneWidth laneWidth;
    public DirectionOfUse directionality;
    public NodeList nodeList;
    
    /**
     * The default constructor.
     */
    public ShapePointSet()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ShapePointSet(Position3D anchor, LaneWidth laneWidth, 
		    DirectionOfUse directionality, NodeList nodeList)
    {
	setAnchor(anchor);
	setLaneWidth(laneWidth);
	setDirectionality(directionality);
	setNodeList(nodeList);
    }
    
    /**
     * Construct with required components.
     */
    public ShapePointSet(NodeList nodeList)
    {
	setNodeList(nodeList);
    }
    
    
    // Methods for field "anchor"
    public Position3D getAnchor()
    {
	return this.anchor;
    }
    
    public void setAnchor(Position3D anchor)
    {
	this.anchor = anchor;
    }
    
    public boolean hasAnchor()
    {
	return (anchor != null);
    }
    
    public void deleteAnchor()
    {
	anchor = null;
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
    
    
    // Methods for field "directionality"
    public DirectionOfUse getDirectionality()
    {
	return this.directionality;
    }
    
    public void setDirectionality(DirectionOfUse directionality)
    {
	this.directionality = directionality;
    }
    
    public boolean hasDirectionality()
    {
	return (directionality != null);
    }
    
    public void deleteDirectionality()
    {
	directionality = null;
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
    
    
    /**
     * Implements BER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encodeValue(BerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	int len0 = 0;
	ShapePointSet temp0 = this;

	try {
	    len0 += sink.encodeLengthTag(temp0.nodeList.encodeValue(coder, sink), 0xA3);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("nodeList", "NodeList");
	    throw ee;
	}
	if (temp0.directionality != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.directionality, sink), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("directionality", "DirectionOfUse");
		throw ee;
	    }
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
	if (temp0.anchor != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.anchor.encodeValue(coder, sink), 0xA0);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("anchor", "Position3D");
		throw ee;
	    }
	}

	return len0;
    }

    /**
     * Implements BER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public ShapePointSet decodeValue(BerCoder coder, DecoderInput source)
	    throws DecoderException
    {
	int total_len0 = source.mLength;
	int end_pos0 = (total_len0 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len0);
	int tag;

	do {
	    tag = source.decodeTagLength();
	    if (tag == 0xA0) {
		try {
		    this.anchor = new Position3D();
		    this.anchor.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("anchor", "Position3D");
		    throw ee;
		}
		tag = source.decodeTagLength();
	    }
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
	    if (tag == 0x82) {
		try {
		    int idx1 = DirectionOfUse.indexOfValue(source.decodeLong());
		    this.directionality = (idx1 < 0) ? DirectionOfUse.unknownEnumerator() : DirectionOfUse.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("directionality", "DirectionOfUse");
		    throw ee;
		}
		tag = source.decodeTagLength();
	    }
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
	    for (;;) {
		try {
		    coder.skipContents(source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendExtensionContext("ShapePointSet", -1);
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
	ShapePointSet temp0 = this;

	try {
	    len0 += sink.encodeLengthTag(temp0.nodeList.encodeValue(coder, sink), 0xA3);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("nodeList", "NodeList");
	    throw ee;
	}
	if (temp0.directionality != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.directionality, sink), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("directionality", "DirectionOfUse");
		throw ee;
	    }
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
	if (temp0.anchor != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.anchor.encodeValue(coder, sink), 0xA0);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("anchor", "Position3D");
		throw ee;
	    }
	}

	return len0;
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, ShapePointSet data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.anchor != null);
	sink.writeBit(data.laneWidth != null);
	sink.writeBit(data.directionality != null);
	nbits += 4;
	if (data.anchor != null) {
	    // Encode field 'anchor'
	    try {
		Position3D item1 = data.anchor;

		nbits += Position3D.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("anchor", "Position3D");
		throw ee;
	    }
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
	if (data.directionality != null) {
	    // Encode field 'directionality'
	    try {
		DirectionOfUse item1 = data.directionality;
		int idx1;
		boolean extroot1 = true;

		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else {
		    idx1 = item1.indexOf();
		    if (idx1 < 0)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    extroot1 = idx1 < 3;
		}
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 2, sink);
		else
		    nbits += coder.encodeNormallySmallNumber(idx1 - 3, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("directionality", "DirectionOfUse");
		throw ee;
	    }
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

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static ShapePointSet decodeValue(PerCoder coder, InputBitStream source, ShapePointSet data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_anchor0 = source.readBit();
	boolean has_laneWidth0 = source.readBit();
	boolean has_directionality0 = source.readBit();
    /** Decode root fields **/
	if (has_anchor0) {
	    // Decode field 'anchor'
	    try {
		if (data.anchor == null)
		    data.anchor = new Position3D();
		data.anchor.decodeValue(coder, source, data.anchor);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("anchor", "Position3D");
		throw de;
	    }
	} else {
	    data.anchor = null;
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
	if (has_directionality0) {
	    // Decode field 'directionality'
	    try {
		int idx1;
		DirectionOfUse temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 2);
		    if (idx1 < 0 || idx1 > 2)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = DirectionOfUse.valueAt(idx1);
		} else {
		    idx1 = 3 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = DirectionOfUse.unknownEnumerator();
		}
		data.directionality = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("directionality", "DirectionOfUse");
		throw de;
	    }
	} else {
	    data.directionality = null;
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
	if (this.anchor != null) {
	    try {
		comma0 = true;
		printer.newLine(writer);
		writer.print("anchor ");
		this.anchor.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
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
	if (this.directionality != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("directionality ");
		printer.print(this.directionality, writer, this.directionality.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
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
	printer.undent();
	printer.newLine(writer);
	writer.print('}');
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((ShapePointSet)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((ShapePointSet)that);
    }
    
    public boolean equalTo(ShapePointSet that) {
	if (this.anchor != null && that.anchor != null) {
	    if (!this.anchor.equalTo(that.anchor))
		return false;
	}
	if (this.laneWidth != null && that.laneWidth != null) {
	    if (!this.laneWidth.equalTo(that.laneWidth))
		return false;
	}
	if (this.directionality != null && that.directionality != null) {
	    if (!this.directionality.equalTo(that.directionality))
		return false;
	}
	if (!this.nodeList.equalTo(that.nodeList))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public ShapePointSet clone() {
	ShapePointSet copy = (ShapePointSet)super.clone();
	if (anchor != null) {
	    copy.anchor = anchor.clone();
	}
	if (laneWidth != null) {
	    copy.laneWidth = laneWidth.clone();
	}
	if (directionality != null) {
	    copy.directionality = directionality.clone();
	}
	copy.nodeList = nodeList.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.anchor != null ? this.anchor.hashCode() : 0);
	hash = 41 * hash + (this.laneWidth != null ? this.laneWidth.hashCode() : 0);
	hash = 41 * hash + (this.directionality != null ? this.directionality.hashCode() : 0);
	hash = 41 * hash + (this.nodeList != null ? this.nodeList.hashCode() : 0);
	return hash;
    }
} // End class definition for ShapePointSet
