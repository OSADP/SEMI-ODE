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
	    (byte)0xa7, (byte)0x60, (byte)0xa4, (byte)0x2d, (byte)0x8f,
	    (byte)0x06, (byte)0x14, (byte)0x69, (byte)0x5f, (byte)0x32,
	    (byte)0x7c, (byte)0x0b, (byte)0xe8, (byte)0x2b, (byte)0x02,
	    (byte)0xf0, (byte)0x5b, (byte)0xa6, (byte)0x9e, (byte)0x07,
	    (byte)0xe5, (byte)0xb5, (byte)0xd6, (byte)0x0f, (byte)0x1e,
	    (byte)0xc7, (byte)0x97, (byte)0xf6, (byte)0xae, (byte)0x24,
	    (byte)0x63, (byte)0xce, (byte)0xd6, (byte)0x1e, (byte)0x07,
	    (byte)0x84, (byte)0xfe, (byte)0x12, (byte)0x0f, (byte)0xca,
	    (byte)0xfc, (byte)0xb7, (byte)0x20, (byte)0x82, (byte)0xa7,
	    (byte)0xbb, (byte)0x26, (byte)0x52, (byte)0x17, (byte)0x45,
	    (byte)0x29, (byte)0x17, (byte)0x82, (byte)0xc9, (byte)0x31,
	    (byte)0x6c, (byte)0x4a, (byte)0xd7, (byte)0x4a, (byte)0x07,
	    (byte)0x44, (byte)0x4b, (byte)0x2c, (byte)0x4d, (byte)0x9a,
	    (byte)0x3b, (byte)0x81, (byte)0x1a, (byte)0x65, (byte)0x58,
	    (byte)0x9b, (byte)0x70, (byte)0xeb, (byte)0x2b, (byte)0xe1,
	    (byte)0x14, (byte)0xe5, (byte)0x5d, (byte)0x80, (byte)0xc5,
	    (byte)0xc5, (byte)0x29, (byte)0xfb, (byte)0x9c, (byte)0x80,
	    (byte)0x48, (byte)0x5b, (byte)0x6e, (byte)0x6c, (byte)0x5d,
	    (byte)0x0a, (byte)0x1b, (byte)0x6e, (byte)0x1e, (byte)0x89,
	    (byte)0xdf, (byte)0x6e, (byte)0xea, (byte)0xae, (byte)0xa2,
	    (byte)0x4f, (byte)0x8b, (byte)0x66, (byte)0xbc, (byte)0x91,
	    (byte)0xc6, (byte)0x62, (byte)0x9d, (byte)0x42, (byte)0x95,
	    (byte)0xaf, (byte)0x59, (byte)0x1a, (byte)0xae, (byte)0x78,
	    (byte)0x0c, (byte)0x24, (byte)0xad, (byte)0x87, (byte)0x8a,
	    (byte)0x03, (byte)0xcd, (byte)0xa1, (byte)0x51, (byte)0xb0,
	    (byte)0x55, (byte)0x9e, (byte)0x20, (byte)0xc6, (byte)0xf5,
	    (byte)0x01, (byte)0x88, (byte)0xdf, (byte)0xc3, (byte)0x92,
	    (byte)0xf1, (byte)0x5c, (byte)0x38, (byte)0x23, (byte)0x87,
	    (byte)0x19, (byte)0x28, (byte)0xe6, (byte)0x2f, (byte)0xa3,
	    (byte)0x65, (byte)0x5d, (byte)0x49, (byte)0xdf, (byte)0x02,
	    (byte)0xa4, (byte)0xf0, (byte)0xe0, (byte)0x43, (byte)0x00,
	    (byte)0x0a, (byte)0xc4, (byte)0x5b, (byte)0xf6, (byte)0xba,
	    (byte)0xb5, (byte)0x1f, (byte)0x91, (byte)0x99, (byte)0x30,
	    (byte)0xa2, (byte)0x31, (byte)0x7d, (byte)0x2c, (byte)0x41,
	    (byte)0xa4, (byte)0xc8, (byte)0x07, (byte)0x4e, (byte)0x83,
	    (byte)0x12, (byte)0xa7, (byte)0x02, (byte)0x2b, (byte)0xe8,
	    (byte)0x0b, (byte)0x74, (byte)0x33, (byte)0xfa, (byte)0x15,
	    (byte)0xb1, (byte)0xea, (byte)0x2a, (byte)0x47, (byte)0xd1,
	    (byte)0x7a, (byte)0xf8, (byte)0xe0, (byte)0x03, (byte)0xc5,
	    (byte)0x60, (byte)0xf0
	},
	"2016/05/28"
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
