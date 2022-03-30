package com.examly.springapp.models;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Embedded;
import javax.persistence.Id;

@Entity
public class Booking {
	@Id
    @Column(name = "bookingId", unique = true, nullable = false)
	private String bookingId;
	@Embedded	
	private User patientDetail;
	@Embedded	
	private User doctorDetail;
	@Column		
	private String hospitalName;
	@Column	
	private Date bookingDate;
	@Column		
	private Date bookingTime;
	@Column		
	private boolean bookingStatus;
	
	public Booking() {
		super();
	}
	public Booking(String bookingId, User patientDetail, User doctorDetail, String hospitalName, Date date, Date time, boolean bookingStatus) {
		this.bookingId = bookingId;
		this.patientDetail = patientDetail;
		this.doctorDetail = doctorDetail;
		this.hospitalName = hospitalName;
		this.bookingDate = date;
		this.bookingTime = time;
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

	public User getDoctorDetail() {
		return doctorDetail;
	}
	public void setDoctorDetail(User doctorDetail) {
		this.doctorDetail = doctorDetail;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public Date getDate() {
		return bookingDate;
	}
	public void setDate(Date date) {
		this.bookingDate = date;
	}
	public Date getTime() {
		return bookingTime;
	}
	public void setTime(Date time) {
		this.bookingTime = time;
	}
	public boolean isBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(boolean bookingStatus) {
		this.bookingStatus = bookingStatus;
	}	
}