package com.rest.eskaysoftAPI.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class DistrictsDto implements Comparable<DistrictsDto> {
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
	@Override
	public int compareTo(DistrictsDto districts) {
		
		return this.districtName.compareTo(districts.getDistrictName());
	}

}
