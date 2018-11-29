package com.rest.eskaysoftAPI.model;

import java.io.Serializable;
import java.time.LocalDate;

public class PurchaseReturnsDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private Long purReturnNumber;
	private LocalDate date;
	private Long accountInformationId;
	private String supplier;
	private String remarks;
	private Long productId;
	private String productName;
	private String productcode;
	// private Boolean status;
	private String batch;
	private Double qty;
	private Integer free;
	private Double pRate;
	private Long ammount;
	private String typeheadDisplay;
	private boolean deleteFlag;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPurReturnNumber() {
		return purReturnNumber;
	}

	public void setPurReturnNumber(Long purReturnNumber) {
		this.purReturnNumber = purReturnNumber;
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

	/*
	 * public Boolean getStatus() { return status; } public void setStatus(Boolean
	 * status) { this.status = status; }
	 */

	public Double getQty() {
		return qty;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public Integer getFree() {
		return free;
	}

	public void setFree(Integer free) {
		this.free = free;
	}

	public Double getpRate() {
		return pRate;
	}

	public void setpRate(Double pRate) {
		this.pRate = pRate;
	}

	public Long getAmmount() {
		return ammount;
	}

	public void setAmmount(Long ammount) {
		this.ammount = ammount;
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
