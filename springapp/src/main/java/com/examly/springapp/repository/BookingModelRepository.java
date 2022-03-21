package com.examly.springapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.BookingModel;

@Repository
public interface BookingModelRepository extends CrudRepository<BookingModel, Long> {

	String delete(Long bookingId);

}
