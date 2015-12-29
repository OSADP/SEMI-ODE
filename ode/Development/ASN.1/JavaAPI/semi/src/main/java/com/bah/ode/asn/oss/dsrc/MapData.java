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
 * Define the ASN1 Type MapData from ASN1 Module DSRC.
 * @see Sequence
 */

public class MapData extends Sequence {
    public DSRCmsgID msgID;
    public MsgCount msgCnt;
    public DescriptiveName name;
    public LayerType layerType;
    public LayerID layerID;
    public Intersections_ intersections;
    public DataParameters dataParameters;
    public MsgCRC crc;
    
    /**
     * The default constructor.
     */
    public MapData()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MapData(DSRCmsgID msgID, MsgCount msgCnt, DescriptiveName name, 
		    LayerType layerType, LayerID layerID, 
		    Intersections_ intersections, 
		    DataParameters dataParameters, MsgCRC crc)
    {
	setMsgID(msgID);
	setMsgCnt(msgCnt);
	setName(name);
	setLayerType(layerType);
	setLayerID(layerID);
	setIntersections(intersections);
	setDataParameters(dataParameters);
	setCrc(crc);
    }
    
    /**
     * Construct with required components.
     */
    public MapData(DSRCmsgID msgID, MsgCount msgCnt, MsgCRC crc)
    {
	setMsgID(msgID);
	setMsgCnt(msgCnt);
	setCrc(crc);
    }
    
    
    // Methods for field "msgID"
    public DSRCmsgID getMsgID()
    {
	return this.msgID;
    }
    
    public void setMsgID(DSRCmsgID msgID)
    {
	this.msgID = msgID;
    }
    
    
    // Methods for field "msgCnt"
    public MsgCount getMsgCnt()
    {
	return this.msgCnt;
    }
    
    public void setMsgCnt(MsgCount msgCnt)
    {
	this.msgCnt = msgCnt;
    }
    
    
    // Methods for field "name"
    public DescriptiveName getName()
    {
	return this.name;
    }
    
    public void setName(DescriptiveName name)
    {
	this.name = name;
    }
    
    public boolean hasName()
    {
	return (name != null);
    }
    
    public void deleteName()
    {
	name = null;
    }
    
    
    // Methods for field "layerType"
    public LayerType getLayerType()
    {
	return this.layerType;
    }
    
    public void setLayerType(LayerType layerType)
    {
	this.layerType = layerType;
    }
    
    public boolean hasLayerType()
    {
	return (layerType != null);
    }
    
    public void deleteLayerType()
    {
	layerType = null;
    }
    
    
    // Methods for field "layerID"
    public LayerID getLayerID()
    {
	return this.layerID;
    }
    
    public void setLayerID(LayerID layerID)
    {
	this.layerID = layerID;
    }
    
    public boolean hasLayerID()
    {
	return (layerID != null);
    }
    
    public void deleteLayerID()
    {
	layerID = null;
    }
    
    
    // Methods for field "intersections"
    public Intersections_ getIntersections()
    {
	return this.intersections;
    }
    
    public void setIntersections(Intersections_ intersections)
    {
	this.intersections = intersections;
    }
    
    public boolean hasIntersections()
    {
	return (intersections != null);
    }
    
    public void deleteIntersections()
    {
	intersections = null;
    }
    
    
    
    /**
     * Define the ASN1 Type Intersections_ from ASN1 Module DSRC.
     * @see SequenceOf
     */
    public static class Intersections_ extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public Intersections_()
	{
	    this.elements = new java.util.ArrayList<Intersection_>();
	}
	
	
	/**
	 * Construct from an array of components.
	 */
	public java.util.ArrayList<Intersection_> elements;

