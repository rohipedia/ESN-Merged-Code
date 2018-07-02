package com.emt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tblBatchState")
public class BatchState {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int batchStateId;
	
	@Column(length=10)
	private String state;

	public int getBatchStateId() {
		return batchStateId;
	}

	public void setBatchStateId(int batchStateId) {
		this.batchStateId = batchStateId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "BatchState [batchStateId=" + batchStateId + ", state=" + state + "]";
}

}