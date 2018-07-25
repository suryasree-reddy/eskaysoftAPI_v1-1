package com.rest.eskaysoftAPI.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customerWiseDiscounts")
public class CustomerWiseDiscounts implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long customerWiseDiscountsId;
	private String customer;
	private String companyOption;
	private String discount;
	private String companyDiscription;
	private String disc;
	
	public Long getId() {
		return customerWiseDiscountsId;
	}

	public void setId(Long id) {
		customerWiseDiscountsId = id;
	}

	public Long getCustomerWiseDiscountsId() {
		return customerWiseDiscountsId;
	}

	public void setCustomerWiseDiscountsId(Long customerWiseDiscountsId) {
		this.customerWiseDiscountsId = customerWiseDiscountsId;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getCompanyOption() {
		return companyOption;
	}

	public void setCompanyOption(String companyOption) {
		this.companyOption = companyOption;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getCompanyDiscription() {
		return companyDiscription;
	}

	public void setCompanyDiscription(String companyDiscription) {
		this.companyDiscription = companyDiscription;
	}

	public String getDisc() {
		return disc;
	}

	public void setDisc(String disc) {
		this.disc = disc;
	}

}