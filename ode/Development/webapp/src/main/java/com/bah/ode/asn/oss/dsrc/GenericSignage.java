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
/* Created: Tue Apr 28 10:28:02 2015 */
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
 * Define the ASN1 Type GenericSignage from ASN1 Module DSRC.
 * @see SequenceOf
 */

public class GenericSignage extends SequenceOf {
    
    /**
     * The default constructor.
     */
    public GenericSignage()
    {
	this.elements = new java.util.ArrayList<Sequence_>();
    }
    
    
    /**
     * Construct from an array of components.
     */
    public java.util.ArrayList<Sequence_> elements;

    public GenericSignage(Sequence_[] elements)
    {
	this.elements = new java.util.ArrayList<Sequence_>(java.util.Arrays.asList(elements));
    }
    
    
    /**
     * Define the ASN1 Type Sequence_ from ASN1 Module DSRC.
     * @see Sequence
     */
    public static class Sequence_ extends Sequence {
	public Item item;
	
	/**
	 * The default constructor.
	 */
	public Sequence_()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Sequence_(Item item)
	{
	    setItem(item);
	}
	
	
	// Methods for field "item"
	public Item getItem()
	{
	    return this.item;
	}
	
	public void setItem(Item item)
	{
	    this.item = item;
	}
	
	
	
	/**
	 * Define the ASN1 Type Item from ASN1 Module DSRC.
	 * @see Choice
	 */
	public static class Item extends Choice {
	    
	    /**
	     * The default constructor.
	     */
	    public Item()
	    {
	    }
	    
	    public static final  int  itis_chosen = 1;
	    public static final  int  text_chosen = 2;
	    
	    // Methods for field "itis"
	    public static Item createItemWithItis(long itis)
	    {
		return createItemWithItis(new com.bah.ode.asn.oss.itis.ITIScodes(itis));
	    }
	    
	    public static Item createItemWithItis(com.bah.ode.asn.oss.itis.ITIScodes itis)
	    {
		Item __object = new Item();

		__object.setItis(itis);
		return __object;
	    }
	    
	    public boolean hasItis()
	    {
		return getChosenFlag() == itis_chosen;
	    }
	    
	    public com.bah.ode.asn.oss.itis.ITIScodes getItis()
	    {
		if (hasItis())
		    return (com.bah.ode.asn.oss.itis.ITIScodes)mChosenValue;
		else
		    return null;
	    }
	    
	    public void setItis(long itis)
	    {
		setItis(new com.bah.ode.asn.oss.itis.ITIScodes(itis));
	    }
	    
	    public void setItis(com.bah.ode.asn.oss.itis.ITIScodes itis)
	    {
		setChosenValue(itis);
		setChosenFlag(itis_chosen);
	    }
	    
	    
	    // Methods for field "text"
	    public static Item createItemWithText(IA5String text)
	    {
		Item __object = new Item();

		__object.setText(text);
		return __object;
	    }
	    
	    public boolean hasText()
	    {
		return getChosenFlag() == text_chosen;
	    }
	    
	    public IA5String getText()
	    {
		if (hasText())
		    return (IA5String)mChosenValue;
		else
		    return null;
	    }
	    
	    public void setText(IA5String text)
	    {
		setChosenValue(text);
		setChosenFlag(text_chosen);
	    }
	    
	    
	    /**
	     * Effective permitted alphabet (reserved for internal use).
	     * This member is reserved for internal use and must not be used in the application code.
	     */
	    public static final EPAInfo _cEPAInfo_text = 
		IA5StringPAInfo.paInfo;
	    
