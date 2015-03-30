package com.bah.ode.asn.hex2bin;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Hex2Bin {
	public static void main(String args[]) {
		String filename = new String("message.dat");
		// Process command line arguments
		if (args.length > 0) {
			for (int i = 0; i < args.length; i++) {
				if (args[i].equals("-i"))
					filename = new String(args[++i]);
				else {
					System.out.println("usage: Hex2Bin [ -i <filename>");
					System.out
							.println("   -i <filename>  "
									+ "convert data in <filename> from ASCI hex to binary");
					System.exit(1);
				}
			}
		}

		try {
			FileOutputStream writer = new FileOutputStream(filename + ".bin");
			Scanner scanner = new Scanner(new File(filename));
			while (scanner.hasNext()) {
				String s = scanner.next();
				char[] c = s.toCharArray();
				if (isHex(c)) {
					writer.write(hexCharToByteArray(c));
				}
			}
			scanner.close();
			writer.close();

//			FileOutputStream writer = new FileOutputStream(filename + ".bin");
//			FileReader reader = new FileReader(filename);
//
//			char[] c = new char[2];
//			while (reader.read(c) == 2) {
//				if (isHex(c)) {
//					writer.write(hexCharToByteArray(c));
//				}
//			}
//			reader.close();
//			writer.close();
			
//			FileReader reader = new FileReader(filename);
//			char[] c = new char[2];
//			List<Integer> bytes = new ArrayList<Integer>();
//			while (reader.read(c) == 2) {
//				String s = new String(c).toLowerCase();
//				c = s.toCharArray();
//				int charNum1 = (c[0] >= '0' && c[0] <= '9' ? c[0] - '0'
//						: c[0] - 'a' + 10);
//				int charNum2 = (c[1] >= '0' && c[1] <= '9' ? c[1] - '0'
//						: c[1] - 'a' + 10);
//				int byteVal = (charNum1 << 4) | charNum2;
//				bytes.add(new Integer(byteVal));
//			}
//			reader.close();

//			FileOutputStream writer = new FileOutputStream(filename + ".bin");
//			byte[] byteArray = new byte[bytes.size()];
//			for (int i = 0; i < byteArray.length; i++) {
//				byteArray[i] = bytes.get(i).byteValue();
//			}
//			writer.write(byteArray);
//			writer.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.exit(1);
		} finally {
		}
	}
	
	public static byte[] hexCharToByteArray(char[] c) {
	    int len = c.length;
	    byte[] data = new byte[len / 2];
	    for (int i = 0; i < len; i += 2) {
	        data[i / 2] = (byte) ((Character.digit(c[i], 16) << 4)
	                             + Character.digit(c[i+1], 16));
	    }
	    return data;
	}

	public static boolean isHex(char[] c) {
	    for (int i = 0; i < c.length; i++) {
	        if (Character.digit(c[i], 16) == -1)
	        	return false;
	    }
	    return true;
	}

}
