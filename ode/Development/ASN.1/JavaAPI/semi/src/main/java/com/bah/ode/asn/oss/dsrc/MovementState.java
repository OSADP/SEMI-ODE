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
 * Define the ASN1 Type MovementState from ASN1 Module DSRC.
 * @see Sequence
 */

public class MovementState extends Sequence {
    public DescriptiveName movementName;
    public LaneCount laneCnt;
    public LaneSet laneSet;
    public SignalLightState currState;
    public PedestrianSignalState pedState;
    public SpecialSignalState specialState;
    public TimeMark timeToChange;
    public StateConfidence stateConfidence;
    public SignalLightState yellState;
    public PedestrianSignalState yellPedState;
    public TimeMark yellTimeToChange;
    public StateConfidence yellStateConfidence;
    public ObjectCount vehicleCount;
    public PedestrianDetect pedDetect;
    public ObjectCount pedCount;
    
    /**
     * The default constructor.
     */
    public MovementState()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MovementState(DescriptiveName movementName, LaneCount laneCnt, 
		    LaneSet laneSet, SignalLightState currState, 
		    PedestrianSignalState pedState, 
		    SpecialSignalState specialState, TimeMark timeToChange, 
		    StateConfidence stateConfidence, 
		    SignalLightState yellState, 
		    PedestrianSignalState yellPedState, 
		    TimeMark yellTimeToChange, 
		    StateConfidence yellStateConfidence, 
		    ObjectCount vehicleCount, PedestrianDetect pedDetect, 
		    ObjectCount pedCount)
    {
	setMovementName(movementName);
	setLaneCnt(laneCnt);
	setLaneSet(laneSet);
	setCurrState(currState);
	setPedState(pedState);
	setSpecialState(specialState);
	setTimeToChange(timeToChange);
	setStateConfidence(stateConfidence);
	setYellState(yellState);
	setYellPedState(yellPedState);
	setYellTimeToChange(yellTimeToChange);
	setYellStateConfidence(yellStateConfidence);
	setVehicleCount(vehicleCount);
	setPedDetect(pedDetect);
	setPedCount(pedCount);
    }
    
    /**
     * Construct with required components.
     */
    public MovementState(LaneSet laneSet, TimeMark timeToChange)
    {
	setLaneSet(laneSet);
	setTimeToChange(timeToChange);
    }
    
    
    // Methods for field "movementName"
    public DescriptiveName getMovementName()
    {
	return this.movementName;
    }
    
    public void setMovementName(DescriptiveName movementName)
    {
	this.movementName = movementName;
    }
    
    public boolean hasMovementName()
    {
	return (movementName != null);
    }
    
    public void deleteMovementName()
    {
	movementName = null;
    }
    
    
    // Methods for field "laneCnt"
    public LaneCount getLaneCnt()
    {
	return this.laneCnt;
    }
    
    public void setLaneCnt(LaneCount laneCnt)
    {
	this.laneCnt = laneCnt;
    }
    
    public boolean hasLaneCnt()
    {
	return (laneCnt != null);
    }
    
    public void deleteLaneCnt()
    {
	laneCnt = null;
    }
    
    
    // Methods for field "laneSet"
    public LaneSet getLaneSet()
    {
	return this.laneSet;
    }
    
    public void setLaneSet(LaneSet laneSet)
    {
	this.laneSet = laneSet;
    }
    
    
    // Methods for field "currState"
    public SignalLightState getCurrState()
    {
	return this.currState;
    }
    
    public void setCurrState(SignalLightState currState)
    {
	this.currState = currState;
    }
    
    public boolean hasCurrState()
    {
	return (currState != null);
    }
    
    public void deleteCurrState()
    {
	currState = null;
    }
    
    
    // Methods for field "pedState"
    public PedestrianSignalState getPedState()
    {
	return this.pedState;
    }
    
    public void setPedState(PedestrianSignalState pedState)
    {
	this.pedState = pedState;
    }
    
    public boolean hasPedState()
    {
	return (pedState != null);
    }
    
    public void deletePedState()
    {
	pedState = null;
    }
    
    
    // Methods for field "specialState"
    public SpecialSignalState getSpecialState()
    {
	return this.specialState;
    }
    
    public void setSpecialState(SpecialSignalState specialState)
    {
	this.specialState = specialState;
    }
    
    public boolean hasSpecialState()
    {
	return (specialState != null);
    }
    
    public void deleteSpecialState()
    {
	specialState = null;
    }
    
    
    // Methods for field "timeToChange"
    public TimeMark getTimeToChange()
    {
	return this.timeToChange;
    }
    
    public void setTimeToChange(TimeMark timeToChange)
    {
	this.timeToChange = timeToChange;
    }
    
    
    // Methods for field "stateConfidence"
    public StateConfidence getStateConfidence()
    {
	return this.stateConfidence;
    }
    
    public void setStateConfidence(StateConfidence stateConfidence)
    {
	this.stateConfidence = stateConfidence;
    }
    
    public boolean hasStateConfidence()
    {
	return (stateConfidence != null);
    }
    
    public void deleteStateConfidence()
    {
	stateConfidence = null;
    }
    
    
    // Methods for field "yellState"
    public SignalLightState getYellState()
    {
	return this.yellState;
    }
    
    public void setYellState(SignalLightState yellState)
    {
	this.yellState = yellState;
    }
    
    public boolean hasYellState()
    {
	return (yellState != null);
    }
    
    public void deleteYellState()
    {
	yellState = null;
    }
    
    
    // Methods for field "yellPedState"
    public PedestrianSignalState getYellPedState()
    {
	return this.yellPedState;
    }
    
    public void setYellPedState(PedestrianSignalState yellPedState)
    {
	this.yellPedState = yellPedState;
    }
    
    public boolean hasYellPedState()
    {
	return (yellPedState != null);
    }
    
