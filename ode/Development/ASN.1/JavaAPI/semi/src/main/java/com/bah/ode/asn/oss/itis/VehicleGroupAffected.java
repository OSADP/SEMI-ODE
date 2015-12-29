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
 * Define the ASN1 Type VehicleGroupAffected from ASN1 Module ITIS.
 * @see Enumerated
 */

public final class VehicleGroupAffected extends Enumerated {
    
    /**
     * The default constructor.
     */
    private VehicleGroupAffected()
    {
	super(9217);
    }
    
    public VehicleGroupAffected(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long all_vehicles = 9217;
	public static final long bicycles = 9218;
	public static final long motorcycles = 9219;
	public static final long cars = 9220;
	public static final long light_vehicles = 9221;
	public static final long cars_and_light_vehicles = 9222;
	public static final long cars_with_trailers = 9223;
	public static final long cars_with_recreational_trailers = 9224;
	public static final long vehicles_with_trailers = 9225;
	public static final long heavy_vehicles = 9226;
	public static final long trucks = 9227;
	public static final long buses = 9228;
	public static final long articulated_buses = 9229;
	public static final long school_buses = 9230;
	public static final long vehicles_with_semi_trailers = 9231;
	public static final long vehicles_with_double_trailers = 9232;
	public static final long high_profile_vehicles = 9233;
	public static final long wide_vehicles = 9234;
	public static final long long_vehicles = 9235;
	public static final long hazardous_loads = 9236;
	public static final long exceptional_loads = 9237;
	public static final long abnormal_loads = 9238;
	public static final long convoys = 9239;
	public static final long maintenance_vehicles = 9240;
	public static final long delivery_vehicles = 9241;
	public static final long vehicles_with_even_numbered_license_plates = 9242;
	public static final long vehicles_with_odd_numbered_license_plates = 9243;
	public static final long vehicles_with_parking_permits = 9244;
	public static final long vehicles_with_catalytic_converters = 9245;
	public static final long vehicles_without_catalytic_converters = 9246;
	public static final long gas_powered_vehicles = 9247;
	public static final long diesel_powered_vehicles = 9248;
	public static final long lPG_vehicles = 9249;
	public static final long military_convoys = 9250;
	public static final long military_vehicles = 9251;
	
    }
    // Named list definitions.
    public static final VehicleGroupAffected all_vehicles =
	new VehicleGroupAffected();
    public static final VehicleGroupAffected bicycles =
	new VehicleGroupAffected(9218);
    public static final VehicleGroupAffected motorcycles =
	new VehicleGroupAffected(9219);
    public static final VehicleGroupAffected cars =
	new VehicleGroupAffected(9220);
    public static final VehicleGroupAffected light_vehicles =
	new VehicleGroupAffected(9221);
    public static final VehicleGroupAffected cars_and_light_vehicles =
	new VehicleGroupAffected(9222);
    public static final VehicleGroupAffected cars_with_trailers =
	new VehicleGroupAffected(9223);
    public static final VehicleGroupAffected cars_with_recreational_trailers =
	new VehicleGroupAffected(9224);
    public static final VehicleGroupAffected vehicles_with_trailers =
	new VehicleGroupAffected(9225);
    public static final VehicleGroupAffected heavy_vehicles =
	new VehicleGroupAffected(9226);
    public static final VehicleGroupAffected trucks =
	new VehicleGroupAffected(9227);
    public static final VehicleGroupAffected buses =
	new VehicleGroupAffected(9228);
    public static final VehicleGroupAffected articulated_buses =
	new VehicleGroupAffected(9229);
    public static final VehicleGroupAffected school_buses =
	new VehicleGroupAffected(9230);
    public static final VehicleGroupAffected vehicles_with_semi_trailers =
	new VehicleGroupAffected(9231);
    public static final VehicleGroupAffected vehicles_with_double_trailers =
	new VehicleGroupAffected(9232);
    public static final VehicleGroupAffected high_profile_vehicles =
	new VehicleGroupAffected(9233);
    public static final VehicleGroupAffected wide_vehicles =
	new VehicleGroupAffected(9234);
    public static final VehicleGroupAffected long_vehicles =
	new VehicleGroupAffected(9235);
    public static final VehicleGroupAffected hazardous_loads =
	new VehicleGroupAffected(9236);
    public static final VehicleGroupAffected exceptional_loads =
	new VehicleGroupAffected(9237);
    public static final VehicleGroupAffected abnormal_loads =
	new VehicleGroupAffected(9238);
    public static final VehicleGroupAffected convoys =
	new VehicleGroupAffected(9239);
    public static final VehicleGroupAffected maintenance_vehicles =
	new VehicleGroupAffected(9240);
    public static final VehicleGroupAffected delivery_vehicles =
	new VehicleGroupAffected(9241);
    public static final VehicleGroupAffected vehicles_with_even_numbered_license_plates =
	new VehicleGroupAffected(9242);
    public static final VehicleGroupAffected vehicles_with_odd_numbered_license_plates =
	new VehicleGroupAffected(9243);
    public static final VehicleGroupAffected vehicles_with_parking_permits =
	new VehicleGroupAffected(9244);
    public static final VehicleGroupAffected vehicles_with_catalytic_converters =
	new VehicleGroupAffected(9245);
    public static final VehicleGroupAffected vehicles_without_catalytic_converters =
	new VehicleGroupAffected(9246);
    public static final VehicleGroupAffected gas_powered_vehicles =
	new VehicleGroupAffected(9247);
    public static final VehicleGroupAffected diesel_powered_vehicles =
	new VehicleGroupAffected(9248);
    public static final VehicleGroupAffected lPG_vehicles =
	new VehicleGroupAffected(9249);
    public static final VehicleGroupAffected military_convoys =
	new VehicleGroupAffected(9250);
    public static final VehicleGroupAffected military_vehicles =
	new VehicleGroupAffected(9251);
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static VehicleGroupAffected cNamedNumbers[] = {
	 all_vehicles, 
	 bicycles, 
	 motorcycles, 
	 cars, 
	 light_vehicles, 
	 cars_and_light_vehicles, 
	 cars_with_trailers, 
	 cars_with_recreational_trailers, 
	 vehicles_with_trailers, 
	 heavy_vehicles, 
	 trucks, 
	 buses, 
	 articulated_buses, 
	 school_buses, 
	 vehicles_with_semi_trailers, 
	 vehicles_with_double_trailers, 
	 high_profile_vehicles, 
	 wide_vehicles, 
	 long_vehicles, 
	 hazardous_loads, 
	 exceptional_loads, 
	 abnormal_loads, 
	 convoys, 
	 maintenance_vehicles, 
	 delivery_vehicles, 
	 vehicles_with_even_numbered_license_plates, 
	 vehicles_with_odd_numbered_license_plates, 
	 vehicles_with_parking_permits, 
	 vehicles_with_catalytic_converters, 
	 vehicles_without_catalytic_converters, 
	 gas_powered_vehicles, 
	 diesel_powered_vehicles, 
	 lPG_vehicles, 
	 military_convoys, 
	 military_vehicles
    };
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public final static String cConstantNameList[] = {
	"all-vehicles",
	"bicycles",
	"motorcycles",
	"cars",
	"light-vehicles",
	"cars-and-light-vehicles",
	"cars-with-trailers",
	"cars-with-recreational-trailers",
	"vehicles-with-trailers",
	"heavy-vehicles",
	"trucks",
	"buses",
	"articulated-buses",
	"school-buses",
	"vehicles-with-semi-trailers",
	"vehicles-with-double-trailers",
	"high-profile-vehicles",
	"wide-vehicles",
	"long-vehicles",
	"hazardous-loads",
	"exceptional-loads",
	"abnormal-loads",
	"convoys",
	"maintenance-vehicles",
	"delivery-vehicles",
	"vehicles-with-even-numbered-license-plates",
	"vehicles-with-odd-numbered-license-plates",
	"vehicles-with-parking-permits",
	"vehicles-with-catalytic-converters",
	"vehicles-without-catalytic-converters",
	"gas-powered-vehicles",
	"diesel-powered-vehicles",
	"lPG-vehicles",
	"military-convoys",
	"military-vehicles"
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
	return (index < 0 || index >= 35 || cConstantNameList == null) ? null : cConstantNameList[index];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int indexOfValue(long value)
    {
	if (value >= 9217 && value <= 9251)
	    return (int)(value - 9217);
	else
	    return -1;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static VehicleGroupAffected valueOf(long value)
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
    public static VehicleGroupAffected valueAt(int index)
    {
	if (index < 0)
	    throw new IndexOutOfBoundsException();
	else if (index >= 35)
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
    public VehicleGroupAffected clone() {
	return (VehicleGroupAffected)super.clone();
    }

    /**
     * Methods for "unknownEnumerator"
     */
    private static final VehicleGroupAffected cUnknownEnumerator = 
	new VehicleGroupAffected(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static VehicleGroupAffected unknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public VehicleGroupAffected getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
} // End class definition for VehicleGroupAffected
