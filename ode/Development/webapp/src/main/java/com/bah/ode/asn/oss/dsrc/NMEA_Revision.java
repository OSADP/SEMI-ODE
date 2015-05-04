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
 * Define the ASN1 Type NMEA_Revision from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class NMEA_Revision extends Enumerated {
    
    /**
     * The default constructor.
     */
    private NMEA_Revision()
    {
	super(0);
    }
    
    public NMEA_Revision(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long unknown = 0;
	public static final long reserved = 1;
	public static final long rev1 = 10;
	public static final long rev2 = 20;
	public static final long rev3 = 30;
	public static final long rev4 = 40;
	public static final long rev5 = 50;
	
    }
    // Named list definitions.
    public static final NMEA_Revision unknown =
	new NMEA_Revision();
    public static final NMEA_Revision reserved =
	new NMEA_Revision(1);
    public static final NMEA_Revision rev1 =
	new NMEA_Revision(10);
    public static final NMEA_Revision rev2 =
	new NMEA_Revision(20);
    public static final NMEA_Revision rev3 =
	new NMEA_Revision(30);
    public static final NMEA_Revision rev4 =
	new NMEA_Revision(40);
    public static final NMEA_Revision rev5 =
	new NMEA_Revision(50);
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static NMEA_Revision cNamedNumbers[] = {
	 unknown, 
	 reserved, 
	 rev1, 
	 rev2, 
	 rev3, 
	 rev4, 
	 rev5
    };
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static String cConstantNameList[] = {
	"unknown",
	"reserved",
	"rev1",
	"rev2",
	"rev3",
	"rev4",
	"rev5"
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
	return (index < 0 || index >= 7 || cConstantNameList == null) ? null : cConstantNameList[index];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int indexOfValue(long value)
    {
	return indexOfValue(value, cNamedNumbers, 0, 7);
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static NMEA_Revision valueOf(long value)
    {
	int inx = indexOfValue(value, cNamedNumbers, 0, 7);
	
	if (inx < 0)
	    return null;
	else
	    return cNamedNumbers[inx];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static NMEA_Revision valueAt(int index)
    {
	if (index < 0)
	    throw new IndexOutOfBoundsException();
	else if (index >= 7)
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
	return indexOfValue(mValue, cNamedNumbers, 0, 7);
    }
    
    /**
     * Clone 'this' object.
     */
    public NMEA_Revision clone() {
	return (NMEA_Revision)super.clone();
    }

    /**
     * Methods for "unknownEnumerator"
     */
    private static final NMEA_Revision cUnknownEnumerator = 
	new NMEA_Revision(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static NMEA_Revision unknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public NMEA_Revision getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
} // End class definition for NMEA_Revision
