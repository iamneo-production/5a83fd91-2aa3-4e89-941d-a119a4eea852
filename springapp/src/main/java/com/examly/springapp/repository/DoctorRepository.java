package com.examly.springapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.DoctorModel;

@Repository
public interface DoctorRepository extends CrudRepository<DoctorModel, Long> {

}