package com.examly.springapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.UserModel;

@Repository
public interface UserModelRepository extends CrudRepository<UserModel, Long> {

}
