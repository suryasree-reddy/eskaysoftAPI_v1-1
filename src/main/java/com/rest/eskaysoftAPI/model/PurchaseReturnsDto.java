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
	private Integer free;
	private Double netRate;

	public Double getNetRate() {
		return this.netRate;
	}

	public void setNetRate(Double netRate) {
		this.netRate = netRate;
	}

	private boolean deleteFlag;
	private String batch;
	private Integer qty;

	private Double pRate;
	private Long ammount;
	private String typeheadDisplay;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPurReturnNumber() {
		return this.purReturnNumber;
	}

	public void setPurReturnNumber(Long purReturnNumber) {
		this.purReturnNumber = purReturnNumber;
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

	public String getSupplier() {
		return this.supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
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

	public String getBatch() {
		return this.batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public Integer getQty() {
		return qty;
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

	public Double getpRate() {
		return this.pRate;
	}

	public void setpRate(Double pRate) {
		this.pRate = pRate;
	}

	public Long getAmmount() {
		return this.ammount;
	}

	public void setAmmount(Long ammount) {
		this.ammount = ammount;
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

}
