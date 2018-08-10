package com.rest.eskaysoftAPI.model;

import java.io.Serializable;
import java.util.Date;

public class AccountInformationDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String accountName;
	private Long subScheduleId;
	private Long scheduleId;
	private String address1;
	private String address2;
	private String town;
	private Integer pin;
	private Long stateId;
	private Long areaId;
	private Long districtId;
	private Long phone;
	private Long mobile;
	private String email;
	private String shortName;
	private String licNo1;
	private String licNo2;
	private Date licExpiry;
	private String retLicNo1;
	private String retLicNo2;
	private Date retExpiry;
	private String foodLicNo;
	private String otherLicense;
	private Date otherLicenseExpiry;
	private String gstType;
	private String gstIN;
	private String natureOfGST;
	private String uin;
	private String saleType;
	private String customerType;
	private Double creditLimit;
	private Integer dueDays;
	private String contactPerson;
	private Long hsnCode;
	private Long sacCode;
	private Double rateOfTax;
	private Double openingBalance;
	private String openingType;
	private String specialRemarks;

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

	public Long getSubScheduleId() {
		return subScheduleId;
	}

	public void setSubScheduleId(Long subScheduleId) {
		this.subScheduleId = subScheduleId;
	}

	public Long getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(Long scheduleId) {
		this.scheduleId = scheduleId;
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

	public Integer getPin() {
		return pin;
	}

	public void setPin(Integer pin) {
		this.pin = pin;
	}

	public Long getStateId() {
		return stateId;
	}

	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}

	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

	public Long getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Long districtId) {
		this.districtId = districtId;
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

	public Date getLicExpiry() {
		return licExpiry;
	}

	public void setLicExpiry(Date licExpiry) {
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

	public Date getRetExpiry() {
		return retExpiry;
	}

	public void setRetExpiry(Date retExpiry) {
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

	public Date getOtherLicenseExpiry() {
		return otherLicenseExpiry;
	}

	public void setOtherLicenseExpiry(Date otherLicenseExpiry) {
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

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public Long getHsnCode() {
		return hsnCode;
	}

	public void setHsnCode(Long hsnCode) {
		this.hsnCode = hsnCode;
	}

	public Long getSacCode() {
		return sacCode;
	}

	public void setSacCode(Long sacCode) {
		this.sacCode = sacCode;
	}

	public Double getRateOfTax() {
		return rateOfTax;
	}

	public void setRateOfTax(Double rateOfTax) {
		this.rateOfTax = rateOfTax;
	}

	public Double getOpeningBalance() {
		return openingBalance;
	}

	public void setOpeningBalance(Double openingBalance) {
		this.openingBalance = openingBalance;
	}

	public String getOpeningType() {
		return openingType;
	}

	public void setOpeningType(String openingType) {
		this.openingType = openingType;
	}

	public String getSpecialRemarks() {
		return specialRemarks;
	}

	public void setSpecialRemarks(String specialRemarks) {
		this.specialRemarks = specialRemarks;
	}

	

}