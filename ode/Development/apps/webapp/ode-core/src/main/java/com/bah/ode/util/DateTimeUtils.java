package com.bah.ode.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateTimeUtils {

   public static final SimpleDateFormat isoFormant = 
         new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");

   static {
      isoFormant.setTimeZone(TimeZone.getTimeZone("UTC"));
   }
   
   public static String isoDateTime(Date date) {
      return isoFormant.format(date);
   }
   
   public static String isoDateTime(int year, int month, int dayOfMonth, 
         int hourOfDay, int minute, int second, int millisec) {
      Calendar calendar = new GregorianCalendar(year, month-1, dayOfMonth, 
            hourOfDay, minute, second);
      calendar.add(Calendar.MILLISECOND, millisec);;
      return isoDateTime(calendar.getTime());
   }
}
