package com.rest.eskaysoftAPI.model;

import java.io.Serializable;


public class CompanyGroupDto implements Serializable{

	private static final long serialVersionUID = 6959309821416613726L;
	
	private Long id;
	private String companyGroup;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyGroup() {
		return this.companyGroup;
	}

	public void setCompanyGroup(String companyGroup) {
		this.companyGroup = companyGroup;
	}

	

}