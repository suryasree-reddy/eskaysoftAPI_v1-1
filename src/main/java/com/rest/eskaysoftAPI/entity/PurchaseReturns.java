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
@Table(name = "purchaseReturns", uniqueConstraints = { @UniqueConstraint(columnNames = { "purReturnNumber" }) })
public class PurchaseReturns implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "purReturnNumber", length = 30, nullable = false)
	private Long purReturnNumber;

	@Column(name = "date", nullable = false, length = 40)
	private LocalDate date;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "accountInformationId", nullable = false)
	private AccountInformation accountInformationId;

	@Column(name = "remarks", nullable = false, length = 40)
	private String remarks;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "productId", nullable = false)
	private Product productId;

	/*
	 * @Column(name = "status", nullable = false) private Boolean status;
	 */

	@Column(name = "batch", length = 12, nullable = false)
	private String batch;

	@Column(name = "qty", nullable = false)
	private Double qty;

	@Column(name = "free", nullable = false)
	private Integer free;

	@Column(name = "pRate", nullable = false)
	private Double pRate;

	@Column(name = "ammount", nullable = false)
	private Long ammount;

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

	public AccountInformation getAccountInformationId() {
		return accountInformationId;
	}

	public void setAccountInformationId(AccountInformation accountInformationId) {
		this.accountInformationId = accountInformationId;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Product getProductId() {
		return productId;
	}

	public void setProductId(Product productId) {
		this.productId = productId;
	}

	/*
	 * public Boolean getStatus() { return status; }
	 * 
	 * public void setStatus(Boolean status) { this.status = status; }
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

}
