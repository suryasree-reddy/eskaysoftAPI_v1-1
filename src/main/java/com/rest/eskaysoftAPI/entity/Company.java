package com.rest.eskaysoftAPI.entity;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
  
@Entity
@Table(name = "company")
public class Company implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String companyCode;
	private String companyGroup;
	private String companyStatus;
	private String invGenType;
	private String invPrefix;
	private String companyType;
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

	public String getCompanyGroup() {
		return companyGroup;
	}

	public void setCompanyGroup(String companyGroup) {
		this.companyGroup = companyGroup;
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

	public String getCompanyType() {
		return companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

   

}