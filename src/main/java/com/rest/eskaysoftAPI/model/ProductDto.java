package com.rest.eskaysoftAPI.model;

import java.io.Serializable;

import javax.persistence.Column;

public class ProductDto implements Serializable, Comparable<ProductDto> {
	private static final long serialVersionUID = 655159852262403024L;

	private Long id;
	private String Code;

	private String name;

	private String packing;

	private float boxQty;

	private Long productGroupId;

	private Long caseQty;

	private Long productCategoruId;

	private float netRate;

	private String isNetRateItem;

	private float schemeQty;

	private int free;
	@Column(name = "Contents", length = 20)
	private String contents;

	private float tax;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
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

	public float getBoxQty() {
		return boxQty;
	}

	public void setBoxQty(float boxQty) {
		this.boxQty = boxQty;
	}

	public Long getProductGroupId() {
		return productGroupId;
	}

	public void setProductGroupId(Long productGroupId) {
		this.productGroupId = productGroupId;
	}

	public void setProductCategoruId(Long productCategoruId) {
		this.productCategoruId = productCategoruId;
	}

	public Long getCaseQty() {
		return caseQty;
	}

	public void setCaseQty(Long caseQty) {
		this.caseQty = caseQty;
	}

	public Long getProductCategoruId() {
		return productCategoruId;
	}

	public float getNetRate() {
		return netRate;
	}

	public void setNetRate(float netRate) {
		this.netRate = netRate;
	}

	public String getIsNetRateItem() {
		return isNetRateItem;
	}

	public void setIsNetRateItem(String isNetRateItem) {
		this.isNetRateItem = isNetRateItem;
	}

	public float getSchemeQty() {
		return schemeQty;
	}

	public void setSchemeQty(float schemeQty) {
		this.schemeQty = schemeQty;
	}

	public int getFree() {
		return free;
	}

	public void setFree(int free) {
		this.free = free;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}

	@Override
	public int compareTo(ProductDto product) {

		return this.name.compareTo(product.getName());
	}
}
