package com.rest.eskaysoftAPI.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "accountInformation", uniqueConstraints = { @UniqueConstraint(columnNames = { "shortName" }) })
public class AccountInformation implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "accountName", length = 50, nullable = false)
	private String accountName;

	

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "subScheduleId", nullable = false)
	private SubSchedule subScheduleId;

	

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "districtId", nullable = false)
	private Districts districtId;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "areaId", nullable = false)
	private Area areaId;

	@Column(name = "address1", length = 50, nullable = false)
	private String address1;

	@Column(name = "address2", length = 50, nullable = false)
	private String address2;

	@Column(name = "town", length = 20, nullable = false)
	private String town;

	@Column(name = "pin", length = 6, nullable = false)
	private Integer pin;

	@Column(name = "phone", nullable = false, length = 10)
	private Long phone;

	@Column(name = "mobile", nullable = false)
	private Long mobile;

	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "shortName", length = 6, nullable = false)
	private String shortName;

	@Column(name = "licNo1", length = 25, nullable = false)
	private String licNo1;

	@Column(name = "licNo2", length = 25, nullable = false)
	private String licNo2;

	@Column(name = "licExpiry", nullable = false)
	private Date licExpiry;

	@Column(name = "retLicNo1", length = 25, nullable = false)
	private String retLicNo1;

	@Column(name = "retLicNo2", length = 25, nullable = false)
	private String retLicNo2;

	@Column(name = "retExpiry", nullable = false)
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "MM/dd/YYYY")
	private Date retExpiry;

	@Column(name = "foodLicNo", length = 25, nullable = false)
	private String foodLicNo;

	@Column(name = "otherLicense", length = 25, nullable = false)
	private String otherLicense;

	@Column(name = "otherLicenseExpiry", nullable = false)
	private Date otherLicenseExpiry;

	@Column(name = "gstType", length = 5, nullable = false)
	private String gstType;

	@Column(name = "gstIN", length = 15, nullable = false)
	private String gstIN;

	@Column(name = "natureOfGST", length = 9, nullable = false)
	private String natureOfGST;

	@Column(name = "uin", length = 25, nullable = false)
	private String uin;

	@Column(name = "saleType", length = 6, nullable = false)
	private String saleType;

	@Column(name = "customerType", length = 10, nullable = false)
	private String customerType;

	@Column(name = "creditLimit", nullable = false)
	private Double creditLimit;

	@Column(name = "dueDays", length = 3, nullable = false)
	private Integer dueDays;

	@Column(name = "contactPerson", length = 30, nullable = false)
	private String contactPerson;

	@Column(name = "hsnCode", length = 8, nullable = false)
	private Long hsnCode;

	@Column(name = "sacCode", length = 8, nullable = false)
	private Long sacCode;

	@Column(name = "rateOfTax", nullable = false)
	private Double rateOfTax;

	@Column(name = "openingBalance", nullable = false)
	private Double openingBalance;

	@Column(name = "openingType", length = 6, nullable = false)
	private String openingType;

	@Column(name = "specialRemarks", length = 60, nullable = false)
	private String specialRemarks;
	
	@Column(name = "deleteFlag", nullable = false)
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

	public SubSchedule getSubScheduleId() {
		return this.subScheduleId;
	}

	public void setSubScheduleId(SubSchedule subScheduleId) {
		this.subScheduleId = subScheduleId;
	}

	

	public Districts getDistrictId() {
		return this.districtId;
	}

	public void setDistrictId(Districts districtId) {
		this.districtId = districtId;
	}

	

	public SubSchedule getSubscheduleId() {
		return this.subScheduleId;
	}

	public void setSubscheduleId(SubSchedule subscheduleId) {
		this.subScheduleId = subscheduleId;
	}

	public Area getAreaId() {
		return this.areaId;
	}

	public void setAreaId(Area areaId) {
		this.areaId = areaId;
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
		return this.sacCode;
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

	public boolean isDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(boolean deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

}