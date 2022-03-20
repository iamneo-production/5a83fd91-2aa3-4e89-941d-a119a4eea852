package com.examly.springapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.examly.springapp.service.BookingService;
import com.examly.springapp.models.Booking;
import java.util.*;

@RestController
public class BookingController {
    
    @Autowired
    private BookingService bookingService;

     //Return List of all doctors
     @RequestMapping("/doctor")
     public List<Doctor> getAllDoctors(@PathVariable String doctorId){
         return bookingService.getAllDoctors();
     }

   

     //Doctor Specific End Points
    
    //1-GetAllBooking: Retrieve All bookings
    @RequestMapping("/doctor/booking")
    public List<Booking> getBooking(){
        return bookingService.getBooking();
    } 
    
    //2-Approve Booking: Approve All bookings for a -> (Doctor)
     @RequestMapping(method = RequestMethod.POST, value = "/doctor/booking")
     public void approveAllBookings(@RequestBody List<Booking> bookings){
         return bookingService.approveAllBookings(bookings);
     }

     //3-Reject Booking: id -> bookingId
     @RequestMapping(method = RequestMethod.DELETE, value = "/doctor/booking/delete/{id}")
     public void deleteBooking(@PathVariable String id){
         bookingService.deleteBooking(id);
     }

    //Other functional methods
    //Return List of bookings based on doctorId
     @RequestMapping("/doctor/{id}")
     public List<Booking> getBookingByDoctor(@PathVariable String doctorId){
         return bookingService.getDoctorBookings(doctorId);
     }
   
    //id -> bookingId (Booking by ID)
    @RequestMapping("/doctor/booking/{id}")
    public Booking getBookingById(@PathVariable String id){
        bookingService.getBookingById(id);
    }
    
    

   

}
