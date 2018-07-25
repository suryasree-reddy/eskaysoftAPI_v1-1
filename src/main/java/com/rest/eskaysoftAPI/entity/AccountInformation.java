package com.rest.eskaysoftAPI.entity;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
  
@Entity
@Table(name = "accountinformation")
public class AccountInformation implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   	private Long id;
	String accountName;
	// private SubSchedule subSchedule;
	//private Schedule schedule;
	private String address1;
	private String address2;
	private String town;
	private String pinDistrict;
	//private States state;
	private String areaName;
	private Long phone;
	private Long mobile;
	private String email;
	private String shortName;
	private Long licNo1;
	private Long licNo2;
	private Long licExpiry;
	private Long retLicNo1;
	private Long retLicNo2;
	private Long retExpiry;
	private Long foodLicNo;
	private String otherLicense;
	private String otherLicenseExpiry;
	private String gstType;
	private String gstIN;
	private String natureOfGST;
	private Long uinNo;
	private String saleType;
	private String customerType;
	private String creditLimit;
	private Long dueDays;
	private String contactPerson;
	private String hsnCode;
	private String sacCode;
	private String rateOfTax;
	private String openingBalance;
	private String openingType;
	private String specialRAemarks;
	private String createdBy;
	private Date createdOn;
	private String updatedBy;
	private Date updatedOn;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
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
	public String getPinDistrict() {
		return pinDistrict;
	}
	public void setPinDistrict(String pinDistrict) {
		this.pinDistrict = pinDistrict;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public Long getLicNo1() {
		return licNo1;
	}
	public void setLicNo1(Long licNo1) {
		this.licNo1 = licNo1;
	}
	public Long getLicNo2() {
		return licNo2;
	}
	public void setLicNo2(Long licNo2) {
		this.licNo2 = licNo2;
	}
	public Long getLicExpiry() {
		return licExpiry;
	}
	public void setLicExpiry(Long licExpiry) {
		this.licExpiry = licExpiry;
	}
	public Long getRetLicNo1() {
		return retLicNo1;
	}
	public void setRetLicNo1(Long retLicNo1) {
		this.retLicNo1 = retLicNo1;
	}
	public Long getRetLicNo2() {
		return retLicNo2;
	}
	public void setRetLicNo2(Long retLicNo2) {
		this.retLicNo2 = retLicNo2;
	}
	public Long getRetExpiry() {
		return retExpiry;
	}
	public void setRetExpiry(Long retExpiry) {
		this.retExpiry = retExpiry;
	}
	public Long getFoodLicNo() {
		return foodLicNo;
	}
	public void setFoodLicNo(Long foodLicNo) {
		this.foodLicNo = foodLicNo;
	}
	public String getOtherLicense() {
		return otherLicense;
	}
	public void setOtherLicense(String otherLicense) {
		this.otherLicense = otherLicense;
	}
	public String getOtherLicenseExpiry() {
		return otherLicenseExpiry;
	}
	public void setOtherLicenseExpiry(String otherLicenseExpiry) {
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
	public Long getUinNo() {
		return uinNo;
	}
	public void setUinNo(Long uinNo) {
		this.uinNo = uinNo;
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
	public String getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(String creditLimit) {
		this.creditLimit = creditLimit;
	}
	public Long getDueDays() {
		return dueDays;
	}
	public void setDueDays(Long dueDays) {
		this.dueDays = dueDays;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public String getHsnCode() {
		return hsnCode;
	}
	public void setHsnCode(String hsnCode) {
		this.hsnCode = hsnCode;
	}
	public String getSacCode() {
		return sacCode;
	}
	public void setSacCode(String sacCode) {
		this.sacCode = sacCode;
	}
	public String getRateOfTax() {
		return rateOfTax;
	}
	public void setRateOfTax(String rateOfTax) {
		this.rateOfTax = rateOfTax;
	}
	public String getOpeningBalance() {
		return openingBalance;
	}
	public void setOpeningBalance(String openingBalance) {
		this.openingBalance = openingBalance;
	}
	public String getOpeningType() {
		return openingType;
	}
	public void setOpeningType(String openingType) {
		this.openingType = openingType;
	}
	public String getSpecialRAemarks() {
		return specialRAemarks;
	}
	public void setSpecialRAemarks(String specialRAemarks) {
		this.specialRAemarks = specialRAemarks;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}
	

}