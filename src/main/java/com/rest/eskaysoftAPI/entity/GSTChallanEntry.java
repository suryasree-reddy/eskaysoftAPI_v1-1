package com.rest.eskaysoftAPI.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "gSTChallanEntry", uniqueConstraints = { @UniqueConstraint(columnNames = { "dcNo" }) })
public class GSTChallanEntry implements Serializable {

	private static final long serialVersionUID = -6855841992822428060L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "gstType", nullable = false)
	private String gstType;

	@Column(name = "customer", nullable = false)
	private String customer;

	@Column(name = "gstin", nullable = false, length = 16)
	private String gstin;

	@Column(name = "dcNo", nullable = false)
	private String dcNo;

	@Column(name = "deliverTo", nullable = false)
	private String deliverTo;

	@Column(name = "date", nullable = false)
	private LocalDate date;

	@Column(name = "mode", nullable = false)
	private String mode;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "productId", nullable = false)
	private Product productId;

	@Column(name = "batch", length = 12, nullable = false)
	private String batch;

	@Column(name = "expiry", nullable = false)
	private LocalDate expiry;

	@Column(name = "qty", nullable = false)
	private Double qty;

	@Column(name = "free", nullable = false)
	private Double free;

	@Column(name = "sRate", nullable = false)
	private Double sRate;

	@Column(name = "disc", nullable = false)
	private Double disc;

	@Column(name = "gstp", nullable = false)
	private Double gstp;

	@Column(name = "deleteFlag", nullable = false)
	private boolean deleteFlag = true;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public Product getProductId() {
		return productId;
	}

	public void setProductId(Product productId) {
		this.productId = productId;
	}

	public String getBatch() {
		return batch;
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
