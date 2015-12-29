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
 * Define the ASN1 Type CrosswalkLaneAttributes from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class CrosswalkLaneAttributes extends Enumerated {
    
    /**
     * The default constructor.
     */
    private CrosswalkLaneAttributes()
    {
	super(0);
    }
    
    public CrosswalkLaneAttributes(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long noData = 0;
	public static final long twoWayPath = 1;
	public static final long pedestrianCrosswalk = 2;
	public static final long bikeLane = 4;
	public static final long railRoadTrackPresent = 8;
	public static final long oneWayPathOfTravel = 16;
	public static final long pedestrianCrosswalkTypeA = 32;
	public static final long pedestrianCrosswalkTypeB = 64;
	public static final long pedestrianCrosswalkTypeC = 128;
    }
    // Named list definitions.
    public static final CrosswalkLaneAttributes noData =
	new CrosswalkLaneAttributes();
    public static final CrosswalkLaneAttributes twoWayPath =
	new CrosswalkLaneAttributes(1);
    public static final CrosswalkLaneAttributes pedestrianCrosswalk =
	new CrosswalkLaneAttributes(2);
    public static final CrosswalkLaneAttributes bikeLane =
	new CrosswalkLaneAttributes(4);
    public static final CrosswalkLaneAttributes railRoadTrackPresent =
	new CrosswalkLaneAttributes(8);
    public static final CrosswalkLaneAttributes oneWayPathOfTravel =
	new CrosswalkLaneAttributes(16);
    public static final CrosswalkLaneAttributes pedestrianCrosswalkTypeA =
	new CrosswalkLaneAttributes(32);
    public static final CrosswalkLaneAttributes pedestrianCrosswalkTypeB =
	new CrosswalkLaneAttributes(64);
    public static final CrosswalkLaneAttributes pedestrianCrosswalkTypeC =
	new CrosswalkLaneAttributes(128);
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static CrosswalkLaneAttributes cNamedNumbers[] = {
	 noData, 
	 twoWayPath, 
	 pedestrianCrosswalk, 
	 bikeLane, 
	 railRoadTrackPresent, 
	 oneWayPathOfTravel, 
	 pedestrianCrosswalkTypeA, 
	 pedestrianCrosswalkTypeB, 
	 pedestrianCrosswalkTypeC
    };
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static String cConstantNameList[] = {
	"noData",
	"twoWayPath",
	"pedestrianCrosswalk",
	"bikeLane",
	"railRoadTrackPresent",
	"oneWayPathOfTravel",
	"pedestrianCrosswalkTypeA",
	"pedestrianCrosswalkTypeB",
	"pedestrianCrosswalkTypeC"
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
	return (index < 0 || index >= 9 || cConstantNameList == null) ? null : cConstantNameList[index];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int indexOfValue(long value)
    {
	return indexOfValue(value, cNamedNumbers, 0, 9);
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static CrosswalkLaneAttributes valueOf(long value)
    {
	int inx = indexOfValue(value, cNamedNumbers, 0, 9);
	
	if (inx < 0)
	    return null;
	else
	    return cNamedNumbers[inx];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static CrosswalkLaneAttributes valueAt(int index)
    {
	if (index < 0 || index >= 9)
	    throw new IndexOutOfBoundsException();
	
	return cNamedNumbers[index];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int indexOf()
    {
	return indexOfValue(mValue, cNamedNumbers, 0, 9);
    }
    
    /**
     * Clone 'this' object.
     */
    public CrosswalkLaneAttributes clone() {
	return (CrosswalkLaneAttributes)super.clone();
    }

} // End class definition for CrosswalkLaneAttributes