	public Intersections_(Intersection_[] elements)
	{
	    this.elements = new java.util.ArrayList<Intersection_>(java.util.Arrays.asList(elements));
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(Intersection_ element)
	{
	    elements.add(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(Intersection_ element, int atIndex)
	{
	    elements.set(atIndex, element);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized Intersection_ get(int atIndex)
	{
	    return (Intersection_)elements.get(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(Intersection_ element, int atIndex)
	{
	    elements.add(atIndex, element);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(Intersection_ element)
	{
	    elements.remove(element);
	}
	
	/**
	 * Remove an Element at the specified position from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(int index)
	{
	    elements.remove(index);
	}
	
	/**
	 * Implements PER value encoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public static int encodeValue(PerCoder coder, OutputBitStream sink, Intersections_ data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int total_len0 = data.elements.size();
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;
	    int nbits = 0;

	    if (total_len0 < 1 || total_len0 > 32)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + total_len0);
	    nbits += coder.encodeLengthDeterminant(total_len0, 1, 32, sink);
	    moreFragments0 = coder.moreFragments();
	    fragmentLength0 = (moreFragments0 ? coder.fragmentLength() : total_len0);
	    while (total_len0 > 0) {
		try {
		    Intersection_ item1 = data.elements.get(idx0);

		    nbits += Intersection_.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "Intersection", idx0);
		    throw ee;
		}
		--total_len0; --fragmentLength0; ++idx0;
		if (fragmentLength0 == 0) {
		    if (moreFragments0) {
			nbits += coder.encodeLengthDeterminant(total_len0, sink);
			moreFragments0 = coder.moreFragments();
			fragmentLength0 = (moreFragments0 ? coder.fragmentLength() : total_len0);
		    }
		}
	    }

	    return nbits;
	}

	/**
	 * Implements PER value decoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public static Intersections_ decodeValue(PerCoder coder, InputBitStream source, Intersections_ data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    int total_len0 = 0;
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;

	    idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, 1, 32);
	    if (fragmentLength0 > 32)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + fragmentLength0);
	    moreFragments0 = coder.moreFragments();
	    if (data.elements != null)
		data.elements.clear();
	    else
		data.elements = new java.util.ArrayList<Intersection_>(fragmentLength0);
	    while (idx0 > 0) {
		try {
		    Intersection_ item1 = new Intersection_();

		    data.elements.add(item1);
		    item1.decodeValue(coder, source, item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "Intersection", total_len0);
		    throw de;
		}
		--idx0; ++total_len0;
		if (idx0 == 0) {
		    if (moreFragments0) {
			idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, fragmentLength0);
			moreFragments0 = coder.moreFragments();
			if ((total_len0 + fragmentLength0) > 32)
			    throw new DecoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + (total_len0 + fragmentLength0));
		    }
		}
	    }
	    if (total_len0 < 1)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + total_len0);
	    return data;
	}

	/**
	 * Implements JSON value encoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public void encodeValue(JsonCoder coder, JsonWriter sink)
		throws IOException, EncoderException
	{
	    int total_len0 = this.elements.size();
	    int idx0 = 0;

	    sink.beginArray();
	    if (total_len0 > 0) {
		while (true) {
		    try {
			Intersection_ item1 = this.elements.get(idx0);

			item1.encodeValue(coder, sink);
		    
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "Intersection", idx0);
		    throw ee;
		}
		idx0++;
		if (idx0 == total_len0) break;
		sink.writeSeparator();
	    }
	}
	sink.endArray();

    }

	/**
	 * Implements JSON value decoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public Intersections_ decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	int total_len0 = 0;
	int idx0 = 0;

	if (this.elements != null)
	    this.elements.clear();
	else
	    this.elements = new java.util.ArrayList<Intersection_>(total_len0);
	coder.decodeArray(source);
	if (coder.hasMoreElements(source, true))
	    do {
		try {
		    Intersection_ item1 = new Intersection_();

		    this.elements.add(item1);
		    item1.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "Intersection", idx0);
		    throw de;
		}
		++idx0;
	    } while (coder.hasMoreElements(source, false));
	    return this;
	}

	/**
	 * Compare 'this' object to another object to see if their contents are the same.
	 */
	public boolean abstractEqualTo(AbstractData that)
	{
	    return equalTo((Intersections_)that);
	}
	
	public boolean equalTo(SequenceOf that)
	{
	    return equalTo((Intersections_)that);
	}
	
	public boolean equalTo(Intersections_ that) {
	    int size = this.getSize();
	    if (size != that.getSize())
		return false;
	    for (int i = 0; i < size; i++) {
		if (!this.get(i).equalTo(that.get(i)))
		    return false;
	    }
	    return true;
	}

	public int getSize()
	{
	    return elements.size();
	}
	
	public void removeAllElements() {
	    if (elements != null)
		elements.clear();
	}

	/**
	 * Clone 'this' object.
	 */
	public Intersections_ clone() {
	    Intersections_ copy = (Intersections_)super.clone();
	    copy.elements = new java.util.ArrayList<Intersection_>(elements.size());
	    for (Intersection_ element : elements) {
		copy.elements.add(element.clone());
	    }
	    return copy;
	}

	/**
	 * Returns a hash code for 'this' object.
	 */
	public int hashCode() {
	    int hash = 7;
	    hash = 79 * hash + (this.elements != null ? this.elements.hashCode() : 0);
	    return hash;
	}
    } // End class definition for Intersections_

    // Methods for field "dataParameters"
    public DataParameters getDataParameters()
    {
	return this.dataParameters;
    }
    
    public void setDataParameters(DataParameters dataParameters)
    {
	this.dataParameters = dataParameters;
    }
    
    public boolean hasDataParameters()
    {
	return (dataParameters != null);
    }
    
    public void deleteDataParameters()
    {
	dataParameters = null;
    }
    
    
    // Methods for field "crc"
    public MsgCRC getCrc()
    {
	return this.crc;
    }
    
    public void setCrc(MsgCRC crc)
    {
	this.crc = crc;
    }
    
    
    /**
     * Effective permitted alphabet (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public static final EPAInfo _cEPAInfo_name = 
	com.bah.ode.asn.oss.dsrc.DescriptiveName._cEPAInfo_;
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     */
    public static enum __Tag
    {
	__msgID("msgID"),
	__msgCnt("msgCnt"),
	__name("name"),
	__layerType("layerType"),
	__layerID("layerID"),
	__intersections("intersections"),
	__dataParameters("dataParameters"),
	__crc("crc"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(9);
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, MapData data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.name != null);
	sink.writeBit(data.layerType != null);
	sink.writeBit(data.layerID != null);
	sink.writeBit(data.intersections != null);
	sink.writeBit(data.dataParameters != null);
	nbits += 6;
	// Encode field 'msgID'
	try {
	    DSRCmsgID item1 = data.msgID;
	    int idx1;
	    boolean extroot1 = true;

	    if (item1.isUnknownEnumerator()) {
		throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
	    } else {
		idx1 = item1.indexOf();
		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		extroot1 = idx1 < 17;
	    }
	    sink.writeBit(!extroot1); ++nbits;
	    if (extroot1)
		nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 16, sink);
	    else
		nbits += coder.encodeNormallySmallNumber(idx1 - 17, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msgID", "DSRCmsgID");
	    throw ee;
	}
	// Encode field 'msgCnt'
	try {
	    MsgCount item1 = data.msgCnt;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 127)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 127, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msgCnt", "MsgCount");
	    throw ee;
	}
	if (data.name != null) {
	    // Encode field 'name'
	    try {
		DescriptiveName item1 = data.name;
		int len1 = item1.getSize();

		if (len1 < 1 || len1 > 63)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerKMCString.encode(coder, item1.stringValue(), 1, 63, MapData._cEPAInfo_name, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("name", "DescriptiveName");
		throw ee;
	    }
	}
	if (data.layerType != null) {
	    // Encode field 'layerType'
	    try {
		LayerType item1 = data.layerType;
		int idx1;
		boolean extroot1 = true;

		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else {
		    idx1 = item1.indexOf();
		    if (idx1 < 0)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    extroot1 = idx1 < 8;
		}
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 7, sink);
		else
		    nbits += coder.encodeNormallySmallNumber(idx1 - 8, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("layerType", "LayerType");
		throw ee;
	    }
	}
	if (data.layerID != null) {
	    // Encode field 'layerID'
	    try {
		LayerID item1 = data.layerID;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 100)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 100, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("layerID", "LayerID");
		throw ee;
	    }
	}
	if (data.intersections != null) {
	    // Encode field 'intersections'
	    try {
		Intersections_ item1 = data.intersections;

		nbits += Intersections_.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("intersections", "SEQUENCE OF");
		throw ee;
	    }
	}
	if (data.dataParameters != null) {
	    // Encode field 'dataParameters'
	    try {
		DataParameters item1 = data.dataParameters;

		nbits += DataParameters.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("dataParameters", "DataParameters");
		throw ee;
	    }
	}
	// Encode field 'crc'
	try {
	    MsgCRC item1 = data.crc;
	    int len1 = item1.getSize();

	    if (len1 != 2)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 2, 2, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("crc", "MsgCRC");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static MapData decodeValue(PerCoder coder, InputBitStream source, MapData data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_name0 = source.readBit();
	boolean has_layerType0 = source.readBit();
	boolean has_layerID0 = source.readBit();
	boolean has_intersections0 = source.readBit();
	boolean has_dataParameters0 = source.readBit();
    /** Decode root fields **/
	// Decode field 'msgID'
	try {
	    int idx1;
	    DSRCmsgID temp1;
	    boolean extroot1 = !source.readBit();

	    if (extroot1) {
		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 16);
		if (idx1 < 0 || idx1 > 16)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		temp1 = DSRCmsgID.valueAt(idx1);
	    } else {
		idx1 = 17 + (int)coder.decodeNormallySmallNumber(source);
		if (idx1 < 0)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		temp1 = DSRCmsgID.unknownEnumerator();
	    }
	    data.msgID = temp1;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("msgID", "DSRCmsgID");
	    throw de;
	}
	// Decode field 'msgCnt'
	try {
	    long temp1;

	    if (data.msgCnt == null)
		data.msgCnt = new MsgCount();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 127);
	    if (temp1 > 127)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.msgCnt.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("msgCnt", "MsgCount");
	    throw de;
	}
	if (has_name0) {
	    // Decode field 'name'
	    try {
		data.name = new DescriptiveName(com.oss.coders.per.PerKMCString.decode(coder, source, 1, 63, MapData._cEPAInfo_name));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("name", "DescriptiveName");
		throw de;
	    }
	} else {
	    data.name = null;
	}
	if (has_layerType0) {
	    // Decode field 'layerType'
	    try {
		int idx1;
		LayerType temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 7);
		    if (idx1 < 0 || idx1 > 7)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = LayerType.valueAt(idx1);
		} else {
		    idx1 = 8 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = LayerType.unknownEnumerator();
		}
		data.layerType = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("layerType", "LayerType");
		throw de;
	    }
	} else {
	    data.layerType = null;
	}
	if (has_layerID0) {
	    // Decode field 'layerID'
	    try {
		long temp1;

		if (data.layerID == null)
		    data.layerID = new LayerID();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 100);
		if (temp1 > 100)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.layerID.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("layerID", "LayerID");
		throw de;
	    }
	} else {
	    data.layerID = null;
	}
	if (has_intersections0) {
	    // Decode field 'intersections'
	    try {
		if (data.intersections == null)
		    data.intersections = new Intersections_();
		data.intersections.decodeValue(coder, source, data.intersections);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("intersections", "SEQUENCE OF");
		throw de;
	    }
	} else {
	    data.intersections = null;
	}
	if (has_dataParameters0) {
	    // Decode field 'dataParameters'
	    try {
		if (data.dataParameters == null)
		    data.dataParameters = new DataParameters();
		data.dataParameters.decodeValue(coder, source, data.dataParameters);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("dataParameters", "DataParameters");
		throw de;
	    }
	} else {
	    data.dataParameters = null;
	}
	// Decode field 'crc'
	try {
	    data.crc = new MsgCRC(com.oss.coders.per.PerOctets.decode(coder, source, 2, 2));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("crc", "MsgCRC");
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
	// Encode field 'msgID'
	try {
	    DSRCmsgID item1 = this.msgID;

	    {
		sink.encodeKey("msgID");
		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else 
		    sink.writeString(item1.name());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msgID", "DSRCmsgID");
	    throw ee;
	}
	// Encode field 'msgCnt'
	try {
	    MsgCount item1 = this.msgCnt;

	    {
		sink.writeSeparator();
		sink.encodeKey("msgCnt");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msgCnt", "MsgCount");
	    throw ee;
	}
	// Encode field 'name'
	try {
	    DescriptiveName item1 = this.name;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("name");
		    coder.encodeString(item1.stringValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "name");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("name", "DescriptiveName");
	    throw ee;
	}
	// Encode field 'layerType'
	try {
	    LayerType item1 = this.layerType;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("layerType");
		    if (item1.isUnknownEnumerator()) {
			throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		    } else 
			sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "layerType");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("layerType", "LayerType");
	    throw ee;
	}
	// Encode field 'layerID'
	try {
	    LayerID item1 = this.layerID;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("layerID");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "layerID");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("layerID", "LayerID");
	    throw ee;
	}
	// Encode field 'intersections'
	try {
	    Intersections_ item1 = this.intersections;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("intersections");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "intersections");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("intersections", "SEQUENCE OF");
	    throw ee;
	}
	// Encode field 'dataParameters'
	try {
	    DataParameters item1 = this.dataParameters;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("dataParameters");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "dataParameters");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("dataParameters", "DataParameters");
	    throw ee;
	}
	// Encode field 'crc'
	try {
	    MsgCRC item1 = this.crc;

	    {
		sink.writeSeparator();
		sink.encodeKey("crc");
		sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("crc", "MsgCRC");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public MapData decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[9];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		MapData.__Tag t_tag0 = MapData.__Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = MapData.__Tag._null_;
		switch (t_tag0) {
		    case __msgID:
		    // Decode field 'msgID'
		    try {
			String content1 = coder.decodeString(source);
			int idx1;
			DSRCmsgID temp1;

			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			idx1 = coder.resolveName(DSRCmsgID.cConstantNameList, content1);
			if (idx1 < 0 )
			    temp1 = DSRCmsgID.unknownEnumerator();
			else
			    temp1 = DSRCmsgID.cNamedNumbers[idx1];
			this.msgID = temp1;
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("msgID", "DSRCmsgID");
			throw de;
		    }
		    break;
		    case __msgCnt:
		    // Decode field 'msgCnt'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.msgCnt == null)
			    this.msgCnt = new MsgCount();
			this.msgCnt.setValue(coder.decodeInteger(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("msgCnt", "MsgCount");
			throw de;
		    }
		    break;
		    case __name:
		    // Decode field 'name'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.name = new DescriptiveName(coder.decodeString(source));
			    present0[2] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("name", "DescriptiveName");
			throw de;
		    }
		    break;
		    case __layerType:
		    // Decode field 'layerType'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    LayerType temp1;

			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(LayerType.cConstantNameList, content1);
			    if (idx1 < 0 )
				temp1 = LayerType.unknownEnumerator();
			    else
				temp1 = LayerType.cNamedNumbers[idx1];
			    this.layerType = temp1;
			    present0[3] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("layerType", "LayerType");
			throw de;
		    }
		    break;
		    case __layerID:
		    // Decode field 'layerID'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[4])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.layerID == null)
				this.layerID = new LayerID();
			    this.layerID.setValue(coder.decodeInteger(source));
			    present0[4] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("layerID", "LayerID");
			throw de;
		    }
		    break;
		    case __intersections:
		    // Decode field 'intersections'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[5])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.intersections == null)
				this.intersections = new Intersections_();
			    this.intersections.decodeValue(coder, source);
			    present0[5] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("intersections", "SEQUENCE OF");
			throw de;
		    }
		    break;
		    case __dataParameters:
		    // Decode field 'dataParameters'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[6])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.dataParameters == null)
				this.dataParameters = new DataParameters();
			    this.dataParameters.decodeValue(coder, source);
			    present0[6] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("dataParameters", "DataParameters");
			throw de;
		    }
		    break;
		    case __crc:
		    // Decode field 'crc'
		    try {
			if (present0[7])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			this.crc = new MsgCRC(coder.decodeOctetString(source));
			present0[7] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("crc", "MsgCRC");
			throw de;
		    }
		    break;
		    default:
			coder.skipValue(source);
			break;
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'msgID'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'msgCnt'");
	if (!present0[2])
	    this.name = null;
	if (!present0[3])
	    this.layerType = null;
	if (!present0[4])
	    this.layerID = null;
	if (!present0[5])
	    this.intersections = null;
	if (!present0[6])
	    this.dataParameters = null;
	if (!present0[7])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'crc'");
	return this;
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((MapData)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((MapData)that);
    }
    
    public boolean equalTo(MapData that) {
	if (!this.msgID.equalTo(that.msgID))
	    return false;
	if (!this.msgCnt.equalTo(that.msgCnt))
	    return false;
	if (this.name != null && that.name != null) {
	    if (!this.name.equalTo(that.name))
		return false;
	}
	if (this.layerType != null && that.layerType != null) {
	    if (!this.layerType.equalTo(that.layerType))
		return false;
	}
	if (this.layerID != null && that.layerID != null) {
	    if (!this.layerID.equalTo(that.layerID))
		return false;
	}
	if (this.intersections != null && that.intersections != null) {
	    if (!this.intersections.equalTo(that.intersections))
		return false;
	}
	if (this.dataParameters != null && that.dataParameters != null) {
	    if (!this.dataParameters.equalTo(that.dataParameters))
		return false;
	}
	if (!this.crc.equalTo(that.crc))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public MapData clone() {
	MapData copy = (MapData)super.clone();
	copy.msgID = msgID.clone();
	copy.msgCnt = msgCnt.clone();
	if (name != null) {
	    copy.name = name.clone();
	}
	if (layerType != null) {
	    copy.layerType = layerType.clone();
	}
	if (layerID != null) {
	    copy.layerID = layerID.clone();
	}
	if (intersections != null) {
	    copy.intersections = intersections.clone();
	}
	if (dataParameters != null) {
	    copy.dataParameters = dataParameters.clone();
	}
	copy.crc = crc.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.msgID != null ? this.msgID.hashCode() : 0);
	hash = 41 * hash + (this.msgCnt != null ? this.msgCnt.hashCode() : 0);
	hash = 41 * hash + (this.name != null ? this.name.hashCode() : 0);
	hash = 41 * hash + (this.layerType != null ? this.layerType.hashCode() : 0);
	hash = 41 * hash + (this.layerID != null ? this.layerID.hashCode() : 0);
	hash = 41 * hash + (this.intersections != null ? this.intersections.hashCode() : 0);
	hash = 41 * hash + (this.dataParameters != null ? this.dataParameters.hashCode() : 0);
	hash = 41 * hash + (this.crc != null ? this.crc.hashCode() : 0);
	return hash;
    }
} // End class definition for MapData
