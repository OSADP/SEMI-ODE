package com.bah.ode.util;

public class ByteUtils {
   public static int unsignedByteToInt(byte b) {
      return (int) b & 0xFF;
   }

   public static int unsignedByteArrayToInt(byte[] byteArray) {
      return unsignedByteArrayToInt(byteArray, 0, byteArray.length);
   }

   public static int unsignedByteArrayToInt(byte[] byteArray, int offset, int length) {
      int r = 0;
      
      int highIndex = offset + length;
      int maxIndex = (byteArray.length > Integer.BYTES ? Integer.BYTES : byteArray.length) + offset;
      
      if (highIndex > maxIndex)
         highIndex = maxIndex;
      
      for (int i = offset; i < highIndex; i++) {
         r = (r << 8) | unsignedByteToInt(byteArray[i]);
      }
      return r;
   }

   public static long unsignedByteToLong(byte b) {
      return (long) b & 0xFF;
   }

   public static long unsignedByteArrayToLong(byte[] byteArray) {
      return unsignedByteArrayToLong(byteArray, 0, byteArray.length);
   }

   public static long unsignedByteArrayToLong(byte[] byteArray, int offset, int length) {
      long r = 0;
      
      int highIndex = offset + length;
      int maxIndex = (byteArray.length > Long.BYTES ? Long.BYTES : byteArray.length) + offset;
      
      if (highIndex > maxIndex)
         highIndex = maxIndex;
      
      for (int i = offset; i < highIndex; i++) {
         r = (r << 8) | unsignedByteToLong(byteArray[i]);
      }
      return r;
   }
}
