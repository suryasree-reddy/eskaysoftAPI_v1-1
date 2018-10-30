package com.rest.eskaysoftAPI.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "companyGroup", uniqueConstraints = { @UniqueConstraint(columnNames = { "companyGroupName" }) })
public class CompanyGroup implements Serializable {

	private static final long serialVersionUID = 6959309821416613726L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "companyGroupName", nullable = false, length = 20)
	private String companyGroupName;

	@Column(name = "deleteFlag", nullable = false)
	private boolean deleteFlag = true;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyGroupName() {
		return this.companyGroupName;
	}

	public void setCompanyGroupName(String companyGroupName) {
		this.companyGroupName = companyGroupName;
	}

	public void setDeleteFlag(boolean deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public Boolean getDeleteFlag() {
		return this.deleteFlag;
	}

	public void setDeleteFlag(Boolean deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

}