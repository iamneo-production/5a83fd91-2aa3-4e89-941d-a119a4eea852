package com.examly.springapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.CheckupModel;
import com.examly.springapp.service.CheckupModelService;

@Repository
public interface CheckupModelRepository extends CrudRepository<CheckupModel, Long> {

	CheckupModelService save(CheckupModelService added);

	String delete(Long checkup);

}
