package com.rest.eskaysoftAPI.model;

import java.io.Serializable;

public class CompanyDto implements Serializable, Comparable<CompanyDto> {
	
	private static final long serialVersionUID = 655159852262403024L;
	private Long id;
	private String companyCode;
	private String companyName;
	private Long companyGroupId;
	private String companyStatus;
	private String invGenType;
	private String invPrefix;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Long getCompanyGroupId() {
		return companyGroupId;
	}
	public void setCompanyGroupId(Long companyGroupId) {
		this.companyGroupId = companyGroupId;
	}
	public String getCompanyStatus() {
		return companyStatus;
	}
	public void setCompanyStatus(String companyStatus) {
		this.companyStatus = companyStatus;
	}
	public String getInvGenType() {
		return invGenType;
	}
	public void setInvGenType(String invGenType) {
		this.invGenType = invGenType;
	}
	public String getInvPrefix() {
		return invPrefix;
	}
	public void setInvPrefix(String invPrefix) {
		this.invPrefix = invPrefix;
	}
	@Override
	public int compareTo(CompanyDto arg0) {
		return this.companyName.compareTo(arg0.getCompanyName());
	}
	
	
	

}
