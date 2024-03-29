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
 * Define the ASN1 Type RTCMmsg from ASN1 Module DSRC.
 * @see Sequence
 */

public class RTCMmsg extends Sequence {
    public RTCM_Revision rev;
    public RTCM_ID rtcmID;
    public RTCM_Payload payload;
    
    /**
     * The default constructor.
     */
    public RTCMmsg()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RTCMmsg(RTCM_Revision rev, RTCM_ID rtcmID, RTCM_Payload payload)
    {
	setRev(rev);
	setRtcmID(rtcmID);
	setPayload(payload);
    }
    
    /**
     * Construct with required components.
     */
    public RTCMmsg(RTCM_Payload payload)
    {
	setPayload(payload);
    }
    
    
    // Methods for field "rev"
    public RTCM_Revision getRev()
    {
	return this.rev;
    }
    
    public void setRev(RTCM_Revision rev)
    {
	this.rev = rev;
    }
    
    public boolean hasRev()
    {
	return (rev != null);
    }
    
    public void deleteRev()
    {
	rev = null;
    }
    
    
    // Methods for field "rtcmID"
    public RTCM_ID getRtcmID()
    {
	return this.rtcmID;
    }
    
    public void setRtcmID(RTCM_ID rtcmID)
    {
	this.rtcmID = rtcmID;
    }
    
    public boolean hasRtcmID()
    {
	return (rtcmID != null);
    }
    
    public void deleteRtcmID()
    {
	rtcmID = null;
    }
    
    
    // Methods for field "payload"
    public RTCM_Payload getPayload()
    {
	return this.payload;
    }
    
