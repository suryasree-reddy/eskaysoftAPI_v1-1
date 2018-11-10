package com.rest.eskaysoftAPI.model;

import java.io.Serializable;
import java.util.Date;

public class AccountInformationDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String accountName;
	private Long subScheduleId;
	private String subScheduleName;
	private Long scheduleId;
	private String scheduleName;
	private Long stateId;
	private String stateName;
	private Long districtId;
	private String districtName;

	private Long areaId;
	private String areaName;
	private Long businessExecutiveId;

	private String businessExecutiveName;

	private String address1;
	private String address2;
	private String town;
	private Integer pin;

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
	private String typeheadDisplay;
	private boolean deleteFlag = true;

	
	public Long getId() {
		return this.id;
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

	public Long getSubScheduleId() {
		return this.subScheduleId;
	}

	public void setSubScheduleId(Long subScheduleId) {
		this.subScheduleId = subScheduleId;
	}

	public String getSubScheduleName() {
		return this.subScheduleName;
	}

	public void setSubScheduleName(String subScheduleName) {
		this.subScheduleName = subScheduleName;
	}

	public Long getScheduleId() {
		return this.scheduleId;
	}

	public void setScheduleId(Long scheduleId) {
		this.scheduleId = scheduleId;
	}

	public String getScheduleName() {
		return this.scheduleName;
	}

	public void setScheduleName(String scheduleName) {
		this.scheduleName = scheduleName;
	}

	public String getDistrictName() {
		return this.districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getStateName() {
		return this.stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public Long getAreaId() {
		return this.areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return this.areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
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

	public Integer getPin() {
		return this.pin;
	}

	public void setPin(Integer pin) {
		this.pin = pin;
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

	public String getLicNo1() {
		return this.licNo1;
	}

	public void setLicNo1(String licNo1) {
		this.licNo1 = licNo1;
	}

	public String getLicNo2() {
		return this.licNo2;
	}

	public void setLicNo2(String licNo2) {
		this.licNo2 = licNo2;
	}

	public Date getLicExpiry() {
		return this.licExpiry;
	}

	public void setLicExpiry(Date licExpiry) {
		this.licExpiry = licExpiry;
	}

	public String getRetLicNo1() {
		return this.retLicNo1;
	}

	public void setRetLicNo1(String retLicNo1) {
		this.retLicNo1 = retLicNo1;
	}

	public String getRetLicNo2() {
		return this.retLicNo2;
	}

	public void setRetLicNo2(String retLicNo2) {
		this.retLicNo2 = retLicNo2;
	}

	public Date getRetExpiry() {
		return this.retExpiry;
	}

	public void setRetExpiry(Date retExpiry) {
		this.retExpiry = retExpiry;
	}

	public String getFoodLicNo() {
		return this.foodLicNo;
	}

	public void setFoodLicNo(String foodLicNo) {
		this.foodLicNo = foodLicNo;
	}

	public String getOtherLicense() {
		return this.otherLicense;
	}

	public void setOtherLicense(String otherLicense) {
		this.otherLicense = otherLicense;
	}

	public Date getOtherLicenseExpiry() {
		return this.otherLicenseExpiry;
	}

	public void setOtherLicenseExpiry(Date otherLicenseExpiry) {
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

	public String getUin() {
		return this.uin;
	}

	public void setUin(String uin) {
		this.uin = uin;
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

	public Double getCreditLimit() {
		return this.creditLimit;
	}

	public void setCreditLimit(Double creditLimit) {
		this.creditLimit = creditLimit;
	}

	public Integer getDueDays() {
		return this.dueDays;
	}

	public void setDueDays(Integer dueDays) {
		this.dueDays = dueDays;
	}

	public String getContactPerson() {
		return this.contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public Long getHsnCode() {
		return this.hsnCode;
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
		return this.rateOfTax;
	}

	public void setRateOfTax(Double rateOfTax) {
		this.rateOfTax = rateOfTax;
	}

	public Double getOpeningBalance() {
		return this.openingBalance;
	}

	public void setOpeningBalance(Double openingBalance) {
		this.openingBalance = openingBalance;
	}

	public String getOpeningType() {
		return this.openingType;
	}

	public void setOpeningType(String openingType) {
		this.openingType = openingType;
	}

	public String getSpecialRemarks() {
		return this.specialRemarks;
	}

	public void setSpecialRemarks(String specialRemarks) {
		this.specialRemarks = specialRemarks;
	}

	public Long getStateId() {
		return this.stateId;
	}

	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}

	public Long getDistrictId() {
		return this.districtId;
	}

	public void setDistrictId(Long districtId) {
		this.districtId = districtId;
	}

	public Long getBusinessExecutiveId() {
		return businessExecutiveId;
	}

	public void setBusinessExecutiveId(Long businessExecutiveId) {
		this.businessExecutiveId = businessExecutiveId;
	}

	public String getBusinessExecutiveName() {
		return businessExecutiveName;
	}

	public void setBusinessExecutiveName(String businessExecutiveName) {
		this.businessExecutiveName = businessExecutiveName;
	}

	public String getTypeheadDisplay() {
		return typeheadDisplay;
	}

	public void setTypeheadDisplay(String typeheadDisplay) {
		this.typeheadDisplay = typeheadDisplay;
	}

	public boolean isDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(boolean deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

}