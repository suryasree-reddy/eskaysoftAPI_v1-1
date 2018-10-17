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
@Table(name = "companies", uniqueConstraints = {
@UniqueConstraint(columnNames = {"companyCode"}),
@UniqueConstraint(columnNames = {"companyName"}),
@UniqueConstraint(columnNames = {"companyStatus"}),
@UniqueConstraint(columnNames = {"companyGroupId"}),
@UniqueConstraint(columnNames = {"companyType"})})
public class Company implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	 @Column(name = "companyCode", nullable = false, length = 20)
	private String companyCode;
	 
	 @Column(name = "companyName", nullable = false, length = 20)
	private String companyName;
	 
	 @Column(name = "companyStatus", nullable = false, length = 20)
	private String companyStatus;
	 
	 @Column(name = "invGenType", nullable = false, length = 20)
	private String invGenType;
	 
	 @Column(name = "invPrefix", nullable = false, length = 20)
	private String invPrefix;
	 
	 @Column(name = "companyType", nullable = false, length = 20)
	private String companyType;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "companyGroupId", nullable = false)
	private CompanyGroup companyGroupId;	

	
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyCode() {
		return this.companyCode;
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

	public CompanyGroup getCompanyGroupId() {
		return companyGroupId;
	}

	public void setCompanyGroupId(CompanyGroup companyGroupId) {
		this.companyGroupId = companyGroupId;
	}

	public String getCompanyStatus() {
		return this.companyStatus;
	}

	public void setCompanyStatus(String companyStatus) {
		this.companyStatus = companyStatus;
	}

	public String getInvGenType() {
		return this.invGenType;
	}

	public void setInvGenType(String invGenType) {
		this.invGenType = invGenType;
	}

	public String getInvPrefix() {
		return this.invPrefix;
	}

	public void setInvPrefix(String invPrefix) {
		this.invPrefix = invPrefix;
	}

	public String getCompanyType() {
		return this.companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	
}