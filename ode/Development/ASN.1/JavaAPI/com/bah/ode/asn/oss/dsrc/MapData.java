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
		    Intersection_.decodeValue(coder, source, item1);
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
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, MapData data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	boolean has_name0 = data.name != null;
	boolean has_layerType0 = data.layerType != null;
	boolean has_layerID0 = data.layerID != null;
	boolean has_intersections0 = data.intersections != null;
	boolean has_dataParameters0 = data.dataParameters != null;
	sink.writeBit(false); ++nbits;
	sink.writeBit(has_name0); ++nbits;
	sink.writeBit(has_layerType0); ++nbits;
	sink.writeBit(has_layerID0); ++nbits;
	sink.writeBit(has_intersections0); ++nbits;
	sink.writeBit(has_dataParameters0); ++nbits;
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
	if (has_name0) {
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
	if (has_layerType0) {
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
	if (has_layerID0) {
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
	if (has_intersections0) {
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
	if (has_dataParameters0) {
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
	int idx0;
	InputBitStream bitstream0 = null;

	boolean has_name0 = source.readBit();
	boolean has_layerType0 = source.readBit();
	boolean has_layerID0 = source.readBit();
	boolean has_intersections0 = source.readBit();
	boolean has_dataParameters0 = source.readBit();
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
		Intersections_.decodeValue(coder, source, data.intersections);
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
		DataParameters.decodeValue(coder, source, data.dataParameters);
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

} // End class definition for MapData
