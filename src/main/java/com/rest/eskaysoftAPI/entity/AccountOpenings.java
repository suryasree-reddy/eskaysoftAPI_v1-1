package com.rest.eskaysoftAPI.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "AccountOpenings",uniqueConstraints = { @UniqueConstraint(columnNames = {"code", "accountName","opening"})})
public class AccountOpenings implements Serializable {
	private static final long serialVersionUID = 2099654952913091298L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "AccountOpeningId", length = 20)
	private Long id;
	
	@Column(name = "code", length = 6, nullable = false)
	private String code;
		
	@Column(name = "accountName", length = 40, nullable = false)
	private String accountName;
	
	@Column(name = "town", length = 20, nullable = false)
	private String town;
	
	@Column(name = "opening", nullable = false)
	private Double opening;
	
	@Column(name = "type", length = 8, nullable = false)
	private String type;

	public Long getId() {
		return this.id;
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

	public Double getOpening() {
		return this.opening;
	}

	public void setOpening(Double opening) {
		this.opening = opening;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}