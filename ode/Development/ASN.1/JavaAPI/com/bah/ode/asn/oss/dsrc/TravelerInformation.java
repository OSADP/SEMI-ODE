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
 * Define the ASN1 Type TravelerInformation from ASN1 Module DSRC.
 * @see Sequence
 */

public class TravelerInformation extends Sequence implements BEREncodable, BERDecodable, DEREncodable, PEREncodable, PERDecodable {
    public DSRCmsgID msgID;
    public UniqueMSGID packetID;
    public URL_Base urlB;
    public Count dataFrameCount;
    public DataFrames dataFrames;
    public MsgCRC crc;
    
    /**
     * The default constructor.
     */
    public TravelerInformation()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TravelerInformation(DSRCmsgID msgID, UniqueMSGID packetID, 
		    URL_Base urlB, Count dataFrameCount, 
		    DataFrames dataFrames, MsgCRC crc)
    {
	setMsgID(msgID);
	setPacketID(packetID);
	setUrlB(urlB);
	setDataFrameCount(dataFrameCount);
	setDataFrames(dataFrames);
	setCrc(crc);
    }
    
    /**
     * Construct with required components.
     */
    public TravelerInformation(DSRCmsgID msgID, DataFrames dataFrames, 
		    MsgCRC crc)
    {
	setMsgID(msgID);
	setDataFrames(dataFrames);
	setCrc(crc);
    }
    
    
    // Methods for field "msgID"
    public DSRCmsgID getMsgID()
    {
	return this.msgID;
    }
    
    public void setMsgID(DSRCmsgID msgID)
    {
	this.msgID = msgID;
    }
    
    
    // Methods for field "packetID"
    public UniqueMSGID getPacketID()
    {
	return this.packetID;
    }
    
    public void setPacketID(UniqueMSGID packetID)
    {
	this.packetID = packetID;
    }
    
    public boolean hasPacketID()
    {
	return (packetID != null);
    }
    
    public void deletePacketID()
    {
	packetID = null;
    }
    
    
    // Methods for field "urlB"
    public URL_Base getUrlB()
    {
	return this.urlB;
    }
    
    public void setUrlB(URL_Base urlB)
    {
	this.urlB = urlB;
    }
    
    public boolean hasUrlB()
    {
	return (urlB != null);
    }
    
    public void deleteUrlB()
    {
	urlB = null;
    }
    
    
    // Methods for field "dataFrameCount"
    public Count getDataFrameCount()
    {
	return this.dataFrameCount;
    }
    
    public void setDataFrameCount(Count dataFrameCount)
    {
	this.dataFrameCount = dataFrameCount;
    }
    
    public boolean hasDataFrameCount()
    {
	return (dataFrameCount != null);
    }
    
    public void deleteDataFrameCount()
    {
	dataFrameCount = null;
    }
    
    
    // Methods for field "dataFrames"
    public DataFrames getDataFrames()
    {
	return this.dataFrames;
    }
    
    public void setDataFrames(DataFrames dataFrames)
    {
	this.dataFrames = dataFrames;
    }
    
    
    
    /**
     * Define the ASN1 Type DataFrames from ASN1 Module DSRC.
     * @see SequenceOf
     */
    public static class DataFrames extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public DataFrames()
	{
	    this.elements = new java.util.ArrayList<Sequence_>();
	}
	
	
	/**
	 * Construct from an array of components.
	 */
	public java.util.ArrayList<Sequence_> elements;

	public DataFrames(Sequence_[] elements)
	{
	    this.elements = new java.util.ArrayList<Sequence_>(java.util.Arrays.asList(elements));
	}
	
	
	/**
	 * Define the ASN1 Type Sequence_ from ASN1 Module DSRC.
	 * @see Sequence
	 */
	public static class Sequence_ extends Sequence {
	    public TravelerInfoType frameType;
	    public MsgId msgId;
	    public DYear startYear;
	    public MinuteOfTheYear startTime;
	    public MinutesDuration duratonTime;
	    public SignPrority priority;
	    public Position3D commonAnchor;
	    public LaneWidth commonLaneWidth;
	    public DirectionOfUse commonDirectionality;
	    public Regions regions;
	    public Content content;
	    public URL_Short url;
	    
	    /**
	     * The default constructor.
	     */
	    public Sequence_()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Sequence_(TravelerInfoType frameType, MsgId msgId, 
			    DYear startYear, MinuteOfTheYear startTime, 
			    MinutesDuration duratonTime, SignPrority priority, 
			    Position3D commonAnchor, 
			    LaneWidth commonLaneWidth, 
			    DirectionOfUse commonDirectionality, 
			    Regions regions, Content content, URL_Short url)
	    {
		setFrameType(frameType);
		setMsgId(msgId);
		setStartYear(startYear);
		setStartTime(startTime);
		setDuratonTime(duratonTime);
		setPriority(priority);
		setCommonAnchor(commonAnchor);
		setCommonLaneWidth(commonLaneWidth);
		setCommonDirectionality(commonDirectionality);
		setRegions(regions);
		setContent(content);
		setUrl(url);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public Sequence_(TravelerInfoType frameType, MsgId msgId, 
			    MinuteOfTheYear startTime, 
			    MinutesDuration duratonTime, SignPrority priority, 
			    Regions regions, Content content)
	    {
		setFrameType(frameType);
		setMsgId(msgId);
		setStartTime(startTime);
		setDuratonTime(duratonTime);
		setPriority(priority);
		setRegions(regions);
		setContent(content);
	    }
	    
	    
	    // Methods for field "frameType"
	    public TravelerInfoType getFrameType()
	    {
		return this.frameType;
	    }
	    
	    public void setFrameType(TravelerInfoType frameType)
	    {
		this.frameType = frameType;
	    }
	    
	    
	    // Methods for field "msgId"
	    public MsgId getMsgId()
	    {
		return this.msgId;
	    }
	    
	    public void setMsgId(MsgId msgId)
	    {
		this.msgId = msgId;
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type MsgId from ASN1 Module DSRC.
	     * @see Choice
	     */
	    public static class MsgId extends Choice {
		
		/**
		 * The default constructor.
		 */
		public MsgId()
		{
		}
		
		public static final  int  furtherInfoID_chosen = 1;
		public static final  int  roadSignID_chosen = 2;
		
		// Methods for field "furtherInfoID"
		public static MsgId createMsgIdWithFurtherInfoID(FurtherInfoID furtherInfoID)
		{
		    MsgId __object = new MsgId();

		    __object.setFurtherInfoID(furtherInfoID);
		    return __object;
		}
		
		public boolean hasFurtherInfoID()
		{
		    return getChosenFlag() == furtherInfoID_chosen;
		}
		
		public FurtherInfoID getFurtherInfoID()
		{
		    if (hasFurtherInfoID())
			return (FurtherInfoID)mChosenValue;
		    else
			return null;
		}
		
		public void setFurtherInfoID(FurtherInfoID furtherInfoID)
		{
		    setChosenValue(furtherInfoID);
		    setChosenFlag(furtherInfoID_chosen);
		}
		
		
		// Methods for field "roadSignID"
		public static MsgId createMsgIdWithRoadSignID(RoadSignID roadSignID)
		{
		    MsgId __object = new MsgId();

		    __object.setRoadSignID(roadSignID);
		    return __object;
		}
		
		public boolean hasRoadSignID()
		{
		    return getChosenFlag() == roadSignID_chosen;
		}
		
		public RoadSignID getRoadSignID()
		{
		    if (hasRoadSignID())
			return (RoadSignID)mChosenValue;
		    else
			return null;
		}
		
		public void setRoadSignID(RoadSignID roadSignID)
		{
		    setChosenValue(roadSignID);
		    setChosenFlag(roadSignID_chosen);
		}
		
		
		/**
		 * Implements PER value encoder for the type (reserved for internal use).
		 * This method is reserved for internal use and must not be invoked from the application code.
		 */
		public static int encodeValue(PerCoder coder, OutputBitStream sink, MsgId data)
			throws IOException, EncoderException, EncodeFailedException
		{
		    int idx0 = data.mChosenFlag;
		    int nbits = 0;

		    if (idx0 < 1 || idx0 > 2)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._bad_choice, null, idx0);
		    nbits += coder.encodeConstrainedWholeNumber(idx0 - 1, 0, 1, sink);
		    switch (idx0) {
			case furtherInfoID_chosen:
			    // Encode alternative 'furtherInfoID'
			    try {
				FurtherInfoID item1 = (FurtherInfoID)data.mChosenValue;
				int len1 = item1.getSize();

				if (len1 != 2)
				    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
				nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 2, 2, sink);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendElementContext("furtherInfoID", "FurtherInfoID", 0);
				throw ee;
			    }
			    break;
			case roadSignID_chosen:
			    // Encode alternative 'roadSignID'
			    try {
				RoadSignID item1 = (RoadSignID)data.mChosenValue;

				nbits += RoadSignID.encodeValue(coder, sink, item1);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendElementContext("roadSignID", "RoadSignID", 0);
				throw ee;
			    }
			    break;
		    }

		    return nbits;
		}

		/**
		 * Implements PER value decoder for the type (reserved for internal use).
		 * This method is reserved for internal use and must not be invoked from the application code.
		 */
		public static MsgId decodeValue(PerCoder coder, InputBitStream source, MsgId data)
			throws IOException, DecoderException, DecodeFailedException
		{
		    int idx0 = 0;

		    idx0 = (int)coder.decodeConstrainedWholeNumber(source, 0, 1) + 1;
		    if (idx0 < 1 || idx0 > 2)
			throw new DecoderException(com.oss.util.ExceptionDescriptor._bad_choice, null, idx0);
		    data.mChosenFlag = idx0;
		    switch (idx0) {
			case furtherInfoID_chosen:
			    // Decode alternative 'furtherInfoID'
			    try {
				FurtherInfoID item1;

				// Decode alternative 'furtherInfoID'
				item1 = new FurtherInfoID(com.oss.coders.per.PerOctets.decode(coder, source, 2, 2));
				data.mChosenValue = item1;
			    } catch (Exception e) {
				DecoderException de = DecoderException.wrapException(e);
				de.appendElementContext("furtherInfoID", "FurtherInfoID", 0);
				throw de;
			    }
			    break;
			case roadSignID_chosen:
			    // Decode alternative 'roadSignID'
			    try {
				RoadSignID item1 = new RoadSignID();

				// Decode alternative 'roadSignID'
				data.mChosenValue = item1;
				RoadSignID.decodeValue(coder, source, item1);
			    } catch (Exception e) {
				DecoderException de = DecoderException.wrapException(e);
				de.appendElementContext("roadSignID", "RoadSignID", 0);
				throw de;
			    }
			    break;
		    }
		    return data;
		}

		/**
		 * Clone 'this' object.
		 */
		public MsgId clone() {
		    return (MsgId)super.clone();
		}

	    } // End class definition for MsgId

