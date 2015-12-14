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
 * Define the ASN1 Type HeadingConfidence from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class HeadingConfidence extends Enumerated {
    
    /**
     * The default constructor.
     */
    private HeadingConfidence()
    {
	super(0);
    }
    
    public HeadingConfidence(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long unavailable = 0;
	public static final long prec45deg = 1;
	public static final long prec10deg = 2;
	public static final long prec05deg = 3;
	public static final long prec01deg = 4;
	public static final long prec0_1deg = 5;
	public static final long prec0_05deg = 6;
	public static final long prec0_01deg = 7;
    }
    // Named list definitions.
    public static final HeadingConfidence unavailable =
	new HeadingConfidence();
    public static final HeadingConfidence prec45deg =
	new HeadingConfidence(1);
    public static final HeadingConfidence prec10deg =
	new HeadingConfidence(2);
    public static final HeadingConfidence prec05deg =
	new HeadingConfidence(3);
    public static final HeadingConfidence prec01deg =
	new HeadingConfidence(4);
    public static final HeadingConfidence prec0_1deg =
	new HeadingConfidence(5);
    public static final HeadingConfidence prec0_05deg =
	new HeadingConfidence(6);
    public static final HeadingConfidence prec0_01deg =
	new HeadingConfidence(7);
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static HeadingConfidence cNamedNumbers[] = {
	 unavailable, 
	 prec45deg, 
	 prec10deg, 
	 prec05deg, 
	 prec01deg, 
	 prec0_1deg, 
	 prec0_05deg, 
	 prec0_01deg
    };
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static String cConstantNameList[] = {
	"unavailable",
	"prec45deg",
	"prec10deg",
	"prec05deg",
	"prec01deg",
	"prec0-1deg",
	"prec0-05deg",
	"prec0-01deg"
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
	return (index < 0 || index >= 8 || cConstantNameList == null) ? null : cConstantNameList[index];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int indexOfValue(long value)
    {
	if (value >= 0 && value <= 7)
	    return (int)value;
	else
	    return -1;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static HeadingConfidence valueOf(long value)
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
    public static HeadingConfidence valueAt(int index)
    {
	if (index < 0 || index >= 8)
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
    public HeadingConfidence clone() {
	return (HeadingConfidence)super.clone();
    }

} // End class definition for HeadingConfidence
