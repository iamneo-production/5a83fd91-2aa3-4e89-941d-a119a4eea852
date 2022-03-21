package com.examly.springapp.services;

import com.examly.springapp.models.User;
import com.examly.springapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.models.Login;
import com.examly.springapp.services.LoginService;

@Service
public class SignupService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private LoginService loginService;
    
    public boolean saveUser(User user) {
        String email = user.getEmail();
        if(loginService.checkEmail(email) == true){
            return false;
        }

        Login tempLogin = new Login(user.getEmail(), user.getPassword());
        loginService.addUser(tempLogin);
        userRepository.save(user);
        return true;
    } 
}