	    // Methods for field "startYear"
	    public DYear getStartYear()
	    {
		return this.startYear;
	    }
	    
	    public void setStartYear(DYear startYear)
	    {
		this.startYear = startYear;
	    }
	    
	    public boolean hasStartYear()
	    {
		return (startYear != null);
	    }
	    
	    public void deleteStartYear()
	    {
		startYear = null;
	    }
	    
	    
	    // Methods for field "startTime"
	    public MinuteOfTheYear getStartTime()
	    {
		return this.startTime;
	    }
	    
	    public void setStartTime(MinuteOfTheYear startTime)
	    {
		this.startTime = startTime;
	    }
	    
	    
	    // Methods for field "duratonTime"
	    public MinutesDuration getDuratonTime()
	    {
		return this.duratonTime;
	    }
	    
	    public void setDuratonTime(MinutesDuration duratonTime)
	    {
		this.duratonTime = duratonTime;
	    }
	    
	    
	    // Methods for field "priority"
	    public SignPrority getPriority()
	    {
		return this.priority;
	    }
	    
	    public void setPriority(SignPrority priority)
	    {
		this.priority = priority;
	    }
	    
	    
	    // Methods for field "commonAnchor"
	    public Position3D getCommonAnchor()
	    {
		return this.commonAnchor;
	    }
	    
	    public void setCommonAnchor(Position3D commonAnchor)
	    {
		this.commonAnchor = commonAnchor;
	    }
	    
	    public boolean hasCommonAnchor()
	    {
		return (commonAnchor != null);
	    }
	    
	    public void deleteCommonAnchor()
	    {
		commonAnchor = null;
	    }
	    
	    
	    // Methods for field "commonLaneWidth"
	    public LaneWidth getCommonLaneWidth()
	    {
		return this.commonLaneWidth;
	    }
	    
	    public void setCommonLaneWidth(LaneWidth commonLaneWidth)
	    {
		this.commonLaneWidth = commonLaneWidth;
	    }
	    
	    public boolean hasCommonLaneWidth()
	    {
		return (commonLaneWidth != null);
	    }
	    
	    public void deleteCommonLaneWidth()
	    {
		commonLaneWidth = null;
	    }
	    
	    
	    // Methods for field "commonDirectionality"
	    public DirectionOfUse getCommonDirectionality()
	    {
		return this.commonDirectionality;
	    }
	    
	    public void setCommonDirectionality(DirectionOfUse commonDirectionality)
	    {
		this.commonDirectionality = commonDirectionality;
	    }
	    
	    public boolean hasCommonDirectionality()
	    {
		return (commonDirectionality != null);
	    }
	    
	    public void deleteCommonDirectionality()
	    {
		commonDirectionality = null;
	    }
	    
	    
	    // Methods for field "regions"
	    public Regions getRegions()
	    {
		return this.regions;
	    }
	    
