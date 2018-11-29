package com.rest.eskaysoftAPI.model;

import java.io.Serializable;
import java.time.LocalDate;

public class GSTChallanEntryDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	
	private Long productId;
	private String productName;
	private String productcode;
	
	private String gstType;
	private String customer;
	private String gstin;
	private String dcNo;
	private String deliverTo;
	private LocalDate date;
	private Double batch;
	private LocalDate expiry;
	private Double qty;
	private Double free;
	private Double sRate;
	private Double disc;
	private Double gstp;
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
	public String getGstin() {
		return gstin;
	}
	public void setGstin(String gstin) {
		this.gstin = gstin;
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
	public Double getBatch() {
		return batch;
	}
	public void setBatch(Double batch) {
		this.batch = batch;
	}
	public LocalDate getExpiry() {
		return expiry;
	}
	public void setExpiry(LocalDate expiry) {
		this.expiry = expiry;
	}
	public Double getQty() {
		return qty;
	}
	public void setQty(Double qty) {
		this.qty = qty;
	}
	public Double getFree() {
		return free;
	}
	public void setFree(Double free) {
		this.free = free;
	}
	public Double getsRate() {
		return sRate;
	}
	public void setsRate(Double sRate) {
		this.sRate = sRate;
	}
	public Double getDisc() {
		return disc;
	}
	public void setDisc(Double disc) {
		this.disc = disc;
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
