package com.examly.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.DoctorModel;
import com.examly.springapp.service.DoctorService;

@RestController
public class DoctorController {
	
	@Autowired
	public DoctorService doctorService;
	
	@RequestMapping("/doctor")
	public List<DoctorModel> getAllDoctors(){
		
		return doctorService.getAllDoctor();
	}
	

}
