package com.rest.eskaysoftAPI.model;

import java.io.Serializable;
import java.time.LocalDate;

public class QuatationEntryDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private Integer orderNumber;
	private LocalDate date;

	private Long accountInformationId;
	private String customer;

	private String remarks;

	private Long productId;
	private String productName;
	private String productcode;
	private Integer packing;
	private Double qty;
	private Double rate;
	private Double ammount;
	private String typeheadDisplay;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductcode() {
		return productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

	public Integer getPacking() {
		return packing;
	}

	public void setPacking(Integer packing) {
		this.packing = packing;
	}

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public Double getAmmount() {
		return ammount;
	}

	public void setAmmount(Double ammount) {
		this.ammount = ammount;
	}

	public String getTypeheadDisplay() {
		return typeheadDisplay;
	}

	public void setTypeheadDisplay(String typeheadDisplay) {
		this.typeheadDisplay = typeheadDisplay;
	}

	public Long getAccountInformationId() {
		return accountInformationId;
	}

	public void setAccountInformationId(Long accountInformationId) {
		this.accountInformationId = accountInformationId;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

}
