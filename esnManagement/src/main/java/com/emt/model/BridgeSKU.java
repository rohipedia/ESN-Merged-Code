package com.emt.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "tblBridgeSKU")
public class BridgeSKU {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bridgeSKUId;
	
	private String sku;
	
	@Column(length = 100)
	private String device;
	
    @OneToMany(mappedBy = "sku",cascade = CascadeType.ALL,orphanRemoval = true)
    @JsonBackReference
    private List<EsnInfo> esnInfo = new ArrayList<>();

	public List<EsnInfo> getEsnInfo() {
		return esnInfo;
	}

	public void setEsnInfo(List<EsnInfo> esnInfo) {
		this.esnInfo = esnInfo;
	}

	public int getBridgeSKUId() {
		return bridgeSKUId;
	}

	public void setBridgeSKUId(int bridgeSKUId) {
		this.bridgeSKUId = bridgeSKUId;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	@Override
	public String toString() {
		return "BridgeSKU [bridgeSKUId=" + bridgeSKUId + ", sku=" + sku + ", device=" + device + "]";
	}
}
