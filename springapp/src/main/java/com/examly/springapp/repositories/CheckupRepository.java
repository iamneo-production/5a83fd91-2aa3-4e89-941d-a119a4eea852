package com.examly.springapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.models.Checkup;
import com.examly.springapp.services.*;

@Repository
public interface CheckupRepository extends CrudRepository<Checkup, Long> {

	CheckupService save(CheckupService added);

	String delete(Long checkup);

}