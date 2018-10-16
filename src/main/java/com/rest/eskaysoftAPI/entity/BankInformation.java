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
@Table(name = "bankinformation", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"}),
@UniqueConstraint(columnNames = {"address"})})
public class BankInformation implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    
	@Column(name = "name", nullable = false, length = 20)
	private String name;
	
	@Column(name = "address", nullable = false, length = 40)
	private String address;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	

}