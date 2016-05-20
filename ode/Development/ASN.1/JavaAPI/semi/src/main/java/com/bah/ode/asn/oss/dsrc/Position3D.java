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
 * Define the ASN1 Type Position3D from ASN1 Module DSRC.
 * @see Sequence
 */

public class Position3D extends Sequence {
    public Latitude lat;
    public Longitude _long;
    public Elevation elevation;
    
    /**
     * The default constructor.
     */
    public Position3D()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Position3D(Latitude lat, Longitude _long, Elevation elevation)
    {
	setLat(lat);
	set_long(_long);
	setElevation(elevation);
    }
    
    /**
     * Construct with required components.
     */
    public Position3D(Latitude lat, Longitude _long)
    {
	setLat(lat);
	set_long(_long);
    }
    
    
    // Methods for field "lat"
    public Latitude getLat()
    {
	return this.lat;
    }
    
    public void setLat(Latitude lat)
    {
	this.lat = lat;
    }
    
    
    // Methods for field "_long"
    public Longitude get_long()
    {
	return this._long;
    }
    
    public void set_long(Longitude _long)
    {
	this._long = _long;
    }
    
    
    // Methods for field "elevation"
    public Elevation getElevation()
    {
	return this.elevation;
    }
    
    public void setElevation(Elevation elevation)
    {
	this.elevation = elevation;
    }
    
    public boolean hasElevation()
    {
	return (elevation != null);
    }
    
    public void deleteElevation()
    {
	elevation = null;
    }
    
    
    /**
     * Implements BER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encodeValue(BerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	int len0 = 0;
	Position3D temp0 = this;

	if (temp0.elevation != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.elevation.byteArrayValue()), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("elevation", "Elevation");
		throw ee;
	    }
	}
	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0._long, sink), 0x81);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("long", "Longitude");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.lat, sink), 0x80);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("lat", "Latitude");
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements BER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public Position3D decodeValue(BerCoder coder, DecoderInput source)
	    throws DecoderException
    {
	int total_len0 = source.mLength;
	int end_pos0 = (total_len0 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len0);
	int tag;

	do {
	    tag = source.decodeTagLength();
	    if (tag != 0x80)
		source.raiseTagMismatchException(tag);
	    try {
		this.lat = new Latitude(source.decodeLong());
	    } catch (Exception e) {
		DecoderException ee = DecoderException.wrapException(e);
		ee.appendFieldContext("lat", "Latitude");
		throw ee;
	    }
	    tag = source.decodeTagLength();
	    if (tag != 0x81)
		source.raiseTagMismatchException(tag);
	    try {
		this._long = new Longitude(source.decodeLong());
	    } catch (Exception e) {
		DecoderException ee = DecoderException.wrapException(e);
		ee.appendFieldContext("long", "Longitude");
		throw ee;
	    }
	    if (source.position() >= end_pos0)
		break;
	    tag = source.decodeTagLength();
	    if (tag == 0)
		break;
	    if (tag == 0x82 || tag == 0xA2) {
		try {
		    this.elevation = new Elevation(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("elevation", "Elevation");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    source.raiseUnknownFieldException(tag);
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
	Position3D temp0 = this;

	if (temp0.elevation != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.elevation.byteArrayValue()), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("elevation", "Elevation");
		throw ee;
	    }
	}
	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0._long, sink), 0x81);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("long", "Longitude");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.lat, sink), 0x80);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("lat", "Latitude");
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, Position3D data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(data.elevation != null);
	++nbits;
	// Encode field 'lat'
	try {
	    Latitude item1 = data.lat;
	    long temp1 = item1.longValue();

	    if (temp1 < -900000000 || temp1 > 900000001)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, -900000000, 900000001, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("lat", "Latitude");
	    throw ee;
	}
	// Encode field 'long'
	try {
	    Longitude item1 = data._long;
	    long temp1 = item1.longValue();

	    if (temp1 < -1800000000 || temp1 > 1800000001)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, -1800000000, 1800000001, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("long", "Longitude");
	    throw ee;
	}
	if (data.elevation != null) {
	    // Encode field 'elevation'
	    try {
		Elevation item1 = data.elevation;
		int len1 = item1.getSize();

		if (len1 != 2)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 2, 2, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("elevation", "Elevation");
		throw ee;
	    }
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static Position3D decodeValue(PerCoder coder, InputBitStream source, Position3D data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean has_elevation0 = source.readBit();
    /** Decode root fields **/
	// Decode field 'lat'
	try {
	    long temp1;

	    if (data.lat == null)
		data.lat = new Latitude();
	    temp1 = coder.decodeConstrainedWholeNumber(source, -900000000, 900000001);
	    if (temp1 > 900000001)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.lat.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("lat", "Latitude");
	    throw de;
	}
	// Decode field 'long'
	try {
	    long temp1;

	    if (data._long == null)
		data._long = new Longitude();
	    temp1 = coder.decodeConstrainedWholeNumber(source, -1800000000, 1800000001);
	    if (temp1 > 1800000001)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data._long.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("long", "Longitude");
	    throw de;
	}
	if (has_elevation0) {
	    // Decode field 'elevation'
	    try {
		data.elevation = new Elevation(com.oss.coders.per.PerOctets.decode(coder, source, 2, 2));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("elevation", "Elevation");
		throw de;
	    }
	} else {
	    data.elevation = null;
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
	comma0 = true;
	try {
	    printer.newLine(writer);
	    writer.print("lat ");
	    writer.print(this.lat.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("long ");
	    writer.print(this._long.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.elevation != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("elevation ");
		printer.print(this.elevation, writer);
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
	return equalTo((Position3D)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((Position3D)that);
    }
    
    public boolean equalTo(Position3D that) {
	if (!this.lat.equalTo(that.lat))
	    return false;
	if (!this._long.equalTo(that._long))
	    return false;
	if (this.elevation != null && that.elevation != null) {
	    if (!this.elevation.equalTo(that.elevation))
		return false;
	}
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public Position3D clone() {
	Position3D copy = (Position3D)super.clone();
	copy.lat = lat.clone();
	copy._long = _long.clone();
	if (elevation != null) {
	    copy.elevation = elevation.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.lat != null ? this.lat.hashCode() : 0);
	hash = 41 * hash + (this._long != null ? this._long.hashCode() : 0);
	hash = 41 * hash + (this.elevation != null ? this.elevation.hashCode() : 0);
	return hash;
    }
} // End class definition for Position3D
