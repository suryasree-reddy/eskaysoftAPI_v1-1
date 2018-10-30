package com.rest.eskaysoftAPI.model;

import java.io.Serializable;

public class ProductDto implements Serializable {
	private static final long serialVersionUID = 655159852262403024L;

	private Long id;

	private String name;

	private Long companyId;
	private String companyName;

	private Long productgroupId;
	private String productgroupName;

	private Long productcategoryId;
	private String productcategoryName;

	private Long taxId;
	private Long tax;

	private boolean deleteFlag;

	private String packing;

	private Integer boxQty;

	private Long caseQty;

	private String contents;

	private Double schemeQty;

	private Double netRate;

	private String isNetRateItem;

	private Integer free;

	private String productcode;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Long getProductgroupId() {
		return this.productgroupId;
	}

	public void setProductgroupId(Long productgroupId) {
		this.productgroupId = productgroupId;
	}

	public Long getProductcategoryId() {
		return this.productcategoryId;
	}

	public void setProductcategoryId(Long productcategoryId) {
		this.productcategoryId = productcategoryId;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getProductgroupName() {
		return this.productgroupName;
	}

	public void setProductgroupName(String productgroupName) {
		this.productgroupName = productgroupName;
	}

	public String getProductcategoryName() {
		return this.productcategoryName;
	}

	public void setProductcategoryName(String productcategoryName) {
		this.productcategoryName = productcategoryName;
	}

	public Long getTaxId() {
		return this.taxId;
	}

	public void setTaxId(Long taxId) {
		this.taxId = taxId;
	}

	public void setTax(Long tax) {
		this.tax = tax;
	}

	public String getPacking() {
		return this.packing;
	}

	public void setPacking(String packing) {
		this.packing = packing;
	}

	public Integer getBoxQty() {
		return this.boxQty;
	}

	public void setBoxQty(Integer boxQty) {
		this.boxQty = boxQty;
	}

	public Long getCaseQty() {
		return this.caseQty;
	}

	public void setCaseQty(Long caseQty) {
		this.caseQty = caseQty;
	}

	public String getContents() {
		return this.contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public Double getSchemeQty() {
		return this.schemeQty;
	}

	public void setSchemeQty(Double schemeQty) {
		this.schemeQty = schemeQty;
	}

	public Double getNetRate() {
		return this.netRate;
	}

	public void setNetRate(Double netRate) {
		this.netRate = netRate;
	}

	public String getIsNetRateItem() {
		return this.isNetRateItem;
	}

	public void setIsNetRateItem(String isNetRateItem) {
		this.isNetRateItem = isNetRateItem;
	}

	public Integer getFree() {
		return this.free;
	}

	public void setFree(Integer free) {
		this.free = free;
	}

	public Long getTax() {
		return this.tax;
	}

	public String getProductcode() {
		return this.productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

	public boolean isDeleteFlag() {
		return this.deleteFlag;
	}

	public void setDeleteFlag(boolean deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

}