package com.examly.springapp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;


@Entity
@Table(name = "checkup")
public class CheckupModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable=false)
	private String checkupID;
	@OneToOne(cascade = CascadeType.ALL)
	private BookingModel appointmentDetail;
	@OneToOne(cascade = CascadeType.ALL)
	private PrescriptionModel prescriptionDetail;
	@Column(nullable=false)
	private Date date;
	@Column(nullable=false)
	private String diseases;
	@Column(nullable=false)
	private String report;
	@OneToOne(cascade = CascadeType.ALL)
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