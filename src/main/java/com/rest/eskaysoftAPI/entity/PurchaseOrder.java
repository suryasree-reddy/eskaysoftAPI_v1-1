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
@Table(name = "purchaseOrder")
public class PurchaseOrder implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "serialNumber")
	private Integer serialNumber;

	@Column(name = "orderNumber", nullable = false, length = 40)
	private Integer orderNumber;

	@Column(name = "date", nullable = false)
	private LocalDate date;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "accountInformationId", nullable = false)
	private AccountInformation accountInformationId;

	@Column(name = "remarks", length = 40)
	private String remarks;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "productId", nullable = false)
	private Product productId;

	@Column(name = "qty", nullable = false)
	private Integer qty;

	@Column(name = "rate", nullable = false)
	private Integer rate;

	@Column(name = "bFree", nullable = false)
	private Integer bFree;

	@Column(name = "bRate", nullable = false)
	private Integer bRate;

	@Column(name = "value")
	private Double value;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}

	public LocalDate getDate() {
		return this.date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public AccountInformation getAccountInformationId() {
		return this.accountInformationId;
	}

	public void setAccountInformationId(AccountInformation accountInformationId) {
		this.accountInformationId = accountInformationId;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Product getProductId() {
		return this.productId;
	}

	public void setProductId(Product productId) {
		this.productId = productId;
	}

	public Integer getQty() {
		return this.qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public Integer getRate() {
		return this.rate;
	}

	public void setRate(Integer rate) {
		this.rate = rate;
	}

	public Integer getbFree() {
		return this.bFree;
	}

	public void setbFree(Integer bFree) {
		this.bFree = bFree;
	}

	public Integer getbRate() {
		return this.bRate;
	}

	public void setbRate(Integer bRate) {
		this.bRate = bRate;
	}

	public Double getValue() {
		return this.value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Integer getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}

	
}