    public void deleteYellPedState()
    {
	yellPedState = null;
    }
    
    
    // Methods for field "yellTimeToChange"
    public TimeMark getYellTimeToChange()
    {
	return this.yellTimeToChange;
    }
    
    public void setYellTimeToChange(TimeMark yellTimeToChange)
    {
	this.yellTimeToChange = yellTimeToChange;
    }
    
    public boolean hasYellTimeToChange()
    {
	return (yellTimeToChange != null);
    }
    
    public void deleteYellTimeToChange()
    {
	yellTimeToChange = null;
    }
    
    
    // Methods for field "yellStateConfidence"
    public StateConfidence getYellStateConfidence()
    {
	return this.yellStateConfidence;
    }
    
    public void setYellStateConfidence(StateConfidence yellStateConfidence)
    {
	this.yellStateConfidence = yellStateConfidence;
    }
    
    public boolean hasYellStateConfidence()
    {
	return (yellStateConfidence != null);
    }
    
    public void deleteYellStateConfidence()
    {
	yellStateConfidence = null;
    }
    
    
    // Methods for field "vehicleCount"
    public ObjectCount getVehicleCount()
    {
	return this.vehicleCount;
    }
    
    public void setVehicleCount(ObjectCount vehicleCount)
    {
	this.vehicleCount = vehicleCount;
    }
    
    public boolean hasVehicleCount()
    {
	return (vehicleCount != null);
    }
    
    public void deleteVehicleCount()
    {
	vehicleCount = null;
    }
    
    
    // Methods for field "pedDetect"
    public PedestrianDetect getPedDetect()
    {
	return this.pedDetect;
    }
    
    public void setPedDetect(PedestrianDetect pedDetect)
    {
	this.pedDetect = pedDetect;
    }
    
    public boolean hasPedDetect()
    {
	return (pedDetect != null);
    }
    
    public void deletePedDetect()
    {
	pedDetect = null;
    }
    
    
    // Methods for field "pedCount"
    public ObjectCount getPedCount()
    {
	return this.pedCount;
    }
    
    public void setPedCount(ObjectCount pedCount)
    {
	this.pedCount = pedCount;
    }
    
    public boolean hasPedCount()
    {
	return (pedCount != null);
    }
    
