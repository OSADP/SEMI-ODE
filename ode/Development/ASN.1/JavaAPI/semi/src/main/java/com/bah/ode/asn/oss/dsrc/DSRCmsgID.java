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
 * Define the ASN1 Type DSRCmsgID from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class DSRCmsgID extends Enumerated {
    
    /**
     * The default constructor.
     */
    private DSRCmsgID()
    {
	super(0);
    }
    
    public DSRCmsgID(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long reserved = 0;
	public static final long alaCarteMessage = 1;
	public static final long basicSafetyMessage = 2;
	public static final long basicSafetyMessageVerbose = 3;
	public static final long commonSafetyRequest = 4;
	public static final long emergencyVehicleAlert = 5;
	public static final long intersectionCollisionAlert = 6;
	public static final long mapData = 7;
	public static final long nmeaCorrections = 8;
	public static final long probeDataManagement = 9;
	public static final long probeVehicleData = 10;
	public static final long roadSideAlert = 11;
	public static final long rtcmCorrections = 12;
	public static final long signalPhaseAndTimingMessage = 13;
	public static final long signalRequestMessage = 14;
	public static final long signalStatusMessage = 15;
	public static final long travelerInformation = 16;
	
    }
    // Named list definitions.
    public static final DSRCmsgID reserved =
	new DSRCmsgID();
    public static final DSRCmsgID alaCarteMessage =
	new DSRCmsgID(1);
    public static final DSRCmsgID basicSafetyMessage =
	new DSRCmsgID(2);
    public static final DSRCmsgID basicSafetyMessageVerbose =
	new DSRCmsgID(3);
    public static final DSRCmsgID commonSafetyRequest =
	new DSRCmsgID(4);
    public static final DSRCmsgID emergencyVehicleAlert =
	new DSRCmsgID(5);
    public static final DSRCmsgID intersectionCollisionAlert =
	new DSRCmsgID(6);
    public static final DSRCmsgID mapData =
	new DSRCmsgID(7);
    public static final DSRCmsgID nmeaCorrections =
	new DSRCmsgID(8);
    public static final DSRCmsgID probeDataManagement =
	new DSRCmsgID(9);
    public static final DSRCmsgID probeVehicleData =
	new DSRCmsgID(10);
    public static final DSRCmsgID roadSideAlert =
	new DSRCmsgID(11);
    public static final DSRCmsgID rtcmCorrections =
	new DSRCmsgID(12);
    public static final DSRCmsgID signalPhaseAndTimingMessage =
	new DSRCmsgID(13);
    public static final DSRCmsgID signalRequestMessage =
	new DSRCmsgID(14);
    public static final DSRCmsgID signalStatusMessage =
	new DSRCmsgID(15);
    public static final DSRCmsgID travelerInformation =
	new DSRCmsgID(16);
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static DSRCmsgID cNamedNumbers[] = {
	 reserved, 
	 alaCarteMessage, 
	 basicSafetyMessage, 
	 basicSafetyMessageVerbose, 
	 commonSafetyRequest, 
	 emergencyVehicleAlert, 
	 intersectionCollisionAlert, 
	 mapData, 
	 nmeaCorrections, 
	 probeDataManagement, 
	 probeVehicleData, 
	 roadSideAlert, 
	 rtcmCorrections, 
	 signalPhaseAndTimingMessage, 
	 signalRequestMessage, 
	 signalStatusMessage, 
	 travelerInformation
    };
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static String cConstantNameList[] = {
	"reserved",
	"alaCarteMessage",
	"basicSafetyMessage",
	"basicSafetyMessageVerbose",
	"commonSafetyRequest",
	"emergencyVehicleAlert",
	"intersectionCollisionAlert",
	"mapData",
	"nmeaCorrections",
	"probeDataManagement",
	"probeVehicleData",
	"roadSideAlert",
	"rtcmCorrections",
	"signalPhaseAndTimingMessage",
	"signalRequestMessage",
	"signalStatusMessage",
	"travelerInformation"
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
	if (value >= 0 && value <= 16)
	    return (int)value;
	else
	    return -1;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static DSRCmsgID valueOf(long value)
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
    public static DSRCmsgID valueAt(int index)
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
    public DSRCmsgID clone() {
	return (DSRCmsgID)super.clone();
    }

    /**
     * Methods for "unknownEnumerator"
     */
    private static final DSRCmsgID cUnknownEnumerator = 
	new DSRCmsgID(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static DSRCmsgID unknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public DSRCmsgID getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
} // End class definition for DSRCmsgID
