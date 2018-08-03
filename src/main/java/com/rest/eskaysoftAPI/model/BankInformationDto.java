package com.rest.eskaysoftAPI.model;


import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
  
public class BankInformationDto implements Serializable,Comparable<BankInformationDto>{

	private static final long serialVersionUID = 655159852262403024L;

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
	
	@Override
	public int compareTo(BankInformationDto bankinformation) {
		
		return this.Name.compareTo(bankinformation.getName());
	}

}