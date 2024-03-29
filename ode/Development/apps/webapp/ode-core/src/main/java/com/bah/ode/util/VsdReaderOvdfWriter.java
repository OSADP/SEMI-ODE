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
import com.bah.ode.model.OdeDataMessage;
import com.bah.ode.model.OdeVehicleDataFlat;
import com.oss.asn1.Coder;

public class VsdReaderOvdfWriter {

   private static Logger logger = Logger.getLogger(VsdReaderOvdfWriter.class
         .getName());

   public static void main(String args[]) {
      String filename = "message.dat";
      boolean allVSRs = true;
      char encoding = 'b';
      char content = 'd';
      // Process command line arguments
      if (args.length > 0) {
         for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-i")) {
               filename = new String(args[++i]);
            } else if (args[i].equals("-latest")) {
               allVSRs = false; 
            } else if (args[i].equals("-encoding")) {
               encoding = new String(args[++i]).charAt(0);
            } else if (args[i].equals("-content")) {
               content = new String(args[++i]).charAt(0);
            } else {
               System.out.println("usage: VsdReaderOvdfWriter [ -i <filename>");
               System.out.println("   -i <filename>  ");
               System.out.println("   -latest  TO only extract the latest reord "
                     + "withing a bundle");
               System.out.println("   -encoding <hex|base64>  ");
               System.out.println("   -content <d|*>  'd' The output file "
                     + "will contain a full OdeDataMessage (payload and metadata, "
                     + "else the output file will contain only the payload");
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
         
         PrintWriter ovdfOut;
         if (content == 'd') {
         ovdfOut = new PrintWriter(new PrintStream(filename
               + ".dm.ovsd.json"));
         } else {
            ovdfOut = new PrintWriter(new PrintStream(filename
                  + ".ovsd.json"));
         }
         
         int numVSDs = 0;
         int numVSRs = 0;
         int numOVDFs = 0;
         String streamId = UUID.randomUUID().toString();
         int bundleId = 0;
         

         while (scanner.hasNext()) {
            try {
               byte[] pdu;
               if (encoding == 'h')
                  pdu = CodecUtils.fromHex(scanner.nextLine());
               else
                  pdu = CodecUtils.fromBase64(scanner.nextLine());
               
               InputStream ins = new ByteArrayInputStream(pdu);
               VehSitDataMessage vsd = (VehSitDataMessage) coder.decode(ins,
                     new VehSitDataMessage());
               ins.close();
               
               List<OdeVehicleDataFlat> ovdfList;
               if (allVSRs) {
                  ovdfList = DdsMessageHandler.getLatestOvdfFromVsd(
                        vsd, vsd.getBundle().getSize(),
                        streamId, bundleId++);
               } else {
                  ovdfList = DdsMessageHandler.getLatestOvdfFromVsd(vsd, 1,
                        streamId, bundleId++);
               }
               
               for (OdeVehicleDataFlat ovdf : ovdfList) {
                  numOVDFs++;
                  numVSRs++;
                  if (content == 'd')
                     ovdfOut.println(JsonUtils.toJson(new OdeDataMessage(ovdf)));
                  else
                     ovdfOut.println(JsonUtils.toJson(ovdf));
               }

               numVSDs++;
            } catch (Exception e) {
               int errRec = numVSDs + 1;
               System.out.println("Decode Error on VSD # " + errRec + "\n" + e.getMessage());
               e.printStackTrace();
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
