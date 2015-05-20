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
 * Define the ASN1 Type AdvisoryBroadcast from ASN1 Module SEMI.
 * @see Sequence
 */

public class AdvisoryBroadcast extends Sequence {
    public Psid messagePsid;
    public BroadcastInstructions broadcastInst;
    public OctetString advisoryMessage;
    
    /**
     * The default constructor.
     */
    public AdvisoryBroadcast()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public AdvisoryBroadcast(Psid messagePsid, 
		    BroadcastInstructions broadcastInst, 
		    OctetString advisoryMessage)
    {
	setMessagePsid(messagePsid);
	setBroadcastInst(broadcastInst);
	setAdvisoryMessage(advisoryMessage);
    }
    
    /**
     * Construct with required components.
     */
    public AdvisoryBroadcast(Psid messagePsid, OctetString advisoryMessage)
    {
	setMessagePsid(messagePsid);
	setAdvisoryMessage(advisoryMessage);
    }
    
    
    // Methods for field "messagePsid"
    public Psid getMessagePsid()
    {
	return this.messagePsid;
    }
    
    public void setMessagePsid(Psid messagePsid)
    {
	this.messagePsid = messagePsid;
    }
    
    
    // Methods for field "broadcastInst"
    public BroadcastInstructions getBroadcastInst()
    {
	return this.broadcastInst;
    }
    
    public void setBroadcastInst(BroadcastInstructions broadcastInst)
    {
	this.broadcastInst = broadcastInst;
    }
    
    public boolean hasBroadcastInst()
    {
	return (broadcastInst != null);
    }
    
    public void deleteBroadcastInst()
    {
	broadcastInst = null;
    }
    
    
    // Methods for field "advisoryMessage"
    public OctetString getAdvisoryMessage()
    {
	return this.advisoryMessage;
    }
    
    public void setAdvisoryMessage(OctetString advisoryMessage)
    {
	this.advisoryMessage = advisoryMessage;
    }
    
    
    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, AdvisoryBroadcast data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	boolean has_broadcastInst0 = data.broadcastInst != null;
	sink.writeBit(has_broadcastInst0); ++nbits;
	// Encode field 'messagePsid'
	try {
	    Psid item1 = data.messagePsid;
	    int len1 = item1.getSize();

	    if (len1 != 4)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 4, 4, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("messagePsid", "Psid");
	    throw ee;
	}
	if (has_broadcastInst0) {
	    // Encode field 'broadcastInst'
	    try {
		BroadcastInstructions item1 = data.broadcastInst;

		nbits += BroadcastInstructions.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("broadcastInst", "BroadcastInstructions");
		throw ee;
	    }
	}
	// Encode field 'advisoryMessage'
	try {
	    OctetString item1 = data.advisoryMessage;
	    int len1 = item1.getSize();

	    if (len1 < 0 || len1 > 1400)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 0, 1400, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("advisoryMessage", "OCTET STRING");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static AdvisoryBroadcast decodeValue(PerCoder coder, InputBitStream source, AdvisoryBroadcast data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean has_broadcastInst0 = source.readBit();
	// Decode field 'messagePsid'
	try {
	    data.messagePsid = new Psid(com.oss.coders.per.PerOctets.decode(coder, source, 4, 4));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("messagePsid", "Psid");
	    throw de;
	}
	if (has_broadcastInst0) {
	    // Decode field 'broadcastInst'
	    try {
		if (data.broadcastInst == null)
		    data.broadcastInst = new BroadcastInstructions();
		BroadcastInstructions.decodeValue(coder, source, data.broadcastInst);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("broadcastInst", "BroadcastInstructions");
		throw de;
	    }
	} else {
	    data.broadcastInst = null;
	}
	// Decode field 'advisoryMessage'
	try {
	    data.advisoryMessage = new OctetString(com.oss.coders.per.PerOctets.decode(coder, source, 0, 1400));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("advisoryMessage", "OCTET STRING");
	    throw de;
	}
	return data;
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((AdvisoryBroadcast)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((AdvisoryBroadcast)that);
    }
    
    public boolean equalTo(AdvisoryBroadcast that) {
	if (!this.messagePsid.equalTo(that.messagePsid))
	    return false;
	if (this.broadcastInst != null && that.broadcastInst != null) {
	    if (!this.broadcastInst.equalTo(that.broadcastInst))
		return false;
	}
	if (!this.advisoryMessage.equalTo(that.advisoryMessage))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public AdvisoryBroadcast clone() {
	AdvisoryBroadcast copy = (AdvisoryBroadcast)super.clone();
	copy.messagePsid = messagePsid.clone();
	if (broadcastInst != null) {
	    copy.broadcastInst = broadcastInst.clone();
	}
	copy.advisoryMessage = advisoryMessage.clone();
	return copy;
    }

} // End class definition for AdvisoryBroadcast
