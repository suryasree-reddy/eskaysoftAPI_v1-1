package com.rest.eskaysoftAPI.model;

import java.io.Serializable;

public class CustomerWiseDiscountsDto implements Serializable{
	private static final long serialVersionUID = 655159852262403024L;
	private Long id;
	private Long accountInformationId;
	private Long companiId;
	private Double disc;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAccountInformationId() {
		return accountInformationId;
	}

	public void setAccountInformationId(Long accountInformationId) {
		this.accountInformationId = accountInformationId;
	}

	public Long getCompaniId() {
		return companiId;
	}

	public void setCompaniId(Long companiId) {
		this.companiId = companiId;
	}

	public Double getDisc() {
		return disc;
	}

	public void setDisc(Double disc) {
		this.disc = disc;
	}

	
}