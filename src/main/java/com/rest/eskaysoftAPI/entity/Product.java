package com.rest.eskaysoftAPI.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "products", uniqueConstraints = { @UniqueConstraint(columnNames = { "name" }),
		@UniqueConstraint(columnNames = { "packing" }), @UniqueConstraint(columnNames = { "boxQty" }),
		@UniqueConstraint(columnNames = { "contents" }), @UniqueConstraint(columnNames = { "schemeQty" }),
		@UniqueConstraint(columnNames = { "isNetRateItem" }), @UniqueConstraint(columnNames = { "free" }),
		@UniqueConstraint(columnNames = { "productCode" }) })
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name", length = 20, nullable = false)
	private String name;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "companyId", nullable = false)
	private Company companyId;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "productgroupId", nullable = false)
	private Productgroup productgroupId;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "productcategoryId", nullable = false)
	private ProductCategory productcategoryId;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "taxId", nullable = true)
	private Tax taxId;

	@Column(name = "packing", length = 4, nullable = true)
	private String packing;

	@Column(name = "boxQty", nullable = false)
	private Integer boxQty;

	@Column(name = "caseQty", nullable = false)
	private Long caseQty;

	@Column(name = "contents", nullable = false)
	private String contents;

	@Column(name = "schemeQty", nullable = false)
	private Double schemeQty;

	@Column(name = "netRate", nullable = false)
	private Double netRate;

	@Column(name = "isNetRateItem", nullable = false)
	private String isNetRateItem;

	@Column(name = "free", nullable = false)
	private Integer free;

	/*
	 * @Column(name = "tax") private Double tax;
	 */

	@Column(name = "productCode", nullable = false)
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

	public Company getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Company companyId) {
		this.companyId = companyId;
	}

	public Productgroup getProductgroupId() {
		return this.productgroupId;
	}

	public void setProductgroupId(Productgroup productgroupId) {
		this.productgroupId = productgroupId;
	}

	public ProductCategory getProductcategoryId() {
		return this.productcategoryId;
	}

	public void setProductcategoryId(ProductCategory productcategoryId) {
		this.productcategoryId = productcategoryId;
	}

	public Tax getTaxId() {
		return this.taxId;
	}

	public void setTaxId(Tax taxId) {
		this.taxId = taxId;
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

	/*
	 * public Double getTax() { return tax; }
	 * 
	 * public void setTax(Double tax) { this.tax = tax; }
	 */

	public String getProductcode() {
		return this.productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

}