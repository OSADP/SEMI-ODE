package com.bah.ode.util;

import java.text.ParseException;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import junit.framework.TestCase;

public class DateTimeUtilsTest extends TestCase {

   public void testIsoDateTime() throws ParseException {
      ZonedDateTime expectedDate = ZonedDateTime.now(ZoneOffset.UTC);
      String sExpectedDate = DateTimeUtils.isoDateTime(expectedDate);
      String sdate = DateTimeUtils.isoDateTime(
            expectedDate.getYear(), 
            expectedDate.getMonthValue(), 
            expectedDate.getDayOfMonth(),
            expectedDate.getHour(),
            expectedDate.getMinute(),
            expectedDate.getSecond(),
            expectedDate.getNano()/1000000).format(DateTimeFormatter.ISO_ZONED_DATE_TIME);
      
      assertEquals(sExpectedDate.substring(0, 18), sdate.substring(0, 18));
      ZonedDateTime date2 = DateTimeUtils.isoDateTime("2015-11-30T16:06:15.679Z");
      assertNotNull(date2);
   }
}
