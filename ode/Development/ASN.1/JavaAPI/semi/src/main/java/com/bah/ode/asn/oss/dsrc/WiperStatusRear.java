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
 * Define the ASN1 Type WiperStatusRear from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class WiperStatusRear extends Enumerated {
    
    /**
     * The default constructor.
     */
    private WiperStatusRear()
    {
	super(0);
    }
    
    public WiperStatusRear(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long unavailable = 0;
	public static final long off = 1;
	public static final long intermittent = 2;
	public static final long low = 3;
	public static final long high = 4;
	public static final long washerInUse = 126;
	public static final long automaticPresent = 127;
	
    }
    // Named list definitions.
    public static final WiperStatusRear unavailable =
	new WiperStatusRear();
    public static final WiperStatusRear off =
	new WiperStatusRear(1);
    public static final WiperStatusRear intermittent =
	new WiperStatusRear(2);
    public static final WiperStatusRear low =
	new WiperStatusRear(3);
    public static final WiperStatusRear high =
	new WiperStatusRear(4);
    public static final WiperStatusRear washerInUse =
	new WiperStatusRear(126);
    public static final WiperStatusRear automaticPresent =
	new WiperStatusRear(127);
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static WiperStatusRear cNamedNumbers[] = {
	 unavailable, 
	 off, 
	 intermittent, 
	 low, 
	 high, 
	 washerInUse, 
	 automaticPresent
    };
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static String cConstantNameList[] = {
	"unavailable",
	"off",
	"intermittent",
	"low",
	"high",
	"washerInUse",
	"automaticPresent"
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
	return (index < 0 || index >= 7 || cConstantNameList == null) ? null : cConstantNameList[index];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int indexOfValue(long value)
    {
	if (value >= 0 && value <= 4)
	    return (int)value;
	if (value >= 126 && value <= 127)
	    return (int)(value - 121);
	else
	    return -1;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static WiperStatusRear valueOf(long value)
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
    public static WiperStatusRear valueAt(int index)
    {
	if (index < 0)
	    throw new IndexOutOfBoundsException();
	else if (index >= 7)
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
    public WiperStatusRear clone() {
	return (WiperStatusRear)super.clone();
    }

    /**
     * Methods for "unknownEnumerator"
     */
    private static final WiperStatusRear cUnknownEnumerator = 
	new WiperStatusRear(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static WiperStatusRear unknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public WiperStatusRear getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
} // End class definition for WiperStatusRear
