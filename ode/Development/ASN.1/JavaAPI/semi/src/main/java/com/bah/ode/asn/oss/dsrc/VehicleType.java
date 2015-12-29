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
/* Created: Tue Dec 22 00:38:27 2015 */
/* ASN.1 Compiler for Java version: 6.2 */
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
 * Define the ASN1 Type VehicleType from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class VehicleType extends Enumerated {
    
    /**
     * The default constructor.
     */
    private VehicleType()
    {
	super(0);
    }
    
    public VehicleType(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long none = 0;
	public static final long unknown = 1;
	public static final long special = 2;
	public static final long moto = 3;
	public static final long car = 4;
	public static final long carOther = 5;
	public static final long bus = 6;
	public static final long axleCnt2 = 7;
	public static final long axleCnt3 = 8;
	public static final long axleCnt4 = 9;
	public static final long axleCnt4Trailer = 10;
	public static final long axleCnt5Trailer = 11;
	public static final long axleCnt6Trailer = 12;
	public static final long axleCnt5MultiTrailer = 13;
	public static final long axleCnt6MultiTrailer = 14;
	public static final long axleCnt7MultiTrailer = 15;
	
    }
    // Named list definitions.
    public static final VehicleType none =
	new VehicleType();
    public static final VehicleType unknown =
	new VehicleType(1);
    public static final VehicleType special =
	new VehicleType(2);
    public static final VehicleType moto =
	new VehicleType(3);
    public static final VehicleType car =
	new VehicleType(4);
    public static final VehicleType carOther =
	new VehicleType(5);
    public static final VehicleType bus =
	new VehicleType(6);
    public static final VehicleType axleCnt2 =
	new VehicleType(7);
    public static final VehicleType axleCnt3 =
	new VehicleType(8);
    public static final VehicleType axleCnt4 =
	new VehicleType(9);
    public static final VehicleType axleCnt4Trailer =
	new VehicleType(10);
    public static final VehicleType axleCnt5Trailer =
	new VehicleType(11);
    public static final VehicleType axleCnt6Trailer =
	new VehicleType(12);
    public static final VehicleType axleCnt5MultiTrailer =
	new VehicleType(13);
    public static final VehicleType axleCnt6MultiTrailer =
	new VehicleType(14);
    public static final VehicleType axleCnt7MultiTrailer =
	new VehicleType(15);
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static VehicleType cNamedNumbers[] = {
	 none, 
	 unknown, 
	 special, 
	 moto, 
	 car, 
	 carOther, 
	 bus, 
	 axleCnt2, 
	 axleCnt3, 
	 axleCnt4, 
	 axleCnt4Trailer, 
	 axleCnt5Trailer, 
	 axleCnt6Trailer, 
	 axleCnt5MultiTrailer, 
	 axleCnt6MultiTrailer, 
	 axleCnt7MultiTrailer
    };
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static String cConstantNameList[] = {
	"none",
	"unknown",
	"special",
	"moto",
	"car",
	"carOther",
	"bus",
	"axleCnt2",
	"axleCnt3",
	"axleCnt4",
	"axleCnt4Trailer",
	"axleCnt5Trailer",
	"axleCnt6Trailer",
	"axleCnt5MultiTrailer",
	"axleCnt6MultiTrailer",
	"axleCnt7MultiTrailer"
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
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static VehicleType valueOf(long value)
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
    public static VehicleType valueAt(int index)
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
    public VehicleType clone() {
	return (VehicleType)super.clone();
    }

    /**
     * Methods for "unknownEnumerator"
     */
    private static final VehicleType cUnknownEnumerator = 
	new VehicleType(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static VehicleType unknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public VehicleType getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
} // End class definition for VehicleType
