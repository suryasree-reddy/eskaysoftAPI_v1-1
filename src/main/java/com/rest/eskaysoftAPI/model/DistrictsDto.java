package com.rest.eskaysoftAPI.model;

import java.io.Serializable;

public class DistrictsDto implements Serializable, Comparable<DistrictsDto> {
	private static final long serialVersionUID = 655159852262403024L;

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

	@Override
	public int compareTo(DistrictsDto districts) {

		return this.districtName.compareTo(districts.getDistrictName());
	}

}
