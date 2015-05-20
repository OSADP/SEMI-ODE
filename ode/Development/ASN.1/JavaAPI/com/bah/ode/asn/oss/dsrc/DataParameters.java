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
/* Created: Wed May 20 08:06:10 2015 */
/* ASN.1 Compiler for Java version: 6.1 */
/* ASN.1 compiler options and file names specified:
 * -toed -output com.bah.ode.asn.oss -per -uper -ber -der -root -messageFormat
 * msvc
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
 * Define the ASN1 Type DataParameters from ASN1 Module DSRC.
 * @see Sequence
 */

public class DataParameters extends Sequence {
    public IA5String processMethod;
    public IA5String processAgency;
    public IA5String lastCheckedDate;
    public IA5String geiodUsed;
    
    /**
     * The default constructor.
     */
    public DataParameters()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DataParameters(IA5String processMethod, IA5String processAgency, 
		    IA5String lastCheckedDate, IA5String geiodUsed)
    {
	setProcessMethod(processMethod);
	setProcessAgency(processAgency);
	setLastCheckedDate(lastCheckedDate);
	setGeiodUsed(geiodUsed);
    }
    
    
    // Methods for field "processMethod"
    public IA5String getProcessMethod()
    {
	return this.processMethod;
    }
    
    public void setProcessMethod(IA5String processMethod)
    {
	this.processMethod = processMethod;
    }
    
    public boolean hasProcessMethod()
    {
	return (processMethod != null);
    }
    
    public void deleteProcessMethod()
    {
	processMethod = null;
    }
    
    
    // Methods for field "processAgency"
    public IA5String getProcessAgency()
    {
	return this.processAgency;
    }
    
    public void setProcessAgency(IA5String processAgency)
    {
	this.processAgency = processAgency;
    }
    
    public boolean hasProcessAgency()
    {
	return (processAgency != null);
    }
    
    public void deleteProcessAgency()
    {
	processAgency = null;
    }
    
    
    // Methods for field "lastCheckedDate"
    public IA5String getLastCheckedDate()
    {
	return this.lastCheckedDate;
    }
    
    public void setLastCheckedDate(IA5String lastCheckedDate)
    {
	this.lastCheckedDate = lastCheckedDate;
    }
    
    public boolean hasLastCheckedDate()
    {
	return (lastCheckedDate != null);
    }
    
    public void deleteLastCheckedDate()
    {
	lastCheckedDate = null;
    }
    
    
    // Methods for field "geiodUsed"
    public IA5String getGeiodUsed()
    {
	return this.geiodUsed;
    }
    
    public void setGeiodUsed(IA5String geiodUsed)
    {
	this.geiodUsed = geiodUsed;
    }
    
    public boolean hasGeiodUsed()
    {
	return (geiodUsed != null);
    }
    
