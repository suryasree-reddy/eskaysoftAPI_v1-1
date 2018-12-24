package com.rest.eskaysoftAPI.model;

import java.io.Serializable;

public class DistrictsDto implements Serializable {

	private static final long serialVersionUID = 1694531969479034978L;

	private Long id;

	private String districtName;

	private Long stateId;

	private String stateName;

	private boolean deleteFlag;

	private String typeheadDisplay;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStateName() {
		return this.stateName;
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

	public Long getStateId() {
		return this.stateId;
	}

	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}

	public boolean isDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(boolean deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public String getTypeheadDisplay() {
		return typeheadDisplay;
	}

	public void setTypeheadDisplay(String typeheadDisplay) {
		this.typeheadDisplay = typeheadDisplay;
	}

}
