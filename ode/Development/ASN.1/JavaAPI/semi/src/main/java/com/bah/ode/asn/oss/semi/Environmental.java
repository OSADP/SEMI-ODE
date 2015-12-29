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
 * Define the ASN1 Type Environmental from ASN1 Module SEMI.
 * @see Sequence
 */

public class Environmental extends Sequence {
    public FuelConsumption fuelCon;
    public Emissions emiss;
    public FuelEconomy fuelEcon;
    
    /**
     * The default constructor.
     */
    public Environmental()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Environmental(FuelConsumption fuelCon, Emissions emiss, 
		    FuelEconomy fuelEcon)
    {
	setFuelCon(fuelCon);
	setEmiss(emiss);
	setFuelEcon(fuelEcon);
    }
    
    
    // Methods for field "fuelCon"
    public FuelConsumption getFuelCon()
    {
	return this.fuelCon;
    }
    
    public void setFuelCon(FuelConsumption fuelCon)
    {
	this.fuelCon = fuelCon;
    }
    
    
    // Methods for field "emiss"
    public Emissions getEmiss()
    {
	return this.emiss;
    }
    
    public void setEmiss(Emissions emiss)
    {
	this.emiss = emiss;
    }
    
    
    // Methods for field "fuelEcon"
    public FuelEconomy getFuelEcon()
    {
	return this.fuelEcon;
    }
    
    public void setFuelEcon(FuelEconomy fuelEcon)
    {
	this.fuelEcon = fuelEcon;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     */
    public static enum __Tag
    {
	__fuelCon("fuelCon"),
	__emiss("emiss"),
	__fuelEcon("fuelEcon"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, Environmental data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	++nbits;
	// Encode field 'fuelCon'
	try {
	    FuelConsumption item1 = data.fuelCon;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 255)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("fuelCon", "FuelConsumption");
	    throw ee;
	}
	// Encode field 'emiss'
	try {
	    Emissions item1 = data.emiss;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 255)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("emiss", "Emissions");
	    throw ee;
	}
	// Encode field 'fuelEcon'
	try {
	    FuelEconomy item1 = data.fuelEcon;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 255)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("fuelEcon", "FuelEconomy");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static Environmental decodeValue(PerCoder coder, InputBitStream source, Environmental data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

    /** Decode root fields **/
	// Decode field 'fuelCon'
	try {
	    long temp1;

	    if (data.fuelCon == null)
		data.fuelCon = new FuelConsumption();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
	    if (temp1 > 255)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.fuelCon.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("fuelCon", "FuelConsumption");
	    throw de;
	}
	// Decode field 'emiss'
	try {
	    long temp1;

	    if (data.emiss == null)
		data.emiss = new Emissions();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
	    if (temp1 > 255)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.emiss.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("emiss", "Emissions");
	    throw de;
	}
	// Decode field 'fuelEcon'
	try {
	    long temp1;

	    if (data.fuelEcon == null)
		data.fuelEcon = new FuelEconomy();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
	    if (temp1 > 255)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.fuelEcon.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("fuelEcon", "FuelEconomy");
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
     * Implements JSON value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public void encodeValue(JsonCoder coder, JsonWriter sink)
	    throws IOException, EncoderException
    {
	sink.beginObject();
	// Encode field 'fuelCon'
	try {
	    FuelConsumption item1 = this.fuelCon;

	    {
		sink.encodeKey("fuelCon");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("fuelCon", "FuelConsumption");
	    throw ee;
	}
	// Encode field 'emiss'
	try {
	    Emissions item1 = this.emiss;

	    {
		sink.writeSeparator();
		sink.encodeKey("emiss");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("emiss", "Emissions");
	    throw ee;
	}
	// Encode field 'fuelEcon'
	try {
	    FuelEconomy item1 = this.fuelEcon;

	    {
		sink.writeSeparator();
		sink.encodeKey("fuelEcon");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("fuelEcon", "FuelEconomy");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public Environmental decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[4];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		Environmental.__Tag t_tag0 = Environmental.__Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = Environmental.__Tag._null_;
		switch (t_tag0) {
		    case __fuelCon:
		    // Decode field 'fuelCon'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.fuelCon == null)
			    this.fuelCon = new FuelConsumption();
			this.fuelCon.setValue(coder.decodeInteger(source));
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("fuelCon", "FuelConsumption");
			throw de;
		    }
		    break;
		    case __emiss:
		    // Decode field 'emiss'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.emiss == null)
			    this.emiss = new Emissions();
			this.emiss.setValue(coder.decodeInteger(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("emiss", "Emissions");
			throw de;
		    }
		    break;
		    case __fuelEcon:
		    // Decode field 'fuelEcon'
		    try {
			if (present0[2])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.fuelEcon == null)
			    this.fuelEcon = new FuelEconomy();
			this.fuelEcon.setValue(coder.decodeInteger(source));
			present0[2] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("fuelEcon", "FuelEconomy");
			throw de;
		    }
		    break;
		    default:
			coder.skipValue(source);
			break;
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'fuelCon'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'emiss'");
	if (!present0[2])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'fuelEcon'");
	return this;
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((Environmental)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((Environmental)that);
    }
    
    public boolean equalTo(Environmental that) {
	if (!this.fuelCon.equalTo(that.fuelCon))
	    return false;
	if (!this.emiss.equalTo(that.emiss))
	    return false;
	if (!this.fuelEcon.equalTo(that.fuelEcon))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public Environmental clone() {
	Environmental copy = (Environmental)super.clone();
	copy.fuelCon = fuelCon.clone();
	copy.emiss = emiss.clone();
	copy.fuelEcon = fuelEcon.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.fuelCon != null ? this.fuelCon.hashCode() : 0);
	hash = 41 * hash + (this.emiss != null ? this.emiss.hashCode() : 0);
	hash = 41 * hash + (this.fuelEcon != null ? this.fuelEcon.hashCode() : 0);
	return hash;
    }
} // End class definition for Environmental
