package com.rest.eskaysoftAPI.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ProductCategoryDto implements Serializable,Comparable<ProductCategoryDto> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productCategoryId;
	private String productCategoryName;
	


	/**
	 * @return the productCategoryId
	 */
	public Long getProductCategoryId() {
		return this.productCategoryId;
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
		return this.productCategoryName;
	}

	/**
	 * @param productCategoryName
	 *            the productCategoryName to set
	 */
	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}
	
	@Override
	public int compareTo(ProductCategoryDto productcategories) {
		
		return this.productCategoryName.compareTo(productcategories.getProductCategoryName());
	}

}
