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
/* Created: Tue Dec 22 00:38:27 2015 */
/* ASN.1 Compiler for Java version: 6.2 */
/* ASN.1 compiler options and file names specified:
 * -toed -output com.bah.ode.asn.oss -per -uper -ber -der -json -root
 * ../../DSRC_R36_Source.asn ../../SEMI_ASN.1_Structures_2.2.asn
 */


package com.bah.ode.asn.oss.semi;

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
 * Define the ASN1 Type BroadcastInstructions from ASN1 Module SEMI.
 * @see Sequence
 */

public class BroadcastInstructions extends Sequence {
    public AdvisoryBroadcastType biType;
    public com.bah.ode.asn.oss.dsrc.Priority biPriority;
    public com.bah.ode.asn.oss.dsrc.DFullTime biDeliveryStart;
    public com.bah.ode.asn.oss.dsrc.DFullTime biDeliveryStop;
    public BOOLEAN biSignature;
    public BOOLEAN biEncryption;
    public DsrcInstructions dsrcInst;
    
    /**
     * The default constructor.
     */
    public BroadcastInstructions()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public BroadcastInstructions(AdvisoryBroadcastType biType, 
		    com.bah.ode.asn.oss.dsrc.Priority biPriority, 
		    com.bah.ode.asn.oss.dsrc.DFullTime biDeliveryStart, 
		    com.bah.ode.asn.oss.dsrc.DFullTime biDeliveryStop, 
		    BOOLEAN biSignature, BOOLEAN biEncryption, 
		    DsrcInstructions dsrcInst)
    {
	setBiType(biType);
	setBiPriority(biPriority);
	setBiDeliveryStart(biDeliveryStart);
	setBiDeliveryStop(biDeliveryStop);
	setBiSignature(biSignature);
	setBiEncryption(biEncryption);
	setDsrcInst(dsrcInst);
    }
    
    /**
     * Construct with components.
     */
    public BroadcastInstructions(AdvisoryBroadcastType biType, 
		    com.bah.ode.asn.oss.dsrc.Priority biPriority, 
		    com.bah.ode.asn.oss.dsrc.DFullTime biDeliveryStart, 
		    com.bah.ode.asn.oss.dsrc.DFullTime biDeliveryStop, 
		    boolean biSignature, boolean biEncryption, 
		    DsrcInstructions dsrcInst)
    {
	this(biType, biPriority, biDeliveryStart, biDeliveryStop, 
	     new BOOLEAN(biSignature), new BOOLEAN(biEncryption), dsrcInst);
    }
    
    /**
     * Construct with required components.
     */
    public BroadcastInstructions(AdvisoryBroadcastType biType, 
		    com.bah.ode.asn.oss.dsrc.Priority biPriority, 
		    com.bah.ode.asn.oss.dsrc.DFullTime biDeliveryStart, 
		    com.bah.ode.asn.oss.dsrc.DFullTime biDeliveryStop, 
		    boolean biSignature, boolean biEncryption)
    {
	setBiType(biType);
	setBiPriority(biPriority);
	setBiDeliveryStart(biDeliveryStart);
	setBiDeliveryStop(biDeliveryStop);
	setBiSignature(biSignature);
	setBiEncryption(biEncryption);
    }
    
    
    // Methods for field "biType"
    public AdvisoryBroadcastType getBiType()
    {
	return this.biType;
    }
    
    public void setBiType(AdvisoryBroadcastType biType)
    {
	this.biType = biType;
    }
    
    
    // Methods for field "biPriority"
    public com.bah.ode.asn.oss.dsrc.Priority getBiPriority()
    {
	return this.biPriority;
    }
    
    public void setBiPriority(com.bah.ode.asn.oss.dsrc.Priority biPriority)
    {
	this.biPriority = biPriority;
    }
    
    
    // Methods for field "biDeliveryStart"
    public com.bah.ode.asn.oss.dsrc.DFullTime getBiDeliveryStart()
    {
	return this.biDeliveryStart;
    }
    
    public void setBiDeliveryStart(com.bah.ode.asn.oss.dsrc.DFullTime biDeliveryStart)
    {
	this.biDeliveryStart = biDeliveryStart;
    }
    
    
    // Methods for field "biDeliveryStop"
    public com.bah.ode.asn.oss.dsrc.DFullTime getBiDeliveryStop()
    {
	return this.biDeliveryStop;
    }
    
    public void setBiDeliveryStop(com.bah.ode.asn.oss.dsrc.DFullTime biDeliveryStop)
    {
	this.biDeliveryStop = biDeliveryStop;
    }
    
    
    // Methods for field "biSignature"
    public boolean getBiSignature()
    {
	return (this.biSignature).booleanValue();
    }
    