	    public void setRegions(Regions regions)
	    {
		this.regions = regions;
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type Regions from ASN1 Module DSRC.
	     * @see SequenceOf
	     */
	    public static class Regions extends SequenceOf {
		
		/**
		 * The default constructor.
		 */
		public Regions()
		{
		    this.elements = new java.util.ArrayList<ValidRegion>();
		}
		
		
		/**
		 * Construct from an array of components.
		 */
		public java.util.ArrayList<ValidRegion> elements;

		public Regions(ValidRegion[] elements)
		{
		    this.elements = new java.util.ArrayList<ValidRegion>(java.util.Arrays.asList(elements));
		}
		
		/**
		 * Add an Element to the SEQUENCE OF/SET OF.
		 */
		public synchronized void add(ValidRegion element)
		{
		    elements.add(element);
		}
		
		/**
		 * Set an Element in the SEQUENCE OF/SET OF.
		 */
		public synchronized void set(ValidRegion element, int atIndex)
		{
		    elements.set(atIndex, element);
		}
		
		/**
		 * Get an Element from the SEQUENCE OF/SET OF.
		 */
		public synchronized ValidRegion get(int atIndex)
		{
		    return (ValidRegion)elements.get(atIndex);
		}
		
		/**
		 * Insert an Element into the SEQUENCE OF/SET OF.
		 */
		public synchronized void insert(ValidRegion element, int atIndex)
		{
		    elements.add(atIndex, element);
		}
		
		/**
		 * Remove an Element from the SEQUENCE OF/SET OF.
		 */
		public synchronized void remove(ValidRegion element)
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
		public static int encodeValue(PerCoder coder, OutputBitStream sink, Regions data)
			throws IOException, EncoderException, EncodeFailedException
		{
		    int total_len0 = data.elements.size();
		    int fragmentLength0;
		    boolean moreFragments0;
		    int idx0 = 0;
		    int nbits = 0;

		    if (total_len0 < 1 || total_len0 > 16)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + total_len0);
		    nbits += coder.encodeLengthDeterminant(total_len0, 1, 16, sink);
		    moreFragments0 = coder.moreFragments();
		    fragmentLength0 = (moreFragments0 ? coder.fragmentLength() : total_len0);
		    while (total_len0 > 0) {
			try {
			    ValidRegion item1 = data.elements.get(idx0);

			    nbits += ValidRegion.encodeValue(coder, sink, item1);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendElementContext(null, "ValidRegion", idx0);
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
		public static Regions decodeValue(PerCoder coder, InputBitStream source, Regions data)
			throws IOException, DecoderException, DecodeFailedException
		{
		    int total_len0 = 0;
		    int fragmentLength0;
		    boolean moreFragments0;
		    int idx0 = 0;

		    idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, 1, 16);
		    if (fragmentLength0 > 16)
			throw new DecoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + fragmentLength0);
		    moreFragments0 = coder.moreFragments();
		    if (data.elements != null)
			data.elements.clear();
		    else
			data.elements = new java.util.ArrayList<ValidRegion>(fragmentLength0);
		    while (idx0 > 0) {
			try {
			    ValidRegion item1 = new ValidRegion();

			    data.elements.add(item1);
			    ValidRegion.decodeValue(coder, source, item1);
			} catch (Exception e) {
			    DecoderException de = DecoderException.wrapException(e);
			    de.appendElementContext(null, "ValidRegion", total_len0);
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
		    if (total_len0 < 1)
			throw new DecoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + total_len0);
		    return data;
		}

		/**
		 * Compare 'this' object to another object to see if their contents are the same.
		 */
		public boolean abstractEqualTo(AbstractData that)
		{
		    return equalTo((Regions)that);
		}
		
		public boolean equalTo(SequenceOf that)
		{
		    return equalTo((Regions)that);
		}
		
		public boolean equalTo(Regions that) {
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
		public Regions clone() {
		    Regions copy = (Regions)super.clone();
		    copy.elements = new java.util.ArrayList<ValidRegion>(elements.size());
		    for (ValidRegion element : elements) {
			copy.elements.add(element.clone());
		    }
		    return copy;
		}

	    } // End class definition for Regions

	    // Methods for field "content"
	    public Content getContent()
	    {
		return this.content;
	    }
	    
	    public void setContent(Content content)
	    {
		this.content = content;
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type Content from ASN1 Module DSRC.
	     * @see Choice
	     */
	    public static class Content extends Choice {
		
		/**
		 * The default constructor.
		 */
		public Content()
		{
		}
		
		public static final  int  advisory_chosen = 1;
		public static final  int  workZone_chosen = 2;
		public static final  int  genericSign_chosen = 3;
		public static final  int  speedLimit_chosen = 4;
		public static final  int  exitService_chosen = 5;
		
		// Methods for field "advisory"
		public static Content createContentWithAdvisory(com.bah.ode.asn.oss.itis.ITIScodesAndText advisory)
		{
		    Content __object = new Content();

		    __object.setAdvisory(advisory);
		    return __object;
		}
		
		public boolean hasAdvisory()
		{
		    return getChosenFlag() == advisory_chosen;
		}
		
		public com.bah.ode.asn.oss.itis.ITIScodesAndText getAdvisory()
		{
		    if (hasAdvisory())
			return (com.bah.ode.asn.oss.itis.ITIScodesAndText)mChosenValue;
		    else
			return null;
		}
		
		public void setAdvisory(com.bah.ode.asn.oss.itis.ITIScodesAndText advisory)
		{
		    setChosenValue(advisory);
		    setChosenFlag(advisory_chosen);
		}
		
		
		// Methods for field "workZone"
		public static Content createContentWithWorkZone(WorkZone workZone)
		{
		    Content __object = new Content();

		    __object.setWorkZone(workZone);
		    return __object;
		}
		
		public boolean hasWorkZone()
		{
		    return getChosenFlag() == workZone_chosen;
		}
		
		public WorkZone getWorkZone()
		{
		    if (hasWorkZone())
			return (WorkZone)mChosenValue;
		    else
			return null;
		}
		
		public void setWorkZone(WorkZone workZone)
		{
		    setChosenValue(workZone);
		    setChosenFlag(workZone_chosen);
		}
		
		
		// Methods for field "genericSign"
		public static Content createContentWithGenericSign(GenericSignage genericSign)
		{
		    Content __object = new Content();

		    __object.setGenericSign(genericSign);
		    return __object;
		}
		
		public boolean hasGenericSign()
		{
		    return getChosenFlag() == genericSign_chosen;
		}
		
		public GenericSignage getGenericSign()
		{
		    if (hasGenericSign())
			return (GenericSignage)mChosenValue;
		    else
			return null;
		}
		
		public void setGenericSign(GenericSignage genericSign)
		{
		    setChosenValue(genericSign);
		    setChosenFlag(genericSign_chosen);
		}
		
		
		// Methods for field "speedLimit"
		public static Content createContentWithSpeedLimit(SpeedLimit speedLimit)
		{
		    Content __object = new Content();

		    __object.setSpeedLimit(speedLimit);
		    return __object;
		}
		
		public boolean hasSpeedLimit()
		{
		    return getChosenFlag() == speedLimit_chosen;
		}
		
		public SpeedLimit getSpeedLimit()
		{
		    if (hasSpeedLimit())
			return (SpeedLimit)mChosenValue;
		    else
			return null;
		}
		
		public void setSpeedLimit(SpeedLimit speedLimit)
		{
		    setChosenValue(speedLimit);
		    setChosenFlag(speedLimit_chosen);
		}
		
		
		// Methods for field "exitService"
		public static Content createContentWithExitService(ExitService exitService)
		{
		    Content __object = new Content();

		    __object.setExitService(exitService);
		    return __object;
		}
		
		public boolean hasExitService()
		{
		    return getChosenFlag() == exitService_chosen;
		}
		
		public ExitService getExitService()
		{
		    if (hasExitService())
			return (ExitService)mChosenValue;
		    else
			return null;
		}
		
		public void setExitService(ExitService exitService)
		{
		    setChosenValue(exitService);
		    setChosenFlag(exitService_chosen);
		}
		
		
		/**
		 * Implements PER value encoder for the type (reserved for internal use).
		 * This method is reserved for internal use and must not be invoked from the application code.
		 */
		public static int encodeValue(PerCoder coder, OutputBitStream sink, Content data)
			throws IOException, EncoderException, EncodeFailedException
		{
		    int idx0 = data.mChosenFlag;
		    int nbits = 0;

		    if (idx0 < 1 || idx0 > 5)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._bad_choice, null, idx0);
		    nbits += coder.encodeConstrainedWholeNumber(idx0 - 1, 0, 4, sink);
		    switch (idx0) {
			case advisory_chosen:
			    // Encode alternative 'advisory'
			    try {
				com.bah.ode.asn.oss.itis.ITIScodesAndText item1 = (com.bah.ode.asn.oss.itis.ITIScodesAndText)data.mChosenValue;

				nbits += com.bah.ode.asn.oss.itis.ITIScodesAndText.encodeValue(coder, sink, item1);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendElementContext("advisory", "ITIScodesAndText", 0);
				throw ee;
			    }
			    break;
			case workZone_chosen:
			    // Encode alternative 'workZone'
			    try {
				WorkZone item1 = (WorkZone)data.mChosenValue;

				nbits += WorkZone.encodeValue(coder, sink, item1);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendElementContext("workZone", "WorkZone", 0);
				throw ee;
			    }
			    break;
			case genericSign_chosen:
			    // Encode alternative 'genericSign'
			    try {
				GenericSignage item1 = (GenericSignage)data.mChosenValue;

				nbits += GenericSignage.encodeValue(coder, sink, item1);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendElementContext("genericSign", "GenericSignage", 0);
				throw ee;
			    }
			    break;
			case speedLimit_chosen:
			    // Encode alternative 'speedLimit'
			    try {
				SpeedLimit item1 = (SpeedLimit)data.mChosenValue;

				nbits += SpeedLimit.encodeValue(coder, sink, item1);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendElementContext("speedLimit", "SpeedLimit", 0);
				throw ee;
			    }
			    break;
			case exitService_chosen:
			    // Encode alternative 'exitService'
			    try {
				ExitService item1 = (ExitService)data.mChosenValue;

				nbits += ExitService.encodeValue(coder, sink, item1);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendElementContext("exitService", "ExitService", 0);
				throw ee;
			    }
			    break;
		    }

		    return nbits;
		}

		/**
		 * Implements PER value decoder for the type (reserved for internal use).
		 * This method is reserved for internal use and must not be invoked from the application code.
		 */
		public static Content decodeValue(PerCoder coder, InputBitStream source, Content data)
			throws IOException, DecoderException, DecodeFailedException
		{
		    int idx0 = 0;

		    idx0 = (int)coder.decodeConstrainedWholeNumber(source, 0, 4) + 1;
		    if (idx0 < 1 || idx0 > 5)
			throw new DecoderException(com.oss.util.ExceptionDescriptor._bad_choice, null, idx0);
		    data.mChosenFlag = idx0;
		    switch (idx0) {
			case advisory_chosen:
			    // Decode alternative 'advisory'
			    try {
				com.bah.ode.asn.oss.itis.ITIScodesAndText item1 = new com.bah.ode.asn.oss.itis.ITIScodesAndText();

				// Decode alternative 'advisory'
				data.mChosenValue = item1;
				com.bah.ode.asn.oss.itis.ITIScodesAndText.decodeValue(coder, source, item1);
			    } catch (Exception e) {
				DecoderException de = DecoderException.wrapException(e);
				de.appendElementContext("advisory", "ITIScodesAndText", 0);
				throw de;
			    }
			    break;
			case workZone_chosen:
			    // Decode alternative 'workZone'
			    try {
				WorkZone item1 = new WorkZone();

				// Decode alternative 'workZone'
				data.mChosenValue = item1;
				WorkZone.decodeValue(coder, source, item1);
			    } catch (Exception e) {
				DecoderException de = DecoderException.wrapException(e);
				de.appendElementContext("workZone", "WorkZone", 0);
				throw de;
			    }
			    break;
			case genericSign_chosen:
			    // Decode alternative 'genericSign'
			    try {
				GenericSignage item1 = new GenericSignage();

				// Decode alternative 'genericSign'
				data.mChosenValue = item1;
				GenericSignage.decodeValue(coder, source, item1);
			    } catch (Exception e) {
				DecoderException de = DecoderException.wrapException(e);
				de.appendElementContext("genericSign", "GenericSignage", 0);
				throw de;
			    }
			    break;
			case speedLimit_chosen:
			    // Decode alternative 'speedLimit'
			    try {
				SpeedLimit item1 = new SpeedLimit();

				// Decode alternative 'speedLimit'
				data.mChosenValue = item1;
				SpeedLimit.decodeValue(coder, source, item1);
			    } catch (Exception e) {
				DecoderException de = DecoderException.wrapException(e);
				de.appendElementContext("speedLimit", "SpeedLimit", 0);
				throw de;
			    }
			    break;
			case exitService_chosen:
			    // Decode alternative 'exitService'
			    try {
				ExitService item1 = new ExitService();

				// Decode alternative 'exitService'
				data.mChosenValue = item1;
				ExitService.decodeValue(coder, source, item1);
			    } catch (Exception e) {
				DecoderException de = DecoderException.wrapException(e);
				de.appendElementContext("exitService", "ExitService", 0);
				throw de;
			    }
			    break;
		    }
		    return data;
		}

		/**
		 * Clone 'this' object.
		 */
		public Content clone() {
		    return (Content)super.clone();
		}

	    } // End class definition for Content

	    // Methods for field "url"
	    public URL_Short getUrl()
	    {
		return this.url;
	    }
	    
	    public void setUrl(URL_Short url)
	    {
		this.url = url;
	    }
	    
	    public boolean hasUrl()
	    {
		return (url != null);
	    }
	    
	    public void deleteUrl()
	    {
		url = null;
	    }
	    
	    
	    /**
	     * Effective permitted alphabet (reserved for internal use).
	     * This member is reserved for internal use and must not be used in the application code.
	     */
	    public static final EPAInfo _cEPAInfo_url = 
		com.bah.ode.asn.oss.dsrc.URL_Short._cEPAInfo_;
	    
	    /**
	     * Implements PER value encoder for the type (reserved for internal use).
	     * This method is reserved for internal use and must not be invoked from the application code.
	     */
	    public static int encodeValue(PerCoder coder, OutputBitStream sink, Sequence_ data)
		    throws IOException, EncoderException, EncodeFailedException
	    {
		int nbits = 0;

		boolean has_startYear0 = data.startYear != null;
		boolean has_commonAnchor0 = data.commonAnchor != null;
		boolean has_commonLaneWidth0 = data.commonLaneWidth != null;
		boolean has_commonDirectionality0 = data.commonDirectionality != null;
		boolean has_url0 = data.url != null;
		sink.writeBit(has_startYear0); ++nbits;
		sink.writeBit(has_commonAnchor0); ++nbits;
		sink.writeBit(has_commonLaneWidth0); ++nbits;
		sink.writeBit(has_commonDirectionality0); ++nbits;
		sink.writeBit(has_url0); ++nbits;
		// Encode field 'frameType'
		try {
		    TravelerInfoType item1 = data.frameType;
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
		    ee.appendFieldContext("frameType", "TravelerInfoType");
		    throw ee;
		}
		// Encode field 'msgId'
		try {
		    MsgId item1 = data.msgId;

		    nbits += MsgId.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("msgId", "CHOICE");
		    throw ee;
		}
		if (has_startYear0) {
		    // Encode field 'startYear'
		    try {
			DYear item1 = data.startYear;
			long temp1 = item1.longValue();

			if (temp1 < 0 || temp1 > 9999)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
			nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 9999, sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("startYear", "DYear");
			throw ee;
		    }
		}
		// Encode field 'startTime'
		try {
		    MinuteOfTheYear item1 = data.startTime;
		    long temp1 = item1.longValue();

		    if (temp1 < 0 || temp1 > 525960)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 525960, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("startTime", "MinuteOfTheYear");
		    throw ee;
		}
		// Encode field 'duratonTime'
		try {
		    MinutesDuration item1 = data.duratonTime;
		    long temp1 = item1.longValue();

		    if (temp1 < 0 || temp1 > 32000)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 32000, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("duratonTime", "MinutesDuration");
		    throw ee;
		}
		// Encode field 'priority'
		try {
		    SignPrority item1 = data.priority;
		    long temp1 = item1.longValue();

		    if (temp1 < 0 || temp1 > 7)
			throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 7, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("priority", "SignPrority");
		    throw ee;
		}
		if (has_commonAnchor0) {
		    // Encode field 'commonAnchor'
		    try {
			Position3D item1 = data.commonAnchor;

			nbits += Position3D.encodeValue(coder, sink, item1);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("commonAnchor", "Position3D");
			throw ee;
		    }
		}
		if (has_commonLaneWidth0) {
		    // Encode field 'commonLaneWidth'
		    try {
			LaneWidth item1 = data.commonLaneWidth;
			long temp1 = item1.longValue();

			if (temp1 < 0 || temp1 > 32767)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
			nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 32767, sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("commonLaneWidth", "LaneWidth");
			throw ee;
		    }
		}
		if (has_commonDirectionality0) {
		    // Encode field 'commonDirectionality'
		    try {
			DirectionOfUse item1 = data.commonDirectionality;
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
			ee.appendFieldContext("commonDirectionality", "DirectionOfUse");
			throw ee;
		    }
		}
		// Encode field 'regions'
		try {
		    Regions item1 = data.regions;

		    nbits += Regions.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("regions", "SEQUENCE OF");
		    throw ee;
		}
		// Encode field 'content'
		try {
		    Content item1 = data.content;

		    nbits += Content.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("content", "CHOICE");
		    throw ee;
		}
		if (has_url0) {
		    // Encode field 'url'
		    try {
			URL_Short item1 = data.url;
			int len1 = item1.getSize();

			if (len1 < 1 || len1 > 15)
			    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
			nbits += com.oss.coders.per.PerKMCString.encode(coder, item1.stringValue(), 1, 15, Sequence_._cEPAInfo_url, sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendFieldContext("url", "URL-Short");
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
		boolean has_startYear0 = source.readBit();
		boolean has_commonAnchor0 = source.readBit();
		boolean has_commonLaneWidth0 = source.readBit();
		boolean has_commonDirectionality0 = source.readBit();
		boolean has_url0 = source.readBit();
		// Decode field 'frameType'
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
		    data.frameType = temp1;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("frameType", "TravelerInfoType");
		    throw de;
		}
		// Decode field 'msgId'
		try {
		    if (data.msgId == null)
			data.msgId = new MsgId();
		    MsgId.decodeValue(coder, source, data.msgId);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("msgId", "CHOICE");
		    throw de;
		}
		if (has_startYear0) {
		    // Decode field 'startYear'
		    try {
			long temp1;

			if (data.startYear == null)
			    data.startYear = new DYear();
			temp1 = coder.decodeConstrainedWholeNumber(source, 0, 9999);
			if (temp1 > 9999)
			    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
			data.startYear.setValue(temp1);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("startYear", "DYear");
			throw de;
		    }
		} else {
		    data.startYear = null;
		}
		// Decode field 'startTime'
		try {
		    long temp1;

		    if (data.startTime == null)
			data.startTime = new MinuteOfTheYear();
		    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 525960);
		    if (temp1 > 525960)
			throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		    data.startTime.setValue(temp1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("startTime", "MinuteOfTheYear");
		    throw de;
		}
		// Decode field 'duratonTime'
		try {
		    long temp1;

		    if (data.duratonTime == null)
			data.duratonTime = new MinutesDuration();
		    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 32000);
		    if (temp1 > 32000)
			throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		    data.duratonTime.setValue(temp1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("duratonTime", "MinutesDuration");
		    throw de;
		}
		// Decode field 'priority'
		try {
		    long temp1;

		    if (data.priority == null)
			data.priority = new SignPrority();
		    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 7);
		    if (temp1 > 7)
			throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		    data.priority.setValue(temp1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("priority", "SignPrority");
		    throw de;
		}
		if (has_commonAnchor0) {
		    // Decode field 'commonAnchor'
		    try {
			if (data.commonAnchor == null)
			    data.commonAnchor = new Position3D();
			Position3D.decodeValue(coder, source, data.commonAnchor);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("commonAnchor", "Position3D");
			throw de;
		    }
		} else {
		    data.commonAnchor = null;
		}
		if (has_commonLaneWidth0) {
		    // Decode field 'commonLaneWidth'
		    try {
			long temp1;

			if (data.commonLaneWidth == null)
			    data.commonLaneWidth = new LaneWidth();
			temp1 = coder.decodeConstrainedWholeNumber(source, 0, 32767);
			if (temp1 > 32767)
			    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
			data.commonLaneWidth.setValue(temp1);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("commonLaneWidth", "LaneWidth");
			throw de;
		    }
		} else {
		    data.commonLaneWidth = null;
		}
		if (has_commonDirectionality0) {
		    // Decode field 'commonDirectionality'
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
			data.commonDirectionality = temp1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("commonDirectionality", "DirectionOfUse");
			throw de;
		    }
		} else {
		    data.commonDirectionality = null;
		}
		// Decode field 'regions'
		try {
		    if (data.regions == null)
			data.regions = new Regions();
		    Regions.decodeValue(coder, source, data.regions);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("regions", "SEQUENCE OF");
		    throw de;
		}
		// Decode field 'content'
		try {
		    if (data.content == null)
			data.content = new Content();
		    Content.decodeValue(coder, source, data.content);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("content", "CHOICE");
		    throw de;
		}
		if (has_url0) {
		    // Decode field 'url'
		    try {
			data.url = new URL_Short(com.oss.coders.per.PerKMCString.decode(coder, source, 1, 15, Sequence_._cEPAInfo_url));
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("url", "URL-Short");
			throw de;
		    }
		} else {
		    data.url = null;
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
		if (!this.frameType.equalTo(that.frameType))
		    return false;
		if (!this.msgId.equalTo(that.msgId))
		    return false;
		if (this.startYear != null && that.startYear != null) {
		    if (!this.startYear.equalTo(that.startYear))
			return false;
		}
		if (!this.startTime.equalTo(that.startTime))
		    return false;
		if (!this.duratonTime.equalTo(that.duratonTime))
		    return false;
		if (!this.priority.equalTo(that.priority))
		    return false;
		if (this.commonAnchor != null && that.commonAnchor != null) {
		    if (!this.commonAnchor.equalTo(that.commonAnchor))
			return false;
		}
		if (this.commonLaneWidth != null && that.commonLaneWidth != null) {
		    if (!this.commonLaneWidth.equalTo(that.commonLaneWidth))
			return false;
		}
		if (this.commonDirectionality != null && that.commonDirectionality != null) {
		    if (!this.commonDirectionality.equalTo(that.commonDirectionality))
			return false;
		}
		if (!this.regions.equalTo(that.regions))
		    return false;
		if (!this.content.equalTo(that.content))
		    return false;
		if (this.url != null && that.url != null) {
		    if (!this.url.equalTo(that.url))
			return false;
		}
		return true;
	    }

	    /**
	     * Clone 'this' object.
	     */
	    public Sequence_ clone() {
		Sequence_ copy = (Sequence_)super.clone();
		copy.frameType = frameType.clone();
		copy.msgId = msgId.clone();
		if (startYear != null) {
		    copy.startYear = startYear.clone();
		}
		copy.startTime = startTime.clone();
		copy.duratonTime = duratonTime.clone();
		copy.priority = priority.clone();
		if (commonAnchor != null) {
		    copy.commonAnchor = commonAnchor.clone();
		}
		if (commonLaneWidth != null) {
		    copy.commonLaneWidth = commonLaneWidth.clone();
		}
		if (commonDirectionality != null) {
		    copy.commonDirectionality = commonDirectionality.clone();
		}
		copy.regions = regions.clone();
		copy.content = content.clone();
		if (url != null) {
		    copy.url = url.clone();
		}
		return copy;
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
	public static int encodeValue(PerCoder coder, OutputBitStream sink, DataFrames data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int total_len0 = data.elements.size();
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;
	    int nbits = 0;

	    if (total_len0 < 1 || total_len0 > 8)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + total_len0);
	    nbits += coder.encodeLengthDeterminant(total_len0, 1, 8, sink);
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
	public static DataFrames decodeValue(PerCoder coder, InputBitStream source, DataFrames data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    int total_len0 = 0;
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;

	    idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, 1, 8);
	    if (fragmentLength0 > 8)
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
		    Sequence_.decodeValue(coder, source, item1);
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
			if ((total_len0 + fragmentLength0) > 8)
			    throw new DecoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + (total_len0 + fragmentLength0));
		    }
		}
	    }
	    if (total_len0 < 1)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + total_len0);
	    return data;
	}

