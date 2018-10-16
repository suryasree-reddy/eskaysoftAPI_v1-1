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
@Table(name = "businessexecutive", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"}),
@UniqueConstraint(columnNames = {"mobile"})})
public class BusinessExecutive implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    
    @Column(name = "name", nullable = false, length = 20)
	private String name;
    
    @Column(name = "address", nullable = false, length = 20)
   	private String address;
    
    @Column(name = "town", nullable = false, length = 20)
	private String town;
    
    @Column(name = "mobile", nullable = false, length = 10)
	private Long mobile;
	
    @Column(name = "deleteFlag", nullable = false)
	private boolean deleteFlag = true;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTown() {
		return this.town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public Long getMobile() {
		return this.mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	
	public Boolean getDeleteFlag() {
		return this.deleteFlag;
	}

	public void setDeleteFlag(Boolean deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

}