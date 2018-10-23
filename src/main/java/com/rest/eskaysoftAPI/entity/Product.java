package com.rest.eskaysoftAPI.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Products")
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "code", nullable = false)
	private String code;
	
	@Column(name = "name", length = 20, nullable = false)
	private String name;
	
	@Column(name = "packing", length = 4, nullable = false)
	private String packing;
	
	@Column(name = "boxQty", nullable = false)
	private Integer boxQty;
	
	private Long productGroupId;
	
	private String productGroupName;
	
	@Column(name = "caseQty", nullable = false)
	private Long caseQty;
	
	private Long productCategoryId;
	private String productCategoryName;
	private Long companyId;
	private String companyName;
	private String companyCode;
	
	@Column(name = "netRate",nullable = false)
	private Double netRate;
	
	@Column(name = "isNetRateItem", nullable = false)
	private String isNetRateItem;
	
	@Column(name = "schemeQty", nullable = false)
	private Double schemeQty;
	
	@Column(name = "free",nullable = false)
	private Integer free;
	
	@Column(name = "contents",nullable = false)
	private String contents;
	
	@Column(name = "tax", nullable = false)
	private Double tax;
	
	@Column(name = "taxId", nullable = false)
	private long taxId;
	
	public long getTaxId() {
		return taxId;
	}

	public void setTaxId(long taxId) {
		this.taxId = taxId;
	}

	public String getProductGroupName() {
		return productGroupName;
	}

	public void setProductGroupName(String productGroupName) {
		this.productGroupName = productGroupName;
	}

	public String getProductCategoryName() {
		return productCategoryName;
	}

	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPacking() {
		return packing;
	}

	public void setPacking(String packing) {
		this.packing = packing;
	}

	public Integer getBoxQty() {
		return boxQty;
	}

	public void setBoxQty(Integer boxQty) {
		this.boxQty = boxQty;
	}

	public Long getProductGroupId() {
		return productGroupId;
	}

	public void setProductGroupId(Long productGroupId) {
		this.productGroupId = productGroupId;
	}

	public Long getCaseQty() {
		return caseQty;
	}

	public void setCaseQty(Long caseQty) {
		this.caseQty = caseQty;
	}

	public Long getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(Long productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	public Double getNetRate() {
		return netRate;
	}

	public void setNetRate(Double netRate) {
		this.netRate = netRate;
	}

	public String getIsNetRateItem() {
		return isNetRateItem;
	}

	public void setIsNetRateItem(String isNetRateItem) {
		this.isNetRateItem = isNetRateItem;
	}

	public Double getSchemeQty() {
		return schemeQty;
	}

	public void setSchemeQty(Double schemeQty) {
		this.schemeQty = schemeQty;
	}

	public Integer getFree() {
		return free;
	}

	public void setFree(Integer free) {
		this.free = free;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	
}