package com.rest.eskaysoftAPI.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "districts")
public class Districts {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long districtId;

	private String districtName;

	private Long statesId;

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

	public Long getStatesId() {
		return this.statesId;
	}

	public void setStatesId(Long statesId) {
		this.statesId = statesId;
	}


}
