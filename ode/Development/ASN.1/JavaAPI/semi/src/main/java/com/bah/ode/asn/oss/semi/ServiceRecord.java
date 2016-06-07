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
 * Define the ASN1 Type ServiceRecord from ASN1 Module SEMI.
 * @see Sequence
 */

public class ServiceRecord extends Sequence {
    public ConnectionPoints connectionPoints;
    public ServiceProviderID svcProvider;
    public SvcPSIDs svcPSIDs;
    public GeoRegion serviceRegion;
    
    /**
     * The default constructor.
     */
    public ServiceRecord()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ServiceRecord(ConnectionPoints connectionPoints, 
		    ServiceProviderID svcProvider, SvcPSIDs svcPSIDs, 
		    GeoRegion serviceRegion)
    {
	setConnectionPoints(connectionPoints);
	setSvcProvider(svcProvider);
	setSvcPSIDs(svcPSIDs);
	setServiceRegion(serviceRegion);
    }
    
    
    // Methods for field "connectionPoints"
    public ConnectionPoints getConnectionPoints()
    {
	return this.connectionPoints;
    }
    
    public void setConnectionPoints(ConnectionPoints connectionPoints)
    {
	this.connectionPoints = connectionPoints;
    }
    
    
    
    /**
     * Define the ASN1 Type ConnectionPoints from ASN1 Module SEMI.
     * @see SequenceOf
     */
    public static class ConnectionPoints extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public ConnectionPoints()
	{
	    this.elements = new java.util.ArrayList<ConnectionPoint>();
	}
	
	
	/**
	 * Construct from an array of components.
	 */
	public java.util.ArrayList<ConnectionPoint> elements;

