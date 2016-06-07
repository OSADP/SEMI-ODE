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
 * Define the ASN1 Type DDateTime from ASN1 Module DSRC.
 * @see Sequence
 */

public class DDateTime extends Sequence {
    public DYear year;
    public DMonth month;
    public DDay day;
    public DHour hour;
    public DMinute minute;
    public DSecond second;
    
    /**
     * The default constructor.
     */
    public DDateTime()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DDateTime(DYear year, DMonth month, DDay day, DHour hour, 
		    DMinute minute, DSecond second)
    {
	setYear(year);
	setMonth(month);
	setDay(day);
	setHour(hour);
	setMinute(minute);
	setSecond(second);
    }
    
    
    // Methods for field "year"
    public DYear getYear()
    {
	return this.year;
    }
    
    public void setYear(DYear year)
    {
	this.year = year;
    }
    
    public boolean hasYear()
    {
	return (year != null);
    }
    
    public void deleteYear()
    {
	year = null;
    }
    
    
    // Methods for field "month"
    public DMonth getMonth()
    {
	return this.month;
    }
    
    public void setMonth(DMonth month)
    {
	this.month = month;
    }
    
    public boolean hasMonth()
    {
	return (month != null);
    }
    
    public void deleteMonth()
    {
	month = null;
    }
    
    
    // Methods for field "day"
    public DDay getDay()
    {
	return this.day;
    }
    
    public void setDay(DDay day)
    {
	this.day = day;
    }
    
    public boolean hasDay()
    {
	return (day != null);
    }
    
    public void deleteDay()
    {
	day = null;
    }
    
    
    // Methods for field "hour"
    public DHour getHour()
    {
	return this.hour;
    }
    
    public void setHour(DHour hour)
    {
	this.hour = hour;
    }
    
    public boolean hasHour()
    {
	return (hour != null);
    }
    
    public void deleteHour()
    {
	hour = null;
    }
    
    
    // Methods for field "minute"
    public DMinute getMinute()
    {
	return this.minute;
    }
    
    public void setMinute(DMinute minute)
    {
	this.minute = minute;
    }
    
    public boolean hasMinute()
    {
	return (minute != null);
    }
    
    public void deleteMinute()
    {
	minute = null;
    }
    
    
    // Methods for field "second"
    public DSecond getSecond()
    {
	return this.second;
    }
    
    public void setSecond(DSecond second)
    {
	this.second = second;
    }
    
    public boolean hasSecond()
    {
	return (second != null);
    }
    
