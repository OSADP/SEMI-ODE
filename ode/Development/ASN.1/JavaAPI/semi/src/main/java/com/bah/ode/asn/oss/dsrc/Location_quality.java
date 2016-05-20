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
 * Define the ASN1 Type Location_quality from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class Location_quality extends Enumerated {
    
    /**
     * The default constructor.
     */
    private Location_quality()
    {
	super(0);
    }
    
    public Location_quality(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long loc_qual_bt1m = 0;
	public static final long loc_qual_bt5m = 1;
	public static final long loc_qual_bt12m = 2;
	public static final long loc_qual_bt50m = 3;
	public static final long loc_qual_bt125m = 4;
	public static final long loc_qual_bt500m = 5;
	public static final long loc_qual_bt1250m = 6;
	public static final long loc_qual_unknown = 7;
    }
    // Named list definitions.
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static Location_quality cNamedNumbers[] = {
	new Location_quality(), 
	new Location_quality(1), 
	new Location_quality(2), 
	new Location_quality(3), 
	new Location_quality(4), 
	new Location_quality(5), 
	new Location_quality(6), 
	new Location_quality(7)
    };
    public static final Location_quality loc_qual_bt1m = cNamedNumbers[0];
    public static final Location_quality loc_qual_bt5m = cNamedNumbers[1];
    public static final Location_quality loc_qual_bt12m = cNamedNumbers[2];
    public static final Location_quality loc_qual_bt50m = cNamedNumbers[3];
    public static final Location_quality loc_qual_bt125m = cNamedNumbers[4];
    public static final Location_quality loc_qual_bt500m = cNamedNumbers[5];
    public static final Location_quality loc_qual_bt1250m = cNamedNumbers[6];
    public static final Location_quality loc_qual_unknown = cNamedNumbers[7];
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static String cConstantNameList[] = {
	"loc-qual-bt1m",
	"loc-qual-bt5m",
	"loc-qual-bt12m",
	"loc-qual-bt50m",
	"loc-qual-bt125m",
	"loc-qual-bt500m",
	"loc-qual-bt1250m",
	"loc-qual-unknown"
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
     * Returns the enumerator with the specified value or null if the value
     * is not associated with any enumerator.
     *  @param value The value of the enumerator to return.
     *  @return The enumerator with the specified value.
     */
    
    public static Location_quality valueOf(long value)
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
    public static Location_quality valueAt(int index)
    {
	if (index < 0 || index >= 8)
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
    public Location_quality clone() {
	return (Location_quality)super.clone();
    }

} // End class definition for Location_quality
