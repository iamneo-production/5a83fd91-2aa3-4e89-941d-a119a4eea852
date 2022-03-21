package com.examly.springapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.PrescriptionModel;

@Repository
public interface PrescriptionModelRepository extends CrudRepository<PrescriptionModel, Long> {

	PrescriptionModel findOne(Long prescriptionId);

}
