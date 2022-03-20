package com.examly.springapp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Checkup {
    @Id
    @Column(name = "checkupId", unique = true, nullable = false)
	private String checkupId;

    @Column(name = "appointmentDetail")
	private Booking appointmentDetail;

    @Column(name = "prescriptionDetail")
	private Prescription prescriptionDetail;

    @Column(name = "date")
	private Date date;

    @Column(name = "diseases")
	private String diseases;

    @Column(name = "report")
	private String report;
    
    @Column(name = "issuedBy")
	private User issuedBy;
    

	public Checkup() {
		super();
	}

	public Checkup(String checkupId, Booking appointmentDetail, Prescription prescriptionDetail, Date date,
			String diseases, String report, User issuedBy) {
		super();
		this.checkupId = checkupId;
		this.appointmentDetail = appointmentDetail;
		this.prescriptionDetail = prescriptionDetail;
		this.date = date;
		this.diseases = diseases;
		this.report = report;
		this.issuedBy = issuedBy;
	}

	public String getCheckupId() {
		return checkupId;
	}

	public void setCheckupId(String checkupId) {
		this.checkupId = checkupId;
	}

	public Booking getAppointmentDetail() {
		return appointmentDetail;
	}

	public void setAppointmentDetail(Booking appointmentDetail) {
		this.appointmentDetail = appointmentDetail;
	}

	public Prescription getPrescriptionDetail() {
		return prescriptionDetail;
	}

	public void setPrescriptionDetail(Prescription prescriptionDetail) {
		this.prescriptionDetail = prescriptionDetail;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDiseases() {
		return diseases;
	}

	public void setDiseases(String diseases) {
		this.diseases = diseases;
	}

	public String getReport() {
		return report;
	}

	public void setReport(String report) {
		this.report = report;
	}

	public User getIssuedBy() {
		return issuedBy;
	}

	public void setIssuedBy(User issuedBy) {
		this.issuedBy = issuedBy;
	}
    
}
