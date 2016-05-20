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
 * Define the ASN1 Type GPSstatus from ASN1 Module DSRC.
 * @see BitString
 */

public class GPSstatus extends BitString {
    
    /**
     * The default constructor.
     */
    public GPSstatus()
    {
    }
    
    /**
     * Construct Bit String from a byte array.
     * All bits considered significant.
     * @param value the byte array to set this object to.
     */
    public GPSstatus(byte[] value)
    {
	super(value);
    }
    
    
    /**
     * Construct Bit String from a byte array and significant bits.
     * @param value the byte array to set this object to.
     * @param sigBits the number of significant bits.
     */
    public GPSstatus(byte[] value, int sigBits)
    {
	super(value, sigBits);
    }
    
    // Named list definitions.
    
    public static final int unavailable = 0;
    public static final int isHealthy = 1;
    public static final int isMonitored = 2;
    public static final int baseStationType = 3;
    public static final int aPDOPofUnder5 = 4;
    public static final int inViewOfUnder5 = 5;
    public static final int localCorrectionsPresent = 6;
    public static final int networkCorrectionsPresent = 7;
    
    /**
     * The list of named bits (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public static final MemberList _cBitList_ = 
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "unavailable",
		    0
		),
		new MemberListElement (
		    "isHealthy",
		    1
		),
		new MemberListElement (
		    "isMonitored",
		    2
		),
		new MemberListElement (
		    "baseStationType",
		    3
		),
		new MemberListElement (
		    "aPDOPofUnder5",
		    4
		),
		new MemberListElement (
		    "inViewOfUnder5",
		    5
		),
		new MemberListElement (
		    "localCorrectionsPresent",
		    6
		),
		new MemberListElement (
		    "networkCorrectionsPresent",
		    7
		)
	    }
	);
    
    /**
     * Returns whether the type has a named bit list or has none..
     */
    public boolean hasNamedBits()
    {
	return true;
    }
    
    /**
     * Returns the named bit list for this Bit String type..
     */
    public MemberList getNamedBits()
    {
	return _cBitList_;
    }
    
    /**
     * Clone 'this' object.
     */
    public GPSstatus clone() {
	return (GPSstatus)super.clone();
    }

} // End class definition for GPSstatus
