package com.rest.eskaysoftAPI.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "purchaseEntry")
public class PurchaseEntry {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long PurchaseId;
	private Long PurchaseNumber;
	private Long InvoiceNumber;
	private String Supplier;
	private String GSTIN;
	private Long WayBillNumber;
	private String Transport;
	private String CS;
	private String Date;
	private String InvoiceDate;
	private String Mode;
	private Long LRNumber;
	private String LRDate;
	private String DeliveredForm;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "productId")
	private Product product;
	private String Batch;
	private String Expiry;
	private String Quantity;
	private float OtherCharges;
	private float GrsValue;
	private float Discount;
	private float PTD;
	private float SaleRate;
	private String HSN;
	private float MRP;
	private String MfgName;
	private float GrossValue;
	private float DiscountValue;
	private float TaxValue;
	private float NetValue;
	private float GSTPercent;
	private String Taxable;
	private float CGSTAmount;
	private float SGSTAmount;
	private Long DebitAdjustmentLedger;
	private Long CreditAdjustmentLedger;
	private String Remarks;
	private float DebitAdjustmentValue;
	private float CreditAdjustmentValue;
	private float InvoiceValue;
	
	/**
	 * @return the purchaseId
	 */
	public Long getPurchaseId() {
		return this.PurchaseId;
	}

	/**
	 * @param purchaseId
	 *            the purchaseId to set
	 */
	public void setPurchaseId(Long purchaseId) {
		PurchaseId = purchaseId;
	}

	/**
	 * @return the purchaseNumber
	 */
	public Long getPurchaseNumber() {
		return this.PurchaseNumber;
	}

	/**
	 * @param purchaseNumber
	 *            the purchaseNumber to set
	 */
	public void setPurchaseNumber(Long purchaseNumber) {
		PurchaseNumber = purchaseNumber;
	}

	/**
	 * @return the invoiceNumber
	 */
	public Long getInvoiceNumber() {
		return this.InvoiceNumber;
	}

	/**
	 * @param invoiceNumber
	 *            the invoiceNumber to set
	 */
	public void setInvoiceNumber(Long invoiceNumber) {
		InvoiceNumber = invoiceNumber;
	}

	/**
	 * @return the supplier
	 */
	public String getSupplier() {
		return this.Supplier;
	}

	/**
	 * @param supplier
	 *            the supplier to set
	 */
	public void setSupplier(String supplier) {
		Supplier = supplier;
	}

	/**
	 * @return the gSTIN
	 */
	public String getGSTIN() {
		return this.GSTIN;
	}

	/**
	 * @param gSTIN
	 *            the gSTIN to set
	 */
	public void setGSTIN(String gSTIN) {
		GSTIN = gSTIN;
	}

	/**
	 * @return the wayBillNumber
	 */
	public Long getWayBillNumber() {
		return this.WayBillNumber;
	}

	/**
	 * @param wayBillNumber
	 *            the wayBillNumber to set
	 */
	public void setWayBillNumber(Long wayBillNumber) {
		WayBillNumber = wayBillNumber;
	}

	/**
	 * @return the transport
	 */
	public String getTransport() {
		return this.Transport;
	}

	/**
	 * @param transport
	 *            the transport to set
	 */
	public void setTransport(String transport) {
		Transport = transport;
	}

	/**
	 * @return the cS
	 */
	public String getCS() {
		return this.CS;
	}

	/**
	 * @param cS
	 *            the cS to set
	 */
	public void setCS(String cS) {
		CS = cS;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return this.Date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(String date) {
		Date = date;
	}

	/**
	 * @return the invoiceDate
	 */
	public String getInvoiceDate() {
		return this.InvoiceDate;
	}

	/**
	 * @param invoiceDate
	 *            the invoiceDate to set
	 */
	public void setInvoiceDate(String invoiceDate) {
		InvoiceDate = invoiceDate;
	}

	/**
	 * @return the mode
	 */
	public String getMode() {
		return this.Mode;
	}

	/**
	 * @param mode
	 *            the mode to set
	 */
	public void setMode(String mode) {
		Mode = mode;
	}

	/**
	 * @return the lRNumber
	 */
	public Long getLRNumber() {
		return this.LRNumber;
	}

	/**
	 * @param lRNumber
	 *            the lRNumber to set
	 */
	public void setLRNumber(Long lRNumber) {
		LRNumber = lRNumber;
	}

	/**
	 * @return the lRDate
	 */
	public String getLRDate() {
		return this.LRDate;
	}

	/**
	 * @param lRDate
	 *            the lRDate to set
	 */
	public void setLRDate(String lRDate) {
		LRDate = lRDate;
	}

	/**
	 * @return the deliveredForm
	 */
	public String getDeliveredForm() {
		return this.DeliveredForm;
	}

	/**
	 * @param deliveredForm
	 *            the deliveredForm to set
	 */
	public void setDeliveredForm(String deliveredForm) {
		DeliveredForm = deliveredForm;
	}

	/**
	 * @return the product
	 */
	public Product getProduct() {
		return this.product;
	}

	/**
	 * @param product
	 *            the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

	/**
	 * @return the batch
	 */
	public String getBatch() {
		return this.Batch;
	}

	/**
	 * @param batch
	 *            the batch to set
	 */
	public void setBatch(String batch) {
		Batch = batch;
	}

	/**
	 * @return the expiry
	 */
	public String getExpiry() {
		return this.Expiry;
	}

	/**
	 * @param expiry
	 *            the expiry to set
	 */
	public void setExpiry(String expiry) {
		Expiry = expiry;
	}

	/**
	 * @return the quantity
	 */
	public String getQuantity() {
		return this.Quantity;
	}

	/**
	 * @param quantity
	 *            the quantity to set
	 */
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}

	/**
	 * @return the otherCharges
	 */
	public float getOtherCharges() {
		return this.OtherCharges;
	}

	/**
	 * @param otherCharges
	 *            the otherCharges to set
	 */
	public void setOtherCharges(float otherCharges) {
		OtherCharges = otherCharges;
	}

	/**
	 * @return the grsValue
	 */
	public float getGrsValue() {
		return this.GrsValue;
	}

	/**
	 * @param grsValue
	 *            the grsValue to set
	 */
	public void setGrsValue(float grsValue) {
		GrsValue = grsValue;
	}

	/**
	 * @return the discount
	 */
	public float getDiscount() {
		return this.Discount;
	}

	/**
	 * @param discount
	 *            the discount to set
	 */
	public void setDiscount(float discount) {
		Discount = discount;
	}

	/**
	 * @return the pTD
	 */
	public float getPTD() {
		return this.PTD;
	}

	/**
	 * @param pTD
	 *            the pTD to set
	 */
	public void setPTD(float pTD) {
		PTD = pTD;
	}

	/**
	 * @return the saleRate
	 */
	public float getSaleRate() {
		return this.SaleRate;
	}

	/**
	 * @param saleRate
	 *            the saleRate to set
	 */
	public void setSaleRate(float saleRate) {
		SaleRate = saleRate;
	}

	/**
	 * @return the hSN
	 */
	public String getHSN() {
		return this.HSN;
	}

	/**
	 * @param hSN
	 *            the hSN to set
	 */
	public void setHSN(String hSN) {
		HSN = hSN;
	}

	/**
	 * @return the mRP
	 */
	public float getMRP() {
		return this.MRP;
	}

	/**
	 * @param mRP
	 *            the mRP to set
	 */
	public void setMRP(float mRP) {
		MRP = mRP;
	}

	/**
	 * @return the mfgName
	 */
	public String getMfgName() {
		return this.MfgName;
	}

	/**
	 * @param mfgName
	 *            the mfgName to set
	 */
	public void setMfgName(String mfgName) {
		MfgName = mfgName;
	}

	/**
	 * @return the grossValue
	 */
	public float getGrossValue() {
		return this.GrossValue;
	}

	/**
	 * @param grossValue
	 *            the grossValue to set
	 */
	public void setGrossValue(float grossValue) {
		GrossValue = grossValue;
	}

	/**
	 * @return the discountValue
	 */
	public float getDiscountValue() {
		return this.DiscountValue;
	}

	/**
	 * @param discountValue
	 *            the discountValue to set
	 */
	public void setDiscountValue(float discountValue) {
		DiscountValue = discountValue;
	}

	/**
	 * @return the taxValue
	 */
	public float getTaxValue() {
		return this.TaxValue;
	}

	/**
	 * @param taxValue
	 *            the taxValue to set
	 */
	public void setTaxValue(float taxValue) {
		TaxValue = taxValue;
	}

	/**
	 * @return the netValue
	 */
	public float getNetValue() {
		return this.NetValue;
	}

	/**
	 * @param netValue
	 *            the netValue to set
	 */
	public void setNetValue(float netValue) {
		NetValue = netValue;
	}

	/**
	 * @return the gSTPercent
	 */
	public float getGSTPercent() {
		return this.GSTPercent;
	}

	/**
	 * @param gSTPercent
	 *            the gSTPercent to set
	 */
	public void setGSTPercent(float gSTPercent) {
		GSTPercent = gSTPercent;
	}

	/**
	 * @return the taxable
	 */
	public String getTaxable() {
		return this.Taxable;
	}

	/**
	 * @param taxable
	 *            the taxable to set
	 */
	public void setTaxable(String taxable) {
		Taxable = taxable;
	}

	/**
	 * @return the cGSTAmount
	 */
	public float getCGSTAmount() {
		return this.CGSTAmount;
	}

	/**
	 * @param cGSTAmount
	 *            the cGSTAmount to set
	 */
	public void setCGSTAmount(float cGSTAmount) {
		CGSTAmount = cGSTAmount;
	}

	/**
	 * @return the sGSTAmount
	 */
	public float getSGSTAmount() {
		return this.SGSTAmount;
	}

	/**
	 * @param sGSTAmount
	 *            the sGSTAmount to set
	 */
	public void setSGSTAmount(float sGSTAmount) {
		SGSTAmount = sGSTAmount;
	}

	/**
	 * @return the debitAdjustmentLedger
	 */
	public Long getDebitAdjustmentLedger() {
		return this.DebitAdjustmentLedger;
	}

	/**
	 * @param debitAdjustmentLedger
	 *            the debitAdjustmentLedger to set
	 */
	public void setDebitAdjustmentLedger(Long debitAdjustmentLedger) {
		DebitAdjustmentLedger = debitAdjustmentLedger;
	}

	/**
	 * @return the creditAdjustmentLedger
	 */
	public Long getCreditAdjustmentLedger() {
		return this.CreditAdjustmentLedger;
	}

	/**
	 * @param creditAdjustmentLedger
	 *            the creditAdjustmentLedger to set
	 */
	public void setCreditAdjustmentLedger(Long creditAdjustmentLedger) {
		CreditAdjustmentLedger = creditAdjustmentLedger;
	}

	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return this.Remarks;
	}

	/**
	 * @param remarks
	 *            the remarks to set
	 */
	public void setRemarks(String remarks) {
		Remarks = remarks;
	}

	/**
	 * @return the debitAdjustmentValue
	 */
	public float getDebitAdjustmentValue() {
		return this.DebitAdjustmentValue;
	}

	/**
	 * @param debitAdjustmentValue
	 *            the debitAdjustmentValue to set
	 */
	public void setDebitAdjustmentValue(float debitAdjustmentValue) {
		DebitAdjustmentValue = debitAdjustmentValue;
	}

	/**
	 * @return the creditAdjustmentValue
	 */
	public float getCreditAdjustmentValue() {
		return this.CreditAdjustmentValue;
	}

	/**
	 * @param creditAdjustmentValue
	 *            the creditAdjustmentValue to set
	 */
	public void setCreditAdjustmentValue(float creditAdjustmentValue) {
		CreditAdjustmentValue = creditAdjustmentValue;
	}

	/**
	 * @return the invoiceValue
	 */
	public float getInvoiceValue() {
		return this.InvoiceValue;
	}


}
