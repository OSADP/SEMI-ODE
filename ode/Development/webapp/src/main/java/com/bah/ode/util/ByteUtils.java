package com.bah.ode.util;

public class ByteUtils {
   public static int unsignedByteToInt(byte b) {
      return (int) b & 0xFF;
   }

   public static int unsignedByteArrayToInt(byte[] byteArray) {
      return unsignedByteArrayToInt(byteArray, 0, byteArray.length);
   }

   public static int unsignedByteArrayToInt(byte[] byteArray, int offset, int length) {
      int r = unsignedByteToInt(byteArray[offset]);

      for (int i = offset+1; i < offset+length; i++) {
         r = (r << 8) | unsignedByteToInt(byteArray[i]);
      }
      return r;
   }

   public static void main(String[] args) {
      byte[] b = { (byte) 0xE1, (byte) 0xA6 };

      int i = unsignedByteArrayToInt(b);

      System.out.println(i);
   }
}
