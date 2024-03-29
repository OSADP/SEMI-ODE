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
 * Define the ASN1 Type TimeConfidence from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class TimeConfidence extends Enumerated {
    
    /**
     * The default constructor.
     */
    private TimeConfidence()
    {
	super(0);
    }
    
    public TimeConfidence(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long unavailable = 0;
	public static final long time_100_000 = 1;
	public static final long time_050_000 = 2;
	public static final long time_020_000 = 3;
	public static final long time_010_000 = 4;
	public static final long time_002_000 = 5;
	public static final long time_001_000 = 6;
	public static final long time_000_500 = 7;
	public static final long time_000_200 = 8;
	public static final long time_000_100 = 9;
	public static final long time_000_050 = 10;
	public static final long time_000_020 = 11;
	public static final long time_000_010 = 12;
	public static final long time_000_005 = 13;
	public static final long time_000_002 = 14;
	public static final long time_000_001 = 15;
	public static final long time_000_000_5 = 16;
	public static final long time_000_000_2 = 17;
	public static final long time_000_000_1 = 18;
	public static final long time_000_000_05 = 19;
	public static final long time_000_000_02 = 20;
	public static final long time_000_000_01 = 21;
	public static final long time_000_000_005 = 22;
	public static final long time_000_000_002 = 23;
	public static final long time_000_000_001 = 24;
	public static final long time_000_000_000_5 = 25;
	public static final long time_000_000_000_2 = 26;
	public static final long time_000_000_000_1 = 27;
	public static final long time_000_000_000_05 = 28;
	public static final long time_000_000_000_02 = 29;
	public static final long time_000_000_000_01 = 30;
	public static final long time_000_000_000_005 = 31;
	public static final long time_000_000_000_002 = 32;
	public static final long time_000_000_000_001 = 33;
	public static final long time_000_000_000_000_5 = 34;
	public static final long time_000_000_000_000_2 = 35;
	public static final long time_000_000_000_000_1 = 36;
	public static final long time_000_000_000_000_05 = 37;
	public static final long time_000_000_000_000_02 = 38;
	public static final long time_000_000_000_000_01 = 39;
    }
    // Named list definitions.
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static TimeConfidence cNamedNumbers[] = {
	new TimeConfidence(), 
	new TimeConfidence(1), 
	new TimeConfidence(2), 
	new TimeConfidence(3), 
	new TimeConfidence(4), 
	new TimeConfidence(5), 
	new TimeConfidence(6), 
	new TimeConfidence(7), 
	new TimeConfidence(8), 
	new TimeConfidence(9), 
	new TimeConfidence(10), 
	new TimeConfidence(11), 
	new TimeConfidence(12), 
	new TimeConfidence(13), 
	new TimeConfidence(14), 
	new TimeConfidence(15), 
	new TimeConfidence(16), 
	new TimeConfidence(17), 
	new TimeConfidence(18), 
	new TimeConfidence(19), 
	new TimeConfidence(20), 
	new TimeConfidence(21), 
	new TimeConfidence(22), 
	new TimeConfidence(23), 
	new TimeConfidence(24), 
	new TimeConfidence(25), 
	new TimeConfidence(26), 
	new TimeConfidence(27), 
	new TimeConfidence(28), 
	new TimeConfidence(29), 
	new TimeConfidence(30), 
	new TimeConfidence(31), 
	new TimeConfidence(32), 
	new TimeConfidence(33), 
	new TimeConfidence(34), 
	new TimeConfidence(35), 
	new TimeConfidence(36), 
	new TimeConfidence(37), 
	new TimeConfidence(38), 
	new TimeConfidence(39)
    };
    public static final TimeConfidence unavailable = cNamedNumbers[0];
    public static final TimeConfidence time_100_000 = cNamedNumbers[1];
    public static final TimeConfidence time_050_000 = cNamedNumbers[2];
    public static final TimeConfidence time_020_000 = cNamedNumbers[3];
    public static final TimeConfidence time_010_000 = cNamedNumbers[4];
    public static final TimeConfidence time_002_000 = cNamedNumbers[5];
    public static final TimeConfidence time_001_000 = cNamedNumbers[6];
    public static final TimeConfidence time_000_500 = cNamedNumbers[7];
    public static final TimeConfidence time_000_200 = cNamedNumbers[8];
    public static final TimeConfidence time_000_100 = cNamedNumbers[9];
    public static final TimeConfidence time_000_050 = cNamedNumbers[10];
    public static final TimeConfidence time_000_020 = cNamedNumbers[11];
    public static final TimeConfidence time_000_010 = cNamedNumbers[12];
    public static final TimeConfidence time_000_005 = cNamedNumbers[13];
    public static final TimeConfidence time_000_002 = cNamedNumbers[14];
    public static final TimeConfidence time_000_001 = cNamedNumbers[15];
    public static final TimeConfidence time_000_000_5 = cNamedNumbers[16];
    public static final TimeConfidence time_000_000_2 = cNamedNumbers[17];
    public static final TimeConfidence time_000_000_1 = cNamedNumbers[18];
    public static final TimeConfidence time_000_000_05 = cNamedNumbers[19];
    public static final TimeConfidence time_000_000_02 = cNamedNumbers[20];
    public static final TimeConfidence time_000_000_01 = cNamedNumbers[21];
    public static final TimeConfidence time_000_000_005 = cNamedNumbers[22];
    public static final TimeConfidence time_000_000_002 = cNamedNumbers[23];
    public static final TimeConfidence time_000_000_001 = cNamedNumbers[24];
    public static final TimeConfidence time_000_000_000_5 = cNamedNumbers[25];
    public static final TimeConfidence time_000_000_000_2 = cNamedNumbers[26];
    public static final TimeConfidence time_000_000_000_1 = cNamedNumbers[27];
    public static final TimeConfidence time_000_000_000_05 = cNamedNumbers[28];
    public static final TimeConfidence time_000_000_000_02 = cNamedNumbers[29];
    public static final TimeConfidence time_000_000_000_01 = cNamedNumbers[30];
    public static final TimeConfidence time_000_000_000_005 = cNamedNumbers[31];
    public static final TimeConfidence time_000_000_000_002 = cNamedNumbers[32];
    public static final TimeConfidence time_000_000_000_001 = cNamedNumbers[33];
    public static final TimeConfidence time_000_000_000_000_5 = cNamedNumbers[34];
    public static final TimeConfidence time_000_000_000_000_2 = cNamedNumbers[35];
    public static final TimeConfidence time_000_000_000_000_1 = cNamedNumbers[36];
    public static final TimeConfidence time_000_000_000_000_05 = cNamedNumbers[37];
    public static final TimeConfidence time_000_000_000_000_02 = cNamedNumbers[38];
    public static final TimeConfidence time_000_000_000_000_01 = cNamedNumbers[39];
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static String cConstantNameList[] = {
	"unavailable",
	"time-100-000",
	"time-050-000",
	"time-020-000",
	"time-010-000",
	"time-002-000",
	"time-001-000",
	"time-000-500",
	"time-000-200",
	"time-000-100",
	"time-000-050",
	"time-000-020",
	"time-000-010",
	"time-000-005",
	"time-000-002",
	"time-000-001",
	"time-000-000-5",
	"time-000-000-2",
	"time-000-000-1",
	"time-000-000-05",
	"time-000-000-02",
	"time-000-000-01",
	"time-000-000-005",
	"time-000-000-002",
	"time-000-000-001",
	"time-000-000-000-5",
	"time-000-000-000-2",
	"time-000-000-000-1",
	"time-000-000-000-05",
	"time-000-000-000-02",
	"time-000-000-000-01",
	"time-000-000-000-005",
	"time-000-000-000-002",
	"time-000-000-000-001",
	"time-000-000-000-000-5",
	"time-000-000-000-000-2",
	"time-000-000-000-000-1",
	"time-000-000-000-000-05",
	"time-000-000-000-000-02",
	"time-000-000-000-000-01"
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
	return (index < 0 || index >= 40 || cConstantNameList == null) ? null : cConstantNameList[index];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int indexOfValue(long value)
    {
	if (value >= 0 && value <= 39)
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
    
    public static TimeConfidence valueOf(long value)
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
    public static TimeConfidence valueAt(int index)
    {
	if (index < 0 || index >= 40)
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
    public TimeConfidence clone() {
	return (TimeConfidence)super.clone();
    }

} // End class definition for TimeConfidence
