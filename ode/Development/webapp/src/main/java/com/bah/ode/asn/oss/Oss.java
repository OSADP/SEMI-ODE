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


package com.bah.ode.asn.oss;

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

public class Oss extends ASN1Project {

    /**
     * Initialize the pdu decoder.
     */
    private static final ProjectInfo c_projectInfo = new ProjectInfo (
	null,
	new byte[] {
	    (byte)0x0b, (byte)0x31, (byte)0xfe, (byte)0xc5, (byte)0x99,
	    (byte)0x30, (byte)0x82, (byte)0x29, (byte)0xf3, (byte)0xe0,
	    (byte)0x3a, (byte)0x52, (byte)0xa6, (byte)0xdd, (byte)0x2f,
	    (byte)0xd0, (byte)0x0c, (byte)0x4f, (byte)0xac, (byte)0x57,
	    (byte)0x9d, (byte)0x47, (byte)0x4f, (byte)0x36, (byte)0x4f,
	    (byte)0xea, (byte)0xe3, (byte)0x01, (byte)0xf6, (byte)0x3f,
	    (byte)0xa5, (byte)0x2d, (byte)0x1d, (byte)0xf2, (byte)0xbc,
	    (byte)0xd3, (byte)0x8c, (byte)0x32, (byte)0x75, (byte)0x23,
	    (byte)0xd6, (byte)0x7b, (byte)0xc2, (byte)0x67, (byte)0x3c,
	    (byte)0xa2, (byte)0xeb, (byte)0x4c, (byte)0xec, (byte)0xdd,
	    (byte)0x1f, (byte)0x81, (byte)0xbe, (byte)0x74, (byte)0x14,
	    (byte)0x7d, (byte)0xb1, (byte)0x8c, (byte)0xa2, (byte)0x53,
	    (byte)0x07, (byte)0x6d, (byte)0xb9, (byte)0x83, (byte)0x26,
	    (byte)0xb9, (byte)0x98, (byte)0xbf, (byte)0x4f, (byte)0x36,
	    (byte)0x4f, (byte)0x47, (byte)0x95, (byte)0x56, (byte)0x09,
	    (byte)0xa3, (byte)0xa9, (byte)0xac, (byte)0x8a, (byte)0xb7,
	    (byte)0x9e, (byte)0x43, (byte)0xd9, (byte)0xbb, (byte)0xbb,
	    (byte)0x86, (byte)0xb1, (byte)0x83
	},
	"2015/06/13"
    );
    
    /**
     * Get the project descriptor of 'this' object.
     */
    public ProjectInfo getProjectInfo()
    {
	return c_projectInfo;
    }
    
    private static final ASN1Project c_project = new Oss();

    /**
     * Methods for accessing Coders.
     */
    public static Coder getDefaultCoder()
    {
	return createBERCoder(c_project);
    }
    
    public static BERCoder getBERCoder()
    {
	return createBERCoder(c_project);
    }
    
    public static DERCoder getDERCoder()
    {
	return createDERCoder(c_project);
    }
    
    public static PERAlignedCoder getPERAlignedCoder()
    {
	return createPERAlignedCoder(c_project);
    }
    
    public static PERUnalignedCoder getPERUnalignedCoder()
    {
	return createPERUnalignedCoder(c_project);
    }
    
}
