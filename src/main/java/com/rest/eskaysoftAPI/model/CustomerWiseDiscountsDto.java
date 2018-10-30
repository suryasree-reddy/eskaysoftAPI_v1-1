package com.rest.eskaysoftAPI.model;

import java.io.Serializable;

public class CustomerWiseDiscountsDto implements Serializable {
	
	private static final long serialVersionUID = 655159852262403024L;
	private Long id;
	private Long companyId;
	private String companyName;
	private Double disc;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Double getDisc() {
		return this.disc;
	}

	public void setDisc(Double disc) {
		this.disc = disc;
	}

}