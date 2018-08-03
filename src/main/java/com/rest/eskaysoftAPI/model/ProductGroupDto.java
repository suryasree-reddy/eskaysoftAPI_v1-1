package com.rest.eskaysoftAPI.model;

import java.io.Serializable;

public class ProductGroupDto implements Serializable, Comparable<ProductGroupDto> {

	private static final long serialVersionUID = 1L;

	private Long productGroupId;
	private String productGroupName;

	public Long getProductGroupId() {
		return this.productGroupId;
	}

	public void setProductGroupId(Long productGroupId) {
		this.productGroupId = productGroupId;
	}

	public String getProductGroupName() {
		return this.productGroupName;
	}

	public void setProductGroupName(String productGroupName) {
		this.productGroupName = productGroupName;
	}

	@Override
	public int compareTo(ProductGroupDto productgroups) {

		return this.productGroupName.compareTo(productgroups.getProductGroupName());
	}

}
