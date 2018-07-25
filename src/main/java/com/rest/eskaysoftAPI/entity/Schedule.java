package com.rest.eskaysoftAPI.entity;


import java.io.Serializable;
import java.util.HashMap;

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
    private String scheduleName;
    private int scheduleIndex;
    private HashMap<Integer, String> scheduleType;

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

    public int getScheduleIndex() {
        return scheduleIndex;
    }

    public void setScheduleIndex(int scheduleIndex) {
        this.scheduleIndex = scheduleIndex;
    }

    public HashMap<Integer, String> getScheduleType() {
        return scheduleType;
    }

    public void setScheduleType(HashMap<Integer, String> scheduleType) {
        this.scheduleType = scheduleType;
    }


}