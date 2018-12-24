package com.rest.eskaysoftAPI.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

public class PurchaseEntryDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;

	private Integer purchaseNumber;

	private LocalDate purDate;

	private String invoiceNumber;

	private Date invoiceDate;

	private Long accountInformationId;
	private String supplier;
	private String gstIN;
	private Long hsnCode;
	private Long stateCode;
	private String mode;
	private String debitAdjustmentLedger;
	private String creditAdjustmentLedger;

	private String wayBill;

	private String lrNumber;

	private LocalDate lrDate;

	private String transport;

	private String delvFrom;

	private Integer numberOfCases;

	private Long productId;
	private String productcode;
	private String productName;

	private String batch;

	private LocalDate expiry; /* ( mm-yyyy) */

	private Integer qty;

	private Integer free;

	private Integer purRate;

	private Integer othCharges;

	private Integer grsValue;

	private Integer discount;

	private Integer ptd;

	private Integer saleRate;

	private Long taxId;
	private Long tax;

	private Integer mrp;

	private Long macfacturerId;
	private String manfacturerName;

	private Integer grossValue;

	private Integer discountValue;

	private Integer taxValue;

	private Integer netValue;

	private Integer debitAdjustmentValue;

	private Integer creditAdjustmentValue;

	private Integer invoiceValue;

	private String remarks;

	private Integer gstPercent;

	private Integer taxable;

	private Integer cgstAmt;

	private Integer sgstAmt;

	private Integer inGstPercent;

	private Integer inTaxable;

	private Integer inCgstAmt;

	private Integer inSgstAmt;

	private String typeheadDisplay;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getStateCode() {
		return stateCode;
	}

	public void setStateCode(Long stateCode) {
		this.stateCode = stateCode;
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

	public Long getAccountInformationId() {
		return accountInformationId;
	}

	public void setAccountInformationId(Long accountInformationId) {
		this.accountInformationId = accountInformationId;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getGstIN() {
		return gstIN;
	}

	public void setGstIN(String gstIN) {
		this.gstIN = gstIN;
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

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductcode() {
		return productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
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

	public Long getTaxId() {
		return taxId;
	}

	public void setTaxId(Long taxId) {
		this.taxId = taxId;
	}

	public Long getTax() {
		return tax;
	}

	public void setTax(Long tax) {
		this.tax = tax;
	}

	public Long getHsnCode() {
		return hsnCode;
	}

	public void setHsnCode(Long hsnCode) {
		this.hsnCode = hsnCode;
	}

	public Integer getMrp() {
		return mrp;
	}

	public void setMrp(Integer mrp) {
		this.mrp = mrp;
	}

	public Long getMacfacturerId() {
		return macfacturerId;
	}

	public void setMacfacturerId(Long macfacturerId) {
		this.macfacturerId = macfacturerId;
	}

	public String getManfacturerName() {
		return manfacturerName;
	}

	public void setManfacturerName(String manfacturerName) {
		this.manfacturerName = manfacturerName;
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

	public String getDebitAdjustmentLedger() {
		return this.debitAdjustmentLedger;
	}

	public void setDebitAdjustmentLedger(String debitAdjustmentLedger) {
		this.debitAdjustmentLedger = debitAdjustmentLedger;
	}

	public String getCreditAdjustmentLedger() {
		return this.creditAdjustmentLedger;
	}

	public void setCreditAdjustmentLedger(String creditAdjustmentLedger) {
		this.creditAdjustmentLedger = creditAdjustmentLedger;
	}

	public Integer getDebitAdjustmentValue() {
		return this.debitAdjustmentValue;
	}

	public void setDebitAdjustmentValue(Integer debitAdjustmentValue) {
		this.debitAdjustmentValue = debitAdjustmentValue;
	}

	public Integer getCreditAdjustmentValue() {
		return this.creditAdjustmentValue;
	}

	public void setCreditAdjustmentValue(Integer creditAdjustmentValue) {
		this.creditAdjustmentValue = creditAdjustmentValue;
	}

	public Integer getInvoiceValue() {
		return this.invoiceValue;
	}

	public void setInvoiceValue(Integer invoiceValue) {
		this.invoiceValue = invoiceValue;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Integer getGstPercent() {
		return this.gstPercent;
	}

	public void setGstPercent(Integer gstPercent) {
		this.gstPercent = gstPercent;
	}

	public Integer getTaxable() {
		return this.taxable;
	}

	public void setTaxable(Integer taxable) {
		this.taxable = taxable;
	}

	public Integer getCgstAmt() {
		return this.cgstAmt;
	}

	public void setCgstAmt(Integer cgstAmt) {
		this.cgstAmt = cgstAmt;
	}

	public Integer getSgstAmt() {
		return this.sgstAmt;
	}

	public void setSgstAmt(Integer sgstAmt) {
		this.sgstAmt = sgstAmt;
	}

	public Integer getInGstPercent() {
		return this.inGstPercent;
	}

	public void setInGstPercent(Integer inGstPercent) {
		this.inGstPercent = inGstPercent;
	}

	public Integer getInTaxable() {
		return this.inTaxable;
	}

	public void setInTaxable(Integer inTaxable) {
		this.inTaxable = inTaxable;
	}

	public Integer getInCgstAmt() {
		return this.inCgstAmt;
	}

	public void setInCgstAmt(Integer inCgstAmt) {
		this.inCgstAmt = inCgstAmt;
	}

	public Integer getInSgstAmt() {
		return this.inSgstAmt;
	}

	public void setInSgstAmt(Integer inSgstAmt) {
		this.inSgstAmt = inSgstAmt;
	}

	public String getTypeheadDisplay() {
		return this.typeheadDisplay;
	}

	public void setTypeheadDisplay(String typeheadDisplay) {
		this.typeheadDisplay = typeheadDisplay;
	}

}
