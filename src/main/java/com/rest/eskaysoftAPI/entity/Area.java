package com.rest.eskaysoftAPI.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "area")
public class Area implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long areaId;

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

	
	private String areaName;

}