package com.rest.eskaysoftAPI.model;

import java.io.Serializable;

public class ProductGroupDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String productGroupName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductGroupName() {
		return this.productGroupName;
	}

	public void setProductGroupName(String productGroupName) {
		this.productGroupName = productGroupName;
	}

}
