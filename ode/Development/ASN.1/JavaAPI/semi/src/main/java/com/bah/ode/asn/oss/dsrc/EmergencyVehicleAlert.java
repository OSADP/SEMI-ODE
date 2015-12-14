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
/* Created: Mon Dec 14 11:50:30 2015 */
/* ASN.1 Compiler for Java version: 6.2 */
/* ASN.1 compiler options and file names specified:
 * -toed -output com.bah.ode.asn.oss -per -uper -ber -der -root -noSampleCode
 * -messageFormat msvc
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
 * Define the ASN1 Type EmergencyVehicleAlert from ASN1 Module DSRC.
 * @see Sequence
 */

public class EmergencyVehicleAlert extends Sequence implements BEREncodable, BERDecodable, DEREncodable, PEREncodable, PERDecodable {
    public DSRCmsgID msgID;
    public TemporaryID id;
    public RoadSideAlert rsaMsg;
    public ResponseType responseType;
    public EmergencyDetails details;
    public VehicleMass mass;
    public VehicleType basicType;
    public com.bah.ode.asn.oss.itis.VehicleGroupAffected vehicleType;
    public com.bah.ode.asn.oss.itis.IncidentResponseEquipment responseEquip;
    public com.bah.ode.asn.oss.itis.ResponderGroupAffected responderType;
    public MsgCRC crc;
    
    /**
     * The default constructor.
     */
    public EmergencyVehicleAlert()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public EmergencyVehicleAlert(DSRCmsgID msgID, TemporaryID id, 
		    RoadSideAlert rsaMsg, ResponseType responseType, 
		    EmergencyDetails details, VehicleMass mass, 
		    VehicleType basicType, 
		    com.bah.ode.asn.oss.itis.VehicleGroupAffected vehicleType, 
		    com.bah.ode.asn.oss.itis.IncidentResponseEquipment responseEquip, 
		    com.bah.ode.asn.oss.itis.ResponderGroupAffected responderType, 
		    MsgCRC crc)
    {
	setMsgID(msgID);
	setId(id);
	setRsaMsg(rsaMsg);
	setResponseType(responseType);
	setDetails(details);
	setMass(mass);
	setBasicType(basicType);
	setVehicleType(vehicleType);
	setResponseEquip(responseEquip);
	setResponderType(responderType);
	setCrc(crc);
    }
    
