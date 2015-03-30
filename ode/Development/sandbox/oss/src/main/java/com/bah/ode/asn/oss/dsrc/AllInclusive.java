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
/* Created: Tue Mar 24 11:33:39 2015 */
/* ASN.1 Compiler for Java version: 6.1 */
/* ASN.1 compiler options and file names specified:
 * -toed -output com.bah.ode.asn.oss -per -uper -ber -der -root -messageFormat
 * msvc C:/Users/572682/Projects/ODE/Trials/ASN.1/DSRC_R36_Source.asn
 * C:/Users/572682/Projects/ODE/Trials/ASN.1/SEMI_ASN.1_Structures_2.2.asn
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
 * Define the ASN1 Type AllInclusive from ASN1 Module DSRC.
 * @see Sequence
 */

public class AllInclusive extends Sequence {
    public AccelerationSet4Way item6_1;
    public AccelSteerYawRateConfidence item6_2;
    public AntennaOffsetSet item6_4;
    public Approach item6_5;
    public ApproachObject item6_6;
    public BarrierLane item6_7;
    public BrakeSystemStatus item6_8;
    public BSMblob item6_9;
    public BumperHeights item6_10;
    public Circle item6_11;
    public ConfidenceSet item6_12;
    public ConnectsTo item6_13;
    public CrosswalkLane item6_14;
    public DataParameters item6_15;
    public DDate item6_16;
    public DDateTime item6_17;
    public DFullTime item6_18;
    public DMonthDay item6_19;
    public DTime item6_20;
    public DYearMonth item6_21;
    public FullPositionVector item6_22;
    public Intersection_ item6_23;
    public IntersectionState item6_24;
    public ExitService item6_25;
    public GenericSignage item6_26;
    public SpeedLimit item6_27;
    public WorkZone item6_28;
    public J1939data item6_29;
    public MovementState item6_30;
    public NodeList item6_31;
    public Offsets item6_32;
    public PathHistory item6_33;
    public PathHistoryPointType_01 item6_34;
    public PathHistoryPointType_02 item6_35;
    public PathHistoryPointType_03 item6_36;
    public PathHistoryPointType_04 item6_37;
    public PathHistoryPointType_05 item6_38;
    public PathHistoryPointType_06 item6_39;
    public PathHistoryPointType_07 item6_40;
    public PathHistoryPointType_08 item6_41;
    public PathHistoryPointType_09 item6_42;
    public PathHistoryPointType_10 item6_43;
    public PathPrediction item6_44;
    public Position3D item6_45;
    public PositionalAccuracy item6_46;
    public PositionConfidenceSet item6_47;
    public RegionList item6_48;
    public RegionOffsets item6_49;
    public RegionPointSet item6_50;
    public RoadSignID item6_51;
    public RTCMHeader item6_52;
    public RTCMmsg item6_53;
    public RTCMPackage item6_54;
    public Sample item6_55;
    public ShapePointSet item6_56;
    public SignalControlZone item6_57;
    public SignalRequest item6_58;
    public SnapshotDistance item6_59;
    public Snapshot item6_60;
    public SnapshotTime item6_61;
    public SpecialLane item6_62;
    public SpeedandHeadingandThrottleConfidence item6_63;
    public TransmissionAndSpeed item6_64;
    public ValidRegion item6_65;
    public VehicleComputedLane item6_66;
    public VehicleIdent item6_67;
    public VehicleReferenceLane item6_68;
    public VehicleSafetyExtension item6_69;
    public VehicleSize item6_70;
    public VehicleStatusRequest item6_71;
    public VehicleStatus item6_72;
    public WiperStatus item6_73;
    public Acceleration item7_1;
    public AccelerationConfidence item7_2;
    public AmbientAirPressure item7_3;
    public AmbientAirTemperature item7_4;
    public AntiLockBrakeStatus item7_5;
    public ApproachNumber item7_6;
    public AuxiliaryBrakeStatus item7_7;
    public BarrierAttributes item7_8;
    public BrakeAppliedPressure item7_9;
    public BrakeAppliedStatus item7_10;
    public BrakeBoostApplied item7_11;
    public BumperHeightFront item7_12;
    public BumperHeightRear item7_13;
    public CodeWord item7_14;
    public CoefficientOfFriction item7_15;
    public ColorState item7_16;
    public Count item7_17;
    public CrosswalkLaneAttributes item7_18;
    public DDay item7_19;
    public DescriptiveName item7_20;
    public DHour item7_21;
    public DirectionOfUse item7_22;
    public DMinute item7_23;
    public DMonth item7_24;
    public DOffset item7_25;
    public DrivenLineOffset item7_26;
    public DrivingWheelAngle item7_27;
    public DSecond item7_28;
    public DSignalSeconds item7_29;
    public DSRCmsgID item7_30;
    public DYear item7_31;
    public ElevationConfidence item7_32;
    public Elevation item7_33;
    public EmergencyDetails item7_34;
    public EventFlags item7_35;
    public Extent item7_36;
    public ExteriorLights item7_37;
    public FurtherInfoID item7_38;
    public GPSstatus item7_39;
    public HeadingConfidence item7_40;
    public Heading item7_41;
    public HeadingSlice item7_42;
    public IntersectionStatusObject item7_43;
    public IntersectionID item7_44;
    public AxleLocation item7_45;
    public AxleWeight item7_46;
    public CargoWeight item7_47;
    public DriveAxleLiftAirPressure item7_48;
    public DriveAxleLocation item7_49;
    public DriveAxleLubePressure item7_50;
    public DriveAxleTemperature item7_51;
    public SteeringAxleLubePressure item7_52;
    public SteeringAxleTemperature item7_53;
    public TireLeakageRate item7_54;
    public TireLocation item7_55;
    public TirePressureThresholdDetection item7_56;
    public TirePressure item7_57;
    public TireTemp item7_58;
    public TrailerWeight item7_59;
    public WheelEndElectFault item7_60;
    public WheelSensorStatus item7_61;
    public LaneCount item7_62;
    public LaneManeuverCode item7_63;
    public LaneNumber item7_64;
    public LaneSet item7_65;
    public LaneWidth item7_66;
    public Latitude item7_67;
    public LayerID item7_68;
    public LayerType item7_69;
    public LightbarInUse item7_70;
    public Longitude item7_71;
    public Location_quality item7_72;
    public Location_tech item7_73;
    public MinuteOfTheYear item7_74;
    public MinutesDuration item7_75;
    public MsgCount item7_76;
    public MsgCRC item7_77;
    public MultiVehicleResponse item7_78;
    public MUTCDCode item7_79;
    public NMEA_MsgType item7_80;
    public NMEA_Payload item7_81;
    public NMEA_Revision item7_82;
    public NTCIPVehicleclass item7_83;
    public ObjectCount item7_84;
    public ObstacleDirection item7_85;
    public ObstacleDistance item7_86;
    public PayloadData item7_87;
    public Payload item7_88;
    public PedestrianDetect item7_89;
    public PedestrianSignalState item7_90;
    public PositionConfidence item7_91;
    public PreemptState item7_92;
    public Priority item7_93;
    public PriorityState item7_94;
    public ProbeSegmentNumber item7_95;
    public RainSensor item7_96;
    public RequestedItem item7_97;
    public ResponseType item7_98;
    public RTCM_ID item7_99;
    public RTCM_Payload item7_100;
    public RTCM_Revision item7_101;
    public SignalLightState item7_102;
    public SignalReqScheme item7_103;
    public SignalState item7_104;
    public SignPrority item7_105;
    public SirenInUse item7_106;
    public SpecialLaneAttributes item7_107;
    public SpecialSignalState item7_108;
    public SpeedConfidence item7_109;
    public Speed item7_110;
    public StabilityControlStatus item7_111;
    public StateConfidence item7_112;
    public SteeringWheelAngleConfidence item7_113;
    public SteeringWheelAngleRateOfChange item7_114;
    public SteeringWheelAngle item7_115;
    public SunSensor item7_116;
    public TemporaryID item7_117;
    public TermDistance item7_118;
    public TermTime item7_119;
    public ThrottleConfidence item7_120;
    public ThrottlePosition item7_121;
    public TimeConfidence item7_122;
    public TimeMark item7_123;
    public TractionControlState item7_124;
    public TransitPreEmptionRequest item7_125;
    public TransitStatus item7_126;
    public TransmissionState item7_127;
    public TxTime item7_128;
    public TravelerInfoType item7_129;
    public UniqueMSGID item7_130;
    public URL_Base item7_131;
    public URL_Link item7_132;
    public URL_Short item7_133;
    public VehicleHeight item7_134;
    public VehicleLaneAttributes item7_135;
    public VehicleLength item7_136;
    public VehicleMass item7_137;
    public VehicleRequestStatus item7_138;
    public VehicleStatusDeviceTypeTag item7_139;
    public VehicleType item7_140;
    public VehicleWidth item7_141;
    public VerticalAccelerationThreshold item7_142;
    public VerticalAcceleration item7_143;
    public VINstring item7_144;
    public WiperRate item7_145;
    public WiperStatusFront item7_146;
    public WiperStatusRear item7_147;
    public YawRateConfidence item7_148;
    public YawRate item7_149;
    public com.bah.ode.asn.oss.itis.IncidentResponseEquipment item8_1;
    public com.bah.ode.asn.oss.itis.ITIStext item8_2;
    public com.bah.ode.asn.oss.itis.ResponderGroupAffected item8_3;
    public com.bah.ode.asn.oss.itis.VehicleGroupAffected item8_4;
    public com.bah.ode.asn.oss.itis.ITIScodesAndText item8_5;
    public com.bah.ode.asn.oss.ntcip.EssMobileFriction item8_6;
    public com.bah.ode.asn.oss.ntcip.EssPrecipRate item8_7;
    public com.bah.ode.asn.oss.ntcip.EssPrecipSituation item8_8;
    public com.bah.ode.asn.oss.ntcip.EssPrecipYesNo item8_9;
    public com.bah.ode.asn.oss.ntcip.EssSolarRadiation item8_10;
    public com.bah.ode.asn.oss.itis.ITIScodes item8_11;
    
    /**
     * The default constructor.
     */
    public AllInclusive()
    {
    }
    
    
    // Methods for field "item6_1"
    public AccelerationSet4Way getItem6_1()
    {
	return this.item6_1;
    }
    
    public void setItem6_1(AccelerationSet4Way item6_1)
    {
	this.item6_1 = item6_1;
    }
    
    public boolean hasItem6_1()
    {
	return (item6_1 != null);
    }
    
    public void deleteItem6_1()
    {
	item6_1 = null;
    }
    
    
    // Methods for field "item6_2"
    public AccelSteerYawRateConfidence getItem6_2()
    {
	return this.item6_2;
    }
    
    public void setItem6_2(AccelSteerYawRateConfidence item6_2)
    {
	this.item6_2 = item6_2;
    }
    
    public boolean hasItem6_2()
    {
	return (item6_2 != null);
    }
    
    public void deleteItem6_2()
    {
	item6_2 = null;
    }
    
    
    // Methods for field "item6_4"
    public AntennaOffsetSet getItem6_4()
    {
	return this.item6_4;
    }
    
    public void setItem6_4(AntennaOffsetSet item6_4)
    {
	this.item6_4 = item6_4;
    }
    
    public boolean hasItem6_4()
    {
	return (item6_4 != null);
    }
    
    public void deleteItem6_4()
    {
	item6_4 = null;
    }
    
    
    // Methods for field "item6_5"
    public Approach getItem6_5()
    {
	return this.item6_5;
    }
    
    public void setItem6_5(Approach item6_5)
    {
	this.item6_5 = item6_5;
    }
    
    public boolean hasItem6_5()
    {
	return (item6_5 != null);
    }
    
    public void deleteItem6_5()
    {
	item6_5 = null;
    }
    
    
    // Methods for field "item6_6"
    public ApproachObject getItem6_6()
    {
	return this.item6_6;
    }
    
    public void setItem6_6(ApproachObject item6_6)
    {
	this.item6_6 = item6_6;
    }
    
    public boolean hasItem6_6()
    {
	return (item6_6 != null);
    }
    
    public void deleteItem6_6()
    {
	item6_6 = null;
    }
    
    
    // Methods for field "item6_7"
    public BarrierLane getItem6_7()
    {
	return this.item6_7;
    }
    
    public void setItem6_7(BarrierLane item6_7)
    {
	this.item6_7 = item6_7;
    }
    
    public boolean hasItem6_7()
    {
	return (item6_7 != null);
    }
    
    public void deleteItem6_7()
    {
	item6_7 = null;
    }
    
    
    // Methods for field "item6_8"
    public BrakeSystemStatus getItem6_8()
    {
	return this.item6_8;
    }
    
    public void setItem6_8(BrakeSystemStatus item6_8)
    {
	this.item6_8 = item6_8;
    }
    
    public boolean hasItem6_8()
    {
	return (item6_8 != null);
    }
    
    public void deleteItem6_8()
    {
	item6_8 = null;
    }
    
    
    // Methods for field "item6_9"
    public BSMblob getItem6_9()
    {
	return this.item6_9;
    }
    
    public void setItem6_9(BSMblob item6_9)
    {
	this.item6_9 = item6_9;
    }
    
    public boolean hasItem6_9()
    {
	return (item6_9 != null);
    }
    
    public void deleteItem6_9()
    {
	item6_9 = null;
    }
    
    
    // Methods for field "item6_10"
    public BumperHeights getItem6_10()
    {
	return this.item6_10;
    }
    
    public void setItem6_10(BumperHeights item6_10)
    {
	this.item6_10 = item6_10;
    }
    
    public boolean hasItem6_10()
    {
	return (item6_10 != null);
    }
    
    public void deleteItem6_10()
    {
	item6_10 = null;
    }
    
    
    // Methods for field "item6_11"
    public Circle getItem6_11()
    {
	return this.item6_11;
    }
    
    public void setItem6_11(Circle item6_11)
    {
	this.item6_11 = item6_11;
    }
    
    public boolean hasItem6_11()
    {
	return (item6_11 != null);
    }
    
    public void deleteItem6_11()
    {
	item6_11 = null;
    }
    
    
    // Methods for field "item6_12"
    public ConfidenceSet getItem6_12()
    {
	return this.item6_12;
    }
    
    public void setItem6_12(ConfidenceSet item6_12)
    {
	this.item6_12 = item6_12;
    }
    
    public boolean hasItem6_12()
    {
	return (item6_12 != null);
    }
    
    public void deleteItem6_12()
    {
	item6_12 = null;
    }
    
    
    // Methods for field "item6_13"
    public ConnectsTo getItem6_13()
    {
	return this.item6_13;
    }
    
    public void setItem6_13(ConnectsTo item6_13)
    {
	this.item6_13 = item6_13;
    }
    
    public boolean hasItem6_13()
    {
	return (item6_13 != null);
    }
    
    public void deleteItem6_13()
    {
	item6_13 = null;
    }
    
    
    // Methods for field "item6_14"
    public CrosswalkLane getItem6_14()
    {
	return this.item6_14;
    }
    
    public void setItem6_14(CrosswalkLane item6_14)
    {
	this.item6_14 = item6_14;
    }
    
    public boolean hasItem6_14()
    {
	return (item6_14 != null);
    }
    
    public void deleteItem6_14()
    {
	item6_14 = null;
    }
    
    
    // Methods for field "item6_15"
    public DataParameters getItem6_15()
    {
	return this.item6_15;
    }
    
    public void setItem6_15(DataParameters item6_15)
    {
	this.item6_15 = item6_15;
    }
    
    public boolean hasItem6_15()
    {
	return (item6_15 != null);
    }
    
    public void deleteItem6_15()
    {
	item6_15 = null;
    }
    
    
    // Methods for field "item6_16"
    public DDate getItem6_16()
    {
	return this.item6_16;
    }
    
    public void setItem6_16(DDate item6_16)
    {
	this.item6_16 = item6_16;
    }
    
    public boolean hasItem6_16()
    {
	return (item6_16 != null);
    }
    
    public void deleteItem6_16()
    {
	item6_16 = null;
    }
    
    
    // Methods for field "item6_17"
    public DDateTime getItem6_17()
    {
	return this.item6_17;
    }
    
    public void setItem6_17(DDateTime item6_17)
    {
	this.item6_17 = item6_17;
    }
    
    public boolean hasItem6_17()
    {
	return (item6_17 != null);
    }
    
    public void deleteItem6_17()
    {
	item6_17 = null;
    }
    
    
    // Methods for field "item6_18"
    public DFullTime getItem6_18()
    {
	return this.item6_18;
    }
    
    public void setItem6_18(DFullTime item6_18)
    {
	this.item6_18 = item6_18;
    }
    
    public boolean hasItem6_18()
    {
	return (item6_18 != null);
    }
    
    public void deleteItem6_18()
    {
	item6_18 = null;
    }
    
    
    // Methods for field "item6_19"
    public DMonthDay getItem6_19()
    {
	return this.item6_19;
    }
    
    public void setItem6_19(DMonthDay item6_19)
    {
	this.item6_19 = item6_19;
    }
    
    public boolean hasItem6_19()
    {
	return (item6_19 != null);
    }
    
    public void deleteItem6_19()
    {
	item6_19 = null;
    }
    
    
    // Methods for field "item6_20"
    public DTime getItem6_20()
    {
	return this.item6_20;
    }
    
    public void setItem6_20(DTime item6_20)
    {
	this.item6_20 = item6_20;
    }
    
    public boolean hasItem6_20()
    {
	return (item6_20 != null);
    }
    
    public void deleteItem6_20()
    {
	item6_20 = null;
    }
    
    
    // Methods for field "item6_21"
    public DYearMonth getItem6_21()
    {
	return this.item6_21;
    }
    
    public void setItem6_21(DYearMonth item6_21)
    {
	this.item6_21 = item6_21;
    }
    
    public boolean hasItem6_21()
    {
	return (item6_21 != null);
    }
    
    public void deleteItem6_21()
    {
	item6_21 = null;
    }
    
    
    // Methods for field "item6_22"
    public FullPositionVector getItem6_22()
    {
	return this.item6_22;
    }
    
    public void setItem6_22(FullPositionVector item6_22)
    {
	this.item6_22 = item6_22;
    }
    
    public boolean hasItem6_22()
    {
	return (item6_22 != null);
    }
    
    public void deleteItem6_22()
    {
	item6_22 = null;
    }
    
    
    // Methods for field "item6_23"
    public Intersection_ getItem6_23()
    {
	return this.item6_23;
    }
    
    public void setItem6_23(Intersection_ item6_23)
    {
	this.item6_23 = item6_23;
    }
    
    public boolean hasItem6_23()
    {
	return (item6_23 != null);
    }
    
    public void deleteItem6_23()
    {
	item6_23 = null;
    }
    
    
    // Methods for field "item6_24"
    public IntersectionState getItem6_24()
    {
	return this.item6_24;
    }
    
    public void setItem6_24(IntersectionState item6_24)
    {
	this.item6_24 = item6_24;
    }
    
    public boolean hasItem6_24()
    {
	return (item6_24 != null);
    }
    
    public void deleteItem6_24()
    {
	item6_24 = null;
    }
    
    
    // Methods for field "item6_25"
    public ExitService getItem6_25()
    {
	return this.item6_25;
    }
    
    public void setItem6_25(ExitService item6_25)
    {
	this.item6_25 = item6_25;
    }
    
    public boolean hasItem6_25()
    {
	return (item6_25 != null);
    }
    
    public void deleteItem6_25()
    {
	item6_25 = null;
    }
    
    
    // Methods for field "item6_26"
    public GenericSignage getItem6_26()
    {
	return this.item6_26;
    }
    
    public void setItem6_26(GenericSignage item6_26)
    {
	this.item6_26 = item6_26;
    }
    
    public boolean hasItem6_26()
    {
	return (item6_26 != null);
    }
    
    public void deleteItem6_26()
    {
	item6_26 = null;
    }
    
    
    // Methods for field "item6_27"
    public SpeedLimit getItem6_27()
    {
	return this.item6_27;
    }
    
    public void setItem6_27(SpeedLimit item6_27)
    {
	this.item6_27 = item6_27;
    }
    
    public boolean hasItem6_27()
    {
	return (item6_27 != null);
    }
    
    public void deleteItem6_27()
    {
	item6_27 = null;
    }
    
    
    // Methods for field "item6_28"
    public WorkZone getItem6_28()
    {
	return this.item6_28;
    }
    
    public void setItem6_28(WorkZone item6_28)
    {
	this.item6_28 = item6_28;
    }
    
    public boolean hasItem6_28()
    {
	return (item6_28 != null);
    }
    
    public void deleteItem6_28()
    {
	item6_28 = null;
    }
    
    
    // Methods for field "item6_29"
    public J1939data getItem6_29()
    {
	return this.item6_29;
    }
    
    public void setItem6_29(J1939data item6_29)
    {
	this.item6_29 = item6_29;
    }
    
    public boolean hasItem6_29()
    {
	return (item6_29 != null);
    }
    
    public void deleteItem6_29()
    {
	item6_29 = null;
    }
    
    
    // Methods for field "item6_30"
    public MovementState getItem6_30()
    {
	return this.item6_30;
    }
    
    public void setItem6_30(MovementState item6_30)
    {
	this.item6_30 = item6_30;
    }
    
    public boolean hasItem6_30()
    {
	return (item6_30 != null);
    }
    
    public void deleteItem6_30()
    {
	item6_30 = null;
    }
    
    
    // Methods for field "item6_31"
    public NodeList getItem6_31()
    {
	return this.item6_31;
    }
    
    public void setItem6_31(NodeList item6_31)
    {
	this.item6_31 = item6_31;
    }
    
    public boolean hasItem6_31()
    {
	return (item6_31 != null);
    }
    
    public void deleteItem6_31()
    {
	item6_31 = null;
    }
    
    
    // Methods for field "item6_32"
    public Offsets getItem6_32()
    {
	return this.item6_32;
    }
    
    public void setItem6_32(Offsets item6_32)
    {
	this.item6_32 = item6_32;
    }
    
    public boolean hasItem6_32()
    {
	return (item6_32 != null);
    }
    
    public void deleteItem6_32()
    {
	item6_32 = null;
    }
    
    
    // Methods for field "item6_33"
    public PathHistory getItem6_33()
    {
	return this.item6_33;
    }
    
    public void setItem6_33(PathHistory item6_33)
    {
	this.item6_33 = item6_33;
    }
    
    public boolean hasItem6_33()
    {
	return (item6_33 != null);
    }
    
    public void deleteItem6_33()
    {
	item6_33 = null;
    }
    
    
    // Methods for field "item6_34"
    public PathHistoryPointType_01 getItem6_34()
    {
	return this.item6_34;
    }
    
    public void setItem6_34(PathHistoryPointType_01 item6_34)
    {
	this.item6_34 = item6_34;
    }
    
    public boolean hasItem6_34()
    {
	return (item6_34 != null);
    }
    
    public void deleteItem6_34()
    {
	item6_34 = null;
    }
    
    
    // Methods for field "item6_35"
    public PathHistoryPointType_02 getItem6_35()
    {
	return this.item6_35;
    }
    
    public void setItem6_35(PathHistoryPointType_02 item6_35)
    {
	this.item6_35 = item6_35;
    }
    
    public boolean hasItem6_35()
    {
	return (item6_35 != null);
    }
    
    public void deleteItem6_35()
    {
	item6_35 = null;
    }
    
    
    // Methods for field "item6_36"
    public PathHistoryPointType_03 getItem6_36()
    {
	return this.item6_36;
    }
    
    public void setItem6_36(PathHistoryPointType_03 item6_36)
    {
	this.item6_36 = item6_36;
    }
    
    public boolean hasItem6_36()
    {
	return (item6_36 != null);
    }
    
    public void deleteItem6_36()
    {
	item6_36 = null;
    }
    
    
    // Methods for field "item6_37"
    public PathHistoryPointType_04 getItem6_37()
    {
	return this.item6_37;
    }
    
    public void setItem6_37(PathHistoryPointType_04 item6_37)
    {
	this.item6_37 = item6_37;
    }
    
    public boolean hasItem6_37()
    {
	return (item6_37 != null);
    }
    
    public void deleteItem6_37()
    {
	item6_37 = null;
    }
    
    
    // Methods for field "item6_38"
    public PathHistoryPointType_05 getItem6_38()
    {
	return this.item6_38;
    }
    
    public void setItem6_38(PathHistoryPointType_05 item6_38)
    {
	this.item6_38 = item6_38;
    }
    
    public boolean hasItem6_38()
    {
	return (item6_38 != null);
    }
    
    public void deleteItem6_38()
    {
	item6_38 = null;
    }
    
    
    // Methods for field "item6_39"
    public PathHistoryPointType_06 getItem6_39()
    {
	return this.item6_39;
    }
    
    public void setItem6_39(PathHistoryPointType_06 item6_39)
    {
	this.item6_39 = item6_39;
    }
    
    public boolean hasItem6_39()
    {
	return (item6_39 != null);
    }
    
    public void deleteItem6_39()
    {
	item6_39 = null;
    }
    
    
    // Methods for field "item6_40"
    public PathHistoryPointType_07 getItem6_40()
    {
	return this.item6_40;
    }
    
    public void setItem6_40(PathHistoryPointType_07 item6_40)
    {
	this.item6_40 = item6_40;
    }
    
    public boolean hasItem6_40()
    {
	return (item6_40 != null);
    }
    
    public void deleteItem6_40()
    {
	item6_40 = null;
    }
    
    
    // Methods for field "item6_41"
    public PathHistoryPointType_08 getItem6_41()
    {
	return this.item6_41;
    }
    
    public void setItem6_41(PathHistoryPointType_08 item6_41)
    {
	this.item6_41 = item6_41;
    }
    
    public boolean hasItem6_41()
    {
	return (item6_41 != null);
    }
    
    public void deleteItem6_41()
    {
	item6_41 = null;
    }
    
    
    // Methods for field "item6_42"
    public PathHistoryPointType_09 getItem6_42()
    {
	return this.item6_42;
    }
    
    public void setItem6_42(PathHistoryPointType_09 item6_42)
    {
	this.item6_42 = item6_42;
    }
    
    public boolean hasItem6_42()
    {
	return (item6_42 != null);
    }
    
    public void deleteItem6_42()
    {
	item6_42 = null;
    }
    
    
    // Methods for field "item6_43"
    public PathHistoryPointType_10 getItem6_43()
    {
	return this.item6_43;
    }
    
    public void setItem6_43(PathHistoryPointType_10 item6_43)
    {
	this.item6_43 = item6_43;
    }
    
    public boolean hasItem6_43()
    {
	return (item6_43 != null);
    }
    
    public void deleteItem6_43()
    {
	item6_43 = null;
    }
    
    
    // Methods for field "item6_44"
    public PathPrediction getItem6_44()
    {
	return this.item6_44;
    }
    
    public void setItem6_44(PathPrediction item6_44)
    {
	this.item6_44 = item6_44;
    }
    
    public boolean hasItem6_44()
    {
	return (item6_44 != null);
    }
    
    public void deleteItem6_44()
    {
	item6_44 = null;
    }
    
    
    // Methods for field "item6_45"
    public Position3D getItem6_45()
    {
	return this.item6_45;
    }
    
    public void setItem6_45(Position3D item6_45)
    {
	this.item6_45 = item6_45;
    }
    
    public boolean hasItem6_45()
    {
	return (item6_45 != null);
    }
    
    public void deleteItem6_45()
    {
	item6_45 = null;
    }
    
    
    // Methods for field "item6_46"
    public PositionalAccuracy getItem6_46()
    {
	return this.item6_46;
    }
    
    public void setItem6_46(PositionalAccuracy item6_46)
    {
	this.item6_46 = item6_46;
    }
    
    public boolean hasItem6_46()
    {
	return (item6_46 != null);
    }
    
    public void deleteItem6_46()
    {
	item6_46 = null;
    }
    
    
    // Methods for field "item6_47"
    public PositionConfidenceSet getItem6_47()
    {
	return this.item6_47;
    }
    
    public void setItem6_47(PositionConfidenceSet item6_47)
    {
	this.item6_47 = item6_47;
    }
    
    public boolean hasItem6_47()
    {
	return (item6_47 != null);
    }
    
    public void deleteItem6_47()
    {
	item6_47 = null;
    }
    
    
    // Methods for field "item6_48"
    public RegionList getItem6_48()
    {
	return this.item6_48;
    }
    
    public void setItem6_48(RegionList item6_48)
    {
	this.item6_48 = item6_48;
    }
    
    public boolean hasItem6_48()
    {
	return (item6_48 != null);
    }
    
    public void deleteItem6_48()
    {
	item6_48 = null;
    }
    
    
    // Methods for field "item6_49"
    public RegionOffsets getItem6_49()
    {
	return this.item6_49;
    }
    
    public void setItem6_49(RegionOffsets item6_49)
    {
	this.item6_49 = item6_49;
    }
    
    public boolean hasItem6_49()
    {
	return (item6_49 != null);
    }
    
    public void deleteItem6_49()
    {
	item6_49 = null;
    }
    
    
    // Methods for field "item6_50"
    public RegionPointSet getItem6_50()
    {
	return this.item6_50;
    }
    
    public void setItem6_50(RegionPointSet item6_50)
    {
	this.item6_50 = item6_50;
    }
    
    public boolean hasItem6_50()
    {
	return (item6_50 != null);
    }
    
    public void deleteItem6_50()
    {
	item6_50 = null;
    }
    
    
    // Methods for field "item6_51"
    public RoadSignID getItem6_51()
    {
	return this.item6_51;
    }
    
    public void setItem6_51(RoadSignID item6_51)
    {
	this.item6_51 = item6_51;
    }
    
    public boolean hasItem6_51()
    {
	return (item6_51 != null);
    }
    
    public void deleteItem6_51()
    {
	item6_51 = null;
    }
    
    
    // Methods for field "item6_52"
    public RTCMHeader getItem6_52()
    {
	return this.item6_52;
    }
    
    public void setItem6_52(RTCMHeader item6_52)
    {
	this.item6_52 = item6_52;
    }
    
    public boolean hasItem6_52()
    {
	return (item6_52 != null);
    }
    
    public void deleteItem6_52()
    {
	item6_52 = null;
    }
    
    
    // Methods for field "item6_53"
    public RTCMmsg getItem6_53()
    {
	return this.item6_53;
    }
    
    public void setItem6_53(RTCMmsg item6_53)
    {
	this.item6_53 = item6_53;
    }
    
    public boolean hasItem6_53()
    {
	return (item6_53 != null);
    }
    
    public void deleteItem6_53()
    {
	item6_53 = null;
    }
    
    
    // Methods for field "item6_54"
    public RTCMPackage getItem6_54()
    {
	return this.item6_54;
    }
    
    public void setItem6_54(RTCMPackage item6_54)
    {
	this.item6_54 = item6_54;
    }
    
    public boolean hasItem6_54()
    {
	return (item6_54 != null);
    }
    
    public void deleteItem6_54()
    {
	item6_54 = null;
    }
    
    
    // Methods for field "item6_55"
    public Sample getItem6_55()
    {
	return this.item6_55;
    }
    
    public void setItem6_55(Sample item6_55)
    {
	this.item6_55 = item6_55;
    }
    
    public boolean hasItem6_55()
    {
	return (item6_55 != null);
    }
    
    public void deleteItem6_55()
    {
	item6_55 = null;
    }
    
    
    // Methods for field "item6_56"
    public ShapePointSet getItem6_56()
    {
	return this.item6_56;
    }
    
    public void setItem6_56(ShapePointSet item6_56)
    {
	this.item6_56 = item6_56;
    }
    
    public boolean hasItem6_56()
    {
	return (item6_56 != null);
    }
    
    public void deleteItem6_56()
    {
	item6_56 = null;
    }
    
    
    // Methods for field "item6_57"
    public SignalControlZone getItem6_57()
    {
	return this.item6_57;
    }
    
    public void setItem6_57(SignalControlZone item6_57)
    {
	this.item6_57 = item6_57;
    }
    
    public boolean hasItem6_57()
    {
	return (item6_57 != null);
    }
    
    public void deleteItem6_57()
    {
	item6_57 = null;
    }
    
    
    // Methods for field "item6_58"
    public SignalRequest getItem6_58()
    {
	return this.item6_58;
    }
    
    public void setItem6_58(SignalRequest item6_58)
    {
	this.item6_58 = item6_58;
    }
    
    public boolean hasItem6_58()
    {
	return (item6_58 != null);
    }
    
    public void deleteItem6_58()
    {
	item6_58 = null;
    }
    
    
    // Methods for field "item6_59"
    public SnapshotDistance getItem6_59()
    {
	return this.item6_59;
    }
    
    public void setItem6_59(SnapshotDistance item6_59)
    {
	this.item6_59 = item6_59;
    }
    
    public boolean hasItem6_59()
    {
	return (item6_59 != null);
    }
    
    public void deleteItem6_59()
    {
	item6_59 = null;
    }
    
    
    // Methods for field "item6_60"
    public Snapshot getItem6_60()
    {
	return this.item6_60;
    }
    
    public void setItem6_60(Snapshot item6_60)
    {
	this.item6_60 = item6_60;
    }
    
    public boolean hasItem6_60()
    {
	return (item6_60 != null);
    }
    
    public void deleteItem6_60()
    {
	item6_60 = null;
    }
    
    
    // Methods for field "item6_61"
    public SnapshotTime getItem6_61()
    {
	return this.item6_61;
    }
    
    public void setItem6_61(SnapshotTime item6_61)
    {
	this.item6_61 = item6_61;
    }
    
    public boolean hasItem6_61()
    {
	return (item6_61 != null);
    }
    
    public void deleteItem6_61()
    {
	item6_61 = null;
    }
    
    
    // Methods for field "item6_62"
    public SpecialLane getItem6_62()
    {
	return this.item6_62;
    }
    
    public void setItem6_62(SpecialLane item6_62)
    {
	this.item6_62 = item6_62;
    }
    
    public boolean hasItem6_62()
    {
	return (item6_62 != null);
    }
    
    public void deleteItem6_62()
    {
	item6_62 = null;
    }
    
    
    // Methods for field "item6_63"
    public SpeedandHeadingandThrottleConfidence getItem6_63()
    {
	return this.item6_63;
    }
    
    public void setItem6_63(SpeedandHeadingandThrottleConfidence item6_63)
    {
	this.item6_63 = item6_63;
    }
    
    public boolean hasItem6_63()
    {
	return (item6_63 != null);
    }
    
    public void deleteItem6_63()
    {
	item6_63 = null;
    }
    
    
    // Methods for field "item6_64"
    public TransmissionAndSpeed getItem6_64()
    {
	return this.item6_64;
    }
    
    public void setItem6_64(TransmissionAndSpeed item6_64)
    {
	this.item6_64 = item6_64;
    }
    
    public boolean hasItem6_64()
    {
	return (item6_64 != null);
    }
    
    public void deleteItem6_64()
    {
	item6_64 = null;
    }
    
    
    // Methods for field "item6_65"
    public ValidRegion getItem6_65()
    {
	return this.item6_65;
    }
    
    public void setItem6_65(ValidRegion item6_65)
    {
	this.item6_65 = item6_65;
    }
    
    public boolean hasItem6_65()
    {
	return (item6_65 != null);
    }
    
    public void deleteItem6_65()
    {
	item6_65 = null;
    }
    
    
    // Methods for field "item6_66"
    public VehicleComputedLane getItem6_66()
    {
	return this.item6_66;
    }
    
    public void setItem6_66(VehicleComputedLane item6_66)
    {
	this.item6_66 = item6_66;
    }
    
    public boolean hasItem6_66()
    {
	return (item6_66 != null);
    }
    
    public void deleteItem6_66()
    {
	item6_66 = null;
    }
    
    
    // Methods for field "item6_67"
    public VehicleIdent getItem6_67()
    {
	return this.item6_67;
    }
    
    public void setItem6_67(VehicleIdent item6_67)
    {
	this.item6_67 = item6_67;
    }
    
    public boolean hasItem6_67()
    {
	return (item6_67 != null);
    }
    
    public void deleteItem6_67()
    {
	item6_67 = null;
    }
    
    
    // Methods for field "item6_68"
    public VehicleReferenceLane getItem6_68()
    {
	return this.item6_68;
    }
    
    public void setItem6_68(VehicleReferenceLane item6_68)
    {
	this.item6_68 = item6_68;
    }
    
    public boolean hasItem6_68()
    {
	return (item6_68 != null);
    }
    
    public void deleteItem6_68()
    {
	item6_68 = null;
    }
    
    
    // Methods for field "item6_69"
    public VehicleSafetyExtension getItem6_69()
    {
	return this.item6_69;
    }
    
    public void setItem6_69(VehicleSafetyExtension item6_69)
    {
	this.item6_69 = item6_69;
    }
    
    public boolean hasItem6_69()
    {
	return (item6_69 != null);
    }
    
    public void deleteItem6_69()
    {
	item6_69 = null;
    }
    
    
    // Methods for field "item6_70"
    public VehicleSize getItem6_70()
    {
	return this.item6_70;
    }
    
    public void setItem6_70(VehicleSize item6_70)
    {
	this.item6_70 = item6_70;
    }
    
    public boolean hasItem6_70()
    {
	return (item6_70 != null);
    }
    
    public void deleteItem6_70()
    {
	item6_70 = null;
    }
    
    
    // Methods for field "item6_71"
    public VehicleStatusRequest getItem6_71()
    {
	return this.item6_71;
    }
    
    public void setItem6_71(VehicleStatusRequest item6_71)
    {
	this.item6_71 = item6_71;
    }
    
    public boolean hasItem6_71()
    {
	return (item6_71 != null);
    }
    
    public void deleteItem6_71()
    {
	item6_71 = null;
    }
    
    
    // Methods for field "item6_72"
    public VehicleStatus getItem6_72()
    {
	return this.item6_72;
    }
    
    public void setItem6_72(VehicleStatus item6_72)
    {
	this.item6_72 = item6_72;
    }
    
    public boolean hasItem6_72()
    {
	return (item6_72 != null);
    }
    
    public void deleteItem6_72()
    {
	item6_72 = null;
    }
    
    
    // Methods for field "item6_73"
    public WiperStatus getItem6_73()
    {
	return this.item6_73;
    }
    
    public void setItem6_73(WiperStatus item6_73)
    {
	this.item6_73 = item6_73;
    }
    
    public boolean hasItem6_73()
    {
	return (item6_73 != null);
    }
    
    public void deleteItem6_73()
    {
	item6_73 = null;
    }
    
    
    // Methods for field "item7_1"
    public Acceleration getItem7_1()
    {
	return this.item7_1;
    }
    
    public void setItem7_1(Acceleration item7_1)
    {
	this.item7_1 = item7_1;
    }
    
    public boolean hasItem7_1()
    {
	return (item7_1 != null);
    }
    
    public void deleteItem7_1()
    {
	item7_1 = null;
    }
    
    
    // Methods for field "item7_2"
    public AccelerationConfidence getItem7_2()
    {
	return this.item7_2;
    }
    
    public void setItem7_2(AccelerationConfidence item7_2)
    {
	this.item7_2 = item7_2;
    }
    
    public boolean hasItem7_2()
    {
	return (item7_2 != null);
    }
    
    public void deleteItem7_2()
    {
	item7_2 = null;
    }
    
    
    // Methods for field "item7_3"
    public AmbientAirPressure getItem7_3()
    {
	return this.item7_3;
    }
    
    public void setItem7_3(AmbientAirPressure item7_3)
    {
	this.item7_3 = item7_3;
    }
    
    public boolean hasItem7_3()
    {
	return (item7_3 != null);
    }
    
    public void deleteItem7_3()
    {
	item7_3 = null;
    }
    
    
    // Methods for field "item7_4"
    public AmbientAirTemperature getItem7_4()
    {
	return this.item7_4;
    }
    
    public void setItem7_4(AmbientAirTemperature item7_4)
    {
	this.item7_4 = item7_4;
    }
    
    public boolean hasItem7_4()
    {
	return (item7_4 != null);
    }
    
    public void deleteItem7_4()
    {
	item7_4 = null;
    }
    
    
    // Methods for field "item7_5"
    public AntiLockBrakeStatus getItem7_5()
    {
	return this.item7_5;
    }
    
    public void setItem7_5(AntiLockBrakeStatus item7_5)
    {
	this.item7_5 = item7_5;
    }
    
    public boolean hasItem7_5()
    {
	return (item7_5 != null);
    }
    
    public void deleteItem7_5()
    {
	item7_5 = null;
    }
    
    
    // Methods for field "item7_6"
    public ApproachNumber getItem7_6()
    {
	return this.item7_6;
    }
    
    public void setItem7_6(ApproachNumber item7_6)
    {
	this.item7_6 = item7_6;
    }
    
    public boolean hasItem7_6()
    {
	return (item7_6 != null);
    }
    
    public void deleteItem7_6()
    {
	item7_6 = null;
    }
    
    
    // Methods for field "item7_7"
    public AuxiliaryBrakeStatus getItem7_7()
    {
	return this.item7_7;
    }
    
    public void setItem7_7(AuxiliaryBrakeStatus item7_7)
    {
	this.item7_7 = item7_7;
    }
    
    public boolean hasItem7_7()
    {
	return (item7_7 != null);
    }
    
    public void deleteItem7_7()
    {
	item7_7 = null;
    }
    
    
    // Methods for field "item7_8"
    public BarrierAttributes getItem7_8()
    {
	return this.item7_8;
    }
    
    public void setItem7_8(BarrierAttributes item7_8)
    {
	this.item7_8 = item7_8;
    }
    
    public boolean hasItem7_8()
    {
	return (item7_8 != null);
    }
    
    public void deleteItem7_8()
    {
	item7_8 = null;
    }
    
    
    // Methods for field "item7_9"
    public BrakeAppliedPressure getItem7_9()
    {
	return this.item7_9;
    }
    
    public void setItem7_9(BrakeAppliedPressure item7_9)
    {
	this.item7_9 = item7_9;
    }
    
    public boolean hasItem7_9()
    {
	return (item7_9 != null);
    }
    
    public void deleteItem7_9()
    {
	item7_9 = null;
    }
    
    
    // Methods for field "item7_10"
    public BrakeAppliedStatus getItem7_10()
    {
	return this.item7_10;
    }
    
    public void setItem7_10(BrakeAppliedStatus item7_10)
    {
	this.item7_10 = item7_10;
    }
    
    public boolean hasItem7_10()
    {
	return (item7_10 != null);
    }
    
    public void deleteItem7_10()
    {
	item7_10 = null;
    }
    
    
    // Methods for field "item7_11"
    public BrakeBoostApplied getItem7_11()
    {
	return this.item7_11;
    }
    
    public void setItem7_11(BrakeBoostApplied item7_11)
    {
	this.item7_11 = item7_11;
    }
    
    public boolean hasItem7_11()
    {
	return (item7_11 != null);
    }
    
    public void deleteItem7_11()
    {
	item7_11 = null;
    }
    
    
    // Methods for field "item7_12"
    public BumperHeightFront getItem7_12()
    {
	return this.item7_12;
    }
    
    public void setItem7_12(BumperHeightFront item7_12)
    {
	this.item7_12 = item7_12;
    }
    
    public boolean hasItem7_12()
    {
	return (item7_12 != null);
    }
    
    public void deleteItem7_12()
    {
	item7_12 = null;
    }
    
    
    // Methods for field "item7_13"
    public BumperHeightRear getItem7_13()
    {
	return this.item7_13;
    }
    
    public void setItem7_13(BumperHeightRear item7_13)
    {
	this.item7_13 = item7_13;
    }
    
    public boolean hasItem7_13()
    {
	return (item7_13 != null);
    }
    
    public void deleteItem7_13()
    {
	item7_13 = null;
    }
    
    
    // Methods for field "item7_14"
    public CodeWord getItem7_14()
    {
	return this.item7_14;
    }
    
    public void setItem7_14(CodeWord item7_14)
    {
	this.item7_14 = item7_14;
    }
    
    public boolean hasItem7_14()
    {
	return (item7_14 != null);
    }
    
    public void deleteItem7_14()
    {
	item7_14 = null;
    }
    
    
    // Methods for field "item7_15"
    public CoefficientOfFriction getItem7_15()
    {
	return this.item7_15;
    }
    
    public void setItem7_15(CoefficientOfFriction item7_15)
    {
	this.item7_15 = item7_15;
    }
    
    public boolean hasItem7_15()
    {
	return (item7_15 != null);
    }
    
    public void deleteItem7_15()
    {
	item7_15 = null;
    }
    
    
    // Methods for field "item7_16"
    public ColorState getItem7_16()
    {
	return this.item7_16;
    }
    
    public void setItem7_16(ColorState item7_16)
    {
	this.item7_16 = item7_16;
    }
    
    public boolean hasItem7_16()
    {
	return (item7_16 != null);
    }
    
    public void deleteItem7_16()
    {
	item7_16 = null;
    }
    
    
    // Methods for field "item7_17"
    public Count getItem7_17()
    {
	return this.item7_17;
    }
    
    public void setItem7_17(Count item7_17)
    {
	this.item7_17 = item7_17;
    }
    
    public boolean hasItem7_17()
    {
	return (item7_17 != null);
    }
    
    public void deleteItem7_17()
    {
	item7_17 = null;
    }
    
    
    // Methods for field "item7_18"
    public CrosswalkLaneAttributes getItem7_18()
    {
	return this.item7_18;
    }
    
    public void setItem7_18(CrosswalkLaneAttributes item7_18)
    {
	this.item7_18 = item7_18;
    }
    
    public boolean hasItem7_18()
    {
	return (item7_18 != null);
    }
    
    public void deleteItem7_18()
    {
	item7_18 = null;
    }
    
    
    // Methods for field "item7_19"
    public DDay getItem7_19()
    {
	return this.item7_19;
    }
    
    public void setItem7_19(DDay item7_19)
    {
	this.item7_19 = item7_19;
    }
    
    public boolean hasItem7_19()
    {
	return (item7_19 != null);
    }
    
    public void deleteItem7_19()
    {
	item7_19 = null;
    }
    
    
    // Methods for field "item7_20"
    public DescriptiveName getItem7_20()
    {
	return this.item7_20;
    }
    
    public void setItem7_20(DescriptiveName item7_20)
    {
	this.item7_20 = item7_20;
    }
    
    public boolean hasItem7_20()
    {
	return (item7_20 != null);
    }
    
    public void deleteItem7_20()
    {
	item7_20 = null;
    }
    
    
    // Methods for field "item7_21"
    public DHour getItem7_21()
    {
	return this.item7_21;
    }
    
    public void setItem7_21(DHour item7_21)
    {
	this.item7_21 = item7_21;
    }
    
    public boolean hasItem7_21()
    {
	return (item7_21 != null);
    }
    
    public void deleteItem7_21()
    {
	item7_21 = null;
    }
    
    
    // Methods for field "item7_22"
    public DirectionOfUse getItem7_22()
    {
	return this.item7_22;
    }
    
    public void setItem7_22(DirectionOfUse item7_22)
    {
	this.item7_22 = item7_22;
    }
    
    public boolean hasItem7_22()
    {
	return (item7_22 != null);
    }
    
    public void deleteItem7_22()
    {
	item7_22 = null;
    }
    
    
    // Methods for field "item7_23"
    public DMinute getItem7_23()
    {
	return this.item7_23;
    }
    
    public void setItem7_23(DMinute item7_23)
    {
	this.item7_23 = item7_23;
    }
    
    public boolean hasItem7_23()
    {
	return (item7_23 != null);
    }
    
    public void deleteItem7_23()
    {
	item7_23 = null;
    }
    
    
    // Methods for field "item7_24"
    public DMonth getItem7_24()
    {
	return this.item7_24;
    }
    
    public void setItem7_24(DMonth item7_24)
    {
	this.item7_24 = item7_24;
    }
    
    public boolean hasItem7_24()
    {
	return (item7_24 != null);
    }
    
    public void deleteItem7_24()
    {
	item7_24 = null;
    }
    
    
    // Methods for field "item7_25"
    public DOffset getItem7_25()
    {
	return this.item7_25;
    }
    
    public void setItem7_25(DOffset item7_25)
    {
	this.item7_25 = item7_25;
    }
    
    public boolean hasItem7_25()
    {
	return (item7_25 != null);
    }
    
    public void deleteItem7_25()
    {
	item7_25 = null;
    }
    
    
    // Methods for field "item7_26"
    public DrivenLineOffset getItem7_26()
    {
	return this.item7_26;
    }
    
    public void setItem7_26(DrivenLineOffset item7_26)
    {
	this.item7_26 = item7_26;
    }
    
    public boolean hasItem7_26()
    {
	return (item7_26 != null);
    }
    
    public void deleteItem7_26()
    {
	item7_26 = null;
    }
    
    
    // Methods for field "item7_27"
    public DrivingWheelAngle getItem7_27()
    {
	return this.item7_27;
    }
    
    public void setItem7_27(DrivingWheelAngle item7_27)
    {
	this.item7_27 = item7_27;
    }
    
    public boolean hasItem7_27()
    {
	return (item7_27 != null);
    }
    
    public void deleteItem7_27()
    {
	item7_27 = null;
    }
    
    
    // Methods for field "item7_28"
    public DSecond getItem7_28()
    {
	return this.item7_28;
    }
    
    public void setItem7_28(DSecond item7_28)
    {
	this.item7_28 = item7_28;
    }
    
    public boolean hasItem7_28()
    {
	return (item7_28 != null);
    }
    
    public void deleteItem7_28()
    {
	item7_28 = null;
    }
    
    
    // Methods for field "item7_29"
    public DSignalSeconds getItem7_29()
    {
	return this.item7_29;
    }
    
    public void setItem7_29(DSignalSeconds item7_29)
    {
	this.item7_29 = item7_29;
    }
    
    public boolean hasItem7_29()
    {
	return (item7_29 != null);
    }
    
    public void deleteItem7_29()
    {
	item7_29 = null;
    }
    
    
    // Methods for field "item7_30"
    public DSRCmsgID getItem7_30()
    {
	return this.item7_30;
    }
    
    public void setItem7_30(DSRCmsgID item7_30)
    {
	this.item7_30 = item7_30;
    }
    
    public boolean hasItem7_30()
    {
	return (item7_30 != null);
    }
    
    public void deleteItem7_30()
    {
	item7_30 = null;
    }
    
    
    // Methods for field "item7_31"
    public DYear getItem7_31()
    {
	return this.item7_31;
    }
    
    public void setItem7_31(DYear item7_31)
    {
	this.item7_31 = item7_31;
    }
    
    public boolean hasItem7_31()
    {
	return (item7_31 != null);
    }
    
    public void deleteItem7_31()
    {
	item7_31 = null;
    }
    
    
    // Methods for field "item7_32"
    public ElevationConfidence getItem7_32()
    {
	return this.item7_32;
    }
    
    public void setItem7_32(ElevationConfidence item7_32)
    {
	this.item7_32 = item7_32;
    }
    
    public boolean hasItem7_32()
    {
	return (item7_32 != null);
    }
    
    public void deleteItem7_32()
    {
	item7_32 = null;
    }
    
    
    // Methods for field "item7_33"
    public Elevation getItem7_33()
    {
	return this.item7_33;
    }
    
    public void setItem7_33(Elevation item7_33)
    {
	this.item7_33 = item7_33;
    }
    
    public boolean hasItem7_33()
    {
	return (item7_33 != null);
    }
    
    public void deleteItem7_33()
    {
	item7_33 = null;
    }
    
    
    // Methods for field "item7_34"
    public EmergencyDetails getItem7_34()
    {
	return this.item7_34;
    }
    
    public void setItem7_34(EmergencyDetails item7_34)
    {
	this.item7_34 = item7_34;
    }
    
    public boolean hasItem7_34()
    {
	return (item7_34 != null);
    }
    
    public void deleteItem7_34()
    {
	item7_34 = null;
    }
    
    
    // Methods for field "item7_35"
    public EventFlags getItem7_35()
    {
	return this.item7_35;
    }
    
    public void setItem7_35(EventFlags item7_35)
    {
	this.item7_35 = item7_35;
    }
    
    public boolean hasItem7_35()
    {
	return (item7_35 != null);
    }
    
    public void deleteItem7_35()
    {
	item7_35 = null;
    }
    
    
    // Methods for field "item7_36"
    public Extent getItem7_36()
    {
	return this.item7_36;
    }
    
    public void setItem7_36(Extent item7_36)
    {
	this.item7_36 = item7_36;
    }
    
    public boolean hasItem7_36()
    {
	return (item7_36 != null);
    }
    
    public void deleteItem7_36()
    {
	item7_36 = null;
    }
    
    
    // Methods for field "item7_37"
    public ExteriorLights getItem7_37()
    {
	return this.item7_37;
    }
    
    public void setItem7_37(ExteriorLights item7_37)
    {
	this.item7_37 = item7_37;
    }
    
    public boolean hasItem7_37()
    {
	return (item7_37 != null);
    }
    
    public void deleteItem7_37()
    {
	item7_37 = null;
    }
    
    
    // Methods for field "item7_38"
    public FurtherInfoID getItem7_38()
    {
	return this.item7_38;
    }
    
    public void setItem7_38(FurtherInfoID item7_38)
    {
	this.item7_38 = item7_38;
    }
    
    public boolean hasItem7_38()
    {
	return (item7_38 != null);
    }
    
    public void deleteItem7_38()
    {
	item7_38 = null;
    }
    
    
    // Methods for field "item7_39"
    public GPSstatus getItem7_39()
    {
	return this.item7_39;
    }
    
    public void setItem7_39(GPSstatus item7_39)
    {
	this.item7_39 = item7_39;
    }
    
    public boolean hasItem7_39()
    {
	return (item7_39 != null);
    }
    
    public void deleteItem7_39()
    {
	item7_39 = null;
    }
    
    
    // Methods for field "item7_40"
    public HeadingConfidence getItem7_40()
    {
	return this.item7_40;
    }
    
    public void setItem7_40(HeadingConfidence item7_40)
    {
	this.item7_40 = item7_40;
    }
    
    public boolean hasItem7_40()
    {
	return (item7_40 != null);
    }
    
    public void deleteItem7_40()
    {
	item7_40 = null;
    }
    
    
    // Methods for field "item7_41"
    public Heading getItem7_41()
    {
	return this.item7_41;
    }
    
    public void setItem7_41(Heading item7_41)
    {
	this.item7_41 = item7_41;
    }
    
    public boolean hasItem7_41()
    {
	return (item7_41 != null);
    }
    
    public void deleteItem7_41()
    {
	item7_41 = null;
    }
    
    
    // Methods for field "item7_42"
    public HeadingSlice getItem7_42()
    {
	return this.item7_42;
    }
    
    public void setItem7_42(HeadingSlice item7_42)
    {
	this.item7_42 = item7_42;
    }
    
    public boolean hasItem7_42()
    {
	return (item7_42 != null);
    }
    
    public void deleteItem7_42()
    {
	item7_42 = null;
    }
    
    
    // Methods for field "item7_43"
    public IntersectionStatusObject getItem7_43()
    {
	return this.item7_43;
    }
    
    public void setItem7_43(IntersectionStatusObject item7_43)
    {
	this.item7_43 = item7_43;
    }
    
    public boolean hasItem7_43()
    {
	return (item7_43 != null);
    }
    
    public void deleteItem7_43()
    {
	item7_43 = null;
    }
    
    
    // Methods for field "item7_44"
    public IntersectionID getItem7_44()
    {
	return this.item7_44;
    }
    
    public void setItem7_44(IntersectionID item7_44)
    {
	this.item7_44 = item7_44;
    }
    
    public boolean hasItem7_44()
    {
	return (item7_44 != null);
    }
    
    public void deleteItem7_44()
    {
	item7_44 = null;
    }
    
    
    // Methods for field "item7_45"
    public AxleLocation getItem7_45()
    {
	return this.item7_45;
    }
    
    public void setItem7_45(AxleLocation item7_45)
    {
	this.item7_45 = item7_45;
    }
    
    public boolean hasItem7_45()
    {
	return (item7_45 != null);
    }
    
    public void deleteItem7_45()
    {
	item7_45 = null;
    }
    
    
    // Methods for field "item7_46"
    public AxleWeight getItem7_46()
    {
	return this.item7_46;
    }
    
    public void setItem7_46(AxleWeight item7_46)
    {
	this.item7_46 = item7_46;
    }
    
    public boolean hasItem7_46()
    {
	return (item7_46 != null);
    }
    
    public void deleteItem7_46()
    {
	item7_46 = null;
    }
    
    
    // Methods for field "item7_47"
    public CargoWeight getItem7_47()
    {
	return this.item7_47;
    }
    
    public void setItem7_47(CargoWeight item7_47)
    {
	this.item7_47 = item7_47;
    }
    
    public boolean hasItem7_47()
    {
	return (item7_47 != null);
    }
    
    public void deleteItem7_47()
    {
	item7_47 = null;
    }
    
    
    // Methods for field "item7_48"
    public DriveAxleLiftAirPressure getItem7_48()
    {
	return this.item7_48;
    }
    
    public void setItem7_48(DriveAxleLiftAirPressure item7_48)
    {
	this.item7_48 = item7_48;
    }
    
    public boolean hasItem7_48()
    {
	return (item7_48 != null);
    }
    
    public void deleteItem7_48()
    {
	item7_48 = null;
    }
    
    
    // Methods for field "item7_49"
    public DriveAxleLocation getItem7_49()
    {
	return this.item7_49;
    }
    
    public void setItem7_49(DriveAxleLocation item7_49)
    {
	this.item7_49 = item7_49;
    }
    
    public boolean hasItem7_49()
    {
	return (item7_49 != null);
    }
    
    public void deleteItem7_49()
    {
	item7_49 = null;
    }
    
    
    // Methods for field "item7_50"
    public DriveAxleLubePressure getItem7_50()
    {
	return this.item7_50;
    }
    
    public void setItem7_50(DriveAxleLubePressure item7_50)
    {
	this.item7_50 = item7_50;
    }
    
    public boolean hasItem7_50()
    {
	return (item7_50 != null);
    }
    
    public void deleteItem7_50()
    {
	item7_50 = null;
    }
    
    
    // Methods for field "item7_51"
    public DriveAxleTemperature getItem7_51()
    {
	return this.item7_51;
    }
    
    public void setItem7_51(DriveAxleTemperature item7_51)
    {
	this.item7_51 = item7_51;
    }
    
    public boolean hasItem7_51()
    {
	return (item7_51 != null);
    }
    
    public void deleteItem7_51()
    {
	item7_51 = null;
    }
    
    
    // Methods for field "item7_52"
    public SteeringAxleLubePressure getItem7_52()
    {
	return this.item7_52;
    }
    
    public void setItem7_52(SteeringAxleLubePressure item7_52)
    {
	this.item7_52 = item7_52;
    }
    
    public boolean hasItem7_52()
    {
	return (item7_52 != null);
    }
    
    public void deleteItem7_52()
    {
	item7_52 = null;
    }
    
    
    // Methods for field "item7_53"
    public SteeringAxleTemperature getItem7_53()
    {
	return this.item7_53;
    }
    
    public void setItem7_53(SteeringAxleTemperature item7_53)
    {
	this.item7_53 = item7_53;
    }
    
    public boolean hasItem7_53()
    {
	return (item7_53 != null);
    }
    
    public void deleteItem7_53()
    {
	item7_53 = null;
    }
    
    
    // Methods for field "item7_54"
    public TireLeakageRate getItem7_54()
    {
	return this.item7_54;
    }
    
    public void setItem7_54(TireLeakageRate item7_54)
    {
	this.item7_54 = item7_54;
    }
    
    public boolean hasItem7_54()
    {
	return (item7_54 != null);
    }
    
    public void deleteItem7_54()
    {
	item7_54 = null;
    }
    
    
    // Methods for field "item7_55"
    public TireLocation getItem7_55()
    {
	return this.item7_55;
    }
    
    public void setItem7_55(TireLocation item7_55)
    {
	this.item7_55 = item7_55;
    }
    
    public boolean hasItem7_55()
    {
	return (item7_55 != null);
    }
    
    public void deleteItem7_55()
    {
	item7_55 = null;
    }
    
    
    // Methods for field "item7_56"
    public TirePressureThresholdDetection getItem7_56()
    {
	return this.item7_56;
    }
    
    public void setItem7_56(TirePressureThresholdDetection item7_56)
    {
	this.item7_56 = item7_56;
    }
    
    public boolean hasItem7_56()
    {
	return (item7_56 != null);
    }
    
    public void deleteItem7_56()
    {
	item7_56 = null;
    }
    
    
    // Methods for field "item7_57"
    public TirePressure getItem7_57()
    {
	return this.item7_57;
    }
    
    public void setItem7_57(TirePressure item7_57)
    {
	this.item7_57 = item7_57;
    }
    
    public boolean hasItem7_57()
    {
	return (item7_57 != null);
    }
    
    public void deleteItem7_57()
    {
	item7_57 = null;
    }
    
    
    // Methods for field "item7_58"
    public TireTemp getItem7_58()
    {
	return this.item7_58;
    }
    
    public void setItem7_58(TireTemp item7_58)
    {
	this.item7_58 = item7_58;
    }
    
    public boolean hasItem7_58()
    {
	return (item7_58 != null);
    }
    
    public void deleteItem7_58()
    {
	item7_58 = null;
    }
    
    
    // Methods for field "item7_59"
    public TrailerWeight getItem7_59()
    {
	return this.item7_59;
    }
    
    public void setItem7_59(TrailerWeight item7_59)
    {
	this.item7_59 = item7_59;
    }
    
    public boolean hasItem7_59()
    {
	return (item7_59 != null);
    }
    
    public void deleteItem7_59()
    {
	item7_59 = null;
    }
    
    
    // Methods for field "item7_60"
    public WheelEndElectFault getItem7_60()
    {
	return this.item7_60;
    }
    
    public void setItem7_60(WheelEndElectFault item7_60)
    {
	this.item7_60 = item7_60;
    }
    
    public boolean hasItem7_60()
    {
	return (item7_60 != null);
    }
    
    public void deleteItem7_60()
    {
	item7_60 = null;
    }
    
    
    // Methods for field "item7_61"
    public WheelSensorStatus getItem7_61()
    {
	return this.item7_61;
    }
    
    public void setItem7_61(WheelSensorStatus item7_61)
    {
	this.item7_61 = item7_61;
    }
    
    public boolean hasItem7_61()
    {
	return (item7_61 != null);
    }
    
    public void deleteItem7_61()
    {
	item7_61 = null;
    }
    
    
    // Methods for field "item7_62"
    public LaneCount getItem7_62()
    {
	return this.item7_62;
    }
    
    public void setItem7_62(LaneCount item7_62)
    {
	this.item7_62 = item7_62;
    }
    
    public boolean hasItem7_62()
    {
	return (item7_62 != null);
    }
    
    public void deleteItem7_62()
    {
	item7_62 = null;
    }
    
    
    // Methods for field "item7_63"
    public LaneManeuverCode getItem7_63()
    {
	return this.item7_63;
    }
    
    public void setItem7_63(LaneManeuverCode item7_63)
    {
	this.item7_63 = item7_63;
    }
    
    public boolean hasItem7_63()
    {
	return (item7_63 != null);
    }
    
    public void deleteItem7_63()
    {
	item7_63 = null;
    }
    
    
    // Methods for field "item7_64"
    public LaneNumber getItem7_64()
    {
	return this.item7_64;
    }
    
    public void setItem7_64(LaneNumber item7_64)
    {
	this.item7_64 = item7_64;
    }
    
    public boolean hasItem7_64()
    {
	return (item7_64 != null);
    }
    
    public void deleteItem7_64()
    {
	item7_64 = null;
    }
    
    
    // Methods for field "item7_65"
    public LaneSet getItem7_65()
    {
	return this.item7_65;
    }
    
    public void setItem7_65(LaneSet item7_65)
    {
	this.item7_65 = item7_65;
    }
    
    public boolean hasItem7_65()
    {
	return (item7_65 != null);
    }
    
    public void deleteItem7_65()
    {
	item7_65 = null;
    }
    
    
    // Methods for field "item7_66"
    public LaneWidth getItem7_66()
    {
	return this.item7_66;
    }
    
    public void setItem7_66(LaneWidth item7_66)
    {
	this.item7_66 = item7_66;
    }
    
    public boolean hasItem7_66()
    {
	return (item7_66 != null);
    }
    
    public void deleteItem7_66()
    {
	item7_66 = null;
    }
    
    
    // Methods for field "item7_67"
    public Latitude getItem7_67()
    {
	return this.item7_67;
    }
    
    public void setItem7_67(Latitude item7_67)
    {
	this.item7_67 = item7_67;
    }
    
    public boolean hasItem7_67()
    {
	return (item7_67 != null);
    }
    
    public void deleteItem7_67()
    {
	item7_67 = null;
    }
    
    
    // Methods for field "item7_68"
    public LayerID getItem7_68()
    {
	return this.item7_68;
    }
    
    public void setItem7_68(LayerID item7_68)
    {
	this.item7_68 = item7_68;
    }
    
    public boolean hasItem7_68()
    {
	return (item7_68 != null);
    }
    
    public void deleteItem7_68()
    {
	item7_68 = null;
    }
    
    
    // Methods for field "item7_69"
    public LayerType getItem7_69()
    {
	return this.item7_69;
    }
    
    public void setItem7_69(LayerType item7_69)
    {
	this.item7_69 = item7_69;
    }
    
    public boolean hasItem7_69()
    {
	return (item7_69 != null);
    }
    
    public void deleteItem7_69()
    {
	item7_69 = null;
    }
    
    
    // Methods for field "item7_70"
    public LightbarInUse getItem7_70()
    {
	return this.item7_70;
    }
    
    public void setItem7_70(LightbarInUse item7_70)
    {
	this.item7_70 = item7_70;
    }
    
    public boolean hasItem7_70()
    {
	return (item7_70 != null);
    }
    
    public void deleteItem7_70()
    {
	item7_70 = null;
    }
    
    
    // Methods for field "item7_71"
    public Longitude getItem7_71()
    {
	return this.item7_71;
    }
    
    public void setItem7_71(Longitude item7_71)
    {
	this.item7_71 = item7_71;
    }
    
    public boolean hasItem7_71()
    {
	return (item7_71 != null);
    }
    
    public void deleteItem7_71()
    {
	item7_71 = null;
    }
    
    
    // Methods for field "item7_72"
    public Location_quality getItem7_72()
    {
	return this.item7_72;
    }
    
    public void setItem7_72(Location_quality item7_72)
    {
	this.item7_72 = item7_72;
    }
    
    public boolean hasItem7_72()
    {
	return (item7_72 != null);
    }
    
    public void deleteItem7_72()
    {
	item7_72 = null;
    }
    
    
    // Methods for field "item7_73"
    public Location_tech getItem7_73()
    {
	return this.item7_73;
    }
    
    public void setItem7_73(Location_tech item7_73)
    {
	this.item7_73 = item7_73;
    }
    
    public boolean hasItem7_73()
    {
	return (item7_73 != null);
    }
    
    public void deleteItem7_73()
    {
	item7_73 = null;
    }
    
    
    // Methods for field "item7_74"
    public MinuteOfTheYear getItem7_74()
    {
	return this.item7_74;
    }
    
    public void setItem7_74(MinuteOfTheYear item7_74)
    {
	this.item7_74 = item7_74;
    }
    
    public boolean hasItem7_74()
    {
	return (item7_74 != null);
    }
    
    public void deleteItem7_74()
    {
	item7_74 = null;
    }
    
    
    // Methods for field "item7_75"
    public MinutesDuration getItem7_75()
    {
	return this.item7_75;
    }
    
    public void setItem7_75(MinutesDuration item7_75)
    {
	this.item7_75 = item7_75;
    }
    
    public boolean hasItem7_75()
    {
	return (item7_75 != null);
    }
    
    public void deleteItem7_75()
    {
	item7_75 = null;
    }
    
    
    // Methods for field "item7_76"
    public MsgCount getItem7_76()
    {
	return this.item7_76;
    }
    
    public void setItem7_76(MsgCount item7_76)
    {
	this.item7_76 = item7_76;
    }
    
    public boolean hasItem7_76()
    {
	return (item7_76 != null);
    }
    
    public void deleteItem7_76()
    {
	item7_76 = null;
    }
    
    
    // Methods for field "item7_77"
    public MsgCRC getItem7_77()
    {
	return this.item7_77;
    }
    
    public void setItem7_77(MsgCRC item7_77)
    {
	this.item7_77 = item7_77;
    }
    
    public boolean hasItem7_77()
    {
	return (item7_77 != null);
    }
    
    public void deleteItem7_77()
    {
	item7_77 = null;
    }
    
    
    // Methods for field "item7_78"
    public MultiVehicleResponse getItem7_78()
    {
	return this.item7_78;
    }
    
    public void setItem7_78(MultiVehicleResponse item7_78)
    {
	this.item7_78 = item7_78;
    }
    
    public boolean hasItem7_78()
    {
	return (item7_78 != null);
    }
    
    public void deleteItem7_78()
    {
	item7_78 = null;
    }
    
    
    // Methods for field "item7_79"
    public MUTCDCode getItem7_79()
    {
	return this.item7_79;
    }
    
    public void setItem7_79(MUTCDCode item7_79)
    {
	this.item7_79 = item7_79;
    }
    
    public boolean hasItem7_79()
    {
	return (item7_79 != null);
    }
    
    public void deleteItem7_79()
    {
	item7_79 = null;
    }
    
    
    // Methods for field "item7_80"
    public NMEA_MsgType getItem7_80()
    {
	return this.item7_80;
    }
    
    public void setItem7_80(NMEA_MsgType item7_80)
    {
	this.item7_80 = item7_80;
    }
    
    public boolean hasItem7_80()
    {
	return (item7_80 != null);
    }
    
    public void deleteItem7_80()
    {
	item7_80 = null;
    }
    
    
    // Methods for field "item7_81"
    public NMEA_Payload getItem7_81()
    {
	return this.item7_81;
    }
    
    public void setItem7_81(NMEA_Payload item7_81)
    {
	this.item7_81 = item7_81;
    }
    
    public boolean hasItem7_81()
    {
	return (item7_81 != null);
    }
    
    public void deleteItem7_81()
    {
	item7_81 = null;
    }
    
    
    // Methods for field "item7_82"
    public NMEA_Revision getItem7_82()
    {
	return this.item7_82;
    }
    
    public void setItem7_82(NMEA_Revision item7_82)
    {
	this.item7_82 = item7_82;
    }
    
    public boolean hasItem7_82()
    {
	return (item7_82 != null);
    }
    
    public void deleteItem7_82()
    {
	item7_82 = null;
    }
    
    
    // Methods for field "item7_83"
    public NTCIPVehicleclass getItem7_83()
    {
	return this.item7_83;
    }
    
    public void setItem7_83(NTCIPVehicleclass item7_83)
    {
	this.item7_83 = item7_83;
    }
    
    public boolean hasItem7_83()
    {
	return (item7_83 != null);
    }
    
    public void deleteItem7_83()
    {
	item7_83 = null;
    }
    
    
    // Methods for field "item7_84"
    public ObjectCount getItem7_84()
    {
	return this.item7_84;
    }
    
    public void setItem7_84(ObjectCount item7_84)
    {
	this.item7_84 = item7_84;
    }
    
    public boolean hasItem7_84()
    {
	return (item7_84 != null);
    }
    
    public void deleteItem7_84()
    {
	item7_84 = null;
    }
    
    
    // Methods for field "item7_85"
    public ObstacleDirection getItem7_85()
    {
	return this.item7_85;
    }
    
    public void setItem7_85(ObstacleDirection item7_85)
    {
	this.item7_85 = item7_85;
    }
    
    public boolean hasItem7_85()
    {
	return (item7_85 != null);
    }
    
    public void deleteItem7_85()
    {
	item7_85 = null;
    }
    
    
    // Methods for field "item7_86"
    public ObstacleDistance getItem7_86()
    {
	return this.item7_86;
    }
    
    public void setItem7_86(ObstacleDistance item7_86)
    {
	this.item7_86 = item7_86;
    }
    
    public boolean hasItem7_86()
    {
	return (item7_86 != null);
    }
    
    public void deleteItem7_86()
    {
	item7_86 = null;
    }
    
    
    // Methods for field "item7_87"
    public PayloadData getItem7_87()
    {
	return this.item7_87;
    }
    
    public void setItem7_87(PayloadData item7_87)
    {
	this.item7_87 = item7_87;
    }
    
    public boolean hasItem7_87()
    {
	return (item7_87 != null);
    }
    
    public void deleteItem7_87()
    {
	item7_87 = null;
    }
    
    
    // Methods for field "item7_88"
    public Payload getItem7_88()
    {
	return this.item7_88;
    }
    
    public void setItem7_88(Payload item7_88)
    {
	this.item7_88 = item7_88;
    }
    
    public boolean hasItem7_88()
    {
	return (item7_88 != null);
    }
    
    public void deleteItem7_88()
    {
	item7_88 = null;
    }
    
    
    // Methods for field "item7_89"
    public PedestrianDetect getItem7_89()
    {
	return this.item7_89;
    }
    
    public void setItem7_89(PedestrianDetect item7_89)
    {
	this.item7_89 = item7_89;
    }
    
    public boolean hasItem7_89()
    {
	return (item7_89 != null);
    }
    
    public void deleteItem7_89()
    {
	item7_89 = null;
    }
    
    
    // Methods for field "item7_90"
    public PedestrianSignalState getItem7_90()
    {
	return this.item7_90;
    }
    
    public void setItem7_90(PedestrianSignalState item7_90)
    {
	this.item7_90 = item7_90;
    }
    
    public boolean hasItem7_90()
    {
	return (item7_90 != null);
    }
    
    public void deleteItem7_90()
    {
	item7_90 = null;
    }
    
    
    // Methods for field "item7_91"
    public PositionConfidence getItem7_91()
    {
	return this.item7_91;
    }
    
    public void setItem7_91(PositionConfidence item7_91)
    {
	this.item7_91 = item7_91;
    }
    
    public boolean hasItem7_91()
    {
	return (item7_91 != null);
    }
    
    public void deleteItem7_91()
    {
	item7_91 = null;
    }
    
    
    // Methods for field "item7_92"
    public PreemptState getItem7_92()
    {
	return this.item7_92;
    }
    
    public void setItem7_92(PreemptState item7_92)
    {
	this.item7_92 = item7_92;
    }
    
    public boolean hasItem7_92()
    {
	return (item7_92 != null);
    }
    
    public void deleteItem7_92()
    {
	item7_92 = null;
    }
    
    
    // Methods for field "item7_93"
    public Priority getItem7_93()
    {
	return this.item7_93;
    }
    
    public void setItem7_93(Priority item7_93)
    {
	this.item7_93 = item7_93;
    }
    
    public boolean hasItem7_93()
    {
	return (item7_93 != null);
    }
    
    public void deleteItem7_93()
    {
	item7_93 = null;
    }
    
    
    // Methods for field "item7_94"
    public PriorityState getItem7_94()
    {
	return this.item7_94;
    }
    
    public void setItem7_94(PriorityState item7_94)
    {
	this.item7_94 = item7_94;
    }
    
    public boolean hasItem7_94()
    {
	return (item7_94 != null);
    }
    
    public void deleteItem7_94()
    {
	item7_94 = null;
    }
    
    
    // Methods for field "item7_95"
    public ProbeSegmentNumber getItem7_95()
    {
	return this.item7_95;
    }
    
    public void setItem7_95(ProbeSegmentNumber item7_95)
    {
	this.item7_95 = item7_95;
    }
    
    public boolean hasItem7_95()
    {
	return (item7_95 != null);
    }
    
    public void deleteItem7_95()
    {
	item7_95 = null;
    }
    
    
    // Methods for field "item7_96"
    public RainSensor getItem7_96()
    {
	return this.item7_96;
    }
    
    public void setItem7_96(RainSensor item7_96)
    {
	this.item7_96 = item7_96;
    }
    
    public boolean hasItem7_96()
    {
	return (item7_96 != null);
    }
    
    public void deleteItem7_96()
    {
	item7_96 = null;
    }
    
    
    // Methods for field "item7_97"
    public RequestedItem getItem7_97()
    {
	return this.item7_97;
    }
    
    public void setItem7_97(RequestedItem item7_97)
    {
	this.item7_97 = item7_97;
    }
    
    public boolean hasItem7_97()
    {
	return (item7_97 != null);
    }
    
    public void deleteItem7_97()
    {
	item7_97 = null;
    }
    
    
    // Methods for field "item7_98"
    public ResponseType getItem7_98()
    {
	return this.item7_98;
    }
    
    public void setItem7_98(ResponseType item7_98)
    {
	this.item7_98 = item7_98;
    }
    
    public boolean hasItem7_98()
    {
	return (item7_98 != null);
    }
    
    public void deleteItem7_98()
    {
	item7_98 = null;
    }
    
    
    // Methods for field "item7_99"
    public RTCM_ID getItem7_99()
    {
	return this.item7_99;
    }
    
    public void setItem7_99(RTCM_ID item7_99)
    {
	this.item7_99 = item7_99;
    }
    
    public boolean hasItem7_99()
    {
	return (item7_99 != null);
    }
    
    public void deleteItem7_99()
    {
	item7_99 = null;
    }
    
    
    // Methods for field "item7_100"
    public RTCM_Payload getItem7_100()
    {
	return this.item7_100;
    }
    
    public void setItem7_100(RTCM_Payload item7_100)
    {
	this.item7_100 = item7_100;
    }
    
    public boolean hasItem7_100()
    {
	return (item7_100 != null);
    }
    
    public void deleteItem7_100()
    {
	item7_100 = null;
    }
    
    
    // Methods for field "item7_101"
    public RTCM_Revision getItem7_101()
    {
	return this.item7_101;
    }
    
    public void setItem7_101(RTCM_Revision item7_101)
    {
	this.item7_101 = item7_101;
    }
    
    public boolean hasItem7_101()
    {
	return (item7_101 != null);
    }
    
    public void deleteItem7_101()
    {
	item7_101 = null;
    }
    
    
    // Methods for field "item7_102"
    public SignalLightState getItem7_102()
    {
	return this.item7_102;
    }
    
    public void setItem7_102(SignalLightState item7_102)
    {
	this.item7_102 = item7_102;
    }
    
    public boolean hasItem7_102()
    {
	return (item7_102 != null);
    }
    
    public void deleteItem7_102()
    {
	item7_102 = null;
    }
    
    
    // Methods for field "item7_103"
    public SignalReqScheme getItem7_103()
    {
	return this.item7_103;
    }
    
    public void setItem7_103(SignalReqScheme item7_103)
    {
	this.item7_103 = item7_103;
    }
    
    public boolean hasItem7_103()
    {
	return (item7_103 != null);
    }
    
    public void deleteItem7_103()
    {
	item7_103 = null;
    }
    
    
    // Methods for field "item7_104"
    public SignalState getItem7_104()
    {
	return this.item7_104;
    }
    
    public void setItem7_104(SignalState item7_104)
    {
	this.item7_104 = item7_104;
    }
    
    public boolean hasItem7_104()
    {
	return (item7_104 != null);
    }
    
    public void deleteItem7_104()
    {
	item7_104 = null;
    }
    
    
    // Methods for field "item7_105"
    public SignPrority getItem7_105()
    {
	return this.item7_105;
    }
    
    public void setItem7_105(SignPrority item7_105)
    {
	this.item7_105 = item7_105;
    }
    
    public boolean hasItem7_105()
    {
	return (item7_105 != null);
    }
    
    public void deleteItem7_105()
    {
	item7_105 = null;
    }
    
    
    // Methods for field "item7_106"
    public SirenInUse getItem7_106()
    {
	return this.item7_106;
    }
    
    public void setItem7_106(SirenInUse item7_106)
    {
	this.item7_106 = item7_106;
    }
    
    public boolean hasItem7_106()
    {
	return (item7_106 != null);
    }
    
    public void deleteItem7_106()
    {
	item7_106 = null;
    }
    
    
    // Methods for field "item7_107"
    public SpecialLaneAttributes getItem7_107()
    {
	return this.item7_107;
    }
    
    public void setItem7_107(SpecialLaneAttributes item7_107)
    {
	this.item7_107 = item7_107;
    }
    
    public boolean hasItem7_107()
    {
	return (item7_107 != null);
    }
    
    public void deleteItem7_107()
    {
	item7_107 = null;
    }
    
    
    // Methods for field "item7_108"
    public SpecialSignalState getItem7_108()
    {
	return this.item7_108;
    }
    
    public void setItem7_108(SpecialSignalState item7_108)
    {
	this.item7_108 = item7_108;
    }
    
    public boolean hasItem7_108()
    {
	return (item7_108 != null);
    }
    
    public void deleteItem7_108()
    {
	item7_108 = null;
    }
    
    
    // Methods for field "item7_109"
    public SpeedConfidence getItem7_109()
    {
	return this.item7_109;
    }
    
    public void setItem7_109(SpeedConfidence item7_109)
    {
	this.item7_109 = item7_109;
    }
    
    public boolean hasItem7_109()
    {
	return (item7_109 != null);
    }
    
    public void deleteItem7_109()
    {
	item7_109 = null;
    }
    
    
    // Methods for field "item7_110"
    public Speed getItem7_110()
    {
	return this.item7_110;
    }
    
    public void setItem7_110(Speed item7_110)
    {
	this.item7_110 = item7_110;
    }
    
    public boolean hasItem7_110()
    {
	return (item7_110 != null);
    }
    
    public void deleteItem7_110()
    {
	item7_110 = null;
    }
    
    
    // Methods for field "item7_111"
    public StabilityControlStatus getItem7_111()
    {
	return this.item7_111;
    }
    
    public void setItem7_111(StabilityControlStatus item7_111)
    {
	this.item7_111 = item7_111;
    }
    
    public boolean hasItem7_111()
    {
	return (item7_111 != null);
    }
    
    public void deleteItem7_111()
    {
	item7_111 = null;
    }
    
    
    // Methods for field "item7_112"
    public StateConfidence getItem7_112()
    {
	return this.item7_112;
    }
    
    public void setItem7_112(StateConfidence item7_112)
    {
	this.item7_112 = item7_112;
    }
    
    public boolean hasItem7_112()
    {
	return (item7_112 != null);
    }
    
    public void deleteItem7_112()
    {
	item7_112 = null;
    }
    
    
    // Methods for field "item7_113"
    public SteeringWheelAngleConfidence getItem7_113()
    {
	return this.item7_113;
    }
    
    public void setItem7_113(SteeringWheelAngleConfidence item7_113)
    {
	this.item7_113 = item7_113;
    }
    
    public boolean hasItem7_113()
    {
	return (item7_113 != null);
    }
    
    public void deleteItem7_113()
    {
	item7_113 = null;
    }
    
    
    // Methods for field "item7_114"
    public SteeringWheelAngleRateOfChange getItem7_114()
    {
	return this.item7_114;
    }
    
    public void setItem7_114(SteeringWheelAngleRateOfChange item7_114)
    {
	this.item7_114 = item7_114;
    }
    
    public boolean hasItem7_114()
    {
	return (item7_114 != null);
    }
    
    public void deleteItem7_114()
    {
	item7_114 = null;
    }
    
    
    // Methods for field "item7_115"
    public SteeringWheelAngle getItem7_115()
    {
	return this.item7_115;
    }
    
    public void setItem7_115(SteeringWheelAngle item7_115)
    {
	this.item7_115 = item7_115;
    }
    
    public boolean hasItem7_115()
    {
	return (item7_115 != null);
    }
    
    public void deleteItem7_115()
    {
	item7_115 = null;
    }
    
    
    // Methods for field "item7_116"
    public SunSensor getItem7_116()
    {
	return this.item7_116;
    }
    
    public void setItem7_116(SunSensor item7_116)
    {
	this.item7_116 = item7_116;
    }
    
    public boolean hasItem7_116()
    {
	return (item7_116 != null);
    }
    
    public void deleteItem7_116()
    {
	item7_116 = null;
    }
    
    
    // Methods for field "item7_117"
    public TemporaryID getItem7_117()
    {
	return this.item7_117;
    }
    
    public void setItem7_117(TemporaryID item7_117)
    {
	this.item7_117 = item7_117;
    }
    
    public boolean hasItem7_117()
    {
	return (item7_117 != null);
    }
    
    public void deleteItem7_117()
    {
	item7_117 = null;
    }
    
    
    // Methods for field "item7_118"
    public TermDistance getItem7_118()
    {
	return this.item7_118;
    }
    
    public void setItem7_118(TermDistance item7_118)
    {
	this.item7_118 = item7_118;
    }
    
    public boolean hasItem7_118()
    {
	return (item7_118 != null);
    }
    
    public void deleteItem7_118()
    {
	item7_118 = null;
    }
    
    
    // Methods for field "item7_119"
    public TermTime getItem7_119()
    {
	return this.item7_119;
    }
    
    public void setItem7_119(TermTime item7_119)
    {
	this.item7_119 = item7_119;
    }
    
    public boolean hasItem7_119()
    {
	return (item7_119 != null);
    }
    
    public void deleteItem7_119()
    {
	item7_119 = null;
    }
    
    
    // Methods for field "item7_120"
    public ThrottleConfidence getItem7_120()
    {
	return this.item7_120;
    }
    
    public void setItem7_120(ThrottleConfidence item7_120)
    {
	this.item7_120 = item7_120;
    }
    
    public boolean hasItem7_120()
    {
	return (item7_120 != null);
    }
    
    public void deleteItem7_120()
    {
	item7_120 = null;
    }
    
    
    // Methods for field "item7_121"
    public ThrottlePosition getItem7_121()
    {
	return this.item7_121;
    }
    
    public void setItem7_121(ThrottlePosition item7_121)
    {
	this.item7_121 = item7_121;
    }
    
    public boolean hasItem7_121()
    {
	return (item7_121 != null);
    }
    
    public void deleteItem7_121()
    {
	item7_121 = null;
    }
    
    
    // Methods for field "item7_122"
    public TimeConfidence getItem7_122()
    {
	return this.item7_122;
    }
    
    public void setItem7_122(TimeConfidence item7_122)
    {
	this.item7_122 = item7_122;
    }
    
    public boolean hasItem7_122()
    {
	return (item7_122 != null);
    }
    
    public void deleteItem7_122()
    {
	item7_122 = null;
    }
    
    
    // Methods for field "item7_123"
    public TimeMark getItem7_123()
    {
	return this.item7_123;
    }
    
    public void setItem7_123(TimeMark item7_123)
    {
	this.item7_123 = item7_123;
    }
    
    public boolean hasItem7_123()
    {
	return (item7_123 != null);
    }
    
    public void deleteItem7_123()
    {
	item7_123 = null;
    }
    
    
    // Methods for field "item7_124"
    public TractionControlState getItem7_124()
    {
	return this.item7_124;
    }
    
    public void setItem7_124(TractionControlState item7_124)
    {
	this.item7_124 = item7_124;
    }
    
    public boolean hasItem7_124()
    {
	return (item7_124 != null);
    }
    
    public void deleteItem7_124()
    {
	item7_124 = null;
    }
    
    
    // Methods for field "item7_125"
    public TransitPreEmptionRequest getItem7_125()
    {
	return this.item7_125;
    }
    
    public void setItem7_125(TransitPreEmptionRequest item7_125)
    {
	this.item7_125 = item7_125;
    }
    
    public boolean hasItem7_125()
    {
	return (item7_125 != null);
    }
    
    public void deleteItem7_125()
    {
	item7_125 = null;
    }
    
    
    // Methods for field "item7_126"
    public TransitStatus getItem7_126()
    {
	return this.item7_126;
    }
    
    public void setItem7_126(TransitStatus item7_126)
    {
	this.item7_126 = item7_126;
    }
    
    public boolean hasItem7_126()
    {
	return (item7_126 != null);
    }
    
    public void deleteItem7_126()
    {
	item7_126 = null;
    }
    
    
    // Methods for field "item7_127"
    public TransmissionState getItem7_127()
    {
	return this.item7_127;
    }
    
    public void setItem7_127(TransmissionState item7_127)
    {
	this.item7_127 = item7_127;
    }
    
    public boolean hasItem7_127()
    {
	return (item7_127 != null);
    }
    
    public void deleteItem7_127()
    {
	item7_127 = null;
    }
    
    
    // Methods for field "item7_128"
    public TxTime getItem7_128()
    {
	return this.item7_128;
    }
    
    public void setItem7_128(TxTime item7_128)
    {
	this.item7_128 = item7_128;
    }
    
    public boolean hasItem7_128()
    {
	return (item7_128 != null);
    }
    
    public void deleteItem7_128()
    {
	item7_128 = null;
    }
    
    
    // Methods for field "item7_129"
    public TravelerInfoType getItem7_129()
    {
	return this.item7_129;
    }
    
    public void setItem7_129(TravelerInfoType item7_129)
    {
	this.item7_129 = item7_129;
    }
    
    public boolean hasItem7_129()
    {
	return (item7_129 != null);
    }
    
    public void deleteItem7_129()
    {
	item7_129 = null;
    }
    
    
    // Methods for field "item7_130"
    public UniqueMSGID getItem7_130()
    {
	return this.item7_130;
    }
    
    public void setItem7_130(UniqueMSGID item7_130)
    {
	this.item7_130 = item7_130;
    }
    
    public boolean hasItem7_130()
    {
	return (item7_130 != null);
    }
    
    public void deleteItem7_130()
    {
	item7_130 = null;
    }
    
    
    // Methods for field "item7_131"
    public URL_Base getItem7_131()
    {
	return this.item7_131;
    }
    
    public void setItem7_131(URL_Base item7_131)
    {
	this.item7_131 = item7_131;
    }
    
    public boolean hasItem7_131()
    {
	return (item7_131 != null);
    }
    
    public void deleteItem7_131()
    {
	item7_131 = null;
    }
    
    
    // Methods for field "item7_132"
    public URL_Link getItem7_132()
    {
	return this.item7_132;
    }
    
    public void setItem7_132(URL_Link item7_132)
    {
	this.item7_132 = item7_132;
    }
    
    public boolean hasItem7_132()
    {
	return (item7_132 != null);
    }
    
    public void deleteItem7_132()
    {
	item7_132 = null;
    }
    
    
    // Methods for field "item7_133"
    public URL_Short getItem7_133()
    {
	return this.item7_133;
    }
    
    public void setItem7_133(URL_Short item7_133)
    {
	this.item7_133 = item7_133;
    }
    
    public boolean hasItem7_133()
    {
	return (item7_133 != null);
    }
    
    public void deleteItem7_133()
    {
	item7_133 = null;
    }
    
    
    // Methods for field "item7_134"
    public VehicleHeight getItem7_134()
    {
	return this.item7_134;
    }
    
    public void setItem7_134(VehicleHeight item7_134)
    {
	this.item7_134 = item7_134;
    }
    
    public boolean hasItem7_134()
    {
	return (item7_134 != null);
    }
    
    public void deleteItem7_134()
    {
	item7_134 = null;
    }
    
    
    // Methods for field "item7_135"
    public VehicleLaneAttributes getItem7_135()
    {
	return this.item7_135;
    }
    
    public void setItem7_135(VehicleLaneAttributes item7_135)
    {
	this.item7_135 = item7_135;
    }
    
    public boolean hasItem7_135()
    {
	return (item7_135 != null);
    }
    
    public void deleteItem7_135()
    {
	item7_135 = null;
    }
    
    
    // Methods for field "item7_136"
    public VehicleLength getItem7_136()
    {
	return this.item7_136;
    }
    
    public void setItem7_136(VehicleLength item7_136)
    {
	this.item7_136 = item7_136;
    }
    
    public boolean hasItem7_136()
    {
	return (item7_136 != null);
    }
    
    public void deleteItem7_136()
    {
	item7_136 = null;
    }
    
    
    // Methods for field "item7_137"
    public VehicleMass getItem7_137()
    {
	return this.item7_137;
    }
    
    public void setItem7_137(VehicleMass item7_137)
    {
	this.item7_137 = item7_137;
    }
    
    public boolean hasItem7_137()
    {
	return (item7_137 != null);
    }
    
    public void deleteItem7_137()
    {
	item7_137 = null;
    }
    
    
    // Methods for field "item7_138"
    public VehicleRequestStatus getItem7_138()
    {
	return this.item7_138;
    }
    
    public void setItem7_138(VehicleRequestStatus item7_138)
    {
	this.item7_138 = item7_138;
    }
    
    public boolean hasItem7_138()
    {
	return (item7_138 != null);
    }
    
    public void deleteItem7_138()
    {
	item7_138 = null;
    }
    
    
    // Methods for field "item7_139"
    public VehicleStatusDeviceTypeTag getItem7_139()
    {
	return this.item7_139;
    }
    
    public void setItem7_139(VehicleStatusDeviceTypeTag item7_139)
    {
	this.item7_139 = item7_139;
    }
    
    public boolean hasItem7_139()
    {
	return (item7_139 != null);
    }
    
    public void deleteItem7_139()
    {
	item7_139 = null;
    }
    
    
    // Methods for field "item7_140"
    public VehicleType getItem7_140()
    {
	return this.item7_140;
    }
    
    public void setItem7_140(VehicleType item7_140)
    {
	this.item7_140 = item7_140;
    }
    
    public boolean hasItem7_140()
    {
	return (item7_140 != null);
    }
    
    public void deleteItem7_140()
    {
	item7_140 = null;
    }
    
    
    // Methods for field "item7_141"
    public VehicleWidth getItem7_141()
    {
	return this.item7_141;
    }
    
    public void setItem7_141(VehicleWidth item7_141)
    {
	this.item7_141 = item7_141;
    }
    
    public boolean hasItem7_141()
    {
	return (item7_141 != null);
    }
    
    public void deleteItem7_141()
    {
	item7_141 = null;
    }
    
    
    // Methods for field "item7_142"
    public VerticalAccelerationThreshold getItem7_142()
    {
	return this.item7_142;
    }
    
    public void setItem7_142(VerticalAccelerationThreshold item7_142)
    {
	this.item7_142 = item7_142;
    }
    
    public boolean hasItem7_142()
    {
	return (item7_142 != null);
    }
    
    public void deleteItem7_142()
    {
	item7_142 = null;
    }
    
    
    // Methods for field "item7_143"
    public VerticalAcceleration getItem7_143()
    {
	return this.item7_143;
    }
    
    public void setItem7_143(VerticalAcceleration item7_143)
    {
	this.item7_143 = item7_143;
    }
    
    public boolean hasItem7_143()
    {
	return (item7_143 != null);
    }
    
    public void deleteItem7_143()
    {
	item7_143 = null;
    }
    
    
    // Methods for field "item7_144"
    public VINstring getItem7_144()
    {
	return this.item7_144;
    }
    
    public void setItem7_144(VINstring item7_144)
    {
	this.item7_144 = item7_144;
    }
    
    public boolean hasItem7_144()
    {
	return (item7_144 != null);
    }
    
    public void deleteItem7_144()
    {
	item7_144 = null;
    }
    
    
    // Methods for field "item7_145"
    public WiperRate getItem7_145()
    {
	return this.item7_145;
    }
    
    public void setItem7_145(WiperRate item7_145)
    {
	this.item7_145 = item7_145;
    }
    
    public boolean hasItem7_145()
    {
	return (item7_145 != null);
    }
    
    public void deleteItem7_145()
    {
	item7_145 = null;
    }
    
    
    // Methods for field "item7_146"
    public WiperStatusFront getItem7_146()
    {
	return this.item7_146;
    }
    
    public void setItem7_146(WiperStatusFront item7_146)
    {
	this.item7_146 = item7_146;
    }
    
    public boolean hasItem7_146()
    {
	return (item7_146 != null);
    }
    
    public void deleteItem7_146()
    {
	item7_146 = null;
    }
    
    
    // Methods for field "item7_147"
    public WiperStatusRear getItem7_147()
    {
	return this.item7_147;
    }
    
    public void setItem7_147(WiperStatusRear item7_147)
    {
	this.item7_147 = item7_147;
    }
    
    public boolean hasItem7_147()
    {
	return (item7_147 != null);
    }
    
    public void deleteItem7_147()
    {
	item7_147 = null;
    }
    
    
    // Methods for field "item7_148"
    public YawRateConfidence getItem7_148()
    {
	return this.item7_148;
    }
    
    public void setItem7_148(YawRateConfidence item7_148)
    {
	this.item7_148 = item7_148;
    }
    
    public boolean hasItem7_148()
    {
	return (item7_148 != null);
    }
    
    public void deleteItem7_148()
    {
	item7_148 = null;
    }
    
    
    // Methods for field "item7_149"
    public YawRate getItem7_149()
    {
	return this.item7_149;
    }
    
    public void setItem7_149(YawRate item7_149)
    {
	this.item7_149 = item7_149;
    }
    
    public boolean hasItem7_149()
    {
	return (item7_149 != null);
    }
    
    public void deleteItem7_149()
    {
	item7_149 = null;
    }
    
    
    // Methods for field "item8_1"
    public com.bah.ode.asn.oss.itis.IncidentResponseEquipment getItem8_1()
    {
	return this.item8_1;
    }
    
    public void setItem8_1(com.bah.ode.asn.oss.itis.IncidentResponseEquipment item8_1)
    {
	this.item8_1 = item8_1;
    }
    
    public boolean hasItem8_1()
    {
	return (item8_1 != null);
    }
    
    public void deleteItem8_1()
    {
	item8_1 = null;
    }
    
    
    // Methods for field "item8_2"
    public com.bah.ode.asn.oss.itis.ITIStext getItem8_2()
    {
	return this.item8_2;
    }
    
    public void setItem8_2(com.bah.ode.asn.oss.itis.ITIStext item8_2)
    {
	this.item8_2 = item8_2;
    }
    
    public boolean hasItem8_2()
    {
	return (item8_2 != null);
    }
    
    public void deleteItem8_2()
    {
	item8_2 = null;
    }
    
    
    // Methods for field "item8_3"
    public com.bah.ode.asn.oss.itis.ResponderGroupAffected getItem8_3()
    {
	return this.item8_3;
    }
    
    public void setItem8_3(com.bah.ode.asn.oss.itis.ResponderGroupAffected item8_3)
    {
	this.item8_3 = item8_3;
    }
    
    public boolean hasItem8_3()
    {
	return (item8_3 != null);
    }
    
    public void deleteItem8_3()
    {
	item8_3 = null;
    }
    
    
    // Methods for field "item8_4"
    public com.bah.ode.asn.oss.itis.VehicleGroupAffected getItem8_4()
    {
	return this.item8_4;
    }
    
    public void setItem8_4(com.bah.ode.asn.oss.itis.VehicleGroupAffected item8_4)
    {
	this.item8_4 = item8_4;
    }
    
    public boolean hasItem8_4()
    {
	return (item8_4 != null);
    }
    
    public void deleteItem8_4()
    {
	item8_4 = null;
    }
    
    
    // Methods for field "item8_5"
    public com.bah.ode.asn.oss.itis.ITIScodesAndText getItem8_5()
    {
	return this.item8_5;
    }
    
    public void setItem8_5(com.bah.ode.asn.oss.itis.ITIScodesAndText item8_5)
    {
	this.item8_5 = item8_5;
    }
    
    public boolean hasItem8_5()
    {
	return (item8_5 != null);
    }
    
    public void deleteItem8_5()
    {
	item8_5 = null;
    }
    
    
    // Methods for field "item8_6"
    public com.bah.ode.asn.oss.ntcip.EssMobileFriction getItem8_6()
    {
	return this.item8_6;
    }
    
    public void setItem8_6(com.bah.ode.asn.oss.ntcip.EssMobileFriction item8_6)
    {
	this.item8_6 = item8_6;
    }
    
    public boolean hasItem8_6()
    {
	return (item8_6 != null);
    }
    
    public void deleteItem8_6()
    {
	item8_6 = null;
    }
    
    
    // Methods for field "item8_7"
    public com.bah.ode.asn.oss.ntcip.EssPrecipRate getItem8_7()
    {
	return this.item8_7;
    }
    
    public void setItem8_7(com.bah.ode.asn.oss.ntcip.EssPrecipRate item8_7)
    {
	this.item8_7 = item8_7;
    }
    
    public boolean hasItem8_7()
    {
	return (item8_7 != null);
    }
    
    public void deleteItem8_7()
    {
	item8_7 = null;
    }
    
    
    // Methods for field "item8_8"
    public com.bah.ode.asn.oss.ntcip.EssPrecipSituation getItem8_8()
    {
	return this.item8_8;
    }
    
    public void setItem8_8(com.bah.ode.asn.oss.ntcip.EssPrecipSituation item8_8)
    {
	this.item8_8 = item8_8;
    }
    
    public boolean hasItem8_8()
    {
	return (item8_8 != null);
    }
    
    public void deleteItem8_8()
    {
	item8_8 = null;
    }
    
    
    // Methods for field "item8_9"
    public com.bah.ode.asn.oss.ntcip.EssPrecipYesNo getItem8_9()
    {
	return this.item8_9;
    }
    
    public void setItem8_9(com.bah.ode.asn.oss.ntcip.EssPrecipYesNo item8_9)
    {
	this.item8_9 = item8_9;
    }
    
    public boolean hasItem8_9()
    {
	return (item8_9 != null);
    }
    
    public void deleteItem8_9()
    {
	item8_9 = null;
    }
    
    
    // Methods for field "item8_10"
    public com.bah.ode.asn.oss.ntcip.EssSolarRadiation getItem8_10()
    {
	return this.item8_10;
    }
    
    public void setItem8_10(com.bah.ode.asn.oss.ntcip.EssSolarRadiation item8_10)
    {
	this.item8_10 = item8_10;
    }
    
    public boolean hasItem8_10()
    {
	return (item8_10 != null);
    }
    
    public void deleteItem8_10()
    {
	item8_10 = null;
    }
    
    
    // Methods for field "item8_11"
    public com.bah.ode.asn.oss.itis.ITIScodes getItem8_11()
    {
	return this.item8_11;
    }
    
    public void setItem8_11(com.bah.ode.asn.oss.itis.ITIScodes item8_11)
    {
	this.item8_11 = item8_11;
    }
    
    public boolean hasItem8_11()
    {
	return (item8_11 != null);
    }
    
    public void deleteItem8_11()
    {
	item8_11 = null;
    }
    
    
    /**
     * Effective permitted alphabet (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public static final EPAInfo _cEPAInfo_item7_20 = 
	com.bah.ode.asn.oss.dsrc.DescriptiveName._cEPAInfo_;
    
    /**
     * Effective size constraint (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public static final Bounds _cBounds_item7_126 = 
	com.bah.ode.asn.oss.dsrc.TransitStatus._cBounds_;
    
    /**
     * Effective permitted alphabet (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public static final EPAInfo _cEPAInfo_item7_131 = 
	com.bah.ode.asn.oss.dsrc.URL_Base._cEPAInfo_;
    
    /**
     * Effective permitted alphabet (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public static final EPAInfo _cEPAInfo_item7_132 = 
	com.bah.ode.asn.oss.dsrc.URL_Link._cEPAInfo_;
    
    /**
     * Effective permitted alphabet (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public static final EPAInfo _cEPAInfo_item7_133 = 
	com.bah.ode.asn.oss.dsrc.URL_Short._cEPAInfo_;
    
    /**
     * Effective permitted alphabet (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public static final EPAInfo _cEPAInfo_item8_2 = 
	com.bah.ode.asn.oss.itis.ITIStext._cEPAInfo_;
    
    /**
     * Implements BER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encodeValue(BerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	int len0 = 0;
	AllInclusive temp0 = this;

	if (temp0.item8_11 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item8_11, sink), 0x9F8167);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item8-11", "ITIScodes");
		throw ee;
	    }
	}
	if (temp0.item8_10 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item8_10, sink), 0x9F8166);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item8-10", "EssSolarRadiation");
		throw ee;
	    }
	}
	if (temp0.item8_9 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item8_9, sink), 0x9F8165);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item8-9", "EssPrecipYesNo");
		throw ee;
	    }
	}
	if (temp0.item8_8 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item8_8, sink), 0x9F8164);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item8-8", "EssPrecipSituation");
		throw ee;
	    }
	}
	if (temp0.item8_7 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item8_7, sink), 0x9F8163);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item8-7", "EssPrecipRate");
		throw ee;
	    }
	}
	if (temp0.item8_6 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item8_6, sink), 0x9F8162);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item8-6", "EssMobileFriction");
		throw ee;
	    }
	}
	if (temp0.item8_5 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item8_5.encodeValue(coder, sink), 0xBF8161);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item8-5", "ITIScodesAndText");
		throw ee;
	    }
	}
	if (temp0.item8_4 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item8_4, sink), 0x9F8160);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item8-4", "VehicleGroupAffected");
		throw ee;
	    }
	}
	if (temp0.item8_3 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item8_3, sink), 0x9F815F);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item8-3", "ResponderGroupAffected");
		throw ee;
	    }
	}
	if (temp0.item8_2 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeString1(temp0.item8_2, sink), 0x9F815E);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item8-2", "ITIStext");
		throw ee;
	    }
	}
	if (temp0.item8_1 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item8_1, sink), 0x9F815D);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item8-1", "IncidentResponseEquipment");
		throw ee;
	    }
	}
	if (temp0.item7_149 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_149, sink), 0x9F815C);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-149", "YawRate");
		throw ee;
	    }
	}
	if (temp0.item7_148 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_148, sink), 0x9F815B);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-148", "YawRateConfidence");
		throw ee;
	    }
	}
	if (temp0.item7_147 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_147, sink), 0x9F815A);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-147", "WiperStatusRear");
		throw ee;
	    }
	}
	if (temp0.item7_146 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_146, sink), 0x9F8159);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-146", "WiperStatusFront");
		throw ee;
	    }
	}
	if (temp0.item7_145 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_145, sink), 0x9F8158);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-145", "WiperRate");
		throw ee;
	    }
	}
	if (temp0.item7_144 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_144.byteArrayValue()), 0x9F8157);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-144", "VINstring");
		throw ee;
	    }
	}
	if (temp0.item7_143 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_143, sink), 0x9F8156);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-143", "VerticalAcceleration");
		throw ee;
	    }
	}
	if (temp0.item7_142 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeBitString(temp0.item7_142, sink), 0x9F8155);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-142", "VerticalAccelerationThreshold");
		throw ee;
	    }
	}
	if (temp0.item7_141 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_141, sink), 0x9F8154);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-141", "VehicleWidth");
		throw ee;
	    }
	}
	if (temp0.item7_140 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_140, sink), 0x9F8153);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-140", "VehicleType");
		throw ee;
	    }
	}
	if (temp0.item7_139 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_139, sink), 0x9F8152);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-139", "VehicleStatusDeviceTypeTag");
		throw ee;
	    }
	}
	if (temp0.item7_138 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_138.byteArrayValue()), 0x9F8151);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-138", "VehicleRequestStatus");
		throw ee;
	    }
	}
	if (temp0.item7_137 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_137, sink), 0x9F8150);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-137", "VehicleMass");
		throw ee;
	    }
	}
	if (temp0.item7_136 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_136, sink), 0x9F814F);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-136", "VehicleLength");
		throw ee;
	    }
	}
	if (temp0.item7_135 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_135, sink), 0x9F814E);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-135", "VehicleLaneAttributes");
		throw ee;
	    }
	}
	if (temp0.item7_134 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_134, sink), 0x9F814D);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-134", "VehicleHeight");
		throw ee;
	    }
	}
	if (temp0.item7_133 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeString1(temp0.item7_133, sink), 0x9F814C);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-133", "URL-Short");
		throw ee;
	    }
	}
	if (temp0.item7_132 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeString1(temp0.item7_132, sink), 0x9F814B);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-132", "URL-Link");
		throw ee;
	    }
	}
	if (temp0.item7_131 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeString1(temp0.item7_131, sink), 0x9F814A);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-131", "URL-Base");
		throw ee;
	    }
	}
	if (temp0.item7_130 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_130.byteArrayValue()), 0x9F8149);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-130", "UniqueMSGID");
		throw ee;
	    }
	}
	if (temp0.item7_129 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_129, sink), 0x9F8148);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-129", "TravelerInfoType");
		throw ee;
	    }
	}
	if (temp0.item7_128 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_128, sink), 0x9F8147);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-128", "TxTime");
		throw ee;
	    }
	}
	if (temp0.item7_127 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_127, sink), 0x9F8146);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-127", "TransmissionState");
		throw ee;
	    }
	}
	if (temp0.item7_126 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeBitString(temp0.item7_126, sink), 0x9F8145);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-126", "TransitStatus");
		throw ee;
	    }
	}
	if (temp0.item7_125 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_125, sink), 0x9F8144);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-125", "TransitPreEmptionRequest");
		throw ee;
	    }
	}
	if (temp0.item7_124 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_124, sink), 0x9F8143);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-124", "TractionControlState");
		throw ee;
	    }
	}
	if (temp0.item7_123 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_123, sink), 0x9F8142);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-123", "TimeMark");
		throw ee;
	    }
	}
	if (temp0.item7_122 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_122, sink), 0x9F8141);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-122", "TimeConfidence");
		throw ee;
	    }
	}
	if (temp0.item7_121 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_121, sink), 0x9F8140);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-121", "ThrottlePosition");
		throw ee;
	    }
	}
	if (temp0.item7_120 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_120, sink), 0x9F813F);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-120", "ThrottleConfidence");
		throw ee;
	    }
	}
	if (temp0.item7_119 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_119, sink), 0x9F813E);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-119", "TermTime");
		throw ee;
	    }
	}
	if (temp0.item7_118 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_118, sink), 0x9F813D);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-118", "TermDistance");
		throw ee;
	    }
	}
	if (temp0.item7_117 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_117.byteArrayValue()), 0x9F813C);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-117", "TemporaryID");
		throw ee;
	    }
	}
	if (temp0.item7_116 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_116, sink), 0x9F813B);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-116", "SunSensor");
		throw ee;
	    }
	}
	if (temp0.item7_115 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_115.byteArrayValue()), 0x9F813A);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-115", "SteeringWheelAngle");
		throw ee;
	    }
	}
	if (temp0.item7_114 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_114, sink), 0x9F8139);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-114", "SteeringWheelAngleRateOfChange");
		throw ee;
	    }
	}
	if (temp0.item7_113 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_113, sink), 0x9F8138);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-113", "SteeringWheelAngleConfidence");
		throw ee;
	    }
	}
	if (temp0.item7_112 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_112, sink), 0x9F8137);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-112", "StateConfidence");
		throw ee;
	    }
	}
	if (temp0.item7_111 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_111, sink), 0x9F8136);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-111", "StabilityControlStatus");
		throw ee;
	    }
	}
	if (temp0.item7_110 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_110, sink), 0x9F8135);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-110", "Speed");
		throw ee;
	    }
	}
	if (temp0.item7_109 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_109, sink), 0x9F8134);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-109", "SpeedConfidence");
		throw ee;
	    }
	}
	if (temp0.item7_108 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_108, sink), 0x9F8133);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-108", "SpecialSignalState");
		throw ee;
	    }
	}
	if (temp0.item7_107 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_107, sink), 0x9F8132);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-107", "SpecialLaneAttributes");
		throw ee;
	    }
	}
	if (temp0.item7_106 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_106, sink), 0x9F8131);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-106", "SirenInUse");
		throw ee;
	    }
	}
	if (temp0.item7_105 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_105, sink), 0x9F8130);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-105", "SignPrority");
		throw ee;
	    }
	}
	if (temp0.item7_104 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_104.byteArrayValue()), 0x9F812F);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-104", "SignalState");
		throw ee;
	    }
	}
	if (temp0.item7_103 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_103.byteArrayValue()), 0x9F812E);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-103", "SignalReqScheme");
		throw ee;
	    }
	}
	if (temp0.item7_102 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_102, sink), 0x9F812D);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-102", "SignalLightState");
		throw ee;
	    }
	}
	if (temp0.item7_101 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_101, sink), 0x9F812C);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-101", "RTCM-Revision");
		throw ee;
	    }
	}
	if (temp0.item7_100 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_100.byteArrayValue()), 0x9F812B);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-100", "RTCM-Payload");
		throw ee;
	    }
	}
	if (temp0.item7_99 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_99, sink), 0x9F812A);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-99", "RTCM-ID");
		throw ee;
	    }
	}
	if (temp0.item7_98 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_98, sink), 0x9F8129);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-98", "ResponseType");
		throw ee;
	    }
	}
	if (temp0.item7_97 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_97, sink), 0x9F8128);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-97", "RequestedItem");
		throw ee;
	    }
	}
	if (temp0.item7_96 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_96, sink), 0x9F8127);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-96", "RainSensor");
		throw ee;
	    }
	}
	if (temp0.item7_95 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_95, sink), 0x9F8126);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-95", "ProbeSegmentNumber");
		throw ee;
	    }
	}
	if (temp0.item7_94 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_94, sink), 0x9F8125);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-94", "PriorityState");
		throw ee;
	    }
	}
	if (temp0.item7_93 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_93.byteArrayValue()), 0x9F8124);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-93", "Priority");
		throw ee;
	    }
	}
	if (temp0.item7_92 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_92, sink), 0x9F8123);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-92", "PreemptState");
		throw ee;
	    }
	}
	if (temp0.item7_91 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_91, sink), 0x9F8122);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-91", "PositionConfidence");
		throw ee;
	    }
	}
	if (temp0.item7_90 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_90, sink), 0x9F8121);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-90", "PedestrianSignalState");
		throw ee;
	    }
	}
	if (temp0.item7_89 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_89, sink), 0x9F8120);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-89", "PedestrianDetect");
		throw ee;
	    }
	}
	if (temp0.item7_88 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_88.byteArrayValue()), 0x9F811F);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-88", "Payload");
		throw ee;
	    }
	}
	if (temp0.item7_87 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_87.byteArrayValue()), 0x9F811E);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-87", "PayloadData");
		throw ee;
	    }
	}
	if (temp0.item7_86 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_86, sink), 0x9F811D);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-86", "ObstacleDistance");
		throw ee;
	    }
	}
	if (temp0.item7_85 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_85, sink), 0x9F811C);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-85", "ObstacleDirection");
		throw ee;
	    }
	}
	if (temp0.item7_84 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_84, sink), 0x9F811B);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-84", "ObjectCount");
		throw ee;
	    }
	}
	if (temp0.item7_83 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_83.byteArrayValue()), 0x9F811A);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-83", "NTCIPVehicleclass");
		throw ee;
	    }
	}
	if (temp0.item7_82 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_82, sink), 0x9F8119);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-82", "NMEA-Revision");
		throw ee;
	    }
	}
	if (temp0.item7_81 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_81.byteArrayValue()), 0x9F8118);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-81", "NMEA-Payload");
		throw ee;
	    }
	}
	if (temp0.item7_80 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_80, sink), 0x9F8117);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-80", "NMEA-MsgType");
		throw ee;
	    }
	}
	if (temp0.item7_79 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_79, sink), 0x9F8116);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-79", "MUTCDCode");
		throw ee;
	    }
	}
	if (temp0.item7_78 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_78, sink), 0x9F8115);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-78", "MultiVehicleResponse");
		throw ee;
	    }
	}
	if (temp0.item7_77 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_77.byteArrayValue()), 0x9F8114);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-77", "MsgCRC");
		throw ee;
	    }
	}
	if (temp0.item7_76 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_76, sink), 0x9F8113);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-76", "MsgCount");
		throw ee;
	    }
	}
	if (temp0.item7_75 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_75, sink), 0x9F8112);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-75", "MinutesDuration");
		throw ee;
	    }
	}
	if (temp0.item7_74 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_74, sink), 0x9F8111);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-74", "MinuteOfTheYear");
		throw ee;
	    }
	}
	if (temp0.item7_73 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_73, sink), 0x9F8110);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-73", "Location-tech");
		throw ee;
	    }
	}
	if (temp0.item7_72 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_72, sink), 0x9F810F);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-72", "Location-quality");
		throw ee;
	    }
	}
	if (temp0.item7_71 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_71, sink), 0x9F810E);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-71", "Longitude");
		throw ee;
	    }
	}
	if (temp0.item7_70 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_70, sink), 0x9F810D);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-70", "LightbarInUse");
		throw ee;
	    }
	}
	if (temp0.item7_69 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_69, sink), 0x9F810C);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-69", "LayerType");
		throw ee;
	    }
	}
	if (temp0.item7_68 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_68, sink), 0x9F810B);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-68", "LayerID");
		throw ee;
	    }
	}
	if (temp0.item7_67 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_67, sink), 0x9F810A);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-67", "Latitude");
		throw ee;
	    }
	}
	if (temp0.item7_66 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_66, sink), 0x9F8109);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-66", "LaneWidth");
		throw ee;
	    }
	}
	if (temp0.item7_65 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_65.byteArrayValue()), 0x9F8108);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-65", "LaneSet");
		throw ee;
	    }
	}
	if (temp0.item7_64 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_64.byteArrayValue()), 0x9F8107);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-64", "LaneNumber");
		throw ee;
	    }
	}
	if (temp0.item7_63 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_63, sink), 0x9F8106);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-63", "LaneManeuverCode");
		throw ee;
	    }
	}
	if (temp0.item7_62 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_62, sink), 0x9F8105);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-62", "LaneCount");
		throw ee;
	    }
	}
	if (temp0.item7_61 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_61, sink), 0x9F8104);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-61", "WheelSensorStatus");
		throw ee;
	    }
	}
	if (temp0.item7_60 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeBitString(temp0.item7_60, sink), 0x9F8103);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-60", "WheelEndElectFault");
		throw ee;
	    }
	}
	if (temp0.item7_59 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_59, sink), 0x9F8102);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-59", "TrailerWeight");
		throw ee;
	    }
	}
	if (temp0.item7_58 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_58, sink), 0x9F8101);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-58", "TireTemp");
		throw ee;
	    }
	}
	if (temp0.item7_57 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_57, sink), 0x9F8100);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-57", "TirePressure");
		throw ee;
	    }
	}
	if (temp0.item7_56 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_56, sink), 0x9F7F);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-56", "TirePressureThresholdDetection");
		throw ee;
	    }
	}
	if (temp0.item7_55 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_55, sink), 0x9F7E);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-55", "TireLocation");
		throw ee;
	    }
	}
	if (temp0.item7_54 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_54, sink), 0x9F7D);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-54", "TireLeakageRate");
		throw ee;
	    }
	}
	if (temp0.item7_53 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_53, sink), 0x9F7C);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-53", "SteeringAxleTemperature");
		throw ee;
	    }
	}
	if (temp0.item7_52 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_52, sink), 0x9F7B);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-52", "SteeringAxleLubePressure");
		throw ee;
	    }
	}
	if (temp0.item7_51 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_51, sink), 0x9F7A);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-51", "DriveAxleTemperature");
		throw ee;
	    }
	}
	if (temp0.item7_50 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_50, sink), 0x9F79);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-50", "DriveAxleLubePressure");
		throw ee;
	    }
	}
	if (temp0.item7_49 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_49, sink), 0x9F78);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-49", "DriveAxleLocation");
		throw ee;
	    }
	}
	if (temp0.item7_48 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_48, sink), 0x9F77);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-48", "DriveAxleLiftAirPressure");
		throw ee;
	    }
	}
	if (temp0.item7_47 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_47, sink), 0x9F76);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-47", "CargoWeight");
		throw ee;
	    }
	}
	if (temp0.item7_46 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_46, sink), 0x9F75);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-46", "AxleWeight");
		throw ee;
	    }
	}
	if (temp0.item7_45 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_45, sink), 0x9F74);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-45", "AxleLocation");
		throw ee;
	    }
	}
	if (temp0.item7_44 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_44.byteArrayValue()), 0x9F73);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-44", "IntersectionID");
		throw ee;
	    }
	}
	if (temp0.item7_43 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_43.byteArrayValue()), 0x9F72);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-43", "IntersectionStatusObject");
		throw ee;
	    }
	}
	if (temp0.item7_42 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_42.byteArrayValue()), 0x9F71);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-42", "HeadingSlice");
		throw ee;
	    }
	}
	if (temp0.item7_41 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_41, sink), 0x9F70);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-41", "Heading");
		throw ee;
	    }
	}
	if (temp0.item7_40 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_40, sink), 0x9F6F);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-40", "HeadingConfidence");
		throw ee;
	    }
	}
	if (temp0.item7_39 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeBitString(temp0.item7_39, sink), 0x9F6E);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-39", "GPSstatus");
		throw ee;
	    }
	}
	if (temp0.item7_38 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_38.byteArrayValue()), 0x9F6D);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-38", "FurtherInfoID");
		throw ee;
	    }
	}
	if (temp0.item7_37 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_37, sink), 0x9F6C);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-37", "ExteriorLights");
		throw ee;
	    }
	}
	if (temp0.item7_36 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_36, sink), 0x9F6B);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-36", "Extent");
		throw ee;
	    }
	}
	if (temp0.item7_35 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_35, sink), 0x9F6A);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-35", "EventFlags");
		throw ee;
	    }
	}
	if (temp0.item7_34 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_34, sink), 0x9F69);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-34", "EmergencyDetails");
		throw ee;
	    }
	}
	if (temp0.item7_33 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_33.byteArrayValue()), 0x9F68);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-33", "Elevation");
		throw ee;
	    }
	}
	if (temp0.item7_32 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_32, sink), 0x9F67);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-32", "ElevationConfidence");
		throw ee;
	    }
	}
	if (temp0.item7_31 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_31, sink), 0x9F66);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-31", "DYear");
		throw ee;
	    }
	}
	if (temp0.item7_30 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_30, sink), 0x9F65);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-30", "DSRCmsgID");
		throw ee;
	    }
	}
	if (temp0.item7_29 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_29, sink), 0x9F64);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-29", "DSignalSeconds");
		throw ee;
	    }
	}
	if (temp0.item7_28 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_28, sink), 0x9F63);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-28", "DSecond");
		throw ee;
	    }
	}
	if (temp0.item7_27 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_27, sink), 0x9F62);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-27", "DrivingWheelAngle");
		throw ee;
	    }
	}
	if (temp0.item7_26 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_26, sink), 0x9F61);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-26", "DrivenLineOffset");
		throw ee;
	    }
	}
	if (temp0.item7_25 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_25, sink), 0x9F60);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-25", "DOffset");
		throw ee;
	    }
	}
	if (temp0.item7_24 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_24, sink), 0x9F5F);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-24", "DMonth");
		throw ee;
	    }
	}
	if (temp0.item7_23 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_23, sink), 0x9F5E);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-23", "DMinute");
		throw ee;
	    }
	}
	if (temp0.item7_22 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_22, sink), 0x9F5D);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-22", "DirectionOfUse");
		throw ee;
	    }
	}
	if (temp0.item7_21 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_21, sink), 0x9F5C);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-21", "DHour");
		throw ee;
	    }
	}
	if (temp0.item7_20 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeString1(temp0.item7_20, sink), 0x9F5B);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-20", "DescriptiveName");
		throw ee;
	    }
	}
	if (temp0.item7_19 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_19, sink), 0x9F5A);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-19", "DDay");
		throw ee;
	    }
	}
	if (temp0.item7_18 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_18, sink), 0x9F59);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-18", "CrosswalkLaneAttributes");
		throw ee;
	    }
	}
	if (temp0.item7_17 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_17, sink), 0x9F58);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-17", "Count");
		throw ee;
	    }
	}
	if (temp0.item7_16 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_16, sink), 0x9F57);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-16", "ColorState");
		throw ee;
	    }
	}
	if (temp0.item7_15 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_15, sink), 0x9F56);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-15", "CoefficientOfFriction");
		throw ee;
	    }
	}
	if (temp0.item7_14 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_14.byteArrayValue()), 0x9F55);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-14", "CodeWord");
		throw ee;
	    }
	}
	if (temp0.item7_13 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_13, sink), 0x9F54);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-13", "BumperHeightRear");
		throw ee;
	    }
	}
	if (temp0.item7_12 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_12, sink), 0x9F53);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-12", "BumperHeightFront");
		throw ee;
	    }
	}
	if (temp0.item7_11 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_11, sink), 0x9F52);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-11", "BrakeBoostApplied");
		throw ee;
	    }
	}
	if (temp0.item7_10 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeBitString(temp0.item7_10, sink), 0x9F51);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-10", "BrakeAppliedStatus");
		throw ee;
	    }
	}
	if (temp0.item7_9 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_9, sink), 0x9F50);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-9", "BrakeAppliedPressure");
		throw ee;
	    }
	}
	if (temp0.item7_8 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_8, sink), 0x9F4F);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-8", "BarrierAttributes");
		throw ee;
	    }
	}
	if (temp0.item7_7 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_7, sink), 0x9F4E);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-7", "AuxiliaryBrakeStatus");
		throw ee;
	    }
	}
	if (temp0.item7_6 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_6, sink), 0x9F4D);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-6", "ApproachNumber");
		throw ee;
	    }
	}
	if (temp0.item7_5 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_5, sink), 0x9F4C);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-5", "AntiLockBrakeStatus");
		throw ee;
	    }
	}
	if (temp0.item7_4 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_4, sink), 0x9F4B);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-4", "AmbientAirTemperature");
		throw ee;
	    }
	}
	if (temp0.item7_3 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_3, sink), 0x9F4A);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-3", "AmbientAirPressure");
		throw ee;
	    }
	}
	if (temp0.item7_2 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_2, sink), 0x9F49);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-2", "AccelerationConfidence");
		throw ee;
	    }
	}
	if (temp0.item7_1 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_1, sink), 0x9F48);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-1", "Acceleration");
		throw ee;
	    }
	}
	if (temp0.item6_73 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_73.encodeValue(coder, sink), 0xBF47);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-73", "WiperStatus");
		throw ee;
	    }
	}
	if (temp0.item6_72 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_72.encodeValue(coder, sink), 0xBF46);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-72", "VehicleStatus");
		throw ee;
	    }
	}
	if (temp0.item6_71 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_71.encodeValue(coder, sink), 0xBF45);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-71", "VehicleStatusRequest");
		throw ee;
	    }
	}
	if (temp0.item6_70 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_70.encodeValue(coder, sink), 0xBF44);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-70", "VehicleSize");
		throw ee;
	    }
	}
	if (temp0.item6_69 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_69.encodeValue(coder, sink), 0xBF43);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-69", "VehicleSafetyExtension");
		throw ee;
	    }
	}
	if (temp0.item6_68 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_68.encodeValue(coder, sink), 0xBF42);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-68", "VehicleReferenceLane");
		throw ee;
	    }
	}
	if (temp0.item6_67 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_67.encodeValue(coder, sink), 0xBF41);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-67", "VehicleIdent");
		throw ee;
	    }
	}
	if (temp0.item6_66 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_66.encodeValue(coder, sink), 0xBF40);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-66", "VehicleComputedLane");
		throw ee;
	    }
	}
	if (temp0.item6_65 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_65.encodeValue(coder, sink), 0xBF3F);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-65", "ValidRegion");
		throw ee;
	    }
	}
	if (temp0.item6_64 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item6_64.byteArrayValue()), 0x9F3E);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-64", "TransmissionAndSpeed");
		throw ee;
	    }
	}
	if (temp0.item6_63 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item6_63.byteArrayValue()), 0x9F3D);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-63", "SpeedandHeadingandThrottleConfidence");
		throw ee;
	    }
	}
	if (temp0.item6_62 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_62.encodeValue(coder, sink), 0xBF3C);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-62", "SpecialLane");
		throw ee;
	    }
	}
	if (temp0.item6_61 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_61.encodeValue(coder, sink), 0xBF3B);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-61", "SnapshotTime");
		throw ee;
	    }
	}
	if (temp0.item6_60 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_60.encodeValue(coder, sink), 0xBF3A);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-60", "Snapshot");
		throw ee;
	    }
	}
	if (temp0.item6_59 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_59.encodeValue(coder, sink), 0xBF39);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-59", "SnapshotDistance");
		throw ee;
	    }
	}
	if (temp0.item6_58 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_58.encodeValue(coder, sink), 0xBF38);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-58", "SignalRequest");
		throw ee;
	    }
	}
	if (temp0.item6_57 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_57.encodeValue(coder, sink), 0xBF37);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-57", "SignalControlZone");
		throw ee;
	    }
	}
	if (temp0.item6_56 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_56.encodeValue(coder, sink), 0xBF36);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-56", "ShapePointSet");
		throw ee;
	    }
	}
	if (temp0.item6_55 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_55.encodeValue(coder, sink), 0xBF35);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-55", "Sample");
		throw ee;
	    }
	}
	if (temp0.item6_54 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_54.encodeValue(coder, sink), 0xBF34);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-54", "RTCMPackage");
		throw ee;
	    }
	}
	if (temp0.item6_53 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_53.encodeValue(coder, sink), 0xBF33);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-53", "RTCMmsg");
		throw ee;
	    }
	}
	if (temp0.item6_52 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item6_52.byteArrayValue()), 0x9F32);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-52", "RTCMHeader");
		throw ee;
	    }
	}
	if (temp0.item6_51 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_51.encodeValue(coder, sink), 0xBF31);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-51", "RoadSignID");
		throw ee;
	    }
	}
	if (temp0.item6_50 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_50.encodeValue(coder, sink), 0xBF30);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-50", "RegionPointSet");
		throw ee;
	    }
	}
	if (temp0.item6_49 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_49.encodeValue(coder, sink), 0xBF2F);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-49", "RegionOffsets");
		throw ee;
	    }
	}
	if (temp0.item6_48 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_48.encodeValue(coder, sink), 0xBF2E);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-48", "RegionList");
		throw ee;
	    }
	}
	if (temp0.item6_47 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item6_47.byteArrayValue()), 0x9F2D);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-47", "PositionConfidenceSet");
		throw ee;
	    }
	}
	if (temp0.item6_46 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item6_46.byteArrayValue()), 0x9F2C);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-46", "PositionalAccuracy");
		throw ee;
	    }
	}
	if (temp0.item6_45 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_45.encodeValue(coder, sink), 0xBF2B);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-45", "Position3D");
		throw ee;
	    }
	}
	if (temp0.item6_44 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_44.encodeValue(coder, sink), 0xBF2A);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-44", "PathPrediction");
		throw ee;
	    }
	}
	if (temp0.item6_43 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item6_43.byteArrayValue()), 0x9F29);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-43", "PathHistoryPointType-10");
		throw ee;
	    }
	}
	if (temp0.item6_42 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item6_42.byteArrayValue()), 0x9F28);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-42", "PathHistoryPointType-09");
		throw ee;
	    }
	}
	if (temp0.item6_41 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item6_41.byteArrayValue()), 0x9F27);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-41", "PathHistoryPointType-08");
		throw ee;
	    }
	}
	if (temp0.item6_40 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item6_40.byteArrayValue()), 0x9F26);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-40", "PathHistoryPointType-07");
		throw ee;
	    }
	}
	if (temp0.item6_39 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item6_39.byteArrayValue()), 0x9F25);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-39", "PathHistoryPointType-06");
		throw ee;
	    }
	}
	if (temp0.item6_38 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item6_38.byteArrayValue()), 0x9F24);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-38", "PathHistoryPointType-05");
		throw ee;
	    }
	}
	if (temp0.item6_37 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item6_37.byteArrayValue()), 0x9F23);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-37", "PathHistoryPointType-04");
		throw ee;
	    }
	}
	if (temp0.item6_36 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item6_36.byteArrayValue()), 0x9F22);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-36", "PathHistoryPointType-03");
		throw ee;
	    }
	}
	if (temp0.item6_35 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item6_35.byteArrayValue()), 0x9F21);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-35", "PathHistoryPointType-02");
		throw ee;
	    }
	}
	if (temp0.item6_34 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_34.encodeValue(coder, sink), 0xBF20);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-34", "PathHistoryPointType-01");
		throw ee;
	    }
	}
	if (temp0.item6_33 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_33.encodeValue(coder, sink), 0xBF1F);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-33", "PathHistory");
		throw ee;
	    }
	}
	if (temp0.item6_32 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item6_32.byteArrayValue()), 0x9E);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-32", "Offsets");
		throw ee;
	    }
	}
	if (temp0.item6_31 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_31.encodeValue(coder, sink), 0xBD);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-31", "NodeList");
		throw ee;
	    }
	}
	if (temp0.item6_30 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_30.encodeValue(coder, sink), 0xBC);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-30", "MovementState");
		throw ee;
	    }
	}
	if (temp0.item6_29 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_29.encodeValue(coder, sink), 0xBB);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-29", "J1939data");
		throw ee;
	    }
	}
	if (temp0.item6_28 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_28.encodeValue(coder, sink), 0xBA);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-28", "WorkZone");
		throw ee;
	    }
	}
	if (temp0.item6_27 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_27.encodeValue(coder, sink), 0xB9);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-27", "SpeedLimit");
		throw ee;
	    }
	}
	if (temp0.item6_26 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_26.encodeValue(coder, sink), 0xB8);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-26", "GenericSignage");
		throw ee;
	    }
	}
	if (temp0.item6_25 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_25.encodeValue(coder, sink), 0xB7);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-25", "ExitService");
		throw ee;
	    }
	}
	if (temp0.item6_24 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_24.encodeValue(coder, sink), 0xB6);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-24", "IntersectionState");
		throw ee;
	    }
	}
	if (temp0.item6_23 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_23.encodeValue(coder, sink), 0xB5);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-23", "Intersection");
		throw ee;
	    }
	}
	if (temp0.item6_22 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_22.encodeValue(coder, sink), 0xB4);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-22", "FullPositionVector");
		throw ee;
	    }
	}
	if (temp0.item6_21 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_21.encodeValue(coder, sink), 0xB3);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-21", "DYearMonth");
		throw ee;
	    }
	}
	if (temp0.item6_20 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_20.encodeValue(coder, sink), 0xB2);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-20", "DTime");
		throw ee;
	    }
	}
	if (temp0.item6_19 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_19.encodeValue(coder, sink), 0xB1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-19", "DMonthDay");
		throw ee;
	    }
	}
	if (temp0.item6_18 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_18.encodeValue(coder, sink), 0xB0);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-18", "DFullTime");
		throw ee;
	    }
	}
	if (temp0.item6_17 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_17.encodeValue(coder, sink), 0xAF);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-17", "DDateTime");
		throw ee;
	    }
	}
	if (temp0.item6_16 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_16.encodeValue(coder, sink), 0xAE);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-16", "DDate");
		throw ee;
	    }
	}
	if (temp0.item6_15 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_15.encodeValue(coder, sink), 0xAD);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-15", "DataParameters");
		throw ee;
	    }
	}
	if (temp0.item6_14 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_14.encodeValue(coder, sink), 0xAC);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-14", "CrosswalkLane");
		throw ee;
	    }
	}
	if (temp0.item6_13 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item6_13.byteArrayValue()), 0x8B);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-13", "ConnectsTo");
		throw ee;
	    }
	}
	if (temp0.item6_12 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_12.encodeValue(coder, sink), 0xAA);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-12", "ConfidenceSet");
		throw ee;
	    }
	}
	if (temp0.item6_11 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_11.encodeValue(coder, sink), 0xA9);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-11", "Circle");
		throw ee;
	    }
	}
	if (temp0.item6_10 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_10.encodeValue(coder, sink), 0xA8);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-10", "BumperHeights");
		throw ee;
	    }
	}
	if (temp0.item6_9 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item6_9.byteArrayValue()), 0x87);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-9", "BSMblob");
		throw ee;
	    }
	}
	if (temp0.item6_8 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item6_8.byteArrayValue()), 0x86);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-8", "BrakeSystemStatus");
		throw ee;
	    }
	}
	if (temp0.item6_7 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_7.encodeValue(coder, sink), 0xA5);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-7", "BarrierLane");
		throw ee;
	    }
	}
	if (temp0.item6_6 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_6.encodeValue(coder, sink), 0xA4);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-6", "ApproachObject");
		throw ee;
	    }
	}
	if (temp0.item6_5 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_5.encodeValue(coder, sink), 0xA3);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-5", "Approach");
		throw ee;
	    }
	}
	if (temp0.item6_4 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item6_4.byteArrayValue()), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-4", "AntennaOffsetSet");
		throw ee;
	    }
	}
	if (temp0.item6_2 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_2.encodeValue(coder, sink), 0xA1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-2", "AccelSteerYawRateConfidence");
		throw ee;
	    }
	}
	if (temp0.item6_1 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item6_1.byteArrayValue()), 0x80);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-1", "AccelerationSet4Way");
		throw ee;
	    }
	}

	return len0;
    }

    /**
     * Implements BER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public AllInclusive decodeValue(BerCoder coder, DecoderInput source)
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
	    if (tag == 0x80 || tag == 0xA0) {
		try {
		    this.item6_1 = new AccelerationSet4Way(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-1", "AccelerationSet4Way");
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
		    this.item6_2 = new AccelSteerYawRateConfidence();
		    this.item6_2.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-2", "AccelSteerYawRateConfidence");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x82 || tag == 0xA2) {
		try {
		    this.item6_4 = new AntennaOffsetSet(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-4", "AntennaOffsetSet");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xA3) {
		try {
		    this.item6_5 = new Approach();
		    this.item6_5.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-5", "Approach");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xA4) {
		try {
		    this.item6_6 = new ApproachObject();
		    this.item6_6.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-6", "ApproachObject");
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
		    this.item6_7 = new BarrierLane();
		    this.item6_7.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-7", "BarrierLane");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x86 || tag == 0xA6) {
		try {
		    this.item6_8 = new BrakeSystemStatus(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-8", "BrakeSystemStatus");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x87 || tag == 0xA7) {
		try {
		    this.item6_9 = new BSMblob(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-9", "BSMblob");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xA8) {
		try {
		    this.item6_10 = new BumperHeights();
		    this.item6_10.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-10", "BumperHeights");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xA9) {
		try {
		    this.item6_11 = new Circle();
		    this.item6_11.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-11", "Circle");
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
		    this.item6_12 = new ConfidenceSet();
		    this.item6_12.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-12", "ConfidenceSet");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x8B || tag == 0xAB) {
		try {
		    this.item6_13 = new ConnectsTo(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-13", "ConnectsTo");
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
		    this.item6_14 = new CrosswalkLane();
		    this.item6_14.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-14", "CrosswalkLane");
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
		    this.item6_15 = new DataParameters();
		    this.item6_15.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-15", "DataParameters");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xAE) {
		try {
		    this.item6_16 = new DDate();
		    this.item6_16.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-16", "DDate");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xAF) {
		try {
		    this.item6_17 = new DDateTime();
		    this.item6_17.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-17", "DDateTime");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xB0) {
		try {
		    this.item6_18 = new DFullTime();
		    this.item6_18.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-18", "DFullTime");
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
		    this.item6_19 = new DMonthDay();
		    this.item6_19.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-19", "DMonthDay");
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
		    this.item6_20 = new DTime();
		    this.item6_20.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-20", "DTime");
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
		    this.item6_21 = new DYearMonth();
		    this.item6_21.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-21", "DYearMonth");
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
		    this.item6_22 = new FullPositionVector();
		    this.item6_22.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-22", "FullPositionVector");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xB5) {
		try {
		    this.item6_23 = new Intersection_();
		    this.item6_23.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-23", "Intersection");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xB6) {
		try {
		    this.item6_24 = new IntersectionState();
		    this.item6_24.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-24", "IntersectionState");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xB7) {
		try {
		    this.item6_25 = new ExitService();
		    this.item6_25.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-25", "ExitService");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xB8) {
		try {
		    this.item6_26 = new GenericSignage();
		    this.item6_26.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-26", "GenericSignage");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xB9) {
		try {
		    this.item6_27 = new SpeedLimit();
		    this.item6_27.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-27", "SpeedLimit");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xBA) {
		try {
		    this.item6_28 = new WorkZone();
		    this.item6_28.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-28", "WorkZone");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xBB) {
		try {
		    this.item6_29 = new J1939data();
		    this.item6_29.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-29", "J1939data");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xBC) {
		try {
		    this.item6_30 = new MovementState();
		    this.item6_30.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-30", "MovementState");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xBD) {
		try {
		    this.item6_31 = new NodeList();
		    this.item6_31.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-31", "NodeList");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9E || tag == 0xBE) {
		try {
		    this.item6_32 = new Offsets(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-32", "Offsets");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xBF1F) {
		try {
		    this.item6_33 = new PathHistory();
		    this.item6_33.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-33", "PathHistory");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xBF20) {
		try {
		    this.item6_34 = new PathHistoryPointType_01();
		    this.item6_34.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-34", "PathHistoryPointType-01");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F21 || tag == 0xBF21) {
		try {
		    this.item6_35 = new PathHistoryPointType_02(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-35", "PathHistoryPointType-02");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F22 || tag == 0xBF22) {
		try {
		    this.item6_36 = new PathHistoryPointType_03(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-36", "PathHistoryPointType-03");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F23 || tag == 0xBF23) {
		try {
		    this.item6_37 = new PathHistoryPointType_04(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-37", "PathHistoryPointType-04");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F24 || tag == 0xBF24) {
		try {
		    this.item6_38 = new PathHistoryPointType_05(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-38", "PathHistoryPointType-05");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F25 || tag == 0xBF25) {
		try {
		    this.item6_39 = new PathHistoryPointType_06(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-39", "PathHistoryPointType-06");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F26 || tag == 0xBF26) {
		try {
		    this.item6_40 = new PathHistoryPointType_07(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-40", "PathHistoryPointType-07");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F27 || tag == 0xBF27) {
		try {
		    this.item6_41 = new PathHistoryPointType_08(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-41", "PathHistoryPointType-08");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F28 || tag == 0xBF28) {
		try {
		    this.item6_42 = new PathHistoryPointType_09(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-42", "PathHistoryPointType-09");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F29 || tag == 0xBF29) {
		try {
		    this.item6_43 = new PathHistoryPointType_10(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-43", "PathHistoryPointType-10");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xBF2A) {
		try {
		    this.item6_44 = new PathPrediction();
		    this.item6_44.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-44", "PathPrediction");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xBF2B) {
		try {
		    this.item6_45 = new Position3D();
		    this.item6_45.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-45", "Position3D");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F2C || tag == 0xBF2C) {
		try {
		    this.item6_46 = new PositionalAccuracy(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-46", "PositionalAccuracy");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F2D || tag == 0xBF2D) {
		try {
		    this.item6_47 = new PositionConfidenceSet(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-47", "PositionConfidenceSet");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xBF2E) {
		try {
		    this.item6_48 = new RegionList();
		    this.item6_48.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-48", "RegionList");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xBF2F) {
		try {
		    this.item6_49 = new RegionOffsets();
		    this.item6_49.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-49", "RegionOffsets");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xBF30) {
		try {
		    this.item6_50 = new RegionPointSet();
		    this.item6_50.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-50", "RegionPointSet");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xBF31) {
		try {
		    this.item6_51 = new RoadSignID();
		    this.item6_51.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-51", "RoadSignID");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F32 || tag == 0xBF32) {
		try {
		    this.item6_52 = new RTCMHeader(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-52", "RTCMHeader");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xBF33) {
		try {
		    this.item6_53 = new RTCMmsg();
		    this.item6_53.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-53", "RTCMmsg");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xBF34) {
		try {
		    this.item6_54 = new RTCMPackage();
		    this.item6_54.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-54", "RTCMPackage");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xBF35) {
		try {
		    this.item6_55 = new Sample();
		    this.item6_55.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-55", "Sample");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xBF36) {
		try {
		    this.item6_56 = new ShapePointSet();
		    this.item6_56.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-56", "ShapePointSet");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xBF37) {
		try {
		    this.item6_57 = new SignalControlZone();
		    this.item6_57.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-57", "SignalControlZone");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xBF38) {
		try {
		    this.item6_58 = new SignalRequest();
		    this.item6_58.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-58", "SignalRequest");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xBF39) {
		try {
		    this.item6_59 = new SnapshotDistance();
		    this.item6_59.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-59", "SnapshotDistance");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xBF3A) {
		try {
		    this.item6_60 = new Snapshot();
		    this.item6_60.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-60", "Snapshot");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xBF3B) {
		try {
		    this.item6_61 = new SnapshotTime();
		    this.item6_61.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-61", "SnapshotTime");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xBF3C) {
		try {
		    this.item6_62 = new SpecialLane();
		    this.item6_62.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-62", "SpecialLane");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F3D || tag == 0xBF3D) {
		try {
		    this.item6_63 = new SpeedandHeadingandThrottleConfidence(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-63", "SpeedandHeadingandThrottleConfidence");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F3E || tag == 0xBF3E) {
		try {
		    this.item6_64 = new TransmissionAndSpeed(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-64", "TransmissionAndSpeed");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xBF3F) {
		try {
		    this.item6_65 = new ValidRegion();
		    this.item6_65.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-65", "ValidRegion");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xBF40) {
		try {
		    this.item6_66 = new VehicleComputedLane();
		    this.item6_66.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-66", "VehicleComputedLane");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xBF41) {
		try {
		    this.item6_67 = new VehicleIdent();
		    this.item6_67.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-67", "VehicleIdent");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xBF42) {
		try {
		    this.item6_68 = new VehicleReferenceLane();
		    this.item6_68.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-68", "VehicleReferenceLane");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xBF43) {
		try {
		    this.item6_69 = new VehicleSafetyExtension();
		    this.item6_69.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-69", "VehicleSafetyExtension");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xBF44) {
		try {
		    this.item6_70 = new VehicleSize();
		    this.item6_70.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-70", "VehicleSize");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xBF45) {
		try {
		    this.item6_71 = new VehicleStatusRequest();
		    this.item6_71.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-71", "VehicleStatusRequest");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xBF46) {
		try {
		    this.item6_72 = new VehicleStatus();
		    this.item6_72.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-72", "VehicleStatus");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xBF47) {
		try {
		    this.item6_73 = new WiperStatus();
		    this.item6_73.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item6-73", "WiperStatus");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F48) {
		try {
		    this.item7_1 = new Acceleration(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-1", "Acceleration");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F49) {
		try {
		    int idx1 = AccelerationConfidence.indexOfValue(source.decodeInt());
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
		    this.item7_2 = AccelerationConfidence.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-2", "AccelerationConfidence");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F4A) {
		try {
		    this.item7_3 = new AmbientAirPressure(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-3", "AmbientAirPressure");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F4B) {
		try {
		    this.item7_4 = new AmbientAirTemperature(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-4", "AmbientAirTemperature");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F4C) {
		try {
		    int idx1 = AntiLockBrakeStatus.indexOfValue(source.decodeInt());
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
		    this.item7_5 = AntiLockBrakeStatus.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-5", "AntiLockBrakeStatus");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F4D) {
		try {
		    this.item7_6 = new ApproachNumber(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-6", "ApproachNumber");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F4E) {
		try {
		    int idx1 = AuxiliaryBrakeStatus.indexOfValue(source.decodeInt());
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
		    this.item7_7 = AuxiliaryBrakeStatus.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-7", "AuxiliaryBrakeStatus");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F4F) {
		try {
		    this.item7_8 = new BarrierAttributes(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-8", "BarrierAttributes");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F50) {
		try {
		    int idx1 = BrakeAppliedPressure.indexOfValue(source.decodeInt());
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
		    this.item7_9 = BrakeAppliedPressure.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-9", "BrakeAppliedPressure");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F51 || tag == 0xBF51) {
		try {
		    this.item7_10 = new BrakeAppliedStatus();
		    byte[] b = coder.decodeBitString(source);
		    this.item7_10.setValue(b, b.length * 8 - coder.getUnused());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-10", "BrakeAppliedStatus");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F52) {
		try {
		    int idx1 = BrakeBoostApplied.indexOfValue(source.decodeInt());
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
		    this.item7_11 = BrakeBoostApplied.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-11", "BrakeBoostApplied");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F53) {
		try {
		    this.item7_12 = new BumperHeightFront(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-12", "BumperHeightFront");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F54) {
		try {
		    this.item7_13 = new BumperHeightRear(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-13", "BumperHeightRear");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F55 || tag == 0xBF55) {
		try {
		    this.item7_14 = new CodeWord(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-14", "CodeWord");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F56) {
		try {
		    this.item7_15 = new CoefficientOfFriction(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-15", "CoefficientOfFriction");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F57) {
		try {
		    int idx1 = ColorState.indexOfValue(source.decodeInt());
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
		    this.item7_16 = ColorState.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-16", "ColorState");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F58) {
		try {
		    this.item7_17 = new Count(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-17", "Count");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F59) {
		try {
		    int idx1 = CrosswalkLaneAttributes.indexOfValue(source.decodeInt());
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
		    this.item7_18 = CrosswalkLaneAttributes.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-18", "CrosswalkLaneAttributes");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F5A) {
		try {
		    this.item7_19 = new DDay(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-19", "DDay");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F5B || tag == 0xBF5B) {
		try {
		    this.item7_20 = new DescriptiveName(coder.decodeChars(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-20", "DescriptiveName");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F5C) {
		try {
		    this.item7_21 = new DHour(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-21", "DHour");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F5D) {
		try {
		    int idx1 = DirectionOfUse.indexOfValue(source.decodeLong());
		    this.item7_22 = (idx1 < 0) ? DirectionOfUse.unknownEnumerator() : DirectionOfUse.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-22", "DirectionOfUse");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F5E) {
		try {
		    this.item7_23 = new DMinute(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-23", "DMinute");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F5F) {
		try {
		    this.item7_24 = new DMonth(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-24", "DMonth");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F60) {
		try {
		    this.item7_25 = new DOffset(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-25", "DOffset");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F61) {
		try {
		    this.item7_26 = new DrivenLineOffset(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-26", "DrivenLineOffset");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F62) {
		try {
		    this.item7_27 = new DrivingWheelAngle(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-27", "DrivingWheelAngle");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F63) {
		try {
		    this.item7_28 = new DSecond(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-28", "DSecond");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F64) {
		try {
		    this.item7_29 = new DSignalSeconds(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-29", "DSignalSeconds");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F65) {
		try {
		    int idx1 = DSRCmsgID.indexOfValue(source.decodeLong());
		    this.item7_30 = (idx1 < 0) ? DSRCmsgID.unknownEnumerator() : DSRCmsgID.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-30", "DSRCmsgID");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F66) {
		try {
		    this.item7_31 = new DYear(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-31", "DYear");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F67) {
		try {
		    int idx1 = ElevationConfidence.indexOfValue(source.decodeInt());
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
		    this.item7_32 = ElevationConfidence.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-32", "ElevationConfidence");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F68 || tag == 0xBF68) {
		try {
		    this.item7_33 = new Elevation(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-33", "Elevation");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F69) {
		try {
		    this.item7_34 = new EmergencyDetails(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-34", "EmergencyDetails");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F6A) {
		try {
		    this.item7_35 = new EventFlags(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-35", "EventFlags");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F6B) {
		try {
		    int idx1 = Extent.indexOfValue(source.decodeInt());
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
		    this.item7_36 = Extent.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-36", "Extent");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F6C) {
		try {
		    this.item7_37 = new ExteriorLights(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-37", "ExteriorLights");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F6D || tag == 0xBF6D) {
		try {
		    this.item7_38 = new FurtherInfoID(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-38", "FurtherInfoID");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F6E || tag == 0xBF6E) {
		try {
		    this.item7_39 = new GPSstatus();
		    byte[] b = coder.decodeBitString(source);
		    this.item7_39.setValue(b, b.length * 8 - coder.getUnused());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-39", "GPSstatus");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F6F) {
		try {
		    int idx1 = HeadingConfidence.indexOfValue(source.decodeInt());
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
		    this.item7_40 = HeadingConfidence.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-40", "HeadingConfidence");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F70) {
		try {
		    this.item7_41 = new Heading(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-41", "Heading");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F71 || tag == 0xBF71) {
		try {
		    this.item7_42 = new HeadingSlice(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-42", "HeadingSlice");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F72 || tag == 0xBF72) {
		try {
		    this.item7_43 = new IntersectionStatusObject(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-43", "IntersectionStatusObject");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F73 || tag == 0xBF73) {
		try {
		    this.item7_44 = new IntersectionID(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-44", "IntersectionID");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F74) {
		try {
		    this.item7_45 = new AxleLocation(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-45", "AxleLocation");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F75) {
		try {
		    this.item7_46 = new AxleWeight(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-46", "AxleWeight");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F76) {
		try {
		    this.item7_47 = new CargoWeight(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-47", "CargoWeight");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F77) {
		try {
		    this.item7_48 = new DriveAxleLiftAirPressure(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-48", "DriveAxleLiftAirPressure");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F78) {
		try {
		    this.item7_49 = new DriveAxleLocation(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-49", "DriveAxleLocation");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F79) {
		try {
		    this.item7_50 = new DriveAxleLubePressure(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-50", "DriveAxleLubePressure");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F7A) {
		try {
		    this.item7_51 = new DriveAxleTemperature(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-51", "DriveAxleTemperature");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F7B) {
		try {
		    this.item7_52 = new SteeringAxleLubePressure(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-52", "SteeringAxleLubePressure");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F7C) {
		try {
		    this.item7_53 = new SteeringAxleTemperature(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-53", "SteeringAxleTemperature");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F7D) {
		try {
		    this.item7_54 = new TireLeakageRate(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-54", "TireLeakageRate");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F7E) {
		try {
		    this.item7_55 = new TireLocation(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-55", "TireLocation");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F7F) {
		try {
		    int idx1 = TirePressureThresholdDetection.indexOfValue(source.decodeLong());
		    this.item7_56 = (idx1 < 0) ? TirePressureThresholdDetection.unknownEnumerator() : TirePressureThresholdDetection.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-56", "TirePressureThresholdDetection");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8100) {
		try {
		    this.item7_57 = new TirePressure(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-57", "TirePressure");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8101) {
		try {
		    this.item7_58 = new TireTemp(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-58", "TireTemp");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8102) {
		try {
		    this.item7_59 = new TrailerWeight(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-59", "TrailerWeight");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8103 || tag == 0xBF8103) {
		try {
		    this.item7_60 = new WheelEndElectFault();
		    byte[] b = coder.decodeBitString(source);
		    this.item7_60.setValue(b, b.length * 8 - coder.getUnused());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-60", "WheelEndElectFault");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8104) {
		try {
		    int idx1 = WheelSensorStatus.indexOfValue(source.decodeInt());
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
		    this.item7_61 = WheelSensorStatus.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-61", "WheelSensorStatus");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8105) {
		try {
		    this.item7_62 = new LaneCount(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-62", "LaneCount");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8106) {
		try {
		    int idx1 = LaneManeuverCode.indexOfValue(source.decodeLong());
		    this.item7_63 = (idx1 < 0) ? LaneManeuverCode.unknownEnumerator() : LaneManeuverCode.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-63", "LaneManeuverCode");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8107 || tag == 0xBF8107) {
		try {
		    this.item7_64 = new LaneNumber(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-64", "LaneNumber");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8108 || tag == 0xBF8108) {
		try {
		    this.item7_65 = new LaneSet(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-65", "LaneSet");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8109) {
		try {
		    this.item7_66 = new LaneWidth(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-66", "LaneWidth");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F810A) {
		try {
		    this.item7_67 = new Latitude(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-67", "Latitude");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F810B) {
		try {
		    this.item7_68 = new LayerID(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-68", "LayerID");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F810C) {
		try {
		    int idx1 = LayerType.indexOfValue(source.decodeLong());
		    this.item7_69 = (idx1 < 0) ? LayerType.unknownEnumerator() : LayerType.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-69", "LayerType");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F810D) {
		try {
		    int idx1 = LightbarInUse.indexOfValue(source.decodeInt());
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
		    this.item7_70 = LightbarInUse.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-70", "LightbarInUse");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F810E) {
		try {
		    this.item7_71 = new Longitude(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-71", "Longitude");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F810F) {
		try {
		    int idx1 = Location_quality.indexOfValue(source.decodeInt());
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
		    this.item7_72 = Location_quality.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-72", "Location-quality");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8110) {
		try {
		    int idx1 = Location_tech.indexOfValue(source.decodeLong());
		    this.item7_73 = (idx1 < 0) ? Location_tech.unknownEnumerator() : Location_tech.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-73", "Location-tech");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8111) {
		try {
		    this.item7_74 = new MinuteOfTheYear(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-74", "MinuteOfTheYear");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8112) {
		try {
		    this.item7_75 = new MinutesDuration(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-75", "MinutesDuration");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8113) {
		try {
		    this.item7_76 = new MsgCount(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-76", "MsgCount");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8114 || tag == 0xBF8114) {
		try {
		    this.item7_77 = new MsgCRC(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-77", "MsgCRC");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8115) {
		try {
		    int idx1 = MultiVehicleResponse.indexOfValue(source.decodeInt());
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
		    this.item7_78 = MultiVehicleResponse.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-78", "MultiVehicleResponse");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8116) {
		try {
		    int idx1 = MUTCDCode.indexOfValue(source.decodeLong());
		    this.item7_79 = (idx1 < 0) ? MUTCDCode.unknownEnumerator() : MUTCDCode.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-79", "MUTCDCode");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8117) {
		try {
		    this.item7_80 = new NMEA_MsgType(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-80", "NMEA-MsgType");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8118 || tag == 0xBF8118) {
		try {
		    this.item7_81 = new NMEA_Payload(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-81", "NMEA-Payload");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8119) {
		try {
		    int idx1 = NMEA_Revision.indexOfValue(source.decodeLong());
		    this.item7_82 = (idx1 < 0) ? NMEA_Revision.unknownEnumerator() : NMEA_Revision.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-82", "NMEA-Revision");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F811A || tag == 0xBF811A) {
		try {
		    this.item7_83 = new NTCIPVehicleclass(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-83", "NTCIPVehicleclass");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F811B) {
		try {
		    this.item7_84 = new ObjectCount(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-84", "ObjectCount");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F811C) {
		try {
		    this.item7_85 = new ObstacleDirection(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-85", "ObstacleDirection");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F811D) {
		try {
		    this.item7_86 = new ObstacleDistance(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-86", "ObstacleDistance");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F811E || tag == 0xBF811E) {
		try {
		    this.item7_87 = new PayloadData(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-87", "PayloadData");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F811F || tag == 0xBF811F) {
		try {
		    this.item7_88 = new Payload(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-88", "Payload");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8120) {
		try {
		    int idx1 = PedestrianDetect.indexOfValue(source.decodeLong());
		    this.item7_89 = (idx1 < 0) ? PedestrianDetect.unknownEnumerator() : PedestrianDetect.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-89", "PedestrianDetect");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8121) {
		try {
		    int idx1 = PedestrianSignalState.indexOfValue(source.decodeLong());
		    this.item7_90 = (idx1 < 0) ? PedestrianSignalState.unknownEnumerator() : PedestrianSignalState.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-90", "PedestrianSignalState");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8122) {
		try {
		    int idx1 = PositionConfidence.indexOfValue(source.decodeInt());
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
		    this.item7_91 = PositionConfidence.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-91", "PositionConfidence");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8123) {
		try {
		    int idx1 = PreemptState.indexOfValue(source.decodeLong());
		    this.item7_92 = (idx1 < 0) ? PreemptState.unknownEnumerator() : PreemptState.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-92", "PreemptState");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8124 || tag == 0xBF8124) {
		try {
		    this.item7_93 = new Priority(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-93", "Priority");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8125) {
		try {
		    int idx1 = PriorityState.indexOfValue(source.decodeLong());
		    this.item7_94 = (idx1 < 0) ? PriorityState.unknownEnumerator() : PriorityState.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-94", "PriorityState");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8126) {
		try {
		    this.item7_95 = new ProbeSegmentNumber(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-95", "ProbeSegmentNumber");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8127) {
		try {
		    int idx1 = RainSensor.indexOfValue(source.decodeInt());
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
		    this.item7_96 = RainSensor.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-96", "RainSensor");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8128) {
		try {
		    int idx1 = RequestedItem.indexOfValue(source.decodeLong());
		    this.item7_97 = (idx1 < 0) ? RequestedItem.unknownEnumerator() : RequestedItem.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-97", "RequestedItem");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8129) {
		try {
		    int idx1 = ResponseType.indexOfValue(source.decodeInt());
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
		    this.item7_98 = ResponseType.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-98", "ResponseType");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F812A) {
		try {
		    this.item7_99 = new RTCM_ID(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-99", "RTCM-ID");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F812B || tag == 0xBF812B) {
		try {
		    this.item7_100 = new RTCM_Payload(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-100", "RTCM-Payload");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F812C) {
		try {
		    int idx1 = RTCM_Revision.indexOfValue(source.decodeLong());
		    this.item7_101 = (idx1 < 0) ? RTCM_Revision.unknownEnumerator() : RTCM_Revision.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-101", "RTCM-Revision");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F812D) {
		try {
		    this.item7_102 = new SignalLightState(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-102", "SignalLightState");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F812E || tag == 0xBF812E) {
		try {
		    this.item7_103 = new SignalReqScheme(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-103", "SignalReqScheme");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F812F || tag == 0xBF812F) {
		try {
		    this.item7_104 = new SignalState(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-104", "SignalState");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8130) {
		try {
		    this.item7_105 = new SignPrority(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-105", "SignPrority");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8131) {
		try {
		    int idx1 = SirenInUse.indexOfValue(source.decodeInt());
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
		    this.item7_106 = SirenInUse.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-106", "SirenInUse");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8132) {
		try {
		    int idx1 = SpecialLaneAttributes.indexOfValue(source.decodeInt());
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
		    this.item7_107 = SpecialLaneAttributes.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-107", "SpecialLaneAttributes");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8133) {
		try {
		    int idx1 = SpecialSignalState.indexOfValue(source.decodeLong());
		    this.item7_108 = (idx1 < 0) ? SpecialSignalState.unknownEnumerator() : SpecialSignalState.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-108", "SpecialSignalState");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8134) {
		try {
		    int idx1 = SpeedConfidence.indexOfValue(source.decodeInt());
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
		    this.item7_109 = SpeedConfidence.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-109", "SpeedConfidence");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8135) {
		try {
		    this.item7_110 = new Speed(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-110", "Speed");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8136) {
		try {
		    int idx1 = StabilityControlStatus.indexOfValue(source.decodeInt());
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
		    this.item7_111 = StabilityControlStatus.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-111", "StabilityControlStatus");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8137) {
		try {
		    int idx1 = StateConfidence.indexOfValue(source.decodeLong());
		    this.item7_112 = (idx1 < 0) ? StateConfidence.unknownEnumerator() : StateConfidence.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-112", "StateConfidence");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8138) {
		try {
		    int idx1 = SteeringWheelAngleConfidence.indexOfValue(source.decodeInt());
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
		    this.item7_113 = SteeringWheelAngleConfidence.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-113", "SteeringWheelAngleConfidence");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8139) {
		try {
		    this.item7_114 = new SteeringWheelAngleRateOfChange(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-114", "SteeringWheelAngleRateOfChange");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F813A || tag == 0xBF813A) {
		try {
		    this.item7_115 = new SteeringWheelAngle(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-115", "SteeringWheelAngle");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F813B) {
		try {
		    this.item7_116 = new SunSensor(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-116", "SunSensor");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F813C || tag == 0xBF813C) {
		try {
		    this.item7_117 = new TemporaryID(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-117", "TemporaryID");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F813D) {
		try {
		    this.item7_118 = new TermDistance(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-118", "TermDistance");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F813E) {
		try {
		    this.item7_119 = new TermTime(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-119", "TermTime");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F813F) {
		try {
		    int idx1 = ThrottleConfidence.indexOfValue(source.decodeInt());
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
		    this.item7_120 = ThrottleConfidence.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-120", "ThrottleConfidence");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8140) {
		try {
		    this.item7_121 = new ThrottlePosition(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-121", "ThrottlePosition");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8141) {
		try {
		    int idx1 = TimeConfidence.indexOfValue(source.decodeInt());
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
		    this.item7_122 = TimeConfidence.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-122", "TimeConfidence");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8142) {
		try {
		    this.item7_123 = new TimeMark(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-123", "TimeMark");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8143) {
		try {
		    int idx1 = TractionControlState.indexOfValue(source.decodeInt());
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
		    this.item7_124 = TractionControlState.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-124", "TractionControlState");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8144) {
		try {
		    int idx1 = TransitPreEmptionRequest.indexOfValue(source.decodeLong());
		    this.item7_125 = (idx1 < 0) ? TransitPreEmptionRequest.unknownEnumerator() : TransitPreEmptionRequest.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-125", "TransitPreEmptionRequest");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8145 || tag == 0xBF8145) {
		try {
		    this.item7_126 = new TransitStatus();
		    byte[] b = coder.decodeBitString(source);
		    this.item7_126.setValue(b, b.length * 8 - coder.getUnused());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-126", "TransitStatus");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8146) {
		try {
		    int idx1 = TransmissionState.indexOfValue(source.decodeLong());
		    this.item7_127 = (idx1 < 0) ? TransmissionState.unknownEnumerator() : TransmissionState.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-127", "TransmissionState");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8147) {
		try {
		    this.item7_128 = new TxTime(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-128", "TxTime");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8148) {
		try {
		    int idx1 = TravelerInfoType.indexOfValue(source.decodeLong());
		    this.item7_129 = (idx1 < 0) ? TravelerInfoType.unknownEnumerator() : TravelerInfoType.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-129", "TravelerInfoType");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8149 || tag == 0xBF8149) {
		try {
		    this.item7_130 = new UniqueMSGID(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-130", "UniqueMSGID");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F814A || tag == 0xBF814A) {
		try {
		    this.item7_131 = new URL_Base(coder.decodeChars(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-131", "URL-Base");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F814B || tag == 0xBF814B) {
		try {
		    this.item7_132 = new URL_Link(coder.decodeChars(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-132", "URL-Link");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F814C || tag == 0xBF814C) {
		try {
		    this.item7_133 = new URL_Short(coder.decodeChars(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-133", "URL-Short");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F814D) {
		try {
		    this.item7_134 = new VehicleHeight(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-134", "VehicleHeight");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F814E) {
		try {
		    this.item7_135 = new VehicleLaneAttributes(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-135", "VehicleLaneAttributes");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F814F) {
		try {
		    this.item7_136 = new VehicleLength(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-136", "VehicleLength");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8150) {
		try {
		    this.item7_137 = new VehicleMass(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-137", "VehicleMass");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8151 || tag == 0xBF8151) {
		try {
		    this.item7_138 = new VehicleRequestStatus(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-138", "VehicleRequestStatus");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8152) {
		try {
		    int idx1 = VehicleStatusDeviceTypeTag.indexOfValue(source.decodeLong());
		    this.item7_139 = (idx1 < 0) ? VehicleStatusDeviceTypeTag.unknownEnumerator() : VehicleStatusDeviceTypeTag.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-139", "VehicleStatusDeviceTypeTag");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8153) {
		try {
		    int idx1 = VehicleType.indexOfValue(source.decodeLong());
		    this.item7_140 = (idx1 < 0) ? VehicleType.unknownEnumerator() : VehicleType.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-140", "VehicleType");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8154) {
		try {
		    this.item7_141 = new VehicleWidth(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-141", "VehicleWidth");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8155 || tag == 0xBF8155) {
		try {
		    this.item7_142 = new VerticalAccelerationThreshold();
		    byte[] b = coder.decodeBitString(source);
		    this.item7_142.setValue(b, b.length * 8 - coder.getUnused());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-142", "VerticalAccelerationThreshold");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8156) {
		try {
		    this.item7_143 = new VerticalAcceleration(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-143", "VerticalAcceleration");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8157 || tag == 0xBF8157) {
		try {
		    this.item7_144 = new VINstring(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-144", "VINstring");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8158) {
		try {
		    this.item7_145 = new WiperRate(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-145", "WiperRate");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8159) {
		try {
		    int idx1 = WiperStatusFront.indexOfValue(source.decodeLong());
		    this.item7_146 = (idx1 < 0) ? WiperStatusFront.unknownEnumerator() : WiperStatusFront.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-146", "WiperStatusFront");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F815A) {
		try {
		    int idx1 = WiperStatusRear.indexOfValue(source.decodeLong());
		    this.item7_147 = (idx1 < 0) ? WiperStatusRear.unknownEnumerator() : WiperStatusRear.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-147", "WiperStatusRear");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F815B) {
		try {
		    int idx1 = YawRateConfidence.indexOfValue(source.decodeInt());
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
		    this.item7_148 = YawRateConfidence.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-148", "YawRateConfidence");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F815C) {
		try {
		    this.item7_149 = new YawRate(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item7-149", "YawRate");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F815D) {
		try {
		    int idx1 = com.bah.ode.asn.oss.itis.IncidentResponseEquipment.indexOfValue(source.decodeLong());
		    this.item8_1 = (idx1 < 0) ? com.bah.ode.asn.oss.itis.IncidentResponseEquipment.unknownEnumerator() : com.bah.ode.asn.oss.itis.IncidentResponseEquipment.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item8-1", "IncidentResponseEquipment");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F815E || tag == 0xBF815E) {
		try {
		    this.item8_2 = new com.bah.ode.asn.oss.itis.ITIStext(coder.decodeChars(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item8-2", "ITIStext");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F815F) {
		try {
		    int idx1 = com.bah.ode.asn.oss.itis.ResponderGroupAffected.indexOfValue(source.decodeLong());
		    this.item8_3 = (idx1 < 0) ? com.bah.ode.asn.oss.itis.ResponderGroupAffected.unknownEnumerator() : com.bah.ode.asn.oss.itis.ResponderGroupAffected.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item8-3", "ResponderGroupAffected");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8160) {
		try {
		    int idx1 = com.bah.ode.asn.oss.itis.VehicleGroupAffected.indexOfValue(source.decodeLong());
		    this.item8_4 = (idx1 < 0) ? com.bah.ode.asn.oss.itis.VehicleGroupAffected.unknownEnumerator() : com.bah.ode.asn.oss.itis.VehicleGroupAffected.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item8-4", "VehicleGroupAffected");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0xBF8161) {
		try {
		    this.item8_5 = new com.bah.ode.asn.oss.itis.ITIScodesAndText();
		    this.item8_5.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item8-5", "ITIScodesAndText");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8162) {
		try {
		    this.item8_6 = new com.bah.ode.asn.oss.ntcip.EssMobileFriction(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item8-6", "EssMobileFriction");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8163) {
		try {
		    this.item8_7 = new com.bah.ode.asn.oss.ntcip.EssPrecipRate(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item8-7", "EssPrecipRate");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8164) {
		try {
		    int idx1 = com.bah.ode.asn.oss.ntcip.EssPrecipSituation.indexOfValue(source.decodeInt());
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
		    this.item8_8 = com.bah.ode.asn.oss.ntcip.EssPrecipSituation.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item8-8", "EssPrecipSituation");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8165) {
		try {
		    int idx1 = com.bah.ode.asn.oss.ntcip.EssPrecipYesNo.indexOfValue(source.decodeInt());
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null);
		    this.item8_9 = com.bah.ode.asn.oss.ntcip.EssPrecipYesNo.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item8-9", "EssPrecipYesNo");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8166) {
		try {
		    this.item8_10 = new com.bah.ode.asn.oss.ntcip.EssSolarRadiation(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item8-10", "EssSolarRadiation");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x9F8167) {
		try {
		    this.item8_11 = new com.bah.ode.asn.oss.itis.ITIScodes(source.decodeLong());
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("item8-11", "ITIScodes");
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
		    ee.appendExtensionContext("AllInclusive", -1);
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
	AllInclusive temp0 = this;

	if (temp0.item8_11 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item8_11, sink), 0x9F8167);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item8-11", "ITIScodes");
		throw ee;
	    }
	}
	if (temp0.item8_10 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item8_10, sink), 0x9F8166);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item8-10", "EssSolarRadiation");
		throw ee;
	    }
	}
	if (temp0.item8_9 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item8_9, sink), 0x9F8165);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item8-9", "EssPrecipYesNo");
		throw ee;
	    }
	}
	if (temp0.item8_8 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item8_8, sink), 0x9F8164);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item8-8", "EssPrecipSituation");
		throw ee;
	    }
	}
	if (temp0.item8_7 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item8_7, sink), 0x9F8163);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item8-7", "EssPrecipRate");
		throw ee;
	    }
	}
	if (temp0.item8_6 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item8_6, sink), 0x9F8162);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item8-6", "EssMobileFriction");
		throw ee;
	    }
	}
	if (temp0.item8_5 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item8_5.encodeValue(coder, sink), 0xBF8161);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item8-5", "ITIScodesAndText");
		throw ee;
	    }
	}
	if (temp0.item8_4 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item8_4, sink), 0x9F8160);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item8-4", "VehicleGroupAffected");
		throw ee;
	    }
	}
	if (temp0.item8_3 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item8_3, sink), 0x9F815F);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item8-3", "ResponderGroupAffected");
		throw ee;
	    }
	}
	if (temp0.item8_2 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeString1(temp0.item8_2, sink), 0x9F815E);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item8-2", "ITIStext");
		throw ee;
	    }
	}
	if (temp0.item8_1 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item8_1, sink), 0x9F815D);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item8-1", "IncidentResponseEquipment");
		throw ee;
	    }
	}
	if (temp0.item7_149 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_149, sink), 0x9F815C);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-149", "YawRate");
		throw ee;
	    }
	}
	if (temp0.item7_148 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_148, sink), 0x9F815B);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-148", "YawRateConfidence");
		throw ee;
	    }
	}
	if (temp0.item7_147 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_147, sink), 0x9F815A);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-147", "WiperStatusRear");
		throw ee;
	    }
	}
	if (temp0.item7_146 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_146, sink), 0x9F8159);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-146", "WiperStatusFront");
		throw ee;
	    }
	}
	if (temp0.item7_145 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_145, sink), 0x9F8158);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-145", "WiperRate");
		throw ee;
	    }
	}
	if (temp0.item7_144 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_144.byteArrayValue()), 0x9F8157);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-144", "VINstring");
		throw ee;
	    }
	}
	if (temp0.item7_143 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_143, sink), 0x9F8156);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-143", "VerticalAcceleration");
		throw ee;
	    }
	}
	if (temp0.item7_142 != null) {
	    try {
		int bitsToTransfer = com.oss.util.BitTool.truncateTrailingZeroes(temp0.item7_142);
		len0 += sink.encodeLengthTag(coder.encodeBitString(temp0.item7_142, sink, bitsToTransfer), 0x9F8155);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-142", "VerticalAccelerationThreshold");
		throw ee;
	    }
	}
	if (temp0.item7_141 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_141, sink), 0x9F8154);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-141", "VehicleWidth");
		throw ee;
	    }
	}
	if (temp0.item7_140 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_140, sink), 0x9F8153);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-140", "VehicleType");
		throw ee;
	    }
	}
	if (temp0.item7_139 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_139, sink), 0x9F8152);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-139", "VehicleStatusDeviceTypeTag");
		throw ee;
	    }
	}
	if (temp0.item7_138 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_138.byteArrayValue()), 0x9F8151);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-138", "VehicleRequestStatus");
		throw ee;
	    }
	}
	if (temp0.item7_137 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_137, sink), 0x9F8150);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-137", "VehicleMass");
		throw ee;
	    }
	}
	if (temp0.item7_136 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_136, sink), 0x9F814F);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-136", "VehicleLength");
		throw ee;
	    }
	}
	if (temp0.item7_135 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_135, sink), 0x9F814E);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-135", "VehicleLaneAttributes");
		throw ee;
	    }
	}
	if (temp0.item7_134 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_134, sink), 0x9F814D);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-134", "VehicleHeight");
		throw ee;
	    }
	}
	if (temp0.item7_133 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeString1(temp0.item7_133, sink), 0x9F814C);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-133", "URL-Short");
		throw ee;
	    }
	}
	if (temp0.item7_132 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeString1(temp0.item7_132, sink), 0x9F814B);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-132", "URL-Link");
		throw ee;
	    }
	}
	if (temp0.item7_131 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeString1(temp0.item7_131, sink), 0x9F814A);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-131", "URL-Base");
		throw ee;
	    }
	}
	if (temp0.item7_130 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_130.byteArrayValue()), 0x9F8149);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-130", "UniqueMSGID");
		throw ee;
	    }
	}
	if (temp0.item7_129 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_129, sink), 0x9F8148);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-129", "TravelerInfoType");
		throw ee;
	    }
	}
	if (temp0.item7_128 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_128, sink), 0x9F8147);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-128", "TxTime");
		throw ee;
	    }
	}
	if (temp0.item7_127 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_127, sink), 0x9F8146);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-127", "TransmissionState");
		throw ee;
	    }
	}
	if (temp0.item7_126 != null) {
	    try {
		int bitsToTransfer = (temp0.item7_126.getSize() < 6) ? 6
		    : com.oss.util.BitTool.computeMinimalLength(temp0.item7_126, temp0.item7_126._cBounds_);
		len0 += sink.encodeLengthTag(coder.encodeBitString(temp0.item7_126, sink, bitsToTransfer), 0x9F8145);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-126", "TransitStatus");
		throw ee;
	    }
	}
	if (temp0.item7_125 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_125, sink), 0x9F8144);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-125", "TransitPreEmptionRequest");
		throw ee;
	    }
	}
	if (temp0.item7_124 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_124, sink), 0x9F8143);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-124", "TractionControlState");
		throw ee;
	    }
	}
	if (temp0.item7_123 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_123, sink), 0x9F8142);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-123", "TimeMark");
		throw ee;
	    }
	}
	if (temp0.item7_122 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_122, sink), 0x9F8141);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-122", "TimeConfidence");
		throw ee;
	    }
	}
	if (temp0.item7_121 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_121, sink), 0x9F8140);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-121", "ThrottlePosition");
		throw ee;
	    }
	}
	if (temp0.item7_120 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_120, sink), 0x9F813F);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-120", "ThrottleConfidence");
		throw ee;
	    }
	}
	if (temp0.item7_119 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_119, sink), 0x9F813E);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-119", "TermTime");
		throw ee;
	    }
	}
	if (temp0.item7_118 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_118, sink), 0x9F813D);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-118", "TermDistance");
		throw ee;
	    }
	}
	if (temp0.item7_117 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_117.byteArrayValue()), 0x9F813C);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-117", "TemporaryID");
		throw ee;
	    }
	}
	if (temp0.item7_116 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_116, sink), 0x9F813B);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-116", "SunSensor");
		throw ee;
	    }
	}
	if (temp0.item7_115 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_115.byteArrayValue()), 0x9F813A);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-115", "SteeringWheelAngle");
		throw ee;
	    }
	}
	if (temp0.item7_114 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_114, sink), 0x9F8139);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-114", "SteeringWheelAngleRateOfChange");
		throw ee;
	    }
	}
	if (temp0.item7_113 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_113, sink), 0x9F8138);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-113", "SteeringWheelAngleConfidence");
		throw ee;
	    }
	}
	if (temp0.item7_112 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_112, sink), 0x9F8137);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-112", "StateConfidence");
		throw ee;
	    }
	}
	if (temp0.item7_111 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_111, sink), 0x9F8136);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-111", "StabilityControlStatus");
		throw ee;
	    }
	}
	if (temp0.item7_110 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_110, sink), 0x9F8135);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-110", "Speed");
		throw ee;
	    }
	}
	if (temp0.item7_109 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_109, sink), 0x9F8134);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-109", "SpeedConfidence");
		throw ee;
	    }
	}
	if (temp0.item7_108 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_108, sink), 0x9F8133);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-108", "SpecialSignalState");
		throw ee;
	    }
	}
	if (temp0.item7_107 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_107, sink), 0x9F8132);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-107", "SpecialLaneAttributes");
		throw ee;
	    }
	}
	if (temp0.item7_106 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_106, sink), 0x9F8131);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-106", "SirenInUse");
		throw ee;
	    }
	}
	if (temp0.item7_105 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_105, sink), 0x9F8130);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-105", "SignPrority");
		throw ee;
	    }
	}
	if (temp0.item7_104 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_104.byteArrayValue()), 0x9F812F);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-104", "SignalState");
		throw ee;
	    }
	}
	if (temp0.item7_103 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_103.byteArrayValue()), 0x9F812E);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-103", "SignalReqScheme");
		throw ee;
	    }
	}
	if (temp0.item7_102 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_102, sink), 0x9F812D);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-102", "SignalLightState");
		throw ee;
	    }
	}
	if (temp0.item7_101 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_101, sink), 0x9F812C);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-101", "RTCM-Revision");
		throw ee;
	    }
	}
	if (temp0.item7_100 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_100.byteArrayValue()), 0x9F812B);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-100", "RTCM-Payload");
		throw ee;
	    }
	}
	if (temp0.item7_99 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_99, sink), 0x9F812A);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-99", "RTCM-ID");
		throw ee;
	    }
	}
	if (temp0.item7_98 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_98, sink), 0x9F8129);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-98", "ResponseType");
		throw ee;
	    }
	}
	if (temp0.item7_97 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_97, sink), 0x9F8128);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-97", "RequestedItem");
		throw ee;
	    }
	}
	if (temp0.item7_96 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_96, sink), 0x9F8127);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-96", "RainSensor");
		throw ee;
	    }
	}
	if (temp0.item7_95 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_95, sink), 0x9F8126);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-95", "ProbeSegmentNumber");
		throw ee;
	    }
	}
	if (temp0.item7_94 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_94, sink), 0x9F8125);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-94", "PriorityState");
		throw ee;
	    }
	}
	if (temp0.item7_93 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_93.byteArrayValue()), 0x9F8124);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-93", "Priority");
		throw ee;
	    }
	}
	if (temp0.item7_92 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_92, sink), 0x9F8123);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-92", "PreemptState");
		throw ee;
	    }
	}
	if (temp0.item7_91 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_91, sink), 0x9F8122);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-91", "PositionConfidence");
		throw ee;
	    }
	}
	if (temp0.item7_90 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_90, sink), 0x9F8121);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-90", "PedestrianSignalState");
		throw ee;
	    }
	}
	if (temp0.item7_89 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_89, sink), 0x9F8120);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-89", "PedestrianDetect");
		throw ee;
	    }
	}
	if (temp0.item7_88 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_88.byteArrayValue()), 0x9F811F);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-88", "Payload");
		throw ee;
	    }
	}
	if (temp0.item7_87 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_87.byteArrayValue()), 0x9F811E);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-87", "PayloadData");
		throw ee;
	    }
	}
	if (temp0.item7_86 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_86, sink), 0x9F811D);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-86", "ObstacleDistance");
		throw ee;
	    }
	}
	if (temp0.item7_85 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_85, sink), 0x9F811C);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-85", "ObstacleDirection");
		throw ee;
	    }
	}
	if (temp0.item7_84 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_84, sink), 0x9F811B);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-84", "ObjectCount");
		throw ee;
	    }
	}
	if (temp0.item7_83 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_83.byteArrayValue()), 0x9F811A);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-83", "NTCIPVehicleclass");
		throw ee;
	    }
	}
	if (temp0.item7_82 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_82, sink), 0x9F8119);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-82", "NMEA-Revision");
		throw ee;
	    }
	}
	if (temp0.item7_81 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_81.byteArrayValue()), 0x9F8118);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-81", "NMEA-Payload");
		throw ee;
	    }
	}
	if (temp0.item7_80 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_80, sink), 0x9F8117);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-80", "NMEA-MsgType");
		throw ee;
	    }
	}
	if (temp0.item7_79 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_79, sink), 0x9F8116);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-79", "MUTCDCode");
		throw ee;
	    }
	}
	if (temp0.item7_78 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_78, sink), 0x9F8115);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-78", "MultiVehicleResponse");
		throw ee;
	    }
	}
	if (temp0.item7_77 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_77.byteArrayValue()), 0x9F8114);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-77", "MsgCRC");
		throw ee;
	    }
	}
	if (temp0.item7_76 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_76, sink), 0x9F8113);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-76", "MsgCount");
		throw ee;
	    }
	}
	if (temp0.item7_75 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_75, sink), 0x9F8112);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-75", "MinutesDuration");
		throw ee;
	    }
	}
	if (temp0.item7_74 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_74, sink), 0x9F8111);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-74", "MinuteOfTheYear");
		throw ee;
	    }
	}
	if (temp0.item7_73 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_73, sink), 0x9F8110);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-73", "Location-tech");
		throw ee;
	    }
	}
	if (temp0.item7_72 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_72, sink), 0x9F810F);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-72", "Location-quality");
		throw ee;
	    }
	}
	if (temp0.item7_71 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_71, sink), 0x9F810E);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-71", "Longitude");
		throw ee;
	    }
	}
	if (temp0.item7_70 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_70, sink), 0x9F810D);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-70", "LightbarInUse");
		throw ee;
	    }
	}
	if (temp0.item7_69 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_69, sink), 0x9F810C);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-69", "LayerType");
		throw ee;
	    }
	}
	if (temp0.item7_68 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_68, sink), 0x9F810B);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-68", "LayerID");
		throw ee;
	    }
	}
	if (temp0.item7_67 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_67, sink), 0x9F810A);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-67", "Latitude");
		throw ee;
	    }
	}
	if (temp0.item7_66 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_66, sink), 0x9F8109);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-66", "LaneWidth");
		throw ee;
	    }
	}
	if (temp0.item7_65 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_65.byteArrayValue()), 0x9F8108);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-65", "LaneSet");
		throw ee;
	    }
	}
	if (temp0.item7_64 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_64.byteArrayValue()), 0x9F8107);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-64", "LaneNumber");
		throw ee;
	    }
	}
	if (temp0.item7_63 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_63, sink), 0x9F8106);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-63", "LaneManeuverCode");
		throw ee;
	    }
	}
	if (temp0.item7_62 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_62, sink), 0x9F8105);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-62", "LaneCount");
		throw ee;
	    }
	}
	if (temp0.item7_61 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_61, sink), 0x9F8104);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-61", "WheelSensorStatus");
		throw ee;
	    }
	}
	if (temp0.item7_60 != null) {
	    try {
		int bitsToTransfer = com.oss.util.BitTool.truncateTrailingZeroes(temp0.item7_60);
		len0 += sink.encodeLengthTag(coder.encodeBitString(temp0.item7_60, sink, bitsToTransfer), 0x9F8103);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-60", "WheelEndElectFault");
		throw ee;
	    }
	}
	if (temp0.item7_59 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_59, sink), 0x9F8102);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-59", "TrailerWeight");
		throw ee;
	    }
	}
	if (temp0.item7_58 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_58, sink), 0x9F8101);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-58", "TireTemp");
		throw ee;
	    }
	}
	if (temp0.item7_57 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_57, sink), 0x9F8100);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-57", "TirePressure");
		throw ee;
	    }
	}
	if (temp0.item7_56 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_56, sink), 0x9F7F);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-56", "TirePressureThresholdDetection");
		throw ee;
	    }
	}
	if (temp0.item7_55 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_55, sink), 0x9F7E);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-55", "TireLocation");
		throw ee;
	    }
	}
	if (temp0.item7_54 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_54, sink), 0x9F7D);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-54", "TireLeakageRate");
		throw ee;
	    }
	}
	if (temp0.item7_53 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_53, sink), 0x9F7C);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-53", "SteeringAxleTemperature");
		throw ee;
	    }
	}
	if (temp0.item7_52 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_52, sink), 0x9F7B);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-52", "SteeringAxleLubePressure");
		throw ee;
	    }
	}
	if (temp0.item7_51 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_51, sink), 0x9F7A);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-51", "DriveAxleTemperature");
		throw ee;
	    }
	}
	if (temp0.item7_50 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_50, sink), 0x9F79);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-50", "DriveAxleLubePressure");
		throw ee;
	    }
	}
	if (temp0.item7_49 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_49, sink), 0x9F78);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-49", "DriveAxleLocation");
		throw ee;
	    }
	}
	if (temp0.item7_48 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_48, sink), 0x9F77);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-48", "DriveAxleLiftAirPressure");
		throw ee;
	    }
	}
	if (temp0.item7_47 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_47, sink), 0x9F76);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-47", "CargoWeight");
		throw ee;
	    }
	}
	if (temp0.item7_46 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_46, sink), 0x9F75);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-46", "AxleWeight");
		throw ee;
	    }
	}
	if (temp0.item7_45 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_45, sink), 0x9F74);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-45", "AxleLocation");
		throw ee;
	    }
	}
	if (temp0.item7_44 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_44.byteArrayValue()), 0x9F73);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-44", "IntersectionID");
		throw ee;
	    }
	}
	if (temp0.item7_43 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_43.byteArrayValue()), 0x9F72);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-43", "IntersectionStatusObject");
		throw ee;
	    }
	}
	if (temp0.item7_42 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_42.byteArrayValue()), 0x9F71);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-42", "HeadingSlice");
		throw ee;
	    }
	}
	if (temp0.item7_41 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_41, sink), 0x9F70);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-41", "Heading");
		throw ee;
	    }
	}
	if (temp0.item7_40 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_40, sink), 0x9F6F);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-40", "HeadingConfidence");
		throw ee;
	    }
	}
	if (temp0.item7_39 != null) {
	    try {
		int bitsToTransfer = com.oss.util.BitTool.truncateTrailingZeroes(temp0.item7_39);
		len0 += sink.encodeLengthTag(coder.encodeBitString(temp0.item7_39, sink, bitsToTransfer), 0x9F6E);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-39", "GPSstatus");
		throw ee;
	    }
	}
	if (temp0.item7_38 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_38.byteArrayValue()), 0x9F6D);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-38", "FurtherInfoID");
		throw ee;
	    }
	}
	if (temp0.item7_37 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_37, sink), 0x9F6C);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-37", "ExteriorLights");
		throw ee;
	    }
	}
	if (temp0.item7_36 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_36, sink), 0x9F6B);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-36", "Extent");
		throw ee;
	    }
	}
	if (temp0.item7_35 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_35, sink), 0x9F6A);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-35", "EventFlags");
		throw ee;
	    }
	}
	if (temp0.item7_34 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_34, sink), 0x9F69);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-34", "EmergencyDetails");
		throw ee;
	    }
	}
	if (temp0.item7_33 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_33.byteArrayValue()), 0x9F68);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-33", "Elevation");
		throw ee;
	    }
	}
	if (temp0.item7_32 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_32, sink), 0x9F67);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-32", "ElevationConfidence");
		throw ee;
	    }
	}
	if (temp0.item7_31 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_31, sink), 0x9F66);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-31", "DYear");
		throw ee;
	    }
	}
	if (temp0.item7_30 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_30, sink), 0x9F65);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-30", "DSRCmsgID");
		throw ee;
	    }
	}
	if (temp0.item7_29 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_29, sink), 0x9F64);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-29", "DSignalSeconds");
		throw ee;
	    }
	}
	if (temp0.item7_28 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_28, sink), 0x9F63);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-28", "DSecond");
		throw ee;
	    }
	}
	if (temp0.item7_27 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_27, sink), 0x9F62);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-27", "DrivingWheelAngle");
		throw ee;
	    }
	}
	if (temp0.item7_26 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_26, sink), 0x9F61);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-26", "DrivenLineOffset");
		throw ee;
	    }
	}
	if (temp0.item7_25 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_25, sink), 0x9F60);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-25", "DOffset");
		throw ee;
	    }
	}
	if (temp0.item7_24 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_24, sink), 0x9F5F);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-24", "DMonth");
		throw ee;
	    }
	}
	if (temp0.item7_23 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_23, sink), 0x9F5E);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-23", "DMinute");
		throw ee;
	    }
	}
	if (temp0.item7_22 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_22, sink), 0x9F5D);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-22", "DirectionOfUse");
		throw ee;
	    }
	}
	if (temp0.item7_21 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_21, sink), 0x9F5C);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-21", "DHour");
		throw ee;
	    }
	}
	if (temp0.item7_20 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeString1(temp0.item7_20, sink), 0x9F5B);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-20", "DescriptiveName");
		throw ee;
	    }
	}
	if (temp0.item7_19 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_19, sink), 0x9F5A);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-19", "DDay");
		throw ee;
	    }
	}
	if (temp0.item7_18 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_18, sink), 0x9F59);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-18", "CrosswalkLaneAttributes");
		throw ee;
	    }
	}
	if (temp0.item7_17 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_17, sink), 0x9F58);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-17", "Count");
		throw ee;
	    }
	}
	if (temp0.item7_16 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_16, sink), 0x9F57);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-16", "ColorState");
		throw ee;
	    }
	}
	if (temp0.item7_15 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_15, sink), 0x9F56);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-15", "CoefficientOfFriction");
		throw ee;
	    }
	}
	if (temp0.item7_14 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item7_14.byteArrayValue()), 0x9F55);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-14", "CodeWord");
		throw ee;
	    }
	}
	if (temp0.item7_13 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_13, sink), 0x9F54);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-13", "BumperHeightRear");
		throw ee;
	    }
	}
	if (temp0.item7_12 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_12, sink), 0x9F53);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-12", "BumperHeightFront");
		throw ee;
	    }
	}
	if (temp0.item7_11 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_11, sink), 0x9F52);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-11", "BrakeBoostApplied");
		throw ee;
	    }
	}
	if (temp0.item7_10 != null) {
	    try {
		int bitsToTransfer = com.oss.util.BitTool.truncateTrailingZeroes(temp0.item7_10);
		len0 += sink.encodeLengthTag(coder.encodeBitString(temp0.item7_10, sink, bitsToTransfer), 0x9F51);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-10", "BrakeAppliedStatus");
		throw ee;
	    }
	}
	if (temp0.item7_9 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_9, sink), 0x9F50);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-9", "BrakeAppliedPressure");
		throw ee;
	    }
	}
	if (temp0.item7_8 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_8, sink), 0x9F4F);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-8", "BarrierAttributes");
		throw ee;
	    }
	}
	if (temp0.item7_7 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_7, sink), 0x9F4E);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-7", "AuxiliaryBrakeStatus");
		throw ee;
	    }
	}
	if (temp0.item7_6 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_6, sink), 0x9F4D);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-6", "ApproachNumber");
		throw ee;
	    }
	}
	if (temp0.item7_5 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_5, sink), 0x9F4C);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-5", "AntiLockBrakeStatus");
		throw ee;
	    }
	}
	if (temp0.item7_4 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_4, sink), 0x9F4B);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-4", "AmbientAirTemperature");
		throw ee;
	    }
	}
	if (temp0.item7_3 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_3, sink), 0x9F4A);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-3", "AmbientAirPressure");
		throw ee;
	    }
	}
	if (temp0.item7_2 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.item7_2, sink), 0x9F49);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-2", "AccelerationConfidence");
		throw ee;
	    }
	}
	if (temp0.item7_1 != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.item7_1, sink), 0x9F48);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-1", "Acceleration");
		throw ee;
	    }
	}
	if (temp0.item6_73 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_73.encodeValue(coder, sink), 0xBF47);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-73", "WiperStatus");
		throw ee;
	    }
	}
	if (temp0.item6_72 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_72.encodeValue(coder, sink), 0xBF46);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-72", "VehicleStatus");
		throw ee;
	    }
	}
	if (temp0.item6_71 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_71.encodeValue(coder, sink), 0xBF45);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-71", "VehicleStatusRequest");
		throw ee;
	    }
	}
	if (temp0.item6_70 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_70.encodeValue(coder, sink), 0xBF44);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-70", "VehicleSize");
		throw ee;
	    }
	}
	if (temp0.item6_69 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_69.encodeValue(coder, sink), 0xBF43);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-69", "VehicleSafetyExtension");
		throw ee;
	    }
	}
	if (temp0.item6_68 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_68.encodeValue(coder, sink), 0xBF42);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-68", "VehicleReferenceLane");
		throw ee;
	    }
	}
	if (temp0.item6_67 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_67.encodeValue(coder, sink), 0xBF41);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-67", "VehicleIdent");
		throw ee;
	    }
	}
	if (temp0.item6_66 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_66.encodeValue(coder, sink), 0xBF40);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-66", "VehicleComputedLane");
		throw ee;
	    }
	}
	if (temp0.item6_65 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_65.encodeValue(coder, sink), 0xBF3F);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-65", "ValidRegion");
		throw ee;
	    }
	}
	if (temp0.item6_64 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item6_64.byteArrayValue()), 0x9F3E);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-64", "TransmissionAndSpeed");
		throw ee;
	    }
	}
	if (temp0.item6_63 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item6_63.byteArrayValue()), 0x9F3D);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-63", "SpeedandHeadingandThrottleConfidence");
		throw ee;
	    }
	}
	if (temp0.item6_62 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_62.encodeValue(coder, sink), 0xBF3C);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-62", "SpecialLane");
		throw ee;
	    }
	}
	if (temp0.item6_61 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_61.encodeValue(coder, sink), 0xBF3B);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-61", "SnapshotTime");
		throw ee;
	    }
	}
	if (temp0.item6_60 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_60.encodeValue(coder, sink), 0xBF3A);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-60", "Snapshot");
		throw ee;
	    }
	}
	if (temp0.item6_59 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_59.encodeValue(coder, sink), 0xBF39);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-59", "SnapshotDistance");
		throw ee;
	    }
	}
	if (temp0.item6_58 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_58.encodeValue(coder, sink), 0xBF38);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-58", "SignalRequest");
		throw ee;
	    }
	}
	if (temp0.item6_57 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_57.encodeValue(coder, sink), 0xBF37);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-57", "SignalControlZone");
		throw ee;
	    }
	}
	if (temp0.item6_56 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_56.encodeValue(coder, sink), 0xBF36);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-56", "ShapePointSet");
		throw ee;
	    }
	}
	if (temp0.item6_55 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_55.encodeValue(coder, sink), 0xBF35);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-55", "Sample");
		throw ee;
	    }
	}
	if (temp0.item6_54 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_54.encodeValue(coder, sink), 0xBF34);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-54", "RTCMPackage");
		throw ee;
	    }
	}
	if (temp0.item6_53 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_53.encodeValue(coder, sink), 0xBF33);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-53", "RTCMmsg");
		throw ee;
	    }
	}
	if (temp0.item6_52 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item6_52.byteArrayValue()), 0x9F32);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-52", "RTCMHeader");
		throw ee;
	    }
	}
	if (temp0.item6_51 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_51.encodeValue(coder, sink), 0xBF31);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-51", "RoadSignID");
		throw ee;
	    }
	}
	if (temp0.item6_50 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_50.encodeValue(coder, sink), 0xBF30);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-50", "RegionPointSet");
		throw ee;
	    }
	}
	if (temp0.item6_49 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_49.encodeValue(coder, sink), 0xBF2F);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-49", "RegionOffsets");
		throw ee;
	    }
	}
	if (temp0.item6_48 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_48.encodeValue(coder, sink), 0xBF2E);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-48", "RegionList");
		throw ee;
	    }
	}
	if (temp0.item6_47 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item6_47.byteArrayValue()), 0x9F2D);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-47", "PositionConfidenceSet");
		throw ee;
	    }
	}
	if (temp0.item6_46 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item6_46.byteArrayValue()), 0x9F2C);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-46", "PositionalAccuracy");
		throw ee;
	    }
	}
	if (temp0.item6_45 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_45.encodeValue(coder, sink), 0xBF2B);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-45", "Position3D");
		throw ee;
	    }
	}
	if (temp0.item6_44 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_44.encodeValue(coder, sink), 0xBF2A);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-44", "PathPrediction");
		throw ee;
	    }
	}
	if (temp0.item6_43 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item6_43.byteArrayValue()), 0x9F29);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-43", "PathHistoryPointType-10");
		throw ee;
	    }
	}
	if (temp0.item6_42 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item6_42.byteArrayValue()), 0x9F28);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-42", "PathHistoryPointType-09");
		throw ee;
	    }
	}
	if (temp0.item6_41 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item6_41.byteArrayValue()), 0x9F27);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-41", "PathHistoryPointType-08");
		throw ee;
	    }
	}
	if (temp0.item6_40 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item6_40.byteArrayValue()), 0x9F26);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-40", "PathHistoryPointType-07");
		throw ee;
	    }
	}
	if (temp0.item6_39 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item6_39.byteArrayValue()), 0x9F25);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-39", "PathHistoryPointType-06");
		throw ee;
	    }
	}
	if (temp0.item6_38 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item6_38.byteArrayValue()), 0x9F24);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-38", "PathHistoryPointType-05");
		throw ee;
	    }
	}
	if (temp0.item6_37 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item6_37.byteArrayValue()), 0x9F23);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-37", "PathHistoryPointType-04");
		throw ee;
	    }
	}
	if (temp0.item6_36 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item6_36.byteArrayValue()), 0x9F22);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-36", "PathHistoryPointType-03");
		throw ee;
	    }
	}
	if (temp0.item6_35 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item6_35.byteArrayValue()), 0x9F21);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-35", "PathHistoryPointType-02");
		throw ee;
	    }
	}
	if (temp0.item6_34 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_34.encodeValue(coder, sink), 0xBF20);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-34", "PathHistoryPointType-01");
		throw ee;
	    }
	}
	if (temp0.item6_33 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_33.encodeValue(coder, sink), 0xBF1F);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-33", "PathHistory");
		throw ee;
	    }
	}
	if (temp0.item6_32 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item6_32.byteArrayValue()), 0x9E);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-32", "Offsets");
		throw ee;
	    }
	}
	if (temp0.item6_31 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_31.encodeValue(coder, sink), 0xBD);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-31", "NodeList");
		throw ee;
	    }
	}
	if (temp0.item6_30 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_30.encodeValue(coder, sink), 0xBC);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-30", "MovementState");
		throw ee;
	    }
	}
	if (temp0.item6_29 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_29.encodeValue(coder, sink), 0xBB);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-29", "J1939data");
		throw ee;
	    }
	}
	if (temp0.item6_28 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_28.encodeValue(coder, sink), 0xBA);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-28", "WorkZone");
		throw ee;
	    }
	}
	if (temp0.item6_27 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_27.encodeValue(coder, sink), 0xB9);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-27", "SpeedLimit");
		throw ee;
	    }
	}
	if (temp0.item6_26 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_26.encodeValue(coder, sink), 0xB8);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-26", "GenericSignage");
		throw ee;
	    }
	}
	if (temp0.item6_25 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_25.encodeValue(coder, sink), 0xB7);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-25", "ExitService");
		throw ee;
	    }
	}
	if (temp0.item6_24 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_24.encodeValue(coder, sink), 0xB6);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-24", "IntersectionState");
		throw ee;
	    }
	}
	if (temp0.item6_23 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_23.encodeValue(coder, sink), 0xB5);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-23", "Intersection");
		throw ee;
	    }
	}
	if (temp0.item6_22 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_22.encodeValue(coder, sink), 0xB4);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-22", "FullPositionVector");
		throw ee;
	    }
	}
	if (temp0.item6_21 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_21.encodeValue(coder, sink), 0xB3);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-21", "DYearMonth");
		throw ee;
	    }
	}
	if (temp0.item6_20 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_20.encodeValue(coder, sink), 0xB2);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-20", "DTime");
		throw ee;
	    }
	}
	if (temp0.item6_19 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_19.encodeValue(coder, sink), 0xB1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-19", "DMonthDay");
		throw ee;
	    }
	}
	if (temp0.item6_18 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_18.encodeValue(coder, sink), 0xB0);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-18", "DFullTime");
		throw ee;
	    }
	}
	if (temp0.item6_17 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_17.encodeValue(coder, sink), 0xAF);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-17", "DDateTime");
		throw ee;
	    }
	}
	if (temp0.item6_16 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_16.encodeValue(coder, sink), 0xAE);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-16", "DDate");
		throw ee;
	    }
	}
	if (temp0.item6_15 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_15.encodeValue(coder, sink), 0xAD);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-15", "DataParameters");
		throw ee;
	    }
	}
	if (temp0.item6_14 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_14.encodeValue(coder, sink), 0xAC);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-14", "CrosswalkLane");
		throw ee;
	    }
	}
	if (temp0.item6_13 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item6_13.byteArrayValue()), 0x8B);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-13", "ConnectsTo");
		throw ee;
	    }
	}
	if (temp0.item6_12 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_12.encodeValue(coder, sink), 0xAA);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-12", "ConfidenceSet");
		throw ee;
	    }
	}
	if (temp0.item6_11 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_11.encodeValue(coder, sink), 0xA9);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-11", "Circle");
		throw ee;
	    }
	}
	if (temp0.item6_10 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_10.encodeValue(coder, sink), 0xA8);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-10", "BumperHeights");
		throw ee;
	    }
	}
	if (temp0.item6_9 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item6_9.byteArrayValue()), 0x87);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-9", "BSMblob");
		throw ee;
	    }
	}
	if (temp0.item6_8 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item6_8.byteArrayValue()), 0x86);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-8", "BrakeSystemStatus");
		throw ee;
	    }
	}
	if (temp0.item6_7 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_7.encodeValue(coder, sink), 0xA5);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-7", "BarrierLane");
		throw ee;
	    }
	}
	if (temp0.item6_6 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_6.encodeValue(coder, sink), 0xA4);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-6", "ApproachObject");
		throw ee;
	    }
	}
	if (temp0.item6_5 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_5.encodeValue(coder, sink), 0xA3);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-5", "Approach");
		throw ee;
	    }
	}
	if (temp0.item6_4 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item6_4.byteArrayValue()), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-4", "AntennaOffsetSet");
		throw ee;
	    }
	}
	if (temp0.item6_2 != null) {
	    try {
		len0 += sink.encodeLengthTag(temp0.item6_2.encodeValue(coder, sink), 0xA1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-2", "AccelSteerYawRateConfidence");
		throw ee;
	    }
	}
	if (temp0.item6_1 != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.item6_1.byteArrayValue()), 0x80);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-1", "AccelerationSet4Way");
		throw ee;
	    }
	}

	return len0;
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, AllInclusive data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	boolean has_item6_10 = data.item6_1 != null;
	boolean has_item6_20 = data.item6_2 != null;
	boolean has_item6_40 = data.item6_4 != null;
	boolean has_item6_50 = data.item6_5 != null;
	boolean has_item6_60 = data.item6_6 != null;
	boolean has_item6_70 = data.item6_7 != null;
	boolean has_item6_80 = data.item6_8 != null;
	boolean has_item6_90 = data.item6_9 != null;
	boolean has_item6_100 = data.item6_10 != null;
	boolean has_item6_110 = data.item6_11 != null;
	boolean has_item6_120 = data.item6_12 != null;
	boolean has_item6_130 = data.item6_13 != null;
	boolean has_item6_140 = data.item6_14 != null;
	boolean has_item6_150 = data.item6_15 != null;
	boolean has_item6_160 = data.item6_16 != null;
	boolean has_item6_170 = data.item6_17 != null;
	boolean has_item6_180 = data.item6_18 != null;
	boolean has_item6_190 = data.item6_19 != null;
	boolean has_item6_200 = data.item6_20 != null;
	boolean has_item6_210 = data.item6_21 != null;
	boolean has_item6_220 = data.item6_22 != null;
	boolean has_item6_230 = data.item6_23 != null;
	boolean has_item6_240 = data.item6_24 != null;
	boolean has_item6_250 = data.item6_25 != null;
	boolean has_item6_260 = data.item6_26 != null;
	boolean has_item6_270 = data.item6_27 != null;
	boolean has_item6_280 = data.item6_28 != null;
	boolean has_item6_290 = data.item6_29 != null;
	boolean has_item6_300 = data.item6_30 != null;
	boolean has_item6_310 = data.item6_31 != null;
	boolean has_item6_320 = data.item6_32 != null;
	boolean has_item6_330 = data.item6_33 != null;
	boolean has_item6_340 = data.item6_34 != null;
	boolean has_item6_350 = data.item6_35 != null;
	boolean has_item6_360 = data.item6_36 != null;
	boolean has_item6_370 = data.item6_37 != null;
	boolean has_item6_380 = data.item6_38 != null;
	boolean has_item6_390 = data.item6_39 != null;
	boolean has_item6_400 = data.item6_40 != null;
	boolean has_item6_410 = data.item6_41 != null;
	boolean has_item6_420 = data.item6_42 != null;
	boolean has_item6_430 = data.item6_43 != null;
	boolean has_item6_440 = data.item6_44 != null;
	boolean has_item6_450 = data.item6_45 != null;
	boolean has_item6_460 = data.item6_46 != null;
	boolean has_item6_470 = data.item6_47 != null;
	boolean has_item6_480 = data.item6_48 != null;
	boolean has_item6_490 = data.item6_49 != null;
	boolean has_item6_500 = data.item6_50 != null;
	boolean has_item6_510 = data.item6_51 != null;
	boolean has_item6_520 = data.item6_52 != null;
	boolean has_item6_530 = data.item6_53 != null;
	boolean has_item6_540 = data.item6_54 != null;
	boolean has_item6_550 = data.item6_55 != null;
	boolean has_item6_560 = data.item6_56 != null;
	boolean has_item6_570 = data.item6_57 != null;
	boolean has_item6_580 = data.item6_58 != null;
	boolean has_item6_590 = data.item6_59 != null;
	boolean has_item6_600 = data.item6_60 != null;
	boolean has_item6_610 = data.item6_61 != null;
	boolean has_item6_620 = data.item6_62 != null;
	boolean has_item6_630 = data.item6_63 != null;
	boolean has_item6_640 = data.item6_64 != null;
	boolean has_item6_650 = data.item6_65 != null;
	boolean has_item6_660 = data.item6_66 != null;
	boolean has_item6_670 = data.item6_67 != null;
	boolean has_item6_680 = data.item6_68 != null;
	boolean has_item6_690 = data.item6_69 != null;
	boolean has_item6_700 = data.item6_70 != null;
	boolean has_item6_710 = data.item6_71 != null;
	boolean has_item6_720 = data.item6_72 != null;
	boolean has_item6_730 = data.item6_73 != null;
	boolean has_item7_10 = data.item7_1 != null;
	boolean has_item7_20 = data.item7_2 != null;
	boolean has_item7_30 = data.item7_3 != null;
	boolean has_item7_40 = data.item7_4 != null;
	boolean has_item7_50 = data.item7_5 != null;
	boolean has_item7_60 = data.item7_6 != null;
	boolean has_item7_70 = data.item7_7 != null;
	boolean has_item7_80 = data.item7_8 != null;
	boolean has_item7_90 = data.item7_9 != null;
	boolean has_item7_100 = data.item7_10 != null;
	boolean has_item7_110 = data.item7_11 != null;
	boolean has_item7_120 = data.item7_12 != null;
	boolean has_item7_130 = data.item7_13 != null;
	boolean has_item7_140 = data.item7_14 != null;
	boolean has_item7_150 = data.item7_15 != null;
	boolean has_item7_160 = data.item7_16 != null;
	boolean has_item7_170 = data.item7_17 != null;
	boolean has_item7_180 = data.item7_18 != null;
	boolean has_item7_190 = data.item7_19 != null;
	boolean has_item7_200 = data.item7_20 != null;
	boolean has_item7_210 = data.item7_21 != null;
	boolean has_item7_220 = data.item7_22 != null;
	boolean has_item7_230 = data.item7_23 != null;
	boolean has_item7_240 = data.item7_24 != null;
	boolean has_item7_250 = data.item7_25 != null;
	boolean has_item7_260 = data.item7_26 != null;
	boolean has_item7_270 = data.item7_27 != null;
	boolean has_item7_280 = data.item7_28 != null;
	boolean has_item7_290 = data.item7_29 != null;
	boolean has_item7_300 = data.item7_30 != null;
	boolean has_item7_310 = data.item7_31 != null;
	boolean has_item7_320 = data.item7_32 != null;
	boolean has_item7_330 = data.item7_33 != null;
	boolean has_item7_340 = data.item7_34 != null;
	boolean has_item7_350 = data.item7_35 != null;
	boolean has_item7_360 = data.item7_36 != null;
	boolean has_item7_370 = data.item7_37 != null;
	boolean has_item7_380 = data.item7_38 != null;
	boolean has_item7_390 = data.item7_39 != null;
	boolean has_item7_400 = data.item7_40 != null;
	boolean has_item7_410 = data.item7_41 != null;
	boolean has_item7_420 = data.item7_42 != null;
	boolean has_item7_430 = data.item7_43 != null;
	boolean has_item7_440 = data.item7_44 != null;
	boolean has_item7_450 = data.item7_45 != null;
	boolean has_item7_460 = data.item7_46 != null;
	boolean has_item7_470 = data.item7_47 != null;
	boolean has_item7_480 = data.item7_48 != null;
	boolean has_item7_490 = data.item7_49 != null;
	boolean has_item7_500 = data.item7_50 != null;
	boolean has_item7_510 = data.item7_51 != null;
	boolean has_item7_520 = data.item7_52 != null;
	boolean has_item7_530 = data.item7_53 != null;
	boolean has_item7_540 = data.item7_54 != null;
	boolean has_item7_550 = data.item7_55 != null;
	boolean has_item7_560 = data.item7_56 != null;
	boolean has_item7_570 = data.item7_57 != null;
	boolean has_item7_580 = data.item7_58 != null;
	boolean has_item7_590 = data.item7_59 != null;
	boolean has_item7_600 = data.item7_60 != null;
	boolean has_item7_610 = data.item7_61 != null;
	boolean has_item7_620 = data.item7_62 != null;
	boolean has_item7_630 = data.item7_63 != null;
	boolean has_item7_640 = data.item7_64 != null;
	boolean has_item7_650 = data.item7_65 != null;
	boolean has_item7_660 = data.item7_66 != null;
	boolean has_item7_670 = data.item7_67 != null;
	boolean has_item7_680 = data.item7_68 != null;
	boolean has_item7_690 = data.item7_69 != null;
	boolean has_item7_700 = data.item7_70 != null;
	boolean has_item7_710 = data.item7_71 != null;
	boolean has_item7_720 = data.item7_72 != null;
	boolean has_item7_730 = data.item7_73 != null;
	boolean has_item7_740 = data.item7_74 != null;
	boolean has_item7_750 = data.item7_75 != null;
	boolean has_item7_760 = data.item7_76 != null;
	boolean has_item7_770 = data.item7_77 != null;
	boolean has_item7_780 = data.item7_78 != null;
	boolean has_item7_790 = data.item7_79 != null;
	boolean has_item7_800 = data.item7_80 != null;
	boolean has_item7_810 = data.item7_81 != null;
	boolean has_item7_820 = data.item7_82 != null;
	boolean has_item7_830 = data.item7_83 != null;
	boolean has_item7_840 = data.item7_84 != null;
	boolean has_item7_850 = data.item7_85 != null;
	boolean has_item7_860 = data.item7_86 != null;
	boolean has_item7_870 = data.item7_87 != null;
	boolean has_item7_880 = data.item7_88 != null;
	boolean has_item7_890 = data.item7_89 != null;
	boolean has_item7_900 = data.item7_90 != null;
	boolean has_item7_910 = data.item7_91 != null;
	boolean has_item7_920 = data.item7_92 != null;
	boolean has_item7_930 = data.item7_93 != null;
	boolean has_item7_940 = data.item7_94 != null;
	boolean has_item7_950 = data.item7_95 != null;
	boolean has_item7_960 = data.item7_96 != null;
	boolean has_item7_970 = data.item7_97 != null;
	boolean has_item7_980 = data.item7_98 != null;
	boolean has_item7_990 = data.item7_99 != null;
	boolean has_item7_1000 = data.item7_100 != null;
	boolean has_item7_1010 = data.item7_101 != null;
	boolean has_item7_1020 = data.item7_102 != null;
	boolean has_item7_1030 = data.item7_103 != null;
	boolean has_item7_1040 = data.item7_104 != null;
	boolean has_item7_1050 = data.item7_105 != null;
	boolean has_item7_1060 = data.item7_106 != null;
	boolean has_item7_1070 = data.item7_107 != null;
	boolean has_item7_1080 = data.item7_108 != null;
	boolean has_item7_1090 = data.item7_109 != null;
	boolean has_item7_1100 = data.item7_110 != null;
	boolean has_item7_1110 = data.item7_111 != null;
	boolean has_item7_1120 = data.item7_112 != null;
	boolean has_item7_1130 = data.item7_113 != null;
	boolean has_item7_1140 = data.item7_114 != null;
	boolean has_item7_1150 = data.item7_115 != null;
	boolean has_item7_1160 = data.item7_116 != null;
	boolean has_item7_1170 = data.item7_117 != null;
	boolean has_item7_1180 = data.item7_118 != null;
	boolean has_item7_1190 = data.item7_119 != null;
	boolean has_item7_1200 = data.item7_120 != null;
	boolean has_item7_1210 = data.item7_121 != null;
	boolean has_item7_1220 = data.item7_122 != null;
	boolean has_item7_1230 = data.item7_123 != null;
	boolean has_item7_1240 = data.item7_124 != null;
	boolean has_item7_1250 = data.item7_125 != null;
	boolean has_item7_1260 = data.item7_126 != null;
	boolean has_item7_1270 = data.item7_127 != null;
	boolean has_item7_1280 = data.item7_128 != null;
	boolean has_item7_1290 = data.item7_129 != null;
	boolean has_item7_1300 = data.item7_130 != null;
	boolean has_item7_1310 = data.item7_131 != null;
	boolean has_item7_1320 = data.item7_132 != null;
	boolean has_item7_1330 = data.item7_133 != null;
	boolean has_item7_1340 = data.item7_134 != null;
	boolean has_item7_1350 = data.item7_135 != null;
	boolean has_item7_1360 = data.item7_136 != null;
	boolean has_item7_1370 = data.item7_137 != null;
	boolean has_item7_1380 = data.item7_138 != null;
	boolean has_item7_1390 = data.item7_139 != null;
	boolean has_item7_1400 = data.item7_140 != null;
	boolean has_item7_1410 = data.item7_141 != null;
	boolean has_item7_1420 = data.item7_142 != null;
	boolean has_item7_1430 = data.item7_143 != null;
	boolean has_item7_1440 = data.item7_144 != null;
	boolean has_item7_1450 = data.item7_145 != null;
	boolean has_item7_1460 = data.item7_146 != null;
	boolean has_item7_1470 = data.item7_147 != null;
	boolean has_item7_1480 = data.item7_148 != null;
	boolean has_item7_1490 = data.item7_149 != null;
	boolean has_item8_10 = data.item8_1 != null;
	boolean has_item8_20 = data.item8_2 != null;
	boolean has_item8_30 = data.item8_3 != null;
	boolean has_item8_40 = data.item8_4 != null;
	boolean has_item8_50 = data.item8_5 != null;
	boolean has_item8_60 = data.item8_6 != null;
	boolean has_item8_70 = data.item8_7 != null;
	boolean has_item8_80 = data.item8_8 != null;
	boolean has_item8_90 = data.item8_9 != null;
	boolean has_item8_100 = data.item8_10 != null;
	boolean has_item8_110 = data.item8_11 != null;
	sink.writeBit(false); ++nbits;
	sink.writeBit(has_item6_10); ++nbits;
	sink.writeBit(has_item6_20); ++nbits;
	sink.writeBit(has_item6_40); ++nbits;
	sink.writeBit(has_item6_50); ++nbits;
	sink.writeBit(has_item6_60); ++nbits;
	sink.writeBit(has_item6_70); ++nbits;
	sink.writeBit(has_item6_80); ++nbits;
	sink.writeBit(has_item6_90); ++nbits;
	sink.writeBit(has_item6_100); ++nbits;
	sink.writeBit(has_item6_110); ++nbits;
	sink.writeBit(has_item6_120); ++nbits;
	sink.writeBit(has_item6_130); ++nbits;
	sink.writeBit(has_item6_140); ++nbits;
	sink.writeBit(has_item6_150); ++nbits;
	sink.writeBit(has_item6_160); ++nbits;
	sink.writeBit(has_item6_170); ++nbits;
	sink.writeBit(has_item6_180); ++nbits;
	sink.writeBit(has_item6_190); ++nbits;
	sink.writeBit(has_item6_200); ++nbits;
	sink.writeBit(has_item6_210); ++nbits;
	sink.writeBit(has_item6_220); ++nbits;
	sink.writeBit(has_item6_230); ++nbits;
	sink.writeBit(has_item6_240); ++nbits;
	sink.writeBit(has_item6_250); ++nbits;
	sink.writeBit(has_item6_260); ++nbits;
	sink.writeBit(has_item6_270); ++nbits;
	sink.writeBit(has_item6_280); ++nbits;
	sink.writeBit(has_item6_290); ++nbits;
	sink.writeBit(has_item6_300); ++nbits;
	sink.writeBit(has_item6_310); ++nbits;
	sink.writeBit(has_item6_320); ++nbits;
	sink.writeBit(has_item6_330); ++nbits;
	sink.writeBit(has_item6_340); ++nbits;
	sink.writeBit(has_item6_350); ++nbits;
	sink.writeBit(has_item6_360); ++nbits;
	sink.writeBit(has_item6_370); ++nbits;
	sink.writeBit(has_item6_380); ++nbits;
	sink.writeBit(has_item6_390); ++nbits;
	sink.writeBit(has_item6_400); ++nbits;
	sink.writeBit(has_item6_410); ++nbits;
	sink.writeBit(has_item6_420); ++nbits;
	sink.writeBit(has_item6_430); ++nbits;
	sink.writeBit(has_item6_440); ++nbits;
	sink.writeBit(has_item6_450); ++nbits;
	sink.writeBit(has_item6_460); ++nbits;
	sink.writeBit(has_item6_470); ++nbits;
	sink.writeBit(has_item6_480); ++nbits;
	sink.writeBit(has_item6_490); ++nbits;
	sink.writeBit(has_item6_500); ++nbits;
	sink.writeBit(has_item6_510); ++nbits;
	sink.writeBit(has_item6_520); ++nbits;
	sink.writeBit(has_item6_530); ++nbits;
	sink.writeBit(has_item6_540); ++nbits;
	sink.writeBit(has_item6_550); ++nbits;
	sink.writeBit(has_item6_560); ++nbits;
	sink.writeBit(has_item6_570); ++nbits;
	sink.writeBit(has_item6_580); ++nbits;
	sink.writeBit(has_item6_590); ++nbits;
	sink.writeBit(has_item6_600); ++nbits;
	sink.writeBit(has_item6_610); ++nbits;
	sink.writeBit(has_item6_620); ++nbits;
	sink.writeBit(has_item6_630); ++nbits;
	sink.writeBit(has_item6_640); ++nbits;
	sink.writeBit(has_item6_650); ++nbits;
	sink.writeBit(has_item6_660); ++nbits;
	sink.writeBit(has_item6_670); ++nbits;
	sink.writeBit(has_item6_680); ++nbits;
	sink.writeBit(has_item6_690); ++nbits;
	sink.writeBit(has_item6_700); ++nbits;
	sink.writeBit(has_item6_710); ++nbits;
	sink.writeBit(has_item6_720); ++nbits;
	sink.writeBit(has_item6_730); ++nbits;
	sink.writeBit(has_item7_10); ++nbits;
	sink.writeBit(has_item7_20); ++nbits;
	sink.writeBit(has_item7_30); ++nbits;
	sink.writeBit(has_item7_40); ++nbits;
	sink.writeBit(has_item7_50); ++nbits;
	sink.writeBit(has_item7_60); ++nbits;
	sink.writeBit(has_item7_70); ++nbits;
	sink.writeBit(has_item7_80); ++nbits;
	sink.writeBit(has_item7_90); ++nbits;
	sink.writeBit(has_item7_100); ++nbits;
	sink.writeBit(has_item7_110); ++nbits;
	sink.writeBit(has_item7_120); ++nbits;
	sink.writeBit(has_item7_130); ++nbits;
	sink.writeBit(has_item7_140); ++nbits;
	sink.writeBit(has_item7_150); ++nbits;
	sink.writeBit(has_item7_160); ++nbits;
	sink.writeBit(has_item7_170); ++nbits;
	sink.writeBit(has_item7_180); ++nbits;
	sink.writeBit(has_item7_190); ++nbits;
	sink.writeBit(has_item7_200); ++nbits;
	sink.writeBit(has_item7_210); ++nbits;
	sink.writeBit(has_item7_220); ++nbits;
	sink.writeBit(has_item7_230); ++nbits;
	sink.writeBit(has_item7_240); ++nbits;
	sink.writeBit(has_item7_250); ++nbits;
	sink.writeBit(has_item7_260); ++nbits;
	sink.writeBit(has_item7_270); ++nbits;
	sink.writeBit(has_item7_280); ++nbits;
	sink.writeBit(has_item7_290); ++nbits;
	sink.writeBit(has_item7_300); ++nbits;
	sink.writeBit(has_item7_310); ++nbits;
	sink.writeBit(has_item7_320); ++nbits;
	sink.writeBit(has_item7_330); ++nbits;
	sink.writeBit(has_item7_340); ++nbits;
	sink.writeBit(has_item7_350); ++nbits;
	sink.writeBit(has_item7_360); ++nbits;
	sink.writeBit(has_item7_370); ++nbits;
	sink.writeBit(has_item7_380); ++nbits;
	sink.writeBit(has_item7_390); ++nbits;
	sink.writeBit(has_item7_400); ++nbits;
	sink.writeBit(has_item7_410); ++nbits;
	sink.writeBit(has_item7_420); ++nbits;
	sink.writeBit(has_item7_430); ++nbits;
	sink.writeBit(has_item7_440); ++nbits;
	sink.writeBit(has_item7_450); ++nbits;
	sink.writeBit(has_item7_460); ++nbits;
	sink.writeBit(has_item7_470); ++nbits;
	sink.writeBit(has_item7_480); ++nbits;
	sink.writeBit(has_item7_490); ++nbits;
	sink.writeBit(has_item7_500); ++nbits;
	sink.writeBit(has_item7_510); ++nbits;
	sink.writeBit(has_item7_520); ++nbits;
	sink.writeBit(has_item7_530); ++nbits;
	sink.writeBit(has_item7_540); ++nbits;
	sink.writeBit(has_item7_550); ++nbits;
	sink.writeBit(has_item7_560); ++nbits;
	sink.writeBit(has_item7_570); ++nbits;
	sink.writeBit(has_item7_580); ++nbits;
	sink.writeBit(has_item7_590); ++nbits;
	sink.writeBit(has_item7_600); ++nbits;
	sink.writeBit(has_item7_610); ++nbits;
	sink.writeBit(has_item7_620); ++nbits;
	sink.writeBit(has_item7_630); ++nbits;
	sink.writeBit(has_item7_640); ++nbits;
	sink.writeBit(has_item7_650); ++nbits;
	sink.writeBit(has_item7_660); ++nbits;
	sink.writeBit(has_item7_670); ++nbits;
	sink.writeBit(has_item7_680); ++nbits;
	sink.writeBit(has_item7_690); ++nbits;
	sink.writeBit(has_item7_700); ++nbits;
	sink.writeBit(has_item7_710); ++nbits;
	sink.writeBit(has_item7_720); ++nbits;
	sink.writeBit(has_item7_730); ++nbits;
	sink.writeBit(has_item7_740); ++nbits;
	sink.writeBit(has_item7_750); ++nbits;
	sink.writeBit(has_item7_760); ++nbits;
	sink.writeBit(has_item7_770); ++nbits;
	sink.writeBit(has_item7_780); ++nbits;
	sink.writeBit(has_item7_790); ++nbits;
	sink.writeBit(has_item7_800); ++nbits;
	sink.writeBit(has_item7_810); ++nbits;
	sink.writeBit(has_item7_820); ++nbits;
	sink.writeBit(has_item7_830); ++nbits;
	sink.writeBit(has_item7_840); ++nbits;
	sink.writeBit(has_item7_850); ++nbits;
	sink.writeBit(has_item7_860); ++nbits;
	sink.writeBit(has_item7_870); ++nbits;
	sink.writeBit(has_item7_880); ++nbits;
	sink.writeBit(has_item7_890); ++nbits;
	sink.writeBit(has_item7_900); ++nbits;
	sink.writeBit(has_item7_910); ++nbits;
	sink.writeBit(has_item7_920); ++nbits;
	sink.writeBit(has_item7_930); ++nbits;
	sink.writeBit(has_item7_940); ++nbits;
	sink.writeBit(has_item7_950); ++nbits;
	sink.writeBit(has_item7_960); ++nbits;
	sink.writeBit(has_item7_970); ++nbits;
	sink.writeBit(has_item7_980); ++nbits;
	sink.writeBit(has_item7_990); ++nbits;
	sink.writeBit(has_item7_1000); ++nbits;
	sink.writeBit(has_item7_1010); ++nbits;
	sink.writeBit(has_item7_1020); ++nbits;
	sink.writeBit(has_item7_1030); ++nbits;
	sink.writeBit(has_item7_1040); ++nbits;
	sink.writeBit(has_item7_1050); ++nbits;
	sink.writeBit(has_item7_1060); ++nbits;
	sink.writeBit(has_item7_1070); ++nbits;
	sink.writeBit(has_item7_1080); ++nbits;
	sink.writeBit(has_item7_1090); ++nbits;
	sink.writeBit(has_item7_1100); ++nbits;
	sink.writeBit(has_item7_1110); ++nbits;
	sink.writeBit(has_item7_1120); ++nbits;
	sink.writeBit(has_item7_1130); ++nbits;
	sink.writeBit(has_item7_1140); ++nbits;
	sink.writeBit(has_item7_1150); ++nbits;
	sink.writeBit(has_item7_1160); ++nbits;
	sink.writeBit(has_item7_1170); ++nbits;
	sink.writeBit(has_item7_1180); ++nbits;
	sink.writeBit(has_item7_1190); ++nbits;
	sink.writeBit(has_item7_1200); ++nbits;
	sink.writeBit(has_item7_1210); ++nbits;
	sink.writeBit(has_item7_1220); ++nbits;
	sink.writeBit(has_item7_1230); ++nbits;
	sink.writeBit(has_item7_1240); ++nbits;
	sink.writeBit(has_item7_1250); ++nbits;
	sink.writeBit(has_item7_1260); ++nbits;
	sink.writeBit(has_item7_1270); ++nbits;
	sink.writeBit(has_item7_1280); ++nbits;
	sink.writeBit(has_item7_1290); ++nbits;
	sink.writeBit(has_item7_1300); ++nbits;
	sink.writeBit(has_item7_1310); ++nbits;
	sink.writeBit(has_item7_1320); ++nbits;
	sink.writeBit(has_item7_1330); ++nbits;
	sink.writeBit(has_item7_1340); ++nbits;
	sink.writeBit(has_item7_1350); ++nbits;
	sink.writeBit(has_item7_1360); ++nbits;
	sink.writeBit(has_item7_1370); ++nbits;
	sink.writeBit(has_item7_1380); ++nbits;
	sink.writeBit(has_item7_1390); ++nbits;
	sink.writeBit(has_item7_1400); ++nbits;
	sink.writeBit(has_item7_1410); ++nbits;
	sink.writeBit(has_item7_1420); ++nbits;
	sink.writeBit(has_item7_1430); ++nbits;
	sink.writeBit(has_item7_1440); ++nbits;
	sink.writeBit(has_item7_1450); ++nbits;
	sink.writeBit(has_item7_1460); ++nbits;
	sink.writeBit(has_item7_1470); ++nbits;
	sink.writeBit(has_item7_1480); ++nbits;
	sink.writeBit(has_item7_1490); ++nbits;
	sink.writeBit(has_item8_10); ++nbits;
	sink.writeBit(has_item8_20); ++nbits;
	sink.writeBit(has_item8_30); ++nbits;
	sink.writeBit(has_item8_40); ++nbits;
	sink.writeBit(has_item8_50); ++nbits;
	sink.writeBit(has_item8_60); ++nbits;
	sink.writeBit(has_item8_70); ++nbits;
	sink.writeBit(has_item8_80); ++nbits;
	sink.writeBit(has_item8_90); ++nbits;
	sink.writeBit(has_item8_100); ++nbits;
	sink.writeBit(has_item8_110); ++nbits;
	if (has_item6_10) {
	    // Encode field 'item6-1'
	    try {
		AccelerationSet4Way item1 = data.item6_1;
		int len1 = item1.getSize();

		if (len1 != 7)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 7, 7, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-1", "AccelerationSet4Way");
		throw ee;
	    }
	}
	if (has_item6_20) {
	    // Encode field 'item6-2'
	    try {
		AccelSteerYawRateConfidence item1 = data.item6_2;

		nbits += AccelSteerYawRateConfidence.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-2", "AccelSteerYawRateConfidence");
		throw ee;
	    }
	}
	if (has_item6_40) {
	    // Encode field 'item6-4'
	    try {
		AntennaOffsetSet item1 = data.item6_4;
		int len1 = item1.getSize();

		if (len1 != 4)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 4, 4, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-4", "AntennaOffsetSet");
		throw ee;
	    }
	}
	if (has_item6_50) {
	    // Encode field 'item6-5'
	    try {
		Approach item1 = data.item6_5;

		nbits += Approach.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-5", "Approach");
		throw ee;
	    }
	}
	if (has_item6_60) {
	    // Encode field 'item6-6'
	    try {
		ApproachObject item1 = data.item6_6;

		nbits += ApproachObject.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-6", "ApproachObject");
		throw ee;
	    }
	}
	if (has_item6_70) {
	    // Encode field 'item6-7'
	    try {
		BarrierLane item1 = data.item6_7;

		nbits += BarrierLane.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-7", "BarrierLane");
		throw ee;
	    }
	}
	if (has_item6_80) {
	    // Encode field 'item6-8'
	    try {
		BrakeSystemStatus item1 = data.item6_8;
		int len1 = item1.getSize();

		if (len1 != 2)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 2, 2, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-8", "BrakeSystemStatus");
		throw ee;
	    }
	}
	if (has_item6_90) {
	    // Encode field 'item6-9'
	    try {
		BSMblob item1 = data.item6_9;
		int len1 = item1.getSize();

		if (len1 != 38)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 38, 38, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-9", "BSMblob");
		throw ee;
	    }
	}
	if (has_item6_100) {
	    // Encode field 'item6-10'
	    try {
		BumperHeights item1 = data.item6_10;

		nbits += BumperHeights.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-10", "BumperHeights");
		throw ee;
	    }
	}
	if (has_item6_110) {
	    // Encode field 'item6-11'
	    try {
		Circle item1 = data.item6_11;

		nbits += Circle.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-11", "Circle");
		throw ee;
	    }
	}
	if (has_item6_120) {
	    // Encode field 'item6-12'
	    try {
		ConfidenceSet item1 = data.item6_12;

		nbits += ConfidenceSet.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-12", "ConfidenceSet");
		throw ee;
	    }
	}
	if (has_item6_130) {
	    // Encode field 'item6-13'
	    try {
		ConnectsTo item1 = data.item6_13;
		int len1 = item1.getSize();

		if (len1 < 2 || len1 > 32)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 2, 32, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-13", "ConnectsTo");
		throw ee;
	    }
	}
	if (has_item6_140) {
	    // Encode field 'item6-14'
	    try {
		CrosswalkLane item1 = data.item6_14;

		nbits += CrosswalkLane.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-14", "CrosswalkLane");
		throw ee;
	    }
	}
	if (has_item6_150) {
	    // Encode field 'item6-15'
	    try {
		DataParameters item1 = data.item6_15;

		nbits += DataParameters.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-15", "DataParameters");
		throw ee;
	    }
	}
	if (has_item6_160) {
	    // Encode field 'item6-16'
	    try {
		DDate item1 = data.item6_16;

		nbits += DDate.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-16", "DDate");
		throw ee;
	    }
	}
	if (has_item6_170) {
	    // Encode field 'item6-17'
	    try {
		DDateTime item1 = data.item6_17;

		nbits += DDateTime.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-17", "DDateTime");
		throw ee;
	    }
	}
	if (has_item6_180) {
	    // Encode field 'item6-18'
	    try {
		DFullTime item1 = data.item6_18;

		nbits += DFullTime.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-18", "DFullTime");
		throw ee;
	    }
	}
	if (has_item6_190) {
	    // Encode field 'item6-19'
	    try {
		DMonthDay item1 = data.item6_19;

		nbits += DMonthDay.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-19", "DMonthDay");
		throw ee;
	    }
	}
	if (has_item6_200) {
	    // Encode field 'item6-20'
	    try {
		DTime item1 = data.item6_20;

		nbits += DTime.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-20", "DTime");
		throw ee;
	    }
	}
	if (has_item6_210) {
	    // Encode field 'item6-21'
	    try {
		DYearMonth item1 = data.item6_21;

		nbits += DYearMonth.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-21", "DYearMonth");
		throw ee;
	    }
	}
	if (has_item6_220) {
	    // Encode field 'item6-22'
	    try {
		FullPositionVector item1 = data.item6_22;

		nbits += FullPositionVector.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-22", "FullPositionVector");
		throw ee;
	    }
	}
	if (has_item6_230) {
	    // Encode field 'item6-23'
	    try {
		Intersection_ item1 = data.item6_23;

		nbits += Intersection_.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-23", "Intersection");
		throw ee;
	    }
	}
	if (has_item6_240) {
	    // Encode field 'item6-24'
	    try {
		IntersectionState item1 = data.item6_24;

		nbits += IntersectionState.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-24", "IntersectionState");
		throw ee;
	    }
	}
	if (has_item6_250) {
	    // Encode field 'item6-25'
	    try {
		ExitService item1 = data.item6_25;

		nbits += ExitService.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-25", "ExitService");
		throw ee;
	    }
	}
	if (has_item6_260) {
	    // Encode field 'item6-26'
	    try {
		GenericSignage item1 = data.item6_26;

		nbits += GenericSignage.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-26", "GenericSignage");
		throw ee;
	    }
	}
	if (has_item6_270) {
	    // Encode field 'item6-27'
	    try {
		SpeedLimit item1 = data.item6_27;

		nbits += SpeedLimit.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-27", "SpeedLimit");
		throw ee;
	    }
	}
	if (has_item6_280) {
	    // Encode field 'item6-28'
	    try {
		WorkZone item1 = data.item6_28;

		nbits += WorkZone.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-28", "WorkZone");
		throw ee;
	    }
	}
	if (has_item6_290) {
	    // Encode field 'item6-29'
	    try {
		J1939data item1 = data.item6_29;

		nbits += J1939data.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-29", "J1939data");
		throw ee;
	    }
	}
	if (has_item6_300) {
	    // Encode field 'item6-30'
	    try {
		MovementState item1 = data.item6_30;

		nbits += MovementState.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-30", "MovementState");
		throw ee;
	    }
	}
	if (has_item6_310) {
	    // Encode field 'item6-31'
	    try {
		NodeList item1 = data.item6_31;

		nbits += NodeList.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-31", "NodeList");
		throw ee;
	    }
	}
	if (has_item6_320) {
	    // Encode field 'item6-32'
	    try {
		Offsets item1 = data.item6_32;
		int len1 = item1.getSize();

		if (len1 < 4 || len1 > 8)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 4, 8, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-32", "Offsets");
		throw ee;
	    }
	}
	if (has_item6_330) {
	    // Encode field 'item6-33'
	    try {
		PathHistory item1 = data.item6_33;

		nbits += PathHistory.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-33", "PathHistory");
		throw ee;
	    }
	}
	if (has_item6_340) {
	    // Encode field 'item6-34'
	    try {
		PathHistoryPointType_01 item1 = data.item6_34;

		nbits += PathHistoryPointType_01.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-34", "PathHistoryPointType-01");
		throw ee;
	    }
	}
	if (has_item6_350) {
	    // Encode field 'item6-35'
	    try {
		PathHistoryPointType_02 item1 = data.item6_35;
		int len1 = item1.getSize();

		if (len1 != 15)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 15, 15, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-35", "PathHistoryPointType-02");
		throw ee;
	    }
	}
	if (has_item6_360) {
	    // Encode field 'item6-36'
	    try {
		PathHistoryPointType_03 item1 = data.item6_36;
		int len1 = item1.getSize();

		if (len1 != 12)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 12, 12, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-36", "PathHistoryPointType-03");
		throw ee;
	    }
	}
	if (has_item6_370) {
	    // Encode field 'item6-37'
	    try {
		PathHistoryPointType_04 item1 = data.item6_37;
		int len1 = item1.getSize();

		if (len1 != 8)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 8, 8, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-37", "PathHistoryPointType-04");
		throw ee;
	    }
	}
	if (has_item6_380) {
	    // Encode field 'item6-38'
	    try {
		PathHistoryPointType_05 item1 = data.item6_38;
		int len1 = item1.getSize();

		if (len1 != 10)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 10, 10, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-38", "PathHistoryPointType-05");
		throw ee;
	    }
	}
	if (has_item6_390) {
	    // Encode field 'item6-39'
	    try {
		PathHistoryPointType_06 item1 = data.item6_39;
		int len1 = item1.getSize();

		if (len1 != 6)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 6, 6, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-39", "PathHistoryPointType-06");
		throw ee;
	    }
	}
	if (has_item6_400) {
	    // Encode field 'item6-40'
	    try {
		PathHistoryPointType_07 item1 = data.item6_40;
		int len1 = item1.getSize();

		if (len1 != 11)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 11, 11, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-40", "PathHistoryPointType-07");
		throw ee;
	    }
	}
	if (has_item6_410) {
	    // Encode field 'item6-41'
	    try {
		PathHistoryPointType_08 item1 = data.item6_41;
		int len1 = item1.getSize();

		if (len1 != 7)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 7, 7, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-41", "PathHistoryPointType-08");
		throw ee;
	    }
	}
	if (has_item6_420) {
	    // Encode field 'item6-42'
	    try {
		PathHistoryPointType_09 item1 = data.item6_42;
		int len1 = item1.getSize();

		if (len1 != 9)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 9, 9, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-42", "PathHistoryPointType-09");
		throw ee;
	    }
	}
	if (has_item6_430) {
	    // Encode field 'item6-43'
	    try {
		PathHistoryPointType_10 item1 = data.item6_43;
		int len1 = item1.getSize();

		if (len1 != 5)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 5, 5, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-43", "PathHistoryPointType-10");
		throw ee;
	    }
	}
	if (has_item6_440) {
	    // Encode field 'item6-44'
	    try {
		PathPrediction item1 = data.item6_44;

		nbits += PathPrediction.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-44", "PathPrediction");
		throw ee;
	    }
	}
	if (has_item6_450) {
	    // Encode field 'item6-45'
	    try {
		Position3D item1 = data.item6_45;

		nbits += Position3D.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-45", "Position3D");
		throw ee;
	    }
	}
	if (has_item6_460) {
	    // Encode field 'item6-46'
	    try {
		PositionalAccuracy item1 = data.item6_46;
		int len1 = item1.getSize();

		if (len1 != 4)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 4, 4, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-46", "PositionalAccuracy");
		throw ee;
	    }
	}
	if (has_item6_470) {
	    // Encode field 'item6-47'
	    try {
		PositionConfidenceSet item1 = data.item6_47;
		int len1 = item1.getSize();

		if (len1 != 1)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 1, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-47", "PositionConfidenceSet");
		throw ee;
	    }
	}
	if (has_item6_480) {
	    // Encode field 'item6-48'
	    try {
		RegionList item1 = data.item6_48;

		nbits += RegionList.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-48", "RegionList");
		throw ee;
	    }
	}
	if (has_item6_490) {
	    // Encode field 'item6-49'
	    try {
		RegionOffsets item1 = data.item6_49;

		nbits += RegionOffsets.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-49", "RegionOffsets");
		throw ee;
	    }
	}
	if (has_item6_500) {
	    // Encode field 'item6-50'
	    try {
		RegionPointSet item1 = data.item6_50;

		nbits += RegionPointSet.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-50", "RegionPointSet");
		throw ee;
	    }
	}
	if (has_item6_510) {
	    // Encode field 'item6-51'
	    try {
		RoadSignID item1 = data.item6_51;

		nbits += RoadSignID.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-51", "RoadSignID");
		throw ee;
	    }
	}
	if (has_item6_520) {
	    // Encode field 'item6-52'
	    try {
		RTCMHeader item1 = data.item6_52;
		int len1 = item1.getSize();

		if (len1 != 5)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 5, 5, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-52", "RTCMHeader");
		throw ee;
	    }
	}
	if (has_item6_530) {
	    // Encode field 'item6-53'
	    try {
		RTCMmsg item1 = data.item6_53;

		nbits += RTCMmsg.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-53", "RTCMmsg");
		throw ee;
	    }
	}
	if (has_item6_540) {
	    // Encode field 'item6-54'
	    try {
		RTCMPackage item1 = data.item6_54;

		nbits += RTCMPackage.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-54", "RTCMPackage");
		throw ee;
	    }
	}
	if (has_item6_550) {
	    // Encode field 'item6-55'
	    try {
		Sample item1 = data.item6_55;

		nbits += Sample.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-55", "Sample");
		throw ee;
	    }
	}
	if (has_item6_560) {
	    // Encode field 'item6-56'
	    try {
		ShapePointSet item1 = data.item6_56;

		nbits += ShapePointSet.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-56", "ShapePointSet");
		throw ee;
	    }
	}
	if (has_item6_570) {
	    // Encode field 'item6-57'
	    try {
		SignalControlZone item1 = data.item6_57;

		nbits += SignalControlZone.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-57", "SignalControlZone");
		throw ee;
	    }
	}
	if (has_item6_580) {
	    // Encode field 'item6-58'
	    try {
		SignalRequest item1 = data.item6_58;

		nbits += SignalRequest.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-58", "SignalRequest");
		throw ee;
	    }
	}
	if (has_item6_590) {
	    // Encode field 'item6-59'
	    try {
		SnapshotDistance item1 = data.item6_59;

		nbits += SnapshotDistance.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-59", "SnapshotDistance");
		throw ee;
	    }
	}
	if (has_item6_600) {
	    // Encode field 'item6-60'
	    try {
		Snapshot item1 = data.item6_60;

		nbits += Snapshot.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-60", "Snapshot");
		throw ee;
	    }
	}
	if (has_item6_610) {
	    // Encode field 'item6-61'
	    try {
		SnapshotTime item1 = data.item6_61;

		nbits += SnapshotTime.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-61", "SnapshotTime");
		throw ee;
	    }
	}
	if (has_item6_620) {
	    // Encode field 'item6-62'
	    try {
		SpecialLane item1 = data.item6_62;

		nbits += SpecialLane.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-62", "SpecialLane");
		throw ee;
	    }
	}
	if (has_item6_630) {
	    // Encode field 'item6-63'
	    try {
		SpeedandHeadingandThrottleConfidence item1 = data.item6_63;
		int len1 = item1.getSize();

		if (len1 != 1)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 1, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-63", "SpeedandHeadingandThrottleConfidence");
		throw ee;
	    }
	}
	if (has_item6_640) {
	    // Encode field 'item6-64'
	    try {
		TransmissionAndSpeed item1 = data.item6_64;
		int len1 = item1.getSize();

		if (len1 != 2)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 2, 2, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-64", "TransmissionAndSpeed");
		throw ee;
	    }
	}
	if (has_item6_650) {
	    // Encode field 'item6-65'
	    try {
		ValidRegion item1 = data.item6_65;

		nbits += ValidRegion.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-65", "ValidRegion");
		throw ee;
	    }
	}
	if (has_item6_660) {
	    // Encode field 'item6-66'
	    try {
		VehicleComputedLane item1 = data.item6_66;

		nbits += VehicleComputedLane.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-66", "VehicleComputedLane");
		throw ee;
	    }
	}
	if (has_item6_670) {
	    // Encode field 'item6-67'
	    try {
		VehicleIdent item1 = data.item6_67;

		nbits += VehicleIdent.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-67", "VehicleIdent");
		throw ee;
	    }
	}
	if (has_item6_680) {
	    // Encode field 'item6-68'
	    try {
		VehicleReferenceLane item1 = data.item6_68;

		nbits += VehicleReferenceLane.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-68", "VehicleReferenceLane");
		throw ee;
	    }
	}
	if (has_item6_690) {
	    // Encode field 'item6-69'
	    try {
		VehicleSafetyExtension item1 = data.item6_69;

		nbits += VehicleSafetyExtension.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-69", "VehicleSafetyExtension");
		throw ee;
	    }
	}
	if (has_item6_700) {
	    // Encode field 'item6-70'
	    try {
		VehicleSize item1 = data.item6_70;

		nbits += VehicleSize.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-70", "VehicleSize");
		throw ee;
	    }
	}
	if (has_item6_710) {
	    // Encode field 'item6-71'
	    try {
		VehicleStatusRequest item1 = data.item6_71;

		nbits += VehicleStatusRequest.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-71", "VehicleStatusRequest");
		throw ee;
	    }
	}
	if (has_item6_720) {
	    // Encode field 'item6-72'
	    try {
		VehicleStatus item1 = data.item6_72;

		nbits += VehicleStatus.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-72", "VehicleStatus");
		throw ee;
	    }
	}
	if (has_item6_730) {
	    // Encode field 'item6-73'
	    try {
		WiperStatus item1 = data.item6_73;

		nbits += WiperStatus.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item6-73", "WiperStatus");
		throw ee;
	    }
	}
	if (has_item7_10) {
	    // Encode field 'item7-1'
	    try {
		Acceleration item1 = data.item7_1;
		long temp1 = item1.longValue();

		if (temp1 < -2000 || temp1 > 2001)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, -2000, 2001, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-1", "Acceleration");
		throw ee;
	    }
	}
	if (has_item7_20) {
	    // Encode field 'item7-2'
	    try {
		AccelerationConfidence item1 = data.item7_2;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 7, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-2", "AccelerationConfidence");
		throw ee;
	    }
	}
	if (has_item7_30) {
	    // Encode field 'item7-3'
	    try {
		AmbientAirPressure item1 = data.item7_3;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 255)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-3", "AmbientAirPressure");
		throw ee;
	    }
	}
	if (has_item7_40) {
	    // Encode field 'item7-4'
	    try {
		AmbientAirTemperature item1 = data.item7_4;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 191)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 191, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-4", "AmbientAirTemperature");
		throw ee;
	    }
	}
	if (has_item7_50) {
	    // Encode field 'item7-5'
	    try {
		AntiLockBrakeStatus item1 = data.item7_5;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 3, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-5", "AntiLockBrakeStatus");
		throw ee;
	    }
	}
	if (has_item7_60) {
	    // Encode field 'item7-6'
	    try {
		ApproachNumber item1 = data.item7_6;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 127)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 127, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-6", "ApproachNumber");
		throw ee;
	    }
	}
	if (has_item7_70) {
	    // Encode field 'item7-7'
	    try {
		AuxiliaryBrakeStatus item1 = data.item7_7;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 3, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-7", "AuxiliaryBrakeStatus");
		throw ee;
	    }
	}
	if (has_item7_80) {
	    // Encode field 'item7-8'
	    try {
		BarrierAttributes item1 = data.item7_8;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 8192)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 8192, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-8", "BarrierAttributes");
		throw ee;
	    }
	}
	if (has_item7_90) {
	    // Encode field 'item7-9'
	    try {
		BrakeAppliedPressure item1 = data.item7_9;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 15, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-9", "BrakeAppliedPressure");
		throw ee;
	    }
	}
	if (has_item7_100) {
	    // Encode field 'item7-10'
	    try {
		BrakeAppliedStatus item1 = data.item7_10;
		int len1 = item1.getSize();
		int total_len1;

		total_len1 = item1.getLastBit();
		nbits += com.oss.coders.per.PerBitstring.encode(coder, item1.byteArrayValue(), len1, total_len1, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-10", "BrakeAppliedStatus");
		throw ee;
	    }
	}
	if (has_item7_110) {
	    // Encode field 'item7-11'
	    try {
		BrakeBoostApplied item1 = data.item7_11;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 2, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-11", "BrakeBoostApplied");
		throw ee;
	    }
	}
	if (has_item7_120) {
	    // Encode field 'item7-12'
	    try {
		BumperHeightFront item1 = data.item7_12;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 127)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 127, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-12", "BumperHeightFront");
		throw ee;
	    }
	}
	if (has_item7_130) {
	    // Encode field 'item7-13'
	    try {
		BumperHeightRear item1 = data.item7_13;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 127)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 127, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-13", "BumperHeightRear");
		throw ee;
	    }
	}
	if (has_item7_140) {
	    // Encode field 'item7-14'
	    try {
		CodeWord item1 = data.item7_14;
		int len1 = item1.getSize();

		if (len1 < 1 || len1 > 16)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 16, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-14", "CodeWord");
		throw ee;
	    }
	}
	if (has_item7_150) {
	    // Encode field 'item7-15'
	    try {
		CoefficientOfFriction item1 = data.item7_15;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 50)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 50, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-15", "CoefficientOfFriction");
		throw ee;
	    }
	}
	if (has_item7_160) {
	    // Encode field 'item7-16'
	    try {
		ColorState item1 = data.item7_16;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 6, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-16", "ColorState");
		throw ee;
	    }
	}
	if (has_item7_170) {
	    // Encode field 'item7-17'
	    try {
		Count item1 = data.item7_17;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 32)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 32, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-17", "Count");
		throw ee;
	    }
	}
	if (has_item7_180) {
	    // Encode field 'item7-18'
	    try {
		CrosswalkLaneAttributes item1 = data.item7_18;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 8, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-18", "CrosswalkLaneAttributes");
		throw ee;
	    }
	}
	if (has_item7_190) {
	    // Encode field 'item7-19'
	    try {
		DDay item1 = data.item7_19;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 31)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 31, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-19", "DDay");
		throw ee;
	    }
	}
	if (has_item7_200) {
	    // Encode field 'item7-20'
	    try {
		DescriptiveName item1 = data.item7_20;
		int len1 = item1.getSize();

		if (len1 < 1 || len1 > 63)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerKMCString.encode(coder, item1.stringValue(), 1, 63, AllInclusive._cEPAInfo_item7_20, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-20", "DescriptiveName");
		throw ee;
	    }
	}
	if (has_item7_210) {
	    // Encode field 'item7-21'
	    try {
		DHour item1 = data.item7_21;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 31)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 31, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-21", "DHour");
		throw ee;
	    }
	}
	if (has_item7_220) {
	    // Encode field 'item7-22'
	    try {
		DirectionOfUse item1 = data.item7_22;
		int idx1;
		boolean extroot1 = true;

		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else {
		    idx1 = item1.indexOf();
		    if (idx1 < 0)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    extroot1 = idx1 < 3;
		}
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 2, sink);
		else
		    nbits += coder.encodeNormallySmallNumber(idx1 - 3, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-22", "DirectionOfUse");
		throw ee;
	    }
	}
	if (has_item7_230) {
	    // Encode field 'item7-23'
	    try {
		DMinute item1 = data.item7_23;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 63)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 63, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-23", "DMinute");
		throw ee;
	    }
	}
	if (has_item7_240) {
	    // Encode field 'item7-24'
	    try {
		DMonth item1 = data.item7_24;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 15)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 15, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-24", "DMonth");
		throw ee;
	    }
	}
	if (has_item7_250) {
	    // Encode field 'item7-25'
	    try {
		DOffset item1 = data.item7_25;
		long temp1 = item1.longValue();

		if (temp1 < -840 || temp1 > 840)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, -840, 840, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-25", "DOffset");
		throw ee;
	    }
	}
	if (has_item7_260) {
	    // Encode field 'item7-26'
	    try {
		DrivenLineOffset item1 = data.item7_26;
		long temp1 = item1.longValue();

		if (temp1 < -32767 || temp1 > 32767)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, -32767, 32767, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-26", "DrivenLineOffset");
		throw ee;
	    }
	}
	if (has_item7_270) {
	    // Encode field 'item7-27'
	    try {
		DrivingWheelAngle item1 = data.item7_27;
		long temp1 = item1.longValue();

		if (temp1 < -127 || temp1 > 127)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, -127, 127, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-27", "DrivingWheelAngle");
		throw ee;
	    }
	}
	if (has_item7_280) {
	    // Encode field 'item7-28'
	    try {
		DSecond item1 = data.item7_28;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 65535)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 65535, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-28", "DSecond");
		throw ee;
	    }
	}
	if (has_item7_290) {
	    // Encode field 'item7-29'
	    try {
		DSignalSeconds item1 = data.item7_29;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 30000)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 30000, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-29", "DSignalSeconds");
		throw ee;
	    }
	}
	if (has_item7_300) {
	    // Encode field 'item7-30'
	    try {
		DSRCmsgID item1 = data.item7_30;
		int idx1;
		boolean extroot1 = true;

		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else {
		    idx1 = item1.indexOf();
		    if (idx1 < 0)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    extroot1 = idx1 < 17;
		}
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 16, sink);
		else
		    nbits += coder.encodeNormallySmallNumber(idx1 - 17, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-30", "DSRCmsgID");
		throw ee;
	    }
	}
	if (has_item7_310) {
	    // Encode field 'item7-31'
	    try {
		DYear item1 = data.item7_31;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 9999)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 9999, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-31", "DYear");
		throw ee;
	    }
	}
	if (has_item7_320) {
	    // Encode field 'item7-32'
	    try {
		ElevationConfidence item1 = data.item7_32;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 15, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-32", "ElevationConfidence");
		throw ee;
	    }
	}
	if (has_item7_330) {
	    // Encode field 'item7-33'
	    try {
		Elevation item1 = data.item7_33;
		int len1 = item1.getSize();

		if (len1 != 2)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 2, 2, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-33", "Elevation");
		throw ee;
	    }
	}
	if (has_item7_340) {
	    // Encode field 'item7-34'
	    try {
		EmergencyDetails item1 = data.item7_34;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 63)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 63, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-34", "EmergencyDetails");
		throw ee;
	    }
	}
	if (has_item7_350) {
	    // Encode field 'item7-35'
	    try {
		EventFlags item1 = data.item7_35;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 8192)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 8192, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-35", "EventFlags");
		throw ee;
	    }
	}
	if (has_item7_360) {
	    // Encode field 'item7-36'
	    try {
		Extent item1 = data.item7_36;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 11, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-36", "Extent");
		throw ee;
	    }
	}
	if (has_item7_370) {
	    // Encode field 'item7-37'
	    try {
		ExteriorLights item1 = data.item7_37;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 256)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 256, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-37", "ExteriorLights");
		throw ee;
	    }
	}
	if (has_item7_380) {
	    // Encode field 'item7-38'
	    try {
		FurtherInfoID item1 = data.item7_38;
		int len1 = item1.getSize();

		if (len1 != 2)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 2, 2, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-38", "FurtherInfoID");
		throw ee;
	    }
	}
	if (has_item7_390) {
	    // Encode field 'item7-39'
	    try {
		GPSstatus item1 = data.item7_39;
		int len1 = item1.getSize();
		int total_len1;

		total_len1 = item1.getLastBit();
		nbits += com.oss.coders.per.PerBitstring.encode(coder, item1.byteArrayValue(), len1, total_len1, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-39", "GPSstatus");
		throw ee;
	    }
	}
	if (has_item7_400) {
	    // Encode field 'item7-40'
	    try {
		HeadingConfidence item1 = data.item7_40;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 7, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-40", "HeadingConfidence");
		throw ee;
	    }
	}
	if (has_item7_410) {
	    // Encode field 'item7-41'
	    try {
		Heading item1 = data.item7_41;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 28800)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 28800, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-41", "Heading");
		throw ee;
	    }
	}
	if (has_item7_420) {
	    // Encode field 'item7-42'
	    try {
		HeadingSlice item1 = data.item7_42;
		int len1 = item1.getSize();

		if (len1 != 2)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 2, 2, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-42", "HeadingSlice");
		throw ee;
	    }
	}
	if (has_item7_430) {
	    // Encode field 'item7-43'
	    try {
		IntersectionStatusObject item1 = data.item7_43;
		int len1 = item1.getSize();

		if (len1 != 1)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 1, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-43", "IntersectionStatusObject");
		throw ee;
	    }
	}
	if (has_item7_440) {
	    // Encode field 'item7-44'
	    try {
		IntersectionID item1 = data.item7_44;
		int len1 = item1.getSize();

		if (len1 < 2 || len1 > 4)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 2, 4, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-44", "IntersectionID");
		throw ee;
	    }
	}
	if (has_item7_450) {
	    // Encode field 'item7-45'
	    try {
		AxleLocation item1 = data.item7_45;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 127)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 127, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-45", "AxleLocation");
		throw ee;
	    }
	}
	if (has_item7_460) {
	    // Encode field 'item7-46'
	    try {
		AxleWeight item1 = data.item7_46;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 65535)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 65535, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-46", "AxleWeight");
		throw ee;
	    }
	}
	if (has_item7_470) {
	    // Encode field 'item7-47'
	    try {
		CargoWeight item1 = data.item7_47;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 65535)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 65535, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-47", "CargoWeight");
		throw ee;
	    }
	}
	if (has_item7_480) {
	    // Encode field 'item7-48'
	    try {
		DriveAxleLiftAirPressure item1 = data.item7_48;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 1000)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 1000, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-48", "DriveAxleLiftAirPressure");
		throw ee;
	    }
	}
	if (has_item7_490) {
	    // Encode field 'item7-49'
	    try {
		DriveAxleLocation item1 = data.item7_49;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 255)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-49", "DriveAxleLocation");
		throw ee;
	    }
	}
	if (has_item7_500) {
	    // Encode field 'item7-50'
	    try {
		DriveAxleLubePressure item1 = data.item7_50;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 1000)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 1000, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-50", "DriveAxleLubePressure");
		throw ee;
	    }
	}
	if (has_item7_510) {
	    // Encode field 'item7-51'
	    try {
		DriveAxleTemperature item1 = data.item7_51;
		long temp1 = item1.longValue();

		if (temp1 < -40 || temp1 > 210)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, -40, 210, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-51", "DriveAxleTemperature");
		throw ee;
	    }
	}
	if (has_item7_520) {
	    // Encode field 'item7-52'
	    try {
		SteeringAxleLubePressure item1 = data.item7_52;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 255)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-52", "SteeringAxleLubePressure");
		throw ee;
	    }
	}
	if (has_item7_530) {
	    // Encode field 'item7-53'
	    try {
		SteeringAxleTemperature item1 = data.item7_53;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 255)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-53", "SteeringAxleTemperature");
		throw ee;
	    }
	}
	if (has_item7_540) {
	    // Encode field 'item7-54'
	    try {
		TireLeakageRate item1 = data.item7_54;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 65535)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 65535, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-54", "TireLeakageRate");
		throw ee;
	    }
	}
	if (has_item7_550) {
	    // Encode field 'item7-55'
	    try {
		TireLocation item1 = data.item7_55;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 255)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-55", "TireLocation");
		throw ee;
	    }
	}
	if (has_item7_560) {
	    // Encode field 'item7-56'
	    try {
		TirePressureThresholdDetection item1 = data.item7_56;
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
		ee.appendFieldContext("item7-56", "TirePressureThresholdDetection");
		throw ee;
	    }
	}
	if (has_item7_570) {
	    // Encode field 'item7-57'
	    try {
		TirePressure item1 = data.item7_57;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 1000)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 1000, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-57", "TirePressure");
		throw ee;
	    }
	}
	if (has_item7_580) {
	    // Encode field 'item7-58'
	    try {
		TireTemp item1 = data.item7_58;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 65535)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 65535, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-58", "TireTemp");
		throw ee;
	    }
	}
	if (has_item7_590) {
	    // Encode field 'item7-59'
	    try {
		TrailerWeight item1 = data.item7_59;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 65535)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 65535, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-59", "TrailerWeight");
		throw ee;
	    }
	}
	if (has_item7_600) {
	    // Encode field 'item7-60'
	    try {
		WheelEndElectFault item1 = data.item7_60;
		int len1 = item1.getSize();
		int total_len1;

		total_len1 = item1.getLastBit();
		nbits += com.oss.coders.per.PerBitstring.encode(coder, item1.byteArrayValue(), len1, total_len1, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-60", "WheelEndElectFault");
		throw ee;
	    }
	}
	if (has_item7_610) {
	    // Encode field 'item7-61'
	    try {
		WheelSensorStatus item1 = data.item7_61;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 3, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-61", "WheelSensorStatus");
		throw ee;
	    }
	}
	if (has_item7_620) {
	    // Encode field 'item7-62'
	    try {
		LaneCount item1 = data.item7_62;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 255)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-62", "LaneCount");
		throw ee;
	    }
	}
	if (has_item7_630) {
	    // Encode field 'item7-63'
	    try {
		LaneManeuverCode item1 = data.item7_63;
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
		ee.appendFieldContext("item7-63", "LaneManeuverCode");
		throw ee;
	    }
	}
	if (has_item7_640) {
	    // Encode field 'item7-64'
	    try {
		LaneNumber item1 = data.item7_64;
		int len1 = item1.getSize();

		if (len1 != 1)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 1, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-64", "LaneNumber");
		throw ee;
	    }
	}
	if (has_item7_650) {
	    // Encode field 'item7-65'
	    try {
		LaneSet item1 = data.item7_65;
		int len1 = item1.getSize();

		if (len1 < 1 || len1 > 127)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 127, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-65", "LaneSet");
		throw ee;
	    }
	}
	if (has_item7_660) {
	    // Encode field 'item7-66'
	    try {
		LaneWidth item1 = data.item7_66;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 32767)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 32767, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-66", "LaneWidth");
		throw ee;
	    }
	}
	if (has_item7_670) {
	    // Encode field 'item7-67'
	    try {
		Latitude item1 = data.item7_67;
		long temp1 = item1.longValue();

		if (temp1 < -900000000 || temp1 > 900000001)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, -900000000, 900000001, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-67", "Latitude");
		throw ee;
	    }
	}
	if (has_item7_680) {
	    // Encode field 'item7-68'
	    try {
		LayerID item1 = data.item7_68;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 100)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 100, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-68", "LayerID");
		throw ee;
	    }
	}
	if (has_item7_690) {
	    // Encode field 'item7-69'
	    try {
		LayerType item1 = data.item7_69;
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
		ee.appendFieldContext("item7-69", "LayerType");
		throw ee;
	    }
	}
	if (has_item7_700) {
	    // Encode field 'item7-70'
	    try {
		LightbarInUse item1 = data.item7_70;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 9, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-70", "LightbarInUse");
		throw ee;
	    }
	}
	if (has_item7_710) {
	    // Encode field 'item7-71'
	    try {
		Longitude item1 = data.item7_71;
		long temp1 = item1.longValue();

		if (temp1 < -1800000000 || temp1 > 1800000001)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, -1800000000, 1800000001, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-71", "Longitude");
		throw ee;
	    }
	}
	if (has_item7_720) {
	    // Encode field 'item7-72'
	    try {
		Location_quality item1 = data.item7_72;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 7, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-72", "Location-quality");
		throw ee;
	    }
	}
	if (has_item7_730) {
	    // Encode field 'item7-73'
	    try {
		Location_tech item1 = data.item7_73;
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
		ee.appendFieldContext("item7-73", "Location-tech");
		throw ee;
	    }
	}
	if (has_item7_740) {
	    // Encode field 'item7-74'
	    try {
		MinuteOfTheYear item1 = data.item7_74;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 525960)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 525960, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-74", "MinuteOfTheYear");
		throw ee;
	    }
	}
	if (has_item7_750) {
	    // Encode field 'item7-75'
	    try {
		MinutesDuration item1 = data.item7_75;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 32000)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 32000, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-75", "MinutesDuration");
		throw ee;
	    }
	}
	if (has_item7_760) {
	    // Encode field 'item7-76'
	    try {
		MsgCount item1 = data.item7_76;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 127)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 127, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-76", "MsgCount");
		throw ee;
	    }
	}
	if (has_item7_770) {
	    // Encode field 'item7-77'
	    try {
		MsgCRC item1 = data.item7_77;
		int len1 = item1.getSize();

		if (len1 != 2)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 2, 2, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-77", "MsgCRC");
		throw ee;
	    }
	}
	if (has_item7_780) {
	    // Encode field 'item7-78'
	    try {
		MultiVehicleResponse item1 = data.item7_78;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 3, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-78", "MultiVehicleResponse");
		throw ee;
	    }
	}
	if (has_item7_790) {
	    // Encode field 'item7-79'
	    try {
		MUTCDCode item1 = data.item7_79;
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
		ee.appendFieldContext("item7-79", "MUTCDCode");
		throw ee;
	    }
	}
	if (has_item7_800) {
	    // Encode field 'item7-80'
	    try {
		NMEA_MsgType item1 = data.item7_80;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 32767)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 32767, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-80", "NMEA-MsgType");
		throw ee;
	    }
	}
	if (has_item7_810) {
	    // Encode field 'item7-81'
	    try {
		NMEA_Payload item1 = data.item7_81;
		int len1 = item1.getSize();

		if (len1 < 1 || len1 > 1023)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 1023, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-81", "NMEA-Payload");
		throw ee;
	    }
	}
	if (has_item7_820) {
	    // Encode field 'item7-82'
	    try {
		NMEA_Revision item1 = data.item7_82;
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
		ee.appendFieldContext("item7-82", "NMEA-Revision");
		throw ee;
	    }
	}
	if (has_item7_830) {
	    // Encode field 'item7-83'
	    try {
		NTCIPVehicleclass item1 = data.item7_83;
		int len1 = item1.getSize();

		if (len1 != 1)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 1, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-83", "NTCIPVehicleclass");
		throw ee;
	    }
	}
	if (has_item7_840) {
	    // Encode field 'item7-84'
	    try {
		ObjectCount item1 = data.item7_84;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 6000)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 6000, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-84", "ObjectCount");
		throw ee;
	    }
	}
	if (has_item7_850) {
	    // Encode field 'item7-85'
	    try {
		ObstacleDirection item1 = data.item7_85;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 28800)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 28800, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-85", "ObstacleDirection");
		throw ee;
	    }
	}
	if (has_item7_860) {
	    // Encode field 'item7-86'
	    try {
		ObstacleDistance item1 = data.item7_86;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 32767)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 32767, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-86", "ObstacleDistance");
		throw ee;
	    }
	}
	if (has_item7_870) {
	    // Encode field 'item7-87'
	    try {
		PayloadData item1 = data.item7_87;
		int len1 = item1.getSize();

		if (len1 < 1 || len1 > 2048)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 2048, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-87", "PayloadData");
		throw ee;
	    }
	}
	if (has_item7_880) {
	    // Encode field 'item7-88'
	    try {
		Payload item1 = data.item7_88;
		int len1 = item1.getSize();

		if (len1 < 1 || len1 > 64)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 64, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-88", "Payload");
		throw ee;
	    }
	}
	if (has_item7_890) {
	    // Encode field 'item7-89'
	    try {
		PedestrianDetect item1 = data.item7_89;
		int idx1;
		boolean extroot1 = true;

		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else {
		    idx1 = item1.indexOf();
		    if (idx1 < 0)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    extroot1 = idx1 < 4;
		}
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 3, sink);
		else
		    nbits += coder.encodeNormallySmallNumber(idx1 - 4, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-89", "PedestrianDetect");
		throw ee;
	    }
	}
	if (has_item7_900) {
	    // Encode field 'item7-90'
	    try {
		PedestrianSignalState item1 = data.item7_90;
		int idx1;
		boolean extroot1 = true;

		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else {
		    idx1 = item1.indexOf();
		    if (idx1 < 0)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    extroot1 = idx1 < 4;
		}
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 3, sink);
		else
		    nbits += coder.encodeNormallySmallNumber(idx1 - 4, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-90", "PedestrianSignalState");
		throw ee;
	    }
	}
	if (has_item7_910) {
	    // Encode field 'item7-91'
	    try {
		PositionConfidence item1 = data.item7_91;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 15, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-91", "PositionConfidence");
		throw ee;
	    }
	}
	if (has_item7_920) {
	    // Encode field 'item7-92'
	    try {
		PreemptState item1 = data.item7_92;
		int idx1;
		boolean extroot1 = true;

		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else {
		    idx1 = item1.indexOf();
		    if (idx1 < 0)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    extroot1 = idx1 < 11;
		}
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 10, sink);
		else
		    nbits += coder.encodeNormallySmallNumber(idx1 - 11, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-92", "PreemptState");
		throw ee;
	    }
	}
	if (has_item7_930) {
	    // Encode field 'item7-93'
	    try {
		Priority item1 = data.item7_93;
		int len1 = item1.getSize();

		if (len1 != 1)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 1, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-93", "Priority");
		throw ee;
	    }
	}
	if (has_item7_940) {
	    // Encode field 'item7-94'
	    try {
		PriorityState item1 = data.item7_94;
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
		ee.appendFieldContext("item7-94", "PriorityState");
		throw ee;
	    }
	}
	if (has_item7_950) {
	    // Encode field 'item7-95'
	    try {
		ProbeSegmentNumber item1 = data.item7_95;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 32767)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 32767, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-95", "ProbeSegmentNumber");
		throw ee;
	    }
	}
	if (has_item7_960) {
	    // Encode field 'item7-96'
	    try {
		RainSensor item1 = data.item7_96;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 7, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-96", "RainSensor");
		throw ee;
	    }
	}
	if (has_item7_970) {
	    // Encode field 'item7-97'
	    try {
		RequestedItem item1 = data.item7_97;
		int idx1;
		boolean extroot1 = true;

		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else {
		    idx1 = item1.indexOf();
		    if (idx1 < 0)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    extroot1 = idx1 < 18;
		}
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 17, sink);
		else
		    nbits += coder.encodeNormallySmallNumber(idx1 - 18, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-97", "RequestedItem");
		throw ee;
	    }
	}
	if (has_item7_980) {
	    // Encode field 'item7-98'
	    try {
		ResponseType item1 = data.item7_98;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 3, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-98", "ResponseType");
		throw ee;
	    }
	}
	if (has_item7_990) {
	    // Encode field 'item7-99'
	    try {
		RTCM_ID item1 = data.item7_99;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 32767)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 32767, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-99", "RTCM-ID");
		throw ee;
	    }
	}
	if (has_item7_1000) {
	    // Encode field 'item7-100'
	    try {
		RTCM_Payload item1 = data.item7_100;
		int len1 = item1.getSize();

		if (len1 < 1 || len1 > 1023)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 1023, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-100", "RTCM-Payload");
		throw ee;
	    }
	}
	if (has_item7_1010) {
	    // Encode field 'item7-101'
	    try {
		RTCM_Revision item1 = data.item7_101;
		int idx1;
		boolean extroot1 = true;

		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else {
		    idx1 = item1.indexOf();
		    if (idx1 < 0)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    extroot1 = idx1 < 17;
		}
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 16, sink);
		else
		    nbits += coder.encodeNormallySmallNumber(idx1 - 17, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-101", "RTCM-Revision");
		throw ee;
	    }
	}
	if (has_item7_1020) {
	    // Encode field 'item7-102'
	    try {
		SignalLightState item1 = data.item7_102;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 536870912)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 536870912, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-102", "SignalLightState");
		throw ee;
	    }
	}
	if (has_item7_1030) {
	    // Encode field 'item7-103'
	    try {
		SignalReqScheme item1 = data.item7_103;
		int len1 = item1.getSize();

		if (len1 != 1)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 1, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-103", "SignalReqScheme");
		throw ee;
	    }
	}
	if (has_item7_1040) {
	    // Encode field 'item7-104'
	    try {
		SignalState item1 = data.item7_104;
		int len1 = item1.getSize();

		if (len1 != 1)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 1, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-104", "SignalState");
		throw ee;
	    }
	}
	if (has_item7_1050) {
	    // Encode field 'item7-105'
	    try {
		SignPrority item1 = data.item7_105;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 7)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 7, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-105", "SignPrority");
		throw ee;
	    }
	}
	if (has_item7_1060) {
	    // Encode field 'item7-106'
	    try {
		SirenInUse item1 = data.item7_106;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 3, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-106", "SirenInUse");
		throw ee;
	    }
	}
	if (has_item7_1070) {
	    // Encode field 'item7-107'
	    try {
		SpecialLaneAttributes item1 = data.item7_107;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 8, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-107", "SpecialLaneAttributes");
		throw ee;
	    }
	}
	if (has_item7_1080) {
	    // Encode field 'item7-108'
	    try {
		SpecialSignalState item1 = data.item7_108;
		int idx1;
		boolean extroot1 = true;

		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else {
		    idx1 = item1.indexOf();
		    if (idx1 < 0)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    extroot1 = idx1 < 5;
		}
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 4, sink);
		else
		    nbits += coder.encodeNormallySmallNumber(idx1 - 5, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-108", "SpecialSignalState");
		throw ee;
	    }
	}
	if (has_item7_1090) {
	    // Encode field 'item7-109'
	    try {
		SpeedConfidence item1 = data.item7_109;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 7, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-109", "SpeedConfidence");
		throw ee;
	    }
	}
	if (has_item7_1100) {
	    // Encode field 'item7-110'
	    try {
		Speed item1 = data.item7_110;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 8191)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 8191, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-110", "Speed");
		throw ee;
	    }
	}
	if (has_item7_1110) {
	    // Encode field 'item7-111'
	    try {
		StabilityControlStatus item1 = data.item7_111;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 2, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-111", "StabilityControlStatus");
		throw ee;
	    }
	}
	if (has_item7_1120) {
	    // Encode field 'item7-112'
	    try {
		StateConfidence item1 = data.item7_112;
		int idx1;
		boolean extroot1 = true;

		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else {
		    idx1 = item1.indexOf();
		    if (idx1 < 0)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    extroot1 = idx1 < 4;
		}
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 3, sink);
		else
		    nbits += coder.encodeNormallySmallNumber(idx1 - 4, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-112", "StateConfidence");
		throw ee;
	    }
	}
	if (has_item7_1130) {
	    // Encode field 'item7-113'
	    try {
		SteeringWheelAngleConfidence item1 = data.item7_113;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 3, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-113", "SteeringWheelAngleConfidence");
		throw ee;
	    }
	}
	if (has_item7_1140) {
	    // Encode field 'item7-114'
	    try {
		SteeringWheelAngleRateOfChange item1 = data.item7_114;
		long temp1 = item1.longValue();

		if (temp1 < -127 || temp1 > 127)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, -127, 127, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-114", "SteeringWheelAngleRateOfChange");
		throw ee;
	    }
	}
	if (has_item7_1150) {
	    // Encode field 'item7-115'
	    try {
		SteeringWheelAngle item1 = data.item7_115;
		int len1 = item1.getSize();

		if (len1 != 1)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 1, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-115", "SteeringWheelAngle");
		throw ee;
	    }
	}
	if (has_item7_1160) {
	    // Encode field 'item7-116'
	    try {
		SunSensor item1 = data.item7_116;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 1000)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 1000, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-116", "SunSensor");
		throw ee;
	    }
	}
	if (has_item7_1170) {
	    // Encode field 'item7-117'
	    try {
		TemporaryID item1 = data.item7_117;
		int len1 = item1.getSize();

		if (len1 != 4)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 4, 4, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-117", "TemporaryID");
		throw ee;
	    }
	}
	if (has_item7_1180) {
	    // Encode field 'item7-118'
	    try {
		TermDistance item1 = data.item7_118;
		long temp1 = item1.longValue();

		if (temp1 < 1 || temp1 > 30000)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 1, 30000, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-118", "TermDistance");
		throw ee;
	    }
	}
	if (has_item7_1190) {
	    // Encode field 'item7-119'
	    try {
		TermTime item1 = data.item7_119;
		long temp1 = item1.longValue();

		if (temp1 < 1 || temp1 > 1800)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 1, 1800, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-119", "TermTime");
		throw ee;
	    }
	}
	if (has_item7_1200) {
	    // Encode field 'item7-120'
	    try {
		ThrottleConfidence item1 = data.item7_120;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 3, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-120", "ThrottleConfidence");
		throw ee;
	    }
	}
	if (has_item7_1210) {
	    // Encode field 'item7-121'
	    try {
		ThrottlePosition item1 = data.item7_121;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 200)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 200, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-121", "ThrottlePosition");
		throw ee;
	    }
	}
	if (has_item7_1220) {
	    // Encode field 'item7-122'
	    try {
		TimeConfidence item1 = data.item7_122;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 39, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-122", "TimeConfidence");
		throw ee;
	    }
	}
	if (has_item7_1230) {
	    // Encode field 'item7-123'
	    try {
		TimeMark item1 = data.item7_123;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 12002)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 12002, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-123", "TimeMark");
		throw ee;
	    }
	}
	if (has_item7_1240) {
	    // Encode field 'item7-124'
	    try {
		TractionControlState item1 = data.item7_124;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 3, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-124", "TractionControlState");
		throw ee;
	    }
	}
	if (has_item7_1250) {
	    // Encode field 'item7-125'
	    try {
		TransitPreEmptionRequest item1 = data.item7_125;
		int idx1;
		boolean extroot1 = true;

		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else {
		    idx1 = item1.indexOf();
		    if (idx1 < 0)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    extroot1 = idx1 < 4;
		}
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 3, sink);
		else
		    nbits += coder.encodeNormallySmallNumber(idx1 - 4, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-125", "TransitPreEmptionRequest");
		throw ee;
	    }
	}
	if (has_item7_1260) {
	    // Encode field 'item7-126'
	    try {
		TransitStatus item1 = data.item7_126;
		int len1 = item1.getSize();
		int total_len1;

		total_len1 = com.oss.util.BitTool.computeMinimalLength(item1, AllInclusive._cBounds_item7_126);
		if (total_len1 != 6)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + total_len1);
		nbits += com.oss.coders.per.PerBitstring.encode(coder, item1.byteArrayValue(), len1, total_len1, 6, 6, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-126", "TransitStatus");
		throw ee;
	    }
	}
	if (has_item7_1270) {
	    // Encode field 'item7-127'
	    try {
		TransmissionState item1 = data.item7_127;
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
		ee.appendFieldContext("item7-127", "TransmissionState");
		throw ee;
	    }
	}
	if (has_item7_1280) {
	    // Encode field 'item7-128'
	    try {
		TxTime item1 = data.item7_128;
		long temp1 = item1.longValue();

		if (temp1 < 1 || temp1 > 20)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 1, 20, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-128", "TxTime");
		throw ee;
	    }
	}
	if (has_item7_1290) {
	    // Encode field 'item7-129'
	    try {
		TravelerInfoType item1 = data.item7_129;
		int idx1;
		boolean extroot1 = true;

		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else {
		    idx1 = item1.indexOf();
		    if (idx1 < 0)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    extroot1 = idx1 < 4;
		}
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 3, sink);
		else
		    nbits += coder.encodeNormallySmallNumber(idx1 - 4, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-129", "TravelerInfoType");
		throw ee;
	    }
	}
	if (has_item7_1300) {
	    // Encode field 'item7-130'
	    try {
		UniqueMSGID item1 = data.item7_130;
		int len1 = item1.getSize();

		if (len1 != 9)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 9, 9, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-130", "UniqueMSGID");
		throw ee;
	    }
	}
	if (has_item7_1310) {
	    // Encode field 'item7-131'
	    try {
		URL_Base item1 = data.item7_131;
		int len1 = item1.getSize();

		if (len1 < 1 || len1 > 45)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerKMCString.encode(coder, item1.stringValue(), 1, 45, AllInclusive._cEPAInfo_item7_131, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-131", "URL-Base");
		throw ee;
	    }
	}
	if (has_item7_1320) {
	    // Encode field 'item7-132'
	    try {
		URL_Link item1 = data.item7_132;
		int len1 = item1.getSize();

		if (len1 < 1 || len1 > 255)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerKMCString.encode(coder, item1.stringValue(), 1, 255, AllInclusive._cEPAInfo_item7_132, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-132", "URL-Link");
		throw ee;
	    }
	}
	if (has_item7_1330) {
	    // Encode field 'item7-133'
	    try {
		URL_Short item1 = data.item7_133;
		int len1 = item1.getSize();

		if (len1 < 1 || len1 > 15)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerKMCString.encode(coder, item1.stringValue(), 1, 15, AllInclusive._cEPAInfo_item7_133, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-133", "URL-Short");
		throw ee;
	    }
	}
	if (has_item7_1340) {
	    // Encode field 'item7-134'
	    try {
		VehicleHeight item1 = data.item7_134;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 127)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 127, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-134", "VehicleHeight");
		throw ee;
	    }
	}
	if (has_item7_1350) {
	    // Encode field 'item7-135'
	    try {
		VehicleLaneAttributes item1 = data.item7_135;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 65535)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 65535, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-135", "VehicleLaneAttributes");
		throw ee;
	    }
	}
	if (has_item7_1360) {
	    // Encode field 'item7-136'
	    try {
		VehicleLength item1 = data.item7_136;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 16383)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 16383, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-136", "VehicleLength");
		throw ee;
	    }
	}
	if (has_item7_1370) {
	    // Encode field 'item7-137'
	    try {
		VehicleMass item1 = data.item7_137;
		long temp1 = item1.longValue();

		if (temp1 < 1 || temp1 > 127)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 1, 127, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-137", "VehicleMass");
		throw ee;
	    }
	}
	if (has_item7_1380) {
	    // Encode field 'item7-138'
	    try {
		VehicleRequestStatus item1 = data.item7_138;
		int len1 = item1.getSize();

		if (len1 != 1)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 1, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-138", "VehicleRequestStatus");
		throw ee;
	    }
	}
	if (has_item7_1390) {
	    // Encode field 'item7-139'
	    try {
		VehicleStatusDeviceTypeTag item1 = data.item7_139;
		int idx1;
		boolean extroot1 = true;

		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else {
		    idx1 = item1.indexOf();
		    if (idx1 < 0)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    extroot1 = idx1 < 29;
		}
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 28, sink);
		else
		    nbits += coder.encodeNormallySmallNumber(idx1 - 29, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-139", "VehicleStatusDeviceTypeTag");
		throw ee;
	    }
	}
	if (has_item7_1400) {
	    // Encode field 'item7-140'
	    try {
		VehicleType item1 = data.item7_140;
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
		ee.appendFieldContext("item7-140", "VehicleType");
		throw ee;
	    }
	}
	if (has_item7_1410) {
	    // Encode field 'item7-141'
	    try {
		VehicleWidth item1 = data.item7_141;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 1023)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 1023, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-141", "VehicleWidth");
		throw ee;
	    }
	}
	if (has_item7_1420) {
	    // Encode field 'item7-142'
	    try {
		VerticalAccelerationThreshold item1 = data.item7_142;
		int len1 = item1.getSize();
		int total_len1;

		total_len1 = item1.getLastBit();
		nbits += com.oss.coders.per.PerBitstring.encode(coder, item1.byteArrayValue(), len1, total_len1, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-142", "VerticalAccelerationThreshold");
		throw ee;
	    }
	}
	if (has_item7_1430) {
	    // Encode field 'item7-143'
	    try {
		VerticalAcceleration item1 = data.item7_143;
		long temp1 = item1.longValue();

		if (temp1 < -127 || temp1 > 127)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, -127, 127, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-143", "VerticalAcceleration");
		throw ee;
	    }
	}
	if (has_item7_1440) {
	    // Encode field 'item7-144'
	    try {
		VINstring item1 = data.item7_144;
		int len1 = item1.getSize();

		if (len1 < 1 || len1 > 17)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 17, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-144", "VINstring");
		throw ee;
	    }
	}
	if (has_item7_1450) {
	    // Encode field 'item7-145'
	    try {
		WiperRate item1 = data.item7_145;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 127)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 127, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-145", "WiperRate");
		throw ee;
	    }
	}
	if (has_item7_1460) {
	    // Encode field 'item7-146'
	    try {
		WiperStatusFront item1 = data.item7_146;
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
		ee.appendFieldContext("item7-146", "WiperStatusFront");
		throw ee;
	    }
	}
	if (has_item7_1470) {
	    // Encode field 'item7-147'
	    try {
		WiperStatusRear item1 = data.item7_147;
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
		ee.appendFieldContext("item7-147", "WiperStatusRear");
		throw ee;
	    }
	}
	if (has_item7_1480) {
	    // Encode field 'item7-148'
	    try {
		YawRateConfidence item1 = data.item7_148;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 7, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-148", "YawRateConfidence");
		throw ee;
	    }
	}
	if (has_item7_1490) {
	    // Encode field 'item7-149'
	    try {
		YawRate item1 = data.item7_149;
		long temp1 = item1.longValue();

		if (temp1 < -32767 || temp1 > 32767)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, -32767, 32767, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item7-149", "YawRate");
		throw ee;
	    }
	}
	if (has_item8_10) {
	    // Encode field 'item8-1'
	    try {
		com.bah.ode.asn.oss.itis.IncidentResponseEquipment item1 = data.item8_1;
		int idx1;
		boolean extroot1 = true;

		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else {
		    idx1 = item1.indexOf();
		    if (idx1 < 0)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    extroot1 = idx1 < 72;
		}
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 71, sink);
		else
		    nbits += coder.encodeNormallySmallNumber(idx1 - 72, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item8-1", "IncidentResponseEquipment");
		throw ee;
	    }
	}
	if (has_item8_20) {
	    // Encode field 'item8-2'
	    try {
		com.bah.ode.asn.oss.itis.ITIStext item1 = data.item8_2;
		int len1 = item1.getSize();

		if (len1 < 1 || len1 > 500)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerKMCString.encode(coder, item1.stringValue(), 1, 500, AllInclusive._cEPAInfo_item8_2, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item8-2", "ITIStext");
		throw ee;
	    }
	}
	if (has_item8_30) {
	    // Encode field 'item8-3'
	    try {
		com.bah.ode.asn.oss.itis.ResponderGroupAffected item1 = data.item8_3;
		int idx1;
		boolean extroot1 = true;

		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else {
		    idx1 = item1.indexOf();
		    if (idx1 < 0)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    extroot1 = idx1 < 14;
		}
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 13, sink);
		else
		    nbits += coder.encodeNormallySmallNumber(idx1 - 14, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item8-3", "ResponderGroupAffected");
		throw ee;
	    }
	}
	if (has_item8_40) {
	    // Encode field 'item8-4'
	    try {
		com.bah.ode.asn.oss.itis.VehicleGroupAffected item1 = data.item8_4;
		int idx1;
		boolean extroot1 = true;

		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else {
		    idx1 = item1.indexOf();
		    if (idx1 < 0)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    extroot1 = idx1 < 35;
		}
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 34, sink);
		else
		    nbits += coder.encodeNormallySmallNumber(idx1 - 35, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item8-4", "VehicleGroupAffected");
		throw ee;
	    }
	}
	if (has_item8_50) {
	    // Encode field 'item8-5'
	    try {
		com.bah.ode.asn.oss.itis.ITIScodesAndText item1 = data.item8_5;

		nbits += com.bah.ode.asn.oss.itis.ITIScodesAndText.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item8-5", "ITIScodesAndText");
		throw ee;
	    }
	}
	if (has_item8_60) {
	    // Encode field 'item8-6'
	    try {
		com.bah.ode.asn.oss.ntcip.EssMobileFriction item1 = data.item8_6;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 101)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 101, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item8-6", "EssMobileFriction");
		throw ee;
	    }
	}
	if (has_item8_70) {
	    // Encode field 'item8-7'
	    try {
		com.bah.ode.asn.oss.ntcip.EssPrecipRate item1 = data.item8_7;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 65535)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 65535, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item8-7", "EssPrecipRate");
		throw ee;
	    }
	}
	if (has_item8_80) {
	    // Encode field 'item8-8'
	    try {
		com.bah.ode.asn.oss.ntcip.EssPrecipSituation item1 = data.item8_8;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 14, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item8-8", "EssPrecipSituation");
		throw ee;
	    }
	}
	if (has_item8_90) {
	    // Encode field 'item8-9'
	    try {
		com.bah.ode.asn.oss.ntcip.EssPrecipYesNo item1 = data.item8_9;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 2, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item8-9", "EssPrecipYesNo");
		throw ee;
	    }
	}
	if (has_item8_100) {
	    // Encode field 'item8-10'
	    try {
		com.bah.ode.asn.oss.ntcip.EssSolarRadiation item1 = data.item8_10;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 65535)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 65535, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item8-10", "EssSolarRadiation");
		throw ee;
	    }
	}
	if (has_item8_110) {
	    // Encode field 'item8-11'
	    try {
		com.bah.ode.asn.oss.itis.ITIScodes item1 = data.item8_11;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 65565)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 65565, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item8-11", "ITIScodes");
		throw ee;
	    }
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static AllInclusive decodeValue(PerCoder coder, InputBitStream source, AllInclusive data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	int idx0;
	InputBitStream bitstream0 = null;

	boolean has_item6_10 = source.readBit();
	boolean has_item6_20 = source.readBit();
	boolean has_item6_40 = source.readBit();
	boolean has_item6_50 = source.readBit();
	boolean has_item6_60 = source.readBit();
	boolean has_item6_70 = source.readBit();
	boolean has_item6_80 = source.readBit();
	boolean has_item6_90 = source.readBit();
	boolean has_item6_100 = source.readBit();
	boolean has_item6_110 = source.readBit();
	boolean has_item6_120 = source.readBit();
	boolean has_item6_130 = source.readBit();
	boolean has_item6_140 = source.readBit();
	boolean has_item6_150 = source.readBit();
	boolean has_item6_160 = source.readBit();
	boolean has_item6_170 = source.readBit();
	boolean has_item6_180 = source.readBit();
	boolean has_item6_190 = source.readBit();
	boolean has_item6_200 = source.readBit();
	boolean has_item6_210 = source.readBit();
	boolean has_item6_220 = source.readBit();
	boolean has_item6_230 = source.readBit();
	boolean has_item6_240 = source.readBit();
	boolean has_item6_250 = source.readBit();
	boolean has_item6_260 = source.readBit();
	boolean has_item6_270 = source.readBit();
	boolean has_item6_280 = source.readBit();
	boolean has_item6_290 = source.readBit();
	boolean has_item6_300 = source.readBit();
	boolean has_item6_310 = source.readBit();
	boolean has_item6_320 = source.readBit();
	boolean has_item6_330 = source.readBit();
	boolean has_item6_340 = source.readBit();
	boolean has_item6_350 = source.readBit();
	boolean has_item6_360 = source.readBit();
	boolean has_item6_370 = source.readBit();
	boolean has_item6_380 = source.readBit();
	boolean has_item6_390 = source.readBit();
	boolean has_item6_400 = source.readBit();
	boolean has_item6_410 = source.readBit();
	boolean has_item6_420 = source.readBit();
	boolean has_item6_430 = source.readBit();
	boolean has_item6_440 = source.readBit();
	boolean has_item6_450 = source.readBit();
	boolean has_item6_460 = source.readBit();
	boolean has_item6_470 = source.readBit();
	boolean has_item6_480 = source.readBit();
	boolean has_item6_490 = source.readBit();
	boolean has_item6_500 = source.readBit();
	boolean has_item6_510 = source.readBit();
	boolean has_item6_520 = source.readBit();
	boolean has_item6_530 = source.readBit();
	boolean has_item6_540 = source.readBit();
	boolean has_item6_550 = source.readBit();
	boolean has_item6_560 = source.readBit();
	boolean has_item6_570 = source.readBit();
	boolean has_item6_580 = source.readBit();
	boolean has_item6_590 = source.readBit();
	boolean has_item6_600 = source.readBit();
	boolean has_item6_610 = source.readBit();
	boolean has_item6_620 = source.readBit();
	boolean has_item6_630 = source.readBit();
	boolean has_item6_640 = source.readBit();
	boolean has_item6_650 = source.readBit();
	boolean has_item6_660 = source.readBit();
	boolean has_item6_670 = source.readBit();
	boolean has_item6_680 = source.readBit();
	boolean has_item6_690 = source.readBit();
	boolean has_item6_700 = source.readBit();
	boolean has_item6_710 = source.readBit();
	boolean has_item6_720 = source.readBit();
	boolean has_item6_730 = source.readBit();
	boolean has_item7_10 = source.readBit();
	boolean has_item7_20 = source.readBit();
	boolean has_item7_30 = source.readBit();
	boolean has_item7_40 = source.readBit();
	boolean has_item7_50 = source.readBit();
	boolean has_item7_60 = source.readBit();
	boolean has_item7_70 = source.readBit();
	boolean has_item7_80 = source.readBit();
	boolean has_item7_90 = source.readBit();
	boolean has_item7_100 = source.readBit();
	boolean has_item7_110 = source.readBit();
	boolean has_item7_120 = source.readBit();
	boolean has_item7_130 = source.readBit();
	boolean has_item7_140 = source.readBit();
	boolean has_item7_150 = source.readBit();
	boolean has_item7_160 = source.readBit();
	boolean has_item7_170 = source.readBit();
	boolean has_item7_180 = source.readBit();
	boolean has_item7_190 = source.readBit();
	boolean has_item7_200 = source.readBit();
	boolean has_item7_210 = source.readBit();
	boolean has_item7_220 = source.readBit();
	boolean has_item7_230 = source.readBit();
	boolean has_item7_240 = source.readBit();
	boolean has_item7_250 = source.readBit();
	boolean has_item7_260 = source.readBit();
	boolean has_item7_270 = source.readBit();
	boolean has_item7_280 = source.readBit();
	boolean has_item7_290 = source.readBit();
	boolean has_item7_300 = source.readBit();
	boolean has_item7_310 = source.readBit();
	boolean has_item7_320 = source.readBit();
	boolean has_item7_330 = source.readBit();
	boolean has_item7_340 = source.readBit();
	boolean has_item7_350 = source.readBit();
	boolean has_item7_360 = source.readBit();
	boolean has_item7_370 = source.readBit();
	boolean has_item7_380 = source.readBit();
	boolean has_item7_390 = source.readBit();
	boolean has_item7_400 = source.readBit();
	boolean has_item7_410 = source.readBit();
	boolean has_item7_420 = source.readBit();
	boolean has_item7_430 = source.readBit();
	boolean has_item7_440 = source.readBit();
	boolean has_item7_450 = source.readBit();
	boolean has_item7_460 = source.readBit();
	boolean has_item7_470 = source.readBit();
	boolean has_item7_480 = source.readBit();
	boolean has_item7_490 = source.readBit();
	boolean has_item7_500 = source.readBit();
	boolean has_item7_510 = source.readBit();
	boolean has_item7_520 = source.readBit();
	boolean has_item7_530 = source.readBit();
	boolean has_item7_540 = source.readBit();
	boolean has_item7_550 = source.readBit();
	boolean has_item7_560 = source.readBit();
	boolean has_item7_570 = source.readBit();
	boolean has_item7_580 = source.readBit();
	boolean has_item7_590 = source.readBit();
	boolean has_item7_600 = source.readBit();
	boolean has_item7_610 = source.readBit();
	boolean has_item7_620 = source.readBit();
	boolean has_item7_630 = source.readBit();
	boolean has_item7_640 = source.readBit();
	boolean has_item7_650 = source.readBit();
	boolean has_item7_660 = source.readBit();
	boolean has_item7_670 = source.readBit();
	boolean has_item7_680 = source.readBit();
	boolean has_item7_690 = source.readBit();
	boolean has_item7_700 = source.readBit();
	boolean has_item7_710 = source.readBit();
	boolean has_item7_720 = source.readBit();
	boolean has_item7_730 = source.readBit();
	boolean has_item7_740 = source.readBit();
	boolean has_item7_750 = source.readBit();
	boolean has_item7_760 = source.readBit();
	boolean has_item7_770 = source.readBit();
	boolean has_item7_780 = source.readBit();
	boolean has_item7_790 = source.readBit();
	boolean has_item7_800 = source.readBit();
	boolean has_item7_810 = source.readBit();
	boolean has_item7_820 = source.readBit();
	boolean has_item7_830 = source.readBit();
	boolean has_item7_840 = source.readBit();
	boolean has_item7_850 = source.readBit();
	boolean has_item7_860 = source.readBit();
	boolean has_item7_870 = source.readBit();
	boolean has_item7_880 = source.readBit();
	boolean has_item7_890 = source.readBit();
	boolean has_item7_900 = source.readBit();
	boolean has_item7_910 = source.readBit();
	boolean has_item7_920 = source.readBit();
	boolean has_item7_930 = source.readBit();
	boolean has_item7_940 = source.readBit();
	boolean has_item7_950 = source.readBit();
	boolean has_item7_960 = source.readBit();
	boolean has_item7_970 = source.readBit();
	boolean has_item7_980 = source.readBit();
	boolean has_item7_990 = source.readBit();
	boolean has_item7_1000 = source.readBit();
	boolean has_item7_1010 = source.readBit();
	boolean has_item7_1020 = source.readBit();
	boolean has_item7_1030 = source.readBit();
	boolean has_item7_1040 = source.readBit();
	boolean has_item7_1050 = source.readBit();
	boolean has_item7_1060 = source.readBit();
	boolean has_item7_1070 = source.readBit();
	boolean has_item7_1080 = source.readBit();
	boolean has_item7_1090 = source.readBit();
	boolean has_item7_1100 = source.readBit();
	boolean has_item7_1110 = source.readBit();
	boolean has_item7_1120 = source.readBit();
	boolean has_item7_1130 = source.readBit();
	boolean has_item7_1140 = source.readBit();
	boolean has_item7_1150 = source.readBit();
	boolean has_item7_1160 = source.readBit();
	boolean has_item7_1170 = source.readBit();
	boolean has_item7_1180 = source.readBit();
	boolean has_item7_1190 = source.readBit();
	boolean has_item7_1200 = source.readBit();
	boolean has_item7_1210 = source.readBit();
	boolean has_item7_1220 = source.readBit();
	boolean has_item7_1230 = source.readBit();
	boolean has_item7_1240 = source.readBit();
	boolean has_item7_1250 = source.readBit();
	boolean has_item7_1260 = source.readBit();
	boolean has_item7_1270 = source.readBit();
	boolean has_item7_1280 = source.readBit();
	boolean has_item7_1290 = source.readBit();
	boolean has_item7_1300 = source.readBit();
	boolean has_item7_1310 = source.readBit();
	boolean has_item7_1320 = source.readBit();
	boolean has_item7_1330 = source.readBit();
	boolean has_item7_1340 = source.readBit();
	boolean has_item7_1350 = source.readBit();
	boolean has_item7_1360 = source.readBit();
	boolean has_item7_1370 = source.readBit();
	boolean has_item7_1380 = source.readBit();
	boolean has_item7_1390 = source.readBit();
	boolean has_item7_1400 = source.readBit();
	boolean has_item7_1410 = source.readBit();
	boolean has_item7_1420 = source.readBit();
	boolean has_item7_1430 = source.readBit();
	boolean has_item7_1440 = source.readBit();
	boolean has_item7_1450 = source.readBit();
	boolean has_item7_1460 = source.readBit();
	boolean has_item7_1470 = source.readBit();
	boolean has_item7_1480 = source.readBit();
	boolean has_item7_1490 = source.readBit();
	boolean has_item8_10 = source.readBit();
	boolean has_item8_20 = source.readBit();
	boolean has_item8_30 = source.readBit();
	boolean has_item8_40 = source.readBit();
	boolean has_item8_50 = source.readBit();
	boolean has_item8_60 = source.readBit();
	boolean has_item8_70 = source.readBit();
	boolean has_item8_80 = source.readBit();
	boolean has_item8_90 = source.readBit();
	boolean has_item8_100 = source.readBit();
	boolean has_item8_110 = source.readBit();
	if (has_item6_10) {
	    // Decode field 'item6-1'
	    try {
		data.item6_1 = new AccelerationSet4Way(com.oss.coders.per.PerOctets.decode(coder, source, 7, 7));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-1", "AccelerationSet4Way");
		throw de;
	    }
	} else {
	    data.item6_1 = null;
	}
	if (has_item6_20) {
	    // Decode field 'item6-2'
	    try {
		if (data.item6_2 == null)
		    data.item6_2 = new AccelSteerYawRateConfidence();
		AccelSteerYawRateConfidence.decodeValue(coder, source, data.item6_2);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-2", "AccelSteerYawRateConfidence");
		throw de;
	    }
	} else {
	    data.item6_2 = null;
	}
	if (has_item6_40) {
	    // Decode field 'item6-4'
	    try {
		data.item6_4 = new AntennaOffsetSet(com.oss.coders.per.PerOctets.decode(coder, source, 4, 4));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-4", "AntennaOffsetSet");
		throw de;
	    }
	} else {
	    data.item6_4 = null;
	}
	if (has_item6_50) {
	    // Decode field 'item6-5'
	    try {
		if (data.item6_5 == null)
		    data.item6_5 = new Approach();
		Approach.decodeValue(coder, source, data.item6_5);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-5", "Approach");
		throw de;
	    }
	} else {
	    data.item6_5 = null;
	}
	if (has_item6_60) {
	    // Decode field 'item6-6'
	    try {
		if (data.item6_6 == null)
		    data.item6_6 = new ApproachObject();
		ApproachObject.decodeValue(coder, source, data.item6_6);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-6", "ApproachObject");
		throw de;
	    }
	} else {
	    data.item6_6 = null;
	}
	if (has_item6_70) {
	    // Decode field 'item6-7'
	    try {
		if (data.item6_7 == null)
		    data.item6_7 = new BarrierLane();
		BarrierLane.decodeValue(coder, source, data.item6_7);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-7", "BarrierLane");
		throw de;
	    }
	} else {
	    data.item6_7 = null;
	}
	if (has_item6_80) {
	    // Decode field 'item6-8'
	    try {
		data.item6_8 = new BrakeSystemStatus(com.oss.coders.per.PerOctets.decode(coder, source, 2, 2));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-8", "BrakeSystemStatus");
		throw de;
	    }
	} else {
	    data.item6_8 = null;
	}
	if (has_item6_90) {
	    // Decode field 'item6-9'
	    try {
		data.item6_9 = new BSMblob(com.oss.coders.per.PerOctets.decode(coder, source, 38, 38));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-9", "BSMblob");
		throw de;
	    }
	} else {
	    data.item6_9 = null;
	}
	if (has_item6_100) {
	    // Decode field 'item6-10'
	    try {
		if (data.item6_10 == null)
		    data.item6_10 = new BumperHeights();
		BumperHeights.decodeValue(coder, source, data.item6_10);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-10", "BumperHeights");
		throw de;
	    }
	} else {
	    data.item6_10 = null;
	}
	if (has_item6_110) {
	    // Decode field 'item6-11'
	    try {
		if (data.item6_11 == null)
		    data.item6_11 = new Circle();
		Circle.decodeValue(coder, source, data.item6_11);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-11", "Circle");
		throw de;
	    }
	} else {
	    data.item6_11 = null;
	}
	if (has_item6_120) {
	    // Decode field 'item6-12'
	    try {
		if (data.item6_12 == null)
		    data.item6_12 = new ConfidenceSet();
		ConfidenceSet.decodeValue(coder, source, data.item6_12);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-12", "ConfidenceSet");
		throw de;
	    }
	} else {
	    data.item6_12 = null;
	}
	if (has_item6_130) {
	    // Decode field 'item6-13'
	    try {
		data.item6_13 = new ConnectsTo(com.oss.coders.per.PerOctets.decode(coder, source, 2, 32));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-13", "ConnectsTo");
		throw de;
	    }
	} else {
	    data.item6_13 = null;
	}
	if (has_item6_140) {
	    // Decode field 'item6-14'
	    try {
		if (data.item6_14 == null)
		    data.item6_14 = new CrosswalkLane();
		CrosswalkLane.decodeValue(coder, source, data.item6_14);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-14", "CrosswalkLane");
		throw de;
	    }
	} else {
	    data.item6_14 = null;
	}
	if (has_item6_150) {
	    // Decode field 'item6-15'
	    try {
		if (data.item6_15 == null)
		    data.item6_15 = new DataParameters();
		DataParameters.decodeValue(coder, source, data.item6_15);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-15", "DataParameters");
		throw de;
	    }
	} else {
	    data.item6_15 = null;
	}
	if (has_item6_160) {
	    // Decode field 'item6-16'
	    try {
		if (data.item6_16 == null)
		    data.item6_16 = new DDate();
		DDate.decodeValue(coder, source, data.item6_16);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-16", "DDate");
		throw de;
	    }
	} else {
	    data.item6_16 = null;
	}
	if (has_item6_170) {
	    // Decode field 'item6-17'
	    try {
		if (data.item6_17 == null)
		    data.item6_17 = new DDateTime();
		DDateTime.decodeValue(coder, source, data.item6_17);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-17", "DDateTime");
		throw de;
	    }
	} else {
	    data.item6_17 = null;
	}
	if (has_item6_180) {
	    // Decode field 'item6-18'
	    try {
		if (data.item6_18 == null)
		    data.item6_18 = new DFullTime();
		DFullTime.decodeValue(coder, source, data.item6_18);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-18", "DFullTime");
		throw de;
	    }
	} else {
	    data.item6_18 = null;
	}
	if (has_item6_190) {
	    // Decode field 'item6-19'
	    try {
		if (data.item6_19 == null)
		    data.item6_19 = new DMonthDay();
		DMonthDay.decodeValue(coder, source, data.item6_19);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-19", "DMonthDay");
		throw de;
	    }
	} else {
	    data.item6_19 = null;
	}
	if (has_item6_200) {
	    // Decode field 'item6-20'
	    try {
		if (data.item6_20 == null)
		    data.item6_20 = new DTime();
		DTime.decodeValue(coder, source, data.item6_20);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-20", "DTime");
		throw de;
	    }
	} else {
	    data.item6_20 = null;
	}
	if (has_item6_210) {
	    // Decode field 'item6-21'
	    try {
		if (data.item6_21 == null)
		    data.item6_21 = new DYearMonth();
		DYearMonth.decodeValue(coder, source, data.item6_21);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-21", "DYearMonth");
		throw de;
	    }
	} else {
	    data.item6_21 = null;
	}
	if (has_item6_220) {
	    // Decode field 'item6-22'
	    try {
		if (data.item6_22 == null)
		    data.item6_22 = new FullPositionVector();
		FullPositionVector.decodeValue(coder, source, data.item6_22);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-22", "FullPositionVector");
		throw de;
	    }
	} else {
	    data.item6_22 = null;
	}
	if (has_item6_230) {
	    // Decode field 'item6-23'
	    try {
		if (data.item6_23 == null)
		    data.item6_23 = new Intersection_();
		Intersection_.decodeValue(coder, source, data.item6_23);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-23", "Intersection");
		throw de;
	    }
	} else {
	    data.item6_23 = null;
	}
	if (has_item6_240) {
	    // Decode field 'item6-24'
	    try {
		if (data.item6_24 == null)
		    data.item6_24 = new IntersectionState();
		IntersectionState.decodeValue(coder, source, data.item6_24);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-24", "IntersectionState");
		throw de;
	    }
	} else {
	    data.item6_24 = null;
	}
	if (has_item6_250) {
	    // Decode field 'item6-25'
	    try {
		if (data.item6_25 == null)
		    data.item6_25 = new ExitService();
		ExitService.decodeValue(coder, source, data.item6_25);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-25", "ExitService");
		throw de;
	    }
	} else {
	    data.item6_25 = null;
	}
	if (has_item6_260) {
	    // Decode field 'item6-26'
	    try {
		if (data.item6_26 == null)
		    data.item6_26 = new GenericSignage();
		GenericSignage.decodeValue(coder, source, data.item6_26);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-26", "GenericSignage");
		throw de;
	    }
	} else {
	    data.item6_26 = null;
	}
	if (has_item6_270) {
	    // Decode field 'item6-27'
	    try {
		if (data.item6_27 == null)
		    data.item6_27 = new SpeedLimit();
		SpeedLimit.decodeValue(coder, source, data.item6_27);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-27", "SpeedLimit");
		throw de;
	    }
	} else {
	    data.item6_27 = null;
	}
	if (has_item6_280) {
	    // Decode field 'item6-28'
	    try {
		if (data.item6_28 == null)
		    data.item6_28 = new WorkZone();
		WorkZone.decodeValue(coder, source, data.item6_28);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-28", "WorkZone");
		throw de;
	    }
	} else {
	    data.item6_28 = null;
	}
	if (has_item6_290) {
	    // Decode field 'item6-29'
	    try {
		if (data.item6_29 == null)
		    data.item6_29 = new J1939data();
		J1939data.decodeValue(coder, source, data.item6_29);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-29", "J1939data");
		throw de;
	    }
	} else {
	    data.item6_29 = null;
	}
	if (has_item6_300) {
	    // Decode field 'item6-30'
	    try {
		if (data.item6_30 == null)
		    data.item6_30 = new MovementState();
		MovementState.decodeValue(coder, source, data.item6_30);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-30", "MovementState");
		throw de;
	    }
	} else {
	    data.item6_30 = null;
	}
	if (has_item6_310) {
	    // Decode field 'item6-31'
	    try {
		if (data.item6_31 == null)
		    data.item6_31 = new NodeList();
		NodeList.decodeValue(coder, source, data.item6_31);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-31", "NodeList");
		throw de;
	    }
	} else {
	    data.item6_31 = null;
	}
	if (has_item6_320) {
	    // Decode field 'item6-32'
	    try {
		data.item6_32 = new Offsets(com.oss.coders.per.PerOctets.decode(coder, source, 4, 8));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-32", "Offsets");
		throw de;
	    }
	} else {
	    data.item6_32 = null;
	}
	if (has_item6_330) {
	    // Decode field 'item6-33'
	    try {
		if (data.item6_33 == null)
		    data.item6_33 = new PathHistory();
		PathHistory.decodeValue(coder, source, data.item6_33);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-33", "PathHistory");
		throw de;
	    }
	} else {
	    data.item6_33 = null;
	}
	if (has_item6_340) {
	    // Decode field 'item6-34'
	    try {
		if (data.item6_34 == null)
		    data.item6_34 = new PathHistoryPointType_01();
		PathHistoryPointType_01.decodeValue(coder, source, data.item6_34);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-34", "PathHistoryPointType-01");
		throw de;
	    }
	} else {
	    data.item6_34 = null;
	}
	if (has_item6_350) {
	    // Decode field 'item6-35'
	    try {
		data.item6_35 = new PathHistoryPointType_02(com.oss.coders.per.PerOctets.decode(coder, source, 15, 15));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-35", "PathHistoryPointType-02");
		throw de;
	    }
	} else {
	    data.item6_35 = null;
	}
	if (has_item6_360) {
	    // Decode field 'item6-36'
	    try {
		data.item6_36 = new PathHistoryPointType_03(com.oss.coders.per.PerOctets.decode(coder, source, 12, 12));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-36", "PathHistoryPointType-03");
		throw de;
	    }
	} else {
	    data.item6_36 = null;
	}
	if (has_item6_370) {
	    // Decode field 'item6-37'
	    try {
		data.item6_37 = new PathHistoryPointType_04(com.oss.coders.per.PerOctets.decode(coder, source, 8, 8));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-37", "PathHistoryPointType-04");
		throw de;
	    }
	} else {
	    data.item6_37 = null;
	}
	if (has_item6_380) {
	    // Decode field 'item6-38'
	    try {
		data.item6_38 = new PathHistoryPointType_05(com.oss.coders.per.PerOctets.decode(coder, source, 10, 10));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-38", "PathHistoryPointType-05");
		throw de;
	    }
	} else {
	    data.item6_38 = null;
	}
	if (has_item6_390) {
	    // Decode field 'item6-39'
	    try {
		data.item6_39 = new PathHistoryPointType_06(com.oss.coders.per.PerOctets.decode(coder, source, 6, 6));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-39", "PathHistoryPointType-06");
		throw de;
	    }
	} else {
	    data.item6_39 = null;
	}
	if (has_item6_400) {
	    // Decode field 'item6-40'
	    try {
		data.item6_40 = new PathHistoryPointType_07(com.oss.coders.per.PerOctets.decode(coder, source, 11, 11));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-40", "PathHistoryPointType-07");
		throw de;
	    }
	} else {
	    data.item6_40 = null;
	}
	if (has_item6_410) {
	    // Decode field 'item6-41'
	    try {
		data.item6_41 = new PathHistoryPointType_08(com.oss.coders.per.PerOctets.decode(coder, source, 7, 7));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-41", "PathHistoryPointType-08");
		throw de;
	    }
	} else {
	    data.item6_41 = null;
	}
	if (has_item6_420) {
	    // Decode field 'item6-42'
	    try {
		data.item6_42 = new PathHistoryPointType_09(com.oss.coders.per.PerOctets.decode(coder, source, 9, 9));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-42", "PathHistoryPointType-09");
		throw de;
	    }
	} else {
	    data.item6_42 = null;
	}
	if (has_item6_430) {
	    // Decode field 'item6-43'
	    try {
		data.item6_43 = new PathHistoryPointType_10(com.oss.coders.per.PerOctets.decode(coder, source, 5, 5));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-43", "PathHistoryPointType-10");
		throw de;
	    }
	} else {
	    data.item6_43 = null;
	}
	if (has_item6_440) {
	    // Decode field 'item6-44'
	    try {
		if (data.item6_44 == null)
		    data.item6_44 = new PathPrediction();
		PathPrediction.decodeValue(coder, source, data.item6_44);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-44", "PathPrediction");
		throw de;
	    }
	} else {
	    data.item6_44 = null;
	}
	if (has_item6_450) {
	    // Decode field 'item6-45'
	    try {
		if (data.item6_45 == null)
		    data.item6_45 = new Position3D();
		Position3D.decodeValue(coder, source, data.item6_45);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-45", "Position3D");
		throw de;
	    }
	} else {
	    data.item6_45 = null;
	}
	if (has_item6_460) {
	    // Decode field 'item6-46'
	    try {
		data.item6_46 = new PositionalAccuracy(com.oss.coders.per.PerOctets.decode(coder, source, 4, 4));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-46", "PositionalAccuracy");
		throw de;
	    }
	} else {
	    data.item6_46 = null;
	}
	if (has_item6_470) {
	    // Decode field 'item6-47'
	    try {
		data.item6_47 = new PositionConfidenceSet(com.oss.coders.per.PerOctets.decode(coder, source, 1, 1));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-47", "PositionConfidenceSet");
		throw de;
	    }
	} else {
	    data.item6_47 = null;
	}
	if (has_item6_480) {
	    // Decode field 'item6-48'
	    try {
		if (data.item6_48 == null)
		    data.item6_48 = new RegionList();
		RegionList.decodeValue(coder, source, data.item6_48);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-48", "RegionList");
		throw de;
	    }
	} else {
	    data.item6_48 = null;
	}
	if (has_item6_490) {
	    // Decode field 'item6-49'
	    try {
		if (data.item6_49 == null)
		    data.item6_49 = new RegionOffsets();
		RegionOffsets.decodeValue(coder, source, data.item6_49);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-49", "RegionOffsets");
		throw de;
	    }
	} else {
	    data.item6_49 = null;
	}
	if (has_item6_500) {
	    // Decode field 'item6-50'
	    try {
		if (data.item6_50 == null)
		    data.item6_50 = new RegionPointSet();
		RegionPointSet.decodeValue(coder, source, data.item6_50);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-50", "RegionPointSet");
		throw de;
	    }
	} else {
	    data.item6_50 = null;
	}
	if (has_item6_510) {
	    // Decode field 'item6-51'
	    try {
		if (data.item6_51 == null)
		    data.item6_51 = new RoadSignID();
		RoadSignID.decodeValue(coder, source, data.item6_51);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-51", "RoadSignID");
		throw de;
	    }
	} else {
	    data.item6_51 = null;
	}
	if (has_item6_520) {
	    // Decode field 'item6-52'
	    try {
		data.item6_52 = new RTCMHeader(com.oss.coders.per.PerOctets.decode(coder, source, 5, 5));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-52", "RTCMHeader");
		throw de;
	    }
	} else {
	    data.item6_52 = null;
	}
	if (has_item6_530) {
	    // Decode field 'item6-53'
	    try {
		if (data.item6_53 == null)
		    data.item6_53 = new RTCMmsg();
		RTCMmsg.decodeValue(coder, source, data.item6_53);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-53", "RTCMmsg");
		throw de;
	    }
	} else {
	    data.item6_53 = null;
	}
	if (has_item6_540) {
	    // Decode field 'item6-54'
	    try {
		if (data.item6_54 == null)
		    data.item6_54 = new RTCMPackage();
		RTCMPackage.decodeValue(coder, source, data.item6_54);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-54", "RTCMPackage");
		throw de;
	    }
	} else {
	    data.item6_54 = null;
	}
	if (has_item6_550) {
	    // Decode field 'item6-55'
	    try {
		if (data.item6_55 == null)
		    data.item6_55 = new Sample();
		Sample.decodeValue(coder, source, data.item6_55);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-55", "Sample");
		throw de;
	    }
	} else {
	    data.item6_55 = null;
	}
	if (has_item6_560) {
	    // Decode field 'item6-56'
	    try {
		if (data.item6_56 == null)
		    data.item6_56 = new ShapePointSet();
		ShapePointSet.decodeValue(coder, source, data.item6_56);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-56", "ShapePointSet");
		throw de;
	    }
	} else {
	    data.item6_56 = null;
	}
	if (has_item6_570) {
	    // Decode field 'item6-57'
	    try {
		if (data.item6_57 == null)
		    data.item6_57 = new SignalControlZone();
		SignalControlZone.decodeValue(coder, source, data.item6_57);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-57", "SignalControlZone");
		throw de;
	    }
	} else {
	    data.item6_57 = null;
	}
	if (has_item6_580) {
	    // Decode field 'item6-58'
	    try {
		if (data.item6_58 == null)
		    data.item6_58 = new SignalRequest();
		SignalRequest.decodeValue(coder, source, data.item6_58);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-58", "SignalRequest");
		throw de;
	    }
	} else {
	    data.item6_58 = null;
	}
	if (has_item6_590) {
	    // Decode field 'item6-59'
	    try {
		if (data.item6_59 == null)
		    data.item6_59 = new SnapshotDistance();
		SnapshotDistance.decodeValue(coder, source, data.item6_59);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-59", "SnapshotDistance");
		throw de;
	    }
	} else {
	    data.item6_59 = null;
	}
	if (has_item6_600) {
	    // Decode field 'item6-60'
	    try {
		if (data.item6_60 == null)
		    data.item6_60 = new Snapshot();
		Snapshot.decodeValue(coder, source, data.item6_60);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-60", "Snapshot");
		throw de;
	    }
	} else {
	    data.item6_60 = null;
	}
	if (has_item6_610) {
	    // Decode field 'item6-61'
	    try {
		if (data.item6_61 == null)
		    data.item6_61 = new SnapshotTime();
		SnapshotTime.decodeValue(coder, source, data.item6_61);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-61", "SnapshotTime");
		throw de;
	    }
	} else {
	    data.item6_61 = null;
	}
	if (has_item6_620) {
	    // Decode field 'item6-62'
	    try {
		if (data.item6_62 == null)
		    data.item6_62 = new SpecialLane();
		SpecialLane.decodeValue(coder, source, data.item6_62);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-62", "SpecialLane");
		throw de;
	    }
	} else {
	    data.item6_62 = null;
	}
	if (has_item6_630) {
	    // Decode field 'item6-63'
	    try {
		data.item6_63 = new SpeedandHeadingandThrottleConfidence(com.oss.coders.per.PerOctets.decode(coder, source, 1, 1));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-63", "SpeedandHeadingandThrottleConfidence");
		throw de;
	    }
	} else {
	    data.item6_63 = null;
	}
	if (has_item6_640) {
	    // Decode field 'item6-64'
	    try {
		data.item6_64 = new TransmissionAndSpeed(com.oss.coders.per.PerOctets.decode(coder, source, 2, 2));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-64", "TransmissionAndSpeed");
		throw de;
	    }
	} else {
	    data.item6_64 = null;
	}
	if (has_item6_650) {
	    // Decode field 'item6-65'
	    try {
		if (data.item6_65 == null)
		    data.item6_65 = new ValidRegion();
		ValidRegion.decodeValue(coder, source, data.item6_65);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-65", "ValidRegion");
		throw de;
	    }
	} else {
	    data.item6_65 = null;
	}
	if (has_item6_660) {
	    // Decode field 'item6-66'
	    try {
		if (data.item6_66 == null)
		    data.item6_66 = new VehicleComputedLane();
		VehicleComputedLane.decodeValue(coder, source, data.item6_66);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-66", "VehicleComputedLane");
		throw de;
	    }
	} else {
	    data.item6_66 = null;
	}
	if (has_item6_670) {
	    // Decode field 'item6-67'
	    try {
		if (data.item6_67 == null)
		    data.item6_67 = new VehicleIdent();
		VehicleIdent.decodeValue(coder, source, data.item6_67);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-67", "VehicleIdent");
		throw de;
	    }
	} else {
	    data.item6_67 = null;
	}
	if (has_item6_680) {
	    // Decode field 'item6-68'
	    try {
		if (data.item6_68 == null)
		    data.item6_68 = new VehicleReferenceLane();
		VehicleReferenceLane.decodeValue(coder, source, data.item6_68);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-68", "VehicleReferenceLane");
		throw de;
	    }
	} else {
	    data.item6_68 = null;
	}
	if (has_item6_690) {
	    // Decode field 'item6-69'
	    try {
		if (data.item6_69 == null)
		    data.item6_69 = new VehicleSafetyExtension();
		VehicleSafetyExtension.decodeValue(coder, source, data.item6_69);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-69", "VehicleSafetyExtension");
		throw de;
	    }
	} else {
	    data.item6_69 = null;
	}
	if (has_item6_700) {
	    // Decode field 'item6-70'
	    try {
		if (data.item6_70 == null)
		    data.item6_70 = new VehicleSize();
		VehicleSize.decodeValue(coder, source, data.item6_70);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-70", "VehicleSize");
		throw de;
	    }
	} else {
	    data.item6_70 = null;
	}
	if (has_item6_710) {
	    // Decode field 'item6-71'
	    try {
		if (data.item6_71 == null)
		    data.item6_71 = new VehicleStatusRequest();
		VehicleStatusRequest.decodeValue(coder, source, data.item6_71);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-71", "VehicleStatusRequest");
		throw de;
	    }
	} else {
	    data.item6_71 = null;
	}
	if (has_item6_720) {
	    // Decode field 'item6-72'
	    try {
		if (data.item6_72 == null)
		    data.item6_72 = new VehicleStatus();
		VehicleStatus.decodeValue(coder, source, data.item6_72);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-72", "VehicleStatus");
		throw de;
	    }
	} else {
	    data.item6_72 = null;
	}
	if (has_item6_730) {
	    // Decode field 'item6-73'
	    try {
		if (data.item6_73 == null)
		    data.item6_73 = new WiperStatus();
		WiperStatus.decodeValue(coder, source, data.item6_73);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item6-73", "WiperStatus");
		throw de;
	    }
	} else {
	    data.item6_73 = null;
	}
	if (has_item7_10) {
	    // Decode field 'item7-1'
	    try {
		long temp1;

		if (data.item7_1 == null)
		    data.item7_1 = new Acceleration();
		temp1 = coder.decodeConstrainedWholeNumber(source, -2000, 2001);
		if (temp1 > 2001)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_1.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-1", "Acceleration");
		throw de;
	    }
	} else {
	    data.item7_1 = null;
	}
	if (has_item7_20) {
	    // Decode field 'item7-2'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 7);
		if (idx1 < 0 || idx1 > 7)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.item7_2 = AccelerationConfidence.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-2", "AccelerationConfidence");
		throw de;
	    }
	} else {
	    data.item7_2 = null;
	}
	if (has_item7_30) {
	    // Decode field 'item7-3'
	    try {
		long temp1;

		if (data.item7_3 == null)
		    data.item7_3 = new AmbientAirPressure();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
		if (temp1 > 255)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_3.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-3", "AmbientAirPressure");
		throw de;
	    }
	} else {
	    data.item7_3 = null;
	}
	if (has_item7_40) {
	    // Decode field 'item7-4'
	    try {
		long temp1;

		if (data.item7_4 == null)
		    data.item7_4 = new AmbientAirTemperature();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 191);
		if (temp1 > 191)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_4.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-4", "AmbientAirTemperature");
		throw de;
	    }
	} else {
	    data.item7_4 = null;
	}
	if (has_item7_50) {
	    // Decode field 'item7-5'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
		if (idx1 < 0 || idx1 > 3)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.item7_5 = AntiLockBrakeStatus.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-5", "AntiLockBrakeStatus");
		throw de;
	    }
	} else {
	    data.item7_5 = null;
	}
	if (has_item7_60) {
	    // Decode field 'item7-6'
	    try {
		long temp1;

		if (data.item7_6 == null)
		    data.item7_6 = new ApproachNumber();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 127);
		if (temp1 > 127)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_6.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-6", "ApproachNumber");
		throw de;
	    }
	} else {
	    data.item7_6 = null;
	}
	if (has_item7_70) {
	    // Decode field 'item7-7'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
		if (idx1 < 0 || idx1 > 3)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.item7_7 = AuxiliaryBrakeStatus.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-7", "AuxiliaryBrakeStatus");
		throw de;
	    }
	} else {
	    data.item7_7 = null;
	}
	if (has_item7_80) {
	    // Decode field 'item7-8'
	    try {
		long temp1;

		if (data.item7_8 == null)
		    data.item7_8 = new BarrierAttributes();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 8192);
		if (temp1 > 8192)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_8.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-8", "BarrierAttributes");
		throw de;
	    }
	} else {
	    data.item7_8 = null;
	}
	if (has_item7_90) {
	    // Decode field 'item7-9'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 15);
		if (idx1 < 0 || idx1 > 15)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.item7_9 = BrakeAppliedPressure.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-9", "BrakeAppliedPressure");
		throw de;
	    }
	} else {
	    data.item7_9 = null;
	}
	if (has_item7_100) {
	    // Decode field 'item7-10'
	    try {
		if (data.item7_10 == null)
		    data.item7_10 = new BrakeAppliedStatus();
		com.oss.coders.per.PerBitstring.decode(coder, source, -1, data.item7_10);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-10", "BrakeAppliedStatus");
		throw de;
	    }
	} else {
	    data.item7_10 = null;
	}
	if (has_item7_110) {
	    // Decode field 'item7-11'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 2);
		if (idx1 < 0 || idx1 > 2)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.item7_11 = BrakeBoostApplied.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-11", "BrakeBoostApplied");
		throw de;
	    }
	} else {
	    data.item7_11 = null;
	}
	if (has_item7_120) {
	    // Decode field 'item7-12'
	    try {
		long temp1;

		if (data.item7_12 == null)
		    data.item7_12 = new BumperHeightFront();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 127);
		if (temp1 > 127)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_12.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-12", "BumperHeightFront");
		throw de;
	    }
	} else {
	    data.item7_12 = null;
	}
	if (has_item7_130) {
	    // Decode field 'item7-13'
	    try {
		long temp1;

		if (data.item7_13 == null)
		    data.item7_13 = new BumperHeightRear();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 127);
		if (temp1 > 127)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_13.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-13", "BumperHeightRear");
		throw de;
	    }
	} else {
	    data.item7_13 = null;
	}
	if (has_item7_140) {
	    // Decode field 'item7-14'
	    try {
		data.item7_14 = new CodeWord(com.oss.coders.per.PerOctets.decode(coder, source, 1, 16));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-14", "CodeWord");
		throw de;
	    }
	} else {
	    data.item7_14 = null;
	}
	if (has_item7_150) {
	    // Decode field 'item7-15'
	    try {
		long temp1;

		if (data.item7_15 == null)
		    data.item7_15 = new CoefficientOfFriction();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 50);
		if (temp1 > 50)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_15.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-15", "CoefficientOfFriction");
		throw de;
	    }
	} else {
	    data.item7_15 = null;
	}
	if (has_item7_160) {
	    // Decode field 'item7-16'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 6);
		if (idx1 < 0 || idx1 > 6)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.item7_16 = ColorState.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-16", "ColorState");
		throw de;
	    }
	} else {
	    data.item7_16 = null;
	}
	if (has_item7_170) {
	    // Decode field 'item7-17'
	    try {
		long temp1;

		if (data.item7_17 == null)
		    data.item7_17 = new Count();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 32);
		if (temp1 > 32)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_17.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-17", "Count");
		throw de;
	    }
	} else {
	    data.item7_17 = null;
	}
	if (has_item7_180) {
	    // Decode field 'item7-18'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 8);
		if (idx1 < 0 || idx1 > 8)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.item7_18 = CrosswalkLaneAttributes.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-18", "CrosswalkLaneAttributes");
		throw de;
	    }
	} else {
	    data.item7_18 = null;
	}
	if (has_item7_190) {
	    // Decode field 'item7-19'
	    try {
		long temp1;

		if (data.item7_19 == null)
		    data.item7_19 = new DDay();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 31);
		if (temp1 > 31)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_19.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-19", "DDay");
		throw de;
	    }
	} else {
	    data.item7_19 = null;
	}
	if (has_item7_200) {
	    // Decode field 'item7-20'
	    try {
		data.item7_20 = new DescriptiveName(com.oss.coders.per.PerKMCString.decode(coder, source, 1, 63, AllInclusive._cEPAInfo_item7_20));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-20", "DescriptiveName");
		throw de;
	    }
	} else {
	    data.item7_20 = null;
	}
	if (has_item7_210) {
	    // Decode field 'item7-21'
	    try {
		long temp1;

		if (data.item7_21 == null)
		    data.item7_21 = new DHour();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 31);
		if (temp1 > 31)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_21.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-21", "DHour");
		throw de;
	    }
	} else {
	    data.item7_21 = null;
	}
	if (has_item7_220) {
	    // Decode field 'item7-22'
	    try {
		int idx1;
		DirectionOfUse temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 2);
		    if (idx1 < 0 || idx1 > 2)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = DirectionOfUse.valueAt(idx1);
		} else {
		    idx1 = 3 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = DirectionOfUse.unknownEnumerator();
		}
		data.item7_22 = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-22", "DirectionOfUse");
		throw de;
	    }
	} else {
	    data.item7_22 = null;
	}
	if (has_item7_230) {
	    // Decode field 'item7-23'
	    try {
		long temp1;

		if (data.item7_23 == null)
		    data.item7_23 = new DMinute();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 63);
		if (temp1 > 63)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_23.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-23", "DMinute");
		throw de;
	    }
	} else {
	    data.item7_23 = null;
	}
	if (has_item7_240) {
	    // Decode field 'item7-24'
	    try {
		long temp1;

		if (data.item7_24 == null)
		    data.item7_24 = new DMonth();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 15);
		if (temp1 > 15)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_24.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-24", "DMonth");
		throw de;
	    }
	} else {
	    data.item7_24 = null;
	}
	if (has_item7_250) {
	    // Decode field 'item7-25'
	    try {
		long temp1;

		if (data.item7_25 == null)
		    data.item7_25 = new DOffset();
		temp1 = coder.decodeConstrainedWholeNumber(source, -840, 840);
		if (temp1 > 840)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_25.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-25", "DOffset");
		throw de;
	    }
	} else {
	    data.item7_25 = null;
	}
	if (has_item7_260) {
	    // Decode field 'item7-26'
	    try {
		long temp1;

		if (data.item7_26 == null)
		    data.item7_26 = new DrivenLineOffset();
		temp1 = coder.decodeConstrainedWholeNumber(source, -32767, 32767);
		if (temp1 > 32767)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_26.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-26", "DrivenLineOffset");
		throw de;
	    }
	} else {
	    data.item7_26 = null;
	}
	if (has_item7_270) {
	    // Decode field 'item7-27'
	    try {
		long temp1;

		if (data.item7_27 == null)
		    data.item7_27 = new DrivingWheelAngle();
		temp1 = coder.decodeConstrainedWholeNumber(source, -127, 127);
		if (temp1 > 127)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_27.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-27", "DrivingWheelAngle");
		throw de;
	    }
	} else {
	    data.item7_27 = null;
	}
	if (has_item7_280) {
	    // Decode field 'item7-28'
	    try {
		long temp1;

		if (data.item7_28 == null)
		    data.item7_28 = new DSecond();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 65535);
		if (temp1 > 65535)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_28.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-28", "DSecond");
		throw de;
	    }
	} else {
	    data.item7_28 = null;
	}
	if (has_item7_290) {
	    // Decode field 'item7-29'
	    try {
		long temp1;

		if (data.item7_29 == null)
		    data.item7_29 = new DSignalSeconds();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 30000);
		if (temp1 > 30000)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_29.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-29", "DSignalSeconds");
		throw de;
	    }
	} else {
	    data.item7_29 = null;
	}
	if (has_item7_300) {
	    // Decode field 'item7-30'
	    try {
		int idx1;
		DSRCmsgID temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 16);
		    if (idx1 < 0 || idx1 > 16)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = DSRCmsgID.valueAt(idx1);
		} else {
		    idx1 = 17 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = DSRCmsgID.unknownEnumerator();
		}
		data.item7_30 = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-30", "DSRCmsgID");
		throw de;
	    }
	} else {
	    data.item7_30 = null;
	}
	if (has_item7_310) {
	    // Decode field 'item7-31'
	    try {
		long temp1;

		if (data.item7_31 == null)
		    data.item7_31 = new DYear();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 9999);
		if (temp1 > 9999)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_31.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-31", "DYear");
		throw de;
	    }
	} else {
	    data.item7_31 = null;
	}
	if (has_item7_320) {
	    // Decode field 'item7-32'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 15);
		if (idx1 < 0 || idx1 > 15)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.item7_32 = ElevationConfidence.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-32", "ElevationConfidence");
		throw de;
	    }
	} else {
	    data.item7_32 = null;
	}
	if (has_item7_330) {
	    // Decode field 'item7-33'
	    try {
		data.item7_33 = new Elevation(com.oss.coders.per.PerOctets.decode(coder, source, 2, 2));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-33", "Elevation");
		throw de;
	    }
	} else {
	    data.item7_33 = null;
	}
	if (has_item7_340) {
	    // Decode field 'item7-34'
	    try {
		long temp1;

		if (data.item7_34 == null)
		    data.item7_34 = new EmergencyDetails();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 63);
		if (temp1 > 63)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_34.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-34", "EmergencyDetails");
		throw de;
	    }
	} else {
	    data.item7_34 = null;
	}
	if (has_item7_350) {
	    // Decode field 'item7-35'
	    try {
		long temp1;

		if (data.item7_35 == null)
		    data.item7_35 = new EventFlags();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 8192);
		if (temp1 > 8192)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_35.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-35", "EventFlags");
		throw de;
	    }
	} else {
	    data.item7_35 = null;
	}
	if (has_item7_360) {
	    // Decode field 'item7-36'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 11);
		if (idx1 < 0 || idx1 > 11)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.item7_36 = Extent.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-36", "Extent");
		throw de;
	    }
	} else {
	    data.item7_36 = null;
	}
	if (has_item7_370) {
	    // Decode field 'item7-37'
	    try {
		long temp1;

		if (data.item7_37 == null)
		    data.item7_37 = new ExteriorLights();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 256);
		if (temp1 > 256)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_37.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-37", "ExteriorLights");
		throw de;
	    }
	} else {
	    data.item7_37 = null;
	}
	if (has_item7_380) {
	    // Decode field 'item7-38'
	    try {
		data.item7_38 = new FurtherInfoID(com.oss.coders.per.PerOctets.decode(coder, source, 2, 2));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-38", "FurtherInfoID");
		throw de;
	    }
	} else {
	    data.item7_38 = null;
	}
	if (has_item7_390) {
	    // Decode field 'item7-39'
	    try {
		if (data.item7_39 == null)
		    data.item7_39 = new GPSstatus();
		com.oss.coders.per.PerBitstring.decode(coder, source, -1, data.item7_39);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-39", "GPSstatus");
		throw de;
	    }
	} else {
	    data.item7_39 = null;
	}
	if (has_item7_400) {
	    // Decode field 'item7-40'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 7);
		if (idx1 < 0 || idx1 > 7)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.item7_40 = HeadingConfidence.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-40", "HeadingConfidence");
		throw de;
	    }
	} else {
	    data.item7_40 = null;
	}
	if (has_item7_410) {
	    // Decode field 'item7-41'
	    try {
		long temp1;

		if (data.item7_41 == null)
		    data.item7_41 = new Heading();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 28800);
		if (temp1 > 28800)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_41.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-41", "Heading");
		throw de;
	    }
	} else {
	    data.item7_41 = null;
	}
	if (has_item7_420) {
	    // Decode field 'item7-42'
	    try {
		data.item7_42 = new HeadingSlice(com.oss.coders.per.PerOctets.decode(coder, source, 2, 2));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-42", "HeadingSlice");
		throw de;
	    }
	} else {
	    data.item7_42 = null;
	}
	if (has_item7_430) {
	    // Decode field 'item7-43'
	    try {
		data.item7_43 = new IntersectionStatusObject(com.oss.coders.per.PerOctets.decode(coder, source, 1, 1));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-43", "IntersectionStatusObject");
		throw de;
	    }
	} else {
	    data.item7_43 = null;
	}
	if (has_item7_440) {
	    // Decode field 'item7-44'
	    try {
		data.item7_44 = new IntersectionID(com.oss.coders.per.PerOctets.decode(coder, source, 2, 4));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-44", "IntersectionID");
		throw de;
	    }
	} else {
	    data.item7_44 = null;
	}
	if (has_item7_450) {
	    // Decode field 'item7-45'
	    try {
		long temp1;

		if (data.item7_45 == null)
		    data.item7_45 = new AxleLocation();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 127);
		if (temp1 > 127)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_45.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-45", "AxleLocation");
		throw de;
	    }
	} else {
	    data.item7_45 = null;
	}
	if (has_item7_460) {
	    // Decode field 'item7-46'
	    try {
		long temp1;

		if (data.item7_46 == null)
		    data.item7_46 = new AxleWeight();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 65535);
		if (temp1 > 65535)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_46.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-46", "AxleWeight");
		throw de;
	    }
	} else {
	    data.item7_46 = null;
	}
	if (has_item7_470) {
	    // Decode field 'item7-47'
	    try {
		long temp1;

		if (data.item7_47 == null)
		    data.item7_47 = new CargoWeight();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 65535);
		if (temp1 > 65535)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_47.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-47", "CargoWeight");
		throw de;
	    }
	} else {
	    data.item7_47 = null;
	}
	if (has_item7_480) {
	    // Decode field 'item7-48'
	    try {
		long temp1;

		if (data.item7_48 == null)
		    data.item7_48 = new DriveAxleLiftAirPressure();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 1000);
		if (temp1 > 1000)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_48.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-48", "DriveAxleLiftAirPressure");
		throw de;
	    }
	} else {
	    data.item7_48 = null;
	}
	if (has_item7_490) {
	    // Decode field 'item7-49'
	    try {
		long temp1;

		if (data.item7_49 == null)
		    data.item7_49 = new DriveAxleLocation();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
		if (temp1 > 255)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_49.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-49", "DriveAxleLocation");
		throw de;
	    }
	} else {
	    data.item7_49 = null;
	}
	if (has_item7_500) {
	    // Decode field 'item7-50'
	    try {
		long temp1;

		if (data.item7_50 == null)
		    data.item7_50 = new DriveAxleLubePressure();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 1000);
		if (temp1 > 1000)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_50.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-50", "DriveAxleLubePressure");
		throw de;
	    }
	} else {
	    data.item7_50 = null;
	}
	if (has_item7_510) {
	    // Decode field 'item7-51'
	    try {
		long temp1;

		if (data.item7_51 == null)
		    data.item7_51 = new DriveAxleTemperature();
		temp1 = coder.decodeConstrainedWholeNumber(source, -40, 210);
		if (temp1 > 210)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_51.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-51", "DriveAxleTemperature");
		throw de;
	    }
	} else {
	    data.item7_51 = null;
	}
	if (has_item7_520) {
	    // Decode field 'item7-52'
	    try {
		long temp1;

		if (data.item7_52 == null)
		    data.item7_52 = new SteeringAxleLubePressure();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
		if (temp1 > 255)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_52.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-52", "SteeringAxleLubePressure");
		throw de;
	    }
	} else {
	    data.item7_52 = null;
	}
	if (has_item7_530) {
	    // Decode field 'item7-53'
	    try {
		long temp1;

		if (data.item7_53 == null)
		    data.item7_53 = new SteeringAxleTemperature();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
		if (temp1 > 255)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_53.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-53", "SteeringAxleTemperature");
		throw de;
	    }
	} else {
	    data.item7_53 = null;
	}
	if (has_item7_540) {
	    // Decode field 'item7-54'
	    try {
		long temp1;

		if (data.item7_54 == null)
		    data.item7_54 = new TireLeakageRate();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 65535);
		if (temp1 > 65535)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_54.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-54", "TireLeakageRate");
		throw de;
	    }
	} else {
	    data.item7_54 = null;
	}
	if (has_item7_550) {
	    // Decode field 'item7-55'
	    try {
		long temp1;

		if (data.item7_55 == null)
		    data.item7_55 = new TireLocation();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
		if (temp1 > 255)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_55.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-55", "TireLocation");
		throw de;
	    }
	} else {
	    data.item7_55 = null;
	}
	if (has_item7_560) {
	    // Decode field 'item7-56'
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
		data.item7_56 = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-56", "TirePressureThresholdDetection");
		throw de;
	    }
	} else {
	    data.item7_56 = null;
	}
	if (has_item7_570) {
	    // Decode field 'item7-57'
	    try {
		long temp1;

		if (data.item7_57 == null)
		    data.item7_57 = new TirePressure();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 1000);
		if (temp1 > 1000)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_57.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-57", "TirePressure");
		throw de;
	    }
	} else {
	    data.item7_57 = null;
	}
	if (has_item7_580) {
	    // Decode field 'item7-58'
	    try {
		long temp1;

		if (data.item7_58 == null)
		    data.item7_58 = new TireTemp();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 65535);
		if (temp1 > 65535)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_58.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-58", "TireTemp");
		throw de;
	    }
	} else {
	    data.item7_58 = null;
	}
	if (has_item7_590) {
	    // Decode field 'item7-59'
	    try {
		long temp1;

		if (data.item7_59 == null)
		    data.item7_59 = new TrailerWeight();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 65535);
		if (temp1 > 65535)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_59.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-59", "TrailerWeight");
		throw de;
	    }
	} else {
	    data.item7_59 = null;
	}
	if (has_item7_600) {
	    // Decode field 'item7-60'
	    try {
		if (data.item7_60 == null)
		    data.item7_60 = new WheelEndElectFault();
		com.oss.coders.per.PerBitstring.decode(coder, source, -1, data.item7_60);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-60", "WheelEndElectFault");
		throw de;
	    }
	} else {
	    data.item7_60 = null;
	}
	if (has_item7_610) {
	    // Decode field 'item7-61'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
		if (idx1 < 0 || idx1 > 3)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.item7_61 = WheelSensorStatus.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-61", "WheelSensorStatus");
		throw de;
	    }
	} else {
	    data.item7_61 = null;
	}
	if (has_item7_620) {
	    // Decode field 'item7-62'
	    try {
		long temp1;

		if (data.item7_62 == null)
		    data.item7_62 = new LaneCount();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
		if (temp1 > 255)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_62.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-62", "LaneCount");
		throw de;
	    }
	} else {
	    data.item7_62 = null;
	}
	if (has_item7_630) {
	    // Decode field 'item7-63'
	    try {
		int idx1;
		LaneManeuverCode temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 6);
		    if (idx1 < 0 || idx1 > 6)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = LaneManeuverCode.valueAt(idx1);
		} else {
		    idx1 = 7 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = LaneManeuverCode.unknownEnumerator();
		}
		data.item7_63 = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-63", "LaneManeuverCode");
		throw de;
	    }
	} else {
	    data.item7_63 = null;
	}
	if (has_item7_640) {
	    // Decode field 'item7-64'
	    try {
		data.item7_64 = new LaneNumber(com.oss.coders.per.PerOctets.decode(coder, source, 1, 1));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-64", "LaneNumber");
		throw de;
	    }
	} else {
	    data.item7_64 = null;
	}
	if (has_item7_650) {
	    // Decode field 'item7-65'
	    try {
		data.item7_65 = new LaneSet(com.oss.coders.per.PerOctets.decode(coder, source, 1, 127));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-65", "LaneSet");
		throw de;
	    }
	} else {
	    data.item7_65 = null;
	}
	if (has_item7_660) {
	    // Decode field 'item7-66'
	    try {
		long temp1;

		if (data.item7_66 == null)
		    data.item7_66 = new LaneWidth();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 32767);
		if (temp1 > 32767)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_66.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-66", "LaneWidth");
		throw de;
	    }
	} else {
	    data.item7_66 = null;
	}
	if (has_item7_670) {
	    // Decode field 'item7-67'
	    try {
		long temp1;

		if (data.item7_67 == null)
		    data.item7_67 = new Latitude();
		temp1 = coder.decodeConstrainedWholeNumber(source, -900000000, 900000001);
		if (temp1 > 900000001)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_67.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-67", "Latitude");
		throw de;
	    }
	} else {
	    data.item7_67 = null;
	}
	if (has_item7_680) {
	    // Decode field 'item7-68'
	    try {
		long temp1;

		if (data.item7_68 == null)
		    data.item7_68 = new LayerID();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 100);
		if (temp1 > 100)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_68.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-68", "LayerID");
		throw de;
	    }
	} else {
	    data.item7_68 = null;
	}
	if (has_item7_690) {
	    // Decode field 'item7-69'
	    try {
		int idx1;
		LayerType temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 7);
		    if (idx1 < 0 || idx1 > 7)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = LayerType.valueAt(idx1);
		} else {
		    idx1 = 8 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = LayerType.unknownEnumerator();
		}
		data.item7_69 = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-69", "LayerType");
		throw de;
	    }
	} else {
	    data.item7_69 = null;
	}
	if (has_item7_700) {
	    // Decode field 'item7-70'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 9);
		if (idx1 < 0 || idx1 > 9)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.item7_70 = LightbarInUse.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-70", "LightbarInUse");
		throw de;
	    }
	} else {
	    data.item7_70 = null;
	}
	if (has_item7_710) {
	    // Decode field 'item7-71'
	    try {
		long temp1;

		if (data.item7_71 == null)
		    data.item7_71 = new Longitude();
		temp1 = coder.decodeConstrainedWholeNumber(source, -1800000000, 1800000001);
		if (temp1 > 1800000001)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_71.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-71", "Longitude");
		throw de;
	    }
	} else {
	    data.item7_71 = null;
	}
	if (has_item7_720) {
	    // Decode field 'item7-72'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 7);
		if (idx1 < 0 || idx1 > 7)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.item7_72 = Location_quality.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-72", "Location-quality");
		throw de;
	    }
	} else {
	    data.item7_72 = null;
	}
	if (has_item7_730) {
	    // Decode field 'item7-73'
	    try {
		int idx1;
		Location_tech temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 6);
		    if (idx1 < 0 || idx1 > 6)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = Location_tech.valueAt(idx1);
		} else {
		    idx1 = 7 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    if (idx1 < 8)
			temp1 = Location_tech.valueAt(idx1);
		    else
			temp1 = Location_tech.unknownEnumerator();
		}
		data.item7_73 = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-73", "Location-tech");
		throw de;
	    }
	} else {
	    data.item7_73 = null;
	}
	if (has_item7_740) {
	    // Decode field 'item7-74'
	    try {
		long temp1;

		if (data.item7_74 == null)
		    data.item7_74 = new MinuteOfTheYear();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 525960);
		if (temp1 > 525960)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_74.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-74", "MinuteOfTheYear");
		throw de;
	    }
	} else {
	    data.item7_74 = null;
	}
	if (has_item7_750) {
	    // Decode field 'item7-75'
	    try {
		long temp1;

		if (data.item7_75 == null)
		    data.item7_75 = new MinutesDuration();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 32000);
		if (temp1 > 32000)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_75.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-75", "MinutesDuration");
		throw de;
	    }
	} else {
	    data.item7_75 = null;
	}
	if (has_item7_760) {
	    // Decode field 'item7-76'
	    try {
		long temp1;

		if (data.item7_76 == null)
		    data.item7_76 = new MsgCount();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 127);
		if (temp1 > 127)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_76.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-76", "MsgCount");
		throw de;
	    }
	} else {
	    data.item7_76 = null;
	}
	if (has_item7_770) {
	    // Decode field 'item7-77'
	    try {
		data.item7_77 = new MsgCRC(com.oss.coders.per.PerOctets.decode(coder, source, 2, 2));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-77", "MsgCRC");
		throw de;
	    }
	} else {
	    data.item7_77 = null;
	}
	if (has_item7_780) {
	    // Decode field 'item7-78'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
		if (idx1 < 0 || idx1 > 3)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.item7_78 = MultiVehicleResponse.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-78", "MultiVehicleResponse");
		throw de;
	    }
	} else {
	    data.item7_78 = null;
	}
	if (has_item7_790) {
	    // Decode field 'item7-79'
	    try {
		int idx1;
		MUTCDCode temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 6);
		    if (idx1 < 0 || idx1 > 6)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = MUTCDCode.valueAt(idx1);
		} else {
		    idx1 = 7 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = MUTCDCode.unknownEnumerator();
		}
		data.item7_79 = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-79", "MUTCDCode");
		throw de;
	    }
	} else {
	    data.item7_79 = null;
	}
	if (has_item7_800) {
	    // Decode field 'item7-80'
	    try {
		long temp1;

		if (data.item7_80 == null)
		    data.item7_80 = new NMEA_MsgType();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 32767);
		if (temp1 > 32767)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_80.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-80", "NMEA-MsgType");
		throw de;
	    }
	} else {
	    data.item7_80 = null;
	}
	if (has_item7_810) {
	    // Decode field 'item7-81'
	    try {
		data.item7_81 = new NMEA_Payload(com.oss.coders.per.PerOctets.decode(coder, source, 1, 1023));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-81", "NMEA-Payload");
		throw de;
	    }
	} else {
	    data.item7_81 = null;
	}
	if (has_item7_820) {
	    // Decode field 'item7-82'
	    try {
		int idx1;
		NMEA_Revision temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 6);
		    if (idx1 < 0 || idx1 > 6)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = NMEA_Revision.valueAt(idx1);
		} else {
		    idx1 = 7 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = NMEA_Revision.unknownEnumerator();
		}
		data.item7_82 = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-82", "NMEA-Revision");
		throw de;
	    }
	} else {
	    data.item7_82 = null;
	}
	if (has_item7_830) {
	    // Decode field 'item7-83'
	    try {
		data.item7_83 = new NTCIPVehicleclass(com.oss.coders.per.PerOctets.decode(coder, source, 1, 1));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-83", "NTCIPVehicleclass");
		throw de;
	    }
	} else {
	    data.item7_83 = null;
	}
	if (has_item7_840) {
	    // Decode field 'item7-84'
	    try {
		long temp1;

		if (data.item7_84 == null)
		    data.item7_84 = new ObjectCount();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 6000);
		if (temp1 > 6000)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_84.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-84", "ObjectCount");
		throw de;
	    }
	} else {
	    data.item7_84 = null;
	}
	if (has_item7_850) {
	    // Decode field 'item7-85'
	    try {
		long temp1;

		if (data.item7_85 == null)
		    data.item7_85 = new ObstacleDirection();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 28800);
		if (temp1 > 28800)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_85.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-85", "ObstacleDirection");
		throw de;
	    }
	} else {
	    data.item7_85 = null;
	}
	if (has_item7_860) {
	    // Decode field 'item7-86'
	    try {
		long temp1;

		if (data.item7_86 == null)
		    data.item7_86 = new ObstacleDistance();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 32767);
		if (temp1 > 32767)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_86.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-86", "ObstacleDistance");
		throw de;
	    }
	} else {
	    data.item7_86 = null;
	}
	if (has_item7_870) {
	    // Decode field 'item7-87'
	    try {
		data.item7_87 = new PayloadData(com.oss.coders.per.PerOctets.decode(coder, source, 1, 2048));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-87", "PayloadData");
		throw de;
	    }
	} else {
	    data.item7_87 = null;
	}
	if (has_item7_880) {
	    // Decode field 'item7-88'
	    try {
		data.item7_88 = new Payload(com.oss.coders.per.PerOctets.decode(coder, source, 1, 64));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-88", "Payload");
		throw de;
	    }
	} else {
	    data.item7_88 = null;
	}
	if (has_item7_890) {
	    // Decode field 'item7-89'
	    try {
		int idx1;
		PedestrianDetect temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
		    if (idx1 < 0 || idx1 > 3)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = PedestrianDetect.valueAt(idx1);
		} else {
		    idx1 = 4 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = PedestrianDetect.unknownEnumerator();
		}
		data.item7_89 = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-89", "PedestrianDetect");
		throw de;
	    }
	} else {
	    data.item7_89 = null;
	}
	if (has_item7_900) {
	    // Decode field 'item7-90'
	    try {
		int idx1;
		PedestrianSignalState temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
		    if (idx1 < 0 || idx1 > 3)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = PedestrianSignalState.valueAt(idx1);
		} else {
		    idx1 = 4 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = PedestrianSignalState.unknownEnumerator();
		}
		data.item7_90 = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-90", "PedestrianSignalState");
		throw de;
	    }
	} else {
	    data.item7_90 = null;
	}
	if (has_item7_910) {
	    // Decode field 'item7-91'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 15);
		if (idx1 < 0 || idx1 > 15)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.item7_91 = PositionConfidence.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-91", "PositionConfidence");
		throw de;
	    }
	} else {
	    data.item7_91 = null;
	}
	if (has_item7_920) {
	    // Decode field 'item7-92'
	    try {
		int idx1;
		PreemptState temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 10);
		    if (idx1 < 0 || idx1 > 10)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = PreemptState.valueAt(idx1);
		} else {
		    idx1 = 11 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = PreemptState.unknownEnumerator();
		}
		data.item7_92 = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-92", "PreemptState");
		throw de;
	    }
	} else {
	    data.item7_92 = null;
	}
	if (has_item7_930) {
	    // Decode field 'item7-93'
	    try {
		data.item7_93 = new Priority(com.oss.coders.per.PerOctets.decode(coder, source, 1, 1));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-93", "Priority");
		throw de;
	    }
	} else {
	    data.item7_93 = null;
	}
	if (has_item7_940) {
	    // Decode field 'item7-94'
	    try {
		int idx1;
		PriorityState temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 15);
		    if (idx1 < 0 || idx1 > 15)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = PriorityState.valueAt(idx1);
		} else {
		    idx1 = 16 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = PriorityState.unknownEnumerator();
		}
		data.item7_94 = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-94", "PriorityState");
		throw de;
	    }
	} else {
	    data.item7_94 = null;
	}
	if (has_item7_950) {
	    // Decode field 'item7-95'
	    try {
		long temp1;

		if (data.item7_95 == null)
		    data.item7_95 = new ProbeSegmentNumber();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 32767);
		if (temp1 > 32767)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_95.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-95", "ProbeSegmentNumber");
		throw de;
	    }
	} else {
	    data.item7_95 = null;
	}
	if (has_item7_960) {
	    // Decode field 'item7-96'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 7);
		if (idx1 < 0 || idx1 > 7)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.item7_96 = RainSensor.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-96", "RainSensor");
		throw de;
	    }
	} else {
	    data.item7_96 = null;
	}
	if (has_item7_970) {
	    // Decode field 'item7-97'
	    try {
		int idx1;
		RequestedItem temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 17);
		    if (idx1 < 0 || idx1 > 17)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = RequestedItem.valueAt(idx1);
		} else {
		    idx1 = 18 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = RequestedItem.unknownEnumerator();
		}
		data.item7_97 = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-97", "RequestedItem");
		throw de;
	    }
	} else {
	    data.item7_97 = null;
	}
	if (has_item7_980) {
	    // Decode field 'item7-98'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
		if (idx1 < 0 || idx1 > 3)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.item7_98 = ResponseType.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-98", "ResponseType");
		throw de;
	    }
	} else {
	    data.item7_98 = null;
	}
	if (has_item7_990) {
	    // Decode field 'item7-99'
	    try {
		long temp1;

		if (data.item7_99 == null)
		    data.item7_99 = new RTCM_ID();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 32767);
		if (temp1 > 32767)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_99.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-99", "RTCM-ID");
		throw de;
	    }
	} else {
	    data.item7_99 = null;
	}
	if (has_item7_1000) {
	    // Decode field 'item7-100'
	    try {
		data.item7_100 = new RTCM_Payload(com.oss.coders.per.PerOctets.decode(coder, source, 1, 1023));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-100", "RTCM-Payload");
		throw de;
	    }
	} else {
	    data.item7_100 = null;
	}
	if (has_item7_1010) {
	    // Decode field 'item7-101'
	    try {
		int idx1;
		RTCM_Revision temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 16);
		    if (idx1 < 0 || idx1 > 16)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = RTCM_Revision.valueAt(idx1);
		} else {
		    idx1 = 17 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = RTCM_Revision.unknownEnumerator();
		}
		data.item7_101 = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-101", "RTCM-Revision");
		throw de;
	    }
	} else {
	    data.item7_101 = null;
	}
	if (has_item7_1020) {
	    // Decode field 'item7-102'
	    try {
		long temp1;

		if (data.item7_102 == null)
		    data.item7_102 = new SignalLightState();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 536870912);
		if (temp1 > 536870912)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_102.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-102", "SignalLightState");
		throw de;
	    }
	} else {
	    data.item7_102 = null;
	}
	if (has_item7_1030) {
	    // Decode field 'item7-103'
	    try {
		data.item7_103 = new SignalReqScheme(com.oss.coders.per.PerOctets.decode(coder, source, 1, 1));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-103", "SignalReqScheme");
		throw de;
	    }
	} else {
	    data.item7_103 = null;
	}
	if (has_item7_1040) {
	    // Decode field 'item7-104'
	    try {
		data.item7_104 = new SignalState(com.oss.coders.per.PerOctets.decode(coder, source, 1, 1));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-104", "SignalState");
		throw de;
	    }
	} else {
	    data.item7_104 = null;
	}
	if (has_item7_1050) {
	    // Decode field 'item7-105'
	    try {
		long temp1;

		if (data.item7_105 == null)
		    data.item7_105 = new SignPrority();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 7);
		if (temp1 > 7)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_105.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-105", "SignPrority");
		throw de;
	    }
	} else {
	    data.item7_105 = null;
	}
	if (has_item7_1060) {
	    // Decode field 'item7-106'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
		if (idx1 < 0 || idx1 > 3)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.item7_106 = SirenInUse.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-106", "SirenInUse");
		throw de;
	    }
	} else {
	    data.item7_106 = null;
	}
	if (has_item7_1070) {
	    // Decode field 'item7-107'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 8);
		if (idx1 < 0 || idx1 > 8)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.item7_107 = SpecialLaneAttributes.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-107", "SpecialLaneAttributes");
		throw de;
	    }
	} else {
	    data.item7_107 = null;
	}
	if (has_item7_1080) {
	    // Decode field 'item7-108'
	    try {
		int idx1;
		SpecialSignalState temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 4);
		    if (idx1 < 0 || idx1 > 4)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = SpecialSignalState.valueAt(idx1);
		} else {
		    idx1 = 5 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = SpecialSignalState.unknownEnumerator();
		}
		data.item7_108 = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-108", "SpecialSignalState");
		throw de;
	    }
	} else {
	    data.item7_108 = null;
	}
	if (has_item7_1090) {
	    // Decode field 'item7-109'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 7);
		if (idx1 < 0 || idx1 > 7)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.item7_109 = SpeedConfidence.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-109", "SpeedConfidence");
		throw de;
	    }
	} else {
	    data.item7_109 = null;
	}
	if (has_item7_1100) {
	    // Decode field 'item7-110'
	    try {
		long temp1;

		if (data.item7_110 == null)
		    data.item7_110 = new Speed();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 8191);
		if (temp1 > 8191)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_110.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-110", "Speed");
		throw de;
	    }
	} else {
	    data.item7_110 = null;
	}
	if (has_item7_1110) {
	    // Decode field 'item7-111'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 2);
		if (idx1 < 0 || idx1 > 2)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.item7_111 = StabilityControlStatus.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-111", "StabilityControlStatus");
		throw de;
	    }
	} else {
	    data.item7_111 = null;
	}
	if (has_item7_1120) {
	    // Decode field 'item7-112'
	    try {
		int idx1;
		StateConfidence temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
		    if (idx1 < 0 || idx1 > 3)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = StateConfidence.valueAt(idx1);
		} else {
		    idx1 = 4 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = StateConfidence.unknownEnumerator();
		}
		data.item7_112 = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-112", "StateConfidence");
		throw de;
	    }
	} else {
	    data.item7_112 = null;
	}
	if (has_item7_1130) {
	    // Decode field 'item7-113'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
		if (idx1 < 0 || idx1 > 3)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.item7_113 = SteeringWheelAngleConfidence.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-113", "SteeringWheelAngleConfidence");
		throw de;
	    }
	} else {
	    data.item7_113 = null;
	}
	if (has_item7_1140) {
	    // Decode field 'item7-114'
	    try {
		long temp1;

		if (data.item7_114 == null)
		    data.item7_114 = new SteeringWheelAngleRateOfChange();
		temp1 = coder.decodeConstrainedWholeNumber(source, -127, 127);
		if (temp1 > 127)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_114.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-114", "SteeringWheelAngleRateOfChange");
		throw de;
	    }
	} else {
	    data.item7_114 = null;
	}
	if (has_item7_1150) {
	    // Decode field 'item7-115'
	    try {
		data.item7_115 = new SteeringWheelAngle(com.oss.coders.per.PerOctets.decode(coder, source, 1, 1));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-115", "SteeringWheelAngle");
		throw de;
	    }
	} else {
	    data.item7_115 = null;
	}
	if (has_item7_1160) {
	    // Decode field 'item7-116'
	    try {
		long temp1;

		if (data.item7_116 == null)
		    data.item7_116 = new SunSensor();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 1000);
		if (temp1 > 1000)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_116.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-116", "SunSensor");
		throw de;
	    }
	} else {
	    data.item7_116 = null;
	}
	if (has_item7_1170) {
	    // Decode field 'item7-117'
	    try {
		data.item7_117 = new TemporaryID(com.oss.coders.per.PerOctets.decode(coder, source, 4, 4));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-117", "TemporaryID");
		throw de;
	    }
	} else {
	    data.item7_117 = null;
	}
	if (has_item7_1180) {
	    // Decode field 'item7-118'
	    try {
		long temp1;

		if (data.item7_118 == null)
		    data.item7_118 = new TermDistance();
		temp1 = coder.decodeConstrainedWholeNumber(source, 1, 30000);
		if (temp1 > 30000)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_118.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-118", "TermDistance");
		throw de;
	    }
	} else {
	    data.item7_118 = null;
	}
	if (has_item7_1190) {
	    // Decode field 'item7-119'
	    try {
		long temp1;

		if (data.item7_119 == null)
		    data.item7_119 = new TermTime();
		temp1 = coder.decodeConstrainedWholeNumber(source, 1, 1800);
		if (temp1 > 1800)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_119.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-119", "TermTime");
		throw de;
	    }
	} else {
	    data.item7_119 = null;
	}
	if (has_item7_1200) {
	    // Decode field 'item7-120'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
		if (idx1 < 0 || idx1 > 3)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.item7_120 = ThrottleConfidence.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-120", "ThrottleConfidence");
		throw de;
	    }
	} else {
	    data.item7_120 = null;
	}
	if (has_item7_1210) {
	    // Decode field 'item7-121'
	    try {
		long temp1;

		if (data.item7_121 == null)
		    data.item7_121 = new ThrottlePosition();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 200);
		if (temp1 > 200)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_121.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-121", "ThrottlePosition");
		throw de;
	    }
	} else {
	    data.item7_121 = null;
	}
	if (has_item7_1220) {
	    // Decode field 'item7-122'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 39);
		if (idx1 < 0 || idx1 > 39)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.item7_122 = TimeConfidence.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-122", "TimeConfidence");
		throw de;
	    }
	} else {
	    data.item7_122 = null;
	}
	if (has_item7_1230) {
	    // Decode field 'item7-123'
	    try {
		long temp1;

		if (data.item7_123 == null)
		    data.item7_123 = new TimeMark();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 12002);
		if (temp1 > 12002)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_123.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-123", "TimeMark");
		throw de;
	    }
	} else {
	    data.item7_123 = null;
	}
	if (has_item7_1240) {
	    // Decode field 'item7-124'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
		if (idx1 < 0 || idx1 > 3)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.item7_124 = TractionControlState.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-124", "TractionControlState");
		throw de;
	    }
	} else {
	    data.item7_124 = null;
	}
	if (has_item7_1250) {
	    // Decode field 'item7-125'
	    try {
		int idx1;
		TransitPreEmptionRequest temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
		    if (idx1 < 0 || idx1 > 3)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = TransitPreEmptionRequest.valueAt(idx1);
		} else {
		    idx1 = 4 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = TransitPreEmptionRequest.unknownEnumerator();
		}
		data.item7_125 = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-125", "TransitPreEmptionRequest");
		throw de;
	    }
	} else {
	    data.item7_125 = null;
	}
	if (has_item7_1260) {
	    // Decode field 'item7-126'
	    try {
		if (data.item7_126 == null)
		    data.item7_126 = new TransitStatus();
		com.oss.coders.per.PerBitstring.decode(coder, source, 6, 6, data.item7_126);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-126", "TransitStatus");
		throw de;
	    }
	} else {
	    data.item7_126 = null;
	}
	if (has_item7_1270) {
	    // Decode field 'item7-127'
	    try {
		int idx1;
		TransmissionState temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 7);
		    if (idx1 < 0 || idx1 > 7)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = TransmissionState.valueAt(idx1);
		} else {
		    idx1 = 8 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = TransmissionState.unknownEnumerator();
		}
		data.item7_127 = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-127", "TransmissionState");
		throw de;
	    }
	} else {
	    data.item7_127 = null;
	}
	if (has_item7_1280) {
	    // Decode field 'item7-128'
	    try {
		long temp1;

		if (data.item7_128 == null)
		    data.item7_128 = new TxTime();
		temp1 = coder.decodeConstrainedWholeNumber(source, 1, 20);
		if (temp1 > 20)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_128.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-128", "TxTime");
		throw de;
	    }
	} else {
	    data.item7_128 = null;
	}
	if (has_item7_1290) {
	    // Decode field 'item7-129'
	    try {
		int idx1;
		TravelerInfoType temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
		    if (idx1 < 0 || idx1 > 3)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = TravelerInfoType.valueAt(idx1);
		} else {
		    idx1 = 4 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = TravelerInfoType.unknownEnumerator();
		}
		data.item7_129 = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-129", "TravelerInfoType");
		throw de;
	    }
	} else {
	    data.item7_129 = null;
	}
	if (has_item7_1300) {
	    // Decode field 'item7-130'
	    try {
		data.item7_130 = new UniqueMSGID(com.oss.coders.per.PerOctets.decode(coder, source, 9, 9));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-130", "UniqueMSGID");
		throw de;
	    }
	} else {
	    data.item7_130 = null;
	}
	if (has_item7_1310) {
	    // Decode field 'item7-131'
	    try {
		data.item7_131 = new URL_Base(com.oss.coders.per.PerKMCString.decode(coder, source, 1, 45, AllInclusive._cEPAInfo_item7_131));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-131", "URL-Base");
		throw de;
	    }
	} else {
	    data.item7_131 = null;
	}
	if (has_item7_1320) {
	    // Decode field 'item7-132'
	    try {
		data.item7_132 = new URL_Link(com.oss.coders.per.PerKMCString.decode(coder, source, 1, 255, AllInclusive._cEPAInfo_item7_132));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-132", "URL-Link");
		throw de;
	    }
	} else {
	    data.item7_132 = null;
	}
	if (has_item7_1330) {
	    // Decode field 'item7-133'
	    try {
		data.item7_133 = new URL_Short(com.oss.coders.per.PerKMCString.decode(coder, source, 1, 15, AllInclusive._cEPAInfo_item7_133));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-133", "URL-Short");
		throw de;
	    }
	} else {
	    data.item7_133 = null;
	}
	if (has_item7_1340) {
	    // Decode field 'item7-134'
	    try {
		long temp1;

		if (data.item7_134 == null)
		    data.item7_134 = new VehicleHeight();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 127);
		if (temp1 > 127)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_134.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-134", "VehicleHeight");
		throw de;
	    }
	} else {
	    data.item7_134 = null;
	}
	if (has_item7_1350) {
	    // Decode field 'item7-135'
	    try {
		long temp1;

		if (data.item7_135 == null)
		    data.item7_135 = new VehicleLaneAttributes();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 65535);
		if (temp1 > 65535)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_135.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-135", "VehicleLaneAttributes");
		throw de;
	    }
	} else {
	    data.item7_135 = null;
	}
	if (has_item7_1360) {
	    // Decode field 'item7-136'
	    try {
		long temp1;

		if (data.item7_136 == null)
		    data.item7_136 = new VehicleLength();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 16383);
		if (temp1 > 16383)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_136.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-136", "VehicleLength");
		throw de;
	    }
	} else {
	    data.item7_136 = null;
	}
	if (has_item7_1370) {
	    // Decode field 'item7-137'
	    try {
		long temp1;

		if (data.item7_137 == null)
		    data.item7_137 = new VehicleMass();
		temp1 = coder.decodeConstrainedWholeNumber(source, 1, 127);
		if (temp1 > 127)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_137.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-137", "VehicleMass");
		throw de;
	    }
	} else {
	    data.item7_137 = null;
	}
	if (has_item7_1380) {
	    // Decode field 'item7-138'
	    try {
		data.item7_138 = new VehicleRequestStatus(com.oss.coders.per.PerOctets.decode(coder, source, 1, 1));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-138", "VehicleRequestStatus");
		throw de;
	    }
	} else {
	    data.item7_138 = null;
	}
	if (has_item7_1390) {
	    // Decode field 'item7-139'
	    try {
		int idx1;
		VehicleStatusDeviceTypeTag temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 28);
		    if (idx1 < 0 || idx1 > 28)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = VehicleStatusDeviceTypeTag.valueAt(idx1);
		} else {
		    idx1 = 29 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = VehicleStatusDeviceTypeTag.unknownEnumerator();
		}
		data.item7_139 = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-139", "VehicleStatusDeviceTypeTag");
		throw de;
	    }
	} else {
	    data.item7_139 = null;
	}
	if (has_item7_1400) {
	    // Decode field 'item7-140'
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
		data.item7_140 = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-140", "VehicleType");
		throw de;
	    }
	} else {
	    data.item7_140 = null;
	}
	if (has_item7_1410) {
	    // Decode field 'item7-141'
	    try {
		long temp1;

		if (data.item7_141 == null)
		    data.item7_141 = new VehicleWidth();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 1023);
		if (temp1 > 1023)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_141.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-141", "VehicleWidth");
		throw de;
	    }
	} else {
	    data.item7_141 = null;
	}
	if (has_item7_1420) {
	    // Decode field 'item7-142'
	    try {
		if (data.item7_142 == null)
		    data.item7_142 = new VerticalAccelerationThreshold();
		com.oss.coders.per.PerBitstring.decode(coder, source, -1, data.item7_142);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-142", "VerticalAccelerationThreshold");
		throw de;
	    }
	} else {
	    data.item7_142 = null;
	}
	if (has_item7_1430) {
	    // Decode field 'item7-143'
	    try {
		long temp1;

		if (data.item7_143 == null)
		    data.item7_143 = new VerticalAcceleration();
		temp1 = coder.decodeConstrainedWholeNumber(source, -127, 127);
		if (temp1 > 127)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_143.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-143", "VerticalAcceleration");
		throw de;
	    }
	} else {
	    data.item7_143 = null;
	}
	if (has_item7_1440) {
	    // Decode field 'item7-144'
	    try {
		data.item7_144 = new VINstring(com.oss.coders.per.PerOctets.decode(coder, source, 1, 17));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-144", "VINstring");
		throw de;
	    }
	} else {
	    data.item7_144 = null;
	}
	if (has_item7_1450) {
	    // Decode field 'item7-145'
	    try {
		long temp1;

		if (data.item7_145 == null)
		    data.item7_145 = new WiperRate();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 127);
		if (temp1 > 127)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_145.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-145", "WiperRate");
		throw de;
	    }
	} else {
	    data.item7_145 = null;
	}
	if (has_item7_1460) {
	    // Decode field 'item7-146'
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
		data.item7_146 = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-146", "WiperStatusFront");
		throw de;
	    }
	} else {
	    data.item7_146 = null;
	}
	if (has_item7_1470) {
	    // Decode field 'item7-147'
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
		data.item7_147 = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-147", "WiperStatusRear");
		throw de;
	    }
	} else {
	    data.item7_147 = null;
	}
	if (has_item7_1480) {
	    // Decode field 'item7-148'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 7);
		if (idx1 < 0 || idx1 > 7)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.item7_148 = YawRateConfidence.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-148", "YawRateConfidence");
		throw de;
	    }
	} else {
	    data.item7_148 = null;
	}
	if (has_item7_1490) {
	    // Decode field 'item7-149'
	    try {
		long temp1;

		if (data.item7_149 == null)
		    data.item7_149 = new YawRate();
		temp1 = coder.decodeConstrainedWholeNumber(source, -32767, 32767);
		if (temp1 > 32767)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item7_149.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item7-149", "YawRate");
		throw de;
	    }
	} else {
	    data.item7_149 = null;
	}
	if (has_item8_10) {
	    // Decode field 'item8-1'
	    try {
		int idx1;
		com.bah.ode.asn.oss.itis.IncidentResponseEquipment temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 71);
		    if (idx1 < 0 || idx1 > 71)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = com.bah.ode.asn.oss.itis.IncidentResponseEquipment.valueAt(idx1);
		} else {
		    idx1 = 72 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = com.bah.ode.asn.oss.itis.IncidentResponseEquipment.unknownEnumerator();
		}
		data.item8_1 = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item8-1", "IncidentResponseEquipment");
		throw de;
	    }
	} else {
	    data.item8_1 = null;
	}
	if (has_item8_20) {
	    // Decode field 'item8-2'
	    try {
		data.item8_2 = new com.bah.ode.asn.oss.itis.ITIStext(com.oss.coders.per.PerKMCString.decode(coder, source, 1, 500, AllInclusive._cEPAInfo_item8_2));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item8-2", "ITIStext");
		throw de;
	    }
	} else {
	    data.item8_2 = null;
	}
	if (has_item8_30) {
	    // Decode field 'item8-3'
	    try {
		int idx1;
		com.bah.ode.asn.oss.itis.ResponderGroupAffected temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 13);
		    if (idx1 < 0 || idx1 > 13)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = com.bah.ode.asn.oss.itis.ResponderGroupAffected.valueAt(idx1);
		} else {
		    idx1 = 14 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = com.bah.ode.asn.oss.itis.ResponderGroupAffected.unknownEnumerator();
		}
		data.item8_3 = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item8-3", "ResponderGroupAffected");
		throw de;
	    }
	} else {
	    data.item8_3 = null;
	}
	if (has_item8_40) {
	    // Decode field 'item8-4'
	    try {
		int idx1;
		com.bah.ode.asn.oss.itis.VehicleGroupAffected temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 34);
		    if (idx1 < 0 || idx1 > 34)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = com.bah.ode.asn.oss.itis.VehicleGroupAffected.valueAt(idx1);
		} else {
		    idx1 = 35 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = com.bah.ode.asn.oss.itis.VehicleGroupAffected.unknownEnumerator();
		}
		data.item8_4 = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item8-4", "VehicleGroupAffected");
		throw de;
	    }
	} else {
	    data.item8_4 = null;
	}
	if (has_item8_50) {
	    // Decode field 'item8-5'
	    try {
		if (data.item8_5 == null)
		    data.item8_5 = new com.bah.ode.asn.oss.itis.ITIScodesAndText();
		com.bah.ode.asn.oss.itis.ITIScodesAndText.decodeValue(coder, source, data.item8_5);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item8-5", "ITIScodesAndText");
		throw de;
	    }
	} else {
	    data.item8_5 = null;
	}
	if (has_item8_60) {
	    // Decode field 'item8-6'
	    try {
		long temp1;

		if (data.item8_6 == null)
		    data.item8_6 = new com.bah.ode.asn.oss.ntcip.EssMobileFriction();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 101);
		if (temp1 > 101)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item8_6.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item8-6", "EssMobileFriction");
		throw de;
	    }
	} else {
	    data.item8_6 = null;
	}
	if (has_item8_70) {
	    // Decode field 'item8-7'
	    try {
		long temp1;

		if (data.item8_7 == null)
		    data.item8_7 = new com.bah.ode.asn.oss.ntcip.EssPrecipRate();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 65535);
		if (temp1 > 65535)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item8_7.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item8-7", "EssPrecipRate");
		throw de;
	    }
	} else {
	    data.item8_7 = null;
	}
	if (has_item8_80) {
	    // Decode field 'item8-8'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 14);
		if (idx1 < 0 || idx1 > 14)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.item8_8 = com.bah.ode.asn.oss.ntcip.EssPrecipSituation.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item8-8", "EssPrecipSituation");
		throw de;
	    }
	} else {
	    data.item8_8 = null;
	}
	if (has_item8_90) {
	    // Decode field 'item8-9'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 2);
		if (idx1 < 0 || idx1 > 2)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.item8_9 = com.bah.ode.asn.oss.ntcip.EssPrecipYesNo.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item8-9", "EssPrecipYesNo");
		throw de;
	    }
	} else {
	    data.item8_9 = null;
	}
	if (has_item8_100) {
	    // Decode field 'item8-10'
	    try {
		long temp1;

		if (data.item8_10 == null)
		    data.item8_10 = new com.bah.ode.asn.oss.ntcip.EssSolarRadiation();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 65535);
		if (temp1 > 65535)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item8_10.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item8-10", "EssSolarRadiation");
		throw de;
	    }
	} else {
	    data.item8_10 = null;
	}
	if (has_item8_110) {
	    // Decode field 'item8-11'
	    try {
		long temp1;

		if (data.item8_11 == null)
		    data.item8_11 = new com.bah.ode.asn.oss.itis.ITIScodes();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 65565);
		if (temp1 > 65565)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.item8_11.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item8-11", "ITIScodes");
		throw de;
	    }
	} else {
	    data.item8_11 = null;
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
	if (this.item6_1 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-1 ");
		printer.print(this.item6_1, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_2 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-2 ");
		this.item6_2.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_4 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-4 ");
		printer.print(this.item6_4, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_5 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-5 ");
		this.item6_5.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_6 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-6 ");
		this.item6_6.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_7 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-7 ");
		this.item6_7.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_8 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-8 ");
		printer.print(this.item6_8, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_9 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-9 ");
		printer.print(this.item6_9, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_10 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-10 ");
		this.item6_10.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_11 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-11 ");
		this.item6_11.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_12 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-12 ");
		this.item6_12.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_13 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-13 ");
		printer.print(this.item6_13, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_14 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-14 ");
		this.item6_14.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_15 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-15 ");
		this.item6_15.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_16 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-16 ");
		this.item6_16.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_17 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-17 ");
		this.item6_17.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_18 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-18 ");
		this.item6_18.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_19 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-19 ");
		this.item6_19.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_20 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-20 ");
		this.item6_20.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_21 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-21 ");
		this.item6_21.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_22 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-22 ");
		this.item6_22.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_23 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-23 ");
		this.item6_23.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_24 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-24 ");
		this.item6_24.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_25 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-25 ");
		this.item6_25.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_26 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-26 ");
		this.item6_26.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_27 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-27 ");
		this.item6_27.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_28 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-28 ");
		this.item6_28.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_29 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-29 ");
		this.item6_29.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_30 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-30 ");
		this.item6_30.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_31 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-31 ");
		this.item6_31.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_32 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-32 ");
		printer.print(this.item6_32, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_33 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-33 ");
		this.item6_33.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_34 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-34 ");
		this.item6_34.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_35 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-35 ");
		printer.print(this.item6_35, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_36 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-36 ");
		printer.print(this.item6_36, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_37 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-37 ");
		printer.print(this.item6_37, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_38 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-38 ");
		printer.print(this.item6_38, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_39 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-39 ");
		printer.print(this.item6_39, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_40 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-40 ");
		printer.print(this.item6_40, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_41 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-41 ");
		printer.print(this.item6_41, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_42 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-42 ");
		printer.print(this.item6_42, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_43 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-43 ");
		printer.print(this.item6_43, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_44 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-44 ");
		this.item6_44.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_45 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-45 ");
		this.item6_45.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_46 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-46 ");
		printer.print(this.item6_46, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_47 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-47 ");
		printer.print(this.item6_47, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_48 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-48 ");
		this.item6_48.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_49 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-49 ");
		this.item6_49.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_50 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-50 ");
		this.item6_50.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_51 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-51 ");
		this.item6_51.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_52 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-52 ");
		printer.print(this.item6_52, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_53 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-53 ");
		this.item6_53.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_54 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-54 ");
		this.item6_54.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_55 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-55 ");
		this.item6_55.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_56 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-56 ");
		this.item6_56.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_57 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-57 ");
		this.item6_57.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_58 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-58 ");
		this.item6_58.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_59 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-59 ");
		this.item6_59.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_60 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-60 ");
		this.item6_60.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_61 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-61 ");
		this.item6_61.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_62 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-62 ");
		this.item6_62.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_63 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-63 ");
		printer.print(this.item6_63, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_64 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-64 ");
		printer.print(this.item6_64, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_65 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-65 ");
		this.item6_65.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_66 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-66 ");
		this.item6_66.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_67 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-67 ");
		this.item6_67.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_68 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-68 ");
		this.item6_68.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_69 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-69 ");
		this.item6_69.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_70 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-70 ");
		this.item6_70.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_71 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-71 ");
		this.item6_71.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_72 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-72 ");
		this.item6_72.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item6_73 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item6-73 ");
		this.item6_73.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_1 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-1 ");
		writer.print(this.item7_1.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_2 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-2 ");
		printer.print(this.item7_2, writer, this.item7_2.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_3 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-3 ");
		writer.print(this.item7_3.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_4 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-4 ");
		writer.print(this.item7_4.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_5 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-5 ");
		printer.print(this.item7_5, writer, this.item7_5.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_6 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-6 ");
		writer.print(this.item7_6.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_7 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-7 ");
		printer.print(this.item7_7, writer, this.item7_7.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_8 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-8 ");
		writer.print(this.item7_8.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_9 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-9 ");
		printer.print(this.item7_9, writer, this.item7_9.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_10 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-10 ");
		printer.print(this.item7_10, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_11 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-11 ");
		printer.print(this.item7_11, writer, this.item7_11.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_12 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-12 ");
		writer.print(this.item7_12.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_13 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-13 ");
		writer.print(this.item7_13.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_14 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-14 ");
		printer.print(this.item7_14, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_15 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-15 ");
		writer.print(this.item7_15.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_16 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-16 ");
		printer.print(this.item7_16, writer, this.item7_16.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_17 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-17 ");
		writer.print(this.item7_17.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_18 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-18 ");
		printer.print(this.item7_18, writer, this.item7_18.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_19 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-19 ");
		writer.print(this.item7_19.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_20 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-20 ");
		printer.print(this.item7_20, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_21 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-21 ");
		writer.print(this.item7_21.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_22 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-22 ");
		printer.print(this.item7_22, writer, this.item7_22.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_23 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-23 ");
		writer.print(this.item7_23.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_24 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-24 ");
		writer.print(this.item7_24.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_25 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-25 ");
		writer.print(this.item7_25.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_26 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-26 ");
		writer.print(this.item7_26.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_27 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-27 ");
		writer.print(this.item7_27.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_28 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-28 ");
		writer.print(this.item7_28.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_29 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-29 ");
		writer.print(this.item7_29.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_30 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-30 ");
		printer.print(this.item7_30, writer, this.item7_30.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_31 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-31 ");
		writer.print(this.item7_31.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_32 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-32 ");
		printer.print(this.item7_32, writer, this.item7_32.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_33 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-33 ");
		printer.print(this.item7_33, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_34 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-34 ");
		writer.print(this.item7_34.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_35 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-35 ");
		writer.print(this.item7_35.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_36 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-36 ");
		printer.print(this.item7_36, writer, this.item7_36.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_37 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-37 ");
		writer.print(this.item7_37.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_38 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-38 ");
		printer.print(this.item7_38, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_39 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-39 ");
		printer.print(this.item7_39, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_40 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-40 ");
		printer.print(this.item7_40, writer, this.item7_40.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_41 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-41 ");
		writer.print(this.item7_41.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_42 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-42 ");
		printer.print(this.item7_42, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_43 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-43 ");
		printer.print(this.item7_43, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_44 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-44 ");
		printer.print(this.item7_44, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_45 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-45 ");
		writer.print(this.item7_45.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_46 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-46 ");
		writer.print(this.item7_46.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_47 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-47 ");
		writer.print(this.item7_47.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_48 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-48 ");
		writer.print(this.item7_48.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_49 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-49 ");
		writer.print(this.item7_49.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_50 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-50 ");
		writer.print(this.item7_50.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_51 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-51 ");
		writer.print(this.item7_51.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_52 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-52 ");
		writer.print(this.item7_52.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_53 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-53 ");
		writer.print(this.item7_53.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_54 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-54 ");
		writer.print(this.item7_54.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_55 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-55 ");
		writer.print(this.item7_55.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_56 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-56 ");
		printer.print(this.item7_56, writer, this.item7_56.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_57 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-57 ");
		writer.print(this.item7_57.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_58 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-58 ");
		writer.print(this.item7_58.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_59 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-59 ");
		writer.print(this.item7_59.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_60 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-60 ");
		printer.print(this.item7_60, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_61 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-61 ");
		printer.print(this.item7_61, writer, this.item7_61.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_62 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-62 ");
		writer.print(this.item7_62.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_63 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-63 ");
		printer.print(this.item7_63, writer, this.item7_63.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_64 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-64 ");
		printer.print(this.item7_64, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_65 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-65 ");
		printer.print(this.item7_65, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_66 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-66 ");
		writer.print(this.item7_66.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_67 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-67 ");
		writer.print(this.item7_67.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_68 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-68 ");
		writer.print(this.item7_68.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_69 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-69 ");
		printer.print(this.item7_69, writer, this.item7_69.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_70 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-70 ");
		printer.print(this.item7_70, writer, this.item7_70.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_71 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-71 ");
		writer.print(this.item7_71.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_72 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-72 ");
		printer.print(this.item7_72, writer, this.item7_72.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_73 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-73 ");
		printer.print(this.item7_73, writer, this.item7_73.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_74 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-74 ");
		writer.print(this.item7_74.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_75 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-75 ");
		writer.print(this.item7_75.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_76 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-76 ");
		writer.print(this.item7_76.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_77 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-77 ");
		printer.print(this.item7_77, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_78 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-78 ");
		printer.print(this.item7_78, writer, this.item7_78.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_79 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-79 ");
		printer.print(this.item7_79, writer, this.item7_79.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_80 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-80 ");
		writer.print(this.item7_80.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_81 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-81 ");
		printer.print(this.item7_81, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_82 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-82 ");
		printer.print(this.item7_82, writer, this.item7_82.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_83 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-83 ");
		printer.print(this.item7_83, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_84 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-84 ");
		writer.print(this.item7_84.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_85 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-85 ");
		writer.print(this.item7_85.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_86 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-86 ");
		writer.print(this.item7_86.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_87 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-87 ");
		printer.print(this.item7_87, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_88 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-88 ");
		printer.print(this.item7_88, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_89 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-89 ");
		printer.print(this.item7_89, writer, this.item7_89.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_90 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-90 ");
		printer.print(this.item7_90, writer, this.item7_90.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_91 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-91 ");
		printer.print(this.item7_91, writer, this.item7_91.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_92 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-92 ");
		printer.print(this.item7_92, writer, this.item7_92.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_93 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-93 ");
		printer.print(this.item7_93, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_94 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-94 ");
		printer.print(this.item7_94, writer, this.item7_94.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_95 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-95 ");
		writer.print(this.item7_95.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_96 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-96 ");
		printer.print(this.item7_96, writer, this.item7_96.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_97 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-97 ");
		printer.print(this.item7_97, writer, this.item7_97.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_98 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-98 ");
		printer.print(this.item7_98, writer, this.item7_98.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_99 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-99 ");
		writer.print(this.item7_99.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_100 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-100 ");
		printer.print(this.item7_100, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_101 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-101 ");
		printer.print(this.item7_101, writer, this.item7_101.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_102 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-102 ");
		writer.print(this.item7_102.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_103 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-103 ");
		printer.print(this.item7_103, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_104 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-104 ");
		printer.print(this.item7_104, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_105 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-105 ");
		writer.print(this.item7_105.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_106 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-106 ");
		printer.print(this.item7_106, writer, this.item7_106.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_107 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-107 ");
		printer.print(this.item7_107, writer, this.item7_107.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_108 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-108 ");
		printer.print(this.item7_108, writer, this.item7_108.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_109 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-109 ");
		printer.print(this.item7_109, writer, this.item7_109.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_110 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-110 ");
		writer.print(this.item7_110.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_111 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-111 ");
		printer.print(this.item7_111, writer, this.item7_111.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_112 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-112 ");
		printer.print(this.item7_112, writer, this.item7_112.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_113 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-113 ");
		printer.print(this.item7_113, writer, this.item7_113.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_114 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-114 ");
		writer.print(this.item7_114.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_115 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-115 ");
		printer.print(this.item7_115, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_116 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-116 ");
		writer.print(this.item7_116.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_117 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-117 ");
		printer.print(this.item7_117, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_118 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-118 ");
		writer.print(this.item7_118.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_119 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-119 ");
		writer.print(this.item7_119.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_120 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-120 ");
		printer.print(this.item7_120, writer, this.item7_120.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_121 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-121 ");
		writer.print(this.item7_121.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_122 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-122 ");
		printer.print(this.item7_122, writer, this.item7_122.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_123 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-123 ");
		writer.print(this.item7_123.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_124 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-124 ");
		printer.print(this.item7_124, writer, this.item7_124.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_125 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-125 ");
		printer.print(this.item7_125, writer, this.item7_125.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_126 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-126 ");
		printer.print(this.item7_126, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_127 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-127 ");
		printer.print(this.item7_127, writer, this.item7_127.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_128 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-128 ");
		writer.print(this.item7_128.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_129 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-129 ");
		printer.print(this.item7_129, writer, this.item7_129.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_130 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-130 ");
		printer.print(this.item7_130, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_131 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-131 ");
		printer.print(this.item7_131, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_132 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-132 ");
		printer.print(this.item7_132, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_133 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-133 ");
		printer.print(this.item7_133, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_134 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-134 ");
		writer.print(this.item7_134.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_135 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-135 ");
		writer.print(this.item7_135.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_136 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-136 ");
		writer.print(this.item7_136.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_137 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-137 ");
		writer.print(this.item7_137.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_138 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-138 ");
		printer.print(this.item7_138, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_139 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-139 ");
		printer.print(this.item7_139, writer, this.item7_139.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_140 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-140 ");
		printer.print(this.item7_140, writer, this.item7_140.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_141 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-141 ");
		writer.print(this.item7_141.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_142 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-142 ");
		printer.print(this.item7_142, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_143 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-143 ");
		writer.print(this.item7_143.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_144 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-144 ");
		printer.print(this.item7_144, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_145 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-145 ");
		writer.print(this.item7_145.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_146 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-146 ");
		printer.print(this.item7_146, writer, this.item7_146.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_147 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-147 ");
		printer.print(this.item7_147, writer, this.item7_147.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_148 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-148 ");
		printer.print(this.item7_148, writer, this.item7_148.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item7_149 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item7-149 ");
		writer.print(this.item7_149.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item8_1 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item8-1 ");
		printer.print(this.item8_1, writer, this.item8_1.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item8_2 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item8-2 ");
		printer.print(this.item8_2, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item8_3 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item8-3 ");
		printer.print(this.item8_3, writer, this.item8_3.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item8_4 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item8-4 ");
		printer.print(this.item8_4, writer, this.item8_4.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item8_5 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item8-5 ");
		this.item8_5.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item8_6 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item8-6 ");
		writer.print(this.item8_6.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item8_7 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item8-7 ");
		writer.print(this.item8_7.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item8_8 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item8-8 ");
		printer.print(this.item8_8, writer, this.item8_8.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item8_9 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item8-9 ");
		printer.print(this.item8_9, writer, this.item8_9.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item8_10 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item8-10 ");
		writer.print(this.item8_10.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.item8_11 != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("item8-11 ");
		writer.print(this.item8_11.longValue());
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
	return equalTo((AllInclusive)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((AllInclusive)that);
    }
    
    public boolean equalTo(AllInclusive that) {
	if (this.item6_1 != null && that.item6_1 != null) {
	    if (!this.item6_1.equalTo(that.item6_1))
		return false;
	}
	if (this.item6_2 != null && that.item6_2 != null) {
	    if (!this.item6_2.equalTo(that.item6_2))
		return false;
	}
	if (this.item6_4 != null && that.item6_4 != null) {
	    if (!this.item6_4.equalTo(that.item6_4))
		return false;
	}
	if (this.item6_5 != null && that.item6_5 != null) {
	    if (!this.item6_5.equalTo(that.item6_5))
		return false;
	}
	if (this.item6_6 != null && that.item6_6 != null) {
	    if (!this.item6_6.equalTo(that.item6_6))
		return false;
	}
	if (this.item6_7 != null && that.item6_7 != null) {
	    if (!this.item6_7.equalTo(that.item6_7))
		return false;
	}
	if (this.item6_8 != null && that.item6_8 != null) {
	    if (!this.item6_8.equalTo(that.item6_8))
		return false;
	}
	if (this.item6_9 != null && that.item6_9 != null) {
	    if (!this.item6_9.equalTo(that.item6_9))
		return false;
	}
	if (this.item6_10 != null && that.item6_10 != null) {
	    if (!this.item6_10.equalTo(that.item6_10))
		return false;
	}
	if (this.item6_11 != null && that.item6_11 != null) {
	    if (!this.item6_11.equalTo(that.item6_11))
		return false;
	}
	if (this.item6_12 != null && that.item6_12 != null) {
	    if (!this.item6_12.equalTo(that.item6_12))
		return false;
	}
	if (this.item6_13 != null && that.item6_13 != null) {
	    if (!this.item6_13.equalTo(that.item6_13))
		return false;
	}
	if (this.item6_14 != null && that.item6_14 != null) {
	    if (!this.item6_14.equalTo(that.item6_14))
		return false;
	}
	if (this.item6_15 != null && that.item6_15 != null) {
	    if (!this.item6_15.equalTo(that.item6_15))
		return false;
	}
	if (this.item6_16 != null && that.item6_16 != null) {
	    if (!this.item6_16.equalTo(that.item6_16))
		return false;
	}
	if (this.item6_17 != null && that.item6_17 != null) {
	    if (!this.item6_17.equalTo(that.item6_17))
		return false;
	}
	if (this.item6_18 != null && that.item6_18 != null) {
	    if (!this.item6_18.equalTo(that.item6_18))
		return false;
	}
	if (this.item6_19 != null && that.item6_19 != null) {
	    if (!this.item6_19.equalTo(that.item6_19))
		return false;
	}
	if (this.item6_20 != null && that.item6_20 != null) {
	    if (!this.item6_20.equalTo(that.item6_20))
		return false;
	}
	if (this.item6_21 != null && that.item6_21 != null) {
	    if (!this.item6_21.equalTo(that.item6_21))
		return false;
	}
	if (this.item6_22 != null && that.item6_22 != null) {
	    if (!this.item6_22.equalTo(that.item6_22))
		return false;
	}
	if (this.item6_23 != null && that.item6_23 != null) {
	    if (!this.item6_23.equalTo(that.item6_23))
		return false;
	}
	if (this.item6_24 != null && that.item6_24 != null) {
	    if (!this.item6_24.equalTo(that.item6_24))
		return false;
	}
	if (this.item6_25 != null && that.item6_25 != null) {
	    if (!this.item6_25.equalTo(that.item6_25))
		return false;
	}
	if (this.item6_26 != null && that.item6_26 != null) {
	    if (!this.item6_26.equalTo(that.item6_26))
		return false;
	}
	if (this.item6_27 != null && that.item6_27 != null) {
	    if (!this.item6_27.equalTo(that.item6_27))
		return false;
	}
	if (this.item6_28 != null && that.item6_28 != null) {
	    if (!this.item6_28.equalTo(that.item6_28))
		return false;
	}
	if (this.item6_29 != null && that.item6_29 != null) {
	    if (!this.item6_29.equalTo(that.item6_29))
		return false;
	}
	if (this.item6_30 != null && that.item6_30 != null) {
	    if (!this.item6_30.equalTo(that.item6_30))
		return false;
	}
	if (this.item6_31 != null && that.item6_31 != null) {
	    if (!this.item6_31.equalTo(that.item6_31))
		return false;
	}
	if (this.item6_32 != null && that.item6_32 != null) {
	    if (!this.item6_32.equalTo(that.item6_32))
		return false;
	}
	if (this.item6_33 != null && that.item6_33 != null) {
	    if (!this.item6_33.equalTo(that.item6_33))
		return false;
	}
	if (this.item6_34 != null && that.item6_34 != null) {
	    if (!this.item6_34.equalTo(that.item6_34))
		return false;
	}
	if (this.item6_35 != null && that.item6_35 != null) {
	    if (!this.item6_35.equalTo(that.item6_35))
		return false;
	}
	if (this.item6_36 != null && that.item6_36 != null) {
	    if (!this.item6_36.equalTo(that.item6_36))
		return false;
	}
	if (this.item6_37 != null && that.item6_37 != null) {
	    if (!this.item6_37.equalTo(that.item6_37))
		return false;
	}
	if (this.item6_38 != null && that.item6_38 != null) {
	    if (!this.item6_38.equalTo(that.item6_38))
		return false;
	}
	if (this.item6_39 != null && that.item6_39 != null) {
	    if (!this.item6_39.equalTo(that.item6_39))
		return false;
	}
	if (this.item6_40 != null && that.item6_40 != null) {
	    if (!this.item6_40.equalTo(that.item6_40))
		return false;
	}
	if (this.item6_41 != null && that.item6_41 != null) {
	    if (!this.item6_41.equalTo(that.item6_41))
		return false;
	}
	if (this.item6_42 != null && that.item6_42 != null) {
	    if (!this.item6_42.equalTo(that.item6_42))
		return false;
	}
	if (this.item6_43 != null && that.item6_43 != null) {
	    if (!this.item6_43.equalTo(that.item6_43))
		return false;
	}
	if (this.item6_44 != null && that.item6_44 != null) {
	    if (!this.item6_44.equalTo(that.item6_44))
		return false;
	}
	if (this.item6_45 != null && that.item6_45 != null) {
	    if (!this.item6_45.equalTo(that.item6_45))
		return false;
	}
	if (this.item6_46 != null && that.item6_46 != null) {
	    if (!this.item6_46.equalTo(that.item6_46))
		return false;
	}
	if (this.item6_47 != null && that.item6_47 != null) {
	    if (!this.item6_47.equalTo(that.item6_47))
		return false;
	}
	if (this.item6_48 != null && that.item6_48 != null) {
	    if (!this.item6_48.equalTo(that.item6_48))
		return false;
	}
	if (this.item6_49 != null && that.item6_49 != null) {
	    if (!this.item6_49.equalTo(that.item6_49))
		return false;
	}
	if (this.item6_50 != null && that.item6_50 != null) {
	    if (!this.item6_50.equalTo(that.item6_50))
		return false;
	}
	if (this.item6_51 != null && that.item6_51 != null) {
	    if (!this.item6_51.equalTo(that.item6_51))
		return false;
	}
	if (this.item6_52 != null && that.item6_52 != null) {
	    if (!this.item6_52.equalTo(that.item6_52))
		return false;
	}
	if (this.item6_53 != null && that.item6_53 != null) {
	    if (!this.item6_53.equalTo(that.item6_53))
		return false;
	}
	if (this.item6_54 != null && that.item6_54 != null) {
	    if (!this.item6_54.equalTo(that.item6_54))
		return false;
	}
	if (this.item6_55 != null && that.item6_55 != null) {
	    if (!this.item6_55.equalTo(that.item6_55))
		return false;
	}
	if (this.item6_56 != null && that.item6_56 != null) {
	    if (!this.item6_56.equalTo(that.item6_56))
		return false;
	}
	if (this.item6_57 != null && that.item6_57 != null) {
	    if (!this.item6_57.equalTo(that.item6_57))
		return false;
	}
	if (this.item6_58 != null && that.item6_58 != null) {
	    if (!this.item6_58.equalTo(that.item6_58))
		return false;
	}
	if (this.item6_59 != null && that.item6_59 != null) {
	    if (!this.item6_59.equalTo(that.item6_59))
		return false;
	}
	if (this.item6_60 != null && that.item6_60 != null) {
	    if (!this.item6_60.equalTo(that.item6_60))
		return false;
	}
	if (this.item6_61 != null && that.item6_61 != null) {
	    if (!this.item6_61.equalTo(that.item6_61))
		return false;
	}
	if (this.item6_62 != null && that.item6_62 != null) {
	    if (!this.item6_62.equalTo(that.item6_62))
		return false;
	}
	if (this.item6_63 != null && that.item6_63 != null) {
	    if (!this.item6_63.equalTo(that.item6_63))
		return false;
	}
	if (this.item6_64 != null && that.item6_64 != null) {
	    if (!this.item6_64.equalTo(that.item6_64))
		return false;
	}
	if (this.item6_65 != null && that.item6_65 != null) {
	    if (!this.item6_65.equalTo(that.item6_65))
		return false;
	}
	if (this.item6_66 != null && that.item6_66 != null) {
	    if (!this.item6_66.equalTo(that.item6_66))
		return false;
	}
	if (this.item6_67 != null && that.item6_67 != null) {
	    if (!this.item6_67.equalTo(that.item6_67))
		return false;
	}
	if (this.item6_68 != null && that.item6_68 != null) {
	    if (!this.item6_68.equalTo(that.item6_68))
		return false;
	}
	if (this.item6_69 != null && that.item6_69 != null) {
	    if (!this.item6_69.equalTo(that.item6_69))
		return false;
	}
	if (this.item6_70 != null && that.item6_70 != null) {
	    if (!this.item6_70.equalTo(that.item6_70))
		return false;
	}
	if (this.item6_71 != null && that.item6_71 != null) {
	    if (!this.item6_71.equalTo(that.item6_71))
		return false;
	}
	if (this.item6_72 != null && that.item6_72 != null) {
	    if (!this.item6_72.equalTo(that.item6_72))
		return false;
	}
	if (this.item6_73 != null && that.item6_73 != null) {
	    if (!this.item6_73.equalTo(that.item6_73))
		return false;
	}
	if (this.item7_1 != null && that.item7_1 != null) {
	    if (!this.item7_1.equalTo(that.item7_1))
		return false;
	}
	if (this.item7_2 != null && that.item7_2 != null) {
	    if (!this.item7_2.equalTo(that.item7_2))
		return false;
	}
	if (this.item7_3 != null && that.item7_3 != null) {
	    if (!this.item7_3.equalTo(that.item7_3))
		return false;
	}
	if (this.item7_4 != null && that.item7_4 != null) {
	    if (!this.item7_4.equalTo(that.item7_4))
		return false;
	}
	if (this.item7_5 != null && that.item7_5 != null) {
	    if (!this.item7_5.equalTo(that.item7_5))
		return false;
	}
	if (this.item7_6 != null && that.item7_6 != null) {
	    if (!this.item7_6.equalTo(that.item7_6))
		return false;
	}
	if (this.item7_7 != null && that.item7_7 != null) {
	    if (!this.item7_7.equalTo(that.item7_7))
		return false;
	}
	if (this.item7_8 != null && that.item7_8 != null) {
	    if (!this.item7_8.equalTo(that.item7_8))
		return false;
	}
	if (this.item7_9 != null && that.item7_9 != null) {
	    if (!this.item7_9.equalTo(that.item7_9))
		return false;
	}
	if (this.item7_10 != null && that.item7_10 != null) {
	    if (!this.item7_10.equalTo(that.item7_10))
		return false;
	}
	if (this.item7_11 != null && that.item7_11 != null) {
	    if (!this.item7_11.equalTo(that.item7_11))
		return false;
	}
	if (this.item7_12 != null && that.item7_12 != null) {
	    if (!this.item7_12.equalTo(that.item7_12))
		return false;
	}
	if (this.item7_13 != null && that.item7_13 != null) {
	    if (!this.item7_13.equalTo(that.item7_13))
		return false;
	}
	if (this.item7_14 != null && that.item7_14 != null) {
	    if (!this.item7_14.equalTo(that.item7_14))
		return false;
	}
	if (this.item7_15 != null && that.item7_15 != null) {
	    if (!this.item7_15.equalTo(that.item7_15))
		return false;
	}
	if (this.item7_16 != null && that.item7_16 != null) {
	    if (!this.item7_16.equalTo(that.item7_16))
		return false;
	}
	if (this.item7_17 != null && that.item7_17 != null) {
	    if (!this.item7_17.equalTo(that.item7_17))
		return false;
	}
	if (this.item7_18 != null && that.item7_18 != null) {
	    if (!this.item7_18.equalTo(that.item7_18))
		return false;
	}
	if (this.item7_19 != null && that.item7_19 != null) {
	    if (!this.item7_19.equalTo(that.item7_19))
		return false;
	}
	if (this.item7_20 != null && that.item7_20 != null) {
	    if (!this.item7_20.equalTo(that.item7_20))
		return false;
	}
	if (this.item7_21 != null && that.item7_21 != null) {
	    if (!this.item7_21.equalTo(that.item7_21))
		return false;
	}
	if (this.item7_22 != null && that.item7_22 != null) {
	    if (!this.item7_22.equalTo(that.item7_22))
		return false;
	}
	if (this.item7_23 != null && that.item7_23 != null) {
	    if (!this.item7_23.equalTo(that.item7_23))
		return false;
	}
	if (this.item7_24 != null && that.item7_24 != null) {
	    if (!this.item7_24.equalTo(that.item7_24))
		return false;
	}
	if (this.item7_25 != null && that.item7_25 != null) {
	    if (!this.item7_25.equalTo(that.item7_25))
		return false;
	}
	if (this.item7_26 != null && that.item7_26 != null) {
	    if (!this.item7_26.equalTo(that.item7_26))
		return false;
	}
	if (this.item7_27 != null && that.item7_27 != null) {
	    if (!this.item7_27.equalTo(that.item7_27))
		return false;
	}
	if (this.item7_28 != null && that.item7_28 != null) {
	    if (!this.item7_28.equalTo(that.item7_28))
		return false;
	}
	if (this.item7_29 != null && that.item7_29 != null) {
	    if (!this.item7_29.equalTo(that.item7_29))
		return false;
	}
	if (this.item7_30 != null && that.item7_30 != null) {
	    if (!this.item7_30.equalTo(that.item7_30))
		return false;
	}
	if (this.item7_31 != null && that.item7_31 != null) {
	    if (!this.item7_31.equalTo(that.item7_31))
		return false;
	}
	if (this.item7_32 != null && that.item7_32 != null) {
	    if (!this.item7_32.equalTo(that.item7_32))
		return false;
	}
	if (this.item7_33 != null && that.item7_33 != null) {
	    if (!this.item7_33.equalTo(that.item7_33))
		return false;
	}
	if (this.item7_34 != null && that.item7_34 != null) {
	    if (!this.item7_34.equalTo(that.item7_34))
		return false;
	}
	if (this.item7_35 != null && that.item7_35 != null) {
	    if (!this.item7_35.equalTo(that.item7_35))
		return false;
	}
	if (this.item7_36 != null && that.item7_36 != null) {
	    if (!this.item7_36.equalTo(that.item7_36))
		return false;
	}
	if (this.item7_37 != null && that.item7_37 != null) {
	    if (!this.item7_37.equalTo(that.item7_37))
		return false;
	}
	if (this.item7_38 != null && that.item7_38 != null) {
	    if (!this.item7_38.equalTo(that.item7_38))
		return false;
	}
	if (this.item7_39 != null && that.item7_39 != null) {
	    if (!this.item7_39.equalTo(that.item7_39))
		return false;
	}
	if (this.item7_40 != null && that.item7_40 != null) {
	    if (!this.item7_40.equalTo(that.item7_40))
		return false;
	}
	if (this.item7_41 != null && that.item7_41 != null) {
	    if (!this.item7_41.equalTo(that.item7_41))
		return false;
	}
	if (this.item7_42 != null && that.item7_42 != null) {
	    if (!this.item7_42.equalTo(that.item7_42))
		return false;
	}
	if (this.item7_43 != null && that.item7_43 != null) {
	    if (!this.item7_43.equalTo(that.item7_43))
		return false;
	}
	if (this.item7_44 != null && that.item7_44 != null) {
	    if (!this.item7_44.equalTo(that.item7_44))
		return false;
	}
	if (this.item7_45 != null && that.item7_45 != null) {
	    if (!this.item7_45.equalTo(that.item7_45))
		return false;
	}
	if (this.item7_46 != null && that.item7_46 != null) {
	    if (!this.item7_46.equalTo(that.item7_46))
		return false;
	}
	if (this.item7_47 != null && that.item7_47 != null) {
	    if (!this.item7_47.equalTo(that.item7_47))
		return false;
	}
	if (this.item7_48 != null && that.item7_48 != null) {
	    if (!this.item7_48.equalTo(that.item7_48))
		return false;
	}
	if (this.item7_49 != null && that.item7_49 != null) {
	    if (!this.item7_49.equalTo(that.item7_49))
		return false;
	}
	if (this.item7_50 != null && that.item7_50 != null) {
	    if (!this.item7_50.equalTo(that.item7_50))
		return false;
	}
	if (this.item7_51 != null && that.item7_51 != null) {
	    if (!this.item7_51.equalTo(that.item7_51))
		return false;
	}
	if (this.item7_52 != null && that.item7_52 != null) {
	    if (!this.item7_52.equalTo(that.item7_52))
		return false;
	}
	if (this.item7_53 != null && that.item7_53 != null) {
	    if (!this.item7_53.equalTo(that.item7_53))
		return false;
	}
	if (this.item7_54 != null && that.item7_54 != null) {
	    if (!this.item7_54.equalTo(that.item7_54))
		return false;
	}
	if (this.item7_55 != null && that.item7_55 != null) {
	    if (!this.item7_55.equalTo(that.item7_55))
		return false;
	}
	if (this.item7_56 != null && that.item7_56 != null) {
	    if (!this.item7_56.equalTo(that.item7_56))
		return false;
	}
	if (this.item7_57 != null && that.item7_57 != null) {
	    if (!this.item7_57.equalTo(that.item7_57))
		return false;
	}
	if (this.item7_58 != null && that.item7_58 != null) {
	    if (!this.item7_58.equalTo(that.item7_58))
		return false;
	}
	if (this.item7_59 != null && that.item7_59 != null) {
	    if (!this.item7_59.equalTo(that.item7_59))
		return false;
	}
	if (this.item7_60 != null && that.item7_60 != null) {
	    if (!this.item7_60.equalTo(that.item7_60))
		return false;
	}
	if (this.item7_61 != null && that.item7_61 != null) {
	    if (!this.item7_61.equalTo(that.item7_61))
		return false;
	}
	if (this.item7_62 != null && that.item7_62 != null) {
	    if (!this.item7_62.equalTo(that.item7_62))
		return false;
	}
	if (this.item7_63 != null && that.item7_63 != null) {
	    if (!this.item7_63.equalTo(that.item7_63))
		return false;
	}
	if (this.item7_64 != null && that.item7_64 != null) {
	    if (!this.item7_64.equalTo(that.item7_64))
		return false;
	}
	if (this.item7_65 != null && that.item7_65 != null) {
	    if (!this.item7_65.equalTo(that.item7_65))
		return false;
	}
	if (this.item7_66 != null && that.item7_66 != null) {
	    if (!this.item7_66.equalTo(that.item7_66))
		return false;
	}
	if (this.item7_67 != null && that.item7_67 != null) {
	    if (!this.item7_67.equalTo(that.item7_67))
		return false;
	}
	if (this.item7_68 != null && that.item7_68 != null) {
	    if (!this.item7_68.equalTo(that.item7_68))
		return false;
	}
	if (this.item7_69 != null && that.item7_69 != null) {
	    if (!this.item7_69.equalTo(that.item7_69))
		return false;
	}
	if (this.item7_70 != null && that.item7_70 != null) {
	    if (!this.item7_70.equalTo(that.item7_70))
		return false;
	}
	if (this.item7_71 != null && that.item7_71 != null) {
	    if (!this.item7_71.equalTo(that.item7_71))
		return false;
	}
	if (this.item7_72 != null && that.item7_72 != null) {
	    if (!this.item7_72.equalTo(that.item7_72))
		return false;
	}
	if (this.item7_73 != null && that.item7_73 != null) {
	    if (!this.item7_73.equalTo(that.item7_73))
		return false;
	}
	if (this.item7_74 != null && that.item7_74 != null) {
	    if (!this.item7_74.equalTo(that.item7_74))
		return false;
	}
	if (this.item7_75 != null && that.item7_75 != null) {
	    if (!this.item7_75.equalTo(that.item7_75))
		return false;
	}
	if (this.item7_76 != null && that.item7_76 != null) {
	    if (!this.item7_76.equalTo(that.item7_76))
		return false;
	}
	if (this.item7_77 != null && that.item7_77 != null) {
	    if (!this.item7_77.equalTo(that.item7_77))
		return false;
	}
	if (this.item7_78 != null && that.item7_78 != null) {
	    if (!this.item7_78.equalTo(that.item7_78))
		return false;
	}
	if (this.item7_79 != null && that.item7_79 != null) {
	    if (!this.item7_79.equalTo(that.item7_79))
		return false;
	}
	if (this.item7_80 != null && that.item7_80 != null) {
	    if (!this.item7_80.equalTo(that.item7_80))
		return false;
	}
	if (this.item7_81 != null && that.item7_81 != null) {
	    if (!this.item7_81.equalTo(that.item7_81))
		return false;
	}
	if (this.item7_82 != null && that.item7_82 != null) {
	    if (!this.item7_82.equalTo(that.item7_82))
		return false;
	}
	if (this.item7_83 != null && that.item7_83 != null) {
	    if (!this.item7_83.equalTo(that.item7_83))
		return false;
	}
	if (this.item7_84 != null && that.item7_84 != null) {
	    if (!this.item7_84.equalTo(that.item7_84))
		return false;
	}
	if (this.item7_85 != null && that.item7_85 != null) {
	    if (!this.item7_85.equalTo(that.item7_85))
		return false;
	}
	if (this.item7_86 != null && that.item7_86 != null) {
	    if (!this.item7_86.equalTo(that.item7_86))
		return false;
	}
	if (this.item7_87 != null && that.item7_87 != null) {
	    if (!this.item7_87.equalTo(that.item7_87))
		return false;
	}
	if (this.item7_88 != null && that.item7_88 != null) {
	    if (!this.item7_88.equalTo(that.item7_88))
		return false;
	}
	if (this.item7_89 != null && that.item7_89 != null) {
	    if (!this.item7_89.equalTo(that.item7_89))
		return false;
	}
	if (this.item7_90 != null && that.item7_90 != null) {
	    if (!this.item7_90.equalTo(that.item7_90))
		return false;
	}
	if (this.item7_91 != null && that.item7_91 != null) {
	    if (!this.item7_91.equalTo(that.item7_91))
		return false;
	}
	if (this.item7_92 != null && that.item7_92 != null) {
	    if (!this.item7_92.equalTo(that.item7_92))
		return false;
	}
	if (this.item7_93 != null && that.item7_93 != null) {
	    if (!this.item7_93.equalTo(that.item7_93))
		return false;
	}
	if (this.item7_94 != null && that.item7_94 != null) {
	    if (!this.item7_94.equalTo(that.item7_94))
		return false;
	}
	if (this.item7_95 != null && that.item7_95 != null) {
	    if (!this.item7_95.equalTo(that.item7_95))
		return false;
	}
	if (this.item7_96 != null && that.item7_96 != null) {
	    if (!this.item7_96.equalTo(that.item7_96))
		return false;
	}
	if (this.item7_97 != null && that.item7_97 != null) {
	    if (!this.item7_97.equalTo(that.item7_97))
		return false;
	}
	if (this.item7_98 != null && that.item7_98 != null) {
	    if (!this.item7_98.equalTo(that.item7_98))
		return false;
	}
	if (this.item7_99 != null && that.item7_99 != null) {
	    if (!this.item7_99.equalTo(that.item7_99))
		return false;
	}
	if (this.item7_100 != null && that.item7_100 != null) {
	    if (!this.item7_100.equalTo(that.item7_100))
		return false;
	}
	if (this.item7_101 != null && that.item7_101 != null) {
	    if (!this.item7_101.equalTo(that.item7_101))
		return false;
	}
	if (this.item7_102 != null && that.item7_102 != null) {
	    if (!this.item7_102.equalTo(that.item7_102))
		return false;
	}
	if (this.item7_103 != null && that.item7_103 != null) {
	    if (!this.item7_103.equalTo(that.item7_103))
		return false;
	}
	if (this.item7_104 != null && that.item7_104 != null) {
	    if (!this.item7_104.equalTo(that.item7_104))
		return false;
	}
	if (this.item7_105 != null && that.item7_105 != null) {
	    if (!this.item7_105.equalTo(that.item7_105))
		return false;
	}
	if (this.item7_106 != null && that.item7_106 != null) {
	    if (!this.item7_106.equalTo(that.item7_106))
		return false;
	}
	if (this.item7_107 != null && that.item7_107 != null) {
	    if (!this.item7_107.equalTo(that.item7_107))
		return false;
	}
	if (this.item7_108 != null && that.item7_108 != null) {
	    if (!this.item7_108.equalTo(that.item7_108))
		return false;
	}
	if (this.item7_109 != null && that.item7_109 != null) {
	    if (!this.item7_109.equalTo(that.item7_109))
		return false;
	}
	if (this.item7_110 != null && that.item7_110 != null) {
	    if (!this.item7_110.equalTo(that.item7_110))
		return false;
	}
	if (this.item7_111 != null && that.item7_111 != null) {
	    if (!this.item7_111.equalTo(that.item7_111))
		return false;
	}
	if (this.item7_112 != null && that.item7_112 != null) {
	    if (!this.item7_112.equalTo(that.item7_112))
		return false;
	}
	if (this.item7_113 != null && that.item7_113 != null) {
	    if (!this.item7_113.equalTo(that.item7_113))
		return false;
	}
	if (this.item7_114 != null && that.item7_114 != null) {
	    if (!this.item7_114.equalTo(that.item7_114))
		return false;
	}
	if (this.item7_115 != null && that.item7_115 != null) {
	    if (!this.item7_115.equalTo(that.item7_115))
		return false;
	}
	if (this.item7_116 != null && that.item7_116 != null) {
	    if (!this.item7_116.equalTo(that.item7_116))
		return false;
	}
	if (this.item7_117 != null && that.item7_117 != null) {
	    if (!this.item7_117.equalTo(that.item7_117))
		return false;
	}
	if (this.item7_118 != null && that.item7_118 != null) {
	    if (!this.item7_118.equalTo(that.item7_118))
		return false;
	}
	if (this.item7_119 != null && that.item7_119 != null) {
	    if (!this.item7_119.equalTo(that.item7_119))
		return false;
	}
	if (this.item7_120 != null && that.item7_120 != null) {
	    if (!this.item7_120.equalTo(that.item7_120))
		return false;
	}
	if (this.item7_121 != null && that.item7_121 != null) {
	    if (!this.item7_121.equalTo(that.item7_121))
		return false;
	}
	if (this.item7_122 != null && that.item7_122 != null) {
	    if (!this.item7_122.equalTo(that.item7_122))
		return false;
	}
	if (this.item7_123 != null && that.item7_123 != null) {
	    if (!this.item7_123.equalTo(that.item7_123))
		return false;
	}
	if (this.item7_124 != null && that.item7_124 != null) {
	    if (!this.item7_124.equalTo(that.item7_124))
		return false;
	}
	if (this.item7_125 != null && that.item7_125 != null) {
	    if (!this.item7_125.equalTo(that.item7_125))
		return false;
	}
	if (this.item7_126 != null && that.item7_126 != null) {
	    if (!this.item7_126.equalTo(that.item7_126))
		return false;
	}
	if (this.item7_127 != null && that.item7_127 != null) {
	    if (!this.item7_127.equalTo(that.item7_127))
		return false;
	}
	if (this.item7_128 != null && that.item7_128 != null) {
	    if (!this.item7_128.equalTo(that.item7_128))
		return false;
	}
	if (this.item7_129 != null && that.item7_129 != null) {
	    if (!this.item7_129.equalTo(that.item7_129))
		return false;
	}
	if (this.item7_130 != null && that.item7_130 != null) {
	    if (!this.item7_130.equalTo(that.item7_130))
		return false;
	}
	if (this.item7_131 != null && that.item7_131 != null) {
	    if (!this.item7_131.equalTo(that.item7_131))
		return false;
	}
	if (this.item7_132 != null && that.item7_132 != null) {
	    if (!this.item7_132.equalTo(that.item7_132))
		return false;
	}
	if (this.item7_133 != null && that.item7_133 != null) {
	    if (!this.item7_133.equalTo(that.item7_133))
		return false;
	}
	if (this.item7_134 != null && that.item7_134 != null) {
	    if (!this.item7_134.equalTo(that.item7_134))
		return false;
	}
	if (this.item7_135 != null && that.item7_135 != null) {
	    if (!this.item7_135.equalTo(that.item7_135))
		return false;
	}
	if (this.item7_136 != null && that.item7_136 != null) {
	    if (!this.item7_136.equalTo(that.item7_136))
		return false;
	}
	if (this.item7_137 != null && that.item7_137 != null) {
	    if (!this.item7_137.equalTo(that.item7_137))
		return false;
	}
	if (this.item7_138 != null && that.item7_138 != null) {
	    if (!this.item7_138.equalTo(that.item7_138))
		return false;
	}
	if (this.item7_139 != null && that.item7_139 != null) {
	    if (!this.item7_139.equalTo(that.item7_139))
		return false;
	}
	if (this.item7_140 != null && that.item7_140 != null) {
	    if (!this.item7_140.equalTo(that.item7_140))
		return false;
	}
	if (this.item7_141 != null && that.item7_141 != null) {
	    if (!this.item7_141.equalTo(that.item7_141))
		return false;
	}
	if (this.item7_142 != null && that.item7_142 != null) {
	    if (!this.item7_142.equalTo(that.item7_142))
		return false;
	}
	if (this.item7_143 != null && that.item7_143 != null) {
	    if (!this.item7_143.equalTo(that.item7_143))
		return false;
	}
	if (this.item7_144 != null && that.item7_144 != null) {
	    if (!this.item7_144.equalTo(that.item7_144))
		return false;
	}
	if (this.item7_145 != null && that.item7_145 != null) {
	    if (!this.item7_145.equalTo(that.item7_145))
		return false;
	}
	if (this.item7_146 != null && that.item7_146 != null) {
	    if (!this.item7_146.equalTo(that.item7_146))
		return false;
	}
	if (this.item7_147 != null && that.item7_147 != null) {
	    if (!this.item7_147.equalTo(that.item7_147))
		return false;
	}
	if (this.item7_148 != null && that.item7_148 != null) {
	    if (!this.item7_148.equalTo(that.item7_148))
		return false;
	}
	if (this.item7_149 != null && that.item7_149 != null) {
	    if (!this.item7_149.equalTo(that.item7_149))
		return false;
	}
	if (this.item8_1 != null && that.item8_1 != null) {
	    if (!this.item8_1.equalTo(that.item8_1))
		return false;
	}
	if (this.item8_2 != null && that.item8_2 != null) {
	    if (!this.item8_2.equalTo(that.item8_2))
		return false;
	}
	if (this.item8_3 != null && that.item8_3 != null) {
	    if (!this.item8_3.equalTo(that.item8_3))
		return false;
	}
	if (this.item8_4 != null && that.item8_4 != null) {
	    if (!this.item8_4.equalTo(that.item8_4))
		return false;
	}
	if (this.item8_5 != null && that.item8_5 != null) {
	    if (!this.item8_5.equalTo(that.item8_5))
		return false;
	}
	if (this.item8_6 != null && that.item8_6 != null) {
	    if (!this.item8_6.equalTo(that.item8_6))
		return false;
	}
	if (this.item8_7 != null && that.item8_7 != null) {
	    if (!this.item8_7.equalTo(that.item8_7))
		return false;
	}
	if (this.item8_8 != null && that.item8_8 != null) {
	    if (!this.item8_8.equalTo(that.item8_8))
		return false;
	}
	if (this.item8_9 != null && that.item8_9 != null) {
	    if (!this.item8_9.equalTo(that.item8_9))
		return false;
	}
	if (this.item8_10 != null && that.item8_10 != null) {
	    if (!this.item8_10.equalTo(that.item8_10))
		return false;
	}
	if (this.item8_11 != null && that.item8_11 != null) {
	    if (!this.item8_11.equalTo(that.item8_11))
		return false;
	}
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public AllInclusive clone() {
	AllInclusive copy = (AllInclusive)super.clone();
	if (item6_1 != null) {
	    copy.item6_1 = item6_1.clone();
	}
	if (item6_2 != null) {
	    copy.item6_2 = item6_2.clone();
	}
	if (item6_4 != null) {
	    copy.item6_4 = item6_4.clone();
	}
	if (item6_5 != null) {
	    copy.item6_5 = item6_5.clone();
	}
	if (item6_6 != null) {
	    copy.item6_6 = item6_6.clone();
	}
	if (item6_7 != null) {
	    copy.item6_7 = item6_7.clone();
	}
	if (item6_8 != null) {
	    copy.item6_8 = item6_8.clone();
	}
	if (item6_9 != null) {
	    copy.item6_9 = item6_9.clone();
	}
	if (item6_10 != null) {
	    copy.item6_10 = item6_10.clone();
	}
	if (item6_11 != null) {
	    copy.item6_11 = item6_11.clone();
	}
	if (item6_12 != null) {
	    copy.item6_12 = item6_12.clone();
	}
	if (item6_13 != null) {
	    copy.item6_13 = item6_13.clone();
	}
	if (item6_14 != null) {
	    copy.item6_14 = item6_14.clone();
	}
	if (item6_15 != null) {
	    copy.item6_15 = item6_15.clone();
	}
	if (item6_16 != null) {
	    copy.item6_16 = item6_16.clone();
	}
	if (item6_17 != null) {
	    copy.item6_17 = item6_17.clone();
	}
	if (item6_18 != null) {
	    copy.item6_18 = item6_18.clone();
	}
	if (item6_19 != null) {
	    copy.item6_19 = item6_19.clone();
	}
	if (item6_20 != null) {
	    copy.item6_20 = item6_20.clone();
	}
	if (item6_21 != null) {
	    copy.item6_21 = item6_21.clone();
	}
	if (item6_22 != null) {
	    copy.item6_22 = item6_22.clone();
	}
	if (item6_23 != null) {
	    copy.item6_23 = item6_23.clone();
	}
	if (item6_24 != null) {
	    copy.item6_24 = item6_24.clone();
	}
	if (item6_25 != null) {
	    copy.item6_25 = item6_25.clone();
	}
	if (item6_26 != null) {
	    copy.item6_26 = item6_26.clone();
	}
	if (item6_27 != null) {
	    copy.item6_27 = item6_27.clone();
	}
	if (item6_28 != null) {
	    copy.item6_28 = item6_28.clone();
	}
	if (item6_29 != null) {
	    copy.item6_29 = item6_29.clone();
	}
	if (item6_30 != null) {
	    copy.item6_30 = item6_30.clone();
	}
	if (item6_31 != null) {
	    copy.item6_31 = item6_31.clone();
	}
	if (item6_32 != null) {
	    copy.item6_32 = item6_32.clone();
	}
	if (item6_33 != null) {
	    copy.item6_33 = item6_33.clone();
	}
	if (item6_34 != null) {
	    copy.item6_34 = item6_34.clone();
	}
	if (item6_35 != null) {
	    copy.item6_35 = item6_35.clone();
	}
	if (item6_36 != null) {
	    copy.item6_36 = item6_36.clone();
	}
	if (item6_37 != null) {
	    copy.item6_37 = item6_37.clone();
	}
	if (item6_38 != null) {
	    copy.item6_38 = item6_38.clone();
	}
	if (item6_39 != null) {
	    copy.item6_39 = item6_39.clone();
	}
	if (item6_40 != null) {
	    copy.item6_40 = item6_40.clone();
	}
	if (item6_41 != null) {
	    copy.item6_41 = item6_41.clone();
	}
	if (item6_42 != null) {
	    copy.item6_42 = item6_42.clone();
	}
	if (item6_43 != null) {
	    copy.item6_43 = item6_43.clone();
	}
	if (item6_44 != null) {
	    copy.item6_44 = item6_44.clone();
	}
	if (item6_45 != null) {
	    copy.item6_45 = item6_45.clone();
	}
	if (item6_46 != null) {
	    copy.item6_46 = item6_46.clone();
	}
	if (item6_47 != null) {
	    copy.item6_47 = item6_47.clone();
	}
	if (item6_48 != null) {
	    copy.item6_48 = item6_48.clone();
	}
	if (item6_49 != null) {
	    copy.item6_49 = item6_49.clone();
	}
	if (item6_50 != null) {
	    copy.item6_50 = item6_50.clone();
	}
	if (item6_51 != null) {
	    copy.item6_51 = item6_51.clone();
	}
	if (item6_52 != null) {
	    copy.item6_52 = item6_52.clone();
	}
	if (item6_53 != null) {
	    copy.item6_53 = item6_53.clone();
	}
	if (item6_54 != null) {
	    copy.item6_54 = item6_54.clone();
	}
	if (item6_55 != null) {
	    copy.item6_55 = item6_55.clone();
	}
	if (item6_56 != null) {
	    copy.item6_56 = item6_56.clone();
	}
	if (item6_57 != null) {
	    copy.item6_57 = item6_57.clone();
	}
	if (item6_58 != null) {
	    copy.item6_58 = item6_58.clone();
	}
	if (item6_59 != null) {
	    copy.item6_59 = item6_59.clone();
	}
	if (item6_60 != null) {
	    copy.item6_60 = item6_60.clone();
	}
	if (item6_61 != null) {
	    copy.item6_61 = item6_61.clone();
	}
	if (item6_62 != null) {
	    copy.item6_62 = item6_62.clone();
	}
	if (item6_63 != null) {
	    copy.item6_63 = item6_63.clone();
	}
	if (item6_64 != null) {
	    copy.item6_64 = item6_64.clone();
	}
	if (item6_65 != null) {
	    copy.item6_65 = item6_65.clone();
	}
	if (item6_66 != null) {
	    copy.item6_66 = item6_66.clone();
	}
	if (item6_67 != null) {
	    copy.item6_67 = item6_67.clone();
	}
	if (item6_68 != null) {
	    copy.item6_68 = item6_68.clone();
	}
	if (item6_69 != null) {
	    copy.item6_69 = item6_69.clone();
	}
	if (item6_70 != null) {
	    copy.item6_70 = item6_70.clone();
	}
	if (item6_71 != null) {
	    copy.item6_71 = item6_71.clone();
	}
	if (item6_72 != null) {
	    copy.item6_72 = item6_72.clone();
	}
	if (item6_73 != null) {
	    copy.item6_73 = item6_73.clone();
	}
	if (item7_1 != null) {
	    copy.item7_1 = item7_1.clone();
	}
	if (item7_2 != null) {
	    copy.item7_2 = item7_2.clone();
	}
	if (item7_3 != null) {
	    copy.item7_3 = item7_3.clone();
	}
	if (item7_4 != null) {
	    copy.item7_4 = item7_4.clone();
	}
	if (item7_5 != null) {
	    copy.item7_5 = item7_5.clone();
	}
	if (item7_6 != null) {
	    copy.item7_6 = item7_6.clone();
	}
	if (item7_7 != null) {
	    copy.item7_7 = item7_7.clone();
	}
	if (item7_8 != null) {
	    copy.item7_8 = item7_8.clone();
	}
	if (item7_9 != null) {
	    copy.item7_9 = item7_9.clone();
	}
	if (item7_10 != null) {
	    copy.item7_10 = item7_10.clone();
	}
	if (item7_11 != null) {
	    copy.item7_11 = item7_11.clone();
	}
	if (item7_12 != null) {
	    copy.item7_12 = item7_12.clone();
	}
	if (item7_13 != null) {
	    copy.item7_13 = item7_13.clone();
	}
	if (item7_14 != null) {
	    copy.item7_14 = item7_14.clone();
	}
	if (item7_15 != null) {
	    copy.item7_15 = item7_15.clone();
	}
	if (item7_16 != null) {
	    copy.item7_16 = item7_16.clone();
	}
	if (item7_17 != null) {
	    copy.item7_17 = item7_17.clone();
	}
	if (item7_18 != null) {
	    copy.item7_18 = item7_18.clone();
	}
	if (item7_19 != null) {
	    copy.item7_19 = item7_19.clone();
	}
	if (item7_20 != null) {
	    copy.item7_20 = item7_20.clone();
	}
	if (item7_21 != null) {
	    copy.item7_21 = item7_21.clone();
	}
	if (item7_22 != null) {
	    copy.item7_22 = item7_22.clone();
	}
	if (item7_23 != null) {
	    copy.item7_23 = item7_23.clone();
	}
	if (item7_24 != null) {
	    copy.item7_24 = item7_24.clone();
	}
	if (item7_25 != null) {
	    copy.item7_25 = item7_25.clone();
	}
	if (item7_26 != null) {
	    copy.item7_26 = item7_26.clone();
	}
	if (item7_27 != null) {
	    copy.item7_27 = item7_27.clone();
	}
	if (item7_28 != null) {
	    copy.item7_28 = item7_28.clone();
	}
	if (item7_29 != null) {
	    copy.item7_29 = item7_29.clone();
	}
	if (item7_30 != null) {
	    copy.item7_30 = item7_30.clone();
	}
	if (item7_31 != null) {
	    copy.item7_31 = item7_31.clone();
	}
	if (item7_32 != null) {
	    copy.item7_32 = item7_32.clone();
	}
	if (item7_33 != null) {
	    copy.item7_33 = item7_33.clone();
	}
	if (item7_34 != null) {
	    copy.item7_34 = item7_34.clone();
	}
	if (item7_35 != null) {
	    copy.item7_35 = item7_35.clone();
	}
	if (item7_36 != null) {
	    copy.item7_36 = item7_36.clone();
	}
	if (item7_37 != null) {
	    copy.item7_37 = item7_37.clone();
	}
	if (item7_38 != null) {
	    copy.item7_38 = item7_38.clone();
	}
	if (item7_39 != null) {
	    copy.item7_39 = item7_39.clone();
	}
	if (item7_40 != null) {
	    copy.item7_40 = item7_40.clone();
	}
	if (item7_41 != null) {
	    copy.item7_41 = item7_41.clone();
	}
	if (item7_42 != null) {
	    copy.item7_42 = item7_42.clone();
	}
	if (item7_43 != null) {
	    copy.item7_43 = item7_43.clone();
	}
	if (item7_44 != null) {
	    copy.item7_44 = item7_44.clone();
	}
	if (item7_45 != null) {
	    copy.item7_45 = item7_45.clone();
	}
	if (item7_46 != null) {
	    copy.item7_46 = item7_46.clone();
	}
	if (item7_47 != null) {
	    copy.item7_47 = item7_47.clone();
	}
	if (item7_48 != null) {
	    copy.item7_48 = item7_48.clone();
	}
	if (item7_49 != null) {
	    copy.item7_49 = item7_49.clone();
	}
	if (item7_50 != null) {
	    copy.item7_50 = item7_50.clone();
	}
	if (item7_51 != null) {
	    copy.item7_51 = item7_51.clone();
	}
	if (item7_52 != null) {
	    copy.item7_52 = item7_52.clone();
	}
	if (item7_53 != null) {
	    copy.item7_53 = item7_53.clone();
	}
	if (item7_54 != null) {
	    copy.item7_54 = item7_54.clone();
	}
	if (item7_55 != null) {
	    copy.item7_55 = item7_55.clone();
	}
	if (item7_56 != null) {
	    copy.item7_56 = item7_56.clone();
	}
	if (item7_57 != null) {
	    copy.item7_57 = item7_57.clone();
	}
	if (item7_58 != null) {
	    copy.item7_58 = item7_58.clone();
	}
	if (item7_59 != null) {
	    copy.item7_59 = item7_59.clone();
	}
	if (item7_60 != null) {
	    copy.item7_60 = item7_60.clone();
	}
	if (item7_61 != null) {
	    copy.item7_61 = item7_61.clone();
	}
	if (item7_62 != null) {
	    copy.item7_62 = item7_62.clone();
	}
	if (item7_63 != null) {
	    copy.item7_63 = item7_63.clone();
	}
	if (item7_64 != null) {
	    copy.item7_64 = item7_64.clone();
	}
	if (item7_65 != null) {
	    copy.item7_65 = item7_65.clone();
	}
	if (item7_66 != null) {
	    copy.item7_66 = item7_66.clone();
	}
	if (item7_67 != null) {
	    copy.item7_67 = item7_67.clone();
	}
	if (item7_68 != null) {
	    copy.item7_68 = item7_68.clone();
	}
	if (item7_69 != null) {
	    copy.item7_69 = item7_69.clone();
	}
	if (item7_70 != null) {
	    copy.item7_70 = item7_70.clone();
	}
	if (item7_71 != null) {
	    copy.item7_71 = item7_71.clone();
	}
	if (item7_72 != null) {
	    copy.item7_72 = item7_72.clone();
	}
	if (item7_73 != null) {
	    copy.item7_73 = item7_73.clone();
	}
	if (item7_74 != null) {
	    copy.item7_74 = item7_74.clone();
	}
	if (item7_75 != null) {
	    copy.item7_75 = item7_75.clone();
	}
	if (item7_76 != null) {
	    copy.item7_76 = item7_76.clone();
	}
	if (item7_77 != null) {
	    copy.item7_77 = item7_77.clone();
	}
	if (item7_78 != null) {
	    copy.item7_78 = item7_78.clone();
	}
	if (item7_79 != null) {
	    copy.item7_79 = item7_79.clone();
	}
	if (item7_80 != null) {
	    copy.item7_80 = item7_80.clone();
	}
	if (item7_81 != null) {
	    copy.item7_81 = item7_81.clone();
	}
	if (item7_82 != null) {
	    copy.item7_82 = item7_82.clone();
	}
	if (item7_83 != null) {
	    copy.item7_83 = item7_83.clone();
	}
	if (item7_84 != null) {
	    copy.item7_84 = item7_84.clone();
	}
	if (item7_85 != null) {
	    copy.item7_85 = item7_85.clone();
	}
	if (item7_86 != null) {
	    copy.item7_86 = item7_86.clone();
	}
	if (item7_87 != null) {
	    copy.item7_87 = item7_87.clone();
	}
	if (item7_88 != null) {
	    copy.item7_88 = item7_88.clone();
	}
	if (item7_89 != null) {
	    copy.item7_89 = item7_89.clone();
	}
	if (item7_90 != null) {
	    copy.item7_90 = item7_90.clone();
	}
	if (item7_91 != null) {
	    copy.item7_91 = item7_91.clone();
	}
	if (item7_92 != null) {
	    copy.item7_92 = item7_92.clone();
	}
	if (item7_93 != null) {
	    copy.item7_93 = item7_93.clone();
	}
	if (item7_94 != null) {
	    copy.item7_94 = item7_94.clone();
	}
	if (item7_95 != null) {
	    copy.item7_95 = item7_95.clone();
	}
	if (item7_96 != null) {
	    copy.item7_96 = item7_96.clone();
	}
	if (item7_97 != null) {
	    copy.item7_97 = item7_97.clone();
	}
	if (item7_98 != null) {
	    copy.item7_98 = item7_98.clone();
	}
	if (item7_99 != null) {
	    copy.item7_99 = item7_99.clone();
	}
	if (item7_100 != null) {
	    copy.item7_100 = item7_100.clone();
	}
	if (item7_101 != null) {
	    copy.item7_101 = item7_101.clone();
	}
	if (item7_102 != null) {
	    copy.item7_102 = item7_102.clone();
	}
	if (item7_103 != null) {
	    copy.item7_103 = item7_103.clone();
	}
	if (item7_104 != null) {
	    copy.item7_104 = item7_104.clone();
	}
	if (item7_105 != null) {
	    copy.item7_105 = item7_105.clone();
	}
	if (item7_106 != null) {
	    copy.item7_106 = item7_106.clone();
	}
	if (item7_107 != null) {
	    copy.item7_107 = item7_107.clone();
	}
	if (item7_108 != null) {
	    copy.item7_108 = item7_108.clone();
	}
	if (item7_109 != null) {
	    copy.item7_109 = item7_109.clone();
	}
	if (item7_110 != null) {
	    copy.item7_110 = item7_110.clone();
	}
	if (item7_111 != null) {
	    copy.item7_111 = item7_111.clone();
	}
	if (item7_112 != null) {
	    copy.item7_112 = item7_112.clone();
	}
	if (item7_113 != null) {
	    copy.item7_113 = item7_113.clone();
	}
	if (item7_114 != null) {
	    copy.item7_114 = item7_114.clone();
	}
	if (item7_115 != null) {
	    copy.item7_115 = item7_115.clone();
	}
	if (item7_116 != null) {
	    copy.item7_116 = item7_116.clone();
	}
	if (item7_117 != null) {
	    copy.item7_117 = item7_117.clone();
	}
	if (item7_118 != null) {
	    copy.item7_118 = item7_118.clone();
	}
	if (item7_119 != null) {
	    copy.item7_119 = item7_119.clone();
	}
	if (item7_120 != null) {
	    copy.item7_120 = item7_120.clone();
	}
	if (item7_121 != null) {
	    copy.item7_121 = item7_121.clone();
	}
	if (item7_122 != null) {
	    copy.item7_122 = item7_122.clone();
	}
	if (item7_123 != null) {
	    copy.item7_123 = item7_123.clone();
	}
	if (item7_124 != null) {
	    copy.item7_124 = item7_124.clone();
	}
	if (item7_125 != null) {
	    copy.item7_125 = item7_125.clone();
	}
	if (item7_126 != null) {
	    copy.item7_126 = item7_126.clone();
	}
	if (item7_127 != null) {
	    copy.item7_127 = item7_127.clone();
	}
	if (item7_128 != null) {
	    copy.item7_128 = item7_128.clone();
	}
	if (item7_129 != null) {
	    copy.item7_129 = item7_129.clone();
	}
	if (item7_130 != null) {
	    copy.item7_130 = item7_130.clone();
	}
	if (item7_131 != null) {
	    copy.item7_131 = item7_131.clone();
	}
	if (item7_132 != null) {
	    copy.item7_132 = item7_132.clone();
	}
	if (item7_133 != null) {
	    copy.item7_133 = item7_133.clone();
	}
	if (item7_134 != null) {
	    copy.item7_134 = item7_134.clone();
	}
	if (item7_135 != null) {
	    copy.item7_135 = item7_135.clone();
	}
	if (item7_136 != null) {
	    copy.item7_136 = item7_136.clone();
	}
	if (item7_137 != null) {
	    copy.item7_137 = item7_137.clone();
	}
	if (item7_138 != null) {
	    copy.item7_138 = item7_138.clone();
	}
	if (item7_139 != null) {
	    copy.item7_139 = item7_139.clone();
	}
	if (item7_140 != null) {
	    copy.item7_140 = item7_140.clone();
	}
	if (item7_141 != null) {
	    copy.item7_141 = item7_141.clone();
	}
	if (item7_142 != null) {
	    copy.item7_142 = item7_142.clone();
	}
	if (item7_143 != null) {
	    copy.item7_143 = item7_143.clone();
	}
	if (item7_144 != null) {
	    copy.item7_144 = item7_144.clone();
	}
	if (item7_145 != null) {
	    copy.item7_145 = item7_145.clone();
	}
	if (item7_146 != null) {
	    copy.item7_146 = item7_146.clone();
	}
	if (item7_147 != null) {
	    copy.item7_147 = item7_147.clone();
	}
	if (item7_148 != null) {
	    copy.item7_148 = item7_148.clone();
	}
	if (item7_149 != null) {
	    copy.item7_149 = item7_149.clone();
	}
	if (item8_1 != null) {
	    copy.item8_1 = item8_1.clone();
	}
	if (item8_2 != null) {
	    copy.item8_2 = item8_2.clone();
	}
	if (item8_3 != null) {
	    copy.item8_3 = item8_3.clone();
	}
	if (item8_4 != null) {
	    copy.item8_4 = item8_4.clone();
	}
	if (item8_5 != null) {
	    copy.item8_5 = item8_5.clone();
	}
	if (item8_6 != null) {
	    copy.item8_6 = item8_6.clone();
	}
	if (item8_7 != null) {
	    copy.item8_7 = item8_7.clone();
	}
	if (item8_8 != null) {
	    copy.item8_8 = item8_8.clone();
	}
	if (item8_9 != null) {
	    copy.item8_9 = item8_9.clone();
	}
	if (item8_10 != null) {
	    copy.item8_10 = item8_10.clone();
	}
	if (item8_11 != null) {
	    copy.item8_11 = item8_11.clone();
	}
	return copy;
    }

} // End class definition for AllInclusive
