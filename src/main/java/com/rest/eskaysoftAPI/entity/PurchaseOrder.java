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
@Table(name = "purchaseOrder", uniqueConstraints = { @UniqueConstraint(columnNames = { "orderNumber" }) })
public class PurchaseOrder implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "orderNumber", nullable = false, length = 40)
	private Integer orderNumber;

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

	@Column(name = "pack", nullable = false, length = 40)
	private String pack;

	@Column(name = "qty", nullable = false, length = 40)
	private Double qty;

	@Column(name = "free", nullable = false, length = 40)
	private Double free;

	@Column(name = "rate", nullable = false, length = 40)
	private Double rate;

	@Column(name = "bQty", nullable = false, length = 40)
	private Double bQty;

	@Column(name = "bFree", nullable = false, length = 40)
	private Integer bFree;

	@Column(name = "bRate", nullable = false, length = 40)
	private Double bRate;
	
	@Column(name = "value")
	private Double value;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
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

	public String getPack() {
		return pack;
	}

	public void setPack(String pack) {
		this.pack = pack;
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

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public Double getbQty() {
		return bQty;
	}

	public void setbQty(Double bQty) {
		this.bQty = bQty;
	}

	public Integer getbFree() {
		return bFree;
	}

	public void setbFree(Integer bFree) {
		this.bFree = bFree;
	}

	public Double getbRate() {
		return bRate;
	}

	public void setbRate(Double bRate) {
		this.bRate = bRate;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	

}
