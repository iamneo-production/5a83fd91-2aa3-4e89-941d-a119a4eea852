package com.examly.springapp.services;

import java.util.List;

import com.examly.springapp.models.Prescription;
import com.examly.springapp.repositories.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrescriptionService {
    
    @Autowired
    private PrescriptionRepository prescriptionRepository;

    public void addPrescription(Prescription prescription) {
        prescriptionRepository.save(prescription);        
    }
    
    public boolean updatePrescription(Prescription prescription) {
        prescriptionRepository.save(prescription);
        return true;
    }
    
    public void deletePrescription(String prescriptionId) {
        prescriptionRepository.delete(prescriptionId);        
    } 

}
