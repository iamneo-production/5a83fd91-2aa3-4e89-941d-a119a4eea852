package com.examly.springapp.repositories;

import org.springframework.data.jpa.repository.*;
import com.examly.springapp.models.Booking;
import com.examly.springapp.models.Doctor;
import java.util.*;

public interface BookingRepository extends JpaRepository<Booking, String>{
    
    @Query(value = "SELECT * FROM bookings WHERE doctor_id=?1", nativeQuery = true)
    List<Booking> findBookingsByDoctorId(String doctorId);

    @Query(value = "SELECT * FROM doctor", nativeQuery = true)
    List<Doctor> findAllDoctors();

    @Query(value = "SELECT * FROM bookings WHERE booking_id=?1", nativeQuery = true)
    List<Booking> findBookingsByBookingId(String bookingId);
}