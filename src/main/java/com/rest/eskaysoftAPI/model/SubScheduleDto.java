package com.rest.eskaysoftAPI.model;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class SubScheduleDto implements Comparable<SubScheduleDto> {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long subScheduleId;
	private String subScheduleName;
	private Long subScheduleIndex;
	
	
	private Long scheduleId;



	public Long getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(Long scheduleId) {
		this.scheduleId = scheduleId;
	}

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


	@Override
	public int compareTo(SubScheduleDto subschedule) {
		
		return this.subScheduleName.compareTo(subschedule.getSubScheduleName());
	}

	
	
}