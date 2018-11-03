package com.rest.eskaysoftAPI.model;

import java.io.Serializable;

public class ProductgroupDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String productGroupName;

	private boolean deleteFlag;

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

	public boolean isDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(boolean deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

}
