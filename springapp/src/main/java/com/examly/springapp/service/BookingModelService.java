package com.examly.springapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.BookingModel;
import com.examly.springapp.repository.BookingModelRepository;

@Service
public class BookingModelService {
	
	@Autowired
	public BookingModelRepository bookingModelRepository;

	public String deleteById1(Long bookingId) {
		
		return bookingModelRepository.delete(bookingId);
	}

	public List<BookingModel> getAllBookings() {
		
		List<BookingModel> bookingList = new ArrayList<>();
		
		bookingModelRepository.findAll().forEach(booking -> bookingList.add(booking));
		
		return bookingList;
	}

	public BookingModelService approveBooking(BookingModelService approve) {
		
		return bookingModelRepository.save(approve);
	}

	public String delete(Long booking) {
		
		return bookingModelRepository.delete(booking);
	}

	
}