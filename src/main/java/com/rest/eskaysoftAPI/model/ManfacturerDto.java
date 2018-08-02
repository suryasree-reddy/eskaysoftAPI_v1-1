package com.rest.eskaysoftAPI.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ManfacturerDto implements Serializable, Comparable<ManfacturerDto> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	@Override
	public int compareTo(ManfacturerDto manfacturer) {

		return this.manfacturerName.compareTo(manfacturer.getManfacturerName());

	}
}
