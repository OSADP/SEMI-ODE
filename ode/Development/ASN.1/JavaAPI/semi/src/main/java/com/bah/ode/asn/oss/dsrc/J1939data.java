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
 * Define the ASN1 Type J1939data from ASN1 Module DSRC.
 * @see Sequence
 */

public class J1939data extends Sequence {
    public Tires tires;
    public Axle axle;
    public TrailerWeight trailerWeight;
    public CargoWeight cargoWeight;
    public SteeringAxleTemperature steeringAxleTemperature;
    public DriveAxleLocation driveAxleLocation;
    public DriveAxleLiftAirPressure driveAxleLiftAirPressure;
    public DriveAxleTemperature driveAxleTemperature;
    public DriveAxleLubePressure driveAxleLubePressure;
    public SteeringAxleLubePressure steeringAxleLubePressure;
    
    /**
     * The default constructor.
     */
    public J1939data()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public J1939data(Tires tires, Axle axle, TrailerWeight trailerWeight, 
		    CargoWeight cargoWeight, 
		    SteeringAxleTemperature steeringAxleTemperature, 
		    DriveAxleLocation driveAxleLocation, 
		    DriveAxleLiftAirPressure driveAxleLiftAirPressure, 
		    DriveAxleTemperature driveAxleTemperature, 
		    DriveAxleLubePressure driveAxleLubePressure, 
		    SteeringAxleLubePressure steeringAxleLubePressure)
    {
	setTires(tires);
	setAxle(axle);
	setTrailerWeight(trailerWeight);
	setCargoWeight(cargoWeight);
	setSteeringAxleTemperature(steeringAxleTemperature);
	setDriveAxleLocation(driveAxleLocation);
	setDriveAxleLiftAirPressure(driveAxleLiftAirPressure);
	setDriveAxleTemperature(driveAxleTemperature);
	setDriveAxleLubePressure(driveAxleLubePressure);
	setSteeringAxleLubePressure(steeringAxleLubePressure);
    }
    
    
    // Methods for field "tires"
    public Tires getTires()
    {
	return this.tires;
    }
    
    public void setTires(Tires tires)
    {
	this.tires = tires;
    }
    
    public boolean hasTires()
    {
	return (tires != null);
    }
    
    public void deleteTires()
    {
	tires = null;
    }
    
    
    
    /**
     * Define the ASN1 Type Tires from ASN1 Module DSRC.
     * @see SequenceOf
     */
    public static class Tires extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public Tires()
	{
	    this.elements = new java.util.ArrayList<Sequence_>();
	}
	
	
	/**
	 * Construct from an array of components.
	 */
	public java.util.ArrayList<Sequence_> elements;

	public Tires(Sequence_[] elements)
	{
	    this.elements = new java.util.ArrayList<Sequence_>(java.util.Arrays.asList(elements));
	}
	
	
	/**
	 * Define the ASN1 Type Sequence_ from ASN1 Module DSRC.
	 * @see Sequence
	 */
	public static class Sequence_ extends Sequence {
	    public TireLocation location;
	    public TirePressure pressure;
	    public TireTemp temp;
	    public WheelSensorStatus wheelSensorStatus;
	    public WheelEndElectFault wheelEndElectFault;
	    public TireLeakageRate leakageRate;
	    public TirePressureThresholdDetection detection;
	    
	    /**
	     * The default constructor.
	     */
	    public Sequence_()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Sequence_(TireLocation location, TirePressure pressure, 
			    TireTemp temp, 
			    WheelSensorStatus wheelSensorStatus, 
			    WheelEndElectFault wheelEndElectFault, 
			    TireLeakageRate leakageRate, 
			    TirePressureThresholdDetection detection)
	    {
		setLocation(location);
		setPressure(pressure);
		setTemp(temp);
		setWheelSensorStatus(wheelSensorStatus);
		setWheelEndElectFault(wheelEndElectFault);
		setLeakageRate(leakageRate);
		setDetection(detection);
	    }
	    
	    
	    // Methods for field "location"
	    public TireLocation getLocation()
	    {
		return this.location;
	    }
	    
	    public void setLocation(TireLocation location)
	    {
		this.location = location;
	    }
	    
	    public boolean hasLocation()
	    {
		return (location != null);
	    }
	    
	    public void deleteLocation()
	    {
		location = null;
	    }
	    
	    
	    // Methods for field "pressure"
	    public TirePressure getPressure()
	    {
		return this.pressure;
	    }
	    
	    public void setPressure(TirePressure pressure)
	    {
		this.pressure = pressure;
	    }
	    
	    public boolean hasPressure()
	    {
		return (pressure != null);
	    }
	    
	    public void deletePressure()
	    {
		pressure = null;
	    }
	    
	    
	    // Methods for field "temp"
	    public TireTemp getTemp()
	    {
		return this.temp;
	    }
	    
	    public void setTemp(TireTemp temp)
	    {
		this.temp = temp;
	    }
	    
	    public boolean hasTemp()
	    {
		return (temp != null);
	    }
	    
	    public void deleteTemp()
	    {
		temp = null;
	    }
	    
	    
	    // Methods for field "wheelSensorStatus"
	    public WheelSensorStatus getWheelSensorStatus()
	    {
		return this.wheelSensorStatus;
	    }
	    
	    public void setWheelSensorStatus(WheelSensorStatus wheelSensorStatus)
	    {
		this.wheelSensorStatus = wheelSensorStatus;
	    }
	    
	    public boolean hasWheelSensorStatus()
	    {
		return (wheelSensorStatus != null);
	    }
	    
	    public void deleteWheelSensorStatus()
	    {
		wheelSensorStatus = null;
	    }
	    
	    
	    // Methods for field "wheelEndElectFault"
	    public WheelEndElectFault getWheelEndElectFault()
	    {
		return this.wheelEndElectFault;
	    }
	    
	    public void setWheelEndElectFault(WheelEndElectFault wheelEndElectFault)
	    {
		this.wheelEndElectFault = wheelEndElectFault;
	    }
	    
	    public boolean hasWheelEndElectFault()
	    {
		return (wheelEndElectFault != null);
	    }
	    
	    public void deleteWheelEndElectFault()
	    {
		wheelEndElectFault = null;
	    }
	    
	    
	    // Methods for field "leakageRate"
	    public TireLeakageRate getLeakageRate()
	    {
		return this.leakageRate;
	    }
	    
	    public void setLeakageRate(TireLeakageRate leakageRate)
	    {
		this.leakageRate = leakageRate;
	    }
	    
	    public boolean hasLeakageRate()
	    {
		return (leakageRate != null);
	    }
	    
	    public void deleteLeakageRate()
	    {
		leakageRate = null;
	    }
	    
	    
	    // Methods for field "detection"
	    public TirePressureThresholdDetection getDetection()
	    {
		return this.detection;
	    }
	    
	    public void setDetection(TirePressureThresholdDetection detection)
	    {
		this.detection = detection;
	    }
	    
	    public boolean hasDetection()
	    {
		return (detection != null);
	    }
	    
	    public void deleteDetection()
	    {
		detection = null;
	    }
	    
	    
	    /**
	     * Implements PER value encoder for the type (reserved for internal use).
	     * This method is reserved for internal use and must not be invoked from the application code.
	     */
	    public static int encodeValue(PerCoder coder, OutputBitStream sink, Sequence_ data)
		    throws IOException, EncoderException, EncodeFailedException
	    {
		int nbits = 0;

		sink.writeBit(false);
		sink.writeBit(data.location != null);
		sink.writeBit(data.pressure != null);
		sink.writeBit(data.temp != null);
		sink.writeBit(data.wheelSensorStatus != null);
		sink.writeBit(data.wheelEndElectFault != null);
		sink.writeBit(data.leakageRate != null);
		sink.writeBit(data.detection != null);
		nbits += 8;
		if (data.location != null) {
		    // Encode field 'location'
		    try {
			TireLocation item1 = data.location;
			long temp1 = item1.longValue();

			if (temp1 < 0 || temp1 > 255)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
			nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("location", "TireLocation");
			throw ee;
		    }
		}
		if (data.pressure != null) {
		    // Encode field 'pressure'
		    try {
			TirePressure item1 = data.pressure;
			long temp1 = item1.longValue();

			if (temp1 < 0 || temp1 > 1000)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
			nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 1000, sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("pressure", "TirePressure");
			throw ee;
		    }
		}
		if (data.temp != null) {
		    // Encode field 'temp'
		    try {
			TireTemp item1 = data.temp;
			long temp1 = item1.longValue();

			if (temp1 < 0 || temp1 > 65535)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
			nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 65535, sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("temp", "TireTemp");
			throw ee;
		    }
		}
		if (data.wheelSensorStatus != null) {
		    // Encode field 'wheelSensorStatus'
		    try {
			WheelSensorStatus item1 = data.wheelSensorStatus;
			int idx1 = item1.indexOf();

			if (idx1 < 0)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
			nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 3, sink));
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("wheelSensorStatus", "WheelSensorStatus");
			throw ee;
		    }
		}
		if (data.wheelEndElectFault != null) {
		    // Encode field 'wheelEndElectFault'
		    try {
			WheelEndElectFault item1 = data.wheelEndElectFault;
			int len1 = item1.getSize();
			int total_len1;

			total_len1 = item1.getLastBit();
			nbits += com.oss.coders.per.PerBitstring.encode(coder, item1.byteArrayValue(), len1, total_len1, sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("wheelEndElectFault", "WheelEndElectFault");
			throw ee;
		    }
		}
		if (data.leakageRate != null) {
		    // Encode field 'leakageRate'
		    try {
			TireLeakageRate item1 = data.leakageRate;
			long temp1 = item1.longValue();

			if (temp1 < 0 || temp1 > 65535)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
			nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 65535, sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("leakageRate", "TireLeakageRate");
			throw ee;
		    }
		}
		if (data.detection != null) {
		    // Encode field 'detection'
		    try {
			TirePressureThresholdDetection item1 = data.detection;
			int idx1;
			boolean extroot1 = true;

			if (item1.isUnknownEnumerator()) {
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
			} else {
			    idx1 = item1.indexOf();
			    if (idx1 < 0)
				throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
			    extroot1 = idx1 < 8;
			}
			sink.writeBit(!extroot1); ++nbits;
			if (extroot1)
			    nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 7, sink);
			else
			    nbits += coder.encodeNormallySmallNumber(idx1 - 8, sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("detection", "TirePressureThresholdDetection");
			throw ee;
		    }
		}

		return nbits;
	    }