    public void deleteSecond()
    {
	second = null;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     */
    public static enum __Tag
    {
	__year("year"),
	__month("month"),
	__day("day"),
	__hour("hour"),
	__minute("minute"),
	__second("second"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(7);
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
	DDateTime temp0 = this;

	if (temp0.second != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.second, sink), 0x85);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("second", "DSecond");
		throw ee;
	    }
	}
	if (temp0.minute != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.minute, sink), 0x84);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("minute", "DMinute");
		throw ee;
	    }
	}
	if (temp0.hour != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.hour, sink), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("hour", "DHour");
		throw ee;
	    }
	}
	if (temp0.day != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.day, sink), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("day", "DDay");
		throw ee;
	    }
	}
	if (temp0.month != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.month, sink), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("month", "DMonth");
		throw ee;
	    }
	}
	if (temp0.year != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.year, sink), 0x80);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("year", "DYear");
		throw ee;
	    }
	}

	return len0;
    }

    /**
     * Implements BER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public DDateTime decodeValue(BerCoder coder, DecoderInput source)
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
	    if (tag == 0x80) {
		try {
		    this.year = new DYear(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("year", "DYear");
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
		    this.month = new DMonth(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("month", "DMonth");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x82) {
		try {
		    this.day = new DDay(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("day", "DDay");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x83) {
		try {
		    this.hour = new DHour(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("hour", "DHour");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x84) {
		try {
		    this.minute = new DMinute(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("minute", "DMinute");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x85) {
		try {
		    this.second = new DSecond(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("second", "DSecond");
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
	DDateTime temp0 = this;

	if (temp0.second != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.second, sink), 0x85);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("second", "DSecond");
		throw ee;
	    }
	}
	if (temp0.minute != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.minute, sink), 0x84);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("minute", "DMinute");
		throw ee;
	    }
	}
	if (temp0.hour != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.hour, sink), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("hour", "DHour");
		throw ee;
	    }
	}
	if (temp0.day != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.day, sink), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("day", "DDay");
		throw ee;
	    }
	}
	if (temp0.month != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.month, sink), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("month", "DMonth");
		throw ee;
	    }
	}
	if (temp0.year != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.year, sink), 0x80);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("year", "DYear");
		throw ee;
	    }
	}

	return len0;
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, DDateTime data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(data.year != null);
	sink.writeBit(data.month != null);
	sink.writeBit(data.day != null);
	sink.writeBit(data.hour != null);
	sink.writeBit(data.minute != null);
	sink.writeBit(data.second != null);
	nbits += 6;
	if (data.year != null) {
	    // Encode field 'year'
	    try {
		DYear item1 = data.year;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 9999)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 9999, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("year", "DYear");
		throw ee;
	    }
	}
	if (data.month != null) {
	    // Encode field 'month'
	    try {
		DMonth item1 = data.month;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 15)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 15, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("month", "DMonth");
		throw ee;
	    }
	}
	if (data.day != null) {
	    // Encode field 'day'
	    try {
		DDay item1 = data.day;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 31)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 31, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("day", "DDay");
		throw ee;
	    }
	}
	if (data.hour != null) {
	    // Encode field 'hour'
	    try {
		DHour item1 = data.hour;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 31)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 31, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("hour", "DHour");
		throw ee;
	    }
	}
	if (data.minute != null) {
	    // Encode field 'minute'
	    try {
		DMinute item1 = data.minute;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 63)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 63, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("minute", "DMinute");
		throw ee;
	    }
	}
	if (data.second != null) {
	    // Encode field 'second'
	    try {
		DSecond item1 = data.second;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 65535)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 65535, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("second", "DSecond");
		throw ee;
	    }
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static DDateTime decodeValue(PerCoder coder, InputBitStream source, DDateTime data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean has_year0 = source.readBit();
	boolean has_month0 = source.readBit();
	boolean has_day0 = source.readBit();
	boolean has_hour0 = source.readBit();
	boolean has_minute0 = source.readBit();
	boolean has_second0 = source.readBit();
    /** Decode root fields **/
	if (has_year0) {
	    // Decode field 'year'
	    try {
		long temp1;

		if (data.year == null)
		    data.year = new DYear();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 9999);
		if (temp1 > 9999)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.year.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("year", "DYear");
		throw de;
	    }
	} else {
	    data.year = null;
	}
	if (has_month0) {
	    // Decode field 'month'
	    try {
		long temp1;

		if (data.month == null)
		    data.month = new DMonth();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 15);
		if (temp1 > 15)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.month.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("month", "DMonth");
		throw de;
	    }
	} else {
	    data.month = null;
	}
	if (has_day0) {
	    // Decode field 'day'
	    try {
		long temp1;

		if (data.day == null)
		    data.day = new DDay();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 31);
		if (temp1 > 31)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.day.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("day", "DDay");
		throw de;
	    }
	} else {
	    data.day = null;
	}
	if (has_hour0) {
	    // Decode field 'hour'
	    try {
		long temp1;

		if (data.hour == null)
		    data.hour = new DHour();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 31);
		if (temp1 > 31)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.hour.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("hour", "DHour");
		throw de;
	    }
	} else {
	    data.hour = null;
	}
	if (has_minute0) {
	    // Decode field 'minute'
	    try {
		long temp1;

		if (data.minute == null)
		    data.minute = new DMinute();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 63);
		if (temp1 > 63)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.minute.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("minute", "DMinute");
		throw de;
	    }
	} else {
	    data.minute = null;
	}
	if (has_second0) {
	    // Decode field 'second'
	    try {
		long temp1;

		if (data.second == null)
		    data.second = new DSecond();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 65535);
		if (temp1 > 65535)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.second.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("second", "DSecond");
		throw de;
	    }
	} else {
	    data.second = null;
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
	String separator0 = null;

	sink.beginObject();
	// Encode field 'year'
	try {
	    DYear item1 = this.year;

	    if (item1 != null) {
		{
		    separator0 = ",";
		    sink.encodeKey("year");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "year");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("year", "DYear");
	    throw ee;
	}
	// Encode field 'month'
	try {
	    DMonth item1 = this.month;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("month");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "month");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("month", "DMonth");
	    throw ee;
	}
	// Encode field 'day'
	try {
	    DDay item1 = this.day;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("day");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "day");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("day", "DDay");
	    throw ee;
	}
	// Encode field 'hour'
	try {
	    DHour item1 = this.hour;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("hour");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "hour");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("hour", "DHour");
	    throw ee;
	}
	// Encode field 'minute'
	try {
	    DMinute item1 = this.minute;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("minute");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "minute");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("minute", "DMinute");
	    throw ee;
	}
	// Encode field 'second'
	try {
	    DSecond item1 = this.second;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("second");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "second");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("second", "DSecond");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public DDateTime decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[7];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		DDateTime.__Tag t_tag0 = DDateTime.__Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = DDateTime.__Tag._null_;
		switch (t_tag0) {
		    case __year:
		    // Decode field 'year'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[0])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.year == null)
				this.year = new DYear();
			    this.year.setValue(coder.decodeInteger(source));
			    present0[0] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("year", "DYear");
			throw de;
		    }
		    break;
		    case __month:
		    // Decode field 'month'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.month == null)
				this.month = new DMonth();
			    this.month.setValue(coder.decodeInteger(source));
			    present0[1] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("month", "DMonth");
			throw de;
		    }
		    break;
		    case __day:
		    // Decode field 'day'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.day == null)
				this.day = new DDay();
			    this.day.setValue(coder.decodeInteger(source));
			    present0[2] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("day", "DDay");
			throw de;
		    }
		    break;
		    case __hour:
		    // Decode field 'hour'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.hour == null)
				this.hour = new DHour();
			    this.hour.setValue(coder.decodeInteger(source));
			    present0[3] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("hour", "DHour");
			throw de;
		    }
		    break;
		    case __minute:
		    // Decode field 'minute'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[4])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.minute == null)
				this.minute = new DMinute();
			    this.minute.setValue(coder.decodeInteger(source));
			    present0[4] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("minute", "DMinute");
			throw de;
		    }
		    break;
		    case __second:
		    // Decode field 'second'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[5])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.second == null)
				this.second = new DSecond();
			    this.second.setValue(coder.decodeInteger(source));
			    present0[5] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("second", "DSecond");
			throw de;
		    }
		    break;
		    default:
			throw new DecoderException(ExceptionDescriptor._unknown_field, ": '" + tag0 + "'");
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    this.year = null;
	if (!present0[1])
	    this.month = null;
	if (!present0[2])
	    this.day = null;
	if (!present0[3])
	    this.hour = null;
	if (!present0[4])
	    this.minute = null;
	if (!present0[5])
	    this.second = null;
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
	if (this.year != null) {
	    try {
		comma0 = true;
		printer.newLine(writer);
		writer.print("year ");
		writer.print(this.year.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.month != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("month ");
		writer.print(this.month.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.day != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("day ");
		writer.print(this.day.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.hour != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("hour ");
		writer.print(this.hour.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.minute != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("minute ");
		writer.print(this.minute.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.second != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("second ");
		writer.print(this.second.longValue());
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
	return equalTo((DDateTime)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((DDateTime)that);
    }
    
    public boolean equalTo(DDateTime that) {
	if (this.year != null && that.year != null) {
	    if (!this.year.equalTo(that.year))
		return false;
	}
	if (this.month != null && that.month != null) {
	    if (!this.month.equalTo(that.month))
		return false;
	}
	if (this.day != null && that.day != null) {
	    if (!this.day.equalTo(that.day))
		return false;
	}
	if (this.hour != null && that.hour != null) {
	    if (!this.hour.equalTo(that.hour))
		return false;
	}
	if (this.minute != null && that.minute != null) {
	    if (!this.minute.equalTo(that.minute))
		return false;
	}
	if (this.second != null && that.second != null) {
	    if (!this.second.equalTo(that.second))
		return false;
	}
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public DDateTime clone() {
	DDateTime copy = (DDateTime)super.clone();
	if (year != null) {
	    copy.year = year.clone();
	}
	if (month != null) {
	    copy.month = month.clone();
	}
	if (day != null) {
	    copy.day = day.clone();
	}
	if (hour != null) {
	    copy.hour = hour.clone();
	}
	if (minute != null) {
	    copy.minute = minute.clone();
	}
	if (second != null) {
	    copy.second = second.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.year != null ? this.year.hashCode() : 0);
	hash = 41 * hash + (this.month != null ? this.month.hashCode() : 0);
	hash = 41 * hash + (this.day != null ? this.day.hashCode() : 0);
	hash = 41 * hash + (this.hour != null ? this.hour.hashCode() : 0);
	hash = 41 * hash + (this.minute != null ? this.minute.hashCode() : 0);
	hash = 41 * hash + (this.second != null ? this.second.hashCode() : 0);
	return hash;
    }
} // End class definition for DDateTime
