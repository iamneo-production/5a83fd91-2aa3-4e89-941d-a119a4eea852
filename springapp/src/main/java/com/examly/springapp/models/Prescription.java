package com.examly.springapp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import java.sql.Date;
import java.util.*;


@Entity
public class Prescription {
    @Id
    @Column(name = "prescriptionId",unique = true, nullable = false)
    private String prescriptionId;

    @Column(name = "userId")
	private User userId;

    @Column(name = "date")
	private Date date;

    @Column(name = "description")
	private List<String> mobileNo;

    @Column(name = "issuedBy")
	private User issuedBy;

    public Prescription(String prescriptionId, User userId, Date date, List<String> mobileNo, User issuedBy) {
		super();
		this.prescriptionId = prescriptionId;
		this.userId = userId;
		this.date = date;
		this.mobileNo = mobileNo;
		this.issuedBy = issuedBy;
	}

	public Prescription() {
		super();
	}

	public String getPrescriptionId() {
		return prescriptionId;
	}

	public void setPrescriptionId(String prescriptionId) {
		this.prescriptionId = prescriptionId;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<String> getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(List<String> mobileNo) {
		this.mobileNo = mobileNo;
	}

	public User getIssuedBy() {
		return issuedBy;
	}

	public void setIssuedBy(User issuedBy) {
		this.issuedBy = issuedBy;
	}
	
}