	    /**
	     * Implements PER value decoder for the type (reserved for internal use).
	     * This method is reserved for internal use and must not be invoked from the application code.
	     */
	    public static Sequence_ decodeValue(PerCoder coder, InputBitStream source, Sequence_ data)
		    throws IOException, DecoderException, DecodeFailedException
	    {
		boolean _has_extensions0 = source.readBit();
		int len0 = 0;
		InputBitStream bitstream0 = null;

		boolean has_location0 = source.readBit();
		boolean has_pressure0 = source.readBit();
		boolean has_temp0 = source.readBit();
		boolean has_wheelSensorStatus0 = source.readBit();
		boolean has_wheelEndElectFault0 = source.readBit();
		boolean has_leakageRate0 = source.readBit();
		boolean has_detection0 = source.readBit();
	    /** Decode root fields **/
		if (has_location0) {
		    // Decode field 'location'
		    try {
			long temp1;

			if (data.location == null)
			    data.location = new TireLocation();
			temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
			if (temp1 > 255)
			    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
			data.location.setValue(temp1);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("location", "TireLocation");
			throw de;
		    }
		} else {
		    data.location = null;
		}
		if (has_pressure0) {
		    // Decode field 'pressure'
		    try {
			long temp1;

			if (data.pressure == null)
			    data.pressure = new TirePressure();
			temp1 = coder.decodeConstrainedWholeNumber(source, 0, 1000);
			if (temp1 > 1000)
			    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
			data.pressure.setValue(temp1);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("pressure", "TirePressure");
			throw de;
		    }
		} else {
		    data.pressure = null;
		}
		if (has_temp0) {
		    // Decode field 'temp'
		    try {
			long temp1;

			if (data.temp == null)
			    data.temp = new TireTemp();
			temp1 = coder.decodeConstrainedWholeNumber(source, 0, 65535);
			if (temp1 > 65535)
			    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
			data.temp.setValue(temp1);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("temp", "TireTemp");
			throw de;
		    }
		} else {
		    data.temp = null;
		}
		if (has_wheelSensorStatus0) {
		    // Decode field 'wheelSensorStatus'
		    try {
			int idx1;

			idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
			if (idx1 < 0 || idx1 > 3)
			    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
			data.wheelSensorStatus = WheelSensorStatus.valueAt(idx1);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("wheelSensorStatus", "WheelSensorStatus");
			throw de;
		    }
		} else {
		    data.wheelSensorStatus = null;
		}
		if (has_wheelEndElectFault0) {
		    // Decode field 'wheelEndElectFault'
		    try {
			if (data.wheelEndElectFault == null)
			    data.wheelEndElectFault = new WheelEndElectFault();
			com.oss.coders.per.PerBitstring.decode(coder, source, -1, data.wheelEndElectFault);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("wheelEndElectFault", "WheelEndElectFault");
			throw de;
		    }
		} else {
		    data.wheelEndElectFault = null;
		}
		if (has_leakageRate0) {
		    // Decode field 'leakageRate'
		    try {
			long temp1;

			if (data.leakageRate == null)
			    data.leakageRate = new TireLeakageRate();
			temp1 = coder.decodeConstrainedWholeNumber(source, 0, 65535);
			if (temp1 > 65535)
			    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
			data.leakageRate.setValue(temp1);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("leakageRate", "TireLeakageRate");
			throw de;
		    }
		} else {
		    data.leakageRate = null;
		}
		if (has_detection0) {
		    // Decode field 'detection'
		    try {
			int idx1;
			TirePressureThresholdDetection temp1;
			boolean extroot1 = !source.readBit();

			if (extroot1) {
			    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 7);
			    if (idx1 < 0 || idx1 > 7)
				throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
			    temp1 = TirePressureThresholdDetection.valueAt(idx1);
			} else {
			    idx1 = 8 + (int)coder.decodeNormallySmallNumber(source);
			    if (idx1 < 0)
				throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
			    temp1 = TirePressureThresholdDetection.unknownEnumerator();
			}
			data.detection = temp1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("detection", "TirePressureThresholdDetection");
			throw de;
		    }
		} else {
		    data.detection = null;
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
		return equalTo((Sequence_)that);
	    }
	    
	    public boolean equalTo(Sequence that)
	    {
		return equalTo((Sequence_)that);
	    }
	    
	    public boolean equalTo(Sequence_ that) {
		if (this.location != null && that.location != null) {
		    if (!this.location.equalTo(that.location))
			return false;
		}
		if (this.pressure != null && that.pressure != null) {
		    if (!this.pressure.equalTo(that.pressure))
			return false;
		}
		if (this.temp != null && that.temp != null) {
		    if (!this.temp.equalTo(that.temp))
			return false;
		}
		if (this.wheelSensorStatus != null && that.wheelSensorStatus != null) {
		    if (!this.wheelSensorStatus.equalTo(that.wheelSensorStatus))
			return false;
		}
		if (this.wheelEndElectFault != null && that.wheelEndElectFault != null) {
		    if (!this.wheelEndElectFault.equalTo(that.wheelEndElectFault))
			return false;
		}
		if (this.leakageRate != null && that.leakageRate != null) {
		    if (!this.leakageRate.equalTo(that.leakageRate))
			return false;
		}
		if (this.detection != null && that.detection != null) {
		    if (!this.detection.equalTo(that.detection))
			return false;
		}
		return true;
	    }

	    /**
	     * Clone 'this' object.
	     */
	    public Sequence_ clone() {
		Sequence_ copy = (Sequence_)super.clone();
		if (location != null) {
		    copy.location = location.clone();
		}
		if (pressure != null) {
		    copy.pressure = pressure.clone();
		}
		if (temp != null) {
		    copy.temp = temp.clone();
		}
		if (wheelSensorStatus != null) {
		    copy.wheelSensorStatus = wheelSensorStatus.clone();
		}
		if (wheelEndElectFault != null) {
		    copy.wheelEndElectFault = wheelEndElectFault.clone();
		}
		if (leakageRate != null) {
		    copy.leakageRate = leakageRate.clone();
		}
		if (detection != null) {
		    copy.detection = detection.clone();
		}
		return copy;
	    }

