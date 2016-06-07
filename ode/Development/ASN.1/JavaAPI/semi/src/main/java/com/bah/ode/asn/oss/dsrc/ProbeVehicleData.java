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
 * Define the ASN1 Type ProbeVehicleData from ASN1 Module DSRC.
 * @see Sequence
 */

public class ProbeVehicleData extends Sequence implements BEREncodable, BERDecodable, DEREncodable, JSONEncodable, JSONDecodable, PEREncodable, PERDecodable {
    public DSRCmsgID msgID;
    public ProbeSegmentNumber segNum;
    public VehicleIdent probeID;
    public FullPositionVector startVector;
    public VehicleType vehicleType;
    public Count cntSnapshots;
    public Snapshots snapshots;
    
    /**
     * The default constructor.
     */
    public ProbeVehicleData()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ProbeVehicleData(DSRCmsgID msgID, ProbeSegmentNumber segNum, 
		    VehicleIdent probeID, FullPositionVector startVector, 
		    VehicleType vehicleType, Count cntSnapshots, 
		    Snapshots snapshots)
    {
	setMsgID(msgID);
	setSegNum(segNum);
	setProbeID(probeID);
	setStartVector(startVector);
	setVehicleType(vehicleType);
	setCntSnapshots(cntSnapshots);
	setSnapshots(snapshots);
    }
    
