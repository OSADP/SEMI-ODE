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


package com.bah.ode.asn.oss.ntcip;

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
 * Define the ASN1 Type EssPrecipSituation from ASN1 Module NTCIP.
 * @see Enumerated
 */

public final class EssPrecipSituation extends Enumerated {
    
    /**
     * The default constructor.
     */
    private EssPrecipSituation()
    {
	super(1);
    }
    
    public EssPrecipSituation(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long other = 1;
	public static final long unknown = 2;
	public static final long noPrecipitation = 3;
	public static final long unidentifiedSlight = 4;
	public static final long unidentifiedModerate = 5;
	public static final long unidentifiedHeavy = 6;
	public static final long snowSlight = 7;
	public static final long snowModerate = 8;
	public static final long snowHeavy = 9;
	public static final long rainSlight = 10;
	public static final long rainModerate = 11;
	public static final long rainHeavy = 12;
	public static final long frozenPrecipitationSlight = 13;
	public static final long frozenPrecipitationModerate = 14;
	public static final long frozenPrecipitationHeavy = 15;
    }
    // Named list definitions.
    public static final EssPrecipSituation other =
	new EssPrecipSituation();
    public static final EssPrecipSituation unknown =
	new EssPrecipSituation(2);
    public static final EssPrecipSituation noPrecipitation =
	new EssPrecipSituation(3);
    public static final EssPrecipSituation unidentifiedSlight =
	new EssPrecipSituation(4);
    public static final EssPrecipSituation unidentifiedModerate =
	new EssPrecipSituation(5);
    public static final EssPrecipSituation unidentifiedHeavy =
	new EssPrecipSituation(6);
    public static final EssPrecipSituation snowSlight =
	new EssPrecipSituation(7);
    public static final EssPrecipSituation snowModerate =
	new EssPrecipSituation(8);
    public static final EssPrecipSituation snowHeavy =
	new EssPrecipSituation(9);
    public static final EssPrecipSituation rainSlight =
	new EssPrecipSituation(10);
    public static final EssPrecipSituation rainModerate =
	new EssPrecipSituation(11);
    public static final EssPrecipSituation rainHeavy =
	new EssPrecipSituation(12);
    public static final EssPrecipSituation frozenPrecipitationSlight =
	new EssPrecipSituation(13);
    public static final EssPrecipSituation frozenPrecipitationModerate =
	new EssPrecipSituation(14);
    public static final EssPrecipSituation frozenPrecipitationHeavy =
	new EssPrecipSituation(15);
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static EssPrecipSituation cNamedNumbers[] = {
	 other, 
	 unknown, 
	 noPrecipitation, 
	 unidentifiedSlight, 
	 unidentifiedModerate, 
	 unidentifiedHeavy, 
	 snowSlight, 
	 snowModerate, 
	 snowHeavy, 
	 rainSlight, 
	 rainModerate, 
	 rainHeavy, 
	 frozenPrecipitationSlight, 
	 frozenPrecipitationModerate, 
	 frozenPrecipitationHeavy
    };
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static String cConstantNameList[] = {
	"other",
	"unknown",
	"noPrecipitation",
	"unidentifiedSlight",
	"unidentifiedModerate",
	"unidentifiedHeavy",
	"snowSlight",
	"snowModerate",
	"snowHeavy",
	"rainSlight",
	"rainModerate",
	"rainHeavy",
	"frozenPrecipitationSlight",
	"frozenPrecipitationModerate",
	"frozenPrecipitationHeavy"
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
	return (index < 0 || index >= 15 || cConstantNameList == null) ? null : cConstantNameList[index];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int indexOfValue(long value)
    {
	if (value >= 1 && value <= 15)
	    return (int)(value - 1);
	else
	    return -1;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static EssPrecipSituation valueOf(long value)
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
    public static EssPrecipSituation valueAt(int index)
    {
	if (index < 0 || index >= 15)
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
    public EssPrecipSituation clone() {
	return (EssPrecipSituation)super.clone();
    }

} // End class definition for EssPrecipSituation
