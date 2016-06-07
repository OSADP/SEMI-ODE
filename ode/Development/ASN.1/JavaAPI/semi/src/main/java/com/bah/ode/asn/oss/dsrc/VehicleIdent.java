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
 * Define the ASN1 Type VehicleIdent from ASN1 Module DSRC.
 * @see Sequence
 */

public class VehicleIdent extends Sequence {
    public DescriptiveName name;
    public VINstring vin;
    public IA5String ownerCode;
    public TemporaryID id;
    public VehicleType vehicleType;
    public VehicleClass vehicleClass;
    
    /**
     * The default constructor.
     */
    public VehicleIdent()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public VehicleIdent(DescriptiveName name, VINstring vin, 
		    IA5String ownerCode, TemporaryID id, 
		    VehicleType vehicleType, VehicleClass vehicleClass)
    {
	setName(name);
	setVin(vin);
	setOwnerCode(ownerCode);
	setId(id);
	setVehicleType(vehicleType);
	setVehicleClass(vehicleClass);
    }
    
    
    // Methods for field "name"
    public DescriptiveName getName()
    {
	return this.name;
    }
    
    public void setName(DescriptiveName name)
    {
	this.name = name;
    }
    
    public boolean hasName()
    {
	return (name != null);
    }
    
    public void deleteName()
    {
	name = null;
    }
    
    
    // Methods for field "vin"
    public VINstring getVin()
    {
	return this.vin;
    }
    
    public void setVin(VINstring vin)
    {
	this.vin = vin;
    }
    
    public boolean hasVin()
    {
	return (vin != null);
    }
    
    public void deleteVin()
    {
	vin = null;
    }
    
    
    // Methods for field "ownerCode"
    public IA5String getOwnerCode()
    {
	return this.ownerCode;
    }
    
    public void setOwnerCode(IA5String ownerCode)
    {
	this.ownerCode = ownerCode;
    }
    
    public boolean hasOwnerCode()
    {
	return (ownerCode != null);
    }
    
    public void deleteOwnerCode()
    {
	ownerCode = null;
    }
    
    
    // Methods for field "id"
    public TemporaryID getId()
    {
	return this.id;
    }
    
    public void setId(TemporaryID id)
    {
	this.id = id;
    }
    
    public boolean hasId()
    {
	return (id != null);
    }
    
    public void deleteId()
    {
	id = null;
    }
    
    
    // Methods for field "vehicleType"
    public VehicleType getVehicleType()
    {
	return this.vehicleType;
    }
    
    public void setVehicleType(VehicleType vehicleType)
    {
	this.vehicleType = vehicleType;
    }
    
    public boolean hasVehicleType()
    {
	return (vehicleType != null);
    }
    
    public void deleteVehicleType()
    {
	vehicleType = null;
    }
    
    
    // Methods for field "vehicleClass"
    public VehicleClass getVehicleClass()
    {
	return this.vehicleClass;
    }
    
    public void setVehicleClass(VehicleClass vehicleClass)
    {
	this.vehicleClass = vehicleClass;
    }
    
    public boolean hasVehicleClass()
    {
	return (vehicleClass != null);
    }
    
    public void deleteVehicleClass()
    {
	vehicleClass = null;
    }
    
    
    
    /**
     * Define the ASN1 Type VehicleClass from ASN1 Module DSRC.
     * @see Choice
     */
    public static class VehicleClass extends Choice {
	
	/**
	 * The default constructor.
	 */
	public VehicleClass()
	{
	}
	
	public static final  int  vGroup_chosen = 1;
	public static final  int  rGroup_chosen = 2;
	public static final  int  rEquip_chosen = 3;
	
	// Methods for field "vGroup"
	public static VehicleClass createVehicleClassWithVGroup(com.bah.ode.asn.oss.itis.VehicleGroupAffected vGroup)
	{
	    VehicleClass __object = new VehicleClass();

	    __object.setVGroup(vGroup);
	    return __object;
	}
	
	public boolean hasVGroup()
	{
	    return getChosenFlag() == vGroup_chosen;
	}
	
	public com.bah.ode.asn.oss.itis.VehicleGroupAffected getVGroup()
	{
	    if (hasVGroup())
		return (com.bah.ode.asn.oss.itis.VehicleGroupAffected)mChosenValue;
	    else
		return null;
	}
	
	public void setVGroup(com.bah.ode.asn.oss.itis.VehicleGroupAffected vGroup)
	{
	    setChosenValue(vGroup);
	    setChosenFlag(vGroup_chosen);
	}
	
	
	// Methods for field "rGroup"
	public static VehicleClass createVehicleClassWithRGroup(com.bah.ode.asn.oss.itis.ResponderGroupAffected rGroup)
	{
	    VehicleClass __object = new VehicleClass();

	    __object.setRGroup(rGroup);
	    return __object;
	}
	
