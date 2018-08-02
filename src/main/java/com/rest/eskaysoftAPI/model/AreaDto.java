package com.rest.eskaysoftAPI.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class AreaDto implements Serializable ,Comparable<AreaDto>{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long areaId;
	
	private String areaName;

	private Long businessexecutiveId;

	public Long getAreaId() {
		return this.areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

	public Long getBusinessexecutiveId() {
		return this.businessexecutiveId;
	}

	public void setBusinessexecutiveId(Long businessexecutiveId) {
		this.businessexecutiveId = businessexecutiveId;
	}

	public String getAreaName() {
		return this.areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	@Override
	public int compareTo(AreaDto area) {
		
		return this.areaName.compareTo(area.getAreaName());
	}

	
}