    /**
     * Construct with required components.
     */
    public EmergencyVehicleAlert(DSRCmsgID msgID, RoadSideAlert rsaMsg, 
		    MsgCRC crc)
    {
	setMsgID(msgID);
	setRsaMsg(rsaMsg);
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
    
    
    // Methods for field "id"
    public TemporaryID getId()
    {
	return this.id;
    }
    
    public void setId(TemporaryID id)
    {
	this.id = id;
    }
    
    public boolean hasId()
    {
	return (id != null);
    }
    
    public void deleteId()
    {
	id = null;
    }
    
    
    // Methods for field "rsaMsg"
    public RoadSideAlert getRsaMsg()
    {
	return this.rsaMsg;
    }
    
    public void setRsaMsg(RoadSideAlert rsaMsg)
    {
	this.rsaMsg = rsaMsg;
    }
    
    
    // Methods for field "responseType"
    public ResponseType getResponseType()
    {
	return this.responseType;
    }
    
    public void setResponseType(ResponseType responseType)
    {
	this.responseType = responseType;
    }
    
    public boolean hasResponseType()
    {
	return (responseType != null);
    }
    
    public void deleteResponseType()
    {
	responseType = null;
    }
    
    
    // Methods for field "details"
    public EmergencyDetails getDetails()
    {
	return this.details;
    }
    
    public void setDetails(EmergencyDetails details)
    {
	this.details = details;
    }
    
    public boolean hasDetails()
    {
	return (details != null);
    }
    
    public void deleteDetails()
    {
	details = null;
    }
    
    
    // Methods for field "mass"
    public VehicleMass getMass()
    {
	return this.mass;
    }
    
    public void setMass(VehicleMass mass)
    {
	this.mass = mass;
    }
    
    public boolean hasMass()
    {
	return (mass != null);
    }
    
    public void deleteMass()
    {
	mass = null;
    }
    
    
    // Methods for field "basicType"
    public VehicleType getBasicType()
    {
	return this.basicType;
    }
    
    public void setBasicType(VehicleType basicType)
    {
	this.basicType = basicType;
    }
    
    public boolean hasBasicType()
    {
	return (basicType != null);
    }
    
    public void deleteBasicType()
    {
	basicType = null;
    }
    
    
    // Methods for field "vehicleType"
    public com.bah.ode.asn.oss.itis.VehicleGroupAffected getVehicleType()
    {
	return this.vehicleType;
    }
    
    public void setVehicleType(com.bah.ode.asn.oss.itis.VehicleGroupAffected vehicleType)
    {
	this.vehicleType = vehicleType;
    }
    
    public boolean hasVehicleType()
    {
	return (vehicleType != null);
    }
    
    public void deleteVehicleType()
    {
	vehicleType = null;
    }
    
    
    // Methods for field "responseEquip"
    public com.bah.ode.asn.oss.itis.IncidentResponseEquipment getResponseEquip()
    {
	return this.responseEquip;
    }
    
    public void setResponseEquip(com.bah.ode.asn.oss.itis.IncidentResponseEquipment responseEquip)
    {
	this.responseEquip = responseEquip;
    }
    
    public boolean hasResponseEquip()
    {
	return (responseEquip != null);
    }
    
    public void deleteResponseEquip()
    {
	responseEquip = null;
    }
    
    
    // Methods for field "responderType"
    public com.bah.ode.asn.oss.itis.ResponderGroupAffected getResponderType()
    {
	return this.responderType;
    }
    
    public void setResponderType(com.bah.ode.asn.oss.itis.ResponderGroupAffected responderType)
    {
	this.responderType = responderType;
    }
    
    public boolean hasResponderType()
    {
	return (responderType != null);
    }
    
    public void deleteResponderType()
    {
	responderType = null;
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
     * Encode the PDU using BER (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encode(BerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	try {
	    int len0 = 0;
	    EmergencyVehicleAlert temp0 = this;

	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.crc.byteArrayValue()), 0x8A);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("crc", "MsgCRC");
		throw ee;
	    }
	    if (temp0.responderType != null) {
		try {
		    len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.responderType, sink), 0x89);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("responderType", "ResponderGroupAffected");
		    throw ee;
		}
	    }
	    if (temp0.responseEquip != null) {
		try {
		    len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.responseEquip, sink), 0x88);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("responseEquip", "IncidentResponseEquipment");
		    throw ee;
		}
	    }
	    if (temp0.vehicleType != null) {
		try {
		    len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.vehicleType, sink), 0x87);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("vehicleType", "VehicleGroupAffected");
		    throw ee;
		}
	    }
	    if (temp0.basicType != null) {
		try {
		    len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.basicType, sink), 0x86);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("basicType", "VehicleType");
		    throw ee;
		}
	    }
	    if (temp0.mass != null) {
		try {
		    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.mass, sink), 0x85);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("mass", "VehicleMass");
		    throw ee;
		}
	    }
	    if (temp0.details != null) {
		try {
		    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.details, sink), 0x84);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("details", "EmergencyDetails");
		    throw ee;
		}
	    }
	    if (temp0.responseType != null) {
		try {
		    len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.responseType, sink), 0x83);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("responseType", "ResponseType");
		    throw ee;
		}
	    }
	    try {
		int len1 = 0;
		RoadSideAlert temp1 = temp0.rsaMsg;

		try {
		    len1 += sink.encodeLengthTag(sink.write(temp1.crc.byteArrayValue()), 0x89);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("crc", "MsgCRC");
		    throw ee;
		}
		if (temp1.furtherInfoID != null) {
		    try {
			len1 += sink.encodeLengthTag(sink.write(temp1.furtherInfoID.byteArrayValue()), 0x88);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("furtherInfoID", "FurtherInfoID");
			throw ee;
		    }
		}
		if (temp1.positon != null) {
		    try {
			len1 += sink.encodeLengthTag(temp1.positon.encodeValue(coder, sink), 0xA7);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("positon", "FullPositionVector");
			throw ee;
		    }
		}
		if (temp1.extent != null) {
		    try {
			len1 += sink.encodeLengthTag(coder.encodeEnumerated(temp1.extent, sink), 0x86);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("extent", "Extent");
			throw ee;
		    }
		}
		if (temp1.heading != null) {
		    try {
			len1 += sink.encodeLengthTag(sink.write(temp1.heading.byteArrayValue()), 0x85);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("heading", "HeadingSlice");
			throw ee;
		    }
		}
		if (temp1.priority != null) {
		    try {
			len1 += sink.encodeLengthTag(sink.write(temp1.priority.byteArrayValue()), 0x84);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("priority", "Priority");
			throw ee;
		    }
		}
		if (temp1.description != null) {
		    try {
			int len2 = 0;
			java.util.ArrayList<com.bah.ode.asn.oss.itis.ITIScodes> temp2 = temp1.description.elements;
			int idx2 = temp2 != null ? temp2.size() : 0;

			try {
			    while(idx2-- > 0) {
				len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.get(idx2), sink), 0x2);
			    }
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendElementContext(null, "SEQUENCE OF", idx2);
			    throw ee;
			}
			len1 += sink.encodeLengthTag(len2, 0xA3);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("description", "SEQUENCE OF");
			throw ee;
		    }
		}
		try {
		    len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.typeEvent, sink), 0x82);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("typeEvent", "ITIScodes");
		    throw ee;
		}
		try {
		    len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.msgCnt, sink), 0x81);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("msgCnt", "MsgCount");
		    throw ee;
		}
		try {
		    len1 += sink.encodeLengthTag(coder.encodeEnumerated(temp1.msgID, sink), 0x80);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("msgID", "DSRCmsgID");
		    throw ee;
		}
		len0 += sink.encodeLengthTag(len1, 0xA2);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("rsaMsg", "RoadSideAlert");
		throw ee;
	    }
	    if (temp0.id != null) {
		try {
		    len0 += sink.encodeLengthTag(sink.write(temp0.id.byteArrayValue()), 0x81);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("id", "TemporaryID");
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
	    ee.appendFieldContext(null, "EmergencyVehicleAlert");
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
	this.id = null;
	this.responseType = null;
	this.details = null;
	this.mass = null;
	this.basicType = null;
	this.vehicleType = null;
	this.responseEquip = null;
	this.responderType = null;
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
		    if (tag == 0x81 || tag == 0xA1) {
			try {
			    this.id = new TemporaryID(coder.decodeOctetString(source));
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("id", "TemporaryID");
			    throw ee;
			}
			tag = source.decodeTagLength();
		    }
		    if (tag != 0xA2)
			source.raiseTagMismatchException(tag);
		    try {
			this.rsaMsg = new RoadSideAlert();
			{
			    int total_len1 = source.mLength;
			    int end_pos1 = (total_len1 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len1);

			    tag = source.decodeTagLength();
			    if (tag != 0x80)
				source.raiseTagMismatchException(tag);
			    try {
				int idx2 = DSRCmsgID.indexOfValue(source.decodeLong());
				this.rsaMsg.msgID = (idx2 < 0) ? DSRCmsgID.unknownEnumerator() : DSRCmsgID.cNamedNumbers[idx2];
			    } catch (Exception e) {
				DecoderException ee = DecoderException.wrapException(e);
				ee.appendFieldContext("msgID", "DSRCmsgID");
				throw ee;
			    }
			    tag = source.decodeTagLength();
			    if (tag != 0x81)
				source.raiseTagMismatchException(tag);
			    try {
				this.rsaMsg.msgCnt = new MsgCount(source.decodeLong());
			    } catch (Exception e) {
				DecoderException ee = DecoderException.wrapException(e);
				ee.appendFieldContext("msgCnt", "MsgCount");
				throw ee;
			    }
			    tag = source.decodeTagLength();
			    if (tag != 0x82)
				source.raiseTagMismatchException(tag);
			    try {
				this.rsaMsg.typeEvent = new com.bah.ode.asn.oss.itis.ITIScodes(source.decodeLong());
			    } catch (Exception e) {
				DecoderException ee = DecoderException.wrapException(e);
				ee.appendFieldContext("typeEvent", "ITIScodes");
				throw ee;
			    }
			    tag = source.decodeTagLength();
			    if (tag == 0xA3) {
				try {
				    this.rsaMsg.description = new com.bah.ode.asn.oss.dsrc.RoadSideAlert.Description();
				    {
					int total_len2 = source.mLength;
					int end_pos2 = (total_len2 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len2);
					int idx2 = 0;

					this.rsaMsg.description.elements = new java.util.ArrayList<com.bah.ode.asn.oss.itis.ITIScodes>();

					try {
					    for (;;) {
						if (source.position() >= end_pos2) {
						    if (source.position() > end_pos2)
							throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
						    break;
						}
						tag = source.decodeTagLength();
						if (tag == 0) {
						    if (total_len2 < 0) {
							if (source.mLength != 0)
							    throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);
							break;
						    }
						    if (source.mLength == 0)
							throw new DecoderException(ExceptionDescriptor._expect_tag, null);
						}
						com.bah.ode.asn.oss.itis.ITIScodes temp2;
						if (tag != 0x2)
						    source.raiseTagMismatchException(tag);
						temp2 = new com.bah.ode.asn.oss.itis.ITIScodes(source.decodeLong());
						this.rsaMsg.description.add(temp2);
						++idx2;
					    }
					} catch (Exception e) {
					    DecoderException ee = DecoderException.wrapException(e);
					    ee.appendElementContext(null, "SEQUENCE OF", idx2);
					    throw ee;
					}
				    }
				} catch (Exception e) {
				    DecoderException ee = DecoderException.wrapException(e);
				    ee.appendFieldContext("description", "SEQUENCE OF");
				    throw ee;
				}
				tag = source.decodeTagLength();
			    }
			    if (tag == 0x84 || tag == 0xA4) {
				try {
				    this.rsaMsg.priority = new Priority(coder.decodeOctetString(source));
				} catch (Exception e) {
				    DecoderException ee = DecoderException.wrapException(e);
				    ee.appendFieldContext("priority", "Priority");
				    throw ee;
				}
				tag = source.decodeTagLength();
			    }
			    if (tag == 0x85 || tag == 0xA5) {
				try {
				    this.rsaMsg.heading = new HeadingSlice(coder.decodeOctetString(source));
				} catch (Exception e) {
				    DecoderException ee = DecoderException.wrapException(e);
				    ee.appendFieldContext("heading", "HeadingSlice");
				    throw ee;
				}
				tag = source.decodeTagLength();
			    }
			    if (tag == 0x86) {
				try {
				    int idx2 = Extent.indexOfValue(source.decodeInt());
				    if (idx2 < 0)
					throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
				    this.rsaMsg.extent = Extent.cNamedNumbers[idx2];
				} catch (Exception e) {
				    DecoderException ee = DecoderException.wrapException(e);
				    ee.appendFieldContext("extent", "Extent");
				    throw ee;
				}
				tag = source.decodeTagLength();
			    }
			    if (tag == 0xA7) {
				try {
				    this.rsaMsg.positon = new FullPositionVector();
				    this.rsaMsg.positon.decodeValue(coder, source);
				} catch (Exception e) {
				    DecoderException ee = DecoderException.wrapException(e);
				    ee.appendFieldContext("positon", "FullPositionVector");
				    throw ee;
				}
				tag = source.decodeTagLength();
			    }
			    if (tag == 0x88 || tag == 0xA8) {
				try {
				    this.rsaMsg.furtherInfoID = new FurtherInfoID(coder.decodeOctetString(source));
				} catch (Exception e) {
				    DecoderException ee = DecoderException.wrapException(e);
				    ee.appendFieldContext("furtherInfoID", "FurtherInfoID");
				    throw ee;
				}
				tag = source.decodeTagLength();
			    }
			    if (tag != 0x89 && tag != 0xA9)
				source.raiseTagMismatchException(tag);
			    try {
				this.rsaMsg.crc = new MsgCRC(coder.decodeOctetString(source));
			    } catch (Exception e) {
				DecoderException ee = DecoderException.wrapException(e);
				ee.appendFieldContext("crc", "MsgCRC");
				throw ee;
			    }
			    if (source.position() != end_pos1) {
				if (total_len1 >= 0)
				    throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
				tag = source.decodeTagLength();
				if (tag != 0 || source.mLength != 0)
				    throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);
			    }
			}
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("rsaMsg", "RoadSideAlert");
			throw ee;
		    }
		    tag = source.decodeTagLength();
		    if (tag == 0x83) {
			try {
			    int idx1 = ResponseType.indexOfValue(source.decodeInt());
			    if (idx1 < 0)
				throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
			    this.responseType = ResponseType.cNamedNumbers[idx1];
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("responseType", "ResponseType");
			    throw ee;
			}
			tag = source.decodeTagLength();
		    }
		    if (tag == 0x84) {
			try {
			    this.details = new EmergencyDetails(source.decodeLong());
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("details", "EmergencyDetails");
			    throw ee;
			}
			tag = source.decodeTagLength();
		    }
		    if (tag == 0x85) {
			try {
			    this.mass = new VehicleMass(source.decodeLong());
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("mass", "VehicleMass");
			    throw ee;
			}
			tag = source.decodeTagLength();
		    }
		    if (tag == 0x86) {
			try {
			    int idx1 = VehicleType.indexOfValue(source.decodeLong());
			    this.basicType = (idx1 < 0) ? VehicleType.unknownEnumerator() : VehicleType.cNamedNumbers[idx1];
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("basicType", "VehicleType");
			    throw ee;
			}
			tag = source.decodeTagLength();
		    }
		    if (tag == 0x87) {
			try {
			    int idx1 = com.bah.ode.asn.oss.itis.VehicleGroupAffected.indexOfValue(source.decodeLong());
			    this.vehicleType = (idx1 < 0) ? com.bah.ode.asn.oss.itis.VehicleGroupAffected.unknownEnumerator() : com.bah.ode.asn.oss.itis.VehicleGroupAffected.cNamedNumbers[idx1];
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("vehicleType", "VehicleGroupAffected");
			    throw ee;
			}
			tag = source.decodeTagLength();
		    }
		    if (tag == 0x88) {
			try {
			    int idx1 = com.bah.ode.asn.oss.itis.IncidentResponseEquipment.indexOfValue(source.decodeLong());
			    this.responseEquip = (idx1 < 0) ? com.bah.ode.asn.oss.itis.IncidentResponseEquipment.unknownEnumerator() : com.bah.ode.asn.oss.itis.IncidentResponseEquipment.cNamedNumbers[idx1];
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("responseEquip", "IncidentResponseEquipment");
			    throw ee;
			}
			tag = source.decodeTagLength();
		    }
		    if (tag == 0x89) {
			try {
			    int idx1 = com.bah.ode.asn.oss.itis.ResponderGroupAffected.indexOfValue(source.decodeLong());
			    this.responderType = (idx1 < 0) ? com.bah.ode.asn.oss.itis.ResponderGroupAffected.unknownEnumerator() : com.bah.ode.asn.oss.itis.ResponderGroupAffected.cNamedNumbers[idx1];
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("responderType", "ResponderGroupAffected");
			    throw ee;
			}
			tag = source.decodeTagLength();
		    }
		    if (tag != 0x8A && tag != 0xAA)
			source.raiseTagMismatchException(tag);
		    try {
			this.crc = new MsgCRC(coder.decodeOctetString(source));
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("crc", "MsgCRC");
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
			    ee.appendExtensionContext("EmergencyVehicleAlert", -1);
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
	    ee.appendFieldContext(null, "EmergencyVehicleAlert");
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
	    EmergencyVehicleAlert temp0 = this;

	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.crc.byteArrayValue()), 0x8A);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("crc", "MsgCRC");
		throw ee;
	    }
	    if (temp0.responderType != null) {
		try {
		    len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.responderType, sink), 0x89);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("responderType", "ResponderGroupAffected");
		    throw ee;
		}
	    }
	    if (temp0.responseEquip != null) {
		try {
		    len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.responseEquip, sink), 0x88);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("responseEquip", "IncidentResponseEquipment");
		    throw ee;
		}
	    }
	    if (temp0.vehicleType != null) {
		try {
		    len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.vehicleType, sink), 0x87);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("vehicleType", "VehicleGroupAffected");
		    throw ee;
		}
	    }
	    if (temp0.basicType != null) {
		try {
		    len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.basicType, sink), 0x86);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("basicType", "VehicleType");
		    throw ee;
		}
	    }
	    if (temp0.mass != null) {
		try {
		    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.mass, sink), 0x85);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("mass", "VehicleMass");
		    throw ee;
		}
	    }
	    if (temp0.details != null) {
		try {
		    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.details, sink), 0x84);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("details", "EmergencyDetails");
		    throw ee;
		}
	    }
	    if (temp0.responseType != null) {
		try {
		    len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.responseType, sink), 0x83);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("responseType", "ResponseType");
		    throw ee;
		}
	    }
	    try {
		int len1 = 0;
		RoadSideAlert temp1 = temp0.rsaMsg;

		try {
		    len1 += sink.encodeLengthTag(sink.write(temp1.crc.byteArrayValue()), 0x89);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("crc", "MsgCRC");
		    throw ee;
		}
		if (temp1.furtherInfoID != null) {
		    try {
			len1 += sink.encodeLengthTag(sink.write(temp1.furtherInfoID.byteArrayValue()), 0x88);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("furtherInfoID", "FurtherInfoID");
			throw ee;
		    }
		}
		if (temp1.positon != null) {
		    try {
			len1 += sink.encodeLengthTag(temp1.positon.encodeValue(coder, sink), 0xA7);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("positon", "FullPositionVector");
			throw ee;
		    }
		}
		if (temp1.extent != null) {
		    try {
			len1 += sink.encodeLengthTag(coder.encodeEnumerated(temp1.extent, sink), 0x86);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("extent", "Extent");
			throw ee;
		    }
		}
		if (temp1.heading != null) {
		    try {
			len1 += sink.encodeLengthTag(sink.write(temp1.heading.byteArrayValue()), 0x85);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("heading", "HeadingSlice");
			throw ee;
		    }
		}
		if (temp1.priority != null) {
		    try {
			len1 += sink.encodeLengthTag(sink.write(temp1.priority.byteArrayValue()), 0x84);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("priority", "Priority");
			throw ee;
		    }
		}
		if (temp1.description != null) {
		    try {
			int len2 = 0;
			java.util.ArrayList<com.bah.ode.asn.oss.itis.ITIScodes> temp2 = temp1.description.elements;
			int idx2 = temp2 != null ? temp2.size() : 0;

			try {
			    while(idx2-- > 0) {
				len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.get(idx2), sink), 0x2);
			    }
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendElementContext(null, "SEQUENCE OF", idx2);
			    throw ee;
			}
			len1 += sink.encodeLengthTag(len2, 0xA3);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("description", "SEQUENCE OF");
			throw ee;
		    }
		}
		try {
		    len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.typeEvent, sink), 0x82);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("typeEvent", "ITIScodes");
		    throw ee;
		}
		try {
		    len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.msgCnt, sink), 0x81);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("msgCnt", "MsgCount");
		    throw ee;
		}
		try {
		    len1 += sink.encodeLengthTag(coder.encodeEnumerated(temp1.msgID, sink), 0x80);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("msgID", "DSRCmsgID");
		    throw ee;
		}
		len0 += sink.encodeLengthTag(len1, 0xA2);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("rsaMsg", "RoadSideAlert");
		throw ee;
	    }
	    if (temp0.id != null) {
		try {
		    len0 += sink.encodeLengthTag(sink.write(temp0.id.byteArrayValue()), 0x81);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("id", "TemporaryID");
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
	    ee.appendFieldContext(null, "EmergencyVehicleAlert");
	    throw ee;
	}
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, EmergencyVehicleAlert data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.id != null);
	sink.writeBit(data.responseType != null);
	sink.writeBit(data.details != null);
	sink.writeBit(data.mass != null);
	sink.writeBit(data.basicType != null);
	sink.writeBit(data.vehicleType != null);
	sink.writeBit(data.responseEquip != null);
	sink.writeBit(data.responderType != null);
	nbits += 9;
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
	if (data.id != null) {
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
	}
	// Encode field 'rsaMsg'
	try {
	    RoadSideAlert item1 = data.rsaMsg;

	    nbits += RoadSideAlert.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("rsaMsg", "RoadSideAlert");
	    throw ee;
	}
	if (data.responseType != null) {
	    // Encode field 'responseType'
	    try {
		ResponseType item1 = data.responseType;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 3, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("responseType", "ResponseType");
		throw ee;
	    }
	}
	if (data.details != null) {
	    // Encode field 'details'
	    try {
		EmergencyDetails item1 = data.details;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 63)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 63, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("details", "EmergencyDetails");
		throw ee;
	    }
	}
	if (data.mass != null) {
	    // Encode field 'mass'
	    try {
		VehicleMass item1 = data.mass;
		long temp1 = item1.longValue();

		if (temp1 < 1 || temp1 > 127)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 1, 127, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("mass", "VehicleMass");
		throw ee;
	    }
	}
	if (data.basicType != null) {
	    // Encode field 'basicType'
	    try {
		VehicleType item1 = data.basicType;
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
		ee.appendFieldContext("basicType", "VehicleType");
		throw ee;
	    }
	}
	if (data.vehicleType != null) {
	    // Encode field 'vehicleType'
	    try {
		com.bah.ode.asn.oss.itis.VehicleGroupAffected item1 = data.vehicleType;
		int idx1;
		boolean extroot1 = true;

		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else {
		    idx1 = item1.indexOf();
		    if (idx1 < 0)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    extroot1 = idx1 < 35;
		}
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 34, sink);
		else
		    nbits += coder.encodeNormallySmallNumber(idx1 - 35, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("vehicleType", "VehicleGroupAffected");
		throw ee;
	    }
	}
	if (data.responseEquip != null) {
	    // Encode field 'responseEquip'
	    try {
		com.bah.ode.asn.oss.itis.IncidentResponseEquipment item1 = data.responseEquip;
		int idx1;
		boolean extroot1 = true;

		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else {
		    idx1 = item1.indexOf();
		    if (idx1 < 0)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    extroot1 = idx1 < 72;
		}
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 71, sink);
		else
		    nbits += coder.encodeNormallySmallNumber(idx1 - 72, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("responseEquip", "IncidentResponseEquipment");
		throw ee;
	    }
	}
	if (data.responderType != null) {
	    // Encode field 'responderType'
	    try {
		com.bah.ode.asn.oss.itis.ResponderGroupAffected item1 = data.responderType;
		int idx1;
		boolean extroot1 = true;

		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else {
		    idx1 = item1.indexOf();
		    if (idx1 < 0)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    extroot1 = idx1 < 14;
		}
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 13, sink);
		else
		    nbits += coder.encodeNormallySmallNumber(idx1 - 14, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("responderType", "ResponderGroupAffected");
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
	    ee.appendFieldContext(null, "EmergencyVehicleAlert");
	    throw ee;
	}
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static EmergencyVehicleAlert decodeValue(PerCoder coder, InputBitStream source, EmergencyVehicleAlert data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_id0 = source.readBit();
	boolean has_responseType0 = source.readBit();
	boolean has_details0 = source.readBit();
	boolean has_mass0 = source.readBit();
	boolean has_basicType0 = source.readBit();
	boolean has_vehicleType0 = source.readBit();
	boolean has_responseEquip0 = source.readBit();
	boolean has_responderType0 = source.readBit();
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
	if (has_id0) {
	    // Decode field 'id'
	    try {
		data.id = new TemporaryID(com.oss.coders.per.PerOctets.decode(coder, source, 4, 4));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("id", "TemporaryID");
		throw de;
	    }
	} else {
	    data.id = null;
	}
	// Decode field 'rsaMsg'
	try {
	    if (data.rsaMsg == null)
		data.rsaMsg = new RoadSideAlert();
	    data.rsaMsg.decodeValue(coder, source, data.rsaMsg);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("rsaMsg", "RoadSideAlert");
	    throw de;
	}
	if (has_responseType0) {
	    // Decode field 'responseType'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
		if (idx1 < 0 || idx1 > 3)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.responseType = ResponseType.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("responseType", "ResponseType");
		throw de;
	    }
	} else {
	    data.responseType = null;
	}
	if (has_details0) {
	    // Decode field 'details'
	    try {
		long temp1;

		if (data.details == null)
		    data.details = new EmergencyDetails();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 63);
		if (temp1 > 63)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.details.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("details", "EmergencyDetails");
		throw de;
	    }
	} else {
	    data.details = null;
	}
	if (has_mass0) {
	    // Decode field 'mass'
	    try {
		long temp1;

		if (data.mass == null)
		    data.mass = new VehicleMass();
		temp1 = coder.decodeConstrainedWholeNumber(source, 1, 127);
		if (temp1 > 127)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.mass.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("mass", "VehicleMass");
		throw de;
	    }
	} else {
	    data.mass = null;
	}
	if (has_basicType0) {
	    // Decode field 'basicType'
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
		data.basicType = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("basicType", "VehicleType");
		throw de;
	    }
	} else {
	    data.basicType = null;
	}
	if (has_vehicleType0) {
	    // Decode field 'vehicleType'
	    try {
		int idx1;
		com.bah.ode.asn.oss.itis.VehicleGroupAffected temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 34);
		    if (idx1 < 0 || idx1 > 34)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = com.bah.ode.asn.oss.itis.VehicleGroupAffected.valueAt(idx1);
		} else {
		    idx1 = 35 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = com.bah.ode.asn.oss.itis.VehicleGroupAffected.unknownEnumerator();
		}
		data.vehicleType = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("vehicleType", "VehicleGroupAffected");
		throw de;
	    }
	} else {
	    data.vehicleType = null;
	}
	if (has_responseEquip0) {
	    // Decode field 'responseEquip'
	    try {
		int idx1;
		com.bah.ode.asn.oss.itis.IncidentResponseEquipment temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 71);
		    if (idx1 < 0 || idx1 > 71)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = com.bah.ode.asn.oss.itis.IncidentResponseEquipment.valueAt(idx1);
		} else {
		    idx1 = 72 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = com.bah.ode.asn.oss.itis.IncidentResponseEquipment.unknownEnumerator();
		}
		data.responseEquip = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("responseEquip", "IncidentResponseEquipment");
		throw de;
	    }
	} else {
	    data.responseEquip = null;
	}
	if (has_responderType0) {
	    // Decode field 'responderType'
	    try {
		int idx1;
		com.bah.ode.asn.oss.itis.ResponderGroupAffected temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 13);
		    if (idx1 < 0 || idx1 > 13)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = com.bah.ode.asn.oss.itis.ResponderGroupAffected.valueAt(idx1);
		} else {
		    idx1 = 14 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = com.bah.ode.asn.oss.itis.ResponderGroupAffected.unknownEnumerator();
		}
		data.responderType = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("responderType", "ResponderGroupAffected");
		throw de;
	    }
	} else {
	    data.responderType = null;
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
	    de.appendFieldContext(null, "EmergencyVehicleAlert");
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
	if (this.id != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("id ");
		printer.print(this.id, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("rsaMsg ");
	    boolean comma1;
	    comma1 = false;
	    writer.print('{');
	    printer.indent();
	    comma1 = true;
	    try {
		printer.newLine(writer);
		writer.print("msgID ");
		printer.print(this.rsaMsg.msgID, writer, this.rsaMsg.msgID.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("msgCnt ");
		writer.print(this.rsaMsg.msgCnt.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("typeEvent ");
		writer.print(this.rsaMsg.typeEvent.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    if (this.rsaMsg.description != null) {
		try {
		    writer.print(',');
		    printer.newLine(writer);
		    writer.print("description ");
		    {
			java.util.ArrayList<com.bah.ode.asn.oss.itis.ITIScodes> temp2 = this.rsaMsg.description.elements;
			int len2 = temp2 != null ? temp2.size() : 0;
			int idx2 = 0;

			try {
			    writer.print('{');
			    printer.indent();
			    for (idx2 = 0; idx2 < len2; idx2++){
				if (idx2 > 0)
				    writer.print(',');
				printer.newLine(writer);
				writer.print(temp2.get(idx2).longValue());
			    }
			    printer.undent();
			    if (len2 > 0)
				printer.newLine(writer);
			    writer.print('}');
			} catch (Exception e) {
			    printer.reportError(e, null, writer);
			}
		    }
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
	    }
	    if (this.rsaMsg.priority != null) {
		try {
		    writer.print(',');
		    printer.newLine(writer);
		    writer.print("priority ");
		    printer.print(this.rsaMsg.priority, writer);
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
	    }
	    if (this.rsaMsg.heading != null) {
		try {
		    writer.print(',');
		    printer.newLine(writer);
		    writer.print("heading ");
		    printer.print(this.rsaMsg.heading, writer);
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
	    }
	    if (this.rsaMsg.extent != null) {
		try {
		    writer.print(',');
		    printer.newLine(writer);
		    writer.print("extent ");
		    printer.print(this.rsaMsg.extent, writer, this.rsaMsg.extent.cConstantNameList);
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
	    }
	    if (this.rsaMsg.positon != null) {
		try {
		    writer.print(',');
		    printer.newLine(writer);
		    writer.print("positon ");
		    this.rsaMsg.positon.printValue(printer, writer);
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
	    }
	    if (this.rsaMsg.furtherInfoID != null) {
		try {
		    writer.print(',');
		    printer.newLine(writer);
		    writer.print("furtherInfoID ");
		    printer.print(this.rsaMsg.furtherInfoID, writer);
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
	    }
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("crc ");
		printer.print(this.rsaMsg.crc, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    printer.undent();
	    printer.newLine(writer);
	    writer.print('}');
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.responseType != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("responseType ");
		printer.print(this.responseType, writer, this.responseType.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.details != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("details ");
		writer.print(this.details.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.mass != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("mass ");
		writer.print(this.mass.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.basicType != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("basicType ");
		printer.print(this.basicType, writer, this.basicType.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.vehicleType != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("vehicleType ");
		printer.print(this.vehicleType, writer, this.vehicleType.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.responseEquip != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("responseEquip ");
		printer.print(this.responseEquip, writer, this.responseEquip.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.responderType != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("responderType ");
		printer.print(this.responderType, writer, this.responderType.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("crc ");
	    printer.print(this.crc, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
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
	return "EmergencyVehicleAlert";
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((EmergencyVehicleAlert)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((EmergencyVehicleAlert)that);
    }
    
    public boolean equalTo(EmergencyVehicleAlert that) {
	if (!this.msgID.equalTo(that.msgID))
	    return false;
	if (this.id != null && that.id != null) {
	    if (!this.id.equalTo(that.id))
		return false;
	}
	if (!this.rsaMsg.equalTo(that.rsaMsg))
	    return false;
	if (this.responseType != null && that.responseType != null) {
	    if (!this.responseType.equalTo(that.responseType))
		return false;
	}
	if (this.details != null && that.details != null) {
	    if (!this.details.equalTo(that.details))
		return false;
	}
	if (this.mass != null && that.mass != null) {
	    if (!this.mass.equalTo(that.mass))
		return false;
	}
	if (this.basicType != null && that.basicType != null) {
	    if (!this.basicType.equalTo(that.basicType))
		return false;
	}
	if (this.vehicleType != null && that.vehicleType != null) {
	    if (!this.vehicleType.equalTo(that.vehicleType))
		return false;
	}
	if (this.responseEquip != null && that.responseEquip != null) {
	    if (!this.responseEquip.equalTo(that.responseEquip))
		return false;
	}
	if (this.responderType != null && that.responderType != null) {
	    if (!this.responderType.equalTo(that.responderType))
		return false;
	}
	if (!this.crc.equalTo(that.crc))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public EmergencyVehicleAlert clone() {
	EmergencyVehicleAlert copy = (EmergencyVehicleAlert)super.clone();
	copy.msgID = msgID.clone();
	if (id != null) {
	    copy.id = id.clone();
	}
	copy.rsaMsg = rsaMsg.clone();
	if (responseType != null) {
	    copy.responseType = responseType.clone();
	}
	if (details != null) {
	    copy.details = details.clone();
	}
	if (mass != null) {
	    copy.mass = mass.clone();
	}
	if (basicType != null) {
	    copy.basicType = basicType.clone();
	}
	if (vehicleType != null) {
	    copy.vehicleType = vehicleType.clone();
	}
	if (responseEquip != null) {
	    copy.responseEquip = responseEquip.clone();
	}
	if (responderType != null) {
	    copy.responderType = responderType.clone();
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
	hash = 41 * hash + (this.id != null ? this.id.hashCode() : 0);
	hash = 41 * hash + (this.rsaMsg != null ? this.rsaMsg.hashCode() : 0);
	hash = 41 * hash + (this.responseType != null ? this.responseType.hashCode() : 0);
	hash = 41 * hash + (this.details != null ? this.details.hashCode() : 0);
	hash = 41 * hash + (this.mass != null ? this.mass.hashCode() : 0);
	hash = 41 * hash + (this.basicType != null ? this.basicType.hashCode() : 0);
	hash = 41 * hash + (this.vehicleType != null ? this.vehicleType.hashCode() : 0);
	hash = 41 * hash + (this.responseEquip != null ? this.responseEquip.hashCode() : 0);
	hash = 41 * hash + (this.responderType != null ? this.responderType.hashCode() : 0);
	hash = 41 * hash + (this.crc != null ? this.crc.hashCode() : 0);
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
	    return new EmergencyVehicleAlert();
	}
    };
    
} // End class definition for EmergencyVehicleAlert
