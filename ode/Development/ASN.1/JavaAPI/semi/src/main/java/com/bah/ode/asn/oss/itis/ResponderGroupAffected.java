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


package com.bah.ode.asn.oss.itis;

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
 * Define the ASN1 Type ResponderGroupAffected from ASN1 Module ITIS.
 * @see Enumerated
 */

public final class ResponderGroupAffected extends Enumerated {
    
    /**
     * The default constructor.
     */
    private ResponderGroupAffected()
    {
	super(9729);
    }
    
    public ResponderGroupAffected(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long emergency_vehicle_units = 9729;
	public static final long federal_law_enforcement_units = 9730;
	public static final long state_police_units = 9731;
	public static final long county_police_units = 9732;
	public static final long local_police_units = 9733;
	public static final long ambulance_units = 9734;
	public static final long rescue_units = 9735;
	public static final long fire_units = 9736;
	public static final long hAZMAT_units = 9737;
	public static final long light_tow_unit = 9738;
	public static final long heavy_tow_unit = 9739;
	public static final long freeway_service_patrols = 9740;
	public static final long transportation_response_units = 9741;
	public static final long private_contractor_response_units = 9742;
	
    }
    // Named list definitions.
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static ResponderGroupAffected cNamedNumbers[] = {
	new ResponderGroupAffected(), 
	new ResponderGroupAffected(9730), 
	new ResponderGroupAffected(9731), 
	new ResponderGroupAffected(9732), 
	new ResponderGroupAffected(9733), 
	new ResponderGroupAffected(9734), 
	new ResponderGroupAffected(9735), 
	new ResponderGroupAffected(9736), 
	new ResponderGroupAffected(9737), 
	new ResponderGroupAffected(9738), 
	new ResponderGroupAffected(9739), 
	new ResponderGroupAffected(9740), 
	new ResponderGroupAffected(9741), 
	new ResponderGroupAffected(9742)
    };
    public static final ResponderGroupAffected emergency_vehicle_units = cNamedNumbers[0];
    public static final ResponderGroupAffected federal_law_enforcement_units = cNamedNumbers[1];
    public static final ResponderGroupAffected state_police_units = cNamedNumbers[2];
    public static final ResponderGroupAffected county_police_units = cNamedNumbers[3];
    public static final ResponderGroupAffected local_police_units = cNamedNumbers[4];
    public static final ResponderGroupAffected ambulance_units = cNamedNumbers[5];
    public static final ResponderGroupAffected rescue_units = cNamedNumbers[6];
    public static final ResponderGroupAffected fire_units = cNamedNumbers[7];
    public static final ResponderGroupAffected hAZMAT_units = cNamedNumbers[8];
    public static final ResponderGroupAffected light_tow_unit = cNamedNumbers[9];
    public static final ResponderGroupAffected heavy_tow_unit = cNamedNumbers[10];
    public static final ResponderGroupAffected freeway_service_patrols = cNamedNumbers[11];
    public static final ResponderGroupAffected transportation_response_units = cNamedNumbers[12];
    public static final ResponderGroupAffected private_contractor_response_units = cNamedNumbers[13];
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static String cConstantNameList[] = {
	"emergency-vehicle-units",
	"federal-law-enforcement-units",
	"state-police-units",
	"county-police-units",
	"local-police-units",
	"ambulance-units",
	"rescue-units",
	"fire-units",
	"hAZMAT-units",
	"light-tow-unit",
	"heavy-tow-unit",
	"freeway-service-patrols",
	"transportation-response-units",
	"private-contractor-response-units"
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
	return (index < 0 || index >= 14 || cConstantNameList == null) ? null : cConstantNameList[index];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int indexOfValue(long value)
    {
	if (value >= 9729 && value <= 9742)
	    return (int)(value - 9729);
	else
	    return -1;
    }
    
    /**
     * Returns the enumerator with the specified value or null if the value
     * is not associated with any enumerator.
     *  @param value The value of the enumerator to return.
     *  @return The enumerator with the specified value.
     */
    
    public static ResponderGroupAffected valueOf(long value)
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
    public static ResponderGroupAffected valueAt(int index)
    {
	if (index < 0)
	    throw new IndexOutOfBoundsException();
	else if (index >= 14)
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
    public ResponderGroupAffected clone() {
	return (ResponderGroupAffected)super.clone();
    }

    /**
     * Methods for "unknownEnumerator"
     */
    private static final ResponderGroupAffected cUnknownEnumerator = 
	new ResponderGroupAffected(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static ResponderGroupAffected unknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public ResponderGroupAffected getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
} // End class definition for ResponderGroupAffected
