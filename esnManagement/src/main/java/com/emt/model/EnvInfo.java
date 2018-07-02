package com.emt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tblEvnInfo")
public class EnvInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int envInfoId;
	
	@Column(length=10)
	private String envName;
	
	
	@OneToOne(mappedBy = "environment")
	private SanityScenarioInfo sanityScenarioInfo;
	
	public SanityScenarioInfo getSanityScenarioInfo() {
		return sanityScenarioInfo;
	}
	public void setSanityScenarioInfo(SanityScenarioInfo sanityScenarioInfo) {
		this.sanityScenarioInfo = sanityScenarioInfo;
	}
	public int getEnvInfoId() {
		return envInfoId;
	}
	public void setEnvInfoId(int envInfoId) {
		this.envInfoId = envInfoId;
	}
	public String getEnvName() {
		return envName;
	}
	public void setEnvName(String envName) {
		this.envName = envName;
	}
	@Override
	public String toString() {
		return "EnvInfo [envInfoId=" + envInfoId + ", envName=" + envName + "]";
	}
}
