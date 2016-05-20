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
 * Define the ASN1 Type RequestedItem from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class RequestedItem extends Enumerated {
    
    /**
     * The default constructor.
     */
    private RequestedItem()
    {
	super(0);
    }
    
    public RequestedItem(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long reserved = 0;
	public static final long itemA = 1;
	public static final long itemB = 2;
	public static final long itemC = 3;
	public static final long itemD = 4;
	public static final long itemE = 5;
	public static final long itemF = 6;
	public static final long itemG = 7;
	public static final long itemH = 8;
	public static final long itemI = 9;
	public static final long itemJ = 10;
	public static final long itemK = 11;
	public static final long itemL = 12;
	public static final long itemM = 13;
	public static final long itemN = 14;
	public static final long itemO = 15;
	public static final long itemP = 16;
	public static final long itemQ = 17;
	
    }
    // Named list definitions.
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static RequestedItem cNamedNumbers[] = {
	new RequestedItem(), 
	new RequestedItem(1), 
	new RequestedItem(2), 
	new RequestedItem(3), 
	new RequestedItem(4), 
	new RequestedItem(5), 
	new RequestedItem(6), 
	new RequestedItem(7), 
	new RequestedItem(8), 
	new RequestedItem(9), 
	new RequestedItem(10), 
	new RequestedItem(11), 
	new RequestedItem(12), 
	new RequestedItem(13), 
	new RequestedItem(14), 
	new RequestedItem(15), 
	new RequestedItem(16), 
	new RequestedItem(17)
    };
    public static final RequestedItem reserved = cNamedNumbers[0];
    public static final RequestedItem itemA = cNamedNumbers[1];
    public static final RequestedItem itemB = cNamedNumbers[2];
    public static final RequestedItem itemC = cNamedNumbers[3];
    public static final RequestedItem itemD = cNamedNumbers[4];
    public static final RequestedItem itemE = cNamedNumbers[5];
    public static final RequestedItem itemF = cNamedNumbers[6];
    public static final RequestedItem itemG = cNamedNumbers[7];
    public static final RequestedItem itemH = cNamedNumbers[8];
    public static final RequestedItem itemI = cNamedNumbers[9];
    public static final RequestedItem itemJ = cNamedNumbers[10];
    public static final RequestedItem itemK = cNamedNumbers[11];
    public static final RequestedItem itemL = cNamedNumbers[12];
    public static final RequestedItem itemM = cNamedNumbers[13];
    public static final RequestedItem itemN = cNamedNumbers[14];
    public static final RequestedItem itemO = cNamedNumbers[15];
    public static final RequestedItem itemP = cNamedNumbers[16];
    public static final RequestedItem itemQ = cNamedNumbers[17];
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static String cConstantNameList[] = {
	"reserved",
	"itemA",
	"itemB",
	"itemC",
	"itemD",
	"itemE",
	"itemF",
	"itemG",
	"itemH",
	"itemI",
	"itemJ",
	"itemK",
	"itemL",
	"itemM",
	"itemN",
	"itemO",
	"itemP",
	"itemQ"
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
	return (index < 0 || index >= 18 || cConstantNameList == null) ? null : cConstantNameList[index];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int indexOfValue(long value)
    {
	if (value >= 0 && value <= 17)
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
    
    public static RequestedItem valueOf(long value)
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
    public static RequestedItem valueAt(int index)
    {
	if (index < 0)
	    throw new IndexOutOfBoundsException();
	else if (index >= 18)
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
    public RequestedItem clone() {
	return (RequestedItem)super.clone();
    }

    /**
     * Methods for "unknownEnumerator"
     */
    private static final RequestedItem cUnknownEnumerator = 
	new RequestedItem(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static RequestedItem unknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public RequestedItem getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
} // End class definition for RequestedItem
