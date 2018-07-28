package com.rest.eskaysoftAPI.dto;

import java.io.Serializable;

public class SceduleDto implements Serializable{
	
	private static final long serialVersionUID = -6220814147830004035L;
	private Long id;
	private String scheduleName;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getScheduleName() {
		return scheduleName;
	}
	public void setScheduleName(String scheduleName) {
		this.scheduleName = scheduleName;
	}
	
	
	
}
