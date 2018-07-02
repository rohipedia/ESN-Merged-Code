package com.emt.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tblSanityScenarioInfo")
public class SanityScenarioInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sanityScenarioId;

	@Column(length = 100)
	private String scenario;
	
	@Lob
	@Column
	private String scenarioDetails;

	@Column(length = 50)
	private String assignee;
	
	@Column(length = 10)
	private String status;
	
	@Column(length = 1000)//journeyId : (nVarchar(1000))
	private String journeyId;
	
	private Long transactionNo;
	
	@Column(length = 1000)
	private String comments;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "environment")
	private EnvInfo environment;

	// private String environment;

	public EnvInfo getEnvironment() {
		return environment;
	}

	public void setEnvironment(EnvInfo environment) {
		this.environment = environment;
	}

	public int getSanityScenarioId() {
		return sanityScenarioId;
	}

	public void setSanityScenarioId(int sanityScenarioId) {
		this.sanityScenarioId = sanityScenarioId;
	}

	public String getScenario() {
		return scenario;
	}

	public void setScenario(String scenario) {
		this.scenario = scenario;
	}

	public String getScenarioDetails() {
		return scenarioDetails;
	}

	public void setScenarioDetails(String scenarioDetails) {
		this.scenarioDetails = scenarioDetails;
	}

	public String getAssignee() {
		return assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getJourneyId() {
		return journeyId;
	}

	public void setJourneyId(String journeyId) {
		this.journeyId = journeyId;
	}

	public Long getTransactionNo() {
		return transactionNo;
	}

	public void setTransactionNo(Long transactionNo) {
		this.transactionNo = transactionNo;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "SanityScenarioInfo [sanityScenarioId=" + sanityScenarioId + ", scenario=" + scenario
				+ ", scenario_details=" + scenarioDetails + ", assignee=" + assignee + ", status=" + status
				+ ", journeyId=" + journeyId + ", transactionNo=" + transactionNo + ", comments=" + comments + "]";

	}

}
