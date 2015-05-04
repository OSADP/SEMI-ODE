/*************************************************************/
/* Copyright (C) 2015 OSS Nokalva, Inc.  All rights reserved.*/
/*************************************************************/

/* THIS FILE IS PROPRIETARY MATERIAL OF OSS NOKALVA, INC.
 * AND MAY BE USED ONLY BY DIRECT LICENSEES OF OSS NOKALVA, INC.
 * THIS FILE MAY NOT BE DISTRIBUTED.
 * THIS COPYRIGHT STATEMENT MAY NOT BE REMOVED. */

/* Generated for: Booz Allen Hamilton (Trial), License 70234Z. */
/* Abstract syntax: semi_asn */
/* ASN.1 Java project: com.bah.ode.asn.oss.Oss */
/* Created: Tue Apr 28 10:28:02 2015 */
/* ASN.1 Compiler for Java version: 6.1 */
/* ASN.1 compiler options and file names specified:
 * -toed -output com.bah.ode.asn.oss -per -uper -ber -der -root -messageFormat
 * msvc C:/Users/572682/Projects/ODE/Trials/ASN.1/DSRC_R36_Source.asn
 * C:/Users/572682/Projects/ODE/Trials/ASN.1/SEMI_ASN.1_Structures_2.2.asn
 */


package com.bah.ode.asn.oss.dsrc;

import com.oss.asn1.*;
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

public abstract class DSRC extends ASN1Module {

    
    
