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
 * Define the ASN1 Type ConnectionPoint from ASN1 Module SEMI.
 * @see Sequence
 */

public class ConnectionPoint extends Sequence {
    public IpAddress address;
    public PortNumber port;
    
    /**
     * The default constructor.
     */
    public ConnectionPoint()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ConnectionPoint(IpAddress address, PortNumber port)
    {
	setAddress(address);
	setPort(port);
    }
    
    /**
     * Construct with required components.
     */
    public ConnectionPoint(PortNumber port)
    {
	setPort(port);
    }
    
    
    // Methods for field "address"
    public IpAddress getAddress()
    {
	return this.address;
    }
    
    public void setAddress(IpAddress address)
    {
	this.address = address;
    }
    
    public boolean hasAddress()
    {
	return (address != null);
    }
    
    public void deleteAddress()
    {
	address = null;
    }
    
    
    // Methods for field "port"
    public PortNumber getPort()
    {
	return this.port;
    }
    
    public void setPort(PortNumber port)
    {
	this.port = port;
    }
    
    
    /**
     * Implements BER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encodeValue(BerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	int len0 = 0;
	ConnectionPoint temp0 = this;

	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.port, sink), 0x81);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("port", "PortNumber");
	    throw ee;
	}
	if (temp0.address != null) {
	    try {
		int len1 = 0;

		switch (temp0.address.getChosenFlag()) {
		case IpAddress.ipv4Address_chosen:
		    try {
			len1 = sink.encodeLengthTag(sink.write(((IPv4Address)temp0.address.getChosenValue()).byteArrayValue()), 0x80);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("ipv4Address", "IpAddress", 0);
			throw ee;
		    }
		    break;

		case IpAddress.ipv6Address_chosen:
		    try {
			len1 = sink.encodeLengthTag(sink.write(((IPv6Address)temp0.address.getChosenValue()).byteArrayValue()), 0x81);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("ipv6Address", "IpAddress", 0);
			throw ee;
		    }
		    break;

		default:
		    throw new EncoderException(ExceptionDescriptor._bad_choice, null);
		}
		len0 += sink.encodeLengthTag(len1, 0xA0);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("address", "IpAddress");
		throw ee;
	    }
	}

	return len0;
    }

    /**
     * Implements BER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public ConnectionPoint decodeValue(BerCoder coder, DecoderInput source)
	    throws DecoderException
    {
	int total_len0 = source.mLength;
	int end_pos0 = (total_len0 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len0);
	int tag;

	tag = source.decodeTagLength();
	if (tag == 0xA0) {
	    try {
		this.address = new IpAddress();
		{
		    int indef_tags1 = 0;

		    if (source.mLength < 0)
			++indef_tags1;
		    tag = source.decodeTagLength();
		    switch (tag & 0xFFFFFFDF) {
		    case 0x80:
			try {
			    this.address.setChosenFlag(IpAddress.ipv4Address_chosen);
			    this.address.setChosenValue(new IPv4Address(coder.decodeOctetString(source)));
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendElementContext("ipv4Address", "IPv4Address", 0);
			    throw ee;
			}
			break;

		    case 0x81:
			try {
			    this.address.setChosenFlag(IpAddress.ipv6Address_chosen);
			    this.address.setChosenValue(new IPv6Address(coder.decodeOctetString(source)));
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendElementContext("ipv6Address", "IPv6Address", 0);
			    throw ee;
			}
			break;

		    default:
			source.raiseUnknownFieldException(tag);
		    }
		    if (indef_tags1 > 0)
			coder.consumeEOCs(source, indef_tags1);
		}
	    } catch (Exception e) {
		DecoderException ee = DecoderException.wrapException(e);
		ee.appendFieldContext("address", "IpAddress");
		throw ee;
	    }
	    tag = source.decodeTagLength();
	}
	if (tag != 0x81)
	    source.raiseTagMismatchException(tag);
	try {
	    this.port = new PortNumber(source.decodeLong());
	} catch (Exception e) {
	    DecoderException ee = DecoderException.wrapException(e);
	    ee.appendFieldContext("port", "PortNumber");
	    throw ee;
	}
	if (source.position() != end_pos0) {
	    if (total_len0 >= 0)
		throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
	    tag = source.decodeTagLength();
	    if (tag != 0 || source.mLength != 0)
		throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);
	}

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
	ConnectionPoint temp0 = this;

	try {
	    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.port, sink), 0x81);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("port", "PortNumber");
	    throw ee;
	}
	if (temp0.address != null) {
	    try {
		int len1 = 0;

		switch (temp0.address.getChosenFlag()) {
		case IpAddress.ipv4Address_chosen:
		    try {
			len1 = sink.encodeLengthTag(sink.write(((IPv4Address)temp0.address.getChosenValue()).byteArrayValue()), 0x80);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("ipv4Address", "IpAddress", 0);
			throw ee;
		    }
		    break;

		case IpAddress.ipv6Address_chosen:
		    try {
			len1 = sink.encodeLengthTag(sink.write(((IPv6Address)temp0.address.getChosenValue()).byteArrayValue()), 0x81);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("ipv6Address", "IpAddress", 0);
			throw ee;
		    }
		    break;

		default:
		    throw new EncoderException(ExceptionDescriptor._bad_choice, null);
		}
		len0 += sink.encodeLengthTag(len1, 0xA0);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("address", "IpAddress");
		throw ee;
	    }
	}

	return len0;
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, ConnectionPoint data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(data.address != null);
	++nbits;
	if (data.address != null) {
	    // Encode field 'address'
	    try {
		IpAddress item1 = data.address;

		nbits += IpAddress.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("address", "IpAddress");
		throw ee;
	    }
	}
	// Encode field 'port'
	try {
	    PortNumber item1 = data.port;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 65535)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 65535, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("port", "PortNumber");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static ConnectionPoint decodeValue(PerCoder coder, InputBitStream source, ConnectionPoint data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean has_address0 = source.readBit();
    /** Decode root fields **/
	if (has_address0) {
	    // Decode field 'address'
	    try {
		if (data.address == null)
		    data.address = new IpAddress();
		data.address.decodeValue(coder, source, data.address);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("address", "IpAddress");
		throw de;
	    }
	} else {
	    data.address = null;
	}
	// Decode field 'port'
	try {
	    long temp1;

	    if (data.port == null)
		data.port = new PortNumber();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 65535);
	    if (temp1 > 65535)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
	    data.port.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("port", "PortNumber");
	    throw de;
	}
	return data;
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
	if (this.address != null) {
	    try {
		comma0 = true;
		printer.newLine(writer);
		writer.print("address ");
		{
		    switch (this.address.getChosenFlag()) {
		    case IpAddress.ipv4Address_chosen:
			try {
			    writer.print("ipv4Address : ");
			    printer.print(((IPv4Address)this.address.getChosenValue()), writer);
			} catch (Exception e) {
			    printer.reportError(e, null, writer);
			}
			break;

		    case IpAddress.ipv6Address_chosen:
			try {
			    writer.print("ipv6Address : ");
			    printer.print(((IPv6Address)this.address.getChosenValue()), writer);
			} catch (Exception e) {
			    printer.reportError(e, null, writer);
			}
			break;

		    default:
			writer.print("-- unknown selection --");
		    }
		}
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("port ");
	    writer.print(this.port.longValue());
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
	return equalTo((ConnectionPoint)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((ConnectionPoint)that);
    }
    
    public boolean equalTo(ConnectionPoint that) {
	if (this.address != null && that.address != null) {
	    if (!this.address.equalTo(that.address))
		return false;
	}
	if (!this.port.equalTo(that.port))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public ConnectionPoint clone() {
	ConnectionPoint copy = (ConnectionPoint)super.clone();
	if (address != null) {
	    copy.address = address.clone();
	}
	copy.port = port.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.address != null ? this.address.hashCode() : 0);
	hash = 41 * hash + (this.port != null ? this.port.hashCode() : 0);
	return hash;
    }
} // End class definition for ConnectionPoint
