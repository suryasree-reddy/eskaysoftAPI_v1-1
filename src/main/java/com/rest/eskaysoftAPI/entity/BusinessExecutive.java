package com.rest.eskaysoftAPI.entity;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
  
@Entity
@Table(name = "businessexecutive")
public class BusinessExecutive implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long businessexecutiveid;
	private String name;
	private String address;
	private String town;
	private Long mobile;
	
	public Long getBusinessexecutiveid() {
		return businessexecutiveid;
	}
	public void setBusinessexecutiveid(Long businessexecutiveid) {
		this.businessexecutiveid = businessexecutiveid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	
	

}