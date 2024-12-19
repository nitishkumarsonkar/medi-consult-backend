package com.example.demo.dto;

import java.util.Date;
import java.util.List;

import com.example.demo.entity.enums.City;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ReceipeDto {
	private Long receipeid;
	
	private String detail;
	private String barcode;
	private String drug_detail;
	private String usage;
	private String delivery_date;
	private int status;
	private Long patientid;
	private Long problemid;

	public Long getReceipeid() {
		return receipeid;
	}

	public String getDetail() {
		return detail;
	}

	public String getBarcode() {
		return barcode;
	}

	public String getDrug_detail() {
		return drug_detail;
	}

	public String getUsage() {
		return usage;
	}

	public String getDelivery_date() {
		return delivery_date;
	}

	public int getStatus() {
		return status;
	}

	public Long getPatientid() {
		return patientid;
	}

	public Long getProblemid() {
		return problemid;
	}

	public void setReceipeid(Long receipeid) {
		this.receipeid = receipeid;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public void setDrug_detail(String drug_detail) {
		this.drug_detail = drug_detail;
	}

	public void setUsage(String usage) {
		this.usage = usage;
	}

	public void setDelivery_date(String delivery_date) {
		this.delivery_date = delivery_date;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public void setPatientid(Long patientid) {
		this.patientid = patientid;
	}

	public void setProblemid(Long problemid) {
		this.problemid = problemid;
	}
}
