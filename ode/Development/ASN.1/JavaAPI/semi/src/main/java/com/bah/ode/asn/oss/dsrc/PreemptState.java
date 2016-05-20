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
 * Define the ASN1 Type PreemptState from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class PreemptState extends Enumerated {
    
    /**
     * The default constructor.
     */
    private PreemptState()
    {
	super(0);
    }
    
    public PreemptState(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long none = 0;
	public static final long other = 1;
	public static final long notActive = 2;
	public static final long notActiveWithCall = 3;
	public static final long entryStarted = 4;
	public static final long trackService = 5;
	public static final long dwell = 6;
	public static final long linkActive = 7;
	public static final long existStarted = 8;
	public static final long maximumPresence = 9;
	public static final long ackowledgedButOverridden = 10;
	
    }
    // Named list definitions.
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static PreemptState cNamedNumbers[] = {
	new PreemptState(), 
	new PreemptState(1), 
	new PreemptState(2), 
	new PreemptState(3), 
	new PreemptState(4), 
	new PreemptState(5), 
	new PreemptState(6), 
	new PreemptState(7), 
	new PreemptState(8), 
	new PreemptState(9), 
	new PreemptState(10)
    };
    public static final PreemptState none = cNamedNumbers[0];
    public static final PreemptState other = cNamedNumbers[1];
    public static final PreemptState notActive = cNamedNumbers[2];
    public static final PreemptState notActiveWithCall = cNamedNumbers[3];
    public static final PreemptState entryStarted = cNamedNumbers[4];
    public static final PreemptState trackService = cNamedNumbers[5];
    public static final PreemptState dwell = cNamedNumbers[6];
    public static final PreemptState linkActive = cNamedNumbers[7];
    public static final PreemptState existStarted = cNamedNumbers[8];
    public static final PreemptState maximumPresence = cNamedNumbers[9];
    public static final PreemptState ackowledgedButOverridden = cNamedNumbers[10];
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static String cConstantNameList[] = {
	"none",
	"other",
	"notActive",
	"notActiveWithCall",
	"entryStarted",
	"trackService",
	"dwell",
	"linkActive",
	"existStarted",
	"maximumPresence",
	"ackowledgedButOverridden"
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
	return (index < 0 || index >= 11 || cConstantNameList == null) ? null : cConstantNameList[index];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int indexOfValue(long value)
    {
	if (value >= 0 && value <= 10)
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
    
    public static PreemptState valueOf(long value)
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
    public static PreemptState valueAt(int index)
    {
	if (index < 0)
	    throw new IndexOutOfBoundsException();
	else if (index >= 11)
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
    public PreemptState clone() {
	return (PreemptState)super.clone();
    }

    /**
     * Methods for "unknownEnumerator"
     */
    private static final PreemptState cUnknownEnumerator = 
	new PreemptState(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static PreemptState unknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public PreemptState getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
} // End class definition for PreemptState
