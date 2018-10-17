package com.rest.eskaysoftAPI.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "area", uniqueConstraints = {
@UniqueConstraint(columnNames = {"businessExecutiveId"})})
public class Area implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "businessExecutiveId", nullable = false)
	private BusinessExecutive businessExecutiveId;
	
	@Column(name = "areaName", nullable = false, length = 20)
	private String areaName;


	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BusinessExecutive getBusinessExecutiveId() {
		return this.businessExecutiveId;
	}

	public void setBusinessExecutiveId(BusinessExecutive businessExecutiveId) {
		this.businessExecutiveId = businessExecutiveId;
	}

	public String getAreaName() {
		return this.areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

}