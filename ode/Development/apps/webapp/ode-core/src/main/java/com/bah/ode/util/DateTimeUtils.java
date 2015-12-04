package com.bah.ode.util;

import java.text.ParseException;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeUtils {

   public static String isoDateTime(ZonedDateTime zonedDateTime) {
      return zonedDateTime.format(DateTimeFormatter.ISO_ZONED_DATE_TIME);
   }
   
   public static ZonedDateTime isoDateTime(int year, int month, int dayOfMonth, 
         int hourOfDay, int minute, int second, int millisec) {
//      Calendar calendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
//      calendar.set(year, month-1, dayOfMonth, hourOfDay, minute, second);
//      calendar.add(Calendar.MILLISECOND, millisec);
//      return isoDateTime(calendar.getTime());
      return ZonedDateTime.of(year, month, dayOfMonth, 
            hourOfDay, minute, second, millisec * 1000000, 
            ZoneOffset.UTC);
   }

   public static ZonedDateTime isoDateTime(String s) throws ParseException {
      return ZonedDateTime.parse(s);
   }
}
