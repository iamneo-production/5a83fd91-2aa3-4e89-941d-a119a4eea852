package com.examly.springapp.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.models.*;
import com.examly.springapp.repositories.*;

@Service
public class PrescriptionService {
	
	@Autowired
	public PrescriptionRepository prescriptionModelRepository;

	public Optional<Prescription> getPrescriptionById(Long prescriptionId) {
		
		return prescriptionModelRepository.findById(prescriptionId);
	}

	public PrescriptionService addPrescription(PrescriptionService created) {
		
		return prescriptionModelRepository.save(created);
	}

	public String delete(Long prescription) {
		
		return prescriptionModelRepository.delete(prescription);
	}

	public Optional<Prescription> getPrescriptionDetails(Long checkupDetails) {
		
		return prescriptionModelRepository.findById(checkupDetails);
	}

	public Prescription updatePrescription(Prescription prescription) {
		
		return prescriptionModelRepository.save(prescription);
	}

}