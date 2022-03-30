package com.examly.springapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.models.*;
import com.examly.springapp.services.*;

@Repository
public interface PrescriptionRepository extends CrudRepository<Prescription, Long> {

	Prescription findOne(Long prescriptionId);

	PrescriptionService save(PrescriptionService created);

	String delete(Long prescription);

}