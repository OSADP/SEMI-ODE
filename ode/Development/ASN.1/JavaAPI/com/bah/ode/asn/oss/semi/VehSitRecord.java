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
 * Define the ASN1 Type VehSitRecord from ASN1 Module SEMI.
 * @see Sequence
 */

public class VehSitRecord extends Sequence {
    public com.bah.ode.asn.oss.dsrc.TemporaryID tempID;
    public com.bah.ode.asn.oss.dsrc.DDateTime time;
    public com.bah.ode.asn.oss.dsrc.Position3D pos;
    public FundamentalSituationalStatus fundamental;
    public VehicleSituationStatus vehstat;
    public Weather weather;
    public Environmental env;
    public ElectricVeh elveh;
    
    /**
     * The default constructor.
     */
    public VehSitRecord()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public VehSitRecord(com.bah.ode.asn.oss.dsrc.TemporaryID tempID, 
		    com.bah.ode.asn.oss.dsrc.DDateTime time, 
		    com.bah.ode.asn.oss.dsrc.Position3D pos, 
		    FundamentalSituationalStatus fundamental, 
		    VehicleSituationStatus vehstat, Weather weather, 
		    Environmental env, ElectricVeh elveh)
    {
	setTempID(tempID);
	setTime(time);
	setPos(pos);
	setFundamental(fundamental);
	setVehstat(vehstat);
	setWeather(weather);
	setEnv(env);
	setElveh(elveh);
    }
    
    /**
     * Construct with required components.
     */
    public VehSitRecord(com.bah.ode.asn.oss.dsrc.TemporaryID tempID, 
		    com.bah.ode.asn.oss.dsrc.DDateTime time, 
		    com.bah.ode.asn.oss.dsrc.Position3D pos, 
		    FundamentalSituationalStatus fundamental)
    {
	setTempID(tempID);
	setTime(time);
	setPos(pos);
	setFundamental(fundamental);
    }
    
    
    // Methods for field "tempID"
    public com.bah.ode.asn.oss.dsrc.TemporaryID getTempID()
    {
	return this.tempID;
    }
    
    public void setTempID(com.bah.ode.asn.oss.dsrc.TemporaryID tempID)
    {
	this.tempID = tempID;
    }
    
    
    // Methods for field "time"
    public com.bah.ode.asn.oss.dsrc.DDateTime getTime()
    {
	return this.time;
    }
    
    public void setTime(com.bah.ode.asn.oss.dsrc.DDateTime time)
    {
	this.time = time;
    }
    
    
    // Methods for field "pos"
    public com.bah.ode.asn.oss.dsrc.Position3D getPos()
    {
	return this.pos;
    }
    
    public void setPos(com.bah.ode.asn.oss.dsrc.Position3D pos)
    {
	this.pos = pos;
    }
    
    
    // Methods for field "fundamental"
    public FundamentalSituationalStatus getFundamental()
    {
	return this.fundamental;
    }
    
    public void setFundamental(FundamentalSituationalStatus fundamental)
    {
	this.fundamental = fundamental;
    }
    
    
    // Methods for field "vehstat"
    public VehicleSituationStatus getVehstat()
    {
	return this.vehstat;
    }
    
    public void setVehstat(VehicleSituationStatus vehstat)
    {
	this.vehstat = vehstat;
    }
    
    public boolean hasVehstat()
    {
	return (vehstat != null);
    }
    
    public void deleteVehstat()
    {
	vehstat = null;
    }
    
    
    // Methods for field "weather"
    public Weather getWeather()
    {
	return this.weather;
    }
    
    public void setWeather(Weather weather)
    {
	this.weather = weather;
    }
    
    public boolean hasWeather()
    {
	return (weather != null);
    }
    
    public void deleteWeather()
    {
	weather = null;
    }
    
    
    // Methods for field "env"
    public Environmental getEnv()
    {
	return this.env;
    }
    
    public void setEnv(Environmental env)
    {
	this.env = env;
    }
    
    public boolean hasEnv()
    {
	return (env != null);
    }
    
    public void deleteEnv()
    {
	env = null;
    }
    
    
    // Methods for field "elveh"
    public ElectricVeh getElveh()
    {
	return this.elveh;
    }
    
    public void setElveh(ElectricVeh elveh)
    {
	this.elveh = elveh;
    }
    
    public boolean hasElveh()
    {
	return (elveh != null);
    }
    
