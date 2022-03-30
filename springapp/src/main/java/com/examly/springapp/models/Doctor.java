package com.examly.springapp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doctor")
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable=false, unique=true,length=50)
	private String email;
	@Column(nullable=false, length=64)
	private String password;
	@Column(nullable=false)
	private String username;
	@Column(nullable=false)
	private String mobileNumber;
	@Column(nullable=false)
	private Boolean active = true;
	@Column(nullable=false)
	private String role;
	
	public Doctor() {
		
	}
	
	public Doctor(Long id, String email, String password, String username, String mobileNumber, Boolean active,
			String role) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.username = username;
		this.mobileNumber = mobileNumber;
		this.active = active;
		this.role = role;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	

}