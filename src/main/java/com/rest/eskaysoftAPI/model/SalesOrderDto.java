package com.rest.eskaysoftAPI.model;

import java.io.Serializable;
import java.time.LocalDate;

public class SalesOrderDto implements Serializable {

	private static final long serialVersionUID = -6855841992822428060L;

	private Long id;
	private Integer orderNumber;
	private LocalDate date;
	private Long accountInformationId;
	private String customer;
	private String town;
	private String remarks;
	private String rateType;
	private Long productId;
	private String productName;
	private String productcode;
	private Integer pack;
	private Integer qty;
	private Integer free;
	private Integer rate;
	private Integer value;
	private Double netRate;
	private String typeheadDisplay;
	private boolean deleteFlag;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}

	public LocalDate getDate() {
		return this.date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Long getAccountInformationId() {
		return this.accountInformationId;
	}

	public void setAccountInformationId(Long accountInformationId) {
		this.accountInformationId = accountInformationId;
	}

	public String getCustomer() {
		return this.customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Long getProductId() {
		return this.productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductcode() {
		return this.productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

	public Integer getPack() {
		return this.pack;
	}

	public void setPack(Integer pack) {
		this.pack = pack;
	}

	public Integer getQty() {
		return this.qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public Integer getFree() {
		return this.free;
	}

	public void setFree(Integer free) {
		this.free = free;
	}

	public Integer getRate() {
		return this.rate;
	}

	public void setRate(Integer rate) {
		this.rate = rate;
	}

	public Integer getValue() {
		return this.value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public Double getNetRate() {
		return this.netRate;
	}

	public void setNetRate(Double netRate) {
		this.netRate = netRate;
	}

	public String getTypeheadDisplay() {
		return this.typeheadDisplay;
	}

	public void setTypeheadDisplay(String typeheadDisplay) {
		this.typeheadDisplay = typeheadDisplay;
	}

	public boolean isDeleteFlag() {
		return this.deleteFlag;
	}

	public void setDeleteFlag(boolean deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public String getRateType() {
		return this.rateType;
	}

	public void setRateType(String rateType) {
		this.rateType = rateType;
	}

}
