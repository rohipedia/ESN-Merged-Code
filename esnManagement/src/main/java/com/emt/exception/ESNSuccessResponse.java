package com.emt.exception;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

public class ESNSuccessResponse {
	
	private String successIndicator;
	private Date timestamp;
	@JsonUnwrapped
	private List<?> data;
	
	public List<?> getData() {
		return data;
	}
	public void setData(List<?> data) {
		this.data = data;
	}
	
	public String getSuccessIndicator() {
		return successIndicator;
	}
	public void setSuccessIndicator(String successIndicator) {
		this.successIndicator = successIndicator;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
}
