package com.examly.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.UserModel;
import com.examly.springapp.repository.UserModelRepository;

@Service
public class UserModelService {
	
	@Autowired
	public UserModelRepository userModelRepository;

	public UserModel saveUser(UserModel user) {
		
		return userModelRepository.save(user);
	}

}
