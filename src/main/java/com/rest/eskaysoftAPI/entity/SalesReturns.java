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

@Entity
@Table(name = "salesReturns")
public class SalesReturns implements Serializable {

	private static final long serialVersionUID = -6855841992822428060L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "salesReturnNumber", nullable = false)
	private Integer salesReturnNumber;

	@Column(name = "salesRetdate", nullable = false)
	private LocalDate salesRetdate;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "accountInformationId", nullable = false)
	private AccountInformation accountInformationId;

	@Column(name = "gstType", length = 5, nullable = false)
	private String gstType;

	@Column(name = "mode", nullable = false, length = 6)
	private String mode;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "productId", nullable = false)
	private Product productId;

	@Column(name = "batch", length = 12, nullable = false)
	private String batch;

	@Column(name = "expiry", nullable = false)
	private LocalDate expiry; /* ( mm-yyyy) */

	@Column(name = "qty", nullable = false, length = 40)
	private Integer qty;

	@Column(name = "sRate", nullable = false)
	private Integer sRate;

	@Column(name = "discount", nullable = false)
	private Double discount;

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

	public AccountInformation getAccountInformationId() {
		return accountInformationId;
	}

	public void setAccountInformationId(AccountInformation accountInformationId) {
		this.accountInformationId = accountInformationId;
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

	public Product getProductId() {
		return productId;
	}

	public void setProductId(Product productId) {
		this.productId = productId;
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
