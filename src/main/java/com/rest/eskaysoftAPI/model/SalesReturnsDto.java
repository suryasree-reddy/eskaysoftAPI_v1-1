package com.rest.eskaysoftAPI.model;

import java.io.Serializable;
import java.time.LocalDate;

public class SalesReturnsDto implements Serializable {

	private static final long serialVersionUID = -6855841992822428060L;

	private Long id;
	private Integer salesReturnNo;
	private Integer serialNumber;
	private LocalDate salesReturnDate;
	private Long accountInformationId;
	private String customer;
	private String gstIN;

	private String gstType;
	private String mode;

	private Long productId;
	private String productcode;
	private String productName;
	private Integer free;
	private String batch;
	private LocalDate expiry; /* ( mm-yyyy) */
	private Integer qty;
	private Integer sRate;
	private Integer disc;
	private Integer gstp;
	private boolean deleteFlag;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Integer getSalesReturnNo() {
		return this.salesReturnNo;
	}

	public void setSalesReturnNo(Integer salesReturnNo) {
		this.salesReturnNo = salesReturnNo;
	}

	public LocalDate getSalesReturnDate() {
		return this.salesReturnDate;
	}

	public void setSalesReturnDate(LocalDate salesReturnDate) {
		this.salesReturnDate = salesReturnDate;
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

	public String getGstIN() {
		return this.gstIN;
	}

	public void setGstIN(String gstIN) {
		this.gstIN = gstIN;
	}

	public String getGstType() {
		return this.gstType;
	}

	public void setGstType(String gstType) {
		this.gstType = gstType;
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public Long getProductId() {
		return this.productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductcode() {
		return this.productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getFree() {
		return this.free;
	}

	public void setFree(Integer free) {
		this.free = free;
	}

	public String getBatch() {
		return this.batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public LocalDate getExpiry() {
		return this.expiry;
	}

	public void setExpiry(LocalDate expiry) {
		this.expiry = expiry;
	}

	public Integer getQty() {
		return this.qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public Integer getsRate() {
		return this.sRate;
	}

	public void setsRate(Integer sRate) {
		this.sRate = sRate;
	}

	public Integer getDisc() {
		return this.disc;
	}

	public void setDisc(Integer disc) {
		this.disc = disc;
	}

	public Integer getGstp() {
		return this.gstp;
	}

	public void setGstp(Integer gstp) {
		this.gstp = gstp;
	}

	public boolean isDeleteFlag() {
		return this.deleteFlag;
	}

	public void setDeleteFlag(boolean deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

}
