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
/* Created: Mon Dec 14 18:10:04 2015 */
/* ASN.1 Compiler for Java version: 6.2 */
/* ASN.1 compiler options and file names specified:
 * -toed -output com.bah.ode.asn.oss -per -uper -ber -der -root
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
import com.oss.coders.OutputBitStream;
import com.oss.coders.per.PEREncodable;
import com.oss.coders.InputBitStream;
import com.oss.coders.per.PERDecodable;
import com.oss.coders.per.PerCoder;

/**
 * Define the ASN1 Type BasicSafetyMessageVerbose from ASN1 Module DSRC.
 * @see Sequence
 */

public class BasicSafetyMessageVerbose extends Sequence implements BEREncodable, BERDecodable, DEREncodable, PEREncodable, PERDecodable {
    public DSRCmsgID msgID;
    public MsgCount msgCnt;
    public TemporaryID id;
    public DSecond secMark;
    public Latitude lat;
    public Longitude _long;
    public Elevation elev;
    public PositionalAccuracy accuracy;
    public TransmissionAndSpeed speed;
    public Heading heading;
    public SteeringWheelAngle angle;
    public AccelerationSet4Way accelSet;
    public BrakeSystemStatus brakes;
    public VehicleSize size;
    public VehicleSafetyExtension safetyExt;
    public VehicleStatus status;
    
    /**
     * The default constructor.
     */
    public BasicSafetyMessageVerbose()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public BasicSafetyMessageVerbose(DSRCmsgID msgID, MsgCount msgCnt, 
		    TemporaryID id, DSecond secMark, Latitude lat, 
		    Longitude _long, Elevation elev, 
		    PositionalAccuracy accuracy, TransmissionAndSpeed speed, 
		    Heading heading, SteeringWheelAngle angle, 
		    AccelerationSet4Way accelSet, BrakeSystemStatus brakes, 
		    VehicleSize size, VehicleSafetyExtension safetyExt, 
		    VehicleStatus status)
    {
	setMsgID(msgID);
	setMsgCnt(msgCnt);
	setId(id);
	setSecMark(secMark);
	setLat(lat);
	set_long(_long);
	setElev(elev);
	setAccuracy(accuracy);
	setSpeed(speed);
	setHeading(heading);
	setAngle(angle);
	setAccelSet(accelSet);
	setBrakes(brakes);
	setSize(size);
	setSafetyExt(safetyExt);
	setStatus(status);
    }
    
