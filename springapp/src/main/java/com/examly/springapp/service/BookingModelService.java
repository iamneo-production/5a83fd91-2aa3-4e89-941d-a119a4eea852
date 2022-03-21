package com.examly.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.repository.BookingModelRepository;

@Service
public class BookingModelService {
	
	@Autowired
	public BookingModelRepository bookingModelRepository;

	public String deleteById1(Long bookingId) {
		
		return bookingModelRepository.delete(bookingId);
	}

}