	    /**
	     * Returns a hash code for 'this' object.
	     */
	    public int hashCode() {
		int hash = 3;
		hash = 41 * hash + (this.location != null ? this.location.hashCode() : 0);
		hash = 41 * hash + (this.pressure != null ? this.pressure.hashCode() : 0);
		hash = 41 * hash + (this.temp != null ? this.temp.hashCode() : 0);
		hash = 41 * hash + (this.wheelSensorStatus != null ? this.wheelSensorStatus.hashCode() : 0);
		hash = 41 * hash + (this.wheelEndElectFault != null ? this.wheelEndElectFault.hashCode() : 0);
		hash = 41 * hash + (this.leakageRate != null ? this.leakageRate.hashCode() : 0);
		hash = 41 * hash + (this.detection != null ? this.detection.hashCode() : 0);
		return hash;
	    }
	} // End class definition for Sequence_

	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(Sequence_ element)
	{
	    elements.add(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(Sequence_ element, int atIndex)
	{
	    elements.set(atIndex, element);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized Sequence_ get(int atIndex)
	{
	    return (Sequence_)elements.get(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(Sequence_ element, int atIndex)
	{
	    elements.add(atIndex, element);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(Sequence_ element)
	{
	    elements.remove(element);
	}
	
	/**
	 * Remove an Element at the specified position from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(int index)
	{
	    elements.remove(index);
	}
	
	/**
	 * Implements PER value encoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public static int encodeValue(PerCoder coder, OutputBitStream sink, Tires data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int total_len0 = data.elements.size();
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;
	    int nbits = 0;

	    if (total_len0 < 0 || total_len0 > 16)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + total_len0);
	    nbits += coder.encodeLengthDeterminant(total_len0, 0, 16, sink);
	    moreFragments0 = coder.moreFragments();
	    fragmentLength0 = (moreFragments0 ? coder.fragmentLength() : total_len0);
	    while (total_len0 > 0) {
		try {
		    Sequence_ item1 = data.elements.get(idx0);

		    nbits += Sequence_.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "SEQUENCE", idx0);
		    throw ee;
		}
		--total_len0; --fragmentLength0; ++idx0;
		if (fragmentLength0 == 0) {
		    if (moreFragments0) {
			nbits += coder.encodeLengthDeterminant(total_len0, sink);
			moreFragments0 = coder.moreFragments();
			fragmentLength0 = (moreFragments0 ? coder.fragmentLength() : total_len0);
		    }
		}
	    }

	    return nbits;
	}

	/**
	 * Implements PER value decoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public static Tires decodeValue(PerCoder coder, InputBitStream source, Tires data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    int total_len0 = 0;
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;

	    idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, 0, 16);
	    if (fragmentLength0 > 16)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + fragmentLength0);
	    moreFragments0 = coder.moreFragments();
	    if (data.elements != null)
		data.elements.clear();
	    else
		data.elements = new java.util.ArrayList<Sequence_>(fragmentLength0);
	    while (idx0 > 0) {
		try {
		    Sequence_ item1 = new Sequence_();

		    data.elements.add(item1);
		    item1.decodeValue(coder, source, item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "SEQUENCE", total_len0);
		    throw de;
		}
		--idx0; ++total_len0;
		if (idx0 == 0) {
		    if (moreFragments0) {
			idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, fragmentLength0);
			moreFragments0 = coder.moreFragments();
			if ((total_len0 + fragmentLength0) > 16)
			    throw new DecoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + (total_len0 + fragmentLength0));
		    }
		}
	    }
	    return data;
	}

	/**
	 * Compare 'this' object to another object to see if their contents are the same.
	 */
	public boolean abstractEqualTo(AbstractData that)
	{
	    return equalTo((Tires)that);
	}
	
	public boolean equalTo(SequenceOf that)
	{
	    return equalTo((Tires)that);
	}
	
	public boolean equalTo(Tires that) {
	    int size = this.getSize();
	    if (size != that.getSize())
		return false;
	    for (int i = 0; i < size; i++) {
		if (!this.get(i).equalTo(that.get(i)))
		    return false;
	    }
	    return true;
	}

	public int getSize()
	{
	    return elements.size();
	}
	
	public void removeAllElements() {
	    if (elements != null)
		elements.clear();
	}

	/**
	 * Clone 'this' object.
	 */
	public Tires clone() {
	    Tires copy = (Tires)super.clone();
	    copy.elements = new java.util.ArrayList<Sequence_>(elements.size());
	    for (Sequence_ element : elements) {
		copy.elements.add(element.clone());
	    }
	    return copy;
	}

	/**
	 * Returns a hash code for 'this' object.
	 */
	public int hashCode() {
	    int hash = 7;
	    hash = 79 * hash + (this.elements != null ? this.elements.hashCode() : 0);
	    return hash;
	}
    } // End class definition for Tires

    // Methods for field "axle"
    public Axle getAxle()
    {
	return this.axle;
    }
    
    public void setAxle(Axle axle)
    {
	this.axle = axle;
    }
    
    public boolean hasAxle()
    {
	return (axle != null);
    }
    
    public void deleteAxle()
    {
	axle = null;
    }
    
    
    
    /**
     * Define the ASN1 Type Axle from ASN1 Module DSRC.
     * @see SequenceOf
     */
    public static class Axle extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public Axle()
	{
	    this.elements = new java.util.ArrayList<Sequence_>();
	}
	
	
	/**
	 * Construct from an array of components.
	 */
	public java.util.ArrayList<Sequence_> elements;

	public Axle(Sequence_[] elements)
	{
	    this.elements = new java.util.ArrayList<Sequence_>(java.util.Arrays.asList(elements));
	}
	
	
	/**
	 * Define the ASN1 Type Sequence_ from ASN1 Module DSRC.
	 * @see Sequence
	 */
	public static class Sequence_ extends Sequence {
	    public AxleLocation location;
	    public AxleWeight weight;
	    
	    /**
	     * The default constructor.
	     */
	    public Sequence_()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Sequence_(AxleLocation location, AxleWeight weight)
	    {
		setLocation(location);
		setWeight(weight);
	    }
	    
	    
	    // Methods for field "location"
	    public AxleLocation getLocation()
	    {
		return this.location;
	    }
	    
	    public void setLocation(AxleLocation location)
	    {
		this.location = location;
	    }
	    
	    public boolean hasLocation()
	    {
		return (location != null);
	    }
	    
	    public void deleteLocation()
	    {
		location = null;
	    }
	    
	    
	    // Methods for field "weight"
	    public AxleWeight getWeight()
	    {
		return this.weight;
	    }
	    
	    public void setWeight(AxleWeight weight)
	    {
		this.weight = weight;
	    }
	    
	    public boolean hasWeight()
	    {
		return (weight != null);
	    }
	    
	    public void deleteWeight()
	    {
		weight = null;
	    }
	    
	    
	    /**
	     * Implements PER value encoder for the type (reserved for internal use).
	     * This method is reserved for internal use and must not be invoked from the application code.
	     */
	    public static int encodeValue(PerCoder coder, OutputBitStream sink, Sequence_ data)
		    throws IOException, EncoderException, EncodeFailedException
	    {
		int nbits = 0;

		sink.writeBit(false);
		sink.writeBit(data.location != null);
		sink.writeBit(data.weight != null);
		nbits += 3;
		if (data.location != null) {
		    // Encode field 'location'
		    try {
			AxleLocation item1 = data.location;
			long temp1 = item1.longValue();

			if (temp1 < 0 || temp1 > 127)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
			nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 127, sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("location", "AxleLocation");
			throw ee;
		    }
		}
		if (data.weight != null) {
		    // Encode field 'weight'
		    try {
			AxleWeight item1 = data.weight;
			long temp1 = item1.longValue();

			if (temp1 < 0 || temp1 > 65535)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
			nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 65535, sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("weight", "AxleWeight");
			throw ee;
		    }
		}

		return nbits;
	    }

	    /**
	     * Implements PER value decoder for the type (reserved for internal use).
	     * This method is reserved for internal use and must not be invoked from the application code.
	     */
	    public static Sequence_ decodeValue(PerCoder coder, InputBitStream source, Sequence_ data)
		    throws IOException, DecoderException, DecodeFailedException
	    {
		boolean _has_extensions0 = source.readBit();
		int len0 = 0;
		InputBitStream bitstream0 = null;

		boolean has_location0 = source.readBit();
		boolean has_weight0 = source.readBit();
	    /** Decode root fields **/
		if (has_location0) {
		    // Decode field 'location'
		    try {
			long temp1;

			if (data.location == null)
			    data.location = new AxleLocation();
			temp1 = coder.decodeConstrainedWholeNumber(source, 0, 127);
			if (temp1 > 127)
			    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
			data.location.setValue(temp1);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("location", "AxleLocation");
			throw de;
		    }
		} else {
		    data.location = null;
		}
		if (has_weight0) {
		    // Decode field 'weight'
		    try {
			long temp1;

			if (data.weight == null)
			    data.weight = new AxleWeight();
			temp1 = coder.decodeConstrainedWholeNumber(source, 0, 65535);
			if (temp1 > 65535)
			    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
			data.weight.setValue(temp1);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("weight", "AxleWeight");
			throw de;
		    }
		} else {
		    data.weight = null;
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
		return equalTo((Sequence_)that);
	    }
	    
	    public boolean equalTo(Sequence that)
	    {
		return equalTo((Sequence_)that);
	    }
	    
	    public boolean equalTo(Sequence_ that) {
		if (this.location != null && that.location != null) {
		    if (!this.location.equalTo(that.location))
			return false;
		}
		if (this.weight != null && that.weight != null) {
		    if (!this.weight.equalTo(that.weight))
			return false;
		}
		return true;
	    }

	    /**
	     * Clone 'this' object.
	     */
	    public Sequence_ clone() {
		Sequence_ copy = (Sequence_)super.clone();
		if (location != null) {
		    copy.location = location.clone();
		}
		if (weight != null) {
		    copy.weight = weight.clone();
		}
		return copy;
	    }

	    /**
	     * Returns a hash code for 'this' object.
	     */
	    public int hashCode() {
		int hash = 3;
		hash = 41 * hash + (this.location != null ? this.location.hashCode() : 0);
		hash = 41 * hash + (this.weight != null ? this.weight.hashCode() : 0);
		return hash;
	    }
	} // End class definition for Sequence_

	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(Sequence_ element)
	{
	    elements.add(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(Sequence_ element, int atIndex)
	{
	    elements.set(atIndex, element);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized Sequence_ get(int atIndex)
	{
	    return (Sequence_)elements.get(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(Sequence_ element, int atIndex)
	{
	    elements.add(atIndex, element);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(Sequence_ element)
	{
	    elements.remove(element);
	}
	
	/**
	 * Remove an Element at the specified position from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(int index)
	{
	    elements.remove(index);
	}
	
	/**
	 * Implements PER value encoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public static int encodeValue(PerCoder coder, OutputBitStream sink, Axle data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int total_len0 = data.elements.size();
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;
	    int nbits = 0;

	    if (total_len0 < 0 || total_len0 > 16)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + total_len0);
	    nbits += coder.encodeLengthDeterminant(total_len0, 0, 16, sink);
	    moreFragments0 = coder.moreFragments();
	    fragmentLength0 = (moreFragments0 ? coder.fragmentLength() : total_len0);
	    while (total_len0 > 0) {
		try {
		    Sequence_ item1 = data.elements.get(idx0);

		    nbits += Sequence_.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "SEQUENCE", idx0);
		    throw ee;
		}
		--total_len0; --fragmentLength0; ++idx0;
		if (fragmentLength0 == 0) {
		    if (moreFragments0) {
			nbits += coder.encodeLengthDeterminant(total_len0, sink);
			moreFragments0 = coder.moreFragments();
			fragmentLength0 = (moreFragments0 ? coder.fragmentLength() : total_len0);
		    }
		}
	    }

	    return nbits;
	}

	/**
	 * Implements PER value decoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public static Axle decodeValue(PerCoder coder, InputBitStream source, Axle data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    int total_len0 = 0;
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;

	    idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, 0, 16);
	    if (fragmentLength0 > 16)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + fragmentLength0);
	    moreFragments0 = coder.moreFragments();
	    if (data.elements != null)
		data.elements.clear();
	    else
		data.elements = new java.util.ArrayList<Sequence_>(fragmentLength0);
	    while (idx0 > 0) {
		try {
		    Sequence_ item1 = new Sequence_();

		    data.elements.add(item1);
		    item1.decodeValue(coder, source, item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "SEQUENCE", total_len0);
		    throw de;
		}
		--idx0; ++total_len0;
		if (idx0 == 0) {
		    if (moreFragments0) {
			idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, fragmentLength0);
			moreFragments0 = coder.moreFragments();
			if ((total_len0 + fragmentLength0) > 16)
			    throw new DecoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + (total_len0 + fragmentLength0));
		    }
		}
	    }
	    return data;
	}

	/**
	 * Compare 'this' object to another object to see if their contents are the same.
	 */
	public boolean abstractEqualTo(AbstractData that)
	{
	    return equalTo((Axle)that);
	}
	
	public boolean equalTo(SequenceOf that)
	{
	    return equalTo((Axle)that);
	}
	
	public boolean equalTo(Axle that) {
	    int size = this.getSize();
	    if (size != that.getSize())
		return false;
	    for (int i = 0; i < size; i++) {
		if (!this.get(i).equalTo(that.get(i)))
		    return false;
	    }
	    return true;
	}

	public int getSize()
	{
	    return elements.size();
	}
	
	public void removeAllElements() {
	    if (elements != null)
		elements.clear();
	}

	/**
	 * Clone 'this' object.
	 */
	public Axle clone() {
	    Axle copy = (Axle)super.clone();
	    copy.elements = new java.util.ArrayList<Sequence_>(elements.size());
	    for (Sequence_ element : elements) {
		copy.elements.add(element.clone());
	    }
	    return copy;
	}

	/**
	 * Returns a hash code for 'this' object.
	 */
	public int hashCode() {
	    int hash = 7;
	    hash = 79 * hash + (this.elements != null ? this.elements.hashCode() : 0);
	    return hash;
	}
    } // End class definition for Axle

    // Methods for field "trailerWeight"
    public TrailerWeight getTrailerWeight()
    {
	return this.trailerWeight;
    }
    
    public void setTrailerWeight(TrailerWeight trailerWeight)
    {
	this.trailerWeight = trailerWeight;
    }
    
    public boolean hasTrailerWeight()
    {
	return (trailerWeight != null);
    }
    
    public void deleteTrailerWeight()
    {
	trailerWeight = null;
    }
    
    
    // Methods for field "cargoWeight"
    public CargoWeight getCargoWeight()
    {
	return this.cargoWeight;
    }
    
    public void setCargoWeight(CargoWeight cargoWeight)
    {
	this.cargoWeight = cargoWeight;
    }
    
    public boolean hasCargoWeight()
    {
	return (cargoWeight != null);
    }
    
    public void deleteCargoWeight()
    {
	cargoWeight = null;
    }
    
    
    // Methods for field "steeringAxleTemperature"
    public SteeringAxleTemperature getSteeringAxleTemperature()
    {
	return this.steeringAxleTemperature;
    }
    
    public void setSteeringAxleTemperature(SteeringAxleTemperature steeringAxleTemperature)
    {
	this.steeringAxleTemperature = steeringAxleTemperature;
    }
    
    public boolean hasSteeringAxleTemperature()
    {
	return (steeringAxleTemperature != null);
    }
    
    public void deleteSteeringAxleTemperature()
    {
	steeringAxleTemperature = null;
    }
    
    
    // Methods for field "driveAxleLocation"
    public DriveAxleLocation getDriveAxleLocation()
    {
	return this.driveAxleLocation;
    }
    
    public void setDriveAxleLocation(DriveAxleLocation driveAxleLocation)
    {
	this.driveAxleLocation = driveAxleLocation;
    }
    
    public boolean hasDriveAxleLocation()
    {
	return (driveAxleLocation != null);
    }
    
    public void deleteDriveAxleLocation()
    {
	driveAxleLocation = null;
    }
    
    
    // Methods for field "driveAxleLiftAirPressure"
    public DriveAxleLiftAirPressure getDriveAxleLiftAirPressure()
    {
	return this.driveAxleLiftAirPressure;
    }
    
    public void setDriveAxleLiftAirPressure(DriveAxleLiftAirPressure driveAxleLiftAirPressure)
    {
	this.driveAxleLiftAirPressure = driveAxleLiftAirPressure;
    }
    
    public boolean hasDriveAxleLiftAirPressure()
    {
	return (driveAxleLiftAirPressure != null);
    }
    
    public void deleteDriveAxleLiftAirPressure()
    {
	driveAxleLiftAirPressure = null;
    }
    
    
    // Methods for field "driveAxleTemperature"
    public DriveAxleTemperature getDriveAxleTemperature()
    {
	return this.driveAxleTemperature;
    }
    
    public void setDriveAxleTemperature(DriveAxleTemperature driveAxleTemperature)
    {
	this.driveAxleTemperature = driveAxleTemperature;
    }
    
    public boolean hasDriveAxleTemperature()
    {
	return (driveAxleTemperature != null);
    }
    
    public void deleteDriveAxleTemperature()
    {
	driveAxleTemperature = null;
    }
    
    
    // Methods for field "driveAxleLubePressure"
    public DriveAxleLubePressure getDriveAxleLubePressure()
    {
	return this.driveAxleLubePressure;
    }
    
    public void setDriveAxleLubePressure(DriveAxleLubePressure driveAxleLubePressure)
    {
	this.driveAxleLubePressure = driveAxleLubePressure;
    }
    
    public boolean hasDriveAxleLubePressure()
    {
	return (driveAxleLubePressure != null);
    }
    
    public void deleteDriveAxleLubePressure()
    {
	driveAxleLubePressure = null;
    }
    
    
    // Methods for field "steeringAxleLubePressure"
    public SteeringAxleLubePressure getSteeringAxleLubePressure()
    {
	return this.steeringAxleLubePressure;
    }
    
    public void setSteeringAxleLubePressure(SteeringAxleLubePressure steeringAxleLubePressure)
    {
	this.steeringAxleLubePressure = steeringAxleLubePressure;
    }
    
    public boolean hasSteeringAxleLubePressure()
    {
	return (steeringAxleLubePressure != null);
    }
    
    public void deleteSteeringAxleLubePressure()
    {
	steeringAxleLubePressure = null;
    }
    
    
    /**
     * Implements BER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encodeValue(BerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	int len0 = 0;
	J1939data temp0 = this;

	if (temp0.steeringAxleLubePressure != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.steeringAxleLubePressure, sink), 0x89);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("steeringAxleLubePressure", "SteeringAxleLubePressure");
		throw ee;
	    }
	}
	if (temp0.driveAxleLubePressure != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.driveAxleLubePressure, sink), 0x88);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("driveAxleLubePressure", "DriveAxleLubePressure");
		throw ee;
	    }
	}
	if (temp0.driveAxleTemperature != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.driveAxleTemperature, sink), 0x87);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("driveAxleTemperature", "DriveAxleTemperature");
		throw ee;
	    }
	}
	if (temp0.driveAxleLiftAirPressure != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.driveAxleLiftAirPressure, sink), 0x86);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("driveAxleLiftAirPressure", "DriveAxleLiftAirPressure");
		throw ee;
	    }
	}
	if (temp0.driveAxleLocation != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.driveAxleLocation, sink), 0x85);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("driveAxleLocation", "DriveAxleLocation");
		throw ee;
	    }
	}
	if (temp0.steeringAxleTemperature != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.steeringAxleTemperature, sink), 0x84);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("steeringAxleTemperature", "SteeringAxleTemperature");
		throw ee;
	    }
	}
	if (temp0.cargoWeight != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.cargoWeight, sink), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("cargoWeight", "CargoWeight");
		throw ee;
	    }
	}
	if (temp0.trailerWeight != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.trailerWeight, sink), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("trailerWeight", "TrailerWeight");
		throw ee;
	    }
	}
	if (temp0.axle != null) {
	    try {
		int len1 = 0;
		java.util.ArrayList<com.bah.ode.asn.oss.dsrc.J1939data.Axle.Sequence_> temp1 = temp0.axle.elements;
		int idx1 = temp1 != null ? temp1.size() : 0;

		try {
		    while(idx1-- > 0) {
			int len2 = 0;
			com.bah.ode.asn.oss.dsrc.J1939data.Axle.Sequence_ temp2 = temp1.get(idx1);

			if (temp2.weight != null) {
			    try {
				len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.weight, sink), 0x81);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("weight", "AxleWeight");
				throw ee;
			    }
			}
			if (temp2.location != null) {
			    try {
				len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.location, sink), 0x80);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("location", "AxleLocation");
				throw ee;
			    }
			}
			len1 += sink.encodeLengthTag(len2, 0x30);
		    }
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "SEQUENCE OF", idx1);
		    throw ee;
		}
		len0 += sink.encodeLengthTag(len1, 0xA1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("axle", "SEQUENCE OF");
		throw ee;
	    }
	}
	if (temp0.tires != null) {
	    try {
		int len1 = 0;
		java.util.ArrayList<com.bah.ode.asn.oss.dsrc.J1939data.Tires.Sequence_> temp1 = temp0.tires.elements;
		int idx1 = temp1 != null ? temp1.size() : 0;

		try {
		    while(idx1-- > 0) {
			int len2 = 0;
			com.bah.ode.asn.oss.dsrc.J1939data.Tires.Sequence_ temp2 = temp1.get(idx1);

			if (temp2.detection != null) {
			    try {
				len2 += sink.encodeLengthTag(coder.encodeEnumerated(temp2.detection, sink), 0x86);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("detection", "TirePressureThresholdDetection");
				throw ee;
			    }
			}
			if (temp2.leakageRate != null) {
			    try {
				len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.leakageRate, sink), 0x85);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("leakageRate", "TireLeakageRate");
				throw ee;
			    }
			}
			if (temp2.wheelEndElectFault != null) {
			    try {
				len2 += sink.encodeLengthTag(coder.encodeBitString(temp2.wheelEndElectFault, sink), 0x84);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("wheelEndElectFault", "WheelEndElectFault");
				throw ee;
			    }
			}
			if (temp2.wheelSensorStatus != null) {
			    try {
				len2 += sink.encodeLengthTag(coder.encodeEnumerated(temp2.wheelSensorStatus, sink), 0x83);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("wheelSensorStatus", "WheelSensorStatus");
				throw ee;
			    }
			}
			if (temp2.temp != null) {
			    try {
				len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.temp, sink), 0x82);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("temp", "TireTemp");
				throw ee;
			    }
			}
			if (temp2.pressure != null) {
			    try {
				len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.pressure, sink), 0x81);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("pressure", "TirePressure");
				throw ee;
			    }
			}
			if (temp2.location != null) {
			    try {
				len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.location, sink), 0x80);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("location", "TireLocation");
				throw ee;
			    }
			}
			len1 += sink.encodeLengthTag(len2, 0x30);
		    }
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "SEQUENCE OF", idx1);
		    throw ee;
		}
		len0 += sink.encodeLengthTag(len1, 0xA0);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("tires", "SEQUENCE OF");
		throw ee;
	    }
	}

	return len0;
    }

    /**
     * Implements BER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public J1939data decodeValue(BerCoder coder, DecoderInput source)
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
	    if (tag == 0xA0) {
		try {
		    this.tires = new Tires();
		    {
			int total_len1 = source.mLength;
			int end_pos1 = (total_len1 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len1);
			int idx1 = 0;

			this.tires.elements = new java.util.ArrayList<com.bah.ode.asn.oss.dsrc.J1939data.Tires.Sequence_>();

			try {
			    for (;;) {
				if (source.position() >= end_pos1) {
				    if (source.position() > end_pos1)
					throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
				    break;
				}
				tag = source.decodeTagLength();
				if (tag == 0) {
				    if (total_len1 < 0) {
					if (source.mLength != 0)
					    throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);
					break;
				    }
				    if (source.mLength == 0)
					throw new DecoderException(ExceptionDescriptor._expect_tag, null);
				}
				com.bah.ode.asn.oss.dsrc.J1939data.Tires.Sequence_ temp1 = new com.bah.ode.asn.oss.dsrc.J1939data.Tires.Sequence_();
				this.tires.add(temp1);
				if (tag != 0x30)
				    source.raiseTagMismatchException(tag);
				{
				    int total_len2 = source.mLength;
				    int end_pos2 = (total_len2 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len2);

				    do {
					if (source.position() >= end_pos2)
					    break;
					tag = source.decodeTagLength();
					if (tag == 0)
					    break;
					if (tag == 0x80) {
					    try {
						temp1.location = new TireLocation(source.decodeLong());
					    } catch (Exception e) {
						DecoderException ee = DecoderException.wrapException(e);
						ee.appendFieldContext("location", "TireLocation");
						throw ee;
					    }
					    if (source.position() >= end_pos2)
						break;
					    tag = source.decodeTagLength();
					    if (tag == 0)
						break;
					}
					if (tag == 0x81) {
					    try {
						temp1.pressure = new TirePressure(source.decodeLong());
					    } catch (Exception e) {
						DecoderException ee = DecoderException.wrapException(e);
						ee.appendFieldContext("pressure", "TirePressure");
						throw ee;
					    }
					    if (source.position() >= end_pos2)
						break;
					    tag = source.decodeTagLength();
					    if (tag == 0)
						break;
					}
					if (tag == 0x82) {
					    try {
						temp1.temp = new TireTemp(source.decodeLong());
					    } catch (Exception e) {
						DecoderException ee = DecoderException.wrapException(e);
						ee.appendFieldContext("temp", "TireTemp");
						throw ee;
					    }
					    if (source.position() >= end_pos2)
						break;
					    tag = source.decodeTagLength();
					    if (tag == 0)
						break;
					}
					if (tag == 0x83) {
					    try {
						int idx3 = WheelSensorStatus.indexOfValue(source.decodeInt());
						if (idx3 < 0)
						    throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
						temp1.wheelSensorStatus = WheelSensorStatus.cNamedNumbers[idx3];
					    } catch (Exception e) {
						DecoderException ee = DecoderException.wrapException(e);
						ee.appendFieldContext("wheelSensorStatus", "WheelSensorStatus");
						throw ee;
					    }
					    if (source.position() >= end_pos2)
						break;
					    tag = source.decodeTagLength();
					    if (tag == 0)
						break;
					}
					if (tag == 0x84 || tag == 0xA4) {
					    try {
						temp1.wheelEndElectFault = new WheelEndElectFault();
						byte[] b = coder.decodeBitString(source);
						temp1.wheelEndElectFault.setValue(b, b.length * 8 - coder.getUnused());
					    } catch (Exception e) {
						DecoderException ee = DecoderException.wrapException(e);
						ee.appendFieldContext("wheelEndElectFault", "WheelEndElectFault");
						throw ee;
					    }
					    if (source.position() >= end_pos2)
						break;
					    tag = source.decodeTagLength();
					    if (tag == 0)
						break;
					}
					if (tag == 0x85) {
					    try {
						temp1.leakageRate = new TireLeakageRate(source.decodeLong());
					    } catch (Exception e) {
						DecoderException ee = DecoderException.wrapException(e);
						ee.appendFieldContext("leakageRate", "TireLeakageRate");
						throw ee;
					    }
					    if (source.position() >= end_pos2)
						break;
					    tag = source.decodeTagLength();
					    if (tag == 0)
						break;
					}
					if (tag == 0x86) {
					    try {
						int idx3 = TirePressureThresholdDetection.indexOfValue(source.decodeLong());
						temp1.detection = (idx3 < 0) ? TirePressureThresholdDetection.unknownEnumerator() : TirePressureThresholdDetection.cNamedNumbers[idx3];
					    } catch (Exception e) {
						DecoderException ee = DecoderException.wrapException(e);
						ee.appendFieldContext("detection", "TirePressureThresholdDetection");
						throw ee;
					    }
					    if (source.position() >= end_pos2)
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
						ee.appendExtensionContext("SEQUENCE", -1);
						throw ee;
					    }
					    if (source.position() >= end_pos2)
						break;
					    tag = source.decodeTagLength();
					    if (tag == 0)
						break;
					}
				    } while(false);

				    if (source.position() > end_pos2)
					throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
				    if (total_len2 < 0 && source.mLength != 0)
					throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);
				}
				++idx1;
			    }
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendElementContext(null, "SEQUENCE OF", idx1);
			    throw ee;
			}
		    }
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("tires", "SEQUENCE OF");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xA1) {
		try {
		    this.axle = new Axle();
		    {
			int total_len1 = source.mLength;
			int end_pos1 = (total_len1 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len1);
			int idx1 = 0;

			this.axle.elements = new java.util.ArrayList<com.bah.ode.asn.oss.dsrc.J1939data.Axle.Sequence_>();

			try {
			    for (;;) {
				if (source.position() >= end_pos1) {
				    if (source.position() > end_pos1)
					throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
				    break;
				}
				tag = source.decodeTagLength();
				if (tag == 0) {
				    if (total_len1 < 0) {
					if (source.mLength != 0)
					    throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);
					break;
				    }
				    if (source.mLength == 0)
					throw new DecoderException(ExceptionDescriptor._expect_tag, null);
				}
				com.bah.ode.asn.oss.dsrc.J1939data.Axle.Sequence_ temp1 = new com.bah.ode.asn.oss.dsrc.J1939data.Axle.Sequence_();
				this.axle.add(temp1);
				if (tag != 0x30)
				    source.raiseTagMismatchException(tag);
				{
				    int total_len2 = source.mLength;
				    int end_pos2 = (total_len2 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len2);

				    do {
					if (source.position() >= end_pos2)
					    break;
					tag = source.decodeTagLength();
					if (tag == 0)
					    break;
					if (tag == 0x80) {
					    try {
						temp1.location = new AxleLocation(source.decodeLong());
					    } catch (Exception e) {
						DecoderException ee = DecoderException.wrapException(e);
						ee.appendFieldContext("location", "AxleLocation");
						throw ee;
					    }
					    if (source.position() >= end_pos2)
						break;
					    tag = source.decodeTagLength();
					    if (tag == 0)
						break;
					}
					if (tag == 0x81) {
					    try {
						temp1.weight = new AxleWeight(source.decodeLong());
					    } catch (Exception e) {
						DecoderException ee = DecoderException.wrapException(e);
						ee.appendFieldContext("weight", "AxleWeight");
						throw ee;
					    }
					    if (source.position() >= end_pos2)
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
						ee.appendExtensionContext("SEQUENCE", -1);
						throw ee;
					    }
					    if (source.position() >= end_pos2)
						break;
					    tag = source.decodeTagLength();
					    if (tag == 0)
						break;
					}
				    } while(false);

				    if (source.position() > end_pos2)
					throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
				    if (total_len2 < 0 && source.mLength != 0)
					throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);
				}
				++idx1;
			    }
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendElementContext(null, "SEQUENCE OF", idx1);
			    throw ee;
			}
		    }
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("axle", "SEQUENCE OF");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x82) {
		try {
		    this.trailerWeight = new TrailerWeight(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("trailerWeight", "TrailerWeight");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x83) {
		try {
		    this.cargoWeight = new CargoWeight(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("cargoWeight", "CargoWeight");
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
		    this.steeringAxleTemperature = new SteeringAxleTemperature(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("steeringAxleTemperature", "SteeringAxleTemperature");
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
		    this.driveAxleLocation = new DriveAxleLocation(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("driveAxleLocation", "DriveAxleLocation");
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
		    this.driveAxleLiftAirPressure = new DriveAxleLiftAirPressure(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("driveAxleLiftAirPressure", "DriveAxleLiftAirPressure");
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
		    this.driveAxleTemperature = new DriveAxleTemperature(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("driveAxleTemperature", "DriveAxleTemperature");
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
		    this.driveAxleLubePressure = new DriveAxleLubePressure(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("driveAxleLubePressure", "DriveAxleLubePressure");
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
		    this.steeringAxleLubePressure = new SteeringAxleLubePressure(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("steeringAxleLubePressure", "SteeringAxleLubePressure");
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
		    ee.appendExtensionContext("J1939data", -1);
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
	J1939data temp0 = this;

	if (temp0.steeringAxleLubePressure != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.steeringAxleLubePressure, sink), 0x89);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("steeringAxleLubePressure", "SteeringAxleLubePressure");
		throw ee;
	    }
	}
	if (temp0.driveAxleLubePressure != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.driveAxleLubePressure, sink), 0x88);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("driveAxleLubePressure", "DriveAxleLubePressure");
		throw ee;
	    }
	}
	if (temp0.driveAxleTemperature != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.driveAxleTemperature, sink), 0x87);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("driveAxleTemperature", "DriveAxleTemperature");
		throw ee;
	    }
	}
	if (temp0.driveAxleLiftAirPressure != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.driveAxleLiftAirPressure, sink), 0x86);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("driveAxleLiftAirPressure", "DriveAxleLiftAirPressure");
		throw ee;
	    }
	}
	if (temp0.driveAxleLocation != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.driveAxleLocation, sink), 0x85);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("driveAxleLocation", "DriveAxleLocation");
		throw ee;
	    }
	}
	if (temp0.steeringAxleTemperature != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.steeringAxleTemperature, sink), 0x84);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("steeringAxleTemperature", "SteeringAxleTemperature");
		throw ee;
	    }
	}
	if (temp0.cargoWeight != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.cargoWeight, sink), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("cargoWeight", "CargoWeight");
		throw ee;
	    }
	}
	if (temp0.trailerWeight != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.trailerWeight, sink), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("trailerWeight", "TrailerWeight");
		throw ee;
	    }
	}
	if (temp0.axle != null) {
	    try {
		int len1 = 0;
		java.util.ArrayList<com.bah.ode.asn.oss.dsrc.J1939data.Axle.Sequence_> temp1 = temp0.axle.elements;
		int idx1 = temp1 != null ? temp1.size() : 0;

		try {
		    while(idx1-- > 0) {
			int len2 = 0;
			com.bah.ode.asn.oss.dsrc.J1939data.Axle.Sequence_ temp2 = temp1.get(idx1);

			if (temp2.weight != null) {
			    try {
				len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.weight, sink), 0x81);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("weight", "AxleWeight");
				throw ee;
			    }
			}
			if (temp2.location != null) {
			    try {
				len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.location, sink), 0x80);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("location", "AxleLocation");
				throw ee;
			    }
			}
			len1 += sink.encodeLengthTag(len2, 0x30);
		    }
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "SEQUENCE OF", idx1);
		    throw ee;
		}
		len0 += sink.encodeLengthTag(len1, 0xA1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("axle", "SEQUENCE OF");
		throw ee;
	    }
	}
	if (temp0.tires != null) {
	    try {
		int len1 = 0;
		java.util.ArrayList<com.bah.ode.asn.oss.dsrc.J1939data.Tires.Sequence_> temp1 = temp0.tires.elements;
		int idx1 = temp1 != null ? temp1.size() : 0;

		try {
		    while(idx1-- > 0) {
			int len2 = 0;
			com.bah.ode.asn.oss.dsrc.J1939data.Tires.Sequence_ temp2 = temp1.get(idx1);

			if (temp2.detection != null) {
			    try {
				len2 += sink.encodeLengthTag(coder.encodeEnumerated(temp2.detection, sink), 0x86);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("detection", "TirePressureThresholdDetection");
				throw ee;
			    }
			}
			if (temp2.leakageRate != null) {
			    try {
				len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.leakageRate, sink), 0x85);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("leakageRate", "TireLeakageRate");
				throw ee;
			    }
			}
			if (temp2.wheelEndElectFault != null) {
			    try {
				int bitsToTransfer = com.oss.util.BitTool.truncateTrailingZeroes(temp2.wheelEndElectFault);
				len2 += sink.encodeLengthTag(coder.encodeBitString(temp2.wheelEndElectFault, sink, bitsToTransfer), 0x84);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("wheelEndElectFault", "WheelEndElectFault");
				throw ee;
			    }
			}
			if (temp2.wheelSensorStatus != null) {
			    try {
				len2 += sink.encodeLengthTag(coder.encodeEnumerated(temp2.wheelSensorStatus, sink), 0x83);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("wheelSensorStatus", "WheelSensorStatus");
				throw ee;
			    }
			}
			if (temp2.temp != null) {
			    try {
				len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.temp, sink), 0x82);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("temp", "TireTemp");
				throw ee;
			    }
			}
			if (temp2.pressure != null) {
			    try {
				len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.pressure, sink), 0x81);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("pressure", "TirePressure");
				throw ee;
			    }
			}
			if (temp2.location != null) {
			    try {
				len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.location, sink), 0x80);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("location", "TireLocation");
				throw ee;
			    }
			}
			len1 += sink.encodeLengthTag(len2, 0x30);
		    }
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "SEQUENCE OF", idx1);
		    throw ee;
		}
		len0 += sink.encodeLengthTag(len1, 0xA0);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("tires", "SEQUENCE OF");
		throw ee;
	    }
	}

	return len0;
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, J1939data data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.tires != null);
	sink.writeBit(data.axle != null);
	sink.writeBit(data.trailerWeight != null);
	sink.writeBit(data.cargoWeight != null);
	sink.writeBit(data.steeringAxleTemperature != null);
	sink.writeBit(data.driveAxleLocation != null);
	sink.writeBit(data.driveAxleLiftAirPressure != null);
	sink.writeBit(data.driveAxleTemperature != null);
	sink.writeBit(data.driveAxleLubePressure != null);
	sink.writeBit(data.steeringAxleLubePressure != null);
	nbits += 11;
	if (data.tires != null) {
	    // Encode field 'tires'
	    try {
		Tires item1 = data.tires;

		nbits += Tires.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("tires", "SEQUENCE OF");
		throw ee;
	    }
	}
	if (data.axle != null) {
	    // Encode field 'axle'
	    try {
		Axle item1 = data.axle;

		nbits += Axle.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("axle", "SEQUENCE OF");
		throw ee;
	    }
	}
	if (data.trailerWeight != null) {
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
	}
	if (data.cargoWeight != null) {
	    // Encode field 'cargoWeight'
	    try {
		CargoWeight item1 = data.cargoWeight;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 65535)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 65535, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("cargoWeight", "CargoWeight");
		throw ee;
	    }
	}
	if (data.steeringAxleTemperature != null) {
	    // Encode field 'steeringAxleTemperature'
	    try {
		SteeringAxleTemperature item1 = data.steeringAxleTemperature;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 255)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("steeringAxleTemperature", "SteeringAxleTemperature");
		throw ee;
	    }
	}
	if (data.driveAxleLocation != null) {
	    // Encode field 'driveAxleLocation'
	    try {
		DriveAxleLocation item1 = data.driveAxleLocation;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 255)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("driveAxleLocation", "DriveAxleLocation");
		throw ee;
	    }
	}
	if (data.driveAxleLiftAirPressure != null) {
	    // Encode field 'driveAxleLiftAirPressure'
	    try {
		DriveAxleLiftAirPressure item1 = data.driveAxleLiftAirPressure;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 1000)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 1000, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("driveAxleLiftAirPressure", "DriveAxleLiftAirPressure");
		throw ee;
	    }
	}
	if (data.driveAxleTemperature != null) {
	    // Encode field 'driveAxleTemperature'
	    try {
		DriveAxleTemperature item1 = data.driveAxleTemperature;
		long temp1 = item1.longValue();

		if (temp1 < -40 || temp1 > 210)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, -40, 210, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("driveAxleTemperature", "DriveAxleTemperature");
		throw ee;
	    }
	}
	if (data.driveAxleLubePressure != null) {
	    // Encode field 'driveAxleLubePressure'
	    try {
		DriveAxleLubePressure item1 = data.driveAxleLubePressure;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 1000)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 1000, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("driveAxleLubePressure", "DriveAxleLubePressure");
		throw ee;
	    }
	}
	if (data.steeringAxleLubePressure != null) {
	    // Encode field 'steeringAxleLubePressure'
	    try {
		SteeringAxleLubePressure item1 = data.steeringAxleLubePressure;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 255)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("steeringAxleLubePressure", "SteeringAxleLubePressure");
		throw ee;
	    }
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static J1939data decodeValue(PerCoder coder, InputBitStream source, J1939data data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_tires0 = source.readBit();
	boolean has_axle0 = source.readBit();
	boolean has_trailerWeight0 = source.readBit();
	boolean has_cargoWeight0 = source.readBit();
	boolean has_steeringAxleTemperature0 = source.readBit();
	boolean has_driveAxleLocation0 = source.readBit();
	boolean has_driveAxleLiftAirPressure0 = source.readBit();
	boolean has_driveAxleTemperature0 = source.readBit();
	boolean has_driveAxleLubePressure0 = source.readBit();
	boolean has_steeringAxleLubePressure0 = source.readBit();
    /** Decode root fields **/
	if (has_tires0) {
	    // Decode field 'tires'
	    try {
		if (data.tires == null)
		    data.tires = new Tires();
		data.tires.decodeValue(coder, source, data.tires);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("tires", "SEQUENCE OF");
		throw de;
	    }
	} else {
	    data.tires = null;
	}
	if (has_axle0) {
	    // Decode field 'axle'
	    try {
		if (data.axle == null)
		    data.axle = new Axle();
		data.axle.decodeValue(coder, source, data.axle);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("axle", "SEQUENCE OF");
		throw de;
	    }
	} else {
	    data.axle = null;
	}
	if (has_trailerWeight0) {
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
	} else {
	    data.trailerWeight = null;
	}
	if (has_cargoWeight0) {
	    // Decode field 'cargoWeight'
	    try {
		long temp1;

		if (data.cargoWeight == null)
		    data.cargoWeight = new CargoWeight();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 65535);
		if (temp1 > 65535)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.cargoWeight.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("cargoWeight", "CargoWeight");
		throw de;
	    }
	} else {
	    data.cargoWeight = null;
	}
	if (has_steeringAxleTemperature0) {
	    // Decode field 'steeringAxleTemperature'
	    try {
		long temp1;

		if (data.steeringAxleTemperature == null)
		    data.steeringAxleTemperature = new SteeringAxleTemperature();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
		if (temp1 > 255)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.steeringAxleTemperature.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("steeringAxleTemperature", "SteeringAxleTemperature");
		throw de;
	    }
	} else {
	    data.steeringAxleTemperature = null;
	}
	if (has_driveAxleLocation0) {
	    // Decode field 'driveAxleLocation'
	    try {
		long temp1;

		if (data.driveAxleLocation == null)
		    data.driveAxleLocation = new DriveAxleLocation();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
		if (temp1 > 255)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.driveAxleLocation.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("driveAxleLocation", "DriveAxleLocation");
		throw de;
	    }
	} else {
	    data.driveAxleLocation = null;
	}
	if (has_driveAxleLiftAirPressure0) {
	    // Decode field 'driveAxleLiftAirPressure'
	    try {
		long temp1;

		if (data.driveAxleLiftAirPressure == null)
		    data.driveAxleLiftAirPressure = new DriveAxleLiftAirPressure();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 1000);
		if (temp1 > 1000)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.driveAxleLiftAirPressure.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("driveAxleLiftAirPressure", "DriveAxleLiftAirPressure");
		throw de;
	    }
	} else {
	    data.driveAxleLiftAirPressure = null;
	}
	if (has_driveAxleTemperature0) {
	    // Decode field 'driveAxleTemperature'
	    try {
		long temp1;

		if (data.driveAxleTemperature == null)
		    data.driveAxleTemperature = new DriveAxleTemperature();
		temp1 = coder.decodeConstrainedWholeNumber(source, -40, 210);
		if (temp1 > 210)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.driveAxleTemperature.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("driveAxleTemperature", "DriveAxleTemperature");
		throw de;
	    }
	} else {
	    data.driveAxleTemperature = null;
	}
	if (has_driveAxleLubePressure0) {
	    // Decode field 'driveAxleLubePressure'
	    try {
		long temp1;

		if (data.driveAxleLubePressure == null)
		    data.driveAxleLubePressure = new DriveAxleLubePressure();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 1000);
		if (temp1 > 1000)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.driveAxleLubePressure.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("driveAxleLubePressure", "DriveAxleLubePressure");
		throw de;
	    }
	} else {
	    data.driveAxleLubePressure = null;
	}
	if (has_steeringAxleLubePressure0) {
	    // Decode field 'steeringAxleLubePressure'
	    try {
		long temp1;

		if (data.steeringAxleLubePressure == null)
		    data.steeringAxleLubePressure = new SteeringAxleLubePressure();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
		if (temp1 > 255)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.steeringAxleLubePressure.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("steeringAxleLubePressure", "SteeringAxleLubePressure");
		throw de;
	    }
	} else {
	    data.steeringAxleLubePressure = null;
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
	if (this.tires != null) {
	    try {
		comma0 = true;
		printer.newLine(writer);
		writer.print("tires ");
		{
		    java.util.ArrayList<com.bah.ode.asn.oss.dsrc.J1939data.Tires.Sequence_> temp1 = this.tires.elements;
		    int len1 = temp1 != null ? temp1.size() : 0;
		    int idx1 = 0;

		    try {
			writer.print('{');
			printer.indent();
			for (idx1 = 0; idx1 < len1; idx1++){
			    if (idx1 > 0)
				writer.print(',');
			    printer.newLine(writer);
			    boolean comma2;
			    comma2 = false;
			    writer.print('{');
			    printer.indent();
			    if (temp1.get(idx1).location != null) {
				try {
				    comma2 = true;
				    printer.newLine(writer);
				    writer.print("location ");
				    writer.print(temp1.get(idx1).location.longValue());
				} catch (Exception e) {
				    printer.reportError(e, null, writer);
				}
			    }
			    if (temp1.get(idx1).pressure != null) {
				try {
				    if (comma2)
					writer.print(',');
				    comma2 = true;
				    printer.newLine(writer);
				    writer.print("pressure ");
				    writer.print(temp1.get(idx1).pressure.longValue());
				} catch (Exception e) {
				    printer.reportError(e, null, writer);
				}
			    }
			    if (temp1.get(idx1).temp != null) {
				try {
				    if (comma2)
					writer.print(',');
				    comma2 = true;
				    printer.newLine(writer);
				    writer.print("temp ");
				    writer.print(temp1.get(idx1).temp.longValue());
				} catch (Exception e) {
				    printer.reportError(e, null, writer);
				}
			    }
			    if (temp1.get(idx1).wheelSensorStatus != null) {
				try {
				    if (comma2)
					writer.print(',');
				    comma2 = true;
				    printer.newLine(writer);
				    writer.print("wheelSensorStatus ");
				    printer.print(temp1.get(idx1).wheelSensorStatus, writer, temp1.get(idx1).wheelSensorStatus.cConstantNameList);
				} catch (Exception e) {
				    printer.reportError(e, null, writer);
				}
			    }
			    if (temp1.get(idx1).wheelEndElectFault != null) {
				try {
				    if (comma2)
					writer.print(',');
				    comma2 = true;
				    printer.newLine(writer);
				    writer.print("wheelEndElectFault ");
				    printer.print(temp1.get(idx1).wheelEndElectFault, writer);
				} catch (Exception e) {
				    printer.reportError(e, null, writer);
				}
			    }
			    if (temp1.get(idx1).leakageRate != null) {
				try {
				    if (comma2)
					writer.print(',');
				    comma2 = true;
				    printer.newLine(writer);
				    writer.print("leakageRate ");
				    writer.print(temp1.get(idx1).leakageRate.longValue());
				} catch (Exception e) {
				    printer.reportError(e, null, writer);
				}
			    }
			    if (temp1.get(idx1).detection != null) {
				try {
				    if (comma2)
					writer.print(',');
				    comma2 = true;
				    printer.newLine(writer);
				    writer.print("detection ");
				    printer.print(temp1.get(idx1).detection, writer, temp1.get(idx1).detection.cConstantNameList);
				} catch (Exception e) {
				    printer.reportError(e, null, writer);
				}
			    }
			    printer.undent();
			    if (comma2)
				printer.newLine(writer);
			    writer.print('}');
			}
			printer.undent();
			if (len1 > 0)
			    printer.newLine(writer);
			writer.print('}');
		    } catch (Exception e) {
			printer.reportError(e, null, writer);
		    }
		}
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.axle != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("axle ");
		{
		    java.util.ArrayList<com.bah.ode.asn.oss.dsrc.J1939data.Axle.Sequence_> temp1 = this.axle.elements;
		    int len1 = temp1 != null ? temp1.size() : 0;
		    int idx1 = 0;

		    try {
			writer.print('{');
			printer.indent();
			for (idx1 = 0; idx1 < len1; idx1++){
			    if (idx1 > 0)
				writer.print(',');
			    printer.newLine(writer);
			    boolean comma2;
			    comma2 = false;
			    writer.print('{');
			    printer.indent();
			    if (temp1.get(idx1).location != null) {
				try {
				    comma2 = true;
				    printer.newLine(writer);
				    writer.print("location ");
				    writer.print(temp1.get(idx1).location.longValue());
				} catch (Exception e) {
				    printer.reportError(e, null, writer);
				}
			    }
			    if (temp1.get(idx1).weight != null) {
				try {
				    if (comma2)
					writer.print(',');
				    comma2 = true;
				    printer.newLine(writer);
				    writer.print("weight ");
				    writer.print(temp1.get(idx1).weight.longValue());
				} catch (Exception e) {
				    printer.reportError(e, null, writer);
				}
			    }
			    printer.undent();
			    if (comma2)
				printer.newLine(writer);
			    writer.print('}');
			}
			printer.undent();
			if (len1 > 0)
			    printer.newLine(writer);
			writer.print('}');
		    } catch (Exception e) {
			printer.reportError(e, null, writer);
		    }
		}
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.trailerWeight != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("trailerWeight ");
		writer.print(this.trailerWeight.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.cargoWeight != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("cargoWeight ");
		writer.print(this.cargoWeight.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.steeringAxleTemperature != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("steeringAxleTemperature ");
		writer.print(this.steeringAxleTemperature.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.driveAxleLocation != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("driveAxleLocation ");
		writer.print(this.driveAxleLocation.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.driveAxleLiftAirPressure != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("driveAxleLiftAirPressure ");
		writer.print(this.driveAxleLiftAirPressure.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.driveAxleTemperature != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("driveAxleTemperature ");
		writer.print(this.driveAxleTemperature.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.driveAxleLubePressure != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("driveAxleLubePressure ");
		writer.print(this.driveAxleLubePressure.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.steeringAxleLubePressure != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("steeringAxleLubePressure ");
		writer.print(this.steeringAxleLubePressure.longValue());
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
	return equalTo((J1939data)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((J1939data)that);
    }
    
    public boolean equalTo(J1939data that) {
	if (this.tires != null && that.tires != null) {
	    if (!this.tires.equalTo(that.tires))
		return false;
	}
	if (this.axle != null && that.axle != null) {
	    if (!this.axle.equalTo(that.axle))
		return false;
	}
	if (this.trailerWeight != null && that.trailerWeight != null) {
	    if (!this.trailerWeight.equalTo(that.trailerWeight))
		return false;
	}
	if (this.cargoWeight != null && that.cargoWeight != null) {
	    if (!this.cargoWeight.equalTo(that.cargoWeight))
		return false;
	}
	if (this.steeringAxleTemperature != null && that.steeringAxleTemperature != null) {
	    if (!this.steeringAxleTemperature.equalTo(that.steeringAxleTemperature))
		return false;
	}
	if (this.driveAxleLocation != null && that.driveAxleLocation != null) {
	    if (!this.driveAxleLocation.equalTo(that.driveAxleLocation))
		return false;
	}
	if (this.driveAxleLiftAirPressure != null && that.driveAxleLiftAirPressure != null) {
	    if (!this.driveAxleLiftAirPressure.equalTo(that.driveAxleLiftAirPressure))
		return false;
	}
	if (this.driveAxleTemperature != null && that.driveAxleTemperature != null) {
	    if (!this.driveAxleTemperature.equalTo(that.driveAxleTemperature))
		return false;
	}
	if (this.driveAxleLubePressure != null && that.driveAxleLubePressure != null) {
	    if (!this.driveAxleLubePressure.equalTo(that.driveAxleLubePressure))
		return false;
	}
	if (this.steeringAxleLubePressure != null && that.steeringAxleLubePressure != null) {
	    if (!this.steeringAxleLubePressure.equalTo(that.steeringAxleLubePressure))
		return false;
	}
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public J1939data clone() {
	J1939data copy = (J1939data)super.clone();
	if (tires != null) {
	    copy.tires = tires.clone();
	}
	if (axle != null) {
	    copy.axle = axle.clone();
	}
	if (trailerWeight != null) {
	    copy.trailerWeight = trailerWeight.clone();
	}
	if (cargoWeight != null) {
	    copy.cargoWeight = cargoWeight.clone();
	}
	if (steeringAxleTemperature != null) {
	    copy.steeringAxleTemperature = steeringAxleTemperature.clone();
	}
	if (driveAxleLocation != null) {
	    copy.driveAxleLocation = driveAxleLocation.clone();
	}
	if (driveAxleLiftAirPressure != null) {
	    copy.driveAxleLiftAirPressure = driveAxleLiftAirPressure.clone();
	}
	if (driveAxleTemperature != null) {
	    copy.driveAxleTemperature = driveAxleTemperature.clone();
	}
	if (driveAxleLubePressure != null) {
	    copy.driveAxleLubePressure = driveAxleLubePressure.clone();
	}
	if (steeringAxleLubePressure != null) {
	    copy.steeringAxleLubePressure = steeringAxleLubePressure.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.tires != null ? this.tires.hashCode() : 0);
	hash = 41 * hash + (this.axle != null ? this.axle.hashCode() : 0);
	hash = 41 * hash + (this.trailerWeight != null ? this.trailerWeight.hashCode() : 0);
	hash = 41 * hash + (this.cargoWeight != null ? this.cargoWeight.hashCode() : 0);
	hash = 41 * hash + (this.steeringAxleTemperature != null ? this.steeringAxleTemperature.hashCode() : 0);
	hash = 41 * hash + (this.driveAxleLocation != null ? this.driveAxleLocation.hashCode() : 0);
	hash = 41 * hash + (this.driveAxleLiftAirPressure != null ? this.driveAxleLiftAirPressure.hashCode() : 0);
	hash = 41 * hash + (this.driveAxleTemperature != null ? this.driveAxleTemperature.hashCode() : 0);
	hash = 41 * hash + (this.driveAxleLubePressure != null ? this.driveAxleLubePressure.hashCode() : 0);
	hash = 41 * hash + (this.steeringAxleLubePressure != null ? this.steeringAxleLubePressure.hashCode() : 0);
	return hash;
    }
} // End class definition for J1939data
