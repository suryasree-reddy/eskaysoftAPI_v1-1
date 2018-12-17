package com.rest.eskaysoftAPI.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

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
	private Date invoiceDate;

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
	private Date lrDate;

	@Column(name = "transport", nullable = false)
	private String transport;

	@Column(name = "delvFrom", nullable = false)
	private String delvFrom;

	@Column(name = "numberOfCases", nullable = false)
	private Integer numberOfCases;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "productId", nullable = false)
	private Product productId;

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

	@Column(name = "tax", nullable = false)
	private Integer tax;

	@Column(name = "hsn", nullable = false)
	private Long hsn;

	@Column(name = "mrp", nullable = false)
	private Integer mrp;

	@Column(name = "mfgName", nullable = false)
	private String mfgName;

	@Column(name = "grossValue", nullable = false)
	private Integer grossValue;

	@Column(name = "discountValue", nullable = false)
	private Integer discountValue;

	@Column(name = "taxValue", nullable = false)
	private Integer taxValue;

	@Column(name = "netValue", nullable = false)
	private Integer netValue;

	@Column(name = "debitAdjustmentLedger", nullable = false)
	private Integer debitAdjustmentLedger;

	@Column(name = "creditAdjustmentLedger", nullable = false)
	private Integer creditAdjustmentLedger;

	@Column(name = "debitAdjustmentValue", nullable = false)
	private Integer debitAdjustmentValue;

	@Column(name = "creditAdjustmentValue", nullable = false)
	private Integer creditAdjustmentValue;

	@Column(name = "invoiceValue", nullable = false)
	private Integer invoiceValue;

	@Column(name = "remarks", nullable = false)
	private String remarks;

	@Column(name = "gstPercent", nullable = false)
	private Integer gstPercent;

	@Column(name = "taxable", nullable = false)
	private Integer taxable;

	@Column(name = "cgstAmt", nullable = false)
	private Integer cgstAmt;

	@Column(name = "sgstAmt", nullable = false)
	private Integer sgstAmt;

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

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
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

	public Date getLrDate() {
		return lrDate;
	}

	public void setLrDate(Date lrDate) {
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

	public Integer getTax() {
		return tax;
	}

	public void setTax(Integer tax) {
		this.tax = tax;
	}

	public Long getHsn() {
		return hsn;
	}

	public void setHsn(Long hsn) {
		this.hsn = hsn;
	}

	public Integer getMrp() {
		return mrp;
	}

	public void setMrp(Integer mrp) {
		this.mrp = mrp;
	}

	public String getMfgName() {
		return mfgName;
	}

	public void setMfgName(String mfgName) {
		this.mfgName = mfgName;
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

	public Integer getDebitAdjustmentLedger() {
		return debitAdjustmentLedger;
	}

	public void setDebitAdjustmentLedger(Integer debitAdjustmentLedger) {
		this.debitAdjustmentLedger = debitAdjustmentLedger;
	}

	public Integer getCreditAdjustmentLedger() {
		return creditAdjustmentLedger;
	}

	public void setCreditAdjustmentLedger(Integer creditAdjustmentLedger) {
		this.creditAdjustmentLedger = creditAdjustmentLedger;
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

	public Integer getGstPercent() {
		return gstPercent;
	}

	public void setGstPercent(Integer gstPercent) {
		this.gstPercent = gstPercent;
	}

	public Integer getTaxable() {
		return taxable;
	}

	public void setTaxable(Integer taxable) {
		this.taxable = taxable;
	}

	public Integer getCgstAmt() {
		return cgstAmt;
	}

	public void setCgstAmt(Integer cgstAmt) {
		this.cgstAmt = cgstAmt;
	}

	public Integer getSgstAmt() {
		return sgstAmt;
	}

	public void setSgstAmt(Integer sgstAmt) {
		this.sgstAmt = sgstAmt;
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

}
