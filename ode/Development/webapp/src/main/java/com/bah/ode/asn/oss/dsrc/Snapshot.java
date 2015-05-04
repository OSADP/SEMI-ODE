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

	boolean has_safetyExt0 = data.safetyExt != null;
	boolean has_datSet0 = data.datSet != null;
	sink.writeBit(false); ++nbits;
	sink.writeBit(has_safetyExt0); ++nbits;
	sink.writeBit(has_datSet0); ++nbits;
	// Encode field 'thePosition'
	try {
	    FullPositionVector item1 = data.thePosition;

	    nbits += FullPositionVector.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("thePosition", "FullPositionVector");
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
	if (has_datSet0) {
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
	int idx0;
	InputBitStream bitstream0 = null;

	boolean has_safetyExt0 = source.readBit();
	boolean has_datSet0 = source.readBit();
	// Decode field 'thePosition'
	try {
	    if (data.thePosition == null)
		data.thePosition = new FullPositionVector();
	    FullPositionVector.decodeValue(coder, source, data.thePosition);
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
		VehicleSafetyExtension.decodeValue(coder, source, data.safetyExt);
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
		VehicleStatus.decodeValue(coder, source, data.datSet);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("datSet", "VehicleStatus");
		throw de;
	    }
	} else {
	    data.datSet = null;
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
	    writer.print("thePosition ");
	    this.thePosition.printValue(printer, writer);
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
	if (this.datSet != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("datSet ");
		this.datSet.printValue(printer, writer);
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

} // End class definition for Snapshot
