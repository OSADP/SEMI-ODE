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
 * Define the ASN1 Type VehicleSafetyExtension from ASN1 Module DSRC.
 * @see Sequence
 */

public class VehicleSafetyExtension extends Sequence {
    public EventFlags events;
    public PathHistory pathHistory;
    public PathPrediction pathPrediction;
    public RTCMPackage theRTCM;
    
    /**
     * The default constructor.
     */
    public VehicleSafetyExtension()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public VehicleSafetyExtension(EventFlags events, PathHistory pathHistory, 
		    PathPrediction pathPrediction, RTCMPackage theRTCM)
    {
	setEvents(events);
	setPathHistory(pathHistory);
	setPathPrediction(pathPrediction);
	setTheRTCM(theRTCM);
    }
    
    
    // Methods for field "events"
    public EventFlags getEvents()
    {
	return this.events;
    }
    
    public void setEvents(EventFlags events)
    {
	this.events = events;
    }
    
    public boolean hasEvents()
    {
	return (events != null);
    }
    
    public void deleteEvents()
    {
	events = null;
    }
    
    
    // Methods for field "pathHistory"
    public PathHistory getPathHistory()
    {
	return this.pathHistory;
    }
    
    public void setPathHistory(PathHistory pathHistory)
    {
	this.pathHistory = pathHistory;
    }
    
    public boolean hasPathHistory()
    {
	return (pathHistory != null);
    }
    
    public void deletePathHistory()
    {
	pathHistory = null;
    }
    
    
    // Methods for field "pathPrediction"
    public PathPrediction getPathPrediction()
    {
	return this.pathPrediction;
    }
    
    public void setPathPrediction(PathPrediction pathPrediction)
    {
	this.pathPrediction = pathPrediction;
    }
    
    public boolean hasPathPrediction()
    {
	return (pathPrediction != null);
    }
    
    public void deletePathPrediction()
    {
	pathPrediction = null;
    }
    
    
    // Methods for field "theRTCM"
    public RTCMPackage getTheRTCM()
    {
	return this.theRTCM;
    }
    
    public void setTheRTCM(RTCMPackage theRTCM)
    {
	this.theRTCM = theRTCM;
    }
    
    public boolean hasTheRTCM()
    {
	return (theRTCM != null);
    }
    
