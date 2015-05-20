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
 * Define the ASN1 Type ValidRegion from ASN1 Module DSRC.
 * @see Sequence
 */

public class ValidRegion extends Sequence {
    public HeadingSlice direction;
    public Extent extent;
    public Area area;
    
    /**
     * The default constructor.
     */
    public ValidRegion()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ValidRegion(HeadingSlice direction, Extent extent, Area area)
    {
	setDirection(direction);
	setExtent(extent);
	setArea(area);
    }
    
    /**
     * Construct with required components.
     */
    public ValidRegion(HeadingSlice direction, Area area)
    {
	setDirection(direction);
	setArea(area);
    }
    
    
    // Methods for field "direction"
    public HeadingSlice getDirection()
    {
	return this.direction;
    }
    
    public void setDirection(HeadingSlice direction)
    {
	this.direction = direction;
    }
    
    
    // Methods for field "extent"
    public Extent getExtent()
    {
	return this.extent;
    }
    
    public void setExtent(Extent extent)
    {
	this.extent = extent;
    }
    
    public boolean hasExtent()
    {
	return (extent != null);
    }
    
    public void deleteExtent()
    {
	extent = null;
    }
    
    
    // Methods for field "area"
    public Area getArea()
    {
	return this.area;
    }
    
    public void setArea(Area area)
    {
	this.area = area;
    }
    
    
    
    /**
     * Define the ASN1 Type Area from ASN1 Module DSRC.
     * @see Choice
     */
    public static class Area extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Area()
	{
	}
	
	public static final  int  shapePointSet_chosen = 1;
	public static final  int  circle_chosen = 2;
	public static final  int  regionPointSet_chosen = 3;
	
	// Methods for field "shapePointSet"
	public static Area createAreaWithShapePointSet(ShapePointSet shapePointSet)
	{
	    Area __object = new Area();

	    __object.setShapePointSet(shapePointSet);
	    return __object;
	}
	
	public boolean hasShapePointSet()
	{
	    return getChosenFlag() == shapePointSet_chosen;
	}
	
	public ShapePointSet getShapePointSet()
	{
	    if (hasShapePointSet())
		return (ShapePointSet)mChosenValue;
	    else
		return null;
	}
	
	public void setShapePointSet(ShapePointSet shapePointSet)
	{
	    setChosenValue(shapePointSet);
	    setChosenFlag(shapePointSet_chosen);
	}
	
	
	// Methods for field "circle"
	public static Area createAreaWithCircle(Circle circle)
	{
	    Area __object = new Area();

	    __object.setCircle(circle);
	    return __object;
	}
	
	public boolean hasCircle()
	{
	    return getChosenFlag() == circle_chosen;
	}
	
	public Circle getCircle()
	{
	    if (hasCircle())
		return (Circle)mChosenValue;
	    else
		return null;
	}
	
	public void setCircle(Circle circle)
	{
	    setChosenValue(circle);
	    setChosenFlag(circle_chosen);
	}
	
	
	// Methods for field "regionPointSet"
	public static Area createAreaWithRegionPointSet(RegionPointSet regionPointSet)
	{
	    Area __object = new Area();

	    __object.setRegionPointSet(regionPointSet);
	    return __object;
	}
	
	public boolean hasRegionPointSet()
	{
	    return getChosenFlag() == regionPointSet_chosen;
	}
	
	public RegionPointSet getRegionPointSet()
	{
	    if (hasRegionPointSet())
		return (RegionPointSet)mChosenValue;
	    else
		return null;
	}
	
