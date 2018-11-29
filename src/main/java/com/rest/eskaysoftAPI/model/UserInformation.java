package com.rest.eskaysoftAPI.model;

import java.time.LocalDate;
import java.util.Set;

import com.rest.eskaysoftAPI.entity.RoleName;

public class UserInformation {
	private Long id;
	private String name;
	private String username;
	private String address1;
	private String address2;
	private String town;
	private Long pin;
	private Long districtId;
	private String districtName;
	private String state;
	private Long stateCode;
	private Long phone;
	private Long mobile1;
	private Long mobile2;
	private String contactPerson;
	private Long contactPersonMobile;
	private String natureOfBusiness;
	private String bankName1;
	private Long bankAcNo1;
	private String bankIfscNo1;
	private String bankName2;
	private Long bankAcNo2;
	private String bankIfscNo2;
	private String designation;
	private String email;
	private String password;
	private boolean createdNew = true;
	private String licNo1;
	private String licNo2;
	private LocalDate licExpiry;
	private String retLicNo1;
	private String retLicNo2;
	private LocalDate retExpiry;
	private String foodLicNo;
	private String otherLicense;
	private LocalDate otherLicenseExpiry;
	private String gstType;
	private String gstIN;
	private String natureOfGST;
	private String uin;
	private String saleType;
	private String customerType;
	private Double creditLimit;
	private Integer dueDays;
	private Set<RoleName> roles;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public Long getPin() {
		return pin;
	}

	public void setPin(Long pin) {
		this.pin = pin;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getStateCode() {
		return stateCode;
	}

	public void setStateCode(Long stateCode) {
		this.stateCode = stateCode;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public Long getMobile1() {
		return mobile1;
	}

	public void setMobile1(Long mobile1) {
		this.mobile1 = mobile1;
	}

	public Long getMobile2() {
		return mobile2;
	}

	public void setMobile2(Long mobile2) {
		this.mobile2 = mobile2;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public Long getContactPersonMobile() {
		return contactPersonMobile;
	}

	public void setContactPersonMobile(Long contactPersonMobile) {
		this.contactPersonMobile = contactPersonMobile;
	}

	public String getNatureOfBusiness() {
		return natureOfBusiness;
	}

	public void setNatureOfBusiness(String natureOfBusiness) {
		this.natureOfBusiness = natureOfBusiness;
	}

	public String getBankName1() {
		return bankName1;
	}

	public void setBankName1(String bankName1) {
		this.bankName1 = bankName1;
	}

	public Long getBankAcNo1() {
		return bankAcNo1;
	}

	public void setBankAcNo1(Long bankAcNo1) {
		this.bankAcNo1 = bankAcNo1;
	}

	public String getBankIfscNo1() {
		return bankIfscNo1;
	}

	public void setBankIfscNo1(String bankIfscNo1) {
		this.bankIfscNo1 = bankIfscNo1;
	}

	public String getBankName2() {
		return bankName2;
	}

	public void setBankName2(String bankName2) {
		this.bankName2 = bankName2;
	}

	public Long getBankAcNo2() {
		return bankAcNo2;
	}

	public void setBankAcNo2(Long bankAcNo2) {
		this.bankAcNo2 = bankAcNo2;
	}

	public String getBankIfscNo2() {
		return bankIfscNo2;
	}

	public void setBankIfscNo2(String bankIfscNo2) {
		this.bankIfscNo2 = bankIfscNo2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Set<RoleName> getRoles() {
		return roles;
	}

	public void setRoles(Set<RoleName> roles) {
		this.roles = roles;
	}

	public boolean isCreatedNew() {
		return createdNew;
	}

	public void setCreatedNew(boolean createdNew) {
		this.createdNew = createdNew;
	}

	public String getLicNo1() {
		return licNo1;
	}

	public void setLicNo1(String licNo1) {
		this.licNo1 = licNo1;
	}

	public String getLicNo2() {
		return licNo2;
	}

	public void setLicNo2(String licNo2) {
		this.licNo2 = licNo2;
	}

	public LocalDate getLicExpiry() {
		return licExpiry;
	}

	public void setLicExpiry(LocalDate licExpiry) {
		this.licExpiry = licExpiry;
	}

	public String getRetLicNo1() {
		return retLicNo1;
	}

	public void setRetLicNo1(String retLicNo1) {
		this.retLicNo1 = retLicNo1;
	}

	public String getRetLicNo2() {
		return retLicNo2;
	}

	public void setRetLicNo2(String retLicNo2) {
		this.retLicNo2 = retLicNo2;
	}

	public LocalDate getRetExpiry() {
		return retExpiry;
	}

	public void setRetExpiry(LocalDate retExpiry) {
		this.retExpiry = retExpiry;
	}

	public String getFoodLicNo() {
		return foodLicNo;
	}

	public void setFoodLicNo(String foodLicNo) {
		this.foodLicNo = foodLicNo;
	}

	public String getOtherLicense() {
		return otherLicense;
	}

	public void setOtherLicense(String otherLicense) {
		this.otherLicense = otherLicense;
	}

	public LocalDate getOtherLicenseExpiry() {
		return otherLicenseExpiry;
	}

	public void setOtherLicenseExpiry(LocalDate otherLicenseExpiry) {
		this.otherLicenseExpiry = otherLicenseExpiry;
	}

	public String getGstType() {
		return gstType;
	}

	public void setGstType(String gstType) {
		this.gstType = gstType;
	}

	public String getGstIN() {
		return gstIN;
	}

	public void setGstIN(String gstIN) {
		this.gstIN = gstIN;
	}

	public String getNatureOfGST() {
		return natureOfGST;
	}

	public void setNatureOfGST(String natureOfGST) {
		this.natureOfGST = natureOfGST;
	}

	public String getUin() {
		return uin;
	}

	public void setUin(String uin) {
		this.uin = uin;
	}

	public String getSaleType() {
		return saleType;
	}

	public void setSaleType(String saleType) {
		this.saleType = saleType;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public Double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(Double creditLimit) {
		this.creditLimit = creditLimit;
	}

	public Integer getDueDays() {
		return dueDays;
	}

	public void setDueDays(Integer dueDays) {
		this.dueDays = dueDays;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Long districtId) {
		this.districtId = districtId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}