    /**
     * Construct with required components.
     */
    public BasicSafetyMessageVerbose(DSRCmsgID msgID, MsgCount msgCnt, 
		    TemporaryID id, DSecond secMark, Latitude lat, 
		    Longitude _long, Elevation elev, 
		    PositionalAccuracy accuracy, TransmissionAndSpeed speed, 
		    Heading heading, SteeringWheelAngle angle, 
		    AccelerationSet4Way accelSet, BrakeSystemStatus brakes, 
		    VehicleSize size)
    {
	setMsgID(msgID);
	setMsgCnt(msgCnt);
	setId(id);
	setSecMark(secMark);
	setLat(lat);
	set_long(_long);
	setElev(elev);
	setAccuracy(accuracy);
	setSpeed(speed);
	setHeading(heading);
	setAngle(angle);
	setAccelSet(accelSet);
	setBrakes(brakes);
	setSize(size);
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
    
    
    // Methods for field "id"
    public TemporaryID getId()
    {
	return this.id;
    }
    
    public void setId(TemporaryID id)
    {
	this.id = id;
    }
    
    
    // Methods for field "secMark"
    public DSecond getSecMark()
    {
	return this.secMark;
    }
    
    public void setSecMark(DSecond secMark)
    {
	this.secMark = secMark;
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
    
    
    // Methods for field "elev"
    public Elevation getElev()
    {
	return this.elev;
    }
    
    public void setElev(Elevation elev)
    {
	this.elev = elev;
    }
    
    
    // Methods for field "accuracy"
    public PositionalAccuracy getAccuracy()
    {
	return this.accuracy;
    }
    
    public void setAccuracy(PositionalAccuracy accuracy)
    {
	this.accuracy = accuracy;
    }
    
    
    // Methods for field "speed"
    public TransmissionAndSpeed getSpeed()
    {
	return this.speed;
    }
    
    public void setSpeed(TransmissionAndSpeed speed)
    {
	this.speed = speed;
    }
    
    
    // Methods for field "heading"
    public Heading getHeading()
    {
	return this.heading;
    }
    
    public void setHeading(Heading heading)
    {
	this.heading = heading;
    }
    
    
    // Methods for field "angle"
    public SteeringWheelAngle getAngle()
    {
	return this.angle;
    }
    
    public void setAngle(SteeringWheelAngle angle)
    {
	this.angle = angle;
    }
    
    
    // Methods for field "accelSet"
    public AccelerationSet4Way getAccelSet()
    {
	return this.accelSet;
    }
    
    public void setAccelSet(AccelerationSet4Way accelSet)
    {
	this.accelSet = accelSet;
    }
    
    
    // Methods for field "brakes"
    public BrakeSystemStatus getBrakes()
    {
	return this.brakes;
    }
    
    public void setBrakes(BrakeSystemStatus brakes)
    {
	this.brakes = brakes;
    }
    
    
    // Methods for field "size"
    public VehicleSize getSize()
    {
	return this.size;
    }
    
    public void setSize(VehicleSize size)
    {
	this.size = size;
    }
    
    
    // Methods for field "safetyExt"
    public VehicleSafetyExtension getSafetyExt()
    {
	return this.safetyExt;
    }
    
    public void setSafetyExt(VehicleSafetyExtension safetyExt)
    {
	this.safetyExt = safetyExt;
    }
    
    public boolean hasSafetyExt()
    {
	return (safetyExt != null);
    }
    
    public void deleteSafetyExt()
    {
	safetyExt = null;
    }
    
    
    // Methods for field "status"
    public VehicleStatus getStatus()
    {
	return this.status;
    }
    
    public void setStatus(VehicleStatus status)
    {
	this.status = status;
    }
    
    public boolean hasStatus()
    {
	return (status != null);
    }
    
    public void deleteStatus()
    {
	status = null;
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
	    BasicSafetyMessageVerbose temp0 = this;

	    if (temp0.status != null) {
		try {
		    len0 += sink.encodeLengthTag(temp0.status.encodeValue(coder, sink), 0xAF);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("status", "VehicleStatus");
		    throw ee;
		}
	    }
	    if (temp0.safetyExt != null) {
		try {
		    len0 += sink.encodeLengthTag(temp0.safetyExt.encodeValue(coder, sink), 0xAE);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("safetyExt", "VehicleSafetyExtension");
		    throw ee;
		}
	    }
	    try {
		len0 += sink.encodeLengthTag(temp0.size.encodeValue(coder, sink), 0xAD);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("size", "VehicleSize");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.brakes.byteArrayValue()), 0x8C);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("brakes", "BrakeSystemStatus");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.accelSet.byteArrayValue()), 0x8B);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("accelSet", "AccelerationSet4Way");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.angle.byteArrayValue()), 0x8A);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("angle", "SteeringWheelAngle");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.heading, sink), 0x89);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("heading", "Heading");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.speed.byteArrayValue()), 0x88);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("speed", "TransmissionAndSpeed");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.accuracy.byteArrayValue()), 0x87);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("accuracy", "PositionalAccuracy");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.elev.byteArrayValue()), 0x86);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("elev", "Elevation");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0._long, sink), 0x85);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("long", "Longitude");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.lat, sink), 0x84);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("lat", "Latitude");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.secMark, sink), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("secMark", "DSecond");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.id.byteArrayValue()), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("id", "TemporaryID");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.msgCnt, sink), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msgCnt", "MsgCount");
		throw ee;
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
	    ee.appendFieldContext(null, "BasicSafetyMessageVerbose");
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
	this.safetyExt = null;
	this.status = null;
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
		    if (tag != 0x81)
			source.raiseTagMismatchException(tag);
		    try {
			this.msgCnt = new MsgCount(source.decodeLong());
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("msgCnt", "MsgCount");
			throw ee;
		    }
		    tag = source.decodeTagLength();
		    if (tag != 0x82 && tag != 0xA2)
			source.raiseTagMismatchException(tag);
		    try {
			this.id = new TemporaryID(coder.decodeOctetString(source));
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("id", "TemporaryID");
			throw ee;
		    }
		    tag = source.decodeTagLength();
		    if (tag != 0x83)
			source.raiseTagMismatchException(tag);
		    try {
			this.secMark = new DSecond(source.decodeLong());
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("secMark", "DSecond");
			throw ee;
		    }
		    tag = source.decodeTagLength();
		    if (tag != 0x84)
			source.raiseTagMismatchException(tag);
		    try {
			this.lat = new Latitude(source.decodeLong());
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("lat", "Latitude");
			throw ee;
		    }
		    tag = source.decodeTagLength();
		    if (tag != 0x85)
			source.raiseTagMismatchException(tag);
		    try {
			this._long = new Longitude(source.decodeLong());
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("long", "Longitude");
			throw ee;
		    }
		    tag = source.decodeTagLength();
		    if (tag != 0x86 && tag != 0xA6)
			source.raiseTagMismatchException(tag);
		    try {
			this.elev = new Elevation(coder.decodeOctetString(source));
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("elev", "Elevation");
			throw ee;
		    }
		    tag = source.decodeTagLength();
		    if (tag != 0x87 && tag != 0xA7)
			source.raiseTagMismatchException(tag);
		    try {
			this.accuracy = new PositionalAccuracy(coder.decodeOctetString(source));
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("accuracy", "PositionalAccuracy");
			throw ee;
		    }
		    tag = source.decodeTagLength();
		    if (tag != 0x88 && tag != 0xA8)
			source.raiseTagMismatchException(tag);
		    try {
			this.speed = new TransmissionAndSpeed(coder.decodeOctetString(source));
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("speed", "TransmissionAndSpeed");
			throw ee;
		    }
		    tag = source.decodeTagLength();
		    if (tag != 0x89)
			source.raiseTagMismatchException(tag);
		    try {
			this.heading = new Heading(source.decodeLong());
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("heading", "Heading");
			throw ee;
		    }
		    tag = source.decodeTagLength();
		    if (tag != 0x8A && tag != 0xAA)
			source.raiseTagMismatchException(tag);
		    try {
			this.angle = new SteeringWheelAngle(coder.decodeOctetString(source));
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("angle", "SteeringWheelAngle");
			throw ee;
		    }
		    tag = source.decodeTagLength();
		    if (tag != 0x8B && tag != 0xAB)
			source.raiseTagMismatchException(tag);
		    try {
			this.accelSet = new AccelerationSet4Way(coder.decodeOctetString(source));
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("accelSet", "AccelerationSet4Way");
			throw ee;
		    }
		    tag = source.decodeTagLength();
		    if (tag != 0x8C && tag != 0xAC)
			source.raiseTagMismatchException(tag);
		    try {
			this.brakes = new BrakeSystemStatus(coder.decodeOctetString(source));
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("brakes", "BrakeSystemStatus");
			throw ee;
		    }
		    tag = source.decodeTagLength();
		    if (tag != 0xAD)
			source.raiseTagMismatchException(tag);
		    try {
			this.size = new VehicleSize();
			this.size.decodeValue(coder, source);
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("size", "VehicleSize");
			throw ee;
		    }
		    if (source.position() >= end_pos0)
			break;
		    tag = source.decodeTagLength();
		    if (tag == 0)
			break;
		    if (tag == 0xAE) {
			try {
			    this.safetyExt = new VehicleSafetyExtension();
			    this.safetyExt.decodeValue(coder, source);
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("safetyExt", "VehicleSafetyExtension");
			    throw ee;
			}
			if (source.position() >= end_pos0)
			    break;
			tag = source.decodeTagLength();
			if (tag == 0)
			    break;
		    }
		    if (tag == 0xAF) {
			try {
			    this.status = new VehicleStatus();
			    this.status.decodeValue(coder, source);
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("status", "VehicleStatus");
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
			    ee.appendExtensionContext("BasicSafetyMessageVerbose", -1);
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
	    ee.appendFieldContext(null, "BasicSafetyMessageVerbose");
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
	    BasicSafetyMessageVerbose temp0 = this;

	    if (temp0.status != null) {
		try {
		    len0 += sink.encodeLengthTag(temp0.status.encodeValue(coder, sink), 0xAF);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("status", "VehicleStatus");
		    throw ee;
		}
	    }
	    if (temp0.safetyExt != null) {
		try {
		    len0 += sink.encodeLengthTag(temp0.safetyExt.encodeValue(coder, sink), 0xAE);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("safetyExt", "VehicleSafetyExtension");
		    throw ee;
		}
	    }
	    try {
		len0 += sink.encodeLengthTag(temp0.size.encodeValue(coder, sink), 0xAD);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("size", "VehicleSize");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.brakes.byteArrayValue()), 0x8C);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("brakes", "BrakeSystemStatus");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.accelSet.byteArrayValue()), 0x8B);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("accelSet", "AccelerationSet4Way");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.angle.byteArrayValue()), 0x8A);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("angle", "SteeringWheelAngle");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.heading, sink), 0x89);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("heading", "Heading");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.speed.byteArrayValue()), 0x88);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("speed", "TransmissionAndSpeed");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.accuracy.byteArrayValue()), 0x87);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("accuracy", "PositionalAccuracy");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.elev.byteArrayValue()), 0x86);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("elev", "Elevation");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0._long, sink), 0x85);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("long", "Longitude");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.lat, sink), 0x84);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("lat", "Latitude");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.secMark, sink), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("secMark", "DSecond");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.id.byteArrayValue()), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("id", "TemporaryID");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.msgCnt, sink), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msgCnt", "MsgCount");
		throw ee;
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
	    ee.appendFieldContext(null, "BasicSafetyMessageVerbose");
	    throw ee;
	}
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, BasicSafetyMessageVerbose data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.safetyExt != null);
	sink.writeBit(data.status != null);
	nbits += 3;
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
	// Encode field 'id'
	try {
	    TemporaryID item1 = data.id;
	    int len1 = item1.getSize();

	    if (len1 != 4)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 4, 4, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("id", "TemporaryID");
	    throw ee;
	}
	// Encode field 'secMark'
	try {
	    DSecond item1 = data.secMark;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 65535)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 65535, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("secMark", "DSecond");
	    throw ee;
	}
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
	// Encode field 'elev'
	try {
	    Elevation item1 = data.elev;
	    int len1 = item1.getSize();

	    if (len1 != 2)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 2, 2, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("elev", "Elevation");
	    throw ee;
	}
	// Encode field 'accuracy'
	try {
	    PositionalAccuracy item1 = data.accuracy;
	    int len1 = item1.getSize();

	    if (len1 != 4)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 4, 4, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("accuracy", "PositionalAccuracy");
	    throw ee;
	}
	// Encode field 'speed'
	try {
	    TransmissionAndSpeed item1 = data.speed;
	    int len1 = item1.getSize();

	    if (len1 != 2)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 2, 2, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("speed", "TransmissionAndSpeed");
	    throw ee;
	}
	// Encode field 'heading'
	try {
	    Heading item1 = data.heading;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 28800)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 28800, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("heading", "Heading");
	    throw ee;
	}
	// Encode field 'angle'
	try {
	    SteeringWheelAngle item1 = data.angle;
	    int len1 = item1.getSize();

	    if (len1 != 1)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 1, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("angle", "SteeringWheelAngle");
	    throw ee;
	}
	// Encode field 'accelSet'
	try {
	    AccelerationSet4Way item1 = data.accelSet;
	    int len1 = item1.getSize();

	    if (len1 != 7)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 7, 7, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("accelSet", "AccelerationSet4Way");
	    throw ee;
	}
	// Encode field 'brakes'
	try {
	    BrakeSystemStatus item1 = data.brakes;
	    int len1 = item1.getSize();

	    if (len1 != 2)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 2, 2, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("brakes", "BrakeSystemStatus");
	    throw ee;
	}
	// Encode field 'size'
	try {
	    VehicleSize item1 = data.size;

	    nbits += VehicleSize.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("size", "VehicleSize");
	    throw ee;
	}
	if (data.safetyExt != null) {
	    // Encode field 'safetyExt'
	    try {
		VehicleSafetyExtension item1 = data.safetyExt;

		nbits += VehicleSafetyExtension.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("safetyExt", "VehicleSafetyExtension");
		throw ee;
	    }
	}
	if (data.status != null) {
	    // Encode field 'status'
	    try {
		VehicleStatus item1 = data.status;

		nbits += VehicleStatus.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("status", "VehicleStatus");
		throw ee;
	    }
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
	    ee.appendFieldContext(null, "BasicSafetyMessageVerbose");
	    throw ee;
	}
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static BasicSafetyMessageVerbose decodeValue(PerCoder coder, InputBitStream source, BasicSafetyMessageVerbose data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_safetyExt0 = source.readBit();
	boolean has_status0 = source.readBit();
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
	// Decode field 'id'
	try {
	    data.id = new TemporaryID(com.oss.coders.per.PerOctets.decode(coder, source, 4, 4));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("id", "TemporaryID");
	    throw de;
	}
	// Decode field 'secMark'
	try {
	    long temp1;

	    if (data.secMark == null)
		data.secMark = new DSecond();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 65535);
	    if (temp1 > 65535)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.secMark.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("secMark", "DSecond");
	    throw de;
	}
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
	// Decode field 'elev'
	try {
	    data.elev = new Elevation(com.oss.coders.per.PerOctets.decode(coder, source, 2, 2));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("elev", "Elevation");
	    throw de;
	}
	// Decode field 'accuracy'
	try {
	    data.accuracy = new PositionalAccuracy(com.oss.coders.per.PerOctets.decode(coder, source, 4, 4));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("accuracy", "PositionalAccuracy");
	    throw de;
	}
	// Decode field 'speed'
	try {
	    data.speed = new TransmissionAndSpeed(com.oss.coders.per.PerOctets.decode(coder, source, 2, 2));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("speed", "TransmissionAndSpeed");
	    throw de;
	}
	// Decode field 'heading'
	try {
	    long temp1;

	    if (data.heading == null)
		data.heading = new Heading();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 28800);
	    if (temp1 > 28800)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.heading.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("heading", "Heading");
	    throw de;
	}
	// Decode field 'angle'
	try {
	    data.angle = new SteeringWheelAngle(com.oss.coders.per.PerOctets.decode(coder, source, 1, 1));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("angle", "SteeringWheelAngle");
	    throw de;
	}
	// Decode field 'accelSet'
	try {
	    data.accelSet = new AccelerationSet4Way(com.oss.coders.per.PerOctets.decode(coder, source, 7, 7));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("accelSet", "AccelerationSet4Way");
	    throw de;
	}
	// Decode field 'brakes'
	try {
	    data.brakes = new BrakeSystemStatus(com.oss.coders.per.PerOctets.decode(coder, source, 2, 2));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("brakes", "BrakeSystemStatus");
	    throw de;
	}
	// Decode field 'size'
	try {
	    if (data.size == null)
		data.size = new VehicleSize();
	    data.size.decodeValue(coder, source, data.size);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("size", "VehicleSize");
	    throw de;
	}
	if (has_safetyExt0) {
	    // Decode field 'safetyExt'
	    try {
		if (data.safetyExt == null)
		    data.safetyExt = new VehicleSafetyExtension();
		data.safetyExt.decodeValue(coder, source, data.safetyExt);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("safetyExt", "VehicleSafetyExtension");
		throw de;
	    }
	} else {
	    data.safetyExt = null;
	}
	if (has_status0) {
	    // Decode field 'status'
	    try {
		if (data.status == null)
		    data.status = new VehicleStatus();
		data.status.decodeValue(coder, source, data.status);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("status", "VehicleStatus");
		throw de;
	    }
	} else {
	    data.status = null;
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
	    de.appendFieldContext(null, "BasicSafetyMessageVerbose");
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
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("msgCnt ");
	    writer.print(this.msgCnt.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("id ");
	    printer.print(this.id, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("secMark ");
	    writer.print(this.secMark.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
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
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("elev ");
	    printer.print(this.elev, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("accuracy ");
	    printer.print(this.accuracy, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("speed ");
	    printer.print(this.speed, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("heading ");
	    writer.print(this.heading.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("angle ");
	    printer.print(this.angle, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("accelSet ");
	    printer.print(this.accelSet, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("brakes ");
	    printer.print(this.brakes, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("size ");
	    this.size.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.safetyExt != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("safetyExt ");
		this.safetyExt.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.status != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("status ");
		this.status.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	printer.undent();
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
	return "BasicSafetyMessageVerbose";
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((BasicSafetyMessageVerbose)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((BasicSafetyMessageVerbose)that);
    }
    
    public boolean equalTo(BasicSafetyMessageVerbose that) {
	if (!this.msgID.equalTo(that.msgID))
	    return false;
	if (!this.msgCnt.equalTo(that.msgCnt))
	    return false;
	if (!this.id.equalTo(that.id))
	    return false;
	if (!this.secMark.equalTo(that.secMark))
	    return false;
	if (!this.lat.equalTo(that.lat))
	    return false;
	if (!this._long.equalTo(that._long))
	    return false;
	if (!this.elev.equalTo(that.elev))
	    return false;
	if (!this.accuracy.equalTo(that.accuracy))
	    return false;
	if (!this.speed.equalTo(that.speed))
	    return false;
	if (!this.heading.equalTo(that.heading))
	    return false;
	if (!this.angle.equalTo(that.angle))
	    return false;
	if (!this.accelSet.equalTo(that.accelSet))
	    return false;
	if (!this.brakes.equalTo(that.brakes))
	    return false;
	if (!this.size.equalTo(that.size))
	    return false;
	if (this.safetyExt != null && that.safetyExt != null) {
	    if (!this.safetyExt.equalTo(that.safetyExt))
		return false;
	}
	if (this.status != null && that.status != null) {
	    if (!this.status.equalTo(that.status))
		return false;
	}
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public BasicSafetyMessageVerbose clone() {
	BasicSafetyMessageVerbose copy = (BasicSafetyMessageVerbose)super.clone();
	copy.msgID = msgID.clone();
	copy.msgCnt = msgCnt.clone();
	copy.id = id.clone();
	copy.secMark = secMark.clone();
	copy.lat = lat.clone();
	copy._long = _long.clone();
	copy.elev = elev.clone();
	copy.accuracy = accuracy.clone();
	copy.speed = speed.clone();
	copy.heading = heading.clone();
	copy.angle = angle.clone();
	copy.accelSet = accelSet.clone();
	copy.brakes = brakes.clone();
	copy.size = size.clone();
	if (safetyExt != null) {
	    copy.safetyExt = safetyExt.clone();
	}
	if (status != null) {
	    copy.status = status.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.msgID != null ? this.msgID.hashCode() : 0);
	hash = 41 * hash + (this.msgCnt != null ? this.msgCnt.hashCode() : 0);
	hash = 41 * hash + (this.id != null ? this.id.hashCode() : 0);
	hash = 41 * hash + (this.secMark != null ? this.secMark.hashCode() : 0);
	hash = 41 * hash + (this.lat != null ? this.lat.hashCode() : 0);
	hash = 41 * hash + (this._long != null ? this._long.hashCode() : 0);
	hash = 41 * hash + (this.elev != null ? this.elev.hashCode() : 0);
	hash = 41 * hash + (this.accuracy != null ? this.accuracy.hashCode() : 0);
	hash = 41 * hash + (this.speed != null ? this.speed.hashCode() : 0);
	hash = 41 * hash + (this.heading != null ? this.heading.hashCode() : 0);
	hash = 41 * hash + (this.angle != null ? this.angle.hashCode() : 0);
	hash = 41 * hash + (this.accelSet != null ? this.accelSet.hashCode() : 0);
	hash = 41 * hash + (this.brakes != null ? this.brakes.hashCode() : 0);
	hash = 41 * hash + (this.size != null ? this.size.hashCode() : 0);
	hash = 41 * hash + (this.safetyExt != null ? this.safetyExt.hashCode() : 0);
	hash = 41 * hash + (this.status != null ? this.status.hashCode() : 0);
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
	    return new BasicSafetyMessageVerbose();
	}
    };
    
} // End class definition for BasicSafetyMessageVerbose
