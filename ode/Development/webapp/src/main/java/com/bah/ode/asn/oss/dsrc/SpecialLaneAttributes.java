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
 * Define the ASN1 Type SpecialLaneAttributes from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class SpecialLaneAttributes extends Enumerated {
    
    /**
     * The default constructor.
     */
    private SpecialLaneAttributes()
    {
	super(0);
    }
    
    public SpecialLaneAttributes(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long noData = 0;
	public static final long egressPath = 1;
	public static final long railRoadTrack = 2;
	public static final long transitOnlyLane = 4;
	public static final long hovLane = 8;
	public static final long busOnly = 16;
	public static final long vehiclesEntering = 32;
	public static final long vehiclesLeaving = 64;
	public static final long reserved = 128;
    }
    // Named list definitions.
    public static final SpecialLaneAttributes noData =
	new SpecialLaneAttributes();
    public static final SpecialLaneAttributes egressPath =
	new SpecialLaneAttributes(1);
    public static final SpecialLaneAttributes railRoadTrack =
	new SpecialLaneAttributes(2);
    public static final SpecialLaneAttributes transitOnlyLane =
	new SpecialLaneAttributes(4);
    public static final SpecialLaneAttributes hovLane =
	new SpecialLaneAttributes(8);
    public static final SpecialLaneAttributes busOnly =
	new SpecialLaneAttributes(16);
    public static final SpecialLaneAttributes vehiclesEntering =
	new SpecialLaneAttributes(32);
    public static final SpecialLaneAttributes vehiclesLeaving =
	new SpecialLaneAttributes(64);
    public static final SpecialLaneAttributes reserved =
	new SpecialLaneAttributes(128);
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static SpecialLaneAttributes cNamedNumbers[] = {
	 noData, 
	 egressPath, 
	 railRoadTrack, 
	 transitOnlyLane, 
	 hovLane, 
	 busOnly, 
	 vehiclesEntering, 
	 vehiclesLeaving, 
	 reserved
    };
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static String cConstantNameList[] = {
	"noData",
	"egressPath",
	"railRoadTrack",
	"transitOnlyLane",
	"hovLane",
	"busOnly",
	"vehiclesEntering",
	"vehiclesLeaving",
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
	return (index < 0 || index >= 9 || cConstantNameList == null) ? null : cConstantNameList[index];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int indexOfValue(long value)
    {
	return indexOfValue(value, cNamedNumbers, 0, 9);
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static SpecialLaneAttributes valueOf(long value)
    {
	int inx = indexOfValue(value, cNamedNumbers, 0, 9);
	
	if (inx < 0)
	    return null;
	else
	    return cNamedNumbers[inx];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static SpecialLaneAttributes valueAt(int index)
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
	return indexOfValue(mValue, cNamedNumbers, 0, 9);
    }
    
    /**
     * Clone 'this' object.
     */
    public SpecialLaneAttributes clone() {
	return (SpecialLaneAttributes)super.clone();
    }

} // End class definition for SpecialLaneAttributes
