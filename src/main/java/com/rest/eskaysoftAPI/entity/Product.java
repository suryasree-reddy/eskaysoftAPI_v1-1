package com.rest.eskaysoftAPI.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String ProductCode;
	private String ProductName;
	private String Packing;
	private Long BoxQty;
	/*@ManyToOne(cascade = CascadeType.ALL)
	private ProductGroup group;*/
	private Long CaseQty;
	/*@ManyToOne(cascade = CascadeType.ALL)
	private ProductCategory category;*/
	private Long NetRate;
	private String IsNetRateItem;
	private Long SchemeQty;
	private String Free;
	private float Tax;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProductCode() {
		return ProductCode;
	}
	public void setProductCode(String productCode) {
		ProductCode = productCode;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getPacking() {
		return Packing;
	}
	public void setPacking(String packing) {
		Packing = packing;
	}
	public Long getBoxQty() {
		return BoxQty;
	}
	public void setBoxQty(Long boxQty) {
		BoxQty = boxQty;
	}
	public Long getCaseQty() {
		return CaseQty;
	}
	public void setCaseQty(Long caseQty) {
		CaseQty = caseQty;
	}
	public Long getNetRate() {
		return NetRate;
	}
	public void setNetRate(Long netRate) {
		NetRate = netRate;
	}
	public String getIsNetRateItem() {
		return IsNetRateItem;
	}
	public void setIsNetRateItem(String isNetRateItem) {
		IsNetRateItem = isNetRateItem;
	}
	public Long getSchemeQty() {
		return SchemeQty;
	}
	public void setSchemeQty(Long schemeQty) {
		SchemeQty = schemeQty;
	}
	public String getFree() {
		return Free;
	}
	public void setFree(String free) {
		Free = free;
	}
	public float getTax() {
		return Tax;
	}
	public void setTax(float tax) {
		Tax = tax;
	}


}
