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
@Table(name="booking")
public class BookingModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long bookingId;

	@OneToOne(cascade = CascadeType.ALL)
	private UserModel patientDetail;
	@OneToOne(cascade = CascadeType.ALL)
	private DoctorModel doctorDetail;
	@Column(nullable=false)
	private String hospitalName;
	@Column(nullable=false)
	private Date date;
	@Column(nullable=false)
	private Date time;
	@Column(nullable=false)
	private boolean bookingStatus = true;
	
	public BookingModel() {
		
	}
	
	public BookingModel(Long bookingId, UserModel patientDetail, DoctorModel doctorDetail, String hospitalName,
			Date date, Date time, boolean bookingStatus) {
		super();
		this.bookingId = bookingId;
		this.patientDetail = patientDetail;
		this.doctorDetail = doctorDetail;
		this.hospitalName = hospitalName;
		this.date = date;
		this.time = time;
		this.bookingStatus = bookingStatus;
	}

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public UserModel getPatientDetail() {
		return patientDetail;
	}

	public void setPatientDetail(UserModel patientDetail) {
		this.patientDetail = patientDetail;
	}

	public DoctorModel getDoctorDetail() {
		return doctorDetail;
	}

	public void setDoctorDetail(DoctorModel doctorDetail) {
		this.doctorDetail = doctorDetail;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public boolean getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(boolean bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	

}