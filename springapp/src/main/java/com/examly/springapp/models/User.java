package com.examly.springapp.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
public class User {
	
	@Id
	@Column(name = "email", unique = true, nullable = false)
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

	@Column(name = "specializaiton")
	private String specialization;

	@Column(name = "hospital")
	private String hospital;
	
	public User() {
	}

	

	public User(String email, String password, String username, String mobileNumber, boolean active, String role) {
		this.email = email;
		this.password = password;
		this.username = username;
		this.mobileNumber = mobileNumber;
		this.active = active;
		this.role = role;
		
	}
	public User(String email, String password, String username, String mobileNumber, boolean active, String role,String specialization, String hospital) {
		this.email = email;
		this.password = password;
		this.username = username;
		this.mobileNumber = mobileNumber;
		this.active = active;
		this.role = role;
		this.specialization = specialization;
		this.hospital = hospital;
		
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
		return hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

}

