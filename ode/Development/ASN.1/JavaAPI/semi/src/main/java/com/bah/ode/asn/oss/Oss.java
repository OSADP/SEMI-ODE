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
/* Created: Fri May 20 15:51:02 2016 */
/* ASN.1 Compiler for Java version: 6.3 */
/* ASN.1 compiler options and file names specified:
 * -toed -output com.bah.ode.asn.oss -per -uper -ber -der -root -noSampleCode
 * -messageFormat msvc
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
	    (byte)0x30, (byte)0x82, (byte)0x29, (byte)0xf3, (byte)0x31,
	    (byte)0x82, (byte)0x29, (byte)0xf3, (byte)0x9f, (byte)0xbb,
	    (byte)0xf8, (byte)0x58, (byte)0x6b, (byte)0xdf, (byte)0xc4,
	    (byte)0x18, (byte)0xc3, (byte)0x68, (byte)0xd3, (byte)0x3a,
	    (byte)0xe4, (byte)0x1d, (byte)0xc8, (byte)0x57, (byte)0x8d,
	    (byte)0x9d, (byte)0x4a, (byte)0x85, (byte)0xc8, (byte)0x0c,
	    (byte)0xd2, (byte)0x85, (byte)0xd2, (byte)0xe8, (byte)0x25,
	    (byte)0x73, (byte)0x62, (byte)0x20, (byte)0x69, (byte)0x43,
	    (byte)0x53, (byte)0x7f, (byte)0xcb, (byte)0xa4, (byte)0x67,
	    (byte)0xaa, (byte)0x44, (byte)0x85, (byte)0x37, (byte)0x58,
	    (byte)0x25, (byte)0xb3, (byte)0x40, (byte)0x82, (byte)0xb1,
	    (byte)0xa9, (byte)0xb1, (byte)0x68, (byte)0x69, (byte)0xf9,
	    (byte)0x6c, (byte)0x6f, (byte)0x65, (byte)0x91, (byte)0x41,
	    (byte)0x35, (byte)0x20, (byte)0x3c, (byte)0x50, (byte)0x84,
	    (byte)0xf3, (byte)0xb6, (byte)0x90, (byte)0x80, (byte)0xcb,
	    (byte)0x58, (byte)0x69, (byte)0xef, (byte)0x7d, (byte)0xeb,
	    (byte)0xa6, (byte)0x60, (byte)0x53, (byte)0x80, (byte)0x8b,
	    (byte)0x3b, (byte)0xd8, (byte)0x82, (byte)0x7f, (byte)0x1d,
	    (byte)0x53, (byte)0xaf, (byte)0x95, (byte)0x80, (byte)0x4c,
	    (byte)0x93, (byte)0x1f, (byte)0x6f, (byte)0x0d, (byte)0xfa,
	    (byte)0x34, (byte)0x05, (byte)0xf6, (byte)0x21, (byte)0x28,
	    (byte)0x9d, (byte)0xa9, (byte)0x1d, (byte)0x3f, (byte)0xb7,
	    (byte)0x1a, (byte)0xdb, (byte)0x83, (byte)0x5d, (byte)0xd7,
	    (byte)0x5a, (byte)0xce, (byte)0xa2, (byte)0xa4, (byte)0x9c,
	    (byte)0x10, (byte)0x37, (byte)0x14, (byte)0x76, (byte)0x3f,
	    (byte)0xd7, (byte)0x1d, (byte)0x94, (byte)0x3e, (byte)0x6e,
	    (byte)0x0a, (byte)0x1a, (byte)0x63, (byte)0x1a, (byte)0x4e,
	    (byte)0xa7, (byte)0x96, (byte)0xa1, (byte)0x2e, (byte)0x66,
	    (byte)0x1a, (byte)0x40, (byte)0xa1, (byte)0x0c, (byte)0x90,
	    (byte)0xcc, (byte)0xf4, (byte)0xb9, (byte)0x2e, (byte)0x95,
	    (byte)0x3d, (byte)0xc5, (byte)0x85, (byte)0x17, (byte)0x02,
	    (byte)0x14, (byte)0xe1, (byte)0xf5, (byte)0xd3, (byte)0x05,
	    (byte)0xf8, (byte)0x85, (byte)0x8b, (byte)0x0f, (byte)0xaa,
	    (byte)0x3f
	}
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
