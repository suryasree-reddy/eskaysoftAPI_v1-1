package com.rest.eskaysoftAPI.model;

import java.io.Serializable;

public class CustomerWiseDiscountsDto implements Serializable, Comparable<CustomerWiseDiscountsDto> {
	private static final long serialVersionUID = 655159852262403024L;
	private Long id;
	private String customer;
	private String companyOption;
	private String discount;
	private String companyDiscription;
	private String disc;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCustomer() {
		return this.customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getCompanyOption() {
		return this.companyOption;
	}

	public void setCompanyOption(String companyOption) {
		this.companyOption = companyOption;
	}

	public String getDiscount() {
		return this.discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getCompanyDiscription() {
		return this.companyDiscription;
	}

	public void setCompanyDiscription(String companyDiscription) {
		this.companyDiscription = companyDiscription;
	}

	public String getDisc() {
		return this.disc;
	}

	public void setDisc(String disc) {
		this.disc = disc;
	}

	@Override
	public int compareTo(CustomerWiseDiscountsDto cus) {

		return this.customer.compareTo(cus.getCustomer());
	}

}