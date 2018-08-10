package com.rest.eskaysoftAPI.model;

import java.io.Serializable;

public class ManfacturerDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String manfacturerName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getManfacturerName() {
		return manfacturerName;
	}

	public void setManfacturerName(String manfacturerName) {
		this.manfacturerName = manfacturerName;

	}

	
}
