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
 * Define the ASN1 Type PriorityState from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class PriorityState extends Enumerated {
    
    /**
     * The default constructor.
     */
    private PriorityState()
    {
	super(0);
    }
    
    public PriorityState(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long noneActive = 0;
	public static final long none = 1;
	public static final long requested = 2;
	public static final long active = 3;
	public static final long activeButIhibitd = 4;
	public static final long seccess = 5;
	public static final long removed = 6;
	public static final long clearFail = 7;
	public static final long detectFail = 8;
	public static final long detectClear = 9;
	public static final long abort = 10;
	public static final long delayTiming = 11;
	public static final long extendTiming = 12;
	public static final long preemptOverride = 13;
	public static final long adaptiveOverride = 14;
	public static final long reserved = 15;
	
    }
    // Named list definitions.
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static PriorityState cNamedNumbers[] = {
	new PriorityState(), 
	new PriorityState(1), 
	new PriorityState(2), 
	new PriorityState(3), 
	new PriorityState(4), 
	new PriorityState(5), 
	new PriorityState(6), 
	new PriorityState(7), 
	new PriorityState(8), 
	new PriorityState(9), 
	new PriorityState(10), 
	new PriorityState(11), 
	new PriorityState(12), 
	new PriorityState(13), 
	new PriorityState(14), 
	new PriorityState(15)
    };
    public static final PriorityState noneActive = cNamedNumbers[0];
    public static final PriorityState none = cNamedNumbers[1];
    public static final PriorityState requested = cNamedNumbers[2];
    public static final PriorityState active = cNamedNumbers[3];
    public static final PriorityState activeButIhibitd = cNamedNumbers[4];
    public static final PriorityState seccess = cNamedNumbers[5];
    public static final PriorityState removed = cNamedNumbers[6];
    public static final PriorityState clearFail = cNamedNumbers[7];
    public static final PriorityState detectFail = cNamedNumbers[8];
    public static final PriorityState detectClear = cNamedNumbers[9];
    public static final PriorityState abort = cNamedNumbers[10];
    public static final PriorityState delayTiming = cNamedNumbers[11];
    public static final PriorityState extendTiming = cNamedNumbers[12];
    public static final PriorityState preemptOverride = cNamedNumbers[13];
    public static final PriorityState adaptiveOverride = cNamedNumbers[14];
    public static final PriorityState reserved = cNamedNumbers[15];
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static String cConstantNameList[] = {
	"noneActive",
	"none",
	"requested",
	"active",
	"activeButIhibitd",
	"seccess",
	"removed",
	"clearFail",
	"detectFail",
	"detectClear",
	"abort",
	"delayTiming",
	"extendTiming",
	"preemptOverride",
	"adaptiveOverride",
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
	return (index < 0 || index >= 16 || cConstantNameList == null) ? null : cConstantNameList[index];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int indexOfValue(long value)
    {
	if (value >= 0 && value <= 15)
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
    
    public static PriorityState valueOf(long value)
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
    public static PriorityState valueAt(int index)
    {
	if (index < 0)
	    throw new IndexOutOfBoundsException();
	else if (index >= 16)
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
    public PriorityState clone() {
	return (PriorityState)super.clone();
    }

    /**
     * Methods for "unknownEnumerator"
     */
    private static final PriorityState cUnknownEnumerator = 
	new PriorityState(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static PriorityState unknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public PriorityState getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
} // End class definition for PriorityState
