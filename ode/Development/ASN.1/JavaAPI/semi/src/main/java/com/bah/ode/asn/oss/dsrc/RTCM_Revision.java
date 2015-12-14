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
/* Created: Mon Dec 14 18:10:04 2015 */
/* ASN.1 Compiler for Java version: 6.2 */
/* ASN.1 compiler options and file names specified:
 * -toed -output com.bah.ode.asn.oss -per -uper -ber -der -root
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
import com.oss.coders.OutputBitStream;
import com.oss.coders.per.PEREncodable;
import com.oss.coders.InputBitStream;
import com.oss.coders.per.PERDecodable;
import com.oss.coders.per.PerCoder;

/**
 * Define the ASN1 Type RTCM_Revision from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class RTCM_Revision extends Enumerated {
    
    /**
     * The default constructor.
     */
    private RTCM_Revision()
    {
	super(0);
    }
    
    public RTCM_Revision(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long unknown = 0;
	public static final long reserved = 1;
	public static final long rtcmCMR = 2;
	public static final long rtcmCMR_Plus = 3;
	public static final long rtcmSAPOS = 4;
	public static final long rtcmSAPOS_Adv = 5;
	public static final long rtcmRTCA = 6;
	public static final long rtcmRAW = 7;
	public static final long rtcmRINEX = 8;
	public static final long rtcmSP3 = 9;
	public static final long rtcmBINEX = 10;
	public static final long rtcmRev2_x = 19;
	public static final long rtcmRev2_0 = 20;
	public static final long rtcmRev2_1 = 21;
	public static final long rtcmRev2_3 = 23;
	public static final long rtcmRev3_0 = 30;
	public static final long rtcmRev3_1 = 31;
	
    }
    // Named list definitions.
    public static final RTCM_Revision unknown =
	new RTCM_Revision();
    public static final RTCM_Revision reserved =
	new RTCM_Revision(1);
    public static final RTCM_Revision rtcmCMR =
	new RTCM_Revision(2);
    public static final RTCM_Revision rtcmCMR_Plus =
	new RTCM_Revision(3);
    public static final RTCM_Revision rtcmSAPOS =
	new RTCM_Revision(4);
    public static final RTCM_Revision rtcmSAPOS_Adv =
	new RTCM_Revision(5);
    public static final RTCM_Revision rtcmRTCA =
	new RTCM_Revision(6);
    public static final RTCM_Revision rtcmRAW =
	new RTCM_Revision(7);
    public static final RTCM_Revision rtcmRINEX =
	new RTCM_Revision(8);
    public static final RTCM_Revision rtcmSP3 =
	new RTCM_Revision(9);
    public static final RTCM_Revision rtcmBINEX =
	new RTCM_Revision(10);
    public static final RTCM_Revision rtcmRev2_x =
	new RTCM_Revision(19);
    public static final RTCM_Revision rtcmRev2_0 =
	new RTCM_Revision(20);
    public static final RTCM_Revision rtcmRev2_1 =
	new RTCM_Revision(21);
    public static final RTCM_Revision rtcmRev2_3 =
	new RTCM_Revision(23);
    public static final RTCM_Revision rtcmRev3_0 =
	new RTCM_Revision(30);
    public static final RTCM_Revision rtcmRev3_1 =
	new RTCM_Revision(31);
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static RTCM_Revision cNamedNumbers[] = {
	 unknown, 
	 reserved, 
	 rtcmCMR, 
	 rtcmCMR_Plus, 
	 rtcmSAPOS, 
	 rtcmSAPOS_Adv, 
	 rtcmRTCA, 
	 rtcmRAW, 
	 rtcmRINEX, 
	 rtcmSP3, 
	 rtcmBINEX, 
	 rtcmRev2_x, 
	 rtcmRev2_0, 
	 rtcmRev2_1, 
	 rtcmRev2_3, 
	 rtcmRev3_0, 
	 rtcmRev3_1
    };
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static String cConstantNameList[] = {
	"unknown",
	"reserved",
	"rtcmCMR",
	"rtcmCMR-Plus",
	"rtcmSAPOS",
	"rtcmSAPOS-Adv",
	"rtcmRTCA",
	"rtcmRAW",
	"rtcmRINEX",
	"rtcmSP3",
	"rtcmBINEX",
	"rtcmRev2-x",
	"rtcmRev2-0",
	"rtcmRev2-1",
	"rtcmRev2-3",
	"rtcmRev3-0",
	"rtcmRev3-1"
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
	return (index < 0 || index >= 17 || cConstantNameList == null) ? null : cConstantNameList[index];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int indexOfValue(long value)
    {
	if (value >= 0 && value <= 10)
	    return (int)value;
	if (value >= 19 && value <= 21)
	    return (int)(value - 8);
	if (value == 23)
	    return 14;
	if (value >= 30 && value <= 31)
	    return (int)(value - 15);
	else
	    return -1;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static RTCM_Revision valueOf(long value)
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
    public static RTCM_Revision valueAt(int index)
    {
	if (index < 0)
	    throw new IndexOutOfBoundsException();
	else if (index >= 17)
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
    public RTCM_Revision clone() {
	return (RTCM_Revision)super.clone();
    }

    /**
     * Methods for "unknownEnumerator"
     */
    private static final RTCM_Revision cUnknownEnumerator = 
	new RTCM_Revision(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static RTCM_Revision unknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public RTCM_Revision getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
} // End class definition for RTCM_Revision
