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
 * Define the ASN1 Type ProbeVehicleData from ASN1 Module DSRC.
 * @see Sequence
 */

public class ProbeVehicleData extends Sequence implements BEREncodable, BERDecodable, DEREncodable, PEREncodable, PERDecodable {
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
		    Snapshot.decodeValue(coder, source, item1);
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

    } // End class definition for Snapshots

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

	boolean has_segNum0 = data.segNum != null;
	boolean has_probeID0 = data.probeID != null;
	boolean has_cntSnapshots0 = data.cntSnapshots != null;
	sink.writeBit(false); ++nbits;
	sink.writeBit(has_segNum0); ++nbits;
	sink.writeBit(has_probeID0); ++nbits;
	sink.writeBit(has_cntSnapshots0); ++nbits;
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
	if (has_segNum0) {
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
	if (has_probeID0) {
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
	if (has_cntSnapshots0) {
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
	    return ProbeVehicleData.encodeValue(coder, sink, this);
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
	int idx0;
	InputBitStream bitstream0 = null;

	boolean has_segNum0 = source.readBit();
	boolean has_probeID0 = source.readBit();
	boolean has_cntSnapshots0 = source.readBit();
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
		VehicleIdent.decodeValue(coder, source, data.probeID);
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
	    FullPositionVector.decodeValue(coder, source, data.startVector);
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
	    Snapshots.decodeValue(coder, source, data.snapshots);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("snapshots", "SEQUENCE OF");
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
     * Decode the PDU using PER (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public AbstractData decode(PerCoder coder, InputBitStream source)
	    throws DecoderException
    {
	try {
	    ProbeVehicleData.decodeValue(coder, source, this);
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
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("msgID ");
	    printer.print(this.msgID, writer, this.msgID.cConstantNameList);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.segNum != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("segNum ");
		writer.print(this.segNum.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.probeID != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("probeID ");
		this.probeID.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("startVector ");
	    this.startVector.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("vehicleType ");
	    printer.print(this.vehicleType, writer, this.vehicleType.cConstantNameList);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.cntSnapshots != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("cntSnapshots ");
		writer.print(this.cntSnapshots.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
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
	if (comma0)
	    printer.newLine(writer);
	writer.print('}');
    }

    /**
     * Convert the PDU value to a string.
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