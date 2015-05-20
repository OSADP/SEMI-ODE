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
 * Define the ASN1 Type Location_tech from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class Location_tech extends Enumerated {
    
    /**
     * The default constructor.
     */
    private Location_tech()
    {
	super(0);
    }
    
    public Location_tech(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long loc_tech_unknown = 0;
	public static final long loc_tech_GPS = 1;
	public static final long loc_tech_DGPS = 2;
	public static final long loc_tech_drGPS = 3;
	public static final long loc_tech_drDGPS = 4;
	public static final long loc_tech_dr = 5;
	public static final long loc_tech_nav = 6;
	public static final long loc_tech_fault = 31;
	
    }
    // Named list definitions.
    public static final Location_tech loc_tech_unknown =
	new Location_tech();
    public static final Location_tech loc_tech_GPS =
	new Location_tech(1);
    public static final Location_tech loc_tech_DGPS =
	new Location_tech(2);
    public static final Location_tech loc_tech_drGPS =
	new Location_tech(3);
    public static final Location_tech loc_tech_drDGPS =
	new Location_tech(4);
    public static final Location_tech loc_tech_dr =
	new Location_tech(5);
    public static final Location_tech loc_tech_nav =
	new Location_tech(6);
    public static final Location_tech loc_tech_fault =
	new Location_tech(31);
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static Location_tech cNamedNumbers[] = {
	 loc_tech_unknown, 
	 loc_tech_GPS, 
	 loc_tech_DGPS, 
	 loc_tech_drGPS, 
	 loc_tech_drDGPS, 
	 loc_tech_dr, 
	 loc_tech_nav, 
	 loc_tech_fault
    };
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static String cConstantNameList[] = {
	"loc-tech-unknown",
	"loc-tech-GPS",
	"loc-tech-DGPS",
	"loc-tech-drGPS",
	"loc-tech-drDGPS",
	"loc-tech-dr",
	"loc-tech-nav",
	"loc-tech-fault"
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
	if (value >= 0 && value <= 6)
	    return (int)value;
	if (value == 31)
	    return 7;
	else
	    return -1;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static Location_tech valueOf(long value)
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
    public static Location_tech valueAt(int index)
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
    public Location_tech clone() {
	return (Location_tech)super.clone();
    }

    /**
     * Methods for "unknownEnumerator"
     */
    private static final Location_tech cUnknownEnumerator = 
	new Location_tech(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static Location_tech unknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public Location_tech getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
} // End class definition for Location_tech
