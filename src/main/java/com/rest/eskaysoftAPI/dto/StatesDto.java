package com.rest.eskaysoftAPI.dto;

import java.io.Serializable;

public class StatesDto implements Serializable {

	private static final long serialVersionUID = -6220814147830004035L;
	private Long id;
	private String stateName;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStateName() {
		return this.stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}



}
