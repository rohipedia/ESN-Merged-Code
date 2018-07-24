package com.emt.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tblExcelDump")
public class ExcelDump {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long excelDumpId;
	
	@Column(length = 10)
	private String storeId;
	
	@Column(length = 20)
	private String sku;
	
	@Column(length = 50)
	private String esn18;
	
	@Column(length = 20)
	private String esnHex14;
	
	@Column(length = 20)
	private String imei15;
	
	private Date dateCreated;
	
	public String getEsn18() {
		return esn18;
	}
	public void setEsn18(String esn18) {
		this.esn18 = esn18;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getEsnHex14() {
		return esnHex14;
	}
	public void setEsnHex14(String esnHEX14) {
		this.esnHex14 = esnHEX14;
	}
	public String getImei15() {
		return imei15;
	}
	public void setImei15(String imei15) {
		this.imei15 = imei15;
	}
	@Override
	public String toString() {
		return "ExcelDump [excelDumpId=" + excelDumpId + ", storeId=" + storeId + ", sku=" + sku + ", esn18=" + esn18
				+ ", esnHEX14=" + esnHex14 + ", imei15=" + imei15 + ", dateCreated=" + dateCreated + "]";
	}
	
	}
