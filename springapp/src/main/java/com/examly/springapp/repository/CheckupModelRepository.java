package com.examly.springapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.CheckupModel;

@Repository
public interface CheckupModelRepository extends CrudRepository<CheckupModel, Long> {

}