	public boolean hasRGroup()
	{
	    return getChosenFlag() == rGroup_chosen;
	}
	
	public com.bah.ode.asn.oss.itis.ResponderGroupAffected getRGroup()
	{
	    if (hasRGroup())
		return (com.bah.ode.asn.oss.itis.ResponderGroupAffected)mChosenValue;
	    else
		return null;
	}
	
	public void setRGroup(com.bah.ode.asn.oss.itis.ResponderGroupAffected rGroup)
	{
	    setChosenValue(rGroup);
	    setChosenFlag(rGroup_chosen);
	}
	
	
	// Methods for field "rEquip"
	public static VehicleClass createVehicleClassWithREquip(com.bah.ode.asn.oss.itis.IncidentResponseEquipment rEquip)
	{
	    VehicleClass __object = new VehicleClass();

	    __object.setREquip(rEquip);
	    return __object;
	}
	
	public boolean hasREquip()
	{
	    return getChosenFlag() == rEquip_chosen;
	}
	
	public com.bah.ode.asn.oss.itis.IncidentResponseEquipment getREquip()
	{
	    if (hasREquip())
		return (com.bah.ode.asn.oss.itis.IncidentResponseEquipment)mChosenValue;
	    else
		return null;
	}
	
	public void setREquip(com.bah.ode.asn.oss.itis.IncidentResponseEquipment rEquip)
	{
	    setChosenValue(rEquip);
	    setChosenFlag(rEquip_chosen);
	}
	
	
	/**
	 * Hashtable for tags (reserved for internal use).
	 * This class is reserved for internal use and must not be used in the application code.
	 */
	public static enum __Tag
	{
	    __vGroup("vGroup"),
	    __rGroup("rGroup"),
	    __rEquip("rEquip"),
	    _null_("_null_");
	    private String tag;
	    private static java.util.HashMap<String, __Tag> map =
		new java.util.HashMap<String, __Tag>(4);
	    private __Tag(String tag) {
		this.tag = tag;
	    }
	    private String getTag() {
		return tag;
	    }
	    /**
	     * This method is reserved for internal use and must not be invoked from the application code.
	     */
	    public static __Tag getTagSub(String tag) {
		return map.get(tag);
	    }
	    static {
		for (__Tag t:values())
		    map.put(t.getTag(), t);
	    }
	}
	
