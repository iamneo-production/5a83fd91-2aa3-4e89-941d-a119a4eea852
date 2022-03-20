package com.examly.springapp.services;

import java.util.List;

import com.examly.springapp.models.Booking;
import com.examly.springapp.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    //Only for admin users
    public List<Booking> getBookings() {
        return bookingRepository.findAll();
    }

    public List<Booking> getDoctorBookings(String doctorId) {
        return bookingRepository.findBookingsByDoctorId(doctorId);
    }

    public void placeOrder(Order order) {

    }

    public List<Order> getAllUsersProducts() {
        return orderRepository.findAll();
    }
    
}