    /**
     * Construct with required components.
     */
    public ProbeVehicleData(DSRCmsgID msgID, FullPositionVector startVector, 
		    VehicleType vehicleType, Snapshots snapshots)
    {
	setMsgID(msgID);
	setStartVector(startVector);
	setVehicleType(vehicleType);
	setSnapshots(snapshots);
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
    
    
    // Methods for field "segNum"
    public ProbeSegmentNumber getSegNum()
    {
	return this.segNum;
    }
    
    public void setSegNum(ProbeSegmentNumber segNum)
    {
	this.segNum = segNum;
    }
    
    public boolean hasSegNum()
    {
	return (segNum != null);
    }
    
    public void deleteSegNum()
    {
	segNum = null;
    }
    
    
    // Methods for field "probeID"
    public VehicleIdent getProbeID()
    {
	return this.probeID;
    }
    
    public void setProbeID(VehicleIdent probeID)
    {
	this.probeID = probeID;
    }
    
    public boolean hasProbeID()
    {
	return (probeID != null);
    }
    
    public void deleteProbeID()
    {
	probeID = null;
    }
    
    
    // Methods for field "startVector"
    public FullPositionVector getStartVector()
    {
	return this.startVector;
    }
    
    public void setStartVector(FullPositionVector startVector)
    {
	this.startVector = startVector;
    }
    
    
    // Methods for field "vehicleType"
    public VehicleType getVehicleType()
    {
	return this.vehicleType;
    }
    
    public void setVehicleType(VehicleType vehicleType)
    {
	this.vehicleType = vehicleType;
    }
    
    
    // Methods for field "cntSnapshots"
    public Count getCntSnapshots()
    {
	return this.cntSnapshots;
    }
    
    public void setCntSnapshots(Count cntSnapshots)
    {
	this.cntSnapshots = cntSnapshots;
    }
    
    public boolean hasCntSnapshots()
    {
	return (cntSnapshots != null);
    }
    
    public void deleteCntSnapshots()
    {
	cntSnapshots = null;
    }
    
    
    // Methods for field "snapshots"
    public Snapshots getSnapshots()
    {
	return this.snapshots;
    }
    
    public void setSnapshots(Snapshots snapshots)
    {
	this.snapshots = snapshots;
    }
    
    
    
    /**
     * Define the ASN1 Type Snapshots from ASN1 Module DSRC.
     * @see SequenceOf
     */
    public static class Snapshots extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public Snapshots()
	{
	    this.elements = new java.util.ArrayList<Snapshot>();
	}
	
	
	/**
	 * Construct from an array of components.
	 */
	public java.util.ArrayList<Snapshot> elements;

	public Snapshots(Snapshot[] elements)
	{
	    this.elements = new java.util.ArrayList<Snapshot>(java.util.Arrays.asList(elements));
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(Snapshot element)
	{
	    elements.add(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(Snapshot element, int atIndex)
	{
	    elements.set(atIndex, element);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized Snapshot get(int atIndex)
	{
	    return (Snapshot)elements.get(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(Snapshot element, int atIndex)
	{
	    elements.add(atIndex, element);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(Snapshot element)
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
	public static int encodeValue(PerCoder coder, OutputBitStream sink, Snapshots data)
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
		    Snapshot item1 = data.elements.get(idx0);

		    nbits += Snapshot.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "Snapshot", idx0);
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
	public static Snapshots decodeValue(PerCoder coder, InputBitStream source, Snapshots data)
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
		data.elements = new java.util.ArrayList<Snapshot>(fragmentLength0);
	    while (idx0 > 0) {
		try {
		    Snapshot item1 = new Snapshot();

		    data.elements.add(item1);
		    item1.decodeValue(coder, source, item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "Snapshot", total_len0);
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
			Snapshot item1 = this.elements.get(idx0);

			item1.encodeValue(coder, sink);
		    
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "Snapshot", idx0);
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
	public Snapshots decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	int total_len0 = 0;
	int idx0 = 0;

	if (this.elements != null)
	    this.elements.clear();
	else
	    this.elements = new java.util.ArrayList<Snapshot>(total_len0);
	coder.decodeArray(source);
	if (coder.hasMoreElements(source, true))
	    do {
		try {
		    Snapshot item1 = new Snapshot();

		    this.elements.add(item1);
		    item1.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "Snapshot", idx0);
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
	    return equalTo((Snapshots)that);
	}
	
	public boolean equalTo(SequenceOf that)
	{
	    return equalTo((Snapshots)that);
	}
	
	public boolean equalTo(Snapshots that) {
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
	public Snapshots clone() {
	    Snapshots copy = (Snapshots)super.clone();
	    copy.elements = new java.util.ArrayList<Snapshot>(elements.size());
	    for (Snapshot element : elements) {
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
    } // End class definition for Snapshots

    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     */
    public static enum __Tag
    {
	__msgID("msgID"),
	__segNum("segNum"),
	__probeID("probeID"),
	__startVector("startVector"),
	__vehicleType("vehicleType"),
	__cntSnapshots("cntSnapshots"),
	__snapshots("snapshots"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(8);
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
     * Encode the PDU using BER (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encode(BerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	try {
	    int len0 = 0;
	    ProbeVehicleData temp0 = this;

	    try {
		int len1 = 0;
		java.util.ArrayList<Snapshot> temp1 = temp0.snapshots.elements;
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
		len0 += sink.encodeLengthTag(len1, 0xA6);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("snapshots", "SEQUENCE OF");
		throw ee;
	    }
	    if (temp0.cntSnapshots != null) {
		try {
		    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.cntSnapshots, sink), 0x85);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("cntSnapshots", "Count");
		    throw ee;
		}
	    }
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.vehicleType, sink), 0x84);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("vehicleType", "VehicleType");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(temp0.startVector.encodeValue(coder, sink), 0xA3);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("startVector", "FullPositionVector");
		throw ee;
	    }
	    if (temp0.probeID != null) {
		try {
		    len0 += sink.encodeLengthTag(temp0.probeID.encodeValue(coder, sink), 0xA2);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("probeID", "VehicleIdent");
		    throw ee;
		}
	    }
	    if (temp0.segNum != null) {
		try {
		    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.segNum, sink), 0x81);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("segNum", "ProbeSegmentNumber");
		    throw ee;
		}
	    }
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.msgID, sink), 0x80);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msgID", "DSRCmsgID");
		throw ee;
	    }

	    return sink.encodeLengthTag(len0, 0x30);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext(null, "ProbeVehicleData");
	    throw ee;
	}
    }

    /**
     * Decode the PDU using BER (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public AbstractData decode(BerCoder coder, DecoderInput source, int tag)
	    throws DecoderException
    {
	this.segNum = null;
	this.probeID = null;
	this.cntSnapshots = null;
	try {
	    if (tag != 0x30)
	    {
		throw new DecoderException(ExceptionDescriptor._pdu_mismatch, null, source.formatTag(tag));
	    }
	    {
		int total_len0 = source.mLength;
		int end_pos0 = (total_len0 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len0);

		do {
		    tag = source.decodeTagLength();
		    if (tag != 0x80)
			source.raiseTagMismatchException(tag);
		    try {
			int idx1 = DSRCmsgID.indexOfValue(source.decodeLong());
			this.msgID = (idx1 < 0) ? DSRCmsgID.unknownEnumerator() : DSRCmsgID.cNamedNumbers[idx1];
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("msgID", "DSRCmsgID");
			throw ee;
		    }
		    tag = source.decodeTagLength();
		    if (tag == 0x81) {
			try {
			    this.segNum = new ProbeSegmentNumber(source.decodeLong());
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("segNum", "ProbeSegmentNumber");
			    throw ee;
			}
			tag = source.decodeTagLength();
		    }
		    if (tag == 0xA2) {
			try {
			    this.probeID = new VehicleIdent();
			    this.probeID.decodeValue(coder, source);
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("probeID", "VehicleIdent");
			    throw ee;
			}
			tag = source.decodeTagLength();
		    }
		    if (tag != 0xA3)
			source.raiseTagMismatchException(tag);
		    try {
			this.startVector = new FullPositionVector();
			this.startVector.decodeValue(coder, source);
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("startVector", "FullPositionVector");
			throw ee;
		    }
		    tag = source.decodeTagLength();
		    if (tag != 0x84)
			source.raiseTagMismatchException(tag);
		    try {
			int idx1 = VehicleType.indexOfValue(source.decodeLong());
			this.vehicleType = (idx1 < 0) ? VehicleType.unknownEnumerator() : VehicleType.cNamedNumbers[idx1];
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("vehicleType", "VehicleType");
			throw ee;
		    }
		    tag = source.decodeTagLength();
		    if (tag == 0x85) {
			try {
			    this.cntSnapshots = new Count(source.decodeLong());
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("cntSnapshots", "Count");
			    throw ee;
			}
			tag = source.decodeTagLength();
		    }
		    if (tag != 0xA6)
			source.raiseTagMismatchException(tag);
		    try {
			this.snapshots = new Snapshots();
			{
			    int total_len1 = source.mLength;
			    int end_pos1 = (total_len1 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len1);
			    int idx1 = 0;

			    this.snapshots.elements = new java.util.ArrayList<Snapshot>();

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
				    Snapshot temp1 = new Snapshot();
				    this.snapshots.add(temp1);
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
			ee.appendFieldContext("snapshots", "SEQUENCE OF");
			throw ee;
		    }
		    if (source.position() >= end_pos0)
			break;
		    tag = source.decodeTagLength();
		    if (tag == 0)
			break;
		    for (;;) {
			try {
			    coder.skipContents(source);
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendExtensionContext("ProbeVehicleData", -1);
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
	    }

	    return this;
	} catch (Exception e) {
	    DecoderException ee = DecoderException.wrapException(e);
	    ee.appendFieldContext(null, "ProbeVehicleData");
	    throw ee;
	}
    }

    /**
     * Encode the PDU using DER (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encode(DerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	try {
	    int len0 = 0;
	    ProbeVehicleData temp0 = this;

	    try {
		int len1 = 0;
		java.util.ArrayList<Snapshot> temp1 = temp0.snapshots.elements;
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
		len0 += sink.encodeLengthTag(len1, 0xA6);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("snapshots", "SEQUENCE OF");
		throw ee;
	    }
	    if (temp0.cntSnapshots != null) {
		try {
		    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.cntSnapshots, sink), 0x85);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("cntSnapshots", "Count");
		    throw ee;
		}
	    }
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.vehicleType, sink), 0x84);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("vehicleType", "VehicleType");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(temp0.startVector.encodeValue(coder, sink), 0xA3);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("startVector", "FullPositionVector");
		throw ee;
	    }
	    if (temp0.probeID != null) {
		try {
		    len0 += sink.encodeLengthTag(temp0.probeID.encodeValue(coder, sink), 0xA2);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("probeID", "VehicleIdent");
		    throw ee;
		}
	    }
	    if (temp0.segNum != null) {
		try {
		    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.segNum, sink), 0x81);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("segNum", "ProbeSegmentNumber");
		    throw ee;
		}
	    }
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.msgID, sink), 0x80);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msgID", "DSRCmsgID");
		throw ee;
	    }

	    return sink.encodeLengthTag(len0, 0x30);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext(null, "ProbeVehicleData");
	    throw ee;
	}
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, ProbeVehicleData data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.segNum != null);
	sink.writeBit(data.probeID != null);
	sink.writeBit(data.cntSnapshots != null);
	nbits += 4;
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
	if (data.segNum != null) {
	    // Encode field 'segNum'
	    try {
		ProbeSegmentNumber item1 = data.segNum;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 32767)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 32767, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("segNum", "ProbeSegmentNumber");
		throw ee;
	    }
	}
	if (data.probeID != null) {
	    // Encode field 'probeID'
	    try {
		VehicleIdent item1 = data.probeID;

		nbits += VehicleIdent.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("probeID", "VehicleIdent");
		throw ee;
	    }
	}
	// Encode field 'startVector'
	try {
	    FullPositionVector item1 = data.startVector;

	    nbits += FullPositionVector.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("startVector", "FullPositionVector");
	    throw ee;
	}
	// Encode field 'vehicleType'
	try {
	    VehicleType item1 = data.vehicleType;
	    int idx1;
	    boolean extroot1 = true;

	    if (item1.isUnknownEnumerator()) {
		throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
	    } else {
		idx1 = item1.indexOf();
		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		extroot1 = idx1 < 16;
	    }
	    sink.writeBit(!extroot1); ++nbits;
	    if (extroot1)
		nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 15, sink);
	    else
		nbits += coder.encodeNormallySmallNumber(idx1 - 16, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("vehicleType", "VehicleType");
	    throw ee;
	}
	if (data.cntSnapshots != null) {
	    // Encode field 'cntSnapshots'
	    try {
		Count item1 = data.cntSnapshots;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 32)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 32, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("cntSnapshots", "Count");
		throw ee;
	    }
	}
	// Encode field 'snapshots'
	try {
	    Snapshots item1 = data.snapshots;

	    nbits += Snapshots.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("snapshots", "SEQUENCE OF");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Encode the PDU using PER (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encode(PerCoder coder, OutputBitStream sink)
	    throws EncoderException
    {
	try {
	    return this.encodeValue(coder, sink, this);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext(null, "ProbeVehicleData");
	    throw ee;
	}
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static ProbeVehicleData decodeValue(PerCoder coder, InputBitStream source, ProbeVehicleData data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_segNum0 = source.readBit();
	boolean has_probeID0 = source.readBit();
	boolean has_cntSnapshots0 = source.readBit();
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
	if (has_segNum0) {
	    // Decode field 'segNum'
	    try {
		long temp1;

		if (data.segNum == null)
		    data.segNum = new ProbeSegmentNumber();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 32767);
		if (temp1 > 32767)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.segNum.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("segNum", "ProbeSegmentNumber");
		throw de;
	    }
	} else {
	    data.segNum = null;
	}
	if (has_probeID0) {
	    // Decode field 'probeID'
	    try {
		if (data.probeID == null)
		    data.probeID = new VehicleIdent();
		data.probeID.decodeValue(coder, source, data.probeID);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("probeID", "VehicleIdent");
		throw de;
	    }
	} else {
	    data.probeID = null;
	}
	// Decode field 'startVector'
	try {
	    if (data.startVector == null)
		data.startVector = new FullPositionVector();
	    data.startVector.decodeValue(coder, source, data.startVector);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("startVector", "FullPositionVector");
	    throw de;
	}
	// Decode field 'vehicleType'
	try {
	    int idx1;
	    VehicleType temp1;
	    boolean extroot1 = !source.readBit();

	    if (extroot1) {
		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 15);
		if (idx1 < 0 || idx1 > 15)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		temp1 = VehicleType.valueAt(idx1);
	    } else {
		idx1 = 16 + (int)coder.decodeNormallySmallNumber(source);
		if (idx1 < 0)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		temp1 = VehicleType.unknownEnumerator();
	    }
	    data.vehicleType = temp1;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("vehicleType", "VehicleType");
	    throw de;
	}
	if (has_cntSnapshots0) {
	    // Decode field 'cntSnapshots'
	    try {
		long temp1;

		if (data.cntSnapshots == null)
		    data.cntSnapshots = new Count();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 32);
		if (temp1 > 32)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.cntSnapshots.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("cntSnapshots", "Count");
		throw de;
	    }
	} else {
	    data.cntSnapshots = null;
	}
	// Decode field 'snapshots'
	try {
	    if (data.snapshots == null)
		data.snapshots = new Snapshots();
	    data.snapshots.decodeValue(coder, source, data.snapshots);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("snapshots", "SEQUENCE OF");
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
     * Decode the PDU using PER (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public AbstractData decode(PerCoder coder, InputBitStream source)
	    throws DecoderException
    {
	try {
	    this.decodeValue(coder, source, this);
	    return this;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext(null, "ProbeVehicleData");
	    throw de;
	}
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
	// Encode field 'segNum'
	try {
	    ProbeSegmentNumber item1 = this.segNum;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("segNum");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "segNum");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("segNum", "ProbeSegmentNumber");
	    throw ee;
	}
	// Encode field 'probeID'
	try {
	    VehicleIdent item1 = this.probeID;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("probeID");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "probeID");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("probeID", "VehicleIdent");
	    throw ee;
	}
	// Encode field 'startVector'
	try {
	    FullPositionVector item1 = this.startVector;

	    {
		sink.writeSeparator();
		sink.encodeKey("startVector");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("startVector", "FullPositionVector");
	    throw ee;
	}
	// Encode field 'vehicleType'
	try {
	    VehicleType item1 = this.vehicleType;

	    {
		sink.writeSeparator();
		sink.encodeKey("vehicleType");
		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else 
		    sink.writeString(item1.name());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("vehicleType", "VehicleType");
	    throw ee;
	}
	// Encode field 'cntSnapshots'
	try {
	    Count item1 = this.cntSnapshots;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("cntSnapshots");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "cntSnapshots");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("cntSnapshots", "Count");
	    throw ee;
	}
	// Encode field 'snapshots'
	try {
	    Snapshots item1 = this.snapshots;

	    {
		sink.writeSeparator();
		sink.encodeKey("snapshots");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("snapshots", "SEQUENCE OF");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Encode the PDU using JSON (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public void encode(JsonCoder coder, JsonWriter sink)
	    throws EncoderException
    {
	try {
	    this.encodeValue(coder, sink);

	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext(null, "ProbeVehicleData");
	    throw ee;
	}
    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public ProbeVehicleData decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[8];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		ProbeVehicleData.__Tag t_tag0 = ProbeVehicleData.__Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = ProbeVehicleData.__Tag._null_;
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
		    case __segNum:
		    // Decode field 'segNum'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.segNum == null)
				this.segNum = new ProbeSegmentNumber();
			    this.segNum.setValue(coder.decodeInteger(source));
			    present0[1] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("segNum", "ProbeSegmentNumber");
			throw de;
		    }
		    break;
		    case __probeID:
		    // Decode field 'probeID'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.probeID == null)
				this.probeID = new VehicleIdent();
			    this.probeID.decodeValue(coder, source);
			    present0[2] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("probeID", "VehicleIdent");
			throw de;
		    }
		    break;
		    case __startVector:
		    // Decode field 'startVector'
		    try {
			if (present0[3])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.startVector == null)
			    this.startVector = new FullPositionVector();
			this.startVector.decodeValue(coder, source);
			present0[3] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("startVector", "FullPositionVector");
			throw de;
		    }
		    break;
		    case __vehicleType:
		    // Decode field 'vehicleType'
		    try {
			String content1 = coder.decodeString(source);
			int idx1;
			VehicleType temp1;

			if (present0[4])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			idx1 = coder.resolveName(VehicleType.cConstantNameList, content1);
			if (idx1 < 0 )
			    temp1 = VehicleType.unknownEnumerator();
			else
			    temp1 = VehicleType.cNamedNumbers[idx1];
			this.vehicleType = temp1;
			present0[4] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("vehicleType", "VehicleType");
			throw de;
		    }
		    break;
		    case __cntSnapshots:
		    // Decode field 'cntSnapshots'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[5])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.cntSnapshots == null)
				this.cntSnapshots = new Count();
			    this.cntSnapshots.setValue(coder.decodeInteger(source));
			    present0[5] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("cntSnapshots", "Count");
			throw de;
		    }
		    break;
		    case __snapshots:
		    // Decode field 'snapshots'
		    try {
			if (present0[6])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.snapshots == null)
			    this.snapshots = new Snapshots();
			this.snapshots.decodeValue(coder, source);
			present0[6] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("snapshots", "SEQUENCE OF");
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
	    this.segNum = null;
	if (!present0[2])
	    this.probeID = null;
	if (!present0[3])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'startVector'");
	if (!present0[4])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'vehicleType'");
	if (!present0[5])
	    this.cntSnapshots = null;
	if (!present0[6])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'snapshots'");
	return this;
    }

    /**
     * Decode the PDU using JSON (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public AbstractData decode(JsonCoder coder, JsonReader source)
	    throws DecoderException
    {
	try {
	    this.decodeValue(coder, source);
	    return this;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext(null, "ProbeVehicleData");
	    throw de;
	}
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
	    writer.print("msgID ");
	    printer.print(this.msgID, writer, this.msgID.cConstantNameList);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.segNum != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("segNum ");
		writer.print(this.segNum.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.probeID != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("probeID ");
		this.probeID.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("startVector ");
	    this.startVector.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("vehicleType ");
	    printer.print(this.vehicleType, writer, this.vehicleType.cConstantNameList);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.cntSnapshots != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("cntSnapshots ");
		writer.print(this.cntSnapshots.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("snapshots ");
	    {
		java.util.ArrayList<Snapshot> temp1 = this.snapshots.elements;
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
	printer.undent();
	printer.newLine(writer);
	writer.print('}');
    }

    /**
     * Convert the PDU value to a string. If the conversion is aborted due an error the method returns null.
     */
    public String toString()
    {
	try {
	    return (new DataPrinter()).print(this);
	} catch (DataPrinterException e) {
	    return null;
	}
    }

    /**
     * Return the ASN.1 type name.
     */
    public String getTypeName()
    {
	return "ProbeVehicleData";
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((ProbeVehicleData)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((ProbeVehicleData)that);
    }
    
    public boolean equalTo(ProbeVehicleData that) {
	if (!this.msgID.equalTo(that.msgID))
	    return false;
	if (this.segNum != null && that.segNum != null) {
	    if (!this.segNum.equalTo(that.segNum))
		return false;
	}
	if (this.probeID != null && that.probeID != null) {
	    if (!this.probeID.equalTo(that.probeID))
		return false;
	}
	if (!this.startVector.equalTo(that.startVector))
	    return false;
	if (!this.vehicleType.equalTo(that.vehicleType))
	    return false;
	if (this.cntSnapshots != null && that.cntSnapshots != null) {
	    if (!this.cntSnapshots.equalTo(that.cntSnapshots))
		return false;
	}
	if (!this.snapshots.equalTo(that.snapshots))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public ProbeVehicleData clone() {
	ProbeVehicleData copy = (ProbeVehicleData)super.clone();
	copy.msgID = msgID.clone();
	if (segNum != null) {
	    copy.segNum = segNum.clone();
	}
	if (probeID != null) {
	    copy.probeID = probeID.clone();
	}
	copy.startVector = startVector.clone();
	copy.vehicleType = vehicleType.clone();
	if (cntSnapshots != null) {
	    copy.cntSnapshots = cntSnapshots.clone();
	}
	copy.snapshots = snapshots.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.msgID != null ? this.msgID.hashCode() : 0);
	hash = 41 * hash + (this.segNum != null ? this.segNum.hashCode() : 0);
	hash = 41 * hash + (this.probeID != null ? this.probeID.hashCode() : 0);
	hash = 41 * hash + (this.startVector != null ? this.startVector.hashCode() : 0);
	hash = 41 * hash + (this.vehicleType != null ? this.vehicleType.hashCode() : 0);
	hash = 41 * hash + (this.cntSnapshots != null ? this.cntSnapshots.hashCode() : 0);
	hash = 41 * hash + (this.snapshots != null ? this.snapshots.hashCode() : 0);
	return hash;
    }
    /**
     * The type is a PDU.
     */
    public boolean isPDU()
    {
	return true;
    }
    
    /**
     * This member is reserved for internal use and must not be used in the application code.
     */
    public static final ASN1Type _type = new ASN1Type() {
	public AbstractData newInstance()
	{
	    return new ProbeVehicleData();
	}
    };
    
} // End class definition for ProbeVehicleData
