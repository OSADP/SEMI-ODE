package com.bah.ode.asn.oss.app;

public class OdeDateTime {

   private Integer year;
   private Integer month;
   private Integer day;
   private Integer hour;
   private Integer minute;
   private Integer second;
   
	public OdeDateTime() {
   }

	public OdeDateTime(Integer year, Integer month, Integer day, Integer hour,
         Integer minute, Integer second) {
	   super();
	   this.year = year;
	   this.month = month;
	   this.day = day;
	   this.hour = hour;
	   this.minute = minute;
	   this.second = second;
   }

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public Integer getDay() {
		return day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	public Integer getHour() {
		return hour;
	}

	public void setHour(Integer hour) {
		this.hour = hour;
	}

	public Integer getMinute() {
		return minute;
	}

	public void setMinute(Integer minute) {
		this.minute = minute;
	}

	public Integer getSecond() {
		return second;
	}

	public void setSecond(Integer second) {
		this.second = second;
	}

   
   
}
