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
 * Define the ASN1 Type AccelerationConfidence from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class AccelerationConfidence extends Enumerated {
    
    /**
     * The default constructor.
     */
    private AccelerationConfidence()
    {
	super(0);
    }
    
    public AccelerationConfidence(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long unavailable = 0;
	public static final long accl_100_00 = 1;
	public static final long accl_010_00 = 2;
	public static final long accl_005_00 = 3;
	public static final long accl_001_00 = 4;
	public static final long accl_000_10 = 5;
	public static final long accl_000_05 = 6;
	public static final long accl_000_01 = 7;
    }
    // Named list definitions.
    public static final AccelerationConfidence unavailable =
	new AccelerationConfidence();
    public static final AccelerationConfidence accl_100_00 =
	new AccelerationConfidence(1);
    public static final AccelerationConfidence accl_010_00 =
	new AccelerationConfidence(2);
    public static final AccelerationConfidence accl_005_00 =
	new AccelerationConfidence(3);
    public static final AccelerationConfidence accl_001_00 =
	new AccelerationConfidence(4);
    public static final AccelerationConfidence accl_000_10 =
	new AccelerationConfidence(5);
    public static final AccelerationConfidence accl_000_05 =
	new AccelerationConfidence(6);
    public static final AccelerationConfidence accl_000_01 =
	new AccelerationConfidence(7);
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static AccelerationConfidence cNamedNumbers[] = {
	 unavailable, 
	 accl_100_00, 
	 accl_010_00, 
	 accl_005_00, 
	 accl_001_00, 
	 accl_000_10, 
	 accl_000_05, 
	 accl_000_01
    };
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static String cConstantNameList[] = {
	"unavailable",
	"accl-100-00",
	"accl-010-00",
	"accl-005-00",
	"accl-001-00",
	"accl-000-10",
	"accl-000-05",
	"accl-000-01"
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
    public static AccelerationConfidence valueOf(long value)
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
    public static AccelerationConfidence valueAt(int index)
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
    public AccelerationConfidence clone() {
	return (AccelerationConfidence)super.clone();
    }

} // End class definition for AccelerationConfidence