    public void deleteElveh()
    {
	elveh = null;
    }
    
    
    /**
     * Implements BER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encodeValue(BerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	int len0 = 0;
	VehSitRecord temp0 = this;

	if (temp0.elveh != null) {
	    try {
		int len1 = 0;
		ElectricVeh temp1 = temp0.elveh;

		try {
		    len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.range, sink), 0x82);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("range", "Range");
		    throw ee;
		}
		try {
		    len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.cap, sink), 0x81);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("cap", "Capacity");
		    throw ee;
		}
		try {
		    len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.soc, sink), 0x80);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("soc", "StateOfCharge");
		    throw ee;
		}
		len0 += sink.encodeLengthTag(len1, 0xA7);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("elveh", "ElectricVeh");
		throw ee;
	    }
	}
	if (temp0.env != null) {
	    try {
		int len1 = 0;
		Environmental temp1 = temp0.env;

		try {
		    len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.fuelEcon, sink), 0x82);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("fuelEcon", "FuelEconomy");
		    throw ee;
		}
		try {
		    len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.emiss, sink), 0x81);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("emiss", "Emissions");
		    throw ee;
		}
		try {
		    len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.fuelCon, sink), 0x80);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("fuelCon", "FuelConsumption");
		    throw ee;
		}
		len0 += sink.encodeLengthTag(len1, 0xA6);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("env", "Environmental");
		throw ee;
	    }
	}
	if (temp0.weather != null) {
	    try {
		int len1 = 0;
		Weather temp1 = temp0.weather;

		if (temp1.weatherReport != null) {
		    try {
			int len2 = 0;
			com.bah.ode.asn.oss.semi.Weather.WeatherReport temp2 = temp1.weatherReport;

			if (temp2.friction != null) {
			    try {
				len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.friction, sink), 0x84);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("friction", "EssMobileFriction");
				throw ee;
			    }
			}
			if (temp2.solarRadiation != null) {
			    try {
				len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.solarRadiation, sink), 0x83);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("solarRadiation", "EssSolarRadiation");
				throw ee;
			    }
			}
			if (temp2.precipSituation != null) {
			    try {
				len2 += sink.encodeLengthTag(coder.encodeEnumerated(temp2.precipSituation, sink), 0x82);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("precipSituation", "EssPrecipSituation");
				throw ee;
			    }
			}
			if (temp2.rainRate != null) {
			    try {
				len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.rainRate, sink), 0x81);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("rainRate", "EssPrecipRate");
				throw ee;
			    }
			}
			try {
			    len2 += sink.encodeLengthTag(coder.encodeEnumerated(temp2.isRaining, sink), 0x80);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendFieldContext("isRaining", "EssPrecipYesNo");
			    throw ee;
			}
			len1 += sink.encodeLengthTag(len2, 0xA3);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("weatherReport", "SEQUENCE");
			throw ee;
		    }
		}
		if (temp1.airPres != null) {
		    try {
			len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.airPres, sink), 0x82);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("airPres", "AmbientAirPressure");
			throw ee;
		    }
		}
		if (temp1.airTemp != null) {
		    try {
			len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.airTemp, sink), 0x81);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("airTemp", "AmbientAirTemperature");
			throw ee;
		    }
		}
		if (temp1.wipers != null) {
		    try {
			int len2 = 0;
			com.bah.ode.asn.oss.semi.Weather.Wipers temp2 = temp1.wipers;

			if (temp2.rateRear != null) {
			    try {
				len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.rateRear, sink), 0x83);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("rateRear", "WiperRate");
				throw ee;
			    }
			}
			if (temp2.statRear != null) {
			    try {
				len2 += sink.encodeLengthTag(coder.encodeEnumerated(temp2.statRear, sink), 0x82);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("statRear", "WiperStatusRear");
				throw ee;
			    }
			}
			if (temp2.rateFrnt != null) {
			    try {
				len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.rateFrnt, sink), 0x81);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("rateFrnt", "WiperRate");
				throw ee;
			    }
			}
			try {
			    len2 += sink.encodeLengthTag(coder.encodeEnumerated(temp2.statFrnt, sink), 0x80);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendFieldContext("statFrnt", "WiperStatusFront");
			    throw ee;
			}
			len1 += sink.encodeLengthTag(len2, 0xA0);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("wipers", "SEQUENCE");
			throw ee;
		    }
		}
		len0 += sink.encodeLengthTag(len1, 0xA5);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("weather", "Weather");
		throw ee;
	    }
	}
	if (temp0.vehstat != null) {
	    try {
		int len1 = 0;
		VehicleSituationStatus temp1 = temp0.vehstat;

		if (temp1.tirePressure != null) {
		    try {
			int len2 = 0;
			com.bah.ode.asn.oss.semi.VehicleSituationStatus.TirePressure temp2 = temp1.tirePressure;

			try {
			    len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.rightRear, sink), 0x83);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendFieldContext("rightRear", "TirePressure");
			    throw ee;
			}
			try {
			    len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.rightFront, sink), 0x82);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendFieldContext("rightFront", "TirePressure");
			    throw ee;
			}
			try {
			    len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.leftRear, sink), 0x81);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendFieldContext("leftRear", "TirePressure");
			    throw ee;
			}
			try {
			    len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.leftFront, sink), 0x80);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendFieldContext("leftFront", "TirePressure");
			    throw ee;
			}
			len1 += sink.encodeLengthTag(len2, 0xA2);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("tirePressure", "SEQUENCE");
			throw ee;
		    }
		}
		if (temp1.throttlePos != null) {
		    try {
			len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.throttlePos, sink), 0x81);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("throttlePos", "ThrottlePosition");
			throw ee;
		    }
		}
		try {
		    len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.lights, sink), 0x80);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("lights", "ExteriorLights");
		    throw ee;
		}
		len0 += sink.encodeLengthTag(len1, 0xA4);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("vehstat", "VehicleSituationStatus");
		throw ee;
	    }
	}
	try {
	    int len1 = 0;
	    FundamentalSituationalStatus temp1 = temp0.fundamental;

	    if (temp1.vsmEventFlag != null) {
		try {
		    len1 += sink.encodeLengthTag(sink.write(temp1.vsmEventFlag.byteArrayValue()), 0x86);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("vsmEventFlag", "VsmEventFlag");
		    throw ee;
		}
	    }
	    try {
		len1 += sink.encodeLengthTag(temp1.vehSize.encodeValue(coder, sink), 0xA5);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("vehSize", "VehicleSize");
		throw ee;
	    }
	    try {
		len1 += sink.encodeLengthTag(sink.write(temp1.brakes.byteArrayValue()), 0x84);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("brakes", "BrakeSystemStatus");
		throw ee;
	    }
	    try {
		len1 += sink.encodeLengthTag(sink.write(temp1.accelSet.byteArrayValue()), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("accelSet", "AccelerationSet4Way");
		throw ee;
	    }
	    try {
		len1 += sink.encodeLengthTag(sink.write(temp1.steeringAngle.byteArrayValue()), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("steeringAngle", "SteeringWheelAngle");
		throw ee;
	    }
	    try {
		len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.heading, sink), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("heading", "Heading");
		throw ee;
	    }
	    try {
		len1 += sink.encodeLengthTag(sink.write(temp1.speed.byteArrayValue()), 0x80);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("speed", "TransmissionAndSpeed");
		throw ee;
	    }
	    len0 += sink.encodeLengthTag(len1, 0xA3);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("fundamental", "FundamentalSituationalStatus");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(temp0.pos.encodeValue(coder, sink), 0xA2);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("pos", "Position3D");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(temp0.time.encodeValue(coder, sink), 0xA1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("time", "DDateTime");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(sink.write(temp0.tempID.byteArrayValue()), 0x80);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("tempID", "TemporaryID");
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements BER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public VehSitRecord decodeValue(BerCoder coder, DecoderInput source)
	    throws DecoderException
    {
	int total_len0 = source.mLength;
	int end_pos0 = (total_len0 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len0);
	int tag;

	do {
	    tag = source.decodeTagLength();
	    if (tag != 0x80 && tag != 0xA0)
		source.raiseTagMismatchException(tag);
	    try {
		this.tempID = new com.bah.ode.asn.oss.dsrc.TemporaryID(coder.decodeOctetString(source));
	    } catch (Exception e) {
		DecoderException ee = DecoderException.wrapException(e);
		ee.appendFieldContext("tempID", "TemporaryID");
		throw ee;
	    }
	    tag = source.decodeTagLength();
	    if (tag != 0xA1)
		source.raiseTagMismatchException(tag);
	    try {
		this.time = new com.bah.ode.asn.oss.dsrc.DDateTime();
		this.time.decodeValue(coder, source);
	    } catch (Exception e) {
		DecoderException ee = DecoderException.wrapException(e);
		ee.appendFieldContext("time", "DDateTime");
		throw ee;
	    }
	    tag = source.decodeTagLength();
	    if (tag != 0xA2)
		source.raiseTagMismatchException(tag);
	    try {
		this.pos = new com.bah.ode.asn.oss.dsrc.Position3D();
		this.pos.decodeValue(coder, source);
	    } catch (Exception e) {
		DecoderException ee = DecoderException.wrapException(e);
		ee.appendFieldContext("pos", "Position3D");
		throw ee;
	    }
	    tag = source.decodeTagLength();
	    if (tag != 0xA3)
		source.raiseTagMismatchException(tag);
	    try {
		this.fundamental = new FundamentalSituationalStatus();
		{
		    int total_len1 = source.mLength;
		    int end_pos1 = (total_len1 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len1);

		    do {
			tag = source.decodeTagLength();
			if (tag != 0x80 && tag != 0xA0)
			    source.raiseTagMismatchException(tag);
			try {
			    this.fundamental.speed = new com.bah.ode.asn.oss.dsrc.TransmissionAndSpeed(coder.decodeOctetString(source));
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("speed", "TransmissionAndSpeed");
			    throw ee;
			}
			tag = source.decodeTagLength();
			if (tag != 0x81)
			    source.raiseTagMismatchException(tag);
			try {
			    this.fundamental.heading = new com.bah.ode.asn.oss.dsrc.Heading(source.decodeLong());
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("heading", "Heading");
			    throw ee;
			}
			tag = source.decodeTagLength();
			if (tag != 0x82 && tag != 0xA2)
			    source.raiseTagMismatchException(tag);
			try {
			    this.fundamental.steeringAngle = new com.bah.ode.asn.oss.dsrc.SteeringWheelAngle(coder.decodeOctetString(source));
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("steeringAngle", "SteeringWheelAngle");
			    throw ee;
			}
			tag = source.decodeTagLength();
			if (tag != 0x83 && tag != 0xA3)
			    source.raiseTagMismatchException(tag);
			try {
			    this.fundamental.accelSet = new com.bah.ode.asn.oss.dsrc.AccelerationSet4Way(coder.decodeOctetString(source));
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("accelSet", "AccelerationSet4Way");
			    throw ee;
			}
			tag = source.decodeTagLength();
			if (tag != 0x84 && tag != 0xA4)
			    source.raiseTagMismatchException(tag);
			try {
			    this.fundamental.brakes = new com.bah.ode.asn.oss.dsrc.BrakeSystemStatus(coder.decodeOctetString(source));
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("brakes", "BrakeSystemStatus");
			    throw ee;
			}
			tag = source.decodeTagLength();
			if (tag != 0xA5)
			    source.raiseTagMismatchException(tag);
			try {
			    this.fundamental.vehSize = new com.bah.ode.asn.oss.dsrc.VehicleSize();
			    this.fundamental.vehSize.decodeValue(coder, source);
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("vehSize", "VehicleSize");
			    throw ee;
			}
			if (source.position() >= end_pos1)
			    break;
			tag = source.decodeTagLength();
			if (tag == 0)
			    break;
			if (tag == 0x86 || tag == 0xA6) {
			    try {
				this.fundamental.vsmEventFlag = new VsmEventFlag(coder.decodeOctetString(source));
			    } catch (Exception e) {
				DecoderException ee = DecoderException.wrapException(e);
				ee.appendFieldContext("vsmEventFlag", "VsmEventFlag");
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
		ee.appendFieldContext("fundamental", "FundamentalSituationalStatus");
		throw ee;
	    }
	    if (source.position() >= end_pos0)
		break;
	    tag = source.decodeTagLength();
	    if (tag == 0)
		break;
	    if (tag == 0xA4) {
		try {
		    this.vehstat = new VehicleSituationStatus();
		    {
			int total_len1 = source.mLength;
			int end_pos1 = (total_len1 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len1);

			do {
			    tag = source.decodeTagLength();
			    if (tag != 0x80)
				source.raiseTagMismatchException(tag);
			    try {
				this.vehstat.lights = new com.bah.ode.asn.oss.dsrc.ExteriorLights(source.decodeLong());
			    } catch (Exception e) {
				DecoderException ee = DecoderException.wrapException(e);
				ee.appendFieldContext("lights", "ExteriorLights");
				throw ee;
			    }
			    if (source.position() >= end_pos1)
				break;
			    tag = source.decodeTagLength();
			    if (tag == 0)
				break;
			    if (tag == 0x81) {
				try {
				    this.vehstat.throttlePos = new com.bah.ode.asn.oss.dsrc.ThrottlePosition(source.decodeLong());
				} catch (Exception e) {
				    DecoderException ee = DecoderException.wrapException(e);
				    ee.appendFieldContext("throttlePos", "ThrottlePosition");
				    throw ee;
				}
				if (source.position() >= end_pos1)
				    break;
				tag = source.decodeTagLength();
				if (tag == 0)
				    break;
			    }
			    if (tag == 0xA2) {
				try {
				    this.vehstat.tirePressure = new com.bah.ode.asn.oss.semi.VehicleSituationStatus.TirePressure();
				    {
					int total_len2 = source.mLength;
					int end_pos2 = (total_len2 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len2);

					tag = source.decodeTagLength();
					if (tag != 0x80)
					    source.raiseTagMismatchException(tag);
					try {
					    this.vehstat.tirePressure.leftFront = new com.bah.ode.asn.oss.dsrc.TirePressure(source.decodeLong());
					} catch (Exception e) {
					    DecoderException ee = DecoderException.wrapException(e);
					    ee.appendFieldContext("leftFront", "TirePressure");
					    throw ee;
					}
					tag = source.decodeTagLength();
					if (tag != 0x81)
					    source.raiseTagMismatchException(tag);
					try {
					    this.vehstat.tirePressure.leftRear = new com.bah.ode.asn.oss.dsrc.TirePressure(source.decodeLong());
					} catch (Exception e) {
					    DecoderException ee = DecoderException.wrapException(e);
					    ee.appendFieldContext("leftRear", "TirePressure");
					    throw ee;
					}
					tag = source.decodeTagLength();
					if (tag != 0x82)
					    source.raiseTagMismatchException(tag);
					try {
					    this.vehstat.tirePressure.rightFront = new com.bah.ode.asn.oss.dsrc.TirePressure(source.decodeLong());
					} catch (Exception e) {
					    DecoderException ee = DecoderException.wrapException(e);
					    ee.appendFieldContext("rightFront", "TirePressure");
					    throw ee;
					}
					tag = source.decodeTagLength();
					if (tag != 0x83)
					    source.raiseTagMismatchException(tag);
					try {
					    this.vehstat.tirePressure.rightRear = new com.bah.ode.asn.oss.dsrc.TirePressure(source.decodeLong());
					} catch (Exception e) {
					    DecoderException ee = DecoderException.wrapException(e);
					    ee.appendFieldContext("rightRear", "TirePressure");
					    throw ee;
					}
					if (source.position() != end_pos2) {
					    if (total_len2 >= 0)
						throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
					    tag = source.decodeTagLength();
					    if (tag != 0 || source.mLength != 0)
						throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);
					}
				    }
				} catch (Exception e) {
				    DecoderException ee = DecoderException.wrapException(e);
				    ee.appendFieldContext("tirePressure", "SEQUENCE");
				    throw ee;
				}
				if (source.position() >= end_pos1)
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
				    ee.appendExtensionContext("VehicleSituationStatus", -1);
				    throw ee;
				}
				if (source.position() >= end_pos1)
				    break;
				tag = source.decodeTagLength();
				if (tag == 0)
				    break;
			    }
			} while(false);

			if (source.position() > end_pos1)
			    throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
			if (total_len1 < 0 && source.mLength != 0)
			    throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);
		    }
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("vehstat", "VehicleSituationStatus");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xA5) {
		try {
		    this.weather = new Weather();
		    {
			int total_len1 = source.mLength;
			int end_pos1 = (total_len1 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len1);

			do {
			    if (source.position() >= end_pos1)
				break;
			    tag = source.decodeTagLength();
			    if (tag == 0)
				break;
			    if (tag == 0xA0) {
				try {
				    this.weather.wipers = new com.bah.ode.asn.oss.semi.Weather.Wipers();
				    {
					int total_len2 = source.mLength;
					int end_pos2 = (total_len2 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len2);

					do {
					    tag = source.decodeTagLength();
					    if (tag != 0x80)
						source.raiseTagMismatchException(tag);
					    try {
						int idx3 = com.bah.ode.asn.oss.dsrc.WiperStatusFront.indexOfValue(source.decodeLong());
						this.weather.wipers.statFrnt = (idx3 < 0) ? com.bah.ode.asn.oss.dsrc.WiperStatusFront.unknownEnumerator() : com.bah.ode.asn.oss.dsrc.WiperStatusFront.cNamedNumbers[idx3];
					    } catch (Exception e) {
						DecoderException ee = DecoderException.wrapException(e);
						ee.appendFieldContext("statFrnt", "WiperStatusFront");
						throw ee;
					    }
					    if (source.position() >= end_pos2)
						break;
					    tag = source.decodeTagLength();
					    if (tag == 0)
						break;
					    if (tag == 0x81) {
						try {
						    this.weather.wipers.rateFrnt = new com.bah.ode.asn.oss.dsrc.WiperRate(source.decodeLong());
						} catch (Exception e) {
						    DecoderException ee = DecoderException.wrapException(e);
						    ee.appendFieldContext("rateFrnt", "WiperRate");
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
						    int idx3 = com.bah.ode.asn.oss.dsrc.WiperStatusRear.indexOfValue(source.decodeLong());
						    this.weather.wipers.statRear = (idx3 < 0) ? com.bah.ode.asn.oss.dsrc.WiperStatusRear.unknownEnumerator() : com.bah.ode.asn.oss.dsrc.WiperStatusRear.cNamedNumbers[idx3];
						} catch (Exception e) {
						    DecoderException ee = DecoderException.wrapException(e);
						    ee.appendFieldContext("statRear", "WiperStatusRear");
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
						    this.weather.wipers.rateRear = new com.bah.ode.asn.oss.dsrc.WiperRate(source.decodeLong());
						} catch (Exception e) {
						    DecoderException ee = DecoderException.wrapException(e);
						    ee.appendFieldContext("rateRear", "WiperRate");
						    throw ee;
						}
						if (source.position() >= end_pos2)
						    break;
						tag = source.decodeTagLength();
						if (tag == 0)
						    break;
					    }
					    source.raiseUnknownFieldException(tag);
					} while(false);

					if (source.position() > end_pos2)
					    throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
					if (total_len2 < 0 && source.mLength != 0)
					    throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);
				    }
				} catch (Exception e) {
				    DecoderException ee = DecoderException.wrapException(e);
				    ee.appendFieldContext("wipers", "SEQUENCE");
				    throw ee;
				}
				if (source.position() >= end_pos1)
				    break;
				tag = source.decodeTagLength();
				if (tag == 0)
				    break;
			    }
			    if (tag == 0x81) {
				try {
				    this.weather.airTemp = new com.bah.ode.asn.oss.dsrc.AmbientAirTemperature(source.decodeLong());
				} catch (Exception e) {
				    DecoderException ee = DecoderException.wrapException(e);
				    ee.appendFieldContext("airTemp", "AmbientAirTemperature");
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
				    this.weather.airPres = new com.bah.ode.asn.oss.dsrc.AmbientAirPressure(source.decodeLong());
				} catch (Exception e) {
				    DecoderException ee = DecoderException.wrapException(e);
				    ee.appendFieldContext("airPres", "AmbientAirPressure");
				    throw ee;
				}
				if (source.position() >= end_pos1)
				    break;
				tag = source.decodeTagLength();
				if (tag == 0)
				    break;
			    }
			    if (tag == 0xA3) {
				try {
				    this.weather.weatherReport = new com.bah.ode.asn.oss.semi.Weather.WeatherReport();
				    {
					int total_len2 = source.mLength;
					int end_pos2 = (total_len2 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len2);

					do {
					    tag = source.decodeTagLength();
					    if (tag != 0x80)
						source.raiseTagMismatchException(tag);
					    try {
						int idx3 = com.bah.ode.asn.oss.ntcip.EssPrecipYesNo.indexOfValue(source.decodeInt());
						if (idx3 < 0)
						    throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
						this.weather.weatherReport.isRaining = com.bah.ode.asn.oss.ntcip.EssPrecipYesNo.cNamedNumbers[idx3];
					    } catch (Exception e) {
						DecoderException ee = DecoderException.wrapException(e);
						ee.appendFieldContext("isRaining", "EssPrecipYesNo");
						throw ee;
					    }
					    if (source.position() >= end_pos2)
						break;
					    tag = source.decodeTagLength();
					    if (tag == 0)
						break;
					    if (tag == 0x81) {
						try {
						    this.weather.weatherReport.rainRate = new com.bah.ode.asn.oss.ntcip.EssPrecipRate(source.decodeLong());
						} catch (Exception e) {
						    DecoderException ee = DecoderException.wrapException(e);
						    ee.appendFieldContext("rainRate", "EssPrecipRate");
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
						    int idx3 = com.bah.ode.asn.oss.ntcip.EssPrecipSituation.indexOfValue(source.decodeInt());
						    if (idx3 < 0)
							throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
						    this.weather.weatherReport.precipSituation = com.bah.ode.asn.oss.ntcip.EssPrecipSituation.cNamedNumbers[idx3];
						} catch (Exception e) {
						    DecoderException ee = DecoderException.wrapException(e);
						    ee.appendFieldContext("precipSituation", "EssPrecipSituation");
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
						    this.weather.weatherReport.solarRadiation = new com.bah.ode.asn.oss.ntcip.EssSolarRadiation(source.decodeLong());
						} catch (Exception e) {
						    DecoderException ee = DecoderException.wrapException(e);
						    ee.appendFieldContext("solarRadiation", "EssSolarRadiation");
						    throw ee;
						}
						if (source.position() >= end_pos2)
						    break;
						tag = source.decodeTagLength();
						if (tag == 0)
						    break;
					    }
					    if (tag == 0x84) {
						try {
						    this.weather.weatherReport.friction = new com.bah.ode.asn.oss.ntcip.EssMobileFriction(source.decodeLong());
						} catch (Exception e) {
						    DecoderException ee = DecoderException.wrapException(e);
						    ee.appendFieldContext("friction", "EssMobileFriction");
						    throw ee;
						}
						if (source.position() >= end_pos2)
						    break;
						tag = source.decodeTagLength();
						if (tag == 0)
						    break;
					    }
					    source.raiseUnknownFieldException(tag);
					} while(false);

					if (source.position() > end_pos2)
					    throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
					if (total_len2 < 0 && source.mLength != 0)
					    throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);
				    }
				} catch (Exception e) {
				    DecoderException ee = DecoderException.wrapException(e);
				    ee.appendFieldContext("weatherReport", "SEQUENCE");
				    throw ee;
				}
				if (source.position() >= end_pos1)
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
				    ee.appendExtensionContext("Weather", -1);
				    throw ee;
				}
				if (source.position() >= end_pos1)
				    break;
				tag = source.decodeTagLength();
				if (tag == 0)
				    break;
			    }
			} while(false);

			if (source.position() > end_pos1)
			    throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
			if (total_len1 < 0 && source.mLength != 0)
			    throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);
		    }
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("weather", "Weather");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xA6) {
		try {
		    this.env = new Environmental();
		    {
			int total_len1 = source.mLength;
			int end_pos1 = (total_len1 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len1);

			do {
			    tag = source.decodeTagLength();
			    if (tag != 0x80)
				source.raiseTagMismatchException(tag);
			    try {
				this.env.fuelCon = new FuelConsumption(source.decodeLong());
			    } catch (Exception e) {
				DecoderException ee = DecoderException.wrapException(e);
				ee.appendFieldContext("fuelCon", "FuelConsumption");
				throw ee;
			    }
			    tag = source.decodeTagLength();
			    if (tag != 0x81)
				source.raiseTagMismatchException(tag);
			    try {
				this.env.emiss = new Emissions(source.decodeLong());
			    } catch (Exception e) {
				DecoderException ee = DecoderException.wrapException(e);
				ee.appendFieldContext("emiss", "Emissions");
				throw ee;
			    }
			    tag = source.decodeTagLength();
			    if (tag != 0x82)
				source.raiseTagMismatchException(tag);
			    try {
				this.env.fuelEcon = new FuelEconomy(source.decodeLong());
			    } catch (Exception e) {
				DecoderException ee = DecoderException.wrapException(e);
				ee.appendFieldContext("fuelEcon", "FuelEconomy");
				throw ee;
			    }
			    if (source.position() >= end_pos1)
				break;
			    tag = source.decodeTagLength();
			    if (tag == 0)
				break;
			    for (;;) {
				try {
				    coder.skipContents(source);
				} catch (Exception e) {
				    DecoderException ee = DecoderException.wrapException(e);
				    ee.appendExtensionContext("Environmental", -1);
				    throw ee;
				}
				if (source.position() >= end_pos1)
				    break;
				tag = source.decodeTagLength();
				if (tag == 0)
				    break;
			    }
			} while(false);

			if (source.position() > end_pos1)
			    throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
			if (total_len1 < 0 && source.mLength != 0)
			    throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);
		    }
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("env", "Environmental");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xA7) {
		try {
		    this.elveh = new ElectricVeh();
		    {
			int total_len1 = source.mLength;
			int end_pos1 = (total_len1 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len1);

			do {
			    tag = source.decodeTagLength();
			    if (tag != 0x80)
				source.raiseTagMismatchException(tag);
			    try {
				this.elveh.soc = new StateOfCharge(source.decodeLong());
			    } catch (Exception e) {
				DecoderException ee = DecoderException.wrapException(e);
				ee.appendFieldContext("soc", "StateOfCharge");
				throw ee;
			    }
			    tag = source.decodeTagLength();
			    if (tag != 0x81)
				source.raiseTagMismatchException(tag);
			    try {
				this.elveh.cap = new Capacity(source.decodeLong());
			    } catch (Exception e) {
				DecoderException ee = DecoderException.wrapException(e);
				ee.appendFieldContext("cap", "Capacity");
				throw ee;
			    }
			    tag = source.decodeTagLength();
			    if (tag != 0x82)
				source.raiseTagMismatchException(tag);
			    try {
				this.elveh.range = new Range(source.decodeLong());
			    } catch (Exception e) {
				DecoderException ee = DecoderException.wrapException(e);
				ee.appendFieldContext("range", "Range");
				throw ee;
			    }
			    if (source.position() >= end_pos1)
				break;
			    tag = source.decodeTagLength();
			    if (tag == 0)
				break;
			    for (;;) {
				try {
				    coder.skipContents(source);
				} catch (Exception e) {
				    DecoderException ee = DecoderException.wrapException(e);
				    ee.appendExtensionContext("ElectricVeh", -1);
				    throw ee;
				}
				if (source.position() >= end_pos1)
				    break;
				tag = source.decodeTagLength();
				if (tag == 0)
				    break;
			    }
			} while(false);

			if (source.position() > end_pos1)
			    throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
			if (total_len1 < 0 && source.mLength != 0)
			    throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);
		    }
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("elveh", "ElectricVeh");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    source.raiseUnknownFieldException(tag);
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
	VehSitRecord temp0 = this;

	if (temp0.elveh != null) {
	    try {
		int len1 = 0;
		ElectricVeh temp1 = temp0.elveh;

		try {
		    len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.range, sink), 0x82);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("range", "Range");
		    throw ee;
		}
		try {
		    len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.cap, sink), 0x81);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("cap", "Capacity");
		    throw ee;
		}
		try {
		    len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.soc, sink), 0x80);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("soc", "StateOfCharge");
		    throw ee;
		}
		len0 += sink.encodeLengthTag(len1, 0xA7);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("elveh", "ElectricVeh");
		throw ee;
	    }
	}
	if (temp0.env != null) {
	    try {
		int len1 = 0;
		Environmental temp1 = temp0.env;

		try {
		    len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.fuelEcon, sink), 0x82);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("fuelEcon", "FuelEconomy");
		    throw ee;
		}
		try {
		    len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.emiss, sink), 0x81);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("emiss", "Emissions");
		    throw ee;
		}
		try {
		    len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.fuelCon, sink), 0x80);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("fuelCon", "FuelConsumption");
		    throw ee;
		}
		len0 += sink.encodeLengthTag(len1, 0xA6);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("env", "Environmental");
		throw ee;
	    }
	}
	if (temp0.weather != null) {
	    try {
		int len1 = 0;
		Weather temp1 = temp0.weather;

		if (temp1.weatherReport != null) {
		    try {
			int len2 = 0;
			com.bah.ode.asn.oss.semi.Weather.WeatherReport temp2 = temp1.weatherReport;

			if (temp2.friction != null) {
			    try {
				len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.friction, sink), 0x84);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("friction", "EssMobileFriction");
				throw ee;
			    }
			}
			if (temp2.solarRadiation != null) {
			    try {
				len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.solarRadiation, sink), 0x83);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("solarRadiation", "EssSolarRadiation");
				throw ee;
			    }
			}
			if (temp2.precipSituation != null) {
			    try {
				len2 += sink.encodeLengthTag(coder.encodeEnumerated(temp2.precipSituation, sink), 0x82);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("precipSituation", "EssPrecipSituation");
				throw ee;
			    }
			}
			if (temp2.rainRate != null) {
			    try {
				len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.rainRate, sink), 0x81);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("rainRate", "EssPrecipRate");
				throw ee;
			    }
			}
			try {
			    len2 += sink.encodeLengthTag(coder.encodeEnumerated(temp2.isRaining, sink), 0x80);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendFieldContext("isRaining", "EssPrecipYesNo");
			    throw ee;
			}
			len1 += sink.encodeLengthTag(len2, 0xA3);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("weatherReport", "SEQUENCE");
			throw ee;
		    }
		}
		if (temp1.airPres != null) {
		    try {
			len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.airPres, sink), 0x82);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("airPres", "AmbientAirPressure");
			throw ee;
		    }
		}
		if (temp1.airTemp != null) {
		    try {
			len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.airTemp, sink), 0x81);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("airTemp", "AmbientAirTemperature");
			throw ee;
		    }
		}
		if (temp1.wipers != null) {
		    try {
			int len2 = 0;
			com.bah.ode.asn.oss.semi.Weather.Wipers temp2 = temp1.wipers;

			if (temp2.rateRear != null) {
			    try {
				len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.rateRear, sink), 0x83);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("rateRear", "WiperRate");
				throw ee;
			    }
			}
			if (temp2.statRear != null) {
			    try {
				len2 += sink.encodeLengthTag(coder.encodeEnumerated(temp2.statRear, sink), 0x82);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("statRear", "WiperStatusRear");
				throw ee;
			    }
			}
			if (temp2.rateFrnt != null) {
			    try {
				len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.rateFrnt, sink), 0x81);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("rateFrnt", "WiperRate");
				throw ee;
			    }
			}
			try {
			    len2 += sink.encodeLengthTag(coder.encodeEnumerated(temp2.statFrnt, sink), 0x80);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendFieldContext("statFrnt", "WiperStatusFront");
			    throw ee;
			}
			len1 += sink.encodeLengthTag(len2, 0xA0);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("wipers", "SEQUENCE");
			throw ee;
		    }
		}
		len0 += sink.encodeLengthTag(len1, 0xA5);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("weather", "Weather");
		throw ee;
	    }
	}
	if (temp0.vehstat != null) {
	    try {
		int len1 = 0;
		VehicleSituationStatus temp1 = temp0.vehstat;

		if (temp1.tirePressure != null) {
		    try {
			int len2 = 0;
			com.bah.ode.asn.oss.semi.VehicleSituationStatus.TirePressure temp2 = temp1.tirePressure;

			try {
			    len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.rightRear, sink), 0x83);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendFieldContext("rightRear", "TirePressure");
			    throw ee;
			}
			try {
			    len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.rightFront, sink), 0x82);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendFieldContext("rightFront", "TirePressure");
			    throw ee;
			}
			try {
			    len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.leftRear, sink), 0x81);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendFieldContext("leftRear", "TirePressure");
			    throw ee;
			}
			try {
			    len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.leftFront, sink), 0x80);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendFieldContext("leftFront", "TirePressure");
			    throw ee;
			}
			len1 += sink.encodeLengthTag(len2, 0xA2);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("tirePressure", "SEQUENCE");
			throw ee;
		    }
		}
		if (temp1.throttlePos != null) {
		    try {
			len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.throttlePos, sink), 0x81);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("throttlePos", "ThrottlePosition");
			throw ee;
		    }
		}
		try {
		    len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.lights, sink), 0x80);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("lights", "ExteriorLights");
		    throw ee;
		}
		len0 += sink.encodeLengthTag(len1, 0xA4);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("vehstat", "VehicleSituationStatus");
		throw ee;
	    }
	}
	try {
	    int len1 = 0;
	    FundamentalSituationalStatus temp1 = temp0.fundamental;

	    if (temp1.vsmEventFlag != null) {
		try {
		    len1 += sink.encodeLengthTag(sink.write(temp1.vsmEventFlag.byteArrayValue()), 0x86);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("vsmEventFlag", "VsmEventFlag");
		    throw ee;
		}
	    }
	    try {
		len1 += sink.encodeLengthTag(temp1.vehSize.encodeValue(coder, sink), 0xA5);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("vehSize", "VehicleSize");
		throw ee;
	    }
	    try {
		len1 += sink.encodeLengthTag(sink.write(temp1.brakes.byteArrayValue()), 0x84);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("brakes", "BrakeSystemStatus");
		throw ee;
	    }
	    try {
		len1 += sink.encodeLengthTag(sink.write(temp1.accelSet.byteArrayValue()), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("accelSet", "AccelerationSet4Way");
		throw ee;
	    }
	    try {
		len1 += sink.encodeLengthTag(sink.write(temp1.steeringAngle.byteArrayValue()), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("steeringAngle", "SteeringWheelAngle");
		throw ee;
	    }
	    try {
		len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.heading, sink), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("heading", "Heading");
		throw ee;
	    }
	    try {
		len1 += sink.encodeLengthTag(sink.write(temp1.speed.byteArrayValue()), 0x80);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("speed", "TransmissionAndSpeed");
		throw ee;
	    }
	    len0 += sink.encodeLengthTag(len1, 0xA3);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("fundamental", "FundamentalSituationalStatus");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(temp0.pos.encodeValue(coder, sink), 0xA2);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("pos", "Position3D");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(temp0.time.encodeValue(coder, sink), 0xA1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("time", "DDateTime");
	    throw ee;
	}
	try {
	    len0 += sink.encodeLengthTag(sink.write(temp0.tempID.byteArrayValue()), 0x80);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("tempID", "TemporaryID");
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, VehSitRecord data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	boolean has_vehstat0 = data.vehstat != null;
	boolean has_weather0 = data.weather != null;
	boolean has_env0 = data.env != null;
	boolean has_elveh0 = data.elveh != null;
	sink.writeBit(has_vehstat0); ++nbits;
	sink.writeBit(has_weather0); ++nbits;
	sink.writeBit(has_env0); ++nbits;
	sink.writeBit(has_elveh0); ++nbits;
	// Encode field 'tempID'
	try {
	    com.bah.ode.asn.oss.dsrc.TemporaryID item1 = data.tempID;
	    int len1 = item1.getSize();

	    if (len1 != 4)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 4, 4, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("tempID", "TemporaryID");
	    throw ee;
	}
	// Encode field 'time'
	try {
	    com.bah.ode.asn.oss.dsrc.DDateTime item1 = data.time;

	    nbits += com.bah.ode.asn.oss.dsrc.DDateTime.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("time", "DDateTime");
	    throw ee;
	}
	// Encode field 'pos'
	try {
	    com.bah.ode.asn.oss.dsrc.Position3D item1 = data.pos;

	    nbits += com.bah.ode.asn.oss.dsrc.Position3D.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("pos", "Position3D");
	    throw ee;
	}
	// Encode field 'fundamental'
	try {
	    FundamentalSituationalStatus item1 = data.fundamental;

	    nbits += FundamentalSituationalStatus.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("fundamental", "FundamentalSituationalStatus");
	    throw ee;
	}
	if (has_vehstat0) {
	    // Encode field 'vehstat'
	    try {
		VehicleSituationStatus item1 = data.vehstat;

		nbits += VehicleSituationStatus.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("vehstat", "VehicleSituationStatus");
		throw ee;
	    }
	}
	if (has_weather0) {
	    // Encode field 'weather'
	    try {
		Weather item1 = data.weather;

		nbits += Weather.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("weather", "Weather");
		throw ee;
	    }
	}
	if (has_env0) {
	    // Encode field 'env'
	    try {
		Environmental item1 = data.env;

		nbits += Environmental.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("env", "Environmental");
		throw ee;
	    }
	}
	if (has_elveh0) {
	    // Encode field 'elveh'
	    try {
		ElectricVeh item1 = data.elveh;

		nbits += ElectricVeh.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("elveh", "ElectricVeh");
		throw ee;
	    }
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static VehSitRecord decodeValue(PerCoder coder, InputBitStream source, VehSitRecord data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean has_vehstat0 = source.readBit();
	boolean has_weather0 = source.readBit();
	boolean has_env0 = source.readBit();
	boolean has_elveh0 = source.readBit();
	// Decode field 'tempID'
	try {
	    data.tempID = new com.bah.ode.asn.oss.dsrc.TemporaryID(com.oss.coders.per.PerOctets.decode(coder, source, 4, 4));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("tempID", "TemporaryID");
	    throw de;
	}
	// Decode field 'time'
	try {
	    if (data.time == null)
		data.time = new com.bah.ode.asn.oss.dsrc.DDateTime();
	    com.bah.ode.asn.oss.dsrc.DDateTime.decodeValue(coder, source, data.time);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("time", "DDateTime");
	    throw de;
	}
	// Decode field 'pos'
	try {
	    if (data.pos == null)
		data.pos = new com.bah.ode.asn.oss.dsrc.Position3D();
	    com.bah.ode.asn.oss.dsrc.Position3D.decodeValue(coder, source, data.pos);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("pos", "Position3D");
	    throw de;
	}
	// Decode field 'fundamental'
	try {
	    if (data.fundamental == null)
		data.fundamental = new FundamentalSituationalStatus();
	    FundamentalSituationalStatus.decodeValue(coder, source, data.fundamental);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("fundamental", "FundamentalSituationalStatus");
	    throw de;
	}
	if (has_vehstat0) {
	    // Decode field 'vehstat'
	    try {
		if (data.vehstat == null)
		    data.vehstat = new VehicleSituationStatus();
		VehicleSituationStatus.decodeValue(coder, source, data.vehstat);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("vehstat", "VehicleSituationStatus");
		throw de;
	    }
	} else {
	    data.vehstat = null;
	}
	if (has_weather0) {
	    // Decode field 'weather'
	    try {
		if (data.weather == null)
		    data.weather = new Weather();
		Weather.decodeValue(coder, source, data.weather);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("weather", "Weather");
		throw de;
	    }
	} else {
	    data.weather = null;
	}
	if (has_env0) {
	    // Decode field 'env'
	    try {
		if (data.env == null)
		    data.env = new Environmental();
		Environmental.decodeValue(coder, source, data.env);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("env", "Environmental");
		throw de;
	    }
	} else {
	    data.env = null;
	}
	if (has_elveh0) {
	    // Decode field 'elveh'
	    try {
		if (data.elveh == null)
		    data.elveh = new ElectricVeh();
		ElectricVeh.decodeValue(coder, source, data.elveh);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("elveh", "ElectricVeh");
		throw de;
	    }
	} else {
	    data.elveh = null;
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
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("tempID ");
	    printer.print(this.tempID, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("time ");
	    this.time.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("pos ");
	    this.pos.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    boolean comma1;

	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("fundamental ");
	    comma1 = false;
	    writer.print('{');
	    printer.indent();
	    try {
		if (comma1)
		    writer.print(',');
		comma1 = true;
		printer.newLine(writer);
		writer.print("speed ");
		printer.print(this.fundamental.speed, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    try {
		if (comma1)
		    writer.print(',');
		comma1 = true;
		printer.newLine(writer);
		writer.print("heading ");
		writer.print(this.fundamental.heading.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    try {
		if (comma1)
		    writer.print(',');
		comma1 = true;
		printer.newLine(writer);
		writer.print("steeringAngle ");
		printer.print(this.fundamental.steeringAngle, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    try {
		if (comma1)
		    writer.print(',');
		comma1 = true;
		printer.newLine(writer);
		writer.print("accelSet ");
		printer.print(this.fundamental.accelSet, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    try {
		if (comma1)
		    writer.print(',');
		comma1 = true;
		printer.newLine(writer);
		writer.print("brakes ");
		printer.print(this.fundamental.brakes, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    try {
		if (comma1)
		    writer.print(',');
		comma1 = true;
		printer.newLine(writer);
		writer.print("vehSize ");
		this.fundamental.vehSize.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    if (this.fundamental.vsmEventFlag != null) {
		try {
		    if (comma1)
			writer.print(',');
		    comma1 = true;
		    printer.newLine(writer);
		    writer.print("vsmEventFlag ");
		    printer.print(this.fundamental.vsmEventFlag, writer);
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
	if (this.vehstat != null) {
	    try {
		boolean comma1;

		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("vehstat ");
		comma1 = false;
		writer.print('{');
		printer.indent();
		try {
		    if (comma1)
			writer.print(',');
		    comma1 = true;
		    printer.newLine(writer);
		    writer.print("lights ");
		    writer.print(this.vehstat.lights.longValue());
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
		if (this.vehstat.throttlePos != null) {
		    try {
			if (comma1)
			    writer.print(',');
			comma1 = true;
			printer.newLine(writer);
			writer.print("throttlePos ");
			writer.print(this.vehstat.throttlePos.longValue());
		    } catch (Exception e) {
			printer.reportError(e, null, writer);
		    }
		}
		if (this.vehstat.tirePressure != null) {
		    try {
			boolean comma2;

			if (comma1)
			    writer.print(',');
			comma1 = true;
			printer.newLine(writer);
			writer.print("tirePressure ");
			comma2 = false;
			writer.print('{');
			printer.indent();
			try {
			    if (comma2)
				writer.print(',');
			    comma2 = true;
			    printer.newLine(writer);
			    writer.print("leftFront ");
			    writer.print(this.vehstat.tirePressure.leftFront.longValue());
			} catch (Exception e) {
			    printer.reportError(e, null, writer);
			}
			try {
			    if (comma2)
				writer.print(',');
			    comma2 = true;
			    printer.newLine(writer);
			    writer.print("leftRear ");
			    writer.print(this.vehstat.tirePressure.leftRear.longValue());
			} catch (Exception e) {
			    printer.reportError(e, null, writer);
			}
			try {
			    if (comma2)
				writer.print(',');
			    comma2 = true;
			    printer.newLine(writer);
			    writer.print("rightFront ");
			    writer.print(this.vehstat.tirePressure.rightFront.longValue());
			} catch (Exception e) {
			    printer.reportError(e, null, writer);
			}
			try {
			    if (comma2)
				writer.print(',');
			    comma2 = true;
			    printer.newLine(writer);
			    writer.print("rightRear ");
			    writer.print(this.vehstat.tirePressure.rightRear.longValue());
			} catch (Exception e) {
			    printer.reportError(e, null, writer);
			}
			printer.undent();
			if (comma2)
			    printer.newLine(writer);
			writer.print('}');
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
	if (this.weather != null) {
	    try {
		boolean comma1;

		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("weather ");
		comma1 = false;
		writer.print('{');
		printer.indent();
		if (this.weather.wipers != null) {
		    try {
			boolean comma2;

			if (comma1)
			    writer.print(',');
			comma1 = true;
			printer.newLine(writer);
			writer.print("wipers ");
			comma2 = false;
			writer.print('{');
			printer.indent();
			try {
			    if (comma2)
				writer.print(',');
			    comma2 = true;
			    printer.newLine(writer);
			    writer.print("statFrnt ");
			    printer.print(this.weather.wipers.statFrnt, writer, this.weather.wipers.statFrnt.cConstantNameList);
			} catch (Exception e) {
			    printer.reportError(e, null, writer);
			}
			if (this.weather.wipers.rateFrnt != null) {
			    try {
				if (comma2)
				    writer.print(',');
				comma2 = true;
				printer.newLine(writer);
				writer.print("rateFrnt ");
				writer.print(this.weather.wipers.rateFrnt.longValue());
			    } catch (Exception e) {
				printer.reportError(e, null, writer);
			    }
			}
			if (this.weather.wipers.statRear != null) {
			    try {
				if (comma2)
				    writer.print(',');
				comma2 = true;
				printer.newLine(writer);
				writer.print("statRear ");
				printer.print(this.weather.wipers.statRear, writer, this.weather.wipers.statRear.cConstantNameList);
			    } catch (Exception e) {
				printer.reportError(e, null, writer);
			    }
			}
			if (this.weather.wipers.rateRear != null) {
			    try {
				if (comma2)
				    writer.print(',');
				comma2 = true;
				printer.newLine(writer);
				writer.print("rateRear ");
				writer.print(this.weather.wipers.rateRear.longValue());
			    } catch (Exception e) {
				printer.reportError(e, null, writer);
			    }
			}
			printer.undent();
			if (comma2)
			    printer.newLine(writer);
			writer.print('}');
		    } catch (Exception e) {
			printer.reportError(e, null, writer);
		    }
		}
		if (this.weather.airTemp != null) {
		    try {
			if (comma1)
			    writer.print(',');
			comma1 = true;
			printer.newLine(writer);
			writer.print("airTemp ");
			writer.print(this.weather.airTemp.longValue());
		    } catch (Exception e) {
			printer.reportError(e, null, writer);
		    }
		}
		if (this.weather.airPres != null) {
		    try {
			if (comma1)
			    writer.print(',');
			comma1 = true;
			printer.newLine(writer);
			writer.print("airPres ");
			writer.print(this.weather.airPres.longValue());
		    } catch (Exception e) {
			printer.reportError(e, null, writer);
		    }
		}
		if (this.weather.weatherReport != null) {
		    try {
			boolean comma2;

			if (comma1)
			    writer.print(',');
			comma1 = true;
			printer.newLine(writer);
			writer.print("weatherReport ");
			comma2 = false;
			writer.print('{');
			printer.indent();
			try {
			    if (comma2)
				writer.print(',');
			    comma2 = true;
			    printer.newLine(writer);
			    writer.print("isRaining ");
			    printer.print(this.weather.weatherReport.isRaining, writer, this.weather.weatherReport.isRaining.cConstantNameList);
			} catch (Exception e) {
			    printer.reportError(e, null, writer);
			}
			if (this.weather.weatherReport.rainRate != null) {
			    try {
				if (comma2)
				    writer.print(',');
				comma2 = true;
				printer.newLine(writer);
				writer.print("rainRate ");
				writer.print(this.weather.weatherReport.rainRate.longValue());
			    } catch (Exception e) {
				printer.reportError(e, null, writer);
			    }
			}
			if (this.weather.weatherReport.precipSituation != null) {
			    try {
				if (comma2)
				    writer.print(',');
				comma2 = true;
				printer.newLine(writer);
				writer.print("precipSituation ");
				printer.print(this.weather.weatherReport.precipSituation, writer, this.weather.weatherReport.precipSituation.cConstantNameList);
			    } catch (Exception e) {
				printer.reportError(e, null, writer);
			    }
			}
			if (this.weather.weatherReport.solarRadiation != null) {
			    try {
				if (comma2)
				    writer.print(',');
				comma2 = true;
				printer.newLine(writer);
				writer.print("solarRadiation ");
				writer.print(this.weather.weatherReport.solarRadiation.longValue());
			    } catch (Exception e) {
				printer.reportError(e, null, writer);
			    }
			}
			if (this.weather.weatherReport.friction != null) {
			    try {
				if (comma2)
				    writer.print(',');
				comma2 = true;
				printer.newLine(writer);
				writer.print("friction ");
				writer.print(this.weather.weatherReport.friction.longValue());
			    } catch (Exception e) {
				printer.reportError(e, null, writer);
			    }
			}
			printer.undent();
			if (comma2)
			    printer.newLine(writer);
			writer.print('}');
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
	if (this.env != null) {
	    try {
		boolean comma1;

		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("env ");
		comma1 = false;
		writer.print('{');
		printer.indent();
		try {
		    if (comma1)
			writer.print(',');
		    comma1 = true;
		    printer.newLine(writer);
		    writer.print("fuelCon ");
		    writer.print(this.env.fuelCon.longValue());
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
		try {
		    if (comma1)
			writer.print(',');
		    comma1 = true;
		    printer.newLine(writer);
		    writer.print("emiss ");
		    writer.print(this.env.emiss.longValue());
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
		try {
		    if (comma1)
			writer.print(',');
		    comma1 = true;
		    printer.newLine(writer);
		    writer.print("fuelEcon ");
		    writer.print(this.env.fuelEcon.longValue());
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
	if (this.elveh != null) {
	    try {
		boolean comma1;

		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("elveh ");
		comma1 = false;
		writer.print('{');
		printer.indent();
		try {
		    if (comma1)
			writer.print(',');
		    comma1 = true;
		    printer.newLine(writer);
		    writer.print("soc ");
		    writer.print(this.elveh.soc.longValue());
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
		try {
		    if (comma1)
			writer.print(',');
		    comma1 = true;
		    printer.newLine(writer);
		    writer.print("cap ");
		    writer.print(this.elveh.cap.longValue());
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
		try {
		    if (comma1)
			writer.print(',');
		    comma1 = true;
		    printer.newLine(writer);
		    writer.print("range ");
		    writer.print(this.elveh.range.longValue());
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
	return equalTo((VehSitRecord)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((VehSitRecord)that);
    }
    
    public boolean equalTo(VehSitRecord that) {
	if (!this.tempID.equalTo(that.tempID))
	    return false;
	if (!this.time.equalTo(that.time))
	    return false;
	if (!this.pos.equalTo(that.pos))
	    return false;
	if (!this.fundamental.equalTo(that.fundamental))
	    return false;
	if (this.vehstat != null && that.vehstat != null) {
	    if (!this.vehstat.equalTo(that.vehstat))
		return false;
	}
	if (this.weather != null && that.weather != null) {
	    if (!this.weather.equalTo(that.weather))
		return false;
	}
	if (this.env != null && that.env != null) {
	    if (!this.env.equalTo(that.env))
		return false;
	}
	if (this.elveh != null && that.elveh != null) {
	    if (!this.elveh.equalTo(that.elveh))
		return false;
	}
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public VehSitRecord clone() {
	VehSitRecord copy = (VehSitRecord)super.clone();
	copy.tempID = tempID.clone();
	copy.time = time.clone();
	copy.pos = pos.clone();
	copy.fundamental = fundamental.clone();
	if (vehstat != null) {
	    copy.vehstat = vehstat.clone();
	}
	if (weather != null) {
	    copy.weather = weather.clone();
	}
	if (env != null) {
	    copy.env = env.clone();
	}
	if (elveh != null) {
	    copy.elveh = elveh.clone();
	}
	return copy;
    }

} // End class definition for VehSitRecord
