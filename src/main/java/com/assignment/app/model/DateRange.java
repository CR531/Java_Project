package com.assignment.app.model;

import java.io.Serializable;

public class DateRange implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String description;	
		
	private String fromDate;	
		
	private String toDate;

	public DateRange(String description, String fromDate, String toDate) {
		super();
		this.description = description;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	@Override
	public String toString() {
		return "DateRange [description=" + description + ", fromDate=" + fromDate + ", toDate=" + toDate + "]";
	}
	
	
}
