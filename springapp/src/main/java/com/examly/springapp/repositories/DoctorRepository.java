package com.examly.springapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.models.Doctor;

@Repository
public interface DoctorRepository extends CrudRepository<Doctor, Long> {

}