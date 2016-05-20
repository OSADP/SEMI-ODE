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
 * Define the ASN1 Type RegionList from ASN1 Module DSRC.
 * @see SequenceOf
 */

public class RegionList extends SequenceOf {
    
    /**
     * The default constructor.
     */
    public RegionList()
    {
	this.elements = new java.util.ArrayList<RegionOffsets>();
    }
    
    
    /**
     * Construct from an array of components.
     */
    public java.util.ArrayList<RegionOffsets> elements;

    public RegionList(RegionOffsets[] elements)
    {
	this.elements = new java.util.ArrayList<RegionOffsets>(java.util.Arrays.asList(elements));
    }
    
    /**
     * Add an Element to the SEQUENCE OF/SET OF.
     */
    public synchronized void add(RegionOffsets element)
    {
	elements.add(element);
    }
    
    /**
     * Set an Element in the SEQUENCE OF/SET OF.
     */
    public synchronized void set(RegionOffsets element, int atIndex)
    {
	elements.set(atIndex, element);
    }
    
    /**
     * Get an Element from the SEQUENCE OF/SET OF.
     */
    public synchronized RegionOffsets get(int atIndex)
    {
	return (RegionOffsets)elements.get(atIndex);
    }
    
    /**
     * Insert an Element into the SEQUENCE OF/SET OF.
     */
    public synchronized void insert(RegionOffsets element, int atIndex)
    {
	elements.add(atIndex, element);
    }
    
    /**
     * Remove an Element from the SEQUENCE OF/SET OF.
     */
    public synchronized void remove(RegionOffsets element)
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
	java.util.ArrayList<RegionOffsets> temp0 = this.elements;
	int idx0 = temp0 != null ? temp0.size() : 0;

	try {
	    while(idx0-- > 0) {
		len0 += sink.encodeLengthTag(temp0.get(idx0).encodeValue(coder, sink), 0x30);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendElementContext(null, "RegionList", idx0);
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements BER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public RegionList decodeValue(BerCoder coder, DecoderInput source)
	    throws DecoderException
    {
	int total_len0 = source.mLength;
	int end_pos0 = (total_len0 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len0);
	int idx0 = 0;
	int tag;

	this.elements = new java.util.ArrayList<RegionOffsets>();

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
		RegionOffsets temp0 = new RegionOffsets();
		this.add(temp0);
		if (tag != 0x30)
		    source.raiseTagMismatchException(tag);
		temp0.decodeValue(coder, source);
		++idx0;
	    }
	} catch (Exception e) {
	    DecoderException ee = DecoderException.wrapException(e);
	    ee.appendElementContext(null, "RegionList", idx0);
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
	java.util.ArrayList<RegionOffsets> temp0 = this.elements;
	int idx0 = temp0 != null ? temp0.size() : 0;

	try {
	    while(idx0-- > 0) {
		len0 += sink.encodeLengthTag(temp0.get(idx0).encodeValue(coder, sink), 0x30);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendElementContext(null, "RegionList", idx0);
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, RegionList data)
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
		RegionOffsets item1 = data.elements.get(idx0);

		nbits += RegionOffsets.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext(null, "RegionOffsets", idx0);
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
    public static RegionList decodeValue(PerCoder coder, InputBitStream source, RegionList data)
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
	    data.elements = new java.util.ArrayList<RegionOffsets>(fragmentLength0);
	while (idx0 > 0) {
	    try {
		RegionOffsets item1 = new RegionOffsets();

		data.elements.add(item1);
		item1.decodeValue(coder, source, item1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendElementContext(null, "RegionOffsets", total_len0);
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
     * Implements value printer for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public void printValue(DataPrinter printer, java.io.PrintWriter writer)
	    throws Exception
    {
	java.util.ArrayList<RegionOffsets> temp0 = this.elements;
	int len0 = temp0 != null ? temp0.size() : 0;
	int idx0 = 0;

	try {
	    writer.print('{');
	    printer.indent();
	    for (idx0 = 0; idx0 < len0; idx0++){
		if (idx0 > 0)
		    writer.print(',');
		printer.newLine(writer);
		temp0.get(idx0).printValue(printer, writer);
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
	return equalTo((RegionList)that);
    }
    
    public boolean equalTo(SequenceOf that)
    {
	return equalTo((RegionList)that);
    }
    
    public boolean equalTo(RegionList that) {
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
    public RegionList clone() {
	RegionList copy = (RegionList)super.clone();
	copy.elements = new java.util.ArrayList<RegionOffsets>(elements.size());
	for (RegionOffsets element : elements) {
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
} // End class definition for RegionList
