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
	public boolean isDeleteFlag() {
		return deleteFlag;
	}
	public void setDeleteFlag(boolean deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
	
}