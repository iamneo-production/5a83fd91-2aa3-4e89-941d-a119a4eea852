package com.examly.springapp.controller;

import com.examly.springapp.model.AdminLoginModel;
import com.examly.springapp.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
public class AdminLoginController {
    @Autowired
    private AdminService adminService;

//    @Autowired
  //  private AdminRepository adminRepository;

    @RequestMapping(value="/adminLogin",method=RequestMethod.POST,consumes="application/json",produces="application/json")
    public ResponseEntity<Object> loginAdmin(@RequestBody AdminLoginModel admin){
        if (adminService.doesAdminExists(admin))
        return new ResponseEntity<>("true", HttpStatus.OK);

    return new ResponseEntity<>("false", HttpStatus.OK);


    }
    }