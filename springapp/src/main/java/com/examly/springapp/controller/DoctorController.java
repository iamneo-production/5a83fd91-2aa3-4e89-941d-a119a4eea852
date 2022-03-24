package com.examly.springapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.BookingModel;
import com.examly.springapp.model.CheckupModel;
import com.examly.springapp.model.DoctorModel;
import com.examly.springapp.model.PrescriptionModel;
import com.examly.springapp.service.BookingModelService;
import com.examly.springapp.service.CheckupModelService;
import com.examly.springapp.service.DoctorService;
import com.examly.springapp.service.PrescriptionService;

@RestController
public class DoctorController {
	
	@Autowired
	public DoctorService doctorService;
	
	@Autowired
	public BookingModelService bookingModelService;
	
	@Autowired
	public PrescriptionService prescriptionService;
	
	@Autowired
	public CheckupModelService checkupModelService;
	
	
	@RequestMapping("/doctor")
	public List<DoctorModel> getAllDoctors(){
		
		return doctorService.getAllDoctor();
	}
	
	@RequestMapping("/doctor/booking")
	public List<BookingModel> getAllBookings(){
		
		return bookingModelService.getAllBookings();
	}
	
	@PostMapping("/doctor/booking")
	public BookingModelService approveBooking(@RequestBody BookingModelService approve) {
		
		return bookingModelService.approveBooking(approve);
	}

	@PostMapping("/doctor/prescription")
	public PrescriptionService addPrescription(@RequestBody PrescriptionService created) {
		
		return prescriptionService.addPrescription(created);
	}
	
	@PostMapping("/doctor/checkup")
	public CheckupModelService addCheckup(@RequestBody CheckupModelService added) {
		
		return checkupModelService.addCheckup(added);
	}
	
	@DeleteMapping("/doctor/booking/{id}")
	public String deleteBooking(@PathVariable("id") Long booking) {
		
		bookingModelService.delete(booking);
		
		return "Deleted Successfully";
	}
	
	@DeleteMapping("/doctor/prescription/{id}")
	public String deletePrescription(@PathVariable("id") Long prescription) {
		
		prescriptionService.delete(prescription);
		
		 return "Deleted Successfully";
	}
	
	@DeleteMapping("/doctor/checkup/{id}")
	public String deleteCheckup(@PathVariable("id") Long checkup) {
		
		checkupModelService.delete(checkup);
		
		return "Deleted Successfully";
	}
	
	@RequestMapping("/doctor/checkup/{id}")
	public Optional<PrescriptionModel> getPrescriptionDetails(@PathVariable("id") Long checkupDetails) {
		
		return prescriptionService.getPrescriptionDetails(checkupDetails);
	}
	
	@PutMapping("/doctor/prescription/{id}")
	public PrescriptionModel updatePrescription(@RequestBody @PathVariable("id") PrescriptionModel prescription) {
		
		return prescriptionService.updatePrescription(prescription);
	}
	
	@PutMapping("/doctor/checkup/{id}")
	public CheckupModel updateCheckup(@RequestBody @PathVariable("id") CheckupModel checkup) {
		
		return checkupModelService.updateCheckup(checkup);
	}
	
}
