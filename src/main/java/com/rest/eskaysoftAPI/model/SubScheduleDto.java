package com.rest.eskaysoftAPI.model;

import java.io.Serializable;

public class SubScheduleDto implements Serializable {

	private static final long serialVersionUID = 655159852262403024L;

	private Long id;
	private String subScheduleName;
	private Long subScheduleIndex;
	private String scheduleName;
	private Long scheduleId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(Long scheduleId) {
		this.scheduleId = scheduleId;
	}

	public String getSubScheduleName() {
		return subScheduleName;
	}

	public void setSubScheduleName(String subScheduleName) {
		this.subScheduleName = subScheduleName;
	}

	public Long getSubScheduleIndex() {
		return subScheduleIndex;
	}

	public void setSubScheduleIndex(Long subScheduleIndex) {
		this.subScheduleIndex = subScheduleIndex;
	}

	public String getScheduleName() {
		return this.scheduleName;
	}

	public void setScheduleName(String scheduleName) {
		this.scheduleName = scheduleName;
	}


}