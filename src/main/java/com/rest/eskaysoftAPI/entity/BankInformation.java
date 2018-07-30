package com.rest.eskaysoftAPI.entity;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
  
@Entity
@Table(name = "bankinformation")
public class BankInformation implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String Name;
	private String Address;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return this.Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return this.Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	

}