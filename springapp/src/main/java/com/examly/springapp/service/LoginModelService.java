package com.examly.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.LoginModel;
import com.examly.springapp.repository.LoginModelRepository;

@Service
public class LoginModelService {
	
	@Autowired
	public LoginModelRepository loginModelRepository;

	public LoginModel checkUser(LoginModel data) {
		
		return loginModelRepository.save(data);
	}
	
	

}
