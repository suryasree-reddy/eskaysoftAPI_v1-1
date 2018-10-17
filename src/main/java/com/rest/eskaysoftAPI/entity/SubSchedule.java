package com.rest.eskaysoftAPI.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "subschedules", uniqueConstraints = {
@UniqueConstraint(columnNames = {"subScheduleIndex"}),
@UniqueConstraint(columnNames = {"subScheduleName"})})
public class SubSchedule implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "subScheduleName", nullable = false, length = 40)
	private String subScheduleName;
	
	@Column(name = "subScheduleIndex", nullable = false)
	private Long subScheduleIndex;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "scheduleId", nullable = false)
	private Schedule scheduleId;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Schedule getScheduleId() {
		return this.scheduleId;
	}

	public void setScheduleId(Schedule scheduleId) {
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

}