	/**
	 * Implements PER value encoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public static int encodeValue(PerCoder coder, OutputBitStream sink, VehicleClass data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int idx0 = data.mChosenFlag;
	    int nbits = 0;

	    if (idx0 < 1 || idx0 > 3)
		throw new EncoderException(com.oss.util.ExceptionDescriptor._bad_choice, null, idx0);
	    nbits += coder.encodeConstrainedWholeNumber(idx0 - 1, 0, 2, sink);
	    switch (idx0) {
		case vGroup_chosen:
		    // Encode alternative 'vGroup'
		    try {
			com.bah.ode.asn.oss.itis.VehicleGroupAffected item1 = (com.bah.ode.asn.oss.itis.VehicleGroupAffected)data.mChosenValue;
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
			ee.appendElementContext("vGroup", "VehicleGroupAffected", 0);
			throw ee;
		    }
		    break;
		case rGroup_chosen:
		    // Encode alternative 'rGroup'
		    try {
			com.bah.ode.asn.oss.itis.ResponderGroupAffected item1 = (com.bah.ode.asn.oss.itis.ResponderGroupAffected)data.mChosenValue;
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
			ee.appendElementContext("rGroup", "ResponderGroupAffected", 0);
			throw ee;
		    }
		    break;
		case rEquip_chosen:
		    // Encode alternative 'rEquip'
		    try {
			com.bah.ode.asn.oss.itis.IncidentResponseEquipment item1 = (com.bah.ode.asn.oss.itis.IncidentResponseEquipment)data.mChosenValue;
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
			ee.appendElementContext("rEquip", "IncidentResponseEquipment", 0);
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
	public static VehicleClass decodeValue(PerCoder coder, InputBitStream source, VehicleClass data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    int idx0 = 0;

	    idx0 = (int)coder.decodeConstrainedWholeNumber(source, 0, 2) + 1;
	    if (idx0 < 1 || idx0 > 3)
		throw new DecoderException(com.oss.util.ExceptionDescriptor._bad_choice, null, idx0);
	    data.mChosenFlag = idx0;
	    switch (idx0) {
		case vGroup_chosen:
		    // Decode alternative 'vGroup'
		    try {
			com.bah.ode.asn.oss.itis.VehicleGroupAffected item1;
			int idx1;
			com.bah.ode.asn.oss.itis.VehicleGroupAffected temp1;
			boolean extroot1 = !source.readBit();

			// Decode alternative 'vGroup'
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
			item1 = temp1;
			data.mChosenValue = item1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("vGroup", "VehicleGroupAffected", 0);
			throw de;
		    }
		    break;
		case rGroup_chosen:
		    // Decode alternative 'rGroup'
		    try {
			com.bah.ode.asn.oss.itis.ResponderGroupAffected item1;
			int idx1;
			com.bah.ode.asn.oss.itis.ResponderGroupAffected temp1;
			boolean extroot1 = !source.readBit();

			// Decode alternative 'rGroup'
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
			item1 = temp1;
			data.mChosenValue = item1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("rGroup", "ResponderGroupAffected", 0);
			throw de;
		    }
		    break;
		case rEquip_chosen:
		    // Decode alternative 'rEquip'
		    try {
			com.bah.ode.asn.oss.itis.IncidentResponseEquipment item1;
			int idx1;
			com.bah.ode.asn.oss.itis.IncidentResponseEquipment temp1;
			boolean extroot1 = !source.readBit();

			// Decode alternative 'rEquip'
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
			item1 = temp1;
			data.mChosenValue = item1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("rEquip", "IncidentResponseEquipment", 0);
			throw de;
		    }
		    break;
	    }
	    return data;
	}

	/**
	 * Implements JSON value encoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public void encodeValue(JsonCoder coder, JsonWriter sink)
		throws IOException, EncoderException
	{
	    int idx0 = this.mChosenFlag;

	    sink.beginObject();
	    switch (idx0)
	    {
	    case vGroup_chosen:
		// Encode alternative 'vGroup'
		try {
		    com.bah.ode.asn.oss.itis.VehicleGroupAffected item1 = (com.bah.ode.asn.oss.itis.VehicleGroupAffected)this.mChosenValue;

		    sink.encodeKey("vGroup");
		    if (item1.isUnknownEnumerator()) {
			throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		    } else 
			sink.writeString(item1.name());
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("vGroup", "VehicleGroupAffected", 0);
		    throw ee;
		}
		break;
	    case rGroup_chosen:
		// Encode alternative 'rGroup'
		try {
		    com.bah.ode.asn.oss.itis.ResponderGroupAffected item1 = (com.bah.ode.asn.oss.itis.ResponderGroupAffected)this.mChosenValue;

		    sink.encodeKey("rGroup");
		    if (item1.isUnknownEnumerator()) {
			throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		    } else 
			sink.writeString(item1.name());
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("rGroup", "ResponderGroupAffected", 0);
		    throw ee;
		}
		break;
	    case rEquip_chosen:
		// Encode alternative 'rEquip'
		try {
		    com.bah.ode.asn.oss.itis.IncidentResponseEquipment item1 = (com.bah.ode.asn.oss.itis.IncidentResponseEquipment)this.mChosenValue;

		    sink.encodeKey("rEquip");
		    if (item1.isUnknownEnumerator()) {
			throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		    } else 
			sink.writeString(item1.name());
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("rEquip", "IncidentResponseEquipment", 0);
		    throw ee;
		}
		break;
	    default:
		throw new EncoderException(com.oss.util.ExceptionDescriptor._bad_choice, null, idx0);
	    }
	    sink.endObject();

	}

	/**
	 * Implements JSON value decoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public VehicleClass decodeValue(JsonCoder coder, JsonReader source)
		throws IOException, DecoderException
	{
	    coder.decodeObject(source);
	    String tag0 = coder.nextProperty(source);
	    VehicleClass.__Tag t_tag0 = VehicleClass.__Tag.getTagSub(tag0);
	    if (t_tag0 == null) 
		t_tag0 = VehicleClass.__Tag._null_;
	    switch (t_tag0) {
		case __vGroup:
		    // Decode alternative 'vGroup'
		    try {
			com.bah.ode.asn.oss.itis.VehicleGroupAffected item1 = null;
			String content1 = coder.decodeString(source);
			int idx1;
			com.bah.ode.asn.oss.itis.VehicleGroupAffected temp1;

			// Decode alternative 'vGroup'
			idx1 = coder.resolveName(com.bah.ode.asn.oss.itis.VehicleGroupAffected.cConstantNameList, content1);
			if (idx1 < 0 )
			    temp1 = com.bah.ode.asn.oss.itis.VehicleGroupAffected.unknownEnumerator();
			else
			    temp1 = com.bah.ode.asn.oss.itis.VehicleGroupAffected.cNamedNumbers[idx1];
			item1 = temp1;
			this.mChosenValue = item1;
			this.mChosenFlag = vGroup_chosen;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("vGroup", "VehicleGroupAffected", 0);
			throw de;
		    }
		    break;
		case __rGroup:
		    // Decode alternative 'rGroup'
		    try {
			com.bah.ode.asn.oss.itis.ResponderGroupAffected item1 = null;
			String content1 = coder.decodeString(source);
			int idx1;
			com.bah.ode.asn.oss.itis.ResponderGroupAffected temp1;

			// Decode alternative 'rGroup'
			idx1 = coder.resolveName(com.bah.ode.asn.oss.itis.ResponderGroupAffected.cConstantNameList, content1);
			if (idx1 < 0 )
			    temp1 = com.bah.ode.asn.oss.itis.ResponderGroupAffected.unknownEnumerator();
			else
			    temp1 = com.bah.ode.asn.oss.itis.ResponderGroupAffected.cNamedNumbers[idx1];
			item1 = temp1;
			this.mChosenValue = item1;
			this.mChosenFlag = rGroup_chosen;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("rGroup", "ResponderGroupAffected", 0);
			throw de;
		    }
		    break;
		case __rEquip:
		    // Decode alternative 'rEquip'
		    try {
			com.bah.ode.asn.oss.itis.IncidentResponseEquipment item1 = null;
			String content1 = coder.decodeString(source);
			int idx1;
			com.bah.ode.asn.oss.itis.IncidentResponseEquipment temp1;

			// Decode alternative 'rEquip'
			idx1 = coder.resolveName(com.bah.ode.asn.oss.itis.IncidentResponseEquipment.cConstantNameList, content1);
			if (idx1 < 0 )
			    temp1 = com.bah.ode.asn.oss.itis.IncidentResponseEquipment.unknownEnumerator();
			else
			    temp1 = com.bah.ode.asn.oss.itis.IncidentResponseEquipment.cNamedNumbers[idx1];
			item1 = temp1;
			this.mChosenValue = item1;
			this.mChosenFlag = rEquip_chosen;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("rEquip", "IncidentResponseEquipment", 0);
			throw de;
		    }
		    break;
		default:
		    throw new DecoderException(com.oss.util.ExceptionDescriptor._unknown_field, null, tag0);
	    }
	    if (coder.hasMoreProperties(source, false))
		throw new DecoderException(com.oss.util.ExceptionDescriptor._json_unexpected_token, null, ": expecting '}'");
	    return this;
	}

	/**
	 * Clone 'this' object.
	 */
	public VehicleClass clone() {
	    return (VehicleClass)super.clone();
	}

    } // End class definition for VehicleClass

