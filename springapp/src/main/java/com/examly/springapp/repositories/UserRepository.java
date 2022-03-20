package com.examly.springapp.repositories;

import com.examly.springapp.models.User;
import org.springframework.data.jpa.repository.*;

public interface UserRepository extends JpaRepository<User, String>{
    
}