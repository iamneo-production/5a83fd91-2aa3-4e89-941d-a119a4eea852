package com.examly.springapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.PrescriptionModel;
import com.examly.springapp.service.PrescriptionService;

@Repository
public interface PrescriptionModelRepository extends CrudRepository<PrescriptionModel, Long> {

	PrescriptionModel findOne(Long prescriptionId);

	PrescriptionService save(PrescriptionService created);

	String delete(Long prescription);

}