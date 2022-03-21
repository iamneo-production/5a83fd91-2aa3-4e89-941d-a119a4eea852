package com.examly.springapp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CheckupModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String checkupID;
	private BookingModel appointmentDetail;
	private PrescriptionModel prescriptionDetail;
	private Date date;
	private String diseases;
	private String report;
	private UserModel issuedBy;
	
	public CheckupModel() {
		
	}

	public CheckupModel(Long id, String checkupID, BookingModel appointmentDetail, PrescriptionModel prescriptionDetail,
			Date date, String diseases, String report, UserModel issuedBy) {
		super();
		this.id = id;
		this.checkupID = checkupID;
		this.appointmentDetail = appointmentDetail;
		this.prescriptionDetail = prescriptionDetail;
		this.date = date;
		this.diseases = diseases;
		this.report = report;
		this.issuedBy = issuedBy;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCheckupID() {
		return checkupID;
	}

	public void setCheckupID(String checkupID) {
		this.checkupID = checkupID;
	}

	public BookingModel getAppointmentDetail() {
		return appointmentDetail;
	}

	public void setAppointmentDetail(BookingModel appointmentDetail) {
		this.appointmentDetail = appointmentDetail;
	}

	public PrescriptionModel getPrescriptionDetail() {
		return prescriptionDetail;
	}

	public void setPrescriptionDetail(PrescriptionModel prescriptionDetail) {
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

	public UserModel getIssuedBy() {
		return issuedBy;
	}

	public void setIssuedBy(UserModel issuedBy) {
		this.issuedBy = issuedBy;
	}
	
}
