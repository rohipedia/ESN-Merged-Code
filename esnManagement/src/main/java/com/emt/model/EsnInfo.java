package com.emt.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "tblEsnInfo")
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="sku")
public class EsnInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int esnInfoId;
	private int storeId;
	
    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "sku")
    @JsonManagedReference
    private BridgeSKU sku;
	
	public Long getEsn18() {
		return esn18;
	}

	public void setEsn18(Long esn18) {
		this.esn18 = esn18;
	}

	public Long getEsnHex14() {
		return esnHex14;
	}

	public void setEsnHex14(Long esnHex14) {
		this.esnHex14 = esnHex14;
	}

	public Long getImei15() {
		return imei15;
	}

	public void setImei15(Long imei15) {
		this.imei15 = imei15;
	}

	@Column(nullable = true)
	private Long esn18;
	
	@Column(nullable = true)
	private Long esnHex14;
	
	@Column(nullable = true)
	private Long imei15;
	
	private Date dateRequestedValidation;

	@Column(nullable = true)
	private Date dateClaimed;
	
	@Column(columnDefinition="bit(1) default 0")
	private boolean isImported;
	private Date dateImported;
	
	@Column(columnDefinition="bit(1) default 0")
	private boolean isConsumed;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "UserRequestValidation")
	private User UserRequestValidation;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "userClaimed")
    /*@JsonManagedReference*/
	private User userClaimed;

	public User getUserClaimed() {
		return userClaimed;
	}

	public Date getDateImported() {
		return dateImported;
	}

	public void setDateImported(Date dateImported) {
		this.dateImported = dateImported;
	}

	public void setUserClaimed(User userClaimed) {
		this.userClaimed = userClaimed;
	}

	public User getUserRequestValidation() {
		return UserRequestValidation;
	}

	public void setUserRequestValidation(User userRequestValidation) {
		UserRequestValidation = userRequestValidation;
	}

	public int getEsnInfoId() {
		return esnInfoId;
	}

	public void setEsnInfoId(int esnInfoId) {
		this.esnInfoId = esnInfoId;
	}

	public BridgeSKU getSku() {
		return sku;
	}

	public void setSku(BridgeSKU sku) {
		this.sku = sku;
	}

	
	public Date getDateRequestedValidation() {
		return dateRequestedValidation;
	}

	public void setDateRequestedValidation(Date dateRequestedValidation) {
		this.dateRequestedValidation = dateRequestedValidation;
	}

	public boolean isConsumed() {
		return isConsumed;
	}

	public void setConsumed(boolean isConsumed) {
		this.isConsumed = isConsumed;
	}


	public Date getDateClaimed() {
		return dateClaimed;
	}

	public void setDateClaimed(Date date) {
		this.dateClaimed = date;
	}

	public boolean isImported() {
		return isImported;
	}

	public void setImported(boolean isImported) {
		this.isImported = isImported;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

}
