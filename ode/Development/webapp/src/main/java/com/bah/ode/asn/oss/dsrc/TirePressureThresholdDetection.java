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
 * Define the ASN1 Type TirePressureThresholdDetection from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class TirePressureThresholdDetection extends Enumerated {
    
    /**
     * The default constructor.
     */
    private TirePressureThresholdDetection()
    {
	super(0);
    }
    
    public TirePressureThresholdDetection(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long noData = 0;
	public static final long overPressure = 1;
	public static final long noWarningPressure = 2;
	public static final long underPressure = 3;
	public static final long extremeUnderPressure = 4;
	public static final long undefined = 5;
	public static final long errorIndicator = 6;
	public static final long notAvailable = 7;
	
    }
    // Named list definitions.
    public static final TirePressureThresholdDetection noData =
	new TirePressureThresholdDetection();
    public static final TirePressureThresholdDetection overPressure =
	new TirePressureThresholdDetection(1);
    public static final TirePressureThresholdDetection noWarningPressure =
	new TirePressureThresholdDetection(2);
    public static final TirePressureThresholdDetection underPressure =
	new TirePressureThresholdDetection(3);
    public static final TirePressureThresholdDetection extremeUnderPressure =
	new TirePressureThresholdDetection(4);
    public static final TirePressureThresholdDetection undefined =
	new TirePressureThresholdDetection(5);
    public static final TirePressureThresholdDetection errorIndicator =
	new TirePressureThresholdDetection(6);
    public static final TirePressureThresholdDetection notAvailable =
	new TirePressureThresholdDetection(7);
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static TirePressureThresholdDetection cNamedNumbers[] = {
	 noData, 
	 overPressure, 
	 noWarningPressure, 
	 underPressure, 
	 extremeUnderPressure, 
	 undefined, 
	 errorIndicator, 
	 notAvailable
    };
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static String cConstantNameList[] = {
	"noData",
	"overPressure",
	"noWarningPressure",
	"underPressure",
	"extremeUnderPressure",
	"undefined",
	"errorIndicator",
	"notAvailable"
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
    public static TirePressureThresholdDetection valueOf(long value)
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
    public static TirePressureThresholdDetection valueAt(int index)
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
    public TirePressureThresholdDetection clone() {
	return (TirePressureThresholdDetection)super.clone();
    }

    /**
     * Methods for "unknownEnumerator"
     */
    private static final TirePressureThresholdDetection cUnknownEnumerator = 
	new TirePressureThresholdDetection(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static TirePressureThresholdDetection unknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public TirePressureThresholdDetection getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
} // End class definition for TirePressureThresholdDetection
