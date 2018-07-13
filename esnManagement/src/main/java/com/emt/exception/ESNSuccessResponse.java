package com.emt.exception;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

public class ESNSuccessResponse {
	
	private String successIndicator;
	private Date timestamp;
	Map<String, Object> dataObj;
	
	public Map<String, Object> getDataObj() {
		return dataObj;
	}
	public void setDataObj(Map<String, Object> dataObj) {
		this.dataObj = dataObj;
	}
	@JsonUnwrapped
	private List<?> dataList;
	
	
	public List<?> getDataList() {
		return dataList;
	}
	public void setDataList(List<?> dataList) {
		this.dataList = dataList;
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
