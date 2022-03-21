package com.examly.springapp.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PrescriptionModel {
	
	@Id
	private Long id;
	private String prescriptionId;
	private UserModel userId;
	private Date date;
	private List<String> description;
	private UserModel issuedBy;
	
	public PrescriptionModel() {
		
	}
	
	public PrescriptionModel(Long id, String prescriptionId, UserModel userId, Date date, List<String> description,
			UserModel issuedBy) {
		super();
		this.id = id;
		this.prescriptionId = prescriptionId;
		this.userId = userId;
		this.date = date;
		this.description = description;
		this.issuedBy = issuedBy;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrescriptionId() {
		return prescriptionId;
	}

	public void setPrescriptionId(String prescriptionId) {
		this.prescriptionId = prescriptionId;
	}

	public UserModel getUserId() {
		return userId;
	}

	public void setUserId(UserModel userId) {
		this.userId = userId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<String> getDescription() {
		return description;
	}

	public void setDescription(List<String> description) {
		this.description = description;
	}

	public UserModel getIssuedBy() {
		return issuedBy;
	}

	public void setIssuedBy(UserModel issuedBy) {
		this.issuedBy = issuedBy;
	}

}
