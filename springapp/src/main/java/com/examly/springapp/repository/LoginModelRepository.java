package com.examly.springapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.LoginModel;

@Repository
public interface LoginModelRepository extends CrudRepository<LoginModel, Long> {

}