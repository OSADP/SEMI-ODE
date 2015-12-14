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
/* Created: Mon Dec 14 11:50:30 2015 */
/* ASN.1 Compiler for Java version: 6.2 */
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
 * Define the ASN1 Type Extent from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class Extent extends Enumerated {
    
    /**
     * The default constructor.
     */
    private Extent()
    {
	super(0);
    }
    
    public Extent(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long useInstantlyOnly = 0;
	public static final long useFor3meters = 1;
	public static final long useFor10meters = 2;
	public static final long useFor50meters = 3;
	public static final long useFor100meters = 4;
	public static final long useFor500meters = 5;
	public static final long useFor1000meters = 6;
	public static final long useFor5000meters = 7;
	public static final long useFor10000meters = 8;
	public static final long useFor50000meters = 9;
	public static final long useFor100000meters = 10;
	public static final long forever = 127;
    }
    // Named list definitions.
    public static final Extent useInstantlyOnly =
	new Extent();
    public static final Extent useFor3meters =
	new Extent(1);
    public static final Extent useFor10meters =
	new Extent(2);
    public static final Extent useFor50meters =
	new Extent(3);
    public static final Extent useFor100meters =
	new Extent(4);
    public static final Extent useFor500meters =
	new Extent(5);
    public static final Extent useFor1000meters =
	new Extent(6);
    public static final Extent useFor5000meters =
	new Extent(7);
    public static final Extent useFor10000meters =
	new Extent(8);
    public static final Extent useFor50000meters =
	new Extent(9);
    public static final Extent useFor100000meters =
	new Extent(10);
    public static final Extent forever =
	new Extent(127);
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static Extent cNamedNumbers[] = {
	 useInstantlyOnly, 
	 useFor3meters, 
	 useFor10meters, 
	 useFor50meters, 
	 useFor100meters, 
	 useFor500meters, 
	 useFor1000meters, 
	 useFor5000meters, 
	 useFor10000meters, 
	 useFor50000meters, 
	 useFor100000meters, 
	 forever
    };
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static String cConstantNameList[] = {
	"useInstantlyOnly",
	"useFor3meters",
	"useFor10meters",
	"useFor50meters",
	"useFor100meters",
	"useFor500meters",
	"useFor1000meters",
	"useFor5000meters",
	"useFor10000meters",
	"useFor50000meters",
	"useFor100000meters",
	"forever"
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
	return (index < 0 || index >= 12 || cConstantNameList == null) ? null : cConstantNameList[index];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int indexOfValue(long value)
    {
	if (value >= 0 && value <= 10)
	    return (int)value;
	if (value == 127)
	    return 11;
	else
	    return -1;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static Extent valueOf(long value)
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
    public static Extent valueAt(int index)
    {
	if (index < 0 || index >= 12)
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
    public Extent clone() {
	return (Extent)super.clone();
    }

} // End class definition for Extent
