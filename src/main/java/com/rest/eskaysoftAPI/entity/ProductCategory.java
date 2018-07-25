package com.rest.eskaysoftAPI.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productcategory")
public class ProductCategory implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productCategoryId;
	private String productCategoryName;
	


	/**
	 * @return the productCategoryId
	 */
	public Long getProductCategoryId() {
		return productCategoryId;
	}

	/**
	 * @param productCategoryId
	 *            the productCategoryId to set
	 */
	public void setProductCategoryId(Long productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	/**
	 * @return the productCategoryName
	 */
	public String getProductCategoryName() {
		return productCategoryName;
	}

	/**
	 * @param productCategoryName
	 *            the productCategoryName to set
	 */
	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}
	
}
