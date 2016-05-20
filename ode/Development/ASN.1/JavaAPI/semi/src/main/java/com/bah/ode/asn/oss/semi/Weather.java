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


package com.bah.ode.asn.oss.semi;

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
 * Define the ASN1 Type Weather from ASN1 Module SEMI.
 * @see Sequence
 */

public class Weather extends Sequence {
    public Wipers wipers;
    public com.bah.ode.asn.oss.dsrc.AmbientAirTemperature airTemp;
    public com.bah.ode.asn.oss.dsrc.AmbientAirPressure airPres;
    public WeatherReport weatherReport;
    
    /**
     * The default constructor.
     */
    public Weather()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Weather(Wipers wipers, 
		    com.bah.ode.asn.oss.dsrc.AmbientAirTemperature airTemp, 
		    com.bah.ode.asn.oss.dsrc.AmbientAirPressure airPres, 
		    WeatherReport weatherReport)
    {
	setWipers(wipers);
	setAirTemp(airTemp);
	setAirPres(airPres);
	setWeatherReport(weatherReport);
    }
    
    
    // Methods for field "wipers"
    public Wipers getWipers()
    {
	return this.wipers;
    }
    
    public void setWipers(Wipers wipers)
    {
	this.wipers = wipers;
    }
    
    public boolean hasWipers()
    {
	return (wipers != null);
    }
    
    public void deleteWipers()
    {
	wipers = null;
    }
    
    
    
    /**
     * Define the ASN1 Type Wipers from ASN1 Module SEMI.
     * @see Sequence
     */
    public static class Wipers extends Sequence {
	public com.bah.ode.asn.oss.dsrc.WiperStatusFront statFrnt;
	public com.bah.ode.asn.oss.dsrc.WiperRate rateFrnt;
	public com.bah.ode.asn.oss.dsrc.WiperStatusRear statRear;
	public com.bah.ode.asn.oss.dsrc.WiperRate rateRear;
	
	/**
	 * The default constructor.
	 */
	public Wipers()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Wipers(com.bah.ode.asn.oss.dsrc.WiperStatusFront statFrnt, 
			com.bah.ode.asn.oss.dsrc.WiperRate rateFrnt, 
			com.bah.ode.asn.oss.dsrc.WiperStatusRear statRear, 
			com.bah.ode.asn.oss.dsrc.WiperRate rateRear)
	{
	    setStatFrnt(statFrnt);
	    setRateFrnt(rateFrnt);
	    setStatRear(statRear);
	    setRateRear(rateRear);
	}
	
	/**
	 * Construct with required components.
	 */
	public Wipers(com.bah.ode.asn.oss.dsrc.WiperStatusFront statFrnt)
	{
	    setStatFrnt(statFrnt);
	}
	
	
	// Methods for field "statFrnt"
	public com.bah.ode.asn.oss.dsrc.WiperStatusFront getStatFrnt()
	{
	    return this.statFrnt;
	}
	
	public void setStatFrnt(com.bah.ode.asn.oss.dsrc.WiperStatusFront statFrnt)
	{
	    this.statFrnt = statFrnt;
	}
	
	
	// Methods for field "rateFrnt"
	public com.bah.ode.asn.oss.dsrc.WiperRate getRateFrnt()
	{
	    return this.rateFrnt;
	}
	
	public void setRateFrnt(com.bah.ode.asn.oss.dsrc.WiperRate rateFrnt)
	{
	    this.rateFrnt = rateFrnt;
	}
	
	public boolean hasRateFrnt()
	{
	    return (rateFrnt != null);
	}
	
	public void deleteRateFrnt()
	{
	    rateFrnt = null;
	}
	
	
	// Methods for field "statRear"
	public com.bah.ode.asn.oss.dsrc.WiperStatusRear getStatRear()
	{
	    return this.statRear;
	}
	
	public void setStatRear(com.bah.ode.asn.oss.dsrc.WiperStatusRear statRear)
	{
	    this.statRear = statRear;
	}
	
	public boolean hasStatRear()
	{
	    return (statRear != null);
	}
	
	public void deleteStatRear()
	{
	    statRear = null;
	}
	
	
	// Methods for field "rateRear"
	public com.bah.ode.asn.oss.dsrc.WiperRate getRateRear()
	{
	    return this.rateRear;
	}
	
