/*************************************************************/
/* Copyright (C) 2015 OSS Nokalva, Inc.  All rights reserved.*/
/*************************************************************/

/* THIS FILE IS PROPRIETARY MATERIAL OF OSS NOKALVA, INC.
 * AND MAY BE USED ONLY BY DIRECT LICENSEES OF OSS NOKALVA, INC.
 * THIS FILE MAY NOT BE DISTRIBUTED.
 * THIS COPYRIGHT STATEMENT MAY NOT BE REMOVED. */

/* Generated for: Booz Allen Hamilton (Trial), License 70234Z. */
/* Abstract syntax: semi_asn */
/* ASN.1 Java project: com.bah.ode.asn.oss.Oss */
/* Created: Tue Mar 24 11:33:39 2015 */
/* ASN.1 Compiler for Java version: 6.1 */
/* ASN.1 compiler options and file names specified:
 * -toed -output com.bah.ode.asn.oss -per -uper -ber -der -root -messageFormat
 * msvc C:/Users/572682/Projects/ODE/Trials/ASN.1/DSRC_R36_Source.asn
 * C:/Users/572682/Projects/ODE/Trials/ASN.1/SEMI_ASN.1_Structures_2.2.asn
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
 * Define the ASN1 Type SignalRequestMsg from ASN1 Module DSRC.
 * @see Sequence
 */

public class SignalRequestMsg extends Sequence implements BEREncodable, BERDecodable, DEREncodable, PEREncodable, PERDecodable {
    public DSRCmsgID msgID;
    public MsgCount msgCnt;
    public SignalRequest request;
    public DTime timeOfService;
    public DTime endOfService;
    public TransitStatus transitStatus;
    public VehicleIdent vehicleVIN;
    public BSMblob vehicleData;
    public VehicleRequestStatus status;
    
    /**
     * The default constructor.
     */
    public SignalRequestMsg()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SignalRequestMsg(DSRCmsgID msgID, MsgCount msgCnt, 
		    SignalRequest request, DTime timeOfService, 
		    DTime endOfService, TransitStatus transitStatus, 
		    VehicleIdent vehicleVIN, BSMblob vehicleData, 
		    VehicleRequestStatus status)
    {
	setMsgID(msgID);
	setMsgCnt(msgCnt);
	setRequest(request);
	setTimeOfService(timeOfService);
	setEndOfService(endOfService);
	setTransitStatus(transitStatus);
	setVehicleVIN(vehicleVIN);
	setVehicleData(vehicleData);
	setStatus(status);
    }
    
