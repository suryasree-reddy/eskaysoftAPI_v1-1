package com.rest.eskaysoftAPI.model;

import java.io.Serializable;

public class ProductCategoryDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String productCategoryName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductCategoryName() {
		return this.productCategoryName;
	}

	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}

	
}
