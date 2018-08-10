package com.rest.eskaysoftAPI.model;

import java.io.Serializable;

public class AccountOpeningsDto implements Serializable {
	private static final long serialVersionUID = 655159852262403024L;

	private Long id;
	private String code;
	private String accountName;
	private String town;
	private String openig;
	private String type;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getTown() {
		return this.town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getOpenig() {
		return this.openig;
	}

	public void setOpenig(String openig) {
		this.openig = openig;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}


}