    public void setPayload(RTCM_Payload payload)
    {
	this.payload = payload;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     */
    public static enum __Tag
    {
	__rev("rev"),
	__rtcmID("rtcmID"),
	__payload("payload"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(4);
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
	RTCMmsg temp0 = this;

	try {
	    len0 += sink.encodeLengthTag(sink.write(temp0.payload.byteArrayValue()), 0x82);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("payload", "RTCM-Payload");
	    throw ee;
	}
	if (temp0.rtcmID != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.rtcmID, sink), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("rtcmID", "RTCM-ID");
		throw ee;
	    }
	}
	if (temp0.rev != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.rev, sink), 0x80);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("rev", "RTCM-Revision");
		throw ee;
	    }
	}

	return len0;
    }

    /**
     * Implements BER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public RTCMmsg decodeValue(BerCoder coder, DecoderInput source)
	    throws DecoderException
    {
	int total_len0 = source.mLength;
	int end_pos0 = (total_len0 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len0);
	int tag;

	do {
	    tag = source.decodeTagLength();
	    if (tag == 0x80) {
		try {
		    int idx1 = RTCM_Revision.indexOfValue(source.decodeLong());
		    this.rev = (idx1 < 0) ? RTCM_Revision.unknownEnumerator() : RTCM_Revision.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("rev", "RTCM-Revision");
		    throw ee;
		}
		tag = source.decodeTagLength();
	    }
	    if (tag == 0x81) {
		try {
		    this.rtcmID = new RTCM_ID(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("rtcmID", "RTCM-ID");
		    throw ee;
		}
		tag = source.decodeTagLength();
	    }
	    if (tag != 0x82 && tag != 0xA2)
		source.raiseTagMismatchException(tag);
	    try {
		this.payload = new RTCM_Payload(coder.decodeOctetString(source));
	    } catch (Exception e) {
		DecoderException ee = DecoderException.wrapException(e);
		ee.appendFieldContext("payload", "RTCM-Payload");
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
		    ee.appendExtensionContext("RTCMmsg", -1);
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
	RTCMmsg temp0 = this;

	try {
	    len0 += sink.encodeLengthTag(sink.write(temp0.payload.byteArrayValue()), 0x82);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("payload", "RTCM-Payload");
	    throw ee;
	}
	if (temp0.rtcmID != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.rtcmID, sink), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("rtcmID", "RTCM-ID");
		throw ee;
	    }
	}
	if (temp0.rev != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.rev, sink), 0x80);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("rev", "RTCM-Revision");
		throw ee;
	    }
	}

	return len0;
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, RTCMmsg data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.rev != null);
	sink.writeBit(data.rtcmID != null);
	nbits += 3;
	if (data.rev != null) {
	    // Encode field 'rev'
	    try {
		RTCM_Revision item1 = data.rev;
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
		ee.appendFieldContext("rev", "RTCM-Revision");
		throw ee;
	    }
	}
	if (data.rtcmID != null) {
	    // Encode field 'rtcmID'
	    try {
		RTCM_ID item1 = data.rtcmID;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 32767)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 32767, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("rtcmID", "RTCM-ID");
		throw ee;
	    }
	}
	// Encode field 'payload'
	try {
	    RTCM_Payload item1 = data.payload;
	    int len1 = item1.getSize();

	    if (len1 < 1 || len1 > 1023)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 1023, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("payload", "RTCM-Payload");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static RTCMmsg decodeValue(PerCoder coder, InputBitStream source, RTCMmsg data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_rev0 = source.readBit();
	boolean has_rtcmID0 = source.readBit();
    /** Decode root fields **/
	if (has_rev0) {
	    // Decode field 'rev'
	    try {
		int idx1;
		RTCM_Revision temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 16);
		    if (idx1 < 0 || idx1 > 16)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = RTCM_Revision.valueAt(idx1);
		} else {
		    idx1 = 17 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = RTCM_Revision.unknownEnumerator();
		}
		data.rev = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("rev", "RTCM-Revision");
		throw de;
	    }
	} else {
	    data.rev = null;
	}
	if (has_rtcmID0) {
	    // Decode field 'rtcmID'
	    try {
		long temp1;

		if (data.rtcmID == null)
		    data.rtcmID = new RTCM_ID();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 32767);
		if (temp1 > 32767)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.rtcmID.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("rtcmID", "RTCM-ID");
		throw de;
	    }
	} else {
	    data.rtcmID = null;
	}
	// Decode field 'payload'
	try {
	    data.payload = new RTCM_Payload(com.oss.coders.per.PerOctets.decode(coder, source, 1, 1023));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("payload", "RTCM-Payload");
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
	String separator0 = null;

	sink.beginObject();
	// Encode field 'rev'
	try {
	    RTCM_Revision item1 = this.rev;

	    if (item1 != null) {
		{
		    separator0 = ",";
		    sink.encodeKey("rev");
		    if (item1.isUnknownEnumerator()) {
			throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		    } else 
			sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "rev");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("rev", "RTCM-Revision");
	    throw ee;
	}
	// Encode field 'rtcmID'
	try {
	    RTCM_ID item1 = this.rtcmID;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("rtcmID");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "rtcmID");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("rtcmID", "RTCM-ID");
	    throw ee;
	}
	// Encode field 'payload'
	try {
	    RTCM_Payload item1 = this.payload;

	    {
		sink.writeSeparator(separator0);
		sink.encodeKey("payload");
		sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("payload", "RTCM-Payload");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public RTCMmsg decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[4];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		RTCMmsg.__Tag t_tag0 = RTCMmsg.__Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = RTCMmsg.__Tag._null_;
		switch (t_tag0) {
		    case __rev:
		    // Decode field 'rev'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    RTCM_Revision temp1;

			    if (present0[0])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(RTCM_Revision.cConstantNameList, content1);
			    if (idx1 < 0 )
				temp1 = RTCM_Revision.unknownEnumerator();
			    else
				temp1 = RTCM_Revision.cNamedNumbers[idx1];
			    this.rev = temp1;
			    present0[0] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("rev", "RTCM-Revision");
			throw de;
		    }
		    break;
		    case __rtcmID:
		    // Decode field 'rtcmID'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.rtcmID == null)
				this.rtcmID = new RTCM_ID();
			    this.rtcmID.setValue(coder.decodeInteger(source));
			    present0[1] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("rtcmID", "RTCM-ID");
			throw de;
		    }
		    break;
		    case __payload:
		    // Decode field 'payload'
		    try {
			if (present0[2])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			this.payload = new RTCM_Payload(coder.decodeOctetString(source));
			present0[2] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("payload", "RTCM-Payload");
			throw de;
		    }
		    break;
		    default:
			coder.skipValue(source);
			break;
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    this.rev = null;
	if (!present0[1])
	    this.rtcmID = null;
	if (!present0[2])
	    throw new DecoderException(ExceptionDescriptor._field_omit, ": 'payload'");
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
	if (this.rev != null) {
	    try {
		comma0 = true;
		printer.newLine(writer);
		writer.print("rev ");
		printer.print(this.rev, writer, this.rev.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.rtcmID != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("rtcmID ");
		writer.print(this.rtcmID.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("payload ");
	    printer.print(this.payload, writer);
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
	return equalTo((RTCMmsg)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((RTCMmsg)that);
    }
    
    public boolean equalTo(RTCMmsg that) {
	if (this.rev != null && that.rev != null) {
	    if (!this.rev.equalTo(that.rev))
		return false;
	}
	if (this.rtcmID != null && that.rtcmID != null) {
	    if (!this.rtcmID.equalTo(that.rtcmID))
		return false;
	}
	if (!this.payload.equalTo(that.payload))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public RTCMmsg clone() {
	RTCMmsg copy = (RTCMmsg)super.clone();
	if (rev != null) {
	    copy.rev = rev.clone();
	}
	if (rtcmID != null) {
	    copy.rtcmID = rtcmID.clone();
	}
	copy.payload = payload.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.rev != null ? this.rev.hashCode() : 0);
	hash = 41 * hash + (this.rtcmID != null ? this.rtcmID.hashCode() : 0);
	hash = 41 * hash + (this.payload != null ? this.payload.hashCode() : 0);
	return hash;
    }
} // End class definition for RTCMmsg
