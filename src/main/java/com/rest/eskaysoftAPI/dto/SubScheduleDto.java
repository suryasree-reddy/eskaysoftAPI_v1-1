package com.rest.eskaysoftAPI.dto;

import java.io.Serializable;
import java.util.List;

public class SubScheduleDto implements Serializable{
	
	private static final long serialVersionUID = 3902197238843757008L;
	private Long subScheduleId;
	private String subScheduleName;
	private Long subScheduleIndex;
	
	
	private SceduleDto schedule;

	public Long getSubScheduleId() {
		return subScheduleId;
	}

	public void setSubScheduleId(Long subScheduleId) {
		this.subScheduleId = subScheduleId;
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


	public SceduleDto getSchedule() {
		return schedule;
	}

	public void setSchedule(SceduleDto schedule) {
		this.schedule = schedule;
	}
	

}
