package com.rest.eskaysoftAPI.model;

import java.io.Serializable;

public class ScheduleDto implements Serializable, Comparable<ScheduleDto> {
	
	private static final long serialVersionUID = 655159852262403024L;
	
	private Long id;
	private String scheduleName;
	private int scheduleIndex;	
	private String scheduleType;
	
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getScheduleName() {
		return this.scheduleName;
	}
	public void setScheduleName(String scheduleName) {
		this.scheduleName = scheduleName;
	}
	public int getScheduleIndex() {
		return this.scheduleIndex;
	}
	public void setScheduleIndex(int scheduleIndex) {
		this.scheduleIndex = scheduleIndex;
	}
	public String getScheduleType() {
		return this.scheduleType;
	}
	public void setScheduleType(String scheduleType) {
		this.scheduleType = scheduleType;
	}
	
	@Override
	public int compareTo(ScheduleDto sch) {
		
		return this.scheduleName.compareTo(sch.getScheduleName());
	}
	
	
}
