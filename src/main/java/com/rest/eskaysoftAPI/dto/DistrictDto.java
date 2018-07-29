package com.rest.eskaysoftAPI.dto;

import java.io.Serializable;

public class DistrictDto implements Serializable {

	private static final long serialVersionUID = 3902197238843757008L;
	private Long districId;
	private String districtName;

	private StatesDto states;

	public Long getDistricId() {
		return districId;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	

	public StatesDto getStates() {
		return states;
	}

	public void setStates(StatesDto states) {
		this.states = states;
	}

	public void setDistricId(Long districId) {
		this.districId = districId;
	}

	

}