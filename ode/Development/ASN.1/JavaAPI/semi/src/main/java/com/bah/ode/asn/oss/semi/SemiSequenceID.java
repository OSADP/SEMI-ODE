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
 * Define the ASN1 Type SemiSequenceID from ASN1 Module SEMI.
 * @see Enumerated
 */

public final class SemiSequenceID extends Enumerated {
    
    /**
     * The default constructor.
     */
    private SemiSequenceID()
    {
	super(1);
    }
    
    public SemiSequenceID(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long svcReq = 1;
	public static final long svcResp = 2;
	public static final long dataReq = 3;
	public static final long dataConf = 4;
	public static final long data = 5;
	public static final long accept = 6;
	public static final long receipt = 7;
	public static final long subscriptionReq = 8;
	public static final long subscriptinoResp = 9;
	public static final long subscriptionCancel = 10;
	
    }
    // Named list definitions.
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static SemiSequenceID cNamedNumbers[] = {
	new SemiSequenceID(), 
	new SemiSequenceID(2), 
	new SemiSequenceID(3), 
	new SemiSequenceID(4), 
	new SemiSequenceID(5), 
	new SemiSequenceID(6), 
	new SemiSequenceID(7), 
	new SemiSequenceID(8), 
	new SemiSequenceID(9), 
	new SemiSequenceID(10)
    };
    public static final SemiSequenceID svcReq = cNamedNumbers[0];
    public static final SemiSequenceID svcResp = cNamedNumbers[1];
    public static final SemiSequenceID dataReq = cNamedNumbers[2];
    public static final SemiSequenceID dataConf = cNamedNumbers[3];
    public static final SemiSequenceID data = cNamedNumbers[4];
    public static final SemiSequenceID accept = cNamedNumbers[5];
    public static final SemiSequenceID receipt = cNamedNumbers[6];
    public static final SemiSequenceID subscriptionReq = cNamedNumbers[7];
    public static final SemiSequenceID subscriptinoResp = cNamedNumbers[8];
    public static final SemiSequenceID subscriptionCancel = cNamedNumbers[9];
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static String cConstantNameList[] = {
	"svcReq",
	"svcResp",
	"dataReq",
	"dataConf",
	"data",
	"accept",
	"receipt",
	"subscriptionReq",
	"subscriptinoResp",
	"subscriptionCancel"
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
	return (index < 0 || index >= 10 || cConstantNameList == null) ? null : cConstantNameList[index];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int indexOfValue(long value)
    {
	if (value >= 1 && value <= 10)
	    return (int)(value - 1);
	else
	    return -1;
    }
    
    /**
     * Returns the enumerator with the specified value or null if the value
     * is not associated with any enumerator.
     *  @param value The value of the enumerator to return.
     *  @return The enumerator with the specified value.
     */
    
    public static SemiSequenceID valueOf(long value)
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
    public static SemiSequenceID valueAt(int index)
    {
	if (index < 0)
	    throw new IndexOutOfBoundsException();
	else if (index >= 10)
	    return null;
	
	return cNamedNumbers[index];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int indexOf()
    {
	if (isUnknownEnumerator())
	    return -1;
	return indexOfValue(mValue);
    }
    
    /**
     * Clone 'this' object.
     */
    public SemiSequenceID clone() {
	return (SemiSequenceID)super.clone();
    }

    /**
     * Methods for "unknownEnumerator"
     */
    private static final SemiSequenceID cUnknownEnumerator = 
	new SemiSequenceID(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static SemiSequenceID unknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public SemiSequenceID getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
} // End class definition for SemiSequenceID