    public void deleteGeiodUsed()
    {
	geiodUsed = null;
    }
    
    
    /**
     * Effective permitted alphabet (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public static final EPAInfo _cEPAInfo_processMethod = 
	IA5StringPAInfo.paInfo;
    
    /**
     * Effective permitted alphabet (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public static final EPAInfo _cEPAInfo_processAgency = 
	IA5StringPAInfo.paInfo;
    
    /**
     * Effective permitted alphabet (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public static final EPAInfo _cEPAInfo_lastCheckedDate = 
	IA5StringPAInfo.paInfo;
    
    /**
     * Effective permitted alphabet (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public static final EPAInfo _cEPAInfo_geiodUsed = 
	IA5StringPAInfo.paInfo;
    
    /**
     * Implements BER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encodeValue(BerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	int len0 = 0;
	DataParameters temp0 = this;

	if (temp0.geiodUsed != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeString1(temp0.geiodUsed, sink), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("geiodUsed", "IA5String");
		throw ee;
	    }
	}
	if (temp0.lastCheckedDate != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeString1(temp0.lastCheckedDate, sink), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("lastCheckedDate", "IA5String");
		throw ee;
	    }
	}
	if (temp0.processAgency != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeString1(temp0.processAgency, sink), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("processAgency", "IA5String");
		throw ee;
	    }
	}
	if (temp0.processMethod != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeString1(temp0.processMethod, sink), 0x80);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("processMethod", "IA5String");
		throw ee;
	    }
	}

	return len0;
    }

    /**
     * Implements BER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public DataParameters decodeValue(BerCoder coder, DecoderInput source)
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
	    if (tag == 0x80 || tag == 0xA0) {
		try {
		    this.processMethod = new IA5String(coder.decodeChars(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("processMethod", "IA5String");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x81 || tag == 0xA1) {
		try {
		    this.processAgency = new IA5String(coder.decodeChars(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("processAgency", "IA5String");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x82 || tag == 0xA2) {
		try {
		    this.lastCheckedDate = new IA5String(coder.decodeChars(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("lastCheckedDate", "IA5String");
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
		    this.geiodUsed = new IA5String(coder.decodeChars(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("geiodUsed", "IA5String");
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
		    ee.appendExtensionContext("DataParameters", -1);
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
	DataParameters temp0 = this;

	if (temp0.geiodUsed != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeString1(temp0.geiodUsed, sink), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("geiodUsed", "IA5String");
		throw ee;
	    }
	}
	if (temp0.lastCheckedDate != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeString1(temp0.lastCheckedDate, sink), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("lastCheckedDate", "IA5String");
		throw ee;
	    }
	}
	if (temp0.processAgency != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeString1(temp0.processAgency, sink), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("processAgency", "IA5String");
		throw ee;
	    }
	}
	if (temp0.processMethod != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeString1(temp0.processMethod, sink), 0x80);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("processMethod", "IA5String");
		throw ee;
	    }
	}

	return len0;
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, DataParameters data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	boolean has_processMethod0 = data.processMethod != null;
	boolean has_processAgency0 = data.processAgency != null;
	boolean has_lastCheckedDate0 = data.lastCheckedDate != null;
	boolean has_geiodUsed0 = data.geiodUsed != null;
	sink.writeBit(false); ++nbits;
	sink.writeBit(has_processMethod0); ++nbits;
	sink.writeBit(has_processAgency0); ++nbits;
	sink.writeBit(has_lastCheckedDate0); ++nbits;
	sink.writeBit(has_geiodUsed0); ++nbits;
	if (has_processMethod0) {
	    // Encode field 'processMethod'
	    try {
		IA5String item1 = data.processMethod;
		int len1 = item1.getSize();

		if (len1 < 1 || len1 > 255)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerKMCString.encode(coder, item1.stringValue(), 1, 255, DataParameters._cEPAInfo_processMethod, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("processMethod", "IA5String");
		throw ee;
	    }
	}
	if (has_processAgency0) {
	    // Encode field 'processAgency'
	    try {
		IA5String item1 = data.processAgency;
		int len1 = item1.getSize();

		if (len1 < 1 || len1 > 255)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerKMCString.encode(coder, item1.stringValue(), 1, 255, DataParameters._cEPAInfo_processAgency, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("processAgency", "IA5String");
		throw ee;
	    }
	}
	if (has_lastCheckedDate0) {
	    // Encode field 'lastCheckedDate'
	    try {
		IA5String item1 = data.lastCheckedDate;
		int len1 = item1.getSize();

		if (len1 < 1 || len1 > 255)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerKMCString.encode(coder, item1.stringValue(), 1, 255, DataParameters._cEPAInfo_lastCheckedDate, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("lastCheckedDate", "IA5String");
		throw ee;
	    }
	}
	if (has_geiodUsed0) {
	    // Encode field 'geiodUsed'
	    try {
		IA5String item1 = data.geiodUsed;
		int len1 = item1.getSize();

		if (len1 < 1 || len1 > 255)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerKMCString.encode(coder, item1.stringValue(), 1, 255, DataParameters._cEPAInfo_geiodUsed, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("geiodUsed", "IA5String");
		throw ee;
	    }
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static DataParameters decodeValue(PerCoder coder, InputBitStream source, DataParameters data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	int idx0;
	InputBitStream bitstream0 = null;

	boolean has_processMethod0 = source.readBit();
	boolean has_processAgency0 = source.readBit();
	boolean has_lastCheckedDate0 = source.readBit();
	boolean has_geiodUsed0 = source.readBit();
	if (has_processMethod0) {
	    // Decode field 'processMethod'
	    try {
		data.processMethod = new IA5String(com.oss.coders.per.PerKMCString.decode(coder, source, 1, 255, DataParameters._cEPAInfo_processMethod));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("processMethod", "IA5String");
		throw de;
	    }
	} else {
	    data.processMethod = null;
	}
	if (has_processAgency0) {
	    // Decode field 'processAgency'
	    try {
		data.processAgency = new IA5String(com.oss.coders.per.PerKMCString.decode(coder, source, 1, 255, DataParameters._cEPAInfo_processAgency));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("processAgency", "IA5String");
		throw de;
	    }
	} else {
	    data.processAgency = null;
	}
	if (has_lastCheckedDate0) {
	    // Decode field 'lastCheckedDate'
	    try {
		data.lastCheckedDate = new IA5String(com.oss.coders.per.PerKMCString.decode(coder, source, 1, 255, DataParameters._cEPAInfo_lastCheckedDate));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("lastCheckedDate", "IA5String");
		throw de;
	    }
	} else {
	    data.lastCheckedDate = null;
	}
	if (has_geiodUsed0) {
	    // Decode field 'geiodUsed'
	    try {
		data.geiodUsed = new IA5String(com.oss.coders.per.PerKMCString.decode(coder, source, 1, 255, DataParameters._cEPAInfo_geiodUsed));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("geiodUsed", "IA5String");
		throw de;
	    }
	} else {
	    data.geiodUsed = null;
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
	if (this.processMethod != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("processMethod ");
		printer.print(this.processMethod, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.processAgency != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("processAgency ");
		printer.print(this.processAgency, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.lastCheckedDate != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("lastCheckedDate ");
		printer.print(this.lastCheckedDate, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.geiodUsed != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("geiodUsed ");
		printer.print(this.geiodUsed, writer);
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
	return equalTo((DataParameters)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((DataParameters)that);
    }
    
    public boolean equalTo(DataParameters that) {
	if (this.processMethod != null && that.processMethod != null) {
	    if (!this.processMethod.equalTo(that.processMethod))
		return false;
	}
	if (this.processAgency != null && that.processAgency != null) {
	    if (!this.processAgency.equalTo(that.processAgency))
		return false;
	}
	if (this.lastCheckedDate != null && that.lastCheckedDate != null) {
	    if (!this.lastCheckedDate.equalTo(that.lastCheckedDate))
		return false;
	}
	if (this.geiodUsed != null && that.geiodUsed != null) {
	    if (!this.geiodUsed.equalTo(that.geiodUsed))
		return false;
	}
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public DataParameters clone() {
	DataParameters copy = (DataParameters)super.clone();
	if (processMethod != null) {
	    copy.processMethod = processMethod.clone();
	}
	if (processAgency != null) {
	    copy.processAgency = processAgency.clone();
	}
	if (lastCheckedDate != null) {
	    copy.lastCheckedDate = lastCheckedDate.clone();
	}
	if (geiodUsed != null) {
	    copy.geiodUsed = geiodUsed.clone();
	}
	return copy;
    }

} // End class definition for DataParameters
