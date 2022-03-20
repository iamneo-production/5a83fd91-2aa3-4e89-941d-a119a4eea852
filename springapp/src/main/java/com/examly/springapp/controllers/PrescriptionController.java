package com.examly.springapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.examly.springapp.service.PrescriptionService;
import com.examly.springapp.models.Prescription;
import java.util.*;

public class PrescriptionController {
    
    @Autowired
    private PrescriptionService prescriptionService;

    //4- Add Prescription: id -> prescriptionId
    @RequestMapping(method = RequestMethod.POST, value = "/doctor/prescription")
    public void addPrescription(@RequestBody Presciption prescription){
        prescriptionService.addPrescription(prescription);
    }

    //5-Update Prescription: id -> prescriptionId
    @RequestMapping(method = RequestMethod.PUT, value = "/doctor/prescription/{id}")
    public void updatePrescription(@PathVariable String id){
        prescriptionService.updatePrescription(id);
    }

    //6-Delete Prescription: id -> prescriptionId
    @RequestMapping(method = RequestMethod.DELETE, value = "/doctor/prescription/delete/{id}")
    public void deletePrescription(@PathVariable String id){
        prescriptionService.deletePrescription(id);
    }
}
