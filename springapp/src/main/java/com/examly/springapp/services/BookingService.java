package com.examly.springapp.services;

import java.util.List;

import com.examly.springapp.models.Booking;
import com.examly.springapp.models.Doctor;
import com.examly.springapp.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    //Only for admin users
    public List<Booking> getBooking() {
        return bookingRepository.findAll();
    }

    //Get Booking by Booking Id
    public Booking getBookingById(String bookingId) {
        return bookingRepository.findBookingByBookingId(bookingId);
    }

    //Only for admin users
    public List<Doctor> getAllDoctors() {
        return bookingRepository.findAllDoctors();
    }

    public List<Booking> getDoctorBookings(String doctorId) {
        return bookingRepository.findBookingsByDoctorId(doctorId);
    }

    public void approveAllBookings(List<Booking> bookings){
        //bookingRepository.approveAllBookings(bookings);
    }
    public void deleteBooking(String bookingId){
        //bookingRepository.approveAllBookings(bookings);
    }
    
}
