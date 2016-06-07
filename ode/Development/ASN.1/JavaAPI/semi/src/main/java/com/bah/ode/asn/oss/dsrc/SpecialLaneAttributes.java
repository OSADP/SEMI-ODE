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
/* Created: Tue Jun 07 13:54:40 2016 */
/* ASN.1 Compiler for Java version: 6.3 */
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
 * Define the ASN1 Type SpecialLaneAttributes from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class SpecialLaneAttributes extends Enumerated {
    
    /**
     * The default constructor.
     */
    private SpecialLaneAttributes()
    {
	super(0);
    }
    
    public SpecialLaneAttributes(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long noData = 0;
	public static final long egressPath = 1;
	public static final long railRoadTrack = 2;
	public static final long transitOnlyLane = 4;
	public static final long hovLane = 8;
	public static final long busOnly = 16;
	public static final long vehiclesEntering = 32;
	public static final long vehiclesLeaving = 64;
	public static final long reserved = 128;
    }
    // Named list definitions.
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static SpecialLaneAttributes cNamedNumbers[] = {
	new SpecialLaneAttributes(), 
	new SpecialLaneAttributes(1), 
	new SpecialLaneAttributes(2), 
	new SpecialLaneAttributes(4), 
	new SpecialLaneAttributes(8), 
	new SpecialLaneAttributes(16), 
	new SpecialLaneAttributes(32), 
	new SpecialLaneAttributes(64), 
	new SpecialLaneAttributes(128)
    };
    public static final SpecialLaneAttributes noData = cNamedNumbers[0];
    public static final SpecialLaneAttributes egressPath = cNamedNumbers[1];
    public static final SpecialLaneAttributes railRoadTrack = cNamedNumbers[2];
    public static final SpecialLaneAttributes transitOnlyLane = cNamedNumbers[3];
    public static final SpecialLaneAttributes hovLane = cNamedNumbers[4];
    public static final SpecialLaneAttributes busOnly = cNamedNumbers[5];
    public static final SpecialLaneAttributes vehiclesEntering = cNamedNumbers[6];
    public static final SpecialLaneAttributes vehiclesLeaving = cNamedNumbers[7];
    public static final SpecialLaneAttributes reserved = cNamedNumbers[8];
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static String cConstantNameList[] = {
	"noData",
	"egressPath",
	"railRoadTrack",
	"transitOnlyLane",
	"hovLane",
	"busOnly",
	"vehiclesEntering",
	"vehiclesLeaving",
	"reserved"
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
     * Returns the enumerator with the specified value or null if the value
     * is not associated with any enumerator.
     *  @param value The value of the enumerator to return.
     *  @return The enumerator with the specified value.
     */
    
    public static SpecialLaneAttributes valueOf(long value)
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
    public static SpecialLaneAttributes valueAt(int index)
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
    public SpecialLaneAttributes clone() {
	return (SpecialLaneAttributes)super.clone();
    }

} // End class definition for SpecialLaneAttributes
