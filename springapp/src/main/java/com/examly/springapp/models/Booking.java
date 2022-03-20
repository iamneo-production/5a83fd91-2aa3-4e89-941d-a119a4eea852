package com.examly.springapp.models;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Booking {
	
	@Id
    @Column(name = "bookingId", unique = true, nullable = false)
	private String bookingId;

	@Column(name = "patientDetail")
	private User patientDetail;

	@Column(name = "doctorDetail")
	private Doctor doctorDetail;

	@Column(name = "hospitalName")
	private String hospitalName;

	@Column(name = "date")
	private Date date;

	@Column(name = "time")
	private Date time;

	@Column(name = "bookingStatus")
	private boolean bookingStatus;
	
	public Booking() {
		super();
	}
	public Booking(String bookingId, User patientDetail, Doctor doctorDetail, String hospitalName, Date date, Date time, boolean bookingStatus) {
		super();
		this.bookingId = bookingId;
		this.patientDetail = patientDetail;
		this.doctorDetail = doctorDetail;
		this.hospitalName = hospitalName;
		this.date = date;
		this.time = time;
		this.bookingStatus = bookingStatus;
	}
    public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public User getPatientDetail() {
		return patientDetail;
	}
	public void setPatientDetail(User patientDetail) {
		this.patientDetail = patientDetail;
	}
	public Doctor getDoctorDetail() {
		return doctorDetail;
	}
	public void setDoctorDetail(Doctor doctorDetail) {
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
	public boolean isBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(boolean bookingStatus) {
		this.bookingStatus = bookingStatus;
	}	
}