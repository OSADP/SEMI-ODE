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
/* Created: Fri May 20 15:51:02 2016 */
/* ASN.1 Compiler for Java version: 6.3 */
/* ASN.1 compiler options and file names specified:
 * -toed -output com.bah.ode.asn.oss -per -uper -ber -der -root -noSampleCode
 * -messageFormat msvc
 * C:/Users/572682/Projects/ODE/GitRepo/ode/Development/ASN.1/DSRC_R36_Source.asn
 * C:/Users/572682/Projects/ODE/GitRepo/ode/Development/ASN.1/SEMI_ASN.1_Structures_2.2.asn
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
import com.oss.coders.OutputBitStream;
import com.oss.coders.per.PEREncodable;
import com.oss.coders.InputBitStream;
import com.oss.coders.per.PERDecodable;
import com.oss.coders.per.PerCoder;

/**
 * Define the ASN1 Type AdvisorySituationData from ASN1 Module SEMI.
 * @see Sequence
 */

public class AdvisorySituationData extends Sequence implements BEREncodable, BERDecodable, DEREncodable, PEREncodable, PERDecodable {
    public SemiDialogID dialogID;
    public SemiSequenceID seqID;
    public GroupID groupID;
    public com.bah.ode.asn.oss.dsrc.TemporaryID requestID;
    public com.bah.ode.asn.oss.dsrc.TemporaryID recordID;
    public TimeToLive timeToLive;
    public GeoRegion serviceRegion;
    public AdvisoryDetails asdmDetails;
    
    /**
     * The default constructor.
     */
    public AdvisorySituationData()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public AdvisorySituationData(SemiDialogID dialogID, SemiSequenceID seqID, 
		    GroupID groupID, 
		    com.bah.ode.asn.oss.dsrc.TemporaryID requestID, 
		    com.bah.ode.asn.oss.dsrc.TemporaryID recordID, 
		    TimeToLive timeToLive, GeoRegion serviceRegion, 
		    AdvisoryDetails asdmDetails)
    {
	setDialogID(dialogID);
	setSeqID(seqID);
	setGroupID(groupID);
	setRequestID(requestID);
	setRecordID(recordID);
	setTimeToLive(timeToLive);
	setServiceRegion(serviceRegion);
	setAsdmDetails(asdmDetails);
    }
    
    /**
     * Construct with required components.
     */
    public AdvisorySituationData(SemiDialogID dialogID, SemiSequenceID seqID, 
		    GroupID groupID, 
		    com.bah.ode.asn.oss.dsrc.TemporaryID requestID, 
		    GeoRegion serviceRegion, AdvisoryDetails asdmDetails)
    {
	setDialogID(dialogID);
	setSeqID(seqID);
	setGroupID(groupID);
	setRequestID(requestID);
	setServiceRegion(serviceRegion);
	setAsdmDetails(asdmDetails);
    }
    
    
    // Methods for field "dialogID"
    public SemiDialogID getDialogID()
    {
	return this.dialogID;
    }
    
    public void setDialogID(SemiDialogID dialogID)
    {
	this.dialogID = dialogID;
    }
    
    
    // Methods for field "seqID"
    public SemiSequenceID getSeqID()
    {
	return this.seqID;
    }
    
    public void setSeqID(SemiSequenceID seqID)
    {
	this.seqID = seqID;
    }
    
    
    // Methods for field "groupID"
    public GroupID getGroupID()
    {
	return this.groupID;
    }
    
    public void setGroupID(GroupID groupID)
    {
	this.groupID = groupID;
    }
    
    
    // Methods for field "requestID"
    public com.bah.ode.asn.oss.dsrc.TemporaryID getRequestID()
    {
	return this.requestID;
    }
    
    public void setRequestID(com.bah.ode.asn.oss.dsrc.TemporaryID requestID)
    {
	this.requestID = requestID;
    }
    
    
    // Methods for field "recordID"
    public com.bah.ode.asn.oss.dsrc.TemporaryID getRecordID()
    {
	return this.recordID;
    }
    
    public void setRecordID(com.bah.ode.asn.oss.dsrc.TemporaryID recordID)
    {
	this.recordID = recordID;
    }
    
    public boolean hasRecordID()
    {
	return (recordID != null);
    }
    
