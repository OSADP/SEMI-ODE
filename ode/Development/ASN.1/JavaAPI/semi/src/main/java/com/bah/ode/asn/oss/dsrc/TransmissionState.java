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
 * Define the ASN1 Type TransmissionState from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class TransmissionState extends Enumerated {
    
    /**
     * The default constructor.
     */
    private TransmissionState()
    {
	super(0);
    }
    
    public TransmissionState(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long neutral = 0;
	public static final long park = 1;
	public static final long forwardGears = 2;
	public static final long reverseGears = 3;
	public static final long reserved1 = 4;
	public static final long reserved2 = 5;
	public static final long reserved3 = 6;
	public static final long unavailable = 7;
	
    }
    // Named list definitions.
    public static final TransmissionState neutral =
	new TransmissionState();
    public static final TransmissionState park =
	new TransmissionState(1);
    public static final TransmissionState forwardGears =
	new TransmissionState(2);
    public static final TransmissionState reverseGears =
	new TransmissionState(3);
    public static final TransmissionState reserved1 =
	new TransmissionState(4);
    public static final TransmissionState reserved2 =
	new TransmissionState(5);
    public static final TransmissionState reserved3 =
	new TransmissionState(6);
    public static final TransmissionState unavailable =
	new TransmissionState(7);
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static TransmissionState cNamedNumbers[] = {
	 neutral, 
	 park, 
	 forwardGears, 
	 reverseGears, 
	 reserved1, 
	 reserved2, 
	 reserved3, 
	 unavailable
    };
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static String cConstantNameList[] = {
	"neutral",
	"park",
	"forwardGears",
	"reverseGears",
	"reserved1",
	"reserved2",
	"reserved3",
	"unavailable"
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
    public static TransmissionState valueOf(long value)
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
    public static TransmissionState valueAt(int index)
    {
	if (index < 0)
	    throw new IndexOutOfBoundsException();
	else if (index >= 8)
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
    public TransmissionState clone() {
	return (TransmissionState)super.clone();
    }

    /**
     * Methods for "unknownEnumerator"
     */
    private static final TransmissionState cUnknownEnumerator = 
	new TransmissionState(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static TransmissionState unknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public TransmissionState getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
} // End class definition for TransmissionState
