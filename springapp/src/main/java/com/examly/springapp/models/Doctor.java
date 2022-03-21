package com.examly.springapp.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
public class Doctor{
	
    @Id
	@Column(name = "doctorId",unique=true, nullable=false)
	private String doctorId;

    @Column(name = "email")
	private String email;

    @Column(name = "password")
	private String password;

    @Column(name = "username")
	private String username;

    @Column(name = "mobileNumber")
	private String mobileNumber;

    @Column(name = "active")
	private boolean active;

    @Column(name = "role")
	private String role;

	@Column(name = "specialization")
	private String specialization;

    @Column(name = "hospital")
	private String hospital;
	
	public Doctor() {
	}

	public Doctor(String doctorId,String email, String password, String username, String mobileNumber, boolean active, String role, String specialization, String hospital) {
		this.doctorId = doctorId;
		this.email = email;
		this.password = password;
		this.username = username;
		this.mobileNumber = mobileNumber;
		this.active = active;
		this.role = role;
		this.specialization=specialization;
		this.hospital=hospital;
	}

	public String getDoctorId(){
		return doctorId;
	}
	public void setDoctorId(String doctorId){
		this.doctorId=doctorId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getHospital() {
		return password;
	}

	public void setHospital(String hospital){
		this.hospital = hospital;
	}
}

