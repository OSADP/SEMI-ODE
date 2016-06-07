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
 * Define the ASN1 Type TxChannel from ASN1 Module SEMI.
 * @see Enumerated
 */

public final class TxChannel extends Enumerated {
    
    /**
     * The default constructor.
     */
    private TxChannel()
    {
	super(0);
    }
    
    public TxChannel(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long chControl = 0;
	public static final long chService = 1;
	public static final long ch172 = 2;
	public static final long ch174 = 3;
	public static final long ch176 = 4;
	public static final long ch178 = 5;
	public static final long ch180 = 6;
	public static final long ch182 = 7;
	public static final long ch184 = 8;
    }
    // Named list definitions.
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static TxChannel cNamedNumbers[] = {
	new TxChannel(), 
	new TxChannel(1), 
	new TxChannel(2), 
	new TxChannel(3), 
	new TxChannel(4), 
	new TxChannel(5), 
	new TxChannel(6), 
	new TxChannel(7), 
	new TxChannel(8)
    };
    public static final TxChannel chControl = cNamedNumbers[0];
    public static final TxChannel chService = cNamedNumbers[1];
    public static final TxChannel ch172 = cNamedNumbers[2];
    public static final TxChannel ch174 = cNamedNumbers[3];
    public static final TxChannel ch176 = cNamedNumbers[4];
    public static final TxChannel ch178 = cNamedNumbers[5];
    public static final TxChannel ch180 = cNamedNumbers[6];
    public static final TxChannel ch182 = cNamedNumbers[7];
    public static final TxChannel ch184 = cNamedNumbers[8];
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static String cConstantNameList[] = {
	"chControl",
	"chService",
	"ch172",
	"ch174",
	"ch176",
	"ch178",
	"ch180",
	"ch182",
	"ch184"
    };
    
    
    /**
     * Returns the array of enumerators (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public Enumerated[] getNamedNumbers()
    {
	return cNamedNumbers;
    }
    
    /**
     * Returns the name of this enumerator.
     */
    public String name()
    {
	int index = indexOf();
	return (index < 0 || index >= 9 || cConstantNameList == null) ? null : cConstantNameList[index];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int indexOfValue(long value)
    {
	if (value >= 0 && value <= 8)
	    return (int)value;
	else
	    return -1;
    }
    
    /**
     * Returns the enumerator with the specified value or null if the value
     * is not associated with any enumerator.
     *  @param value The value of the enumerator to return.
     *  @return The enumerator with the specified value.
     */
    
    public static TxChannel valueOf(long value)
    {
	int inx = indexOfValue(value);
	
	if (inx < 0)
	    return null;
	else
	    return cNamedNumbers[inx];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static TxChannel valueAt(int index)
    {
	if (index < 0 || index >= 9)
	    throw new IndexOutOfBoundsException();
	
	return cNamedNumbers[index];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int indexOf()
    {
	return indexOfValue(mValue);
    }
    
    /**
     * Clone 'this' object.
     */
    public TxChannel clone() {
	return (TxChannel)super.clone();
    }

} // End class definition for TxChannel
