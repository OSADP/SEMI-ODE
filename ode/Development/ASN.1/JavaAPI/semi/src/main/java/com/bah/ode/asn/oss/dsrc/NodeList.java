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
/* Created: Tue Dec 22 00:38:27 2015 */
/* ASN.1 Compiler for Java version: 6.2 */
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
 * Define the ASN1 Type NodeList from ASN1 Module DSRC.
 * @see SequenceOf
 */

public class NodeList extends SequenceOf {
    
    /**
     * The default constructor.
     */
    public NodeList()
    {
	this.elements = new java.util.ArrayList<Offsets>();
    }
    
    
    /**
     * Construct from an array of components.
     */
    public java.util.ArrayList<Offsets> elements;

    public NodeList(Offsets[] elements)
    {
	this.elements = new java.util.ArrayList<Offsets>(java.util.Arrays.asList(elements));
    }
    
    /**
     * Add an Element to the SEQUENCE OF/SET OF.
     */
    public synchronized void add(Offsets element)
    {
	elements.add(element);
    }
    
    /**
     * Set an Element in the SEQUENCE OF/SET OF.
     */
    public synchronized void set(Offsets element, int atIndex)
    {
	elements.set(atIndex, element);
    }
    
    /**
     * Get an Element from the SEQUENCE OF/SET OF.
     */
    public synchronized Offsets get(int atIndex)
    {
	return (Offsets)elements.get(atIndex);
    }
    
    /**
     * Insert an Element into the SEQUENCE OF/SET OF.
     */
    public synchronized void insert(Offsets element, int atIndex)
    {
	elements.add(atIndex, element);
    }
    
