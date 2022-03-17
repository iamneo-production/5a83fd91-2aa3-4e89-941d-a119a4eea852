package com.examly.springapp.model;

public class JwtRequest {

	 String email;
	 String password;
    
	 public String getEmail(){
		 return this.email;
	 }
	 public void setEmail(String email){
		 this.email=email;
	 }

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public JwtRequest(String username, String password,String email) {
		super();
		this.password = password;
		this.email=email;
	}
	public JwtRequest() {
		
	}
	
	
}