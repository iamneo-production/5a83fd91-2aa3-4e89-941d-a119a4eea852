package com.examly.springapp.repositories;

import org.springframework.data.jpa.repository.*;
import com.examly.springapp.models.Booking;
import java.util.*;

public interface BookingRepository extends JpaRepository<Booking, String>{
    

    @Query(value = "SELECT * FROM booking", nativeQuery = true)
    List<Booking> findAllBookings();
}