    /**
     * Construct with required components.
     */
    public SignalRequestMsg(DSRCmsgID msgID, MsgCount msgCnt, 
		    SignalRequest request, BSMblob vehicleData)
    {
	setMsgID(msgID);
	setMsgCnt(msgCnt);
	setRequest(request);
	setVehicleData(vehicleData);
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
    
    
    // Methods for field "request"
    public SignalRequest getRequest()
    {
	return this.request;
    }
    
    public void setRequest(SignalRequest request)
    {
	this.request = request;
    }
    
    
    // Methods for field "timeOfService"
    public DTime getTimeOfService()
    {
	return this.timeOfService;
    }
    
    public void setTimeOfService(DTime timeOfService)
    {
	this.timeOfService = timeOfService;
    }
    
    public boolean hasTimeOfService()
    {
	return (timeOfService != null);
    }
    
    public void deleteTimeOfService()
    {
	timeOfService = null;
    }
    
    
    // Methods for field "endOfService"
    public DTime getEndOfService()
    {
	return this.endOfService;
    }
    
    public void setEndOfService(DTime endOfService)
    {
	this.endOfService = endOfService;
    }
    
    public boolean hasEndOfService()
    {
	return (endOfService != null);
    }
    
    public void deleteEndOfService()
    {
	endOfService = null;
    }
    
    
    // Methods for field "transitStatus"
    public TransitStatus getTransitStatus()
    {
	return this.transitStatus;
    }
    
    public void setTransitStatus(TransitStatus transitStatus)
    {
	this.transitStatus = transitStatus;
    }
    
    public boolean hasTransitStatus()
    {
	return (transitStatus != null);
    }
    
    public void deleteTransitStatus()
    {
	transitStatus = null;
    }
    
    
    // Methods for field "vehicleVIN"
    public VehicleIdent getVehicleVIN()
    {
	return this.vehicleVIN;
    }
    
    public void setVehicleVIN(VehicleIdent vehicleVIN)
    {
	this.vehicleVIN = vehicleVIN;
    }
    
    public boolean hasVehicleVIN()
    {
	return (vehicleVIN != null);
    }
    
    public void deleteVehicleVIN()
    {
	vehicleVIN = null;
    }
    
    
    // Methods for field "vehicleData"
    public BSMblob getVehicleData()
    {
	return this.vehicleData;
    }
    
    public void setVehicleData(BSMblob vehicleData)
    {
	this.vehicleData = vehicleData;
    }
    
    
    // Methods for field "status"
    public VehicleRequestStatus getStatus()
    {
	return this.status;
    }
    
    public void setStatus(VehicleRequestStatus status)
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
     * Effective size constraint (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public static final Bounds _cBounds_transitStatus = 
	com.bah.ode.asn.oss.dsrc.TransitStatus._cBounds_;
    
    /**
     * Encode the PDU using BER (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encode(BerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	try {
	    int len0 = 0;
	    SignalRequestMsg temp0 = this;

	    if (temp0.status != null) {
		try {
		    len0 += sink.encodeLengthTag(sink.write(temp0.status.byteArrayValue()), 0x88);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("status", "VehicleRequestStatus");
		    throw ee;
		}
	    }
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.vehicleData.byteArrayValue()), 0x87);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("vehicleData", "BSMblob");
		throw ee;
	    }
	    if (temp0.vehicleVIN != null) {
		try {
		    len0 += sink.encodeLengthTag(temp0.vehicleVIN.encodeValue(coder, sink), 0xA6);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("vehicleVIN", "VehicleIdent");
		    throw ee;
		}
	    }
	    if (temp0.transitStatus != null) {
		try {
		    len0 += sink.encodeLengthTag(coder.encodeBitString(temp0.transitStatus, sink), 0x85);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("transitStatus", "TransitStatus");
		    throw ee;
		}
	    }
	    if (temp0.endOfService != null) {
		try {
		    len0 += sink.encodeLengthTag(temp0.endOfService.encodeValue(coder, sink), 0xA4);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("endOfService", "DTime");
		    throw ee;
		}
	    }
	    if (temp0.timeOfService != null) {
		try {
		    len0 += sink.encodeLengthTag(temp0.timeOfService.encodeValue(coder, sink), 0xA3);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("timeOfService", "DTime");
		    throw ee;
		}
	    }
	    try {
		len0 += sink.encodeLengthTag(temp0.request.encodeValue(coder, sink), 0xA2);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("request", "SignalRequest");
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
	    ee.appendFieldContext(null, "SignalRequestMsg");
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
	this.timeOfService = null;
	this.endOfService = null;
	this.transitStatus = null;
	this.vehicleVIN = null;
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
		    if (tag != 0xA2)
			source.raiseTagMismatchException(tag);
		    try {
			this.request = new SignalRequest();
			this.request.decodeValue(coder, source);
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("request", "SignalRequest");
			throw ee;
		    }
		    tag = source.decodeTagLength();
		    if (tag == 0xA3) {
			try {
			    this.timeOfService = new DTime();
			    this.timeOfService.decodeValue(coder, source);
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("timeOfService", "DTime");
			    throw ee;
			}
			tag = source.decodeTagLength();
		    }
		    if (tag == 0xA4) {
			try {
			    this.endOfService = new DTime();
			    this.endOfService.decodeValue(coder, source);
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("endOfService", "DTime");
			    throw ee;
			}
			tag = source.decodeTagLength();
		    }
		    if (tag == 0x85 || tag == 0xA5) {
			try {
			    this.transitStatus = new TransitStatus();
			    byte[] b = coder.decodeBitString(source);
			    this.transitStatus.setValue(b, b.length * 8 - coder.getUnused());
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("transitStatus", "TransitStatus");
			    throw ee;
			}
			tag = source.decodeTagLength();
		    }
		    if (tag == 0xA6) {
			try {
			    this.vehicleVIN = new VehicleIdent();
			    this.vehicleVIN.decodeValue(coder, source);
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("vehicleVIN", "VehicleIdent");
			    throw ee;
			}
			tag = source.decodeTagLength();
		    }
		    if (tag != 0x87 && tag != 0xA7)
			source.raiseTagMismatchException(tag);
		    try {
			this.vehicleData = new BSMblob(coder.decodeOctetString(source));
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("vehicleData", "BSMblob");
			throw ee;
		    }
		    if (source.position() >= end_pos0)
			break;
		    tag = source.decodeTagLength();
		    if (tag == 0)
			break;
		    if (tag == 0x88 || tag == 0xA8) {
			try {
			    this.status = new VehicleRequestStatus(coder.decodeOctetString(source));
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("status", "VehicleRequestStatus");
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
			    ee.appendExtensionContext("SignalRequestMsg", -1);
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
	    ee.appendFieldContext(null, "SignalRequestMsg");
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
	    SignalRequestMsg temp0 = this;

	    if (temp0.status != null) {
		try {
		    len0 += sink.encodeLengthTag(sink.write(temp0.status.byteArrayValue()), 0x88);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("status", "VehicleRequestStatus");
		    throw ee;
		}
	    }
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.vehicleData.byteArrayValue()), 0x87);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("vehicleData", "BSMblob");
		throw ee;
	    }
	    if (temp0.vehicleVIN != null) {
		try {
		    len0 += sink.encodeLengthTag(temp0.vehicleVIN.encodeValue(coder, sink), 0xA6);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("vehicleVIN", "VehicleIdent");
		    throw ee;
		}
	    }
	    if (temp0.transitStatus != null) {
		try {
		    int bitsToTransfer = (temp0.transitStatus.getSize() < 6) ? 6
			: com.oss.util.BitTool.computeMinimalLength(temp0.transitStatus, temp0.transitStatus._cBounds_);
		    len0 += sink.encodeLengthTag(coder.encodeBitString(temp0.transitStatus, sink, bitsToTransfer), 0x85);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("transitStatus", "TransitStatus");
		    throw ee;
		}
	    }
	    if (temp0.endOfService != null) {
		try {
		    len0 += sink.encodeLengthTag(temp0.endOfService.encodeValue(coder, sink), 0xA4);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("endOfService", "DTime");
		    throw ee;
		}
	    }
	    if (temp0.timeOfService != null) {
		try {
		    len0 += sink.encodeLengthTag(temp0.timeOfService.encodeValue(coder, sink), 0xA3);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("timeOfService", "DTime");
		    throw ee;
		}
	    }
	    try {
		len0 += sink.encodeLengthTag(temp0.request.encodeValue(coder, sink), 0xA2);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("request", "SignalRequest");
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
	    ee.appendFieldContext(null, "SignalRequestMsg");
	    throw ee;
	}
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, SignalRequestMsg data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	boolean has_timeOfService0 = data.timeOfService != null;
	boolean has_endOfService0 = data.endOfService != null;
	boolean has_transitStatus0 = data.transitStatus != null;
	boolean has_vehicleVIN0 = data.vehicleVIN != null;
	boolean has_status0 = data.status != null;
	sink.writeBit(false); ++nbits;
	sink.writeBit(has_timeOfService0); ++nbits;
	sink.writeBit(has_endOfService0); ++nbits;
	sink.writeBit(has_transitStatus0); ++nbits;
	sink.writeBit(has_vehicleVIN0); ++nbits;
	sink.writeBit(has_status0); ++nbits;
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
	// Encode field 'request'
	try {
	    SignalRequest item1 = data.request;

	    nbits += SignalRequest.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("request", "SignalRequest");
	    throw ee;
	}
	if (has_timeOfService0) {
	    // Encode field 'timeOfService'
	    try {
		DTime item1 = data.timeOfService;

		nbits += DTime.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("timeOfService", "DTime");
		throw ee;
	    }
	}
	if (has_endOfService0) {
	    // Encode field 'endOfService'
	    try {
		DTime item1 = data.endOfService;

		nbits += DTime.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("endOfService", "DTime");
		throw ee;
	    }
	}
	if (has_transitStatus0) {
	    // Encode field 'transitStatus'
	    try {
		TransitStatus item1 = data.transitStatus;
		int len1 = item1.getSize();
		int total_len1;

		total_len1 = com.oss.util.BitTool.computeMinimalLength(item1, SignalRequestMsg._cBounds_transitStatus);
		if (total_len1 != 6)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + total_len1);
		nbits += com.oss.coders.per.PerBitstring.encode(coder, item1.byteArrayValue(), len1, total_len1, 6, 6, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("transitStatus", "TransitStatus");
		throw ee;
	    }
	}
	if (has_vehicleVIN0) {
	    // Encode field 'vehicleVIN'
	    try {
		VehicleIdent item1 = data.vehicleVIN;

		nbits += VehicleIdent.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("vehicleVIN", "VehicleIdent");
		throw ee;
	    }
	}
	// Encode field 'vehicleData'
	try {
	    BSMblob item1 = data.vehicleData;
	    int len1 = item1.getSize();

	    if (len1 != 38)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 38, 38, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("vehicleData", "BSMblob");
	    throw ee;
	}
	if (has_status0) {
	    // Encode field 'status'
	    try {
		VehicleRequestStatus item1 = data.status;
		int len1 = item1.getSize();

		if (len1 != 1)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 1, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("status", "VehicleRequestStatus");
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
	    return SignalRequestMsg.encodeValue(coder, sink, this);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext(null, "SignalRequestMsg");
	    throw ee;
	}
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static SignalRequestMsg decodeValue(PerCoder coder, InputBitStream source, SignalRequestMsg data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	int idx0;
	InputBitStream bitstream0 = null;

	boolean has_timeOfService0 = source.readBit();
	boolean has_endOfService0 = source.readBit();
	boolean has_transitStatus0 = source.readBit();
	boolean has_vehicleVIN0 = source.readBit();
	boolean has_status0 = source.readBit();
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
	// Decode field 'request'
	try {
	    if (data.request == null)
		data.request = new SignalRequest();
	    SignalRequest.decodeValue(coder, source, data.request);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("request", "SignalRequest");
	    throw de;
	}
	if (has_timeOfService0) {
	    // Decode field 'timeOfService'
	    try {
		if (data.timeOfService == null)
		    data.timeOfService = new DTime();
		DTime.decodeValue(coder, source, data.timeOfService);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("timeOfService", "DTime");
		throw de;
	    }
	} else {
	    data.timeOfService = null;
	}
	if (has_endOfService0) {
	    // Decode field 'endOfService'
	    try {
		if (data.endOfService == null)
		    data.endOfService = new DTime();
		DTime.decodeValue(coder, source, data.endOfService);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("endOfService", "DTime");
		throw de;
	    }
	} else {
	    data.endOfService = null;
	}
	if (has_transitStatus0) {
	    // Decode field 'transitStatus'
	    try {
		if (data.transitStatus == null)
		    data.transitStatus = new TransitStatus();
		com.oss.coders.per.PerBitstring.decode(coder, source, 6, 6, data.transitStatus);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("transitStatus", "TransitStatus");
		throw de;
	    }
	} else {
	    data.transitStatus = null;
	}
	if (has_vehicleVIN0) {
	    // Decode field 'vehicleVIN'
	    try {
		if (data.vehicleVIN == null)
		    data.vehicleVIN = new VehicleIdent();
		VehicleIdent.decodeValue(coder, source, data.vehicleVIN);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("vehicleVIN", "VehicleIdent");
		throw de;
	    }
	} else {
	    data.vehicleVIN = null;
	}
	// Decode field 'vehicleData'
	try {
	    data.vehicleData = new BSMblob(com.oss.coders.per.PerOctets.decode(coder, source, 38, 38));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("vehicleData", "BSMblob");
	    throw de;
	}
	if (has_status0) {
	    // Decode field 'status'
	    try {
		data.status = new VehicleRequestStatus(com.oss.coders.per.PerOctets.decode(coder, source, 1, 1));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("status", "VehicleRequestStatus");
		throw de;
	    }
	} else {
	    data.status = null;
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
	    SignalRequestMsg.decodeValue(coder, source, this);
	    return this;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext(null, "SignalRequestMsg");
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
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("msgCnt ");
	    writer.print(this.msgCnt.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("request ");
	    this.request.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.timeOfService != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("timeOfService ");
		this.timeOfService.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.endOfService != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("endOfService ");
		this.endOfService.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.transitStatus != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("transitStatus ");
		printer.print(this.transitStatus, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.vehicleVIN != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("vehicleVIN ");
		this.vehicleVIN.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("vehicleData ");
	    printer.print(this.vehicleData, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.status != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("status ");
		printer.print(this.status, writer);
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
	return "SignalRequestMsg";
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((SignalRequestMsg)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((SignalRequestMsg)that);
    }
    
    public boolean equalTo(SignalRequestMsg that) {
	if (!this.msgID.equalTo(that.msgID))
	    return false;
	if (!this.msgCnt.equalTo(that.msgCnt))
	    return false;
	if (!this.request.equalTo(that.request))
	    return false;
	if (this.timeOfService != null && that.timeOfService != null) {
	    if (!this.timeOfService.equalTo(that.timeOfService))
		return false;
	}
	if (this.endOfService != null && that.endOfService != null) {
	    if (!this.endOfService.equalTo(that.endOfService))
		return false;
	}
	if (this.transitStatus != null && that.transitStatus != null) {
	    if (!this.transitStatus.equalTo(that.transitStatus))
		return false;
	}
	if (this.vehicleVIN != null && that.vehicleVIN != null) {
	    if (!this.vehicleVIN.equalTo(that.vehicleVIN))
		return false;
	}
	if (!this.vehicleData.equalTo(that.vehicleData))
	    return false;
	if (this.status != null && that.status != null) {
	    if (!this.status.equalTo(that.status))
		return false;
	}
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public SignalRequestMsg clone() {
	SignalRequestMsg copy = (SignalRequestMsg)super.clone();
	copy.msgID = msgID.clone();
	copy.msgCnt = msgCnt.clone();
	copy.request = request.clone();
	if (timeOfService != null) {
	    copy.timeOfService = timeOfService.clone();
	}
	if (endOfService != null) {
	    copy.endOfService = endOfService.clone();
	}
	if (transitStatus != null) {
	    copy.transitStatus = transitStatus.clone();
	}
	if (vehicleVIN != null) {
	    copy.vehicleVIN = vehicleVIN.clone();
	}
	copy.vehicleData = vehicleData.clone();
	if (status != null) {
	    copy.status = status.clone();
	}
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
	    return new SignalRequestMsg();
	}
    };
    
} // End class definition for SignalRequestMsg
