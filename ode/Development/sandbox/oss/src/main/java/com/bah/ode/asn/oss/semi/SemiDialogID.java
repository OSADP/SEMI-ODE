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
/* Created: Tue Mar 24 11:33:39 2015 */
/* ASN.1 Compiler for Java version: 6.1 */
/* ASN.1 compiler options and file names specified:
 * -toed -output com.bah.ode.asn.oss -per -uper -ber -der -root -messageFormat
 * msvc C:/Users/572682/Projects/ODE/Trials/ASN.1/DSRC_R36_Source.asn
 * C:/Users/572682/Projects/ODE/Trials/ASN.1/SEMI_ASN.1_Structures_2.2.asn
 */


package com.bah.ode.asn.oss.semi;

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
 * Define the ASN1 Type SemiDialogID from ASN1 Module SEMI.
 * @see Enumerated
 */

public final class SemiDialogID extends Enumerated {
    
    /**
     * The default constructor.
     */
    private SemiDialogID()
    {
	super(154);
    }
    
    public SemiDialogID(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long vehSitData = 154;
	public static final long dataSubscription = 155;
	public static final long advSitDataDep = 156;
	public static final long advSitDatDist = 157;
	public static final long reserved1 = 158;
	public static final long reserved2 = 159;
	public static final long objReg = 160;
	public static final long objDisc = 161;
	public static final long intersectionSitDataDep = 162;
	public static final long intersectionSitDataQuery = 163;
	
    }
    // Named list definitions.
    public static final SemiDialogID vehSitData =
	new SemiDialogID();
    public static final SemiDialogID dataSubscription =
	new SemiDialogID(155);
    public static final SemiDialogID advSitDataDep =
	new SemiDialogID(156);
    public static final SemiDialogID advSitDatDist =
	new SemiDialogID(157);
    public static final SemiDialogID reserved1 =
	new SemiDialogID(158);
    public static final SemiDialogID reserved2 =
	new SemiDialogID(159);
    public static final SemiDialogID objReg =
	new SemiDialogID(160);
    public static final SemiDialogID objDisc =
	new SemiDialogID(161);
    public static final SemiDialogID intersectionSitDataDep =
	new SemiDialogID(162);
    public static final SemiDialogID intersectionSitDataQuery =
	new SemiDialogID(163);
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static SemiDialogID cNamedNumbers[] = {
	 vehSitData, 
	 dataSubscription, 
	 advSitDataDep, 
	 advSitDatDist, 
	 reserved1, 
	 reserved2, 
	 objReg, 
	 objDisc, 
	 intersectionSitDataDep, 
	 intersectionSitDataQuery
    };
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static String cConstantNameList[] = {
	"vehSitData",
	"dataSubscription",
	"advSitDataDep",
	"advSitDatDist",
	"reserved1",
	"reserved2",
	"objReg",
	"objDisc",
	"intersectionSitDataDep",
	"intersectionSitDataQuery"
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
	if (value >= 154 && value <= 163)
	    return (int)(value - 154);
	else
	    return -1;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static SemiDialogID valueOf(long value)
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
    public static SemiDialogID valueAt(int index)
    {
	if (index < 0)
	    throw new IndexOutOfBoundsException();
	else if (index >= 10)
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
    public SemiDialogID clone() {
	return (SemiDialogID)super.clone();
    }

    /**
     * Methods for "unknownEnumerator"
     */
    private static final SemiDialogID cUnknownEnumerator = 
	new SemiDialogID(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static SemiDialogID unknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public SemiDialogID getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
} // End class definition for SemiDialogID
