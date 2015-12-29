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
 * Define the ASN1 Type DsrcInstructions from ASN1 Module SEMI.
 * @see Sequence
 */

public class DsrcInstructions extends Sequence {
    public TxMode biTxMode;
    public TxChannel biTxChannel;
    public INTEGER biTxInterval;
    
    /**
     * The default constructor.
     */
    public DsrcInstructions()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DsrcInstructions(TxMode biTxMode, TxChannel biTxChannel, 
		    INTEGER biTxInterval)
    {
	setBiTxMode(biTxMode);
	setBiTxChannel(biTxChannel);
	setBiTxInterval(biTxInterval);
    }
    
    /**
     * Construct with components.
     */
    public DsrcInstructions(TxMode biTxMode, TxChannel biTxChannel, 
		    long biTxInterval)
    {
	this(biTxMode, biTxChannel, new INTEGER(biTxInterval));
    }
    
    
    // Methods for field "biTxMode"
    public TxMode getBiTxMode()
    {
	return this.biTxMode;
    }
    
    public void setBiTxMode(TxMode biTxMode)
    {
	this.biTxMode = biTxMode;
    }
    
    
    // Methods for field "biTxChannel"
    public TxChannel getBiTxChannel()
    {
	return this.biTxChannel;
    }
    
    public void setBiTxChannel(TxChannel biTxChannel)
    {
	this.biTxChannel = biTxChannel;
    }
    
    
    // Methods for field "biTxInterval"
    public long getBiTxInterval()
    {
	return (this.biTxInterval).longValue();
    }
    
    public void setBiTxInterval(long biTxInterval)
    {
	setBiTxInterval(new INTEGER(biTxInterval));
    }
    
    public void setBiTxInterval(INTEGER biTxInterval)
    {
	this.biTxInterval = biTxInterval;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     */
    public static enum __Tag
    {
	__biTxMode("biTxMode"),
	__biTxChannel("biTxChannel"),
	__biTxInterval("biTxInterval"),
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
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, DsrcInstructions data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	// Encode field 'biTxMode'
	try {
	    TxMode item1 = data.biTxMode;
	    int idx1 = item1.indexOf();

	    if (idx1 < 0)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
	    nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 1, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("biTxMode", "TxMode");
	    throw ee;
	}
	// Encode field 'biTxChannel'
	try {
	    TxChannel item1 = data.biTxChannel;
	    int idx1 = item1.indexOf();

	    if (idx1 < 0)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
	    nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 8, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("biTxChannel", "TxChannel");
	    throw ee;
	}
	// Encode field 'biTxInterval'
	try {
	    INTEGER item1 = data.biTxInterval;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 50)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 50, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("biTxInterval", "INTEGER");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static DsrcInstructions decodeValue(PerCoder coder, InputBitStream source, DsrcInstructions data)
	    throws IOException, DecoderException, DecodeFailedException
    {
    /** Decode root fields **/
	// Decode field 'biTxMode'
	try {
	    int idx1;

	    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 1);
	    if (idx1 < 0 || idx1 > 1)
		throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
	    data.biTxMode = TxMode.valueAt(idx1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("biTxMode", "TxMode");
	    throw de;
	}
	// Decode field 'biTxChannel'
	try {
	    int idx1;

	    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 8);
	    if (idx1 < 0 || idx1 > 8)
		throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
	    data.biTxChannel = TxChannel.valueAt(idx1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("biTxChannel", "TxChannel");
	    throw de;
	}
	// Decode field 'biTxInterval'
	try {
	    long temp1;

	    if (data.biTxInterval == null)
		data.biTxInterval = new INTEGER();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 50);
	    if (temp1 > 50)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.biTxInterval.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("biTxInterval", "INTEGER");
	    throw de;
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
	// Encode field 'biTxMode'
	try {
	    TxMode item1 = this.biTxMode;

	    {
		sink.encodeKey("biTxMode");
		sink.writeString(item1.name());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("biTxMode", "TxMode");
	    throw ee;
	}
	// Encode field 'biTxChannel'
	try {
	    TxChannel item1 = this.biTxChannel;

	    {
		sink.writeSeparator();
		sink.encodeKey("biTxChannel");
		sink.writeString(item1.name());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("biTxChannel", "TxChannel");
	    throw ee;
	}
	// Encode field 'biTxInterval'
	try {
	    INTEGER item1 = this.biTxInterval;

	    {
		sink.writeSeparator();
		sink.encodeKey("biTxInterval");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("biTxInterval", "INTEGER");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public DsrcInstructions decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[4];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		DsrcInstructions.__Tag t_tag0 = DsrcInstructions.__Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = DsrcInstructions.__Tag._null_;
		switch (t_tag0) {
		    case __biTxMode:
		    // Decode field 'biTxMode'
		    try {
			String content1 = coder.decodeString(source);
			int idx1;
			TxMode temp1;

			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			idx1 = coder.resolveName(TxMode.cConstantNameList, content1);
			if (idx1 < 0 )
			    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			else
			    temp1 = TxMode.cNamedNumbers[idx1];
			this.biTxMode = temp1;
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("biTxMode", "TxMode");
			throw de;
		    }
		    break;
		    case __biTxChannel:
		    // Decode field 'biTxChannel'
		    try {
			String content1 = coder.decodeString(source);
			int idx1;
			TxChannel temp1;

			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			idx1 = coder.resolveName(TxChannel.cConstantNameList, content1);
			if (idx1 < 0 )
			    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			else
			    temp1 = TxChannel.cNamedNumbers[idx1];
			this.biTxChannel = temp1;
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("biTxChannel", "TxChannel");
			throw de;
		    }
		    break;
		    case __biTxInterval:
		    // Decode field 'biTxInterval'
		    try {
			if (present0[2])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.biTxInterval == null)
			    this.biTxInterval = new INTEGER();
			this.biTxInterval.setValue(coder.decodeInteger(source));
			present0[2] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("biTxInterval", "INTEGER");
			throw de;
		    }
		    break;
		    default:
			throw new DecoderException(ExceptionDescriptor._unknown_field, ": '" + tag0 + "'");
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'biTxMode'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'biTxChannel'");
	if (!present0[2])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'biTxInterval'");
	return this;
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((DsrcInstructions)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((DsrcInstructions)that);
    }
    
    public boolean equalTo(DsrcInstructions that) {
	if (!this.biTxMode.equalTo(that.biTxMode))
	    return false;
	if (!this.biTxChannel.equalTo(that.biTxChannel))
	    return false;
	if (!this.biTxInterval.equalTo(that.biTxInterval))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public DsrcInstructions clone() {
	DsrcInstructions copy = (DsrcInstructions)super.clone();
	copy.biTxMode = biTxMode.clone();
	copy.biTxChannel = biTxChannel.clone();
	copy.biTxInterval = biTxInterval.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.biTxMode != null ? this.biTxMode.hashCode() : 0);
	hash = 41 * hash + (this.biTxChannel != null ? this.biTxChannel.hashCode() : 0);
	hash = 41 * hash + (this.biTxInterval != null ? this.biTxInterval.hashCode() : 0);
	return hash;
    }
} // End class definition for DsrcInstructions
