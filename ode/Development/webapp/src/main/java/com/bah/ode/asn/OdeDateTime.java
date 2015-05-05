package com.bah.ode.asn;

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

	public OdeDateTime setYear(Integer year) {
		this.year = year;
		return this;
	}

	public Integer getMonth() {
		return month;
	}

	public OdeDateTime setMonth(Integer month) {
		this.month = month;
		return this;
	}

	public Integer getDay() {
		return day;
	}

	public OdeDateTime setDay(Integer day) {
		this.day = day;
		return this;
	}

	public Integer getHour() {
		return hour;
	}

	public OdeDateTime setHour(Integer hour) {
		this.hour = hour;
		return this;
	}

	public Integer getMinute() {
		return minute;
	}

	public OdeDateTime setMinute(Integer minute) {
		this.minute = minute;
		return this;
	}

	public Integer getSecond() {
		return second;
	}

	public OdeDateTime setSecond(Integer second) {
		this.second = second;
		return this;
	}

   
   
}
