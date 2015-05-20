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
/* Created: Wed May 20 08:06:10 2015 */
/* ASN.1 Compiler for Java version: 6.1 */
/* ASN.1 compiler options and file names specified:
 * -toed -output com.bah.ode.asn.oss -per -uper -ber -der -root -messageFormat
 * msvc
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
 * Define the ASN1 Type ColorState from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class ColorState extends Enumerated {
    
    /**
     * The default constructor.
     */
    private ColorState()
    {
	super(0);
    }
    
    public ColorState(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long dark = 0;
	public static final long green = 1;
	public static final long yellow = 2;
	public static final long red = 4;
	public static final long green_flashing = 9;
	public static final long yellow_flashing = 10;
	public static final long red_flashing = 12;
    }
    // Named list definitions.
    public static final ColorState dark =
	new ColorState();
    public static final ColorState green =
	new ColorState(1);
    public static final ColorState yellow =
	new ColorState(2);
    public static final ColorState red =
	new ColorState(4);
    public static final ColorState green_flashing =
	new ColorState(9);
    public static final ColorState yellow_flashing =
	new ColorState(10);
    public static final ColorState red_flashing =
	new ColorState(12);
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static ColorState cNamedNumbers[] = {
	 dark, 
	 green, 
	 yellow, 
	 red, 
	 green_flashing, 
	 yellow_flashing, 
	 red_flashing
    };
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static String cConstantNameList[] = {
	"dark",
	"green",
	"yellow",
	"red",
	"green-flashing",
	"yellow-flashing",
	"red-flashing"
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
	return indexOfValue(value, cNamedNumbers, 0, 7);
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static ColorState valueOf(long value)
    {
	int inx = indexOfValue(value, cNamedNumbers, 0, 7);
	
	if (inx < 0)
	    return null;
	else
	    return cNamedNumbers[inx];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static ColorState valueAt(int index)
    {
	if (index < 0 || index >= 7)
	    throw new IndexOutOfBoundsException();
	
	return cNamedNumbers[index];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int indexOf()
    {
	return indexOfValue(mValue, cNamedNumbers, 0, 7);
    }
    
    /**
     * Clone 'this' object.
     */
    public ColorState clone() {
	return (ColorState)super.clone();
    }

} // End class definition for ColorState
