package com.rest.eskaysoftAPI.model;

import java.io.Serializable;
import java.time.LocalDate;

public class PurchaseOrderDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private Integer orderNumber;
	private LocalDate date;
	private Long accountInformationId;
	private String supplier;
	private String remarks;
	private Long productId;
	private String productName;
	private String productcode;
	private Integer pack;
	private Integer qty;
	private Integer free;
	private Integer rate;
	private Integer bQty;
	private Integer bFree;
	private Integer bRate;
	private Integer value;
	private String typeheadDisplay;
	private boolean deleteFlag;
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
	public Long getAccountInformationId() {
		return accountInformationId;
	}
	public void setAccountInformationId(Long accountInformationId) {
		this.accountInformationId = accountInformationId;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
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
	public Integer getPack() {
		return pack;
	}
	public void setPack(Integer pack) {
		this.pack = pack;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public Integer getFree() {
		return free;
	}
	public void setFree(Integer free) {
		this.free = free;
	}
	public Integer getRate() {
		return rate;
	}
	public void setRate(Integer rate) {
		this.rate = rate;
	}
	public Integer getbQty() {
		return bQty;
	}
	public void setbQty(Integer bQty) {
		this.bQty = bQty;
	}
	public Integer getbFree() {
		return bFree;
	}
	public void setbFree(Integer bFree) {
		this.bFree = bFree;
	}
	public Integer getbRate() {
		return bRate;
	}
	public void setbRate(Integer bRate) {
		this.bRate = bRate;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public String getTypeheadDisplay() {
		return typeheadDisplay;
	}
	public void setTypeheadDisplay(String typeheadDisplay) {
		this.typeheadDisplay = typeheadDisplay;
	}
	public boolean isDeleteFlag() {
		return deleteFlag;
	}
	public void setDeleteFlag(boolean deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	

}
