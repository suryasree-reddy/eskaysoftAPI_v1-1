package com.rest.eskaysoftAPI.dto;

import java.io.Serializable;

public class SubScheduleDto implements Serializable{
	
	private static final long serialVersionUID = 3902197238843757008L;
	private Long subScheduleId;
	private String subScheduleName;
	private String subScheduleType;
	private Long subScheduleIndex;
	private float credit;
	private float debit;
	
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

	public String getSubScheduleType() {
		return subScheduleType;
	}

	public void setSubScheduleType(String subScheduleType) {
		this.subScheduleType = subScheduleType;
	}

	public Long getSubScheduleIndex() {
		return subScheduleIndex;
	}

	public void setSubScheduleIndex(Long subScheduleIndex) {
		this.subScheduleIndex = subScheduleIndex;
	}

	public float getCredit() {
		return credit;
	}

	public void setCredit(float credit) {
		this.credit = credit;
	}

	public float getDebit() {
		return debit;
	}

	public void setDebit(float debit) {
		this.debit = debit;
	}

	public SceduleDto getSchedule() {
		return schedule;
	}

	public void setSchedule(SceduleDto schedule) {
		this.schedule = schedule;
	}
	

}
