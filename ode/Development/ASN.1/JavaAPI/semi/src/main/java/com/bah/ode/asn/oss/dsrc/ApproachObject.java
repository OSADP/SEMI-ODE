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
 * Define the ASN1 Type ApproachObject from ASN1 Module DSRC.
 * @see Sequence
 */

public class ApproachObject extends Sequence {
    public Position3D refPoint;
    public LaneWidth laneWidth;
    public Approach approach;
    public Approach egress;
    
    /**
     * The default constructor.
     */
    public ApproachObject()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ApproachObject(Position3D refPoint, LaneWidth laneWidth, 
		    Approach approach, Approach egress)
    {
	setRefPoint(refPoint);
	setLaneWidth(laneWidth);
	setApproach(approach);
	setEgress(egress);
    }
    
    
    // Methods for field "refPoint"
    public Position3D getRefPoint()
    {
	return this.refPoint;
    }
    
    public void setRefPoint(Position3D refPoint)
    {
	this.refPoint = refPoint;
    }
    
    public boolean hasRefPoint()
    {
	return (refPoint != null);
    }
    
    public void deleteRefPoint()
    {
	refPoint = null;
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
    
    
    // Methods for field "approach"
    public Approach getApproach()
    {
	return this.approach;
    }
    
    public void setApproach(Approach approach)
    {
	this.approach = approach;
    }
    
    public boolean hasApproach()
    {
	return (approach != null);
    }
    
    public void deleteApproach()
    {
	approach = null;
    }
    
    
    // Methods for field "egress"
    public Approach getEgress()
    {
	return this.egress;
    }
    
    public void setEgress(Approach egress)
    {
	this.egress = egress;
    }
    
    public boolean hasEgress()
    {
	return (egress != null);
    }
    
    public void deleteEgress()
    {
	egress = null;
    }
    
    
    /**
     * Implements BER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encodeValue(BerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	int len0 = 0;
	ApproachObject temp0 = this;

	if (temp0.egress != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.egress.encodeValue(coder, sink), 0xA3);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("egress", "Approach");
		throw ee;
	    }
	}
	if (temp0.approach != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.approach.encodeValue(coder, sink), 0xA2);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("approach", "Approach");
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
	if (temp0.refPoint != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.refPoint.encodeValue(coder, sink), 0xA0);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("refPoint", "Position3D");
		throw ee;
	    }
	}

	return len0;
    }

    /**
     * Implements BER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public ApproachObject decodeValue(BerCoder coder, DecoderInput source)
	    throws DecoderException
    {
	int total_len0 = source.mLength;
	int end_pos0 = (total_len0 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len0);
	int tag;

	do {
	    if (source.position() >= end_pos0)
		break;
	    tag = source.decodeTagLength();
	    if (tag == 0)
		break;
	    if (tag == 0xA0) {
		try {
		    this.refPoint = new Position3D();
		    this.refPoint.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("refPoint", "Position3D");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x81) {
		try {
		    this.laneWidth = new LaneWidth(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("laneWidth", "LaneWidth");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xA2) {
		try {
		    this.approach = new Approach();
		    this.approach.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("approach", "Approach");
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
		    this.egress = new Approach();
		    this.egress.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("egress", "Approach");
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
		    ee.appendExtensionContext("ApproachObject", -1);
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
	ApproachObject temp0 = this;

	if (temp0.egress != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.egress.encodeValue(coder, sink), 0xA3);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("egress", "Approach");
		throw ee;
	    }
	}
	if (temp0.approach != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.approach.encodeValue(coder, sink), 0xA2);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("approach", "Approach");
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
	if (temp0.refPoint != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.refPoint.encodeValue(coder, sink), 0xA0);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("refPoint", "Position3D");
		throw ee;
	    }
	}

	return len0;
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, ApproachObject data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.refPoint != null);
	sink.writeBit(data.laneWidth != null);
	sink.writeBit(data.approach != null);
	sink.writeBit(data.egress != null);
	nbits += 5;
	if (data.refPoint != null) {
	    // Encode field 'refPoint'
	    try {
		Position3D item1 = data.refPoint;

		nbits += Position3D.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("refPoint", "Position3D");
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
	if (data.approach != null) {
	    // Encode field 'approach'
	    try {
		Approach item1 = data.approach;

		nbits += Approach.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("approach", "Approach");
		throw ee;
	    }
	}
	if (data.egress != null) {
	    // Encode field 'egress'
	    try {
		Approach item1 = data.egress;

		nbits += Approach.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("egress", "Approach");
		throw ee;
	    }
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static ApproachObject decodeValue(PerCoder coder, InputBitStream source, ApproachObject data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_refPoint0 = source.readBit();
	boolean has_laneWidth0 = source.readBit();
	boolean has_approach0 = source.readBit();
	boolean has_egress0 = source.readBit();
    /** Decode root fields **/
	if (has_refPoint0) {
	    // Decode field 'refPoint'
	    try {
		if (data.refPoint == null)
		    data.refPoint = new Position3D();
		data.refPoint.decodeValue(coder, source, data.refPoint);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("refPoint", "Position3D");
		throw de;
	    }
	} else {
	    data.refPoint = null;
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
	if (has_approach0) {
	    // Decode field 'approach'
	    try {
		if (data.approach == null)
		    data.approach = new Approach();
		data.approach.decodeValue(coder, source, data.approach);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("approach", "Approach");
		throw de;
	    }
	} else {
	    data.approach = null;
	}
	if (has_egress0) {
	    // Decode field 'egress'
	    try {
		if (data.egress == null)
		    data.egress = new Approach();
		data.egress.decodeValue(coder, source, data.egress);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("egress", "Approach");
		throw de;
	    }
	} else {
	    data.egress = null;
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
	if (this.refPoint != null) {
	    try {
		comma0 = true;
		printer.newLine(writer);
		writer.print("refPoint ");
		this.refPoint.printValue(printer, writer);
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
	if (this.approach != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("approach ");
		this.approach.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.egress != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("egress ");
		this.egress.printValue(printer, writer);
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
	return equalTo((ApproachObject)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((ApproachObject)that);
    }
    
    public boolean equalTo(ApproachObject that) {
	if (this.refPoint != null && that.refPoint != null) {
	    if (!this.refPoint.equalTo(that.refPoint))
		return false;
	}
	if (this.laneWidth != null && that.laneWidth != null) {
	    if (!this.laneWidth.equalTo(that.laneWidth))
		return false;
	}
	if (this.approach != null && that.approach != null) {
	    if (!this.approach.equalTo(that.approach))
		return false;
	}
	if (this.egress != null && that.egress != null) {
	    if (!this.egress.equalTo(that.egress))
		return false;
	}
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public ApproachObject clone() {
	ApproachObject copy = (ApproachObject)super.clone();
	if (refPoint != null) {
	    copy.refPoint = refPoint.clone();
	}
	if (laneWidth != null) {
	    copy.laneWidth = laneWidth.clone();
	}
	if (approach != null) {
	    copy.approach = approach.clone();
	}
	if (egress != null) {
	    copy.egress = egress.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.refPoint != null ? this.refPoint.hashCode() : 0);
	hash = 41 * hash + (this.laneWidth != null ? this.laneWidth.hashCode() : 0);
	hash = 41 * hash + (this.approach != null ? this.approach.hashCode() : 0);
	hash = 41 * hash + (this.egress != null ? this.egress.hashCode() : 0);
	return hash;
    }
} // End class definition for ApproachObject
