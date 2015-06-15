/*******************************************************************************
 * Copyright (c) 2015 US DOT - Joint Program Office
 *
 * The Government has unlimited rights to all documents/material produced under 
 * this task order. All documents and materials, to include the source code of 
 * any software produced under this contract, shall be Government owned and the 
 * property of the Government with all rights and privileges of ownership/copyright 
 * belonging exclusively to the Government. These documents and materials may 
 * not be used or sold by the Contractor without written permission from the CO.
 * All materials supplied to the Government shall be the sole property of the 
 * Government and may not be used for any other purpose. This right does not 
 * abrogate any other Government rights.
 *
 * Contributors:
 *     Booz | Allen | Hamilton - initial API and implementation
 *******************************************************************************/
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
