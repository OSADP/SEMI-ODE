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
 * Define the ASN1 Type ElevationConfidence from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class ElevationConfidence extends Enumerated {
    
    /**
     * The default constructor.
     */
    private ElevationConfidence()
    {
	super(0);
    }
    
    public ElevationConfidence(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long unavailable = 0;
	public static final long elev_500_00 = 1;
	public static final long elev_200_00 = 2;
	public static final long elev_100_00 = 3;
	public static final long elev_050_00 = 4;
	public static final long elev_020_00 = 5;
	public static final long elev_010_00 = 6;
	public static final long elev_005_00 = 7;
	public static final long elev_002_00 = 8;
	public static final long elev_001_00 = 9;
	public static final long elev_000_50 = 10;
	public static final long elev_000_20 = 11;
	public static final long elev_000_10 = 12;
	public static final long elev_000_05 = 13;
	public static final long elev_000_02 = 14;
	public static final long elev_000_01 = 15;
    }
    // Named list definitions.
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static ElevationConfidence cNamedNumbers[] = {
	new ElevationConfidence(), 
	new ElevationConfidence(1), 
	new ElevationConfidence(2), 
	new ElevationConfidence(3), 
	new ElevationConfidence(4), 
	new ElevationConfidence(5), 
	new ElevationConfidence(6), 
	new ElevationConfidence(7), 
	new ElevationConfidence(8), 
	new ElevationConfidence(9), 
	new ElevationConfidence(10), 
	new ElevationConfidence(11), 
	new ElevationConfidence(12), 
	new ElevationConfidence(13), 
	new ElevationConfidence(14), 
	new ElevationConfidence(15)
    };
    public static final ElevationConfidence unavailable = cNamedNumbers[0];
    public static final ElevationConfidence elev_500_00 = cNamedNumbers[1];
    public static final ElevationConfidence elev_200_00 = cNamedNumbers[2];
    public static final ElevationConfidence elev_100_00 = cNamedNumbers[3];
    public static final ElevationConfidence elev_050_00 = cNamedNumbers[4];
    public static final ElevationConfidence elev_020_00 = cNamedNumbers[5];
    public static final ElevationConfidence elev_010_00 = cNamedNumbers[6];
    public static final ElevationConfidence elev_005_00 = cNamedNumbers[7];
    public static final ElevationConfidence elev_002_00 = cNamedNumbers[8];
    public static final ElevationConfidence elev_001_00 = cNamedNumbers[9];
    public static final ElevationConfidence elev_000_50 = cNamedNumbers[10];
    public static final ElevationConfidence elev_000_20 = cNamedNumbers[11];
    public static final ElevationConfidence elev_000_10 = cNamedNumbers[12];
    public static final ElevationConfidence elev_000_05 = cNamedNumbers[13];
    public static final ElevationConfidence elev_000_02 = cNamedNumbers[14];
    public static final ElevationConfidence elev_000_01 = cNamedNumbers[15];
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static String cConstantNameList[] = {
	"unavailable",
	"elev-500-00",
	"elev-200-00",
	"elev-100-00",
	"elev-050-00",
	"elev-020-00",
	"elev-010-00",
	"elev-005-00",
	"elev-002-00",
	"elev-001-00",
	"elev-000-50",
	"elev-000-20",
	"elev-000-10",
	"elev-000-05",
	"elev-000-02",
	"elev-000-01"
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
     * Returns the enumerator with the specified value or null if the value
     * is not associated with any enumerator.
     *  @param value The value of the enumerator to return.
     *  @return The enumerator with the specified value.
     */
    
    public static ElevationConfidence valueOf(long value)
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
    public static ElevationConfidence valueAt(int index)
    {
	if (index < 0 || index >= 16)
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
    public ElevationConfidence clone() {
	return (ElevationConfidence)super.clone();
    }

} // End class definition for ElevationConfidence
