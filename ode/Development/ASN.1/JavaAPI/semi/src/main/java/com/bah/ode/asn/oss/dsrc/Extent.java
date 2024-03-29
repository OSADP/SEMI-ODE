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
 * Define the ASN1 Type Extent from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class Extent extends Enumerated {
    
    /**
     * The default constructor.
     */
    private Extent()
    {
	super(0);
    }
    
    public Extent(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long useInstantlyOnly = 0;
	public static final long useFor3meters = 1;
	public static final long useFor10meters = 2;
	public static final long useFor50meters = 3;
	public static final long useFor100meters = 4;
	public static final long useFor500meters = 5;
	public static final long useFor1000meters = 6;
	public static final long useFor5000meters = 7;
	public static final long useFor10000meters = 8;
	public static final long useFor50000meters = 9;
	public static final long useFor100000meters = 10;
	public static final long forever = 127;
    }
    // Named list definitions.
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static Extent cNamedNumbers[] = {
	new Extent(), 
	new Extent(1), 
	new Extent(2), 
	new Extent(3), 
	new Extent(4), 
	new Extent(5), 
	new Extent(6), 
	new Extent(7), 
	new Extent(8), 
	new Extent(9), 
	new Extent(10), 
	new Extent(127)
    };
    public static final Extent useInstantlyOnly = cNamedNumbers[0];
    public static final Extent useFor3meters = cNamedNumbers[1];
    public static final Extent useFor10meters = cNamedNumbers[2];
    public static final Extent useFor50meters = cNamedNumbers[3];
    public static final Extent useFor100meters = cNamedNumbers[4];
    public static final Extent useFor500meters = cNamedNumbers[5];
    public static final Extent useFor1000meters = cNamedNumbers[6];
    public static final Extent useFor5000meters = cNamedNumbers[7];
    public static final Extent useFor10000meters = cNamedNumbers[8];
    public static final Extent useFor50000meters = cNamedNumbers[9];
    public static final Extent useFor100000meters = cNamedNumbers[10];
    public static final Extent forever = cNamedNumbers[11];
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static String cConstantNameList[] = {
	"useInstantlyOnly",
	"useFor3meters",
	"useFor10meters",
	"useFor50meters",
	"useFor100meters",
	"useFor500meters",
	"useFor1000meters",
	"useFor5000meters",
	"useFor10000meters",
	"useFor50000meters",
	"useFor100000meters",
	"forever"
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
	return (index < 0 || index >= 12 || cConstantNameList == null) ? null : cConstantNameList[index];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int indexOfValue(long value)
    {
	if (value >= 0 && value <= 10)
	    return (int)value;
	if (value == 127)
	    return 11;
	else
	    return -1;
    }
    
    /**
     * Returns the enumerator with the specified value or null if the value
     * is not associated with any enumerator.
     *  @param value The value of the enumerator to return.
     *  @return The enumerator with the specified value.
     */
    
    public static Extent valueOf(long value)
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
    public static Extent valueAt(int index)
    {
	if (index < 0 || index >= 12)
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
    public Extent clone() {
	return (Extent)super.clone();
    }

} // End class definition for Extent
