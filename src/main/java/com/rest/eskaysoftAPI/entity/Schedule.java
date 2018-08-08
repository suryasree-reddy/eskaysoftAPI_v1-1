package com.rest.eskaysoftAPI.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "schedules")
public class Schedule implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "scheduleName", nullable = false, length = 40)
	private String scheduleName;
	
	@Column(name = "scheduleIndex", nullable = false)
	private int scheduleIndex;	
	
	@Column(name = "scheduleType", nullable = false, length = 15)
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
		return scheduleIndex;
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
	

}