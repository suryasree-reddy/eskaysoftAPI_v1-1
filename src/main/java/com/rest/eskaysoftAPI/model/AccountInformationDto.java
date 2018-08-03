package com.rest.eskaysoftAPI.model;

import java.io.Serializable;
import java.util.Date;

public class AccountInformationDto implements Serializable, Comparable<AccountInformationDto> {

	private static final long serialVersionUID = 655159852262403024L;

	private Long id;
	private String accountName;
	private String address1;
	private String address2;
	private String town;
	private String pinDistrict;
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
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getTown() {
		return this.town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getPinDistrict() {
		return this.pinDistrict;
	}

	public void setPinDistrict(String pinDistrict) {
		this.pinDistrict = pinDistrict;
	}

	public String getAreaName() {
		return this.areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public Long getPhone() {
		return this.phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public Long getMobile() {
		return this.mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getShortName() {
		return this.shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public Long getLicNo1() {
		return this.licNo1;
	}

	public void setLicNo1(Long licNo1) {
		this.licNo1 = licNo1;
	}

	public Long getLicNo2() {
		return this.licNo2;
	}

	public void setLicNo2(Long licNo2) {
		this.licNo2 = licNo2;
	}

	public Long getLicExpiry() {
		return this.licExpiry;
	}

	public void setLicExpiry(Long licExpiry) {
		this.licExpiry = licExpiry;
	}

	public Long getRetLicNo1() {
		return this.retLicNo1;
	}

	public void setRetLicNo1(Long retLicNo1) {
		this.retLicNo1 = retLicNo1;
	}

	public Long getRetLicNo2() {
		return this.retLicNo2;
	}

	public void setRetLicNo2(Long retLicNo2) {
		this.retLicNo2 = retLicNo2;
	}

	public Long getRetExpiry() {
		return this.retExpiry;
	}

	public void setRetExpiry(Long retExpiry) {
		this.retExpiry = retExpiry;
	}

	public Long getFoodLicNo() {
		return this.foodLicNo;
	}

	public void setFoodLicNo(Long foodLicNo) {
		this.foodLicNo = foodLicNo;
	}

	public String getOtherLicense() {
		return this.otherLicense;
	}

	public void setOtherLicense(String otherLicense) {
		this.otherLicense = otherLicense;
	}

	public String getOtherLicenseExpiry() {
		return this.otherLicenseExpiry;
	}

	public void setOtherLicenseExpiry(String otherLicenseExpiry) {
		this.otherLicenseExpiry = otherLicenseExpiry;
	}

	public String getGstType() {
		return this.gstType;
	}

	public void setGstType(String gstType) {
		this.gstType = gstType;
	}

	public String getGstIN() {
		return this.gstIN;
	}

	public void setGstIN(String gstIN) {
		this.gstIN = gstIN;
	}

	public String getNatureOfGST() {
		return this.natureOfGST;
	}

	public void setNatureOfGST(String natureOfGST) {
		this.natureOfGST = natureOfGST;
	}

	public Long getUinNo() {
		return this.uinNo;
	}

	public void setUinNo(Long uinNo) {
		this.uinNo = uinNo;
	}

	public String getSaleType() {
		return this.saleType;
	}

	public void setSaleType(String saleType) {
		this.saleType = saleType;
	}

	public String getCustomerType() {
		return this.customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getCreditLimit() {
		return this.creditLimit;
	}

	public void setCreditLimit(String creditLimit) {
		this.creditLimit = creditLimit;
	}

	public Long getDueDays() {
		return this.dueDays;
	}

	public void setDueDays(Long dueDays) {
		this.dueDays = dueDays;
	}

	public String getContactPerson() {
		return this.contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getHsnCode() {
		return this.hsnCode;
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
		return this.rateOfTax;
	}

	public void setRateOfTax(String rateOfTax) {
		this.rateOfTax = rateOfTax;
	}

	public String getOpeningBalance() {
		return this.openingBalance;
	}

	public void setOpeningBalance(String openingBalance) {
		this.openingBalance = openingBalance;
	}

	public String getOpeningType() {
		return this.openingType;
	}

	public void setOpeningType(String openingType) {
		this.openingType = openingType;
	}

	public String getSpecialRAemarks() {
		return this.specialRAemarks;
	}

	public void setSpecialRAemarks(String specialRAemarks) {
		this.specialRAemarks = specialRAemarks;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedOn() {
		return this.updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	@Override
	public int compareTo(AccountInformationDto accountinformation) {

		return this.accountName.compareTo(accountinformation.getAccountName());
	}
}