package com.examly.springapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.BookingModel;
import com.examly.springapp.service.BookingModelService;

@Repository
public interface BookingModelRepository extends CrudRepository<BookingModel, Long> {

	String delete(Long bookingId);

	BookingModelService save(BookingModelService approve);

}
