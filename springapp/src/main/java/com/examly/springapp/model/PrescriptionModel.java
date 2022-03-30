package com.examly.springapp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import com.examly.springapp.model.UserModel;

@Entity
@Table(name = "prescription")
public class PrescriptionModel {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable=false)
	private String prescriptionId;

	@OneToOne(cascade = CascadeType.ALL)
	private UserModel userId;

	@Column(nullable=false)
	private Date date;

	@Column(nullable=false)
	private String description;

	@OneToOne(cascade = CascadeType.ALL)
	private UserModel issuedBy;
	
	public PrescriptionModel() {
		
	}
	
	public PrescriptionModel(Long id, String prescriptionId, UserModel userId, Date date, String description,
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public UserModel getIssuedBy() {
		return issuedBy;
	}

	public void setIssuedBy(UserModel issuedBy) {
		this.issuedBy = issuedBy;
	}

}