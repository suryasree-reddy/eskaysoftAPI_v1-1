package com.rest.eskaysoftAPI.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CompanyGroupDto implements Serializable,Comparable<CompanyGroupDto> {

		private static final long serialVersionUID = 6959309821416613726L;
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String companyGroup;

		Long getId() {
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

	@Override
	public int compareTo(CompanyGroupDto companygroup) {
		
		return this.companyGroup.compareTo(companygroup.getCompanyGroup());
	}

}