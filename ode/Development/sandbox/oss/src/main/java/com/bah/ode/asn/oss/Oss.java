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
	    (byte)0x30, (byte)0x82, (byte)0x29, (byte)0xf3, (byte)0x60,
	    (byte)0x58, (byte)0x7b, (byte)0xa6, (byte)0x1f, (byte)0x99,
	    (byte)0xa6, (byte)0x10, (byte)0xb1, (byte)0xcb, (byte)0x35,
	    (byte)0x1a, (byte)0xaf, (byte)0x6c, (byte)0x0c, (byte)0x90,
	    (byte)0xe7, (byte)0xf5, (byte)0x35, (byte)0x9f, (byte)0xdf,
	    (byte)0xf5, (byte)0x78, (byte)0x93, (byte)0x70, (byte)0x48,
	    (byte)0x89, (byte)0x20, (byte)0xe6, (byte)0x93, (byte)0xdf,
	    (byte)0x5a, (byte)0x61, (byte)0x48, (byte)0x5b, (byte)0x56,
	    (byte)0xb4, (byte)0x4d, (byte)0x8c, (byte)0x96, (byte)0x9d,
	    (byte)0xa1, (byte)0x21, (byte)0x44, (byte)0xee, (byte)0x34,
	    (byte)0x53, (byte)0xdb, (byte)0x14, (byte)0x64, (byte)0x39,
	    (byte)0x1d, (byte)0x79, (byte)0x47, (byte)0x47, (byte)0xcf,
	    (byte)0xef, (byte)0xa7, (byte)0xb2, (byte)0x90, (byte)0x0c,
	    (byte)0x6c, (byte)0xaf, (byte)0x12, (byte)0x34, (byte)0x6e,
	    (byte)0x5d, (byte)0xb5, (byte)0xda, (byte)0x3c, (byte)0x75,
	    (byte)0x21, (byte)0x44, (byte)0x94, (byte)0x9b, (byte)0xb0,
	    (byte)0x4c, (byte)0x7f, (byte)0x66
	},
	"2015/05/13"
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
