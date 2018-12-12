package com.rest.eskaysoftAPI.model;

import java.io.Serializable;
import java.time.LocalDate;

public class SalesReturnsDto implements Serializable {

	private static final long serialVersionUID = -6855841992822428060L;

	private Long id;

	private Integer salesReturnNumber;

	private LocalDate salesRetdate;

	private Long accountInformationId;
	private String customer;
	private String gstIN;

	private String gstType;
	private String mode;

	private Long productId;
	private String productcode;
	private String productName;
	private Integer Free;
	private String batch;
	private LocalDate expiry; /* ( mm-yyyy) */
	private Integer qty;
	private Integer sRate;
	private Double discount;
	private Double gstp;
	private boolean deleteFlag;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getSalesReturnNumber() {
		return salesReturnNumber;
	}

	public void setSalesReturnNumber(Integer salesReturnNumber) {
		this.salesReturnNumber = salesReturnNumber;
	}

	public LocalDate getSalesRetdate() {
		return salesRetdate;
	}

	public void setSalesRetdate(LocalDate salesRetdate) {
		this.salesRetdate = salesRetdate;
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

	public String getGstIN() {
		return gstIN;
	}

	public void setGstIN(String gstIN) {
		this.gstIN = gstIN;
	}

	public String getGstType() {
		return gstType;
	}

	public void setGstType(String gstType) {
		this.gstType = gstType;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductcode() {
		return productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getFree() {
		return Free;
	}

	public void setFree(Integer free) {
		Free = free;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public LocalDate getExpiry() {
		return expiry;
	}

	public void setExpiry(LocalDate expiry) {
		this.expiry = expiry;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public Integer getsRate() {
		return sRate;
	}

	public void setsRate(Integer sRate) {
		this.sRate = sRate;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Double getGstp() {
		return gstp;
	}

	public void setGstp(Double gstp) {
		this.gstp = gstp;
	}

	public boolean isDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(boolean deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

}
