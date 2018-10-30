package com.rest.eskaysoftAPI.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tax")
public class Tax implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "wefdate", nullable = false, length = 20)
	private Date wefdate;

	@Column(name = "igstpur", nullable = true, length = 20)
	private String igstpur;

	@Column(name = "igstpit", nullable = true, length = 20)
	private String igstpit;

	@Column(name = "igstsale", nullable = true, length = 20)
	private String igstsale;

	@Column(name = "igstsot", nullable = true, length = 20)
	private String igstsot;

	@Column(name = "wpurch", nullable = true, length = 20)
	private String wpurch;

	@Column(name = "cgstpit", nullable = true, length = 20)
	private String cgstpit;

	@Column(name = "sgstpit", nullable = true, length = 20)
	private String sgstpit;

	@Column(name = "wsale", nullable = true, length = 20)
	private String wsale;

	@Column(name = "cgstsot", nullable = true, length = 20)
	private String cgstsot;

	@Column(name = "sgstsot", nullable = true, length = 20)
	private String sgstsot;

	@Column(name = "tax", nullable = false)
	private Long tax;

	@Column(name = "cgst", nullable = true)
	private Long cgst;

	@Column(name = "sgst", nullable = true)
	private Long sgst;

	@Column(name = "status", nullable = false)
	private Boolean status;

	@Column(name = "deleteFlag", nullable = false)
	private boolean deleteFlag = true;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getWefdate() {
		return wefdate;
	}

	public void setWefdate(Date wefdate) {
		this.wefdate = wefdate;
	}

	public String getIgstpur() {
		return igstpur;
	}

	public void setIgstpur(String igstpur) {
		this.igstpur = igstpur;
	}

	public String getIgstpit() {
		return igstpit;
	}

	public void setIgstpit(String igstpit) {
		this.igstpit = igstpit;
	}

	public String getIgstsale() {
		return igstsale;
	}

	public void setIgstsale(String igstsale) {
		this.igstsale = igstsale;
	}

	public String getIgstsot() {
		return igstsot;
	}

	public void setIgstsot(String igstsot) {
		this.igstsot = igstsot;
	}

	public String getWpurch() {
		return wpurch;
	}

	public void setWpurch(String wpurch) {
		this.wpurch = wpurch;
	}

	public String getCgstpit() {
		return cgstpit;
	}

	public void setCgstpit(String cgstpit) {
		this.cgstpit = cgstpit;
	}

	public String getSgstpit() {
		return sgstpit;
	}

	public void setSgstpit(String sgstpit) {
		this.sgstpit = sgstpit;
	}

	public String getWsale() {
		return wsale;
	}

	public void setWsale(String wsale) {
		this.wsale = wsale;
	}

	public String getCgstsot() {
		return cgstsot;
	}

	public void setCgstsot(String cgstsot) {
		this.cgstsot = cgstsot;
	}

	public String getSgstsot() {
		return sgstsot;
	}

	public void setSgstsot(String sgstsot) {
		this.sgstsot = sgstsot;
	}

	public Long getTax() {
		return tax;
	}

	public void setTax(Long tax) {
		this.tax = tax;
	}

	public Long getCgst() {
		return cgst;
	}

	public void setCgst(Long cgst) {
		this.cgst = cgst;
	}

	public Long getSgst() {
		return sgst;
	}

	public void setSgst(Long sgst) {
		this.sgst = sgst;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Boolean getDeleteFlag() {
		return this.deleteFlag;
	}

	public void setDeleteFlag(Boolean deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

}