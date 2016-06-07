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
 * Define the ASN1 Type VehicleStatusDeviceTypeTag from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class VehicleStatusDeviceTypeTag extends Enumerated {
    
    /**
     * The default constructor.
     */
    private VehicleStatusDeviceTypeTag()
    {
	super(0);
    }
    
    public VehicleStatusDeviceTypeTag(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long unknown = 0;
	public static final long lights = 1;
	public static final long wipers = 2;
	public static final long brakes = 3;
	public static final long stab = 4;
	public static final long trac = 5;
	public static final long abs = 6;
	public static final long sunS = 7;
	public static final long rainS = 8;
	public static final long airTemp = 9;
	public static final long steering = 10;
	public static final long vertAccelThres = 11;
	public static final long vertAccel = 12;
	public static final long hozAccelLong = 13;
	public static final long hozAccelLat = 14;
	public static final long hozAccelCon = 15;
	public static final long accel4way = 16;
	public static final long confidenceSet = 17;
	public static final long obDist = 18;
	public static final long obDirect = 19;
	public static final long yaw = 20;
	public static final long yawRateCon = 21;
	public static final long dateTime = 22;
	public static final long fullPos = 23;
	public static final long position2D = 24;
	public static final long position3D = 25;
	public static final long vehicle = 26;
	public static final long speedHeadC = 27;
	public static final long speedC = 28;
	
    }
    // Named list definitions.
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static VehicleStatusDeviceTypeTag cNamedNumbers[] = {
	new VehicleStatusDeviceTypeTag(), 
	new VehicleStatusDeviceTypeTag(1), 
	new VehicleStatusDeviceTypeTag(2), 
	new VehicleStatusDeviceTypeTag(3), 
	new VehicleStatusDeviceTypeTag(4), 
	new VehicleStatusDeviceTypeTag(5), 
	new VehicleStatusDeviceTypeTag(6), 
	new VehicleStatusDeviceTypeTag(7), 
	new VehicleStatusDeviceTypeTag(8), 
	new VehicleStatusDeviceTypeTag(9), 
	new VehicleStatusDeviceTypeTag(10), 
	new VehicleStatusDeviceTypeTag(11), 
	new VehicleStatusDeviceTypeTag(12), 
	new VehicleStatusDeviceTypeTag(13), 
	new VehicleStatusDeviceTypeTag(14), 
	new VehicleStatusDeviceTypeTag(15), 
	new VehicleStatusDeviceTypeTag(16), 
	new VehicleStatusDeviceTypeTag(17), 
	new VehicleStatusDeviceTypeTag(18), 
	new VehicleStatusDeviceTypeTag(19), 
	new VehicleStatusDeviceTypeTag(20), 
	new VehicleStatusDeviceTypeTag(21), 
	new VehicleStatusDeviceTypeTag(22), 
	new VehicleStatusDeviceTypeTag(23), 
	new VehicleStatusDeviceTypeTag(24), 
	new VehicleStatusDeviceTypeTag(25), 
	new VehicleStatusDeviceTypeTag(26), 
	new VehicleStatusDeviceTypeTag(27), 
	new VehicleStatusDeviceTypeTag(28)
    };
    public static final VehicleStatusDeviceTypeTag unknown = cNamedNumbers[0];
    public static final VehicleStatusDeviceTypeTag lights = cNamedNumbers[1];
    public static final VehicleStatusDeviceTypeTag wipers = cNamedNumbers[2];
    public static final VehicleStatusDeviceTypeTag brakes = cNamedNumbers[3];
    public static final VehicleStatusDeviceTypeTag stab = cNamedNumbers[4];
    public static final VehicleStatusDeviceTypeTag trac = cNamedNumbers[5];
    public static final VehicleStatusDeviceTypeTag abs = cNamedNumbers[6];
    public static final VehicleStatusDeviceTypeTag sunS = cNamedNumbers[7];
    public static final VehicleStatusDeviceTypeTag rainS = cNamedNumbers[8];
    public static final VehicleStatusDeviceTypeTag airTemp = cNamedNumbers[9];
    public static final VehicleStatusDeviceTypeTag steering = cNamedNumbers[10];
    public static final VehicleStatusDeviceTypeTag vertAccelThres = cNamedNumbers[11];
    public static final VehicleStatusDeviceTypeTag vertAccel = cNamedNumbers[12];
    public static final VehicleStatusDeviceTypeTag hozAccelLong = cNamedNumbers[13];
    public static final VehicleStatusDeviceTypeTag hozAccelLat = cNamedNumbers[14];
    public static final VehicleStatusDeviceTypeTag hozAccelCon = cNamedNumbers[15];
    public static final VehicleStatusDeviceTypeTag accel4way = cNamedNumbers[16];
    public static final VehicleStatusDeviceTypeTag confidenceSet = cNamedNumbers[17];
    public static final VehicleStatusDeviceTypeTag obDist = cNamedNumbers[18];
    public static final VehicleStatusDeviceTypeTag obDirect = cNamedNumbers[19];
    public static final VehicleStatusDeviceTypeTag yaw = cNamedNumbers[20];
    public static final VehicleStatusDeviceTypeTag yawRateCon = cNamedNumbers[21];
    public static final VehicleStatusDeviceTypeTag dateTime = cNamedNumbers[22];
    public static final VehicleStatusDeviceTypeTag fullPos = cNamedNumbers[23];
    public static final VehicleStatusDeviceTypeTag position2D = cNamedNumbers[24];
    public static final VehicleStatusDeviceTypeTag position3D = cNamedNumbers[25];
    public static final VehicleStatusDeviceTypeTag vehicle = cNamedNumbers[26];
    public static final VehicleStatusDeviceTypeTag speedHeadC = cNamedNumbers[27];
    public static final VehicleStatusDeviceTypeTag speedC = cNamedNumbers[28];
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static String cConstantNameList[] = {
	"unknown",
	"lights",
	"wipers",
	"brakes",
	"stab",
	"trac",
	"abs",
	"sunS",
	"rainS",
	"airTemp",
	"steering",
	"vertAccelThres",
	"vertAccel",
	"hozAccelLong",
	"hozAccelLat",
	"hozAccelCon",
	"accel4way",
	"confidenceSet",
	"obDist",
	"obDirect",
	"yaw",
	"yawRateCon",
	"dateTime",
	"fullPos",
	"position2D",
	"position3D",
	"vehicle",
	"speedHeadC",
	"speedC"
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
	return (index < 0 || index >= 29 || cConstantNameList == null) ? null : cConstantNameList[index];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int indexOfValue(long value)
    {
	if (value >= 0 && value <= 28)
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
    
    public static VehicleStatusDeviceTypeTag valueOf(long value)
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
    public static VehicleStatusDeviceTypeTag valueAt(int index)
    {
	if (index < 0)
	    throw new IndexOutOfBoundsException();
	else if (index >= 29)
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
    public VehicleStatusDeviceTypeTag clone() {
	return (VehicleStatusDeviceTypeTag)super.clone();
    }

    /**
     * Methods for "unknownEnumerator"
     */
    private static final VehicleStatusDeviceTypeTag cUnknownEnumerator = 
	new VehicleStatusDeviceTypeTag(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static VehicleStatusDeviceTypeTag unknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public VehicleStatusDeviceTypeTag getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
} // End class definition for VehicleStatusDeviceTypeTag
