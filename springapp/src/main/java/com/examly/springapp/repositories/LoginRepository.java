package com.examly.springapp.repositories;

import org.springframework.data.repository.CrudRepository;
import com.examly.springapp.models.Login;

public interface LoginRepository extends CrudRepository<Login, String>{
    
}