package com.emt.model;

import java.util.Date;

import javax.persistence.CascadeType;
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
@Table(name = "tblValidationJob")
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="userForActivity")
public class ValidationJob {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long validationJobId;
	private Date dateForActivity;
	
	@OneToOne
    @JoinColumn(name="state", referencedColumnName="batchStateId")
    private BatchState state;
    
	private int totalEsnValidated;
	private int validEsnCount;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "userForActivity")
    @JsonManagedReference
    private User userForActivity;

	public Long getValidationJobId() {
		return validationJobId;
	}
	public void setValidationJobId(Long validationJobId) {
		this.validationJobId = validationJobId;
	}

	public User getUserForActivity() {
		return userForActivity;
	}
	public void setUserForActivity(User userForActivity) {
		this.userForActivity = userForActivity;
	}
	public Date getDateForActivity() {
		return dateForActivity;
	}
	public void setDateForActivity(Date dateForActivity) {
		this.dateForActivity = dateForActivity;
	}
	public BatchState getState() {
		return state;
	}
	public void setState(BatchState state) {
		this.state = state;
	}
	public int getTotalEsnValidated() {
		return totalEsnValidated;
	}
	public void setTotalEsnValidated(int totalEsnValidated) {
		this.totalEsnValidated = totalEsnValidated;
	}
	public int getValidEsnCount() {
		return validEsnCount;
	}
	public void setValidEsnCount(int validEsnCount) {
		this.validEsnCount = validEsnCount;
	}
	@Override
	public String toString() {
		return "ValidationJob [validationJobId=" + validationJobId + ", userForActivity=" + userForActivity
				+ ", dateForActivity=" + dateForActivity + ", state=" + state + ", totalEsnValidated="
				+ totalEsnValidated + ", validEsnCount=" + validEsnCount + "]";
	}
	
}
