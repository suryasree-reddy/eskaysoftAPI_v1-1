package com.rest.eskaysoftAPI.model;

import java.io.Serializable;
import java.time.LocalDate;

public class GSTChallanEntryDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private Long productId;
	private String productName;
	private String productcode;
	private Long accountInformationId;
	private String gstType;
	private String customer;
	private String gstIN;
	private String dcNo;
	private String mode;
	private String deliverTo;
	private LocalDate date;
	private String batch;
	private LocalDate expiry;
	private Integer qty;
	private Integer free;
	private Integer sRate;
	private Integer disc;
	private Integer gstp;
	private boolean deleteFlag;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
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

	public Long getAccountInformationId() {
		return accountInformationId;
	}

	public void setAccountInformationId(Long accountInformationId) {
		this.accountInformationId = accountInformationId;
	}

	public String getGstType() {
		return gstType;
	}

	public void setGstType(String gstType) {
		this.gstType = gstType;
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

	public String getDcNo() {
		return dcNo;
	}

	public void setDcNo(String dcNo) {
		this.dcNo = dcNo;
	}

	public String getDeliverTo() {
		return deliverTo;
	}

	public void setDeliverTo(String deliverTo) {
		this.deliverTo = deliverTo;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
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

	public Integer getFree() {
		return free;
	}

	public void setFree(Integer free) {
		this.free = free;
	}

	public Integer getsRate() {
		return sRate;
	}

	public void setsRate(Integer sRate) {
		this.sRate = sRate;
	}

	public Integer getDisc() {
		return disc;
	}

	public void setDisc(Integer disc) {
		this.disc = disc;
	}

	public Integer getGstp() {
		return gstp;
	}

	public void setGstp(Integer gstp) {
		this.gstp = gstp;
	}

	public boolean isDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(boolean deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

}
