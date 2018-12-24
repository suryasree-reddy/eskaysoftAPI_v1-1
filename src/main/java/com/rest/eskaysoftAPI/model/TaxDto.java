package com.rest.eskaysoftAPI.model;

import java.io.Serializable;
import java.util.Date;

public class TaxDto implements Serializable {

	private static final long serialVersionUID = 1L;


	private Long id;
	private Date wefdate;
	private String igstpur;
	private String igstpit;
	private String igstsale;
	private String igstsot;
	private String wpurch;
	private String cgstpit;
	private String sgstpit;
	private String wsale;
	private String cgstsot;
	private String sgstsot;
	private Long tax;
	private Long cgst;
	private Long sgst;
	private Boolean status;
	private boolean deleteFlag;

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getWefdate() {
		return this.wefdate;
	}
	public void setWefdate(Date wefdate) {
		this.wefdate = wefdate;
	}
	public String getIgstpur() {
		return this.igstpur;
	}
	public void setIgstpur(String igstpur) {
		this.igstpur = igstpur;
	}
	public String getIgstpit() {
		return this.igstpit;
	}
	public void setIgstpit(String igstpit) {
		this.igstpit = igstpit;
	}
	public String getIgstsale() {
		return this.igstsale;
	}
	public void setIgstsale(String igstsale) {
		this.igstsale = igstsale;
	}
	public String getIgstsot() {
		return this.igstsot;
	}
	public void setIgstsot(String igstsot) {
		this.igstsot = igstsot;
	}
	public String getWpurch() {
		return this.wpurch;
	}
	public void setWpurch(String wpurch) {
		this.wpurch = wpurch;
	}
	public String getCgstpit() {
		return this.cgstpit;
	}
	public void setCgstpit(String cgstpit) {
		this.cgstpit = cgstpit;
	}
	public String getSgstpit() {
		return this.sgstpit;
	}
	public void setSgstpit(String sgstpit) {
		this.sgstpit = sgstpit;
	}
	public String getWsale() {
		return this.wsale;
	}
	public void setWsale(String wsale) {
		this.wsale = wsale;
	}
	public String getCgstsot() {
		return this.cgstsot;
	}
	public void setCgstsot(String cgstsot) {
		this.cgstsot = cgstsot;
	}
	public String getSgstsot() {
		return this.sgstsot;
	}
	public void setSgstsot(String sgstsot) {
		this.sgstsot = sgstsot;
	}
	public Long getTax() {
		return this.tax;
	}
	public void setTax(Long tax) {
		this.tax = tax;
	}
	public Long getCgst() {
		return this.cgst;
	}
	public void setCgst(Long cgst) {
		this.cgst = cgst;
	}
	public Long getSgst() {
		return this.sgst;
	}
	public void setSgst(Long sgst) {
		this.sgst = sgst;
	}
	public Boolean getStatus() {
		return this.status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public boolean isDeleteFlag() {
		return this.deleteFlag;
	}
	public void setDeleteFlag(boolean deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
	
}