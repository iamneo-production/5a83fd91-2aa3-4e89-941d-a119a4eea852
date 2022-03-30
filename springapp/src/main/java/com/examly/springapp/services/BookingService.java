package com.examly.springapp.services;

import java.util.*;

import com.examly.springapp.models.*;
import com.examly.springapp.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    //Only for admin users
    public List<Booking> getAllBookings() {
        List<Booking> mylist = new ArrayList<>();
        bookingRepository.findAll().forEach(mylist::add);
        return mylist;
    }

    public void addBooking(Booking booking){
        bookingRepository.save(booking);
        System.out.println("Booking Created");
    }
}