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
 * Define the ASN1 Type RegionPointSet from ASN1 Module DSRC.
 * @see Sequence
 */

public class RegionPointSet extends Sequence {
    public Position3D anchor;
    public RegionList nodeList;
    
    /**
     * The default constructor.
     */
    public RegionPointSet()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RegionPointSet(Position3D anchor, RegionList nodeList)
    {
	setAnchor(anchor);
	setNodeList(nodeList);
    }
    
    /**
     * Construct with required components.
     */
    public RegionPointSet(RegionList nodeList)
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
    
    
    // Methods for field "nodeList"
    public RegionList getNodeList()
    {
	return this.nodeList;
    }
    
    public void setNodeList(RegionList nodeList)
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
	RegionPointSet temp0 = this;

	try {
	    len0 += sink.encodeLengthTag(temp0.nodeList.encodeValue(coder, sink), 0xA1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("nodeList", "RegionList");
	    throw ee;
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
    public RegionPointSet decodeValue(BerCoder coder, DecoderInput source)
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
	    if (tag != 0xA1)
		source.raiseTagMismatchException(tag);
	    try {
		this.nodeList = new RegionList();
		this.nodeList.decodeValue(coder, source);
	    } catch (Exception e) {
		DecoderException ee = DecoderException.wrapException(e);
		ee.appendFieldContext("nodeList", "RegionList");
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
		    ee.appendExtensionContext("RegionPointSet", -1);
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
	RegionPointSet temp0 = this;

	try {
	    len0 += sink.encodeLengthTag(temp0.nodeList.encodeValue(coder, sink), 0xA1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("nodeList", "RegionList");
	    throw ee;
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, RegionPointSet data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.anchor != null);
	nbits += 2;
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
	// Encode field 'nodeList'
	try {
	    RegionList item1 = data.nodeList;

	    nbits += RegionList.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("nodeList", "RegionList");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static RegionPointSet decodeValue(PerCoder coder, InputBitStream source, RegionPointSet data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_anchor0 = source.readBit();
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
	// Decode field 'nodeList'
	try {
	    if (data.nodeList == null)
		data.nodeList = new RegionList();
	    data.nodeList.decodeValue(coder, source, data.nodeList);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("nodeList", "RegionList");
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
	return equalTo((RegionPointSet)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((RegionPointSet)that);
    }
    
    public boolean equalTo(RegionPointSet that) {
	if (this.anchor != null && that.anchor != null) {
	    if (!this.anchor.equalTo(that.anchor))
		return false;
	}
	if (!this.nodeList.equalTo(that.nodeList))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public RegionPointSet clone() {
	RegionPointSet copy = (RegionPointSet)super.clone();
	if (anchor != null) {
	    copy.anchor = anchor.clone();
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
	hash = 41 * hash + (this.nodeList != null ? this.nodeList.hashCode() : 0);
	return hash;
    }
} // End class definition for RegionPointSet
