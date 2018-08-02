package com.rest.eskaysoftAPI.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class AccountOpeningsDto implements Serializable ,Comparable<AccountOpeningsDto>{
	private static final long serialVersionUID = 2099654952913091298L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String code;
	private String accountName;
	private String town;
	private String openigs;
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

	public String getOpenigs() {
		return this.openigs;
	}

	public void setOpenigs(String openigs) {
		this.openigs = openigs;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public int compareTo(AccountOpeningsDto accountopenings) {
		
		return this.accountName.compareTo(accountopenings.getAccountName());
	}

}