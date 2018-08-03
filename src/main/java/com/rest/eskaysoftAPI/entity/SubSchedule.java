package com.rest.eskaysoftAPI.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subschedules")
public class SubSchedule  implements Serializable {
	private static final long serialVersionUID = 1L;
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



	
	
}