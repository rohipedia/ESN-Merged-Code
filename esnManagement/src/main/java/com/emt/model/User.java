package com.emt.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tblUser")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"dateCreated"},allowGetters = true)
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	
	@Column(length = 100)
	private String userName;
	
	@Column(length = 100)
	private String userEmail;
	
	private String password;
	
	private Boolean isAdmin;
	
	private Boolean isActive;
	
	@Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
	private Date dateCreated;
	
	private Boolean isResetRequested;
	
	private Boolean approveResetRequest;
	
	private Date lastLogin;

    public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	@OneToMany(mappedBy = "userForActivity",cascade = CascadeType.ALL,orphanRemoval = true)
    @JsonBackReference
    private List<ValidationJob> validationJob = new ArrayList<>();
	
	public List<ValidationJob> getValidationJob() {
		return validationJob;
	}
	
	public void setValidationJob(List<ValidationJob> validationJob) {
		this.validationJob = validationJob;
	}

	@OneToOne(mappedBy = "UserRequestValidation")
	private EsnInfo esnInfo;

    @OneToMany(mappedBy = "userClaimed",cascade = CascadeType.ALL,orphanRemoval = true)
    /*@JsonBackReference*/
    private List<EsnInfo> userClaimed = new ArrayList<>();

	public List<EsnInfo> getUserClaimed() {
		return userClaimed;
	}

	public void setUserClaimed(List<EsnInfo> userClaimed) {
		this.userClaimed = userClaimed;
	}

	public EsnInfo getEsnInfo() {
		return esnInfo;
	}
	
	public void setEsnInfo(EsnInfo esnInfo) {
		this.esnInfo = esnInfo;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Boolean getIsResetRequested() {
		return isResetRequested;
	}

	public void setIsResetRequested(Boolean isResetRequested) {
		this.isResetRequested = isResetRequested;
	}

	public Boolean getApproveResetRequest() {
		return approveResetRequest;
	}

	public void setApproveResetRequest(Boolean approveResetRequest) {
		this.approveResetRequest = approveResetRequest;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", password="
				+ password + ", isAdmin=" + isAdmin + ", isActive=" + isActive + ", dateCreated=" + dateCreated
				+ ", isResetRequested=" + isResetRequested + ", approveResetRequest=" + approveResetRequest + "]";
	}

}
