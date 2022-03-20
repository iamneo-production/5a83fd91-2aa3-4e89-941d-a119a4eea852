package com.examly.springapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.examly.springapp.service.CheckupService;
import com.examly.springapp.models.Checkup;
import java.util.*;

public class CheckupController {
    
    @Autowired
    private CheckupService checkupService;

    //7- Add Checkup: id -> checkupId
    @RequestMapping(method = RequestMethod.POST, value = "/doctor/checkup")
    public void addCheckup(@RequestBody Checkup checkup){
        checkupService.addCheckup(checkup);
    }

    //8-Update Checkup: id -> checkupId
    @RequestMapping(method = RequestMethod.PUT, value = "/doctor/checkup/{id}")
    public void updateCheckup(@PathVariable String id){
        checkupService.updateCheckup(id);
    }

    //9-Get Checkup by: id -> checkupId
    @RequestMapping("/doctor/checkup/{id}")
    public Checkup getCheckupById(@PathVariable String checkupId){
        return checkupService.getCheckupById(checkupId);
    }

    //10-Delete Checkup: id -> checkupId
    @RequestMapping(method = RequestMethod.DELETE, value = "/doctor/checkup/delete/{id}")
    public void deleteCheckup(@PathVariable String id){
        checkupService.deleteCheckup(id);
    }
}
