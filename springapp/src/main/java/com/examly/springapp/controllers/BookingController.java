package com.examly.springapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.examly.springapp.services.BookingService;
import com.examly.springapp.models.Booking;
import java.util.*;

@RestController
public class BookingController {
    
    @Autowired
    private BookingService bookingService;

    //Return List of all doctors---ADMIN privilege
    @RequestMapping("/admin/bookings")
    public List<Booking> getAllBookings(){
        return bookingService.getAllBookings();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/booking")
    public void addBooking(@RequestBody Booking booking){
        bookingService.addBooking(booking);
    }
    
}