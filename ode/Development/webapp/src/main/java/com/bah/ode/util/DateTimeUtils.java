package com.bah.ode.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTimeUtils {

   public static final SimpleDateFormat isoFormant = 
         new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
   
   public static String isoDateTime(Date date) {
      return isoFormant.format(date);
   }
   
   public static String isoDateTime(int year, int month, int dayOfMonth, 
         int hourOfDay, int minute, int second, int millisec) {
      Calendar calendar = new GregorianCalendar(year, month, dayOfMonth, 
            hourOfDay, minute, second);
      calendar.add(Calendar.MILLISECOND, millisec);;
      return isoDateTime(calendar.getTime());
   }
}