	/**
	 * Compare 'this' object to another object to see if their contents are the same.
	 */
	public boolean abstractEqualTo(AbstractData that)
	{
	    return equalTo((DataFrames)that);
	}
	
	public boolean equalTo(SequenceOf that)
	{
	    return equalTo((DataFrames)that);
	}
	
	public boolean equalTo(DataFrames that) {
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
	public DataFrames clone() {
	    DataFrames copy = (DataFrames)super.clone();
	    copy.elements = new java.util.ArrayList<Sequence_>(elements.size());
	    for (Sequence_ element : elements) {
		copy.elements.add(element.clone());
	    }
	    return copy;
	}

    } // End class definition for DataFrames

    // Methods for field "crc"
    public MsgCRC getCrc()
    {
	return this.crc;
    }
    
    public void setCrc(MsgCRC crc)
    {
	this.crc = crc;
    }
    
    
    /**
     * Effective permitted alphabet (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public static final EPAInfo _cEPAInfo_urlB = 
	com.bah.ode.asn.oss.dsrc.URL_Base._cEPAInfo_;
    
    /**
     * Encode the PDU using BER (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encode(BerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	try {
	    int len0 = 0;
	    TravelerInformation temp0 = this;

	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.crc.byteArrayValue()), 0x85);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("crc", "MsgCRC");
		throw ee;
	    }
	    try {
		int len1 = 0;
		java.util.ArrayList<com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames.Sequence_> temp1 = temp0.dataFrames.elements;
		int idx1 = temp1 != null ? temp1.size() : 0;

		try {
		    while(idx1-- > 0) {
			int len2 = 0;
			com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames.Sequence_ temp2 = temp1.get(idx1);

			if (temp2.url != null) {
			    try {
				len2 += sink.encodeLengthTag(coder.encodeString1(temp2.url, sink), 0x8B);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("url", "URL-Short");
				throw ee;
			    }
			}
			try {
			    int len3;

			    switch (temp2.content.getChosenFlag()) {
			    case com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames.Sequence_.Content.advisory_chosen:
				try {
				    len3 = sink.encodeLengthTag(((com.bah.ode.asn.oss.itis.ITIScodesAndText)temp2.content.getChosenValue()).encodeValue(coder, sink), 0xA0);
				} catch (Exception e) {
				    EncoderException ee = EncoderException.wrapException(e);
				    ee.appendElementContext("advisory", "CHOICE", 0);
				    throw ee;
				}
				break;

			    case com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames.Sequence_.Content.workZone_chosen:
				try {
				    len3 = sink.encodeLengthTag(((WorkZone)temp2.content.getChosenValue()).encodeValue(coder, sink), 0xA1);
				} catch (Exception e) {
				    EncoderException ee = EncoderException.wrapException(e);
				    ee.appendElementContext("workZone", "CHOICE", 0);
				    throw ee;
				}
				break;

			    case com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames.Sequence_.Content.genericSign_chosen:
				try {
				    len3 = sink.encodeLengthTag(((GenericSignage)temp2.content.getChosenValue()).encodeValue(coder, sink), 0xA2);
				} catch (Exception e) {
				    EncoderException ee = EncoderException.wrapException(e);
				    ee.appendElementContext("genericSign", "CHOICE", 0);
				    throw ee;
				}
				break;

			    case com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames.Sequence_.Content.speedLimit_chosen:
				try {
				    len3 = sink.encodeLengthTag(((SpeedLimit)temp2.content.getChosenValue()).encodeValue(coder, sink), 0xA3);
				} catch (Exception e) {
				    EncoderException ee = EncoderException.wrapException(e);
				    ee.appendElementContext("speedLimit", "CHOICE", 0);
				    throw ee;
				}
				break;

			    case com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames.Sequence_.Content.exitService_chosen:
				try {
				    len3 = sink.encodeLengthTag(((ExitService)temp2.content.getChosenValue()).encodeValue(coder, sink), 0xA4);
				} catch (Exception e) {
				    EncoderException ee = EncoderException.wrapException(e);
				    ee.appendElementContext("exitService", "CHOICE", 0);
				    throw ee;
				}
				break;

			    default:
				throw new EncoderException(ExceptionDescriptor._bad_choice, null);
			    }
			    len2 += sink.encodeLengthTag(len3, 0xAA);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendFieldContext("content", "CHOICE");
			    throw ee;
			}
			try {
			    int len3 = 0;
			    java.util.ArrayList<ValidRegion> temp3 = temp2.regions.elements;
			    int idx3 = temp3 != null ? temp3.size() : 0;

			    try {
				while(idx3-- > 0) {
				    len3 += sink.encodeLengthTag(temp3.get(idx3).encodeValue(coder, sink), 0x30);
				}
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendElementContext(null, "SEQUENCE OF", idx3);
				throw ee;
			    }
			    len2 += sink.encodeLengthTag(len3, 0xA9);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendFieldContext("regions", "SEQUENCE OF");
			    throw ee;
			}
			if (temp2.commonDirectionality != null) {
			    try {
				len2 += sink.encodeLengthTag(coder.encodeEnumerated(temp2.commonDirectionality, sink), 0x88);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("commonDirectionality", "DirectionOfUse");
				throw ee;
			    }
			}
			if (temp2.commonLaneWidth != null) {
			    try {
				len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.commonLaneWidth, sink), 0x87);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("commonLaneWidth", "LaneWidth");
				throw ee;
			    }
			}
			if (temp2.commonAnchor != null) {
			    try {
				len2 += sink.encodeLengthTag(temp2.commonAnchor.encodeValue(coder, sink), 0xA6);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("commonAnchor", "Position3D");
				throw ee;
			    }
			}
			try {
			    len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.priority, sink), 0x85);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendFieldContext("priority", "SignPrority");
			    throw ee;
			}
			try {
			    len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.duratonTime, sink), 0x84);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendFieldContext("duratonTime", "MinutesDuration");
			    throw ee;
			}
			try {
			    len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.startTime, sink), 0x83);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendFieldContext("startTime", "MinuteOfTheYear");
			    throw ee;
			}
			if (temp2.startYear != null) {
			    try {
				len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.startYear, sink), 0x82);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("startYear", "DYear");
				throw ee;
			    }
			}
			try {
			    int len3;

			    switch (temp2.msgId.getChosenFlag()) {
			    case com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames.Sequence_.MsgId.furtherInfoID_chosen:
				try {
				    len3 = sink.encodeLengthTag(sink.write(((FurtherInfoID)temp2.msgId.getChosenValue()).byteArrayValue()), 0x80);
				} catch (Exception e) {
				    EncoderException ee = EncoderException.wrapException(e);
				    ee.appendElementContext("furtherInfoID", "CHOICE", 0);
				    throw ee;
				}
				break;

			    case com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames.Sequence_.MsgId.roadSignID_chosen:
				try {
				    len3 = sink.encodeLengthTag(((RoadSignID)temp2.msgId.getChosenValue()).encodeValue(coder, sink), 0xA1);
				} catch (Exception e) {
				    EncoderException ee = EncoderException.wrapException(e);
				    ee.appendElementContext("roadSignID", "CHOICE", 0);
				    throw ee;
				}
				break;

			    default:
				throw new EncoderException(ExceptionDescriptor._bad_choice, null);
			    }
			    len2 += sink.encodeLengthTag(len3, 0xA1);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendFieldContext("msgId", "CHOICE");
			    throw ee;
			}
			try {
			    len2 += sink.encodeLengthTag(coder.encodeEnumerated(temp2.frameType, sink), 0x80);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendFieldContext("frameType", "TravelerInfoType");
			    throw ee;
			}
			len1 += sink.encodeLengthTag(len2, 0x30);
		    }
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "SEQUENCE OF", idx1);
		    throw ee;
		}
		len0 += sink.encodeLengthTag(len1, 0xA4);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("dataFrames", "SEQUENCE OF");
		throw ee;
	    }
	    if (temp0.dataFrameCount != null) {
		try {
		    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.dataFrameCount, sink), 0x83);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("dataFrameCount", "Count");
		    throw ee;
		}
	    }
	    if (temp0.urlB != null) {
		try {
		    len0 += sink.encodeLengthTag(coder.encodeString1(temp0.urlB, sink), 0x82);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("urlB", "URL-Base");
		    throw ee;
		}
	    }
	    if (temp0.packetID != null) {
		try {
		    len0 += sink.encodeLengthTag(sink.write(temp0.packetID.byteArrayValue()), 0x81);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("packetID", "UniqueMSGID");
		    throw ee;
		}
	    }
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.msgID, sink), 0x80);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msgID", "DSRCmsgID");
		throw ee;
	    }

	    return sink.encodeLengthTag(len0, 0x30);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext(null, "TravelerInformation");
	    throw ee;
	}
    }

    /**
     * Decode the PDU using BER (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public AbstractData decode(BerCoder coder, DecoderInput source, int tag)
	    throws DecoderException
    {
	this.packetID = null;
	this.urlB = null;
	this.dataFrameCount = null;
	try {
	    if (tag != 0x30)
	    {
		throw new DecoderException(ExceptionDescriptor._pdu_mismatch, null, source.formatTag(tag));
	    }
	    {
		int total_len0 = source.mLength;
		int end_pos0 = (total_len0 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len0);

		do {
		    tag = source.decodeTagLength();
		    if (tag != 0x80)
			source.raiseTagMismatchException(tag);
		    try {
			int idx1 = DSRCmsgID.indexOfValue(source.decodeLong());
			this.msgID = (idx1 < 0) ? DSRCmsgID.unknownEnumerator() : DSRCmsgID.cNamedNumbers[idx1];
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("msgID", "DSRCmsgID");
			throw ee;
		    }
		    tag = source.decodeTagLength();
		    if (tag == 0x81 || tag == 0xA1) {
			try {
			    this.packetID = new UniqueMSGID(coder.decodeOctetString(source));
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("packetID", "UniqueMSGID");
			    throw ee;
			}
			tag = source.decodeTagLength();
		    }
		    if (tag == 0x82 || tag == 0xA2) {
			try {
			    this.urlB = new URL_Base(coder.decodeChars(source));
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("urlB", "URL-Base");
			    throw ee;
			}
			tag = source.decodeTagLength();
		    }
		    if (tag == 0x83) {
			try {
			    this.dataFrameCount = new Count(source.decodeLong());
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("dataFrameCount", "Count");
			    throw ee;
			}
			tag = source.decodeTagLength();
		    }
		    if (tag != 0xA4)
			source.raiseTagMismatchException(tag);
		    try {
			this.dataFrames = new DataFrames();
			{
			    int total_len1 = source.mLength;
			    int end_pos1 = (total_len1 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len1);
			    int idx1 = 0;

			    this.dataFrames.elements = new java.util.ArrayList<com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames.Sequence_>();

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
				    com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames.Sequence_ temp1 = new com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames.Sequence_();
				    this.dataFrames.add(temp1);
				    if (tag != 0x30)
					source.raiseTagMismatchException(tag);
				    {
					int total_len2 = source.mLength;
					int end_pos2 = (total_len2 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len2);

					do {
					    tag = source.decodeTagLength();
					    if (tag != 0x80)
						source.raiseTagMismatchException(tag);
					    try {
						int idx3 = TravelerInfoType.indexOfValue(source.decodeLong());
						temp1.frameType = (idx3 < 0) ? TravelerInfoType.unknownEnumerator() : TravelerInfoType.cNamedNumbers[idx3];
					    } catch (Exception e) {
						DecoderException ee = DecoderException.wrapException(e);
						ee.appendFieldContext("frameType", "TravelerInfoType");
						throw ee;
					    }
					    tag = source.decodeTagLength();
					    if (tag != 0xA1)
						source.raiseTagMismatchException(tag);
					    try {
						temp1.msgId = new com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames.Sequence_.MsgId();
						tag = source.decodeTagLength();
						switch (tag & 0xFFFFFFDF) {
						case 0x80:
						    try {
							temp1.msgId.setChosenFlag(com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames.Sequence_.MsgId.furtherInfoID_chosen);
							temp1.msgId.setChosenValue(new FurtherInfoID(coder.decodeOctetString(source)));
						    } catch (Exception e) {
							DecoderException ee = DecoderException.wrapException(e);
							ee.appendElementContext("furtherInfoID", "FurtherInfoID", 0);
							throw ee;
						    }
						    break;

						case 0x81:
						    try {
							temp1.msgId.setChosenFlag(com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames.Sequence_.MsgId.roadSignID_chosen);
							temp1.msgId.setChosenValue(new RoadSignID());
							((RoadSignID)temp1.msgId.getChosenValue()).decodeValue(coder, source);
						    } catch (Exception e) {
							DecoderException ee = DecoderException.wrapException(e);
							ee.appendElementContext("roadSignID", "RoadSignID", 0);
							throw ee;
						    }
						    break;

						default:
						    source.raiseUnknownFieldException(tag);
						}
					    } catch (Exception e) {
						DecoderException ee = DecoderException.wrapException(e);
						ee.appendFieldContext("msgId", "CHOICE");
						throw ee;
					    }
					    tag = source.decodeTagLength();
					    if (tag == 0x82) {
						try {
						    temp1.startYear = new DYear(source.decodeLong());
						} catch (Exception e) {
						    DecoderException ee = DecoderException.wrapException(e);
						    ee.appendFieldContext("startYear", "DYear");
						    throw ee;
						}
						tag = source.decodeTagLength();
					    }
					    if (tag != 0x83)
						source.raiseTagMismatchException(tag);
					    try {
						temp1.startTime = new MinuteOfTheYear(source.decodeLong());
					    } catch (Exception e) {
						DecoderException ee = DecoderException.wrapException(e);
						ee.appendFieldContext("startTime", "MinuteOfTheYear");
						throw ee;
					    }
					    tag = source.decodeTagLength();
					    if (tag != 0x84)
						source.raiseTagMismatchException(tag);
					    try {
						temp1.duratonTime = new MinutesDuration(source.decodeLong());
					    } catch (Exception e) {
						DecoderException ee = DecoderException.wrapException(e);
						ee.appendFieldContext("duratonTime", "MinutesDuration");
						throw ee;
					    }
					    tag = source.decodeTagLength();
					    if (tag != 0x85)
						source.raiseTagMismatchException(tag);
					    try {
						temp1.priority = new SignPrority(source.decodeLong());
					    } catch (Exception e) {
						DecoderException ee = DecoderException.wrapException(e);
						ee.appendFieldContext("priority", "SignPrority");
						throw ee;
					    }
					    tag = source.decodeTagLength();
					    if (tag == 0xA6) {
						try {
						    temp1.commonAnchor = new Position3D();
						    temp1.commonAnchor.decodeValue(coder, source);
						} catch (Exception e) {
						    DecoderException ee = DecoderException.wrapException(e);
						    ee.appendFieldContext("commonAnchor", "Position3D");
						    throw ee;
						}
						tag = source.decodeTagLength();
					    }
					    if (tag == 0x87) {
						try {
						    temp1.commonLaneWidth = new LaneWidth(source.decodeLong());
						} catch (Exception e) {
						    DecoderException ee = DecoderException.wrapException(e);
						    ee.appendFieldContext("commonLaneWidth", "LaneWidth");
						    throw ee;
						}
						tag = source.decodeTagLength();
					    }
					    if (tag == 0x88) {
						try {
						    int idx3 = DirectionOfUse.indexOfValue(source.decodeLong());
						    temp1.commonDirectionality = (idx3 < 0) ? DirectionOfUse.unknownEnumerator() : DirectionOfUse.cNamedNumbers[idx3];
						} catch (Exception e) {
						    DecoderException ee = DecoderException.wrapException(e);
						    ee.appendFieldContext("commonDirectionality", "DirectionOfUse");
						    throw ee;
						}
						tag = source.decodeTagLength();
					    }
					    if (tag != 0xA9)
						source.raiseTagMismatchException(tag);
					    try {
						temp1.regions = new com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames.Sequence_.Regions();
						{
						    int total_len3 = source.mLength;
						    int end_pos3 = (total_len3 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len3);
						    int idx3 = 0;

						    temp1.regions.elements = new java.util.ArrayList<ValidRegion>();

						    try {
							for (;;) {
							    if (source.position() >= end_pos3) {
								if (source.position() > end_pos3)
								    throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
								break;
							    }
							    tag = source.decodeTagLength();
							    if (tag == 0) {
								if (total_len3 < 0) {
								    if (source.mLength != 0)
									throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);
								    break;
								}
								if (source.mLength == 0)
								    throw new DecoderException(ExceptionDescriptor._expect_tag, null);
							    }
							    ValidRegion temp3 = new ValidRegion();
							    temp1.regions.add(temp3);
							    if (tag != 0x30)
								source.raiseTagMismatchException(tag);
							    temp3.decodeValue(coder, source);
							    ++idx3;
							}
						    } catch (Exception e) {
							DecoderException ee = DecoderException.wrapException(e);
							ee.appendElementContext(null, "SEQUENCE OF", idx3);
							throw ee;
						    }
						}
					    } catch (Exception e) {
						DecoderException ee = DecoderException.wrapException(e);
						ee.appendFieldContext("regions", "SEQUENCE OF");
						throw ee;
					    }
					    tag = source.decodeTagLength();
					    if (tag != 0xAA)
						source.raiseTagMismatchException(tag);
					    try {
						temp1.content = new com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames.Sequence_.Content();
						tag = source.decodeTagLength();
						switch (tag) {
						case 0xA0:
						    try {
							temp1.content.setChosenFlag(com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames.Sequence_.Content.advisory_chosen);
							temp1.content.setChosenValue(new com.bah.ode.asn.oss.itis.ITIScodesAndText());
							((com.bah.ode.asn.oss.itis.ITIScodesAndText)temp1.content.getChosenValue()).decodeValue(coder, source);
						    } catch (Exception e) {
							DecoderException ee = DecoderException.wrapException(e);
							ee.appendElementContext("advisory", "ITIScodesAndText", 0);
							throw ee;
						    }
						    break;

						case 0xA1:
						    try {
							temp1.content.setChosenFlag(com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames.Sequence_.Content.workZone_chosen);
							temp1.content.setChosenValue(new WorkZone());
							((WorkZone)temp1.content.getChosenValue()).decodeValue(coder, source);
						    } catch (Exception e) {
							DecoderException ee = DecoderException.wrapException(e);
							ee.appendElementContext("workZone", "WorkZone", 0);
							throw ee;
						    }
						    break;

						case 0xA2:
						    try {
							temp1.content.setChosenFlag(com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames.Sequence_.Content.genericSign_chosen);
							temp1.content.setChosenValue(new GenericSignage());
							((GenericSignage)temp1.content.getChosenValue()).decodeValue(coder, source);
						    } catch (Exception e) {
							DecoderException ee = DecoderException.wrapException(e);
							ee.appendElementContext("genericSign", "GenericSignage", 0);
							throw ee;
						    }
						    break;

						case 0xA3:
						    try {
							temp1.content.setChosenFlag(com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames.Sequence_.Content.speedLimit_chosen);
							temp1.content.setChosenValue(new SpeedLimit());
							((SpeedLimit)temp1.content.getChosenValue()).decodeValue(coder, source);
						    } catch (Exception e) {
							DecoderException ee = DecoderException.wrapException(e);
							ee.appendElementContext("speedLimit", "SpeedLimit", 0);
							throw ee;
						    }
						    break;

						case 0xA4:
						    try {
							temp1.content.setChosenFlag(com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames.Sequence_.Content.exitService_chosen);
							temp1.content.setChosenValue(new ExitService());
							((ExitService)temp1.content.getChosenValue()).decodeValue(coder, source);
						    } catch (Exception e) {
							DecoderException ee = DecoderException.wrapException(e);
							ee.appendElementContext("exitService", "ExitService", 0);
							throw ee;
						    }
						    break;

						default:
						    source.raiseUnknownFieldException(tag);
						}
					    } catch (Exception e) {
						DecoderException ee = DecoderException.wrapException(e);
						ee.appendFieldContext("content", "CHOICE");
						throw ee;
					    }
					    if (source.position() >= end_pos2)
						break;
					    tag = source.decodeTagLength();
					    if (tag == 0)
						break;
					    if (tag == 0x8B || tag == 0xAB) {
						try {
						    temp1.url = new URL_Short(coder.decodeChars(source));
						} catch (Exception e) {
						    DecoderException ee = DecoderException.wrapException(e);
						    ee.appendFieldContext("url", "URL-Short");
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
			ee.appendFieldContext("dataFrames", "SEQUENCE OF");
			throw ee;
		    }
		    tag = source.decodeTagLength();
		    if (tag != 0x85 && tag != 0xA5)
			source.raiseTagMismatchException(tag);
		    try {
			this.crc = new MsgCRC(coder.decodeOctetString(source));
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("crc", "MsgCRC");
			throw ee;
		    }
		    if (source.position() >= end_pos0)
			break;
		    tag = source.decodeTagLength();
		    if (tag == 0)
			break;
		    for (;;) {
			try {
			    coder.skipContents(source);
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendExtensionContext("TravelerInformation", -1);
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
	    }

	    return this;
	} catch (Exception e) {
	    DecoderException ee = DecoderException.wrapException(e);
	    ee.appendFieldContext(null, "TravelerInformation");
	    throw ee;
	}
    }

    /**
     * Encode the PDU using DER (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encode(DerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	try {
	    int len0 = 0;
	    TravelerInformation temp0 = this;

	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.crc.byteArrayValue()), 0x85);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("crc", "MsgCRC");
		throw ee;
	    }
	    try {
		int len1 = 0;
		java.util.ArrayList<com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames.Sequence_> temp1 = temp0.dataFrames.elements;
		int idx1 = temp1 != null ? temp1.size() : 0;

		try {
		    while(idx1-- > 0) {
			int len2 = 0;
			com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames.Sequence_ temp2 = temp1.get(idx1);

			if (temp2.url != null) {
			    try {
				len2 += sink.encodeLengthTag(coder.encodeString1(temp2.url, sink), 0x8B);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("url", "URL-Short");
				throw ee;
			    }
			}
			try {
			    int len3;

			    switch (temp2.content.getChosenFlag()) {
			    case com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames.Sequence_.Content.advisory_chosen:
				try {
				    len3 = sink.encodeLengthTag(((com.bah.ode.asn.oss.itis.ITIScodesAndText)temp2.content.getChosenValue()).encodeValue(coder, sink), 0xA0);
				} catch (Exception e) {
				    EncoderException ee = EncoderException.wrapException(e);
				    ee.appendElementContext("advisory", "CHOICE", 0);
				    throw ee;
				}
				break;

			    case com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames.Sequence_.Content.workZone_chosen:
				try {
				    len3 = sink.encodeLengthTag(((WorkZone)temp2.content.getChosenValue()).encodeValue(coder, sink), 0xA1);
				} catch (Exception e) {
				    EncoderException ee = EncoderException.wrapException(e);
				    ee.appendElementContext("workZone", "CHOICE", 0);
				    throw ee;
				}
				break;

			    case com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames.Sequence_.Content.genericSign_chosen:
				try {
				    len3 = sink.encodeLengthTag(((GenericSignage)temp2.content.getChosenValue()).encodeValue(coder, sink), 0xA2);
				} catch (Exception e) {
				    EncoderException ee = EncoderException.wrapException(e);
				    ee.appendElementContext("genericSign", "CHOICE", 0);
				    throw ee;
				}
				break;

			    case com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames.Sequence_.Content.speedLimit_chosen:
				try {
				    len3 = sink.encodeLengthTag(((SpeedLimit)temp2.content.getChosenValue()).encodeValue(coder, sink), 0xA3);
				} catch (Exception e) {
				    EncoderException ee = EncoderException.wrapException(e);
				    ee.appendElementContext("speedLimit", "CHOICE", 0);
				    throw ee;
				}
				break;

			    case com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames.Sequence_.Content.exitService_chosen:
				try {
				    len3 = sink.encodeLengthTag(((ExitService)temp2.content.getChosenValue()).encodeValue(coder, sink), 0xA4);
				} catch (Exception e) {
				    EncoderException ee = EncoderException.wrapException(e);
				    ee.appendElementContext("exitService", "CHOICE", 0);
				    throw ee;
				}
				break;

			    default:
				throw new EncoderException(ExceptionDescriptor._bad_choice, null);
			    }
			    len2 += sink.encodeLengthTag(len3, 0xAA);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendFieldContext("content", "CHOICE");
			    throw ee;
			}
			try {
			    int len3 = 0;
			    java.util.ArrayList<ValidRegion> temp3 = temp2.regions.elements;
			    int idx3 = temp3 != null ? temp3.size() : 0;

			    try {
				while(idx3-- > 0) {
				    len3 += sink.encodeLengthTag(temp3.get(idx3).encodeValue(coder, sink), 0x30);
				}
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendElementContext(null, "SEQUENCE OF", idx3);
				throw ee;
			    }
			    len2 += sink.encodeLengthTag(len3, 0xA9);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendFieldContext("regions", "SEQUENCE OF");
			    throw ee;
			}
			if (temp2.commonDirectionality != null) {
			    try {
				len2 += sink.encodeLengthTag(coder.encodeEnumerated(temp2.commonDirectionality, sink), 0x88);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("commonDirectionality", "DirectionOfUse");
				throw ee;
			    }
			}
			if (temp2.commonLaneWidth != null) {
			    try {
				len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.commonLaneWidth, sink), 0x87);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("commonLaneWidth", "LaneWidth");
				throw ee;
			    }
			}
			if (temp2.commonAnchor != null) {
			    try {
				len2 += sink.encodeLengthTag(temp2.commonAnchor.encodeValue(coder, sink), 0xA6);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("commonAnchor", "Position3D");
				throw ee;
			    }
			}
			try {
			    len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.priority, sink), 0x85);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendFieldContext("priority", "SignPrority");
			    throw ee;
			}
			try {
			    len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.duratonTime, sink), 0x84);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendFieldContext("duratonTime", "MinutesDuration");
			    throw ee;
			}
			try {
			    len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.startTime, sink), 0x83);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendFieldContext("startTime", "MinuteOfTheYear");
			    throw ee;
			}
			if (temp2.startYear != null) {
			    try {
				len2 += sink.encodeLengthTag(coder.encodeInteger(temp2.startYear, sink), 0x82);
			    } catch (Exception e) {
				EncoderException ee = EncoderException.wrapException(e);
				ee.appendFieldContext("startYear", "DYear");
				throw ee;
			    }
			}
			try {
			    int len3;

			    switch (temp2.msgId.getChosenFlag()) {
			    case com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames.Sequence_.MsgId.furtherInfoID_chosen:
				try {
				    len3 = sink.encodeLengthTag(sink.write(((FurtherInfoID)temp2.msgId.getChosenValue()).byteArrayValue()), 0x80);
				} catch (Exception e) {
				    EncoderException ee = EncoderException.wrapException(e);
				    ee.appendElementContext("furtherInfoID", "CHOICE", 0);
				    throw ee;
				}
				break;

			    case com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames.Sequence_.MsgId.roadSignID_chosen:
				try {
				    len3 = sink.encodeLengthTag(((RoadSignID)temp2.msgId.getChosenValue()).encodeValue(coder, sink), 0xA1);
				} catch (Exception e) {
				    EncoderException ee = EncoderException.wrapException(e);
				    ee.appendElementContext("roadSignID", "CHOICE", 0);
				    throw ee;
				}
				break;

			    default:
				throw new EncoderException(ExceptionDescriptor._bad_choice, null);
			    }
			    len2 += sink.encodeLengthTag(len3, 0xA1);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendFieldContext("msgId", "CHOICE");
			    throw ee;
			}
			try {
			    len2 += sink.encodeLengthTag(coder.encodeEnumerated(temp2.frameType, sink), 0x80);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendFieldContext("frameType", "TravelerInfoType");
			    throw ee;
			}
			len1 += sink.encodeLengthTag(len2, 0x30);
		    }
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "SEQUENCE OF", idx1);
		    throw ee;
		}
		len0 += sink.encodeLengthTag(len1, 0xA4);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("dataFrames", "SEQUENCE OF");
		throw ee;
	    }
	    if (temp0.dataFrameCount != null) {
		try {
		    len0 += sink.encodeLengthTag(coder.encodeInteger(temp0.dataFrameCount, sink), 0x83);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("dataFrameCount", "Count");
		    throw ee;
		}
	    }
	    if (temp0.urlB != null) {
		try {
		    len0 += sink.encodeLengthTag(coder.encodeString1(temp0.urlB, sink), 0x82);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("urlB", "URL-Base");
		    throw ee;
		}
	    }
	    if (temp0.packetID != null) {
		try {
		    len0 += sink.encodeLengthTag(sink.write(temp0.packetID.byteArrayValue()), 0x81);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("packetID", "UniqueMSGID");
		    throw ee;
		}
	    }
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.msgID, sink), 0x80);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msgID", "DSRCmsgID");
		throw ee;
	    }

	    return sink.encodeLengthTag(len0, 0x30);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext(null, "TravelerInformation");
	    throw ee;
	}
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, TravelerInformation data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	boolean has_packetID0 = data.packetID != null;
	boolean has_urlB0 = data.urlB != null;
	boolean has_dataFrameCount0 = data.dataFrameCount != null;
	sink.writeBit(false); ++nbits;
	sink.writeBit(has_packetID0); ++nbits;
	sink.writeBit(has_urlB0); ++nbits;
	sink.writeBit(has_dataFrameCount0); ++nbits;
	// Encode field 'msgID'
	try {
	    DSRCmsgID item1 = data.msgID;
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
	    ee.appendFieldContext("msgID", "DSRCmsgID");
	    throw ee;
	}
	if (has_packetID0) {
	    // Encode field 'packetID'
	    try {
		UniqueMSGID item1 = data.packetID;
		int len1 = item1.getSize();

		if (len1 != 9)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 9, 9, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("packetID", "UniqueMSGID");
		throw ee;
	    }
	}
	if (has_urlB0) {
	    // Encode field 'urlB'
	    try {
		URL_Base item1 = data.urlB;
		int len1 = item1.getSize();

		if (len1 < 1 || len1 > 45)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerKMCString.encode(coder, item1.stringValue(), 1, 45, TravelerInformation._cEPAInfo_urlB, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("urlB", "URL-Base");
		throw ee;
	    }
	}
	if (has_dataFrameCount0) {
	    // Encode field 'dataFrameCount'
	    try {
		Count item1 = data.dataFrameCount;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 32)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 32, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("dataFrameCount", "Count");
		throw ee;
	    }
	}
	// Encode field 'dataFrames'
	try {
	    DataFrames item1 = data.dataFrames;

	    nbits += DataFrames.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("dataFrames", "SEQUENCE OF");
	    throw ee;
	}
	// Encode field 'crc'
	try {
	    MsgCRC item1 = data.crc;
	    int len1 = item1.getSize();

	    if (len1 != 2)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 2, 2, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("crc", "MsgCRC");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Encode the PDU using PER (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encode(PerCoder coder, OutputBitStream sink)
	    throws EncoderException
    {
	try {
	    return TravelerInformation.encodeValue(coder, sink, this);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext(null, "TravelerInformation");
	    throw ee;
	}
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static TravelerInformation decodeValue(PerCoder coder, InputBitStream source, TravelerInformation data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	int idx0;
	InputBitStream bitstream0 = null;

	boolean has_packetID0 = source.readBit();
	boolean has_urlB0 = source.readBit();
	boolean has_dataFrameCount0 = source.readBit();
	// Decode field 'msgID'
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
	    data.msgID = temp1;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("msgID", "DSRCmsgID");
	    throw de;
	}
	if (has_packetID0) {
	    // Decode field 'packetID'
	    try {
		data.packetID = new UniqueMSGID(com.oss.coders.per.PerOctets.decode(coder, source, 9, 9));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("packetID", "UniqueMSGID");
		throw de;
	    }
	} else {
	    data.packetID = null;
	}
	if (has_urlB0) {
	    // Decode field 'urlB'
	    try {
		data.urlB = new URL_Base(com.oss.coders.per.PerKMCString.decode(coder, source, 1, 45, TravelerInformation._cEPAInfo_urlB));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("urlB", "URL-Base");
		throw de;
	    }
	} else {
	    data.urlB = null;
	}
	if (has_dataFrameCount0) {
	    // Decode field 'dataFrameCount'
	    try {
		long temp1;

		if (data.dataFrameCount == null)
		    data.dataFrameCount = new Count();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 32);
		if (temp1 > 32)
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._valueRange, null, temp1);
		data.dataFrameCount.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("dataFrameCount", "Count");
		throw de;
	    }
	} else {
	    data.dataFrameCount = null;
	}
	// Decode field 'dataFrames'
	try {
	    if (data.dataFrames == null)
		data.dataFrames = new DataFrames();
	    DataFrames.decodeValue(coder, source, data.dataFrames);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("dataFrames", "SEQUENCE OF");
	    throw de;
	}
	// Decode field 'crc'
	try {
	    data.crc = new MsgCRC(com.oss.coders.per.PerOctets.decode(coder, source, 2, 2));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("crc", "MsgCRC");
	    throw de;
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
     * Decode the PDU using PER (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public AbstractData decode(PerCoder coder, InputBitStream source)
	    throws DecoderException
    {
	try {
	    TravelerInformation.decodeValue(coder, source, this);
	    return this;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext(null, "TravelerInformation");
	    throw de;
	}
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
	    writer.print("msgID ");
	    printer.print(this.msgID, writer, this.msgID.cConstantNameList);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.packetID != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("packetID ");
		printer.print(this.packetID, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.urlB != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("urlB ");
		printer.print(this.urlB, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.dataFrameCount != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("dataFrameCount ");
		writer.print(this.dataFrameCount.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("dataFrames ");
	    {
		java.util.ArrayList<com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames.Sequence_> temp1 = this.dataFrames.elements;
		int len1 = temp1 != null ? temp1.size() : 0;
		int idx1 = 0;

		try {
		    writer.print('{');
		    printer.indent();
		    for (idx1 = 0; idx1 < len1; idx1++){
			boolean comma2;

			if (idx1 > 0)
			    writer.print(',');
			printer.newLine(writer);
			comma2 = false;
			writer.print('{');
			printer.indent();
			try {
			    if (comma2)
				writer.print(',');
			    comma2 = true;
			    printer.newLine(writer);
			    writer.print("frameType ");
			    printer.print(temp1.get(idx1).frameType, writer, temp1.get(idx1).frameType.cConstantNameList);
			} catch (Exception e) {
			    printer.reportError(e, null, writer);
			}
			try {
			    if (comma2)
				writer.print(',');
			    comma2 = true;
			    printer.newLine(writer);
			    writer.print("msgId ");
			    {
				switch (temp1.get(idx1).msgId.getChosenFlag()) {
				case com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames.Sequence_.MsgId.furtherInfoID_chosen:
				    try {
					writer.print("furtherInfoID : ");
					printer.print(((FurtherInfoID)temp1.get(idx1).msgId.getChosenValue()), writer);
				    } catch (Exception e) {
					printer.reportError(e, null, writer);
				    }
				    break;

				case com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames.Sequence_.MsgId.roadSignID_chosen:
				    try {
					writer.print("roadSignID : ");
					((RoadSignID)temp1.get(idx1).msgId.getChosenValue()).printValue(printer, writer);
				    } catch (Exception e) {
					printer.reportError(e, null, writer);
				    }
				    break;

				default:
				    writer.print("-- unknown selection --");
				}
			    }
			} catch (Exception e) {
			    printer.reportError(e, null, writer);
			}
			if (temp1.get(idx1).startYear != null) {
			    try {
				if (comma2)
				    writer.print(',');
				comma2 = true;
				printer.newLine(writer);
				writer.print("startYear ");
				writer.print(temp1.get(idx1).startYear.longValue());
			    } catch (Exception e) {
				printer.reportError(e, null, writer);
			    }
			}
			try {
			    if (comma2)
				writer.print(',');
			    comma2 = true;
			    printer.newLine(writer);
			    writer.print("startTime ");
			    writer.print(temp1.get(idx1).startTime.longValue());
			} catch (Exception e) {
			    printer.reportError(e, null, writer);
			}
			try {
			    if (comma2)
				writer.print(',');
			    comma2 = true;
			    printer.newLine(writer);
			    writer.print("duratonTime ");
			    writer.print(temp1.get(idx1).duratonTime.longValue());
			} catch (Exception e) {
			    printer.reportError(e, null, writer);
			}
			try {
			    if (comma2)
				writer.print(',');
			    comma2 = true;
			    printer.newLine(writer);
			    writer.print("priority ");
			    writer.print(temp1.get(idx1).priority.longValue());
			} catch (Exception e) {
			    printer.reportError(e, null, writer);
			}
			if (temp1.get(idx1).commonAnchor != null) {
			    try {
				if (comma2)
				    writer.print(',');
				comma2 = true;
				printer.newLine(writer);
				writer.print("commonAnchor ");
				temp1.get(idx1).commonAnchor.printValue(printer, writer);
			    } catch (Exception e) {
				printer.reportError(e, null, writer);
			    }
			}
			if (temp1.get(idx1).commonLaneWidth != null) {
			    try {
				if (comma2)
				    writer.print(',');
				comma2 = true;
				printer.newLine(writer);
				writer.print("commonLaneWidth ");
				writer.print(temp1.get(idx1).commonLaneWidth.longValue());
			    } catch (Exception e) {
				printer.reportError(e, null, writer);
			    }
			}
			if (temp1.get(idx1).commonDirectionality != null) {
			    try {
				if (comma2)
				    writer.print(',');
				comma2 = true;
				printer.newLine(writer);
				writer.print("commonDirectionality ");
				printer.print(temp1.get(idx1).commonDirectionality, writer, temp1.get(idx1).commonDirectionality.cConstantNameList);
			    } catch (Exception e) {
				printer.reportError(e, null, writer);
			    }
			}
			try {
			    if (comma2)
				writer.print(',');
			    comma2 = true;
			    printer.newLine(writer);
			    writer.print("regions ");
			    {
				java.util.ArrayList<ValidRegion> temp3 = temp1.get(idx1).regions.elements;
				int len3 = temp3 != null ? temp3.size() : 0;
				int idx3 = 0;

				try {
				    writer.print('{');
				    printer.indent();
				    for (idx3 = 0; idx3 < len3; idx3++){
					if (idx3 > 0)
					    writer.print(',');
					printer.newLine(writer);
					temp3.get(idx3).printValue(printer, writer);
				    }
				    printer.undent();
				    if (len3 > 0)
					printer.newLine(writer);
				    writer.print('}');
				} catch (Exception e) {
				    printer.reportError(e, null, writer);
				}
			    }
			} catch (Exception e) {
			    printer.reportError(e, null, writer);
			}
			try {
			    if (comma2)
				writer.print(',');
			    comma2 = true;
			    printer.newLine(writer);
			    writer.print("content ");
			    {
				switch (temp1.get(idx1).content.getChosenFlag()) {
				case com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames.Sequence_.Content.advisory_chosen:
				    try {
					writer.print("advisory : ");
					((com.bah.ode.asn.oss.itis.ITIScodesAndText)temp1.get(idx1).content.getChosenValue()).printValue(printer, writer);
				    } catch (Exception e) {
					printer.reportError(e, null, writer);
				    }
				    break;

				case com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames.Sequence_.Content.workZone_chosen:
				    try {
					writer.print("workZone : ");
					((WorkZone)temp1.get(idx1).content.getChosenValue()).printValue(printer, writer);
				    } catch (Exception e) {
					printer.reportError(e, null, writer);
				    }
				    break;

				case com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames.Sequence_.Content.genericSign_chosen:
				    try {
					writer.print("genericSign : ");
					((GenericSignage)temp1.get(idx1).content.getChosenValue()).printValue(printer, writer);
				    } catch (Exception e) {
					printer.reportError(e, null, writer);
				    }
				    break;

				case com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames.Sequence_.Content.speedLimit_chosen:
				    try {
					writer.print("speedLimit : ");
					((SpeedLimit)temp1.get(idx1).content.getChosenValue()).printValue(printer, writer);
				    } catch (Exception e) {
					printer.reportError(e, null, writer);
				    }
				    break;

				case com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames.Sequence_.Content.exitService_chosen:
				    try {
					writer.print("exitService : ");
					((ExitService)temp1.get(idx1).content.getChosenValue()).printValue(printer, writer);
				    } catch (Exception e) {
					printer.reportError(e, null, writer);
				    }
				    break;

				default:
				    writer.print("-- unknown selection --");
				}
			    }
			} catch (Exception e) {
			    printer.reportError(e, null, writer);
			}
			if (temp1.get(idx1).url != null) {
			    try {
				if (comma2)
				    writer.print(',');
				comma2 = true;
				printer.newLine(writer);
				writer.print("url ");
				printer.print(temp1.get(idx1).url, writer);
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
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("crc ");
	    printer.print(this.crc, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	printer.undent();
	if (comma0)
	    printer.newLine(writer);
	writer.print('}');
    }

    /**
     * Convert the PDU value to a string.
     */
    public String toString()
    {
	try {
	    return (new DataPrinter()).print(this);
	} catch (DataPrinterException e) {
	    return null;
	}
    }

