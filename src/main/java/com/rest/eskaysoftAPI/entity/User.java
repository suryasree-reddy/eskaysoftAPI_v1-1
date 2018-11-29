package com.rest.eskaysoftAPI.entity;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.rest.eskaysoftAPI.audit.UserDateAudit;

@Entity
@Table(name = "users", uniqueConstraints = { @UniqueConstraint(columnNames = { "username" })})

public class User extends UserDateAudit {
	private static final long serialVersionUID = 6998881581402295916L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name", nullable = false, length = 40)
	private String name;

	@Column(name = "username", nullable = false, length = 15)
	private String username;

	@Column(name = "address1", length = 15, nullable = false)
	private String address1;

	@Column(name = "address2")
	private String address2;

	@Column(name = "town", nullable = false)
	private String town;

	@Column(name = "pin", nullable = false)
	private String pin;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "districtId")
	private Districts districtId;

	@Column(name = "phone", nullable = false)
	private Long phone;

	@Column(name = "mobile1", nullable = false)
	private Long mobile1;

	@Column(name = "mobile2")
	private Long mobile2;

	@Column(name = "contactPerson")
	private String contactPerson;

	@Column(name = "contactPersonMobile")
	private Long contactPersonMobile;

	@Column(name = "natureOfBusiness")
	private String natureOfBusiness;

	@Column(name = "bankName1")
	private String bankName1;

	@Column(name = "bankAcNo1")
	private Long bankAcNo1;

	@Column(name = "bankIfscNo1")
	private String bankIfscNo1;

	@Column(name = "bankName2")
	private String bankName2;

	@Column(name = "bankAcNo2")
	private Long bankAcNo2;

	@Column(name = "bankIfscNo2")
	private String bankIfscNo2;

	@Column(name = "designation")
	private String designation;

	@Column(name = "email")
	private String email;

	@Column(name = "password", nullable=false)
	private String password;

	@Column(name = "createdNew")
	private boolean createdNew = true;

	@Column(name = "licNo1")
	private String licNo1;

	@Column(name = "licNo2")
	private String licNo2;

	@Column(name = "licExpiry")
	private LocalDate licExpiry;

	@Column(name = "retLicNo1")
	private String retLicNo1;

	@Column(name = "retLicNo2")
	private String retLicNo2;

	@Column(name = "retExpiry")
	private LocalDate retExpiry;

	@Column(name = "foodLicNo")
	private String foodLicNo;

	@Column(name = "otherLicense")
	private String otherLicense;

	@Column(name = "otherLicenseExpiry")
	private LocalDate otherLicenseExpiry;

	@Column(name = "gstType")
	private String gstType;

	@Column(name = "gstIN")
	private String gstIN;

	@Column(name = "natureOfGST")
	private String natureOfGST;

	@Column(name = "uin")
	private String uin;

	@Column(name = "saleType")
	private String saleType;

	@Column(name = "creditLimit")
	private Double creditLimit;

	@Column(name = "customerType")
	private String customerType;

	@Column(name = "dueDays")
	private Integer dueDays;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles = new HashSet<>();

	public User() {

	}

	public User(String name, String username, String email, String password) {
		this.name = name;
		this.username = username;
		this.email = email;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
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

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public Districts getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Districts districtId) {
		this.districtId = districtId;
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}