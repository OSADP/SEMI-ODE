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
 * Define the ASN1 Type Circle from ASN1 Module DSRC.
 * @see Sequence
 */

public class Circle extends Sequence {
    public Position3D center;
    public Raduis raduis;
    
    /**
     * The default constructor.
     */
    public Circle()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Circle(Position3D center, Raduis raduis)
    {
	setCenter(center);
	setRaduis(raduis);
    }
    
    
    // Methods for field "center"
    public Position3D getCenter()
    {
	return this.center;
    }
    
    public void setCenter(Position3D center)
    {
	this.center = center;
    }
    
    
    // Methods for field "raduis"
    public Raduis getRaduis()
    {
	return this.raduis;
    }
    
    public void setRaduis(Raduis raduis)
    {
	this.raduis = raduis;
    }
    
    
    
    /**
     * Define the ASN1 Type Raduis from ASN1 Module DSRC.
     * @see Choice
     */
    public static class Raduis extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Raduis()
	{
	}
	
	public static final  int  radiusSteps_chosen = 1;
	public static final  int  miles_chosen = 2;
	public static final  int  km_chosen = 3;
	
	// Methods for field "radiusSteps"
	public static Raduis createRaduisWithRadiusSteps(long radiusSteps)
	{
	    return createRaduisWithRadiusSteps(new INTEGER(radiusSteps));
	}
	
	public static Raduis createRaduisWithRadiusSteps(INTEGER radiusSteps)
	{
	    Raduis __object = new Raduis();

	    __object.setRadiusSteps(radiusSteps);
	    return __object;
	}
	
	public boolean hasRadiusSteps()
	{
	    return getChosenFlag() == radiusSteps_chosen;
	}
	
	public INTEGER getRadiusSteps()
	{
	    if (hasRadiusSteps())
		return (INTEGER)mChosenValue;
	    else
		return null;
	}
	
	public void setRadiusSteps(long radiusSteps)
	{
	    setRadiusSteps(new INTEGER(radiusSteps));
	}
	
	public void setRadiusSteps(INTEGER radiusSteps)
	{
	    setChosenValue(radiusSteps);
	    setChosenFlag(radiusSteps_chosen);
	}
	
	
	// Methods for field "miles"
	public static Raduis createRaduisWithMiles(long miles)
	{
	    return createRaduisWithMiles(new INTEGER(miles));
	}
	
	public static Raduis createRaduisWithMiles(INTEGER miles)
	{
	    Raduis __object = new Raduis();

	    __object.setMiles(miles);
	    return __object;
	}
	
	public boolean hasMiles()
	{
	    return getChosenFlag() == miles_chosen;
	}
	
	public INTEGER getMiles()
	{
	    if (hasMiles())
		return (INTEGER)mChosenValue;
	    else
		return null;
	}
	
	public void setMiles(long miles)
	{
	    setMiles(new INTEGER(miles));
	}
	
	public void setMiles(INTEGER miles)
	{
	    setChosenValue(miles);
	    setChosenFlag(miles_chosen);
	}
	
	
	// Methods for field "km"
	public static Raduis createRaduisWithKm(long km)
	{
	    return createRaduisWithKm(new INTEGER(km));
	}
	
	public static Raduis createRaduisWithKm(INTEGER km)
	{
	    Raduis __object = new Raduis();

	    __object.setKm(km);
	    return __object;
	}
	
	public boolean hasKm()
	{
	    return getChosenFlag() == km_chosen;
	}
	
	public INTEGER getKm()
	{
	    if (hasKm())
		return (INTEGER)mChosenValue;
	    else
		return null;
	}
	
	public void setKm(long km)
	{
	    setKm(new INTEGER(km));
	}
	
