package com.rest.eskaysoftAPI.model;

import java.io.Serializable;

public class DistrictsDto implements Serializable {

	private static final long serialVersionUID = 1694531969479034978L;

	private Long districtId;

	private String districtName;

	private Long statesId;
	
	private String statesName;

	public String getStatesName() {
		return this.statesName;
	}

	public void setStatesName(String statesName) {
		this.statesName = statesName;
	}

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
