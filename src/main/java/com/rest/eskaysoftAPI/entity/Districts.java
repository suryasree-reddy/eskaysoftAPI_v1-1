package com.rest.eskaysoftAPI.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "districts")
public class Districts {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long districtId;

	private String districtName;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "statesId", nullable = false)     
	private States statesId;


	public Long getDistrictId() {
		return this.districtId;
	}

	public void setDistrictId(Long districtId) {
		this.districtId = districtId;
	}

	public String getDistrictName() {
		return this.districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public States getStatesId() {
		return this.statesId;
	}

	public void setStatesId(States statesId) {
		this.statesId = statesId;
	}

	

}
