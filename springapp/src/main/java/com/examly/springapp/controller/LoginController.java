package com.examly.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.LoginModel;
import com.examly.springapp.service.LoginModelService;

@RestController
public class LoginController {
	
	@Autowired
	public LoginModelService loginModelService;
	
	@PostMapping("/login")
	public LoginModel checkUser(@RequestBody LoginModel data) {
		
		return loginModelService.checkUser(data);
	}

}