	public void setRegionPointSet(RegionPointSet regionPointSet)
	{
	    setChosenValue(regionPointSet);
	    setChosenFlag(regionPointSet_chosen);
	}
	
	
	/**
	 * Implements PER value encoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public static int encodeValue(PerCoder coder, OutputBitStream sink, Area data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int idx0 = data.mChosenFlag;
	    int nbits = 0;

	    if (idx0 < 1 || idx0 > 3)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._bad_choice, null, idx0);
	    nbits += coder.encodeConstrainedWholeNumber(idx0 - 1, 0, 2, sink);
	    switch (idx0) {
		case shapePointSet_chosen:
		    // Encode alternative 'shapePointSet'
		    try {
			ShapePointSet item1 = (ShapePointSet)data.mChosenValue;

			nbits += ShapePointSet.encodeValue(coder, sink, item1);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("shapePointSet", "ShapePointSet", 0);
			throw ee;
		    }
		    break;
		case circle_chosen:
		    // Encode alternative 'circle'
		    try {
			Circle item1 = (Circle)data.mChosenValue;

			nbits += Circle.encodeValue(coder, sink, item1);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("circle", "Circle", 0);
			throw ee;
		    }
		    break;
		case regionPointSet_chosen:
		    // Encode alternative 'regionPointSet'
		    try {
			RegionPointSet item1 = (RegionPointSet)data.mChosenValue;

			nbits += RegionPointSet.encodeValue(coder, sink, item1);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("regionPointSet", "RegionPointSet", 0);
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
	public static Area decodeValue(PerCoder coder, InputBitStream source, Area data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    int idx0 = 0;

	    idx0 = (int)coder.decodeConstrainedWholeNumber(source, 0, 2) + 1;
	    if (idx0 < 1 || idx0 > 3)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._bad_choice, null, idx0);
	    data.mChosenFlag = idx0;
	    switch (idx0) {
		case shapePointSet_chosen:
		    // Decode alternative 'shapePointSet'
		    try {
			ShapePointSet item1 = new ShapePointSet();

			// Decode alternative 'shapePointSet'
			data.mChosenValue = item1;
			ShapePointSet.decodeValue(coder, source, item1);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("shapePointSet", "ShapePointSet", 0);
			throw de;
		    }
		    break;
		case circle_chosen:
		    // Decode alternative 'circle'
		    try {
			Circle item1 = new Circle();

			// Decode alternative 'circle'
			data.mChosenValue = item1;
			Circle.decodeValue(coder, source, item1);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("circle", "Circle", 0);
			throw de;
		    }
		    break;
		case regionPointSet_chosen:
		    // Decode alternative 'regionPointSet'
		    try {
			RegionPointSet item1 = new RegionPointSet();

			// Decode alternative 'regionPointSet'
			data.mChosenValue = item1;
			RegionPointSet.decodeValue(coder, source, item1);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("regionPointSet", "RegionPointSet", 0);
			throw de;
		    }
		    break;
	    }
	    return data;
	}

	/**
	 * Clone 'this' object.
	 */
	public Area clone() {
	    return (Area)super.clone();
	}

    } // End class definition for Area

    /**
     * Implements BER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encodeValue(BerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	int len0 = 0;
	ValidRegion temp0 = this;

	try {
	    int len1;

	    switch (temp0.area.getChosenFlag()) {
	    case Area.shapePointSet_chosen:
		try {
		    len1 = sink.encodeLengthTag(((ShapePointSet)temp0.area.getChosenValue()).encodeValue(coder, sink), 0xA0);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("shapePointSet", "CHOICE", 0);
		    throw ee;
		}
		break;

	    case Area.circle_chosen:
		try {
		    len1 = sink.encodeLengthTag(((Circle)temp0.area.getChosenValue()).encodeValue(coder, sink), 0xA1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("circle", "CHOICE", 0);
		    throw ee;
		}
		break;

	    case Area.regionPointSet_chosen:
		try {
		    len1 = sink.encodeLengthTag(((RegionPointSet)temp0.area.getChosenValue()).encodeValue(coder, sink), 0xA2);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("regionPointSet", "CHOICE", 0);
		    throw ee;
		}
		break;

	    default:
		throw new EncoderException(ExceptionDescriptor._bad_choice, null);
	    }
	    len0 += sink.encodeLengthTag(len1, 0xA2);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("area", "CHOICE");
	    throw ee;
	}
	if (temp0.extent != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.extent, sink), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("extent", "Extent");
		throw ee;
	    }
	}
	try {
	    len0 += sink.encodeLengthTag(sink.write(temp0.direction.byteArrayValue()), 0x80);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("direction", "HeadingSlice");
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements BER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public ValidRegion decodeValue(BerCoder coder, DecoderInput source)
	    throws DecoderException
    {
	int total_len0 = source.mLength;
	int end_pos0 = (total_len0 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len0);
	int tag;

	tag = source.decodeTagLength();
	if (tag != 0x80 && tag != 0xA0)
	    source.raiseTagMismatchException(tag);
	try {
	    this.direction = new HeadingSlice(coder.decodeOctetString(source));
	} catch (Exception e) {
	    DecoderException ee = DecoderException.wrapException(e);
	    ee.appendFieldContext("direction", "HeadingSlice");
	    throw ee;
	}
	tag = source.decodeTagLength();
	if (tag == 0x81) {
	    try {
		int idx1 = Extent.indexOfValue(source.decodeInt());
		if (idx1 < 0)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
		this.extent = Extent.cNamedNumbers[idx1];
	    } catch (Exception e) {
		DecoderException ee = DecoderException.wrapException(e);
		ee.appendFieldContext("extent", "Extent");
		throw ee;
	    }
	    tag = source.decodeTagLength();
	}
	if (tag != 0xA2)
	    source.raiseTagMismatchException(tag);
	try {
	    this.area = new Area();
	    tag = source.decodeTagLength();
	    switch (tag) {
	    case 0xA0:
		try {
		    this.area.setChosenFlag(Area.shapePointSet_chosen);
		    this.area.setChosenValue(new ShapePointSet());
		    ((ShapePointSet)this.area.getChosenValue()).decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendElementContext("shapePointSet", "ShapePointSet", 0);
		    throw ee;
		}
		break;

	    case 0xA1:
		try {
		    this.area.setChosenFlag(Area.circle_chosen);
		    this.area.setChosenValue(new Circle());
		    ((Circle)this.area.getChosenValue()).decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendElementContext("circle", "Circle", 0);
		    throw ee;
		}
		break;

	    case 0xA2:
		try {
		    this.area.setChosenFlag(Area.regionPointSet_chosen);
		    this.area.setChosenValue(new RegionPointSet());
		    ((RegionPointSet)this.area.getChosenValue()).decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendElementContext("regionPointSet", "RegionPointSet", 0);
		    throw ee;
		}
		break;

	    default:
		source.raiseUnknownFieldException(tag);
	    }
	} catch (Exception e) {
	    DecoderException ee = DecoderException.wrapException(e);
	    ee.appendFieldContext("area", "CHOICE");
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
	ValidRegion temp0 = this;

	try {
	    int len1;

	    switch (temp0.area.getChosenFlag()) {
	    case Area.shapePointSet_chosen:
		try {
		    len1 = sink.encodeLengthTag(((ShapePointSet)temp0.area.getChosenValue()).encodeValue(coder, sink), 0xA0);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("shapePointSet", "CHOICE", 0);
		    throw ee;
		}
		break;

	    case Area.circle_chosen:
		try {
		    len1 = sink.encodeLengthTag(((Circle)temp0.area.getChosenValue()).encodeValue(coder, sink), 0xA1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("circle", "CHOICE", 0);
		    throw ee;
		}
		break;

	    case Area.regionPointSet_chosen:
		try {
		    len1 = sink.encodeLengthTag(((RegionPointSet)temp0.area.getChosenValue()).encodeValue(coder, sink), 0xA2);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("regionPointSet", "CHOICE", 0);
		    throw ee;
		}
		break;

	    default:
		throw new EncoderException(ExceptionDescriptor._bad_choice, null);
	    }
	    len0 += sink.encodeLengthTag(len1, 0xA2);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("area", "CHOICE");
	    throw ee;
	}
	if (temp0.extent != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.extent, sink), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("extent", "Extent");
		throw ee;
	    }
	}
	try {
	    len0 += sink.encodeLengthTag(sink.write(temp0.direction.byteArrayValue()), 0x80);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("direction", "HeadingSlice");
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, ValidRegion data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	boolean has_extent0 = data.extent != null;
	sink.writeBit(has_extent0); ++nbits;
	// Encode field 'direction'
	try {
	    HeadingSlice item1 = data.direction;
	    int len1 = item1.getSize();

	    if (len1 != 2)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 2, 2, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("direction", "HeadingSlice");
	    throw ee;
	}
	if (has_extent0) {
	    // Encode field 'extent'
	    try {
		Extent item1 = data.extent;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 11, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("extent", "Extent");
		throw ee;
	    }
	}
	// Encode field 'area'
	try {
	    Area item1 = data.area;

	    nbits += Area.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("area", "CHOICE");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static ValidRegion decodeValue(PerCoder coder, InputBitStream source, ValidRegion data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean has_extent0 = source.readBit();
	// Decode field 'direction'
	try {
	    data.direction = new HeadingSlice(com.oss.coders.per.PerOctets.decode(coder, source, 2, 2));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("direction", "HeadingSlice");
	    throw de;
	}
	if (has_extent0) {
	    // Decode field 'extent'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 11);
		if (idx1 < 0 || idx1 > 11)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.extent = Extent.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("extent", "Extent");
		throw de;
	    }
	} else {
	    data.extent = null;
	}
	// Decode field 'area'
	try {
	    if (data.area == null)
		data.area = new Area();
	    Area.decodeValue(coder, source, data.area);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("area", "CHOICE");
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
	    writer.print("direction ");
	    printer.print(this.direction, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.extent != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("extent ");
		printer.print(this.extent, writer, this.extent.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("area ");
	    {
		switch (this.area.getChosenFlag()) {
		case Area.shapePointSet_chosen:
		    try {
			writer.print("shapePointSet : ");
			((ShapePointSet)this.area.getChosenValue()).printValue(printer, writer);
		    } catch (Exception e) {
			printer.reportError(e, null, writer);
		    }
		    break;

		case Area.circle_chosen:
		    try {
			writer.print("circle : ");
			((Circle)this.area.getChosenValue()).printValue(printer, writer);
		    } catch (Exception e) {
			printer.reportError(e, null, writer);
		    }
		    break;

		case Area.regionPointSet_chosen:
		    try {
			writer.print("regionPointSet : ");
			((RegionPointSet)this.area.getChosenValue()).printValue(printer, writer);
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
	return equalTo((ValidRegion)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((ValidRegion)that);
    }
    
    public boolean equalTo(ValidRegion that) {
	if (!this.direction.equalTo(that.direction))
	    return false;
	if (this.extent != null && that.extent != null) {
	    if (!this.extent.equalTo(that.extent))
		return false;
	}
	if (!this.area.equalTo(that.area))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public ValidRegion clone() {
	ValidRegion copy = (ValidRegion)super.clone();
	copy.direction = direction.clone();
	if (extent != null) {
	    copy.extent = extent.clone();
	}
	copy.area = area.clone();
	return copy;
    }

} // End class definition for ValidRegion
