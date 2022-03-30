package com.examly.springapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.models.*;
import com.examly.springapp.repositories.*;

@Service
public class UserService{
	
	@Autowired
	public UserRepository userModelRepository;

	public User saveUser(User user) {
		
		return userModelRepository.save(user);
	}

}