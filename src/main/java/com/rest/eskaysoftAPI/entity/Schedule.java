package com.rest.eskaysoftAPI.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "schedules", uniqueConstraints = {
@UniqueConstraint(columnNames = {"scheduleIndex"}),
@UniqueConstraint(columnNames = {"scheduleName"})})
public class Schedule implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "scheduleName", nullable = false, length = 40)
	private String scheduleName;
	
	@Column(name = "scheduleIndex", nullable = false)
	private Integer scheduleIndex;	
	
	@Column(name = "deleteFlag", nullable = false)
	private boolean deleteFlag = true;
	
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

	public Integer getScheduleIndex() {
		return scheduleIndex;
	}

	public void setScheduleIndex(Integer scheduleIndex) {
		this.scheduleIndex = scheduleIndex;
	}

	public String getScheduleType() {
		return this.scheduleType;
	}

	public void setScheduleType(String scheduleType) {
		this.scheduleType = scheduleType;
	}

	public Boolean getDeleteFlag() {
		return this.deleteFlag;
	}

	public void setDeleteFlag(Boolean deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
	

}