	public void setRateRear(com.bah.ode.asn.oss.dsrc.WiperRate rateRear)
	{
	    this.rateRear = rateRear;
	}
	
	public boolean hasRateRear()
	{
	    return (rateRear != null);
	}
	
	public void deleteRateRear()
	{
	    rateRear = null;
	}
	
	
	/**
	 * Implements PER value encoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public static int encodeValue(PerCoder coder, OutputBitStream sink, Wipers data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int nbits = 0;

	    sink.writeBit(data.rateFrnt != null);
	    sink.writeBit(data.statRear != null);
	    sink.writeBit(data.rateRear != null);
	    nbits += 3;
	    // Encode field 'statFrnt'
	    try {
		com.bah.ode.asn.oss.dsrc.WiperStatusFront item1 = data.statFrnt;
		int idx1;
		boolean extroot1 = true;

		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else {
		    idx1 = item1.indexOf();
		    if (idx1 < 0)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    extroot1 = idx1 < 7;
		}
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 6, sink);
		else
		    nbits += coder.encodeNormallySmallNumber(idx1 - 7, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("statFrnt", "WiperStatusFront");
		throw ee;
	    }
	    if (data.rateFrnt != null) {
		// Encode field 'rateFrnt'
		try {
		    com.bah.ode.asn.oss.dsrc.WiperRate item1 = data.rateFrnt;
		    long temp1 = item1.longValue();

		    if (temp1 < 0 || temp1 > 127)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 127, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("rateFrnt", "WiperRate");
		    throw ee;
		}
	    }
	    if (data.statRear != null) {
		// Encode field 'statRear'
		try {
		    com.bah.ode.asn.oss.dsrc.WiperStatusRear item1 = data.statRear;
		    int idx1;
		    boolean extroot1 = true;

		    if (item1.isUnknownEnumerator()) {
			throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		    } else {
			idx1 = item1.indexOf();
			if (idx1 < 0)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
			extroot1 = idx1 < 7;
		    }
		    sink.writeBit(!extroot1); ++nbits;
		    if (extroot1)
			nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 6, sink);
		    else
			nbits += coder.encodeNormallySmallNumber(idx1 - 7, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("statRear", "WiperStatusRear");
		    throw ee;
		}
	    }
	    if (data.rateRear != null) {
		// Encode field 'rateRear'
		try {
		    com.bah.ode.asn.oss.dsrc.WiperRate item1 = data.rateRear;
		    long temp1 = item1.longValue();

		    if (temp1 < 0 || temp1 > 127)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 127, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("rateRear", "WiperRate");
		    throw ee;
		}
	    }

	    return nbits;
	}

	/**
	 * Implements PER value decoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public static Wipers decodeValue(PerCoder coder, InputBitStream source, Wipers data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    boolean has_rateFrnt0 = source.readBit();
	    boolean has_statRear0 = source.readBit();
	    boolean has_rateRear0 = source.readBit();
	/** Decode root fields **/
	    // Decode field 'statFrnt'
	    try {
		int idx1;
		com.bah.ode.asn.oss.dsrc.WiperStatusFront temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 6);
		    if (idx1 < 0 || idx1 > 6)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = com.bah.ode.asn.oss.dsrc.WiperStatusFront.valueAt(idx1);
		} else {
		    idx1 = 7 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = com.bah.ode.asn.oss.dsrc.WiperStatusFront.unknownEnumerator();
		}
		data.statFrnt = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("statFrnt", "WiperStatusFront");
		throw de;
	    }
	    if (has_rateFrnt0) {
		// Decode field 'rateFrnt'
		try {
		    long temp1;

		    if (data.rateFrnt == null)
			data.rateFrnt = new com.bah.ode.asn.oss.dsrc.WiperRate();
		    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 127);
		    if (temp1 > 127)
			throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		    data.rateFrnt.setValue(temp1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("rateFrnt", "WiperRate");
		    throw de;
		}
	    } else {
		data.rateFrnt = null;
	    }
	    if (has_statRear0) {
		// Decode field 'statRear'
		try {
		    int idx1;
		    com.bah.ode.asn.oss.dsrc.WiperStatusRear temp1;
		    boolean extroot1 = !source.readBit();

		    if (extroot1) {
			idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 6);
			if (idx1 < 0 || idx1 > 6)
			    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
			temp1 = com.bah.ode.asn.oss.dsrc.WiperStatusRear.valueAt(idx1);
		    } else {
			idx1 = 7 + (int)coder.decodeNormallySmallNumber(source);
			if (idx1 < 0)
			    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
			temp1 = com.bah.ode.asn.oss.dsrc.WiperStatusRear.unknownEnumerator();
		    }
		    data.statRear = temp1;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("statRear", "WiperStatusRear");
		    throw de;
		}
	    } else {
		data.statRear = null;
	    }
	    if (has_rateRear0) {
		// Decode field 'rateRear'
		try {
		    long temp1;

		    if (data.rateRear == null)
			data.rateRear = new com.bah.ode.asn.oss.dsrc.WiperRate();
		    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 127);
		    if (temp1 > 127)
			throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		    data.rateRear.setValue(temp1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("rateRear", "WiperRate");
		    throw de;
		}
	    } else {
		data.rateRear = null;
	    }
	    return data;
	}

	/**
	 * Compare 'this' object to another object to see if their contents are the same.
	 */
	public boolean abstractEqualTo(AbstractData that)
	{
	    return equalTo((Wipers)that);
	}
	
	public boolean equalTo(Sequence that)
	{
	    return equalTo((Wipers)that);
	}
	
	public boolean equalTo(Wipers that) {
	    if (!this.statFrnt.equalTo(that.statFrnt))
		return false;
	    if (this.rateFrnt != null && that.rateFrnt != null) {
		if (!this.rateFrnt.equalTo(that.rateFrnt))
		    return false;
	    }
	    if (this.statRear != null && that.statRear != null) {
		if (!this.statRear.equalTo(that.statRear))
		    return false;
	    }
	    if (this.rateRear != null && that.rateRear != null) {
		if (!this.rateRear.equalTo(that.rateRear))
		    return false;
	    }
	    return true;
	}

	/**
	 * Clone 'this' object.
	 */
	public Wipers clone() {
	    Wipers copy = (Wipers)super.clone();
	    copy.statFrnt = statFrnt.clone();
	    if (rateFrnt != null) {
		copy.rateFrnt = rateFrnt.clone();
	    }
	    if (statRear != null) {
		copy.statRear = statRear.clone();
	    }
	    if (rateRear != null) {
		copy.rateRear = rateRear.clone();
	    }
	    return copy;
	}

	/**
	 * Returns a hash code for 'this' object.
	 */
	public int hashCode() {
	    int hash = 3;
	    hash = 41 * hash + (this.statFrnt != null ? this.statFrnt.hashCode() : 0);
	    hash = 41 * hash + (this.rateFrnt != null ? this.rateFrnt.hashCode() : 0);
	    hash = 41 * hash + (this.statRear != null ? this.statRear.hashCode() : 0);
	    hash = 41 * hash + (this.rateRear != null ? this.rateRear.hashCode() : 0);
	    return hash;
	}
    } // End class definition for Wipers

    // Methods for field "airTemp"
    public com.bah.ode.asn.oss.dsrc.AmbientAirTemperature getAirTemp()
    {
	return this.airTemp;
    }
    
    public void setAirTemp(com.bah.ode.asn.oss.dsrc.AmbientAirTemperature airTemp)
    {
	this.airTemp = airTemp;
    }
    
    public boolean hasAirTemp()
    {
	return (airTemp != null);
    }
    
    public void deleteAirTemp()
    {
	airTemp = null;
    }
    
    
    // Methods for field "airPres"
    public com.bah.ode.asn.oss.dsrc.AmbientAirPressure getAirPres()
    {
	return this.airPres;
    }
    
    public void setAirPres(com.bah.ode.asn.oss.dsrc.AmbientAirPressure airPres)
    {
	this.airPres = airPres;
    }
    
    public boolean hasAirPres()
    {
	return (airPres != null);
    }
    
    public void deleteAirPres()
    {
	airPres = null;
    }
    
    
    // Methods for field "weatherReport"
    public WeatherReport getWeatherReport()
    {
	return this.weatherReport;
    }
    
    public void setWeatherReport(WeatherReport weatherReport)
    {
	this.weatherReport = weatherReport;
    }
    
    public boolean hasWeatherReport()
    {
	return (weatherReport != null);
    }
    
    public void deleteWeatherReport()
    {
	weatherReport = null;
    }
    
    
    
    /**
     * Define the ASN1 Type WeatherReport from ASN1 Module SEMI.
     * @see Sequence
     */
    public static class WeatherReport extends Sequence {
	public com.bah.ode.asn.oss.ntcip.EssPrecipYesNo isRaining;
	public com.bah.ode.asn.oss.ntcip.EssPrecipRate rainRate;
	public com.bah.ode.asn.oss.ntcip.EssPrecipSituation precipSituation;
	public com.bah.ode.asn.oss.ntcip.EssSolarRadiation solarRadiation;
	public com.bah.ode.asn.oss.ntcip.EssMobileFriction friction;
	
	/**
	 * The default constructor.
	 */
	public WeatherReport()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public WeatherReport(com.bah.ode.asn.oss.ntcip.EssPrecipYesNo isRaining, 
			com.bah.ode.asn.oss.ntcip.EssPrecipRate rainRate, 
			com.bah.ode.asn.oss.ntcip.EssPrecipSituation precipSituation, 
			com.bah.ode.asn.oss.ntcip.EssSolarRadiation solarRadiation, 
			com.bah.ode.asn.oss.ntcip.EssMobileFriction friction)
	{
	    setIsRaining(isRaining);
	    setRainRate(rainRate);
	    setPrecipSituation(precipSituation);
	    setSolarRadiation(solarRadiation);
	    setFriction(friction);
	}
	
	/**
	 * Construct with required components.
	 */
	public WeatherReport(com.bah.ode.asn.oss.ntcip.EssPrecipYesNo isRaining)
	{
	    setIsRaining(isRaining);
	}
	
	
	// Methods for field "isRaining"
	public com.bah.ode.asn.oss.ntcip.EssPrecipYesNo getIsRaining()
	{
	    return this.isRaining;
	}
	
	public void setIsRaining(com.bah.ode.asn.oss.ntcip.EssPrecipYesNo isRaining)
	{
	    this.isRaining = isRaining;
	}
	
	
	// Methods for field "rainRate"
	public com.bah.ode.asn.oss.ntcip.EssPrecipRate getRainRate()
	{
	    return this.rainRate;
	}
	
	public void setRainRate(com.bah.ode.asn.oss.ntcip.EssPrecipRate rainRate)
	{
	    this.rainRate = rainRate;
	}
	
	public boolean hasRainRate()
	{
	    return (rainRate != null);
	}
	
	public void deleteRainRate()
	{
	    rainRate = null;
	}
	
	
	// Methods for field "precipSituation"
	public com.bah.ode.asn.oss.ntcip.EssPrecipSituation getPrecipSituation()
	{
	    return this.precipSituation;
	}
	
	public void setPrecipSituation(com.bah.ode.asn.oss.ntcip.EssPrecipSituation precipSituation)
	{
	    this.precipSituation = precipSituation;
	}
	
	public boolean hasPrecipSituation()
	{
	    return (precipSituation != null);
	}
	
	public void deletePrecipSituation()
	{
	    precipSituation = null;
	}
	
	
	// Methods for field "solarRadiation"
	public com.bah.ode.asn.oss.ntcip.EssSolarRadiation getSolarRadiation()
	{
	    return this.solarRadiation;
	}
	
	public void setSolarRadiation(com.bah.ode.asn.oss.ntcip.EssSolarRadiation solarRadiation)
	{
	    this.solarRadiation = solarRadiation;
	}
	
	public boolean hasSolarRadiation()
	{
	    return (solarRadiation != null);
	}
	
	public void deleteSolarRadiation()
	{
	    solarRadiation = null;
	}
	
	
	// Methods for field "friction"
	public com.bah.ode.asn.oss.ntcip.EssMobileFriction getFriction()
	{
	    return this.friction;
	}
	
	public void setFriction(com.bah.ode.asn.oss.ntcip.EssMobileFriction friction)
	{
	    this.friction = friction;
	}
	
	public boolean hasFriction()
	{
	    return (friction != null);
	}
	
	public void deleteFriction()
	{
	    friction = null;
	}
	
	
	/**
	 * Implements PER value encoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public static int encodeValue(PerCoder coder, OutputBitStream sink, WeatherReport data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int nbits = 0;

	    sink.writeBit(data.rainRate != null);
	    sink.writeBit(data.precipSituation != null);
	    sink.writeBit(data.solarRadiation != null);
	    sink.writeBit(data.friction != null);
	    nbits += 4;
	    // Encode field 'isRaining'
	    try {
		com.bah.ode.asn.oss.ntcip.EssPrecipYesNo item1 = data.isRaining;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 2, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("isRaining", "EssPrecipYesNo");
		throw ee;
	    }
	    if (data.rainRate != null) {
		// Encode field 'rainRate'
		try {
		    com.bah.ode.asn.oss.ntcip.EssPrecipRate item1 = data.rainRate;
		    long temp1 = item1.longValue();

		    if (temp1 < 0 || temp1 > 65535)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 65535, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("rainRate", "EssPrecipRate");
		    throw ee;
		}
	    }
	    if (data.precipSituation != null) {
		// Encode field 'precipSituation'
		try {
		    com.bah.ode.asn.oss.ntcip.EssPrecipSituation item1 = data.precipSituation;
		    int idx1 = item1.indexOf();

		    if (idx1 < 0)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 14, sink));
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("precipSituation", "EssPrecipSituation");
		    throw ee;
		}
	    }
	    if (data.solarRadiation != null) {
		// Encode field 'solarRadiation'
		try {
		    com.bah.ode.asn.oss.ntcip.EssSolarRadiation item1 = data.solarRadiation;
		    long temp1 = item1.longValue();

		    if (temp1 < 0 || temp1 > 65535)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 65535, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("solarRadiation", "EssSolarRadiation");
		    throw ee;
		}
	    }
	    if (data.friction != null) {
		// Encode field 'friction'
		try {
		    com.bah.ode.asn.oss.ntcip.EssMobileFriction item1 = data.friction;
		    long temp1 = item1.longValue();

		    if (temp1 < 0 || temp1 > 101)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 101, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("friction", "EssMobileFriction");
		    throw ee;
		}
	    }

	    return nbits;
	}

	/**
	 * Implements PER value decoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public static WeatherReport decodeValue(PerCoder coder, InputBitStream source, WeatherReport data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    boolean has_rainRate0 = source.readBit();
	    boolean has_precipSituation0 = source.readBit();
	    boolean has_solarRadiation0 = source.readBit();
	    boolean has_friction0 = source.readBit();
	/** Decode root fields **/
	    // Decode field 'isRaining'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 2);
		if (idx1 < 0 || idx1 > 2)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.isRaining = com.bah.ode.asn.oss.ntcip.EssPrecipYesNo.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("isRaining", "EssPrecipYesNo");
		throw de;
	    }
	    if (has_rainRate0) {
		// Decode field 'rainRate'
		try {
		    long temp1;

		    if (data.rainRate == null)
			data.rainRate = new com.bah.ode.asn.oss.ntcip.EssPrecipRate();
		    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 65535);
		    if (temp1 > 65535)
			throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		    data.rainRate.setValue(temp1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("rainRate", "EssPrecipRate");
		    throw de;
		}
	    } else {
		data.rainRate = null;
	    }
	    if (has_precipSituation0) {
		// Decode field 'precipSituation'
		try {
		    int idx1;

		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 14);
		    if (idx1 < 0 || idx1 > 14)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    data.precipSituation = com.bah.ode.asn.oss.ntcip.EssPrecipSituation.valueAt(idx1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("precipSituation", "EssPrecipSituation");
		    throw de;
		}
	    } else {
		data.precipSituation = null;
	    }
	    if (has_solarRadiation0) {
		// Decode field 'solarRadiation'
		try {
		    long temp1;

		    if (data.solarRadiation == null)
			data.solarRadiation = new com.bah.ode.asn.oss.ntcip.EssSolarRadiation();
		    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 65535);
		    if (temp1 > 65535)
			throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		    data.solarRadiation.setValue(temp1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("solarRadiation", "EssSolarRadiation");
		    throw de;
		}
	    } else {
		data.solarRadiation = null;
	    }
	    if (has_friction0) {
		// Decode field 'friction'
		try {
		    long temp1;

		    if (data.friction == null)
			data.friction = new com.bah.ode.asn.oss.ntcip.EssMobileFriction();
		    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 101);
		    if (temp1 > 101)
			throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		    data.friction.setValue(temp1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("friction", "EssMobileFriction");
		    throw de;
		}
	    } else {
		data.friction = null;
	    }
	    return data;
	}

	/**
	 * Compare 'this' object to another object to see if their contents are the same.
	 */
	public boolean abstractEqualTo(AbstractData that)
	{
	    return equalTo((WeatherReport)that);
	}
	
	public boolean equalTo(Sequence that)
	{
	    return equalTo((WeatherReport)that);
	}
	
	public boolean equalTo(WeatherReport that) {
	    if (!this.isRaining.equalTo(that.isRaining))
		return false;
	    if (this.rainRate != null && that.rainRate != null) {
		if (!this.rainRate.equalTo(that.rainRate))
		    return false;
	    }
	    if (this.precipSituation != null && that.precipSituation != null) {
		if (!this.precipSituation.equalTo(that.precipSituation))
		    return false;
	    }
	    if (this.solarRadiation != null && that.solarRadiation != null) {
		if (!this.solarRadiation.equalTo(that.solarRadiation))
		    return false;
	    }
	    if (this.friction != null && that.friction != null) {
		if (!this.friction.equalTo(that.friction))
		    return false;
	    }
	    return true;
	}

	/**
	 * Clone 'this' object.
	 */
	public WeatherReport clone() {
	    WeatherReport copy = (WeatherReport)super.clone();
	    copy.isRaining = isRaining.clone();
	    if (rainRate != null) {
		copy.rainRate = rainRate.clone();
	    }
	    if (precipSituation != null) {
		copy.precipSituation = precipSituation.clone();
	    }
	    if (solarRadiation != null) {
		copy.solarRadiation = solarRadiation.clone();
	    }
	    if (friction != null) {
		copy.friction = friction.clone();
	    }
	    return copy;
	}

	/**
	 * Returns a hash code for 'this' object.
	 */
	public int hashCode() {
	    int hash = 3;
	    hash = 41 * hash + (this.isRaining != null ? this.isRaining.hashCode() : 0);
	    hash = 41 * hash + (this.rainRate != null ? this.rainRate.hashCode() : 0);
	    hash = 41 * hash + (this.precipSituation != null ? this.precipSituation.hashCode() : 0);
	    hash = 41 * hash + (this.solarRadiation != null ? this.solarRadiation.hashCode() : 0);
	    hash = 41 * hash + (this.friction != null ? this.friction.hashCode() : 0);
	    return hash;
	}
    } // End class definition for WeatherReport

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, Weather data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.wipers != null);
	sink.writeBit(data.airTemp != null);
	sink.writeBit(data.airPres != null);
	sink.writeBit(data.weatherReport != null);
	nbits += 5;
	if (data.wipers != null) {
	    // Encode field 'wipers'
	    try {
		Wipers item1 = data.wipers;

		nbits += Wipers.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("wipers", "SEQUENCE");
		throw ee;
	    }
	}
	if (data.airTemp != null) {
	    // Encode field 'airTemp'
	    try {
		com.bah.ode.asn.oss.dsrc.AmbientAirTemperature item1 = data.airTemp;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 191)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 191, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("airTemp", "AmbientAirTemperature");
		throw ee;
	    }
	}
	if (data.airPres != null) {
	    // Encode field 'airPres'
	    try {
		com.bah.ode.asn.oss.dsrc.AmbientAirPressure item1 = data.airPres;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 255)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("airPres", "AmbientAirPressure");
		throw ee;
	    }
	}
	if (data.weatherReport != null) {
	    // Encode field 'weatherReport'
	    try {
		WeatherReport item1 = data.weatherReport;

		nbits += WeatherReport.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("weatherReport", "SEQUENCE");
		throw ee;
	    }
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static Weather decodeValue(PerCoder coder, InputBitStream source, Weather data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_wipers0 = source.readBit();
	boolean has_airTemp0 = source.readBit();
	boolean has_airPres0 = source.readBit();
	boolean has_weatherReport0 = source.readBit();
    /** Decode root fields **/
	if (has_wipers0) {
	    // Decode field 'wipers'
	    try {
		if (data.wipers == null)
		    data.wipers = new Wipers();
		data.wipers.decodeValue(coder, source, data.wipers);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("wipers", "SEQUENCE");
		throw de;
	    }
	} else {
	    data.wipers = null;
	}
	if (has_airTemp0) {
	    // Decode field 'airTemp'
	    try {
		long temp1;

		if (data.airTemp == null)
		    data.airTemp = new com.bah.ode.asn.oss.dsrc.AmbientAirTemperature();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 191);
		if (temp1 > 191)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.airTemp.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("airTemp", "AmbientAirTemperature");
		throw de;
	    }
	} else {
	    data.airTemp = null;
	}
	if (has_airPres0) {
	    // Decode field 'airPres'
	    try {
		long temp1;

		if (data.airPres == null)
		    data.airPres = new com.bah.ode.asn.oss.dsrc.AmbientAirPressure();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
		if (temp1 > 255)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.airPres.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("airPres", "AmbientAirPressure");
		throw de;
	    }
	} else {
	    data.airPres = null;
	}
	if (has_weatherReport0) {
	    // Decode field 'weatherReport'
	    try {
		if (data.weatherReport == null)
		    data.weatherReport = new WeatherReport();
		data.weatherReport.decodeValue(coder, source, data.weatherReport);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("weatherReport", "SEQUENCE");
		throw de;
	    }
	} else {
	    data.weatherReport = null;
	}
    /** Decode extensions **/
	if (!_has_extensions0) {
	    return data;
	}
	len0 = coder.decodeNormallySmallLength(source);
	if (coder.moreFragments())
	    throw new DecoderException(com.oss.util.ExceptionDescriptor._too_many_ext_additions, null, "16384 or more");
	int unknown_exts0 = 0;
	if (len0 > 0)
	    for (int idx0 = 0; idx0 < len0 - 0; idx0++) {
		if (source.readBit())
		    ++unknown_exts0;
	    }
    /** Decode extension fields **/
	bitstream0 = source;
	source = coder.createNestedStream(bitstream0);
	try {
	} finally {
	    source.close();
	}
	source = bitstream0;
	for (int idx0 = 0; idx0 < unknown_exts0; idx0++) {
	    try {
		com.oss.coders.per.PerOctets.skip(coder, source);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendExtensionContext(null, idx0);
		throw de;
	    }
	}
	return data;
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((Weather)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((Weather)that);
    }
    
    public boolean equalTo(Weather that) {
	if (this.wipers != null && that.wipers != null) {
	    if (!this.wipers.equalTo(that.wipers))
		return false;
	}
	if (this.airTemp != null && that.airTemp != null) {
	    if (!this.airTemp.equalTo(that.airTemp))
		return false;
	}
	if (this.airPres != null && that.airPres != null) {
	    if (!this.airPres.equalTo(that.airPres))
		return false;
	}
	if (this.weatherReport != null && that.weatherReport != null) {
	    if (!this.weatherReport.equalTo(that.weatherReport))
		return false;
	}
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public Weather clone() {
	Weather copy = (Weather)super.clone();
	if (wipers != null) {
	    copy.wipers = wipers.clone();
	}
	if (airTemp != null) {
	    copy.airTemp = airTemp.clone();
	}
	if (airPres != null) {
	    copy.airPres = airPres.clone();
	}
	if (weatherReport != null) {
	    copy.weatherReport = weatherReport.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.wipers != null ? this.wipers.hashCode() : 0);
	hash = 41 * hash + (this.airTemp != null ? this.airTemp.hashCode() : 0);
	hash = 41 * hash + (this.airPres != null ? this.airPres.hashCode() : 0);
	hash = 41 * hash + (this.weatherReport != null ? this.weatherReport.hashCode() : 0);
	return hash;
    }
} // End class definition for Weather
