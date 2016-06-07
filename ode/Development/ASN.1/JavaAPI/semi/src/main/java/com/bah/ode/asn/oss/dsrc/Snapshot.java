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
 * Define the ASN1 Type Snapshot from ASN1 Module DSRC.
 * @see Sequence
 */

public class Snapshot extends Sequence {
    public FullPositionVector thePosition;
    public VehicleSafetyExtension safetyExt;
    public VehicleStatus datSet;
    
    /**
     * The default constructor.
     */
    public Snapshot()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Snapshot(FullPositionVector thePosition, 
		    VehicleSafetyExtension safetyExt, VehicleStatus datSet)
    {
	setThePosition(thePosition);
	setSafetyExt(safetyExt);
	setDatSet(datSet);
    }
    
    /**
     * Construct with required components.
     */
    public Snapshot(FullPositionVector thePosition)
    {
	setThePosition(thePosition);
    }
    
    
    // Methods for field "thePosition"
    public FullPositionVector getThePosition()
    {
	return this.thePosition;
    }
    
    public void setThePosition(FullPositionVector thePosition)
    {
	this.thePosition = thePosition;
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
    
    
    // Methods for field "datSet"
    public VehicleStatus getDatSet()
    {
	return this.datSet;
    }
    
    public void setDatSet(VehicleStatus datSet)
    {
	this.datSet = datSet;
    }
    
    public boolean hasDatSet()
    {
	return (datSet != null);
    }
    
    public void deleteDatSet()
    {
	datSet = null;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     */
    public static enum __Tag
    {
	__thePosition("thePosition"),
	__safetyExt("safetyExt"),
	__datSet("datSet"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(4);
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
	Snapshot temp0 = this;

	if (temp0.datSet != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.datSet.encodeValue(coder, sink), 0xA2);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("datSet", "VehicleStatus");
		throw ee;
	    }
	}
	if (temp0.safetyExt != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.safetyExt.encodeValue(coder, sink), 0xA1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("safetyExt", "VehicleSafetyExtension");
		throw ee;
	    }
	}
	try {
	    len0 += sink.encodeLengthTag(temp0.thePosition.encodeValue(coder, sink), 0xA0);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("thePosition", "FullPositionVector");
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements BER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public Snapshot decodeValue(BerCoder coder, DecoderInput source)
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
		this.thePosition = new FullPositionVector();
		this.thePosition.decodeValue(coder, source);
	    } catch (Exception e) {
		DecoderException ee = DecoderException.wrapException(e);
		ee.appendFieldContext("thePosition", "FullPositionVector");
		throw ee;
	    }
	    if (source.position() >= end_pos0)
		break;
	    tag = source.decodeTagLength();
	    if (tag == 0)
		break;
	    if (tag == 0xA1) {
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
	    if (tag == 0xA2) {
		try {
		    this.datSet = new VehicleStatus();
		    this.datSet.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("datSet", "VehicleStatus");
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
		    ee.appendExtensionContext("Snapshot", -1);
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
	Snapshot temp0 = this;

	if (temp0.datSet != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.datSet.encodeValue(coder, sink), 0xA2);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("datSet", "VehicleStatus");
		throw ee;
	    }
	}
	if (temp0.safetyExt != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.safetyExt.encodeValue(coder, sink), 0xA1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("safetyExt", "VehicleSafetyExtension");
		throw ee;
	    }
	}
	try {
	    len0 += sink.encodeLengthTag(temp0.thePosition.encodeValue(coder, sink), 0xA0);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("thePosition", "FullPositionVector");
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, Snapshot data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.safetyExt != null);
	sink.writeBit(data.datSet != null);
	nbits += 3;
	// Encode field 'thePosition'
	try {
	    FullPositionVector item1 = data.thePosition;

	    nbits += FullPositionVector.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("thePosition", "FullPositionVector");
	    throw ee;
	}
	if (data.safetyExt != null) {
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
	if (data.datSet != null) {
	    // Encode field 'datSet'
	    try {
		VehicleStatus item1 = data.datSet;

		nbits += VehicleStatus.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("datSet", "VehicleStatus");
		throw ee;
	    }
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static Snapshot decodeValue(PerCoder coder, InputBitStream source, Snapshot data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_safetyExt0 = source.readBit();
	boolean has_datSet0 = source.readBit();
    /** Decode root fields **/
	// Decode field 'thePosition'
	try {
	    if (data.thePosition == null)
		data.thePosition = new FullPositionVector();
	    data.thePosition.decodeValue(coder, source, data.thePosition);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("thePosition", "FullPositionVector");
	    throw de;
	}
	if (has_safetyExt0) {
	    // Decode field 'safetyExt'
	    try {
		if (data.safetyExt == null)
		    data.safetyExt = new VehicleSafetyExtension();
		data.safetyExt.decodeValue(coder, source, data.safetyExt);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("safetyExt", "VehicleSafetyExtension");
		throw de;
	    }
	} else {
	    data.safetyExt = null;
	}
	if (has_datSet0) {
	    // Decode field 'datSet'
	    try {
		if (data.datSet == null)
		    data.datSet = new VehicleStatus();
		data.datSet.decodeValue(coder, source, data.datSet);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("datSet", "VehicleStatus");
		throw de;
	    }
	} else {
	    data.datSet = null;
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
	// Encode field 'thePosition'
	try {
	    FullPositionVector item1 = this.thePosition;

	    {
		sink.encodeKey("thePosition");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("thePosition", "FullPositionVector");
	    throw ee;
	}
	// Encode field 'safetyExt'
	try {
	    VehicleSafetyExtension item1 = this.safetyExt;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("safetyExt");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "safetyExt");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("safetyExt", "VehicleSafetyExtension");
	    throw ee;
	}
	// Encode field 'datSet'
	try {
	    VehicleStatus item1 = this.datSet;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("datSet");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "datSet");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("datSet", "VehicleStatus");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public Snapshot decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[4];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		Snapshot.__Tag t_tag0 = Snapshot.__Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = Snapshot.__Tag._null_;
		switch (t_tag0) {
		    case __thePosition:
		    // Decode field 'thePosition'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.thePosition == null)
			    this.thePosition = new FullPositionVector();
			this.thePosition.decodeValue(coder, source);
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("thePosition", "FullPositionVector");
			throw de;
		    }
		    break;
		    case __safetyExt:
		    // Decode field 'safetyExt'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.safetyExt == null)
				this.safetyExt = new VehicleSafetyExtension();
			    this.safetyExt.decodeValue(coder, source);
			    present0[1] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("safetyExt", "VehicleSafetyExtension");
			throw de;
		    }
		    break;
		    case __datSet:
		    // Decode field 'datSet'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.datSet == null)
				this.datSet = new VehicleStatus();
			    this.datSet.decodeValue(coder, source);
			    present0[2] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("datSet", "VehicleStatus");
			throw de;
		    }
		    break;
		    default:
			coder.skipValue(source);
			break;
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'thePosition'");
	if (!present0[1])
	    this.safetyExt = null;
	if (!present0[2])
	    this.datSet = null;
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
	    writer.print("thePosition ");
	    this.thePosition.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.safetyExt != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("safetyExt ");
		this.safetyExt.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.datSet != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("datSet ");
		this.datSet.printValue(printer, writer);
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
	return equalTo((Snapshot)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((Snapshot)that);
    }
    
    public boolean equalTo(Snapshot that) {
	if (!this.thePosition.equalTo(that.thePosition))
	    return false;
	if (this.safetyExt != null && that.safetyExt != null) {
	    if (!this.safetyExt.equalTo(that.safetyExt))
		return false;
	}
	if (this.datSet != null && that.datSet != null) {
	    if (!this.datSet.equalTo(that.datSet))
		return false;
	}
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public Snapshot clone() {
	Snapshot copy = (Snapshot)super.clone();
	copy.thePosition = thePosition.clone();
	if (safetyExt != null) {
	    copy.safetyExt = safetyExt.clone();
	}
	if (datSet != null) {
	    copy.datSet = datSet.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.thePosition != null ? this.thePosition.hashCode() : 0);
	hash = 41 * hash + (this.safetyExt != null ? this.safetyExt.hashCode() : 0);
	hash = 41 * hash + (this.datSet != null ? this.datSet.hashCode() : 0);
	return hash;
    }
} // End class definition for Snapshot
