package com.examly.springapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.DoctorModel;
import com.examly.springapp.repository.DoctorRepository;

@Service
public class DoctorService {
	
	@Autowired
	public DoctorRepository doctorRepository;

	public List<DoctorModel> getAllDoctor() {
		
		List<DoctorModel> doctorList = new ArrayList<>();
		
		doctorRepository.findAll().forEach(doctor -> doctorList.add(doctor));
		
		return doctorList;
	}

}