	    /**
	     * Implements PER value encoder for the type (reserved for internal use).
	     * This method is reserved for internal use and must not be invoked from the application code.
	     */
	    public static int encodeValue(PerCoder coder, OutputBitStream sink, Item data)
		    throws IOException, EncoderException, EncodeFailedException
	    {
		int idx0 = data.mChosenFlag;
		int nbits = 0;

		if (idx0 < 1 || idx0 > 2)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._bad_choice, null, idx0);
		nbits += coder.encodeConstrainedWholeNumber(idx0 - 1, 0, 1, sink);
		switch (idx0) {
		    case itis_chosen:
			// Encode alternative 'itis'
			try {
			    com.bah.ode.asn.oss.itis.ITIScodes item1 = (com.bah.ode.asn.oss.itis.ITIScodes)data.mChosenValue;
			    long temp1 = item1.longValue();

			    if (temp1 < 0 || temp1 > 65565)
				throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
			    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 65565, sink);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendElementContext("itis", "ITIScodes", 0);
			    throw ee;
			}
			break;
		    case text_chosen:
			// Encode alternative 'text'
			try {
			    IA5String item1 = (IA5String)data.mChosenValue;
			    int len1 = item1.getSize();

			    if (len1 < 1 || len1 > 16)
				throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
			    nbits += com.oss.coders.per.PerKMCString.encode(coder, item1.stringValue(), 1, 16, Item._cEPAInfo_text, sink);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendElementContext("text", "IA5String", 0);
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
	    public static Item decodeValue(PerCoder coder, InputBitStream source, Item data)
		    throws IOException, DecoderException, DecodeFailedException
	    {
		int idx0 = 0;

		idx0 = (int)coder.decodeConstrainedWholeNumber(source, 0, 1) + 1;
		if (idx0 < 1 || idx0 > 2)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._bad_choice, null, idx0);
		data.mChosenFlag = idx0;
		switch (idx0) {
		    case itis_chosen:
			// Decode alternative 'itis'
			try {
			    com.bah.ode.asn.oss.itis.ITIScodes item1 = new com.bah.ode.asn.oss.itis.ITIScodes();
			    long temp1;

			    // Decode alternative 'itis'
			    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 65565);
			    if (temp1 > 65565)
				throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
			    item1.setValue(temp1);
			    data.mChosenValue = item1;
			} catch (Exception e) {
			    DecoderException de = DecoderException.wrapException(e);
			    de.appendElementContext("itis", "ITIScodes", 0);
			    throw de;
			}
			break;
		    case text_chosen:
			// Decode alternative 'text'
			try {
			    IA5String item1;

			    // Decode alternative 'text'
			    item1 = new IA5String(com.oss.coders.per.PerKMCString.decode(coder, source, 1, 16, Item._cEPAInfo_text));
			    data.mChosenValue = item1;
			} catch (Exception e) {
			    DecoderException de = DecoderException.wrapException(e);
			    de.appendElementContext("text", "IA5String", 0);
			    throw de;
			}
			break;
		}
		return data;
	    }

	    /**
	     * Clone 'this' object.
	     */
	    public Item clone() {
		return (Item)super.clone();
	    }

	} // End class definition for Item

	/**
	 * Implements PER value encoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public static int encodeValue(PerCoder coder, OutputBitStream sink, Sequence_ data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int nbits = 0;

	    // Encode field 'item'
	    try {
		Item item1 = data.item;

		nbits += (Item.encodeValue(coder, sink, item1));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item", "CHOICE");
		throw ee;
	    }

	    return nbits;
	}

	/**
	 * Implements PER value decoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public static Sequence_ decodeValue(PerCoder coder, InputBitStream source, Sequence_ data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    // Decode field 'item'
	    try {
		if (data.item == null)
		    data.item = new Item();
		Item.decodeValue(coder, source, data.item);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item", "CHOICE");
		throw de;
	    }
	    return data;
	}

	/**
	 * Compare 'this' object to another object to see if their contents are the same.
	 */
	public boolean abstractEqualTo(AbstractData that)
	{
	    return equalTo((Sequence_)that);
	}
	
	public boolean equalTo(Sequence that)
	{
	    return equalTo((Sequence_)that);
	}
	
	public boolean equalTo(Sequence_ that) {
	    if (!this.item.equalTo(that.item))
		return false;
	    return true;
	}

