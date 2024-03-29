/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 6.7.4, Date: 23-Dec-2014.
 */
package com.bah.ode.asn.oss.app;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import com.bah.ode.asn.oss.Oss;
import com.bah.ode.asn.oss.dsrc.DDateTime;
import com.bah.ode.asn.oss.dsrc.Position3D;
import com.bah.ode.asn.oss.semi.FundamentalSituationalStatus;
import com.bah.ode.asn.oss.semi.VehSitDataMessage;
import com.bah.ode.asn.oss.semi.VehSitDataMessage.Bundle;
import com.bah.ode.asn.oss.semi.VehSitRecord;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.oss.asn1.Coder;
import com.oss.asn1printer.DataPrinter;

public class OssReaderJsonWriter {

	private static Logger logger = Logger.getLogger(OssReaderJsonWriter.class.getName());

	public static void main(String args[]) {
		String filename = new String("message.dat");
		boolean trace = false;
		boolean buffering = true;
		// Process command line arguments
		if (args.length > 0) {
			for (int i = 0; i < args.length; i++) {
				if (args[i].equals("-i"))
					filename = new String(args[++i]);
				else if (args[i].equals("-trace"))
					trace = true;
				else if (args[i].equals("-nobuffering"))
					buffering = false;
				else {
					System.out.println("usage: Reader [ -i <filename>");
					System.out.println("   -i <filename>  ");
					System.out.println("   -nobuffering disable I/O buffering");
					System.out.println("   -trace display trace info");
					System.exit(1);
				}
			}
		}

		Coder coder = Oss.getBERCoder();
		try {
			FileHandler handler = new FileHandler(filename + ".log", true);
			SimpleFormatter formatter = new SimpleFormatter();
			handler.setFormatter(formatter);
			logger.addHandler(handler);

			// // Create an input file stream object
			java.io.InputStream ins = buffering ?
			    new java.io.BufferedInputStream(
              			new java.io.FileInputStream(filename)) :
          				new java.io.FileInputStream(filename);

			logger.info("\n*** BER DECODING BEGIN ***\n");
			long decodeTime = System.currentTimeMillis();
			PrintWriter jsonOut = new PrintWriter(new PrintStream(filename + ".json"));
			PrintWriter printOut = new PrintWriter(new PrintStream(filename + ".print"));
			DataPrinter printer = new DataPrinter();
			int numPDUs = 0;

			Gson gson = new Gson();
			ObjectMapper mapper = new ObjectMapper();
			
			do {
				try {
					VehSitDataMessage value = (VehSitDataMessage) coder.decode(ins, new VehSitDataMessage());
					
					Bundle bundle = value.getBundle();
					
					int bSize = bundle.getSize();
					
					for (int i = 0; i < bSize; i++) {
						VehSitRecord vsr = bundle.get(i);
						DDateTime time = vsr.getTime();
						OdeDateTime dateTime = new OdeDateTime(
								time.getYear().intValue(), 
								time.getMonth().intValue(),
								time.getDay().intValue(),
								time.getHour().intValue(),
								time.getMinute().intValue(),
								time.getSecond().intValue());
						
						Position3D pos = vsr.getPos();
						Location3D location = new Location3D(
								pos.getLat().longValue(),
								pos.get_long().longValue(),
								OdeHexTool.getHex(pos.getElevation().byteArrayValue()));
						
						FundamentalSituationalStatus fund = vsr.getFundamental();
						
						VehicleSize size = new VehicleSize(
								fund.getVehSize().getWidth().intValue(),
								fund.getVehSize().getLength().intValue());
						
						OdeVehicleSituationData vsd = 
								new OdeVehicleSituationData(
										dateTime, 
										location, 
										fund.getSpeed(),
										fund.getHeading(),
										fund.getSteeringAngle(),
										fund.getAccelSet(),
										fund.getBrakes(),
										size,
										fund.getVsmEventFlag());
						numPDUs++;
//						jsonOut.println(vsd.toJson());
						jsonOut.println(gson.toJson(vsr));
//						jsonOut.println(mapper.writeValueAsString(vsr));
						if (trace)
							printer.print(value, printOut);
						
					}
				} catch (Exception e) {
					System.out.println("Decode complete.\n" + e.getMessage());
					break;
				}
			} while (true);
			ins.close();
			jsonOut.close();
			printOut.close();
			decodeTime = System.currentTimeMillis() - decodeTime;
			
			logger.info("Number of PDUs: " + numPDUs);
			logger.info("Decode Time: " + decodeTime + " ms");
			logger.info("Decode Rate: " + (int)(numPDUs / ((double)decodeTime/1000)) + " PDUs/sec");

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.exit(1);
		} finally {
		}
	}
}
