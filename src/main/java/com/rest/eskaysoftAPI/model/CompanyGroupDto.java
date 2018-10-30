package com.rest.eskaysoftAPI.model;

import java.io.Serializable;

public class CompanyGroupDto implements Serializable {

	private static final long serialVersionUID = 6959309821416613726L;

	private Long id;
	private String companyGroupName;
	private boolean deleteFlag;

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

	public boolean isDeleteFlag() {
		return this.deleteFlag;
	}

	public void setDeleteFlag(boolean deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

}