package com.examly.springapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.PrescriptionModel;
import com.examly.springapp.repository.PrescriptionModelRepository;

@Service
public class PrescriptionService {
	
	@Autowired
	public PrescriptionModelRepository prescriptionModelRepository;

	public Optional<PrescriptionModel> getPrescriptionById(Long prescriptionId) {
		
		return prescriptionModelRepository.findById(prescriptionId);
	}

}
