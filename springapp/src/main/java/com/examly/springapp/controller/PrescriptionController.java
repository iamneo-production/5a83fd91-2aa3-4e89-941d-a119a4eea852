package com.examly.springapp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.PrescriptionModel;
import com.examly.springapp.service.PrescriptionService;

@RestController
public class PrescriptionController {
	
	@Autowired
	public PrescriptionService prescriptionService;
	
	@RequestMapping("/prescription/{id}")
	public Optional<PrescriptionModel> getPrescriptionById(@PathVariable("id") Long prescriptionId) {
		
		return prescriptionService.getPrescriptionById(prescriptionId);
		
	}

}