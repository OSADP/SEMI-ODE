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
/* Created: Wed May 20 08:06:10 2015 */
/* ASN.1 Compiler for Java version: 6.1 */
/* ASN.1 compiler options and file names specified:
 * -toed -output com.bah.ode.asn.oss -per -uper -ber -der -root -messageFormat
 * msvc
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
 * Define the ASN1 Type VehicleStatus from ASN1 Module DSRC.
 * @see Sequence
 */

public class VehicleStatus extends Sequence {
    public ExteriorLights lights;
    public LightbarInUse lightBar;
    public Wipers wipers;
    public BrakeSystemStatus brakeStatus;
    public BrakeAppliedPressure brakePressure;
    public CoefficientOfFriction roadFriction;
    public SunSensor sunData;
    public RainSensor rainData;
    public AmbientAirTemperature airTemp;
    public AmbientAirPressure airPres;
    public Steering steering;
    public AccelSets accelSets;
    public Object object;
    public FullPositionVector fullPos;
    public ThrottlePosition throttlePos;
    public SpeedandHeadingandThrottleConfidence speedHeadC;
    public SpeedConfidence speedC;
    public VehicleData vehicleData;
    public VehicleIdent vehicleIdent;
    public J1939data j1939data;
    public WeatherReport weatherReport;
    public GPSstatus gpsStatus;
    
    /**
     * The default constructor.
     */
    public VehicleStatus()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public VehicleStatus(ExteriorLights lights, LightbarInUse lightBar, 
		    Wipers wipers, BrakeSystemStatus brakeStatus, 
		    BrakeAppliedPressure brakePressure, 
		    CoefficientOfFriction roadFriction, SunSensor sunData, 
		    RainSensor rainData, AmbientAirTemperature airTemp, 
		    AmbientAirPressure airPres, Steering steering, 
		    AccelSets accelSets, Object object, 
		    FullPositionVector fullPos, ThrottlePosition throttlePos, 
		    SpeedandHeadingandThrottleConfidence speedHeadC, 
		    SpeedConfidence speedC, VehicleData vehicleData, 
		    VehicleIdent vehicleIdent, J1939data j1939data, 
		    WeatherReport weatherReport, GPSstatus gpsStatus)
    {
	setLights(lights);
	setLightBar(lightBar);
	setWipers(wipers);
	setBrakeStatus(brakeStatus);
	setBrakePressure(brakePressure);
	setRoadFriction(roadFriction);
	setSunData(sunData);
	setRainData(rainData);
	setAirTemp(airTemp);
	setAirPres(airPres);
	setSteering(steering);
	setAccelSets(accelSets);
	setObject(object);
	setFullPos(fullPos);
	setThrottlePos(throttlePos);
	setSpeedHeadC(speedHeadC);
	setSpeedC(speedC);
	setVehicleData(vehicleData);
	setVehicleIdent(vehicleIdent);
	setJ1939data(j1939data);
	setWeatherReport(weatherReport);
	setGpsStatus(gpsStatus);
    }
    
    
    // Methods for field "lights"
    public ExteriorLights getLights()
    {
	return this.lights;
    }
    
    public void setLights(ExteriorLights lights)
    {
	this.lights = lights;
    }
    
    public boolean hasLights()
    {
	return (lights != null);
    }
    
    public void deleteLights()
    {
	lights = null;
    }
    
    
    // Methods for field "lightBar"
    public LightbarInUse getLightBar()
    {
	return this.lightBar;
    }
    
    public void setLightBar(LightbarInUse lightBar)
    {
	this.lightBar = lightBar;
    }
    
    public boolean hasLightBar()
    {
	return (lightBar != null);
    }
    