    public void setBiSignature(boolean biSignature)
    {
	setBiSignature(new BOOLEAN(biSignature));
    }
    
    public void setBiSignature(BOOLEAN biSignature)
    {
	this.biSignature = biSignature;
    }
    
    
    // Methods for field "biEncryption"
    public boolean getBiEncryption()
    {
	return (this.biEncryption).booleanValue();
    }
    
    public void setBiEncryption(boolean biEncryption)
    {
	setBiEncryption(new BOOLEAN(biEncryption));
    }
    
    public void setBiEncryption(BOOLEAN biEncryption)
    {
	this.biEncryption = biEncryption;
    }
    
    
    // Methods for field "dsrcInst"
    public DsrcInstructions getDsrcInst()
    {
	return this.dsrcInst;
    }
    
    public void setDsrcInst(DsrcInstructions dsrcInst)
    {
	this.dsrcInst = dsrcInst;
    }
    
    public boolean hasDsrcInst()
    {
	return (dsrcInst != null);
    }
    
    public void deleteDsrcInst()
    {
	dsrcInst = null;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     */
    public static enum __Tag
    {
	__biType("biType"),
	__biPriority("biPriority"),
	__biDeliveryStart("biDeliveryStart"),
	__biDeliveryStop("biDeliveryStop"),
	__biSignature("biSignature"),
	__biEncryption("biEncryption"),
	__dsrcInst("dsrcInst"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(8);
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
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, BroadcastInstructions data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.dsrcInst != null);
	nbits += 2;
	// Encode field 'biType'
	try {
	    AdvisoryBroadcastType item1 = data.biType;
	    int idx1;
	    boolean extroot1 = true;

	    if (item1.isUnknownEnumerator()) {
		throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
	    } else {
		idx1 = item1.indexOf();
		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		extroot1 = idx1 < 4;
	    }
	    sink.writeBit(!extroot1); ++nbits;
	    if (extroot1)
		nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 3, sink);
	    else
		nbits += coder.encodeNormallySmallNumber(idx1 - 4, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("biType", "AdvisoryBroadcastType");
	    throw ee;
	}
	// Encode field 'biPriority'
	try {
	    com.bah.ode.asn.oss.dsrc.Priority item1 = data.biPriority;
	    int len1 = item1.getSize();

	    if (len1 != 1)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 1, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("biPriority", "Priority");
	    throw ee;
	}
	// Encode field 'biDeliveryStart'
	try {
	    com.bah.ode.asn.oss.dsrc.DFullTime item1 = data.biDeliveryStart;

	    nbits += com.bah.ode.asn.oss.dsrc.DFullTime.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("biDeliveryStart", "DFullTime");
	    throw ee;
	}
	// Encode field 'biDeliveryStop'
	try {
	    com.bah.ode.asn.oss.dsrc.DFullTime item1 = data.biDeliveryStop;

	    nbits += com.bah.ode.asn.oss.dsrc.DFullTime.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("biDeliveryStop", "DFullTime");
	    throw ee;
	}
	// Encode field 'biSignature'
	try {
	    BOOLEAN item1 = data.biSignature;

	    sink.writeBit(item1.booleanValue());
	    nbits += (1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("biSignature", "BOOLEAN");
	    throw ee;
	}
	// Encode field 'biEncryption'
	try {
	    BOOLEAN item1 = data.biEncryption;

	    sink.writeBit(item1.booleanValue());
	    nbits += (1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("biEncryption", "BOOLEAN");
	    throw ee;
	}
	if (data.dsrcInst != null) {
	    // Encode field 'dsrcInst'
	    try {
		DsrcInstructions item1 = data.dsrcInst;

		nbits += DsrcInstructions.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("dsrcInst", "DsrcInstructions");
		throw ee;
	    }
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static BroadcastInstructions decodeValue(PerCoder coder, InputBitStream source, BroadcastInstructions data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_dsrcInst0 = source.readBit();
    /** Decode root fields **/
	// Decode field 'biType'
	try {
	    int idx1;
	    AdvisoryBroadcastType temp1;
	    boolean extroot1 = !source.readBit();

	    if (extroot1) {
		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
		if (idx1 < 0 || idx1 > 3)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		temp1 = AdvisoryBroadcastType.valueAt(idx1);
	    } else {
		idx1 = 4 + (int)coder.decodeNormallySmallNumber(source);
		if (idx1 < 0)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		temp1 = AdvisoryBroadcastType.unknownEnumerator();
	    }
	    data.biType = temp1;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("biType", "AdvisoryBroadcastType");
	    throw de;
	}
	// Decode field 'biPriority'
	try {
	    data.biPriority = new com.bah.ode.asn.oss.dsrc.Priority(com.oss.coders.per.PerOctets.decode(coder, source, 1, 1));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("biPriority", "Priority");
	    throw de;
	}
	// Decode field 'biDeliveryStart'
	try {
	    if (data.biDeliveryStart == null)
		data.biDeliveryStart = new com.bah.ode.asn.oss.dsrc.DFullTime();
	    data.biDeliveryStart.decodeValue(coder, source, data.biDeliveryStart);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("biDeliveryStart", "DFullTime");
	    throw de;
	}
	// Decode field 'biDeliveryStop'
	try {
	    if (data.biDeliveryStop == null)
		data.biDeliveryStop = new com.bah.ode.asn.oss.dsrc.DFullTime();
	    data.biDeliveryStop.decodeValue(coder, source, data.biDeliveryStop);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("biDeliveryStop", "DFullTime");
	    throw de;
	}
	// Decode field 'biSignature'
	try {
	    if (data.biSignature == null)
		data.biSignature = new BOOLEAN();
	    data.biSignature.setValue(source.readBit());
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("biSignature", "BOOLEAN");
	    throw de;
	}
	// Decode field 'biEncryption'
	try {
	    if (data.biEncryption == null)
		data.biEncryption = new BOOLEAN();
	    data.biEncryption.setValue(source.readBit());
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("biEncryption", "BOOLEAN");
	    throw de;
	}
	if (has_dsrcInst0) {
	    // Decode field 'dsrcInst'
	    try {
		if (data.dsrcInst == null)
		    data.dsrcInst = new DsrcInstructions();
		data.dsrcInst.decodeValue(coder, source, data.dsrcInst);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("dsrcInst", "DsrcInstructions");
		throw de;
	    }
	} else {
	    data.dsrcInst = null;
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
	// Encode field 'biType'
	try {
	    AdvisoryBroadcastType item1 = this.biType;

	    {
		sink.encodeKey("biType");
		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else 
		    sink.writeString(item1.name());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("biType", "AdvisoryBroadcastType");
	    throw ee;
	}
	// Encode field 'biPriority'
	try {
	    com.bah.ode.asn.oss.dsrc.Priority item1 = this.biPriority;

	    {
		sink.writeSeparator();
		sink.encodeKey("biPriority");
		sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("biPriority", "Priority");
	    throw ee;
	}
	// Encode field 'biDeliveryStart'
	try {
	    com.bah.ode.asn.oss.dsrc.DFullTime item1 = this.biDeliveryStart;

	    {
		sink.writeSeparator();
		sink.encodeKey("biDeliveryStart");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("biDeliveryStart", "DFullTime");
	    throw ee;
	}
	// Encode field 'biDeliveryStop'
	try {
	    com.bah.ode.asn.oss.dsrc.DFullTime item1 = this.biDeliveryStop;

	    {
		sink.writeSeparator();
		sink.encodeKey("biDeliveryStop");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("biDeliveryStop", "DFullTime");
	    throw ee;
	}
	// Encode field 'biSignature'
	try {
	    BOOLEAN item1 = this.biSignature;

	    {
		sink.writeSeparator();
		sink.encodeKey("biSignature");
		sink.writeBoolean(item1.booleanValue());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("biSignature", "BOOLEAN");
	    throw ee;
	}
	// Encode field 'biEncryption'
	try {
	    BOOLEAN item1 = this.biEncryption;

	    {
		sink.writeSeparator();
		sink.encodeKey("biEncryption");
		sink.writeBoolean(item1.booleanValue());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("biEncryption", "BOOLEAN");
	    throw ee;
	}
	// Encode field 'dsrcInst'
	try {
	    DsrcInstructions item1 = this.dsrcInst;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("dsrcInst");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "dsrcInst");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("dsrcInst", "DsrcInstructions");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public BroadcastInstructions decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[8];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		BroadcastInstructions.__Tag t_tag0 = BroadcastInstructions.__Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = BroadcastInstructions.__Tag._null_;
		switch (t_tag0) {
		    case __biType:
		    // Decode field 'biType'
		    try {
			String content1 = coder.decodeString(source);
			int idx1;
			AdvisoryBroadcastType temp1;

			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			idx1 = coder.resolveName(AdvisoryBroadcastType.cConstantNameList, content1);
			if (idx1 < 0 )
			    temp1 = AdvisoryBroadcastType.unknownEnumerator();
			else
			    temp1 = AdvisoryBroadcastType.cNamedNumbers[idx1];
			this.biType = temp1;
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("biType", "AdvisoryBroadcastType");
			throw de;
		    }
		    break;
		    case __biPriority:
		    // Decode field 'biPriority'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			this.biPriority = new com.bah.ode.asn.oss.dsrc.Priority(coder.decodeOctetString(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("biPriority", "Priority");
			throw de;
		    }
		    break;
		    case __biDeliveryStart:
		    // Decode field 'biDeliveryStart'
		    try {
			if (present0[2])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.biDeliveryStart == null)
			    this.biDeliveryStart = new com.bah.ode.asn.oss.dsrc.DFullTime();
			this.biDeliveryStart.decodeValue(coder, source);
			present0[2] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("biDeliveryStart", "DFullTime");
			throw de;
		    }
		    break;
		    case __biDeliveryStop:
		    // Decode field 'biDeliveryStop'
		    try {
			if (present0[3])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.biDeliveryStop == null)
			    this.biDeliveryStop = new com.bah.ode.asn.oss.dsrc.DFullTime();
			this.biDeliveryStop.decodeValue(coder, source);
			present0[3] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("biDeliveryStop", "DFullTime");
			throw de;
		    }
		    break;
		    case __biSignature:
		    // Decode field 'biSignature'
		    try {
			if (present0[4])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.biSignature == null)
			    this.biSignature = new BOOLEAN();
			this.biSignature.setValue(coder.decodeBoolean(source));
			present0[4] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("biSignature", "BOOLEAN");
			throw de;
		    }
		    break;
		    case __biEncryption:
		    // Decode field 'biEncryption'
		    try {
			if (present0[5])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.biEncryption == null)
			    this.biEncryption = new BOOLEAN();
			this.biEncryption.setValue(coder.decodeBoolean(source));
			present0[5] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("biEncryption", "BOOLEAN");
			throw de;
		    }
		    break;
		    case __dsrcInst:
		    // Decode field 'dsrcInst'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[6])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.dsrcInst == null)
				this.dsrcInst = new DsrcInstructions();
			    this.dsrcInst.decodeValue(coder, source);
			    present0[6] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("dsrcInst", "DsrcInstructions");
			throw de;
		    }
		    break;
		    default:
			coder.skipValue(source);
			break;
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'biType'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'biPriority'");
	if (!present0[2])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'biDeliveryStart'");
	if (!present0[3])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'biDeliveryStop'");
	if (!present0[4])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'biSignature'");
	if (!present0[5])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'biEncryption'");
	if (!present0[6])
	    this.dsrcInst = null;
	return this;
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((BroadcastInstructions)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((BroadcastInstructions)that);
    }
    
    public boolean equalTo(BroadcastInstructions that) {
	if (!this.biType.equalTo(that.biType))
	    return false;
	if (!this.biPriority.equalTo(that.biPriority))
	    return false;
	if (!this.biDeliveryStart.equalTo(that.biDeliveryStart))
	    return false;
	if (!this.biDeliveryStop.equalTo(that.biDeliveryStop))
	    return false;
	if (!this.biSignature.equalTo(that.biSignature))
	    return false;
	if (!this.biEncryption.equalTo(that.biEncryption))
	    return false;
	if (this.dsrcInst != null && that.dsrcInst != null) {
	    if (!this.dsrcInst.equalTo(that.dsrcInst))
		return false;
	}
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public BroadcastInstructions clone() {
	BroadcastInstructions copy = (BroadcastInstructions)super.clone();
	copy.biType = biType.clone();
	copy.biPriority = biPriority.clone();
	copy.biDeliveryStart = biDeliveryStart.clone();
	copy.biDeliveryStop = biDeliveryStop.clone();
	copy.biSignature = biSignature.clone();
	copy.biEncryption = biEncryption.clone();
	if (dsrcInst != null) {
	    copy.dsrcInst = dsrcInst.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.biType != null ? this.biType.hashCode() : 0);
	hash = 41 * hash + (this.biPriority != null ? this.biPriority.hashCode() : 0);
	hash = 41 * hash + (this.biDeliveryStart != null ? this.biDeliveryStart.hashCode() : 0);
	hash = 41 * hash + (this.biDeliveryStop != null ? this.biDeliveryStop.hashCode() : 0);
	hash = 41 * hash + (this.biSignature != null ? this.biSignature.hashCode() : 0);
	hash = 41 * hash + (this.biEncryption != null ? this.biEncryption.hashCode() : 0);
	hash = 41 * hash + (this.dsrcInst != null ? this.dsrcInst.hashCode() : 0);
	return hash;
    }
} // End class definition for BroadcastInstructions