    /**
     * Remove an Element from the SEQUENCE OF/SET OF.
     */
    public synchronized void remove(Offsets element)
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
     * Implements BER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encodeValue(BerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	int len0 = 0;
	java.util.ArrayList<Offsets> temp0 = this.elements;
	int idx0 = temp0 != null ? temp0.size() : 0;

	try {
	    while(idx0-- > 0) {
		len0 += sink.encodeLengthTag(sink.write(temp0.get(idx0).byteArrayValue()), 0x4);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendElementContext(null, "NodeList", idx0);
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements BER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public NodeList decodeValue(BerCoder coder, DecoderInput source)
	    throws DecoderException
    {
	int total_len0 = source.mLength;
	int end_pos0 = (total_len0 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len0);
	int idx0 = 0;
	int tag;

	this.elements = new java.util.ArrayList<Offsets>();

	try {
	    for (;;) {
		if (source.position() >= end_pos0) {
		    if (source.position() > end_pos0)
			throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
		    break;
		}
		tag = source.decodeTagLength();
		if (tag == 0) {
		    if (total_len0 < 0) {
			if (source.mLength != 0)
			    throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);
			break;
		    }
		    if (source.mLength == 0)
			throw new DecoderException(ExceptionDescriptor._expect_tag, null);
		}
		Offsets temp0;
		if (tag != 0x4 && tag != 0x24)
		    source.raiseTagMismatchException(tag);
		temp0 = new Offsets(coder.decodeOctetString(source));
		this.add(temp0);
		++idx0;
	    }
	} catch (Exception e) {
	    DecoderException ee = DecoderException.wrapException(e);
	    ee.appendElementContext(null, "NodeList", idx0);
	    throw ee;
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
	java.util.ArrayList<Offsets> temp0 = this.elements;
	int idx0 = temp0 != null ? temp0.size() : 0;

	try {
	    while(idx0-- > 0) {
		len0 += sink.encodeLengthTag(sink.write(temp0.get(idx0).byteArrayValue()), 0x4);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendElementContext(null, "NodeList", idx0);
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, NodeList data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int total_len0 = data.elements.size();
	int fragmentLength0;
	boolean moreFragments0;
	int idx0 = 0;
	int nbits = 0;

	if (total_len0 < 1 || total_len0 > 64)
	    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + total_len0);
	nbits += coder.encodeLengthDeterminant(total_len0, 1, 64, sink);
	moreFragments0 = coder.moreFragments();
	fragmentLength0 = (moreFragments0 ? coder.fragmentLength() : total_len0);
	while (total_len0 > 0) {
	    try {
		Offsets item1 = data.elements.get(idx0);
		int len1 = item1.getSize();

		if (len1 < 4 || len1 > 8)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 4, 8, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext(null, "Offsets", idx0);
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
    public static NodeList decodeValue(PerCoder coder, InputBitStream source, NodeList data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	int total_len0 = 0;
	int fragmentLength0;
	boolean moreFragments0;
	int idx0 = 0;

	idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, 1, 64);
	if (fragmentLength0 > 64)
	    throw new DecoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + fragmentLength0);
	moreFragments0 = coder.moreFragments();
	if (data.elements != null)
	    data.elements.clear();
	else
	    data.elements = new java.util.ArrayList<Offsets>(fragmentLength0);
	while (idx0 > 0) {
	    try {
		Offsets item1;

		item1 = new Offsets(com.oss.coders.per.PerOctets.decode(coder, source, 4, 8));
		data.elements.add(item1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendElementContext(null, "Offsets", total_len0);
		throw de;
	    }
	    --idx0; ++total_len0;
	    if (idx0 == 0) {
		if (moreFragments0) {
		    idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, fragmentLength0);
		    moreFragments0 = coder.moreFragments();
		    if ((total_len0 + fragmentLength0) > 64)
			throw new DecoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + (total_len0 + fragmentLength0));
		}
	    }
	}
	if (total_len0 < 1)
	    throw new DecoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + total_len0);
	return data;
    }

    /**
     * Implements JSON value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public void encodeValue(JsonCoder coder, JsonWriter sink)
	    throws IOException, EncoderException
    {
	int total_len0 = this.elements.size();
	int idx0 = 0;

	sink.beginArray();
	if (total_len0 > 0) {
	    while (true) {
		try {
		    Offsets item1 = this.elements.get(idx0);

		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext(null, "Offsets", idx0);
		throw ee;
	    }
	    idx0++;
	    if (idx0 == total_len0) break;
	    sink.writeSeparator();
	}
    }
    sink.endArray();

}

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public NodeList decodeValue(JsonCoder coder, JsonReader source)
	throws IOException, DecoderException
{
    int total_len0 = 0;
    int idx0 = 0;

    if (this.elements != null)
	this.elements.clear();
    else
	this.elements = new java.util.ArrayList<Offsets>(total_len0);
    coder.decodeArray(source);
    if (coder.hasMoreElements(source, true))
	do {
	    try {
		Offsets item1;

		item1 = new Offsets(coder.decodeOctetString(source));
		this.elements.add(item1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendElementContext(null, "Offsets", idx0);
		throw de;
	    }
	    ++idx0;
	} while (coder.hasMoreElements(source, false));
	return this;
    }

    /**
     * Implements value printer for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public void printValue(DataPrinter printer, java.io.PrintWriter writer)
	    throws Exception
    {
	java.util.ArrayList<Offsets> temp0 = this.elements;
	int len0 = temp0 != null ? temp0.size() : 0;
	int idx0 = 0;

	try {
	    writer.print('{');
	    printer.indent();
	    for (idx0 = 0; idx0 < len0; idx0++){
		if (idx0 > 0)
		    writer.print(',');
		printer.newLine(writer);
		printer.print(temp0.get(idx0), writer);
	    }
	    printer.undent();
	    if (len0 > 0)
		printer.newLine(writer);
	    writer.print('}');
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((NodeList)that);
    }
    
    public boolean equalTo(SequenceOf that)
    {
	return equalTo((NodeList)that);
    }
    
    public boolean equalTo(NodeList that) {
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
    public NodeList clone() {
	NodeList copy = (NodeList)super.clone();
	copy.elements = new java.util.ArrayList<Offsets>(elements.size());
	for (Offsets element : elements) {
	    copy.elements.add(element.clone());
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 7;
	hash = 79 * hash + (this.elements != null ? this.elements.hashCode() : 0);
	return hash;
    }
} // End class definition for NodeList