    public void deleteLightBar()
    {
	lightBar = null;
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
     * Define the ASN1 Type Wipers from ASN1 Module DSRC.
     * @see Sequence
     */
    public static class Wipers extends Sequence {
	public WiperStatusFront statusFront;
	public WiperRate rateFront;
	public WiperStatusRear statusRear;
	public WiperRate rateRear;
	
	/**
	 * The default constructor.
	 */
	public Wipers()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Wipers(WiperStatusFront statusFront, WiperRate rateFront, 
			WiperStatusRear statusRear, WiperRate rateRear)
	{
	    setStatusFront(statusFront);
	    setRateFront(rateFront);
	    setStatusRear(statusRear);
	    setRateRear(rateRear);
	}
	
	/**
	 * Construct with required components.
	 */
	public Wipers(WiperStatusFront statusFront, WiperRate rateFront)
	{
	    setStatusFront(statusFront);
	    setRateFront(rateFront);
	}
	
	
	// Methods for field "statusFront"
	public WiperStatusFront getStatusFront()
	{
	    return this.statusFront;
	}
	
	public void setStatusFront(WiperStatusFront statusFront)
	{
	    this.statusFront = statusFront;
	}
	
	
	// Methods for field "rateFront"
	public WiperRate getRateFront()
	{
	    return this.rateFront;
	}
	
	public void setRateFront(WiperRate rateFront)
	{
	    this.rateFront = rateFront;
	}
	
	
	// Methods for field "statusRear"
	public WiperStatusRear getStatusRear()
	{
	    return this.statusRear;
	}
	
	public void setStatusRear(WiperStatusRear statusRear)
	{
	    this.statusRear = statusRear;
	}
	
	public boolean hasStatusRear()
	{
	    return (statusRear != null);
	}
	
	public void deleteStatusRear()
	{
	    statusRear = null;
	}
	
	
	// Methods for field "rateRear"
	public WiperRate getRateRear()
	{
	    return this.rateRear;
	}
	
	public void setRateRear(WiperRate rateRear)
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

	    boolean has_statusRear0 = data.statusRear != null;
	    boolean has_rateRear0 = data.rateRear != null;
	    sink.writeBit(has_statusRear0); ++nbits;
	    sink.writeBit(has_rateRear0); ++nbits;
	    // Encode field 'statusFront'
	    try {
		WiperStatusFront item1 = data.statusFront;
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
		ee.appendFieldContext("statusFront", "WiperStatusFront");
		throw ee;
	    }
	    // Encode field 'rateFront'
	    try {
		WiperRate item1 = data.rateFront;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 127)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 127, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("rateFront", "WiperRate");
		throw ee;
	    }
	    if (has_statusRear0) {
		// Encode field 'statusRear'
		try {
		    WiperStatusRear item1 = data.statusRear;
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
		    ee.appendFieldContext("statusRear", "WiperStatusRear");
		    throw ee;
		}
	    }
	    if (has_rateRear0) {
		// Encode field 'rateRear'
		try {
		    WiperRate item1 = data.rateRear;
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
	    boolean has_statusRear0 = source.readBit();
	    boolean has_rateRear0 = source.readBit();
	    // Decode field 'statusFront'
	    try {
		int idx1;
		WiperStatusFront temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 6);
		    if (idx1 < 0 || idx1 > 6)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = WiperStatusFront.valueAt(idx1);
		} else {
		    idx1 = 7 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = WiperStatusFront.unknownEnumerator();
		}
		data.statusFront = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("statusFront", "WiperStatusFront");
		throw de;
	    }
	    // Decode field 'rateFront'
	    try {
		long temp1;

		if (data.rateFront == null)
		    data.rateFront = new WiperRate();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 127);
		if (temp1 > 127)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.rateFront.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("rateFront", "WiperRate");
		throw de;
	    }
	    if (has_statusRear0) {
		// Decode field 'statusRear'
		try {
		    int idx1;
		    WiperStatusRear temp1;
		    boolean extroot1 = !source.readBit();

		    if (extroot1) {
			idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 6);
			if (idx1 < 0 || idx1 > 6)
			    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
			temp1 = WiperStatusRear.valueAt(idx1);
		    } else {
			idx1 = 7 + (int)coder.decodeNormallySmallNumber(source);
			if (idx1 < 0)
			    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
			temp1 = WiperStatusRear.unknownEnumerator();
		    }
		    data.statusRear = temp1;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("statusRear", "WiperStatusRear");
		    throw de;
		}
	    } else {
		data.statusRear = null;
	    }
	    if (has_rateRear0) {
		// Decode field 'rateRear'
		try {
		    long temp1;

		    if (data.rateRear == null)
			data.rateRear = new WiperRate();
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
	    if (!this.statusFront.equalTo(that.statusFront))
		return false;
	    if (!this.rateFront.equalTo(that.rateFront))
		return false;
	    if (this.statusRear != null && that.statusRear != null) {
		if (!this.statusRear.equalTo(that.statusRear))
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
	    copy.statusFront = statusFront.clone();
	    copy.rateFront = rateFront.clone();
	    if (statusRear != null) {
		copy.statusRear = statusRear.clone();
	    }
	    if (rateRear != null) {
		copy.rateRear = rateRear.clone();
	    }
	    return copy;
	}

    } // End class definition for Wipers

    // Methods for field "brakeStatus"
    public BrakeSystemStatus getBrakeStatus()
    {
	return this.brakeStatus;
    }
    
    public void setBrakeStatus(BrakeSystemStatus brakeStatus)
    {
	this.brakeStatus = brakeStatus;
    }
    
    public boolean hasBrakeStatus()
    {
	return (brakeStatus != null);
    }
    
    public void deleteBrakeStatus()
    {
	brakeStatus = null;
    }
    
    
    // Methods for field "brakePressure"
    public BrakeAppliedPressure getBrakePressure()
    {
	return this.brakePressure;
    }
    
    public void setBrakePressure(BrakeAppliedPressure brakePressure)
    {
	this.brakePressure = brakePressure;
    }
    
    public boolean hasBrakePressure()
    {
	return (brakePressure != null);
    }
    
    public void deleteBrakePressure()
    {
	brakePressure = null;
    }
    
    
    // Methods for field "roadFriction"
    public CoefficientOfFriction getRoadFriction()
    {
	return this.roadFriction;
    }
    
    public void setRoadFriction(CoefficientOfFriction roadFriction)
    {
	this.roadFriction = roadFriction;
    }
    
    public boolean hasRoadFriction()
    {
	return (roadFriction != null);
    }
    
    public void deleteRoadFriction()
    {
	roadFriction = null;
    }
    
    
    // Methods for field "sunData"
    public SunSensor getSunData()
    {
	return this.sunData;
    }
    
    public void setSunData(SunSensor sunData)
    {
	this.sunData = sunData;
    }
    
    public boolean hasSunData()
    {
	return (sunData != null);
    }
    
    public void deleteSunData()
    {
	sunData = null;
    }
    
    
    // Methods for field "rainData"
    public RainSensor getRainData()
    {
	return this.rainData;
    }
    
    public void setRainData(RainSensor rainData)
    {
	this.rainData = rainData;
    }
    
    public boolean hasRainData()
    {
	return (rainData != null);
    }
    
    public void deleteRainData()
    {
	rainData = null;
    }
    
    
    // Methods for field "airTemp"
    public AmbientAirTemperature getAirTemp()
    {
	return this.airTemp;
    }
    
    public void setAirTemp(AmbientAirTemperature airTemp)
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
    public AmbientAirPressure getAirPres()
    {
	return this.airPres;
    }
    
    public void setAirPres(AmbientAirPressure airPres)
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
    
    
    // Methods for field "steering"
    public Steering getSteering()
    {
	return this.steering;
    }
    
    public void setSteering(Steering steering)
    {
	this.steering = steering;
    }
    
    public boolean hasSteering()
    {
	return (steering != null);
    }
    
    public void deleteSteering()
    {
	steering = null;
    }
    
    
    
    /**
     * Define the ASN1 Type Steering from ASN1 Module DSRC.
     * @see Sequence
     */
    public static class Steering extends Sequence {
	public SteeringWheelAngle angle;
	public SteeringWheelAngleConfidence confidence;
	public SteeringWheelAngleRateOfChange rate;
	public DrivingWheelAngle wheels;
	
	/**
	 * The default constructor.
	 */
	public Steering()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Steering(SteeringWheelAngle angle, 
			SteeringWheelAngleConfidence confidence, 
			SteeringWheelAngleRateOfChange rate, 
			DrivingWheelAngle wheels)
	{
	    setAngle(angle);
	    setConfidence(confidence);
	    setRate(rate);
	    setWheels(wheels);
	}
	
	/**
	 * Construct with required components.
	 */
	public Steering(SteeringWheelAngle angle)
	{
	    setAngle(angle);
	}
	
	
	// Methods for field "angle"
	public SteeringWheelAngle getAngle()
	{
	    return this.angle;
	}
	
	public void setAngle(SteeringWheelAngle angle)
	{
	    this.angle = angle;
	}
	
	
	// Methods for field "confidence"
	public SteeringWheelAngleConfidence getConfidence()
	{
	    return this.confidence;
	}
	
	public void setConfidence(SteeringWheelAngleConfidence confidence)
	{
	    this.confidence = confidence;
	}
	
	public boolean hasConfidence()
	{
	    return (confidence != null);
	}
	
	public void deleteConfidence()
	{
	    confidence = null;
	}
	
	
	// Methods for field "rate"
	public SteeringWheelAngleRateOfChange getRate()
	{
	    return this.rate;
	}
	
	public void setRate(SteeringWheelAngleRateOfChange rate)
	{
	    this.rate = rate;
	}
	
	public boolean hasRate()
	{
	    return (rate != null);
	}
	
	public void deleteRate()
	{
	    rate = null;
	}
	
	
	// Methods for field "wheels"
	public DrivingWheelAngle getWheels()
	{
	    return this.wheels;
	}
	
	public void setWheels(DrivingWheelAngle wheels)
	{
	    this.wheels = wheels;
	}
	
	public boolean hasWheels()
	{
	    return (wheels != null);
	}
	
	public void deleteWheels()
	{
	    wheels = null;
	}
	
	
	/**
	 * Implements PER value encoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public static int encodeValue(PerCoder coder, OutputBitStream sink, Steering data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int nbits = 0;

	    boolean has_confidence0 = data.confidence != null;
	    boolean has_rate0 = data.rate != null;
	    boolean has_wheels0 = data.wheels != null;
	    sink.writeBit(has_confidence0); ++nbits;
	    sink.writeBit(has_rate0); ++nbits;
	    sink.writeBit(has_wheels0); ++nbits;
	    // Encode field 'angle'
	    try {
		SteeringWheelAngle item1 = data.angle;
		int len1 = item1.getSize();

		if (len1 != 1)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 1, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("angle", "SteeringWheelAngle");
		throw ee;
	    }
	    if (has_confidence0) {
		// Encode field 'confidence'
		try {
		    SteeringWheelAngleConfidence item1 = data.confidence;
		    int idx1 = item1.indexOf();

		    if (idx1 < 0)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 3, sink));
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("confidence", "SteeringWheelAngleConfidence");
		    throw ee;
		}
	    }
	    if (has_rate0) {
		// Encode field 'rate'
		try {
		    SteeringWheelAngleRateOfChange item1 = data.rate;
		    long temp1 = item1.longValue();

		    if (temp1 < -127 || temp1 > 127)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		    nbits += coder.encodeConstrainedWholeNumber(temp1, -127, 127, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("rate", "SteeringWheelAngleRateOfChange");
		    throw ee;
		}
	    }
	    if (has_wheels0) {
		// Encode field 'wheels'
		try {
		    DrivingWheelAngle item1 = data.wheels;
		    long temp1 = item1.longValue();

		    if (temp1 < -127 || temp1 > 127)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		    nbits += coder.encodeConstrainedWholeNumber(temp1, -127, 127, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("wheels", "DrivingWheelAngle");
		    throw ee;
		}
	    }

	    return nbits;
	}

	/**
	 * Implements PER value decoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public static Steering decodeValue(PerCoder coder, InputBitStream source, Steering data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    boolean has_confidence0 = source.readBit();
	    boolean has_rate0 = source.readBit();
	    boolean has_wheels0 = source.readBit();
	    // Decode field 'angle'
	    try {
		data.angle = new SteeringWheelAngle(com.oss.coders.per.PerOctets.decode(coder, source, 1, 1));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("angle", "SteeringWheelAngle");
		throw de;
	    }
	    if (has_confidence0) {
		// Decode field 'confidence'
		try {
		    int idx1;

		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
		    if (idx1 < 0 || idx1 > 3)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    data.confidence = SteeringWheelAngleConfidence.valueAt(idx1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("confidence", "SteeringWheelAngleConfidence");
		    throw de;
		}
	    } else {
		data.confidence = null;
	    }
	    if (has_rate0) {
		// Decode field 'rate'
		try {
		    long temp1;

		    if (data.rate == null)
			data.rate = new SteeringWheelAngleRateOfChange();
		    temp1 = coder.decodeConstrainedWholeNumber(source, -127, 127);
		    if (temp1 > 127)
			throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		    data.rate.setValue(temp1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("rate", "SteeringWheelAngleRateOfChange");
		    throw de;
		}
	    } else {
		data.rate = null;
	    }
	    if (has_wheels0) {
		// Decode field 'wheels'
		try {
		    long temp1;

		    if (data.wheels == null)
			data.wheels = new DrivingWheelAngle();
		    temp1 = coder.decodeConstrainedWholeNumber(source, -127, 127);
		    if (temp1 > 127)
			throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		    data.wheels.setValue(temp1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("wheels", "DrivingWheelAngle");
		    throw de;
		}
	    } else {
		data.wheels = null;
	    }
	    return data;
	}

	/**
	 * Compare 'this' object to another object to see if their contents are the same.
	 */
	public boolean abstractEqualTo(AbstractData that)
	{
	    return equalTo((Steering)that);
	}
	
	public boolean equalTo(Sequence that)
	{
	    return equalTo((Steering)that);
	}
	
	public boolean equalTo(Steering that) {
	    if (!this.angle.equalTo(that.angle))
		return false;
	    if (this.confidence != null && that.confidence != null) {
		if (!this.confidence.equalTo(that.confidence))
		    return false;
	    }
	    if (this.rate != null && that.rate != null) {
		if (!this.rate.equalTo(that.rate))
		    return false;
	    }
	    if (this.wheels != null && that.wheels != null) {
		if (!this.wheels.equalTo(that.wheels))
		    return false;
	    }
	    return true;
	}

	/**
	 * Clone 'this' object.
	 */
	public Steering clone() {
	    Steering copy = (Steering)super.clone();
	    copy.angle = angle.clone();
	    if (confidence != null) {
		copy.confidence = confidence.clone();
	    }
	    if (rate != null) {
		copy.rate = rate.clone();
	    }
	    if (wheels != null) {
		copy.wheels = wheels.clone();
	    }
	    return copy;
	}

    } // End class definition for Steering

    // Methods for field "accelSets"
    public AccelSets getAccelSets()
    {
	return this.accelSets;
    }
    
    public void setAccelSets(AccelSets accelSets)
    {
	this.accelSets = accelSets;
    }
    
    public boolean hasAccelSets()
    {
	return (accelSets != null);
    }
    
    public void deleteAccelSets()
    {
	accelSets = null;
    }
    
    
    
    /**
     * Define the ASN1 Type AccelSets from ASN1 Module DSRC.
     * @see Sequence
     */
    public static class AccelSets extends Sequence {
	public AccelerationSet4Way accel4way;
	public VerticalAccelerationThreshold vertAccelThres;
	public YawRateConfidence yawRateCon;
	public AccelerationConfidence hozAccelCon;
	public ConfidenceSet confidenceSet;
	
	/**
	 * The default constructor.
	 */
	public AccelSets()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public AccelSets(AccelerationSet4Way accel4way, 
			VerticalAccelerationThreshold vertAccelThres, 
			YawRateConfidence yawRateCon, 
			AccelerationConfidence hozAccelCon, 
			ConfidenceSet confidenceSet)
	{
	    setAccel4way(accel4way);
	    setVertAccelThres(vertAccelThres);
	    setYawRateCon(yawRateCon);
	    setHozAccelCon(hozAccelCon);
	    setConfidenceSet(confidenceSet);
	}
	
	
	// Methods for field "accel4way"
	public AccelerationSet4Way getAccel4way()
	{
	    return this.accel4way;
	}
	
	public void setAccel4way(AccelerationSet4Way accel4way)
	{
	    this.accel4way = accel4way;
	}
	
	public boolean hasAccel4way()
	{
	    return (accel4way != null);
	}
	
	public void deleteAccel4way()
	{
	    accel4way = null;
	}
	
	
	// Methods for field "vertAccelThres"
	public VerticalAccelerationThreshold getVertAccelThres()
	{
	    return this.vertAccelThres;
	}
	
	public void setVertAccelThres(VerticalAccelerationThreshold vertAccelThres)
	{
	    this.vertAccelThres = vertAccelThres;
	}
	
	public boolean hasVertAccelThres()
	{
	    return (vertAccelThres != null);
	}
	
	public void deleteVertAccelThres()
	{
	    vertAccelThres = null;
	}
	
	
	// Methods for field "yawRateCon"
	public YawRateConfidence getYawRateCon()
	{
	    return this.yawRateCon;
	}
	
	public void setYawRateCon(YawRateConfidence yawRateCon)
	{
	    this.yawRateCon = yawRateCon;
	}
	
	public boolean hasYawRateCon()
	{
	    return (yawRateCon != null);
	}
	
	public void deleteYawRateCon()
	{
	    yawRateCon = null;
	}
	
	
	// Methods for field "hozAccelCon"
	public AccelerationConfidence getHozAccelCon()
	{
	    return this.hozAccelCon;
	}
	
	public void setHozAccelCon(AccelerationConfidence hozAccelCon)
	{
	    this.hozAccelCon = hozAccelCon;
	}
	
	public boolean hasHozAccelCon()
	{
	    return (hozAccelCon != null);
	}
	
	public void deleteHozAccelCon()
	{
	    hozAccelCon = null;
	}
	
	
	// Methods for field "confidenceSet"
	public ConfidenceSet getConfidenceSet()
	{
	    return this.confidenceSet;
	}
	
	public void setConfidenceSet(ConfidenceSet confidenceSet)
	{
	    this.confidenceSet = confidenceSet;
	}
	
	public boolean hasConfidenceSet()
	{
	    return (confidenceSet != null);
	}
	
	public void deleteConfidenceSet()
	{
	    confidenceSet = null;
	}
	
	
	/**
	 * Implements PER value encoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public static int encodeValue(PerCoder coder, OutputBitStream sink, AccelSets data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int nbits = 0;

	    boolean has_accel4way0 = data.accel4way != null;
	    boolean has_vertAccelThres0 = data.vertAccelThres != null;
	    boolean has_yawRateCon0 = data.yawRateCon != null;
	    boolean has_hozAccelCon0 = data.hozAccelCon != null;
	    boolean has_confidenceSet0 = data.confidenceSet != null;
	    sink.writeBit(has_accel4way0); ++nbits;
	    sink.writeBit(has_vertAccelThres0); ++nbits;
	    sink.writeBit(has_yawRateCon0); ++nbits;
	    sink.writeBit(has_hozAccelCon0); ++nbits;
	    sink.writeBit(has_confidenceSet0); ++nbits;
	    if (has_accel4way0) {
		// Encode field 'accel4way'
		try {
		    AccelerationSet4Way item1 = data.accel4way;
		    int len1 = item1.getSize();

		    if (len1 != 7)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 7, 7, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("accel4way", "AccelerationSet4Way");
		    throw ee;
		}
	    }
	    if (has_vertAccelThres0) {
		// Encode field 'vertAccelThres'
		try {
		    VerticalAccelerationThreshold item1 = data.vertAccelThres;
		    int len1 = item1.getSize();
		    int total_len1;

		    total_len1 = item1.getLastBit();
		    nbits += com.oss.coders.per.PerBitstring.encode(coder, item1.byteArrayValue(), len1, total_len1, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("vertAccelThres", "VerticalAccelerationThreshold");
		    throw ee;
		}
	    }
	    if (has_yawRateCon0) {
		// Encode field 'yawRateCon'
		try {
		    YawRateConfidence item1 = data.yawRateCon;
		    int idx1 = item1.indexOf();

		    if (idx1 < 0)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 7, sink));
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("yawRateCon", "YawRateConfidence");
		    throw ee;
		}
	    }
	    if (has_hozAccelCon0) {
		// Encode field 'hozAccelCon'
		try {
		    AccelerationConfidence item1 = data.hozAccelCon;
		    int idx1 = item1.indexOf();

		    if (idx1 < 0)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 7, sink));
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("hozAccelCon", "AccelerationConfidence");
		    throw ee;
		}
	    }
	    if (has_confidenceSet0) {
		// Encode field 'confidenceSet'
		try {
		    ConfidenceSet item1 = data.confidenceSet;

		    nbits += ConfidenceSet.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("confidenceSet", "ConfidenceSet");
		    throw ee;
		}
	    }

	    return nbits;
	}

	/**
	 * Implements PER value decoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public static AccelSets decodeValue(PerCoder coder, InputBitStream source, AccelSets data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    boolean has_accel4way0 = source.readBit();
	    boolean has_vertAccelThres0 = source.readBit();
	    boolean has_yawRateCon0 = source.readBit();
	    boolean has_hozAccelCon0 = source.readBit();
	    boolean has_confidenceSet0 = source.readBit();
	    if (has_accel4way0) {
		// Decode field 'accel4way'
		try {
		    data.accel4way = new AccelerationSet4Way(com.oss.coders.per.PerOctets.decode(coder, source, 7, 7));
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("accel4way", "AccelerationSet4Way");
		    throw de;
		}
	    } else {
		data.accel4way = null;
	    }
	    if (has_vertAccelThres0) {
		// Decode field 'vertAccelThres'
		try {
		    if (data.vertAccelThres == null)
			data.vertAccelThres = new VerticalAccelerationThreshold();
		    com.oss.coders.per.PerBitstring.decode(coder, source, -1, data.vertAccelThres);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("vertAccelThres", "VerticalAccelerationThreshold");
		    throw de;
		}
	    } else {
		data.vertAccelThres = null;
	    }
	    if (has_yawRateCon0) {
		// Decode field 'yawRateCon'
		try {
		    int idx1;

		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 7);
		    if (idx1 < 0 || idx1 > 7)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    data.yawRateCon = YawRateConfidence.valueAt(idx1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("yawRateCon", "YawRateConfidence");
		    throw de;
		}
	    } else {
		data.yawRateCon = null;
	    }
	    if (has_hozAccelCon0) {
		// Decode field 'hozAccelCon'
		try {
		    int idx1;

		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 7);
		    if (idx1 < 0 || idx1 > 7)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    data.hozAccelCon = AccelerationConfidence.valueAt(idx1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("hozAccelCon", "AccelerationConfidence");
		    throw de;
		}
	    } else {
		data.hozAccelCon = null;
	    }
	    if (has_confidenceSet0) {
		// Decode field 'confidenceSet'
		try {
		    if (data.confidenceSet == null)
			data.confidenceSet = new ConfidenceSet();
		    ConfidenceSet.decodeValue(coder, source, data.confidenceSet);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("confidenceSet", "ConfidenceSet");
		    throw de;
		}
	    } else {
		data.confidenceSet = null;
	    }
	    return data;
	}

	/**
	 * Compare 'this' object to another object to see if their contents are the same.
	 */
	public boolean abstractEqualTo(AbstractData that)
	{
	    return equalTo((AccelSets)that);
	}
	
	public boolean equalTo(Sequence that)
	{
	    return equalTo((AccelSets)that);
	}
	
	public boolean equalTo(AccelSets that) {
	    if (this.accel4way != null && that.accel4way != null) {
		if (!this.accel4way.equalTo(that.accel4way))
		    return false;
	    }
	    if (this.vertAccelThres != null && that.vertAccelThres != null) {
		if (!this.vertAccelThres.equalTo(that.vertAccelThres))
		    return false;
	    }
	    if (this.yawRateCon != null && that.yawRateCon != null) {
		if (!this.yawRateCon.equalTo(that.yawRateCon))
		    return false;
	    }
	    if (this.hozAccelCon != null && that.hozAccelCon != null) {
		if (!this.hozAccelCon.equalTo(that.hozAccelCon))
		    return false;
	    }
	    if (this.confidenceSet != null && that.confidenceSet != null) {
		if (!this.confidenceSet.equalTo(that.confidenceSet))
		    return false;
	    }
	    return true;
	}

	/**
	 * Clone 'this' object.
	 */
	public AccelSets clone() {
	    AccelSets copy = (AccelSets)super.clone();
	    if (accel4way != null) {
		copy.accel4way = accel4way.clone();
	    }
	    if (vertAccelThres != null) {
		copy.vertAccelThres = vertAccelThres.clone();
	    }
	    if (yawRateCon != null) {
		copy.yawRateCon = yawRateCon.clone();
	    }
	    if (hozAccelCon != null) {
		copy.hozAccelCon = hozAccelCon.clone();
	    }
	    if (confidenceSet != null) {
		copy.confidenceSet = confidenceSet.clone();
	    }
	    return copy;
	}

    } // End class definition for AccelSets

    // Methods for field "object"
    public Object getObject()
    {
	return this.object;
    }
    
    public void setObject(Object object)
    {
	this.object = object;
    }
    
    public boolean hasObject()
    {
	return (object != null);
    }
    
    public void deleteObject()
    {
	object = null;
    }
    
    
    
    /**
     * Define the ASN1 Type Object from ASN1 Module DSRC.
     * @see Sequence
     */
    public static class Object extends Sequence {
	public ObstacleDistance obDist;
	public ObstacleDirection obDirect;
	public DDateTime dateTime;
	
	/**
	 * The default constructor.
	 */
	public Object()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Object(ObstacleDistance obDist, ObstacleDirection obDirect, 
			DDateTime dateTime)
	{
	    setObDist(obDist);
	    setObDirect(obDirect);
	    setDateTime(dateTime);
	}
	
	
	// Methods for field "obDist"
	public ObstacleDistance getObDist()
	{
	    return this.obDist;
	}
	
	public void setObDist(ObstacleDistance obDist)
	{
	    this.obDist = obDist;
	}
	
	
	// Methods for field "obDirect"
	public ObstacleDirection getObDirect()
	{
	    return this.obDirect;
	}
	
	public void setObDirect(ObstacleDirection obDirect)
	{
	    this.obDirect = obDirect;
	}
	
	
	// Methods for field "dateTime"
	public DDateTime getDateTime()
	{
	    return this.dateTime;
	}
	
	public void setDateTime(DDateTime dateTime)
	{
	    this.dateTime = dateTime;
	}
	
	
	/**
	 * Implements PER value encoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public static int encodeValue(PerCoder coder, OutputBitStream sink, Object data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int nbits = 0;

	    // Encode field 'obDist'
	    try {
		ObstacleDistance item1 = data.obDist;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 32767)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += (coder.encodeConstrainedWholeNumber(temp1, 0, 32767, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("obDist", "ObstacleDistance");
		throw ee;
	    }
	    // Encode field 'obDirect'
	    try {
		ObstacleDirection item1 = data.obDirect;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 28800)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 28800, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("obDirect", "ObstacleDirection");
		throw ee;
	    }
	    // Encode field 'dateTime'
	    try {
		DDateTime item1 = data.dateTime;

		nbits += DDateTime.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("dateTime", "DDateTime");
		throw ee;
	    }

	    return nbits;
	}

	/**
	 * Implements PER value decoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public static Object decodeValue(PerCoder coder, InputBitStream source, Object data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    // Decode field 'obDist'
	    try {
		long temp1;

		if (data.obDist == null)
		    data.obDist = new ObstacleDistance();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 32767);
		if (temp1 > 32767)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.obDist.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("obDist", "ObstacleDistance");
		throw de;
	    }
	    // Decode field 'obDirect'
	    try {
		long temp1;

		if (data.obDirect == null)
		    data.obDirect = new ObstacleDirection();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 28800);
		if (temp1 > 28800)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.obDirect.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("obDirect", "ObstacleDirection");
		throw de;
	    }
	    // Decode field 'dateTime'
	    try {
		if (data.dateTime == null)
		    data.dateTime = new DDateTime();
		DDateTime.decodeValue(coder, source, data.dateTime);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("dateTime", "DDateTime");
		throw de;
	    }
	    return data;
	}

	/**
	 * Compare 'this' object to another object to see if their contents are the same.
	 */
	public boolean abstractEqualTo(AbstractData that)
	{
	    return equalTo((Object)that);
	}
	
	public boolean equalTo(Sequence that)
	{
	    return equalTo((Object)that);
	}
	
	public boolean equalTo(Object that) {
	    if (!this.obDist.equalTo(that.obDist))
		return false;
	    if (!this.obDirect.equalTo(that.obDirect))
		return false;
	    if (!this.dateTime.equalTo(that.dateTime))
		return false;
	    return true;
	}

	/**
	 * Clone 'this' object.
	 */
	public Object clone() {
	    Object copy = (Object)super.clone();
	    copy.obDist = obDist.clone();
	    copy.obDirect = obDirect.clone();
	    copy.dateTime = dateTime.clone();
	    return copy;
	}

    } // End class definition for Object

    // Methods for field "fullPos"
    public FullPositionVector getFullPos()
    {
	return this.fullPos;
    }
    
    public void setFullPos(FullPositionVector fullPos)
    {
	this.fullPos = fullPos;
    }
    
    public boolean hasFullPos()
    {
	return (fullPos != null);
    }
    
    public void deleteFullPos()
    {
	fullPos = null;
    }
    
    
    // Methods for field "throttlePos"
    public ThrottlePosition getThrottlePos()
    {
	return this.throttlePos;
    }
    
    public void setThrottlePos(ThrottlePosition throttlePos)
    {
	this.throttlePos = throttlePos;
    }
    
    public boolean hasThrottlePos()
    {
	return (throttlePos != null);
    }
    
    public void deleteThrottlePos()
    {
	throttlePos = null;
    }
    
    
    // Methods for field "speedHeadC"
    public SpeedandHeadingandThrottleConfidence getSpeedHeadC()
    {
	return this.speedHeadC;
    }
    
    public void setSpeedHeadC(SpeedandHeadingandThrottleConfidence speedHeadC)
    {
	this.speedHeadC = speedHeadC;
    }
    
    public boolean hasSpeedHeadC()
    {
	return (speedHeadC != null);
    }
    
    public void deleteSpeedHeadC()
    {
	speedHeadC = null;
    }
    
    
    // Methods for field "speedC"
    public SpeedConfidence getSpeedC()
    {
	return this.speedC;
    }
    
    public void setSpeedC(SpeedConfidence speedC)
    {
	this.speedC = speedC;
    }
    
    public boolean hasSpeedC()
    {
	return (speedC != null);
    }
    
    public void deleteSpeedC()
    {
	speedC = null;
    }
    
    
    // Methods for field "vehicleData"
    public VehicleData getVehicleData()
    {
	return this.vehicleData;
    }
    
    public void setVehicleData(VehicleData vehicleData)
    {
	this.vehicleData = vehicleData;
    }
    
    public boolean hasVehicleData()
    {
	return (vehicleData != null);
    }
    
    public void deleteVehicleData()
    {
	vehicleData = null;
    }
    
    
    
    /**
     * Define the ASN1 Type VehicleData from ASN1 Module DSRC.
     * @see Sequence
     */
    public static class VehicleData extends Sequence {
	public VehicleHeight height;
	public BumperHeights bumpers;
	public VehicleMass mass;
	public TrailerWeight trailerWeight;
	public VehicleType type;
	
	/**
	 * The default constructor.
	 */
	public VehicleData()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public VehicleData(VehicleHeight height, BumperHeights bumpers, 
			VehicleMass mass, TrailerWeight trailerWeight, 
			VehicleType type)
	{
	    setHeight(height);
	    setBumpers(bumpers);
	    setMass(mass);
	    setTrailerWeight(trailerWeight);
	    setType(type);
	}
	
	
	// Methods for field "height"
	public VehicleHeight getHeight()
	{
	    return this.height;
	}
	
	public void setHeight(VehicleHeight height)
	{
	    this.height = height;
	}
	
	
	// Methods for field "bumpers"
	public BumperHeights getBumpers()
	{
	    return this.bumpers;
	}
	
	public void setBumpers(BumperHeights bumpers)
	{
	    this.bumpers = bumpers;
	}
	
	
	// Methods for field "mass"
	public VehicleMass getMass()
	{
	    return this.mass;
	}
	
	public void setMass(VehicleMass mass)
	{
	    this.mass = mass;
	}
	
	
	// Methods for field "trailerWeight"
	public TrailerWeight getTrailerWeight()
	{
	    return this.trailerWeight;
	}
	
	public void setTrailerWeight(TrailerWeight trailerWeight)
	{
	    this.trailerWeight = trailerWeight;
	}
	
	
	// Methods for field "type"
	public VehicleType getType()
	{
	    return this.type;
	}
	
	public void setType(VehicleType type)
	{
	    this.type = type;
	}
	
	
	/**
	 * Implements PER value encoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public static int encodeValue(PerCoder coder, OutputBitStream sink, VehicleData data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int nbits = 0;

	    // Encode field 'height'
	    try {
		VehicleHeight item1 = data.height;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 127)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += (coder.encodeConstrainedWholeNumber(temp1, 0, 127, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("height", "VehicleHeight");
		throw ee;
	    }
	    // Encode field 'bumpers'
	    try {
		BumperHeights item1 = data.bumpers;

		nbits += BumperHeights.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("bumpers", "BumperHeights");
		throw ee;
	    }
	    // Encode field 'mass'
	    try {
		VehicleMass item1 = data.mass;
		long temp1 = item1.longValue();

		if (temp1 < 1 || temp1 > 127)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 1, 127, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("mass", "VehicleMass");
		throw ee;
	    }
	    // Encode field 'trailerWeight'
	    try {
		TrailerWeight item1 = data.trailerWeight;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 65535)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 65535, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("trailerWeight", "TrailerWeight");
		throw ee;
	    }
	    // Encode field 'type'
	    try {
		VehicleType item1 = data.type;
		int idx1;
		boolean extroot1 = true;

		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else {
		    idx1 = item1.indexOf();
		    if (idx1 < 0)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    extroot1 = idx1 < 16;
		}
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 15, sink);
		else
		    nbits += coder.encodeNormallySmallNumber(idx1 - 16, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("type", "VehicleType");
		throw ee;
	    }

	    return nbits;
	}

	/**
	 * Implements PER value decoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public static VehicleData decodeValue(PerCoder coder, InputBitStream source, VehicleData data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    // Decode field 'height'
	    try {
		long temp1;

		if (data.height == null)
		    data.height = new VehicleHeight();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 127);
		if (temp1 > 127)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.height.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("height", "VehicleHeight");
		throw de;
	    }
	    // Decode field 'bumpers'
	    try {
		if (data.bumpers == null)
		    data.bumpers = new BumperHeights();
		BumperHeights.decodeValue(coder, source, data.bumpers);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("bumpers", "BumperHeights");
		throw de;
	    }
	    // Decode field 'mass'
	    try {
		long temp1;

		if (data.mass == null)
		    data.mass = new VehicleMass();
		temp1 = coder.decodeConstrainedWholeNumber(source, 1, 127);
		if (temp1 > 127)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.mass.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("mass", "VehicleMass");
		throw de;
	    }
	    // Decode field 'trailerWeight'
	    try {
		long temp1;

		if (data.trailerWeight == null)
		    data.trailerWeight = new TrailerWeight();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 65535);
		if (temp1 > 65535)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.trailerWeight.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("trailerWeight", "TrailerWeight");
		throw de;
	    }
	    // Decode field 'type'
	    try {
		int idx1;
		VehicleType temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 15);
		    if (idx1 < 0 || idx1 > 15)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = VehicleType.valueAt(idx1);
		} else {
		    idx1 = 16 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = VehicleType.unknownEnumerator();
		}
		data.type = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("type", "VehicleType");
		throw de;
	    }
	    return data;
	}

	/**
	 * Compare 'this' object to another object to see if their contents are the same.
	 */
	public boolean abstractEqualTo(AbstractData that)
	{
	    return equalTo((VehicleData)that);
	}
	
	public boolean equalTo(Sequence that)
	{
	    return equalTo((VehicleData)that);
	}
	
	public boolean equalTo(VehicleData that) {
	    if (!this.height.equalTo(that.height))
		return false;
	    if (!this.bumpers.equalTo(that.bumpers))
		return false;
	    if (!this.mass.equalTo(that.mass))
		return false;
	    if (!this.trailerWeight.equalTo(that.trailerWeight))
		return false;
	    if (!this.type.equalTo(that.type))
		return false;
	    return true;
	}

	/**
	 * Clone 'this' object.
	 */
	public VehicleData clone() {
	    VehicleData copy = (VehicleData)super.clone();
	    copy.height = height.clone();
	    copy.bumpers = bumpers.clone();
	    copy.mass = mass.clone();
	    copy.trailerWeight = trailerWeight.clone();
	    copy.type = type.clone();
	    return copy;
	}

    } // End class definition for VehicleData

    // Methods for field "vehicleIdent"
    public VehicleIdent getVehicleIdent()
    {
	return this.vehicleIdent;
    }
    
    public void setVehicleIdent(VehicleIdent vehicleIdent)
    {
	this.vehicleIdent = vehicleIdent;
    }
    
    public boolean hasVehicleIdent()
    {
	return (vehicleIdent != null);
    }
    
    public void deleteVehicleIdent()
    {
	vehicleIdent = null;
    }
    
    
    // Methods for field "j1939data"
    public J1939data getJ1939data()
    {
	return this.j1939data;
    }
    
    public void setJ1939data(J1939data j1939data)
    {
	this.j1939data = j1939data;
    }
    
    public boolean hasJ1939data()
    {
	return (j1939data != null);
    }
    
    public void deleteJ1939data()
    {
	j1939data = null;
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
     * Define the ASN1 Type WeatherReport from ASN1 Module DSRC.
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

	    boolean has_rainRate0 = data.rainRate != null;
	    boolean has_precipSituation0 = data.precipSituation != null;
	    boolean has_solarRadiation0 = data.solarRadiation != null;
	    boolean has_friction0 = data.friction != null;
	    sink.writeBit(has_rainRate0); ++nbits;
	    sink.writeBit(has_precipSituation0); ++nbits;
	    sink.writeBit(has_solarRadiation0); ++nbits;
	    sink.writeBit(has_friction0); ++nbits;
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
	    if (has_rainRate0) {
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
	    if (has_precipSituation0) {
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
	    if (has_solarRadiation0) {
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
	    if (has_friction0) {
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

    } // End class definition for WeatherReport

    // Methods for field "gpsStatus"
    public GPSstatus getGpsStatus()
    {
	return this.gpsStatus;
    }
    
    public void setGpsStatus(GPSstatus gpsStatus)
    {
	this.gpsStatus = gpsStatus;
    }
    
    public boolean hasGpsStatus()
    {
	return (gpsStatus != null);
    }
    
    public void deleteGpsStatus()
    {
	gpsStatus = null;
    }
    
    
    /**
     * Implements BER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encodeValue(BerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	int len0 = 0;
	VehicleStatus temp0 = this;

	if (temp0.gpsStatus != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeBitString(temp0.gpsStatus, sink), 0x95);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("gpsStatus", "GPSstatus");
		throw ee;
	    }
	}
	if (temp0.weatherReport != null) {
	    try {
		int len1 = 0;
		WeatherReport temp1 = temp0.weatherReport;

		if (temp1.friction != null) {
		    try {
			len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.friction, sink), 0x84);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("friction", "EssMobileFriction");
			throw ee;
		    }
		}
		if (temp1.solarRadiation != null) {
		    try {
			len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.solarRadiation, sink), 0x83);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("solarRadiation", "EssSolarRadiation");
			throw ee;
		    }
		}
		if (temp1.precipSituation != null) {
		    try {
			len1 += sink.encodeLengthTag(coder.encodeEnumerated(temp1.precipSituation, sink), 0x82);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("precipSituation", "EssPrecipSituation");
			throw ee;
		    }
		}
		if (temp1.rainRate != null) {
		    try {
			len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.rainRate, sink), 0x81);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("rainRate", "EssPrecipRate");
			throw ee;
		    }
		}
		try {
		    len1 += sink.encodeLengthTag(coder.encodeEnumerated(temp1.isRaining, sink), 0x80);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("isRaining", "EssPrecipYesNo");
		    throw ee;
		}
		len0 += sink.encodeLengthTag(len1, 0xB4);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("weatherReport", "SEQUENCE");
		throw ee;
	    }
	}
	if (temp0.j1939data != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.j1939data.encodeValue(coder, sink), 0xB3);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("j1939data", "J1939data");
		throw ee;
	    }
	}
	if (temp0.vehicleIdent != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.vehicleIdent.encodeValue(coder, sink), 0xB2);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("vehicleIdent", "VehicleIdent");
		throw ee;
	    }
	}
	if (temp0.vehicleData != null) {
	    try {
		int len1 = 0;
		VehicleData temp1 = temp0.vehicleData;

		try {
		    len1 += sink.encodeLengthTag(coder.encodeEnumerated(temp1.type, sink), 0x84);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("type", "VehicleType");
		    throw ee;
		}
		try {
		    len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.trailerWeight, sink), 0x83);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("trailerWeight", "TrailerWeight");
		    throw ee;
		}
		try {
		    len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.mass, sink), 0x82);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("mass", "VehicleMass");
		    throw ee;
		}
		try {
		    len1 += sink.encodeLengthTag(temp1.bumpers.encodeValue(coder, sink), 0xA1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("bumpers", "BumperHeights");
		    throw ee;
		}
		try {
		    len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.height, sink), 0x80);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("height", "VehicleHeight");
		    throw ee;
		}
		len0 += sink.encodeLengthTag(len1, 0xB1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("vehicleData", "SEQUENCE");
		throw ee;
	    }
	}
	if (temp0.speedC != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.speedC, sink), 0x90);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("speedC", "SpeedConfidence");
		throw ee;
	    }
	}
	if (temp0.speedHeadC != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.speedHeadC.byteArrayValue()), 0x8F);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("speedHeadC", "SpeedandHeadingandThrottleConfidence");
		throw ee;
	    }
	}
	if (temp0.throttlePos != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.throttlePos, sink), 0x8E);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("throttlePos", "ThrottlePosition");
		throw ee;
	    }
	}
	if (temp0.fullPos != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.fullPos.encodeValue(coder, sink), 0xAD);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("fullPos", "FullPositionVector");
		throw ee;
	    }
	}
	if (temp0.object != null) {
	    try {
		int len1 = 0;
		Object temp1 = temp0.object;

		try {
		    len1 += sink.encodeLengthTag(temp1.dateTime.encodeValue(coder, sink), 0xA2);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("dateTime", "DDateTime");
		    throw ee;
		}
		try {
		    len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.obDirect, sink), 0x81);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("obDirect", "ObstacleDirection");
		    throw ee;
		}
		try {
		    len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.obDist, sink), 0x80);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("obDist", "ObstacleDistance");
		    throw ee;
		}
		len0 += sink.encodeLengthTag(len1, 0xAC);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("object", "SEQUENCE");
		throw ee;
	    }
	}
	if (temp0.accelSets != null) {
	    try {
		int len1 = 0;
		AccelSets temp1 = temp0.accelSets;

		if (temp1.confidenceSet != null) {
		    try {
			len1 += sink.encodeLengthTag(temp1.confidenceSet.encodeValue(coder, sink), 0xA4);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("confidenceSet", "ConfidenceSet");
			throw ee;
		    }
		}
		if (temp1.hozAccelCon != null) {
		    try {
			len1 += sink.encodeLengthTag(coder.encodeEnumerated(temp1.hozAccelCon, sink), 0x83);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("hozAccelCon", "AccelerationConfidence");
			throw ee;
		    }
		}
		if (temp1.yawRateCon != null) {
		    try {
			len1 += sink.encodeLengthTag(coder.encodeEnumerated(temp1.yawRateCon, sink), 0x82);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("yawRateCon", "YawRateConfidence");
			throw ee;
		    }
		}
		if (temp1.vertAccelThres != null) {
		    try {
			len1 += sink.encodeLengthTag(coder.encodeBitString(temp1.vertAccelThres, sink), 0x81);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("vertAccelThres", "VerticalAccelerationThreshold");
			throw ee;
		    }
		}
		if (temp1.accel4way != null) {
		    try {
			len1 += sink.encodeLengthTag(sink.write(temp1.accel4way.byteArrayValue()), 0x80);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("accel4way", "AccelerationSet4Way");
			throw ee;
		    }
		}
		len0 += sink.encodeLengthTag(len1, 0xAB);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("accelSets", "SEQUENCE");
		throw ee;
	    }
	}
	if (temp0.steering != null) {
	    try {
		int len1 = 0;
		Steering temp1 = temp0.steering;

		if (temp1.wheels != null) {
		    try {
			len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.wheels, sink), 0x83);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("wheels", "DrivingWheelAngle");
			throw ee;
		    }
		}
		if (temp1.rate != null) {
		    try {
			len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.rate, sink), 0x82);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("rate", "SteeringWheelAngleRateOfChange");
			throw ee;
		    }
		}
		if (temp1.confidence != null) {
		    try {
			len1 += sink.encodeLengthTag(coder.encodeEnumerated(temp1.confidence, sink), 0x81);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("confidence", "SteeringWheelAngleConfidence");
			throw ee;
		    }
		}
		try {
		    len1 += sink.encodeLengthTag(sink.write(temp1.angle.byteArrayValue()), 0x80);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("angle", "SteeringWheelAngle");
		    throw ee;
		}
		len0 += sink.encodeLengthTag(len1, 0xAA);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("steering", "SEQUENCE");
		throw ee;
	    }
	}
	if (temp0.airPres != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.airPres, sink), 0x89);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("airPres", "AmbientAirPressure");
		throw ee;
	    }
	}
	if (temp0.airTemp != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.airTemp, sink), 0x88);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("airTemp", "AmbientAirTemperature");
		throw ee;
	    }
	}
	if (temp0.rainData != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.rainData, sink), 0x87);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("rainData", "RainSensor");
		throw ee;
	    }
	}
	if (temp0.sunData != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.sunData, sink), 0x86);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("sunData", "SunSensor");
		throw ee;
	    }
	}
	if (temp0.roadFriction != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.roadFriction, sink), 0x85);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("roadFriction", "CoefficientOfFriction");
		throw ee;
	    }
	}
	if (temp0.brakePressure != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.brakePressure, sink), 0x84);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("brakePressure", "BrakeAppliedPressure");
		throw ee;
	    }
	}
	if (temp0.brakeStatus != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.brakeStatus.byteArrayValue()), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("brakeStatus", "BrakeSystemStatus");
		throw ee;
	    }
	}
	if (temp0.wipers != null) {
	    try {
		int len1 = 0;
		Wipers temp1 = temp0.wipers;

		if (temp1.rateRear != null) {
		    try {
			len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.rateRear, sink), 0x83);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("rateRear", "WiperRate");
			throw ee;
		    }
		}
		if (temp1.statusRear != null) {
		    try {
			len1 += sink.encodeLengthTag(coder.encodeEnumerated(temp1.statusRear, sink), 0x82);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("statusRear", "WiperStatusRear");
			throw ee;
		    }
		}
		try {
		    len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.rateFront, sink), 0x81);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("rateFront", "WiperRate");
		    throw ee;
		}
		try {
		    len1 += sink.encodeLengthTag(coder.encodeEnumerated(temp1.statusFront, sink), 0x80);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("statusFront", "WiperStatusFront");
		    throw ee;
		}
		len0 += sink.encodeLengthTag(len1, 0xA2);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("wipers", "SEQUENCE");
		throw ee;
	    }
	}
	if (temp0.lightBar != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.lightBar, sink), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("lightBar", "LightbarInUse");
		throw ee;
	    }
	}
	if (temp0.lights != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.lights, sink), 0x80);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("lights", "ExteriorLights");
		throw ee;
	    }
	}

	return len0;
    }

    /**
     * Implements BER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public VehicleStatus decodeValue(BerCoder coder, DecoderInput source)
	    throws DecoderException
    {
	int total_len0 = source.mLength;
	int end_pos0 = (total_len0 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len0);
	int tag;

	do {
	    if (source.position() >= end_pos0)
		break;
	    tag = source.decodeTagLength();
	    if (tag == 0)
		break;
	    if (tag == 0x80) {
		try {
		    this.lights = new ExteriorLights(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("lights", "ExteriorLights");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x81) {
		try {
		    int idx1 = LightbarInUse.indexOfValue(source.decodeInt());
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
		    this.lightBar = LightbarInUse.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("lightBar", "LightbarInUse");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xA2) {
		try {
		    this.wipers = new Wipers();
		    {
			int total_len1 = source.mLength;
			int end_pos1 = (total_len1 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len1);

			do {
			    tag = source.decodeTagLength();
			    if (tag != 0x80)
				source.raiseTagMismatchException(tag);
			    try {
				int idx2 = WiperStatusFront.indexOfValue(source.decodeLong());
				this.wipers.statusFront = (idx2 < 0) ? WiperStatusFront.unknownEnumerator() : WiperStatusFront.cNamedNumbers[idx2];
			    } catch (Exception e) {
				DecoderException ee = DecoderException.wrapException(e);
				ee.appendFieldContext("statusFront", "WiperStatusFront");
				throw ee;
			    }
			    tag = source.decodeTagLength();
			    if (tag != 0x81)
				source.raiseTagMismatchException(tag);
			    try {
				this.wipers.rateFront = new WiperRate(source.decodeLong());
			    } catch (Exception e) {
				DecoderException ee = DecoderException.wrapException(e);
				ee.appendFieldContext("rateFront", "WiperRate");
				throw ee;
			    }
			    if (source.position() >= end_pos1)
				break;
			    tag = source.decodeTagLength();
			    if (tag == 0)
				break;
			    if (tag == 0x82) {
				try {
				    int idx2 = WiperStatusRear.indexOfValue(source.decodeLong());
				    this.wipers.statusRear = (idx2 < 0) ? WiperStatusRear.unknownEnumerator() : WiperStatusRear.cNamedNumbers[idx2];
				} catch (Exception e) {
				    DecoderException ee = DecoderException.wrapException(e);
				    ee.appendFieldContext("statusRear", "WiperStatusRear");
				    throw ee;
				}
				if (source.position() >= end_pos1)
				    break;
				tag = source.decodeTagLength();
				if (tag == 0)
				    break;
			    }
			    if (tag == 0x83) {
				try {
				    this.wipers.rateRear = new WiperRate(source.decodeLong());
				} catch (Exception e) {
				    DecoderException ee = DecoderException.wrapException(e);
				    ee.appendFieldContext("rateRear", "WiperRate");
				    throw ee;
				}
				if (source.position() >= end_pos1)
				    break;
				tag = source.decodeTagLength();
				if (tag == 0)
				    break;
			    }
			    source.raiseUnknownFieldException(tag);
			} while(false);

			if (source.position() > end_pos1)
			    throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
			if (total_len1 < 0 && source.mLength != 0)
			    throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);
		    }
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("wipers", "SEQUENCE");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x83 || tag == 0xA3) {
		try {
		    this.brakeStatus = new BrakeSystemStatus(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("brakeStatus", "BrakeSystemStatus");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x84) {
		try {
		    int idx1 = BrakeAppliedPressure.indexOfValue(source.decodeInt());
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
		    this.brakePressure = BrakeAppliedPressure.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("brakePressure", "BrakeAppliedPressure");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x85) {
		try {
		    this.roadFriction = new CoefficientOfFriction(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("roadFriction", "CoefficientOfFriction");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x86) {
		try {
		    this.sunData = new SunSensor(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("sunData", "SunSensor");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x87) {
		try {
		    int idx1 = RainSensor.indexOfValue(source.decodeInt());
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
		    this.rainData = RainSensor.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("rainData", "RainSensor");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x88) {
		try {
		    this.airTemp = new AmbientAirTemperature(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("airTemp", "AmbientAirTemperature");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x89) {
		try {
		    this.airPres = new AmbientAirPressure(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("airPres", "AmbientAirPressure");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xAA) {
		try {
		    this.steering = new Steering();
		    {
			int total_len1 = source.mLength;
			int end_pos1 = (total_len1 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len1);

			do {
			    tag = source.decodeTagLength();
			    if (tag != 0x80 && tag != 0xA0)
				source.raiseTagMismatchException(tag);
			    try {
				this.steering.angle = new SteeringWheelAngle(coder.decodeOctetString(source));
			    } catch (Exception e) {
				DecoderException ee = DecoderException.wrapException(e);
				ee.appendFieldContext("angle", "SteeringWheelAngle");
				throw ee;
			    }
			    if (source.position() >= end_pos1)
				break;
			    tag = source.decodeTagLength();
			    if (tag == 0)
				break;
			    if (tag == 0x81) {
				try {
				    int idx2 = SteeringWheelAngleConfidence.indexOfValue(source.decodeInt());
				    if (idx2 < 0)
					throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
				    this.steering.confidence = SteeringWheelAngleConfidence.cNamedNumbers[idx2];
				} catch (Exception e) {
				    DecoderException ee = DecoderException.wrapException(e);
				    ee.appendFieldContext("confidence", "SteeringWheelAngleConfidence");
				    throw ee;
				}
				if (source.position() >= end_pos1)
				    break;
				tag = source.decodeTagLength();
				if (tag == 0)
				    break;
			    }
			    if (tag == 0x82) {
				try {
				    this.steering.rate = new SteeringWheelAngleRateOfChange(source.decodeLong());
				} catch (Exception e) {
				    DecoderException ee = DecoderException.wrapException(e);
				    ee.appendFieldContext("rate", "SteeringWheelAngleRateOfChange");
				    throw ee;
				}
				if (source.position() >= end_pos1)
				    break;
				tag = source.decodeTagLength();
				if (tag == 0)
				    break;
			    }
			    if (tag == 0x83) {
				try {
				    this.steering.wheels = new DrivingWheelAngle(source.decodeLong());
				} catch (Exception e) {
				    DecoderException ee = DecoderException.wrapException(e);
				    ee.appendFieldContext("wheels", "DrivingWheelAngle");
				    throw ee;
				}
				if (source.position() >= end_pos1)
				    break;
				tag = source.decodeTagLength();
				if (tag == 0)
				    break;
			    }
			    source.raiseUnknownFieldException(tag);
			} while(false);

			if (source.position() > end_pos1)
			    throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
			if (total_len1 < 0 && source.mLength != 0)
			    throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);
		    }
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("steering", "SEQUENCE");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xAB) {
		try {
		    this.accelSets = new AccelSets();
		    {
			int total_len1 = source.mLength;
			int end_pos1 = (total_len1 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len1);

			do {
			    if (source.position() >= end_pos1)
				break;
			    tag = source.decodeTagLength();
			    if (tag == 0)
				break;
			    if (tag == 0x80 || tag == 0xA0) {
				try {
				    this.accelSets.accel4way = new AccelerationSet4Way(coder.decodeOctetString(source));
				} catch (Exception e) {
				    DecoderException ee = DecoderException.wrapException(e);
				    ee.appendFieldContext("accel4way", "AccelerationSet4Way");
				    throw ee;
				}
				if (source.position() >= end_pos1)
				    break;
				tag = source.decodeTagLength();
				if (tag == 0)
				    break;
			    }
			    if (tag == 0x81 || tag == 0xA1) {
				try {
				    this.accelSets.vertAccelThres = new VerticalAccelerationThreshold();
				    byte[] b = coder.decodeBitString(source);
				    this.accelSets.vertAccelThres.setValue(b, b.length * 8 - coder.getUnused());
				} catch (Exception e) {
				    DecoderException ee = DecoderException.wrapException(e);
				    ee.appendFieldContext("vertAccelThres", "VerticalAccelerationThreshold");
				    throw ee;
				}
				if (source.position() >= end_pos1)
				    break;
				tag = source.decodeTagLength();
				if (tag == 0)
				    break;
			    }
			    if (tag == 0x82) {
				try {
				    int idx2 = YawRateConfidence.indexOfValue(source.decodeInt());
				    if (idx2 < 0)
					throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
				    this.accelSets.yawRateCon = YawRateConfidence.cNamedNumbers[idx2];
				} catch (Exception e) {
				    DecoderException ee = DecoderException.wrapException(e);
				    ee.appendFieldContext("yawRateCon", "YawRateConfidence");
				    throw ee;
				}
				if (source.position() >= end_pos1)
				    break;
				tag = source.decodeTagLength();
				if (tag == 0)
				    break;
			    }
			    if (tag == 0x83) {
				try {
				    int idx2 = AccelerationConfidence.indexOfValue(source.decodeInt());
				    if (idx2 < 0)
					throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
				    this.accelSets.hozAccelCon = AccelerationConfidence.cNamedNumbers[idx2];
				} catch (Exception e) {
				    DecoderException ee = DecoderException.wrapException(e);
				    ee.appendFieldContext("hozAccelCon", "AccelerationConfidence");
				    throw ee;
				}
				if (source.position() >= end_pos1)
				    break;
				tag = source.decodeTagLength();
				if (tag == 0)
				    break;
			    }
			    if (tag == 0xA4) {
				try {
				    this.accelSets.confidenceSet = new ConfidenceSet();
				    this.accelSets.confidenceSet.decodeValue(coder, source);
				} catch (Exception e) {
				    DecoderException ee = DecoderException.wrapException(e);
				    ee.appendFieldContext("confidenceSet", "ConfidenceSet");
				    throw ee;
				}
				if (source.position() >= end_pos1)
				    break;
				tag = source.decodeTagLength();
				if (tag == 0)
				    break;
			    }
			    source.raiseUnknownFieldException(tag);
			} while(false);

			if (source.position() > end_pos1)
			    throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
			if (total_len1 < 0 && source.mLength != 0)
			    throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);
		    }
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("accelSets", "SEQUENCE");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xAC) {
		try {
		    this.object = new Object();
		    {
			int total_len1 = source.mLength;
			int end_pos1 = (total_len1 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len1);

			tag = source.decodeTagLength();
			if (tag != 0x80)
			    source.raiseTagMismatchException(tag);
			try {
			    this.object.obDist = new ObstacleDistance(source.decodeLong());
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("obDist", "ObstacleDistance");
			    throw ee;
			}
			tag = source.decodeTagLength();
			if (tag != 0x81)
			    source.raiseTagMismatchException(tag);
			try {
			    this.object.obDirect = new ObstacleDirection(source.decodeLong());
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("obDirect", "ObstacleDirection");
			    throw ee;
			}
			tag = source.decodeTagLength();
			if (tag != 0xA2)
			    source.raiseTagMismatchException(tag);
			try {
			    this.object.dateTime = new DDateTime();
			    this.object.dateTime.decodeValue(coder, source);
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("dateTime", "DDateTime");
			    throw ee;
			}
			if (source.position() != end_pos1) {
			    if (total_len1 >= 0)
				throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
			    tag = source.decodeTagLength();
			    if (tag != 0 || source.mLength != 0)
				throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);
			}
		    }
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("object", "SEQUENCE");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xAD) {
		try {
		    this.fullPos = new FullPositionVector();
		    this.fullPos.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("fullPos", "FullPositionVector");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x8E) {
		try {
		    this.throttlePos = new ThrottlePosition(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("throttlePos", "ThrottlePosition");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x8F || tag == 0xAF) {
		try {
		    this.speedHeadC = new SpeedandHeadingandThrottleConfidence(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("speedHeadC", "SpeedandHeadingandThrottleConfidence");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x90) {
		try {
		    int idx1 = SpeedConfidence.indexOfValue(source.decodeInt());
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
		    this.speedC = SpeedConfidence.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("speedC", "SpeedConfidence");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xB1) {
		try {
		    this.vehicleData = new VehicleData();
		    {
			int total_len1 = source.mLength;
			int end_pos1 = (total_len1 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len1);

			tag = source.decodeTagLength();
			if (tag != 0x80)
			    source.raiseTagMismatchException(tag);
			try {
			    this.vehicleData.height = new VehicleHeight(source.decodeLong());
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("height", "VehicleHeight");
			    throw ee;
			}
			tag = source.decodeTagLength();
			if (tag != 0xA1)
			    source.raiseTagMismatchException(tag);
			try {
			    this.vehicleData.bumpers = new BumperHeights();
			    this.vehicleData.bumpers.decodeValue(coder, source);
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("bumpers", "BumperHeights");
			    throw ee;
			}
			tag = source.decodeTagLength();
			if (tag != 0x82)
			    source.raiseTagMismatchException(tag);
			try {
			    this.vehicleData.mass = new VehicleMass(source.decodeLong());
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("mass", "VehicleMass");
			    throw ee;
			}
			tag = source.decodeTagLength();
			if (tag != 0x83)
			    source.raiseTagMismatchException(tag);
			try {
			    this.vehicleData.trailerWeight = new TrailerWeight(source.decodeLong());
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("trailerWeight", "TrailerWeight");
			    throw ee;
			}
			tag = source.decodeTagLength();
			if (tag != 0x84)
			    source.raiseTagMismatchException(tag);
			try {
			    int idx2 = VehicleType.indexOfValue(source.decodeLong());
			    this.vehicleData.type = (idx2 < 0) ? VehicleType.unknownEnumerator() : VehicleType.cNamedNumbers[idx2];
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("type", "VehicleType");
			    throw ee;
			}
			if (source.position() != end_pos1) {
			    if (total_len1 >= 0)
				throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
			    tag = source.decodeTagLength();
			    if (tag != 0 || source.mLength != 0)
				throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);
			}
		    }
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("vehicleData", "SEQUENCE");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xB2) {
		try {
		    this.vehicleIdent = new VehicleIdent();
		    this.vehicleIdent.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("vehicleIdent", "VehicleIdent");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xB3) {
		try {
		    this.j1939data = new J1939data();
		    this.j1939data.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("j1939data", "J1939data");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xB4) {
		try {
		    this.weatherReport = new WeatherReport();
		    {
			int total_len1 = source.mLength;
			int end_pos1 = (total_len1 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len1);

			do {
			    tag = source.decodeTagLength();
			    if (tag != 0x80)
				source.raiseTagMismatchException(tag);
			    try {
				int idx2 = com.bah.ode.asn.oss.ntcip.EssPrecipYesNo.indexOfValue(source.decodeInt());
				if (idx2 < 0)
				    throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
				this.weatherReport.isRaining = com.bah.ode.asn.oss.ntcip.EssPrecipYesNo.cNamedNumbers[idx2];
			    } catch (Exception e) {
				DecoderException ee = DecoderException.wrapException(e);
				ee.appendFieldContext("isRaining", "EssPrecipYesNo");
				throw ee;
			    }
			    if (source.position() >= end_pos1)
				break;
			    tag = source.decodeTagLength();
			    if (tag == 0)
				break;
			    if (tag == 0x81) {
				try {
				    this.weatherReport.rainRate = new com.bah.ode.asn.oss.ntcip.EssPrecipRate(source.decodeLong());
				} catch (Exception e) {
				    DecoderException ee = DecoderException.wrapException(e);
				    ee.appendFieldContext("rainRate", "EssPrecipRate");
				    throw ee;
				}
				if (source.position() >= end_pos1)
				    break;
				tag = source.decodeTagLength();
				if (tag == 0)
				    break;
			    }
			    if (tag == 0x82) {
				try {
				    int idx2 = com.bah.ode.asn.oss.ntcip.EssPrecipSituation.indexOfValue(source.decodeInt());
				    if (idx2 < 0)
					throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
				    this.weatherReport.precipSituation = com.bah.ode.asn.oss.ntcip.EssPrecipSituation.cNamedNumbers[idx2];
				} catch (Exception e) {
				    DecoderException ee = DecoderException.wrapException(e);
				    ee.appendFieldContext("precipSituation", "EssPrecipSituation");
				    throw ee;
				}
				if (source.position() >= end_pos1)
				    break;
				tag = source.decodeTagLength();
				if (tag == 0)
				    break;
			    }
			    if (tag == 0x83) {
				try {
				    this.weatherReport.solarRadiation = new com.bah.ode.asn.oss.ntcip.EssSolarRadiation(source.decodeLong());
				} catch (Exception e) {
				    DecoderException ee = DecoderException.wrapException(e);
				    ee.appendFieldContext("solarRadiation", "EssSolarRadiation");
				    throw ee;
				}
				if (source.position() >= end_pos1)
				    break;
				tag = source.decodeTagLength();
				if (tag == 0)
				    break;
			    }
			    if (tag == 0x84) {
				try {
				    this.weatherReport.friction = new com.bah.ode.asn.oss.ntcip.EssMobileFriction(source.decodeLong());
				} catch (Exception e) {
				    DecoderException ee = DecoderException.wrapException(e);
				    ee.appendFieldContext("friction", "EssMobileFriction");
				    throw ee;
				}
				if (source.position() >= end_pos1)
				    break;
				tag = source.decodeTagLength();
				if (tag == 0)
				    break;
			    }
			    source.raiseUnknownFieldException(tag);
			} while(false);

			if (source.position() > end_pos1)
			    throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
			if (total_len1 < 0 && source.mLength != 0)
			    throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);
		    }
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("weatherReport", "SEQUENCE");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x95 || tag == 0xB5) {
		try {
		    this.gpsStatus = new GPSstatus();
		    byte[] b = coder.decodeBitString(source);
		    this.gpsStatus.setValue(b, b.length * 8 - coder.getUnused());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("gpsStatus", "GPSstatus");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    for (;;) {
		try {
		    coder.skipContents(source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendExtensionContext("VehicleStatus", -1);
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	} while(false);

	if (source.position() > end_pos0)
	    throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
	if (total_len0 < 0 && source.mLength != 0)
	    throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);

	return this;
    }

    /**
     * Implements BER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encodeValue(DerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	int len0 = 0;
	VehicleStatus temp0 = this;

	if (temp0.gpsStatus != null) {
	    try {
		int bitsToTransfer = com.oss.util.BitTool.truncateTrailingZeroes(temp0.gpsStatus);
		len0 += sink.encodeLengthTag(coder.encodeBitString(temp0.gpsStatus, sink, bitsToTransfer), 0x95);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("gpsStatus", "GPSstatus");
		throw ee;
	    }
	}
	if (temp0.weatherReport != null) {
	    try {
		int len1 = 0;
		WeatherReport temp1 = temp0.weatherReport;

		if (temp1.friction != null) {
		    try {
			len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.friction, sink), 0x84);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("friction", "EssMobileFriction");
			throw ee;
		    }
		}
		if (temp1.solarRadiation != null) {
		    try {
			len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.solarRadiation, sink), 0x83);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("solarRadiation", "EssSolarRadiation");
			throw ee;
		    }
		}
		if (temp1.precipSituation != null) {
		    try {
			len1 += sink.encodeLengthTag(coder.encodeEnumerated(temp1.precipSituation, sink), 0x82);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("precipSituation", "EssPrecipSituation");
			throw ee;
		    }
		}
		if (temp1.rainRate != null) {
		    try {
			len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.rainRate, sink), 0x81);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("rainRate", "EssPrecipRate");
			throw ee;
		    }
		}
		try {
		    len1 += sink.encodeLengthTag(coder.encodeEnumerated(temp1.isRaining, sink), 0x80);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("isRaining", "EssPrecipYesNo");
		    throw ee;
		}
		len0 += sink.encodeLengthTag(len1, 0xB4);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("weatherReport", "SEQUENCE");
		throw ee;
	    }
	}
	if (temp0.j1939data != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.j1939data.encodeValue(coder, sink), 0xB3);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("j1939data", "J1939data");
		throw ee;
	    }
	}
	if (temp0.vehicleIdent != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.vehicleIdent.encodeValue(coder, sink), 0xB2);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("vehicleIdent", "VehicleIdent");
		throw ee;
	    }
	}
	if (temp0.vehicleData != null) {
	    try {
		int len1 = 0;
		VehicleData temp1 = temp0.vehicleData;

		try {
		    len1 += sink.encodeLengthTag(coder.encodeEnumerated(temp1.type, sink), 0x84);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("type", "VehicleType");
		    throw ee;
		}
		try {
		    len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.trailerWeight, sink), 0x83);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("trailerWeight", "TrailerWeight");
		    throw ee;
		}
		try {
		    len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.mass, sink), 0x82);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("mass", "VehicleMass");
		    throw ee;
		}
		try {
		    len1 += sink.encodeLengthTag(temp1.bumpers.encodeValue(coder, sink), 0xA1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("bumpers", "BumperHeights");
		    throw ee;
		}
		try {
		    len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.height, sink), 0x80);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("height", "VehicleHeight");
		    throw ee;
		}
		len0 += sink.encodeLengthTag(len1, 0xB1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("vehicleData", "SEQUENCE");
		throw ee;
	    }
	}
	if (temp0.speedC != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.speedC, sink), 0x90);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("speedC", "SpeedConfidence");
		throw ee;
	    }
	}
	if (temp0.speedHeadC != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.speedHeadC.byteArrayValue()), 0x8F);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("speedHeadC", "SpeedandHeadingandThrottleConfidence");
		throw ee;
	    }
	}
	if (temp0.throttlePos != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.throttlePos, sink), 0x8E);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("throttlePos", "ThrottlePosition");
		throw ee;
	    }
	}
	if (temp0.fullPos != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.fullPos.encodeValue(coder, sink), 0xAD);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("fullPos", "FullPositionVector");
		throw ee;
	    }
	}
	if (temp0.object != null) {
	    try {
		int len1 = 0;
		Object temp1 = temp0.object;

		try {
		    len1 += sink.encodeLengthTag(temp1.dateTime.encodeValue(coder, sink), 0xA2);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("dateTime", "DDateTime");
		    throw ee;
		}
		try {
		    len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.obDirect, sink), 0x81);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("obDirect", "ObstacleDirection");
		    throw ee;
		}
		try {
		    len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.obDist, sink), 0x80);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("obDist", "ObstacleDistance");
		    throw ee;
		}
		len0 += sink.encodeLengthTag(len1, 0xAC);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("object", "SEQUENCE");
		throw ee;
	    }
	}
	if (temp0.accelSets != null) {
	    try {
		int len1 = 0;
		AccelSets temp1 = temp0.accelSets;

		if (temp1.confidenceSet != null) {
		    try {
			len1 += sink.encodeLengthTag(temp1.confidenceSet.encodeValue(coder, sink), 0xA4);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("confidenceSet", "ConfidenceSet");
			throw ee;
		    }
		}
		if (temp1.hozAccelCon != null) {
		    try {
			len1 += sink.encodeLengthTag(coder.encodeEnumerated(temp1.hozAccelCon, sink), 0x83);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("hozAccelCon", "AccelerationConfidence");
			throw ee;
		    }
		}
		if (temp1.yawRateCon != null) {
		    try {
			len1 += sink.encodeLengthTag(coder.encodeEnumerated(temp1.yawRateCon, sink), 0x82);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("yawRateCon", "YawRateConfidence");
			throw ee;
		    }
		}
		if (temp1.vertAccelThres != null) {
		    try {
			int bitsToTransfer = com.oss.util.BitTool.truncateTrailingZeroes(temp1.vertAccelThres);
			len1 += sink.encodeLengthTag(coder.encodeBitString(temp1.vertAccelThres, sink, bitsToTransfer), 0x81);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("vertAccelThres", "VerticalAccelerationThreshold");
			throw ee;
		    }
		}
		if (temp1.accel4way != null) {
		    try {
			len1 += sink.encodeLengthTag(sink.write(temp1.accel4way.byteArrayValue()), 0x80);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("accel4way", "AccelerationSet4Way");
			throw ee;
		    }
		}
		len0 += sink.encodeLengthTag(len1, 0xAB);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("accelSets", "SEQUENCE");
		throw ee;
	    }
	}
	if (temp0.steering != null) {
	    try {
		int len1 = 0;
		Steering temp1 = temp0.steering;

		if (temp1.wheels != null) {
		    try {
			len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.wheels, sink), 0x83);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("wheels", "DrivingWheelAngle");
			throw ee;
		    }
		}
		if (temp1.rate != null) {
		    try {
			len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.rate, sink), 0x82);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("rate", "SteeringWheelAngleRateOfChange");
			throw ee;
		    }
		}
		if (temp1.confidence != null) {
		    try {
			len1 += sink.encodeLengthTag(coder.encodeEnumerated(temp1.confidence, sink), 0x81);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("confidence", "SteeringWheelAngleConfidence");
			throw ee;
		    }
		}
		try {
		    len1 += sink.encodeLengthTag(sink.write(temp1.angle.byteArrayValue()), 0x80);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("angle", "SteeringWheelAngle");
		    throw ee;
		}
		len0 += sink.encodeLengthTag(len1, 0xAA);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("steering", "SEQUENCE");
		throw ee;
	    }
	}
	if (temp0.airPres != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.airPres, sink), 0x89);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("airPres", "AmbientAirPressure");
		throw ee;
	    }
	}
	if (temp0.airTemp != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.airTemp, sink), 0x88);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("airTemp", "AmbientAirTemperature");
		throw ee;
	    }
	}
	if (temp0.rainData != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.rainData, sink), 0x87);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("rainData", "RainSensor");
		throw ee;
	    }
	}
	if (temp0.sunData != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.sunData, sink), 0x86);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("sunData", "SunSensor");
		throw ee;
	    }
	}
	if (temp0.roadFriction != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.roadFriction, sink), 0x85);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("roadFriction", "CoefficientOfFriction");
		throw ee;
	    }
	}
	if (temp0.brakePressure != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.brakePressure, sink), 0x84);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("brakePressure", "BrakeAppliedPressure");
		throw ee;
	    }
	}
	if (temp0.brakeStatus != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.brakeStatus.byteArrayValue()), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("brakeStatus", "BrakeSystemStatus");
		throw ee;
	    }
	}
	if (temp0.wipers != null) {
	    try {
		int len1 = 0;
		Wipers temp1 = temp0.wipers;

		if (temp1.rateRear != null) {
		    try {
			len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.rateRear, sink), 0x83);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("rateRear", "WiperRate");
			throw ee;
		    }
		}
		if (temp1.statusRear != null) {
		    try {
			len1 += sink.encodeLengthTag(coder.encodeEnumerated(temp1.statusRear, sink), 0x82);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("statusRear", "WiperStatusRear");
			throw ee;
		    }
		}
		try {
		    len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.rateFront, sink), 0x81);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("rateFront", "WiperRate");
		    throw ee;
		}
		try {
		    len1 += sink.encodeLengthTag(coder.encodeEnumerated(temp1.statusFront, sink), 0x80);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("statusFront", "WiperStatusFront");
		    throw ee;
		}
		len0 += sink.encodeLengthTag(len1, 0xA2);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("wipers", "SEQUENCE");
		throw ee;
	    }
	}
	if (temp0.lightBar != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.lightBar, sink), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("lightBar", "LightbarInUse");
		throw ee;
	    }
	}
	if (temp0.lights != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.lights, sink), 0x80);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("lights", "ExteriorLights");
		throw ee;
	    }
	}

	return len0;
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, VehicleStatus data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	boolean has_lights0 = data.lights != null;
	boolean has_lightBar0 = data.lightBar != null;
	boolean has_wipers0 = data.wipers != null;
	boolean has_brakeStatus0 = data.brakeStatus != null;
	boolean has_brakePressure0 = data.brakePressure != null;
	boolean has_roadFriction0 = data.roadFriction != null;
	boolean has_sunData0 = data.sunData != null;
	boolean has_rainData0 = data.rainData != null;
	boolean has_airTemp0 = data.airTemp != null;
	boolean has_airPres0 = data.airPres != null;
	boolean has_steering0 = data.steering != null;
	boolean has_accelSets0 = data.accelSets != null;
	boolean has_object0 = data.object != null;
	boolean has_fullPos0 = data.fullPos != null;
	boolean has_throttlePos0 = data.throttlePos != null;
	boolean has_speedHeadC0 = data.speedHeadC != null;
	boolean has_speedC0 = data.speedC != null;
	boolean has_vehicleData0 = data.vehicleData != null;
	boolean has_vehicleIdent0 = data.vehicleIdent != null;
	boolean has_j1939data0 = data.j1939data != null;
	boolean has_weatherReport0 = data.weatherReport != null;
	boolean has_gpsStatus0 = data.gpsStatus != null;
	sink.writeBit(false); ++nbits;
	sink.writeBit(has_lights0); ++nbits;
	sink.writeBit(has_lightBar0); ++nbits;
	sink.writeBit(has_wipers0); ++nbits;
	sink.writeBit(has_brakeStatus0); ++nbits;
	sink.writeBit(has_brakePressure0); ++nbits;
	sink.writeBit(has_roadFriction0); ++nbits;
	sink.writeBit(has_sunData0); ++nbits;
	sink.writeBit(has_rainData0); ++nbits;
	sink.writeBit(has_airTemp0); ++nbits;
	sink.writeBit(has_airPres0); ++nbits;
	sink.writeBit(has_steering0); ++nbits;
	sink.writeBit(has_accelSets0); ++nbits;
	sink.writeBit(has_object0); ++nbits;
	sink.writeBit(has_fullPos0); ++nbits;
	sink.writeBit(has_throttlePos0); ++nbits;
	sink.writeBit(has_speedHeadC0); ++nbits;
	sink.writeBit(has_speedC0); ++nbits;
	sink.writeBit(has_vehicleData0); ++nbits;
	sink.writeBit(has_vehicleIdent0); ++nbits;
	sink.writeBit(has_j1939data0); ++nbits;
	sink.writeBit(has_weatherReport0); ++nbits;
	sink.writeBit(has_gpsStatus0); ++nbits;
	if (has_lights0) {
	    // Encode field 'lights'
	    try {
		ExteriorLights item1 = data.lights;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 256)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 256, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("lights", "ExteriorLights");
		throw ee;
	    }
	}
	if (has_lightBar0) {
	    // Encode field 'lightBar'
	    try {
		LightbarInUse item1 = data.lightBar;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 9, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("lightBar", "LightbarInUse");
		throw ee;
	    }
	}
	if (has_wipers0) {
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
	if (has_brakeStatus0) {
	    // Encode field 'brakeStatus'
	    try {
		BrakeSystemStatus item1 = data.brakeStatus;
		int len1 = item1.getSize();

		if (len1 != 2)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 2, 2, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("brakeStatus", "BrakeSystemStatus");
		throw ee;
	    }
	}
	if (has_brakePressure0) {
	    // Encode field 'brakePressure'
	    try {
		BrakeAppliedPressure item1 = data.brakePressure;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 15, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("brakePressure", "BrakeAppliedPressure");
		throw ee;
	    }
	}
	if (has_roadFriction0) {
	    // Encode field 'roadFriction'
	    try {
		CoefficientOfFriction item1 = data.roadFriction;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 50)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 50, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("roadFriction", "CoefficientOfFriction");
		throw ee;
	    }
	}
	if (has_sunData0) {
	    // Encode field 'sunData'
	    try {
		SunSensor item1 = data.sunData;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 1000)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 1000, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("sunData", "SunSensor");
		throw ee;
	    }
	}
	if (has_rainData0) {
	    // Encode field 'rainData'
	    try {
		RainSensor item1 = data.rainData;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 7, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("rainData", "RainSensor");
		throw ee;
	    }
	}
	if (has_airTemp0) {
	    // Encode field 'airTemp'
	    try {
		AmbientAirTemperature item1 = data.airTemp;
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
	if (has_airPres0) {
	    // Encode field 'airPres'
	    try {
		AmbientAirPressure item1 = data.airPres;
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
	if (has_steering0) {
	    // Encode field 'steering'
	    try {
		Steering item1 = data.steering;

		nbits += Steering.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("steering", "SEQUENCE");
		throw ee;
	    }
	}
	if (has_accelSets0) {
	    // Encode field 'accelSets'
	    try {
		AccelSets item1 = data.accelSets;

		nbits += AccelSets.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("accelSets", "SEQUENCE");
		throw ee;
	    }
	}
	if (has_object0) {
	    // Encode field 'object'
	    try {
		Object item1 = data.object;

		nbits += Object.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("object", "SEQUENCE");
		throw ee;
	    }
	}
	if (has_fullPos0) {
	    // Encode field 'fullPos'
	    try {
		FullPositionVector item1 = data.fullPos;

		nbits += FullPositionVector.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("fullPos", "FullPositionVector");
		throw ee;
	    }
	}
	if (has_throttlePos0) {
	    // Encode field 'throttlePos'
	    try {
		ThrottlePosition item1 = data.throttlePos;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 200)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 200, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("throttlePos", "ThrottlePosition");
		throw ee;
	    }
	}
	if (has_speedHeadC0) {
	    // Encode field 'speedHeadC'
	    try {
		SpeedandHeadingandThrottleConfidence item1 = data.speedHeadC;
		int len1 = item1.getSize();

		if (len1 != 1)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 1, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("speedHeadC", "SpeedandHeadingandThrottleConfidence");
		throw ee;
	    }
	}
	if (has_speedC0) {
	    // Encode field 'speedC'
	    try {
		SpeedConfidence item1 = data.speedC;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 7, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("speedC", "SpeedConfidence");
		throw ee;
	    }
	}
	if (has_vehicleData0) {
	    // Encode field 'vehicleData'
	    try {
		VehicleData item1 = data.vehicleData;

		nbits += VehicleData.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("vehicleData", "SEQUENCE");
		throw ee;
	    }
	}
	if (has_vehicleIdent0) {
	    // Encode field 'vehicleIdent'
	    try {
		VehicleIdent item1 = data.vehicleIdent;

		nbits += VehicleIdent.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("vehicleIdent", "VehicleIdent");
		throw ee;
	    }
	}
	if (has_j1939data0) {
	    // Encode field 'j1939data'
	    try {
		J1939data item1 = data.j1939data;

		nbits += J1939data.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("j1939data", "J1939data");
		throw ee;
	    }
	}
	if (has_weatherReport0) {
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
	if (has_gpsStatus0) {
	    // Encode field 'gpsStatus'
	    try {
		GPSstatus item1 = data.gpsStatus;
		int len1 = item1.getSize();
		int total_len1;

		total_len1 = item1.getLastBit();
		nbits += com.oss.coders.per.PerBitstring.encode(coder, item1.byteArrayValue(), len1, total_len1, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("gpsStatus", "GPSstatus");
		throw ee;
	    }
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static VehicleStatus decodeValue(PerCoder coder, InputBitStream source, VehicleStatus data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	int idx0;
	InputBitStream bitstream0 = null;

	boolean has_lights0 = source.readBit();
	boolean has_lightBar0 = source.readBit();
	boolean has_wipers0 = source.readBit();
	boolean has_brakeStatus0 = source.readBit();
	boolean has_brakePressure0 = source.readBit();
	boolean has_roadFriction0 = source.readBit();
	boolean has_sunData0 = source.readBit();
	boolean has_rainData0 = source.readBit();
	boolean has_airTemp0 = source.readBit();
	boolean has_airPres0 = source.readBit();
	boolean has_steering0 = source.readBit();
	boolean has_accelSets0 = source.readBit();
	boolean has_object0 = source.readBit();
	boolean has_fullPos0 = source.readBit();
	boolean has_throttlePos0 = source.readBit();
	boolean has_speedHeadC0 = source.readBit();
	boolean has_speedC0 = source.readBit();
	boolean has_vehicleData0 = source.readBit();
	boolean has_vehicleIdent0 = source.readBit();
	boolean has_j1939data0 = source.readBit();
	boolean has_weatherReport0 = source.readBit();
	boolean has_gpsStatus0 = source.readBit();
	if (has_lights0) {
	    // Decode field 'lights'
	    try {
		long temp1;

		if (data.lights == null)
		    data.lights = new ExteriorLights();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 256);
		if (temp1 > 256)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.lights.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("lights", "ExteriorLights");
		throw de;
	    }
	} else {
	    data.lights = null;
	}
	if (has_lightBar0) {
	    // Decode field 'lightBar'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 9);
		if (idx1 < 0 || idx1 > 9)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.lightBar = LightbarInUse.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("lightBar", "LightbarInUse");
		throw de;
	    }
	} else {
	    data.lightBar = null;
	}
	if (has_wipers0) {
	    // Decode field 'wipers'
	    try {
		if (data.wipers == null)
		    data.wipers = new Wipers();
		Wipers.decodeValue(coder, source, data.wipers);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("wipers", "SEQUENCE");
		throw de;
	    }
	} else {
	    data.wipers = null;
	}
	if (has_brakeStatus0) {
	    // Decode field 'brakeStatus'
	    try {
		data.brakeStatus = new BrakeSystemStatus(com.oss.coders.per.PerOctets.decode(coder, source, 2, 2));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("brakeStatus", "BrakeSystemStatus");
		throw de;
	    }
	} else {
	    data.brakeStatus = null;
	}
	if (has_brakePressure0) {
	    // Decode field 'brakePressure'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 15);
		if (idx1 < 0 || idx1 > 15)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.brakePressure = BrakeAppliedPressure.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("brakePressure", "BrakeAppliedPressure");
		throw de;
	    }
	} else {
	    data.brakePressure = null;
	}
	if (has_roadFriction0) {
	    // Decode field 'roadFriction'
	    try {
		long temp1;

		if (data.roadFriction == null)
		    data.roadFriction = new CoefficientOfFriction();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 50);
		if (temp1 > 50)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.roadFriction.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("roadFriction", "CoefficientOfFriction");
		throw de;
	    }
	} else {
	    data.roadFriction = null;
	}
	if (has_sunData0) {
	    // Decode field 'sunData'
	    try {
		long temp1;

		if (data.sunData == null)
		    data.sunData = new SunSensor();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 1000);
		if (temp1 > 1000)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.sunData.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("sunData", "SunSensor");
		throw de;
	    }
	} else {
	    data.sunData = null;
	}
	if (has_rainData0) {
	    // Decode field 'rainData'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 7);
		if (idx1 < 0 || idx1 > 7)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.rainData = RainSensor.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("rainData", "RainSensor");
		throw de;
	    }
	} else {
	    data.rainData = null;
	}
	if (has_airTemp0) {
	    // Decode field 'airTemp'
	    try {
		long temp1;

		if (data.airTemp == null)
		    data.airTemp = new AmbientAirTemperature();
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
		    data.airPres = new AmbientAirPressure();
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
	if (has_steering0) {
	    // Decode field 'steering'
	    try {
		if (data.steering == null)
		    data.steering = new Steering();
		Steering.decodeValue(coder, source, data.steering);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("steering", "SEQUENCE");
		throw de;
	    }
	} else {
	    data.steering = null;
	}
	if (has_accelSets0) {
	    // Decode field 'accelSets'
	    try {
		if (data.accelSets == null)
		    data.accelSets = new AccelSets();
		AccelSets.decodeValue(coder, source, data.accelSets);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("accelSets", "SEQUENCE");
		throw de;
	    }
	} else {
	    data.accelSets = null;
	}
	if (has_object0) {
	    // Decode field 'object'
	    try {
		if (data.object == null)
		    data.object = new Object();
		Object.decodeValue(coder, source, data.object);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("object", "SEQUENCE");
		throw de;
	    }
	} else {
	    data.object = null;
	}
	if (has_fullPos0) {
	    // Decode field 'fullPos'
	    try {
		if (data.fullPos == null)
		    data.fullPos = new FullPositionVector();
		FullPositionVector.decodeValue(coder, source, data.fullPos);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("fullPos", "FullPositionVector");
		throw de;
	    }
	} else {
	    data.fullPos = null;
	}
	if (has_throttlePos0) {
	    // Decode field 'throttlePos'
	    try {
		long temp1;

		if (data.throttlePos == null)
		    data.throttlePos = new ThrottlePosition();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 200);
		if (temp1 > 200)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.throttlePos.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("throttlePos", "ThrottlePosition");
		throw de;
	    }
	} else {
	    data.throttlePos = null;
	}
	if (has_speedHeadC0) {
	    // Decode field 'speedHeadC'
	    try {
		data.speedHeadC = new SpeedandHeadingandThrottleConfidence(com.oss.coders.per.PerOctets.decode(coder, source, 1, 1));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("speedHeadC", "SpeedandHeadingandThrottleConfidence");
		throw de;
	    }
	} else {
	    data.speedHeadC = null;
	}
	if (has_speedC0) {
	    // Decode field 'speedC'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 7);
		if (idx1 < 0 || idx1 > 7)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.speedC = SpeedConfidence.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("speedC", "SpeedConfidence");
		throw de;
	    }
	} else {
	    data.speedC = null;
	}
	if (has_vehicleData0) {
	    // Decode field 'vehicleData'
	    try {
		if (data.vehicleData == null)
		    data.vehicleData = new VehicleData();
		VehicleData.decodeValue(coder, source, data.vehicleData);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("vehicleData", "SEQUENCE");
		throw de;
	    }
	} else {
	    data.vehicleData = null;
	}
	if (has_vehicleIdent0) {
	    // Decode field 'vehicleIdent'
	    try {
		if (data.vehicleIdent == null)
		    data.vehicleIdent = new VehicleIdent();
		VehicleIdent.decodeValue(coder, source, data.vehicleIdent);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("vehicleIdent", "VehicleIdent");
		throw de;
	    }
	} else {
	    data.vehicleIdent = null;
	}
	if (has_j1939data0) {
	    // Decode field 'j1939data'
	    try {
		if (data.j1939data == null)
		    data.j1939data = new J1939data();
		J1939data.decodeValue(coder, source, data.j1939data);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("j1939data", "J1939data");
		throw de;
	    }
	} else {
	    data.j1939data = null;
	}
	if (has_weatherReport0) {
	    // Decode field 'weatherReport'
	    try {
		if (data.weatherReport == null)
		    data.weatherReport = new WeatherReport();
		WeatherReport.decodeValue(coder, source, data.weatherReport);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("weatherReport", "SEQUENCE");
		throw de;
	    }
	} else {
	    data.weatherReport = null;
	}
	if (has_gpsStatus0) {
	    // Decode field 'gpsStatus'
	    try {
		if (data.gpsStatus == null)
		    data.gpsStatus = new GPSstatus();
		com.oss.coders.per.PerBitstring.decode(coder, source, -1, data.gpsStatus);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("gpsStatus", "GPSstatus");
		throw de;
	    }
	} else {
	    data.gpsStatus = null;
	}
	if (_has_extensions0) {
	    len0 = coder.decodeNormallySmallLength(source);
	    if (coder.moreFragments())
		throw new DecoderException(com.oss.util.ExceptionDescriptor._too_many_ext_additions, null, "16384 or more");
	    int unknown_exts0 = 0;
	    if (len0 > 0)
		for (idx0 = 0; idx0 < len0 - 0; idx0++) {
		    if (source.readBit())
			++unknown_exts0;
		}
	    bitstream0 = source;
	    source = coder.createNestedStream(bitstream0);
	    try {
	    } finally {
		source.close();
	    }
	    source = bitstream0;
	    for (idx0 = 0; idx0 < unknown_exts0; idx0++) {
		try {
		    com.oss.coders.per.PerOctets.skip(coder, source);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendExtensionContext(null, idx0);
		    throw de;
		}
	    }
	}
	return data;
    }

    /**
     * Implements value printer for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public void printValue(DataPrinter printer, java.io.PrintWriter writer)
	    throws Exception
    {
	boolean comma0;

	comma0 = false;
	writer.print('{');
	printer.indent();
	if (this.lights != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("lights ");
		writer.print(this.lights.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.lightBar != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("lightBar ");
		printer.print(this.lightBar, writer, this.lightBar.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.wipers != null) {
	    try {
		boolean comma1;

		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("wipers ");
		comma1 = false;
		writer.print('{');
		printer.indent();
		try {
		    if (comma1)
			writer.print(',');
		    comma1 = true;
		    printer.newLine(writer);
		    writer.print("statusFront ");
		    printer.print(this.wipers.statusFront, writer, this.wipers.statusFront.cConstantNameList);
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
		try {
		    if (comma1)
			writer.print(',');
		    comma1 = true;
		    printer.newLine(writer);
		    writer.print("rateFront ");
		    writer.print(this.wipers.rateFront.longValue());
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
		if (this.wipers.statusRear != null) {
		    try {
			if (comma1)
			    writer.print(',');
			comma1 = true;
			printer.newLine(writer);
			writer.print("statusRear ");
			printer.print(this.wipers.statusRear, writer, this.wipers.statusRear.cConstantNameList);
		    } catch (Exception e) {
			printer.reportError(e, null, writer);
		    }
		}
		if (this.wipers.rateRear != null) {
		    try {
			if (comma1)
			    writer.print(',');
			comma1 = true;
			printer.newLine(writer);
			writer.print("rateRear ");
			writer.print(this.wipers.rateRear.longValue());
		    } catch (Exception e) {
			printer.reportError(e, null, writer);
		    }
		}
		printer.undent();
		if (comma1)
		    printer.newLine(writer);
		writer.print('}');
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.brakeStatus != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("brakeStatus ");
		printer.print(this.brakeStatus, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.brakePressure != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("brakePressure ");
		printer.print(this.brakePressure, writer, this.brakePressure.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.roadFriction != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("roadFriction ");
		writer.print(this.roadFriction.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.sunData != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("sunData ");
		writer.print(this.sunData.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.rainData != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("rainData ");
		printer.print(this.rainData, writer, this.rainData.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.airTemp != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("airTemp ");
		writer.print(this.airTemp.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.airPres != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("airPres ");
		writer.print(this.airPres.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.steering != null) {
	    try {
		boolean comma1;

		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("steering ");
		comma1 = false;
		writer.print('{');
		printer.indent();
		try {
		    if (comma1)
			writer.print(',');
		    comma1 = true;
		    printer.newLine(writer);
		    writer.print("angle ");
		    printer.print(this.steering.angle, writer);
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
		if (this.steering.confidence != null) {
		    try {
			if (comma1)
			    writer.print(',');
			comma1 = true;
			printer.newLine(writer);
			writer.print("confidence ");
			printer.print(this.steering.confidence, writer, this.steering.confidence.cConstantNameList);
		    } catch (Exception e) {
			printer.reportError(e, null, writer);
		    }
		}
		if (this.steering.rate != null) {
		    try {
			if (comma1)
			    writer.print(',');
			comma1 = true;
			printer.newLine(writer);
			writer.print("rate ");
			writer.print(this.steering.rate.longValue());
		    } catch (Exception e) {
			printer.reportError(e, null, writer);
		    }
		}
		if (this.steering.wheels != null) {
		    try {
			if (comma1)
			    writer.print(',');
			comma1 = true;
			printer.newLine(writer);
			writer.print("wheels ");
			writer.print(this.steering.wheels.longValue());
		    } catch (Exception e) {
			printer.reportError(e, null, writer);
		    }
		}
		printer.undent();
		if (comma1)
		    printer.newLine(writer);
		writer.print('}');
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.accelSets != null) {
	    try {
		boolean comma1;

		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("accelSets ");
		comma1 = false;
		writer.print('{');
		printer.indent();
		if (this.accelSets.accel4way != null) {
		    try {
			if (comma1)
			    writer.print(',');
			comma1 = true;
			printer.newLine(writer);
			writer.print("accel4way ");
			printer.print(this.accelSets.accel4way, writer);
		    } catch (Exception e) {
			printer.reportError(e, null, writer);
		    }
		}
		if (this.accelSets.vertAccelThres != null) {
		    try {
			if (comma1)
			    writer.print(',');
			comma1 = true;
			printer.newLine(writer);
			writer.print("vertAccelThres ");
			printer.print(this.accelSets.vertAccelThres, writer);
		    } catch (Exception e) {
			printer.reportError(e, null, writer);
		    }
		}
		if (this.accelSets.yawRateCon != null) {
		    try {
			if (comma1)
			    writer.print(',');
			comma1 = true;
			printer.newLine(writer);
			writer.print("yawRateCon ");
			printer.print(this.accelSets.yawRateCon, writer, this.accelSets.yawRateCon.cConstantNameList);
		    } catch (Exception e) {
			printer.reportError(e, null, writer);
		    }
		}
		if (this.accelSets.hozAccelCon != null) {
		    try {
			if (comma1)
			    writer.print(',');
			comma1 = true;
			printer.newLine(writer);
			writer.print("hozAccelCon ");
			printer.print(this.accelSets.hozAccelCon, writer, this.accelSets.hozAccelCon.cConstantNameList);
		    } catch (Exception e) {
			printer.reportError(e, null, writer);
		    }
		}
		if (this.accelSets.confidenceSet != null) {
		    try {
			if (comma1)
			    writer.print(',');
			comma1 = true;
			printer.newLine(writer);
			writer.print("confidenceSet ");
			this.accelSets.confidenceSet.printValue(printer, writer);
		    } catch (Exception e) {
			printer.reportError(e, null, writer);
		    }
		}
		printer.undent();
		if (comma1)
		    printer.newLine(writer);
		writer.print('}');
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.object != null) {
	    try {
		boolean comma1;

		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("object ");
		comma1 = false;
		writer.print('{');
		printer.indent();
		try {
		    if (comma1)
			writer.print(',');
		    comma1 = true;
		    printer.newLine(writer);
		    writer.print("obDist ");
		    writer.print(this.object.obDist.longValue());
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
		try {
		    if (comma1)
			writer.print(',');
		    comma1 = true;
		    printer.newLine(writer);
		    writer.print("obDirect ");
		    writer.print(this.object.obDirect.longValue());
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
		try {
		    if (comma1)
			writer.print(',');
		    comma1 = true;
		    printer.newLine(writer);
		    writer.print("dateTime ");
		    this.object.dateTime.printValue(printer, writer);
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
		printer.undent();
		if (comma1)
		    printer.newLine(writer);
		writer.print('}');
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.fullPos != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("fullPos ");
		this.fullPos.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.throttlePos != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("throttlePos ");
		writer.print(this.throttlePos.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.speedHeadC != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("speedHeadC ");
		printer.print(this.speedHeadC, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.speedC != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("speedC ");
		printer.print(this.speedC, writer, this.speedC.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.vehicleData != null) {
	    try {
		boolean comma1;

		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("vehicleData ");
		comma1 = false;
		writer.print('{');
		printer.indent();
		try {
		    if (comma1)
			writer.print(',');
		    comma1 = true;
		    printer.newLine(writer);
		    writer.print("height ");
		    writer.print(this.vehicleData.height.longValue());
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
		try {
		    if (comma1)
			writer.print(',');
		    comma1 = true;
		    printer.newLine(writer);
		    writer.print("bumpers ");
		    this.vehicleData.bumpers.printValue(printer, writer);
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
		try {
		    if (comma1)
			writer.print(',');
		    comma1 = true;
		    printer.newLine(writer);
		    writer.print("mass ");
		    writer.print(this.vehicleData.mass.longValue());
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
		try {
		    if (comma1)
			writer.print(',');
		    comma1 = true;
		    printer.newLine(writer);
		    writer.print("trailerWeight ");
		    writer.print(this.vehicleData.trailerWeight.longValue());
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
		try {
		    if (comma1)
			writer.print(',');
		    comma1 = true;
		    printer.newLine(writer);
		    writer.print("type ");
		    printer.print(this.vehicleData.type, writer, this.vehicleData.type.cConstantNameList);
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
		printer.undent();
		if (comma1)
		    printer.newLine(writer);
		writer.print('}');
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.vehicleIdent != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("vehicleIdent ");
		this.vehicleIdent.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.j1939data != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("j1939data ");
		this.j1939data.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.weatherReport != null) {
	    try {
		boolean comma1;

		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("weatherReport ");
		comma1 = false;
		writer.print('{');
		printer.indent();
		try {
		    if (comma1)
			writer.print(',');
		    comma1 = true;
		    printer.newLine(writer);
		    writer.print("isRaining ");
		    printer.print(this.weatherReport.isRaining, writer, this.weatherReport.isRaining.cConstantNameList);
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
		if (this.weatherReport.rainRate != null) {
		    try {
			if (comma1)
			    writer.print(',');
			comma1 = true;
			printer.newLine(writer);
			writer.print("rainRate ");
			writer.print(this.weatherReport.rainRate.longValue());
		    } catch (Exception e) {
			printer.reportError(e, null, writer);
		    }
		}
		if (this.weatherReport.precipSituation != null) {
		    try {
			if (comma1)
			    writer.print(',');
			comma1 = true;
			printer.newLine(writer);
			writer.print("precipSituation ");
			printer.print(this.weatherReport.precipSituation, writer, this.weatherReport.precipSituation.cConstantNameList);
		    } catch (Exception e) {
			printer.reportError(e, null, writer);
		    }
		}
		if (this.weatherReport.solarRadiation != null) {
		    try {
			if (comma1)
			    writer.print(',');
			comma1 = true;
			printer.newLine(writer);
			writer.print("solarRadiation ");
			writer.print(this.weatherReport.solarRadiation.longValue());
		    } catch (Exception e) {
			printer.reportError(e, null, writer);
		    }
		}
		if (this.weatherReport.friction != null) {
		    try {
			if (comma1)
			    writer.print(',');
			comma1 = true;
			printer.newLine(writer);
			writer.print("friction ");
			writer.print(this.weatherReport.friction.longValue());
		    } catch (Exception e) {
			printer.reportError(e, null, writer);
		    }
		}
		printer.undent();
		if (comma1)
		    printer.newLine(writer);
		writer.print('}');
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.gpsStatus != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("gpsStatus ");
		printer.print(this.gpsStatus, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	printer.undent();
	if (comma0)
	    printer.newLine(writer);
	writer.print('}');
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((VehicleStatus)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((VehicleStatus)that);
    }
    
    public boolean equalTo(VehicleStatus that) {
	if (this.lights != null && that.lights != null) {
	    if (!this.lights.equalTo(that.lights))
		return false;
	}
	if (this.lightBar != null && that.lightBar != null) {
	    if (!this.lightBar.equalTo(that.lightBar))
		return false;
	}
	if (this.wipers != null && that.wipers != null) {
	    if (!this.wipers.equalTo(that.wipers))
		return false;
	}
	if (this.brakeStatus != null && that.brakeStatus != null) {
	    if (!this.brakeStatus.equalTo(that.brakeStatus))
		return false;
	}
	if (this.brakePressure != null && that.brakePressure != null) {
	    if (!this.brakePressure.equalTo(that.brakePressure))
		return false;
	}
	if (this.roadFriction != null && that.roadFriction != null) {
	    if (!this.roadFriction.equalTo(that.roadFriction))
		return false;
	}
	if (this.sunData != null && that.sunData != null) {
	    if (!this.sunData.equalTo(that.sunData))
		return false;
	}
	if (this.rainData != null && that.rainData != null) {
	    if (!this.rainData.equalTo(that.rainData))
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
	if (this.steering != null && that.steering != null) {
	    if (!this.steering.equalTo(that.steering))
		return false;
	}
	if (this.accelSets != null && that.accelSets != null) {
	    if (!this.accelSets.equalTo(that.accelSets))
		return false;
	}
	if (this.object != null && that.object != null) {
	    if (!this.object.equalTo(that.object))
		return false;
	}
	if (this.fullPos != null && that.fullPos != null) {
	    if (!this.fullPos.equalTo(that.fullPos))
		return false;
	}
	if (this.throttlePos != null && that.throttlePos != null) {
	    if (!this.throttlePos.equalTo(that.throttlePos))
		return false;
	}
	if (this.speedHeadC != null && that.speedHeadC != null) {
	    if (!this.speedHeadC.equalTo(that.speedHeadC))
		return false;
	}
	if (this.speedC != null && that.speedC != null) {
	    if (!this.speedC.equalTo(that.speedC))
		return false;
	}
	if (this.vehicleData != null && that.vehicleData != null) {
	    if (!this.vehicleData.equalTo(that.vehicleData))
		return false;
	}
	if (this.vehicleIdent != null && that.vehicleIdent != null) {
	    if (!this.vehicleIdent.equalTo(that.vehicleIdent))
		return false;
	}
	if (this.j1939data != null && that.j1939data != null) {
	    if (!this.j1939data.equalTo(that.j1939data))
		return false;
	}
	if (this.weatherReport != null && that.weatherReport != null) {
	    if (!this.weatherReport.equalTo(that.weatherReport))
		return false;
	}
	if (this.gpsStatus != null && that.gpsStatus != null) {
	    if (!this.gpsStatus.equalTo(that.gpsStatus))
		return false;
	}
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public VehicleStatus clone() {
	VehicleStatus copy = (VehicleStatus)super.clone();
	if (lights != null) {
	    copy.lights = lights.clone();
	}
	if (lightBar != null) {
	    copy.lightBar = lightBar.clone();
	}
	if (wipers != null) {
	    copy.wipers = wipers.clone();
	}
	if (brakeStatus != null) {
	    copy.brakeStatus = brakeStatus.clone();
	}
	if (brakePressure != null) {
	    copy.brakePressure = brakePressure.clone();
	}
	if (roadFriction != null) {
	    copy.roadFriction = roadFriction.clone();
	}
	if (sunData != null) {
	    copy.sunData = sunData.clone();
	}
	if (rainData != null) {
	    copy.rainData = rainData.clone();
	}
	if (airTemp != null) {
	    copy.airTemp = airTemp.clone();
	}
	if (airPres != null) {
	    copy.airPres = airPres.clone();
	}
	if (steering != null) {
	    copy.steering = steering.clone();
	}
	if (accelSets != null) {
	    copy.accelSets = accelSets.clone();
	}
	if (object != null) {
	    copy.object = object.clone();
	}
	if (fullPos != null) {
	    copy.fullPos = fullPos.clone();
	}
	if (throttlePos != null) {
	    copy.throttlePos = throttlePos.clone();
	}
	if (speedHeadC != null) {
	    copy.speedHeadC = speedHeadC.clone();
	}
	if (speedC != null) {
	    copy.speedC = speedC.clone();
	}
	if (vehicleData != null) {
	    copy.vehicleData = vehicleData.clone();
	}
	if (vehicleIdent != null) {
	    copy.vehicleIdent = vehicleIdent.clone();
	}
	if (j1939data != null) {
	    copy.j1939data = j1939data.clone();
	}
	if (weatherReport != null) {
	    copy.weatherReport = weatherReport.clone();
	}
	if (gpsStatus != null) {
	    copy.gpsStatus = gpsStatus.clone();
	}
	return copy;
    }

} // End class definition for VehicleStatus