    // Value references
    public static final BarrierAttributes noData = 
	new BarrierAttributes(0);
    public static final BarrierAttributes median = 
	new BarrierAttributes(1);
    public static final BarrierAttributes whiteLine = 
	new BarrierAttributes(2);
    public static final BarrierAttributes strippedLines = 
	new BarrierAttributes(4);
    public static final BarrierAttributes doubleStrippedLines = 
	new BarrierAttributes(8);
    public static final BarrierAttributes trafficCones = 
	new BarrierAttributes(16);
    public static final BarrierAttributes constructionBarrier = 
	new BarrierAttributes(32);
    public static final BarrierAttributes trafficChannels = 
	new BarrierAttributes(64);
    public static final BarrierAttributes noCurbs = 
	new BarrierAttributes(128);
    public static final BarrierAttributes lowCurbs = 
	new BarrierAttributes(256);
    public static final BarrierAttributes highCurbs = 
	new BarrierAttributes(512);
    public static final BarrierAttributes hovDoNotCross = 
	new BarrierAttributes(1024);
    public static final BarrierAttributes hovEntryAllowed = 
	new BarrierAttributes(2048);
    public static final BarrierAttributes hovExitAllowed = 
	new BarrierAttributes(4096);
    public static final EventFlags eventHazardLights = 
	new EventFlags(1);
    public static final EventFlags eventStopLineViolation = 
	new EventFlags(2);
    public static final EventFlags eventABSactivated = 
	new EventFlags(4);
    public static final EventFlags eventTractionControlLoss = 
	new EventFlags(8);
    public static final EventFlags eventStabilityControlactivated = 
	new EventFlags(16);
    public static final EventFlags eventHazardousMaterials = 
	new EventFlags(32);
    public static final EventFlags eventEmergencyResponse = 
	new EventFlags(64);
    public static final EventFlags eventHardBraking = 
	new EventFlags(128);
    public static final EventFlags eventLightsChanged = 
	new EventFlags(256);
    public static final EventFlags eventWipersChanged = 
	new EventFlags(512);
    public static final EventFlags eventFlatTire = 
	new EventFlags(1024);
    public static final EventFlags eventDisabledVehicle = 
	new EventFlags(2048);
    public static final EventFlags eventAirBagDeployment = 
	new EventFlags(4096);
    public static final ExteriorLights allLightsOff = 
	new ExteriorLights(0);
    public static final ExteriorLights lowBeamHeadlightsOn = 
	new ExteriorLights(1);
    public static final ExteriorLights highBeamHeadlightsOn = 
	new ExteriorLights(2);
    public static final ExteriorLights leftTurnSignalOn = 
	new ExteriorLights(4);
    public static final ExteriorLights rightTurnSignalOn = 
	new ExteriorLights(8);
    public static final ExteriorLights hazardSignalOn = 
	new ExteriorLights(12);
    public static final ExteriorLights automaticLightControlOn = 
	new ExteriorLights(16);
    public static final ExteriorLights daytimeRunningLightsOn = 
	new ExteriorLights(32);
    public static final ExteriorLights fogLightOn = 
	new ExteriorLights(64);
    public static final ExteriorLights parkingLightsOn = 
	new ExteriorLights(128);
    public static final HeadingSlice noHeading = 
	new HeadingSlice (
	    new byte[]
	    {
		(byte)0x00, (byte)0x00
	    }
	);
    public static final HeadingSlice allHeadings = 
	new HeadingSlice (
	    new byte[]
	    {
		(byte)0xFF, (byte)0xFF
	    }
	);
    public static final HeadingSlice from000_0to022_5degrees = 
	new HeadingSlice (
	    new byte[]
	    {
		(byte)0x00, (byte)0x01
	    }
	);
    public static final HeadingSlice from022_5to045_0degrees = 
	new HeadingSlice (
	    new byte[]
	    {
		(byte)0x00, (byte)0x02
	    }
	);
    public static final HeadingSlice from045_0to067_5degrees = 
	new HeadingSlice (
	    new byte[]
	    {
		(byte)0x00, (byte)0x04
	    }
	);
    public static final HeadingSlice from067_5to090_0degrees = 
	new HeadingSlice (
	    new byte[]
	    {
		(byte)0x00, (byte)0x08
	    }
	);
    public static final HeadingSlice from090_0to112_5degrees = 
	new HeadingSlice (
	    new byte[]
	    {
		(byte)0x00, (byte)0x10
	    }
	);
    public static final HeadingSlice from112_5to135_0degrees = 
	new HeadingSlice (
	    new byte[]
	    {
		(byte)0x00, (byte)0x20
	    }
	);
    public static final HeadingSlice from135_0to157_5degrees = 
	new HeadingSlice (
	    new byte[]
	    {
		(byte)0x00, (byte)0x40
	    }
	);
    public static final HeadingSlice from157_5to180_0degrees = 
	new HeadingSlice (
	    new byte[]
	    {
		(byte)0x00, (byte)0x80
	    }
	);
    public static final HeadingSlice from180_0to202_5degrees = 
	new HeadingSlice (
	    new byte[]
	    {
		(byte)0x01, (byte)0x00
	    }
	);
    public static final HeadingSlice from202_5to225_0degrees = 
	new HeadingSlice (
	    new byte[]
	    {
		(byte)0x02, (byte)0x00
	    }
	);
    public static final HeadingSlice from225_0to247_5degrees = 
	new HeadingSlice (
	    new byte[]
	    {
		(byte)0x04, (byte)0x00
	    }
	);
    public static final HeadingSlice from247_5to270_0degrees = 
	new HeadingSlice (
	    new byte[]
	    {
		(byte)0x08, (byte)0x00
	    }
	);
    public static final HeadingSlice from270_0to292_5degrees = 
	new HeadingSlice (
	    new byte[]
	    {
		(byte)0x10, (byte)0x00
	    }
	);
    public static final HeadingSlice from292_5to315_0degrees = 
	new HeadingSlice (
	    new byte[]
	    {
		(byte)0x20, (byte)0x00
	    }
	);
    public static final HeadingSlice from315_0to337_5degrees = 
	new HeadingSlice (
	    new byte[]
	    {
		(byte)0x40, (byte)0x00
	    }
	);
    public static final HeadingSlice from337_5to360_0degrees = 
	new HeadingSlice (
	    new byte[]
	    {
		(byte)0x80, (byte)0x00
	    }
	);
    public static final VehicleLaneAttributes noLaneData = 
	new VehicleLaneAttributes(0);
    public static final VehicleLaneAttributes egressPath = 
	new VehicleLaneAttributes(1);
    public static final VehicleLaneAttributes maneuverStraightAllowed = 
	new VehicleLaneAttributes(2);
    public static final VehicleLaneAttributes maneuverLeftAllowed = 
	new VehicleLaneAttributes(4);
    public static final VehicleLaneAttributes maneuverRightAllowed = 
	new VehicleLaneAttributes(8);
    public static final VehicleLaneAttributes yield = 
	new VehicleLaneAttributes(16);
    public static final VehicleLaneAttributes maneuverNoUTurn = 
	new VehicleLaneAttributes(32);
    public static final VehicleLaneAttributes maneuverNoTurnOnRed = 
	new VehicleLaneAttributes(64);
    public static final VehicleLaneAttributes maneuverNoStop = 
	new VehicleLaneAttributes(128);
    public static final VehicleLaneAttributes noStop = 
	new VehicleLaneAttributes(256);
    public static final VehicleLaneAttributes noTurnOnRed = 
	new VehicleLaneAttributes(512);
    public static final VehicleLaneAttributes hovLane = 
	new VehicleLaneAttributes(1024);
    public static final VehicleLaneAttributes busOnly = 
	new VehicleLaneAttributes(2048);
    public static final VehicleLaneAttributes busAndTaxiOnly = 
	new VehicleLaneAttributes(4096);
    public static final VehicleLaneAttributes maneuverHOVLane = 
	new VehicleLaneAttributes(8192);
    public static final VehicleLaneAttributes maneuverSharedLane = 
	new VehicleLaneAttributes(16384);
    public static final VehicleLaneAttributes maneuverBikeLane = 
	new VehicleLaneAttributes(32768);
}
