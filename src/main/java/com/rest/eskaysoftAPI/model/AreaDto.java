package com.rest.eskaysoftAPI.model;

import java.io.Serializable;

public class AreaDto implements Serializable {

	private static final long serialVersionUID = 655159852262403024L;

	private Long areaId;

	private String areaName;

	private Long businessExecutiveId;
	
	private String businessExecutiveName;

	public Long getAreaId() {
		return this.areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
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

	

}