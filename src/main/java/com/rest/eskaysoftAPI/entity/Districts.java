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
@Table(name = "districts", uniqueConstraints = { @UniqueConstraint(columnNames = { "districtName" }) })
public class Districts implements Serializable {

	private static final long serialVersionUID = -6855841992822428060L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "districtName", nullable = false, length = 20)
	private String districtName;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "stateId", nullable = false)
	private States stateId;

	@Column(name = "deleteFlag", nullable = false)
	private boolean deleteFlag = true;

	public boolean isDeleteFlag() {
		return this.deleteFlag;
	}

	public void setDeleteFlag(boolean deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

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

	public States getStateId() {
		return this.stateId;
	}

	public void setStateId(States stateId) {
		this.stateId = stateId;
	}

}