    public void deleteTheRTCM()
    {
	theRTCM = null;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     */
    public static enum __Tag
    {
	__events("events"),
	__pathHistory("pathHistory"),
	__pathPrediction("pathPrediction"),
	__theRTCM("theRTCM"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(5);
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
	VehicleSafetyExtension temp0 = this;

	if (temp0.theRTCM != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.theRTCM.encodeValue(coder, sink), 0xA3);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("theRTCM", "RTCMPackage");
		throw ee;
	    }
	}
	if (temp0.pathPrediction != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.pathPrediction.encodeValue(coder, sink), 0xA2);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("pathPrediction", "PathPrediction");
		throw ee;
	    }
	}
	if (temp0.pathHistory != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.pathHistory.encodeValue(coder, sink), 0xA1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("pathHistory", "PathHistory");
		throw ee;
	    }
	}
	if (temp0.events != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.events, sink), 0x80);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("events", "EventFlags");
		throw ee;
	    }
	}

	return len0;
    }

    /**
     * Implements BER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public VehicleSafetyExtension decodeValue(BerCoder coder, DecoderInput source)
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
		    this.events = new EventFlags(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("events", "EventFlags");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xA1) {
		try {
		    this.pathHistory = new PathHistory();
		    this.pathHistory.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("pathHistory", "PathHistory");
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
		    this.pathPrediction = new PathPrediction();
		    this.pathPrediction.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("pathPrediction", "PathPrediction");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xA3) {
		try {
		    this.theRTCM = new RTCMPackage();
		    this.theRTCM.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("theRTCM", "RTCMPackage");
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
		    ee.appendExtensionContext("VehicleSafetyExtension", -1);
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
	VehicleSafetyExtension temp0 = this;

	if (temp0.theRTCM != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.theRTCM.encodeValue(coder, sink), 0xA3);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("theRTCM", "RTCMPackage");
		throw ee;
	    }
	}
	if (temp0.pathPrediction != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.pathPrediction.encodeValue(coder, sink), 0xA2);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("pathPrediction", "PathPrediction");
		throw ee;
	    }
	}
	if (temp0.pathHistory != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.pathHistory.encodeValue(coder, sink), 0xA1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("pathHistory", "PathHistory");
		throw ee;
	    }
	}
	if (temp0.events != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.events, sink), 0x80);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("events", "EventFlags");
		throw ee;
	    }
	}

	return len0;
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, VehicleSafetyExtension data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.events != null);
	sink.writeBit(data.pathHistory != null);
	sink.writeBit(data.pathPrediction != null);
	sink.writeBit(data.theRTCM != null);
	nbits += 5;
	if (data.events != null) {
	    // Encode field 'events'
	    try {
		EventFlags item1 = data.events;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 8192)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 8192, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("events", "EventFlags");
		throw ee;
	    }
	}
	if (data.pathHistory != null) {
	    // Encode field 'pathHistory'
	    try {
		PathHistory item1 = data.pathHistory;

		nbits += PathHistory.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("pathHistory", "PathHistory");
		throw ee;
	    }
	}
	if (data.pathPrediction != null) {
	    // Encode field 'pathPrediction'
	    try {
		PathPrediction item1 = data.pathPrediction;

		nbits += PathPrediction.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("pathPrediction", "PathPrediction");
		throw ee;
	    }
	}
	if (data.theRTCM != null) {
	    // Encode field 'theRTCM'
	    try {
		RTCMPackage item1 = data.theRTCM;

		nbits += RTCMPackage.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("theRTCM", "RTCMPackage");
		throw ee;
	    }
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static VehicleSafetyExtension decodeValue(PerCoder coder, InputBitStream source, VehicleSafetyExtension data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_events0 = source.readBit();
	boolean has_pathHistory0 = source.readBit();
	boolean has_pathPrediction0 = source.readBit();
	boolean has_theRTCM0 = source.readBit();
    /** Decode root fields **/
	if (has_events0) {
	    // Decode field 'events'
	    try {
		long temp1;

		if (data.events == null)
		    data.events = new EventFlags();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 8192);
		if (temp1 > 8192)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.events.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("events", "EventFlags");
		throw de;
	    }
	} else {
	    data.events = null;
	}
	if (has_pathHistory0) {
	    // Decode field 'pathHistory'
	    try {
		if (data.pathHistory == null)
		    data.pathHistory = new PathHistory();
		data.pathHistory.decodeValue(coder, source, data.pathHistory);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("pathHistory", "PathHistory");
		throw de;
	    }
	} else {
	    data.pathHistory = null;
	}
	if (has_pathPrediction0) {
	    // Decode field 'pathPrediction'
	    try {
		if (data.pathPrediction == null)
		    data.pathPrediction = new PathPrediction();
		data.pathPrediction.decodeValue(coder, source, data.pathPrediction);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("pathPrediction", "PathPrediction");
		throw de;
	    }
	} else {
	    data.pathPrediction = null;
	}
	if (has_theRTCM0) {
	    // Decode field 'theRTCM'
	    try {
		if (data.theRTCM == null)
		    data.theRTCM = new RTCMPackage();
		data.theRTCM.decodeValue(coder, source, data.theRTCM);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("theRTCM", "RTCMPackage");
		throw de;
	    }
	} else {
	    data.theRTCM = null;
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
	String separator0 = null;

	sink.beginObject();
	// Encode field 'events'
	try {
	    EventFlags item1 = this.events;

	    if (item1 != null) {
		{
		    separator0 = ",";
		    sink.encodeKey("events");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "events");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("events", "EventFlags");
	    throw ee;
	}
	// Encode field 'pathHistory'
	try {
	    PathHistory item1 = this.pathHistory;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("pathHistory");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "pathHistory");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("pathHistory", "PathHistory");
	    throw ee;
	}
	// Encode field 'pathPrediction'
	try {
	    PathPrediction item1 = this.pathPrediction;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("pathPrediction");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "pathPrediction");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("pathPrediction", "PathPrediction");
	    throw ee;
	}
	// Encode field 'theRTCM'
	try {
	    RTCMPackage item1 = this.theRTCM;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("theRTCM");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "theRTCM");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("theRTCM", "RTCMPackage");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public VehicleSafetyExtension decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[5];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		VehicleSafetyExtension.__Tag t_tag0 = VehicleSafetyExtension.__Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = VehicleSafetyExtension.__Tag._null_;
		switch (t_tag0) {
		    case __events:
		    // Decode field 'events'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[0])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.events == null)
				this.events = new EventFlags();
			    this.events.setValue(coder.decodeInteger(source));
			    present0[0] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("events", "EventFlags");
			throw de;
		    }
		    break;
		    case __pathHistory:
		    // Decode field 'pathHistory'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.pathHistory == null)
				this.pathHistory = new PathHistory();
			    this.pathHistory.decodeValue(coder, source);
			    present0[1] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("pathHistory", "PathHistory");
			throw de;
		    }
		    break;
		    case __pathPrediction:
		    // Decode field 'pathPrediction'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.pathPrediction == null)
				this.pathPrediction = new PathPrediction();
			    this.pathPrediction.decodeValue(coder, source);
			    present0[2] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("pathPrediction", "PathPrediction");
			throw de;
		    }
		    break;
		    case __theRTCM:
		    // Decode field 'theRTCM'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.theRTCM == null)
				this.theRTCM = new RTCMPackage();
			    this.theRTCM.decodeValue(coder, source);
			    present0[3] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("theRTCM", "RTCMPackage");
			throw de;
		    }
		    break;
		    default:
			coder.skipValue(source);
			break;
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    this.events = null;
	if (!present0[1])
	    this.pathHistory = null;
	if (!present0[2])
	    this.pathPrediction = null;
	if (!present0[3])
	    this.theRTCM = null;
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
	if (this.events != null) {
	    try {
		comma0 = true;
		printer.newLine(writer);
		writer.print("events ");
		writer.print(this.events.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.pathHistory != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("pathHistory ");
		this.pathHistory.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.pathPrediction != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("pathPrediction ");
		this.pathPrediction.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.theRTCM != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("theRTCM ");
		this.theRTCM.printValue(printer, writer);
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
	return equalTo((VehicleSafetyExtension)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((VehicleSafetyExtension)that);
    }
    
    public boolean equalTo(VehicleSafetyExtension that) {
	if (this.events != null && that.events != null) {
	    if (!this.events.equalTo(that.events))
		return false;
	}
	if (this.pathHistory != null && that.pathHistory != null) {
	    if (!this.pathHistory.equalTo(that.pathHistory))
		return false;
	}
	if (this.pathPrediction != null && that.pathPrediction != null) {
	    if (!this.pathPrediction.equalTo(that.pathPrediction))
		return false;
	}
	if (this.theRTCM != null && that.theRTCM != null) {
	    if (!this.theRTCM.equalTo(that.theRTCM))
		return false;
	}
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public VehicleSafetyExtension clone() {
	VehicleSafetyExtension copy = (VehicleSafetyExtension)super.clone();
	if (events != null) {
	    copy.events = events.clone();
	}
	if (pathHistory != null) {
	    copy.pathHistory = pathHistory.clone();
	}
	if (pathPrediction != null) {
	    copy.pathPrediction = pathPrediction.clone();
	}
	if (theRTCM != null) {
	    copy.theRTCM = theRTCM.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.events != null ? this.events.hashCode() : 0);
	hash = 41 * hash + (this.pathHistory != null ? this.pathHistory.hashCode() : 0);
	hash = 41 * hash + (this.pathPrediction != null ? this.pathPrediction.hashCode() : 0);
	hash = 41 * hash + (this.theRTCM != null ? this.theRTCM.hashCode() : 0);
	return hash;
    }
} // End class definition for VehicleSafetyExtension