    /**
     * Effective permitted alphabet (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public static final EPAInfo _cEPAInfo_name = 
	com.bah.ode.asn.oss.dsrc.DescriptiveName._cEPAInfo_;
    
    /**
     * Effective permitted alphabet (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     */
    public static final EPAInfo _cEPAInfo_ownerCode = 
	IA5StringPAInfo.paInfo;
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     */
    public static enum __Tag
    {
	__name("name"),
	__vin("vin"),
	__ownerCode("ownerCode"),
	__id("id"),
	__vehicleType("vehicleType"),
	__vehicleClass("vehicleClass"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(7);
	private __Tag(String tag) {
	    this.tag = tag;
	}
	private String getTag() {
	    return tag;
	}
	/**
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public static __Tag getTagSub(String tag) {
	    return map.get(tag);
	}
	static {
	    for (__Tag t:values())
		map.put(t.getTag(), t);
	}
    }
    
    /**
     * Implements BER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encodeValue(BerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	int len0 = 0;
	VehicleIdent temp0 = this;

	if (temp0.vehicleClass != null) {
	    try {
		int len1 = 0;

		switch (temp0.vehicleClass.getChosenFlag()) {
		case VehicleClass.vGroup_chosen:
		    try {
			len1 = sink.encodeLengthTag(coder.encodeEnumerated(((com.bah.ode.asn.oss.itis.VehicleGroupAffected)temp0.vehicleClass.getChosenValue()), sink), 0x80);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("vGroup", "CHOICE", 0);
			throw ee;
		    }
		    break;

		case VehicleClass.rGroup_chosen:
		    try {
			len1 = sink.encodeLengthTag(coder.encodeEnumerated(((com.bah.ode.asn.oss.itis.ResponderGroupAffected)temp0.vehicleClass.getChosenValue()), sink), 0x81);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("rGroup", "CHOICE", 0);
			throw ee;
		    }
		    break;

		case VehicleClass.rEquip_chosen:
		    try {
			len1 = sink.encodeLengthTag(coder.encodeEnumerated(((com.bah.ode.asn.oss.itis.IncidentResponseEquipment)temp0.vehicleClass.getChosenValue()), sink), 0x82);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("rEquip", "CHOICE", 0);
			throw ee;
		    }
		    break;

		default:
		    throw new EncoderException(ExceptionDescriptor._bad_choice, null);
		}
		len0 += sink.encodeLengthTag(len1, 0xA5);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("vehicleClass", "CHOICE");
		throw ee;
	    }
	}
	if (temp0.vehicleType != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.vehicleType, sink), 0x84);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("vehicleType", "VehicleType");
		throw ee;
	    }
	}
	if (temp0.id != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.id.byteArrayValue()), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("id", "TemporaryID");
		throw ee;
	    }
	}
	if (temp0.ownerCode != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeString1(temp0.ownerCode, sink), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("ownerCode", "IA5String");
		throw ee;
	    }
	}
	if (temp0.vin != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.vin.byteArrayValue()), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("vin", "VINstring");
		throw ee;
	    }
	}
	if (temp0.name != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeString1(temp0.name, sink), 0x80);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("name", "DescriptiveName");
		throw ee;
	    }
	}

	return len0;
    }

    /**
     * Implements BER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public VehicleIdent decodeValue(BerCoder coder, DecoderInput source)
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
		    this.name = new DescriptiveName(coder.decodeChars(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("name", "DescriptiveName");
		    throw ee;
		}
		if (source.position() >= end_pos0)
		    break;
		tag = source.decodeTagLength();
		if (tag == 0)
		    break;
	    }
	    if (tag == 0x81 || tag == 0xA1) {
		try {
		    this.vin = new VINstring(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("vin", "VINstring");
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
		    this.ownerCode = new IA5String(coder.decodeChars(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("ownerCode", "IA5String");
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
		    this.id = new TemporaryID(coder.decodeOctetString(source));
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("id", "TemporaryID");
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
		    int idx1 = VehicleType.indexOfValue(source.decodeLong());
		    this.vehicleType = (idx1 < 0) ? VehicleType.unknownEnumerator() : VehicleType.cNamedNumbers[idx1];
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("vehicleType", "VehicleType");
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
		    this.vehicleClass = new VehicleClass();
		    {
			int indef_tags1 = 0;

			if (source.mLength < 0)
			    ++indef_tags1;
			tag = source.decodeTagLength();
			switch (tag) {
			case 0x80:
			    try {
				this.vehicleClass.setChosenFlag(VehicleClass.vGroup_chosen);
				{
				    int idx2 = com.bah.ode.asn.oss.itis.VehicleGroupAffected.indexOfValue(source.decodeLong());
				    this.vehicleClass.setChosenValue((idx2 < 0) ? com.bah.ode.asn.oss.itis.VehicleGroupAffected.unknownEnumerator() : com.bah.ode.asn.oss.itis.VehicleGroupAffected.cNamedNumbers[idx2]);
				}
			    } catch (Exception e) {
				DecoderException ee = DecoderException.wrapException(e);
				ee.appendElementContext("vGroup", "VehicleGroupAffected", 0);
				throw ee;
			    }
			    break;

			case 0x81:
			    try {
				this.vehicleClass.setChosenFlag(VehicleClass.rGroup_chosen);
				{
				    int idx2 = com.bah.ode.asn.oss.itis.ResponderGroupAffected.indexOfValue(source.decodeLong());
				    this.vehicleClass.setChosenValue((idx2 < 0) ? com.bah.ode.asn.oss.itis.ResponderGroupAffected.unknownEnumerator() : com.bah.ode.asn.oss.itis.ResponderGroupAffected.cNamedNumbers[idx2]);
				}
			    } catch (Exception e) {
				DecoderException ee = DecoderException.wrapException(e);
				ee.appendElementContext("rGroup", "ResponderGroupAffected", 0);
				throw ee;
			    }
			    break;

			case 0x82:
			    try {
				this.vehicleClass.setChosenFlag(VehicleClass.rEquip_chosen);
				{
				    int idx2 = com.bah.ode.asn.oss.itis.IncidentResponseEquipment.indexOfValue(source.decodeLong());
				    this.vehicleClass.setChosenValue((idx2 < 0) ? com.bah.ode.asn.oss.itis.IncidentResponseEquipment.unknownEnumerator() : com.bah.ode.asn.oss.itis.IncidentResponseEquipment.cNamedNumbers[idx2]);
				}
			    } catch (Exception e) {
				DecoderException ee = DecoderException.wrapException(e);
				ee.appendElementContext("rEquip", "IncidentResponseEquipment", 0);
				throw ee;
			    }
			    break;

			default:
			    source.raiseUnknownFieldException(tag);
			}
			if (indef_tags1 > 0)
			    coder.consumeEOCs(source, indef_tags1);
		    }
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("vehicleClass", "CHOICE");
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
		    ee.appendExtensionContext("VehicleIdent", -1);
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
	VehicleIdent temp0 = this;

	if (temp0.vehicleClass != null) {
	    try {
		int len1 = 0;

		switch (temp0.vehicleClass.getChosenFlag()) {
		case VehicleClass.vGroup_chosen:
		    try {
			len1 = sink.encodeLengthTag(coder.encodeEnumerated(((com.bah.ode.asn.oss.itis.VehicleGroupAffected)temp0.vehicleClass.getChosenValue()), sink), 0x80);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("vGroup", "CHOICE", 0);
			throw ee;
		    }
		    break;

		case VehicleClass.rGroup_chosen:
		    try {
			len1 = sink.encodeLengthTag(coder.encodeEnumerated(((com.bah.ode.asn.oss.itis.ResponderGroupAffected)temp0.vehicleClass.getChosenValue()), sink), 0x81);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("rGroup", "CHOICE", 0);
			throw ee;
		    }
		    break;

		case VehicleClass.rEquip_chosen:
		    try {
			len1 = sink.encodeLengthTag(coder.encodeEnumerated(((com.bah.ode.asn.oss.itis.IncidentResponseEquipment)temp0.vehicleClass.getChosenValue()), sink), 0x82);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("rEquip", "CHOICE", 0);
			throw ee;
		    }
		    break;

		default:
		    throw new EncoderException(ExceptionDescriptor._bad_choice, null);
		}
		len0 += sink.encodeLengthTag(len1, 0xA5);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("vehicleClass", "CHOICE");
		throw ee;
	    }
	}
	if (temp0.vehicleType != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeEnumerated(temp0.vehicleType, sink), 0x84);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("vehicleType", "VehicleType");
		throw ee;
	    }
	}
	if (temp0.id != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.id.byteArrayValue()), 0x83);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("id", "TemporaryID");
		throw ee;
	    }
	}
	if (temp0.ownerCode != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeString1(temp0.ownerCode, sink), 0x82);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("ownerCode", "IA5String");
		throw ee;
	    }
	}
	if (temp0.vin != null) {
	    try {
		len0 += sink.encodeLengthTag(sink.write(temp0.vin.byteArrayValue()), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("vin", "VINstring");
		throw ee;
	    }
	}
	if (temp0.name != null) {
	    try {
		len0 += sink.encodeLengthTag(coder.encodeString1(temp0.name, sink), 0x80);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("name", "DescriptiveName");
		throw ee;
	    }
	}

	return len0;
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, VehicleIdent data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.name != null);
	sink.writeBit(data.vin != null);
	sink.writeBit(data.ownerCode != null);
	sink.writeBit(data.id != null);
	sink.writeBit(data.vehicleType != null);
	sink.writeBit(data.vehicleClass != null);
	nbits += 7;
	if (data.name != null) {
	    // Encode field 'name'
	    try {
		DescriptiveName item1 = data.name;
		int len1 = item1.getSize();

		if (len1 < 1 || len1 > 63)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerKMCString.encode(coder, item1.stringValue(), 1, 63, VehicleIdent._cEPAInfo_name, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("name", "DescriptiveName");
		throw ee;
	    }
	}
	if (data.vin != null) {
	    // Encode field 'vin'
	    try {
		VINstring item1 = data.vin;
		int len1 = item1.getSize();

		if (len1 < 1 || len1 > 17)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 1, 17, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("vin", "VINstring");
		throw ee;
	    }
	}
	if (data.ownerCode != null) {
	    // Encode field 'ownerCode'
	    try {
		IA5String item1 = data.ownerCode;
		int len1 = item1.getSize();

		if (len1 < 1 || len1 > 32)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerKMCString.encode(coder, item1.stringValue(), 1, 32, VehicleIdent._cEPAInfo_ownerCode, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("ownerCode", "IA5String");
		throw ee;
	    }
	}
	if (data.id != null) {
	    // Encode field 'id'
	    try {
		TemporaryID item1 = data.id;
		int len1 = item1.getSize();

		if (len1 != 4)
		    throw new EncoderException(com.oss.util.ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 4, 4, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("id", "TemporaryID");
		throw ee;
	    }
	}
	if (data.vehicleType != null) {
	    // Encode field 'vehicleType'
	    try {
		VehicleType item1 = data.vehicleType;
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
		ee.appendFieldContext("vehicleType", "VehicleType");
		throw ee;
	    }
	}
	if (data.vehicleClass != null) {
	    // Encode field 'vehicleClass'
	    try {
		VehicleClass item1 = data.vehicleClass;

		nbits += VehicleClass.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("vehicleClass", "CHOICE");
		throw ee;
	    }
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static VehicleIdent decodeValue(PerCoder coder, InputBitStream source, VehicleIdent data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_name0 = source.readBit();
	boolean has_vin0 = source.readBit();
	boolean has_ownerCode0 = source.readBit();
	boolean has_id0 = source.readBit();
	boolean has_vehicleType0 = source.readBit();
	boolean has_vehicleClass0 = source.readBit();
    /** Decode root fields **/
	if (has_name0) {
	    // Decode field 'name'
	    try {
		data.name = new DescriptiveName(com.oss.coders.per.PerKMCString.decode(coder, source, 1, 63, VehicleIdent._cEPAInfo_name));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("name", "DescriptiveName");
		throw de;
	    }
	} else {
	    data.name = null;
	}
	if (has_vin0) {
	    // Decode field 'vin'
	    try {
		data.vin = new VINstring(com.oss.coders.per.PerOctets.decode(coder, source, 1, 17));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("vin", "VINstring");
		throw de;
	    }
	} else {
	    data.vin = null;
	}
	if (has_ownerCode0) {
	    // Decode field 'ownerCode'
	    try {
		data.ownerCode = new IA5String(com.oss.coders.per.PerKMCString.decode(coder, source, 1, 32, VehicleIdent._cEPAInfo_ownerCode));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("ownerCode", "IA5String");
		throw de;
	    }
	} else {
	    data.ownerCode = null;
	}
	if (has_id0) {
	    // Decode field 'id'
	    try {
		data.id = new TemporaryID(com.oss.coders.per.PerOctets.decode(coder, source, 4, 4));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("id", "TemporaryID");
		throw de;
	    }
	} else {
	    data.id = null;
	}
	if (has_vehicleType0) {
	    // Decode field 'vehicleType'
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
		data.vehicleType = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("vehicleType", "VehicleType");
		throw de;
	    }
	} else {
	    data.vehicleType = null;
	}
	if (has_vehicleClass0) {
	    // Decode field 'vehicleClass'
	    try {
		if (data.vehicleClass == null)
		    data.vehicleClass = new VehicleClass();
		data.vehicleClass.decodeValue(coder, source, data.vehicleClass);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("vehicleClass", "CHOICE");
		throw de;
	    }
	} else {
	    data.vehicleClass = null;
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
     * Implements JSON value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public void encodeValue(JsonCoder coder, JsonWriter sink)
	    throws IOException, EncoderException
    {
	String separator0 = null;

	sink.beginObject();
	// Encode field 'name'
	try {
	    DescriptiveName item1 = this.name;

	    if (item1 != null) {
		{
		    separator0 = ",";
		    sink.encodeKey("name");
		    coder.encodeString(item1.stringValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "name");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("name", "DescriptiveName");
	    throw ee;
	}
	// Encode field 'vin'
	try {
	    VINstring item1 = this.vin;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("vin");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "vin");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("vin", "VINstring");
	    throw ee;
	}
	// Encode field 'ownerCode'
	try {
	    IA5String item1 = this.ownerCode;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("ownerCode");
		    coder.encodeString(item1.stringValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "ownerCode");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("ownerCode", "IA5String");
	    throw ee;
	}
	// Encode field 'id'
	try {
	    TemporaryID item1 = this.id;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("id");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "id");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("id", "TemporaryID");
	    throw ee;
	}
	// Encode field 'vehicleType'
	try {
	    VehicleType item1 = this.vehicleType;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("vehicleType");
		    if (item1.isUnknownEnumerator()) {
			throw new EncoderException(com.oss.util.ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		    } else 
			sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "vehicleType");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("vehicleType", "VehicleType");
	    throw ee;
	}
	// Encode field 'vehicleClass'
	try {
	    VehicleClass item1 = this.vehicleClass;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("vehicleClass");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "vehicleClass");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("vehicleClass", "CHOICE");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public VehicleIdent decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[7];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		VehicleIdent.__Tag t_tag0 = VehicleIdent.__Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = VehicleIdent.__Tag._null_;
		switch (t_tag0) {
		    case __name:
		    // Decode field 'name'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[0])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.name = new DescriptiveName(coder.decodeString(source));
			    present0[0] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("name", "DescriptiveName");
			throw de;
		    }
		    break;
		    case __vin:
		    // Decode field 'vin'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.vin = new VINstring(coder.decodeOctetString(source));
			    present0[1] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("vin", "VINstring");
			throw de;
		    }
		    break;
		    case __ownerCode:
		    // Decode field 'ownerCode'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.ownerCode = new IA5String(coder.decodeString(source));
			    present0[2] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("ownerCode", "IA5String");
			throw de;
		    }
		    break;
		    case __id:
		    // Decode field 'id'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.id = new TemporaryID(coder.decodeOctetString(source));
			    present0[3] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("id", "TemporaryID");
			throw de;
		    }
		    break;
		    case __vehicleType:
		    // Decode field 'vehicleType'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    VehicleType temp1;

