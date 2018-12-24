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
	@Column(name = "salesReturnNo", nullable = false)
	private Integer salesReturnNo;

	@Column(name = "salesReturnDate", nullable = false)
	private LocalDate salesReturnDate;

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

	@Column(name = "batch", nullable = false, length = 12)
	private String batch;

	@Column(name = "expiry", nullable = false)
	private LocalDate expiry; /* ( mm-yyyy) */

	@Column(name = "qty", nullable = false, length = 40)
	private Integer qty;

	@Column(name = "sRate", nullable = false)
	private Integer sRate;

	@Column(name = "disc", nullable = false)
	private Integer disc;

	@Column(name = "gstp", nullable = false)
	private Integer gstp;

	@Column(name = "deleteFlag")
	private boolean deleteFlag = true;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public AccountInformation getAccountInformationId() {
		return this.accountInformationId;
	}

	public void setAccountInformationId(AccountInformation accountInformationId) {
		this.accountInformationId = accountInformationId;
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

	public Product getProductId() {
		return this.productId;
	}

	public void setProductId(Product productId) {
		this.productId = productId;
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
