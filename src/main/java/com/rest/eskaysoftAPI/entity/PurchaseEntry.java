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
@Table(name = "purchaseEntry")

public class PurchaseEntry implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "purchaseNumber", nullable = false)
	private Integer purchaseNumber;

	@Column(name = "purDate", nullable = false)
	private LocalDate purDate;

	@Column(name = "invoiceNumber", length = 16, nullable = false)
	private String invoiceNumber;

	@Column(name = "invoiceDate", nullable = false)
	private LocalDate invoiceDate;

	public LocalDate getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(LocalDate invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "accountInformationId", nullable = false)
	private AccountInformation accountInformationId;

	@Column(name = "mode", nullable = false)
	private String mode;

	@Column(name = "wayBill", nullable = false)
	private String wayBill;

	@Column(name = "lrNumber", nullable = false)
	private String lrNumber;

	@Column(name = "lrDate", nullable = false)
	private LocalDate lrDate;

	@Column(name = "transport", nullable = false)
	private String transport;

	@Column(name = "delvFrom", nullable = false)
	private String delvFrom;

	@Column(name = "numberOfCases", nullable = false)
	private Integer numberOfCases;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "productId", nullable = false)
	private Product productId;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "manfacturerId", nullable = false)
	private Manfacturer manfacturerId;

	@Column(name = "batch", nullable = false)
	private String batch;

	@Column(name = "expiry", nullable = false)
	private LocalDate expiry; /* ( mm-yyyy) */

	@Column(name = "qty", nullable = false)
	private Integer qty;

	@Column(name = "free", nullable = false)
	private Integer free;

	@Column(name = "purRate", nullable = false)
	private Integer purRate;

	@Column(name = "othCharges", nullable = false)
	private Integer othCharges;

	@Column(name = "grsValue", nullable = false)
	private Integer grsValue;

	@Column(name = "discount", nullable = false)
	private Integer discount;

	@Column(name = "ptd", nullable = false)
	private Integer ptd;

	@Column(name = "saleRate", nullable = false)
	private Integer saleRate;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "taxId", nullable = false)
	private Tax taxId;

	@Column(name = "mrp", nullable = false)
	private Integer mrp;

	@Column(name = "grossValue", nullable = false)
	private Integer grossValue;

	@Column(name = "discountValue", nullable = false)
	private Integer discountValue;

	@Column(name = "taxValue", nullable = false)
	private Integer taxValue;

	@Column(name = "netValue", nullable = false)
	private Integer netValue;

	@Column(name = "debitAdjustmentValue", nullable = false)
	private Integer debitAdjustmentValue;

	@Column(name = "creditAdjustmentValue", nullable = false)
	private Integer creditAdjustmentValue;

	@Column(name = "invoiceValue", nullable = false)
	private Integer invoiceValue;

	@Column(name = "remarks", nullable = false)
	private String remarks;

	@Column(name = "gstp1", nullable = false)
	private Integer gstp1;

	@Column(name = "gstp2", nullable = false)
	private Integer gstp2;

	@Column(name = "taxable1", nullable = false)
	private Integer taxable1;

	@Column(name = "taxable2", nullable = false)
	private Integer taxable2;

	@Column(name = "cgstAmt1", nullable = false)
	private Integer cgstAmt1;

	@Column(name = "cgstAmt2", nullable = false)
	private Integer cgstAmt2;

	@Column(name = "sgstAmt1", nullable = false)
	private Integer sgstAmt1;

	@Column(name = "sgstAmt2", nullable = false)
	private Integer sgstAmt2;

	@Column(name = "inGstPercent", nullable = false)
	private Integer inGstPercent;

	@Column(name = "inTaxable", nullable = false)
	private Integer inTaxable;

	@Column(name = "inCgstAmt", nullable = false)
	private Integer inCgstAmt;

	@Column(name = "inSgstAmt", nullable = false)
	private Integer inSgstAmt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getPurchaseNumber() {
		return purchaseNumber;
	}

	public void setPurchaseNumber(Integer purchaseNumber) {
		this.purchaseNumber = purchaseNumber;
	}

	public LocalDate getPurDate() {
		return purDate;
	}

	public void setPurDate(LocalDate purDate) {
		this.purDate = purDate;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public AccountInformation getAccountInformationId() {
		return accountInformationId;
	}

	public void setAccountInformationId(AccountInformation accountInformationId) {
		this.accountInformationId = accountInformationId;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getWayBill() {
		return wayBill;
	}

	public void setWayBill(String wayBill) {
		this.wayBill = wayBill;
	}

	public String getLrNumber() {
		return lrNumber;
	}

	public void setLrNumber(String lrNumber) {
		this.lrNumber = lrNumber;
	}

	public LocalDate getLrDate() {
		return lrDate;
	}

	public void setLrDate(LocalDate lrDate) {
		this.lrDate = lrDate;
	}

	public String getTransport() {
		return transport;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}

	public String getDelvFrom() {
		return delvFrom;
	}

	public void setDelvFrom(String delvFrom) {
		this.delvFrom = delvFrom;
	}

	public Integer getNumberOfCases() {
		return numberOfCases;
	}

	public void setNumberOfCases(Integer numberOfCases) {
		this.numberOfCases = numberOfCases;
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

	public Integer getFree() {
		return free;
	}

	public void setFree(Integer free) {
		this.free = free;
	}

	public Integer getPurRate() {
		return purRate;
	}

	public void setPurRate(Integer purRate) {
		this.purRate = purRate;
	}

	public Integer getOthCharges() {
		return othCharges;
	}

	public void setOthCharges(Integer othCharges) {
		this.othCharges = othCharges;
	}

	public Integer getGrsValue() {
		return grsValue;
	}

	public void setGrsValue(Integer grsValue) {
		this.grsValue = grsValue;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	public Integer getPtd() {
		return ptd;
	}

	public void setPtd(Integer ptd) {
		this.ptd = ptd;
	}

	public Integer getSaleRate() {
		return saleRate;
	}

	public void setSaleRate(Integer saleRate) {
		this.saleRate = saleRate;
	}

	public Tax getTaxId() {
		return taxId;
	}

	public void setTaxId(Tax taxId) {
		this.taxId = taxId;
	}

	public Integer getMrp() {
		return mrp;
	}

	public void setMrp(Integer mrp) {
		this.mrp = mrp;
	}

	public Integer getGrossValue() {
		return grossValue;
	}

	public void setGrossValue(Integer grossValue) {
		this.grossValue = grossValue;
	}

	public Integer getDiscountValue() {
		return discountValue;
	}

	public void setDiscountValue(Integer discountValue) {
		this.discountValue = discountValue;
	}

	public Integer getTaxValue() {
		return taxValue;
	}

	public void setTaxValue(Integer taxValue) {
		this.taxValue = taxValue;
	}

	public Integer getNetValue() {
		return netValue;
	}

	public void setNetValue(Integer netValue) {
		this.netValue = netValue;
	}

	public Integer getDebitAdjustmentValue() {
		return debitAdjustmentValue;
	}

	public void setDebitAdjustmentValue(Integer debitAdjustmentValue) {
		this.debitAdjustmentValue = debitAdjustmentValue;
	}

	public Integer getCreditAdjustmentValue() {
		return creditAdjustmentValue;
	}

	public void setCreditAdjustmentValue(Integer creditAdjustmentValue) {
		this.creditAdjustmentValue = creditAdjustmentValue;
	}

	public Integer getInvoiceValue() {
		return invoiceValue;
	}

	public void setInvoiceValue(Integer invoiceValue) {
		this.invoiceValue = invoiceValue;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Integer getGstp1() {
		return gstp1;
	}

	public void setGstp1(Integer gstp1) {
		this.gstp1 = gstp1;
	}

	public Integer getGstp2() {
		return gstp2;
	}

	public void setGstp2(Integer gstp2) {
		this.gstp2 = gstp2;
	}

	public Integer getTaxable1() {
		return taxable1;
	}

	public void setTaxable1(Integer taxable1) {
		this.taxable1 = taxable1;
	}

	public Integer getTaxable2() {
		return taxable2;
	}

	public void setTaxable2(Integer taxable2) {
		this.taxable2 = taxable2;
	}

	public Integer getCgstAmt1() {
		return cgstAmt1;
	}

	public void setCgstAmt1(Integer cgstAmt1) {
		this.cgstAmt1 = cgstAmt1;
	}

	public Integer getCgstAmt2() {
		return cgstAmt2;
	}

	public void setCgstAmt2(Integer cgstAmt2) {
		this.cgstAmt2 = cgstAmt2;
	}

	public Integer getSgstAmt1() {
		return sgstAmt1;
	}

	public void setSgstAmt1(Integer sgstAmt1) {
		this.sgstAmt1 = sgstAmt1;
	}

	public Integer getSgstAmt2() {
		return sgstAmt2;
	}

	public void setSgstAmt2(Integer sgstAmt2) {
		this.sgstAmt2 = sgstAmt2;
	}

	public Integer getInGstPercent() {
		return inGstPercent;
	}

	public void setInGstPercent(Integer inGstPercent) {
		this.inGstPercent = inGstPercent;
	}

	public Integer getInTaxable() {
		return inTaxable;
	}

	public void setInTaxable(Integer inTaxable) {
		this.inTaxable = inTaxable;
	}

	public Integer getInCgstAmt() {
		return inCgstAmt;
	}

	public void setInCgstAmt(Integer inCgstAmt) {
		this.inCgstAmt = inCgstAmt;
	}

	public Integer getInSgstAmt() {
		return inSgstAmt;
	}

	public void setInSgstAmt(Integer inSgstAmt) {
		this.inSgstAmt = inSgstAmt;
	}

	public Manfacturer getManfacturerId() {
		return manfacturerId;
	}

	public void setManfacturerId(Manfacturer manfacturerId) {
		this.manfacturerId = manfacturerId;
	}

}
