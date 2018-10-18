package com.rest.eskaysoftAPI.model;

import java.io.Serializable;

public class ProductDto implements Serializable{
	private static final long serialVersionUID = 655159852262403024L;

	private Long id;

	private String code;

	private String name;

	private String packing;

	private Integer boxQty;

	private Long productGroupId;
	
	private String productGroupName;

	private Long caseQty;

	private Long productCategoryId;
	
	private String productCategoryName;

	private Double netRate;

	private String isNetRateItem;

	private Double schemeQty;

	private Integer free;

	private String contents;

	private Double tax;
	
	private Long companyId;
	
	private String companyName;

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
