package com.examly.springapp.service;

//package org.springframework.security.crypto.password;

import com.examly.springapp.model.AdminLoginModel;
import com.examly.springapp.model.AdminModel;
import com.examly.springapp.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.MessageDigestPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

   // public Admin saveAdmin(Admin admin) {
     //   admin.setPassword(passwordEncoder.encode(admin.getPassword()));
       // return adminRepository.save(admin);
    //}

    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public boolean doesAdminExists(AdminLoginModel admin) {
        for (AdminModel x : adminRepository.findAll()) {
          //  if ((x.getEmail().equals(admin.getEmail())) && (passwordEncoder.matches(admin.getPassword(),x.getPassword()))) {
         if ((x.getEmail().equals(admin.getEmail())) && ((admin.getPassword()).equals(x.getPassword()))) {
        
                return true;
            }
        }
    
        return false;
    }
}