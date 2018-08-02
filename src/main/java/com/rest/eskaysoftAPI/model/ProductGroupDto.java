package com.rest.eskaysoftAPI.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ProductGroupDto implements Serializable,Comparable<ProductGroupDto> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productGroupId;
	private String productGroupName;
	
	/**
	 * @return the productGroupId
	 */
	public Long getProductGroupId() {
		return this.productGroupId;
	}

	/**
	 * @param productGroupId
	 *            the productGroupId to set
	 */
	public void setProductGroupId(Long productGroupId) {
		this.productGroupId = productGroupId;
	}

	/**
	 * @return the productGroupName
	 */
	public String getProductGroupName() {
		return this.productGroupName;
	}

	/**
	 * @param productGroupName
	 *            the productGroupName to set
	 */
	public void setProductGroupName(String productGroupName) {
		this.productGroupName = productGroupName;
	}

	@Override
	public int compareTo(ProductGroupDto productgroups) {
		
		return this.productGroupName.compareTo(productgroups.getProductGroupName());
	}

}