	public ConnectionPoints(ConnectionPoint[] elements)
	{
	    this.elements = new java.util.ArrayList<ConnectionPoint>(java.util.Arrays.asList(elements));
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(ConnectionPoint element)
	{
	    elements.add(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(ConnectionPoint element, int atIndex)
	{
	    elements.set(atIndex, element);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized ConnectionPoint get(int atIndex)
	{
	    return (ConnectionPoint)elements.get(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(ConnectionPoint element, int atIndex)
	{
	    elements.add(atIndex, element);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(ConnectionPoint element)
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
	public static int encodeValue(PerCoder coder, OutputBitStream sink, ConnectionPoints data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int total_len0 = data.elements.size();
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;
	    int nbits = 0;

	    if (total_len0 < 1 || total_len0 > 2)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + total_len0);
	    nbits += coder.encodeLengthDeterminant(total_len0, 1, 2, sink);
	    moreFragments0 = coder.moreFragments();
	    fragmentLength0 = (moreFragments0 ? coder.fragmentLength() : total_len0);
	    while (total_len0 > 0) {
		try {
		    ConnectionPoint item1 = data.elements.get(idx0);

		    nbits += ConnectionPoint.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "ConnectionPoint", idx0);
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
	public static ConnectionPoints decodeValue(PerCoder coder, InputBitStream source, ConnectionPoints data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    int total_len0 = 0;
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;

	    idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, 1, 2);
	    if (fragmentLength0 > 2)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + fragmentLength0);
	    moreFragments0 = coder.moreFragments();
	    if (data.elements != null)
		data.elements.clear();
	    else
		data.elements = new java.util.ArrayList<ConnectionPoint>(fragmentLength0);
	    while (idx0 > 0) {
		try {
		    ConnectionPoint item1 = new ConnectionPoint();

		    data.elements.add(item1);
		    item1.decodeValue(coder, source, item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "ConnectionPoint", total_len0);
		    throw de;
		}
		--idx0; ++total_len0;
		if (idx0 == 0) {
		    if (moreFragments0) {
			idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, fragmentLength0);
			moreFragments0 = coder.moreFragments();
			if ((total_len0 + fragmentLength0) > 2)
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
			ConnectionPoint item1 = this.elements.get(idx0);

			item1.encodeValue(coder, sink);
		    
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "ConnectionPoint", idx0);
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
	public ConnectionPoints decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	int total_len0 = 0;
	int idx0 = 0;

	if (this.elements != null)
	    this.elements.clear();
	else
	    this.elements = new java.util.ArrayList<ConnectionPoint>(total_len0);
	coder.decodeArray(source);
	if (coder.hasMoreElements(source, true))
	    do {
		try {
		    ConnectionPoint item1 = new ConnectionPoint();

		    this.elements.add(item1);
		    item1.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "ConnectionPoint", idx0);
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
	    return equalTo((ConnectionPoints)that);
	}
	
	public boolean equalTo(SequenceOf that)
	{
	    return equalTo((ConnectionPoints)that);
	}
	
	public boolean equalTo(ConnectionPoints that) {
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
	public ConnectionPoints clone() {
	    ConnectionPoints copy = (ConnectionPoints)super.clone();
	    copy.elements = new java.util.ArrayList<ConnectionPoint>(elements.size());
	    for (ConnectionPoint element : elements) {
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
    } // End class definition for ConnectionPoints

    // Methods for field "svcProvider"
    public ServiceProviderID getSvcProvider()
    {
	return this.svcProvider;
    }
    
    public void setSvcProvider(ServiceProviderID svcProvider)
    {
	this.svcProvider = svcProvider;
    }
    
    
    // Methods for field "svcPSIDs"
    public SvcPSIDs getSvcPSIDs()
    {
	return this.svcPSIDs;
    }
    
    public void setSvcPSIDs(SvcPSIDs svcPSIDs)
    {
	this.svcPSIDs = svcPSIDs;
    }
    
    
    
    /**
     * Define the ASN1 Type SvcPSIDs from ASN1 Module SEMI.
     * @see SequenceOf
     */
    public static class SvcPSIDs extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public SvcPSIDs()
	{
	    this.elements = new java.util.ArrayList<Psid>();
	}
	
	
	/**
	 * Construct from an array of components.
	 */
	public java.util.ArrayList<Psid> elements;

	public SvcPSIDs(Psid[] elements)
	{
	    this.elements = new java.util.ArrayList<Psid>(java.util.Arrays.asList(elements));
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(Psid element)
	{
	    elements.add(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(Psid element, int atIndex)
	{
	    elements.set(atIndex, element);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized Psid get(int atIndex)
	{
	    return (Psid)elements.get(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(Psid element, int atIndex)
	{
	    elements.add(atIndex, element);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(Psid element)
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
	public static int encodeValue(PerCoder coder, OutputBitStream sink, SvcPSIDs data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int total_len0 = data.elements.size();
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;
	    int nbits = 0;

	    if (total_len0 < 1 || total_len0 > 5)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + total_len0);
	    nbits += coder.encodeLengthDeterminant(total_len0, 1, 5, sink);
	    moreFragments0 = coder.moreFragments();
	    fragmentLength0 = (moreFragments0 ? coder.fragmentLength() : total_len0);
	    while (total_len0 > 0) {
		try {
		    Psid item1 = data.elements.get(idx0);
		    int len1 = item1.getSize();

		    if (len1 != 4)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 4, 4, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "Psid", idx0);
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
	public static SvcPSIDs decodeValue(PerCoder coder, InputBitStream source, SvcPSIDs data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    int total_len0 = 0;
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;

	    idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, 1, 5);
	    if (fragmentLength0 > 5)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + fragmentLength0);
	    moreFragments0 = coder.moreFragments();
	    if (data.elements != null)
		data.elements.clear();
	    else
		data.elements = new java.util.ArrayList<Psid>(fragmentLength0);
	    while (idx0 > 0) {
		try {
		    Psid item1;

		    item1 = new Psid(com.oss.coders.per.PerOctets.decode(coder, source, 4, 4));
		    data.elements.add(item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "Psid", total_len0);
		    throw de;
		}
		--idx0; ++total_len0;
		if (idx0 == 0) {
		    if (moreFragments0) {
			idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, fragmentLength0);
			moreFragments0 = coder.moreFragments();
			if ((total_len0 + fragmentLength0) > 5)
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
			Psid item1 = this.elements.get(idx0);

			sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		    
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "Psid", idx0);
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
	public SvcPSIDs decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	int total_len0 = 0;
	int idx0 = 0;

	if (this.elements != null)
	    this.elements.clear();
	else
	    this.elements = new java.util.ArrayList<Psid>(total_len0);
	coder.decodeArray(source);
	if (coder.hasMoreElements(source, true))
	    do {
		try {
		    Psid item1;

		    item1 = new Psid(coder.decodeOctetString(source));
		    this.elements.add(item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "Psid", idx0);
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
	    return equalTo((SvcPSIDs)that);
	}
	
	public boolean equalTo(SequenceOf that)
	{
	    return equalTo((SvcPSIDs)that);
	}
	
	public boolean equalTo(SvcPSIDs that) {
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
	public SvcPSIDs clone() {
	    SvcPSIDs copy = (SvcPSIDs)super.clone();
	    copy.elements = new java.util.ArrayList<Psid>(elements.size());
	    for (Psid element : elements) {
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
    } // End class definition for SvcPSIDs

    // Methods for field "serviceRegion"
    public GeoRegion getServiceRegion()
    {
	return this.serviceRegion;
    }
    
    public void setServiceRegion(GeoRegion serviceRegion)
    {
	this.serviceRegion = serviceRegion;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     */
    public static enum __Tag
    {
	__connectionPoints("connectionPoints"),
	__svcProvider("svcProvider"),
	__svcPSIDs("svcPSIDs"),
	__serviceRegion("serviceRegion"),
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
	ServiceRecord temp0 = this;

	try {
	    len0 += sink.encodeLengthTag(temp0.serviceRegion.encodeValue(coder, sink), 0xA3);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("serviceRegion", "GeoRegion");
	    throw ee;
	}
	try {
	    int len1 = 0;
	    java.util.ArrayList<Psid> temp1 = temp0.svcPSIDs.elements;
	    int idx1 = temp1 != null ? temp1.size() : 0;

	    try {
		while(idx1-- > 0) {
		    len1 += sink.encodeLengthTag(sink.write(temp1.get(idx1).byteArrayValue()), 0x4);
		}
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext(null, "SEQUENCE OF", idx1);
		throw ee;
	    }
	    len0 += sink.encodeLengthTag(len1, 0xA2);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("svcPSIDs", "SEQUENCE OF");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(sink.write(temp0.svcProvider.byteArrayValue()), 0x81);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("svcProvider", "ServiceProviderID");
	    throw ee;
	}
	try {
	    int len1 = 0;
	    java.util.ArrayList<ConnectionPoint> temp1 = temp0.connectionPoints.elements;
	    int idx1 = temp1 != null ? temp1.size() : 0;

	    try {
		while(idx1-- > 0) {
		    len1 += sink.encodeLengthTag(temp1.get(idx1).encodeValue(coder, sink), 0x30);
		}
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext(null, "SEQUENCE OF", idx1);
		throw ee;
	    }
	    len0 += sink.encodeLengthTag(len1, 0xA0);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("connectionPoints", "SEQUENCE OF");
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements BER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public ServiceRecord decodeValue(BerCoder coder, DecoderInput source)
	    throws DecoderException
    {
	int total_len0 = source.mLength;
	int end_pos0 = (total_len0 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len0);
	int tag;

	tag = source.decodeTagLength();
	if (tag != 0xA0)
	    source.raiseTagMismatchException(tag);
	try {
	    this.connectionPoints = new ConnectionPoints();
	    {
		int total_len1 = source.mLength;
		int end_pos1 = (total_len1 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len1);
		int idx1 = 0;

		this.connectionPoints.elements = new java.util.ArrayList<ConnectionPoint>();

		try {
		    for (;;) {
			if (source.position() >= end_pos1) {
			    if (source.position() > end_pos1)
				throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
			    break;
			}
			tag = source.decodeTagLength();
			if (tag == 0) {
			    if (total_len1 < 0) {
				if (source.mLength != 0)
				    throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);
				break;
			    }
			    if (source.mLength == 0)
				throw new DecoderException(ExceptionDescriptor._expect_tag, null);
			}
			ConnectionPoint temp1 = new ConnectionPoint();
			this.connectionPoints.add(temp1);
			if (tag != 0x30)
			    source.raiseTagMismatchException(tag);
			temp1.decodeValue(coder, source);
			++idx1;
		    }
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendElementContext(null, "SEQUENCE OF", idx1);
		    throw ee;
		}
	    }
	} catch (Exception e) {
	    DecoderException ee = DecoderException.wrapException(e);
	    ee.appendFieldContext("connectionPoints", "SEQUENCE OF");
	    throw ee;
	}
	tag = source.decodeTagLength();
	if (tag != 0x81 && tag != 0xA1)
	    source.raiseTagMismatchException(tag);
	try {
	    this.svcProvider = new ServiceProviderID(coder.decodeOctetString(source));
	} catch (Exception e) {
	    DecoderException ee = DecoderException.wrapException(e);
	    ee.appendFieldContext("svcProvider", "ServiceProviderID");
	    throw ee;
	}
	tag = source.decodeTagLength();
	if (tag != 0xA2)
	    source.raiseTagMismatchException(tag);
	try {
	    this.svcPSIDs = new SvcPSIDs();
	    {
		int total_len1 = source.mLength;
		int end_pos1 = (total_len1 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len1);
		int idx1 = 0;

		this.svcPSIDs.elements = new java.util.ArrayList<Psid>();

		try {
		    for (;;) {
			if (source.position() >= end_pos1) {
			    if (source.position() > end_pos1)
				throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
			    break;
			}
			tag = source.decodeTagLength();
			if (tag == 0) {
			    if (total_len1 < 0) {
				if (source.mLength != 0)
				    throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);
				break;
			    }
			    if (source.mLength == 0)
				throw new DecoderException(ExceptionDescriptor._expect_tag, null);
			}
			Psid temp1;
			if (tag != 0x4 && tag != 0x24)
			    source.raiseTagMismatchException(tag);
			temp1 = new Psid(coder.decodeOctetString(source));
			this.svcPSIDs.add(temp1);
			++idx1;
		    }
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendElementContext(null, "SEQUENCE OF", idx1);
		    throw ee;
		}
	    }
	} catch (Exception e) {
	    DecoderException ee = DecoderException.wrapException(e);
	    ee.appendFieldContext("svcPSIDs", "SEQUENCE OF");
	    throw ee;
	}
	tag = source.decodeTagLength();
	if (tag != 0xA3)
	    source.raiseTagMismatchException(tag);
	try {
	    this.serviceRegion = new GeoRegion();
	    this.serviceRegion.decodeValue(coder, source);
	} catch (Exception e) {
	    DecoderException ee = DecoderException.wrapException(e);
	    ee.appendFieldContext("serviceRegion", "GeoRegion");
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
	ServiceRecord temp0 = this;

	try {
	    len0 += sink.encodeLengthTag(temp0.serviceRegion.encodeValue(coder, sink), 0xA3);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("serviceRegion", "GeoRegion");
	    throw ee;
	}
	try {
	    int len1 = 0;
	    java.util.ArrayList<Psid> temp1 = temp0.svcPSIDs.elements;
	    int idx1 = temp1 != null ? temp1.size() : 0;

	    try {
		while(idx1-- > 0) {
		    len1 += sink.encodeLengthTag(sink.write(temp1.get(idx1).byteArrayValue()), 0x4);
		}
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext(null, "SEQUENCE OF", idx1);
		throw ee;
	    }
	    len0 += sink.encodeLengthTag(len1, 0xA2);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("svcPSIDs", "SEQUENCE OF");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(sink.write(temp0.svcProvider.byteArrayValue()), 0x81);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("svcProvider", "ServiceProviderID");
	    throw ee;
	}
	try {
	    int len1 = 0;
	    java.util.ArrayList<ConnectionPoint> temp1 = temp0.connectionPoints.elements;
	    int idx1 = temp1 != null ? temp1.size() : 0;

	    try {
		while(idx1-- > 0) {
		    len1 += sink.encodeLengthTag(temp1.get(idx1).encodeValue(coder, sink), 0x30);
		}
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext(null, "SEQUENCE OF", idx1);
		throw ee;
	    }
	    len0 += sink.encodeLengthTag(len1, 0xA0);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("connectionPoints", "SEQUENCE OF");
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, ServiceRecord data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	// Encode field 'connectionPoints'
	try {
	    ConnectionPoints item1 = data.connectionPoints;

	    nbits += (item1.encodeValue(coder, sink, item1));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("connectionPoints", "SEQUENCE OF");
	    throw ee;
	}
	// Encode field 'svcProvider'
	try {
	    ServiceProviderID item1 = data.svcProvider;
	    int len1 = item1.getSize();

	    if (len1 != 4)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 4, 4, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("svcProvider", "ServiceProviderID");
	    throw ee;
	}
	// Encode field 'svcPSIDs'
	try {
	    SvcPSIDs item1 = data.svcPSIDs;

	    nbits += SvcPSIDs.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("svcPSIDs", "SEQUENCE OF");
	    throw ee;
	}
	// Encode field 'serviceRegion'
	try {
	    GeoRegion item1 = data.serviceRegion;

	    nbits += GeoRegion.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("serviceRegion", "GeoRegion");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static ServiceRecord decodeValue(PerCoder coder, InputBitStream source, ServiceRecord data)
	    throws IOException, DecoderException, DecodeFailedException
    {
    /** Decode root fields **/
	// Decode field 'connectionPoints'
	try {
	    if (data.connectionPoints == null)
		data.connectionPoints = new ConnectionPoints();
	    data.connectionPoints.decodeValue(coder, source, data.connectionPoints);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("connectionPoints", "SEQUENCE OF");
	    throw de;
	}
	// Decode field 'svcProvider'
	try {
	    data.svcProvider = new ServiceProviderID(com.oss.coders.per.PerOctets.decode(coder, source, 4, 4));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("svcProvider", "ServiceProviderID");
	    throw de;
	}
	// Decode field 'svcPSIDs'
	try {
	    if (data.svcPSIDs == null)
		data.svcPSIDs = new SvcPSIDs();
	    data.svcPSIDs.decodeValue(coder, source, data.svcPSIDs);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("svcPSIDs", "SEQUENCE OF");
	    throw de;
	}
	// Decode field 'serviceRegion'
	try {
	    if (data.serviceRegion == null)
		data.serviceRegion = new GeoRegion();
	    data.serviceRegion.decodeValue(coder, source, data.serviceRegion);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("serviceRegion", "GeoRegion");
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
	// Encode field 'connectionPoints'
	try {
	    ConnectionPoints item1 = this.connectionPoints;

	    {
		sink.encodeKey("connectionPoints");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("connectionPoints", "SEQUENCE OF");
	    throw ee;
	}
	// Encode field 'svcProvider'
	try {
	    ServiceProviderID item1 = this.svcProvider;

	    {
		sink.writeSeparator();
		sink.encodeKey("svcProvider");
		sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("svcProvider", "ServiceProviderID");
	    throw ee;
	}
	// Encode field 'svcPSIDs'
	try {
	    SvcPSIDs item1 = this.svcPSIDs;

	    {
		sink.writeSeparator();
		sink.encodeKey("svcPSIDs");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("svcPSIDs", "SEQUENCE OF");
	    throw ee;
	}
	// Encode field 'serviceRegion'
	try {
	    GeoRegion item1 = this.serviceRegion;

	    {
		sink.writeSeparator();
		sink.encodeKey("serviceRegion");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("serviceRegion", "GeoRegion");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public ServiceRecord decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[5];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		ServiceRecord.__Tag t_tag0 = ServiceRecord.__Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = ServiceRecord.__Tag._null_;
		switch (t_tag0) {
		    case __connectionPoints:
		    // Decode field 'connectionPoints'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.connectionPoints == null)
			    this.connectionPoints = new ConnectionPoints();
			this.connectionPoints.decodeValue(coder, source);
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("connectionPoints", "SEQUENCE OF");
			throw de;
		    }
		    break;
		    case __svcProvider:
		    // Decode field 'svcProvider'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			this.svcProvider = new ServiceProviderID(coder.decodeOctetString(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("svcProvider", "ServiceProviderID");
			throw de;
		    }
		    break;
		    case __svcPSIDs:
		    // Decode field 'svcPSIDs'
		    try {
			if (present0[2])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.svcPSIDs == null)
			    this.svcPSIDs = new SvcPSIDs();
			this.svcPSIDs.decodeValue(coder, source);
			present0[2] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("svcPSIDs", "SEQUENCE OF");
			throw de;
		    }
		    break;
		    case __serviceRegion:
		    // Decode field 'serviceRegion'
		    try {
			if (present0[3])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.serviceRegion == null)
			    this.serviceRegion = new GeoRegion();
			this.serviceRegion.decodeValue(coder, source);
			present0[3] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("serviceRegion", "GeoRegion");
			throw de;
		    }
		    break;
		    default:
			throw new DecoderException(ExceptionDescriptor._unknown_field, ": '" + tag0 + "'");
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'connectionPoints'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'svcProvider'");
	if (!present0[2])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'svcPSIDs'");
	if (!present0[3])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'serviceRegion'");
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
	comma0 = true;
	try {
	    printer.newLine(writer);
	    writer.print("connectionPoints ");
	    {
		java.util.ArrayList<ConnectionPoint> temp1 = this.connectionPoints.elements;
		int len1 = temp1 != null ? temp1.size() : 0;
		int idx1 = 0;

		try {
		    writer.print('{');
		    printer.indent();
		    for (idx1 = 0; idx1 < len1; idx1++){
			if (idx1 > 0)
			    writer.print(',');
			printer.newLine(writer);
			temp1.get(idx1).printValue(printer, writer);
		    }
		    printer.undent();
		    if (len1 > 0)
			printer.newLine(writer);
		    writer.print('}');
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
	    }
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("svcProvider ");
	    printer.print(this.svcProvider, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("svcPSIDs ");
	    {
		java.util.ArrayList<Psid> temp1 = this.svcPSIDs.elements;
		int len1 = temp1 != null ? temp1.size() : 0;
		int idx1 = 0;

		try {
		    writer.print('{');
		    printer.indent();
		    for (idx1 = 0; idx1 < len1; idx1++){
			if (idx1 > 0)
			    writer.print(',');
			printer.newLine(writer);
			printer.print(temp1.get(idx1), writer);
		    }
		    printer.undent();
		    if (len1 > 0)
			printer.newLine(writer);
		    writer.print('}');
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
	    }
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("serviceRegion ");
	    this.serviceRegion.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
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
	return equalTo((ServiceRecord)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((ServiceRecord)that);
    }
    
    public boolean equalTo(ServiceRecord that) {
	if (!this.connectionPoints.equalTo(that.connectionPoints))
	    return false;
	if (!this.svcProvider.equalTo(that.svcProvider))
	    return false;
	if (!this.svcPSIDs.equalTo(that.svcPSIDs))
	    return false;
	if (!this.serviceRegion.equalTo(that.serviceRegion))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public ServiceRecord clone() {
	ServiceRecord copy = (ServiceRecord)super.clone();
	copy.connectionPoints = connectionPoints.clone();
	copy.svcProvider = svcProvider.clone();
	copy.svcPSIDs = svcPSIDs.clone();
	copy.serviceRegion = serviceRegion.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.connectionPoints != null ? this.connectionPoints.hashCode() : 0);
	hash = 41 * hash + (this.svcProvider != null ? this.svcProvider.hashCode() : 0);
	hash = 41 * hash + (this.svcPSIDs != null ? this.svcPSIDs.hashCode() : 0);
	hash = 41 * hash + (this.serviceRegion != null ? this.serviceRegion.hashCode() : 0);
	return hash;
    }
} // End class definition for ServiceRecord
