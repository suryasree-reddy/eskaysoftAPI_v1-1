package com.rest.eskaysoftAPI.model;

import java.io.Serializable;

public class AreaDto implements Serializable {

	private static final long serialVersionUID = 655159852262403024L;

	private Long id;

	private String areaName;

	private Long businessExecutiveId;

	private String businessExecutiveName;

	private boolean deleteFlag = true;

	private String typeheadDisplay;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBusinessExecutiveId() {
		return businessExecutiveId;
	}

	public void setBusinessExecutiveId(Long businessExecutiveId) {
		this.businessExecutiveId = businessExecutiveId;
	}

	public String getAreaName() {
		return this.areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getBusinessExecutiveName() {
		return this.businessExecutiveName;
	}

	public void setBusinessExecutiveName(String businessExecutiveName) {
		this.businessExecutiveName = businessExecutiveName;
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