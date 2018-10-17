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
@Table(name = "districts", uniqueConstraints = {
@UniqueConstraint(columnNames = {"districtName"})})
public class Districts implements Serializable{
	
	private static final long serialVersionUID = -6855841992822428060L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "districtName", nullable = false, length = 20)
	private String districtName;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "statesId", nullable = false)
	private States statesId;


	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDistrictName() {
		return this.districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public States getStatesId() {
		return this.statesId;
	}

	public void setStatesId(States statesId) {
		this.statesId = statesId;
	}

	
	
}