    public void deletePedCount()
    {
	pedCount = null;
    }
    
    
    /**
     * Effective permitted alphabet (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public static final EPAInfo _cEPAInfo_movementName = 
	com.bah.ode.asn.oss.dsrc.DescriptiveName._cEPAInfo_;
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     */
    public static enum __Tag
    {
	__movementName("movementName"),
	__laneCnt("laneCnt"),
	__laneSet("laneSet"),
	__currState("currState"),
	__pedState("pedState"),
	__specialState("specialState"),
	__timeToChange("timeToChange"),
	__stateConfidence("stateConfidence"),
	__yellState("yellState"),
	__yellPedState("yellPedState"),
	__yellTimeToChange("yellTimeToChange"),
	__yellStateConfidence("yellStateConfidence"),
	__vehicleCount("vehicleCount"),
	__pedDetect("pedDetect"),
	__pedCount("pedCount"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(16);
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
	MovementState temp0 = this;

	if (temp0.pedCount != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.pedCount, sink), 0x8E);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("pedCount", "ObjectCount");
		throw ee;
	    }
	}
	if (temp0.pedDetect != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.pedDetect, sink), 0x8D);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("pedDetect", "PedestrianDetect");
		throw ee;
	    }
	}
	if (temp0.vehicleCount != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.vehicleCount, sink), 0x8C);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("vehicleCount", "ObjectCount");
		throw ee;
	    }
	}
	if (temp0.yellStateConfidence != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.yellStateConfidence, sink), 0x8B);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("yellStateConfidence", "StateConfidence");
		throw ee;
	    }
	}
	if (temp0.yellTimeToChange != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.yellTimeToChange, sink), 0x8A);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("yellTimeToChange", "TimeMark");
		throw ee;
	    }
	}
	if (temp0.yellPedState != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.yellPedState, sink), 0x89);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("yellPedState", "PedestrianSignalState");
		throw ee;
	    }
	}
	if (temp0.yellState != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.yellState, sink), 0x88);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("yellState", "SignalLightState");
		throw ee;
	    }
	}
	if (temp0.stateConfidence != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.stateConfidence, sink), 0x87);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("stateConfidence", "StateConfidence");
		throw ee;
	    }
	}
	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.timeToChange, sink), 0x86);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("timeToChange", "TimeMark");
	    throw ee;
	}
	if (temp0.specialState != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.specialState, sink), 0x85);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("specialState", "SpecialSignalState");
		throw ee;
	    }
	}
	if (temp0.pedState != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.pedState, sink), 0x84);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("pedState", "PedestrianSignalState");
		throw ee;
	    }
	}
	if (temp0.currState != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.currState, sink), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("currState", "SignalLightState");
		throw ee;
	    }
	}
	try {
	    len0 += sink.encodeLengthTag(sink.write(temp0.laneSet.byteArrayValue()), 0x82);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("laneSet", "LaneSet");
	    throw ee;
	}
	if (temp0.laneCnt != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.laneCnt, sink), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("laneCnt", "LaneCount");
		throw ee;
	    }
	}
	if (temp0.movementName != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeString1(temp0.movementName, sink), 0x80);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("movementName", "DescriptiveName");
		throw ee;
	    }
	}

	return len0;
    }

    /**
     * Implements BER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public MovementState decodeValue(BerCoder coder, DecoderInput source)
	    throws DecoderException
    {
	int total_len0 = source.mLength;
	int end_pos0 = (total_len0 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len0);
	int tag;

	do {
	    tag = source.decodeTagLength();
	    if (tag == 0x80 || tag == 0xA0) {
		try {
		    this.movementName = new DescriptiveName(coder.decodeChars(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("movementName", "DescriptiveName");
		    throw ee;
		}
		tag = source.decodeTagLength();
	    }
	    if (tag == 0x81) {
		try {
		    this.laneCnt = new LaneCount(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("laneCnt", "LaneCount");
		    throw ee;
		}
		tag = source.decodeTagLength();
	    }
	    if (tag != 0x82 && tag != 0xA2)
		source.raiseTagMismatchException(tag);
	    try {
		this.laneSet = new LaneSet(coder.decodeOctetString(source));
	    } catch (Exception e) {
		DecoderException ee = DecoderException.wrapException(e);
		ee.appendFieldContext("laneSet", "LaneSet");
		throw ee;
	    }
	    tag = source.decodeTagLength();
	    if (tag == 0x83) {
		try {
		    this.currState = new SignalLightState(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("currState", "SignalLightState");
		    throw ee;
		}
		tag = source.decodeTagLength();
	    }
	    if (tag == 0x84) {
		try {
		    int idx1 = PedestrianSignalState.indexOfValue(source.decodeLong());
		    this.pedState = (idx1 < 0) ? PedestrianSignalState.unknownEnumerator() : PedestrianSignalState.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("pedState", "PedestrianSignalState");
		    throw ee;
		}
		tag = source.decodeTagLength();
	    }
	    if (tag == 0x85) {
		try {
		    int idx1 = SpecialSignalState.indexOfValue(source.decodeLong());
		    this.specialState = (idx1 < 0) ? SpecialSignalState.unknownEnumerator() : SpecialSignalState.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("specialState", "SpecialSignalState");
		    throw ee;
		}
		tag = source.decodeTagLength();
	    }
	    if (tag != 0x86)
		source.raiseTagMismatchException(tag);
	    try {
		this.timeToChange = new TimeMark(source.decodeLong());
	    } catch (Exception e) {
		DecoderException ee = DecoderException.wrapException(e);
		ee.appendFieldContext("timeToChange", "TimeMark");
		throw ee;
	    }
	    if (source.position() >= end_pos0)
		break;
	    tag = source.decodeTagLength();
	    if (tag == 0)
		break;
	    if (tag == 0x87) {
		try {
		    int idx1 = StateConfidence.indexOfValue(source.decodeLong());
		    this.stateConfidence = (idx1 < 0) ? StateConfidence.unknownEnumerator() : StateConfidence.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("stateConfidence", "StateConfidence");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x88) {
		try {
		    this.yellState = new SignalLightState(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("yellState", "SignalLightState");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x89) {
		try {
		    int idx1 = PedestrianSignalState.indexOfValue(source.decodeLong());
		    this.yellPedState = (idx1 < 0) ? PedestrianSignalState.unknownEnumerator() : PedestrianSignalState.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("yellPedState", "PedestrianSignalState");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x8A) {
		try {
		    this.yellTimeToChange = new TimeMark(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("yellTimeToChange", "TimeMark");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x8B) {
		try {
		    int idx1 = StateConfidence.indexOfValue(source.decodeLong());
		    this.yellStateConfidence = (idx1 < 0) ? StateConfidence.unknownEnumerator() : StateConfidence.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("yellStateConfidence", "StateConfidence");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x8C) {
		try {
		    this.vehicleCount = new ObjectCount(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("vehicleCount", "ObjectCount");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x8D) {
		try {
		    int idx1 = PedestrianDetect.indexOfValue(source.decodeLong());
		    this.pedDetect = (idx1 < 0) ? PedestrianDetect.unknownEnumerator() : PedestrianDetect.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("pedDetect", "PedestrianDetect");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x8E) {
		try {
		    this.pedCount = new ObjectCount(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("pedCount", "ObjectCount");
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
		    ee.appendExtensionContext("MovementState", -1);
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
	MovementState temp0 = this;

	if (temp0.pedCount != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.pedCount, sink), 0x8E);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("pedCount", "ObjectCount");
		throw ee;
	    }
	}
	if (temp0.pedDetect != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.pedDetect, sink), 0x8D);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("pedDetect", "PedestrianDetect");
		throw ee;
	    }
	}
	if (temp0.vehicleCount != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.vehicleCount, sink), 0x8C);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("vehicleCount", "ObjectCount");
		throw ee;
	    }
	}
	if (temp0.yellStateConfidence != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.yellStateConfidence, sink), 0x8B);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("yellStateConfidence", "StateConfidence");
		throw ee;
	    }
	}
	if (temp0.yellTimeToChange != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.yellTimeToChange, sink), 0x8A);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("yellTimeToChange", "TimeMark");
		throw ee;
	    }
	}
	if (temp0.yellPedState != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.yellPedState, sink), 0x89);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("yellPedState", "PedestrianSignalState");
		throw ee;
	    }
	}
	if (temp0.yellState != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.yellState, sink), 0x88);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("yellState", "SignalLightState");
		throw ee;
	    }
	}
	if (temp0.stateConfidence != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.stateConfidence, sink), 0x87);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("stateConfidence", "StateConfidence");
		throw ee;
	    }
	}
	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.timeToChange, sink), 0x86);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("timeToChange", "TimeMark");
	    throw ee;
	}
	if (temp0.specialState != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.specialState, sink), 0x85);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("specialState", "SpecialSignalState");
		throw ee;
	    }
	}
	if (temp0.pedState != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.pedState, sink), 0x84);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("pedState", "PedestrianSignalState");
		throw ee;
	    }
	}
	if (temp0.currState != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.currState, sink), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("currState", "SignalLightState");
		throw ee;
	    }
	}
	try {
	    len0 += sink.encodeLengthTag(sink.write(temp0.laneSet.byteArrayValue()), 0x82);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("laneSet", "LaneSet");
	    throw ee;
	}
	if (temp0.laneCnt != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.laneCnt, sink), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("laneCnt", "LaneCount");
		throw ee;
	    }
	}
	if (temp0.movementName != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeString1(temp0.movementName, sink), 0x80);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("movementName", "DescriptiveName");
		throw ee;
	    }
	}

	return len0;
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, MovementState data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.movementName != null);
	sink.writeBit(data.laneCnt != null);
	sink.writeBit(data.currState != null);
	sink.writeBit(data.pedState != null);
	sink.writeBit(data.specialState != null);
	sink.writeBit(data.stateConfidence != null);
	sink.writeBit(data.yellState != null);
	sink.writeBit(data.yellPedState != null);
	sink.writeBit(data.yellTimeToChange != null);
	sink.writeBit(data.yellStateConfidence != null);
	sink.writeBit(data.vehicleCount != null);
	sink.writeBit(data.pedDetect != null);
	sink.writeBit(data.pedCount != null);
	nbits += 14;
	if (data.movementName != null) {
	    // Encode field 'movementName'
	    try {
		DescriptiveName item1 = data.movementName;
		int len1 = item1.getSize();

		if (len1 < 1 || len1 > 63)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerKMCString.encode(coder, item1.stringValue(), 1, 63, MovementState._cEPAInfo_movementName, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("movementName", "DescriptiveName");
		throw ee;
	    }
	}
	if (data.laneCnt != null) {
	    // Encode field 'laneCnt'
	    try {
		LaneCount item1 = data.laneCnt;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 255)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("laneCnt", "LaneCount");
		throw ee;
	    }
	}
	// Encode field 'laneSet'
	try {
	    LaneSet item1 = data.laneSet;
	    int len1 = item1.getSize();

	    if (len1 < 1 || len1 > 127)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 127, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("laneSet", "LaneSet");
	    throw ee;
	}
	if (data.currState != null) {
	    // Encode field 'currState'
	    try {
		SignalLightState item1 = data.currState;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 536870912)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 536870912, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("currState", "SignalLightState");
		throw ee;
	    }
	}
	if (data.pedState != null) {
	    // Encode field 'pedState'
	    try {
		PedestrianSignalState item1 = data.pedState;
		int idx1;
		boolean extroot1 = true;

		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else {
		    idx1 = item1.indexOf();
		    if (idx1 < 0)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    extroot1 = idx1 < 4;
		}
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 3, sink);
		else
		    nbits += coder.encodeNormallySmallNumber(idx1 - 4, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("pedState", "PedestrianSignalState");
		throw ee;
	    }
	}
	if (data.specialState != null) {
	    // Encode field 'specialState'
	    try {
		SpecialSignalState item1 = data.specialState;
		int idx1;
		boolean extroot1 = true;

		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else {
		    idx1 = item1.indexOf();
		    if (idx1 < 0)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    extroot1 = idx1 < 5;
		}
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 4, sink);
		else
		    nbits += coder.encodeNormallySmallNumber(idx1 - 5, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("specialState", "SpecialSignalState");
		throw ee;
	    }
	}
	// Encode field 'timeToChange'
	try {
	    TimeMark item1 = data.timeToChange;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 12002)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 12002, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("timeToChange", "TimeMark");
	    throw ee;
	}
	if (data.stateConfidence != null) {
	    // Encode field 'stateConfidence'
	    try {
		StateConfidence item1 = data.stateConfidence;
		int idx1;
		boolean extroot1 = true;

		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else {
		    idx1 = item1.indexOf();
		    if (idx1 < 0)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    extroot1 = idx1 < 4;
		}
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 3, sink);
		else
		    nbits += coder.encodeNormallySmallNumber(idx1 - 4, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("stateConfidence", "StateConfidence");
		throw ee;
	    }
	}
	if (data.yellState != null) {
	    // Encode field 'yellState'
	    try {
		SignalLightState item1 = data.yellState;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 536870912)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 536870912, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("yellState", "SignalLightState");
		throw ee;
	    }
	}
	if (data.yellPedState != null) {
	    // Encode field 'yellPedState'
	    try {
		PedestrianSignalState item1 = data.yellPedState;
		int idx1;
		boolean extroot1 = true;

		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else {
		    idx1 = item1.indexOf();
		    if (idx1 < 0)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    extroot1 = idx1 < 4;
		}
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 3, sink);
		else
		    nbits += coder.encodeNormallySmallNumber(idx1 - 4, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("yellPedState", "PedestrianSignalState");
		throw ee;
	    }
	}
	if (data.yellTimeToChange != null) {
	    // Encode field 'yellTimeToChange'
	    try {
		TimeMark item1 = data.yellTimeToChange;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 12002)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 12002, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("yellTimeToChange", "TimeMark");
		throw ee;
	    }
	}
	if (data.yellStateConfidence != null) {
	    // Encode field 'yellStateConfidence'
	    try {
		StateConfidence item1 = data.yellStateConfidence;
		int idx1;
		boolean extroot1 = true;

		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else {
		    idx1 = item1.indexOf();
		    if (idx1 < 0)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    extroot1 = idx1 < 4;
		}
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 3, sink);
		else
		    nbits += coder.encodeNormallySmallNumber(idx1 - 4, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("yellStateConfidence", "StateConfidence");
		throw ee;
	    }
	}
	if (data.vehicleCount != null) {
	    // Encode field 'vehicleCount'
	    try {
		ObjectCount item1 = data.vehicleCount;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 6000)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 6000, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("vehicleCount", "ObjectCount");
		throw ee;
	    }
	}
	if (data.pedDetect != null) {
	    // Encode field 'pedDetect'
	    try {
		PedestrianDetect item1 = data.pedDetect;
		int idx1;
		boolean extroot1 = true;

		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else {
		    idx1 = item1.indexOf();
		    if (idx1 < 0)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    extroot1 = idx1 < 4;
		}
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 3, sink);
		else
		    nbits += coder.encodeNormallySmallNumber(idx1 - 4, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("pedDetect", "PedestrianDetect");
		throw ee;
	    }
	}
	if (data.pedCount != null) {
	    // Encode field 'pedCount'
	    try {
		ObjectCount item1 = data.pedCount;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 6000)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 6000, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("pedCount", "ObjectCount");
		throw ee;
	    }
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static MovementState decodeValue(PerCoder coder, InputBitStream source, MovementState data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_movementName0 = source.readBit();
	boolean has_laneCnt0 = source.readBit();
	boolean has_currState0 = source.readBit();
	boolean has_pedState0 = source.readBit();
	boolean has_specialState0 = source.readBit();
	boolean has_stateConfidence0 = source.readBit();
	boolean has_yellState0 = source.readBit();
	boolean has_yellPedState0 = source.readBit();
	boolean has_yellTimeToChange0 = source.readBit();
	boolean has_yellStateConfidence0 = source.readBit();
	boolean has_vehicleCount0 = source.readBit();
	boolean has_pedDetect0 = source.readBit();
	boolean has_pedCount0 = source.readBit();
    /** Decode root fields **/
	if (has_movementName0) {
	    // Decode field 'movementName'
	    try {
		data.movementName = new DescriptiveName(com.oss.coders.per.PerKMCString.decode(coder, source, 1, 63, MovementState._cEPAInfo_movementName));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("movementName", "DescriptiveName");
		throw de;
	    }
	} else {
	    data.movementName = null;
	}
	if (has_laneCnt0) {
	    // Decode field 'laneCnt'
	    try {
		long temp1;

		if (data.laneCnt == null)
		    data.laneCnt = new LaneCount();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
		if (temp1 > 255)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.laneCnt.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("laneCnt", "LaneCount");
		throw de;
	    }
	} else {
	    data.laneCnt = null;
	}
	// Decode field 'laneSet'
	try {
	    data.laneSet = new LaneSet(com.oss.coders.per.PerOctets.decode(coder, source, 1, 127));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("laneSet", "LaneSet");
	    throw de;
	}
	if (has_currState0) {
	    // Decode field 'currState'
	    try {
		long temp1;

		if (data.currState == null)
		    data.currState = new SignalLightState();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 536870912);
		if (temp1 > 536870912)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.currState.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("currState", "SignalLightState");
		throw de;
	    }
	} else {
	    data.currState = null;
	}
	if (has_pedState0) {
	    // Decode field 'pedState'
	    try {
		int idx1;
		PedestrianSignalState temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
		    if (idx1 < 0 || idx1 > 3)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = PedestrianSignalState.valueAt(idx1);
		} else {
		    idx1 = 4 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = PedestrianSignalState.unknownEnumerator();
		}
		data.pedState = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("pedState", "PedestrianSignalState");
		throw de;
	    }
	} else {
	    data.pedState = null;
	}
	if (has_specialState0) {
	    // Decode field 'specialState'
	    try {
		int idx1;
		SpecialSignalState temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 4);
		    if (idx1 < 0 || idx1 > 4)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = SpecialSignalState.valueAt(idx1);
		} else {
		    idx1 = 5 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = SpecialSignalState.unknownEnumerator();
		}
		data.specialState = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("specialState", "SpecialSignalState");
		throw de;
	    }
	} else {
	    data.specialState = null;
	}
	// Decode field 'timeToChange'
	try {
	    long temp1;

	    if (data.timeToChange == null)
		data.timeToChange = new TimeMark();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 12002);
	    if (temp1 > 12002)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.timeToChange.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("timeToChange", "TimeMark");
	    throw de;
	}
	if (has_stateConfidence0) {
	    // Decode field 'stateConfidence'
	    try {
		int idx1;
		StateConfidence temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
		    if (idx1 < 0 || idx1 > 3)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = StateConfidence.valueAt(idx1);
		} else {
		    idx1 = 4 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = StateConfidence.unknownEnumerator();
		}
		data.stateConfidence = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("stateConfidence", "StateConfidence");
		throw de;
	    }
	} else {
	    data.stateConfidence = null;
	}
	if (has_yellState0) {
	    // Decode field 'yellState'
	    try {
		long temp1;

		if (data.yellState == null)
		    data.yellState = new SignalLightState();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 536870912);
		if (temp1 > 536870912)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.yellState.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("yellState", "SignalLightState");
		throw de;
	    }
	} else {
	    data.yellState = null;
	}
	if (has_yellPedState0) {
	    // Decode field 'yellPedState'
	    try {
		int idx1;
		PedestrianSignalState temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
		    if (idx1 < 0 || idx1 > 3)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = PedestrianSignalState.valueAt(idx1);
		} else {
		    idx1 = 4 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = PedestrianSignalState.unknownEnumerator();
		}
		data.yellPedState = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("yellPedState", "PedestrianSignalState");
		throw de;
	    }
	} else {
	    data.yellPedState = null;
	}
	if (has_yellTimeToChange0) {
	    // Decode field 'yellTimeToChange'
	    try {
		long temp1;

		if (data.yellTimeToChange == null)
		    data.yellTimeToChange = new TimeMark();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 12002);
		if (temp1 > 12002)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.yellTimeToChange.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("yellTimeToChange", "TimeMark");
		throw de;
	    }
	} else {
	    data.yellTimeToChange = null;
	}
	if (has_yellStateConfidence0) {
	    // Decode field 'yellStateConfidence'
	    try {
		int idx1;
		StateConfidence temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
		    if (idx1 < 0 || idx1 > 3)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = StateConfidence.valueAt(idx1);
		} else {
		    idx1 = 4 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = StateConfidence.unknownEnumerator();
		}
		data.yellStateConfidence = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("yellStateConfidence", "StateConfidence");
		throw de;
	    }
	} else {
	    data.yellStateConfidence = null;
	}
	if (has_vehicleCount0) {
	    // Decode field 'vehicleCount'
	    try {
		long temp1;

		if (data.vehicleCount == null)
		    data.vehicleCount = new ObjectCount();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 6000);
		if (temp1 > 6000)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.vehicleCount.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("vehicleCount", "ObjectCount");
		throw de;
	    }
	} else {
	    data.vehicleCount = null;
	}
	if (has_pedDetect0) {
	    // Decode field 'pedDetect'
	    try {
		int idx1;
		PedestrianDetect temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
		    if (idx1 < 0 || idx1 > 3)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = PedestrianDetect.valueAt(idx1);
		} else {
		    idx1 = 4 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = PedestrianDetect.unknownEnumerator();
		}
		data.pedDetect = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("pedDetect", "PedestrianDetect");
		throw de;
	    }
	} else {
	    data.pedDetect = null;
	}
	if (has_pedCount0) {
	    // Decode field 'pedCount'
	    try {
		long temp1;

		if (data.pedCount == null)
		    data.pedCount = new ObjectCount();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 6000);
		if (temp1 > 6000)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.pedCount.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("pedCount", "ObjectCount");
		throw de;
	    }
	} else {
	    data.pedCount = null;
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
	// Encode field 'movementName'
	try {
	    DescriptiveName item1 = this.movementName;

	    if (item1 != null) {
		{
		    separator0 = ",";
		    sink.encodeKey("movementName");
		    coder.encodeString(item1.stringValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "movementName");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("movementName", "DescriptiveName");
	    throw ee;
	}
	// Encode field 'laneCnt'
	try {
	    LaneCount item1 = this.laneCnt;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("laneCnt");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "laneCnt");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("laneCnt", "LaneCount");
	    throw ee;
	}
	// Encode field 'laneSet'
	try {
	    LaneSet item1 = this.laneSet;

	    {
		sink.writeSeparator(separator0);
		sink.encodeKey("laneSet");
		sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("laneSet", "LaneSet");
	    throw ee;
	}
	// Encode field 'currState'
	try {
	    SignalLightState item1 = this.currState;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("currState");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "currState");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("currState", "SignalLightState");
	    throw ee;
	}
	// Encode field 'pedState'
	try {
	    PedestrianSignalState item1 = this.pedState;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("pedState");
		    if (item1.isUnknownEnumerator()) {
			throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		    } else 
			sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "pedState");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("pedState", "PedestrianSignalState");
	    throw ee;
	}
	// Encode field 'specialState'
	try {
	    SpecialSignalState item1 = this.specialState;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("specialState");
		    if (item1.isUnknownEnumerator()) {
			throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		    } else 
			sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "specialState");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("specialState", "SpecialSignalState");
	    throw ee;
	}
	// Encode field 'timeToChange'
	try {
	    TimeMark item1 = this.timeToChange;

	    {
		sink.writeSeparator();
		sink.encodeKey("timeToChange");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("timeToChange", "TimeMark");
	    throw ee;
	}
	// Encode field 'stateConfidence'
	try {
	    StateConfidence item1 = this.stateConfidence;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("stateConfidence");
		    if (item1.isUnknownEnumerator()) {
			throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		    } else 
			sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "stateConfidence");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("stateConfidence", "StateConfidence");
	    throw ee;
	}
	// Encode field 'yellState'
	try {
	    SignalLightState item1 = this.yellState;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("yellState");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "yellState");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("yellState", "SignalLightState");
	    throw ee;
	}
	// Encode field 'yellPedState'
	try {
	    PedestrianSignalState item1 = this.yellPedState;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("yellPedState");
		    if (item1.isUnknownEnumerator()) {
			throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		    } else 
			sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "yellPedState");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("yellPedState", "PedestrianSignalState");
	    throw ee;
	}
	// Encode field 'yellTimeToChange'
	try {
	    TimeMark item1 = this.yellTimeToChange;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("yellTimeToChange");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "yellTimeToChange");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("yellTimeToChange", "TimeMark");
	    throw ee;
	}
	// Encode field 'yellStateConfidence'
	try {
	    StateConfidence item1 = this.yellStateConfidence;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("yellStateConfidence");
		    if (item1.isUnknownEnumerator()) {
			throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		    } else 
			sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "yellStateConfidence");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("yellStateConfidence", "StateConfidence");
	    throw ee;
	}
	// Encode field 'vehicleCount'
	try {
	    ObjectCount item1 = this.vehicleCount;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("vehicleCount");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "vehicleCount");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("vehicleCount", "ObjectCount");
	    throw ee;
	}
	// Encode field 'pedDetect'
	try {
	    PedestrianDetect item1 = this.pedDetect;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("pedDetect");
		    if (item1.isUnknownEnumerator()) {
			throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		    } else 
			sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "pedDetect");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("pedDetect", "PedestrianDetect");
	    throw ee;
	}
	// Encode field 'pedCount'
	try {
	    ObjectCount item1 = this.pedCount;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("pedCount");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "pedCount");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("pedCount", "ObjectCount");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public MovementState decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[16];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		MovementState.__Tag t_tag0 = MovementState.__Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = MovementState.__Tag._null_;
		switch (t_tag0) {
		    case __movementName:
		    // Decode field 'movementName'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[0])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.movementName = new DescriptiveName(coder.decodeString(source));
			    present0[0] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("movementName", "DescriptiveName");
			throw de;
		    }
		    break;
		    case __laneCnt:
		    // Decode field 'laneCnt'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.laneCnt == null)
				this.laneCnt = new LaneCount();
			    this.laneCnt.setValue(coder.decodeInteger(source));
			    present0[1] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("laneCnt", "LaneCount");
			throw de;
		    }
		    break;
		    case __laneSet:
		    // Decode field 'laneSet'
		    try {
			if (present0[2])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			this.laneSet = new LaneSet(coder.decodeOctetString(source));
			present0[2] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("laneSet", "LaneSet");
			throw de;
		    }
		    break;
		    case __currState:
		    // Decode field 'currState'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.currState == null)
				this.currState = new SignalLightState();
			    this.currState.setValue(coder.decodeInteger(source));
			    present0[3] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("currState", "SignalLightState");
			throw de;
		    }
		    break;
		    case __pedState:
		    // Decode field 'pedState'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    PedestrianSignalState temp1;

			    if (present0[4])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(PedestrianSignalState.cConstantNameList, content1);
			    if (idx1 < 0 )
				temp1 = PedestrianSignalState.unknownEnumerator();
			    else
				temp1 = PedestrianSignalState.cNamedNumbers[idx1];
			    this.pedState = temp1;
			    present0[4] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("pedState", "PedestrianSignalState");
			throw de;
		    }
		    break;
		    case __specialState:
		    // Decode field 'specialState'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    SpecialSignalState temp1;

			    if (present0[5])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(SpecialSignalState.cConstantNameList, content1);
			    if (idx1 < 0 )
				temp1 = SpecialSignalState.unknownEnumerator();
			    else
				temp1 = SpecialSignalState.cNamedNumbers[idx1];
			    this.specialState = temp1;
			    present0[5] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("specialState", "SpecialSignalState");
			throw de;
		    }
		    break;
		    case __timeToChange:
		    // Decode field 'timeToChange'
		    try {
			if (present0[6])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.timeToChange == null)
			    this.timeToChange = new TimeMark();
			this.timeToChange.setValue(coder.decodeInteger(source));
			present0[6] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("timeToChange", "TimeMark");
			throw de;
		    }
		    break;
		    case __stateConfidence:
		    // Decode field 'stateConfidence'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    StateConfidence temp1;

			    if (present0[7])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(StateConfidence.cConstantNameList, content1);
			    if (idx1 < 0 )
				temp1 = StateConfidence.unknownEnumerator();
			    else
				temp1 = StateConfidence.cNamedNumbers[idx1];
			    this.stateConfidence = temp1;
			    present0[7] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("stateConfidence", "StateConfidence");
			throw de;
		    }
		    break;
		    case __yellState:
		    // Decode field 'yellState'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[8])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.yellState == null)
				this.yellState = new SignalLightState();
			    this.yellState.setValue(coder.decodeInteger(source));
			    present0[8] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("yellState", "SignalLightState");
			throw de;
		    }
		    break;
		    case __yellPedState:
		    // Decode field 'yellPedState'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    PedestrianSignalState temp1;

			    if (present0[9])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(PedestrianSignalState.cConstantNameList, content1);
			    if (idx1 < 0 )
				temp1 = PedestrianSignalState.unknownEnumerator();
			    else
				temp1 = PedestrianSignalState.cNamedNumbers[idx1];
			    this.yellPedState = temp1;
			    present0[9] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("yellPedState", "PedestrianSignalState");
			throw de;
		    }
		    break;
		    case __yellTimeToChange:
		    // Decode field 'yellTimeToChange'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[10])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.yellTimeToChange == null)
				this.yellTimeToChange = new TimeMark();
			    this.yellTimeToChange.setValue(coder.decodeInteger(source));
			    present0[10] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("yellTimeToChange", "TimeMark");
			throw de;
		    }
		    break;
		    case __yellStateConfidence:
		    // Decode field 'yellStateConfidence'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    StateConfidence temp1;

			    if (present0[11])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(StateConfidence.cConstantNameList, content1);
			    if (idx1 < 0 )
				temp1 = StateConfidence.unknownEnumerator();
			    else
				temp1 = StateConfidence.cNamedNumbers[idx1];
			    this.yellStateConfidence = temp1;
			    present0[11] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("yellStateConfidence", "StateConfidence");
			throw de;
		    }
		    break;
		    case __vehicleCount:
		    // Decode field 'vehicleCount'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[12])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.vehicleCount == null)
				this.vehicleCount = new ObjectCount();
			    this.vehicleCount.setValue(coder.decodeInteger(source));
			    present0[12] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("vehicleCount", "ObjectCount");
			throw de;
		    }
		    break;
		    case __pedDetect:
		    // Decode field 'pedDetect'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    PedestrianDetect temp1;

			    if (present0[13])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(PedestrianDetect.cConstantNameList, content1);
			    if (idx1 < 0 )
				temp1 = PedestrianDetect.unknownEnumerator();
			    else
				temp1 = PedestrianDetect.cNamedNumbers[idx1];
			    this.pedDetect = temp1;
			    present0[13] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("pedDetect", "PedestrianDetect");
			throw de;
		    }
		    break;
		    case __pedCount:
		    // Decode field 'pedCount'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[14])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.pedCount == null)
				this.pedCount = new ObjectCount();
			    this.pedCount.setValue(coder.decodeInteger(source));
			    present0[14] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("pedCount", "ObjectCount");
			throw de;
		    }
		    break;
		    default:
			coder.skipValue(source);
			break;
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    this.movementName = null;
	if (!present0[1])
	    this.laneCnt = null;
	if (!present0[2])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'laneSet'");
	if (!present0[3])
	    this.currState = null;
	if (!present0[4])
	    this.pedState = null;
	if (!present0[5])
	    this.specialState = null;
	if (!present0[6])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'timeToChange'");
	if (!present0[7])
	    this.stateConfidence = null;
	if (!present0[8])
	    this.yellState = null;
	if (!present0[9])
	    this.yellPedState = null;
	if (!present0[10])
	    this.yellTimeToChange = null;
	if (!present0[11])
	    this.yellStateConfidence = null;
	if (!present0[12])
	    this.vehicleCount = null;
	if (!present0[13])
	    this.pedDetect = null;
	if (!present0[14])
	    this.pedCount = null;
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
	if (this.movementName != null) {
	    try {
		comma0 = true;
		printer.newLine(writer);
		writer.print("movementName ");
		printer.print(this.movementName, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.laneCnt != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("laneCnt ");
		writer.print(this.laneCnt.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("laneSet ");
	    printer.print(this.laneSet, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.currState != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("currState ");
		writer.print(this.currState.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.pedState != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("pedState ");
		printer.print(this.pedState, writer, this.pedState.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.specialState != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("specialState ");
		printer.print(this.specialState, writer, this.specialState.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("timeToChange ");
	    writer.print(this.timeToChange.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.stateConfidence != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("stateConfidence ");
		printer.print(this.stateConfidence, writer, this.stateConfidence.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.yellState != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("yellState ");
		writer.print(this.yellState.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.yellPedState != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("yellPedState ");
		printer.print(this.yellPedState, writer, this.yellPedState.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.yellTimeToChange != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("yellTimeToChange ");
		writer.print(this.yellTimeToChange.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.yellStateConfidence != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("yellStateConfidence ");
		printer.print(this.yellStateConfidence, writer, this.yellStateConfidence.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.vehicleCount != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("vehicleCount ");
		writer.print(this.vehicleCount.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.pedDetect != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("pedDetect ");
		printer.print(this.pedDetect, writer, this.pedDetect.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.pedCount != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("pedCount ");
		writer.print(this.pedCount.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
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
	return equalTo((MovementState)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((MovementState)that);
    }
    
    public boolean equalTo(MovementState that) {
	if (this.movementName != null && that.movementName != null) {
	    if (!this.movementName.equalTo(that.movementName))
		return false;
	}
	if (this.laneCnt != null && that.laneCnt != null) {
	    if (!this.laneCnt.equalTo(that.laneCnt))
		return false;
	}
	if (!this.laneSet.equalTo(that.laneSet))
	    return false;
	if (this.currState != null && that.currState != null) {
	    if (!this.currState.equalTo(that.currState))
		return false;
	}
	if (this.pedState != null && that.pedState != null) {
	    if (!this.pedState.equalTo(that.pedState))
		return false;
	}
	if (this.specialState != null && that.specialState != null) {
	    if (!this.specialState.equalTo(that.specialState))
		return false;
	}
	if (!this.timeToChange.equalTo(that.timeToChange))
	    return false;
	if (this.stateConfidence != null && that.stateConfidence != null) {
	    if (!this.stateConfidence.equalTo(that.stateConfidence))
		return false;
	}
	if (this.yellState != null && that.yellState != null) {
	    if (!this.yellState.equalTo(that.yellState))
		return false;
	}
	if (this.yellPedState != null && that.yellPedState != null) {
	    if (!this.yellPedState.equalTo(that.yellPedState))
		return false;
	}
	if (this.yellTimeToChange != null && that.yellTimeToChange != null) {
	    if (!this.yellTimeToChange.equalTo(that.yellTimeToChange))
		return false;
	}
	if (this.yellStateConfidence != null && that.yellStateConfidence != null) {
	    if (!this.yellStateConfidence.equalTo(that.yellStateConfidence))
		return false;
	}
	if (this.vehicleCount != null && that.vehicleCount != null) {
	    if (!this.vehicleCount.equalTo(that.vehicleCount))
		return false;
	}
	if (this.pedDetect != null && that.pedDetect != null) {
	    if (!this.pedDetect.equalTo(that.pedDetect))
		return false;
	}
	if (this.pedCount != null && that.pedCount != null) {
	    if (!this.pedCount.equalTo(that.pedCount))
		return false;
	}
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public MovementState clone() {
	MovementState copy = (MovementState)super.clone();
	if (movementName != null) {
	    copy.movementName = movementName.clone();
	}
	if (laneCnt != null) {
	    copy.laneCnt = laneCnt.clone();
	}
	copy.laneSet = laneSet.clone();
	if (currState != null) {
	    copy.currState = currState.clone();
	}
	if (pedState != null) {
	    copy.pedState = pedState.clone();
	}
	if (specialState != null) {
	    copy.specialState = specialState.clone();
	}
	copy.timeToChange = timeToChange.clone();
	if (stateConfidence != null) {
	    copy.stateConfidence = stateConfidence.clone();
	}
	if (yellState != null) {
	    copy.yellState = yellState.clone();
	}
	if (yellPedState != null) {
	    copy.yellPedState = yellPedState.clone();
	}
	if (yellTimeToChange != null) {
	    copy.yellTimeToChange = yellTimeToChange.clone();
	}
	if (yellStateConfidence != null) {
	    copy.yellStateConfidence = yellStateConfidence.clone();
	}
	if (vehicleCount != null) {
	    copy.vehicleCount = vehicleCount.clone();
	}
	if (pedDetect != null) {
	    copy.pedDetect = pedDetect.clone();
	}
	if (pedCount != null) {
	    copy.pedCount = pedCount.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.movementName != null ? this.movementName.hashCode() : 0);
	hash = 41 * hash + (this.laneCnt != null ? this.laneCnt.hashCode() : 0);
	hash = 41 * hash + (this.laneSet != null ? this.laneSet.hashCode() : 0);
	hash = 41 * hash + (this.currState != null ? this.currState.hashCode() : 0);
	hash = 41 * hash + (this.pedState != null ? this.pedState.hashCode() : 0);
	hash = 41 * hash + (this.specialState != null ? this.specialState.hashCode() : 0);
	hash = 41 * hash + (this.timeToChange != null ? this.timeToChange.hashCode() : 0);
	hash = 41 * hash + (this.stateConfidence != null ? this.stateConfidence.hashCode() : 0);
	hash = 41 * hash + (this.yellState != null ? this.yellState.hashCode() : 0);
	hash = 41 * hash + (this.yellPedState != null ? this.yellPedState.hashCode() : 0);
	hash = 41 * hash + (this.yellTimeToChange != null ? this.yellTimeToChange.hashCode() : 0);
	hash = 41 * hash + (this.yellStateConfidence != null ? this.yellStateConfidence.hashCode() : 0);
	hash = 41 * hash + (this.vehicleCount != null ? this.vehicleCount.hashCode() : 0);
	hash = 41 * hash + (this.pedDetect != null ? this.pedDetect.hashCode() : 0);
	hash = 41 * hash + (this.pedCount != null ? this.pedCount.hashCode() : 0);
	return hash;
    }
} // End class definition for MovementState