	/**
	 * Clone 'this' object.
	 */
	public Sequence_ clone() {
	    Sequence_ copy = (Sequence_)super.clone();
	    copy.item = item.clone();
	    return copy;
	}

    } // End class definition for Sequence_

    /**
     * Add an Element to the SEQUENCE OF/SET OF.
     */
    public synchronized void add(Sequence_ element)
    {
	elements.add(element);
    }
    
    /**
     * Set an Element in the SEQUENCE OF/SET OF.
     */
    public synchronized void set(Sequence_ element, int atIndex)
    {
	elements.set(atIndex, element);
    }
    
    /**
     * Get an Element from the SEQUENCE OF/SET OF.
     */
    public synchronized Sequence_ get(int atIndex)
    {
	return (Sequence_)elements.get(atIndex);
    }
    
    /**
     * Insert an Element into the SEQUENCE OF/SET OF.
     */
    public synchronized void insert(Sequence_ element, int atIndex)
    {
	elements.add(atIndex, element);
    }
    
    /**
     * Remove an Element from the SEQUENCE OF/SET OF.
     */
    public synchronized void remove(Sequence_ element)
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
	java.util.ArrayList<Sequence_> temp0 = this.elements;
	int idx0 = temp0 != null ? temp0.size() : 0;

	try {
	    while(idx0-- > 0) {
		int len1 = 0;

		try {
		    int len2;
		    com.bah.ode.asn.oss.dsrc.GenericSignage.Sequence_.Item temp2 = temp0.get(idx0).item;

		    switch (temp2.getChosenFlag()) {
		    case com.bah.ode.asn.oss.dsrc.GenericSignage.Sequence_.Item.itis_chosen:
			try {
			    len2 = sink.encodeLengthTag(coder.encodeInteger(((com.bah.ode.asn.oss.itis.ITIScodes)temp2.getChosenValue()), sink), 0x80);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendElementContext("itis", "CHOICE", 0);
			    throw ee;
			}
			break;

		    case com.bah.ode.asn.oss.dsrc.GenericSignage.Sequence_.Item.text_chosen:
			try {
			    len2 = sink.encodeLengthTag(coder.encodeString1(((IA5String)temp2.getChosenValue()), sink), 0x81);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendElementContext("text", "CHOICE", 0);
			    throw ee;
			}
			break;

		    default:
			throw new EncoderException(ExceptionDescriptor._bad_choice, null);
		    }
		    len1 += sink.encodeLengthTag(len2, 0xA0);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("item", "CHOICE");
		    throw ee;
		}
		len0 += sink.encodeLengthTag(len1, 0x30);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendElementContext(null, "GenericSignage", idx0);
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements BER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public GenericSignage decodeValue(BerCoder coder, DecoderInput source)
	    throws DecoderException
    {
	int total_len0 = source.mLength;
	int end_pos0 = (total_len0 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len0);
	int idx0 = 0;
	int tag;

	this.elements = new java.util.ArrayList<Sequence_>();

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
		Sequence_ temp0 = new Sequence_();
		this.add(temp0);
		if (tag != 0x30)
		    source.raiseTagMismatchException(tag);
		{
		    int total_len1 = source.mLength;
		    int end_pos1 = (total_len1 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len1);

		    tag = source.decodeTagLength();
		    if (tag != 0xA0)
			source.raiseTagMismatchException(tag);
		    try {
			temp0.item = new com.bah.ode.asn.oss.dsrc.GenericSignage.Sequence_.Item();
			tag = source.decodeTagLength();
			switch (tag & 0xFFFFFFDF) {
			case 0x80:
			    try {
				temp0.item.setChosenFlag(com.bah.ode.asn.oss.dsrc.GenericSignage.Sequence_.Item.itis_chosen);
				temp0.item.setChosenValue(new com.bah.ode.asn.oss.itis.ITIScodes(source.decodeLong()));
			    } catch (Exception e) {
				DecoderException ee = DecoderException.wrapException(e);
				ee.appendElementContext("itis", "ITIScodes", 0);
				throw ee;
			    }
			    break;

			case 0x81:
			    try {
				temp0.item.setChosenFlag(com.bah.ode.asn.oss.dsrc.GenericSignage.Sequence_.Item.text_chosen);
				temp0.item.setChosenValue(new IA5String(coder.decodeChars(source)));
			    } catch (Exception e) {
				DecoderException ee = DecoderException.wrapException(e);
				ee.appendElementContext("text", "IA5String", 0);
				throw ee;
			    }
			    break;

			default:
			    source.raiseUnknownFieldException(tag);
			}
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("item", "CHOICE");
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
		++idx0;
	    }
	} catch (Exception e) {
	    DecoderException ee = DecoderException.wrapException(e);
	    ee.appendElementContext(null, "GenericSignage", idx0);
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
	java.util.ArrayList<Sequence_> temp0 = this.elements;
	int idx0 = temp0 != null ? temp0.size() : 0;

	try {
	    while(idx0-- > 0) {
		int len1 = 0;

		try {
		    int len2;
		    com.bah.ode.asn.oss.dsrc.GenericSignage.Sequence_.Item temp2 = temp0.get(idx0).item;

		    switch (temp2.getChosenFlag()) {
		    case com.bah.ode.asn.oss.dsrc.GenericSignage.Sequence_.Item.itis_chosen:
			try {
			    len2 = sink.encodeLengthTag(coder.encodeInteger(((com.bah.ode.asn.oss.itis.ITIScodes)temp2.getChosenValue()), sink), 0x80);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendElementContext("itis", "CHOICE", 0);
			    throw ee;
			}
			break;

		    case com.bah.ode.asn.oss.dsrc.GenericSignage.Sequence_.Item.text_chosen:
			try {
			    len2 = sink.encodeLengthTag(coder.encodeString1(((IA5String)temp2.getChosenValue()), sink), 0x81);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendElementContext("text", "CHOICE", 0);
			    throw ee;
			}
			break;

		    default:
			throw new EncoderException(ExceptionDescriptor._bad_choice, null);
		    }
		    len1 += sink.encodeLengthTag(len2, 0xA0);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("item", "CHOICE");
		    throw ee;
		}
		len0 += sink.encodeLengthTag(len1, 0x30);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendElementContext(null, "GenericSignage", idx0);
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, GenericSignage data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int total_len0 = data.elements.size();
	int fragmentLength0;
	boolean moreFragments0;
	int idx0 = 0;
	int nbits = 0;

	if (total_len0 < 1 || total_len0 > 10)
	    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + total_len0);
	nbits += coder.encodeLengthDeterminant(total_len0, 1, 10, sink);
	moreFragments0 = coder.moreFragments();
	fragmentLength0 = (moreFragments0 ? coder.fragmentLength() : total_len0);
	while (total_len0 > 0) {
	    try {
		Sequence_ item1 = data.elements.get(idx0);

		nbits += Sequence_.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext(null, "SEQUENCE", idx0);
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
    public static GenericSignage decodeValue(PerCoder coder, InputBitStream source, GenericSignage data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	int total_len0 = 0;
	int fragmentLength0;
	boolean moreFragments0;
	int idx0 = 0;

	idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, 1, 10);
	if (fragmentLength0 > 10)
	    throw new DecoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + fragmentLength0);
	moreFragments0 = coder.moreFragments();
	if (data.elements != null)
	    data.elements.clear();
	else
	    data.elements = new java.util.ArrayList<Sequence_>(fragmentLength0);
	while (idx0 > 0) {
	    try {
		Sequence_ item1 = new Sequence_();

		data.elements.add(item1);
		Sequence_.decodeValue(coder, source, item1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendElementContext(null, "SEQUENCE", total_len0);
		throw de;
	    }
	    --idx0; ++total_len0;
	    if (idx0 == 0) {
		if (moreFragments0) {
		    idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, fragmentLength0);
		    moreFragments0 = coder.moreFragments();
		    if ((total_len0 + fragmentLength0) > 10)
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
	java.util.ArrayList<Sequence_> temp0 = this.elements;
	int len0 = temp0 != null ? temp0.size() : 0;
	int idx0 = 0;

	try {
	    writer.print('{');
	    printer.indent();
	    for (idx0 = 0; idx0 < len0; idx0++){
		boolean comma1;

		if (idx0 > 0)
		    writer.print(',');
		printer.newLine(writer);
		comma1 = false;
		writer.print('{');
		printer.indent();
		try {
		    if (comma1)
			writer.print(',');
		    comma1 = true;
		    printer.newLine(writer);
		    writer.print("item ");
		    {
			switch (temp0.get(idx0).item.getChosenFlag()) {
			case com.bah.ode.asn.oss.dsrc.GenericSignage.Sequence_.Item.itis_chosen:
			    try {
				writer.print("itis : ");
				writer.print(((com.bah.ode.asn.oss.itis.ITIScodes)temp0.get(idx0).item.getChosenValue()).longValue());
			    } catch (Exception e) {
				printer.reportError(e, null, writer);
			    }
			    break;

			case com.bah.ode.asn.oss.dsrc.GenericSignage.Sequence_.Item.text_chosen:
			    try {
				writer.print("text : ");
				printer.print(((IA5String)temp0.get(idx0).item.getChosenValue()), writer);
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
		printer.undent();
		if (comma1)
		    printer.newLine(writer);
		writer.print('}');
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
	return equalTo((GenericSignage)that);
    }
    
    public boolean equalTo(SequenceOf that)
    {
	return equalTo((GenericSignage)that);
    }
    
    public boolean equalTo(GenericSignage that) {
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
    public GenericSignage clone() {
	GenericSignage copy = (GenericSignage)super.clone();
	copy.elements = new java.util.ArrayList<Sequence_>(elements.size());
	for (Sequence_ element : elements) {
	    copy.elements.add(element.clone());
	}
	return copy;
    }

} // End class definition for GenericSignage
