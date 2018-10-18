package com.rest.eskaysoftAPI.model;

import java.io.Serializable;

public class DistrictsDto implements Serializable {

	private static final long serialVersionUID = 1694531969479034978L;

	private Long id;

	private String districtName;

	private Long statesId;

	private String stateName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
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
