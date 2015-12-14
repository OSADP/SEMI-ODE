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
 * Define the ASN1 Type IntersectionRecord from ASN1 Module SEMI.
 * @see Sequence
 */

public class IntersectionRecord extends Sequence {
    public com.bah.ode.asn.oss.dsrc.MapData mapData;
    public SpatRecord spatData;
    
    /**
     * The default constructor.
     */
    public IntersectionRecord()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public IntersectionRecord(com.bah.ode.asn.oss.dsrc.MapData mapData, 
		    SpatRecord spatData)
    {
	setMapData(mapData);
	setSpatData(spatData);
    }
    
    
    // Methods for field "mapData"
    public com.bah.ode.asn.oss.dsrc.MapData getMapData()
    {
	return this.mapData;
    }
    
    public void setMapData(com.bah.ode.asn.oss.dsrc.MapData mapData)
    {
	this.mapData = mapData;
    }
    
    
    // Methods for field "spatData"
    public SpatRecord getSpatData()
    {
	return this.spatData;
    }
    
    public void setSpatData(SpatRecord spatData)
    {
	this.spatData = spatData;
    }
    
    
    /**
     * Implements BER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int encodeValue(BerCoder coder, EncoderOutput sink)
	    throws EncoderException
    {
	int len0 = 0;
	IntersectionRecord temp0 = this;

	try {
	    int len1 = 0;
	    SpatRecord temp1 = temp0.spatData;

	    try {
		len1 += sink.encodeLengthTag(temp1.intersections.encodeValue(coder, sink), 0xA1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("intersections", "IntersectionState");
		throw ee;
	    }
	    try {
		len1 += sink.encodeLengthTag(temp1.timestamp.encodeValue(coder, sink), 0xA0);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("timestamp", "DDateTime");
		throw ee;
	    }
	    len0 += sink.encodeLengthTag(len1, 0xA1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("spatData", "SpatRecord");
	    throw ee;
	}
	try {
	    int len1 = 0;
	    com.bah.ode.asn.oss.dsrc.MapData temp1 = temp0.mapData;

	    try {
		len1 += sink.encodeLengthTag(sink.write(temp1.crc.byteArrayValue()), 0x87);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("crc", "MsgCRC");
		throw ee;
	    }
	    if (temp1.dataParameters != null) {
		try {
		    len1 += sink.encodeLengthTag(temp1.dataParameters.encodeValue(coder, sink), 0xA6);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("dataParameters", "DataParameters");
		    throw ee;
		}
	    }
	    if (temp1.intersections != null) {
		try {
		    int len2 = 0;
		    java.util.ArrayList<com.bah.ode.asn.oss.dsrc.Intersection_> temp2 = temp1.intersections.elements;
		    int idx2 = temp2 != null ? temp2.size() : 0;

		    try {
			while(idx2-- > 0) {
			    len2 += sink.encodeLengthTag(temp2.get(idx2).encodeValue(coder, sink), 0x30);
			}
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext(null, "SEQUENCE OF", idx2);
			throw ee;
		    }
		    len1 += sink.encodeLengthTag(len2, 0xA5);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("intersections", "SEQUENCE OF");
		    throw ee;
		}
	    }
	    if (temp1.layerID != null) {
		try {
		    len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.layerID, sink), 0x84);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("layerID", "LayerID");
		    throw ee;
		}
	    }
	    if (temp1.layerType != null) {
		try {
		    len1 += sink.encodeLengthTag(coder.encodeEnumerated(temp1.layerType, sink), 0x83);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("layerType", "LayerType");
		    throw ee;
		}
	    }
	    if (temp1.name != null) {
		try {
		    len1 += sink.encodeLengthTag(coder.encodeString1(temp1.name, sink), 0x82);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("name", "DescriptiveName");
		    throw ee;
		}
	    }
	    try {
		len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.msgCnt, sink), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msgCnt", "MsgCount");
		throw ee;
	    }
	    try {
		len1 += sink.encodeLengthTag(coder.encodeEnumerated(temp1.msgID, sink), 0x80);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msgID", "DSRCmsgID");
		throw ee;
	    }
	    len0 += sink.encodeLengthTag(len1, 0xA0);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("mapData", "MapData");
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements BER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public IntersectionRecord decodeValue(BerCoder coder, DecoderInput source)
	    throws DecoderException
    {
	int total_len0 = source.mLength;
	int end_pos0 = (total_len0 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len0);
	int tag;

	tag = source.decodeTagLength();
	if (tag != 0xA0)
	    source.raiseTagMismatchException(tag);
	try {
	    this.mapData = new com.bah.ode.asn.oss.dsrc.MapData();
	    {
		int total_len1 = source.mLength;
		int end_pos1 = (total_len1 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len1);

		do {
		    tag = source.decodeTagLength();
		    if (tag != 0x80)
			source.raiseTagMismatchException(tag);
		    try {
			int idx2 = com.bah.ode.asn.oss.dsrc.DSRCmsgID.indexOfValue(source.decodeLong());
			this.mapData.msgID = (idx2 < 0) ? com.bah.ode.asn.oss.dsrc.DSRCmsgID.unknownEnumerator() : com.bah.ode.asn.oss.dsrc.DSRCmsgID.cNamedNumbers[idx2];
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("msgID", "DSRCmsgID");
			throw ee;
		    }
		    tag = source.decodeTagLength();
		    if (tag != 0x81)
			source.raiseTagMismatchException(tag);
		    try {
			this.mapData.msgCnt = new com.bah.ode.asn.oss.dsrc.MsgCount(source.decodeLong());
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("msgCnt", "MsgCount");
			throw ee;
		    }
		    tag = source.decodeTagLength();
		    if (tag == 0x82 || tag == 0xA2) {
			try {
			    this.mapData.name = new com.bah.ode.asn.oss.dsrc.DescriptiveName(coder.decodeChars(source));
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("name", "DescriptiveName");
			    throw ee;
			}
			tag = source.decodeTagLength();
		    }
		    if (tag == 0x83) {
			try {
			    int idx2 = com.bah.ode.asn.oss.dsrc.LayerType.indexOfValue(source.decodeLong());
			    this.mapData.layerType = (idx2 < 0) ? com.bah.ode.asn.oss.dsrc.LayerType.unknownEnumerator() : com.bah.ode.asn.oss.dsrc.LayerType.cNamedNumbers[idx2];
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("layerType", "LayerType");
			    throw ee;
			}
			tag = source.decodeTagLength();
		    }
		    if (tag == 0x84) {
			try {
			    this.mapData.layerID = new com.bah.ode.asn.oss.dsrc.LayerID(source.decodeLong());
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("layerID", "LayerID");
			    throw ee;
			}
			tag = source.decodeTagLength();
		    }
		    if (tag == 0xA5) {
			try {
			    this.mapData.intersections = new com.bah.ode.asn.oss.dsrc.MapData.Intersections_();
			    {
				int total_len2 = source.mLength;
				int end_pos2 = (total_len2 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len2);
				int idx2 = 0;

				this.mapData.intersections.elements = new java.util.ArrayList<com.bah.ode.asn.oss.dsrc.Intersection_>();

				try {
				    for (;;) {
					if (source.position() >= end_pos2) {
					    if (source.position() > end_pos2)
						throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
					    break;
					}
					tag = source.decodeTagLength();
					if (tag == 0) {
					    if (total_len2 < 0) {
						if (source.mLength != 0)
						    throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);
						break;
					    }
					    if (source.mLength == 0)
						throw new DecoderException(ExceptionDescriptor._expect_tag, null);
					}
					com.bah.ode.asn.oss.dsrc.Intersection_ temp2 = new com.bah.ode.asn.oss.dsrc.Intersection_();
					this.mapData.intersections.add(temp2);
					if (tag != 0x30)
					    source.raiseTagMismatchException(tag);
					temp2.decodeValue(coder, source);
					++idx2;
				    }
				} catch (Exception e) {
				    DecoderException ee = DecoderException.wrapException(e);
				    ee.appendElementContext(null, "SEQUENCE OF", idx2);
				    throw ee;
				}
			    }
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("intersections", "SEQUENCE OF");
			    throw ee;
			}
			tag = source.decodeTagLength();
		    }
		    if (tag == 0xA6) {
			try {
			    this.mapData.dataParameters = new com.bah.ode.asn.oss.dsrc.DataParameters();
			    this.mapData.dataParameters.decodeValue(coder, source);
			} catch (Exception e) {
			    DecoderException ee = DecoderException.wrapException(e);
			    ee.appendFieldContext("dataParameters", "DataParameters");
			    throw ee;
			}
			tag = source.decodeTagLength();
		    }
		    if (tag != 0x87 && tag != 0xA7)
			source.raiseTagMismatchException(tag);
		    try {
			this.mapData.crc = new com.bah.ode.asn.oss.dsrc.MsgCRC(coder.decodeOctetString(source));
		    } catch (Exception e) {
			DecoderException ee = DecoderException.wrapException(e);
			ee.appendFieldContext("crc", "MsgCRC");
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
			    ee.appendExtensionContext("MapData", -1);
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
	    ee.appendFieldContext("mapData", "MapData");
	    throw ee;
	}
	tag = source.decodeTagLength();
	if (tag != 0xA1)
	    source.raiseTagMismatchException(tag);
	try {
	    this.spatData = new SpatRecord();
	    {
		int total_len1 = source.mLength;
		int end_pos1 = (total_len1 < 0) ? java.lang.Integer.MAX_VALUE : (source.position() + total_len1);

		tag = source.decodeTagLength();
		if (tag != 0xA0)
		    source.raiseTagMismatchException(tag);
		try {
		    this.spatData.timestamp = new com.bah.ode.asn.oss.dsrc.DDateTime();
		    this.spatData.timestamp.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("timestamp", "DDateTime");
		    throw ee;
		}
		tag = source.decodeTagLength();
		if (tag != 0xA1)
		    source.raiseTagMismatchException(tag);
		try {
		    this.spatData.intersections = new com.bah.ode.asn.oss.dsrc.IntersectionState();
		    this.spatData.intersections.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException ee = DecoderException.wrapException(e);
		    ee.appendFieldContext("intersections", "IntersectionState");
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
	    ee.appendFieldContext("spatData", "SpatRecord");
	    throw ee;
	}
	if (source.position() != end_pos0) {
	    if (total_len0 >= 0)
		throw new DecoderException(ExceptionDescriptor._inconsis_len, null);
	    tag = source.decodeTagLength();
	    if (tag != 0 || source.mLength != 0)
		throw new DecoderException(ExceptionDescriptor._non_std_eoc, null);
	}

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
	IntersectionRecord temp0 = this;

	try {
	    int len1 = 0;
	    SpatRecord temp1 = temp0.spatData;

	    try {
		len1 += sink.encodeLengthTag(temp1.intersections.encodeValue(coder, sink), 0xA1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("intersections", "IntersectionState");
		throw ee;
	    }
	    try {
		len1 += sink.encodeLengthTag(temp1.timestamp.encodeValue(coder, sink), 0xA0);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("timestamp", "DDateTime");
		throw ee;
	    }
	    len0 += sink.encodeLengthTag(len1, 0xA1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("spatData", "SpatRecord");
	    throw ee;
	}
	try {
	    int len1 = 0;
	    com.bah.ode.asn.oss.dsrc.MapData temp1 = temp0.mapData;

	    try {
		len1 += sink.encodeLengthTag(sink.write(temp1.crc.byteArrayValue()), 0x87);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("crc", "MsgCRC");
		throw ee;
	    }
	    if (temp1.dataParameters != null) {
		try {
		    len1 += sink.encodeLengthTag(temp1.dataParameters.encodeValue(coder, sink), 0xA6);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("dataParameters", "DataParameters");
		    throw ee;
		}
	    }
	    if (temp1.intersections != null) {
		try {
		    int len2 = 0;
		    java.util.ArrayList<com.bah.ode.asn.oss.dsrc.Intersection_> temp2 = temp1.intersections.elements;
		    int idx2 = temp2 != null ? temp2.size() : 0;

		    try {
			while(idx2-- > 0) {
			    len2 += sink.encodeLengthTag(temp2.get(idx2).encodeValue(coder, sink), 0x30);
			}
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext(null, "SEQUENCE OF", idx2);
			throw ee;
		    }
		    len1 += sink.encodeLengthTag(len2, 0xA5);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("intersections", "SEQUENCE OF");
		    throw ee;
		}
	    }
	    if (temp1.layerID != null) {
		try {
		    len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.layerID, sink), 0x84);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("layerID", "LayerID");
		    throw ee;
		}
	    }
	    if (temp1.layerType != null) {
		try {
		    len1 += sink.encodeLengthTag(coder.encodeEnumerated(temp1.layerType, sink), 0x83);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("layerType", "LayerType");
		    throw ee;
		}
	    }
	    if (temp1.name != null) {
		try {
		    len1 += sink.encodeLengthTag(coder.encodeString1(temp1.name, sink), 0x82);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("name", "DescriptiveName");
		    throw ee;
		}
	    }
	    try {
		len1 += sink.encodeLengthTag(coder.encodeInteger(temp1.msgCnt, sink), 0x81);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msgCnt", "MsgCount");
		throw ee;
	    }
	    try {
		len1 += sink.encodeLengthTag(coder.encodeEnumerated(temp1.msgID, sink), 0x80);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msgID", "DSRCmsgID");
		throw ee;
	    }
	    len0 += sink.encodeLengthTag(len1, 0xA0);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("mapData", "MapData");
	    throw ee;
	}

	return len0;
    }

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, IntersectionRecord data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	// Encode field 'mapData'
	try {
	    com.bah.ode.asn.oss.dsrc.MapData item1 = data.mapData;

	    nbits += (item1.encodeValue(coder, sink, item1));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("mapData", "MapData");
	    throw ee;
	}
	// Encode field 'spatData'
	try {
	    SpatRecord item1 = data.spatData;

	    nbits += SpatRecord.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("spatData", "SpatRecord");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static IntersectionRecord decodeValue(PerCoder coder, InputBitStream source, IntersectionRecord data)
	    throws IOException, DecoderException, DecodeFailedException
    {
    /** Decode root fields **/
	// Decode field 'mapData'
	try {
	    if (data.mapData == null)
		data.mapData = new com.bah.ode.asn.oss.dsrc.MapData();
	    data.mapData.decodeValue(coder, source, data.mapData);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("mapData", "MapData");
	    throw de;
	}
	// Decode field 'spatData'
	try {
	    if (data.spatData == null)
		data.spatData = new SpatRecord();
	    data.spatData.decodeValue(coder, source, data.spatData);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("spatData", "SpatRecord");
	    throw de;
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
	comma0 = true;
	try {
	    printer.newLine(writer);
	    writer.print("mapData ");
	    boolean comma1;
	    comma1 = false;
	    writer.print('{');
	    printer.indent();
	    comma1 = true;
	    try {
		printer.newLine(writer);
		writer.print("msgID ");
		printer.print(this.mapData.msgID, writer, this.mapData.msgID.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("msgCnt ");
		writer.print(this.mapData.msgCnt.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    if (this.mapData.name != null) {
		try {
		    writer.print(',');
		    printer.newLine(writer);
		    writer.print("name ");
		    printer.print(this.mapData.name, writer);
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
	    }
	    if (this.mapData.layerType != null) {
		try {
		    writer.print(',');
		    printer.newLine(writer);
		    writer.print("layerType ");
		    printer.print(this.mapData.layerType, writer, this.mapData.layerType.cConstantNameList);
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
	    }
	    if (this.mapData.layerID != null) {
		try {
		    writer.print(',');
		    printer.newLine(writer);
		    writer.print("layerID ");
		    writer.print(this.mapData.layerID.longValue());
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
	    }
	    if (this.mapData.intersections != null) {
		try {
		    writer.print(',');
		    printer.newLine(writer);
		    writer.print("intersections ");
		    {
			java.util.ArrayList<com.bah.ode.asn.oss.dsrc.Intersection_> temp2 = this.mapData.intersections.elements;
			int len2 = temp2 != null ? temp2.size() : 0;
			int idx2 = 0;

			try {
			    writer.print('{');
			    printer.indent();
			    for (idx2 = 0; idx2 < len2; idx2++){
				if (idx2 > 0)
				    writer.print(',');
				printer.newLine(writer);
				temp2.get(idx2).printValue(printer, writer);
			    }
			    printer.undent();
			    if (len2 > 0)
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
	    if (this.mapData.dataParameters != null) {
		try {
		    writer.print(',');
		    printer.newLine(writer);
		    writer.print("dataParameters ");
		    this.mapData.dataParameters.printValue(printer, writer);
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
	    }
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("crc ");
		printer.print(this.mapData.crc, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    printer.undent();
	    printer.newLine(writer);
	    writer.print('}');
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("spatData ");
	    boolean comma1;
	    comma1 = false;
	    writer.print('{');
	    printer.indent();
	    comma1 = true;
	    try {
		printer.newLine(writer);
		writer.print("timestamp ");
		this.spatData.timestamp.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("intersections ");
		this.spatData.intersections.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    printer.undent();
	    printer.newLine(writer);
	    writer.print('}');
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	printer.undent();
	printer.newLine(writer);
	writer.print('}');
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((IntersectionRecord)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((IntersectionRecord)that);
    }
    
    public boolean equalTo(IntersectionRecord that) {
	if (!this.mapData.equalTo(that.mapData))
	    return false;
	if (!this.spatData.equalTo(that.spatData))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public IntersectionRecord clone() {
	IntersectionRecord copy = (IntersectionRecord)super.clone();
	copy.mapData = mapData.clone();
	copy.spatData = spatData.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.mapData != null ? this.mapData.hashCode() : 0);
	hash = 41 * hash + (this.spatData != null ? this.spatData.hashCode() : 0);
	return hash;
    }
} // End class definition for IntersectionRecord