			    if (present0[4])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(VehicleType.cConstantNameList, content1);
			    if (idx1 < 0 )
				temp1 = VehicleType.unknownEnumerator();
			    else
				temp1 = VehicleType.cNamedNumbers[idx1];
			    this.vehicleType = temp1;
			    present0[4] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("vehicleType", "VehicleType");
			throw de;
		    }
		    break;
		    case __vehicleClass:
		    // Decode field 'vehicleClass'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[5])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.vehicleClass == null)
				this.vehicleClass = new VehicleClass();
			    this.vehicleClass.decodeValue(coder, source);
			    present0[5] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("vehicleClass", "CHOICE");
			throw de;
		    }
		    break;
		    default:
			coder.skipValue(source);
			break;
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    this.name = null;
	if (!present0[1])
	    this.vin = null;
	if (!present0[2])
	    this.ownerCode = null;
	if (!present0[3])
	    this.id = null;
	if (!present0[4])
	    this.vehicleType = null;
	if (!present0[5])
	    this.vehicleClass = null;
	return this;
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
	if (this.name != null) {
	    try {
		comma0 = true;
		printer.newLine(writer);
		writer.print("name ");
		printer.print(this.name, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.vin != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("vin ");
		printer.print(this.vin, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.ownerCode != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("ownerCode ");
		printer.print(this.ownerCode, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.id != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("id ");
		printer.print(this.id, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.vehicleType != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("vehicleType ");
		printer.print(this.vehicleType, writer, this.vehicleType.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.vehicleClass != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("vehicleClass ");
		{
		    switch (this.vehicleClass.getChosenFlag()) {
		    case VehicleClass.vGroup_chosen:
			try {
			    writer.print("vGroup : ");
			    printer.print(((com.bah.ode.asn.oss.itis.VehicleGroupAffected)this.vehicleClass.getChosenValue()), writer, ((com.bah.ode.asn.oss.itis.VehicleGroupAffected)this.vehicleClass.getChosenValue()).cConstantNameList);
			} catch (Exception e) {
			    printer.reportError(e, null, writer);
			}
			break;

		    case VehicleClass.rGroup_chosen:
			try {
			    writer.print("rGroup : ");
			    printer.print(((com.bah.ode.asn.oss.itis.ResponderGroupAffected)this.vehicleClass.getChosenValue()), writer, ((com.bah.ode.asn.oss.itis.ResponderGroupAffected)this.vehicleClass.getChosenValue()).cConstantNameList);
			} catch (Exception e) {
			    printer.reportError(e, null, writer);
			}
			break;

		    case VehicleClass.rEquip_chosen:
			try {
			    writer.print("rEquip : ");
			    printer.print(((com.bah.ode.asn.oss.itis.IncidentResponseEquipment)this.vehicleClass.getChosenValue()), writer, ((com.bah.ode.asn.oss.itis.IncidentResponseEquipment)this.vehicleClass.getChosenValue()).cConstantNameList);
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
	return equalTo((VehicleIdent)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((VehicleIdent)that);
    }
    
    public boolean equalTo(VehicleIdent that) {
	if (this.name != null && that.name != null) {
	    if (!this.name.equalTo(that.name))
		return false;
	}
	if (this.vin != null && that.vin != null) {
	    if (!this.vin.equalTo(that.vin))
		return false;
	}
	if (this.ownerCode != null && that.ownerCode != null) {
	    if (!this.ownerCode.equalTo(that.ownerCode))
		return false;
	}
	if (this.id != null && that.id != null) {
	    if (!this.id.equalTo(that.id))
		return false;
	}
	if (this.vehicleType != null && that.vehicleType != null) {
	    if (!this.vehicleType.equalTo(that.vehicleType))
		return false;
	}
	if (this.vehicleClass != null && that.vehicleClass != null) {
	    if (!this.vehicleClass.equalTo(that.vehicleClass))
		return false;
	}
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public VehicleIdent clone() {
	VehicleIdent copy = (VehicleIdent)super.clone();
	if (name != null) {
	    copy.name = name.clone();
	}
	if (vin != null) {
	    copy.vin = vin.clone();
	}
	if (ownerCode != null) {
	    copy.ownerCode = ownerCode.clone();
	}
	if (id != null) {
	    copy.id = id.clone();
	}
	if (vehicleType != null) {
	    copy.vehicleType = vehicleType.clone();
	}
	if (vehicleClass != null) {
	    copy.vehicleClass = vehicleClass.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.name != null ? this.name.hashCode() : 0);
	hash = 41 * hash + (this.vin != null ? this.vin.hashCode() : 0);
	hash = 41 * hash + (this.ownerCode != null ? this.ownerCode.hashCode() : 0);
	hash = 41 * hash + (this.id != null ? this.id.hashCode() : 0);
	hash = 41 * hash + (this.vehicleType != null ? this.vehicleType.hashCode() : 0);
	hash = 41 * hash + (this.vehicleClass != null ? this.vehicleClass.hashCode() : 0);
	return hash;
    }
} // End class definition for VehicleIdent