    public void deleteRecordID()
    {
	recordID = null;
    }
    
    
    // Methods for field "timeToLive"
    public TimeToLive getTimeToLive()
    {
	return this.timeToLive;
    }
    
    public void setTimeToLive(TimeToLive timeToLive)
    {
	this.timeToLive = timeToLive;
    }
    
    public boolean hasTimeToLive()
    {
	return (timeToLive != null);
    }
    
    public void deleteTimeToLive()
    {
	timeToLive = null;
    }
    
    
    // Methods for field "serviceRegion"
    public GeoRegion getServiceRegion()
    {
	return this.serviceRegion;
    }
    
    public void setServiceRegion(GeoRegion serviceRegion)
    {
	this.serviceRegion = serviceRegion;
    }
    
    
    // Methods for field "asdmDetails"
    public AdvisoryDetails getAsdmDetails()
    {
	return this.asdmDetails;
    }
    
    public void setAsdmDetails(AdvisoryDetails asdmDetails)
    {
	this.asdmDetails = asdmDetails;
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
	    AdvisorySituationData temp0 = this;

	    try {
		int len1 = 0;
		AdvisoryDetails temp1 = temp0.asdmDetails;

		try {
		    len1 += sink.encodeLengthTag(sink.write(temp1.advisoryMessage.byteArrayValue()), 0x85);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("advisoryMessage", "OCTET STRING");
		    throw ee;
		}
		if (temp1.stopTime != null) {
		    try {
			len1 += sink.encodeLengthTag(temp1.stopTime.encodeValue(coder, sink), 0xA4);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("stopTime", "DFullTime");
			throw ee;
		    }
		}
		if (temp1.startTime != null) {
		    try {
			len1 += sink.encodeLengthTag(temp1.startTime.encodeValue(coder, sink), 0xA3);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("startTime", "DFullTime");
			throw ee;
		    }
		}
		try {
		    len1 += sink.encodeLengthTag(sink.write(temp1.distType.byteArrayValue()), 0x82);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("distType", "DistributionType");
		    throw ee;
		}
		try {
		    len1 += sink.encodeLengthTag(coder.encodeEnumerated(temp1.asdmType, sink), 0x81);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("asdmType", "AdvisoryBroadcastType");
		    throw ee;
		}
		try {
		    len1 += sink.encodeLengthTag(sink.write(temp1.asdmID.byteArrayValue()), 0x80);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("asdmID", "TemporaryID");
		    throw ee;
		}
		len0 += sink.encodeLengthTag(len1, 0xA7);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("asdmDetails", "AdvisoryDetails");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(temp0.serviceRegion.encodeValue(coder, sink), 0xA6);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("serviceRegion", "GeoRegion");
		throw ee;
	    }
	    if (temp0.timeToLive != null) {
		try {
		    len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.timeToLive, sink), 0x85);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("timeToLive", "TimeToLive");
		    throw ee;
		}
	    }
	    if (temp0.recordID != null) {
		try {
		    len0 += sink.encodeLengthTag(sink.write(temp0.recordID.byteArrayValue()), 0x84);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("recordID", "TemporaryID");
		    throw ee;
		}
	    }
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.requestID.byteArrayValue()), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("requestID", "TemporaryID");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.groupID.byteArrayValue()), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("groupID", "GroupID");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.seqID, sink), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("seqID", "SemiSequenceID");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.dialogID, sink), 0x80);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("dialogID", "SemiDialogID");
		throw ee;
	    }

	    return sink.encodeLengthTag(len0, 0x30);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext(null, "AdvisorySituationData");
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
	this.recordID = null;
	this.timeToLive = null;
	try {
	    if (tag != 0x30)
	    {
		throw new DecoderException(ExceptionDescriptor._pdu_mismatch, null, source.formatTag(tag));
	    }
	    {
		int total_len0 = source.mLength;
		int end_pos0 = (total_len0 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len0);

		tag = source.decodeTagLength();
		if (tag != 0x80)
		    source.raiseTagMismatchException(tag);
		try {
		    int idx1 = SemiDialogID.indexOfValue(source.decodeLong());
		    this.dialogID = (idx1 < 0) ? SemiDialogID.unknownEnumerator() : SemiDialogID.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("dialogID", "SemiDialogID");
		    throw ee;
		}
		tag = source.decodeTagLength();
		if (tag != 0x81)
		    source.raiseTagMismatchException(tag);
		try {
		    int idx1 = SemiSequenceID.indexOfValue(source.decodeLong());
		    this.seqID = (idx1 < 0) ? SemiSequenceID.unknownEnumerator() : SemiSequenceID.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("seqID", "SemiSequenceID");
		    throw ee;
		}
		tag = source.decodeTagLength();
		if (tag != 0x82 && tag != 0xA2)
		    source.raiseTagMismatchException(tag);
		try {
		    this.groupID = new GroupID(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("groupID", "GroupID");
		    throw ee;
		}
		tag = source.decodeTagLength();
		if (tag != 0x83 && tag != 0xA3)
		    source.raiseTagMismatchException(tag);
		try {
		    this.requestID = new com.bah.ode.asn.oss.dsrc.TemporaryID(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("requestID", "TemporaryID");
		    throw ee;
		}
		tag = source.decodeTagLength();
		if (tag == 0x84 || tag == 0xA4) {
		    try {
			this.recordID = new com.bah.ode.asn.oss.dsrc.TemporaryID(coder.decodeOctetString(source));
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("recordID", "TemporaryID");
			throw ee;
		    }
		    tag = source.decodeTagLength();
		}
		if (tag == 0x85) {
		    try {
			int idx1 = TimeToLive.indexOfValue(source.decodeInt());
			if (idx1 < 0)
			    throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
			this.timeToLive = TimeToLive.cNamedNumbers[idx1];
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("timeToLive", "TimeToLive");
			throw ee;
		    }
		    tag = source.decodeTagLength();
		}
		if (tag != 0xA6)
		    source.raiseTagMismatchException(tag);
		try {
		    this.serviceRegion = new GeoRegion();
		    this.serviceRegion.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("serviceRegion", "GeoRegion");
		    throw ee;
		}
		tag = source.decodeTagLength();
		if (tag != 0xA7)
		    source.raiseTagMismatchException(tag);
		try {
		    this.asdmDetails = new AdvisoryDetails();
		    {
			int total_len1 = source.mLength;
			int end_pos1 = (total_len1 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len1);

			tag = source.decodeTagLength();
			if (tag != 0x80 && tag != 0xA0)
			    source.raiseTagMismatchException(tag);
			try {
			    this.asdmDetails.asdmID = new com.bah.ode.asn.oss.dsrc.TemporaryID(coder.decodeOctetString(source));
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("asdmID", "TemporaryID");
			    throw ee;
			}
			tag = source.decodeTagLength();
			if (tag != 0x81)
			    source.raiseTagMismatchException(tag);
			try {
			    int idx2 = AdvisoryBroadcastType.indexOfValue(source.decodeLong());
			    this.asdmDetails.asdmType = (idx2 < 0) ? AdvisoryBroadcastType.unknownEnumerator() : AdvisoryBroadcastType.cNamedNumbers[idx2];
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("asdmType", "AdvisoryBroadcastType");
			    throw ee;
			}
			tag = source.decodeTagLength();
			if (tag != 0x82 && tag != 0xA2)
			    source.raiseTagMismatchException(tag);
			try {
			    this.asdmDetails.distType = new DistributionType(coder.decodeOctetString(source));
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("distType", "DistributionType");
			    throw ee;
			}
			tag = source.decodeTagLength();
			if (tag == 0xA3) {
			    try {
				this.asdmDetails.startTime = new com.bah.ode.asn.oss.dsrc.DFullTime();
				this.asdmDetails.startTime.decodeValue(coder, source);
			    } catch (Exception e) {
				DecoderException ee = DecoderException.wrapException(e);
				ee.appendFieldContext("startTime", "DFullTime");
				throw ee;
			    }
			    tag = source.decodeTagLength();
			}
			if (tag == 0xA4) {
			    try {
				this.asdmDetails.stopTime = new com.bah.ode.asn.oss.dsrc.DFullTime();
				this.asdmDetails.stopTime.decodeValue(coder, source);
			    } catch (Exception e) {
				DecoderException ee = DecoderException.wrapException(e);
				ee.appendFieldContext("stopTime", "DFullTime");
				throw ee;
			    }
			    tag = source.decodeTagLength();
			}
			if (tag != 0x85 && tag != 0xA5)
			    source.raiseTagMismatchException(tag);
			try {
			    this.asdmDetails.advisoryMessage = new OctetString(coder.decodeOctetString(source));
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("advisoryMessage", "OCTET STRING");
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
		    ee.appendFieldContext("asdmDetails", "AdvisoryDetails");
		    throw ee;
		}
		if (source.position() != end_pos0) {
		    if (total_len0 >= 0)
			throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
		    tag = source.decodeTagLength();
		    if (tag != 0 || source.mLength != 0)
			throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);
		}
	    }

	    return this;
	} catch (Exception e) {
	    DecoderException ee = DecoderException.wrapException(e);
	    ee.appendFieldContext(null, "AdvisorySituationData");
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
	    AdvisorySituationData temp0 = this;

	    try {
		int len1 = 0;
		AdvisoryDetails temp1 = temp0.asdmDetails;

		try {
		    len1 += sink.encodeLengthTag(sink.write(temp1.advisoryMessage.byteArrayValue()), 0x85);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("advisoryMessage", "OCTET STRING");
		    throw ee;
		}
		if (temp1.stopTime != null) {
		    try {
			len1 += sink.encodeLengthTag(temp1.stopTime.encodeValue(coder, sink), 0xA4);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("stopTime", "DFullTime");
			throw ee;
		    }
		}
		if (temp1.startTime != null) {
		    try {
			len1 += sink.encodeLengthTag(temp1.startTime.encodeValue(coder, sink), 0xA3);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("startTime", "DFullTime");
			throw ee;
		    }
		}
		try {
		    len1 += sink.encodeLengthTag(sink.write(temp1.distType.byteArrayValue()), 0x82);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("distType", "DistributionType");
		    throw ee;
		}
		try {
		    len1 += sink.encodeLengthTag(coder.encodeEnumerated(temp1.asdmType, sink), 0x81);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("asdmType", "AdvisoryBroadcastType");
		    throw ee;
		}
		try {
		    len1 += sink.encodeLengthTag(sink.write(temp1.asdmID.byteArrayValue()), 0x80);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("asdmID", "TemporaryID");
		    throw ee;
		}
		len0 += sink.encodeLengthTag(len1, 0xA7);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("asdmDetails", "AdvisoryDetails");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(temp0.serviceRegion.encodeValue(coder, sink), 0xA6);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("serviceRegion", "GeoRegion");
		throw ee;
	    }
	    if (temp0.timeToLive != null) {
		try {
		    len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.timeToLive, sink), 0x85);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("timeToLive", "TimeToLive");
		    throw ee;
		}
	    }
	    if (temp0.recordID != null) {
		try {
		    len0 += sink.encodeLengthTag(sink.write(temp0.recordID.byteArrayValue()), 0x84);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("recordID", "TemporaryID");
		    throw ee;
		}
	    }
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.requestID.byteArrayValue()), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("requestID", "TemporaryID");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.groupID.byteArrayValue()), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("groupID", "GroupID");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.seqID, sink), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("seqID", "SemiSequenceID");
		throw ee;
	    }
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.dialogID, sink), 0x80);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("dialogID", "SemiDialogID");
		throw ee;
	    }

	    return sink.encodeLengthTag(len0, 0x30);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext(null, "AdvisorySituationData");
	    throw ee;
	}
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, AdvisorySituationData data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(data.recordID != null);
	sink.writeBit(data.timeToLive != null);
	nbits += 2;
	// Encode field 'dialogID'
	try {
	    SemiDialogID item1 = data.dialogID;
	    int idx1;
	    boolean extroot1 = true;

	    if (item1.isUnknownEnumerator()) {
		throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
	    } else {
		idx1 = item1.indexOf();
		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		extroot1 = idx1 < 10;
	    }
	    sink.writeBit(!extroot1); ++nbits;
	    if (extroot1)
		nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 9, sink);
	    else
		nbits += coder.encodeNormallySmallNumber(idx1 - 10, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("dialogID", "SemiDialogID");
	    throw ee;
	}
	// Encode field 'seqID'
	try {
	    SemiSequenceID item1 = data.seqID;
	    int idx1;
	    boolean extroot1 = true;

	    if (item1.isUnknownEnumerator()) {
		throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
	    } else {
		idx1 = item1.indexOf();
		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		extroot1 = idx1 < 10;
	    }
	    sink.writeBit(!extroot1); ++nbits;
	    if (extroot1)
		nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 9, sink);
	    else
		nbits += coder.encodeNormallySmallNumber(idx1 - 10, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("seqID", "SemiSequenceID");
	    throw ee;
	}
	// Encode field 'groupID'
	try {
	    GroupID item1 = data.groupID;
	    int len1 = item1.getSize();

	    if (len1 != 4)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 4, 4, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("groupID", "GroupID");
	    throw ee;
	}
	// Encode field 'requestID'
	try {
	    com.bah.ode.asn.oss.dsrc.TemporaryID item1 = data.requestID;
	    int len1 = item1.getSize();

	    if (len1 != 4)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 4, 4, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("requestID", "TemporaryID");
	    throw ee;
	}
	if (data.recordID != null) {
	    // Encode field 'recordID'
	    try {
		com.bah.ode.asn.oss.dsrc.TemporaryID item1 = data.recordID;
		int len1 = item1.getSize();

		if (len1 != 4)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 4, 4, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("recordID", "TemporaryID");
		throw ee;
	    }
	}
	if (data.timeToLive != null) {
	    // Encode field 'timeToLive'
	    try {
		TimeToLive item1 = data.timeToLive;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 5, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("timeToLive", "TimeToLive");
		throw ee;
	    }
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
	// Encode field 'asdmDetails'
	try {
	    AdvisoryDetails item1 = data.asdmDetails;

	    nbits += AdvisoryDetails.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("asdmDetails", "AdvisoryDetails");
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
	    ee.appendFieldContext(null, "AdvisorySituationData");
	    throw ee;
	}
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static AdvisorySituationData decodeValue(PerCoder coder, InputBitStream source, AdvisorySituationData data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean has_recordID0 = source.readBit();
	boolean has_timeToLive0 = source.readBit();
    /** Decode root fields **/
	// Decode field 'dialogID'
	try {
	    int idx1;
	    SemiDialogID temp1;
	    boolean extroot1 = !source.readBit();

	    if (extroot1) {
		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 9);
		if (idx1 < 0 || idx1 > 9)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		temp1 = SemiDialogID.valueAt(idx1);
	    } else {
		idx1 = 10 + (int)coder.decodeNormallySmallNumber(source);
		if (idx1 < 0)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		temp1 = SemiDialogID.unknownEnumerator();
	    }
	    data.dialogID = temp1;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("dialogID", "SemiDialogID");
	    throw de;
	}
	// Decode field 'seqID'
	try {
	    int idx1;
	    SemiSequenceID temp1;
	    boolean extroot1 = !source.readBit();

	    if (extroot1) {
		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 9);
		if (idx1 < 0 || idx1 > 9)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		temp1 = SemiSequenceID.valueAt(idx1);
	    } else {
		idx1 = 10 + (int)coder.decodeNormallySmallNumber(source);
		if (idx1 < 0)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		temp1 = SemiSequenceID.unknownEnumerator();
	    }
	    data.seqID = temp1;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("seqID", "SemiSequenceID");
	    throw de;
	}
	// Decode field 'groupID'
	try {
	    data.groupID = new GroupID(com.oss.coders.per.PerOctets.decode(coder, source, 4, 4));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("groupID", "GroupID");
	    throw de;
	}
	// Decode field 'requestID'
	try {
	    data.requestID = new com.bah.ode.asn.oss.dsrc.TemporaryID(com.oss.coders.per.PerOctets.decode(coder, source, 4, 4));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("requestID", "TemporaryID");
	    throw de;
	}
	if (has_recordID0) {
	    // Decode field 'recordID'
	    try {
		data.recordID = new com.bah.ode.asn.oss.dsrc.TemporaryID(com.oss.coders.per.PerOctets.decode(coder, source, 4, 4));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("recordID", "TemporaryID");
		throw de;
	    }
	} else {
	    data.recordID = null;
	}
	if (has_timeToLive0) {
	    // Decode field 'timeToLive'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 5);
		if (idx1 < 0 || idx1 > 5)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.timeToLive = TimeToLive.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("timeToLive", "TimeToLive");
		throw de;
	    }
	} else {
	    data.timeToLive = null;
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
	// Decode field 'asdmDetails'
	try {
	    if (data.asdmDetails == null)
		data.asdmDetails = new AdvisoryDetails();
	    data.asdmDetails.decodeValue(coder, source, data.asdmDetails);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("asdmDetails", "AdvisoryDetails");
	    throw de;
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
	    de.appendFieldContext(null, "AdvisorySituationData");
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
	    writer.print("dialogID ");
	    printer.print(this.dialogID, writer, this.dialogID.cConstantNameList);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("seqID ");
	    printer.print(this.seqID, writer, this.seqID.cConstantNameList);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("groupID ");
	    printer.print(this.groupID, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("requestID ");
	    printer.print(this.requestID, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.recordID != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("recordID ");
		printer.print(this.recordID, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.timeToLive != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("timeToLive ");
		printer.print(this.timeToLive, writer, this.timeToLive.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("serviceRegion ");
	    this.serviceRegion.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("asdmDetails ");
	    boolean comma1;
	    comma1 = false;
	    writer.print('{');
	    printer.indent();
	    comma1 = true;
	    try {
		printer.newLine(writer);
		writer.print("asdmID ");
		printer.print(this.asdmDetails.asdmID, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("asdmType ");
		printer.print(this.asdmDetails.asdmType, writer, this.asdmDetails.asdmType.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("distType ");
		printer.print(this.asdmDetails.distType, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    if (this.asdmDetails.startTime != null) {
		try {
		    writer.print(',');
		    printer.newLine(writer);
		    writer.print("startTime ");
		    this.asdmDetails.startTime.printValue(printer, writer);
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
	    }
	    if (this.asdmDetails.stopTime != null) {
		try {
		    writer.print(',');
		    printer.newLine(writer);
		    writer.print("stopTime ");
		    this.asdmDetails.stopTime.printValue(printer, writer);
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
	    }
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("advisoryMessage ");
		printer.print(this.asdmDetails.advisoryMessage, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    printer.undent();
	    printer.newLine(writer);
	    writer.print('}');
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
	return "AdvisorySituationData";
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((AdvisorySituationData)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((AdvisorySituationData)that);
    }
    
    public boolean equalTo(AdvisorySituationData that) {
	if (!this.dialogID.equalTo(that.dialogID))
	    return false;
	if (!this.seqID.equalTo(that.seqID))
	    return false;
	if (!this.groupID.equalTo(that.groupID))
	    return false;
	if (!this.requestID.equalTo(that.requestID))
	    return false;
	if (this.recordID != null && that.recordID != null) {
	    if (!this.recordID.equalTo(that.recordID))
		return false;
	}
	if (this.timeToLive != null && that.timeToLive != null) {
	    if (!this.timeToLive.equalTo(that.timeToLive))
		return false;
	}
	if (!this.serviceRegion.equalTo(that.serviceRegion))
	    return false;
	if (!this.asdmDetails.equalTo(that.asdmDetails))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public AdvisorySituationData clone() {
	AdvisorySituationData copy = (AdvisorySituationData)super.clone();
	copy.dialogID = dialogID.clone();
	copy.seqID = seqID.clone();
	copy.groupID = groupID.clone();
	copy.requestID = requestID.clone();
	if (recordID != null) {
	    copy.recordID = recordID.clone();
	}
	if (timeToLive != null) {
	    copy.timeToLive = timeToLive.clone();
	}
	copy.serviceRegion = serviceRegion.clone();
	copy.asdmDetails = asdmDetails.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.dialogID != null ? this.dialogID.hashCode() : 0);
	hash = 41 * hash + (this.seqID != null ? this.seqID.hashCode() : 0);
	hash = 41 * hash + (this.groupID != null ? this.groupID.hashCode() : 0);
	hash = 41 * hash + (this.requestID != null ? this.requestID.hashCode() : 0);
	hash = 41 * hash + (this.recordID != null ? this.recordID.hashCode() : 0);
	hash = 41 * hash + (this.timeToLive != null ? this.timeToLive.hashCode() : 0);
	hash = 41 * hash + (this.serviceRegion != null ? this.serviceRegion.hashCode() : 0);
	hash = 41 * hash + (this.asdmDetails != null ? this.asdmDetails.hashCode() : 0);
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
	    return new AdvisorySituationData();
	}
    };
    
} // End class definition for AdvisorySituationData
