package com.rest.eskaysoftAPI.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "companygroup")
public class CompanyGroup implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6959309821416613726L;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyGroup() {
		return companyGroup;
	}

	public void setCompanyGroup(String companyGroup) {
		this.companyGroup = companyGroup;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String companyGroup;

}