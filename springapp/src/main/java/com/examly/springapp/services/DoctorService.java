package com.examly.springapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.models.Doctor;
import com.examly.springapp.repositories.DoctorRepository;

@Service
public class DoctorService {
	
	@Autowired
	public DoctorRepository doctorRepository;

	public List<Doctor> getAllDoctor() {
		
		List<Doctor> doctorList = new ArrayList<>();
		
		doctorRepository.findAll().forEach(doctor -> doctorList.add(doctor));
		
		return doctorList;
	}

}