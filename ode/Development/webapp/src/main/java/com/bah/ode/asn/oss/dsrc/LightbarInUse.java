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
 * Define the ASN1 Type LightbarInUse from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class LightbarInUse extends Enumerated {
    
    /**
     * The default constructor.
     */
    private LightbarInUse()
    {
	super(0);
    }
    
    public LightbarInUse(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long unavailable = 0;
	public static final long notInUse = 1;
	public static final long inUse = 2;
	public static final long sirenInUse = 3;
	public static final long yellowCautionLights = 4;
	public static final long schooldBusLights = 5;
	public static final long arrowSignsActive = 6;
	public static final long slowMovingVehicle = 7;
	public static final long freqStops = 8;
	public static final long reserved = 9;
    }
    // Named list definitions.
    public static final LightbarInUse unavailable =
	new LightbarInUse();
    public static final LightbarInUse notInUse =
	new LightbarInUse(1);
    public static final LightbarInUse inUse =
	new LightbarInUse(2);
    public static final LightbarInUse sirenInUse =
	new LightbarInUse(3);
    public static final LightbarInUse yellowCautionLights =
	new LightbarInUse(4);
    public static final LightbarInUse schooldBusLights =
	new LightbarInUse(5);
    public static final LightbarInUse arrowSignsActive =
	new LightbarInUse(6);
    public static final LightbarInUse slowMovingVehicle =
	new LightbarInUse(7);
    public static final LightbarInUse freqStops =
	new LightbarInUse(8);
    public static final LightbarInUse reserved =
	new LightbarInUse(9);
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static LightbarInUse cNamedNumbers[] = {
	 unavailable, 
	 notInUse, 
	 inUse, 
	 sirenInUse, 
	 yellowCautionLights, 
	 schooldBusLights, 
	 arrowSignsActive, 
	 slowMovingVehicle, 
	 freqStops, 
	 reserved
    };
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static String cConstantNameList[] = {
	"unavailable",
	"notInUse",
	"inUse",
	"sirenInUse",
	"yellowCautionLights",
	"schooldBusLights",
	"arrowSignsActive",
	"slowMovingVehicle",
	"freqStops",
	"reserved"
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
	if (value >= 0 && value <= 9)
	    return (int)value;
	else
	    return -1;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static LightbarInUse valueOf(long value)
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
    public static LightbarInUse valueAt(int index)
    {
	if (index < 0 || index >= 10)
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
    public LightbarInUse clone() {
	return (LightbarInUse)super.clone();
    }

} // End class definition for LightbarInUse