	public void setKm(INTEGER km)
	{
	    setChosenValue(km);
	    setChosenFlag(km_chosen);
	}
	
	
	/**
	 * Implements PER value encoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public static int encodeValue(PerCoder coder, OutputBitStream sink, Raduis data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int idx0 = data.mChosenFlag;
	    int nbits = 0;

	    if (idx0 < 1 || idx0 > 3)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._bad_choice, null, idx0);
	    nbits += coder.encodeConstrainedWholeNumber(idx0 - 1, 0, 2, sink);
	    switch (idx0) {
		case radiusSteps_chosen:
		    // Encode alternative 'radiusSteps'
		    try {
			INTEGER item1 = (INTEGER)data.mChosenValue;
			long temp1 = item1.longValue();

			if (temp1 < 0 || temp1 > 32767)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
			nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 32767, sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("radiusSteps", "INTEGER", 0);
			throw ee;
		    }
		    break;
		case miles_chosen:
		    // Encode alternative 'miles'
		    try {
			INTEGER item1 = (INTEGER)data.mChosenValue;
			long temp1 = item1.longValue();

			if (temp1 < 1 || temp1 > 2000)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
			nbits += coder.encodeConstrainedWholeNumber(temp1, 1, 2000, sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("miles", "INTEGER", 0);
			throw ee;
		    }
		    break;
		case km_chosen:
		    // Encode alternative 'km'
		    try {
			INTEGER item1 = (INTEGER)data.mChosenValue;
			long temp1 = item1.longValue();

			if (temp1 < 1 || temp1 > 5000)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
			nbits += coder.encodeConstrainedWholeNumber(temp1, 1, 5000, sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("km", "INTEGER", 0);
			throw ee;
		    }
		    break;
	    }

	    return nbits;
	}

	/**
	 * Implements PER value decoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public static Raduis decodeValue(PerCoder coder, InputBitStream source, Raduis data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    int idx0 = 0;

	    idx0 = (int)coder.decodeConstrainedWholeNumber(source, 0, 2) + 1;
	    if (idx0 < 1 || idx0 > 3)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._bad_choice, null, idx0);
	    data.mChosenFlag = idx0;
	    switch (idx0) {
		case radiusSteps_chosen:
		    // Decode alternative 'radiusSteps'
		    try {
			INTEGER item1 = new INTEGER();
			long temp1;

			// Decode alternative 'radiusSteps'
			temp1 = coder.decodeConstrainedWholeNumber(source, 0, 32767);
			if (temp1 > 32767)
			    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
			item1.setValue(temp1);
			data.mChosenValue = item1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("radiusSteps", "INTEGER", 0);
			throw de;
		    }
		    break;
		case miles_chosen:
		    // Decode alternative 'miles'
		    try {
			INTEGER item1 = new INTEGER();
			long temp1;

			// Decode alternative 'miles'
			temp1 = coder.decodeConstrainedWholeNumber(source, 1, 2000);
			if (temp1 > 2000)
			    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
			item1.setValue(temp1);
			data.mChosenValue = item1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("miles", "INTEGER", 0);
			throw de;
		    }
		    break;
		case km_chosen:
		    // Decode alternative 'km'
		    try {
			INTEGER item1 = new INTEGER();
			long temp1;

			// Decode alternative 'km'
			temp1 = coder.decodeConstrainedWholeNumber(source, 1, 5000);
			if (temp1 > 5000)
			    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
			item1.setValue(temp1);
			data.mChosenValue = item1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("km", "INTEGER", 0);
			throw de;
		    }
		    break;
	    }
	    return data;
	}

	/**
	 * Clone 'this' object.
	 */
	public Raduis clone() {
	    return (Raduis)super.clone();
	}

    } // End class definition for Raduis

    /**
     * Implements BER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encodeValue(BerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	int len0 = 0;
	Circle temp0 = this;

	try {
	    int len1;

	    switch (temp0.raduis.getChosenFlag()) {
	    case Raduis.radiusSteps_chosen:
		try {
		    len1 = sink.encodeLengthTag(coder.encodeInteger(((INTEGER)temp0.raduis.getChosenValue()), sink), 0x80);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("radiusSteps", "CHOICE", 0);
		    throw ee;
		}
		break;

	    case Raduis.miles_chosen:
		try {
		    len1 = sink.encodeLengthTag(coder.encodeInteger(((INTEGER)temp0.raduis.getChosenValue()), sink), 0x81);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("miles", "CHOICE", 0);
		    throw ee;
		}
		break;

	    case Raduis.km_chosen:
		try {
		    len1 = sink.encodeLengthTag(coder.encodeInteger(((INTEGER)temp0.raduis.getChosenValue()), sink), 0x82);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("km", "CHOICE", 0);
		    throw ee;
		}
		break;

	    default:
		throw new EncoderException(ExceptionDescriptor._bad_choice, null);
	    }
	    len0 += sink.encodeLengthTag(len1, 0xA1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("raduis", "CHOICE");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(temp0.center.encodeValue(coder, sink), 0xA0);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("center", "Position3D");
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements BER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public Circle decodeValue(BerCoder coder, DecoderInput source)
	    throws DecoderException
    {
	int total_len0 = source.mLength;
	int end_pos0 = (total_len0 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len0);
	int tag;

	tag = source.decodeTagLength();
	if (tag != 0xA0)
	    source.raiseTagMismatchException(tag);
	try {
	    this.center = new Position3D();
	    this.center.decodeValue(coder, source);
	} catch (Exception e) {
	    DecoderException ee = DecoderException.wrapException(e);
	    ee.appendFieldContext("center", "Position3D");
	    throw ee;
	}
	tag = source.decodeTagLength();
	if (tag != 0xA1)
	    source.raiseTagMismatchException(tag);
	try {
	    this.raduis = new Raduis();
	    tag = source.decodeTagLength();
	    switch (tag) {
	    case 0x80:
		try {
		    this.raduis.setChosenFlag(Raduis.radiusSteps_chosen);
		    this.raduis.setChosenValue(new INTEGER(source.decodeLong()));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendElementContext("radiusSteps", "INTEGER", 0);
		    throw ee;
		}
		break;

	    case 0x81:
		try {
		    this.raduis.setChosenFlag(Raduis.miles_chosen);
		    this.raduis.setChosenValue(new INTEGER(source.decodeLong()));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendElementContext("miles", "INTEGER", 0);
		    throw ee;
		}
		break;

	    case 0x82:
		try {
		    this.raduis.setChosenFlag(Raduis.km_chosen);
		    this.raduis.setChosenValue(new INTEGER(source.decodeLong()));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendElementContext("km", "INTEGER", 0);
		    throw ee;
		}
		break;

	    default:
		source.raiseUnknownFieldException(tag);
	    }
	} catch (Exception e) {
	    DecoderException ee = DecoderException.wrapException(e);
	    ee.appendFieldContext("raduis", "CHOICE");
	    throw ee;
	}
	if (source.position() != end_pos0) {
	    if (total_len0 >= 0)
		throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
	    tag = source.decodeTagLength();
	    if (tag != 0 || source.mLength != 0)
		throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);
	}

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
	Circle temp0 = this;

	try {
	    int len1;

	    switch (temp0.raduis.getChosenFlag()) {
	    case Raduis.radiusSteps_chosen:
		try {
		    len1 = sink.encodeLengthTag(coder.encodeInteger(((INTEGER)temp0.raduis.getChosenValue()), sink), 0x80);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("radiusSteps", "CHOICE", 0);
		    throw ee;
		}
		break;

	    case Raduis.miles_chosen:
		try {
		    len1 = sink.encodeLengthTag(coder.encodeInteger(((INTEGER)temp0.raduis.getChosenValue()), sink), 0x81);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("miles", "CHOICE", 0);
		    throw ee;
		}
		break;

	    case Raduis.km_chosen:
		try {
		    len1 = sink.encodeLengthTag(coder.encodeInteger(((INTEGER)temp0.raduis.getChosenValue()), sink), 0x82);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("km", "CHOICE", 0);
		    throw ee;
		}
		break;

	    default:
		throw new EncoderException(ExceptionDescriptor._bad_choice, null);
	    }
	    len0 += sink.encodeLengthTag(len1, 0xA1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("raduis", "CHOICE");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(temp0.center.encodeValue(coder, sink), 0xA0);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("center", "Position3D");
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, Circle data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	// Encode field 'center'
	try {
	    Position3D item1 = data.center;

	    nbits += (Position3D.encodeValue(coder, sink, item1));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("center", "Position3D");
	    throw ee;
	}
	// Encode field 'raduis'
	try {
	    Raduis item1 = data.raduis;

	    nbits += Raduis.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("raduis", "CHOICE");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static Circle decodeValue(PerCoder coder, InputBitStream source, Circle data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	// Decode field 'center'
	try {
	    if (data.center == null)
		data.center = new Position3D();
	    Position3D.decodeValue(coder, source, data.center);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("center", "Position3D");
	    throw de;
	}
	// Decode field 'raduis'
	try {
	    if (data.raduis == null)
		data.raduis = new Raduis();
	    Raduis.decodeValue(coder, source, data.raduis);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("raduis", "CHOICE");
	    throw de;
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
	    writer.print("center ");
	    this.center.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("raduis ");
	    {
		switch (this.raduis.getChosenFlag()) {
		case Raduis.radiusSteps_chosen:
		    try {
			writer.print("radiusSteps : ");
			writer.print(((INTEGER)this.raduis.getChosenValue()).longValue());
		    } catch (Exception e) {
			printer.reportError(e, null, writer);
		    }
		    break;

		case Raduis.miles_chosen:
		    try {
			writer.print("miles : ");
			writer.print(((INTEGER)this.raduis.getChosenValue()).longValue());
		    } catch (Exception e) {
			printer.reportError(e, null, writer);
		    }
		    break;

		case Raduis.km_chosen:
		    try {
			writer.print("km : ");
			writer.print(((INTEGER)this.raduis.getChosenValue()).longValue());
		    } catch (Exception e) {
			printer.reportError(e, null, writer);
		    }
		    break;

		default:
		    writer.print("-- unknown selection --");
		}
	    }
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
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
	return equalTo((Circle)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((Circle)that);
    }
    
    public boolean equalTo(Circle that) {
	if (!this.center.equalTo(that.center))
	    return false;
	if (!this.raduis.equalTo(that.raduis))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public Circle clone() {
	Circle copy = (Circle)super.clone();
	copy.center = center.clone();
	copy.raduis = raduis.clone();
	return copy;
    }

} // End class definition for Circle