    /**
     * Return the ASN.1 type name.
     */
    public String getTypeName()
    {
	return "TravelerInformation";
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((TravelerInformation)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((TravelerInformation)that);
    }
    
    public boolean equalTo(TravelerInformation that) {
	if (!this.msgID.equalTo(that.msgID))
	    return false;
	if (this.packetID != null && that.packetID != null) {
	    if (!this.packetID.equalTo(that.packetID))
		return false;
	}
	if (this.urlB != null && that.urlB != null) {
	    if (!this.urlB.equalTo(that.urlB))
		return false;
	}
	if (this.dataFrameCount != null && that.dataFrameCount != null) {
	    if (!this.dataFrameCount.equalTo(that.dataFrameCount))
		return false;
	}
	if (!this.dataFrames.equalTo(that.dataFrames))
	    return false;
	if (!this.crc.equalTo(that.crc))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public TravelerInformation clone() {
	TravelerInformation copy = (TravelerInformation)super.clone();
	copy.msgID = msgID.clone();
	if (packetID != null) {
	    copy.packetID = packetID.clone();
	}
	if (urlB != null) {
	    copy.urlB = urlB.clone();
	}
	if (dataFrameCount != null) {
	    copy.dataFrameCount = dataFrameCount.clone();
	}
	copy.dataFrames = dataFrames.clone();
	copy.crc = crc.clone();
	return copy;
    }

    /**
     * The type is a PDU.
     */
    public boolean isPDU()
    {
	return true;
    }
    
    /**
     * This member is reserved for internal use and must not be used in the application code.
     */
    public static final ASN1Type _type = new ASN1Type() {
	public AbstractData newInstance()
	{
	    return new TravelerInformation();
	}
    };
    
} // End class definition for TravelerInformation
