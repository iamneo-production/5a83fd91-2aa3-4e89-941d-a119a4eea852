package com.examly.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.UserModel;
import com.examly.springapp.service.UserModelService;

@RestController
public class SignupController {
	
	@Autowired
	public UserModelService userModelService;
	
	@PostMapping("/signup")
	public UserModel saveUser(@RequestBody UserModel user) {
		
		return userModelService.saveUser(user);
	}

}