package com.rest.eskaysoftAPI.model;

import java.io.Serializable;
import java.util.Date;

public class PurchaseEntryDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private Integer purchaseNumber;
	private String invoiceNumber;
	private Date date;
	private String gstin;
	private String wayBill;
	private String transport;
	private Integer numberOfCases;
	private Date invoiceDate;
	private String mode;
	private String lrNumber;
	private Date lrDate;
	private String delvFrom;
	private String productCode;
	private String productName;
	private String batch;
	private Date expiry;
	private Double qty;
	private Double othCharges;
	private Double grsValue;
	private Double discount;
	private Double ptd;
	private Double saleRate;
	private Double tax;
	private Long hsn;
	private Double mrp;
	private String mfgName;
	private Double purRate;
	private Double free;
	private Double grossValue;
	private Double discountValue;
	private Double taxValue;
	private Double netValue;
	private Double debitAdjustmentLedger;
	private Double CreditAdjustmentLedger;
	private String remarks;
	private Double DebitAdjustmentValue;
	private Double creditAdjustmentValue;
	private Double invoiceValue;

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

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getGstin() {
		return gstin;
	}

	public void setGstin(String gstin) {
		this.gstin = gstin;
	}

	public String getWayBill() {
		return wayBill;
	}

	public void setWayBill(String wayBill) {
		this.wayBill = wayBill;
	}

	public String getTransport() {
		return transport;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}

	public Integer getNumberOfCases() {
		return numberOfCases;
	}

	public void setNumberOfCases(Integer numberOfCases) {
		this.numberOfCases = numberOfCases;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
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

	public String getDelvFrom() {
		return delvFrom;
	}

	public void setDelvFrom(String delvFrom) {
		this.delvFrom = delvFrom;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
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

	public Date getExpiry() {
		return expiry;
	}

	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public Double getOthCharges() {
		return othCharges;
	}

	public void setOthCharges(Double othCharges) {
		this.othCharges = othCharges;
	}

	public Double getGrsValue() {
		return grsValue;
	}

	public void setGrsValue(Double grsValue) {
		this.grsValue = grsValue;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Double getPtd() {
		return ptd;
	}

	public void setPtd(Double ptd) {
		this.ptd = ptd;
	}

	public Double getSaleRate() {
		return saleRate;
	}

	public void setSaleRate(Double saleRate) {
		this.saleRate = saleRate;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Long getHsn() {
		return hsn;
	}

	public void setHsn(Long hsn) {
		this.hsn = hsn;
	}

	public Double getMrp() {
		return mrp;
	}

	public void setMrp(Double mrp) {
		this.mrp = mrp;
	}

	public String getMfgName() {
		return mfgName;
	}

	public void setMfgName(String mfgName) {
		this.mfgName = mfgName;
	}

	public Double getPurRate() {
		return purRate;
	}

	public void setPurRate(Double purRate) {
		this.purRate = purRate;
	}

	public Double getFree() {
		return free;
	}

	public void setFree(Double free) {
		this.free = free;
	}

	public Double getGrossValue() {
		return grossValue;
	}

	public void setGrossValue(Double grossValue) {
		this.grossValue = grossValue;
	}

	public Double getDiscountValue() {
		return discountValue;
	}

	public void setDiscountValue(Double discountValue) {
		this.discountValue = discountValue;
	}

	public Double getTaxValue() {
		return taxValue;
	}

	public void setTaxValue(Double taxValue) {
		this.taxValue = taxValue;
	}

	public Double getNetValue() {
		return netValue;
	}

	public void setNetValue(Double netValue) {
		this.netValue = netValue;
	}

	public Double getDebitAdjustmentLedger() {
		return debitAdjustmentLedger;
	}

	public void setDebitAdjustmentLedger(Double debitAdjustmentLedger) {
		this.debitAdjustmentLedger = debitAdjustmentLedger;
	}

	public Double getCreditAdjustmentLedger() {
		return CreditAdjustmentLedger;
	}

	public void setCreditAdjustmentLedger(Double creditAdjustmentLedger) {
		CreditAdjustmentLedger = creditAdjustmentLedger;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Double getDebitAdjustmentValue() {
		return DebitAdjustmentValue;
	}

	public void setDebitAdjustmentValue(Double debitAdjustmentValue) {
		DebitAdjustmentValue = debitAdjustmentValue;
	}

	public Double getCreditAdjustmentValue() {
		return creditAdjustmentValue;
	}

	public void setCreditAdjustmentValue(Double creditAdjustmentValue) {
		this.creditAdjustmentValue = creditAdjustmentValue;
	}

	public Double getInvoiceValue() {
		return invoiceValue;
	}

	public void setInvoiceValue(Double invoiceValue) {
		this.invoiceValue = invoiceValue;
	}

}
