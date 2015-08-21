package com.bah.ode.util;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import com.bah.ode.asn.oss.Oss;
import com.bah.ode.asn.oss.semi.VehSitDataMessage;
import com.bah.ode.dds.client.ws.DdsMessageHandler;
import com.bah.ode.model.OdeVehicleDataFlat;
import com.oss.asn1.Coder;

public class VsdReaderOvdfWriter {

   private static Logger logger = Logger.getLogger(VsdReaderOvdfWriter.class
         .getName());

   public static void main(String args[]) {
      String filename = new String("message.dat");
      boolean allVSRs = true;
      // Process command line arguments
      if (args.length > 0) {
         for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-i"))
               filename = new String(args[++i]);
            else if (args[i].equals("-latest")) {
               allVSRs = false; 
            } else {
               System.out.println("usage: Reader [ -i <filename>");
               System.out.println("   -i <filename>  ");
               System.out.println("   -latest  ");
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

         logger.info("\n*** BER DECODING BEGIN ***\n");
         long decodeTime = System.currentTimeMillis();
         Scanner scanner = new Scanner(new File(filename));
         PrintWriter ovdfOut = new PrintWriter(new PrintStream(filename
               + ".ovdf"));

         int numVSDs = 0;
         int numVSRs = 0;
         int numOVDFs = 0;
         String serialIdPrefix = UUID.randomUUID().toString();

         while (scanner.hasNext()) {
            try {
               byte[] pdu = CodecUtils.fromHex(scanner.nextLine());
               InputStream ins = new ByteArrayInputStream(pdu);
               VehSitDataMessage vsd = (VehSitDataMessage) coder.decode(ins,
                     new VehSitDataMessage());
               ins.close();
               
               List<OdeVehicleDataFlat> ovdfList;
               if (allVSRs) {
                  ovdfList = DdsMessageHandler.getLatestOvdfFromVsd(
                        vsd, vsd.getBundle().getSize(),
                        serialIdPrefix);
               } else {
                  ovdfList = DdsMessageHandler.getLatestOvdfFromVsd(vsd, 1,
                        serialIdPrefix);
               }
               
               for (OdeVehicleDataFlat ovdf : ovdfList) {
                  numVSRs++;
                  ovdfOut.println(JsonUtils.toJson(ovdf));
               }

               numOVDFs++;
               numVSDs++;
            } catch (Exception e) {
               System.out.println("Decode complete.\n" + e.getMessage());
               break;
            }
         }
         scanner.close();
         ovdfOut.close();
         decodeTime = System.currentTimeMillis() - decodeTime;

         logger.info("Number of VSDs: " + numVSDs);
         logger.info("Number of VSRs: " + numVSRs);
         logger.info("Number of OVDFs: " + numOVDFs);
         logger.info("Decode Time: " + decodeTime + " ms");
         logger.info("Decode Rate: "
               + (int) (numVSDs / ((double) decodeTime / 1000)) + " PDUs/sec");

      } catch (Exception e) {
         System.out.println(e.getMessage());
         e.printStackTrace();
         System.exit(1);
      } finally {
      }
   }
}
