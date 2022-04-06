package com.examly.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.service.BookingModelService;

@RestController
public class BookingModelController {
	
	@Autowired
	public BookingModelService bookingModelService;
	
	@DeleteMapping("/booking/{bookingId}")
	public String deleteBookingById(@PathVariable Long bookingId) {
		
		bookingModelService.deleteById1(bookingId);
		
		return "Deleted Successfully";
	}

}