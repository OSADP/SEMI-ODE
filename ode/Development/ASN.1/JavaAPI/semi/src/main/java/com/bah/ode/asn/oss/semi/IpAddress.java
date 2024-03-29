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
 * Define the ASN1 Type IpAddress from ASN1 Module SEMI.
 * @see Choice
 */

public class IpAddress extends Choice {
    
    /**
     * The default constructor.
     */
    public IpAddress()
    {
    }
    
    public static final  int  ipv4Address_chosen = 1;
    public static final  int  ipv6Address_chosen = 2;
    
    /**
     * Return the tag of chosen component (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int getTag() {
	switch (getChosenFlag()) {
	case 1:
	    return 0x80;
	case 2:
	    return 0x81;
	default:
	    return 0;
	}
    }

    // Methods for field "ipv4Address"
    public static IpAddress createIpAddressWithIpv4Address(IPv4Address ipv4Address)
    {
	IpAddress __object = new IpAddress();

	__object.setIpv4Address(ipv4Address);
	return __object;
    }
    
    public boolean hasIpv4Address()
    {
	return getChosenFlag() == ipv4Address_chosen;
    }
    
    public IPv4Address getIpv4Address()
    {
	if (hasIpv4Address())
	    return (IPv4Address)mChosenValue;
	else
	    return null;
    }
    
    public void setIpv4Address(IPv4Address ipv4Address)
    {
	setChosenValue(ipv4Address);
	setChosenFlag(ipv4Address_chosen);
    }
    
    
    // Methods for field "ipv6Address"
    public static IpAddress createIpAddressWithIpv6Address(IPv6Address ipv6Address)
    {
	IpAddress __object = new IpAddress();

	__object.setIpv6Address(ipv6Address);
	return __object;
    }
    
    public boolean hasIpv6Address()
    {
	return getChosenFlag() == ipv6Address_chosen;
    }
    
    public IPv6Address getIpv6Address()
    {
	if (hasIpv6Address())
	    return (IPv6Address)mChosenValue;
	else
	    return null;
    }
    
    public void setIpv6Address(IPv6Address ipv6Address)
    {
	setChosenValue(ipv6Address);
	setChosenFlag(ipv6Address_chosen);
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     */
    public static enum __Tag
    {
	__ipv4Address("ipv4Address"),
	__ipv6Address("ipv6Address"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(3);
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
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, IpAddress data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int idx0 = data.mChosenFlag;
	int nbits = 0;

	if (idx0 < 1 || idx0 > 2)
	    throw new EncoderException(com.oss.util.ExceptionDescriptor._bad_choice, null, idx0);
	nbits += coder.encodeConstrainedWholeNumber(idx0 - 1, 0, 1, sink);
	switch (idx0) {
	    case ipv4Address_chosen:
		// Encode alternative 'ipv4Address'
		try {
		    IPv4Address item1 = (IPv4Address)data.mChosenValue;
		    int len1 = item1.getSize();

		    if (len1 != 4)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 4, 4, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("ipv4Address", "IPv4Address", 0);
		    throw ee;
		}
		break;
	    case ipv6Address_chosen:
		// Encode alternative 'ipv6Address'
		try {
		    IPv6Address item1 = (IPv6Address)data.mChosenValue;
		    int len1 = item1.getSize();

		    if (len1 != 16)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 16, 16, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("ipv6Address", "IPv6Address", 0);
		    throw ee;
		}
		break;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static IpAddress decodeValue(PerCoder coder, InputBitStream source, IpAddress data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	int idx0 = 0;

	idx0 = (int)coder.decodeConstrainedWholeNumber(source, 0, 1) + 1;
	if (idx0 < 1 || idx0 > 2)
	    throw new DecoderException(com.oss.util.ExceptionDescriptor._bad_choice, null, idx0);
	data.mChosenFlag = idx0;
	switch (idx0) {
	    case ipv4Address_chosen:
		// Decode alternative 'ipv4Address'
		try {
		    IPv4Address item1;

		    // Decode alternative 'ipv4Address'
		    item1 = new IPv4Address(com.oss.coders.per.PerOctets.decode(coder, source, 4, 4));
		    data.mChosenValue = item1;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("ipv4Address", "IPv4Address", 0);
		    throw de;
		}
		break;
	    case ipv6Address_chosen:
		// Decode alternative 'ipv6Address'
		try {
		    IPv6Address item1;

		    // Decode alternative 'ipv6Address'
		    item1 = new IPv6Address(com.oss.coders.per.PerOctets.decode(coder, source, 16, 16));
		    data.mChosenValue = item1;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("ipv6Address", "IPv6Address", 0);
		    throw de;
		}
		break;
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
	int idx0 = this.mChosenFlag;

	sink.beginObject();
	switch (idx0)
	{
	case ipv4Address_chosen:
	    // Encode alternative 'ipv4Address'
	    try {
		IPv4Address item1 = (IPv4Address)this.mChosenValue;

		sink.encodeKey("ipv4Address");
		sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("ipv4Address", "IPv4Address", 0);
		throw ee;
	    }
	    break;
	case ipv6Address_chosen:
	    // Encode alternative 'ipv6Address'
	    try {
		IPv6Address item1 = (IPv6Address)this.mChosenValue;

		sink.encodeKey("ipv6Address");
		sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("ipv6Address", "IPv6Address", 0);
		throw ee;
	    }
	    break;
	default:
	    throw new EncoderException(com.oss.util.ExceptionDescriptor._bad_choice, null, idx0);
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public IpAddress decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	coder.decodeObject(source);
	String tag0 = coder.nextProperty(source);
	IpAddress.__Tag t_tag0 = IpAddress.__Tag.getTagSub(tag0);
	if (t_tag0 == null) 
	    t_tag0 = IpAddress.__Tag._null_;
	switch (t_tag0) {
	    case __ipv4Address:
		// Decode alternative 'ipv4Address'
		try {
		    IPv4Address item1 = null;

		    // Decode alternative 'ipv4Address'
		    item1 = new IPv4Address(coder.decodeOctetString(source));
		    this.mChosenValue = item1;
		    this.mChosenFlag = ipv4Address_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("ipv4Address", "IPv4Address", 0);
		    throw de;
		}
		break;
	    case __ipv6Address:
		// Decode alternative 'ipv6Address'
		try {
		    IPv6Address item1 = null;

		    // Decode alternative 'ipv6Address'
		    item1 = new IPv6Address(coder.decodeOctetString(source));
		    this.mChosenValue = item1;
		    this.mChosenFlag = ipv6Address_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("ipv6Address", "IPv6Address", 0);
		    throw de;
		}
		break;
	    default:
		throw new DecoderException(com.oss.util.ExceptionDescriptor._unknown_field, null, tag0);
	}
	if (coder.hasMoreProperties(source, false))
	    throw new DecoderException(com.oss.util.ExceptionDescriptor._json_unexpected_token, null, ": expecting '}'");
	return this;
    }

    /**
     * Clone 'this' object.
     */
    public IpAddress clone() {
	return (IpAddress)super.clone();
    }

} // End class definition for IpAddress
